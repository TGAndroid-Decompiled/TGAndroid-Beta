package lh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.File;
import java.util.ArrayList;
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
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.gy;
import org.telegram.ui.ib0;
import org.telegram.ui.we1;
import org.telegram.ui.zh1;
import org.telegram.ui.zx;
import org.webrtc.GlGenericDrawer;

public final class p implements org.telegram.ui.ActionBar.a2, ek0, rk0, Utilities.Callback5, yf.r1, CameraController.VideoTakeCallback, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.j1, m3.c, jt, rh.l0, zx, rh.h5, k3.j {

    public final int f16498a;

    public final Object f16499b;

    public p(Object obj, int i10) {
        this.f16498a = i10;
        this.f16499b = obj;
    }

    @Override
    public long B(long j10) {
        return ((FlacStreamMetadata) this.f16499b).getSampleNumber(j10);
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        p3 p3Var = (p3) this.f16499b;
        ArrayList arrayList = p3Var.U;
        ArrayList arrayList2 = p3Var.f16513d0;
        if (i10 < 2 || p3Var.S == null || !(view instanceof l3)) {
            return false;
        }
        int size = i10 - 2;
        if (p3Var.V) {
            if (size == 0) {
                return false;
            }
            size = i10 - 3;
        } else if (p3Var.W) {
            if (size >= 0 && size < arrayList.size()) {
                return false;
            }
            size -= arrayList.size();
        }
        if (size < 0 || size >= p3Var.f16510b0.size()) {
            return false;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p3Var.f16510b0.get(size);
        if (!arrayList2.isEmpty() || p3Var.M) {
            return false;
        }
        if (arrayList2.contains(photoEntry)) {
            arrayList2.remove(photoEntry);
        } else {
            if (arrayList2.size() + 1 > p3Var.N) {
                int i11 = -p3Var.J;
                p3Var.J = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return true;
            }
            arrayList2.add(photoEntry);
        }
        AndroidUtilities.updateVisibleRows(p3Var.d);
        p3Var.j();
        return true;
    }

    @Override
    public void b() {
        ((o1) this.f16499b).invalidate();
    }

    @Override
    public void c(k3.k kVar) {
        s4.i iVar = (s4.i) this.f16499b;
        s4.h hVar = (s4.h) kVar;
        hVar.clear();
        iVar.f47791b.add(hVar);
    }

    public void d(int i10) {
        rh.y yVar = (rh.y) this.f16499b;
        yVar.f47596c = i10;
        yVar.f(i10);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f16498a) {
            case 10:
                return ((TLRPC.TL_stickerSet) this.f16499b).lambda$readParams$0(inputSerializedData, i10, z10);
            default:
                return ((TLRPC.TL_stickerSet_layer143) this.f16499b).lambda$readParams$0(inputSerializedData, i10, z10);
        }
    }

    @Override
    public b70 e(rh.d1 d1Var) {
        return b70.H((rh.x1) ((m5.o) this.f16499b).f17823b, d1Var);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f16498a) {
            case 0:
                sb sbVar = ((ib) ((s) this.f16499b)).O1;
                hb hbVar = sbVar.T0;
                if (hbVar != null) {
                    hbVar.s(null, null, true);
                }
                va vaVar = sbVar.f16798r1;
                if (vaVar != null) {
                    vaVar.q0();
                }
                ib ibVar = sbVar.Y0;
                if (ibVar != null) {
                    ibVar.setHasRoundVideo(false);
                }
                z7 z7Var = sbVar.G1;
                if (z7Var != null) {
                    File file = z7Var.f17224o0;
                    if (file != null) {
                        try {
                            file.delete();
                            break;
                        } catch (Exception unused) {
                        }
                        sbVar.G1.f17224o0 = null;
                    }
                    if (sbVar.G1.f17226p0 != null) {
                        try {
                            new File(sbVar.G1.f17226p0).delete();
                            break;
                        } catch (Exception unused2) {
                        }
                        sbVar.G1.f17226p0 = null;
                    }
                }
                break;
            case 5:
                ((u5) this.f16499b).f16906a.f15979l2.s();
                break;
            case 7:
                ((nh.e) this.f16499b).run();
                break;
            case 8:
                nh.k kVar = (nh.k) this.f16499b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().getInputUser(kVar.L);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(kVar.getParentActivity(), 3, null);
                b2Var2.q(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new nh.b(kVar, b2Var2, 0));
                break;
            case 14:
                ((org.telegram.ui.web.z) this.f16499b).run();
                break;
            case 18:
                qf.n1 n1Var = ((qf.g1) this.f16499b).f46307a;
                qf.q1 q1VarF = qf.q1.f(((org.telegram.ui.ActionBar.n2) n1Var).currentAccount);
                ArrayList arrayList = n1Var.f46394b;
                int i11 = q1VarF.f46433a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (q1VarF.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        qf.p1 p1VarC = q1VarF.c(((Integer) arrayList.get(i13)).intValue());
                        q1VarF.f46434b.remove(p1VarC);
                        q1VarF.a(p1VarC.f46419b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = p1VarC.f46418a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new jh.m5(20));
                        if ("hello".equals(p1VarC.f46419b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(p1VarC.f46419b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i11).getUserFull(UserConfig.getInstance(i11).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i11).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    q1VarF.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                    messagesStorage.getStorageQueue().postRunnable(new w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                qf.n1.X(n1Var);
                break;
            default:
                ((cg.c) this.f16499b).run();
                break;
        }
    }

    @Override
    public void g() {
        va vaVar = (va) this.f16499b;
        TextView textView = vaVar.f15977k1;
        boolean zA = vaVar.f16005z0.a();
        ImageView imageView = vaVar.f15975j1;
        imageView.animate().cancel();
        imageView.animate().alpha(zA ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(zA);
        textView.animate().cancel();
        textView.animate().alpha(zA ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(zA);
    }

    @Override
    public void k1() {
        switch (this.f16498a) {
            case 21:
                rh.q0 q0Var = (rh.q0) this.f16499b;
                rh.d1 d1Var = q0Var.d;
                rh.a aVar = q0Var.f47388f;
                if (aVar != null) {
                    aVar.f47043s = true;
                    aVar.f47042r = d1Var.A;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f47028b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = rh.v5.f(d1Var.getText());
                    }
                }
                rh.x2 x2Var = q0Var.h;
                if (x2Var != null && q0Var.f47388f != null) {
                    rh.p3.O1(x2Var.f47583a);
                    break;
                }
                break;
            case 26:
                ((rh.y4) this.f16499b).h();
                break;
            default:
                rh.g5 g5Var = (rh.g5) this.f16499b;
                rh.a aVar2 = g5Var.f47594a;
                if (aVar2 != null) {
                    aVar2.f47043s = true;
                    aVar2.f47042r = g5Var.f47164r.A;
                }
                g5Var.u();
                rh.w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.f47594a != null) {
                    rh.p3.O1(w2Var.f47536a);
                    break;
                }
                break;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        oa oaVar = (oa) this.f16499b;
        sb sbVar = oaVar.f16494a;
        y6 y6Var = sbVar.K0;
        int i10 = sbVar.f16749c;
        if (y6Var != null) {
            y6Var.g(true);
        }
        if (sbVar.q0()) {
            sbVar.f16800s.d();
        }
        if (sbVar.C1 == null || sbVar.f16818x0 == null) {
            return;
        }
        sbVar.M1 = false;
        sbVar.N1 = false;
        u6 u6Var = sbVar.f16822y0;
        if (u6Var != null) {
            u6Var.c(false);
        }
        if (j10 <= 800) {
            sbVar.h(false, true);
            sbVar.d0(false);
            sbVar.F0.b(false, true);
            y6 y6Var2 = sbVar.K0;
            if (y6Var2 != null) {
                y6Var2.g(true);
            }
            try {
                sbVar.C1.delete();
                sbVar.C1 = null;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        sbVar.i0(false, true);
        z7 z7VarO = z7.o(sbVar.C1, str, j10);
        z7VarO.J0 = sbVar.f16797r0;
        z7VarO.K0 = sbVar.f16801s0;
        z7VarO.B();
        sbVar.h(false, true);
        sbVar.d0(false);
        sbVar.F0.b(false, true);
        y6 y6Var3 = sbVar.K0;
        if (y6Var3 != null) {
            y6Var3.g(true);
        }
        if (!sbVar.f16814w0.j()) {
            sbVar.G1 = z7VarO;
            r9.a(i10, z7VarO);
            sbVar.H1 = false;
            int videoWidth = sbVar.f16818x0.getVideoWidth();
            int videoHeight = sbVar.f16818x0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                z7 z7Var = sbVar.G1;
                z7Var.f17217k0 = videoWidth;
                z7Var.f17219l0 = videoHeight;
                z7Var.A();
            }
            sbVar.L(new ma(oaVar, 3), 0L);
            return;
        }
        sbVar.C1 = null;
        z7VarO.P = 1.0f;
        if (sbVar.f16814w0.l(z7VarO)) {
            z7 z7VarA = z7.a(sbVar.f16814w0.getLayout(), sbVar.f16814w0.getContent());
            sbVar.G1 = z7VarA;
            r9.a(i10, z7VarA);
            sbVar.H1 = false;
            int videoWidth2 = sbVar.f16818x0.getVideoWidth();
            int videoHeight2 = sbVar.f16818x0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                z7 z7Var2 = sbVar.G1;
                z7Var2.f17217k0 = videoWidth2;
                z7Var2.f17219l0 = videoHeight2;
                z7Var2.A();
            }
        }
        sbVar.m0(true);
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.f16498a) {
            case 3:
                ka kaVar = (ka) this.f16499b;
                n41 n41Var = (n41) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i11 = n41Var.d;
                z7 z7Var = (z7) n41Var.G;
                kaVar.c(false, true);
                sb sbVar = kaVar.K;
                if (z7Var != sbVar.G1 && !sbVar.T1) {
                    sbVar.Z0.setSelected(i11);
                    sbVar.T1 = true;
                    cg.w1 w1Var = new cg.w1(sbVar, i11, 11);
                    va vaVar = sbVar.f16798r1;
                    z7 z7Var2 = sbVar.G1;
                    if (vaVar == null || z7Var2 == null) {
                        w1Var.run();
                    } else if (vaVar.u0()) {
                        z7Var2.f();
                        Utilities.searchQueue.postRunnable(new v9(sbVar, vaVar, z7Var2.f17213i0, z7Var2.f17215j0, z7Var2, vaVar.K0.getPainting().E, vaVar.u0(), w1Var, 0));
                    } else {
                        w1Var.run();
                    }
                    break;
                }
                break;
            case 9:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((nh.p4) this.f16499b).V((n41) obj);
                break;
            case 16:
                qf.y0 y0Var = (qf.y0) this.f16499b;
                n41 n41Var2 = (n41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                float fFloatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i12 = n41Var2.d;
                if (i12 == -1) {
                    boolean z10 = !y0Var.f46499e;
                    y0Var.f46499e = z10;
                    ((org.telegram.ui.Cells.p8) view).setChecked(z10);
                    y0Var.f46496a.U2.N(true);
                    y0Var.Y(true);
                    break;
                } else if (i12 == -2) {
                    qf.s1 s1Var = new qf.s1(null);
                    s1Var.f46449n = y0Var.f46502r;
                    s1Var.f46446c = new ib0(19, y0Var, view);
                    y0Var.presentFragment(s1Var);
                    break;
                } else if (n41Var2.f49413a == 5 && i12 >= 0 && i12 < y0Var.h.length) {
                    if (!LocaleController.isRTL ? fFloatValue >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : fFloatValue <= AndroidUtilities.dp(76.0f)) {
                        int i13 = (n41Var2.d + 6) % 7;
                        int i14 = 0;
                        for (int i15 = 0; i15 < y0Var.h[i13].size(); i15++) {
                            if (((qf.x0) y0Var.h[i13].get(i15)).f46494b > i14) {
                                i14 = ((qf.x0) y0Var.h[i13].get(i15)).f46494b;
                            }
                        }
                        int iMax = Math.max(0, i14 - 1439);
                        int i16 = (n41Var2.d + 1) % 7;
                        int i17 = 1440;
                        for (int i18 = 0; i18 < y0Var.h[i16].size(); i18++) {
                            if (((qf.x0) y0Var.h[i16].get(i18)).f46493a < i17) {
                                i17 = ((qf.x0) y0Var.h[i16].get(i18)).f46493a;
                            }
                        }
                        int i19 = i17 + 1439;
                        CharSequence charSequence = n41Var2.f30844l;
                        ArrayList arrayList = y0Var.h[n41Var2.d];
                        int iMax2 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = y0Var.h[i20];
                            if (arrayList2 != null) {
                                iMax2 = Math.max(1, arrayList2.size()) + iMax2;
                            }
                        }
                        qf.a1 a1Var = new qf.a1(charSequence, arrayList, iMax, i19, 28 - iMax2);
                        a1Var.f46234f = new qf.b(y0Var, 5);
                        a1Var.h = new zh1(21, y0Var, n41Var2);
                        y0Var.presentFragment(a1Var);
                    } else {
                        if (y0Var.h[n41Var2.d].isEmpty()) {
                            ((org.telegram.ui.Cells.g5) view).setChecked(true);
                            y0Var.h[n41Var2.d].add(new qf.x0(0, 1439));
                            y0Var.X(n41Var2.d);
                        } else {
                            y0Var.h[n41Var2.d].clear();
                            ((org.telegram.ui.Cells.g5) view).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.g5) view).setValue(qf.y0.a0(y0Var.h[n41Var2.d]));
                        y0Var.Y(true);
                    }
                    break;
                }
                break;
            case 17:
                final qf.a1 a1Var2 = (qf.a1) this.f16499b;
                n41 n41Var3 = (n41) obj;
                final View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = a1Var2.f46232c;
                int i22 = a1Var2.d;
                ArrayList arrayList3 = a1Var2.f46231b;
                int i23 = n41Var3.d;
                if (i23 == -1) {
                    a1Var2.f46236r = !a1Var2.f46236r;
                    arrayList3.clear();
                    if (a1Var2.f46236r) {
                        arrayList3.add(new qf.x0(0, 1439));
                    }
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view2;
                    boolean z11 = a1Var2.f46236r;
                    n41Var3.f30838e = z11;
                    p8Var.setChecked(z11);
                    boolean z12 = a1Var2.f46236r;
                    p8Var.b(org.telegram.ui.ActionBar.g6.w0(null, z12 ? org.telegram.ui.ActionBar.g6.f23090f6 : org.telegram.ui.ActionBar.g6.f23072e6, false), z12);
                    a1Var2.f46235n.U2.N(true);
                    qf.b bVar = a1Var2.f46234f;
                    if (bVar != null) {
                        bVar.run();
                    }
                    break;
                } else if (i23 == -2) {
                    if (arrayList3.isEmpty() || a1Var2.U()) {
                        if (a1Var2.U()) {
                            arrayList3.clear();
                        }
                        int iClamp = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new qf.x0(iClamp, Utilities.clamp(1200, i22, iClamp + 1)));
                    } else {
                        int i24 = ((qf.x0) i0.a.i(1, arrayList3)).f46494b;
                        int iClamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new qf.x0(iClamp2, Utilities.clamp((i24 + 1560) / 2, i22, iClamp2 + 1)));
                    }
                    qf.b bVar2 = a1Var2.f46234f;
                    if (bVar2 != null) {
                        bVar2.run();
                    }
                    a1Var2.f46235n.U2.N(true);
                    break;
                } else if (n41Var3.f49413a == 3 && (i10 = i23 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i25 = i10 - 1;
                    qf.x0 x0Var = i25 >= 0 ? (qf.x0) arrayList3.get(i25) : null;
                    final qf.x0 x0Var2 = (qf.x0) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    qf.x0 x0Var3 = i26 < arrayList3.size() ? (qf.x0) arrayList3.get(i26) : null;
                    int i27 = n41Var3.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = a1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = x0Var2.f46493a;
                        if (x0Var != null) {
                            i21 = x0Var.f46494b + 1;
                        }
                        final int i29 = 0;
                        org.telegram.ui.Components.y4.X(parentActivity, string, i28, i21, x0Var2.f46494b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i29) {
                                    case 0:
                                        a1 a1Var3 = a1Var2;
                                        boolean zV = a1Var3.V();
                                        l8 l8Var = (l8) view2;
                                        int iIntValue = num.intValue();
                                        x0Var2.f46493a = iIntValue;
                                        l8Var.u(x0.a(iIntValue), true);
                                        if (zV != a1Var3.V()) {
                                            a1Var3.f46235n.U2.N(true);
                                        }
                                        b bVar3 = a1Var3.f46234f;
                                        if (bVar3 != null) {
                                            bVar3.run();
                                        }
                                        break;
                                    default:
                                        a1 a1Var4 = a1Var2;
                                        boolean zV2 = a1Var4.V();
                                        l8 l8Var2 = (l8) view2;
                                        int iIntValue2 = num.intValue();
                                        x0Var2.f46494b = iIntValue2;
                                        l8Var2.u(x0.a(iIntValue2), true);
                                        if (zV2 != a1Var4.V()) {
                                            a1Var4.f46235n.U2.N(true);
                                        }
                                        b bVar4 = a1Var4.f46234f;
                                        if (bVar4 != null) {
                                            bVar4.run();
                                        }
                                        break;
                                }
                            }
                        });
                    } else if (i27 == 1) {
                        Activity parentActivity2 = a1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = x0Var2.f46494b;
                        int i31 = x0Var2.f46493a + 1;
                        if (x0Var3 != null) {
                            i22 = x0Var3.f46493a - 1;
                        }
                        final int i32 = 1;
                        org.telegram.ui.Components.y4.X(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (i32) {
                                    case 0:
                                        a1 a1Var3 = a1Var2;
                                        boolean zV = a1Var3.V();
                                        l8 l8Var = (l8) view2;
                                        int iIntValue = num.intValue();
                                        x0Var2.f46493a = iIntValue;
                                        l8Var.u(x0.a(iIntValue), true);
                                        if (zV != a1Var3.V()) {
                                            a1Var3.f46235n.U2.N(true);
                                        }
                                        b bVar3 = a1Var3.f46234f;
                                        if (bVar3 != null) {
                                            bVar3.run();
                                        }
                                        break;
                                    default:
                                        a1 a1Var4 = a1Var2;
                                        boolean zV2 = a1Var4.V();
                                        l8 l8Var2 = (l8) view2;
                                        int iIntValue2 = num.intValue();
                                        x0Var2.f46494b = iIntValue2;
                                        l8Var2.u(x0.a(iIntValue2), true);
                                        if (zV2 != a1Var4.V()) {
                                            a1Var4.f46235n.U2.N(true);
                                        }
                                        b bVar4 = a1Var4.f46234f;
                                        if (bVar4 != null) {
                                            bVar4.run();
                                        }
                                        break;
                                }
                            }
                        });
                    } else if (i27 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new qf.x0(0, 1439));
                        }
                        a1Var2.f46235n.U2.N(true);
                        qf.b bVar3 = a1Var2.f46234f;
                        if (bVar3 != null) {
                            bVar3.run();
                        }
                    }
                    break;
                }
                break;
            case 19:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                qf.s1.U((qf.s1) this.f16499b, (n41) obj, (View) obj2);
                break;
            default:
                View view3 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f10 = (Float) obj4;
                Float f11 = (Float) obj5;
                if (((rh.p3[]) this.f16499b)[0] != null) {
                    num.intValue();
                    f10.floatValue();
                    f11.floatValue();
                    if (view3 instanceof rh.t5) {
                        ((rh.t5) view3).B();
                    }
                }
                break;
        }
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        rh.a4 a4Var = (rh.a4) this.f16499b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        a4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        gyVar.finishFragment();
        return true;
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f16499b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new r61(3, tVar, bitmap));
    }
}
