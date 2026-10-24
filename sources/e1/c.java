package e1;

import android.app.Activity;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import b2.d1;
import b2.f;
import b2.t0;
import b2.t1;
import b2.y0;
import c3.g;
import ci.d6;
import com.google.android.gms.tasks.OnSuccessListener;
import e2.m0;
import e2.o;
import e2.x;
import e9.l1;
import e9.q1;
import e9.s;
import ei.a8;
import ei.bc;
import ei.jb;
import ei.lb;
import ei.m3;
import ei.ma;
import ei.o1;
import ei.oa;
import ei.q3;
import ei.qa;
import ei.r;
import ei.s9;
import ei.u5;
import ei.v6;
import ei.vb;
import ei.w0;
import ei.w9;
import ei.xa;
import ei.z6;
import f2.w;
import gi.l;
import gi.s4;
import hi.t;
import i2.b0;
import ig.e1;
import ig.g1;
import ig.n1;
import ig.w1;
import ig.y1;
import j4.c0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nl0;
import qg.u1;
import u2.d0;
import u2.v;
public final class c implements OnSuccessListener, l1, z1, nl0, bm0, Utilities.Callback5, u1, CameraController.VideoTakeCallback, g, o, w {
    public final int f8185a;
    public final Object f8186b;

    public c(j2.a aVar, Object obj, int i10) {
        this.f8185a = i10;
        this.f8186b = obj;
    }

    @Override
    public void a() {
        ((o1) this.f8186b).invalidate();
    }

    @Override
    public void b(long j10, x xVar) {
        switch (this.f8185a) {
            case 28:
                c3.b.c(j10, xVar, ((c0) this.f8186b).f14049c);
                return;
            default:
                c3.b.d(j10, xVar, ((c0) this.f8186b).f14049c);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        q3 q3Var = (q3) this.f8186b;
        ArrayList arrayList = q3Var.f9640b0;
        ArrayList arrayList2 = q3Var.f9648h0;
        if (i10 >= 2 && q3Var.W != null && (view instanceof m3)) {
            int i11 = i10 - 2;
            if (q3Var.f9642c0) {
                if (i11 != 0) {
                    i11 = i10 - 3;
                } else {
                    return false;
                }
            } else if (q3Var.f9643d0) {
                if (i11 < 0 || i11 >= arrayList.size()) {
                    i11 -= arrayList.size();
                } else {
                    return false;
                }
            }
            if (i11 >= 0 && i11 < q3Var.f9646f0.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f9646f0.get(i11);
                if (arrayList2.isEmpty() && !q3Var.Q) {
                    if (arrayList2.contains(photoEntry)) {
                        arrayList2.remove(photoEntry);
                    } else if (arrayList2.size() + 1 > q3Var.R) {
                        int i12 = -q3Var.N;
                        q3Var.N = i12;
                        AndroidUtilities.shakeViewSpring(view, i12);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return true;
                    } else {
                        arrayList2.add(photoEntry);
                    }
                    AndroidUtilities.updateVisibleRows(q3Var.d);
                    q3Var.j();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public void e() {
        float f7;
        xa xaVar = (xa) this.f8186b;
        TextView textView = xaVar.f9036o1;
        boolean a2 = xaVar.D0.a();
        ImageView imageView = xaVar.f9034n1;
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
    public void g(c2 c2Var, int i10) {
        switch (this.f8185a) {
            case 2:
                vb vbVar = ((lb) ((r) this.f8186b)).S1;
                jb jbVar = vbVar.X0;
                if (jbVar != null) {
                    jbVar.s(null, null, true);
                }
                xa xaVar = vbVar.f10032v1;
                if (xaVar != null) {
                    xaVar.o0();
                }
                lb lbVar = vbVar.f9973c1;
                if (lbVar != null) {
                    lbVar.setHasRoundVideo(false);
                }
                a8 a8Var = vbVar.K1;
                if (a8Var != null) {
                    File file = a8Var.f8733o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        vbVar.K1.f8733o0 = null;
                    }
                    if (vbVar.K1.f8735p0 != null) {
                        try {
                            new File(vbVar.K1.f8735p0).delete();
                        } catch (Exception unused2) {
                        }
                        vbVar.K1.f8735p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((u5) this.f8186b).f9907a.f9039p2.s();
                return;
            case 10:
                ((gi.e) this.f8186b).run();
                return;
            case 11:
                l lVar = (l) this.f8186b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.R);
                updatestarrefprogram.commission_permille = 0;
                c2 c2Var2 = new c2(lVar.getParentActivity(), 3, null);
                c2Var2.r(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new gi.b(lVar, c2Var2, 0));
                return;
            default:
                w1 w1Var = ((n1) this.f8186b).f13009a;
                ig.z1 f7 = ig.z1.f(w1.b0(w1Var));
                ArrayList arrayList = w1Var.f13113b;
                int i11 = f7.f13138a;
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
                        y1 c10 = f7.c(((Integer) arrayList.get(i13)).intValue());
                        f7.f13139b.remove(c10);
                        f7.a(c10.f13130b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f13129a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new d6(6));
                        if ("hello".equals(c10.f13130b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f13130b)) {
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
                    messagesStorage.getStorageQueue().postRunnable(new w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                w1.X(w1Var);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8185a) {
            case 14:
                ((d1) obj).onAudioAttributesChanged((f) this.f8186b);
                return;
            case 15:
                ((d1) obj).onTrackSelectionParametersChanged((t1) this.f8186b);
                return;
            case 16:
                ((d1) obj).onCues((d2.c) this.f8186b);
                return;
            case 17:
                ((d1) obj).onMediaMetadataChanged(((b0) this.f8186b).f12353a.Q);
                return;
            case 18:
                ((d1) obj).onMetadata((t0) this.f8186b);
                return;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                ((j2.b) obj).b((d0) this.f8186b);
                return;
            case 24:
                ((j2.b) obj).h((y0) this.f8186b);
                return;
            case 25:
                ((j2.b) obj).onSeekStarted((j2.a) this.f8186b);
                return;
            case 26:
                ((j2.b) obj).a((i2.e) this.f8186b);
                return;
        }
    }

    @Override
    public long k(long j10) {
        c3.w wVar = (c3.w) this.f8186b;
        return m0.j((j10 * wVar.e) / 1000000, 0L, wVar.f4674j - 1);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        qa qaVar = (qa) this.f8186b;
        vb vbVar = qaVar.f9678a;
        z6 z6Var = vbVar.O0;
        int i10 = vbVar.f9971c;
        if (z6Var != null) {
            z6Var.g(true);
        }
        if (vbVar.p0()) {
            vbVar.f10021s.d();
        }
        if (vbVar.G1 != null && vbVar.B0 != null) {
            vbVar.Q1 = false;
            vbVar.R1 = false;
            v6 v6Var = vbVar.C0;
            if (v6Var != null) {
                v6Var.c(false);
            }
            if (j10 <= 800) {
                vbVar.g(false, true);
                vbVar.c0(false);
                vbVar.J0.b(false, true);
                z6 z6Var2 = vbVar.O0;
                if (z6Var2 != null) {
                    z6Var2.g(true);
                }
                try {
                    vbVar.G1.delete();
                    vbVar.G1 = null;
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
            vbVar.h0(false, true);
            a8 o10 = a8.o(vbVar.G1, str, j10);
            o10.J0 = vbVar.f10031v0;
            o10.K0 = vbVar.f10035w0;
            o10.B();
            vbVar.g(false, true);
            vbVar.c0(false);
            vbVar.J0.b(false, true);
            z6 z6Var3 = vbVar.O0;
            if (z6Var3 != null) {
                z6Var3.g(true);
            }
            if (vbVar.A0.j()) {
                vbVar.G1 = null;
                o10.P = 1.0f;
                if (vbVar.A0.l(o10)) {
                    a8 a2 = a8.a(vbVar.A0.getLayout(), vbVar.A0.getContent());
                    vbVar.K1 = a2;
                    s9.a(i10, a2);
                    vbVar.L1 = false;
                    int videoWidth = vbVar.B0.getVideoWidth();
                    int videoHeight = vbVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        a8 a8Var = vbVar.K1;
                        a8Var.f8726k0 = videoWidth;
                        a8Var.f8728l0 = videoHeight;
                        a8Var.A();
                    }
                }
                vbVar.l0(true);
                return;
            }
            vbVar.K1 = o10;
            s9.a(i10, o10);
            vbVar.L1 = false;
            int videoWidth2 = vbVar.B0.getVideoWidth();
            int videoHeight2 = vbVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                a8 a8Var2 = vbVar.K1;
                a8Var2.f8726k0 = videoWidth2;
                a8Var2.f8728l0 = videoHeight2;
                a8Var2.A();
            }
            vbVar.K(new oa(qaVar, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f8185a) {
            case 0:
                ((b) this.f8186b).invoke(obj);
                return;
            default:
                ((b) this.f8186b).invoke(obj);
                return;
        }
    }

    @Override
    public Object q(Object obj, Object obj2) {
        return s.x((List) ((Collection) obj2), new n4.s(16, ((q1) this.f8186b).f8496f, obj));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        ig.d1 d1Var;
        ig.d1 d1Var2;
        int i11;
        switch (this.f8185a) {
            case 5:
                ma maVar = (ma) this.f8186b;
                l61 l61Var = (l61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i12 = l61Var.d;
                a8 a8Var = (a8) l61Var.G;
                maVar.c(false, true);
                vb vbVar = maVar.O;
                if (a8Var != vbVar.K1 && !vbVar.X1) {
                    vbVar.f9976d1.setSelected(i12);
                    vbVar.X1 = true;
                    ah.g gVar = new ah.g(vbVar, i12, 9);
                    xa xaVar = vbVar.f10032v1;
                    a8 a8Var2 = vbVar.K1;
                    if (xaVar != null && a8Var2 != null) {
                        if (!xaVar.s0()) {
                            gVar.run();
                            return;
                        }
                        a8Var2.f();
                        Utilities.searchQueue.postRunnable(new w9(vbVar, xaVar, a8Var2.f8722i0, a8Var2.f8724j0, a8Var2, xaVar.O0.getPainting().E, xaVar.s0(), gVar, 0));
                        return;
                    }
                    gVar.run();
                    return;
                }
                return;
            case 12:
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((s4) this.f8186b).V((l61) obj);
                return;
            case 20:
                e1 e1Var = (e1) this.f8186b;
                l61 l61Var2 = (l61) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i13 = l61Var2.d;
                if (i13 == -1) {
                    boolean z10 = !e1Var.f12913f;
                    e1Var.f12913f = z10;
                    ((w8) view3).setChecked(z10);
                    e1Var.f12910a.Z2.N(true);
                    e1Var.Y(true);
                    return;
                } else if (i13 == -2) {
                    ?? o2Var = new o2(null);
                    o2Var.f12889n = e1Var.f12916s;
                    o2Var.f12887c = new ai.o2(24, e1Var, view3);
                    e1Var.presentFragment((o2) o2Var);
                    return;
                } else if (l61Var2.f44712a == 5 && i13 >= 0 && i13 < e1Var.f12914n.length) {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (e1Var.f12914n[l61Var2.d].isEmpty()) {
                            ((i5) view3).setChecked(true);
                            e1Var.f12914n[l61Var2.d].add(new ig.d1(0, 1439));
                            e1Var.X(l61Var2.d);
                        } else {
                            e1Var.f12914n[l61Var2.d].clear();
                            ((i5) view3).setChecked(false);
                        }
                        ((i5) view3).setValue(e1.a0(e1Var.f12914n[l61Var2.d]));
                        e1Var.Y(true);
                        return;
                    }
                    int i14 = (l61Var2.d + 6) % 7;
                    int i15 = 0;
                    for (int i16 = 0; i16 < e1Var.f12914n[i14].size(); i16++) {
                        if (((ig.d1) e1Var.f12914n[i14].get(i16)).f12893b > i15) {
                            i15 = ((ig.d1) e1Var.f12914n[i14].get(i16)).f12893b;
                        }
                    }
                    int max = Math.max(0, i15 - 1439);
                    int i17 = (l61Var2.d + 1) % 7;
                    int i18 = 1440;
                    for (int i19 = 0; i19 < e1Var.f12914n[i17].size(); i19++) {
                        if (((ig.d1) e1Var.f12914n[i17].get(i19)).f12892a < i18) {
                            i18 = ((ig.d1) e1Var.f12914n[i17].get(i19)).f12892a;
                        }
                    }
                    int i20 = i18 + 1439;
                    CharSequence charSequence = l61Var2.f28227l;
                    ArrayList arrayList = e1Var.f12914n[l61Var2.d];
                    int i21 = 0;
                    for (int i22 = 0; i22 < 7; i22++) {
                        ArrayList arrayList2 = e1Var.f12914n[i22];
                        if (arrayList2 != null) {
                            i21 = Math.max(1, arrayList2.size()) + i21;
                        }
                    }
                    g1 g1Var = new g1(charSequence, arrayList, max, i20, 28 - i21);
                    g1Var.f12936f = new bc(e1Var, 22);
                    g1Var.h = new t(6, e1Var, l61Var2);
                    e1Var.presentFragment(g1Var);
                    return;
                } else {
                    return;
                }
            case 21:
                final g1 g1Var2 = (g1) this.f8186b;
                l61 l61Var3 = (l61) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i23 = g1Var2.f12935c;
                int i24 = g1Var2.d;
                ArrayList arrayList3 = g1Var2.f12934b;
                int i25 = l61Var3.d;
                if (i25 == -1) {
                    g1Var2.f12938r = !g1Var2.f12938r;
                    arrayList3.clear();
                    if (g1Var2.f12938r) {
                        arrayList3.add(new ig.d1(0, 1439));
                    }
                    w8 w8Var = (w8) view4;
                    boolean z11 = g1Var2.f12938r;
                    l61Var3.e = z11;
                    w8Var.setChecked(z11);
                    boolean z12 = g1Var2.f12938r;
                    if (z12) {
                        i11 = k6.f21220f6;
                    } else {
                        i11 = k6.f21201e6;
                    }
                    w8Var.b(k6.x0(null, i11, false), z12);
                    g1Var2.f12937n.Z2.N(true);
                    bc bcVar = g1Var2.f12936f;
                    if (bcVar != null) {
                        bcVar.run();
                        return;
                    }
                    return;
                } else if (i25 == -2) {
                    if (!arrayList3.isEmpty() && !g1Var2.U()) {
                        int i26 = ((ig.d1) i2.o1.i(1, arrayList3)).f12893b;
                        int clamp = Utilities.clamp(i26 + 30, i24 - 1, i23);
                        arrayList3.add(new ig.d1(clamp, Utilities.clamp((i26 + 1560) / 2, i24, clamp + 1)));
                    } else {
                        if (g1Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i24 - 1, i23);
                        arrayList3.add(new ig.d1(clamp2, Utilities.clamp(1200, i24, clamp2 + 1)));
                    }
                    bc bcVar2 = g1Var2.f12936f;
                    if (bcVar2 != null) {
                        bcVar2.run();
                    }
                    g1Var2.f12937n.Z2.N(true);
                    return;
                } else if (l61Var3.f44712a == 3 && (i10 = i25 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i27 = i10 - 1;
                    if (i27 >= 0) {
                        d1Var = (ig.d1) arrayList3.get(i27);
                    } else {
                        d1Var = null;
                    }
                    final ig.d1 d1Var3 = (ig.d1) arrayList3.get(i10);
                    int i28 = i10 + 1;
                    if (i28 < arrayList3.size()) {
                        d1Var2 = (ig.d1) arrayList3.get(i28);
                    } else {
                        d1Var2 = null;
                    }
                    int i29 = l61Var3.d % 3;
                    if (i29 == 0) {
                        Activity parentActivity = g1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i30 = d1Var3.f12892a;
                        if (d1Var != null) {
                            i23 = d1Var.f12893b + 1;
                        }
                        d5.W(parentActivity, string, i30, i23, d1Var3.f12893b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        g1 g1Var3 = g1Var2;
                                        boolean V = g1Var3.V();
                                        int intValue = num.intValue();
                                        d1Var3.f12892a = intValue;
                                        ((r8) view4).w(d1.a(intValue), true);
                                        if (V != g1Var3.V()) {
                                            g1Var3.f12937n.Z2.N(true);
                                        }
                                        bc bcVar3 = g1Var3.f12936f;
                                        if (bcVar3 != null) {
                                            bcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        g1 g1Var4 = g1Var2;
                                        boolean V2 = g1Var4.V();
                                        int intValue2 = num.intValue();
                                        d1Var3.f12893b = intValue2;
                                        ((r8) view4).w(d1.a(intValue2), true);
                                        if (V2 != g1Var4.V()) {
                                            g1Var4.f12937n.Z2.N(true);
                                        }
                                        bc bcVar4 = g1Var4.f12936f;
                                        if (bcVar4 != null) {
                                            bcVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i29 == 1) {
                        Activity parentActivity2 = g1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i31 = d1Var3.f12893b;
                        int i32 = d1Var3.f12892a + 1;
                        if (d1Var2 != null) {
                            i24 = d1Var2.f12892a - 1;
                        }
                        d5.W(parentActivity2, string2, i31, i32, i24, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        g1 g1Var3 = g1Var2;
                                        boolean V = g1Var3.V();
                                        int intValue = num.intValue();
                                        d1Var3.f12892a = intValue;
                                        ((r8) view4).w(d1.a(intValue), true);
                                        if (V != g1Var3.V()) {
                                            g1Var3.f12937n.Z2.N(true);
                                        }
                                        bc bcVar3 = g1Var3.f12936f;
                                        if (bcVar3 != null) {
                                            bcVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        g1 g1Var4 = g1Var2;
                                        boolean V2 = g1Var4.V();
                                        int intValue2 = num.intValue();
                                        d1Var3.f12893b = intValue2;
                                        ((r8) view4).w(d1.a(intValue2), true);
                                        if (V2 != g1Var4.V()) {
                                            g1Var4.f12937n.Z2.N(true);
                                        }
                                        bc bcVar4 = g1Var4.f12936f;
                                        if (bcVar4 != null) {
                                            bcVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i29 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new ig.d1(0, 1439));
                        }
                        g1Var2.f12937n.Z2.N(true);
                        bc bcVar3 = g1Var2.f12936f;
                        if (bcVar3 != null) {
                            bcVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ig.c2.U((ig.c2) this.f8186b, (l61) obj, (View) obj2);
                return;
        }
    }

    public c(j2.a aVar, v vVar, d0 d0Var, IOException iOException, boolean z10) {
        this.f8185a = 27;
        this.f8186b = d0Var;
    }

    public c(Object obj, int i10) {
        this.f8185a = i10;
        this.f8186b = obj;
    }
}
