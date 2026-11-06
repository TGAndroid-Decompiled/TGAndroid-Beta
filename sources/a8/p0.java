package a8;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public abstract class p0 {
    public static void A(Object obj) {
        if (obj == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static boolean B(String str) {
        return new File(str).exists();
    }

    public static int C(int i7, int i10, int i11) {
        return com.google.android.gms.internal.vision.r0.T(i7) + i10 + i11;
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int E(int i7, int i10, int i11) {
        return (com.google.android.gms.internal.vision.r0.y(i7) * i10) + i11;
    }

    public static c4.b a(c4.m mVar, byte[] bArr, int i7) {
        h9.f0 p10 = h9.i0.p();
        mVar.z(bArr, 0, i7, c4.l.f5290c, new a1.c(p10, 22));
        return new c4.b(p10.f());
    }

    public static final void b(int i7, View view, ViewGroup container) {
        kotlin.jvm.internal.j.e(view, "view");
        kotlin.jvm.internal.j.e(container, "container");
        if (androidx.fragment.app.i0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int c10 = p1.g.c(i7);
        ViewGroup viewGroup = null;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        if (androidx.fragment.app.i0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (androidx.fragment.app.i0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (androidx.fragment.app.i0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup == null) {
                if (androidx.fragment.app.i0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent2;
        }
        if (viewGroup != null) {
            if (androidx.fragment.app.i0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static int c(int i7) {
        if (i7 != 90) {
            if (i7 != 91) {
                if (i7 != 93) {
                    if (i7 != 94) {
                        switch (i7) {
                            case 0:
                                return 1;
                            case 1:
                                return 2;
                            case 2:
                                return 3;
                            case 3:
                                return 4;
                            case 4:
                                return 5;
                            case 5:
                                return 6;
                            case 6:
                                return 7;
                            case 7:
                                return 8;
                            case 8:
                                return 9;
                            case 9:
                                return 10;
                            case 10:
                                return 11;
                            case 11:
                                return 12;
                            case 12:
                                return 13;
                            case 13:
                                return 14;
                            case 14:
                                return 15;
                            case 15:
                                return 16;
                            case 16:
                                return 17;
                            case 17:
                                return 18;
                            case 18:
                                return 19;
                            case 19:
                                return 20;
                            case 20:
                                return 21;
                            case 21:
                                return 22;
                            case 22:
                                return 23;
                            case 23:
                                return 24;
                            case 24:
                                return 25;
                            case 25:
                                return 26;
                            case 26:
                                return 27;
                            case 27:
                                return 28;
                            case 28:
                                return 29;
                            case 29:
                                return 30;
                            case 30:
                                return 31;
                            case 31:
                                return 32;
                            case 32:
                                return 33;
                            case 33:
                                return 34;
                            case 34:
                                return 35;
                            case 35:
                                return 36;
                            case 36:
                                return 37;
                            case 37:
                                return 38;
                            case 38:
                                return 39;
                            case 39:
                                return 40;
                            case 40:
                                return 41;
                            case 41:
                                return 42;
                            case 42:
                                return 43;
                            case 43:
                                return 44;
                            case 44:
                                return 45;
                            case 45:
                                return 46;
                            case 46:
                                return 47;
                            case 47:
                                return 48;
                            case 48:
                                return 49;
                            case 49:
                                return 50;
                            case 50:
                                return 51;
                            case 51:
                                return 52;
                            case 52:
                                return 53;
                            case 53:
                                return 54;
                            case 54:
                                return 55;
                            case 55:
                                return 56;
                            case 56:
                                return 57;
                            case 57:
                                return 58;
                            case 58:
                                return 59;
                            case 59:
                                return 60;
                            case 60:
                                return 61;
                            case 61:
                                return 62;
                            case 62:
                                return 63;
                            case 63:
                                return 64;
                            case 64:
                                return 65;
                            case 65:
                                return 66;
                            case 66:
                                return 67;
                            case 67:
                                return 68;
                            case 68:
                                return 69;
                            case 69:
                                return 70;
                            case 70:
                                return 71;
                            case 71:
                                return 72;
                            case 72:
                                return 73;
                            case 73:
                                return 74;
                            case 74:
                                return 75;
                            case 75:
                                return 76;
                            case 76:
                                return 77;
                            case 77:
                                return 78;
                            case 78:
                                return 79;
                            case 79:
                                return 80;
                            default:
                                switch (i7) {
                                    case 96:
                                        return 87;
                                    case 97:
                                        return 88;
                                    case 98:
                                        return 89;
                                    case 99:
                                        return 90;
                                    case 100:
                                        return 91;
                                    case 101:
                                        return 92;
                                    case 102:
                                        return 83;
                                    case 103:
                                        return 86;
                                    case 104:
                                        return 93;
                                    case 105:
                                        return 94;
                                    case 106:
                                        return 95;
                                    case 107:
                                        return 96;
                                    case 108:
                                        return 97;
                                    case 109:
                                        return 98;
                                    case 110:
                                        return 99;
                                    case 111:
                                        return 100;
                                    case 112:
                                        return 101;
                                    case 113:
                                        return 102;
                                    case 114:
                                        return 103;
                                    case 115:
                                        return 104;
                                    case 116:
                                        return 105;
                                    case 117:
                                        return 106;
                                    case 118:
                                        return 107;
                                    case 119:
                                        return 108;
                                    case 120:
                                        return 109;
                                    case 121:
                                        return 110;
                                    case 122:
                                        return 111;
                                    case 123:
                                        return 112;
                                    case 124:
                                        return 113;
                                    case 125:
                                        return 114;
                                    case 126:
                                        return 117;
                                    case 127:
                                        return 119;
                                    case 128:
                                        return 120;
                                    case 129:
                                        return 121;
                                    case 130:
                                        return 122;
                                    case 131:
                                        return 123;
                                    case 132:
                                        return 124;
                                    case 133:
                                        return 125;
                                    case 134:
                                        return 126;
                                    case 135:
                                        return 127;
                                    case 136:
                                        return 128;
                                    case 137:
                                        return 129;
                                    case 138:
                                        return 130;
                                    case 139:
                                        return 131;
                                    case 140:
                                        return 132;
                                    case 141:
                                        return 133;
                                    case 142:
                                        return 134;
                                    case 143:
                                        return 135;
                                    case 144:
                                        return 136;
                                    case 145:
                                        return 115;
                                    case 146:
                                        return 116;
                                    case 147:
                                        return 118;
                                    case 148:
                                        return 137;
                                    case 149:
                                        return 138;
                                    default:
                                        return 0;
                                }
                        }
                    }
                    return 85;
                }
                return 84;
            }
            return 82;
        }
        return 81;
    }

    public static int d(int i7) {
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                i10 = 3;
                if (i7 != 3) {
                    if (i7 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static int e(int i7) {
        switch (i7) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case 60:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return 102;
            case 84:
                return 93;
            case 85:
                return 94;
            case 86:
                return 103;
            case 87:
                return 96;
            case 88:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return 106;
            case 96:
                return 107;
            case 97:
                return 108;
            case 98:
                return 109;
            case 99:
                return 110;
            case 100:
                return 111;
            case 101:
                return 112;
            case 102:
                return 113;
            case 103:
                return 114;
            case 104:
                return 115;
            case 105:
                return 116;
            case 106:
                return 117;
            case 107:
                return 118;
            case 108:
                return 119;
            case 109:
                return 120;
            case 110:
                return 121;
            case 111:
                return 122;
            case 112:
                return 123;
            case 113:
                return 124;
            case 114:
                return 125;
            case 115:
                return 145;
            case 116:
                return 146;
            case 117:
                return 126;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case 121:
                return 129;
            case 122:
                return 130;
            case 123:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case 126:
                return 134;
            case 127:
                return 135;
            case 128:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            default:
                throw null;
        }
    }

    public static float f(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) / f12) + f13;
    }

    public static int g(int i7, int i10, int i11) {
        return com.google.android.gms.internal.cast.v4.o(i7) + i10 + i11;
    }

    public static int h(int i7, int i10, int i11, int i12) {
        return com.google.android.gms.internal.vision.r0.T(i7) + i10 + i11 + i12;
    }

    public static j0 i(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new j0(i7);
    }

    public static Bundle j(long j3, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j3);
        return bundle;
    }

    public static Bundle k(String str, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z9);
        return bundle;
    }

    public static c8.s l(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new c8.s(i7);
    }

    public static String m(int i7, int i10, String str, String str2) {
        return str + i7 + str2 + i10;
    }

    public static String n(int i7, String str, StringBuilder sb2) {
        sb2.append(i7);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(long j3, String str) {
        return str + j3;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String r(StringBuilder sb2, long j3, String str) {
        sb2.append(j3);
        sb2.append(str);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder t(long j3, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j3);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static UnsupportedOperationException v(Parcel parcel) {
        i8.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap w(Class cls, j0 j0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, j0Var);
        return hashMap;
    }

    public static HashMap x(Class cls, c8.s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static na.c y(int i7, m4.d0 d0Var) {
        Map unmodifiableMap;
        c8.s sVar = new c8.s(i7);
        if (((HashMap) d0Var.f19609b) == null) {
            d0Var.f19609b = new HashMap();
        }
        ((HashMap) d0Var.f19609b).put(c8.w.class, sVar);
        String str = (String) d0Var.f19608a;
        if (((HashMap) d0Var.f19609b) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) d0Var.f19609b));
        }
        return new na.c(str, unmodifiableMap);
    }

    public static void z(int i7, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i7);
    }
}
