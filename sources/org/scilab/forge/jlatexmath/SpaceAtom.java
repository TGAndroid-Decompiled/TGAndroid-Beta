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
        HashMap hashMap = new HashMap();
        units = hashMap;
        hashMap.put("em", 0);
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

    public static void checkUnit(int i9) {
        if (i9 >= 0 && i9 < unitConversions.length) {
            return;
        }
        throw new InvalidUnitException();
    }

    public static float getFactor(int i9, TeXEnvironment teXEnvironment) {
        return unitConversions[i9].getPixelConversion(teXEnvironment);
    }

    public static float[] getLength(String str) {
        int i9;
        if (str == null) {
            return new float[]{2.0f, 0.0f};
        }
        int i10 = 0;
        while (i10 < str.length() && !Character.isLetter(str.charAt(i10))) {
            i10++;
        }
        try {
            float parseFloat = Float.parseFloat(str.substring(0, i10));
            if (i10 != str.length()) {
                i9 = getUnit(str.substring(i10).toLowerCase());
            } else {
                i9 = 2;
            }
            return new float[]{i9, parseFloat};
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
        if (this.blankSpace) {
            int i9 = this.blankType;
            if (i9 == 0) {
                return new StrutBox(teXEnvironment.getSpace(), 0.0f, 0.0f, 0.0f);
            }
            if (i9 < 0) {
                i9 = -i9;
            }
            if (i9 == 1) {
                box = Glue.get(7, 1, teXEnvironment);
            } else if (i9 == 2) {
                box = Glue.get(2, 1, teXEnvironment);
            } else {
                box = Glue.get(3, 1, teXEnvironment);
            }
            if (this.blankType < 0) {
                box.negWidth();
            }
            return box;
        }
        return new StrutBox(getFactor(this.wUnit, teXEnvironment) * this.width, getFactor(this.hUnit, teXEnvironment) * this.height, getFactor(this.dUnit, teXEnvironment) * this.depth, 0.0f);
    }

    public SpaceAtom(int i9) {
        this.blankSpace = true;
        this.blankType = i9;
    }

    public SpaceAtom(int i9, float f10, float f11, float f12) {
        checkUnit(i9);
        this.wUnit = i9;
        this.hUnit = i9;
        this.dUnit = i9;
        this.width = f10;
        this.height = f11;
        this.depth = f12;
    }

    public SpaceAtom(int i9, float f10, int i10, float f11, int i11, float f12) {
        checkUnit(i9);
        checkUnit(i10);
        checkUnit(i11);
        this.wUnit = i9;
        this.hUnit = i10;
        this.dUnit = i11;
        this.width = f10;
        this.height = f11;
        this.depth = f12;
    }
}
