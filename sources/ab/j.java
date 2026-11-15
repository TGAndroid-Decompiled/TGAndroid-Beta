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
import di.c6;
import di.j3;
import hi.b3;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ca;
import org.telegram.ui.ek0;
import org.telegram.ui.eo;
import org.telegram.ui.go;
import org.telegram.ui.hz;
import org.telegram.ui.i9;
import org.telegram.ui.ka1;
import org.telegram.ui.ri0;
import org.telegram.ui.ui0;
import org.telegram.ui.yr;
import org.telegram.ui.zy;
public final class j implements Continuation, ka1, q1, hj0, yr, androidx.car.app.utils.b {
    public final int f948a;
    public final boolean f949b;
    public final Object f950c;
    public final Object d;

    public j(Object obj, Object obj2, boolean z10, int i7) {
        this.f948a = i7;
        this.f950c = obj;
        this.d = obj2;
        this.f949b = z10;
    }

    @Override
    public Object a() {
        return CarResultStub.h1((CarResultStub) this.f950c, this.f949b, (w.b) this.d);
    }

    @Override
    public void b(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f950c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull b22 = np.s1(launchActivity.P).b2(user.f28200id);
        if (b22 != null && b22.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        c2.m(user, this.f949b, z10, launchActivity, b22, org.telegram.messenger.c.a(iArr[0]));
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ab.j.f(float, float, int, android.view.View):void");
    }

    @Override
    public void h(t1 t1Var, int i7) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f948a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.f950c;
                boolean z11 = this.f949b;
                b41 b41Var = (b41) this.d;
                if (!z11) {
                    arrayList = a0Var.f17856k;
                } else {
                    arrayList = a0Var.f17855j;
                }
                arrayList.remove(Long.valueOf(b41Var.f33192x));
                a0Var.f17851e.run();
                return;
            case 3:
                i9 i9Var = (i9) this.f950c;
                boolean z12 = this.f949b;
                boolean[] zArr = (boolean[]) this.d;
                if (z12) {
                    boolean z13 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z13;
                    i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new b3(2, i9Var, z13));
                    i9Var.f47985y.clear();
                    i9Var.E = false;
                    i9Var.G = true;
                    i9Var.f47984x.setVisibility(8);
                    i9Var.f47977c.f39895g3.O(true);
                } else {
                    i9Var.getMessagesController().Z(new ArrayList(i9Var.I), null, null, 0L, 0, zArr[0], 0);
                }
                i9Var.j0(false);
                return;
            case 4:
                ((ca) this.f950c).f46061a.o0((TLRPC.TL_username) this.d, this.f949b, true);
                return;
            case 5:
                boolean z14 = this.f949b;
                go goVar = ((eo) this.f950c).f46888a;
                goVar.z1((TLRPC.TL_username) this.d, z14, true);
                goVar.f47497i3.b0();
                return;
            case 6:
                e2 e2Var = (e2) this.f950c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f949b;
                TLRPC.UserFull b22 = e2Var.getMessagesController().b2(user.f28200id);
                if (b22 != null && b22.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c2.m(user, z15, z10, e2Var.getParentActivity(), b22, e2Var.getAccountInstance());
                return;
            case 7:
            case 9:
            default:
                ek0 ek0Var = (ek0) this.f950c;
                boolean z16 = this.f949b;
                ek0Var.C1();
                ek0Var.n1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new ri0(ek0Var, 4), new ui0(ek0Var, 6), z16);
                return;
            case 8:
                hz hzVar = (hz) this.f950c;
                zy zyVar = (zy) this.d;
                boolean z17 = this.f949b;
                int i10 = zyVar.f54065j;
                if (i10 > 0) {
                    hzVar.E &= ~i10;
                } else {
                    if (z17) {
                        arrayList2 = hzVar.G;
                    } else {
                        arrayList2 = hzVar.H;
                    }
                    arrayList2.remove(Long.valueOf(zyVar.h));
                }
                hzVar.p0();
                hzVar.C0();
                hzVar.o0(true);
                if (z17) {
                    hzVar.t0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z18 = this.f949b;
                String str2 = (String) this.f950c;
                e2 e2Var2 = (e2) this.d;
                try {
                    PackageInfo packageInfo = t0.f26600b.getPackageManager().getPackageInfo(t0.f26600b.getPackageName(), 0);
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
                    e2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var2.getParentActivity());
                    alertDialog$Builder.f28392a.S = hd.M0(2131746071, null);
                    alertDialog$Builder.f28392a.U = hd.M0(2131748199, "NoMailInstalled");
                    alertDialog$Builder.k(hd.M0(2131747831, "OK"), null);
                    e2Var2.showDialog(alertDialog$Builder.f28392a);
                    return;
                }
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        c6 c6Var = (c6) this.f950c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(c6Var.f29679a).sendRequest(gettmppassword, new j3(c6Var, (TwoStepVerificationActivity) this.d, this.f949b, 0));
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f950c;
        Intent intent = (Intent) this.d;
        if (x6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return k.a(context, intent, this.f949b).continueWith(new d3.b(3), new a3.l(7));
        }
        return task;
    }

    public j(Object obj, boolean z10, Object obj2, int i7) {
        this.f948a = i7;
        this.f950c = obj;
        this.f949b = z10;
        this.d = obj2;
    }

    public j(String str, e2 e2Var, boolean z10) {
        this.f948a = 10;
        this.f949b = z10;
        this.f950c = str;
        this.d = e2Var;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
