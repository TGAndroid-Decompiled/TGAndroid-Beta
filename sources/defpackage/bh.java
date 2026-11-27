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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpSender;
public final class bh implements fd, da9, s69, Continuation, lu2, NativeLifecycleLock.NativePointerCallable, b7c {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public bh(String str, e eVar, boolean z) {
        this.a = (byte) 10;
        this.b = z;
        this.d = str;
        this.c = eVar;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final Object a() {
        return CarResultStub.a((CarResultStub) this.c, this.b, (h31) this.d);
    }

    @Override
    public final void b(TLRPC.User user) {
        boolean z;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.d;
        String str = LaunchActivity.C1;
        TLRPC.UserFull Y1 = uc7.s1(launchActivity.P).Y1(user.id);
        if (Y1 != null && Y1.video_calls_available) {
            z = true;
        } else {
            z = false;
        }
        xkc.m(user, this.b, z, launchActivity, Y1, k5.a(iArr[0]));
    }

    @Override
    public final Object call(long j) {
        return RtpSender.b((RtpSender) this.c, (MediaStreamTrack) this.d, this.b, j);
    }

    @Override
    public final void d(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        wua wuaVar = (wua) this.c;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = tL_inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(wuaVar.a).sendRequest(gettmppassword, new qsa(wuaVar, (TwoStepVerificationActivity) this.d, this.b, (byte) 0));
    }

    @Override
    public final Object then(Task task) {
        Context context = (Context) this.c;
        Intent intent = (Intent) this.d;
        if (rve.a() && ((Integer) task.getResult()).intValue() == 402) {
            return qx6.e(context, intent, this.b).continueWith(new ic((byte) 1), new su3((byte) 19));
        }
        return task;
    }

    @Override
    public final void w(id idVar, int i) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        switch (this.a) {
            case 0:
                e eVar = (e) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z2 = this.b;
                TLRPC.UserFull Y1 = eVar.getMessagesController().Y1(user.id);
                if (Y1 != null && Y1.video_calls_available) {
                    z = true;
                } else {
                    z = false;
                }
                xkc.m(user, z2, z, eVar.getParentActivity(), Y1, eVar.getAccountInstance());
                return;
            case 1:
                u41 u41Var = (u41) this.c;
                boolean z3 = this.b;
                b8c b8cVar = (b8c) this.d;
                if (!z3) {
                    arrayList = u41Var.k;
                } else {
                    arrayList = u41Var.j;
                }
                arrayList.remove(Long.valueOf(b8cVar.y));
                u41Var.e.run();
                return;
            case 2:
                i91 i91Var = (i91) this.c;
                boolean z4 = this.b;
                boolean[] zArr = (boolean[]) this.d;
                if (z4) {
                    i91Var.getClass();
                    boolean z5 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z5;
                    i91Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new q81((byte) 0, i91Var, z5));
                    i91Var.x.clear();
                    i91Var.y = false;
                    i91Var.F = true;
                    i91Var.w.setVisibility(8);
                    i91Var.c.g3.O(true);
                } else {
                    i91Var.getMessagesController().X(new ArrayList(i91Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                i91Var.d0(false);
                return;
            case 3:
            case 5:
            case 7:
            case 9:
            default:
                b18 b18Var = (b18) this.c;
                boolean z6 = this.b;
                b18Var.B1();
                b18Var.c1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new sz7(b18Var, (byte) 4), new vz7(b18Var, (byte) 6), z6);
                return;
            case 4:
                ((me1) this.c).a.n0((TLRPC.TL_username) this.d, this.b, true);
                return;
            case 6:
                boolean z7 = this.b;
                u92 u92Var = ((s92) this.c).a;
                u92Var.A1((TLRPC.TL_username) this.d, z7, true);
                u92Var.i3.a0();
                return;
            case 8:
                nf4 nf4Var = (nf4) this.c;
                ef4 ef4Var = (ef4) this.d;
                boolean z8 = this.b;
                short s = ef4Var.j;
                if (s > 0) {
                    nf4Var.E &= ~s;
                } else {
                    if (z8) {
                        arrayList2 = nf4Var.G;
                    } else {
                        arrayList2 = nf4Var.H;
                    }
                    arrayList2.remove(Long.valueOf(ef4Var.h));
                }
                nf4Var.l0();
                nf4Var.C0();
                nf4Var.k0(true);
                if (z8) {
                    nf4Var.s0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z9 = this.b;
                String str2 = (String) this.d;
                e eVar2 = (e) this.c;
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
                    eVar2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar2.getParentActivity());
                    alertDialog$Builder.a.S = ob6.M0(2131745798, null);
                    alertDialog$Builder.a.U = ob6.M0(2131747930, "NoMailInstalled");
                    alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
                    eVar2.showDialog(alertDialog$Builder.a);
                    return;
                }
        }
    }

    public bh(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public bh(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
