package a1;

import a4.k;
import a4.l;
import ai.f0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import bi.a1;
import bi.ad;
import bi.ce;
import bi.e7;
import bi.g1;
import bi.i8;
import bi.m8;
import bi.nd;
import bi.oc;
import bi.qc;
import bi.qd;
import bi.r9;
import bi.s;
import bi.sb;
import bi.sc;
import bi.v;
import bi.w1;
import bi.wb;
import bi.wc;
import bi.y2;
import c3.u;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.z;
import di.i5;
import di.m;
import e2.d0;
import fg.s1;
import gg.h2;
import gg.j2;
import gg.k2;
import gg.l1;
import gg.m1;
import gg.n2;
import gg.o1;
import gg.y1;
import h2.i;
import h2.j;
import hi.b0;
import hi.g3;
import hi.i6;
import hi.k1;
import hi.w0;
import hi.z3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import og.x1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.xk0;
public final class c implements OnSuccessListener, i, Utilities.Callback2Return, ll0, c2, xk0, Utilities.Callback5, x1, CameraController.VideoTakeCallback, Continuation, OnCompleteListener, c3.g, du {
    public final int f34a;
    public final Object f35b;

    public c(Object obj, int i10) {
        this.f34a = i10;
        this.f35b = obj;
    }

    @Override
    public void a() {
        ((w1) this.f35b).invalidate();
    }

    @Override
    public long b(long j3) {
        u uVar = (u) this.f35b;
        return d0.i((j3 * uVar.e) / 1000000, 0L, uVar.f4222j - 1);
    }

    @Override
    public void c(j jVar) {
        k kVar = (k) jVar;
        kVar.clear();
        ((l) this.f35b).f268b.add(kVar);
    }

    @Override
    public boolean d(int r6, android.view.View r7) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.d(int, android.view.View):boolean");
    }

    @Override
    public void e() {
        float f7;
        ad adVar = (ad) this.f35b;
        TextView textView = adVar.f3526o1;
        boolean a2 = adVar.D0.a();
        ImageView imageView = adVar.f3524n1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f34a) {
            case 4:
                ce ceVar = ((qd) ((v) this.f35b)).S1;
                nd ndVar = ceVar.X0;
                if (ndVar != null) {
                    ndVar.s(null, null, true);
                }
                ad adVar = ceVar.f2498v1;
                if (adVar != null) {
                    adVar.q0();
                }
                qd qdVar = ceVar.f2439c1;
                if (qdVar != null) {
                    qdVar.setHasRoundVideo(false);
                }
                r9 r9Var = ceVar.K1;
                if (r9Var != null) {
                    File file = r9Var.f3589o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        ceVar.K1.f3589o0 = null;
                    }
                    if (ceVar.K1.f3591p0 != null) {
                        try {
                            new File(ceVar.K1.f3591p0).delete();
                        } catch (Exception unused2) {
                        }
                        ceVar.K1.f3591p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((e7) this.f35b).f2630a.f3529p2.r();
                return;
            case 18:
                ((di.e) this.f35b).run();
                return;
            case 19:
                m mVar = (m) this.f35b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = mVar.getMessagesController().getInputUser(mVar.P);
                updatestarrefprogram.commission_permille = 0;
                d2 d2Var2 = new d2(mVar.getParentActivity(), 3, null);
                d2Var2.q(150L);
                mVar.getConnectionsManager().sendRequest(updatestarrefprogram, new di.b(mVar, d2Var2, 0));
                return;
            default:
                h2 h2Var = ((y1) this.f35b).f9100a;
                k2 f7 = k2.f(h2.b0(h2Var));
                ArrayList arrayList = h2Var.f8905b;
                int i11 = f7.f8937a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f7.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        j2 c10 = f7.c(((Integer) arrayList.get(i13)).intValue());
                        f7.f8938b.remove(c10);
                        f7.a(c10.f8918b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f8917a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new g1(2));
                        if ("hello".equals(c10.f8918b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f8918b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f7.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                    messagesStorage.getStorageQueue().postRunnable(new a1(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                h2.X(h2Var);
                return;
        }
    }

    public void g(int i10) {
        b0 b0Var = (b0) this.f35b;
        b0Var.f9466c = i10;
        b0Var.f(i10);
    }

    @Override
    public void j() {
        w0 w0Var = (w0) this.f35b;
        k1 k1Var = w0Var.d;
        hi.a aVar = w0Var.f9921f;
        if (aVar != null) {
            aVar.f9435s = true;
            aVar.f9434r = k1Var.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f9421b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = i6.f(k1Var.getText());
            }
        }
        g3 g3Var = w0Var.h;
        if (g3Var != null && w0Var.f9921f != null) {
            z3.N1(g3Var.f9614a);
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34a) {
            case 14:
                c0.b((Intent) this.f35b);
                return;
            case 15:
                ((e0) this.f35b).f6082b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f35b).cancel(false);
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        sc scVar = (sc) this.f35b;
        ce ceVar = scVar.f3660a;
        m8 m8Var = ceVar.O0;
        int i10 = ceVar.f2437c;
        if (m8Var != null) {
            m8Var.g(true);
        }
        if (ceVar.q0()) {
            ceVar.f2487s.d();
        }
        if (ceVar.G1 != null && ceVar.B0 != null) {
            ceVar.Q1 = false;
            ceVar.R1 = false;
            i8 i8Var = ceVar.C0;
            if (i8Var != null) {
                i8Var.c(false);
            }
            if (j3 <= 800) {
                ceVar.h(false, true);
                ceVar.d0(false);
                ceVar.J0.b(false, true);
                m8 m8Var2 = ceVar.O0;
                if (m8Var2 != null) {
                    m8Var2.g(true);
                }
                try {
                    ceVar.G1.delete();
                    ceVar.G1 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            }
            ceVar.i0(false, true);
            r9 o9 = r9.o(ceVar.G1, str, j3);
            o9.J0 = ceVar.f2497v0;
            o9.K0 = ceVar.f2501w0;
            o9.B();
            ceVar.h(false, true);
            ceVar.d0(false);
            ceVar.J0.b(false, true);
            m8 m8Var3 = ceVar.O0;
            if (m8Var3 != null) {
                m8Var3.g(true);
            }
            if (ceVar.A0.j()) {
                ceVar.G1 = null;
                o9.P = 1.0f;
                if (ceVar.A0.l(o9)) {
                    r9 a2 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
                    ceVar.K1 = a2;
                    sb.a(i10, a2);
                    ceVar.L1 = false;
                    int videoWidth = ceVar.B0.getVideoWidth();
                    int videoHeight = ceVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        r9 r9Var = ceVar.K1;
                        r9Var.f3582k0 = videoWidth;
                        r9Var.f3584l0 = videoHeight;
                        r9Var.A();
                    }
                }
                ceVar.m0(true);
                return;
            }
            ceVar.K1 = o9;
            sb.a(i10, o9);
            ceVar.L1 = false;
            int videoWidth2 = ceVar.B0.getVideoWidth();
            int videoHeight2 = ceVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                r9 r9Var2 = ceVar.K1;
                r9Var2.f3582k0 = videoWidth2;
                r9Var2.f3584l0 = videoHeight2;
                r9Var2.A();
            }
            ceVar.L(new qc(scVar, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f34a) {
            case 0:
                ((f) this.f35b).invoke(obj);
                return;
            case 11:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 12:
                z zVar = (z) obj;
                if (((FirebaseMessaging) this.f35b).e.n() && zVar.h.a() != null) {
                    synchronized (zVar) {
                        z10 = zVar.f6142g;
                    }
                    if (!z10) {
                        zVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 21:
                ((e1.b) this.f35b).invoke(obj);
                return;
            default:
                ((e1.b) this.f35b).invoke(obj);
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.f34a) {
            case 7:
                oc ocVar = (oc) this.f35b;
                v51 v51Var = (v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = v51Var.d;
                r9 r9Var = (r9) v51Var.G;
                ocVar.c(false, true);
                ce ceVar = ocVar.O;
                if (r9Var == ceVar.K1 || ceVar.X1) {
                    return;
                }
                ceVar.f2442d1.setSelected(i11);
                ceVar.X1 = true;
                s sVar = new s(ceVar, i11, 4);
                ad adVar = ceVar.f2498v1;
                r9 r9Var2 = ceVar.K1;
                if (adVar != null && r9Var2 != null) {
                    if (!adVar.u0()) {
                        sVar.run();
                        return;
                    }
                    r9Var2.f();
                    Utilities.searchQueue.postRunnable(new wb(ceVar, adVar, r9Var2.f3578i0, r9Var2.f3580j0, r9Var2, adVar.O0.getPainting().E, adVar.u0(), sVar, 0));
                    return;
                }
                sVar.run();
                return;
            case 20:
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((i5) this.f35b).V((v51) obj);
                return;
            case 23:
                m1 m1Var = (m1) this.f35b;
                v51 v51Var2 = (v51) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = v51Var2.d;
                if (i12 == -1) {
                    boolean z10 = !m1Var.e;
                    m1Var.e = z10;
                    ((x8) view3).setChecked(z10);
                    m1Var.f8948a.Y2.N(true);
                    m1Var.Y(true);
                    return;
                } else if (i12 == -2) {
                    ?? p2Var = new p2(null);
                    p2Var.f8975n = m1Var.f8953r;
                    p2Var.f8973c = new y2(17, m1Var, view3);
                    m1Var.presentFragment((p2) p2Var);
                    return;
                } else if (v51Var2.f14046a != 5 || i12 < 0 || i12 >= m1Var.h.length) {
                    return;
                } else {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (m1Var.h[v51Var2.d].isEmpty()) {
                            ((j5) view3).setChecked(true);
                            m1Var.h[v51Var2.d].add(new l1(0, 1439));
                            m1Var.X(v51Var2.d);
                        } else {
                            m1Var.h[v51Var2.d].clear();
                            ((j5) view3).setChecked(false);
                        }
                        ((j5) view3).setValue(m1.a0(m1Var.h[v51Var2.d]));
                        m1Var.Y(true);
                        return;
                    }
                    int i13 = (v51Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < m1Var.h[i13].size(); i15++) {
                        if (((l1) m1Var.h[i13].get(i15)).f8946b > i14) {
                            i14 = ((l1) m1Var.h[i13].get(i15)).f8946b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (v51Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < m1Var.h[i16].size(); i18++) {
                        if (((l1) m1Var.h[i16].get(i18)).f8945a < i17) {
                            i17 = ((l1) m1Var.h[i16].get(i18)).f8945a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = v51Var2.f27829l;
                    ArrayList arrayList = m1Var.h[v51Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = m1Var.h[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    o1 o1Var = new o1(charSequence, arrayList, max, i19, 28 - i20);
                    o1Var.f8984f = new wc(m1Var, 29);
                    o1Var.h = new s1(5, m1Var, v51Var2);
                    m1Var.presentFragment(o1Var);
                    return;
                }
            case 24:
                final o1 o1Var2 = (o1) this.f35b;
                v51 v51Var3 = (v51) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i22 = o1Var2.f8983c;
                int i23 = o1Var2.d;
                ArrayList arrayList3 = o1Var2.f8982b;
                int i24 = v51Var3.d;
                if (i24 == -1) {
                    o1Var2.f8986r = !o1Var2.f8986r;
                    arrayList3.clear();
                    if (o1Var2.f8986r) {
                        arrayList3.add(new l1(0, 1439));
                    }
                    x8 x8Var = (x8) view4;
                    boolean z11 = o1Var2.f8986r;
                    v51Var3.e = z11;
                    x8Var.setChecked(z11);
                    boolean z12 = o1Var2.f8986r;
                    x8Var.b(j6.w0(null, z12 ? j6.f17964f6 : j6.f17946e6, false), z12);
                    o1Var2.f8985n.Y2.N(true);
                    wc wcVar = o1Var2.f8984f;
                    if (wcVar != null) {
                        wcVar.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !o1Var2.U()) {
                        int i25 = ((l1) hc.b.i(1, arrayList3)).f8946b;
                        int clamp = Utilities.clamp(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new l1(clamp, Utilities.clamp((i25 + 1560) / 2, i23, clamp + 1)));
                    } else {
                        if (o1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i23 - 1, i22);
                        arrayList3.add(new l1(clamp2, Utilities.clamp(1200, i23, clamp2 + 1)));
                    }
                    wc wcVar2 = o1Var2.f8984f;
                    if (wcVar2 != null) {
                        wcVar2.run();
                    }
                    o1Var2.f8985n.Y2.N(true);
                    return;
                } else if (v51Var3.f14046a != 3 || (i10 = i24 / 3) < 0 || i10 >= arrayList3.size()) {
                    return;
                } else {
                    int i26 = i10 - 1;
                    l1 l1Var = i26 >= 0 ? (l1) arrayList3.get(i26) : null;
                    final l1 l1Var2 = (l1) arrayList3.get(i10);
                    int i27 = i10 + 1;
                    l1 l1Var3 = i27 < arrayList3.size() ? (l1) arrayList3.get(i27) : null;
                    int i28 = v51Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = o1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i29 = l1Var2.f8945a;
                        if (l1Var != null) {
                            i22 = l1Var.f8946b + 1;
                        }
                        d5.X(parentActivity, string, i29, i22, l1Var2.f8946b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        o1 o1Var3 = o1Var2;
                                        boolean V = o1Var3.V();
                                        int intValue = num.intValue();
                                        l1Var2.f8945a = intValue;
                                        ((s8) view4).u(l1.a(intValue), true);
                                        if (V != o1Var3.V()) {
                                            o1Var3.f8985n.Y2.N(true);
                                        }
                                        wc wcVar3 = o1Var3.f8984f;
                                        if (wcVar3 != null) {
                                            wcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        o1 o1Var4 = o1Var2;
                                        boolean V2 = o1Var4.V();
                                        int intValue2 = num.intValue();
                                        l1Var2.f8946b = intValue2;
                                        ((s8) view4).u(l1.a(intValue2), true);
                                        if (V2 != o1Var4.V()) {
                                            o1Var4.f8985n.Y2.N(true);
                                        }
                                        wc wcVar4 = o1Var4.f8984f;
                                        if (wcVar4 != null) {
                                            wcVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = o1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = l1Var2.f8946b;
                        int i31 = l1Var2.f8945a + 1;
                        if (l1Var3 != null) {
                            i23 = l1Var3.f8945a - 1;
                        }
                        d5.X(parentActivity2, string2, i30, i31, i23, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        o1 o1Var3 = o1Var2;
                                        boolean V = o1Var3.V();
                                        int intValue = num.intValue();
                                        l1Var2.f8945a = intValue;
                                        ((s8) view4).u(l1.a(intValue), true);
                                        if (V != o1Var3.V()) {
                                            o1Var3.f8985n.Y2.N(true);
                                        }
                                        wc wcVar3 = o1Var3.f8984f;
                                        if (wcVar3 != null) {
                                            wcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        o1 o1Var4 = o1Var2;
                                        boolean V2 = o1Var4.V();
                                        int intValue2 = num.intValue();
                                        l1Var2.f8946b = intValue2;
                                        ((s8) view4).u(l1.a(intValue2), true);
                                        if (V2 != o1Var4.V()) {
                                            o1Var4.f8985n.Y2.N(true);
                                        }
                                        wc wcVar4 = o1Var4.f8984f;
                                        if (wcVar4 != null) {
                                            wcVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new l1(0, 1439));
                        }
                        o1Var2.f8985n.Y2.N(true);
                        wc wcVar3 = o1Var2.f8984f;
                        if (wcVar3 != null) {
                            wcVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                n2.U((n2) this.f35b, (v51) obj, (View) obj2);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        ((n) this.f35b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override
    public Object run(Object obj, Object obj2) {
        vr0 vr0Var = (vr0) this.f35b;
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == -1) {
            new f0(vr0Var.f442a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ai.b(vr0Var, 0)).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
