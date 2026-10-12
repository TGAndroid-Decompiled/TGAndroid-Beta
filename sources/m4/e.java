package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import v7.u6;
public final class e {
    public static final String h;
    public static final String f15408i;
    public static final String f15409j;
    public static final String f15410k;
    public static final String f15411l;
    public static final String f15412m;
    public static final String f15413n;
    public final p1 f15414a;
    public final int f15415b;
    public final int f15416c;
    public final Bundle d;
    public final i9.a e;
    public final boolean f15417f;
    public final Object f15418g;

    static {
        String str = e2.m0.f8372a;
        h = Integer.toString(0, 36);
        f15408i = Integer.toString(1, 36);
        f15409j = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f15410k = Integer.toString(4, 36);
        f15411l = Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        f15412m = Integer.toString(8, 36);
        f15413n = Integer.toString(9, 36);
    }

    public e(p1 p1Var, int i10, int i11, Bundle bundle, boolean z10, i9.a aVar, Object obj) {
        this.f15414a = p1Var;
        this.f15415b = i10;
        this.f15416c = i11;
        this.d = new Bundle(bundle);
        this.f15417f = z10;
        this.e = aVar;
        this.f15418g = obj;
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
                u6.f("Parameter has incorrect type.", obj instanceof b2.h1);
                return obj;
            case 6:
                u6.f("Parameter has incorrect type.", obj instanceof b2.p0);
                return obj;
            case 7:
                u6.f("Parameter has incorrect type.", obj instanceof b2.s0);
                return obj;
            case 8:
                u6.f("Parameter has incorrect type.", obj instanceof b2.u1);
                return obj;
            default:
                return null;
        }
    }

    public static boolean c(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((e) list.get(i11)).e.b(0) == i10) {
                return true;
            }
        }
        return false;
    }

    public static e d(p1 p1Var) {
        int i10;
        String str = p1Var.f15569b;
        Bundle bundle = p1Var.f15570c;
        boolean z10 = true;
        int i11 = 0;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object h10 = h(i(parseInt), bundle);
            d dVar = new d();
            if (((p1) dVar.d) != null) {
                z10 = false;
            }
            u6.f("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", z10);
            dVar.f15400a = parseInt;
            dVar.f15404g = a(i(parseInt), h10);
            return dVar.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        if (parseInt2 == 40010) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        Object h11 = h(i10, bundle);
        d dVar2 = new d();
        p1 p1Var2 = new p1(parseInt2);
        if (dVar2.f15400a != -1) {
            z10 = false;
        }
        u6.f("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z10);
        dVar2.d = p1Var2;
        if (p1Var2.f15568a == 40010) {
            i11 = 5;
        }
        dVar2.f15404g = a(i11, h11);
        return dVar2.a();
    }

    public static x1 g(List list) {
        int b10;
        if (list.isEmpty()) {
            e9.l0 l0Var = e9.n0.f8592b;
            return x1.e;
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            e eVar = (e) list.get(i12);
            boolean z10 = eVar.f15417f;
            i9.a aVar = eVar.e;
            if (z10 && eVar.b()) {
                int i13 = 0;
                while (true) {
                    if (i13 < aVar.f11347b && (b10 = aVar.b(i13)) != 6) {
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
            t10.c(((e) list.get(i10)).e(2));
        }
        if (i11 != -1) {
            t10.c(((e) list.get(i11)).e(3));
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            e eVar2 = (e) list.get(i14);
            if (eVar2.f15417f && eVar2.b() && i14 != i10 && i14 != i11 && eVar2.e.a(6)) {
                t10.c(eVar2.e(6));
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
                return b2.h1.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return b2.p0.a(9, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return b2.s0.b(9, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return b2.u1.b(bundle5);
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
        Object obj = this.f15418g;
        p1 p1Var = this.f15414a;
        if (p1Var != null) {
            int i10 = p1Var.f15568a;
            if (i10 == 0) {
                return true;
            }
            if (i10 == 40010 && obj != null) {
                return true;
            }
            return false;
        }
        int i11 = this.f15415b;
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

    public final e e(int i10) {
        String str;
        p1 p1Var = this.f15414a;
        if (p1Var != null && p1Var.f15568a == 0) {
            i9.a aVar = new i9.a(new int[]{i10});
            if (this.e.equals(aVar)) {
                return this;
            }
            return new e(this.f15414a, this.f15415b, this.f15416c, new Bundle(this.d), this.f15417f, aVar, this.f15418g);
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.f15418g != null) {
            bundle = new Bundle();
            l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", 9, bundle);
        }
        if (p1Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + p1Var.f15568a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.f15415b;
        }
        return new e(new p1(str, bundle), -1, this.f15416c, this.d, this.f15417f, new i9.a(new int[]{i10}), null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (Objects.equals(this.f15414a, eVar.f15414a) && this.f15415b == eVar.f15415b && this.f15416c == eVar.f15416c && TextUtils.equals("", "") && this.f15417f == eVar.f15417f && this.e.equals(eVar.e) && Objects.equals(this.f15418g, eVar.f15418g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(b2.g1 g1Var) {
        if (this.f15417f) {
            Object obj = this.f15418g;
            int i10 = this.f15415b;
            if (i10 != 19) {
                if (i10 != 24) {
                    if (i10 != 29) {
                        if (i10 != 31) {
                            switch (i10) {
                                case 1:
                                    if (obj != null) {
                                        g1Var.X(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        g1Var.X(!g1Var.t());
                                        return;
                                    }
                                case 2:
                                    g1Var.b();
                                    return;
                                case 3:
                                    g1Var.stop();
                                    return;
                                case 4:
                                    g1Var.G();
                                    return;
                                case 5:
                                    if (obj != null) {
                                        g1Var.g(((Long) obj).longValue());
                                        return;
                                    }
                                    return;
                                case 6:
                                    g1Var.E();
                                    return;
                                case 7:
                                    g1Var.V();
                                    return;
                                case 8:
                                    g1Var.f0();
                                    return;
                                case 9:
                                    g1Var.H0();
                                    return;
                                case 10:
                                    if (obj != null) {
                                        g1Var.Y(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                case 11:
                                    g1Var.J0();
                                    return;
                                case 12:
                                    g1Var.I0();
                                    return;
                                case 13:
                                    if (obj != null) {
                                        g1Var.a(((Float) obj).floatValue());
                                        return;
                                    }
                                    return;
                                case 14:
                                    if (obj != null) {
                                        g1Var.w(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        g1Var.w(!g1Var.D0());
                                        return;
                                    }
                                case 15:
                                    if (obj != null) {
                                        g1Var.j(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if (obj != null) {
                            g1Var.r0((b2.p0) obj);
                        }
                    } else if (obj != null) {
                        g1Var.p((b2.u1) obj);
                    }
                } else if (obj != null) {
                    g1Var.U(((Float) obj).floatValue());
                } else if (g1Var.F() == 0.0f) {
                    g1Var.c0();
                } else {
                    g1Var.B0();
                }
            } else if (obj != null) {
                g1Var.B((b2.s0) obj);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f15414a, Integer.valueOf(this.f15415b), 0, Integer.valueOf(this.f15416c), "", Boolean.valueOf(this.f15417f), null, this.e, this.f15418g);
    }

    public final Bundle k(int i10) {
        Bundle bundle = new Bundle();
        p1 p1Var = this.f15414a;
        if (p1Var != null) {
            bundle.putBundle(h, p1Var.a());
        }
        int i11 = this.f15415b;
        if (i11 != -1) {
            bundle.putInt(f15408i, i11);
        }
        int i12 = this.f15416c;
        if (i12 != 0) {
            bundle.putInt(f15409j, i12);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f15410k, bundle2);
        }
        boolean z10 = this.f15417f;
        if (!z10) {
            bundle.putBoolean(f15411l, z10);
        }
        i9.a aVar = this.e;
        if (aVar.f11347b != 1 || aVar.b(0) != 6) {
            bundle.putIntArray(f15412m, Arrays.copyOfRange(aVar.f11346a, 0, aVar.f11347b));
        }
        if (this.f15418g != null) {
            l(f15413n, i10, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i10, Bundle bundle) {
        int i11;
        p1 p1Var = this.f15414a;
        if (p1Var != null) {
            if (p1Var.f15568a == 40010) {
                i11 = 5;
            } else {
                i11 = 0;
            }
        } else {
            i11 = i(this.f15415b);
        }
        Object obj = this.f15418g;
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
                bundle.putBundle(str, ((b2.h1) obj).c());
                return;
            case 6:
                bundle.putBundle(str, ((b2.p0) obj).c(i10, false));
                return;
            case 7:
                bundle.putBundle(str, ((b2.s0) obj).c(i10));
                return;
            case 8:
                bundle.putBundle(str, ((b2.u1) obj).c());
                return;
            default:
                return;
        }
    }
}
