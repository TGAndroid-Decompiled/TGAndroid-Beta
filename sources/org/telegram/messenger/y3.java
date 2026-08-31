package org.telegram.messenger;

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
public abstract class y3 {
    public static float A(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 / f11) * f12);
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

    public static Bundle e(int i10, String str, String str2, boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z4);
        bundle.putInt(str2, i10);
        return bundle;
    }

    public static LinearLayout f(Context context, int i10) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i10);
        return linearLayout;
    }

    public static TextView g(Context context, int i10, float f10) {
        TextView textView = new TextView(context);
        textView.setTextSize(i10, f10);
        return textView;
    }

    public static String h(int i10, StringBuilder sb) {
        sb.append(LocaleController.getString(i10));
        return sb.toString();
    }

    public static String i(long j10, long j11, StringBuilder sb) {
        sb.append(NotificationsController.getSharedPrefKey(j10, j11));
        return sb.toString();
    }

    public static String j(StringBuilder sb, String str, se.b bVar) {
        sb.append(str);
        return bVar.b(sb.toString());
    }

    public static FloatBuffer k(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
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

    public static org.telegram.ui.ActionBar.h3 o(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, g6Var, z4, z10);
        h3Var.fixNavigationBar();
        return h3Var;
    }

    public static qh.d p(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        qh.d dVar = new qh.d(context, g6Var, z4);
        dVar.setRoundRadius(i10);
        return dVar;
    }

    public static void q(int i10, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
    }

    public static void r(int i10, TextView textView, int i11) {
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(i11);
    }

    public static void s(int i10, org.telegram.ui.Components.qc qcVar, org.telegram.ui.ActionBar.g6 g6Var) {
        qcVar.t(LocaleController.getString(i10), g6Var).j();
    }

    public static void t(TextView textView, int i10, int i11, float f10) {
        textView.setTextColor(i10);
        textView.setTextSize(i11, f10);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void u(EGL10 egl10, StringBuilder sb) {
        sb.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb.toString());
    }

    public static boolean v(String str, long j10, SharedPreferences sharedPreferences, boolean z4) {
        return sharedPreferences.getBoolean(str + j10, z4);
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

    public static int z(float f10, int i10, int i11) {
        return i11 - (i10 - AndroidUtilities.dp(f10));
    }
}
