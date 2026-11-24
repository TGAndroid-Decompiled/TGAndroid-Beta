package defpackage;

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ch implements ed, q69, d39, Continuation, rt2, b3c {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public ch(String str, d dVar, boolean z) {
        this.a = (byte) 10;
        this.b = z;
        this.d = str;
        this.c = dVar;
    }

    @Override
    public final Object a() {
        return CarResultStub.a((CarResultStub) this.c, this.b, (y21) this.d);
    }

    @Override
    public final void b(TLRPC.User user) {
        boolean z;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull W1 = na7.q1(launchActivity.P).W1(user.id);
        if (W1 != null && W1.video_calls_available) {
            z = true;
        } else {
            z = false;
        }
        rgc.m(user, this.b, z, launchActivity, W1, j5.a(iArr[0]));
    }

    @Override
    public final void e(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.e(float, float, int, android.view.View):void");
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        vqa vqaVar = (vqa) this.c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(vqaVar.a).sendRequest(gettmppassword, new poa(vqaVar, (TwoStepVerificationActivity) this.d, this.b, (byte) 0));
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final Object then(Task task) {
        Context context = (Context) this.c;
        Intent intent = (Intent) this.d;
        if (xqe.a() && ((Integer) task.getResult()).intValue() == 402) {
            return lv6.c(context, intent, this.b).continueWith(new hc((byte) 1), new w44((byte) 8));
        }
        return task;
    }

    @Override
    public final void u(hd hdVar, int i) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z2 = this.b;
                TLRPC.UserFull W1 = dVar.getMessagesController().W1(user.id);
                if (W1 != null && W1.video_calls_available) {
                    z = true;
                } else {
                    z = false;
                }
                rgc.m(user, z2, z, dVar.getParentActivity(), W1, dVar.getAccountInstance());
                return;
            case 1:
                m41 m41Var = (m41) this.c;
                boolean z3 = this.b;
                c4c c4cVar = (c4c) this.d;
                if (!z3) {
                    arrayList = m41Var.k;
                } else {
                    arrayList = m41Var.j;
                }
                arrayList.remove(Long.valueOf(c4cVar.y));
                m41Var.e.run();
                return;
            case 2:
                z81 z81Var = (z81) this.c;
                boolean z4 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z4) {
                    z81Var.getClass();
                    boolean z5 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z5;
                    z81Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new i81((byte) 0, z81Var, z5));
                    z81Var.x.clear();
                    z81Var.y = false;
                    z81Var.F = true;
                    z81Var.w.setVisibility(8);
                    z81Var.c.g3.O(true);
                } else {
                    z81Var.getMessagesController().V(new ArrayList(z81Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                z81Var.d0(false);
                return;
            case 3:
            case 5:
            case 7:
            case 9:
            default:
                vx7 vx7Var = (vx7) this.c;
                boolean z6 = this.b;
                vx7Var.A1();
                vx7Var.b1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new kw7(vx7Var, (byte) 4), new nw7(vx7Var, (byte) 6), z6);
                return;
            case 4:
                ((de1) this.c).a.n0((TLRPC.TL_username) this.d, this.b, true);
                return;
            case 6:
                boolean z7 = this.b;
                e92 e92Var = ((c92) this.c).a;
                e92Var.z1((TLRPC.TL_username) this.d, z7, true);
                e92Var.i3.a0();
                return;
            case 8:
                pd4 pd4Var = (pd4) this.c;
                gd4 gd4Var = (gd4) this.d;
                boolean z8 = this.b;
                short s = gd4Var.j;
                if (s > 0) {
                    pd4Var.E &= ~s;
                } else {
                    if (z8) {
                        arrayList2 = pd4Var.G;
                    } else {
                        arrayList2 = pd4Var.H;
                    }
                    arrayList2.remove(Long.valueOf(gd4Var.h));
                }
                pd4Var.l0();
                pd4Var.B0();
                pd4Var.k0(true);
                if (z8) {
                    pd4Var.s0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z9 = this.b;
                String str2 = (String) this.d;
                d dVar2 = (d) this.c;
                try {
                    PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str3 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    if (z9) {
                        str = "recover@telegram.org";
                    } else {
                        str = "login@stel.com";
                    }
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                    if (z9) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str2);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str2 + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str3 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str2);
                        intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str2 + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str3 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
                    }
                    dVar2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar2.getParentActivity());
                    alertDialog$Builder.a.S = k96.M0(2131745878, null);
                    alertDialog$Builder.a.U = k96.M0(2131748007, "NoMailInstalled");
                    alertDialog$Builder.j(k96.M0(2131747638, "OK"), null);
                    dVar2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    public ch(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public ch(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
