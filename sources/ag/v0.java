package ag;

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
import org.telegram.messenger.dd;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bp;
import org.telegram.ui.ea;
import org.telegram.ui.ec1;
import org.telegram.ui.h00;
import org.telegram.ui.j9;
import org.telegram.ui.jl0;
import org.telegram.ui.vj0;
import org.telegram.ui.vs;
import org.telegram.ui.yj0;
import org.telegram.ui.zo;
import org.telegram.ui.zz;
import rh.e4;
public final class v0 implements org.telegram.ui.ActionBar.u1, ik0, vs, androidx.car.app.utils.b, ec1, Continuation {
    public final int f745a;
    public final boolean f746b;
    public final Object f747c;
    public final Object d;

    public v0(Object obj, Object obj2, boolean z10, int i10) {
        this.f745a = i10;
        this.f747c = obj;
        this.d = obj2;
        this.f746b = z10;
    }

    @Override
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.f747c).lambda$onCarHardwareResult$0(this.f746b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override
    public void b(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ag.v0.b(float, float, int, android.view.View):void");
    }

    @Override
    public void c(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f747c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.D1;
        TLRPC.UserFull a2 = wp.r1(launchActivity.O).a2(user.f19943id);
        if (a2 != null && a2.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.voip.n1.m(user, this.f746b, z10, launchActivity, a2, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f745a) {
            case 0:
                x0 x0Var = (x0) this.f747c;
                boolean z11 = this.f746b;
                b51 b51Var = (b51) this.d;
                if (!z11) {
                    arrayList = x0Var.f790k;
                } else {
                    arrayList = x0Var.f789j;
                }
                arrayList.remove(Long.valueOf(b51Var.f24654x));
                x0Var.e.run();
                return;
            case 1:
                j9 j9Var = (j9) this.f747c;
                boolean z12 = this.f746b;
                boolean[] zArr = (boolean[]) this.d;
                if (z12) {
                    boolean z13 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z13;
                    j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new org.telegram.messenger.voip.u0(1, j9Var, z13));
                    j9Var.f38318y.clear();
                    j9Var.D = false;
                    j9Var.F = true;
                    j9Var.f38317x.setVisibility(8);
                    j9Var.f38311c.f31183f3.O(true);
                } else {
                    j9Var.getMessagesController().Z(new ArrayList(j9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                j9Var.j0(false);
                return;
            case 2:
                ((ea) this.f747c).f36783a.o0((TLRPC.TL_username) this.d, this.f746b, true);
                return;
            case 3:
                boolean z14 = this.f746b;
                bp bpVar = ((zo) this.f747c).f44030a;
                bpVar.z1((TLRPC.TL_username) this.d, z14, true);
                bpVar.f36095h3.b0();
                return;
            case 4:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f747c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f746b;
                TLRPC.UserFull a2 = k2Var.getMessagesController().a2(user.f19943id);
                if (a2 != null && a2.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.n1.m(user, z15, z10, k2Var.getParentActivity(), a2, k2Var.getAccountInstance());
                return;
            case 5:
            case 7:
            default:
                jl0 jl0Var = (jl0) this.f747c;
                boolean z16 = this.f746b;
                jl0Var.C1();
                jl0Var.n1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new vj0(jl0Var, 4), new yj0(jl0Var, 6), z16);
                return;
            case 6:
                h00 h00Var = (h00) this.f747c;
                zz zzVar = (zz) this.d;
                boolean z17 = this.f746b;
                int i11 = zzVar.f44260j;
                if (i11 > 0) {
                    h00Var.D &= ~i11;
                } else {
                    if (z17) {
                        arrayList2 = h00Var.F;
                    } else {
                        arrayList2 = h00Var.G;
                    }
                    arrayList2.remove(Long.valueOf(zzVar.h));
                }
                h00Var.p0();
                h00Var.C0();
                h00Var.o0(true);
                if (z17) {
                    h00Var.t0(1, false);
                    return;
                }
                return;
            case 8:
                boolean z18 = this.f746b;
                String str2 = (String) this.f747c;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.d;
                try {
                    PackageInfo packageInfo = org.telegram.messenger.w0.f18945b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.f18945b.getPackageName(), 0);
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
                    k2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var2.getParentActivity());
                    alertDialog$Builder.f20135a.R = dd.L0(2131746088, null);
                    alertDialog$Builder.f20135a.T = dd.L0(2131748216, "NoMailInstalled");
                    alertDialog$Builder.k(dd.L0(2131747847, "OK"), null);
                    k2Var2.showDialog(alertDialog$Builder.f20135a);
                    return;
                }
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        e4 e4Var = (e4) this.f747c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(e4Var.f21584a).sendRequest(gettmppassword, new rh.a2(e4Var, (TwoStepVerificationActivity) this.d, this.f746b, 0));
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f747c;
        Intent intent = (Intent) this.d;
        if (u6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return xa.g.a(context, intent, this.f746b).continueWith(new a3.b(3), new th.m1(23));
        }
        return task;
    }

    public v0(Object obj, boolean z10, Object obj2, int i10) {
        this.f745a = i10;
        this.f747c = obj;
        this.f746b = z10;
        this.d = obj2;
    }

    public v0(String str, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        this.f745a = 8;
        this.f746b = z10;
        this.f747c = str;
        this.d = k2Var;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
