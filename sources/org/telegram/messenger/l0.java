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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class l0 {
    public static int A(float f10, int i9, int i10) {
        return i10 - (i9 - AndroidUtilities.dp(f10));
    }

    public static int B(float f10, int i9, int i10) {
        return (i9 - AndroidUtilities.dp(f10)) - i10;
    }

    public static int C(float f10, int i9, int i10) {
        return AndroidUtilities.dp(f10) + i9 + i10;
    }

    public static int D(float f10, int i9, int i10) {
        return (AndroidUtilities.dp(f10) * i9) + i10;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 - f11) / f12);
    }

    public static int b(float f10, int i9, int i10) {
        return Math.max(i10, i9 - AndroidUtilities.dp(f10));
    }

    public static int c(String str, String str2, SharedPreferences sharedPreferences, int i9) {
        return sharedPreferences.getInt(str + str2, i9);
    }

    public static SharedPreferences.Editor d(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        return editor.remove(str).remove(str2).remove(str3).remove(str4);
    }

    public static Bundle e(int i9, String str, String str2, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putInt(str2, i9);
        return bundle;
    }

    public static LinearLayout f(Activity activity, int i9) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i9);
        return linearLayout;
    }

    public static TextView g(Context context, int i9, float f10) {
        TextView textView = new TextView(context);
        textView.setTextSize(i9, f10);
        return textView;
    }

    public static String h(int i9, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i9));
        return sb2.toString();
    }

    public static String i(long j10, long j11, StringBuilder sb2) {
        sb2.append(NotificationsController.getSharedPrefKey(j10, j11));
        return sb2.toString();
    }

    public static ArrayList j(long j10, a0.h hVar) {
        ArrayList arrayList = new ArrayList();
        hVar.k(arrayList, j10);
        return arrayList;
    }

    public static ArrayList k(MessageObject messageObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageObject);
        return arrayList;
    }

    public static TLRPC.EncryptedChat l(MessagesController messagesController, long j10) {
        return messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j10)));
    }

    public static void m(int i9, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(i9)));
    }

    public static void n(int i9, StringBuilder sb2) {
        sb2.append(i9);
        FileLog.d(sb2.toString());
    }

    public static void o(int i9, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.b2 b2Var) {
        alertDialog$Builder.k(LocaleController.getString(i9), b2Var);
        alertDialog$Builder.o();
    }

    public static void p(int i9, org.telegram.ui.Components.oc ocVar, int i10, int i11) {
        ocVar.Q(i10, i11, LocaleController.getString(i9)).j();
    }

    public static void q(TextView textView, int i9, int i10, float f10) {
        textView.setTextColor(i9);
        textView.setTextSize(i10, f10);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void r(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }

    public static void s(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
    }

    public static void t(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
    }

    public static void u(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
        sQLiteDatabase.executeFast(str4).stepThis().dispose();
    }

    public static boolean v(String str, long j10, SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.getBoolean(str + j10, z10);
    }

    public static boolean w(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }

    public static boolean x(TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument) {
        if (tL_inputMediaUploadedDocument != null) {
            return true;
        }
        return false;
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return (f10 - f11) * f12 * f13;
    }

    public static int z(float f10, int i9, int i10) {
        return Math.max(i10, AndroidUtilities.dp(f10) + i9);
    }
}
