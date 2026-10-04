package org.scilab.forge.jlatexmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.Character;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.scilab.forge.jlatexmath.cyrillic.CyrillicRegistration;
import org.scilab.forge.jlatexmath.greek.GreekRegistration;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.GraphicsEnvironment;
import ru.noties.jlatexmath.awt.Toolkit;
public class TeXFormula {
    public static final int BOLD = 2;
    public static float FONT_SCALE_FACTOR = 100.0f;
    public static final int ITALIC = 4;
    public static float PIXELS_PER_POINT = 1.0f;
    protected static final float PREC = 1.0E-7f;
    public static final int ROMAN = 8;
    public static final int SANSSERIF = 1;
    public static final int SERIF = 0;
    public static final int TYPEWRITER = 16;
    public static final String VERSION = "1.0.3";
    public boolean isColored;
    protected Map<String, String> jlmXMLMap;
    public List<MiddleAtom> middle;
    private TeXParser parser;
    public Atom root;
    public String textStyle;
    public static Map<String, TeXFormula> predefinedTeXFormulas = new HashMap(150);
    public static Map<String, String> predefinedTeXFormulasAsString = new HashMap(150);
    public static String[] symbolMappings = new String[65536];
    public static String[] symbolTextMappings = new String[65536];
    public static String[] symbolFormulaMappings = new String[65536];
    public static Map<Character.UnicodeBlock, FontInfos> externalFontMap = new HashMap();

    public static class FontInfos {
        String sansserif;
        String serif;

        public FontInfos(String str, String str2) {
            this.sansserif = str;
            this.serif = str2;
        }
    }

    public class TeXIconBuilder {
        private Integer align;
        private Color fgcolor;
        private Float interLineSpacing;
        private Integer interLineUnit;
        private Float size;
        private Integer style;
        private Float textWidth;
        private Integer type;
        private Integer widthUnit;
        private boolean trueValues = false;
        private boolean isMaxWidth = false;

        public TeXIconBuilder() {
        }

        public TeXIcon build() {
            DefaultTeXFont createFont;
            TeXEnvironment teXEnvironment;
            TeXIcon teXIcon;
            HorizontalBox horizontalBox;
            float textwidth;
            float textwidth2;
            Box.resetBoxBudget();
            if (this.style != null) {
                Float f7 = this.size;
                if (f7 != null) {
                    if (this.type != null) {
                        createFont = TeXFormula.this.createFont(f7.floatValue(), this.type.intValue());
                    } else {
                        createFont = new DefaultTeXFont(this.size.floatValue());
                    }
                    if (this.widthUnit != null) {
                        teXEnvironment = new TeXEnvironment(this.style.intValue(), createFont, this.widthUnit.intValue(), this.textWidth.floatValue());
                    } else {
                        teXEnvironment = new TeXEnvironment(this.style.intValue(), createFont);
                    }
                    Integer num = this.interLineUnit;
                    if (num != null) {
                        teXEnvironment.setInterline(num.intValue(), this.interLineSpacing.floatValue());
                    }
                    Box createBox = TeXFormula.this.createBox(teXEnvironment);
                    if (this.widthUnit != null) {
                        if (this.interLineUnit != null) {
                            Box split = BreakFormula.split(createBox, teXEnvironment.getTextwidth(), SpaceAtom.getFactor(this.interLineUnit.intValue(), teXEnvironment) * this.interLineSpacing.floatValue());
                            if (this.isMaxWidth) {
                                textwidth2 = split.getWidth();
                            } else {
                                textwidth2 = teXEnvironment.getTextwidth();
                            }
                            horizontalBox = new HorizontalBox(split, textwidth2, this.align.intValue());
                        } else {
                            if (this.isMaxWidth) {
                                textwidth = createBox.getWidth();
                            } else {
                                textwidth = teXEnvironment.getTextwidth();
                            }
                            horizontalBox = new HorizontalBox(createBox, textwidth, this.align.intValue());
                        }
                        teXIcon = new TeXIcon(horizontalBox, this.size.floatValue(), this.trueValues);
                    } else {
                        teXIcon = new TeXIcon(createBox, this.size.floatValue(), this.trueValues);
                    }
                    Color color = this.fgcolor;
                    if (color != null) {
                        teXIcon.setForeground(color);
                    }
                    teXIcon.isColored = teXEnvironment.isColored;
                    return teXIcon;
                }
                throw new IllegalStateException("A size is required. Use setStyle()");
            }
            throw new IllegalStateException("A style is required. Use setStyle()");
        }

        public TeXIconBuilder setFGColor(Color color) {
            this.fgcolor = color;
            return this;
        }

        public TeXIconBuilder setInterLineSpacing(int i10, float f7) {
            if (this.widthUnit != null) {
                this.interLineUnit = Integer.valueOf(i10);
                this.interLineSpacing = Float.valueOf(f7);
                return this;
            }
            throw new IllegalStateException("Cannot set inter line spacing without having specified a width!");
        }

        public TeXIconBuilder setIsMaxWidth(boolean z10) {
            if (this.widthUnit != null) {
                if (z10) {
                    this.align = 0;
                }
                this.isMaxWidth = z10;
                return this;
            }
            throw new IllegalStateException("Cannot set 'isMaxWidth' without having specified a width!");
        }

        public TeXIconBuilder setSize(float f7) {
            this.size = Float.valueOf(f7);
            return this;
        }

        public TeXIconBuilder setStyle(int i10) {
            this.style = Integer.valueOf(i10);
            return this;
        }

        public TeXIconBuilder setTrueValues(boolean z10) {
            this.trueValues = z10;
            return this;
        }

        public TeXIconBuilder setType(int i10) {
            this.type = Integer.valueOf(i10);
            return this;
        }

        public TeXIconBuilder setWidth(int i10, float f7, int i11) {
            this.widthUnit = Integer.valueOf(i10);
            this.textWidth = Float.valueOf(f7);
            this.align = Integer.valueOf(i11);
            this.trueValues = true;
            return this;
        }
    }

    static {
        TeXFormulaSettingsParser teXFormulaSettingsParser = new TeXFormulaSettingsParser();
        teXFormulaSettingsParser.parseSymbolMappings(symbolMappings, symbolTextMappings);
        new PredefinedCommands();
        new PredefinedTeXFormulas();
        new PredefMacros();
        teXFormulaSettingsParser.parseSymbolToFormulaMappings(symbolFormulaMappings, symbolTextMappings);
        try {
            DefaultTeXFont.registerAlphabet((AlphabetRegistration) CyrillicRegistration.class.newInstance());
            DefaultTeXFont.registerAlphabet((AlphabetRegistration) GreekRegistration.class.newInstance());
        } catch (Exception unused) {
        }
    }

    public TeXFormula() {
        this.middle = new LinkedList();
        this.root = null;
        this.textStyle = null;
        this.isColored = false;
        this.parser = new TeXParser("", this, false);
    }

    private void addImpl(TeXFormula teXFormula) {
        Atom atom = teXFormula.root;
        if (atom != null) {
            if (atom instanceof RowAtom) {
                add(new RowAtom(teXFormula.root));
            } else {
                add(atom);
            }
        }
    }

    public static void addPredefinedCommands(InputStream inputStream) {
        new PredefinedTeXFormulaParser(inputStream, "Command").parse(MacroInfo.Commands);
    }

    public static void addPredefinedTeXFormula(InputStream inputStream) {
        new PredefinedTeXFormulaParser(inputStream, "TeXFormula").parse(predefinedTeXFormulas);
    }

    public static void addSymbolMappings(String str) {
        try {
            addSymbolMappings(new FileInputStream(str), str);
        } catch (FileNotFoundException e7) {
            throw new ResourceParseException(str, e7);
        }
    }

    public Box createBox(TeXEnvironment teXEnvironment) {
        Atom atom = this.root;
        if (atom == null) {
            return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return atom.createBox(teXEnvironment);
    }

    public DefaultTeXFont createFont(float f7, int i10) {
        DefaultTeXFont defaultTeXFont = new DefaultTeXFont(f7);
        if (i10 == 0) {
            defaultTeXFont.setSs(false);
        }
        if ((i10 & 8) != 0) {
            defaultTeXFont.setRoman(true);
        }
        if ((i10 & 16) != 0) {
            defaultTeXFont.setTt(true);
        }
        if ((i10 & 1) != 0) {
            defaultTeXFont.setSs(true);
        }
        if ((i10 & 4) != 0) {
            defaultTeXFont.setIt(true);
        }
        if ((i10 & 2) != 0) {
            defaultTeXFont.setBold(true);
        }
        return defaultTeXFont;
    }

    public static TeXFormula get(String str) {
        TeXFormula teXFormula = predefinedTeXFormulas.get(str);
        if (teXFormula == null) {
            String str2 = predefinedTeXFormulasAsString.get(str);
            if (str2 != null) {
                TeXFormula teXFormula2 = new TeXFormula(str2);
                if (!(teXFormula2.root instanceof RowAtom)) {
                    predefinedTeXFormulas.put(str, teXFormula2);
                }
                return teXFormula2;
            }
            throw new FormulaNotFoundException(str);
        }
        return new TeXFormula(teXFormula);
    }

    public static TeXFormula getAsText(String str, int i10) {
        TeXFormula teXFormula = new TeXFormula();
        if (str != null && !"".equals(str)) {
            String[] split = str.split("\n|\\\\\\\\|\\\\cr");
            ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
            for (String str2 : split) {
                arrayOfAtoms.add(new RomanAtom(new TeXFormula(str2, "mathnormal", true, false).root));
                arrayOfAtoms.addRow();
            }
            arrayOfAtoms.checkDimensions();
            teXFormula.add(new MatrixAtom(false, arrayOfAtoms, 0, i10));
            return teXFormula;
        }
        teXFormula.add(new EmptyAtom());
        return teXFormula;
    }

    public static FontInfos getExternalFont(Character.UnicodeBlock unicodeBlock) {
        FontInfos fontInfos = externalFontMap.get(unicodeBlock);
        if (fontInfos == null) {
            FontInfos fontInfos2 = new FontInfos("SansSerif", "Serif");
            externalFontMap.put(unicodeBlock, fontInfos2);
            return fontInfos2;
        }
        return fontInfos;
    }

    public static TeXFormula getPartialTeXFormula(String str) {
        TeXFormula teXFormula = new TeXFormula();
        if (str == null) {
            teXFormula.add(new EmptyAtom());
            return teXFormula;
        }
        try {
            new TeXParser(true, str, teXFormula).parse();
            return teXFormula;
        } catch (Exception unused) {
            if (teXFormula.root == null) {
                teXFormula.root = new EmptyAtom();
            }
            return teXFormula;
        }
    }

    public static boolean isRegisteredBlock(Character.UnicodeBlock unicodeBlock) {
        if (externalFontMap.get(unicodeBlock) != null) {
            return true;
        }
        return false;
    }

    public static void registerExternalFont(Character.UnicodeBlock unicodeBlock, String str, String str2) {
        if (str == null && str2 == null) {
            externalFontMap.remove(unicodeBlock);
            return;
        }
        externalFontMap.put(unicodeBlock, new FontInfos(str, str2));
        if (unicodeBlock.equals(Character.UnicodeBlock.BASIC_LATIN)) {
            predefinedTeXFormulas.clear();
        }
    }

    public static void registerFonts(boolean z10) {
        DefaultTeXFontParser.registerFonts(z10);
    }

    public static void setDPITarget(float f7) {
        PIXELS_PER_POINT = f7 / 72.0f;
    }

    public static void setDefaultDPI() {
        if (!GraphicsEnvironment.isHeadless()) {
            setDPITarget(Toolkit.getDefaultToolkit().getScreenResolution());
        }
    }

    public TeXFormula add(Atom atom) {
        int rightType;
        if (atom != null) {
            if (atom instanceof MiddleAtom) {
                this.middle.add((MiddleAtom) atom);
            }
            Atom atom2 = this.root;
            if (atom2 == null) {
                this.root = atom;
                return this;
            }
            if (!(atom2 instanceof RowAtom)) {
                this.root = new RowAtom(this.root);
            }
            ((RowAtom) this.root).add(atom);
            if ((atom instanceof TypedAtom) && ((rightType = ((TypedAtom) atom).getRightType()) == 2 || rightType == 3)) {
                ((RowAtom) this.root).add(new BreakMarkAtom());
            }
        }
        return this;
    }

    public TeXFormula addStrut(int i10, float f7, float f10, float f11) {
        return add(new SpaceAtom(i10, f7, f10, f11));
    }

    public TeXFormula append(String str) {
        return append(false, str);
    }

    public TeXFormula centerOnAxis() {
        this.root = new VCenteredAtom(this.root);
        return this;
    }

    public TeXIcon createTeXIcon(int i10, float f7) {
        return new TeXIconBuilder().setStyle(i10).setSize(f7).build();
    }

    public boolean getLookAtLastAtom() {
        Atom atom = this.root;
        if (atom instanceof RowAtom) {
            return ((RowAtom) atom).lookAtLastAtom;
        }
        return false;
    }

    public TeXFormula setBackground(Color color) {
        if (color != null) {
            if (this.root instanceof ColorAtom) {
                this.root = new ColorAtom(color, (Color) null, (ColorAtom) this.root);
                return this;
            }
            this.root = new ColorAtom(this.root, color, (Color) null);
        }
        return this;
    }

    public TeXFormula setColor(Color color) {
        if (color != null) {
            if (this.root instanceof ColorAtom) {
                this.root = new ColorAtom((Color) null, color, (ColorAtom) this.root);
                return this;
            }
            this.root = new ColorAtom(this.root, (Color) null, color);
        }
        return this;
    }

    public void setDEBUG(boolean z10) {
        Box.DEBUG = z10;
    }

    public TeXFormula setFixedTypes(int i10, int i11) {
        this.root = new TypedAtom(i10, i11, this.root);
        return this;
    }

    public void setLaTeX(String str) {
        this.parser.reset(str);
        if (str != null && str.length() != 0) {
            this.parser.parse();
        }
    }

    public void setLookAtLastAtom(boolean z10) {
        Atom atom = this.root;
        if (atom instanceof RowAtom) {
            ((RowAtom) atom).lookAtLastAtom = z10;
        }
    }

    public TeXFormula addStrut(int i10) {
        return add(new SpaceAtom(i10));
    }

    public TeXFormula append(boolean z10, String str) {
        if (str != null && str.length() != 0) {
            new TeXParser(z10, str, this).parse();
        }
        return this;
    }

    public TeXIcon createTeXIcon(int i10, float f7, int i11) {
        return new TeXIconBuilder().setStyle(i10).setSize(f7).setType(i11).build();
    }

    public TeXFormula addStrut(int i10, float f7, int i11, float f10, int i12, float f11) {
        return add(new SpaceAtom(i10, f7, i11, f10, i12, f11));
    }

    public TeXIcon createTeXIcon(int i10, float f7, int i11, Color color) {
        return new TeXIconBuilder().setStyle(i10).setSize(f7).setType(i11).setFGColor(color).build();
    }

    public static void addSymbolMappings(InputStream inputStream, String str) {
        TeXFormulaSettingsParser teXFormulaSettingsParser = new TeXFormulaSettingsParser(inputStream, str);
        teXFormulaSettingsParser.parseSymbolMappings(symbolMappings, symbolTextMappings);
        teXFormulaSettingsParser.parseSymbolToFormulaMappings(symbolFormulaMappings, symbolTextMappings);
    }

    public TeXIcon createTeXIcon(int i10, float f7, boolean z10) {
        return new TeXIconBuilder().setStyle(i10).setSize(f7).setTrueValues(z10).build();
    }

    public static void registerExternalFont(Character.UnicodeBlock unicodeBlock, String str) {
        registerExternalFont(unicodeBlock, str, str);
    }

    public TeXIcon createTeXIcon(int i10, float f7, int i11, float f10, int i12) {
        return createTeXIcon(i10, f7, 0, i11, f10, i12);
    }

    public TeXIcon createTeXIcon(int i10, float f7, int i11, int i12, float f10, int i13) {
        return new TeXIconBuilder().setStyle(i10).setSize(f7).setType(i11).setWidth(i12, f10, i13).build();
    }

    public TeXFormula(String str, Map<String, String> map) {
        this.middle = new LinkedList();
        this.root = null;
        this.textStyle = null;
        this.isColored = false;
        this.jlmXMLMap = map;
        TeXParser teXParser = new TeXParser(str, this);
        this.parser = teXParser;
        teXParser.parse();
    }

    public TeXIcon createTeXIcon(int i10, float f7, int i11, float f10, int i12, int i13, float f11) {
        return createTeXIcon(i10, f7, 0, i11, f10, i12, i13, f11);
    }

    public TeXIcon createTeXIcon(int i10, float f7, int i11, int i12, float f10, int i13, int i14, float f11) {
        return new TeXIconBuilder().setStyle(i10).setSize(f7).setType(i11).setWidth(i12, f10, i13).setInterLineSpacing(i14, f11).build();
    }

    public TeXFormula add(String str) {
        if (str != null && str.length() != 0) {
            this.textStyle = null;
            add(new TeXFormula(str));
        }
        return this;
    }

    public TeXFormula(String str) {
        this(str, (String) null);
    }

    public TeXFormula add(TeXFormula teXFormula) {
        addImpl(teXFormula);
        return this;
    }

    public TeXFormula(String str, boolean z10) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = null;
        TeXParser teXParser = new TeXParser(str, this, z10);
        this.parser = teXParser;
        teXParser.parse();
    }

    public TeXFormula(String str, String str2) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = str2;
        TeXParser teXParser = new TeXParser(str, this);
        this.parser = teXParser;
        teXParser.parse();
    }

    public TeXFormula(String str, String str2, boolean z10, boolean z11) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = str2;
        TeXParser teXParser = new TeXParser(str, this, z10, z11);
        this.parser = teXParser;
        teXParser.parse();
    }

    public TeXFormula(TeXFormula teXFormula) {
        this.middle = new LinkedList();
        this.root = null;
        this.textStyle = null;
        this.isColored = false;
        if (teXFormula != null) {
            addImpl(teXFormula);
        }
    }

    public TeXFormula(TeXParser teXParser) {
        this.middle = new LinkedList();
        this.root = null;
        this.textStyle = null;
        this.isColored = false;
        this.jlmXMLMap = teXParser.formula.jlmXMLMap;
        this.parser = new TeXParser(teXParser.getIsPartial(), "", this, false);
    }

    public TeXFormula(TeXParser teXParser, String str) {
        this(teXParser, str, (String) null);
    }

    public TeXFormula(TeXParser teXParser, String str, boolean z10) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = null;
        this.jlmXMLMap = teXParser.formula.jlmXMLMap;
        boolean isPartial = teXParser.getIsPartial();
        TeXParser teXParser2 = new TeXParser(isPartial, str, this, z10);
        this.parser = teXParser2;
        if (isPartial) {
            try {
                teXParser2.parse();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        teXParser2.parse();
    }

    public TeXFormula(TeXParser teXParser, String str, String str2) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = str2;
        this.jlmXMLMap = teXParser.formula.jlmXMLMap;
        boolean isPartial = teXParser.getIsPartial();
        TeXParser teXParser2 = new TeXParser(isPartial, str, this);
        this.parser = teXParser2;
        if (isPartial) {
            try {
                teXParser2.parse();
                return;
            } catch (Exception unused) {
                if (this.root == null) {
                    this.root = new EmptyAtom();
                    return;
                }
                return;
            }
        }
        teXParser2.parse();
    }

    public TeXFormula(TeXParser teXParser, String str, String str2, boolean z10, boolean z11) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = str2;
        this.jlmXMLMap = teXParser.formula.jlmXMLMap;
        boolean isPartial = teXParser.getIsPartial();
        TeXParser teXParser2 = new TeXParser(isPartial, str, this, z10, z11);
        this.parser = teXParser2;
        if (isPartial) {
            try {
                teXParser2.parse();
                return;
            } catch (Exception unused) {
                if (this.root == null) {
                    this.root = new EmptyAtom();
                    return;
                }
                return;
            }
        }
        teXParser2.parse();
    }
}
