package b5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import j4.i1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import lh.n3;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ca;
import org.telegram.ui.h00;
import org.telegram.ui.hl0;
import org.telegram.ui.j9;
import org.telegram.ui.kb0;
import org.telegram.ui.kl0;
import org.telegram.ui.q00;
import org.telegram.ui.uo;
import org.telegram.ui.us;
import org.telegram.ui.wo;
import org.telegram.ui.xm0;
import p8.l0;

public final class d implements n, Continuation, a2, qk0, us, androidx.car.app.utils.c {

    public final int f1936a;

    public final boolean f1937b;

    public final Object f1938c;
    public final Object d;

    public d(Object obj, Object obj2, boolean z10, int i10) {
        this.f1936a = i10;
        this.f1938c = obj;
        this.d = obj2;
        this.f1937b = z10;
    }

    @Override
    public void a(TLRPC.User user) {
        LaunchActivity launchActivity = (LaunchActivity) this.f1938c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.f35496x1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.K).getUserFull(user.f22527id);
        e2.n(user, this.f1937b, userFull != null && userFull.video_calls_available, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override
    public Object b() {
        return ((CarResultStub) this.f1938c).lambda$onCarHardwareResult$0(this.f1937b, (w.b) this.d);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        ChatAttachAlertPhotoLayout.K((ChatAttachAlertPhotoLayout) this.f1938c, this.f1937b, (c6) this.d, view, i10);
    }

    @Override
    public l0 d(int i10, i1 i1Var, int[] iArr) {
        q qVar = (q) this.f1938c;
        i iVar = (i) this.d;
        qVar.getClass();
        e eVar = new e(qVar);
        p8.x xVar = p8.z.f45604b;
        p8.l.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i1Var.f12583a) {
            int i13 = i10;
            i1 i1Var2 = i1Var;
            f fVar = new f(i13, i1Var2, i12, iVar, iArr[i12], this.f1937b, eVar);
            int i14 = i11 + 1;
            if (objArrCopyOf.length < i14) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, p8.w.d(objArrCopyOf.length, i14));
            }
            objArrCopyOf[i11] = fVar;
            i12++;
            i11 = i14;
            i10 = i13;
            i1Var = i1Var2;
        }
        return p8.z.s(i11, objArrCopyOf);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f1936a) {
            case 2:
                j9 j9Var = (j9) this.f1938c;
                boolean z10 = this.f1937b;
                boolean[] zArr = (boolean[]) this.d;
                if (z10) {
                    boolean z11 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z11;
                    j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new n3(3, j9Var, z11));
                    j9Var.C.clear();
                    j9Var.D = false;
                    j9Var.F = true;
                    j9Var.B.setVisibility(8);
                    j9Var.d.U2.N(true);
                } else {
                    j9Var.getMessagesController().deleteMessages(new ArrayList<>(j9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                j9Var.k0(false);
                break;
            case 3:
                ((ca) this.f1938c).f37034a.j0((TLRPC.TL_username) this.d, this.f1937b, true);
                break;
            case 4:
                uo uoVar = (uo) this.f1938c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z12 = this.f1937b;
                wo woVar = uoVar.f43265a;
                woVar.w1(tL_username, z12, true);
                woVar.W2.V();
                break;
            case 5:
                n2 n2Var = (n2) this.f1938c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z13 = this.f1937b;
                TLRPC.UserFull userFull = n2Var.getMessagesController().getUserFull(user.f22527id);
                e2.n(user, z13, userFull != null && userFull.video_calls_available, n2Var.getParentActivity(), userFull, n2Var.getAccountInstance());
                break;
            case 6:
            case 8:
            default:
                qf.x xVar = (qf.x) this.f1938c;
                (!this.f1937b ? xVar.f46489k : xVar.f46488j).remove(Long.valueOf(((n41) this.d).f30855x));
                xVar.f46484e.run();
                break;
            case 7:
                q00 q00Var = (q00) this.f1938c;
                h00 h00Var = (h00) this.d;
                boolean z14 = this.f1937b;
                int i11 = h00Var.f38648j;
                if (i11 > 0) {
                    q00Var.f41481y &= ~i11;
                } else {
                    (z14 ? q00Var.B : q00Var.C).remove(Long.valueOf(h00Var.h));
                }
                q00Var.j0();
                q00Var.w0();
                q00Var.i0(true);
                if (z14) {
                    q00Var.n0(1, false);
                }
                break;
            case 9:
                boolean z15 = this.f1937b;
                String str = (String) this.f1938c;
                n2 n2Var2 = (n2) this.d;
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{z15 ? "recover@telegram.org" : "login@stel.com"});
                    if (z15) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    n2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var2.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    n2Var2.showDialog(alertDialog$Builder.f22702a);
                    return;
                }
                break;
            case 10:
                xm0 xm0Var = (xm0) this.f1938c;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.d;
                boolean z16 = this.f1937b;
                xm0Var.y1();
                xm0Var.j1(tL_secureRequiredType, null, null, true, new hl0(xm0Var, 4), new kl0(xm0Var, 6), z16);
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public Object then(Task task) {
        return (f6.b.d() && ((Integer) task.getResult()).intValue() == 402) ? com.google.firebase.messaging.i.a((Context) this.f1938c, (Intent) this.d, this.f1937b).continueWith(new kb0(1), new a9.m(20)) : task;
    }

    public d(Object obj, boolean z10, Object obj2, int i10) {
        this.f1936a = i10;
        this.f1938c = obj;
        this.f1937b = z10;
        this.d = obj2;
    }

    public d(String str, n2 n2Var, boolean z10) {
        this.f1936a = 9;
        this.f1937b = z10;
        this.f1938c = str;
        this.d = n2Var;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
