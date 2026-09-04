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
public abstract class w1 {
    public static float A(float f7, float f10, float f11, float f12) {
        return (f7 - f10) * f11 * f12;
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
        return Math.max(i11, AndroidUtilities.dp(f7) + i10);
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

    public static TextView g(Context context, int i10, float f7) {
        TextView textView = new TextView(context);
        textView.setTextSize(i10, f7);
        return textView;
    }

    public static String h(int i10, StringBuilder sb2) {
        sb2.append(LocaleController.getString(i10));
        return sb2.toString();
    }

    public static String i(long j3, long j10, StringBuilder sb2) {
        sb2.append(NotificationsController.getSharedPrefKey(j3, j10));
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, String str, gf.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static ArrayList k(long j3, a0.i iVar) {
        ArrayList arrayList = new ArrayList();
        iVar.k(arrayList, j3);
        return arrayList;
    }

    public static ArrayList l(MessageObject messageObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageObject);
        return arrayList;
    }

    public static TLRPC.EncryptedChat m(MessagesController messagesController, long j3) {
        return messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j3)));
    }

    public static void n(int i10, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void o(int i10, org.telegram.ui.Components.yc ycVar, int i11, int i12) {
        ycVar.Q(i11, i12, LocaleController.getString(i10)).j();
    }

    public static void p(int i10, org.telegram.ui.Components.yc ycVar, org.telegram.ui.ActionBar.f6 f6Var) {
        ycVar.t(LocaleController.getString(i10), f6Var).j();
    }

    public static void q(TextView textView, int i10, int i11, float f7) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f7);
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

    public static boolean v(String str, long j3, SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.getBoolean(str + j3, z10);
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

    public static float y(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 - f10) / f11);
    }

    public static int z(float f7, int i10, int i11) {
        return i11 - (i10 - AndroidUtilities.dp(f7));
    }
}
