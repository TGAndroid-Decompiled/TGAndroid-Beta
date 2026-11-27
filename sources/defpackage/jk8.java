package defpackage;
public final class jk8 extends ju4 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final jk8 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile gy7 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        jk8 jk8Var = new jk8();
        DEFAULT_INSTANCE = jk8Var;
        ju4.j(jk8.class, jk8Var);
    }

    public static jk8 n() {
        return DEFAULT_INSTANCE;
    }

    public static hk8 v() {
        return (hk8) ((hu4) DEFAULT_INSTANCE.c(5));
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

    public final void D(gk8 gk8Var) {
        this.value_ = gk8Var;
        this.valueCase_ = 6;
    }

    @Override
    public final Object c(int i) {
        gy7 gy7Var;
        switch (ik8.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new v29(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", gk8.class});
            case 3:
                return new jk8();
            case 4:
                return new hu4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                gy7 gy7Var2 = PARSER;
                if (gy7Var2 == null) {
                    synchronized (jk8.class) {
                        gy7 gy7Var3 = PARSER;
                        gy7Var = gy7Var3;
                        if (gy7Var3 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            gy7Var = obj;
                        }
                    }
                    return gy7Var;
                }
                return gy7Var2;
            default:
                p3d.a();
                return null;
        }
    }

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final n51 m() {
        if (this.valueCase_ == 8) {
            return (n51) this.value_;
        }
        return n51.c;
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

    public final gk8 t() {
        if (this.valueCase_ == 6) {
            return (gk8) this.value_;
        }
        return gk8.m();
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

    public final void x(n51 n51Var) {
        this.valueCase_ = 8;
        this.value_ = n51Var;
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
