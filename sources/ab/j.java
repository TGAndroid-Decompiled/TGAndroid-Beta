package ab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import di.f6;
import di.l3;
import hi.c3;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.voip.b2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ca;
import org.telegram.ui.cz;
import org.telegram.ui.go;
import org.telegram.ui.hk0;
import org.telegram.ui.i9;
import org.telegram.ui.io;
import org.telegram.ui.kz;
import org.telegram.ui.oa1;
import org.telegram.ui.ui0;
import org.telegram.ui.xi0;
import org.telegram.ui.yr;
public final class j implements Continuation, oa1, r1, pj0, yr, androidx.car.app.utils.a {
    public final int f947a;
    public final boolean f948b;
    public final Object f949c;
    public final Object d;

    public j(Object obj, Object obj2, boolean z10, int i7) {
        this.f947a = i7;
        this.f949c = obj;
        this.d = obj2;
        this.f948b = z10;
    }

    @Override
    public Object a() {
        return CarResultStub.h1((CarResultStub) this.f949c, this.f948b, (w.b) this.d);
    }

    @Override
    public void b(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f949c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull d2 = mp.u1(launchActivity.P).d2(user.f28554id);
        if (d2 != null && d2.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        b2.m(user, this.f948b, z10, launchActivity, d2, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ab.j.f(float, float, int, android.view.View):void");
    }

    @Override
    public void h(u1 u1Var, int i7) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f947a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.f949c;
                boolean z11 = this.f948b;
                l41 l41Var = (l41) this.d;
                if (!z11) {
                    arrayList = a0Var.f18251k;
                } else {
                    arrayList = a0Var.f18250j;
                }
                arrayList.remove(Long.valueOf(l41Var.f37029y));
                a0Var.f18246e.run();
                return;
            case 3:
                i9 i9Var = (i9) this.f949c;
                boolean z12 = this.f948b;
                boolean[] zArr = (boolean[]) this.d;
                if (z12) {
                    boolean z13 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z13;
                    i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new c3(2, i9Var, z13));
                    i9Var.f48663x.clear();
                    i9Var.f48664y = false;
                    i9Var.F = true;
                    i9Var.f48662w.setVisibility(8);
                    i9Var.f48656c.f34607g3.O(true);
                } else {
                    i9Var.getMessagesController().Z(new ArrayList(i9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                i9Var.j0(false);
                return;
            case 4:
                ((ca) this.f949c).f46471a.o0((TLRPC.TL_username) this.d, this.f948b, true);
                return;
            case 5:
                boolean z14 = this.f948b;
                io ioVar = ((go) this.f949c).f48145a;
                ioVar.z1((TLRPC.TL_username) this.d, z14, true);
                ioVar.f48772i3.b0();
                return;
            case 6:
                h2 h2Var = (h2) this.f949c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f948b;
                TLRPC.UserFull d2 = h2Var.getMessagesController().d2(user.f28554id);
                if (d2 != null && d2.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b2.m(user, z15, z10, h2Var.getParentActivity(), d2, h2Var.getAccountInstance());
                return;
            case 7:
            case 9:
            default:
                hk0 hk0Var = (hk0) this.f949c;
                boolean z16 = this.f948b;
                hk0Var.C1();
                hk0Var.n1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new ui0(hk0Var, 4), new xi0(hk0Var, 6), z16);
                return;
            case 8:
                kz kzVar = (kz) this.f949c;
                cz czVar = (cz) this.d;
                boolean z17 = this.f948b;
                int i10 = czVar.f46798j;
                if (i10 > 0) {
                    kzVar.E &= ~i10;
                } else {
                    if (z17) {
                        arrayList2 = kzVar.G;
                    } else {
                        arrayList2 = kzVar.H;
                    }
                    arrayList2.remove(Long.valueOf(czVar.h));
                }
                kzVar.p0();
                kzVar.C0();
                kzVar.o0(true);
                if (z17) {
                    kzVar.t0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z18 = this.f948b;
                String str2 = (String) this.f949c;
                h2 h2Var2 = (h2) this.d;
                try {
                    PackageInfo packageInfo = t0.f26915b.getPackageManager().getPackageInfo(t0.f26915b.getPackageName(), 0);
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
                    h2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var2.getParentActivity());
                    alertDialog$Builder.f28746a.S = gd.M0(2131745876, null);
                    alertDialog$Builder.f28746a.U = gd.M0(2131748007, "NoMailInstalled");
                    alertDialog$Builder.k(gd.M0(2131747638, "OK"), null);
                    h2Var2.showDialog(alertDialog$Builder.f28746a);
                    return;
                }
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        f6 f6Var = (f6) this.f949c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(f6Var.f30189a).sendRequest(gettmppassword, new l3(f6Var, (TwoStepVerificationActivity) this.d, this.f948b, 0));
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f949c;
        Intent intent = (Intent) this.d;
        if (x6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return k.a(context, intent, this.f948b).continueWith(new d3.b(3), new a3.l(7));
        }
        return task;
    }

    public j(Object obj, boolean z10, Object obj2, int i7) {
        this.f947a = i7;
        this.f949c = obj;
        this.f948b = z10;
        this.d = obj2;
    }

    public j(String str, h2 h2Var, boolean z10) {
        this.f947a = 10;
        this.f948b = z10;
        this.f949c = str;
        this.d = h2Var;
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
