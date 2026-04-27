package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import java.lang.Character;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.scilab.forge.jlatexmath.cyrillic.CyrillicRegistration;
import org.scilab.forge.jlatexmath.greek.GreekRegistration;
import ru.noties.jlatexmath.awt.Color;

public class TeXFormula {
    public static float FONT_SCALE_FACTOR = 100.0f;
    public static float PIXELS_PER_POINT = 1.0f;
    public boolean isColored;
    protected Map jlmXMLMap;
    public List middle;
    private TeXParser parser;
    public Atom root;
    public String textStyle;
    public static Map predefinedTeXFormulas = new HashMap(150);
    public static Map predefinedTeXFormulasAsString = new HashMap(150);
    public static String[] symbolMappings = new String[65536];
    public static String[] symbolTextMappings = new String[65536];
    public static String[] symbolFormulaMappings = new String[65536];
    public static Map externalFontMap = new HashMap();

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

    public static void addSymbolMappings(InputStream inputStream, String str) {
        TeXFormulaSettingsParser teXFormulaSettingsParser = new TeXFormulaSettingsParser(inputStream, str);
        teXFormulaSettingsParser.parseSymbolMappings(symbolMappings, symbolTextMappings);
        teXFormulaSettingsParser.parseSymbolToFormulaMappings(symbolFormulaMappings, symbolTextMappings);
    }

    public static boolean isRegisteredBlock(Character.UnicodeBlock unicodeBlock) {
        return externalFontMap.get(unicodeBlock) != null;
    }

    public static FontInfos getExternalFont(Character.UnicodeBlock unicodeBlock) {
        FontInfos fontInfos = (FontInfos) externalFontMap.get(unicodeBlock);
        if (fontInfos != null) {
            return fontInfos;
        }
        FontInfos fontInfos2 = new FontInfos("SansSerif", "Serif");
        externalFontMap.put(unicodeBlock, fontInfos2);
        return fontInfos2;
    }

    public TeXFormula() {
        this.middle = new LinkedList();
        this.root = null;
        this.textStyle = null;
        this.isColored = false;
        this.parser = new TeXParser("", this, false);
    }

    public TeXFormula(String str) {
        this(str, (String) null);
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

    public TeXFormula(TeXFormula teXFormula) {
        this.middle = new LinkedList();
        this.root = null;
        this.textStyle = null;
        this.isColored = false;
        if (teXFormula != null) {
            addImpl(teXFormula);
        }
    }

    protected TeXFormula(TeXParser teXParser, String str) {
        this(teXParser, str, (String) null);
    }

    protected TeXFormula(TeXParser teXParser, String str, boolean z) {
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

    protected TeXFormula(TeXParser teXParser, String str, String str2) {
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

    protected TeXFormula(TeXParser teXParser, String str, String str2, boolean z, boolean z2) {
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

    public TeXFormula add(Atom atom) {
        int rightType;
        if (atom != null) {
            if (atom instanceof MiddleAtom) {
                this.middle.add((MiddleAtom) atom);
            }
            Atom atom2 = this.root;
            if (atom2 == null) {
                this.root = atom;
            } else {
                if (!(atom2 instanceof RowAtom)) {
                    this.root = new RowAtom(this.root);
                }
                ((RowAtom) this.root).add(atom);
                if ((atom instanceof TypedAtom) && ((rightType = ((TypedAtom) atom).getRightType()) == 2 || rightType == 3)) {
                    ((RowAtom) this.root).add(new BreakMarkAtom());
                }
            }
        }
        return this;
    }

    public TeXFormula add(String str) {
        if (str != null && str.length() != 0) {
            this.textStyle = null;
            add(new TeXFormula(str));
        }
        return this;
    }

    public TeXFormula append(boolean z, String str) {
        if (str != null && str.length() != 0) {
            new TeXParser(z, str, this).parse();
        }
        return this;
    }

    public TeXFormula add(TeXFormula teXFormula) {
        addImpl(teXFormula);
        return this;
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

    public Box createBox(TeXEnvironment teXEnvironment) {
        Atom atom = this.root;
        if (atom == null) {
            return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return atom.createBox(teXEnvironment);
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

        public TeXIconBuilder setStyle(int i) {
            this.style = Integer.valueOf(i);
            return this;
        }

        public TeXIconBuilder setSize(float f) {
            this.size = Float.valueOf(f);
            return this;
        }

        public TeXIconBuilder setFGColor(Color color) {
            this.fgcolor = color;
            return this;
        }

        public TeXIcon build() {
            TeXEnvironment teXEnvironment;
            TeXIcon teXIcon;
            HorizontalBox horizontalBox;
            if (this.style == null) {
                throw new IllegalStateException("A style is required. Use setStyle()");
            }
            Float f = this.size;
            if (f == null) {
                throw new IllegalStateException("A size is required. Use setStyle()");
            }
            DefaultTeXFont defaultTeXFont = this.type == null ? new DefaultTeXFont(this.size.floatValue()) : TeXFormula.this.createFont(f.floatValue(), this.type.intValue());
            if (this.widthUnit != null) {
                teXEnvironment = new TeXEnvironment(this.style.intValue(), defaultTeXFont, this.widthUnit.intValue(), this.textWidth.floatValue());
            } else {
                teXEnvironment = new TeXEnvironment(this.style.intValue(), defaultTeXFont);
            }
            Integer num = this.interLineUnit;
            if (num != null) {
                teXEnvironment.setInterline(num.intValue(), this.interLineSpacing.floatValue());
            }
            Box boxCreateBox = TeXFormula.this.createBox(teXEnvironment);
            if (this.widthUnit != null) {
                if (this.interLineUnit != null) {
                    Box boxSplit = BreakFormula.split(boxCreateBox, teXEnvironment.getTextwidth(), this.interLineSpacing.floatValue() * SpaceAtom.getFactor(this.interLineUnit.intValue(), teXEnvironment));
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
    }

    public static TeXFormula get(String str) {
        TeXFormula teXFormula = (TeXFormula) predefinedTeXFormulas.get(str);
        if (teXFormula == null) {
            String str2 = (String) predefinedTeXFormulasAsString.get(str);
            if (str2 == null) {
                throw new FormulaNotFoundException(str);
            }
            TeXFormula teXFormula2 = new TeXFormula(str2);
            if (!(teXFormula2.root instanceof RowAtom)) {
                predefinedTeXFormulas.put(str, teXFormula2);
            }
            return teXFormula2;
        }
        return new TeXFormula(teXFormula);
    }

    static class FontInfos {
        String sansserif;
        String serif;

        FontInfos(String str, String str2) {
            this.sansserif = str;
            this.serif = str2;
        }
    }
}
