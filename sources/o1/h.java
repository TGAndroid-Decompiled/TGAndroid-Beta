package o1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z;
public final class h extends z {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile x0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        z.j(h.class, hVar);
    }

    public static f D() {
        return (f) ((x) DEFAULT_INSTANCE.c(5));
    }

    public static void l(h hVar, long j10) {
        hVar.valueCase_ = 4;
        hVar.value_ = Long.valueOf(j10);
    }

    public static void m(h hVar, String str) {
        hVar.getClass();
        hVar.valueCase_ = 5;
        hVar.value_ = str;
    }

    public static void n(h hVar, e eVar) {
        hVar.getClass();
        hVar.value_ = eVar;
        hVar.valueCase_ = 6;
    }

    public static void o(h hVar, double d) {
        hVar.valueCase_ = 7;
        hVar.value_ = Double.valueOf(d);
    }

    public static void p(h hVar, androidx.datastore.preferences.protobuf.h hVar2) {
        hVar.getClass();
        hVar.valueCase_ = 8;
        hVar.value_ = hVar2;
    }

    public static void q(h hVar, boolean z10) {
        hVar.valueCase_ = 1;
        hVar.value_ = Boolean.valueOf(z10);
    }

    public static void r(h hVar, float f10) {
        hVar.valueCase_ = 2;
        hVar.value_ = Float.valueOf(f10);
    }

    public static void s(h hVar, int i3) {
        hVar.valueCase_ = 3;
        hVar.value_ = Integer.valueOf(i3);
    }

    public static h v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final e B() {
        if (this.valueCase_ == 6) {
            return (e) this.value_;
        }
        return e.m();
    }

    public final int C() {
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

    @Override
    public final Object c(int i3) {
        x0 x0Var;
        switch (g.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", e.class});
            case 3:
                return new h();
            case 4:
                return new x(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (h.class) {
                        try {
                            x0 x0Var3 = PARSER;
                            x0Var = x0Var3;
                            if (x0Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                x0Var = obj;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return x0Var;
                }
                return x0Var2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final androidx.datastore.preferences.protobuf.h u() {
        if (this.valueCase_ == 8) {
            return (androidx.datastore.preferences.protobuf.h) this.value_;
        }
        return androidx.datastore.preferences.protobuf.h.f1611c;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
