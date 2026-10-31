package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import v7.t6;
public final class e {
    public static final String h;
    public static final String f12722i;
    public static final String f12723j;
    public static final String f12724k;
    public static final String f12725l;
    public static final String f12726m;
    public static final String f12727n;
    public final p1 f12728a;
    public final int f12729b;
    public final int f12730c;
    public final Bundle d;
    public final i9.a e;
    public final boolean f12731f;
    public final Object f12732g;

    static {
        String str = e2.l0.f6165a;
        h = Integer.toString(0, 36);
        f12722i = Integer.toString(1, 36);
        f12723j = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f12724k = Integer.toString(4, 36);
        f12725l = Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        f12726m = Integer.toString(8, 36);
        f12727n = Integer.toString(9, 36);
    }

    public e(p1 p1Var, int i10, int i11, Bundle bundle, boolean z10, i9.a aVar, Object obj) {
        this.f12728a = p1Var;
        this.f12729b = i10;
        this.f12730c = i11;
        this.d = new Bundle(bundle);
        this.f12731f = z10;
        this.e = aVar;
        this.f12732g = obj;
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
                t6.e("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                t6.e("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case 3:
                t6.e("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                t6.e("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                t6.e("Parameter has incorrect type.", obj instanceof b2.g1);
                return obj;
            case 6:
                t6.e("Parameter has incorrect type.", obj instanceof b2.p0);
                return obj;
            case 7:
                t6.e("Parameter has incorrect type.", obj instanceof b2.s0);
                return obj;
            case 8:
                t6.e("Parameter has incorrect type.", obj instanceof b2.u1);
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
        String str = p1Var.f12897b;
        Bundle bundle = p1Var.f12898c;
        boolean z10 = true;
        int i11 = 0;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object h10 = h(i(parseInt), bundle);
            d dVar = new d();
            if (((p1) dVar.d) != null) {
                z10 = false;
            }
            t6.e("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", z10);
            dVar.f12713a = parseInt;
            dVar.f12717g = a(i(parseInt), h10);
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
        if (dVar2.f12713a != -1) {
            z10 = false;
        }
        t6.e("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z10);
        dVar2.d = p1Var2;
        if (p1Var2.f12896a == 40010) {
            i11 = 5;
        }
        dVar2.f12717g = a(i11, h11);
        return dVar2.a();
    }

    public static x1 g(List list) {
        int b10;
        if (list.isEmpty()) {
            e9.l0 l0Var = e9.n0.f6390b;
            return x1.e;
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            e eVar = (e) list.get(i12);
            boolean z10 = eVar.f12731f;
            i9.a aVar = eVar.e;
            if (z10 && eVar.b()) {
                int i13 = 0;
                while (true) {
                    if (i13 < aVar.f8234b && (b10 = aVar.b(i13)) != 6) {
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
            if (eVar2.f12731f && eVar2.b() && i14 != i10 && i14 != i11 && eVar2.e.a(6)) {
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
                return b2.g1.a(bundle2);
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
        Object obj = this.f12732g;
        p1 p1Var = this.f12728a;
        if (p1Var != null) {
            int i10 = p1Var.f12896a;
            if (i10 == 0) {
                return true;
            }
            if (i10 == 40010 && obj != null) {
                return true;
            }
            return false;
        }
        int i11 = this.f12729b;
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
        p1 p1Var = this.f12728a;
        if (p1Var != null && p1Var.f12896a == 0) {
            i9.a aVar = new i9.a(new int[]{i10});
            if (this.e.equals(aVar)) {
                return this;
            }
            return new e(this.f12728a, this.f12729b, this.f12730c, new Bundle(this.d), this.f12731f, aVar, this.f12732g);
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.f12732g != null) {
            bundle = new Bundle();
            l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", 9, bundle);
        }
        if (p1Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + p1Var.f12896a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.f12729b;
        }
        return new e(new p1(str, bundle), -1, this.f12730c, this.d, this.f12731f, new i9.a(new int[]{i10}), null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (Objects.equals(this.f12728a, eVar.f12728a) && this.f12729b == eVar.f12729b && this.f12730c == eVar.f12730c && TextUtils.equals("", "") && this.f12731f == eVar.f12731f && this.e.equals(eVar.e) && Objects.equals(this.f12732g, eVar.f12732g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(b2.f1 f1Var) {
        if (this.f12731f) {
            Object obj = this.f12732g;
            int i10 = this.f12729b;
            if (i10 != 19) {
                if (i10 != 24) {
                    if (i10 != 29) {
                        if (i10 != 31) {
                            switch (i10) {
                                case 1:
                                    if (obj != null) {
                                        f1Var.W(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        f1Var.W(!f1Var.t());
                                        return;
                                    }
                                case 2:
                                    f1Var.a();
                                    return;
                                case 3:
                                    f1Var.stop();
                                    return;
                                case 4:
                                    f1Var.G();
                                    return;
                                case 5:
                                    if (obj != null) {
                                        f1Var.f(((Long) obj).longValue());
                                        return;
                                    }
                                    return;
                                case 6:
                                    f1Var.E();
                                    return;
                                case 7:
                                    f1Var.T();
                                    return;
                                case 8:
                                    f1Var.e0();
                                    return;
                                case 9:
                                    f1Var.H0();
                                    return;
                                case 10:
                                    if (obj != null) {
                                        f1Var.X(((Integer) obj).intValue());
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
                                        f1Var.b(((Float) obj).floatValue());
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
                                        f1Var.k(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if (obj != null) {
                            f1Var.s0((b2.p0) obj);
                        }
                    } else if (obj != null) {
                        f1Var.p((b2.u1) obj);
                    }
                } else if (obj != null) {
                    f1Var.S(((Float) obj).floatValue());
                } else if (f1Var.F() == 0.0f) {
                    f1Var.b0();
                } else {
                    f1Var.B0();
                }
            } else if (obj != null) {
                f1Var.B((b2.s0) obj);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f12728a, Integer.valueOf(this.f12729b), 0, Integer.valueOf(this.f12730c), "", Boolean.valueOf(this.f12731f), null, this.e, this.f12732g);
    }

    public final Bundle k(int i10) {
        Bundle bundle = new Bundle();
        p1 p1Var = this.f12728a;
        if (p1Var != null) {
            bundle.putBundle(h, p1Var.a());
        }
        int i11 = this.f12729b;
        if (i11 != -1) {
            bundle.putInt(f12722i, i11);
        }
        int i12 = this.f12730c;
        if (i12 != 0) {
            bundle.putInt(f12723j, i12);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f12724k, bundle2);
        }
        boolean z10 = this.f12731f;
        if (!z10) {
            bundle.putBoolean(f12725l, z10);
        }
        i9.a aVar = this.e;
        if (aVar.f8234b != 1 || aVar.b(0) != 6) {
            bundle.putIntArray(f12726m, Arrays.copyOfRange(aVar.f8233a, 0, aVar.f8234b));
        }
        if (this.f12732g != null) {
            l(f12727n, i10, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i10, Bundle bundle) {
        int i11;
        p1 p1Var = this.f12728a;
        if (p1Var != null) {
            if (p1Var.f12896a == 40010) {
                i11 = 5;
            } else {
                i11 = 0;
            }
        } else {
            i11 = i(this.f12729b);
        }
        Object obj = this.f12732g;
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
