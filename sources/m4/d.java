package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import v7.u6;
public final class d {
    public static final String h;
    public static final String f16497i;
    public static final String f16498j;
    public static final String f16499k;
    public static final String f16500l;
    public static final String f16501m;
    public static final String f16502n;
    public final o1 f16503a;
    public final int f16504b;
    public final int f16505c;
    public final Bundle d;
    public final i9.a e;
    public final boolean f16506f;
    public final Object f16507g;

    static {
        String str = e2.m0.f8253a;
        h = Integer.toString(0, 36);
        f16497i = Integer.toString(1, 36);
        f16498j = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f16499k = Integer.toString(4, 36);
        f16500l = Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        f16501m = Integer.toString(8, 36);
        f16502n = Integer.toString(9, 36);
    }

    public d(o1 o1Var, int i10, int i11, Bundle bundle, boolean z10, i9.a aVar, Object obj) {
        this.f16503a = o1Var;
        this.f16504b = i10;
        this.f16505c = i11;
        this.d = new Bundle(bundle);
        this.f16506f = z10;
        this.e = aVar;
        this.f16507g = obj;
    }

    public static Object a(int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i10) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                u6.f("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                u6.f("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case 3:
                u6.f("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                u6.f("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                u6.f("Parameter has incorrect type.", obj instanceof b2.g1);
                return obj;
            case 6:
                u6.f("Parameter has incorrect type.", obj instanceof b2.o0);
                return obj;
            case 7:
                u6.f("Parameter has incorrect type.", obj instanceof b2.r0);
                return obj;
            case 8:
                u6.f("Parameter has incorrect type.", obj instanceof b2.t1);
                return obj;
            default:
                return null;
        }
    }

    public static boolean c(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((d) list.get(i11)).e.b(0) == i10) {
                return true;
            }
        }
        return false;
    }

    public static d d(o1 o1Var) {
        int i10;
        String str = o1Var.f16656b;
        Bundle bundle = o1Var.f16657c;
        boolean z10 = true;
        int i11 = 0;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object h10 = h(i(parseInt), bundle);
            c cVar = new c();
            if (((o1) cVar.d) != null) {
                z10 = false;
            }
            u6.f("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", z10);
            cVar.f16488a = parseInt;
            cVar.f16492g = a(i(parseInt), h10);
            return cVar.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        if (parseInt2 == 40010) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        Object h11 = h(i10, bundle);
        c cVar2 = new c();
        o1 o1Var2 = new o1(parseInt2);
        if (cVar2.f16488a != -1) {
            z10 = false;
        }
        u6.f("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z10);
        cVar2.d = o1Var2;
        if (o1Var2.f16655a == 40010) {
            i11 = 5;
        }
        cVar2.f16492g = a(i11, h11);
        return cVar2.a();
    }

    public static x1 g(List list) {
        int b10;
        if (list.isEmpty()) {
            e9.l0 l0Var = e9.n0.f8475b;
            return x1.e;
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            d dVar = (d) list.get(i12);
            boolean z10 = dVar.f16506f;
            i9.a aVar = dVar.e;
            if (z10 && dVar.b()) {
                int i13 = 0;
                while (true) {
                    if (i13 < aVar.f12736b && (b10 = aVar.b(i13)) != 6) {
                        if (i10 == -1 && b10 == 2) {
                            i10 = i12;
                            break;
                        } else if (i11 == -1 && b10 == 3) {
                            i11 = i12;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
        }
        e9.k0 t10 = e9.n0.t();
        if (i10 != -1) {
            t10.c(((d) list.get(i10)).e(2));
        }
        if (i11 != -1) {
            t10.c(((d) list.get(i11)).e(3));
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            d dVar2 = (d) list.get(i14);
            if (dVar2.f16506f && dVar2.b() && i14 != i10 && i14 != i11 && dVar2.e.a(6)) {
                t10.c(dVar2.e(6));
            }
        }
        return t10.f();
    }

    public static Object h(int i10, Bundle bundle) {
        if (!bundle.containsKey("androidx.media3.session.CUSTOM_COMMAND_PARAMETER")) {
            return null;
        }
        switch (i10) {
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
                return b2.g1.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return b2.o0.a(9, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return b2.r0.b(9, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return b2.t1.b(bundle5);
            default:
                return null;
        }
    }

    public static int i(int i10) {
        if (i10 != 1) {
            if (i10 == 5) {
                return 1;
            }
            if (i10 != 10) {
                if (i10 != 19) {
                    if (i10 != 24) {
                        if (i10 != 29) {
                            if (i10 == 31) {
                                return 6;
                            }
                            switch (i10) {
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

    public static boolean j(String str) {
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_") && !str.startsWith("androidx.media3.session.SESSION_COMMAND_")) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        Object obj = this.f16507g;
        o1 o1Var = this.f16503a;
        if (o1Var != null) {
            int i10 = o1Var.f16655a;
            if (i10 == 0) {
                return true;
            }
            if (i10 == 40010 && obj != null) {
                return true;
            }
            return false;
        }
        int i11 = this.f16504b;
        if (i11 != 19) {
            if (i11 != 24) {
                if (i11 != 29 && i11 != 31) {
                    switch (i11) {
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

    public final d e(int i10) {
        String str;
        o1 o1Var = this.f16503a;
        if (o1Var != null && o1Var.f16655a == 0) {
            i9.a aVar = new i9.a(new int[]{i10});
            if (this.e.equals(aVar)) {
                return this;
            }
            return new d(this.f16503a, this.f16504b, this.f16505c, new Bundle(this.d), this.f16506f, aVar, this.f16507g);
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.f16507g != null) {
            bundle = new Bundle();
            l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", 9, bundle);
        }
        if (o1Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + o1Var.f16655a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.f16504b;
        }
        return new d(new o1(str, bundle), -1, this.f16505c, this.d, this.f16506f, new i9.a(new int[]{i10}), null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Objects.equals(this.f16503a, dVar.f16503a) && this.f16504b == dVar.f16504b && this.f16505c == dVar.f16505c && TextUtils.equals("", "") && this.f16506f == dVar.f16506f && this.e.equals(dVar.e) && Objects.equals(this.f16507g, dVar.f16507g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(b2.f1 f1Var) {
        if (this.f16506f) {
            Object obj = this.f16507g;
            int i10 = this.f16504b;
            if (i10 != 19) {
                if (i10 != 24) {
                    if (i10 != 29) {
                        if (i10 != 31) {
                            switch (i10) {
                                case 1:
                                    if (obj != null) {
                                        f1Var.X(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        f1Var.X(!f1Var.t());
                                        return;
                                    }
                                case 2:
                                    f1Var.b();
                                    return;
                                case 3:
                                    f1Var.stop();
                                    return;
                                case 4:
                                    f1Var.G();
                                    return;
                                case 5:
                                    if (obj != null) {
                                        f1Var.g(((Long) obj).longValue());
                                        return;
                                    }
                                    return;
                                case 6:
                                    f1Var.E();
                                    return;
                                case 7:
                                    f1Var.V();
                                    return;
                                case 8:
                                    f1Var.f0();
                                    return;
                                case 9:
                                    f1Var.H0();
                                    return;
                                case 10:
                                    if (obj != null) {
                                        f1Var.Y(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                case 11:
                                    f1Var.J0();
                                    return;
                                case 12:
                                    f1Var.I0();
                                    return;
                                case 13:
                                    if (obj != null) {
                                        f1Var.a(((Float) obj).floatValue());
                                        return;
                                    }
                                    return;
                                case 14:
                                    if (obj != null) {
                                        f1Var.w(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        f1Var.w(!f1Var.D0());
                                        return;
                                    }
                                case 15:
                                    if (obj != null) {
                                        f1Var.j(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if (obj != null) {
                            f1Var.r0((b2.o0) obj);
                        }
                    } else if (obj != null) {
                        f1Var.p((b2.t1) obj);
                    }
                } else if (obj != null) {
                    f1Var.U(((Float) obj).floatValue());
                } else if (f1Var.F() == 0.0f) {
                    f1Var.c0();
                } else {
                    f1Var.B0();
                }
            } else if (obj != null) {
                f1Var.B((b2.r0) obj);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f16503a, Integer.valueOf(this.f16504b), 0, Integer.valueOf(this.f16505c), "", Boolean.valueOf(this.f16506f), null, this.e, this.f16507g);
    }

    public final Bundle k(int i10) {
        Bundle bundle = new Bundle();
        o1 o1Var = this.f16503a;
        if (o1Var != null) {
            bundle.putBundle(h, o1Var.a());
        }
        int i11 = this.f16504b;
        if (i11 != -1) {
            bundle.putInt(f16497i, i11);
        }
        int i12 = this.f16505c;
        if (i12 != 0) {
            bundle.putInt(f16498j, i12);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f16499k, bundle2);
        }
        boolean z10 = this.f16506f;
        if (!z10) {
            bundle.putBoolean(f16500l, z10);
        }
        i9.a aVar = this.e;
        if (aVar.f12736b != 1 || aVar.b(0) != 6) {
            bundle.putIntArray(f16501m, Arrays.copyOfRange(aVar.f12735a, 0, aVar.f12736b));
        }
        if (this.f16507g != null) {
            l(f16502n, i10, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i10, Bundle bundle) {
        int i11;
        o1 o1Var = this.f16503a;
        if (o1Var != null) {
            if (o1Var.f16655a == 40010) {
                i11 = 5;
            } else {
                i11 = 0;
            }
        } else {
            i11 = i(this.f16504b);
        }
        Object obj = this.f16507g;
        switch (i11) {
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
                bundle.putBundle(str, ((b2.g1) obj).c());
                return;
            case 6:
                bundle.putBundle(str, ((b2.o0) obj).c(i10, false));
                return;
            case 7:
                bundle.putBundle(str, ((b2.r0) obj).c(i10));
                return;
            case 8:
                bundle.putBundle(str, ((b2.t1) obj).c());
                return;
            default:
                return;
        }
    }
}
