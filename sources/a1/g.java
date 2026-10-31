package a1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.j0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import m1.j;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
public abstract class g {
    public static float A(float f7, float f10, float f11, float f12) {
        return ((f7 * f10) / f11) + f12;
    }

    public static int B(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.max(i10, i11), i12));
    }

    public static String C(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int D(int i10, int i11, int i12, int i13) {
        return Math.max(i13, Math.min(Math.min(i10, i11), i12));
    }

    public static final void a(int i10, View view, ViewGroup container) {
        i.e(view, "view");
        i.e(container, "container");
        if (j0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int c10 = j.c(i10);
        ViewGroup viewGroup = null;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        if (j0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (j0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (j0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup == null) {
                if (j0.K(2)) {
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
            if (j0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static boolean b(int i10, int i11, int i12) {
        switch (i10) {
            case 1:
                if (((i11 + i12) & 1) == 0) {
                    return true;
                }
                return false;
            case 2:
                if ((i11 & 1) == 0) {
                    return true;
                }
                return false;
            case 3:
                if (i12 % 3 == 0) {
                    return true;
                }
                return false;
            case 4:
                if ((i11 + i12) % 3 == 0) {
                    return true;
                }
                return false;
            case 5:
                if ((((i12 / 3) + (i11 / 2)) & 1) == 0) {
                    return true;
                }
                return false;
            case 6:
                if ((i11 * i12) % 6 == 0) {
                    return true;
                }
                return false;
            case 7:
                if ((i11 * i12) % 6 < 3) {
                    return true;
                }
                return false;
            default:
                if (((((i11 * i12) % 3) + i11 + i12) & 1) == 0) {
                    return true;
                }
                return false;
        }
    }

    public static float c(float f7, float f10, float f11, float f12) {
        return ((f7 / f10) * f11) + f12;
    }

    public static int d(int i10, int i11, int i12) {
        return androidx.datastore.preferences.protobuf.j.y(i10) + i11 + i12;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return androidx.datastore.preferences.protobuf.j.z(i10) + i11 + i12 + i13;
    }

    public static int f(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static Bundle g(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        return bundle;
    }

    public static ClassCastException h(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String i(int i10, int i11, String str) {
        return i10 + str + i11;
    }

    public static String j(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String k(int i10, String str) {
        return i10 + str;
    }

    public static String l(long j10, String str) {
        return str + j10;
    }

    public static String m(String str, int i10, StringBuilder sb2) {
        sb2.append(cd.L0(i10, str));
        return sb2.toString();
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder s(long j10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder t(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder v(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void w(int i10, String str, String str2) {
        e2.a.l(str2, str + i10);
    }

    public static void x(int i10, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i10);
    }

    public static void y(Object obj) {
        if (obj == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static void z(String str, StringBuilder sb2) {
        sb2.append(str);
        f8.b(sb2.toString());
    }
}
