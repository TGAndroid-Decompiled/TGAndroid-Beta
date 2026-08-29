package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.tgnet.TLRPC;
public abstract class x3 {
    public static float A(float f9, float f10, float f11, float f12) {
        return f12 - ((f9 / f10) * f11);
    }

    public static int B(float f9, int i10, int i11) {
        return (i10 - AndroidUtilities.dp(f9)) - i11;
    }

    public static int C(float f9, int i10, int i11) {
        return AndroidUtilities.dp(f9) + i10 + i11;
    }

    public static int D(float f9, int i10, int i11) {
        return (AndroidUtilities.dp(f9) * i10) + i11;
    }

    public static float a(float f9, float f10, float f11, float f12) {
        return f12 - ((f9 - f10) / f11);
    }

    public static int b(float f9, int i10, int i11) {
        return Math.max(i11, AndroidUtilities.dp(f9) + i10);
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

    public static TextView h(Context context, int i10, float f9) {
        TextView textView = new TextView(context);
        textView.setTextSize(i10, f9);
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

    public static String k(StringBuilder sb2, String str, qe.b bVar) {
        sb2.append(str);
        return bVar.b(sb2.toString());
    }

    public static FloatBuffer l(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static ArrayList m(long j10, a0.h hVar) {
        ArrayList arrayList = new ArrayList();
        hVar.k(arrayList, j10);
        return arrayList;
    }

    public static ArrayList n(MessageObject messageObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageObject);
        return arrayList;
    }

    public static nh.d o(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        nh.d dVar = new nh.d(context, c6Var, z10);
        dVar.setRoundRadius(i10);
        return dVar;
    }

    public static TLRPC.EncryptedChat p(MessagesController messagesController, long j10) {
        return messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j10)));
    }

    public static org.telegram.ui.ActionBar.f3 q(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, c6Var, z10, z11);
        f3Var.fixNavigationBar();
        return f3Var;
    }

    public static void r(int i10, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void s(int i10, org.telegram.ui.Components.tc tcVar, org.telegram.ui.ActionBar.c6 c6Var) {
        tcVar.t(LocaleController.getString(i10), c6Var).j();
    }

    public static void t(TextView textView, int i10, int i11, float f9) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f9);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void u(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb2.toString());
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

    public static float y(float f9, float f10, float f11, float f12) {
        return (f9 - f10) * f11 * f12;
    }

    public static int z(float f9, int i10, int i11) {
        return i11 - (i10 - AndroidUtilities.dp(f9));
    }
}
