package kh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.File;
import java.util.ArrayList;
import mh.m2;
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
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ai1;
import org.telegram.ui.dy;
import org.telegram.ui.eb0;
import org.telegram.ui.we1;
import org.telegram.ui.wx;
import org.webrtc.GlGenericDrawer;
public final class p implements org.telegram.ui.ActionBar.b2, ck0, ok0, Utilities.Callback5, xf.s1, CameraController.VideoTakeCallback, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.j1, m3.c, kt, qh.l0, wx, qh.g5, k3.j {
    public final int f15812a;
    public final Object f15813b;

    public p(Object obj, int i9) {
        this.f15812a = i9;
        this.f15813b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(dy dyVar) {
        return false;
    }

    @Override
    public boolean a(int i9, View view) {
        q3 q3Var = (q3) this.f15813b;
        ArrayList arrayList = q3Var.U;
        ArrayList arrayList2 = q3Var.f15864d0;
        if (i9 >= 2 && q3Var.S != null && (view instanceof m3)) {
            int i10 = i9 - 2;
            if (q3Var.V) {
                if (i10 != 0) {
                    i10 = i9 - 3;
                } else {
                    return false;
                }
            } else if (q3Var.W) {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    i10 -= arrayList.size();
                } else {
                    return false;
                }
            }
            if (i10 >= 0 && i10 < q3Var.f15861b0.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f15861b0.get(i10);
                if (arrayList2.isEmpty() && !q3Var.M) {
                    if (arrayList2.contains(photoEntry)) {
                        arrayList2.remove(photoEntry);
                    } else if (arrayList2.size() + 1 > q3Var.N) {
                        int i11 = -q3Var.J;
                        q3Var.J = i11;
                        AndroidUtilities.shakeViewSpring(view, i11);
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
    public void b() {
        ((q1) this.f15813b).invalidate();
    }

    @Override
    public long c(long j10) {
        return ((FlacStreamMetadata) this.f15813b).getSampleNumber(j10);
    }

    @Override
    public void d(k3.k kVar) {
        s4.h hVar = (s4.h) kVar;
        hVar.clear();
        ((s4.i) this.f15813b).f47427b.add(hVar);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f15812a) {
            case 10:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f15813b).lambda$readParams$0(inputSerializedData, i9, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f15813b).lambda$readParams$0(inputSerializedData, i9, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e() {
        float f10;
        ya yaVar = (ya) this.f15813b;
        TextView textView = yaVar.f15287k1;
        boolean a2 = yaVar.f15315z0.a();
        ImageView imageView = yaVar.f15285j1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a2) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f15812a) {
            case 0:
                wb wbVar = ((mb) ((s) this.f15813b)).O1;
                kb kbVar = wbVar.T0;
                if (kbVar != null) {
                    kbVar.s(null, null, true);
                }
                ya yaVar = wbVar.f16302r1;
                if (yaVar != null) {
                    yaVar.q0();
                }
                mb mbVar = wbVar.Y0;
                if (mbVar != null) {
                    mbVar.setHasRoundVideo(false);
                }
                a8 a8Var = wbVar.G1;
                if (a8Var != null) {
                    File file = a8Var.f14932o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        wbVar.G1.f14932o0 = null;
                    }
                    if (wbVar.G1.f14934p0 != null) {
                        try {
                            new File(wbVar.G1.f14934p0).delete();
                        } catch (Exception unused2) {
                        }
                        wbVar.G1.f14934p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((v5) this.f15813b).f16196a.f15289l2.r();
                return;
            case 7:
                ((mh.e) this.f15813b).run();
                return;
            case 8:
                mh.l lVar = (mh.l) this.f15813b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.L);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(lVar.getParentActivity(), 3, null);
                c2Var2.q(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new mh.b(lVar, c2Var2, 0));
                return;
            case 14:
                ((org.telegram.ui.web.y) this.f15813b).run();
                return;
            case 18:
                pf.n1 n1Var = ((pf.g1) this.f15813b).f45640a;
                pf.r1 f10 = pf.r1.f(pf.n1.a0(n1Var));
                ArrayList arrayList = n1Var.f45723b;
                int i10 = f10.f45765a;
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i11)).intValue()) == null) {
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        pf.q1 c10 = f10.c(((Integer) arrayList.get(i12)).intValue());
                        f10.f45766b.remove(c10);
                        f10.a(c10.f45757b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f45756a;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_deleteQuickReplyShortcut, new ih.q5(20));
                        if ("hello".equals(c10.f45757b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(UserConfig.getInstance(i10).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i10).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c10.f45757b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i10).getUserFull(UserConfig.getInstance(i10).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i10).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f10.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new x0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                pf.n1.W(n1Var);
                return;
            default:
                ((bg.d) this.f15813b).run();
                return;
        }
    }

    @Override
    public x60 g(qh.d1 d1Var) {
        return x60.H((qh.x1) ((n5.e0) this.f15813b).f18488b, d1Var);
    }

    public void h(int i9) {
        qh.y yVar = (qh.y) this.f15813b;
        yVar.f46836c = i9;
        yVar.f(i9);
    }

    @Override
    public void m1() {
        switch (this.f15812a) {
            case 21:
                qh.q0 q0Var = (qh.q0) this.f15813b;
                qh.d1 d1Var = q0Var.d;
                qh.a aVar = q0Var.f46625f;
                if (aVar != null) {
                    aVar.f46284s = true;
                    aVar.f46283r = d1Var.A;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f46269b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = qh.u5.f(d1Var.getText());
                    }
                }
                qh.w2 w2Var = q0Var.h;
                if (w2Var != null && q0Var.f46625f != null) {
                    qh.o3.O1(w2Var.f46773a);
                    return;
                }
                return;
            case 26:
                ((qh.x4) this.f15813b).h();
                return;
            default:
                qh.f5 f5Var = (qh.f5) this.f15813b;
                qh.a aVar2 = f5Var.f46834a;
                if (aVar2 != null) {
                    aVar2.f46284s = true;
                    aVar2.f46283r = f5Var.f46392r.A;
                }
                f5Var.u();
                qh.v2 v2Var = f5Var.A;
                if (v2Var != null && f5Var.f46834a != null) {
                    qh.o3.O1(v2Var.f46757a);
                    return;
                }
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        ra raVar = (ra) this.f15813b;
        wb wbVar = raVar.f15971a;
        z6 z6Var = wbVar.K0;
        int i9 = wbVar.f16253c;
        if (z6Var != null) {
            z6Var.g(true);
        }
        if (wbVar.q0()) {
            wbVar.f16304s.d();
        }
        if (wbVar.C1 != null && wbVar.f16322x0 != null) {
            wbVar.M1 = false;
            wbVar.N1 = false;
            v6 v6Var = wbVar.f16326y0;
            if (v6Var != null) {
                v6Var.c(false);
            }
            if (j10 <= 800) {
                wbVar.h(false, true);
                wbVar.d0(false);
                wbVar.F0.b(false, true);
                z6 z6Var2 = wbVar.K0;
                if (z6Var2 != null) {
                    z6Var2.g(true);
                }
                try {
                    wbVar.C1.delete();
                    wbVar.C1 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                return;
            }
            wbVar.i0(false, true);
            a8 o6 = a8.o(wbVar.C1, str, j10);
            o6.J0 = wbVar.f16301r0;
            o6.K0 = wbVar.f16305s0;
            o6.B();
            wbVar.h(false, true);
            wbVar.d0(false);
            wbVar.F0.b(false, true);
            z6 z6Var3 = wbVar.K0;
            if (z6Var3 != null) {
                z6Var3.g(true);
            }
            if (wbVar.f16318w0.j()) {
                wbVar.C1 = null;
                o6.P = 1.0f;
                if (wbVar.f16318w0.l(o6)) {
                    a8 a2 = a8.a(wbVar.f16318w0.getLayout(), wbVar.f16318w0.getContent());
                    wbVar.G1 = a2;
                    u9.a(i9, a2);
                    wbVar.H1 = false;
                    int videoWidth = wbVar.f16322x0.getVideoWidth();
                    int videoHeight = wbVar.f16322x0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        a8 a8Var = wbVar.G1;
                        a8Var.f14925k0 = videoWidth;
                        a8Var.f14927l0 = videoHeight;
                        a8Var.A();
                    }
                }
                wbVar.m0(true);
                return;
            }
            wbVar.G1 = o6;
            u9.a(i9, o6);
            wbVar.H1 = false;
            int videoWidth2 = wbVar.f16322x0.getVideoWidth();
            int videoHeight2 = wbVar.f16322x0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                a8 a8Var2 = wbVar.G1;
                a8Var2.f14925k0 = videoWidth2;
                a8Var2.f14927l0 = videoHeight2;
                a8Var2.A();
            }
            wbVar.L(new pa(raVar, 3), 0L);
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i9;
        switch (this.f15812a) {
            case 3:
                na naVar = (na) this.f15813b;
                l41 l41Var = (l41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = l41Var.d;
                a8 a8Var = (a8) l41Var.G;
                naVar.c(false, true);
                wb wbVar = naVar.K;
                if (a8Var == wbVar.G1 || wbVar.T1) {
                    return;
                }
                wbVar.Z0.setSelected(i10);
                wbVar.T1 = true;
                bg.c2 c2Var = new bg.c2(wbVar, i10, 11);
                ya yaVar = wbVar.f16302r1;
                a8 a8Var2 = wbVar.G1;
                if (yaVar != null && a8Var2 != null) {
                    if (!yaVar.u0()) {
                        c2Var.run();
                        return;
                    }
                    a8Var2.f();
                    Utilities.searchQueue.postRunnable(new y9(wbVar, yaVar, a8Var2.f14921i0, a8Var2.f14923j0, a8Var2, yaVar.K0.getPainting().E, yaVar.u0(), c2Var, 0));
                    return;
                }
                c2Var.run();
                return;
            case 9:
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((mh.r4) this.f15813b).U((l41) obj);
                return;
            case 16:
                pf.y0 y0Var = (pf.y0) this.f15813b;
                l41 l41Var2 = (l41) obj;
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = l41Var2.d;
                if (i11 == -1) {
                    boolean z10 = !y0Var.f45831e;
                    y0Var.f45831e = z10;
                    ((org.telegram.ui.Cells.t8) view3).setChecked(z10);
                    y0Var.f45828a.U2.N(true);
                    y0Var.X(true);
                    return;
                } else if (i11 == -2) {
                    ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                    o2Var.f45786n = y0Var.f45834r;
                    o2Var.f45783c = new eb0(19, y0Var, view3);
                    y0Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                    return;
                } else if (l41Var2.f48814a != 5 || i11 < 0 || i11 >= y0Var.h.length) {
                    return;
                } else {
                    if (!LocaleController.isRTL ? floatValue >= view3.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue <= AndroidUtilities.dp(76.0f)) {
                        if (y0Var.h[l41Var2.d].isEmpty()) {
                            ((org.telegram.ui.Cells.j5) view3).setChecked(true);
                            y0Var.h[l41Var2.d].add(new pf.x0(0, 1439));
                            y0Var.W(l41Var2.d);
                        } else {
                            y0Var.h[l41Var2.d].clear();
                            ((org.telegram.ui.Cells.j5) view3).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.j5) view3).setValue(pf.y0.Z(y0Var.h[l41Var2.d]));
                        y0Var.X(true);
                        return;
                    }
                    int i12 = (l41Var2.d + 6) % 7;
                    int i13 = 0;
                    for (int i14 = 0; i14 < y0Var.h[i12].size(); i14++) {
                        if (((pf.x0) y0Var.h[i12].get(i14)).f45826b > i13) {
                            i13 = ((pf.x0) y0Var.h[i12].get(i14)).f45826b;
                        }
                    }
                    int max = Math.max(0, i13 - 1439);
                    int i15 = (l41Var2.d + 1) % 7;
                    int i16 = 1440;
                    for (int i17 = 0; i17 < y0Var.h[i15].size(); i17++) {
                        if (((pf.x0) y0Var.h[i15].get(i17)).f45825a < i16) {
                            i16 = ((pf.x0) y0Var.h[i15].get(i17)).f45825a;
                        }
                    }
                    int i18 = i16 + 1439;
                    CharSequence charSequence = l41Var2.f30339l;
                    ArrayList arrayList = y0Var.h[l41Var2.d];
                    int i19 = 0;
                    for (int i20 = 0; i20 < 7; i20++) {
                        ArrayList arrayList2 = y0Var.h[i20];
                        if (arrayList2 != null) {
                            i19 = Math.max(1, arrayList2.size()) + i19;
                        }
                    }
                    pf.a1 a1Var = new pf.a1(charSequence, arrayList, max, i18, 28 - i19);
                    a1Var.f45563f = new mh.m2(y0Var, 28);
                    a1Var.h = new ai1(15, y0Var, l41Var2);
                    y0Var.presentFragment(a1Var);
                    return;
                }
            case 17:
                final pf.a1 a1Var2 = (pf.a1) this.f15813b;
                l41 l41Var3 = (l41) obj;
                final View view4 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = a1Var2.f45561c;
                int i22 = a1Var2.d;
                ArrayList arrayList3 = a1Var2.f45560b;
                int i23 = l41Var3.d;
                if (i23 == -1) {
                    a1Var2.f45565r = !a1Var2.f45565r;
                    arrayList3.clear();
                    if (a1Var2.f45565r) {
                        arrayList3.add(new pf.x0(0, 1439));
                    }
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view4;
                    boolean z11 = a1Var2.f45565r;
                    l41Var3.f30333e = z11;
                    t8Var.setChecked(z11);
                    boolean z12 = a1Var2.f45565r;
                    t8Var.b(org.telegram.ui.ActionBar.f6.w0(null, z12 ? org.telegram.ui.ActionBar.f6.f23037f6 : org.telegram.ui.ActionBar.f6.f23019e6, false), z12);
                    a1Var2.f45564n.U2.N(true);
                    mh.m2 m2Var = a1Var2.f45563f;
                    if (m2Var != null) {
                        m2Var.run();
                        return;
                    }
                    return;
                } else if (i23 == -2) {
                    if (!arrayList3.isEmpty() && !a1Var2.T()) {
                        int i24 = ((pf.x0) j3.r0.j(1, arrayList3)).f45826b;
                        int clamp = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new pf.x0(clamp, Utilities.clamp((i24 + 1560) / 2, i22, clamp + 1)));
                    } else {
                        if (a1Var2.T()) {
                            arrayList3.clear();
                        }
                        int clamp2 = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new pf.x0(clamp2, Utilities.clamp(1200, i22, clamp2 + 1)));
                    }
                    mh.m2 m2Var2 = a1Var2.f45563f;
                    if (m2Var2 != null) {
                        m2Var2.run();
                    }
                    a1Var2.f45564n.U2.N(true);
                    return;
                } else if (l41Var3.f48814a != 3 || (i9 = i23 / 3) < 0 || i9 >= arrayList3.size()) {
                    return;
                } else {
                    int i25 = i9 - 1;
                    pf.x0 x0Var = i25 >= 0 ? (pf.x0) arrayList3.get(i25) : null;
                    final pf.x0 x0Var2 = (pf.x0) arrayList3.get(i9);
                    int i26 = i9 + 1;
                    pf.x0 x0Var3 = i26 < arrayList3.size() ? (pf.x0) arrayList3.get(i26) : null;
                    int i27 = l41Var3.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = a1Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = x0Var2.f45825a;
                        if (x0Var != null) {
                            i21 = x0Var.f45826b + 1;
                        }
                        org.telegram.ui.Components.y4.X(parentActivity, string, i28, i21, x0Var2.f45826b - 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        a1 a1Var3 = a1Var2;
                                        boolean U = a1Var3.U();
                                        int intValue = num.intValue();
                                        x0Var2.f45825a = intValue;
                                        ((p8) view4).u(x0.a(intValue), true);
                                        if (U != a1Var3.U()) {
                                            a1Var3.f45564n.U2.N(true);
                                        }
                                        m2 m2Var3 = a1Var3.f45563f;
                                        if (m2Var3 != null) {
                                            m2Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        a1 a1Var4 = a1Var2;
                                        boolean U2 = a1Var4.U();
                                        int intValue2 = num.intValue();
                                        x0Var2.f45826b = intValue2;
                                        ((p8) view4).u(x0.a(intValue2), true);
                                        if (U2 != a1Var4.U()) {
                                            a1Var4.f45564n.U2.N(true);
                                        }
                                        m2 m2Var4 = a1Var4.f45563f;
                                        if (m2Var4 != null) {
                                            m2Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i27 == 1) {
                        Activity parentActivity2 = a1Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i29 = x0Var2.f45826b;
                        int i30 = x0Var2.f45825a + 1;
                        if (x0Var3 != null) {
                            i22 = x0Var3.f45825a - 1;
                        }
                        org.telegram.ui.Components.y4.X(parentActivity2, string2, i29, i30, i22, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj6) {
                                Integer num = (Integer) obj6;
                                switch (r4) {
                                    case 0:
                                        a1 a1Var3 = a1Var2;
                                        boolean U = a1Var3.U();
                                        int intValue = num.intValue();
                                        x0Var2.f45825a = intValue;
                                        ((p8) view4).u(x0.a(intValue), true);
                                        if (U != a1Var3.U()) {
                                            a1Var3.f45564n.U2.N(true);
                                        }
                                        m2 m2Var3 = a1Var3.f45563f;
                                        if (m2Var3 != null) {
                                            m2Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        a1 a1Var4 = a1Var2;
                                        boolean U2 = a1Var4.U();
                                        int intValue2 = num.intValue();
                                        x0Var2.f45826b = intValue2;
                                        ((p8) view4).u(x0.a(intValue2), true);
                                        if (U2 != a1Var4.U()) {
                                            a1Var4.f45564n.U2.N(true);
                                        }
                                        m2 m2Var4 = a1Var4.f45563f;
                                        if (m2Var4 != null) {
                                            m2Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i27 == 2) {
                        arrayList3.remove(i9);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new pf.x0(0, 1439));
                        }
                        a1Var2.f45564n.U2.N(true);
                        mh.m2 m2Var3 = a1Var2.f45563f;
                        if (m2Var3 != null) {
                            m2Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            case 19:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                pf.t1.T((pf.t1) this.f15813b, (l41) obj, (View) obj2);
                return;
            default:
                l41 l41Var4 = (l41) obj;
                View view5 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f10 = (Float) obj4;
                Float f11 = (Float) obj5;
                if (((qh.o3[]) this.f15813b)[0] != null) {
                    num.intValue();
                    f10.floatValue();
                    f11.floatValue();
                    if (view5 instanceof qh.s5) {
                        ((qh.s5) view5).B();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        qh.z3 z3Var = (qh.z3) this.f15813b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        z3Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        dyVar.finishFragment();
        return true;
    }

    @Override
    public void run(Bitmap bitmap, int i9) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f15813b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
        AndroidUtilities.runOnUIThread(new p61(3, tVar, bitmap));
    }
}
