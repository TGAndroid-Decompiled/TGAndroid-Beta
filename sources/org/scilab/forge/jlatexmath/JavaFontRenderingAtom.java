package org.scilab.forge.jlatexmath;

import org.scilab.forge.jlatexmath.TeXFormula;
import ru.noties.jlatexmath.awt.Font;
public class JavaFontRenderingAtom extends Atom {
    private TeXFormula.FontInfos fontInfos;
    private String str;
    private int type;

    public JavaFontRenderingAtom(String str, int i10) {
        this.str = str;
        this.type = i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i10;
        Font font;
        Font font2;
        Font font3;
        if (this.fontInfos == null) {
            return new JavaFontRenderingBox(this.str, this.type, DefaultTeXFont.getSizeFactor(teXEnvironment.getStyle()));
        }
        DefaultTeXFont defaultTeXFont = (DefaultTeXFont) teXEnvironment.getTeXFont();
        if (defaultTeXFont.isIt) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i11 = i10 | (defaultTeXFont.isBold ? 1 : 0);
        boolean z4 = defaultTeXFont.isRoman;
        if (defaultTeXFont.isSs) {
            TeXFormula.FontInfos fontInfos = this.fontInfos;
            String str = fontInfos.sansserif;
            if (str == null) {
                font2 = new Font(fontInfos.serif, 0, 10);
                font3 = font2;
            } else {
                font = new Font(str, 0, 10);
                font3 = font;
            }
        } else {
            TeXFormula.FontInfos fontInfos2 = this.fontInfos;
            String str2 = fontInfos2.serif;
            if (str2 == null) {
                font2 = new Font(fontInfos2.sansserif, 0, 10);
                font3 = font2;
            } else {
                font = new Font(str2, 0, 10);
                font3 = font;
            }
        }
        return new JavaFontRenderingBox(this.str, i11, DefaultTeXFont.getSizeFactor(teXEnvironment.getStyle()), font3, z4);
    }

    public JavaFontRenderingAtom(String str, TeXFormula.FontInfos fontInfos) {
        this(str, 0);
        this.fontInfos = fontInfos;
    }
}
