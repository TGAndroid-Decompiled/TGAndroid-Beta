package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;

public abstract class y1 {
    public static int A(float f10, int i10, int i11) {
        return i11 - (i10 - AndroidUtilities.dp(f10));
    }

    public static int B(float f10, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f10)) - i11;
    }

    public static int C(float f10, int i10, int i11) {
        return AndroidUtilities.dp(f10) + i10 + i11;
    }

    public static int D(float f10, int i10, int i11) {
        return (AndroidUtilities.dp(f10) * i10) + i11;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 - f11) / f12);
    }

    public static int b(float f10, int i10, int i11) {
        return Math.max(i11, AndroidUtilities.dp(f10) + i10);
    }

    public static int c(String str, String str2, SharedPreferences sharedPreferences, int i10) {
        return sharedPreferences.getInt(str + str2, i10);
    }

    public static SharedPreferences.Editor d(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        return editor.remove(str).remove(str2).remove(str3).remove(str4);
    }

    public static Bundle e(int i10, String str, String str2, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putInt(str2, i10);
        return bundle;
    }

    public static LinearLayout f(Activity activity, int i10) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static LinearLayout g(Context context, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static TextView h(Context context, int i10, float f10) {
        TextView textView = new TextView(context);
        textView.setTextSize(i10, f10);
        return textView;
    }

    public static String i(int i10, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        return sb2.toString();
    }

    public static String j(long j10, long j11, StringBuilder sb2) {
        sb2.append(NotificationsController.getSharedPrefKey(j10, j11));
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, oe.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static ArrayList l(long j10, a0.h hVar) {
        ArrayList arrayList = new ArrayList();
        hVar.k(arrayList, j10);
        return arrayList;
    }

    public static ArrayList m(MessageObject messageObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageObject);
        return arrayList;
    }

    public static TLRPC.EncryptedChat n(MessagesController messagesController, long j10) {
        return messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j10)));
    }

    public static org.telegram.ui.ActionBar.e3 o(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, z10, z11);
        e3Var.fixNavigationBar();
        return e3Var;
    }

    public static void p(int i10, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void q(int i10, org.telegram.ui.Components.mc mcVar, int i11, int i12) {
        mcVar.Q(i11, i12, LocaleController.getString(i10)).j();
    }

    public static void r(int i10, org.telegram.ui.Components.mc mcVar, org.telegram.ui.ActionBar.c6 c6Var) {
        mcVar.t(LocaleController.getString(i10), c6Var).j();
    }

    public static void s(TextView textView, int i10, int i11, float f10) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f10);
        textView.setTypeface(AndroidUtilities.bold());
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

    public static boolean x(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }

    public static boolean y(TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument) {
        return tL_inputMediaUploadedDocument != null;
    }

    public static float z(float f10, float f11, float f12, float f13) {
        return (f10 - f11) * f12 * f13;
    }
}
