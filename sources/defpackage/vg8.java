package defpackage;
public final class vg8 extends fs4 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final vg8 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile zu7 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        vg8 vg8Var = new vg8();
        DEFAULT_INSTANCE = vg8Var;
        fs4.j(vg8.class, vg8Var);
    }

    public static vg8 n() {
        return DEFAULT_INSTANCE;
    }

    public static tg8 v() {
        return (tg8) ((ds4) DEFAULT_INSTANCE.c(5));
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void C(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(sg8 sg8Var) {
        this.value_ = sg8Var;
        this.valueCase_ = 6;
    }

    @Override
    public final Object c(int i) {
        zu7 zu7Var;
        switch (ug8.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new iz8(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", sg8.class});
            case 3:
                return new vg8();
            case 4:
                return new ds4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                zu7 zu7Var2 = PARSER;
                if (zu7Var2 == null) {
                    synchronized (vg8.class) {
                        zu7 zu7Var3 = PARSER;
                        zu7Var = zu7Var3;
                        if (zu7Var3 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            zu7Var = obj;
                        }
                    }
                    return zu7Var;
                }
                return zu7Var2;
            default:
                fvc.b();
                return null;
        }
    }

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final f51 m() {
        if (this.valueCase_ == 8) {
            return (f51) this.value_;
        }
        return f51.c;
    }

    public final double o() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float p() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int q() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long r() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final sg8 t() {
        if (this.valueCase_ == 6) {
            return (sg8) this.value_;
        }
        return sg8.m();
    }

    public final int u() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final void w(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void x(f51 f51Var) {
        this.valueCase_ = 8;
        this.value_ = f51Var;
    }

    public final void y(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void z(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }
}
