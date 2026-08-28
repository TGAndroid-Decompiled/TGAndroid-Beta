package b5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import j4.i1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import kh.o3;
import o8.l0;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ba;
import org.telegram.ui.e00;
import org.telegram.ui.gb0;
import org.telegram.ui.hl0;
import org.telegram.ui.i9;
import org.telegram.ui.kl0;
import org.telegram.ui.n00;
import org.telegram.ui.so;
import org.telegram.ui.ts;
import org.telegram.ui.uo;
import org.telegram.ui.wm0;
public final class e implements o, Continuation, b2, nk0, ts, androidx.car.app.utils.d {
    public final int f1451a;
    public final boolean f1452b;
    public final Object f1453c;
    public final Object d;

    public e(Object obj, Object obj2, boolean z10, int i9) {
        this.f1451a = i9;
        this.f1453c = obj;
        this.d = obj2;
        this.f1452b = z10;
    }

    @Override
    public Object a() {
        Object lambda$onCarHardwareResult$0;
        lambda$onCarHardwareResult$0 = ((CarResultStub) this.f1453c).lambda$onCarHardwareResult$0(this.f1452b, (w.b) this.d);
        return lambda$onCarHardwareResult$0;
    }

    @Override
    public void b(TLRPC.User user) {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f1453c;
        int[] iArr = (int[]) this.d;
        Pattern pattern = LaunchActivity.f35493x1;
        TLRPC.UserFull userFull = MessagesController.getInstance(launchActivity.K).getUserFull(user.f22527id);
        if (userFull != null && userFull.video_calls_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.n(user, this.f1452b, z10, launchActivity, userFull, AccountInstance.getInstance(iArr[0]));
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        ChatAttachAlertPhotoLayout.J((ChatAttachAlertPhotoLayout) this.f1453c, this.f1452b, (b6) this.d, view, i9);
    }

    @Override
    public l0 e(int i9, i1 i1Var, int[] iArr) {
        r rVar = (r) this.f1453c;
        j jVar = (j) this.d;
        rVar.getClass();
        f fVar = new f(rVar);
        o8.x xVar = o8.z.f19105b;
        o8.l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i11 < i1Var.f13481a) {
            int i12 = i9;
            i1 i1Var2 = i1Var;
            g gVar = new g(i12, i1Var2, i11, jVar, iArr[i11], this.f1452b, fVar);
            int i13 = i10 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i13));
            }
            objArr[i10] = gVar;
            i11++;
            i10 = i13;
            i9 = i12;
            i1Var = i1Var2;
        }
        return o8.z.s(i10, objArr);
    }

    @Override
    public void f(c2 c2Var, int i9) {
        boolean z10;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        switch (this.f1451a) {
            case 2:
                i9 i9Var = (i9) this.f1453c;
                boolean z11 = this.f1452b;
                boolean[] zArr = (boolean[]) this.d;
                if (z11) {
                    boolean z12 = zArr[0];
                    TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                    tL_messages_deletePhoneCallHistory.revoke = z12;
                    i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new o3(3, i9Var, z12));
                    i9Var.C.clear();
                    i9Var.D = false;
                    i9Var.F = true;
                    i9Var.B.setVisibility(8);
                    i9Var.d.U2.N(true);
                } else {
                    i9Var.getMessagesController().deleteMessages(new ArrayList<>(i9Var.H), null, null, 0L, 0, zArr[0], 0);
                }
                i9Var.j0(false);
                return;
            case 3:
                ((ba) this.f1453c).f36798a.i0((TLRPC.TL_username) this.d, this.f1452b, true);
                return;
            case 4:
                boolean z13 = this.f1452b;
                uo uoVar = ((so) this.f1453c).f42737a;
                uoVar.w1((TLRPC.TL_username) this.d, z13, true);
                uoVar.W2.U();
                return;
            case 5:
                o2 o2Var = (o2) this.f1453c;
                TLRPC.User user = (TLRPC.User) this.d;
                boolean z14 = this.f1452b;
                TLRPC.UserFull userFull = o2Var.getMessagesController().getUserFull(user.f22527id);
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.n(user, z14, z10, o2Var.getParentActivity(), userFull, o2Var.getAccountInstance());
                return;
            case 6:
            case 8:
            default:
                pf.x xVar = (pf.x) this.f1453c;
                boolean z15 = this.f1452b;
                l41 l41Var = (l41) this.d;
                if (!z15) {
                    arrayList2 = xVar.f45821k;
                } else {
                    arrayList2 = xVar.f45820j;
                }
                arrayList2.remove(Long.valueOf(l41Var.f30350x));
                xVar.f45816e.run();
                return;
            case 7:
                n00 n00Var = (n00) this.f1453c;
                e00 e00Var = (e00) this.d;
                boolean z16 = this.f1452b;
                int i10 = e00Var.f37772j;
                if (i10 > 0) {
                    n00Var.f40574y &= ~i10;
                } else {
                    if (z16) {
                        arrayList = n00Var.B;
                    } else {
                        arrayList = n00Var.C;
                    }
                    arrayList.remove(Long.valueOf(e00Var.h));
                }
                n00Var.i0();
                n00Var.v0();
                n00Var.h0(true);
                if (z16) {
                    n00Var.m0(1, false);
                    return;
                }
                return;
            case 9:
                boolean z17 = this.f1452b;
                String str2 = (String) this.f1453c;
                o2 o2Var2 = (o2) this.d;
                try {
                    PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
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
                    o2Var2.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var2.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
                    o2Var2.showDialog(alertDialog$Builder.f22702a);
                    return;
                }
            case 10:
                wm0 wm0Var = (wm0) this.f1453c;
                boolean z18 = this.f1452b;
                wm0Var.y1();
                wm0Var.j1((TLRPC.TL_secureRequiredType) this.d, null, null, true, new hl0(wm0Var, 4), new kl0(wm0Var, 6), z18);
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public Object then(Task task) {
        Context context = (Context) this.f1453c;
        Intent intent = (Intent) this.d;
        if (e6.b.d() && ((Integer) task.getResult()).intValue() == 402) {
            return com.google.firebase.messaging.i.a(context, intent, this.f1452b).continueWith(new gb0(1), new a9.b(14));
        }
        return task;
    }

    public e(Object obj, boolean z10, Object obj2, int i9) {
        this.f1451a = i9;
        this.f1453c = obj;
        this.f1452b = z10;
        this.d = obj2;
    }

    public e(String str, o2 o2Var, boolean z10) {
        this.f1451a = 9;
        this.f1452b = z10;
        this.f1453c = str;
        this.d = o2Var;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
