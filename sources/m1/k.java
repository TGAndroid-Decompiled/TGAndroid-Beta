package m1;

import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
public final class k extends x {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile x0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        x.h(k.class, kVar);
    }

    public static void i(k kVar, long j10) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j10);
    }

    public static void j(k kVar, String str) {
        kVar.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void k(k kVar, g gVar) {
        kVar.getClass();
        kVar.value_ = gVar.a();
        kVar.valueCase_ = 6;
    }

    public static void l(k kVar, double d) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d);
    }

    public static void m(k kVar, boolean z10) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z10);
    }

    public static void n(k kVar, float f9) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f9);
    }

    public static void o(k kVar, int i10) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i10);
    }

    public static k q() {
        return DEFAULT_INSTANCE;
    }

    public static i y() {
        return (i) ((v) DEFAULT_INSTANCE.d(5));
    }

    @Override
    public final Object d(int i10) {
        x0 x0Var;
        switch (j.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", h.class});
            case 3:
                return new k();
            case 4:
                return new v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (k.class) {
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

    public final boolean p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final h w() {
        if (this.valueCase_ == 6) {
            return (h) this.value_;
        }
        return h.j();
    }

    public final int x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
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
            default:
                return 0;
        }
    }
}
