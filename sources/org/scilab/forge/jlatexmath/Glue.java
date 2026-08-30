package org.scilab.forge.jlatexmath;
public class Glue {
    private static final int[][][] glueTable;
    private static Glue[] glueTypes;
    private final String name;
    private final float shrink;
    private final float space;
    private final float stretch;

    static {
        GlueSettingsParser glueSettingsParser = new GlueSettingsParser();
        glueTypes = glueSettingsParser.getGlueTypes();
        glueTable = glueSettingsParser.createGlueTable();
    }

    public Glue(float f10, float f11, float f12, String str) {
        this.space = f10;
        this.stretch = f11;
        this.shrink = f12;
        this.name = str;
    }

    private Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        float quad = teXFont.getQuad(teXEnvironment.getStyle(), teXFont.getMuFontId());
        return new GlueBox((this.space / 18.0f) * quad, (this.stretch / 18.0f) * quad, (this.shrink / 18.0f) * quad);
    }

    public static Box get(int i10, int i11, TeXEnvironment teXEnvironment) {
        if (i10 > 7) {
            i10 = 0;
        }
        if (i11 > 7) {
            i11 = 0;
        }
        return glueTypes[glueTable[i10][i11][teXEnvironment.getStyle() / 2]].createBox(teXEnvironment);
    }

    public String getName() {
        return this.name;
    }
}
