package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class l0 {
    public static int A(float f7, int i10, int i11) {
        return i11 - (i10 - AndroidUtilities.dp(f7));
    }

    public static int B(float f7, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f7)) - i11;
    }

    public static int C(float f7, int i10, int i11) {
        return AndroidUtilities.dp(f7) + i10 + i11;
    }

    public static int D(float f7, int i10, int i11) {
        return (AndroidUtilities.dp(f7) * i10) + i11;
    }

    public static float a(float f7, float f10, float f11, float f12) {
        return ((f7 + f10) / f11) + f12;
    }

    public static int b(float f7, int i10, int i11) {
        return Math.max(i11, i10 - AndroidUtilities.dp(f7));
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

    public static TextView f(Context context, int i10, float f7) {
        TextView textView = new TextView(context);
        textView.setTextSize(i10, f7);
        return textView;
    }

    public static String g(int i10, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        return sb2.toString();
    }

    public static String h(long j3, long j10, StringBuilder sb2) {
        sb2.append(NotificationsController.getSharedPrefKey(j3, j10));
        return sb2.toString();
    }

    public static ArrayList i(long j3, a0.i iVar) {
        ArrayList arrayList = new ArrayList();
        iVar.k(arrayList, j3);
        return arrayList;
    }

    public static ArrayList j(MessageObject messageObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageObject);
        return arrayList;
    }

    public static TLRPC.EncryptedChat k(MessagesController messagesController, long j3) {
        return messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j3)));
    }

    public static void l(int i10, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void m(int i10, StringBuilder sb2) {
        sb2.append(i10);
        FileLog.d(sb2.toString());
    }

    public static void n(int i10, AlertDialog$Builder alertDialog$Builder, org.telegram.ui.ActionBar.a2 a2Var) {
        alertDialog$Builder.k(LocaleController.getString(i10), a2Var);
        alertDialog$Builder.o();
    }

    public static void o(int i10, org.telegram.ui.Components.xc xcVar, int i11, int i12) {
        xcVar.Q(i11, i12, LocaleController.getString(i10)).j();
    }

    public static void p(TextView textView, int i10, int i11, float f7) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f7);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void q(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }

    public static void r(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
    }

    public static void s(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
    }

    public static void t(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
        sQLiteDatabase.executeFast(str4).stepThis().dispose();
    }

    public static boolean u(String str, long j3, SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.getBoolean(str + j3, z10);
    }

    public static boolean v(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }

    public static boolean w(TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument) {
        if (tL_inputMediaUploadedDocument != null) {
            return true;
        }
        return false;
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 - f10) / f11);
    }

    public static int y(float f7, int i10, int i11) {
        return Math.max(i11, AndroidUtilities.dp(f7) + i10);
    }

    public static float z(float f7, float f10, float f11, float f12) {
        return (f7 - f10) * f11 * f12;
    }
}
