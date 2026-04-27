package org.scilab.forge.jlatexmath;

import java.lang.Character;
import java.util.Map;
import java.util.StringTokenizer;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.dynamic.DynamicAtom;
import ru.noties.jlatexmath.awt.Color;

public class PredefMacros {
    static {
        NewEnvironmentMacro.addNewEnvironment("array", "\\array@@env{#1}{", "}", 1);
        NewEnvironmentMacro.addNewEnvironment("tabular", "\\array@@env{#1}{", "}", 1);
        NewEnvironmentMacro.addNewEnvironment("matrix", "\\matrix@@env{", "}", 0);
        NewEnvironmentMacro.addNewEnvironment("smallmatrix", "\\smallmatrix@@env{", "}", 0);
        NewEnvironmentMacro.addNewEnvironment("pmatrix", "\\left(\\begin{matrix}", "\\end{matrix}\\right)", 0);
        NewEnvironmentMacro.addNewEnvironment("bmatrix", "\\left[\\begin{matrix}", "\\end{matrix}\\right]", 0);
        NewEnvironmentMacro.addNewEnvironment("Bmatrix", "\\left\\{\\begin{matrix}", "\\end{matrix}\\right\\}", 0);
        NewEnvironmentMacro.addNewEnvironment("vmatrix", "\\left|\\begin{matrix}", "\\end{matrix}\\right|", 0);
        NewEnvironmentMacro.addNewEnvironment("Vmatrix", "\\left\\|\\begin{matrix}", "\\end{matrix}\\right\\|", 0);
        NewEnvironmentMacro.addNewEnvironment("eqnarray", "\\begin{array}{rcl}", "\\end{array}", 0);
        NewEnvironmentMacro.addNewEnvironment("align", "\\align@@env{", "}", 0);
        NewEnvironmentMacro.addNewEnvironment("flalign", "\\flalign@@env{", "}", 0);
        NewEnvironmentMacro.addNewEnvironment("alignat", "\\alignat@@env{#1}{", "}", 1);
        NewEnvironmentMacro.addNewEnvironment("aligned", "\\aligned@@env{", "}", 0);
        NewEnvironmentMacro.addNewEnvironment("alignedat", "\\alignedat@@env{#1}{", "}", 1);
        NewEnvironmentMacro.addNewEnvironment("multline", "\\multline@@env{", "}", 0);
        NewEnvironmentMacro.addNewEnvironment("cases", "\\left\\{\\begin{array}{l@{\\!}l}", "\\end{array}\\right.", 0);
        NewEnvironmentMacro.addNewEnvironment("split", "\\begin{array}{rl}", "\\end{array}", 0);
        NewEnvironmentMacro.addNewEnvironment("gather", "\\gather@@env{", "}", 0);
        NewEnvironmentMacro.addNewEnvironment("gathered", "\\gathered@@env{", "}", 0);
        NewEnvironmentMacro.addNewEnvironment("math", "\\(", "\\)", 0);
        NewEnvironmentMacro.addNewEnvironment("displaymath", "\\[", "\\]", 0);
        NewCommandMacro.addNewCommand("operatorname", "\\mathop{\\mathrm{#1}}\\nolimits ", 1);
        NewCommandMacro.addNewCommand("DeclareMathOperator", "\\newcommand{#1}{\\mathop{\\mathrm{#2}}\\nolimits}", 2);
        NewCommandMacro.addNewCommand("substack", "{\\scriptstyle\\begin{array}{c}#1\\end{array}}", 1);
        NewCommandMacro.addNewCommand("dfrac", "\\genfrac{}{}{}{}{#1}{#2}", 2);
        NewCommandMacro.addNewCommand("tfrac", "\\genfrac{}{}{}{1}{#1}{#2}", 2);
        NewCommandMacro.addNewCommand("dbinom", "\\genfrac{(}{)}{0pt}{}{#1}{#2}", 2);
        NewCommandMacro.addNewCommand("tbinom", "\\genfrac{(}{)}{0pt}{1}{#1}{#2}", 2);
        NewCommandMacro.addNewCommand("pmod", "\\qquad\\mathbin{(\\mathrm{mod}\\ #1)}", 1);
        NewCommandMacro.addNewCommand("mod", "\\qquad\\mathbin{\\mathrm{mod}\\ #1}", 1);
        NewCommandMacro.addNewCommand("pod", "\\qquad\\mathbin{(#1)}", 1);
        NewCommandMacro.addNewCommand("dddot", "\\mathop{#1}\\limits^{...}", 1);
        NewCommandMacro.addNewCommand("ddddot", "\\mathop{#1}\\limits^{....}", 1);
        NewCommandMacro.addNewCommand("spdddot", "^{\\mathrm{...}}", 0);
        NewCommandMacro.addNewCommand("spbreve", "^{\\makeatletter\\sp@breve\\makeatother}", 0);
        NewCommandMacro.addNewCommand("sphat", "^{\\makeatletter\\sp@hat\\makeatother}", 0);
        NewCommandMacro.addNewCommand("spddot", "^{\\displaystyle..}", 0);
        NewCommandMacro.addNewCommand("spcheck", "^{\\vee}", 0);
        NewCommandMacro.addNewCommand("sptilde", "^{\\sim}", 0);
        NewCommandMacro.addNewCommand("spdot", "^{\\displaystyle.}", 0);
        NewCommandMacro.addNewCommand("d", "\\underaccent{\\dot}{#1}", 1);
        NewCommandMacro.addNewCommand("b", "\\underaccent{\\bar}{#1}", 1);
        NewCommandMacro.addNewCommand("Bra", "\\left\\langle{#1}\\right\\vert", 1);
        NewCommandMacro.addNewCommand("Ket", "\\left\\vert{#1}\\right\\rangle", 1);
        NewCommandMacro.addNewCommand("textsuperscript", "{}^{\\text{#1}}", 1);
        NewCommandMacro.addNewCommand("textsubscript", "{}_{\\text{#1}}", 1);
        NewCommandMacro.addNewCommand("textit", "\\mathit{\\text{#1}}", 1);
        NewCommandMacro.addNewCommand("textbf", "\\mathbf{\\text{#1}}", 1);
        NewCommandMacro.addNewCommand("textsf", "\\mathsf{\\text{#1}}", 1);
        NewCommandMacro.addNewCommand("texttt", "\\mathtt{\\text{#1}}", 1);
        NewCommandMacro.addNewCommand("textrm", "\\text{#1}", 1);
        NewCommandMacro.addNewCommand("degree", "^\\circ", 0);
        NewCommandMacro.addNewCommand("with", "\\mathbin{\\&}", 0);
        NewCommandMacro.addNewCommand("parr", "\\mathbin{\\rotatebox[origin=c]{180}{\\&}}", 0);
        NewCommandMacro.addNewCommand("copyright", "\\textcircled{\\raisebox{0.2ex}{c}}", 0);
        NewCommandMacro.addNewCommand("L", "\\mathrm{\\polishlcross L}", 0);
        NewCommandMacro.addNewCommand("l", "\\mathrm{\\polishlcross l}", 0);
        NewCommandMacro.addNewCommand("Join", "\\mathop{\\rlap{\\ltimes}\\rtimes}", 0);
    }

    public static final Atom fcscore_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        int i = Integer.parseInt(strArr[1]);
        if (i > 5) {
            int i2 = i / 5;
            int i3 = i % 5;
            RowAtom rowAtom = new RowAtom();
            for (int i4 = 0; i4 < i2; i4++) {
                rowAtom.add(new FcscoreAtom(5));
            }
            rowAtom.add(new FcscoreAtom(i3));
            return rowAtom;
        }
        return new FcscoreAtom(i);
    }

    public static final Atom longdiv_macro(TeXParser teXParser, String[] strArr) {
        try {
            return new LongdivAtom(Long.valueOf(strArr[2]).longValue(), Long.valueOf(strArr[1]).longValue());
        } catch (NumberFormatException unused) {
            throw new ParseException("Divisor and dividend must be integer numbers");
        }
    }

    public static final Atom st_macro(TeXParser teXParser, String[] strArr) {
        return new StrikeThroughAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom Braket_macro(TeXParser teXParser, String[] strArr) {
        return new TeXFormula(teXParser, "\\left\\langle " + strArr[1].replaceAll("\\|", "\\\\middle\\\\vert ") + "\\right\\rangle").root;
    }

    public static final Atom Set_macro(TeXParser teXParser, String[] strArr) {
        return new TeXFormula(teXParser, "\\left\\{" + strArr[1].replaceFirst("\\|", "\\\\middle\\\\vert ") + "\\right\\}").root;
    }

    public static final Atom spATbreve_macro(TeXParser teXParser, String[] strArr) {
        VRowAtom vRowAtom = new VRowAtom(new TeXFormula("\\displaystyle\\!\\breve{}").root);
        vRowAtom.setRaise(1, 0.6f);
        return new SmashedAtom(vRowAtom, null);
    }

    public static final Atom spAThat_macro(TeXParser teXParser, String[] strArr) {
        VRowAtom vRowAtom = new VRowAtom(new TeXFormula("\\displaystyle\\widehat{}").root);
        vRowAtom.setRaise(1, 0.6f);
        return new SmashedAtom(vRowAtom, null);
    }

    public static final Atom hvspace_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        int i = 0;
        while (i < strArr[1].length() && !Character.isLetter(strArr[1].charAt(i))) {
            i++;
        }
        try {
            float f = Float.parseFloat(strArr[1].substring(0, i));
            int unit = i != strArr[1].length() ? SpaceAtom.getUnit(strArr[1].substring(i).toLowerCase()) : 3;
            if (unit != -1) {
                return strArr[0].charAt(0) == 'h' ? new SpaceAtom(unit, f, 0.0f, 0.0f) : new SpaceAtom(unit, 0.0f, f, 0.0f);
            }
            throw new ParseException("Unknown unit \"" + strArr[1].substring(i) + "\" !");
        } catch (NumberFormatException e) {
            throw new ParseException(e.toString());
        }
    }

    public static final Atom clrlap_macro(TeXParser teXParser, String[] strArr) {
        return new LapedAtom(new TeXFormula(teXParser, strArr[1]).root, strArr[0].charAt(0));
    }

    public static final Atom mathclrlap_macro(TeXParser teXParser, String[] strArr) {
        return new LapedAtom(new TeXFormula(teXParser, strArr[1]).root, strArr[0].charAt(4));
    }

    public static final Atom includegraphics_macro(TeXParser teXParser, String[] strArr) {
        return new GraphicsAtom(strArr[1], strArr[2]);
    }

    public static final Atom rule_macro(TeXParser teXParser, String[] strArr) {
        float[] length = SpaceAtom.getLength(strArr[1]);
        if (length.length == 1) {
            throw new ParseException("Error in getting width in \\rule command !");
        }
        float[] length2 = SpaceAtom.getLength(strArr[2]);
        if (length2.length == 1) {
            throw new ParseException("Error in getting height in \\rule command !");
        }
        float[] length3 = SpaceAtom.getLength(strArr[3]);
        if (length3.length == 1) {
            throw new ParseException("Error in getting raise in \\rule command !");
        }
        return new RuleAtom((int) length[0], length[1], (int) length2[0], length2[1], (int) length3[0], -length3[1]);
    }

    public static final Atom cfrac_macro(TeXParser teXParser, String[] strArr) {
        int i;
        Atom atom;
        if ("r".equals(strArr[3])) {
            i = 1;
        } else {
            i = "l".equals(strArr[3]) ? 0 : 2;
        }
        TeXFormula teXFormula = new TeXFormula(teXParser, strArr[1], false);
        TeXFormula teXFormula2 = new TeXFormula(teXParser, strArr[2], false);
        Atom atom2 = teXFormula.root;
        if (atom2 == null || (atom = teXFormula2.root) == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        FractionAtom fractionAtom = new FractionAtom(atom2, atom, true, i, 2);
        RowAtom rowAtom = new RowAtom();
        rowAtom.add(new StyleAtom(0, fractionAtom));
        return rowAtom;
    }

    public static final Atom frac_macro(TeXParser teXParser, String[] strArr) {
        Atom atom;
        TeXFormula teXFormula = new TeXFormula(teXParser, strArr[1], false);
        TeXFormula teXFormula2 = new TeXFormula(teXParser, strArr[2], false);
        Atom atom2 = teXFormula.root;
        if (atom2 == null || (atom = teXFormula2.root) == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        return new FractionAtom(atom2, atom, true);
    }

    public static final Atom sfrac_macro(TeXParser teXParser, String[] strArr) {
        double d;
        float f;
        float f2;
        double d2;
        float f3;
        SymbolAtom symbolAtom;
        TeXFormula teXFormula = new TeXFormula(teXParser, strArr[1], false);
        TeXFormula teXFormula2 = new TeXFormula(teXParser, strArr[2], false);
        if (teXFormula.root == null || teXFormula2.root == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        SymbolAtom symbolAtom2 = SymbolAtom.get("slash");
        if (teXParser.isMathMode()) {
            d = 0.75d;
            f = -0.13f;
            f2 = -0.065f;
            d2 = 0.75d;
            f3 = 0.45f;
            symbolAtom = symbolAtom2;
        } else {
            VRowAtom vRowAtom = new VRowAtom(new ScaleAtom(SymbolAtom.get("textfractionsolidus"), 1.25d, 0.65d));
            vRowAtom.setRaise(1, 0.4f);
            f = -0.24f;
            d = 0.6d;
            d2 = 0.5d;
            f2 = -0.24f;
            f3 = 0.75f;
            symbolAtom = vRowAtom;
        }
        double d3 = d;
        double d4 = d2;
        VRowAtom vRowAtom2 = new VRowAtom(new ScaleAtom(teXFormula.root, d3, d4));
        vRowAtom2.setRaise(1, f3);
        RowAtom rowAtom = new RowAtom(vRowAtom2);
        rowAtom.add(new SpaceAtom(0, f, 0.0f, 0.0f));
        rowAtom.add(symbolAtom);
        rowAtom.add(new SpaceAtom(0, f2, 0.0f, 0.0f));
        rowAtom.add(new ScaleAtom(teXFormula2.root, d3, d4));
        return rowAtom;
    }

    public static final Atom genfrac_macro(TeXParser teXParser, String[] strArr) {
        boolean z;
        Atom atom;
        Atom atom2 = new TeXFormula(teXParser, strArr[1], false).root;
        SymbolAtom symbolAtom = atom2 instanceof SymbolAtom ? (SymbolAtom) atom2 : null;
        Atom atom3 = new TeXFormula(teXParser, strArr[2], false).root;
        SymbolAtom symbolAtom2 = atom3 instanceof SymbolAtom ? (SymbolAtom) atom3 : null;
        float[] length = SpaceAtom.getLength(strArr[3]);
        String str = strArr[3];
        if (str == null || str.length() == 0 || length.length == 1) {
            length = new float[]{0.0f, 0.0f};
            z = false;
        } else {
            z = true;
        }
        int i = strArr[4].length() != 0 ? Integer.parseInt(strArr[4]) : 0;
        TeXFormula teXFormula = new TeXFormula(teXParser, strArr[5], false);
        TeXFormula teXFormula2 = new TeXFormula(teXParser, strArr[6], false);
        Atom atom4 = teXFormula.root;
        if (atom4 == null || (atom = teXFormula2.root) == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        FractionAtom fractionAtom = new FractionAtom(atom4, atom, z, (int) length[0], length[1]);
        RowAtom rowAtom = new RowAtom();
        rowAtom.add(new StyleAtom(i * 2, new FencedAtom(fractionAtom, symbolAtom, symbolAtom2)));
        return rowAtom;
    }

    public static final Atom over_macro(TeXParser teXParser, String[] strArr) {
        Atom formulaAtom = teXParser.getFormulaAtom();
        Atom atom = new TeXFormula(teXParser, teXParser.getOverArgument(), false).root;
        if (formulaAtom == null || atom == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        return new FractionAtom(formulaAtom, atom, true);
    }

    public static final Atom overwithdelims_macro(TeXParser teXParser, String[] strArr) {
        Atom formulaAtom = teXParser.getFormulaAtom();
        Atom atom = new TeXFormula(teXParser, teXParser.getOverArgument(), false).root;
        if (formulaAtom == null || atom == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        Atom atom2 = new TeXFormula(teXParser, strArr[1], false).root;
        if (atom2 instanceof BigDelimiterAtom) {
            atom2 = ((BigDelimiterAtom) atom2).delim;
        }
        Atom atom3 = new TeXFormula(teXParser, strArr[2], false).root;
        if (atom3 instanceof BigDelimiterAtom) {
            atom3 = ((BigDelimiterAtom) atom3).delim;
        }
        if ((atom2 instanceof SymbolAtom) && (atom3 instanceof SymbolAtom)) {
            return new FencedAtom(new FractionAtom(formulaAtom, atom, true), (SymbolAtom) atom2, (SymbolAtom) atom3);
        }
        RowAtom rowAtom = new RowAtom();
        rowAtom.add(atom2);
        rowAtom.add(new FractionAtom(formulaAtom, atom, true));
        rowAtom.add(atom3);
        return rowAtom;
    }

    public static final Atom atop_macro(TeXParser teXParser, String[] strArr) {
        Atom formulaAtom = teXParser.getFormulaAtom();
        Atom atom = new TeXFormula(teXParser, teXParser.getOverArgument(), false).root;
        if (formulaAtom == null || atom == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        return new FractionAtom(formulaAtom, atom, false);
    }

    public static final Atom atopwithdelims_macro(TeXParser teXParser, String[] strArr) {
        Atom formulaAtom = teXParser.getFormulaAtom();
        Atom atom = new TeXFormula(teXParser, teXParser.getOverArgument(), false).root;
        if (formulaAtom == null || atom == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        Atom atom2 = new TeXFormula(teXParser, strArr[1], false).root;
        if (atom2 instanceof BigDelimiterAtom) {
            atom2 = ((BigDelimiterAtom) atom2).delim;
        }
        Atom atom3 = new TeXFormula(teXParser, strArr[2], false).root;
        if (atom3 instanceof BigDelimiterAtom) {
            atom3 = ((BigDelimiterAtom) atom3).delim;
        }
        if ((atom2 instanceof SymbolAtom) && (atom3 instanceof SymbolAtom)) {
            return new FencedAtom(new FractionAtom(formulaAtom, atom, false), (SymbolAtom) atom2, (SymbolAtom) atom3);
        }
        RowAtom rowAtom = new RowAtom();
        rowAtom.add(atom2);
        rowAtom.add(new FractionAtom(formulaAtom, atom, false));
        rowAtom.add(atom3);
        return rowAtom;
    }

    public static final Atom choose_macro(TeXParser teXParser, String[] strArr) {
        return choose_brackets("lbrack", "rbrack", teXParser, strArr);
    }

    public static final Atom brack_macro(TeXParser teXParser, String[] strArr) {
        return choose_brackets("lsqbrack", "rsqbrack", teXParser, strArr);
    }

    public static final Atom bangle_macro(TeXParser teXParser, String[] strArr) {
        return choose_brackets("langle", "rangle", teXParser, strArr);
    }

    public static final Atom brace_macro(TeXParser teXParser, String[] strArr) {
        return choose_brackets("lbrace", "rbrace", teXParser, strArr);
    }

    public static final Atom choose_brackets(String str, String str2, TeXParser teXParser, String[] strArr) {
        Atom formulaAtom = teXParser.getFormulaAtom();
        Atom atom = new TeXFormula(teXParser, teXParser.getOverArgument(), false).root;
        if (formulaAtom == null || atom == null) {
            throw new ParseException("Both numerator and denominator of choose can't be empty!");
        }
        return new FencedAtom(new FractionAtom(formulaAtom, atom, false), new SymbolAtom(str, 4, true), new SymbolAtom(str2, 5, true));
    }

    public static final Atom binom_macro(TeXParser teXParser, String[] strArr) {
        Atom atom;
        TeXFormula teXFormula = new TeXFormula(teXParser, strArr[1], false);
        TeXFormula teXFormula2 = new TeXFormula(teXParser, strArr[2], false);
        Atom atom2 = teXFormula.root;
        if (atom2 == null || (atom = teXFormula2.root) == null) {
            throw new ParseException("Both binomial coefficients must be not empty !!");
        }
        return new FencedAtom(new FractionAtom(atom2, atom, false), new SymbolAtom("lbrack", 4, true), new SymbolAtom("rbrack", 5, true));
    }

    public static final Atom above_macro(TeXParser teXParser, String[] strArr) {
        Atom formulaAtom = teXParser.getFormulaAtom();
        float[] length = teXParser.getLength();
        Atom atom = new TeXFormula(teXParser, teXParser.getOverArgument(), false).root;
        if (length == null || length.length != 2) {
            throw new ParseException("Invalid length in above macro");
        }
        if (formulaAtom == null || atom == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        return new FractionAtom(formulaAtom, atom, (int) length[0], length[1]);
    }

    public static final Atom abovewithdelims_macro(TeXParser teXParser, String[] strArr) {
        Atom formulaAtom = teXParser.getFormulaAtom();
        float[] length = teXParser.getLength();
        Atom atom = new TeXFormula(teXParser, teXParser.getOverArgument(), false).root;
        if (length == null || length.length != 2) {
            throw new ParseException("Invalid length in above macro");
        }
        if (formulaAtom == null || atom == null) {
            throw new ParseException("Both numerator and denominator of a fraction can't be empty!");
        }
        Atom atom2 = new TeXFormula(teXParser, strArr[1], false).root;
        if (atom2 instanceof BigDelimiterAtom) {
            atom2 = ((BigDelimiterAtom) atom2).delim;
        }
        Atom atom3 = new TeXFormula(teXParser, strArr[2], false).root;
        if (atom3 instanceof BigDelimiterAtom) {
            atom3 = ((BigDelimiterAtom) atom3).delim;
        }
        if ((atom2 instanceof SymbolAtom) && (atom3 instanceof SymbolAtom)) {
            return new FencedAtom(new FractionAtom(formulaAtom, atom, (int) length[0], length[1]), (SymbolAtom) atom2, (SymbolAtom) atom3);
        }
        RowAtom rowAtom = new RowAtom();
        rowAtom.add(atom2);
        rowAtom.add(new FractionAtom(formulaAtom, atom, true));
        rowAtom.add(atom3);
        return rowAtom;
    }

    public static final Atom textstyle_macros(TeXParser teXParser, String[] strArr) {
        String str = strArr[0];
        if ("frak".equals(str)) {
            str = "mathfrak";
        } else if ("Bbb".equals(strArr[0])) {
            str = "mathbb";
        } else {
            if ("bold".equals(strArr[0])) {
                return new BoldAtom(new TeXFormula(teXParser, strArr[1], false).root);
            }
            if ("cal".equals(strArr[0])) {
                str = "mathcal";
            }
        }
        Map map = TeXFormula.externalFontMap;
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.BASIC_LATIN;
        TeXFormula.FontInfos fontInfos = (TeXFormula.FontInfos) map.get(unicodeBlock);
        if (fontInfos != null) {
            TeXFormula.externalFontMap.put(unicodeBlock, null);
        }
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (fontInfos != null) {
            TeXFormula.externalFontMap.put(unicodeBlock, fontInfos);
        }
        return new TextStyleAtom(atom, str);
    }

    public static final Atom mbox_macro(TeXParser teXParser, String[] strArr) {
        return new StyleAtom(2, new RomanAtom(new TeXFormula(teXParser, strArr[1], "mathnormal", false, false).root));
    }

    public static final Atom text_macro(TeXParser teXParser, String[] strArr) {
        return new RomanAtom(new TeXFormula(teXParser, strArr[1], "mathnormal", false, false).root);
    }

    public static final Atom underscore_macro(TeXParser teXParser, String[] strArr) {
        return new UnderscoreAtom();
    }

    public static final Atom accent_macros(TeXParser teXParser, String[] strArr) {
        return new AccentedAtom(new TeXFormula(teXParser, strArr[1], false).root, strArr[0]);
    }

    public static final Atom grkaccent_macro(TeXParser teXParser, String[] strArr) {
        return new AccentedAtom(new TeXFormula(teXParser, strArr[2], false).root, new TeXFormula(teXParser, strArr[1], false).root, false);
    }

    public static final Atom accent_macro(TeXParser teXParser, String[] strArr) {
        return new AccentedAtom(new TeXFormula(teXParser, strArr[2], false).root, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom accentbis_macros(TeXParser teXParser, String[] strArr) {
        String str;
        char cCharAt = strArr[0].charAt(0);
        if (cCharAt == '\"') {
            str = "ddot";
        } else if (cCharAt == '\'') {
            str = "acute";
        } else if (cCharAt == '.') {
            str = "dot";
        } else if (cCharAt == '=') {
            str = "bar";
        } else if (cCharAt == 'H') {
            str = "doubleacute";
        } else if (cCharAt == 'U') {
            str = "cyrbreve";
        } else if (cCharAt == '^') {
            str = "hat";
        } else if (cCharAt == '`') {
            str = "grave";
        } else if (cCharAt == 'r') {
            str = "mathring";
        } else if (cCharAt == '~') {
            str = "tilde";
        } else {
            switch (cCharAt) {
                case 't':
                    str = "tie";
                    break;
                case 'u':
                    str = "breve";
                    break;
                case 'v':
                    str = "check";
                    break;
                default:
                    str = "";
                    break;
            }
        }
        return new AccentedAtom(new TeXFormula(teXParser, strArr[1], false).root, str);
    }

    public static final Atom cedilla_macro(TeXParser teXParser, String[] strArr) {
        return new CedillaAtom(new TeXFormula(teXParser, strArr[1]).root);
    }

    public static final Atom IJ_macro(TeXParser teXParser, String[] strArr) {
        return new IJAtom(strArr[0].charAt(0) == 'I');
    }

    public static final Atom TStroke_macro(TeXParser teXParser, String[] strArr) {
        return new TStrokeAtom(strArr[0].charAt(0) == 'T');
    }

    public static final Atom LCaron_macro(TeXParser teXParser, String[] strArr) {
        return new LCaronAtom(strArr[0].charAt(0) == 'L');
    }

    public static final Atom tcaron_macro(TeXParser teXParser, String[] strArr) {
        return new tcaronAtom();
    }

    public static final Atom ogonek_macro(TeXParser teXParser, String[] strArr) {
        return new OgonekAtom(new TeXFormula(teXParser, strArr[1]).root);
    }

    public static final Atom nbsp_macro(TeXParser teXParser, String[] strArr) {
        return new SpaceAtom();
    }

    public static final Atom sqrt_macro(TeXParser teXParser, String[] strArr) {
        if (strArr[2] == null) {
            return new NthRoot(new TeXFormula(teXParser, strArr[1], false).root, null);
        }
        return new NthRoot(new TeXFormula(teXParser, strArr[1], false).root, new TeXFormula(teXParser, strArr[2], false).root);
    }

    public static final Atom overrightarrow_macro(TeXParser teXParser, String[] strArr) {
        return new UnderOverArrowAtom(new TeXFormula(teXParser, strArr[1], false).root, false, true);
    }

    public static final Atom overleftarrow_macro(TeXParser teXParser, String[] strArr) {
        return new UnderOverArrowAtom(new TeXFormula(teXParser, strArr[1], false).root, true, true);
    }

    public static final Atom overleftrightarrow_macro(TeXParser teXParser, String[] strArr) {
        return new UnderOverArrowAtom(new TeXFormula(teXParser, strArr[1], false).root, true);
    }

    public static final Atom underrightarrow_macro(TeXParser teXParser, String[] strArr) {
        return new UnderOverArrowAtom(new TeXFormula(teXParser, strArr[1], false).root, false, false);
    }

    public static final Atom underleftarrow_macro(TeXParser teXParser, String[] strArr) {
        return new UnderOverArrowAtom(new TeXFormula(teXParser, strArr[1], false).root, true, false);
    }

    public static final Atom underleftrightarrow_macro(TeXParser teXParser, String[] strArr) {
        return new UnderOverArrowAtom(new TeXFormula(teXParser, strArr[1], false).root, false);
    }

    public static final Atom xleftarrow_macro(TeXParser teXParser, String[] strArr) {
        return new XArrowAtom(new TeXFormula(teXParser, strArr[1], false).root, new TeXFormula(teXParser, strArr[2]).root, true);
    }

    public static final Atom xrightarrow_macro(TeXParser teXParser, String[] strArr) {
        return new XArrowAtom(new TeXFormula(teXParser, strArr[1], false).root, new TeXFormula(teXParser, strArr[2]).root, false);
    }

    public static final Atom sideset_macro(TeXParser teXParser, String[] strArr) {
        TeXFormula teXFormula = new TeXFormula();
        teXFormula.add(new PhantomAtom(new TeXFormula(teXParser, strArr[3]).root, false, true, true));
        teXFormula.append(teXParser.getIsPartial(), strArr[1]);
        teXFormula.add(new SpaceAtom(5, -0.3f, 0.0f, 0.0f));
        teXFormula.append(teXParser.getIsPartial(), strArr[3] + "\\nolimits" + strArr[2]);
        return new TypedAtom(0, 0, teXFormula.root);
    }

    public static final Atom prescript_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[3]).root;
        teXParser.addAtom(new ScriptsAtom(new PhantomAtom(atom, false, true, true), new TeXFormula(teXParser, strArr[2]).root, new TeXFormula(teXParser, strArr[1]).root, false));
        teXParser.addAtom(new SpaceAtom(5, -0.3f, 0.0f, 0.0f));
        return new TypedAtom(0, 0, atom);
    }

    public static final Atom underbrace_macro(TeXParser teXParser, String[] strArr) {
        return new OverUnderDelimiter(new TeXFormula(teXParser, strArr[1], false).root, null, SymbolAtom.get("rbrace"), 1, 0.0f, false);
    }

    public static final Atom overbrace_macro(TeXParser teXParser, String[] strArr) {
        return new OverUnderDelimiter(new TeXFormula(teXParser, strArr[1], false).root, null, SymbolAtom.get("lbrace"), 1, 0.0f, true);
    }

    public static final Atom underbrack_macro(TeXParser teXParser, String[] strArr) {
        return new OverUnderDelimiter(new TeXFormula(teXParser, strArr[1], false).root, null, SymbolAtom.get("rsqbrack"), 1, 0.0f, false);
    }

    public static final Atom overbrack_macro(TeXParser teXParser, String[] strArr) {
        return new OverUnderDelimiter(new TeXFormula(teXParser, strArr[1], false).root, null, SymbolAtom.get("lsqbrack"), 1, 0.0f, true);
    }

    public static final Atom underparen_macro(TeXParser teXParser, String[] strArr) {
        return new OverUnderDelimiter(new TeXFormula(teXParser, strArr[1], false).root, null, SymbolAtom.get("rbrack"), 1, 0.0f, false);
    }

    public static final Atom overparen_macro(TeXParser teXParser, String[] strArr) {
        return new OverUnderDelimiter(new TeXFormula(teXParser, strArr[1], false).root, null, SymbolAtom.get("lbrack"), 1, 0.0f, true);
    }

    public static final Atom overline_macro(TeXParser teXParser, String[] strArr) {
        return new OverlinedAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom underline_macro(TeXParser teXParser, String[] strArr) {
        return new UnderlinedAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom mathop_macro(TeXParser teXParser, String[] strArr) {
        TypedAtom typedAtom = new TypedAtom(1, 1, new TeXFormula(teXParser, strArr[1], false).root);
        typedAtom.type_limits = 0;
        return typedAtom;
    }

    public static final Atom mathpunct_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(6, 6, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom mathord_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(0, 0, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom mathrel_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom mathinner_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(7, 7, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom mathbin_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(2, 2, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom mathopen_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(4, 4, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom mathclose_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(5, 5, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom joinrel_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new SpaceAtom(5, -2.6f, 0.0f, 0.0f));
    }

    public static final Atom smash_macro(TeXParser teXParser, String[] strArr) {
        return new SmashedAtom(new TeXFormula(teXParser, strArr[1], false).root, strArr[2]);
    }

    public static final Atom vdots_macro(TeXParser teXParser, String[] strArr) {
        return new VdotsAtom();
    }

    public static final Atom ddots_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(7, 7, new DdotsAtom());
    }

    public static final Atom iddots_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(7, 7, new IddotsAtom());
    }

    public static final Atom nolimits_macro(TeXParser teXParser, String[] strArr) {
        Atom lastAtom = teXParser.getLastAtom();
        lastAtom.type_limits = 1;
        return lastAtom.clone();
    }

    public static final Atom limits_macro(TeXParser teXParser, String[] strArr) {
        Atom lastAtom = teXParser.getLastAtom();
        lastAtom.type_limits = 2;
        return lastAtom.clone();
    }

    public static final Atom normal_macro(TeXParser teXParser, String[] strArr) {
        Atom lastAtom = teXParser.getLastAtom();
        lastAtom.type_limits = 0;
        return lastAtom.clone();
    }

    public static final Atom left_macro(TeXParser teXParser, String[] strArr) {
        String group = teXParser.getGroup("\\left", "\\right");
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (atom instanceof BigDelimiterAtom) {
            atom = ((BigDelimiterAtom) atom).delim;
        }
        Atom argument = teXParser.getArgument();
        if (argument instanceof BigDelimiterAtom) {
            argument = ((BigDelimiterAtom) argument).delim;
        }
        if ((atom instanceof SymbolAtom) && (argument instanceof SymbolAtom)) {
            TeXFormula teXFormula = new TeXFormula(teXParser, group, false);
            return new FencedAtom(teXFormula.root, (SymbolAtom) atom, teXFormula.middle, (SymbolAtom) argument);
        }
        RowAtom rowAtom = new RowAtom();
        rowAtom.add(atom);
        rowAtom.add(new TeXFormula(teXParser, group, false).root);
        rowAtom.add(argument);
        return rowAtom;
    }

    public static final Atom leftparenthesis_macro(TeXParser teXParser, String[] strArr) {
        return new MathAtom(new TeXFormula(teXParser, teXParser.getGroup("\\(", "\\)"), false).root, 2);
    }

    public static final Atom leftbracket_macro(TeXParser teXParser, String[] strArr) {
        return new MathAtom(new TeXFormula(teXParser, teXParser.getGroup("\\[", "\\]"), false).root, 0);
    }

    public static final Atom middle_macro(TeXParser teXParser, String[] strArr) {
        return new MiddleAtom(new TeXFormula(teXParser, strArr[1]).root);
    }

    public static final Atom cr_macro(TeXParser teXParser, String[] strArr) {
        if (teXParser.isArrayMode()) {
            teXParser.addRow();
            return null;
        }
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        arrayOfAtoms.add(teXParser.formula.root);
        arrayOfAtoms.addRow();
        new TeXParser(teXParser.getIsPartial(), teXParser.getStringFromCurrentPos(), arrayOfAtoms, false, teXParser.isIgnoreWhiteSpace()).parse();
        arrayOfAtoms.checkDimensions();
        teXParser.finish();
        teXParser.formula.root = arrayOfAtoms.getAsVRow();
        return null;
    }

    public static final Atom backslashcr_macro(TeXParser teXParser, String[] strArr) {
        return cr_macro(teXParser, strArr);
    }

    public static final Atom intertext_macro(TeXParser teXParser, String[] strArr) {
        if (!teXParser.isArrayMode()) {
            throw new ParseException("Bad environment for \\intertext command !");
        }
        RomanAtom romanAtom = new RomanAtom(new TeXFormula(teXParser, strArr[1].replaceAll("\\^\\{\\\\prime\\}", "'").replaceAll("\\^\\{\\\\prime\\\\prime\\}", "''"), "mathnormal", false, false).root);
        romanAtom.type = 11;
        teXParser.addAtom(romanAtom);
        teXParser.addRow();
        return null;
    }

    public static final Atom smallmatrixATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[1], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        return new MatrixAtom(teXParser.getIsPartial(), arrayOfAtoms, 5);
    }

    public static final Atom matrixATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[1], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        return new MatrixAtom(teXParser.getIsPartial(), arrayOfAtoms, 1);
    }

    public static final Atom multicolumn_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        int i = Integer.parseInt(strArr[1]);
        teXParser.addAtom(new MulticolumnAtom(i, strArr[2], new TeXFormula(teXParser, strArr[3]).root));
        ((ArrayOfAtoms) teXParser.formula).addCol(i);
        return null;
    }

    public static final Atom hdotsfor_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        int i = Integer.parseInt(strArr[1]);
        String str = strArr[2];
        teXParser.addAtom(new HdotsforAtom(i, str != null ? Float.parseFloat(str) : 1.0f));
        ((ArrayOfAtoms) teXParser.formula).addCol(i);
        return null;
    }

    public static final Atom arrayATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[2], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        return new MatrixAtom(teXParser.getIsPartial(), arrayOfAtoms, strArr[1], true);
    }

    public static final Atom alignATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[1], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        return new MatrixAtom(teXParser.getIsPartial(), arrayOfAtoms, 2);
    }

    public static final Atom flalignATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[1], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        return new MatrixAtom(teXParser.getIsPartial(), arrayOfAtoms, 4);
    }

    public static final Atom alignatATATenv_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[2], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        if (arrayOfAtoms.col != Integer.parseInt(strArr[1]) * 2) {
            throw new ParseException("Bad number of equations in alignat environment !");
        }
        return new MatrixAtom(teXParser.getIsPartial(), arrayOfAtoms, 3);
    }

    public static final Atom alignedATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[1], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        return new MatrixAtom(teXParser.getIsPartial(), arrayOfAtoms, 6);
    }

    public static final Atom alignedatATATenv_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[2], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        if (arrayOfAtoms.col != Integer.parseInt(strArr[1]) * 2) {
            throw new ParseException("Bad number of equations in alignedat environment !");
        }
        return new MatrixAtom(teXParser.getIsPartial(), arrayOfAtoms, 7);
    }

    public static final Atom multlineATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[1], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        int i = arrayOfAtoms.col;
        if (i > 1) {
            throw new ParseException("Character '&' is only available in array mode !");
        }
        if (i == 0) {
            return null;
        }
        return new MultlineAtom(teXParser.getIsPartial(), arrayOfAtoms, 0);
    }

    public static final Atom gatherATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[1], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        int i = arrayOfAtoms.col;
        if (i > 1) {
            throw new ParseException("Character '&' is only available in array mode !");
        }
        if (i == 0) {
            return null;
        }
        return new MultlineAtom(teXParser.getIsPartial(), arrayOfAtoms, 1);
    }

    public static final Atom gatheredATATenv_macro(TeXParser teXParser, String[] strArr) {
        ArrayOfAtoms arrayOfAtoms = new ArrayOfAtoms();
        new TeXParser(teXParser.getIsPartial(), strArr[1], arrayOfAtoms, false).parse();
        arrayOfAtoms.checkDimensions();
        int i = arrayOfAtoms.col;
        if (i > 1) {
            throw new ParseException("Character '&' is only available in array mode !");
        }
        if (i == 0) {
            return null;
        }
        return new MultlineAtom(teXParser.getIsPartial(), arrayOfAtoms, 2);
    }

    public static final Atom shoveright_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1]).root;
        atom.alignment = 1;
        return atom;
    }

    public static final Atom shoveleft_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1]).root;
        atom.alignment = 0;
        return atom;
    }

    public static final Atom newcommand_macro(TeXParser teXParser, String[] strArr) {
        Integer numValueOf;
        String str = strArr[1];
        if (!teXParser.isValidName(str)) {
            throw new ParseException("Invalid name for the command :" + str);
        }
        String str2 = strArr[3];
        if (str2 == null) {
            numValueOf = new Integer(0);
        } else {
            numValueOf = Integer.valueOf(Integer.parseInt(str2));
        }
        if (strArr[4] == null) {
            NewCommandMacro.addNewCommand(str.substring(1), strArr[2], numValueOf.intValue());
            return null;
        }
        NewCommandMacro.addNewCommand(str.substring(1), strArr[2], numValueOf.intValue(), strArr[4]);
        return null;
    }

    public static final Atom renewcommand_macro(TeXParser teXParser, String[] strArr) {
        Integer numValueOf;
        String str = strArr[1];
        if (!teXParser.isValidName(str)) {
            throw new ParseException("Invalid name for the command :" + str);
        }
        String str2 = strArr[3];
        if (str2 == null) {
            numValueOf = new Integer(0);
        } else {
            numValueOf = Integer.valueOf(Integer.parseInt(str2));
        }
        NewCommandMacro.addReNewCommand(str.substring(1), strArr[2], numValueOf.intValue());
        return null;
    }

    public static final Atom makeatletter_macro(TeXParser teXParser, String[] strArr) {
        teXParser.makeAtLetter();
        return null;
    }

    public static final Atom makeatother_macro(TeXParser teXParser, String[] strArr) {
        teXParser.makeAtOther();
        return null;
    }

    public static final Atom newenvironment_macro(TeXParser teXParser, String[] strArr) {
        String str = strArr[4];
        NewEnvironmentMacro.addNewEnvironment(strArr[1], strArr[2], strArr[3], str == null ? 0 : Integer.parseInt(str));
        return null;
    }

    public static final Atom renewenvironment_macro(TeXParser teXParser, String[] strArr) {
        String str = strArr[4];
        NewEnvironmentMacro.addReNewEnvironment(strArr[1], strArr[2], strArr[3], str == null ? 0 : Integer.parseInt(str));
        return null;
    }

    public static final Atom fbox_macro(TeXParser teXParser, String[] strArr) {
        return new FBoxAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom questeq_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new UnderOverAtom(SymbolAtom.get(TeXFormula.symbolMappings[61]), new ScaleAtom(SymbolAtom.get(TeXFormula.symbolMappings[63]), 0.75d), 5, 2.5f, true, true));
    }

    public static final Atom stackrel_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new UnderOverAtom(new TeXFormula(teXParser, strArr[2], false).root, new TeXFormula(teXParser, strArr[3], false).root, 5, 0.5f, true, new TeXFormula(teXParser, strArr[1], false).root, 5, 2.5f, true));
    }

    public static final Atom stackbin_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(2, 2, new UnderOverAtom(new TeXFormula(teXParser, strArr[2], false).root, new TeXFormula(teXParser, strArr[3], false).root, 5, 0.5f, true, new TeXFormula(teXParser, strArr[1], false).root, 5, 2.5f, true));
    }

    public static final Atom overset_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new UnderOverAtom(new TeXFormula(teXParser, strArr[2], false).root, new TeXFormula(teXParser, strArr[1], false).root, 5, 2.5f, true, true));
    }

    public static final Atom underset_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new UnderOverAtom(new TeXFormula(teXParser, strArr[2], false).root, new TeXFormula(teXParser, strArr[1], false).root, 5, 0.5f, true, false));
    }

    public static final Atom accentset_macro(TeXParser teXParser, String[] strArr) {
        return new AccentedAtom(new TeXFormula(teXParser, strArr[2], false).root, new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom underaccent_macro(TeXParser teXParser, String[] strArr) {
        return new UnderOverAtom(new TeXFormula(teXParser, strArr[2], false).root, new TeXFormula(teXParser, strArr[1], false).root, 5, 0.3f, true, false);
    }

    public static final Atom undertilde_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        return new UnderOverAtom(atom, new AccentedAtom(new PhantomAtom(atom, true, false, false), "widetilde"), 5, 0.3f, true, false);
    }

    public static final Atom boldsymbol_macro(TeXParser teXParser, String[] strArr) {
        return new BoldAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom mathrm_macro(TeXParser teXParser, String[] strArr) {
        return new RomanAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom rm_macro(TeXParser teXParser, String[] strArr) {
        return new RomanAtom(new TeXFormula(teXParser, teXParser.getOverArgument(), null, false, teXParser.isIgnoreWhiteSpace()).root);
    }

    public static final Atom mathbf_macro(TeXParser teXParser, String[] strArr) {
        return new BoldAtom(new RomanAtom(new TeXFormula(teXParser, strArr[1], false).root));
    }

    public static final Atom bf_macro(TeXParser teXParser, String[] strArr) {
        return new BoldAtom(new RomanAtom(new TeXFormula(teXParser, teXParser.getOverArgument(), null, false, teXParser.isIgnoreWhiteSpace()).root));
    }

    public static final Atom mathtt_macro(TeXParser teXParser, String[] strArr) {
        return new TtAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom tt_macro(TeXParser teXParser, String[] strArr) {
        return new TtAtom(new TeXFormula(teXParser, teXParser.getOverArgument(), null, false, teXParser.isIgnoreWhiteSpace()).root);
    }

    public static final Atom mathit_macro(TeXParser teXParser, String[] strArr) {
        return new ItAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom it_macro(TeXParser teXParser, String[] strArr) {
        return new ItAtom(new TeXFormula(teXParser, teXParser.getOverArgument(), null, false, teXParser.isIgnoreWhiteSpace()).root);
    }

    public static final Atom mathsf_macro(TeXParser teXParser, String[] strArr) {
        return new SsAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom sf_macro(TeXParser teXParser, String[] strArr) {
        return new SsAtom(new TeXFormula(teXParser, teXParser.getOverArgument(), null, false, teXParser.isIgnoreWhiteSpace()).root);
    }

    public static final Atom LaTeX_macro(TeXParser teXParser, String[] strArr) {
        return new LaTeXAtom();
    }

    public static final Atom GeoGebra_macro(TeXParser teXParser, String[] strArr) {
        TeXFormula teXFormula = new TeXFormula("\\mathbb{G}\\mathsf{e}");
        teXFormula.add(new GeoGebraLogoAtom());
        teXFormula.add("\\mathsf{Gebra}");
        return new ColorAtom(teXFormula.root, null, new Color(102, 102, 102));
    }

    public static final Atom hphantom_macro(TeXParser teXParser, String[] strArr) {
        return new PhantomAtom(new TeXFormula(teXParser, strArr[1], false).root, true, false, false);
    }

    public static final Atom vphantom_macro(TeXParser teXParser, String[] strArr) {
        return new PhantomAtom(new TeXFormula(teXParser, strArr[1], false).root, false, true, true);
    }

    public static final Atom phantom_macro(TeXParser teXParser, String[] strArr) {
        return new PhantomAtom(new TeXFormula(teXParser, strArr[1], false).root, true, true, true);
    }

    public static final Atom big_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        return !(atom instanceof SymbolAtom) ? atom : new BigDelimiterAtom((SymbolAtom) atom, 1);
    }

    public static final Atom Big_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        return !(atom instanceof SymbolAtom) ? atom : new BigDelimiterAtom((SymbolAtom) atom, 2);
    }

    public static final Atom bigg_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        return !(atom instanceof SymbolAtom) ? atom : new BigDelimiterAtom((SymbolAtom) atom, 3);
    }

    public static final Atom Bigg_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        return !(atom instanceof SymbolAtom) ? atom : new BigDelimiterAtom((SymbolAtom) atom, 4);
    }

    public static final Atom bigl_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (!(atom instanceof SymbolAtom)) {
            return atom;
        }
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) atom, 1);
        bigDelimiterAtom.type = 4;
        return bigDelimiterAtom;
    }

    public static final Atom Bigl_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (!(atom instanceof SymbolAtom)) {
            return atom;
        }
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) atom, 2);
        bigDelimiterAtom.type = 4;
        return bigDelimiterAtom;
    }

    public static final Atom biggl_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (!(atom instanceof SymbolAtom)) {
            return atom;
        }
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) atom, 3);
        bigDelimiterAtom.type = 4;
        return bigDelimiterAtom;
    }

    public static final Atom Biggl_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (!(atom instanceof SymbolAtom)) {
            return atom;
        }
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) atom, 4);
        bigDelimiterAtom.type = 4;
        return bigDelimiterAtom;
    }

    public static final Atom bigr_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (!(atom instanceof SymbolAtom)) {
            return atom;
        }
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) atom, 1);
        bigDelimiterAtom.type = 5;
        return bigDelimiterAtom;
    }

    public static final Atom Bigr_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (!(atom instanceof SymbolAtom)) {
            return atom;
        }
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) atom, 2);
        bigDelimiterAtom.type = 5;
        return bigDelimiterAtom;
    }

    public static final Atom biggr_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (!(atom instanceof SymbolAtom)) {
            return atom;
        }
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) atom, 3);
        bigDelimiterAtom.type = 5;
        return bigDelimiterAtom;
    }

    public static final Atom Biggr_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[1], false).root;
        if (!(atom instanceof SymbolAtom)) {
            return atom;
        }
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) atom, 4);
        bigDelimiterAtom.type = 5;
        return bigDelimiterAtom;
    }

    public static final Atom displaystyle_macro(TeXParser teXParser, String[] strArr) {
        return new StyleAtom(0, new TeXFormula(teXParser, teXParser.getOverArgument(), false).root);
    }

    public static final Atom scriptstyle_macro(TeXParser teXParser, String[] strArr) {
        return new StyleAtom(4, new TeXFormula(teXParser, teXParser.getOverArgument(), false).root);
    }

    public static final Atom textstyle_macro(TeXParser teXParser, String[] strArr) {
        return new StyleAtom(2, new TeXFormula(teXParser, teXParser.getOverArgument(), false).root);
    }

    public static final Atom scriptscriptstyle_macro(TeXParser teXParser, String[] strArr) {
        return new StyleAtom(6, new TeXFormula(teXParser, teXParser.getOverArgument(), false).root);
    }

    public static final Atom rotatebox_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[2]).root;
        String str = strArr[1];
        return new RotateAtom(atom, str == null ? 0.0d : Double.parseDouble(str), strArr[3]);
    }

    public static final Atom reflectbox_macro(TeXParser teXParser, String[] strArr) {
        return new ReflectAtom(new TeXFormula(teXParser, strArr[1]).root);
    }

    public static final Atom scalebox_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        Atom atom = new TeXFormula(teXParser, strArr[2]).root;
        double d = Double.parseDouble(strArr[1]);
        String str = strArr[3];
        return new ScaleAtom(atom, d, str == null ? Double.parseDouble(strArr[1]) : Double.parseDouble(str));
    }

    public static final Atom resizebox_macro(TeXParser teXParser, String[] strArr) {
        Atom atom = new TeXFormula(teXParser, strArr[3]).root;
        boolean z = true;
        String str = strArr[1];
        String str2 = strArr[2];
        if (!str.equals("!") && !strArr[2].equals("!")) {
            z = false;
        }
        return new ResizeAtom(atom, str, str2, z);
    }

    public static final Atom raisebox_macro(TeXParser teXParser, String[] strArr) {
        float[] length = SpaceAtom.getLength(strArr[1]);
        if (length.length == 1) {
            throw new ParseException("Error in getting raise in \\raisebox command !");
        }
        float[] length2 = SpaceAtom.getLength(strArr[3]);
        float[] length3 = SpaceAtom.getLength(strArr[4]);
        if (length2.length == 1 || length2[1] == 0.0f) {
            length2 = new float[]{-1.0f, 0.0f};
        }
        if (length3.length == 1 || length3[1] == 0.0f) {
            length3 = new float[]{-1.0f, 0.0f};
        }
        return new RaiseAtom(new TeXFormula(teXParser, strArr[2]).root, (int) length[0], length[1], (int) length2[0], length2[1], (int) length3[0], length3[1]);
    }

    public static final Atom shadowbox_macro(TeXParser teXParser, String[] strArr) {
        return new ShadowAtom(new TeXFormula(teXParser, strArr[1]).root);
    }

    public static final Atom ovalbox_macro(TeXParser teXParser, String[] strArr) {
        return new OvalAtom(new TeXFormula(teXParser, strArr[1]).root);
    }

    public static final Atom doublebox_macro(TeXParser teXParser, String[] strArr) {
        return new DoubleFramedAtom(new TeXFormula(teXParser, strArr[1]).root);
    }

    public static final Atom definecolor_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        Color color;
        if ("gray".equals(strArr[2])) {
            float f = Float.parseFloat(strArr[3]);
            color = new Color(f, f, f);
        } else if ("rgb".equals(strArr[2])) {
            StringTokenizer stringTokenizer = new StringTokenizer(strArr[3], ";,");
            if (stringTokenizer.countTokens() != 3) {
                throw new ParseException("The color definition must have three components !");
            }
            color = new Color(Float.parseFloat(stringTokenizer.nextToken().trim()), Float.parseFloat(stringTokenizer.nextToken().trim()), Float.parseFloat(stringTokenizer.nextToken().trim()));
        } else if ("cmyk".equals(strArr[2])) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(strArr[3], ",;");
            if (stringTokenizer2.countTokens() != 4) {
                throw new ParseException("The color definition must have four components !");
            }
            float[] fArr = new float[4];
            for (int i = 0; i < 4; i++) {
                fArr[i] = Float.parseFloat(stringTokenizer2.nextToken().trim());
            }
            float f2 = 1.0f - fArr[3];
            color = new Color((1.0f - fArr[0]) * f2, (1.0f - fArr[1]) * f2, f2 * (1.0f - fArr[2]));
        } else {
            throw new ParseException("The color model is incorrect !");
        }
        ColorAtom.Colors.put(strArr[1], color);
        return null;
    }

    public static final Atom fgcolor_macro(TeXParser teXParser, String[] strArr) {
        try {
            return new ColorAtom(new TeXFormula(teXParser, strArr[2]).root, null, ColorAtom.getColor(strArr[1]));
        } catch (NumberFormatException e) {
            throw new ParseException(e.toString());
        }
    }

    public static final Atom bgcolor_macro(TeXParser teXParser, String[] strArr) {
        try {
            return new ColorAtom(new TeXFormula(teXParser, strArr[2]).root, ColorAtom.getColor(strArr[1]), null);
        } catch (NumberFormatException e) {
            throw new ParseException(e.toString());
        }
    }

    public static final Atom textcolor_macro(TeXParser teXParser, String[] strArr) {
        return new ColorAtom(new TeXFormula(teXParser, strArr[2]).root, null, ColorAtom.getColor(strArr[1]));
    }

    public static final Atom colorbox_macro(TeXParser teXParser, String[] strArr) {
        Color color = ColorAtom.getColor(strArr[1]);
        return new FBoxAtom(new TeXFormula(teXParser, strArr[2]).root, color, color);
    }

    public static final Atom fcolorbox_macro(TeXParser teXParser, String[] strArr) {
        return new FBoxAtom(new TeXFormula(teXParser, strArr[3]).root, ColorAtom.getColor(strArr[2]), ColorAtom.getColor(strArr[1]));
    }

    public static final Atom cong_macro(TeXParser teXParser, String[] strArr) {
        VRowAtom vRowAtom = new VRowAtom(SymbolAtom.get("equals"));
        vRowAtom.add(new SpaceAtom(5, 0.0f, 1.5f, 0.0f));
        vRowAtom.add(SymbolAtom.get("sim"));
        vRowAtom.setRaise(5, -1.0f);
        return new TypedAtom(3, 3, vRowAtom);
    }

    public static final Atom doteq_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new UnderOverAtom(SymbolAtom.get("equals"), SymbolAtom.get("ldotp"), 5, 3.7f, false, true));
    }

    public static final Atom jlmDynamic_macro(TeXParser teXParser, String[] strArr) {
        if (DynamicAtom.hasAnExternalConverterFactory()) {
            return new DynamicAtom(strArr[1], strArr[2]);
        }
        throw new ParseException("No ExternalConverterFactory set !");
    }

    public static final Atom jlmExternalFont_macro(TeXParser teXParser, String[] strArr) {
        JavaFontRenderingBox.setFont(strArr[1]);
        return null;
    }

    public static final Atom jlmText_macro(TeXParser teXParser, String[] strArr) {
        return new JavaFontRenderingAtom(strArr[1], 0);
    }

    public static final Atom jlmTextit_macro(TeXParser teXParser, String[] strArr) {
        return new JavaFontRenderingAtom(strArr[1], 2);
    }

    public static final Atom jlmTextbf_macro(TeXParser teXParser, String[] strArr) {
        return new JavaFontRenderingAtom(strArr[1], 1);
    }

    public static final Atom jlmTextitbf_macro(TeXParser teXParser, String[] strArr) {
        return new JavaFontRenderingAtom(strArr[1], 3);
    }

    public static final Atom DeclareMathSizes_macro(TeXParser teXParser, String[] strArr) {
        DefaultTeXFont.setMathSizes(Float.parseFloat(strArr[1]), Float.parseFloat(strArr[2]), Float.parseFloat(strArr[3]), Float.parseFloat(strArr[4]));
        return null;
    }

    public static final Atom magnification_macro(TeXParser teXParser, String[] strArr) {
        DefaultTeXFont.setMagnification(Float.parseFloat(strArr[1]));
        return null;
    }

    public static final Atom hline_macro(TeXParser teXParser, String[] strArr) {
        if (!teXParser.isArrayMode()) {
            throw new ParseException("The macro \\hline is only available in array mode !");
        }
        return new HlineAtom();
    }

    public static final org.scilab.forge.jlatexmath.Atom size_macros(org.scilab.forge.jlatexmath.TeXParser r8, java.lang.String[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.PredefMacros.size_macros(org.scilab.forge.jlatexmath.TeXParser, java.lang.String[]):org.scilab.forge.jlatexmath.Atom");
    }

    public static final Atom jlatexmathcumsup_macro(TeXParser teXParser, String[] strArr) {
        return new CumulativeScriptsAtom(teXParser.getLastAtom(), null, new TeXFormula(teXParser, strArr[1]).root);
    }

    public static final Atom jlatexmathcumsub_macro(TeXParser teXParser, String[] strArr) {
        return new CumulativeScriptsAtom(teXParser.getLastAtom(), new TeXFormula(teXParser, strArr[1]).root, null);
    }

    public static final Atom dotminus_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(2, 2, new UnderOverAtom(SymbolAtom.get("minus"), SymbolAtom.get("normaldot"), 5, -3.3f, false, true));
    }

    public static final Atom ratio_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
    }

    public static final Atom geoprop_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("normaldot"));
        rowAtom.add(new SpaceAtom(5, 4.0f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("normaldot"));
        return new TypedAtom(3, 3, new UnderOverAtom(SymbolAtom.get("minus"), rowAtom, 5, -3.4f, false, rowAtom, 5, -3.4f, false));
    }

    public static final Atom minuscolon_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("minus"));
        rowAtom.add(new SpaceAtom(0, -0.095f, 0.0f, 0.0f));
        rowAtom.add(new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom minuscoloncolon_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("minus"));
        rowAtom.add(new SpaceAtom(0, -0.095f, 0.0f, 0.0f));
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        rowAtom.add(underOverAtom);
        rowAtom.add(underOverAtom);
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom simcolon_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("sim"));
        rowAtom.add(new SpaceAtom(0, -0.095f, 0.0f, 0.0f));
        rowAtom.add(new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom simcoloncolon_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("sim"));
        rowAtom.add(new SpaceAtom(0, -0.095f, 0.0f, 0.0f));
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        rowAtom.add(underOverAtom);
        rowAtom.add(underOverAtom);
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom approxcolon_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("approx"));
        rowAtom.add(new SpaceAtom(0, -0.095f, 0.0f, 0.0f));
        rowAtom.add(new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom approxcoloncolon_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("approx"));
        rowAtom.add(new SpaceAtom(0, -0.095f, 0.0f, 0.0f));
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        rowAtom.add(underOverAtom);
        rowAtom.add(underOverAtom);
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom equalscolon_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("equals"));
        rowAtom.add(new SpaceAtom(0, -0.095f, 0.0f, 0.0f));
        rowAtom.add(new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom equalscoloncolon_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(SymbolAtom.get("equals"));
        rowAtom.add(new SpaceAtom(0, -0.095f, 0.0f, 0.0f));
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        rowAtom.add(underOverAtom);
        rowAtom.add(underOverAtom);
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom colonminus_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
        rowAtom.add(new SpaceAtom(0, -0.32f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("minus"));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom coloncolonminus_macro(TeXParser teXParser, String[] strArr) {
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        RowAtom rowAtom = new RowAtom(underOverAtom);
        rowAtom.add(underOverAtom);
        rowAtom.add(new SpaceAtom(0, -0.32f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("minus"));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom colonequals_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
        rowAtom.add(new SpaceAtom(0, -0.32f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("equals"));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom coloncolonequals_macro(TeXParser teXParser, String[] strArr) {
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        RowAtom rowAtom = new RowAtom(underOverAtom);
        rowAtom.add(underOverAtom);
        rowAtom.add(new SpaceAtom(0, -0.32f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("equals"));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom coloncolon_macro(TeXParser teXParser, String[] strArr) {
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        RowAtom rowAtom = new RowAtom(underOverAtom);
        rowAtom.add(underOverAtom);
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom colonsim_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
        rowAtom.add(new SpaceAtom(0, -0.32f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("sim"));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom coloncolonsim_macro(TeXParser teXParser, String[] strArr) {
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        RowAtom rowAtom = new RowAtom(underOverAtom);
        rowAtom.add(underOverAtom);
        rowAtom.add(new SpaceAtom(0, -0.32f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("sim"));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom colonapprox_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true));
        rowAtom.add(new SpaceAtom(0, -0.32f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("approx"));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom coloncolonapprox_macro(TeXParser teXParser, String[] strArr) {
        UnderOverAtom underOverAtom = new UnderOverAtom(SymbolAtom.get("normaldot"), SymbolAtom.get("normaldot"), 5, 5.2f, false, true);
        RowAtom rowAtom = new RowAtom(underOverAtom);
        rowAtom.add(underOverAtom);
        rowAtom.add(new SpaceAtom(0, -0.32f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("approx"));
        return new TypedAtom(3, 3, rowAtom);
    }

    public static final Atom smallfrowneq_macro(TeXParser teXParser, String[] strArr) {
        return new TypedAtom(3, 3, new UnderOverAtom(SymbolAtom.get("equals"), SymbolAtom.get("smallfrown"), 5, -2.0f, true, true));
    }

    public static final Atom hstrok_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(new SpaceAtom(1, -0.1f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("bar"));
        VRowAtom vRowAtom = new VRowAtom(new LapedAtom(rowAtom, 'r'));
        vRowAtom.setRaise(1, -0.1f);
        RowAtom rowAtom2 = new RowAtom(vRowAtom);
        rowAtom2.add(new RomanAtom(new CharAtom('h', teXParser.formula.textStyle)));
        return rowAtom2;
    }

    public static final Atom Hstrok_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(new SpaceAtom(1, 0.28f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("textendash"));
        VRowAtom vRowAtom = new VRowAtom(new LapedAtom(rowAtom, 'r'));
        vRowAtom.setRaise(1, 0.55f);
        RowAtom rowAtom2 = new RowAtom(vRowAtom);
        rowAtom2.add(new RomanAtom(new CharAtom('H', teXParser.formula.textStyle)));
        return rowAtom2;
    }

    public static final Atom dstrok_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(new SpaceAtom(1, 0.25f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("bar"));
        VRowAtom vRowAtom = new VRowAtom(new LapedAtom(rowAtom, 'r'));
        vRowAtom.setRaise(1, -0.1f);
        RowAtom rowAtom2 = new RowAtom(vRowAtom);
        rowAtom2.add(new RomanAtom(new CharAtom('d', teXParser.formula.textStyle)));
        return rowAtom2;
    }

    public static final Atom Dstrok_macro(TeXParser teXParser, String[] strArr) {
        RowAtom rowAtom = new RowAtom(new SpaceAtom(1, -0.1f, 0.0f, 0.0f));
        rowAtom.add(SymbolAtom.get("bar"));
        VRowAtom vRowAtom = new VRowAtom(new LapedAtom(rowAtom, 'r'));
        vRowAtom.setRaise(1, -0.55f);
        RowAtom rowAtom2 = new RowAtom(vRowAtom);
        rowAtom2.add(new RomanAtom(new CharAtom('D', teXParser.formula.textStyle)));
        return rowAtom2;
    }

    public static final Atom kern_macro(TeXParser teXParser, String[] strArr) {
        float[] length = SpaceAtom.getLength(strArr[1]);
        if (length.length == 1) {
            throw new ParseException("Error in getting kern in \\kern command !");
        }
        return new SpaceAtom((int) length[0], length[1], 0.0f, 0.0f);
    }

    public static final Atom char_macro(TeXParser teXParser, String[] strArr) {
        String strSubstring = strArr[1];
        int i = 16;
        if (strSubstring.startsWith("0x") || strSubstring.startsWith("0X")) {
            strSubstring = strSubstring.substring(2);
        } else if (strSubstring.startsWith("x") || strSubstring.startsWith("X")) {
            strSubstring = strSubstring.substring(1);
        } else if (strSubstring.startsWith("0")) {
            strSubstring = strSubstring.substring(1);
            i = 8;
        } else {
            i = 10;
        }
        return teXParser.convertCharacter((char) Integer.parseInt(strSubstring, i), true);
    }

    public static final Atom T_macro(TeXParser teXParser, String[] strArr) {
        return new RotateAtom(new TeXFormula(teXParser, strArr[1]).root, 180.0d, "origin=cc");
    }

    public static final Atom romannumeral_macro(TeXParser teXParser, String[] strArr) throws NumberFormatException {
        int[] iArr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strArr2 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = Integer.parseInt(strArr[1].trim());
        String lowerCase = "";
        for (int i2 = 0; i2 < 13; i2++) {
            while (i >= iArr[i2]) {
                lowerCase = lowerCase + strArr2[i2];
                i -= iArr[i2];
            }
        }
        if (strArr[0].charAt(0) == 'r') {
            lowerCase = lowerCase.toLowerCase();
        }
        return new TeXFormula(lowerCase, false).root;
    }

    public static final Atom textcircled_macro(TeXParser teXParser, String[] strArr) {
        return new TextCircledAtom(new RomanAtom(new TeXFormula(teXParser, strArr[1]).root));
    }

    public static final Atom textsc_macro(TeXParser teXParser, String[] strArr) {
        return new SmallCapAtom(new TeXFormula(teXParser, strArr[1], false).root);
    }

    public static final Atom sc_macro(TeXParser teXParser, String[] strArr) {
        return new SmallCapAtom(new TeXFormula(teXParser, teXParser.getOverArgument(), null, false, teXParser.isIgnoreWhiteSpace()).root);
    }

    public static final Atom quad_macro(TeXParser teXParser, String[] strArr) {
        return new SpaceAtom(0, 1.0f, 0.0f, 0.0f);
    }

    public static final Atom qquad_macro(TeXParser teXParser, String[] strArr) {
        return new SpaceAtom(0, 2.0f, 0.0f, 0.0f);
    }

    public static final org.scilab.forge.jlatexmath.Atom muskip_macros(org.scilab.forge.jlatexmath.TeXParser r5, java.lang.String[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.PredefMacros.muskip_macros(org.scilab.forge.jlatexmath.TeXParser, java.lang.String[]):org.scilab.forge.jlatexmath.Atom");
    }

    public static final Atom surd_macro(TeXParser teXParser, String[] strArr) {
        return new VCenteredAtom(SymbolAtom.get("surdsign"));
    }

    public static final Atom int_macro(TeXParser teXParser, String[] strArr) {
        Atom atomClone = SymbolAtom.get("int").clone();
        atomClone.type_limits = 1;
        return atomClone;
    }

    public static final Atom oint_macro(TeXParser teXParser, String[] strArr) {
        Atom atomClone = SymbolAtom.get("oint").clone();
        atomClone.type_limits = 1;
        return atomClone;
    }

    public static final Atom iint_macro(TeXParser teXParser, String[] strArr) {
        Atom atomClone = SymbolAtom.get("int").clone();
        atomClone.type_limits = 1;
        RowAtom rowAtom = new RowAtom(atomClone);
        rowAtom.add(new SpaceAtom(5, -6.0f, 0.0f, 0.0f));
        rowAtom.add(atomClone);
        rowAtom.lookAtLastAtom = true;
        return new TypedAtom(1, 1, rowAtom);
    }

    public static final Atom iiint_macro(TeXParser teXParser, String[] strArr) {
        Atom atomClone = SymbolAtom.get("int").clone();
        atomClone.type_limits = 1;
        RowAtom rowAtom = new RowAtom(atomClone);
        rowAtom.add(new SpaceAtom(5, -6.0f, 0.0f, 0.0f));
        rowAtom.add(atomClone);
        rowAtom.add(new SpaceAtom(5, -6.0f, 0.0f, 0.0f));
        rowAtom.add(atomClone);
        rowAtom.lookAtLastAtom = true;
        return new TypedAtom(1, 1, rowAtom);
    }

    public static final Atom iiiint_macro(TeXParser teXParser, String[] strArr) {
        Atom atomClone = SymbolAtom.get("int").clone();
        atomClone.type_limits = 1;
        RowAtom rowAtom = new RowAtom(atomClone);
        rowAtom.add(new SpaceAtom(5, -6.0f, 0.0f, 0.0f));
        rowAtom.add(atomClone);
        rowAtom.add(new SpaceAtom(5, -6.0f, 0.0f, 0.0f));
        rowAtom.add(atomClone);
        rowAtom.add(new SpaceAtom(5, -6.0f, 0.0f, 0.0f));
        rowAtom.add(atomClone);
        rowAtom.lookAtLastAtom = true;
        return new TypedAtom(1, 1, rowAtom);
    }

    public static final Atom idotsint_macro(TeXParser teXParser, String[] strArr) {
        Atom atomClone = SymbolAtom.get("int").clone();
        atomClone.type_limits = 1;
        RowAtom rowAtom = new RowAtom(atomClone);
        rowAtom.add(new SpaceAtom(5, -1.0f, 0.0f, 0.0f));
        SymbolAtom symbolAtom = SymbolAtom.get("cdotp");
        RowAtom rowAtom2 = new RowAtom(symbolAtom);
        rowAtom2.add(symbolAtom);
        rowAtom2.add(symbolAtom);
        rowAtom.add(new TypedAtom(7, 7, rowAtom2));
        rowAtom.add(new SpaceAtom(5, -1.0f, 0.0f, 0.0f));
        rowAtom.add(atomClone);
        rowAtom.lookAtLastAtom = true;
        return new TypedAtom(1, 1, rowAtom);
    }

    public static final Atom lmoustache_macro(TeXParser teXParser, String[] strArr) {
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) SymbolAtom.get("lmoustache").clone(), 1);
        bigDelimiterAtom.type = 4;
        return bigDelimiterAtom;
    }

    public static final Atom rmoustache_macro(TeXParser teXParser, String[] strArr) {
        BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom((SymbolAtom) SymbolAtom.get("rmoustache").clone(), 1);
        bigDelimiterAtom.type = 5;
        return bigDelimiterAtom;
    }

    public static final Atom insertBreakMark_macro(TeXParser teXParser, String[] strArr) {
        return new BreakMarkAtom();
    }

    public static final Atom jlmXML_macro(TeXParser teXParser, String[] strArr) {
        Map map = teXParser.formula.jlmXMLMap;
        String strSubstring = strArr[1];
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int iIndexOf = strSubstring.indexOf("$");
            if (iIndexOf != -1) {
                if (iIndexOf < strSubstring.length() - 1) {
                    int i = iIndexOf;
                    do {
                        i++;
                        if (i >= strSubstring.length()) {
                            break;
                        }
                    } while (Character.isLetter(strSubstring.charAt(i)));
                    String str = (String) map.get(strSubstring.substring(iIndexOf + 1, i));
                    if (str != null) {
                        stringBuffer.append(strSubstring.substring(0, iIndexOf));
                        stringBuffer.append(str);
                    } else {
                        stringBuffer.append(strSubstring.substring(0, i));
                    }
                    strSubstring = strSubstring.substring(i);
                } else {
                    stringBuffer.append(strSubstring);
                    strSubstring = "";
                }
            } else {
                stringBuffer.append(strSubstring);
                return new TeXFormula(teXParser, stringBuffer.toString()).root;
            }
        }
    }
}
