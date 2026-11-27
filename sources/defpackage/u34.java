package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class u34 implements OnCompleteListener, s69, fd, oj3, cka, tq2, t69, on5, qc6, jrb {
    public final byte a;
    public final Object b;
    public final Object c;

    public u34(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void a(hd6 hd6Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.C1;
        int i = hd6Var.h.K1;
        iArr[0] = i;
        launchActivity.N0(i);
        uc6 uc6Var = new uc6(2);
        uc6Var.G0(hd6Var.h);
        uc6Var.M0 = new i02(iArr, r47.B0(hd6Var.h.k), (byte) 8);
        launchActivity.t0(uc6Var);
    }

    @Override
    public final void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u34.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public final Object b0(am2 am2Var) {
        String str = (String) this.b;
        Context context = (Context) am2Var.a(Context.class);
        String str2 = "";
        switch (((su3) this.c).a) {
            case 24:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    str2 = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                break;
            case 25:
                str2 = FirebaseCommonRegistrar.a(context);
                break;
            case 26:
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    str2 = "tv";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    str2 = "watch";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    str2 = "auto";
                    break;
                } else if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    str2 = "embedded";
                    break;
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    str2 = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                break;
        }
        return new aa0(str, str2);
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        ((FiltersSetupActivity) this.b).d0((Context) this.c, view, i);
    }

    @Override
    public final boolean e(int i, View view) {
        uc6 uc6Var = (uc6) this.b;
        Context context = (Context) this.c;
        if (uc6Var.N0 == 2) {
            Object I = uc6Var.Q.I(i);
            if (I instanceof pc6) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                b8 b8Var = new b8(0, uc6Var.getResourceProvider(), uc6Var.getParentActivity(), true, true);
                b8Var.setMinimumWidth(hl.L(200.0f));
                b8Var.j(ob6.M0(2131750434, null), 2131231106, null);
                b8Var.setOnClickListener(new uv5(uc6Var, (pc6) I, (byte) 6));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                oc6 oc6Var = new oc6(uc6Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                uc6Var.P0 = oc6Var;
                oc6Var.setOutsideTouchable(true);
                uc6Var.P0.setClippingEnabled(true);
                uc6Var.P0.setInputMethodMode(2);
                uc6Var.P0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                uc6Var.P0.showAtLocation(view, 48, 0, iArr[1] - hl.L(52.0f));
                uc6Var.P0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((FirebaseMessagingService) obj2).a((Intent) obj);
                return;
            case 22:
                qa4 qa4Var = (qa4) obj;
                qh6 qh6Var = ((df6) obj2).a0;
                if (qh6Var.getParentActivity() != null) {
                    qh6Var.getParentActivity().startActivityForResult(qa4Var.h(), 200);
                    return;
                }
                return;
            case 25:
                qa4 qa4Var2 = (qa4) obj;
                qh6 qh6Var2 = ((fg6) obj2).F;
                if (qh6Var2.getParentActivity() != null && !qh6Var2.getParentActivity().isFinishing()) {
                    qh6Var2.getParentActivity().startActivityForResult(qa4Var2.h(), 200);
                    return;
                }
                return;
            default:
                ph6 ph6Var = (ph6) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                id idVar = ph6Var.c0;
                if (idVar != null) {
                    idVar.dismiss();
                    ph6Var.c0 = null;
                }
                if (ph6Var.b0 == cancellationTokenSource) {
                    ph6Var.b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        byte b = this.a;
        int i3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                rv4 rv4Var = (rv4) obj2;
                String str = (String) obj;
                rv4Var.getClass();
                long j = 0;
                while (i3 < arrayList.size()) {
                    j = ((jf7) arrayList.get(i3)).a;
                    rv4Var.e.getSendMessagesHelper().q0(p7a.b(str, j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i3++;
                }
                uj3Var.finishFragment();
                ym0.h(j);
                return true;
            default:
                ox5 ox5Var = (ox5) obj2;
                uj3 uj3Var2 = (uj3) obj;
                u51 u51Var = null;
                while (i3 < arrayList.size()) {
                    ArrayList arrayList2 = ox5Var.g0;
                    u51 u51Var2 = new u51(((jf7) arrayList.get(i3)).a, 3);
                    arrayList2.add(u51Var2);
                    i3++;
                    u51Var = u51Var2;
                }
                ox5Var.e0.h(ox5Var.d0, ox5Var.g0);
                Bundle bundle = new Bundle();
                bundle.putInt("type", ox5Var.d0);
                kx5 kx5Var = new kx5(bundle, uj3Var2);
                kx5Var.d = ox5Var.g0;
                kx5Var.Y();
                ox5Var.h0.presentFragment(kx5Var);
                hl.d3(new tg5(kx5Var, u51Var, (byte) 15), 150L);
                return true;
        }
    }

    @Override
    public final void run() {
        qm6 qm6Var = (qm6) this.b;
        qm6Var.T.set(qm6Var.A((ym4) this.c, qm6Var.N, 0));
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap h0;
        uc6 uc6Var = (uc6) this.b;
        pc6 pc6Var = (pc6) this.c;
        if (z && !z2 && pc6Var.e != null && (h0 = uc6Var.h0(pc6Var)) != null) {
            pc6Var.e.a.a(usd.a(h0));
        }
    }

    @Override
    public final void w(id idVar, int i) {
        ConferenceCall conferenceCall;
        byte b = this.a;
        id idVar2 = null;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                ih4 ih4Var = (ih4) obj2;
                ac7 ac7Var = (ac7) obj;
                FiltersSetupActivity filtersSetupActivity = ih4Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    id idVar3 = new id(3, null, filtersSetupActivity.getParentActivity());
                    idVar3.j0 = false;
                    idVar3.show();
                    idVar2 = idVar3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = ac7Var.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new fn0(ih4Var, idVar2, ac7Var, (byte) 25));
                return;
            case 5:
                j95 j95Var = (j95) obj2;
                TLObject tLObject = (TLObject) obj;
                k5 k5Var = j95Var.n1;
                if (j95Var.h1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        vc2 vc2Var = j95Var.T2;
                        long j = user.id;
                        ArrayList arrayList = vc2Var.o;
                        if (!arrayList.contains(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                            vc2Var.B();
                            jn7.f(vc2Var.C.a).k(167, Long.valueOf(vc2Var.c), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
                        }
                        j95Var.d1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    uc7.s1(k5Var.a).d0(j95Var.a1(), user2);
                    j95Var.d1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    uc7.s1(k5Var.a).e0(j95Var.a1(), null, chat, false, false);
                    j95Var.d1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 6:
                rc5 rc5Var = (rc5) obj2;
                rc5Var.y.d((TLRPC.User) obj);
                if (rc5Var.f.r.length() > 0) {
                    rc5Var.f.r.setText((CharSequence) null);
                    return;
                }
                return;
            case 7:
                rc5 rc5Var2 = (rc5) obj2;
                sg2 sg2Var = ((sg2[]) obj)[0];
                if (sg2Var != null && sg2Var.b()) {
                    i2 = 100;
                }
                rc5Var2.p0(i2);
                return;
            case 8:
                we5 we5Var = (we5) obj2;
                df5 a = df5.a(we5Var.a);
                ArrayList arrayList2 = a.f;
                int indexOf = arrayList2.indexOf((String) obj);
                if (indexOf != -1) {
                    arrayList2.remove(indexOf);
                    a.d();
                }
                we5Var.f.O(true);
                return;
            case 10:
                ((LanguageSelectActivity) obj2).i0((mb6) obj);
                return;
            case 11:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((qh6) obj);
                return;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                ob6.D0().d(((mb6[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                return;
            case 17:
                l46 l46Var = (l46) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                l46Var.dismiss();
                while (i2 < arrayList3.size()) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = uc7.i1((TLRPC.Chat) arrayList3.get(i2));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(l46Var.a).sendRequest(tL_channels_updateUsername, new v36(l46Var, (byte) 1), 64);
                    i2++;
                }
                return;
            case 23:
                ((if6) obj2).H.C1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 24:
                lf6 lf6Var = (lf6) obj2;
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", lf6Var.r);
                bundle.putString("requestPhone", lf6Var.s);
                bundle.putString("phoneHash", lf6Var.w);
                bundle.putString("phoneCode", lf6Var.x);
                lf6Var.E.J1(7, true, bundle, false);
                return;
            case 26:
                ((tg6) obj2).u((Context) obj);
                return;
            default:
                ph6 ph6Var = (ph6) obj2;
                ((boolean[]) obj)[0] = true;
                if (ph6Var.o()) {
                    ic icVar = new ic((byte) 0);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    ph6Var.b0 = cancellationTokenSource;
                    Context context = ph6Var.getContext();
                    int k1 = qh6.k1(ph6Var.h0);
                    CancellationToken token = cancellationTokenSource.getToken();
                    z56 z56Var = new z56(ph6Var, cancellationTokenSource, (byte) 24);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    context.getClass();
                    vj0 vj0Var = new vj0(context, (byte) 1);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new lu3(runnableArr, (byte) 21));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = f11.d;
                    tL_auth_initFirebasePnvLogin.api_hash = f11.e;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i3 = 0; i3 < 4; i3++) {
                        yac h = yac.h(i3);
                        if (h.o()) {
                            arrayList4.add(Long.valueOf(h.e()));
                        }
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList4;
                    runnableArr[0] = new zs2(k1, ConnectionsManager.getInstance(k1).sendRequestTyped(tL_auth_initFirebasePnvLogin, new ic((byte) 0), new bj4(token, taskCompletionSource, runnableArr, vj0Var, context, z56Var, k1), 8), (byte) 2);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(icVar, new u34(ph6Var, cancellationTokenSource, (byte) 28)).addOnSuccessListener(icVar, new kh6(ph6Var)).addOnFailureListener(icVar, new kh6(ph6Var));
                    return;
                }
                return;
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
