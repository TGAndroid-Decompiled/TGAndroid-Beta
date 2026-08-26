package org.scilab.forge.jlatexmath;

import java.util.HashMap;
import java.util.Map;

public class SpaceAtom extends Atom {
    private static UnitConversion[] unitConversions;
    private static Map<String, Integer> units;
    private boolean blankSpace;
    private int blankType;
    private int dUnit;
    private float depth;
    private int hUnit;
    private float height;
    private int wUnit;
    private float width;

    public interface UnitConversion {
        float getPixelConversion(TeXEnvironment teXEnvironment);
    }

    static {
        HashMap map = new HashMap();
        units = map;
        map.put("em", 0);
        units.put("ex", 1);
        units.put("px", 2);
        units.put("pix", 2);
        units.put("pixel", 2);
        units.put("pt", 10);
        units.put("bp", 3);
        units.put("pica", 4);
        units.put("pc", 4);
        units.put("mu", 5);
        units.put("cm", 6);
        units.put("mm", 7);
        units.put("in", 8);
        units.put("sp", 9);
        units.put("dd", 11);
        units.put("cc", 12);
        unitConversions = new UnitConversion[]{new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return teXEnvironment.getTeXFont().getEM(teXEnvironment.getStyle());
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return teXEnvironment.getTeXFont().getXHeight(teXEnvironment.getStyle(), teXEnvironment.getLastFontId());
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return 1.0f / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return TeXFormula.PIXELS_PER_POINT / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 12.0f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                TeXFont teXFont = teXEnvironment.getTeXFont();
                return teXFont.getQuad(teXEnvironment.getStyle(), teXFont.getMuFontId()) / 18.0f;
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 28.346457f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 2.8346457f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 72.0f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 65536.0f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 0.996264f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 1.0660349f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 12.792419f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() {
            @Override
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
            }
        }};
    }

    public SpaceAtom() {
        this.blankSpace = true;
    }

    public static void checkUnit(int i) {
        if (i < 0 || i >= unitConversions.length) {
            throw new InvalidUnitException();
        }
    }

    public static float getFactor(int i, TeXEnvironment teXEnvironment) {
        return unitConversions[i].getPixelConversion(teXEnvironment);
    }

    public static float[] getLength(String str) {
        if (str == null) {
            return new float[]{2.0f, 0.0f};
        }
        int i = 0;
        while (i < str.length() && !Character.isLetter(str.charAt(i))) {
            i++;
        }
        try {
            return new float[]{i != str.length() ? getUnit(str.substring(i).toLowerCase()) : 2, Float.parseFloat(str.substring(0, i))};
        } catch (NumberFormatException unused) {
            return new float[]{Float.NaN};
        }
    }

    public static int getUnit(String str) {
        Integer num = units.get(str);
        if (num == null) {
            return 2;
        }
        return num.intValue();
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box box;
        if (!this.blankSpace) {
            return new StrutBox(getFactor(this.wUnit, teXEnvironment) * this.width, getFactor(this.hUnit, teXEnvironment) * this.height, getFactor(this.dUnit, teXEnvironment) * this.depth, 0.0f);
        }
        int i = this.blankType;
        if (i == 0) {
            return new StrutBox(teXEnvironment.getSpace(), 0.0f, 0.0f, 0.0f);
        }
        if (i < 0) {
            i = -i;
        }
        if (i == 1) {
            box = Glue.get(7, 1, teXEnvironment);
        } else {
            box = i == 2 ? Glue.get(2, 1, teXEnvironment) : Glue.get(3, 1, teXEnvironment);
        }
        if (this.blankType < 0) {
            box.negWidth();
        }
        return box;
    }

    public SpaceAtom(int i) {
        this.blankSpace = true;
        this.blankType = i;
    }

    public SpaceAtom(int i, float f, float f2, float f3) {
        checkUnit(i);
        this.wUnit = i;
        this.hUnit = i;
        this.dUnit = i;
        this.width = f;
        this.height = f2;
        this.depth = f3;
    }

    public SpaceAtom(int i, float f, int i2, float f2, int i3, float f3) {
        checkUnit(i);
        checkUnit(i2);
        checkUnit(i3);
        this.wUnit = i;
        this.hUnit = i2;
        this.dUnit = i3;
        this.width = f;
        this.height = f2;
        this.depth = f3;
    }
}
