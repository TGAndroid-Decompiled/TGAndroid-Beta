package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class h45 implements ed, wi3, jga, aq2, e39, ll5, ma6, OnCompleteListener, jnb, pk6, mx, us2, lx6 {
    public final byte a;
    public final Object b;
    public final Object c;

    public h45(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap h0;
        qa6 qa6Var = (qa6) this.b;
        la6 la6Var = (la6) this.c;
        if (z && !z2 && la6Var.e != null && (h0 = qa6Var.h0(la6Var)) != null) {
            la6Var.e.a.a(eod.a(h0));
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final Object L(gl2 gl2Var) {
        String str = (String) this.b;
        Context context = (Context) gl2Var.a(Context.class);
        String str2 = "";
        switch (((w44) this.c).a) {
            case 12:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    str2 = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                break;
            case 13:
                str2 = FirebaseCommonRegistrar.a(context);
                break;
            case 14:
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
        return new y90(str, str2);
    }

    @Override
    public final int a(Object obj) {
        Context context = (Context) this.b;
        fm4 fm4Var = (fm4) this.c;
        ik6 ik6Var = (ik6) obj;
        String str = ik6Var.b;
        if ((!str.equals(fm4Var.t) && !str.equals(qk6.c(fm4Var))) || !ik6Var.c(context, fm4Var, false) || !ik6Var.d(fm4Var)) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        ox6 ox6Var = (ox6) this.b;
        switch (b) {
            case 27:
                byb bybVar = (byb) obj2;
                ad8 ad8Var = (ad8) obj;
                qm5 qm5Var = bybVar.H;
                if (!qm5Var.isEmpty()) {
                    ayb c = bybVar.a().c();
                    v5c n = qm5Var.values().n();
                    while (n.hasNext()) {
                        yxb yxbVar = (yxb) n.next();
                        sxb sxbVar = (sxb) ox6Var.d.n.get(yxbVar.a.b);
                        if (sxbVar != null && yxbVar.a.a == sxbVar.a) {
                            c.a(new yxb(sxbVar, yxbVar.b));
                        } else {
                            c.a(yxbVar);
                        }
                    }
                    bybVar = c.b();
                }
                ad8Var.M(bybVar);
                return;
            default:
                Surface surface = (Surface) obj2;
                ad8 ad8Var2 = (ad8) obj;
                ((tv6) ox6Var.a.get()).getClass();
                if (surface == null) {
                    ad8Var2.Q(null);
                    ox6Var.n = null;
                    return;
                }
                mx6 mx6Var = new mx6(surface);
                ox6Var.n = mx6Var;
                ad8Var2.Q(mx6Var);
                return;
        }
    }

    @Override
    public final t56 mo15apply(Object obj) {
        qu6 qu6Var = (qu6) obj;
        ((tv6) this.b).s((su6) this.c, qu6Var);
        return jie.c(qu6Var);
    }

    @Override
    public final void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h45.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public final boolean d(int i, View view) {
        qa6 qa6Var = (qa6) this.b;
        Context context = (Context) this.c;
        if (qa6Var.N0 == 2) {
            Object I = qa6Var.Q.I(i);
            if (I instanceof la6) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                a8 a8Var = new a8(0, qa6Var.getResourceProvider(), qa6Var.getParentActivity(), true, true);
                a8Var.setMinimumWidth(gl.L(200.0f));
                a8Var.j(k96.M0(2131750457, null), 2131231106, null);
                a8Var.setOnClickListener(new v16(qa6Var, (la6) I, (byte) 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                ka6 ka6Var = new ka6(qa6Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                qa6Var.P0 = ka6Var;
                ka6Var.setOutsideTouchable(true);
                qa6Var.P0.setClippingEnabled(true);
                qa6Var.P0.setInputMethodMode(2);
                qa6Var.P0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                qa6Var.P0.showAtLocation(view, 48, 0, iArr[1] - gl.L(52.0f));
                qa6Var.P0.b();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void e(db6 db6Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.C1;
        int i = db6Var.h.K1;
        iArr[0] = i;
        launchActivity.N0(i);
        qa6 qa6Var = new qa6(2);
        qa6Var.F0(db6Var.h);
        qa6Var.M0 = new rz1(iArr, k27.B0(db6Var.h.k), (byte) 8);
        launchActivity.t0(qa6Var);
    }

    @Override
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 17:
                u84 u84Var = (u84) obj;
                mf6 mf6Var = ((ad6) obj2).a0;
                if (mf6Var.getParentActivity() != null) {
                    mf6Var.getParentActivity().startActivityForResult(u84Var.h(), 200);
                    return;
                }
                return;
            case 20:
                u84 u84Var2 = (u84) obj;
                mf6 mf6Var2 = ((de6) obj2).F;
                if (mf6Var2.getParentActivity() != null && !mf6Var2.getParentActivity().isFinishing()) {
                    mf6Var2.getParentActivity().startActivityForResult(u84Var2.h(), 200);
                    return;
                }
                return;
            default:
                lf6 lf6Var = (lf6) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                hd hdVar = lf6Var.c0;
                if (hdVar != null) {
                    hdVar.dismiss();
                    lf6Var.c0 = null;
                }
                if (lf6Var.b0 == cancellationTokenSource) {
                    lf6Var.b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        lx6 lx6Var = (lx6) this.b;
        yw6 yw6Var = (yw6) this.c;
        if (tv6Var.i()) {
            return jie.c(new o6a(-100));
        }
        return g8c.h0((t56) lx6Var.p(tv6Var, su6Var, i), new lt2(tv6Var, su6Var, yw6Var, (byte) 16));
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        jv5 jv5Var = (jv5) this.b;
        cj3 cj3Var2 = (cj3) this.c;
        m51 m51Var = null;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            ArrayList arrayList2 = jv5Var.g0;
            m51 m51Var2 = new m51(((zc7) arrayList.get(i3)).a, 3);
            arrayList2.add(m51Var2);
            i3++;
            m51Var = m51Var2;
        }
        jv5Var.e0.h(jv5Var.d0, jv5Var.g0);
        Bundle bundle = new Bundle();
        bundle.putInt("type", jv5Var.d0);
        fv5 fv5Var = new fv5(bundle, cj3Var2);
        fv5Var.d = jv5Var.g0;
        fv5Var.Y();
        jv5Var.h0.presentFragment(fv5Var);
        gl.d3(new hb5(fv5Var, m51Var, (byte) 18), 150L);
        return true;
    }

    @Override
    public final void run() {
        lk6 lk6Var = (lk6) this.b;
        lk6Var.T.set(lk6Var.A((sk4) this.c, lk6Var.N, 0));
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        ConferenceCall conferenceCall;
        byte b = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                h75 h75Var = (h75) obj2;
                TLObject tLObject = (TLObject) obj;
                j5 j5Var = h75Var.n1;
                if (h75Var.g1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        fc2 fc2Var = h75Var.T2;
                        long j = user.id;
                        ArrayList arrayList = fc2Var.o;
                        if (!arrayList.contains(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                            fc2Var.B();
                            kk7.f(fc2Var.C.a).k(166, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
                        }
                        h75Var.c1().k(0L, 102, user, null, null, null);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    na7.q1(j5Var.a).b0(h75Var.Z0(), user2);
                    h75Var.c1().k(0L, 32, user2, null, null, null);
                    return;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    na7.q1(j5Var.a).c0(h75Var.Z0(), null, chat, false, false);
                    h75Var.c1().k(0L, 32, chat, null, null, null);
                    return;
                }
            case 1:
                qa5 qa5Var = (qa5) obj2;
                qa5Var.y.e((TLRPC.User) obj);
                if (qa5Var.f.r.length() > 0) {
                    qa5Var.f.r.setText((CharSequence) null);
                    return;
                }
                return;
            case 2:
                qa5 qa5Var2 = (qa5) obj2;
                ag2 ag2Var = ((ag2[]) obj)[0];
                if (ag2Var != null && ag2Var.b()) {
                    i2 = 100;
                }
                qa5Var2.p0(i2);
                return;
            case 3:
                vc5 vc5Var = (vc5) obj2;
                cd5 a = cd5.a(vc5Var.a);
                ArrayList arrayList2 = a.f;
                int indexOf = arrayList2.indexOf((String) obj);
                if (indexOf != -1) {
                    arrayList2.remove(indexOf);
                    a.d();
                }
                vc5Var.f.O(true);
                return;
            case 5:
                ((LanguageSelectActivity) obj2).i0((i96) obj);
                return;
            case 6:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((mf6) obj);
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                k96.D0().d(((i96[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                return;
            case 12:
                h26 h26Var = (h26) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                h26Var.dismiss();
                while (i2 < arrayList3.size()) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = na7.g1((TLRPC.Chat) arrayList3.get(i2));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(h26Var.a).sendRequest(tL_channels_updateUsername, new r16(h26Var, (byte) 1), 64);
                    i2++;
                }
                return;
            case 18:
                ((gd6) obj2).H.B1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                return;
            case 19:
                jd6 jd6Var = (jd6) obj2;
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", jd6Var.r);
                bundle.putString("requestPhone", jd6Var.s);
                bundle.putString("phoneHash", jd6Var.w);
                bundle.putString("phoneCode", jd6Var.x);
                jd6Var.E.I1(7, true, bundle, false);
                return;
            case 21:
                ((qe6) obj2).u((Context) obj);
                return;
            default:
                lf6 lf6Var = (lf6) obj2;
                ((boolean[]) obj)[0] = true;
                if (lf6Var.o()) {
                    hc hcVar = new hc((byte) 0);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    lf6Var.b0 = cancellationTokenSource;
                    Context context = lf6Var.getContext();
                    int d1 = mf6.d1(lf6Var.h0);
                    CancellationToken token = cancellationTokenSource.getToken();
                    kz5 kz5Var = new kz5(lf6Var, cancellationTokenSource, (byte) 27);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    context.getClass();
                    p13 p13Var = new p13(context, (byte) 0);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new kx3(runnableArr, (byte) 18));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = w01.d;
                    tL_auth_initFirebasePnvLogin.api_hash = w01.e;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i3 = 0; i3 < 4; i3++) {
                        y6c h = y6c.h(i3);
                        if (h.o()) {
                            arrayList4.add(Long.valueOf(h.e()));
                        }
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList4;
                    runnableArr[0] = new gs2(d1, ConnectionsManager.getInstance(d1).sendRequestTyped(tL_auth_initFirebasePnvLogin, new hc((byte) 0), new ah4(token, taskCompletionSource, runnableArr, p13Var, context, kz5Var, d1), 8), (byte) 2);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(hcVar, new h45(lf6Var, cancellationTokenSource, (byte) 23)).addOnSuccessListener(hcVar, new gf6(lf6Var)).addOnFailureListener(hcVar, new gf6(lf6Var));
                    return;
                }
                return;
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
