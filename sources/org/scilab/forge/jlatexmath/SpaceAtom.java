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

    public static void checkUnit(int i10) {
        if (i10 < 0 || i10 >= unitConversions.length) {
            throw new InvalidUnitException();
        }
    }

    public static float getFactor(int i10, TeXEnvironment teXEnvironment) {
        return unitConversions[i10].getPixelConversion(teXEnvironment);
    }

    public static float[] getLength(String str) {
        if (str == null) {
            return new float[]{2.0f, 0.0f};
        }
        int i10 = 0;
        while (i10 < str.length() && !Character.isLetter(str.charAt(i10))) {
            i10++;
        }
        try {
            return new float[]{i10 != str.length() ? getUnit(str.substring(i10).toLowerCase()) : 2, Float.parseFloat(str.substring(0, i10))};
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
        int i10 = this.blankType;
        if (i10 == 0) {
            return new StrutBox(teXEnvironment.getSpace(), 0.0f, 0.0f, 0.0f);
        }
        if (i10 < 0) {
            i10 = -i10;
        }
        if (i10 == 1) {
            box = Glue.get(7, 1, teXEnvironment);
        } else {
            box = i10 == 2 ? Glue.get(2, 1, teXEnvironment) : Glue.get(3, 1, teXEnvironment);
        }
        if (this.blankType < 0) {
            box.negWidth();
        }
        return box;
    }

    public SpaceAtom(int i10) {
        this.blankSpace = true;
        this.blankType = i10;
    }

    public SpaceAtom(int i10, float f10, float f11, float f12) {
        checkUnit(i10);
        this.wUnit = i10;
        this.hUnit = i10;
        this.dUnit = i10;
        this.width = f10;
        this.height = f11;
        this.depth = f12;
    }

    public SpaceAtom(int i10, float f10, int i11, float f11, int i12, float f12) {
        checkUnit(i10);
        checkUnit(i11);
        checkUnit(i12);
        this.wUnit = i10;
        this.hUnit = i11;
        this.dUnit = i12;
        this.width = f10;
        this.height = f11;
        this.depth = f12;
    }
}
