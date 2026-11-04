package o4;

import android.os.Bundle;
import android.text.TextUtils;
import b8.zb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
public final class d {
    public static final String h;
    public static final String f20604i;
    public static final String f20605j;
    public static final String f20606k;
    public static final String f20607l;
    public static final String f20608m;
    public static final String f20609n;
    public final n1 f20610a;
    public final int f20611b;
    public final int f20612c;
    public final Bundle d;
    public final k9.a f20613e;
    public final boolean f20614f;
    public final Object f20615g;

    static {
        String str = g2.n0.f11873a;
        h = Integer.toString(0, 36);
        f20604i = Integer.toString(1, 36);
        f20605j = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f20606k = Integer.toString(4, 36);
        f20607l = Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        f20608m = Integer.toString(8, 36);
        f20609n = Integer.toString(9, 36);
    }

    public d(n1 n1Var, int i3, int i10, Bundle bundle, boolean z10, k9.a aVar, Object obj) {
        this.f20610a = n1Var;
        this.f20611b = i3;
        this.f20612c = i10;
        this.d = new Bundle(bundle);
        this.f20614f = z10;
        this.f20613e = aVar;
        this.f20615g = obj;
    }

    public static Object a(int i3, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i3) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                zb.e("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                zb.e("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case 3:
                zb.e("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                zb.e("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                zb.e("Parameter has incorrect type.", obj instanceof d2.f1);
                return obj;
            case 6:
                zb.e("Parameter has incorrect type.", obj instanceof d2.n0);
                return obj;
            case 7:
                zb.e("Parameter has incorrect type.", obj instanceof d2.q0);
                return obj;
            case 8:
                zb.e("Parameter has incorrect type.", obj instanceof d2.s1);
                return obj;
            default:
                return null;
        }
    }

    public static boolean c(int i3, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).f20613e.b(0) == i3) {
                return true;
            }
        }
        return false;
    }

    public static d d(n1 n1Var) {
        int i3;
        String str = n1Var.f20764b;
        Bundle bundle = n1Var.f20765c;
        boolean z10 = true;
        int i10 = 0;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object h7 = h(i(parseInt), bundle);
            c cVar = new c();
            if (((n1) cVar.d) != null) {
                z10 = false;
            }
            zb.e("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", z10);
            cVar.f20593a = parseInt;
            cVar.f20598g = a(i(parseInt), h7);
            return cVar.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        if (parseInt2 == 40010) {
            i3 = 5;
        } else {
            i3 = 0;
        }
        Object h10 = h(i3, bundle);
        c cVar2 = new c();
        n1 n1Var2 = new n1(parseInt2);
        if (cVar2.f20593a != -1) {
            z10 = false;
        }
        zb.e("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z10);
        cVar2.d = n1Var2;
        if (n1Var2.f20763a == 40010) {
            i10 = 5;
        }
        cVar2.f20598g = a(i10, h10);
        return cVar2.a();
    }

    public static g9.s1 g(List list) {
        int b10;
        if (list.isEmpty()) {
            g9.g0 g0Var = g9.i0.f12083b;
            return g9.s1.f12146e;
        }
        int i3 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = (d) list.get(i11);
            boolean z10 = dVar.f20614f;
            k9.a aVar = dVar.f20613e;
            if (z10 && dVar.b()) {
                int i12 = 0;
                while (true) {
                    if (i12 < aVar.f16907b && (b10 = aVar.b(i12)) != 6) {
                        if (i3 == -1 && b10 == 2) {
                            i3 = i11;
                            break;
                        } else if (i10 == -1 && b10 == 3) {
                            i10 = i11;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        g9.f0 p10 = g9.i0.p();
        if (i3 != -1) {
            p10.c(((d) list.get(i3)).e(2));
        }
        if (i10 != -1) {
            p10.c(((d) list.get(i10)).e(3));
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            d dVar2 = (d) list.get(i13);
            if (dVar2.f20614f && dVar2.b() && i13 != i3 && i13 != i10 && dVar2.f20613e.a(6)) {
                p10.c(dVar2.e(6));
            }
        }
        return p10.f();
    }

    public static Object h(int i3, Bundle bundle) {
        if (!bundle.containsKey("androidx.media3.session.CUSTOM_COMMAND_PARAMETER")) {
            return null;
        }
        switch (i3) {
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
                return d2.f1.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return d2.n0.a(9, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return d2.q0.b(9, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return d2.s1.b(bundle5);
            default:
                return null;
        }
    }

    public static int i(int i3) {
        if (i3 != 1) {
            if (i3 == 5) {
                return 1;
            }
            if (i3 != 10) {
                if (i3 != 19) {
                    if (i3 != 24) {
                        if (i3 != 29) {
                            if (i3 == 31) {
                                return 6;
                            }
                            switch (i3) {
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
        Object obj = this.f20615g;
        n1 n1Var = this.f20610a;
        if (n1Var != null) {
            int i3 = n1Var.f20763a;
            if (i3 == 0) {
                return true;
            }
            if (i3 == 40010 && obj != null) {
                return true;
            }
            return false;
        }
        int i10 = this.f20611b;
        if (i10 != 19) {
            if (i10 != 24) {
                if (i10 != 29 && i10 != 31) {
                    switch (i10) {
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

    public final d e(int i3) {
        String str;
        n1 n1Var = this.f20610a;
        if (n1Var != null && n1Var.f20763a == 0) {
            k9.a aVar = new k9.a(new int[]{i3});
            if (this.f20613e.equals(aVar)) {
                return this;
            }
            return new d(this.f20610a, this.f20611b, this.f20612c, new Bundle(this.d), this.f20614f, aVar, this.f20615g);
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.f20615g != null) {
            bundle = new Bundle();
            l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", 9, bundle);
        }
        if (n1Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + n1Var.f20763a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.f20611b;
        }
        return new d(new n1(str, bundle), -1, this.f20612c, this.d, this.f20614f, new k9.a(new int[]{i3}), null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Objects.equals(this.f20610a, dVar.f20610a) && this.f20611b == dVar.f20611b && this.f20612c == dVar.f20612c && TextUtils.equals("", "") && this.f20614f == dVar.f20614f && this.f20613e.equals(dVar.f20613e) && Objects.equals(this.f20615g, dVar.f20615g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(d2.e1 e1Var) {
        if (this.f20614f) {
            Object obj = this.f20615g;
            int i3 = this.f20611b;
            if (i3 != 19) {
                if (i3 != 24) {
                    if (i3 != 29) {
                        if (i3 != 31) {
                            switch (i3) {
                                case 1:
                                    if (obj != null) {
                                        e1Var.V(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        e1Var.V(!e1Var.u());
                                        return;
                                    }
                                case 2:
                                    e1Var.a();
                                    return;
                                case 3:
                                    e1Var.stop();
                                    return;
                                case 4:
                                    e1Var.F();
                                    return;
                                case 5:
                                    if (obj != null) {
                                        e1Var.f(((Long) obj).longValue());
                                        return;
                                    }
                                    return;
                                case 6:
                                    e1Var.D();
                                    return;
                                case 7:
                                    e1Var.S();
                                    return;
                                case 8:
                                    e1Var.d0();
                                    return;
                                case 9:
                                    e1Var.I0();
                                    return;
                                case 10:
                                    if (obj != null) {
                                        e1Var.W(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                case 11:
                                    e1Var.K0();
                                    return;
                                case 12:
                                    e1Var.J0();
                                    return;
                                case 13:
                                    if (obj != null) {
                                        e1Var.b(((Float) obj).floatValue());
                                        return;
                                    }
                                    return;
                                case 14:
                                    if (obj != null) {
                                        e1Var.x(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        e1Var.x(!e1Var.E0());
                                        return;
                                    }
                                case 15:
                                    if (obj != null) {
                                        e1Var.k(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if (obj != null) {
                            e1Var.v0((d2.n0) obj);
                        }
                    } else if (obj != null) {
                        e1Var.g0((d2.s1) obj);
                    }
                } else if (obj != null) {
                    e1Var.R(((Float) obj).floatValue());
                } else if (e1Var.E() == 0.0f) {
                    e1Var.a0();
                } else {
                    e1Var.C0();
                }
            } else if (obj != null) {
                e1Var.l((d2.q0) obj);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f20610a, Integer.valueOf(this.f20611b), 0, Integer.valueOf(this.f20612c), "", Boolean.valueOf(this.f20614f), null, this.f20613e, this.f20615g);
    }

    public final Bundle k(int i3) {
        Bundle bundle = new Bundle();
        n1 n1Var = this.f20610a;
        if (n1Var != null) {
            bundle.putBundle(h, n1Var.a());
        }
        int i10 = this.f20611b;
        if (i10 != -1) {
            bundle.putInt(f20604i, i10);
        }
        int i11 = this.f20612c;
        if (i11 != 0) {
            bundle.putInt(f20605j, i11);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f20606k, bundle2);
        }
        boolean z10 = this.f20614f;
        if (!z10) {
            bundle.putBoolean(f20607l, z10);
        }
        k9.a aVar = this.f20613e;
        if (aVar.f16907b != 1 || aVar.b(0) != 6) {
            bundle.putIntArray(f20608m, Arrays.copyOfRange(aVar.f16906a, 0, aVar.f16907b));
        }
        if (this.f20615g != null) {
            l(f20609n, i3, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i3, Bundle bundle) {
        int i10;
        n1 n1Var = this.f20610a;
        if (n1Var != null) {
            if (n1Var.f20763a == 40010) {
                i10 = 5;
            } else {
                i10 = 0;
            }
        } else {
            i10 = i(this.f20611b);
        }
        Object obj = this.f20615g;
        switch (i10) {
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
                bundle.putBundle(str, ((d2.f1) obj).c());
                return;
            case 6:
                bundle.putBundle(str, ((d2.n0) obj).c(i3, false));
                return;
            case 7:
                bundle.putBundle(str, ((d2.q0) obj).c(i3));
                return;
            case 8:
                bundle.putBundle(str, ((d2.s1) obj).c());
                return;
            default:
                return;
        }
    }
}
