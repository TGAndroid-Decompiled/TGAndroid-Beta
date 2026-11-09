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

    public static int B(float f10, int i7, int i10) {
        return i10 - (i7 - g0.L(f10));
    }

    public static int C(float f10, int i7, int i10) {
        return g0.L(f10) + i7 + i10;
    }

    public static int D(float f10, int i7, int i10) {
        return (g0.L(f10) * i7) + i10;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 + f11) / f12) + f13;
    }

    public static int b(float f10, int i7, int i10) {
        return Math.max(i10, g0.L(f10) + i7);
    }

    public static int c(String str, String str2, SharedPreferences sharedPreferences, int i7) {
        return sharedPreferences.getInt(str + str2, i7);
    }

    public static SharedPreferences.Editor d(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        return editor.remove(str).remove(str2).remove(str3).remove(str4);
    }

    public static LinearLayout e(Activity activity, int i7) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i7);
        return linearLayout;
    }

    public static LinearLayout f(Context context, int i7) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i7);
        return linearLayout;
    }

    public static TextView g(Context context, int i7, float f10) {
        TextView textView = new TextView(context);
        textView.setTextSize(i7, f10);
        return textView;
    }

    public static fi.d h(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        fi.d dVar = new fi.d(context, g6Var, z9);
        dVar.setRoundRadius(i7);
        return dVar;
    }

    public static String i(StringBuilder sb2, String str, pf.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static ArrayList j(a0.h hVar, long j3) {
        ArrayList arrayList = new ArrayList();
        hVar.k(arrayList, j3);
        return arrayList;
    }

    public static ArrayList k(ij ijVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ijVar);
        return arrayList;
    }

    public static org.telegram.ui.ActionBar.v2 l(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(i7, context, g6Var, z9);
        v2Var.N();
        return v2Var;
    }

    public static void m(TextView textView, int i7, String str, int i10) {
        textView.setGravity(i7);
        textView.setText(id.M0(i10, str));
    }

    public static void n(TextView textView, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, float f10) {
        org.telegram.ui.ActionBar.s6.U(textView, i7, g6Var);
        textView.setTextSize(i10, f10);
        textView.setTypeface(g0.o());
    }

    public static void o(String str, int i7, org.telegram.ui.Components.hc hcVar, int i10, int i11) {
        hcVar.Q(i10, i11, id.M0(i7, str)).j();
    }

    public static void p(String str, int i7, org.telegram.ui.Components.hc hcVar, org.telegram.ui.ActionBar.g6 g6Var) {
        hcVar.t(id.M0(i7, str), g6Var).j();
    }

    public static void q(String str, String str2, int i7, Object[] objArr, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append((CharSequence) g0.X2(id.a0(str, str2, i7, objArr)));
    }

    public static void r(String str, String str2, int i7, Object[] objArr, TextView textView) {
        textView.setText(g0.X2(id.a0(str, str2, i7, objArr)));
    }

    public static void s(StringBuilder sb2, char c10, char c11, int i7) {
        sb2.append(c10);
        sb2.append(c11);
        sb2.append(id.M0(i7, null));
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

    public static boolean w(String str, long j3, SharedPreferences sharedPreferences, boolean z9) {
        return sharedPreferences.getBoolean(str + j3, z9);
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

    public static int z(float f10, int i7, int i10) {
        return (i7 - g0.L(f10)) - i10;
    }
}
