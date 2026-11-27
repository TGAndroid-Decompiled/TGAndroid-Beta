package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
public final class bn2 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final h9a a;
    public final int b;
    public final int c;
    public final Bundle d;
    public final lo5 e;
    public final boolean f;
    public final Object g;

    static {
        String str = gcc.a;
        h = "0";
        i = "1";
        j = "2";
        k = "4";
        l = "5";
        m = "8";
        n = "9";
    }

    public bn2(h9a h9aVar, int i2, int i3, Bundle bundle, boolean z, lo5 lo5Var, Object obj) {
        this.a = h9aVar;
        this.b = i2;
        this.c = i3;
        this.d = new Bundle(bundle);
        this.f = z;
        this.e = lo5Var;
        this.g = obj;
    }

    public static boolean b(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((bn2) list.get(i3)).e.b(0) == i2) {
                return true;
            }
        }
        return false;
    }

    public static bn2 c(h9a h9aVar) {
        int i2;
        String str = h9aVar.b;
        Bundle bundle = h9aVar.c;
        boolean z = true;
        int i3 = 0;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object g = g(h(parseInt), bundle);
            an2 an2Var = new an2();
            if (((h9a) an2Var.d) != null) {
                z = false;
            }
            yve.e("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", z);
            an2Var.a = parseInt;
            an2Var.g = k(h(parseInt), g);
            return an2Var.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        if (parseInt2 == 40010) {
            i2 = 5;
        } else {
            i2 = 0;
        }
        Object g2 = g(i2, bundle);
        an2 an2Var2 = new an2();
        h9a h9aVar2 = new h9a(parseInt2);
        if (an2Var2.a != -1) {
            z = false;
        }
        yve.e("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z);
        an2Var2.d = h9aVar2;
        if (h9aVar2.a == 40010) {
            i3 = 5;
        }
        an2Var2.g = k(i3, g2);
        return an2Var2.a();
    }

    public static j99 f(List list) {
        int b;
        if (list.isEmpty()) {
            no5 no5Var = po5.b;
            return j99.e;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            bn2 bn2Var = (bn2) list.get(i4);
            boolean z = bn2Var.f;
            lo5 lo5Var = bn2Var.e;
            if (z && bn2Var.a()) {
                int i5 = 0;
                while (true) {
                    if (i5 < lo5Var.b && (b = lo5Var.b(i5)) != 6) {
                        if (i2 == -1 && b == 2) {
                            i2 = i4;
                            break;
                        } else if (i3 == -1 && b == 3) {
                            i3 = i4;
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
        }
        mo5 p = po5.p();
        if (i2 != -1) {
            p.c(((bn2) list.get(i2)).d(2));
        }
        if (i3 != -1) {
            p.c(((bn2) list.get(i3)).d(3));
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            bn2 bn2Var2 = (bn2) list.get(i6);
            if (bn2Var2.f && bn2Var2.a() && i6 != i2 && i6 != i3 && bn2Var2.e.a(6)) {
                p.c(bn2Var2.d(6));
            }
        }
        return p.f();
    }

    public static Object g(int i2, Bundle bundle) {
        if (!bundle.containsKey("androidx.media3.session.CUSTOM_COMMAND_PARAMETER")) {
            return null;
        }
        switch (i2) {
            case 1:
                return Long.valueOf(bundle.getLong("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 2:
                return Integer.valueOf(bundle.getInt("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 3:
                return Boolean.valueOf(bundle.getBoolean("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 4:
                return Float.valueOf(bundle.getFloat("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 5:
                Bundle bundle2 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle2.getClass();
                return s29.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return ft6.a(10, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return nt6.b(10, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return c2c.b(bundle5);
            default:
                return null;
        }
    }

    public static int h(int i2) {
        if (i2 != 1) {
            if (i2 == 5) {
                return 1;
            }
            if (i2 != 10) {
                if (i2 != 19) {
                    if (i2 != 24) {
                        if (i2 != 29) {
                            if (i2 == 31) {
                                return 6;
                            }
                            switch (i2) {
                                case 13:
                                    return 4;
                                case 14:
                                    return 3;
                                case 15:
                                    return 2;
                                default:
                                    return 0;
                            }
                        }
                        return 8;
                    }
                    return 4;
                }
                return 7;
            }
            return 2;
        }
        return 3;
    }

    public static boolean i(String str) {
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_") && !str.startsWith("androidx.media3.session.SESSION_COMMAND_")) {
            return false;
        }
        return true;
    }

    public static Object k(int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i2) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                yve.e("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                yve.e("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case 3:
                yve.e("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                yve.e("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                yve.e("Parameter has incorrect type.", obj instanceof s29);
                return obj;
            case 6:
                yve.e("Parameter has incorrect type.", obj instanceof ft6);
                return obj;
            case 7:
                yve.e("Parameter has incorrect type.", obj instanceof nt6);
                return obj;
            case 8:
                yve.e("Parameter has incorrect type.", obj instanceof c2c);
                return obj;
            default:
                return null;
        }
    }

    public final boolean a() {
        Object obj = this.g;
        h9a h9aVar = this.a;
        if (h9aVar != null) {
            int i2 = h9aVar.a;
            if (i2 == 0) {
                return true;
            }
            if (i2 == 40010 && obj != null) {
                return true;
            }
            return false;
        }
        int i3 = this.b;
        if (i3 != 19) {
            if (i3 != 24) {
                if (i3 != 29 && i3 != 31) {
                    switch (i3) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final bn2 d(int i2) {
        String str;
        Bundle bundle = this.d;
        h9a h9aVar = this.a;
        if (h9aVar != null && h9aVar.a == 0) {
            lo5 lo5Var = new lo5(new int[]{i2}, 1);
            if (this.e.equals(lo5Var)) {
                return this;
            }
            return new bn2(this.a, this.b, this.c, new Bundle(bundle), this.f, lo5Var, this.g);
        }
        Bundle bundle2 = Bundle.EMPTY;
        if (this.g != null) {
            bundle2 = new Bundle();
            l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", 10, bundle2);
        }
        if (h9aVar != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + h9aVar.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new bn2(new h9a(str, bundle2), -1, this.c, bundle, this.f, new lo5(new int[]{i2}, 1), null);
    }

    public final void e(dg8 dg8Var) {
        if (this.f) {
            Object obj = this.g;
            int i2 = this.b;
            if (i2 != 19) {
                if (i2 != 24) {
                    if (i2 != 29) {
                        if (i2 != 31) {
                            switch (i2) {
                                case 1:
                                    if (obj != null) {
                                        dg8Var.V(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        dg8Var.V(!dg8Var.s());
                                        return;
                                    }
                                case 2:
                                    dg8Var.a();
                                    return;
                                case 3:
                                    dg8Var.stop();
                                    return;
                                case 4:
                                    dg8Var.E();
                                    return;
                                case 5:
                                    if (obj != null) {
                                        dg8Var.g(((Long) obj).longValue());
                                        return;
                                    }
                                    return;
                                case 6:
                                    dg8Var.C();
                                    return;
                                case 7:
                                    dg8Var.S();
                                    return;
                                case 8:
                                    dg8Var.d0();
                                    return;
                                case 9:
                                    dg8Var.J0();
                                    return;
                                case 10:
                                    if (obj != null) {
                                        dg8Var.W(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                case 11:
                                    dg8Var.L0();
                                    return;
                                case 12:
                                    dg8Var.K0();
                                    return;
                                case 13:
                                    if (obj != null) {
                                        dg8Var.d(((Float) obj).floatValue());
                                        return;
                                    }
                                    return;
                                case 14:
                                    if (obj != null) {
                                        dg8Var.v(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        dg8Var.v(!dg8Var.F0());
                                        return;
                                    }
                                case 15:
                                    if (obj != null) {
                                        dg8Var.n0(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if (obj != null) {
                            dg8Var.q0((ft6) obj);
                        }
                    } else if (obj != null) {
                        dg8Var.M((c2c) obj);
                    }
                } else if (obj != null) {
                    dg8Var.R(((Float) obj).floatValue());
                } else if (dg8Var.D() == 0.0f) {
                    dg8Var.a0();
                } else {
                    dg8Var.C0();
                }
            } else if (obj != null) {
                dg8Var.j0((nt6) obj);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bn2) {
                bn2 bn2Var = (bn2) obj;
                if (Objects.equals(this.a, bn2Var.a) && this.b == bn2Var.b && this.c == bn2Var.c && this.f == bn2Var.f && this.e.equals(bn2Var.e) && Objects.equals(this.g, bn2Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), 0, Integer.valueOf(this.c), "", Boolean.valueOf(this.f), null, this.e, this.g);
    }

    public final Bundle j(int i2) {
        Bundle bundle = new Bundle();
        h9a h9aVar = this.a;
        if (h9aVar != null) {
            bundle.putBundle(h, h9aVar.a());
        }
        int i3 = this.b;
        if (i3 != -1) {
            bundle.putInt(i, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            bundle.putInt(j, i4);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(k, bundle2);
        }
        boolean z = this.f;
        if (!z) {
            bundle.putBoolean(l, z);
        }
        lo5 lo5Var = this.e;
        if (lo5Var.b != 1 || lo5Var.b(0) != 6) {
            bundle.putIntArray(m, Arrays.copyOfRange(lo5Var.a, 0, lo5Var.b));
        }
        if (this.g != null) {
            l(n, i2, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i2, Bundle bundle) {
        int h2;
        h9a h9aVar = this.a;
        if (h9aVar != null) {
            if (h9aVar.a == 40010) {
                h2 = 5;
            } else {
                h2 = 0;
            }
        } else {
            h2 = h(this.b);
        }
        Object obj = this.g;
        switch (h2) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                return;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                return;
            case 5:
                bundle.putBundle(str, ((s29) obj).c());
                return;
            case 6:
                bundle.putBundle(str, ((ft6) obj).b(i2, false));
                return;
            case 7:
                bundle.putBundle(str, ((nt6) obj).c(i2));
                return;
            case 8:
                bundle.putBundle(str, ((c2c) obj).c());
                return;
            default:
                return;
        }
    }
}
