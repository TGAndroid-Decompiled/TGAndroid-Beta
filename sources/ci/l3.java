package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ao;
import org.telegram.ui.ca1;
import org.telegram.ui.ez;
import org.telegram.ui.mi0;
import org.telegram.ui.pi0;
import org.telegram.ui.tr;
import org.telegram.ui.vy;
import org.telegram.ui.yj0;
import org.telegram.ui.yn;
public final class l3 implements ca1, org.telegram.ui.ActionBar.p1, gj0, tr, androidx.car.app.utils.a, Continuation {
    public final int f5437a;
    public final boolean f5438b;
    public final Object f5439c;
    public final Object d;

    public l3(Object obj, Object obj2, boolean z10, int i3) {
        this.f5437a = i3;
        this.f5439c = obj;
        this.d = obj2;
        this.f5438b = z10;
    }

    @Override
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.f5439c).lambda$onCarHardwareResult$0(this.f5438b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override
    public void b(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ci.l3.b(float, float, int, android.view.View):void");
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f5439c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.E1;
        TLRPC.UserFull b22 = hp.s1(launchActivity.P).b2(user.f27150id);
        if (b22 != null && b22.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.voip.n1.m(user, this.f5438b, z10, launchActivity, b22, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f5437a) {
            case 1:
                lg.b0 b0Var = (lg.b0) this.f5439c;
                boolean z11 = this.f5438b;
                r31 r31Var = (r31) this.d;
                if (!z11) {
                    arrayList = b0Var.f18234k;
                } else {
                    arrayList = b0Var.f18233j;
                }
                arrayList.remove(Long.valueOf(r31Var.f37638x));
                b0Var.f18229e.run();
                return;
            case 2:
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) this.f5439c;
                boolean z12 = this.f5438b;
                boolean[] zArr = (boolean[]) this.d;
                if (z12) {
                    boolean z13 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z13;
                    h9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new gi.b3(2, h9Var, z13));
                    h9Var.f45865y.clear();
                    h9Var.E = false;
                    h9Var.G = true;
                    h9Var.f45864x.setVisibility(8);
                    h9Var.f45857c.f35594g3.O(true);
                } else {
                    h9Var.getMessagesController().Z(new ArrayList(h9Var.I), null, null, 0L, 0, zArr[0], 0);
                }
                h9Var.j0(false);
                return;
            case 3:
                ((org.telegram.ui.ba) this.f5439c).f44006a.o0((TLRPC.TL_username) this.d, this.f5438b, true);
                return;
            case 4:
                boolean z14 = this.f5438b;
                ao aoVar = ((yn) this.f5439c).f52369a;
                aoVar.z1((TLRPC.TL_username) this.d, z14, true);
                aoVar.i3.b0();
                return;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f5439c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f5438b;
                TLRPC.UserFull b22 = d2Var.getMessagesController().b2(user.f27150id);
                if (b22 != null && b22.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.n1.m(user, z15, z10, d2Var.getParentActivity(), b22, d2Var.getAccountInstance());
                return;
            case 6:
            case 8:
            default:
                yj0 yj0Var = (yj0) this.f5439c;
                boolean z16 = this.f5438b;
                yj0Var.C1();
                yj0Var.n1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new mi0(yj0Var, 4), new pi0(yj0Var, 6), z16);
                return;
            case 7:
                ez ezVar = (ez) this.f5439c;
                vy vyVar = (vy) this.d;
                boolean z17 = this.f5438b;
                int i10 = vyVar.f50637j;
                if (i10 > 0) {
                    ezVar.E &= ~i10;
                } else {
                    if (z17) {
                        arrayList2 = ezVar.G;
                    } else {
                        arrayList2 = ezVar.H;
                    }
                    arrayList2.remove(Long.valueOf(vyVar.h));
                }
                ezVar.p0();
                ezVar.C0();
                ezVar.o0(true);
                if (z17) {
                    ezVar.t0(1, false);
                    return;
                }
                return;
            case 9:
                boolean z18 = this.f5438b;
                String str2 = (String) this.f5439c;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.d;
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.f25457b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25457b.getPackageName(), 0);
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
                    d2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var2.getParentActivity());
                    alertDialog$Builder.f27343a.S = bd.M0(2131746081, null);
                    alertDialog$Builder.f27343a.U = bd.M0(2131748207, "NoMailInstalled");
                    alertDialog$Builder.k(bd.M0(2131747839, "OK"), null);
                    d2Var2.showDialog(alertDialog$Builder.f27343a);
                    return;
                }
        }
    }

    @Override
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        l6 l6Var = (l6) this.f5439c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(l6Var.f28583a).sendRequest(gettmppassword, new s3(l6Var, (TwoStepVerificationActivity) this.d, this.f5438b, 0));
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f5439c;
        Intent intent = (Intent) this.d;
        if (w6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return za.g.a(context, intent, this.f5438b).continueWith(new c3.b(3), new z9.j(5));
        }
        return task;
    }

    public l3(Object obj, boolean z10, Object obj2, int i3) {
        this.f5437a = i3;
        this.f5439c = obj;
        this.f5438b = z10;
        this.d = obj2;
    }

    public l3(String str, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        this.f5437a = 9;
        this.f5438b = z10;
        this.f5439c = str;
        this.d = d2Var;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
