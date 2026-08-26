package org.scilab.forge.jlatexmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
            TeXIcon teXIcon;
            HorizontalBox horizontalBox;
            Box.resetBoxBudget();
            if (this.style == null) {
                throw new IllegalStateException("A style is required. Use setStyle()");
            }
            Float f = this.size;
            if (f == null) {
                throw new IllegalStateException("A size is required. Use setStyle()");
            }
            DefaultTeXFont defaultTeXFont = this.type == null ? new DefaultTeXFont(this.size.floatValue()) : TeXFormula.this.createFont(f.floatValue(), this.type.intValue());
            TeXEnvironment teXEnvironment = this.widthUnit != null ? new TeXEnvironment(this.style.intValue(), defaultTeXFont, this.widthUnit.intValue(), this.textWidth.floatValue()) : new TeXEnvironment(this.style.intValue(), defaultTeXFont);
            Integer num = this.interLineUnit;
            if (num != null) {
                teXEnvironment.setInterline(num.intValue(), this.interLineSpacing.floatValue());
            }
            Box boxCreateBox = TeXFormula.this.createBox(teXEnvironment);
            if (this.widthUnit != null) {
                if (this.interLineUnit != null) {
                    Box boxSplit = BreakFormula.split(boxCreateBox, teXEnvironment.getTextwidth(), SpaceAtom.getFactor(this.interLineUnit.intValue(), teXEnvironment) * this.interLineSpacing.floatValue());
                    horizontalBox = new HorizontalBox(boxSplit, this.isMaxWidth ? boxSplit.getWidth() : teXEnvironment.getTextwidth(), this.align.intValue());
                } else {
                    horizontalBox = new HorizontalBox(boxCreateBox, this.isMaxWidth ? boxCreateBox.getWidth() : teXEnvironment.getTextwidth(), this.align.intValue());
                }
                teXIcon = new TeXIcon(horizontalBox, this.size.floatValue(), this.trueValues);
            } else {
                teXIcon = new TeXIcon(boxCreateBox, this.size.floatValue(), this.trueValues);
            }
            Color color = this.fgcolor;
            if (color != null) {
                teXIcon.setForeground(color);
            }
            teXIcon.isColored = teXEnvironment.isColored;
            return teXIcon;
        }

        public TeXIconBuilder setFGColor(Color color) {
            this.fgcolor = color;
            return this;
        }

        public TeXIconBuilder setInterLineSpacing(int i, float f) {
            if (this.widthUnit == null) {
                throw new IllegalStateException("Cannot set inter line spacing without having specified a width!");
            }
            this.interLineUnit = Integer.valueOf(i);
            this.interLineSpacing = Float.valueOf(f);
            return this;
        }

        public TeXIconBuilder setIsMaxWidth(boolean z) {
            if (this.widthUnit == null) {
                throw new IllegalStateException("Cannot set 'isMaxWidth' without having specified a width!");
            }
            if (z) {
                this.align = 0;
            }
            this.isMaxWidth = z;
            return this;
        }

        public TeXIconBuilder setSize(float f) {
            this.size = Float.valueOf(f);
            return this;
        }

        public TeXIconBuilder setStyle(int i) {
            this.style = Integer.valueOf(i);
            return this;
        }

        public TeXIconBuilder setTrueValues(boolean z) {
            this.trueValues = z;
            return this;
        }

        public TeXIconBuilder setType(int i) {
            this.type = Integer.valueOf(i);
            return this;
        }

        public TeXIconBuilder setWidth(int i, float f, int i2) {
            this.widthUnit = Integer.valueOf(i);
            this.textWidth = Float.valueOf(f);
            this.align = Integer.valueOf(i2);
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
        } catch (FileNotFoundException e) {
            throw new ResourceParseException(str, e);
        }
    }

    public Box createBox(TeXEnvironment teXEnvironment) {
        Atom atom = this.root;
        return atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment);
    }

    public DefaultTeXFont createFont(float f, int i) {
        DefaultTeXFont defaultTeXFont = new DefaultTeXFont(f);
        if (i == 0) {
            defaultTeXFont.setSs(false);
        }
        if ((i & 8) != 0) {
            defaultTeXFont.setRoman(true);
        }
        if ((i & 16) != 0) {
            defaultTeXFont.setTt(true);
        }
        if ((i & 1) != 0) {
            defaultTeXFont.setSs(true);
        }
        if ((i & 4) != 0) {
            defaultTeXFont.setIt(true);
        }
        if ((i & 2) != 0) {
            defaultTeXFont.setBold(true);
        }
        return defaultTeXFont;
    }

    public static TeXFormula get(String str) {
        TeXFormula teXFormula = predefinedTeXFormulas.get(str);
        if (teXFormula != null) {
            return new TeXFormula(teXFormula);
        }
        String str2 = predefinedTeXFormulasAsString.get(str);
        if (str2 == null) {
            throw new FormulaNotFoundException(str);
        }
        TeXFormula teXFormula2 = new TeXFormula(str2);
        if (!(teXFormula2.root instanceof RowAtom)) {
            predefinedTeXFormulas.put(str, teXFormula2);
        }
        return teXFormula2;
    }

    public static TeXFormula getAsText(String str, int i) {
        TeXFormula teXFormula = new TeXFormula();
        if (str == null || "".equals(str)) {
            teXFormula.add(new EmptyAtom());
            return teXFormula;
        }
        String[] strArrSplit = str.split("\n|\\\\\\\\|\\\\cr");
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        for (String str2 : strArrSplit) {
            arrayOfAtoms.add(new RomanAtom(new TeXFormula(str2, "mathnormal", true, false).root));
            arrayOfAtoms.addRow();
        }
        arrayOfAtoms.checkDimensions();
        teXFormula.add(new MatrixAtom(false, arrayOfAtoms, 0, i));
        return teXFormula;
    }

    public static FontInfos getExternalFont(Character.UnicodeBlock unicodeBlock) {
        FontInfos fontInfos = externalFontMap.get(unicodeBlock);
        if (fontInfos != null) {
            return fontInfos;
        }
        FontInfos fontInfos2 = new FontInfos("SansSerif", "Serif");
        externalFontMap.put(unicodeBlock, fontInfos2);
        return fontInfos2;
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
        return externalFontMap.get(unicodeBlock) != null;
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

    public static void registerFonts(boolean z) {
        DefaultTeXFontParser.registerFonts(z);
    }

    public static void setDPITarget(float f) {
        PIXELS_PER_POINT = f / 72.0f;
    }

    public static void setDefaultDPI() {
        if (GraphicsEnvironment.isHeadless()) {
            return;
        }
        setDPITarget(Toolkit.getDefaultToolkit().getScreenResolution());
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

    public TeXFormula addStrut(int i, float f, float f2, float f3) {
        return add(new SpaceAtom(i, f, f2, f3));
    }

    public TeXFormula append(String str) {
        return append(false, str);
    }

    public TeXFormula centerOnAxis() {
        this.root = new VCenteredAtom(this.root);
        return this;
    }

    public TeXIcon createTeXIcon(int i, float f) {
        return new TeXIconBuilder().setStyle(i).setSize(f).build();
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

    public void setDEBUG(boolean z) {
        Box.DEBUG = z;
    }

    public TeXFormula setFixedTypes(int i, int i2) {
        this.root = new TypedAtom(i, i2, this.root);
        return this;
    }

    public void setLaTeX(String str) {
        this.parser.reset(str);
        if (str == null || str.length() == 0) {
            return;
        }
        this.parser.parse();
    }

    public void setLookAtLastAtom(boolean z) {
        Atom atom = this.root;
        if (atom instanceof RowAtom) {
            ((RowAtom) atom).lookAtLastAtom = z;
        }
    }

    public TeXFormula addStrut(int i) {
        return add(new SpaceAtom(i));
    }

    public TeXFormula append(boolean z, String str) {
        if (str != null && str.length() != 0) {
            new TeXParser(z, str, this).parse();
        }
        return this;
    }

    public TeXIcon createTeXIcon(int i, float f, int i2) {
        return new TeXIconBuilder().setStyle(i).setSize(f).setType(i2).build();
    }

    public TeXFormula addStrut(int i, float f, int i2, float f2, int i3, float f3) {
        return add(new SpaceAtom(i, f, i2, f2, i3, f3));
    }

    public TeXIcon createTeXIcon(int i, float f, int i2, Color color) {
        return new TeXIconBuilder().setStyle(i).setSize(f).setType(i2).setFGColor(color).build();
    }

    public static void addSymbolMappings(InputStream inputStream, String str) {
        TeXFormulaSettingsParser teXFormulaSettingsParser = new TeXFormulaSettingsParser(inputStream, str);
        teXFormulaSettingsParser.parseSymbolMappings(symbolMappings, symbolTextMappings);
        teXFormulaSettingsParser.parseSymbolToFormulaMappings(symbolFormulaMappings, symbolTextMappings);
    }

    public TeXIcon createTeXIcon(int i, float f, boolean z) {
        return new TeXIconBuilder().setStyle(i).setSize(f).setTrueValues(z).build();
    }

    public static void registerExternalFont(Character.UnicodeBlock unicodeBlock, String str) {
        registerExternalFont(unicodeBlock, str, str);
    }

    public TeXIcon createTeXIcon(int i, float f, int i2, float f2, int i3) {
        return createTeXIcon(i, f, 0, i2, f2, i3);
    }

    public TeXIcon createTeXIcon(int i, float f, int i2, int i3, float f2, int i4) {
        return new TeXIconBuilder().setStyle(i).setSize(f).setType(i2).setWidth(i3, f2, i4).build();
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

    public TeXIcon createTeXIcon(int i, float f, int i2, float f2, int i3, int i4, float f3) {
        return createTeXIcon(i, f, 0, i2, f2, i3, i4, f3);
    }

    public TeXIcon createTeXIcon(int i, float f, int i2, int i3, float f2, int i4, int i5, float f3) {
        return new TeXIconBuilder().setStyle(i).setSize(f).setType(i2).setWidth(i3, f2, i4).setInterLineSpacing(i5, f3).build();
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

    public TeXFormula(String str, boolean z) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = null;
        TeXParser teXParser = new TeXParser(str, this, z);
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

    public TeXFormula(String str, String str2, boolean z, boolean z2) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = str2;
        TeXParser teXParser = new TeXParser(str, this, z, z2);
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

    public TeXFormula(TeXParser teXParser, String str, boolean z) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = null;
        this.jlmXMLMap = teXParser.formula.jlmXMLMap;
        boolean isPartial = teXParser.getIsPartial();
        TeXParser teXParser2 = new TeXParser(isPartial, str, this, z);
        this.parser = teXParser2;
        if (isPartial) {
            try {
                teXParser2.parse();
            } catch (Exception unused) {
            }
        } else {
            teXParser2.parse();
        }
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

    public TeXFormula(TeXParser teXParser, String str, String str2, boolean z, boolean z2) {
        this.middle = new LinkedList();
        this.root = null;
        this.isColored = false;
        this.textStyle = str2;
        this.jlmXMLMap = teXParser.formula.jlmXMLMap;
        boolean isPartial = teXParser.getIsPartial();
        TeXParser teXParser2 = new TeXParser(isPartial, str, this, z, z2);
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
