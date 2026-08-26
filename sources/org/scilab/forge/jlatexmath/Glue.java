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

    public Glue(float f, float f2, float f3, String str) {
        this.space = f;
        this.stretch = f2;
        this.shrink = f3;
        this.name = str;
    }

    private Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        float quad = teXFont.getQuad(teXEnvironment.getStyle(), teXFont.getMuFontId());
        return new GlueBox((this.space / 18.0f) * quad, (this.stretch / 18.0f) * quad, (this.shrink / 18.0f) * quad);
    }

    public static Box get(int i, int i2, TeXEnvironment teXEnvironment) {
        if (i > 7) {
            i = 0;
        }
        if (i2 > 7) {
            i2 = 0;
        }
        return glueTypes[glueTable[i][i2][teXEnvironment.getStyle() / 2]].createBox(teXEnvironment);
    }

    public String getName() {
        return this.name;
    }
}
