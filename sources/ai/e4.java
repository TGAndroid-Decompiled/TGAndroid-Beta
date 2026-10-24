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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.h00;
import org.telegram.ui.jl0;
import org.telegram.ui.ml0;
import org.telegram.ui.nf1;
import org.telegram.ui.q00;
import org.telegram.ui.ts;
import org.telegram.ui.vo;
import org.telegram.ui.xo;
import org.telegram.ui.zm0;
public final class e4 implements nf1, Continuation, org.telegram.ui.ActionBar.z1, am0, ts, androidx.car.app.utils.a {
    public final int f1188a;
    public final boolean f1189b;
    public final Object f1190c;
    public final Object d;

    public e4(Object obj, Object obj2, boolean z10, int i10) {
        this.f1188a = i10;
        this.f1190c = obj;
        this.d = obj2;
        this.f1189b = z10;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.f1190c).lambda$onCarHardwareResult$0(this.f1189b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override
    public void b(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f1190c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.D1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.f20491id);
        if (userFull != null && userFull.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.voip.d2.m(user, this.f1189b, z10, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override
    public void c(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.e4.c(float, float, int, android.view.View):void");
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f1188a) {
            case 2:
                ig.a0 a0Var = (ig.a0) this.f1190c;
                boolean z11 = this.f1189b;
                l61 l61Var = (l61) this.d;
                if (!z11) {
                    arrayList = a0Var.f12849k;
                } else {
                    arrayList = a0Var.f12848j;
                }
                arrayList.remove(Long.valueOf(l61Var.f28238x));
                a0Var.e.run();
                return;
            case 3:
                org.telegram.ui.m9 m9Var = (org.telegram.ui.m9) this.f1190c;
                boolean z12 = this.f1189b;
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
                    m9Var.d.Z2.N(true);
                } else {
                    m9Var.getMessagesController().deleteMessages(new ArrayList<>(m9Var.L), null, null, 0L, 0, zArr[0], 0);
                }
                m9Var.j0(false);
                return;
            case 4:
                ((org.telegram.ui.ha) this.f1190c).f37797a.j0((TLRPC.TL_username) this.d, this.f1189b, true);
                return;
            case 5:
                boolean z14 = this.f1189b;
                xo xoVar = ((vo) this.f1190c).f42781a;
                xoVar.C1((TLRPC.TL_username) this.d, z14, true);
                xoVar.f43653b3.W();
                return;
            case 6:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f1190c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f1189b;
                TLRPC.UserFull userFull = o2Var.getMessagesController().getUserFull(user.f20491id);
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.d2.m(user, z15, z10, o2Var.getParentActivity(), userFull, o2Var.getAccountInstance());
                return;
            case 7:
            case 9:
            default:
                zm0 zm0Var = (zm0) this.f1190c;
                boolean z16 = this.f1189b;
                zm0Var.x1();
                zm0Var.i1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new jl0(zm0Var, 4), new ml0(zm0Var, 6), z16);
                return;
            case 8:
                q00 q00Var = (q00) this.f1190c;
                h00 h00Var = (h00) this.d;
                boolean z17 = this.f1189b;
                int i11 = h00Var.f37704j;
                if (i11 > 0) {
                    q00Var.f40680y &= ~i11;
                } else {
                    if (z17) {
                        arrayList2 = q00Var.F;
                    } else {
                        arrayList2 = q00Var.G;
                    }
                    arrayList2.remove(Long.valueOf(h00Var.h));
                }
                q00Var.j0();
                q00Var.w0();
                q00Var.i0(true);
                if (z17) {
                    q00Var.n0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z18 = this.f1189b;
                String str2 = (String) this.f1190c;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.d;
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
                    o2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var2.getParentActivity());
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20679a.T = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    o2Var2.showDialog(alertDialog$Builder.f20679a);
                    return;
                }
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((l7) this.f1190c).I2(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d, this.f1189b);
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f1190c;
        Intent intent = (Intent) this.d;
        if (u6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return com.google.firebase.messaging.i.a(context, intent, this.f1189b).continueWith(new a3.b(2), new c3.m(9));
        }
        return task;
    }

    public e4(Object obj, boolean z10, Object obj2, int i10) {
        this.f1188a = i10;
        this.f1190c = obj;
        this.f1189b = z10;
        this.d = obj2;
    }

    public e4(String str, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        this.f1188a = 10;
        this.f1189b = z10;
        this.f1190c = str;
        this.d = o2Var;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
