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
import hi.k3;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bz;
import org.telegram.ui.ca;
import org.telegram.ui.fk0;
import org.telegram.ui.fo;
import org.telegram.ui.ho;
import org.telegram.ui.j9;
import org.telegram.ui.jz;
import org.telegram.ui.ma1;
import org.telegram.ui.si0;
import org.telegram.ui.vi0;
import org.telegram.ui.yr;
public final class j implements Continuation, ma1, q1, rj0, yr, androidx.car.app.utils.a {
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
    public boolean U0(View view) {
        return false;
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
        TLRPC.UserFull d2 = mp.u1(launchActivity.P).d2(user.f28641id);
        if (d2 != null && d2.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        c2.m(user, this.f948b, z10, launchActivity, d2, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override
    public void g(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ab.j.g(float, float, int, android.view.View):void");
    }

    @Override
    public void i(t1 t1Var, int i7) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f947a) {
            case 2:
                kg.b0 b0Var = (kg.b0) this.f949c;
                boolean z11 = this.f948b;
                n41 n41Var = (n41) this.d;
                if (!z11) {
                    arrayList = b0Var.f18348k;
                } else {
                    arrayList = b0Var.f18347j;
                }
                arrayList.remove(Long.valueOf(n41Var.f37666y));
                b0Var.f18343e.run();
                return;
            case 3:
                j9 j9Var = (j9) this.f949c;
                boolean z12 = this.f948b;
                boolean[] zArr = (boolean[]) this.d;
                if (z12) {
                    boolean z13 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z13;
                    j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new k3(2, j9Var, z13));
                    j9Var.f49057x.clear();
                    j9Var.f49058y = false;
                    j9Var.F = true;
                    j9Var.f49056w.setVisibility(8);
                    j9Var.f49050c.f35323g3.O(true);
                } else {
                    j9Var.getMessagesController().Z(new ArrayList(j9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                j9Var.j0(false);
                return;
            case 4:
                ((ca) this.f949c).f46749a.o0((TLRPC.TL_username) this.d, this.f948b, true);
                return;
            case 5:
                boolean z14 = this.f948b;
                ho hoVar = ((fo) this.f949c).f47938a;
                hoVar.z1((TLRPC.TL_username) this.d, z14, true);
                hoVar.f48602i3.b0();
                return;
            case 6:
                g2 g2Var = (g2) this.f949c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f948b;
                TLRPC.UserFull d2 = g2Var.getMessagesController().d2(user.f28641id);
                if (d2 != null && d2.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c2.m(user, z15, z10, g2Var.getParentActivity(), d2, g2Var.getAccountInstance());
                return;
            case 7:
            case 9:
            default:
                fk0 fk0Var = (fk0) this.f949c;
                boolean z16 = this.f948b;
                fk0Var.C1();
                fk0Var.n1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new si0(fk0Var, 4), new vi0(fk0Var, 6), z16);
                return;
            case 8:
                jz jzVar = (jz) this.f949c;
                bz bzVar = (bz) this.d;
                boolean z17 = this.f948b;
                int i10 = bzVar.f46670j;
                if (i10 > 0) {
                    jzVar.E &= ~i10;
                } else {
                    if (z17) {
                        arrayList2 = jzVar.G;
                    } else {
                        arrayList2 = jzVar.H;
                    }
                    arrayList2.remove(Long.valueOf(bzVar.h));
                }
                jzVar.p0();
                jzVar.C0();
                jzVar.o0(true);
                if (z17) {
                    jzVar.t0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z18 = this.f948b;
                String str2 = (String) this.f949c;
                g2 g2Var2 = (g2) this.d;
                try {
                    PackageInfo packageInfo = t0.f27013b.getPackageManager().getPackageInfo(t0.f27013b.getPackageName(), 0);
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
                    g2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var2.getParentActivity());
                    alertDialog$Builder.f28835a.S = gd.N0(2131745875, null);
                    alertDialog$Builder.f28835a.U = gd.N0(2131748006, "NoMailInstalled");
                    alertDialog$Builder.k(gd.N0(2131747637, "OK"), null);
                    g2Var2.showDialog(alertDialog$Builder.f28835a);
                    return;
                }
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        f6 f6Var = (f6) this.f949c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(f6Var.f30223a).sendRequest(gettmppassword, new l3(f6Var, (TwoStepVerificationActivity) this.d, this.f948b, 0));
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

    public j(String str, g2 g2Var, boolean z10) {
        this.f947a = 10;
        this.f948b = z10;
        this.f949c = str;
        this.d = g2Var;
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
