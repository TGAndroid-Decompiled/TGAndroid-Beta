package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public abstract class k5 {
    public static float A(float f10, float f11, float f12, float f13) {
        return (f10 - f11) * f12 * f13;
    }

    public static int B(float f10, int i3, int i10) {
        return i10 - (i3 - g0.L(f10));
    }

    public static int C(float f10, int i3, int i10) {
        return g0.L(f10) + i3 + i10;
    }

    public static int D(float f10, int i3, int i10) {
        return (g0.L(f10) * i3) + i10;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 + f11) / f12) + f13;
    }

    public static int b(float f10, int i3, int i10) {
        return Math.max(i10, g0.L(f10) + i3);
    }

    public static int c(String str, String str2, SharedPreferences sharedPreferences, int i3) {
        return sharedPreferences.getInt(str + str2, i3);
    }

    public static SharedPreferences.Editor d(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        return editor.remove(str).remove(str2).remove(str3).remove(str4);
    }

    public static LinearLayout e(Activity activity, int i3) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i3);
        return linearLayout;
    }

    public static LinearLayout f(Context context, int i3) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i3);
        return linearLayout;
    }

    public static TextView g(Context context, int i3, float f10) {
        TextView textView = new TextView(context);
        textView.setTextSize(i3, f10);
        return textView;
    }

    public static gi.d h(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        gi.d dVar = new gi.d(context, e6Var, z10);
        dVar.setRoundRadius(i3);
        return dVar;
    }

    public static String i(StringBuilder sb2, String str, mf.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static ArrayList j(a0.h hVar, long j10) {
        ArrayList arrayList = new ArrayList();
        hVar.k(arrayList, j10);
        return arrayList;
    }

    public static ArrayList k(zi ziVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ziVar);
        return arrayList;
    }

    public static org.telegram.ui.ActionBar.t2 l(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(i3, context, e6Var, z10);
        t2Var.N();
        return t2Var;
    }

    public static void m(TextView textView, int i3, String str, int i10) {
        textView.setGravity(i3);
        textView.setText(bd.M0(i10, str));
    }

    public static void n(TextView textView, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, float f10) {
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setTextSize(i10, f10);
        textView.setTypeface(g0.o());
    }

    public static void o(String str, int i3, org.telegram.ui.Components.fc fcVar, int i10, int i11) {
        fcVar.Q(i10, i11, bd.M0(i3, str)).j();
    }

    public static void p(String str, int i3, org.telegram.ui.Components.fc fcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        fcVar.t(bd.M0(i3, str), e6Var).j();
    }

    public static void q(String str, String str2, int i3, Object[] objArr, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append((CharSequence) g0.X2(bd.a0(str, str2, i3, objArr)));
    }

    public static void r(String str, String str2, int i3, Object[] objArr, TextView textView) {
        textView.setText(g0.X2(bd.a0(str, str2, i3, objArr)));
    }

    public static void s(StringBuilder sb2, char c2, char c10, int i3) {
        sb2.append(c2);
        sb2.append(c10);
        sb2.append(bd.M0(i3, null));
    }

    public static void t(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
    }

    public static void u(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
    }

    public static void v(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
        sQLiteDatabase.executeFast(str4).stepThis().dispose();
    }

    public static boolean w(String str, long j10, SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.getBoolean(str + j10, z10);
    }

    public static boolean x(TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument) {
        if (tL_inputMediaUploadedDocument != null) {
            return true;
        }
        return false;
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 - f11) / f12);
    }

    public static int z(float f10, int i3, int i10) {
        return (i3 - g0.L(f10)) - i10;
    }
}
