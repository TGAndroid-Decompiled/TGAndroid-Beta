package bi;

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
import org.telegram.ui.Components.t61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f00;
import org.telegram.ui.in0;
import org.telegram.ui.o00;
import org.telegram.ui.qf1;
import org.telegram.ui.rs;
import org.telegram.ui.sl0;
import org.telegram.ui.vl0;
import org.telegram.ui.xo;
import org.telegram.ui.zo;
public final class z3 implements qf1, Continuation, org.telegram.ui.ActionBar.b2, am0, rs, androidx.car.app.utils.b {
    public final int f5821a;
    public final boolean f5822b;
    public final Object f5823c;
    public final Object d;

    public z3(Object obj, Object obj2, boolean z10, int i10) {
        this.f5821a = i10;
        this.f5823c = obj;
        this.d = obj2;
        this.f5822b = z10;
    }

    @Override
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.f5823c).lambda$onCarHardwareResult$0(this.f5822b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override
    public void b(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f5823c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.D1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.O).getUserFull(user.f22176id);
        if (userFull != null && userFull.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.voip.g2.m(user, this.f5822b, z10, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float r21, float r22, int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.z3.e(float, float, int, android.view.View):void");
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        String str;
        switch (this.f5821a) {
            case 2:
                jg.b0 b0Var = (jg.b0) this.f5823c;
                boolean z11 = this.f5822b;
                t61 t61Var = (t61) this.d;
                if (!z11) {
                    arrayList = b0Var.f15636k;
                } else {
                    arrayList = b0Var.f15635j;
                }
                arrayList.remove(Long.valueOf(t61Var.f32886x));
                b0Var.e.run();
                return;
            case 3:
                org.telegram.ui.o9 o9Var = (org.telegram.ui.o9) this.f5823c;
                boolean z12 = this.f5822b;
                boolean[] zArr = (boolean[]) this.d;
                if (z12) {
                    boolean z13 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z13;
                    o9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new fi.m3(3, o9Var, z13));
                    o9Var.f42132w.clear();
                    o9Var.f42133x = false;
                    o9Var.E = true;
                    o9Var.v.setVisibility(8);
                    o9Var.f42127c.f32152g3.O(true);
                } else {
                    o9Var.getMessagesController().deleteMessages(new ArrayList<>(o9Var.G), null, null, 0L, 0, zArr[0], 0);
                }
                o9Var.f0(false);
                return;
            case 4:
                ((org.telegram.ui.ia) this.f5823c).f40198a.k0((TLRPC.TL_username) this.d, this.f5822b, true);
                return;
            case 5:
                boolean z14 = this.f5822b;
                zo zoVar = ((xo) this.f5823c).f45818a;
                zoVar.C1((TLRPC.TL_username) this.d, z14, true);
                zoVar.f46341i3.X();
                return;
            case 6:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f5823c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z15 = this.f5822b;
                TLRPC.UserFull userFull = r2Var.getMessagesController().getUserFull(user.f22176id);
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.g2.m(user, z15, z10, r2Var.getParentActivity(), userFull, r2Var.getAccountInstance());
                return;
            case 7:
            case 9:
            default:
                in0 in0Var = (in0) this.f5823c;
                boolean z16 = this.f5822b;
                in0Var.y1();
                in0Var.j1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new sl0(in0Var, 4), new vl0(in0Var, 6), z16);
                return;
            case 8:
                o00 o00Var = (o00) this.f5823c;
                f00 f00Var = (f00) this.d;
                boolean z17 = this.f5822b;
                int i11 = f00Var.f39232j;
                if (i11 > 0) {
                    o00Var.f42063y &= ~i11;
                } else {
                    if (z17) {
                        arrayList2 = o00Var.F;
                    } else {
                        arrayList2 = o00Var.G;
                    }
                    arrayList2.remove(Long.valueOf(f00Var.h));
                }
                o00Var.l0();
                o00Var.y0();
                o00Var.k0(true);
                if (z17) {
                    o00Var.p0(1, false);
                    return;
                }
                return;
            case 10:
                boolean z18 = this.f5822b;
                String str2 = (String) this.f5823c;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.d;
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
                    r2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var2.getParentActivity());
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f22368a.T = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    r2Var2.showDialog(alertDialog$Builder.f22368a);
                    return;
                }
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((h7) this.f5823c).I2(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d, this.f5822b);
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f5823c;
        Intent intent = (Intent) this.d;
        if (v6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return com.google.firebase.messaging.i.a(context, intent, this.f5822b).continueWith(new a3.b(2), new c2.i(4));
        }
        return task;
    }

    public z3(Object obj, boolean z10, Object obj2, int i10) {
        this.f5821a = i10;
        this.f5823c = obj;
        this.f5822b = z10;
        this.d = obj2;
    }

    public z3(String str, org.telegram.ui.ActionBar.r2 r2Var, boolean z10) {
        this.f5821a = 10;
        this.f5822b = z10;
        this.f5823c = str;
        this.d = r2Var;
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
