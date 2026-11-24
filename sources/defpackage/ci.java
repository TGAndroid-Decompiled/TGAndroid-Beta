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
public final class ci implements ee, s89, g59, Continuation, cv2, c5c {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public ci(String str, d dVar, boolean z) {
        this.a = (byte) 10;
        this.b = z;
        this.d = str;
        this.c = dVar;
    }

    @Override
    public final Object a() {
        return CarResultStub.a((CarResultStub) this.c, this.b, (g41) this.d);
    }

    @Override
    public final void b(TLRPC.User user) {
        boolean z;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull X1 = oc7.r1(launchActivity.P).X1(user.id);
        if (X1 != null && X1.video_calls_available) {
            z = true;
        } else {
            z = false;
        }
        sic.m(user, this.b, z, launchActivity, X1, j5.a(iArr[0]));
    }

    @Override
    public final void d(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        wsa wsaVar = (wsa) this.c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(wsaVar.a).sendRequest(gettmppassword, new pqa(wsaVar, (TwoStepVerificationActivity) this.d, this.b, (byte) 0));
    }

    @Override
    public final void r(he heVar, int i) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z2 = this.b;
                TLRPC.UserFull X1 = dVar.getMessagesController().X1(user.id);
                if (X1 != null && X1.video_calls_available) {
                    z = true;
                } else {
                    z = false;
                }
                sic.m(user, z2, z, dVar.getParentActivity(), X1, dVar.getAccountInstance());
                return;
            case 1:
                t51 t51Var = (t51) this.c;
                boolean z3 = this.b;
                c6c c6cVar = (c6c) this.d;
                if (!z3) {
                    arrayList = t51Var.k;
                } else {
                    arrayList = t51Var.j;
                }
                arrayList.remove(Long.valueOf(c6cVar.y));
                t51Var.e.run();
                return;
            case 2:
                ia1 ia1Var = (ia1) this.c;
                boolean z4 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z4) {
                    ia1Var.getClass();
                    boolean z5 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z5;
                    ia1Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new r91((byte) 0, ia1Var, z5));
                    ia1Var.x.clear();
                    ia1Var.y = false;
                    ia1Var.F = true;
                    ia1Var.w.setVisibility(8);
                    ia1Var.c.g3.O(true);
                } else {
                    ia1Var.getMessagesController().V(new ArrayList(ia1Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                ia1Var.e0(false);
                return;
            case 3:
            case 5:
            case 7:
            case 9:
            default:
                xz7 xz7Var = (xz7) this.c;
                boolean z6 = this.b;
                xz7Var.B1();
                xz7Var.c1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new ny7(xz7Var, (byte) 4), new qy7(xz7Var, (byte) 6), z6);
                return;
            case 4:
                ((lf1) this.c).a.o0((TLRPC.TL_username) this.d, this.b, true);
                return;
            case 6:
                boolean z7 = this.b;
                pa2 pa2Var = ((na2) this.c).a;
                pa2Var.z1((TLRPC.TL_username) this.d, z7, true);
                pa2Var.i3.b0();
                return;
            case 8:
                qf4 qf4Var = (qf4) this.c;
                gf4 gf4Var = (gf4) this.d;
                boolean z8 = this.b;
                short s = gf4Var.j;
                if (s > 0) {
                    qf4Var.E &= ~s;
                } else {
                    if (z8) {
                        arrayList2 = qf4Var.G;
                    } else {
                        arrayList2 = qf4Var.H;
                    }
                    arrayList2.remove(Long.valueOf(gf4Var.h));
                }
                qf4Var.m0();
                qf4Var.C0();
                qf4Var.l0(true);
                if (z8) {
                    qf4Var.t0(1, false);
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
                    alertDialog$Builder.a.S = jb6.M0(2131745804, null);
                    alertDialog$Builder.a.U = jb6.M0(2131747933, "NoMailInstalled");
                    alertDialog$Builder.j(jb6.M0(2131747564, "OK"), null);
                    dVar2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    @Override
    public final Object then(Task task) {
        Context context = (Context) this.c;
        Intent intent = (Intent) this.d;
        if (ate.a() && ((Integer) task.getResult()).intValue() == 402) {
            return lx6.i(context, intent, this.b).continueWith(new kc((byte) 1), new h64((byte) 9));
        }
        return task;
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    public ci(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public ci(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
