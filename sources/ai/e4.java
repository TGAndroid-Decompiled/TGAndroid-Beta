package ai;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e00;
import org.telegram.ui.hf1;
import org.telegram.ui.hl0;
import org.telegram.ui.kl0;
import org.telegram.ui.n00;
import org.telegram.ui.qs;
import org.telegram.ui.to;
import org.telegram.ui.vm0;
import org.telegram.ui.vo;
public final class e4 implements hf1, Continuation, org.telegram.ui.ActionBar.a2, yl0, qs, androidx.car.app.utils.a {
    public final int f1195a;
    public final boolean f1196b;
    public final Object f1197c;
    public final Object d;

    public e4(Object obj, Object obj2, boolean z10, int i10) {
        this.f1195a = i10;
        this.f1197c = obj;
        this.d = obj2;
        this.f1196b = z10;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.f1197c).lambda$onCarHardwareResult$0(this.f1196b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override
    public void b(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f1197c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.C1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.f20423id);
        if (userFull != null && userFull.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.voip.d2.m(user, this.f1196b, z10, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override
    public void d(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.e4.d(float, float, int, android.view.View):void");
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f1195a) {
            case 2:
                ig.a0 a0Var = (ig.a0) this.f1197c;
                boolean z11 = this.f1196b;
                h61 h61Var = (h61) this.d;
                if (!z11) {
                    arrayList = a0Var.f12817k;
                } else {
                    arrayList = a0Var.f12816j;
                }
                arrayList.remove(Long.valueOf(h61Var.f26793x));
                a0Var.e.run();
                return;
            case 3:
                org.telegram.ui.m9 m9Var = (org.telegram.ui.m9) this.f1197c;
                boolean z12 = this.f1196b;
                boolean[] zArr = (boolean[]) this.d;
                if (z12) {
                    boolean z13 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z13;
                    m9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new ei.o3(3, m9Var, z13));
                    m9Var.G.clear();
                    m9Var.H = false;
                    m9Var.J = true;
                    m9Var.F.setVisibility(8);
                    m9Var.d.W2.N(true);
                } else {
                    m9Var.getMessagesController().deleteMessages(new ArrayList<>(m9Var.L), null, null, 0L, 0, zArr[0], 0);
                }
                m9Var.k0(false);
                return;
            case 4:
                ((org.telegram.ui.ha) this.f1197c).f37562a.j0((TLRPC.TL_username) this.d, this.f1196b, true);
                return;
            case 5:
                boolean z14 = this.f1196b;
                vo voVar = ((to) this.f1197c).f41712a;
                voVar.x1((TLRPC.TL_username) this.d, z14, true);
                voVar.Y2.V();
                return;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f1197c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f1196b;
                TLRPC.UserFull userFull = n2Var.getMessagesController().getUserFull(user.f20423id);
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.d2.m(user, z15, z10, n2Var.getParentActivity(), userFull, n2Var.getAccountInstance());
                return;
            case 7:
            case 9:
            default:
                vm0 vm0Var = (vm0) this.f1197c;
                boolean z16 = this.f1196b;
                vm0Var.x1();
                vm0Var.i1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new hl0(vm0Var, 4), new kl0(vm0Var, 6), z16);
                return;
            case 8:
                n00 n00Var = (n00) this.f1197c;
                e00 e00Var = (e00) this.d;
                boolean z17 = this.f1196b;
                int i11 = e00Var.f36477j;
                if (i11 > 0) {
                    n00Var.f39384y &= ~i11;
                } else {
                    if (z17) {
                        arrayList2 = n00Var.F;
                    } else {
                        arrayList2 = n00Var.G;
                    }
                    arrayList2.remove(Long.valueOf(e00Var.h));
                }
                n00Var.j0();
                n00Var.w0();
                n00Var.i0(true);
                if (z17) {
                    n00Var.n0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z18 = this.f1196b;
                String str2 = (String) this.f1197c;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.d;
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str3 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    if (z18) {
                        str = "recover@telegram.org";
                    } else {
                        str = "login@stel.com";
                    }
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                    if (z18) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str2);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str2 + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str3 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str2);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str2 + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str3 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    n2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var2.getParentActivity());
                    alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20605a.T = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    n2Var2.showDialog(alertDialog$Builder.f20605a);
                    return;
                }
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((l7) this.f1197c).J2(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d, this.f1196b);
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f1197c;
        Intent intent = (Intent) this.d;
        if (u6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return com.google.firebase.messaging.i.a(context, intent, this.f1196b).continueWith(new a3.b(2), new ci.i1(7));
        }
        return task;
    }

    public e4(Object obj, boolean z10, Object obj2, int i10) {
        this.f1195a = i10;
        this.f1197c = obj;
        this.f1196b = z10;
        this.d = obj2;
    }

    public e4(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        this.f1195a = 10;
        this.f1196b = z10;
        this.f1197c = str;
        this.d = n2Var;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
