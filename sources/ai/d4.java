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
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.g00;
import org.telegram.ui.jf1;
import org.telegram.ui.jl0;
import org.telegram.ui.ml0;
import org.telegram.ui.p00;
import org.telegram.ui.ss;
import org.telegram.ui.vo;
import org.telegram.ui.xm0;
import org.telegram.ui.xo;
public final class d4 implements jf1, Continuation, org.telegram.ui.ActionBar.a2, xl0, ss, androidx.car.app.utils.a {
    public final int f1134a;
    public final boolean f1135b;
    public final Object f1136c;
    public final Object d;

    public d4(Object obj, Object obj2, boolean z10, int i10) {
        this.f1134a = i10;
        this.f1136c = obj;
        this.d = obj2;
        this.f1135b = z10;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.f1136c).lambda$onCarHardwareResult$0(this.f1135b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override
    public void b(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f1136c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.C1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.f20419id);
        if (userFull != null && userFull.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.voip.d2.m(user, this.f1135b, z10, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override
    public void d(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.d4.d(float, float, int, android.view.View):void");
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f1134a) {
            case 2:
                ig.a0 a0Var = (ig.a0) this.f1136c;
                boolean z11 = this.f1135b;
                f61 f61Var = (f61) this.d;
                if (!z11) {
                    arrayList = a0Var.f12817k;
                } else {
                    arrayList = a0Var.f12816j;
                }
                arrayList.remove(Long.valueOf(f61Var.f26151x));
                a0Var.e.run();
                return;
            case 3:
                org.telegram.ui.m9 m9Var = (org.telegram.ui.m9) this.f1136c;
                boolean z12 = this.f1135b;
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
                    m9Var.d.W2.N(true);
                } else {
                    m9Var.getMessagesController().deleteMessages(new ArrayList<>(m9Var.L), null, null, 0L, 0, zArr[0], 0);
                }
                m9Var.k0(false);
                return;
            case 4:
                ((org.telegram.ui.ja) this.f1136c).f38101a.j0((TLRPC.TL_username) this.d, this.f1135b, true);
                return;
            case 5:
                boolean z14 = this.f1135b;
                xo xoVar = ((vo) this.f1136c).f42235a;
                xoVar.x1((TLRPC.TL_username) this.d, z14, true);
                xoVar.Y2.V();
                return;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f1136c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f1135b;
                TLRPC.UserFull userFull = n2Var.getMessagesController().getUserFull(user.f20419id);
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.d2.m(user, z15, z10, n2Var.getParentActivity(), userFull, n2Var.getAccountInstance());
                return;
            case 7:
            case 9:
            default:
                xm0 xm0Var = (xm0) this.f1136c;
                boolean z16 = this.f1135b;
                xm0Var.x1();
                xm0Var.i1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new jl0(xm0Var, 4), new ml0(xm0Var, 6), z16);
                return;
            case 8:
                p00 p00Var = (p00) this.f1136c;
                g00 g00Var = (g00) this.d;
                boolean z17 = this.f1135b;
                int i11 = g00Var.f37005j;
                if (i11 > 0) {
                    p00Var.f39909y &= ~i11;
                } else {
                    if (z17) {
                        arrayList2 = p00Var.F;
                    } else {
                        arrayList2 = p00Var.G;
                    }
                    arrayList2.remove(Long.valueOf(g00Var.h));
                }
                p00Var.j0();
                p00Var.w0();
                p00Var.i0(true);
                if (z17) {
                    p00Var.n0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z18 = this.f1135b;
                String str2 = (String) this.f1136c;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.d;
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
                    n2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var2.getParentActivity());
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20601a.T = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    n2Var2.showDialog(alertDialog$Builder.f20601a);
                    return;
                }
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((k7) this.f1136c).C2(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d, this.f1135b);
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f1136c;
        Intent intent = (Intent) this.d;
        if (u6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return com.google.firebase.messaging.i.a(context, intent, this.f1135b).continueWith(new a3.b(2), new ci.i1(7));
        }
        return task;
    }

    public d4(Object obj, boolean z10, Object obj2, int i10) {
        this.f1134a = i10;
        this.f1136c = obj;
        this.f1135b = z10;
        this.d = obj2;
    }

    public d4(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        this.f1134a = 10;
        this.f1135b = z10;
        this.f1136c = str;
        this.d = n2Var;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
