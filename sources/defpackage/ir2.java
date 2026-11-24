package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteDatabase;
public abstract class ir2 {
    public static void A(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
    }

    public static void B(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
        sQLiteDatabase.executeFast(str4).stepThis().dispose();
    }

    public static void C(sq3 sq3Var, sq3 sq3Var2) {
        if (sq3Var != sq3Var2) {
            if (sq3Var2 != null) {
                sq3Var2.d(null);
            }
            if (sq3Var != null) {
                sq3Var.c(null);
            }
        }
    }

    public static boolean a(int i, int i2, int i3) {
        switch (i) {
            case 1:
                if (((i2 + i3) & 1) == 0) {
                    return true;
                }
                return false;
            case 2:
                if ((i2 & 1) == 0) {
                    return true;
                }
                return false;
            case 3:
                if (i3 % 3 == 0) {
                    return true;
                }
                return false;
            case 4:
                if ((i2 + i3) % 3 == 0) {
                    return true;
                }
                return false;
            case 5:
                if ((((i3 / 3) + (i2 / 2)) & 1) == 0) {
                    return true;
                }
                return false;
            case 6:
                if ((i2 * i3) % 6 == 0) {
                    return true;
                }
                return false;
            case 7:
                if ((i2 * i3) % 6 < 3) {
                    return true;
                }
                return false;
            default:
                if (((((i2 * i3) % 3) + i2 + i3) & 1) == 0) {
                    return true;
                }
                return false;
        }
    }

    public static jr2 b() {
        ?? cr2Var = new cr2();
        cr2Var.f = Integer.MIN_VALUE;
        cr2Var.g = Integer.MAX_VALUE;
        return cr2Var;
    }

    public static mr2 c() {
        ?? cr2Var = new cr2();
        cr2Var.e = Long.MIN_VALUE;
        cr2Var.f = Long.MAX_VALUE;
        return cr2Var;
    }

    public static or2 d() {
        ?? cr2Var = new cr2();
        cr2Var.d = Collections.EMPTY_SET;
        return cr2Var;
    }

    public static ur2 e() {
        return new cr2();
    }

    public static or2 f() {
        return new cr2();
    }

    public static or2 g() {
        ?? cr2Var = new cr2();
        cr2Var.d = Collections.EMPTY_SET;
        return cr2Var;
    }

    public static byte h(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    if (i == 4) {
                        return (byte) 4;
                    }
                    throw null;
                }
            }
        }
        return b;
    }

    public static float i(float f, float f2, float f3, float f4) {
        return (f * f2) + f3 + f4;
    }

    public static int j(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int k(int i, int i2, ArrayList arrayList) {
        return i2 - (arrayList.size() + i);
    }

    public static Bundle l(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        return bundle;
    }

    public static LinearLayout m(Activity activity, int i) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    public static String n(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String o(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static StringBuilder p(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void q() {
    }

    public static void r(float f, int i, int i2, TextView textView, String str) {
        textView.setTextSize(i, f);
        textView.setText(k96.M0(i2, str));
    }

    public static void s(oj3 oj3Var, int i, ArrayList arrayList) {
        arrayList.add(new mj3(oj3Var, i));
    }

    public static void t(TextView textView, int i, float f) {
        textView.setTextSize(i, f);
        textView.setTypeface(gl.o());
    }

    public static void u(Object obj) {
        if (obj == null) {
            return;
        }
        fyb.g();
    }

    public static void v(String str, int i, u21 u21Var, int i2, int i3) {
        u21Var.Q(i2, i3, k96.M0(i, str)).j();
    }

    public static void w(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void x(StringBuilder sb, String str, String str2) {
        sb.append(str);
        Log.d(str2, sb.toString());
    }

    public static void y(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }

    public static void z(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
    }
}
