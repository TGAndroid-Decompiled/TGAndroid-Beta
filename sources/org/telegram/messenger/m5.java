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
public abstract class m5 {
    public static float A(float f7, float f10, float f11, float f12) {
        return (f7 - f10) * f11 * f12;
    }

    public static int B(float f7, int i10, int i11) {
        return i11 - (i10 - i0.L(f7));
    }

    public static int C(float f7, int i10, int i11) {
        return i0.L(f7) + i10 + i11;
    }

    public static int D(float f7, int i10, int i11) {
        return (i0.L(f7) * i10) + i11;
    }

    public static float a(float f7, float f10, float f11, float f12) {
        return ((f7 + f10) / f11) + f12;
    }

    public static int b(float f7, int i10, int i11) {
        return Math.max(i11, i0.L(f7) + i10);
    }

    public static int c(String str, String str2, SharedPreferences sharedPreferences, int i10) {
        return sharedPreferences.getInt(str + str2, i10);
    }

    public static SharedPreferences.Editor d(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        return editor.remove(str).remove(str2).remove(str3).remove(str4);
    }

    public static LinearLayout e(Activity activity, int i10) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static LinearLayout f(Context context, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static TextView g(Context context, int i10, float f7) {
        TextView textView = new TextView(context);
        textView.setTextSize(i10, f7);
        return textView;
    }

    public static String h(StringBuilder sb2, String str, af.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static ArrayList i(a0.h hVar, long j10) {
        ArrayList arrayList = new ArrayList();
        hVar.k(arrayList, j10);
        return arrayList;
    }

    public static ArrayList j(jj jjVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(jjVar);
        return arrayList;
    }

    public static org.telegram.ui.ActionBar.z2 k(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(i10, context, p6Var, z10);
        z2Var.O();
        return z2Var;
    }

    public static void l(TextView textView, int i10, String str, int i11) {
        textView.setGravity(i10);
        textView.setText(cd.L0(i11, str));
    }

    public static void m(TextView textView, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, float f7) {
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setTextSize(i11, f7);
        textView.setTypeface(i0.o());
    }

    public static void n(String str, int i10, org.telegram.ui.Components.cc ccVar, int i11, int i12) {
        ccVar.Q(i11, i12, cd.L0(i10, str)).j();
    }

    public static void o(String str, int i10, org.telegram.ui.Components.cc ccVar, org.telegram.ui.ActionBar.p6 p6Var) {
        ccVar.t(cd.L0(i10, str), p6Var).j();
    }

    public static void p(String str, String str2, int i10, Object[] objArr, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append((CharSequence) i0.W2(cd.a0(str, str2, i10, objArr)));
    }

    public static void q(String str, String str2, int i10, Object[] objArr, TextView textView) {
        textView.setText(i0.W2(cd.a0(str, str2, i10, objArr)));
    }

    public static void r(StringBuilder sb2, char c10, char c11, int i10) {
        sb2.append(c10);
        sb2.append(c11);
        sb2.append(cd.L0(i10, null));
    }

    public static void s(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
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

    public static float y(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 - f10) / f11);
    }

    public static int z(float f7, int i10, int i11) {
        return (i10 - i0.L(f7)) - i11;
    }
}
