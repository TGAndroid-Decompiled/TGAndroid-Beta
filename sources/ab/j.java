package ab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import bi.i4;
import bi.k7;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import fi.d3;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.voip.y1;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bz;
import org.telegram.ui.ca;
import org.telegram.ui.ek0;
import org.telegram.ui.fo;
import org.telegram.ui.ho;
import org.telegram.ui.i9;
import org.telegram.ui.jz;
import org.telegram.ui.pa1;
import org.telegram.ui.si0;
import org.telegram.ui.vi0;
import org.telegram.ui.yr;
public final class j implements Continuation, pa1, r1, cj0, yr, androidx.car.app.utils.a {
    public final int f949a;
    public final boolean f950b;
    public final Object f951c;
    public final Object d;

    public j(Object obj, Object obj2, boolean z9, int i7) {
        this.f949a = i7;
        this.f951c = obj;
        this.d = obj2;
        this.f950b = z9;
    }

    @Override
    public Object a() {
        return CarResultStub.h1((CarResultStub) this.f951c, this.f950b, (w.b) this.d);
    }

    @Override
    public void b(TLRPC.User user) {
        boolean z9;
        LaunchActivity launchActivity = (LaunchActivity) this.f951c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.B1;
        TLRPC.UserFull b22 = qp.s1(launchActivity.O).b2(user.f27109id);
        if (b22 != null && b22.video_calls_available) {
            z9 = true;
        } else {
            z9 = false;
        }
        y1.m(user, this.f950b, z9, launchActivity, b22, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override
    public void f(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ab.j.f(float, float, int, android.view.View):void");
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        ArrayList arrayList;
        boolean z9;
        ArrayList arrayList2;
        String str;
        switch (this.f949a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.f951c;
                boolean z10 = this.f950b;
                x31 x31Var = (x31) this.d;
                if (!z10) {
                    arrayList = a0Var.f17297k;
                } else {
                    arrayList = a0Var.f17296j;
                }
                arrayList.remove(Long.valueOf(x31Var.f40167x));
                a0Var.f17292e.run();
                return;
            case 3:
                i9 i9Var = (i9) this.f951c;
                boolean z11 = this.f950b;
                boolean[] zArr = (boolean[]) this.d;
                if (z11) {
                    boolean z12 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z12;
                    i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new d3(2, i9Var, z12));
                    i9Var.f46584y.clear();
                    i9Var.D = false;
                    i9Var.F = true;
                    i9Var.f46583x.setVisibility(8);
                    i9Var.f46576c.f37496f3.O(true);
                } else {
                    i9Var.getMessagesController().Z(new ArrayList(i9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                i9Var.j0(false);
                return;
            case 4:
                ((ca) this.f951c).f44284a.o0((TLRPC.TL_username) this.d, this.f950b, true);
                return;
            case 5:
                boolean z13 = this.f950b;
                ho hoVar = ((fo) this.f951c).f45814a;
                hoVar.z1((TLRPC.TL_username) this.d, z13, true);
                hoVar.f46402h3.b0();
                return;
            case 6:
                f2 f2Var = (f2) this.f951c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z14 = this.f950b;
                TLRPC.UserFull b22 = f2Var.getMessagesController().b2(user.f27109id);
                if (b22 != null && b22.video_calls_available) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                y1.m(user, z14, z9, f2Var.getParentActivity(), b22, f2Var.getAccountInstance());
                return;
            case 7:
            case 9:
            default:
                ek0 ek0Var = (ek0) this.f951c;
                boolean z15 = this.f950b;
                ek0Var.C1();
                ek0Var.n1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new si0(ek0Var, 4), new vi0(ek0Var, 6), z15);
                return;
            case 8:
                jz jzVar = (jz) this.f951c;
                bz bzVar = (bz) this.d;
                boolean z16 = this.f950b;
                int i10 = bzVar.f44180j;
                if (i10 > 0) {
                    jzVar.D &= ~i10;
                } else {
                    if (z16) {
                        arrayList2 = jzVar.F;
                    } else {
                        arrayList2 = jzVar.G;
                    }
                    arrayList2.remove(Long.valueOf(bzVar.h));
                }
                jzVar.p0();
                jzVar.C0();
                jzVar.o0(true);
                if (z16) {
                    jzVar.t0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z17 = this.f950b;
                String str2 = (String) this.f951c;
                f2 f2Var2 = (f2) this.d;
                try {
                    PackageInfo packageInfo = t0.f25570b.getPackageManager().getPackageInfo(t0.f25570b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str3 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    if (z17) {
                        str = "recover@telegram.org";
                    } else {
                        str = "login@stel.com";
                    }
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                    if (z17) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str2);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str2 + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str3 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str2);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str2 + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str3 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    f2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var2.getParentActivity());
                    alertDialog$Builder.f27300a.R = id.M0(2131746071, null);
                    alertDialog$Builder.f27300a.T = id.M0(2131748199, "NoMailInstalled");
                    alertDialog$Builder.k(id.M0(2131747831, "OK"), null);
                    f2Var2.showDialog(alertDialog$Builder.f27300a);
                    return;
                }
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        k7 k7Var = (k7) this.f951c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(k7Var.f28669a).sendRequest(gettmppassword, new i4(k7Var, (TwoStepVerificationActivity) this.d, this.f950b, 0));
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f951c;
        Intent intent = (Intent) this.d;
        if (x6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return k.a(context, intent, this.f950b).continueWith(new d3.b(3), new a3.l(7));
        }
        return task;
    }

    public j(Object obj, boolean z9, Object obj2, int i7) {
        this.f949a = i7;
        this.f951c = obj;
        this.f950b = z9;
        this.d = obj2;
    }

    public j(String str, f2 f2Var, boolean z9) {
        this.f949a = 10;
        this.f950b = z9;
        this.f951c = str;
        this.d = f2Var;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
