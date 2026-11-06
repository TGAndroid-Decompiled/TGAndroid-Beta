package l2;

import a8.b8;
import android.content.Context;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import bi.ya;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import li.a6;
import li.c3;
import li.c6;
import li.g3;
import li.m5;
import li.t3;
import li.u5;
import li.x5;
import li.z5;
import org.telegram.messenger.gf;
import org.telegram.messenger.kp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Wallet.y5;
import org.telegram.ui.an;
public final class z0 implements Runnable {
    public final int f18098a;
    public final Object f18099b;
    public final Object f18100c;
    public final Object d;

    public z0(Object obj, Object obj2, Object obj3, int i7) {
        this.f18098a = i7;
        this.f18099b = obj;
        this.f18100c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.f18098a) {
            case 0:
                x2.g0 g0Var = (x2.g0) this.d;
                m2.e eVar = ((a1) this.f18099b).f17743c;
                h9.t1 f10 = ((h9.f0) this.f18100c).f();
                b8 b8Var = eVar.d;
                e2.c1 c1Var = eVar.h;
                c1Var.getClass();
                b8Var.getClass();
                b8Var.f336b = h9.i0.q(f10);
                if (!f10.isEmpty()) {
                    b8Var.f338e = (x2.g0) f10.get(0);
                    g0Var.getClass();
                    b8Var.f339f = g0Var;
                }
                if (((x2.g0) b8Var.d) == null) {
                    b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f336b, (x2.g0) b8Var.f338e, (e2.i1) b8Var.f335a);
                }
                b8Var.s(c1Var.y0());
                return;
            case 1:
                Pair pair = (Pair) this.f18100c;
                ((g1) this.f18099b).f17821b.h.b(((Integer) pair.first).intValue(), (x2.g0) pair.second, (qb.a) this.d);
                return;
            case 2:
                Pair pair2 = (Pair) this.f18100c;
                ((g1) this.f18099b).f17821b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.d);
                return;
            case 3:
                t3 t3Var = (t3) this.f18099b;
                k60 k60Var = (k60) this.f18100c;
                m5 m5Var = (m5) this.d;
                if (t3Var.f18891q4 == k60Var) {
                    t3Var.f18891q4 = null;
                    if (t3Var.J3 && t3Var.f18889p4 == m5Var && !m5Var.H.isEmpty()) {
                        t3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                t3 t3Var2 = (t3) this.f18099b;
                li.a aVar = (li.a) this.f18100c;
                li.a aVar2 = (li.a) this.d;
                ArrayList arrayList = t3Var2.f18903w4;
                g3 g3Var = t3Var2.f18898u3;
                if (g3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList.indexOf(aVar);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i7 < arrayList.size()) {
                            li.a aVar3 = (li.a) arrayList.get(i7);
                            long j3 = aVar3.f18405t;
                            if (j3 != 0) {
                                g3Var.X(i7, c6.l((TL_iv.RichText) t3Var2.f18896t3.get(Long.valueOf(j3))));
                            } else {
                                g3Var.X(i7, a6.z(aVar3.f18389b));
                            }
                            i7++;
                        }
                        g3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((t3) this.f18099b).d5((String) this.d, (li.a) this.f18100c);
                return;
            case 6:
                li.a aVar4 = (li.a) this.f18100c;
                z5 z5Var = (z5) this.d;
                x5 x5Var = ((u5) this.f18099b).f18922a.D;
                if (x5Var != null) {
                    ((c3) x5Var).d(aVar4, z5Var.f19045a, z5Var.f19046b, z5Var.f19047c, z5Var.d, z5Var.f19048e);
                    return;
                }
                return;
            case 7:
                mi.l lVar = (mi.l) this.f18099b;
                ArrayList arrayList2 = (ArrayList) this.f18100c;
                ArrayList arrayList3 = (ArrayList) this.d;
                lVar.getClass();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((View) arrayList2.get(i10)).setVisibility(0);
                }
                if (lVar.A.removeAll(arrayList3)) {
                    while (i7 < arrayList3.size()) {
                        lVar.d((v4.d1) arrayList3.get(i7));
                        i7++;
                    }
                    lVar.G();
                }
                lVar.K.removeAll(arrayList2);
                return;
            case 8:
                mi.l lVar2 = (mi.l) this.f18099b;
                View view = (View) this.f18100c;
                v4.d1 d1Var = (v4.d1) this.d;
                lVar2.getClass();
                view.setVisibility(0);
                if (lVar2.A.remove(d1Var)) {
                    lVar2.d(d1Var);
                    lVar2.G();
                }
                lVar2.K.remove(view);
                return;
            case 9:
                String str = h2.m0.f14112a;
                m2.e eVar2 = ((c0) ((n2.s) ((j2.n) this.f18099b).f16454c)).f17771a.f17881s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1009, new m2.d(U, (e2.u) this.f18100c, (e) this.d));
                return;
            case 10:
                AudioTrack audioTrack = (AudioTrack) this.f18099b;
                Handler handler = (Handler) this.f18100c;
                h2.r rVar = (h2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new w(rVar, 12));
                    }
                    synchronized (n2.f0.f20157t) {
                        try {
                            int i11 = n2.f0.v - 1;
                            n2.f0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.f0.f20158u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.f0.f20158u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new w(rVar, 12));
                    }
                    synchronized (n2.f0.f20157t) {
                        try {
                            int i12 = n2.f0.v - 1;
                            n2.f0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.f0.f20158u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.f0.f20158u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 11:
                SpannableString spannableString = (SpannableString) this.f18099b;
                ni.m.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((j2.n) this.f18100c).f16453b);
                ((org.telegram.ui.ActionBar.p) this.d).run();
                return;
            case 12:
                SpannableString spannableString2 = (SpannableString) this.f18099b;
                ni.m.a(spannableString2, spannableString2.length(), (com.google.android.gms.internal.play_billing.s0) ((j2.n) this.f18100c).f16453b);
                ((ya) this.d).a(spannableString2);
                return;
            case 13:
                ((VideoAds) this.f18099b).lambda$show$3((cc) this.f18100c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 14:
                ((VideoAds) this.f18099b).lambda$show$5((cc) this.f18100c, (boolean[]) this.d);
                return;
            case 15:
                ((VideoPlayerHolderBase) this.f18099b).lambda$release$3((TLRPC.Document) this.f18100c, (Runnable) this.d);
                return;
            case 16:
                ((v10) this.f18099b).a((TLObject) this.f18100c, (TLRPC.TL_error) this.d);
                return;
            case 17:
                ((v10) this.f18099b).a((TLRPC.Updates) this.f18100c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18099b;
                f2 f2Var = (f2) this.f18100c;
                f2 f2Var2 = (f2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (!actionBarLayout.h && !actionBarLayout.f27228a0) {
                    actionBarLayout.f27275w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f27275w.setScaleX(1.0f);
                    actionBarLayout.f27275w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.f27228a0 = false;
                }
                actionBarLayout.m(f2Var);
                f2Var.setRemovingFromStack(false);
                f2Var.onTransitionAnimationEnd(false, true);
                f2Var2.onTransitionAnimationEnd(true, true);
                f2Var2.onBecomeFullyVisible();
                return;
            case 19:
                ((f2) this.f18100c).presentFragment((an) this.d);
                ((d3) this.f18099b).f27427c = false;
                return;
            case 20:
                d3 d3Var = (d3) this.f18099b;
                ArrayList arrayList4 = (ArrayList) this.f18100c;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.d;
                d3Var.getClass();
                while (i7 < arrayList4.size()) {
                    if (((a3) arrayList4.get(i7)).f27303a == c3Var) {
                        arrayList4.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                d3Var.invalidate();
                return;
            case 21:
                j6 j6Var = (j6) this.f18099b;
                TLObject tLObject = (TLObject) this.f18100c;
                j6 j6Var2 = (j6) this.d;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                    j6Var.f27637g0 = w7.r(null, tL_wallPaper.document);
                    qs.f(j6Var.E).b(j6Var, 142);
                    qs.f(j6Var.E).b(j6Var, 143);
                    w7.G(j6Var2.E).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                j6Var.s();
                return;
            case 22:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f18099b;
                y5.G0(t0Var.getContext(), t0Var.H, (TL_wallet.walletTransaction) this.f18100c, null, null, null, (org.telegram.ui.Cells.m0) this.d, t0Var.f30311g1);
                return;
            case 23:
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.f18099b;
                t0Var2.f30308f1.W(t0Var2, (TLRPC.TL_premiumGiftOption) this.f18100c, (String) this.d);
                return;
            case 24:
                j6 j6Var3 = (j6) this.f18100c;
                j6Var3.f27635f = true ^ j6Var3.d((File) this.d, j6Var3.f27630c);
                org.telegram.messenger.g0.h3(new ea(8, (ga) this.f18099b, j6Var3));
                return;
            case 25:
                org.telegram.ui.Components.g0 g0Var2 = (org.telegram.ui.Components.g0) this.f18099b;
                v4.J((Context) this.f18100c, g0Var2.d2, new org.telegram.ui.Components.n(g0Var2), (f6) this.d);
                return;
            case 26:
                org.telegram.ui.Components.b8 b8Var2 = (org.telegram.ui.Components.b8) this.f18099b;
                TLObject tLObject2 = (TLObject) this.d;
                ((org.telegram.ui.ActionBar.u1) this.f18100c).dismiss();
                if (tLObject2 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.f26981id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    tL_inputDocument.f26965id = document.f26959id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    kp kpVar = b8Var2.f32077m2;
                    if (kpVar != null) {
                        kpVar.f23741c.add(0, kpVar.d(document));
                        kpVar.e();
                    }
                    b8Var2.f32078n2.clear();
                    b8Var2.f32078n2.addAll(b8Var2.f32077m2.f23741c);
                    b8Var2.f32083q1.f();
                    ConnectionsManager.getInstance(b8Var2.f28613a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 27:
                oe oeVar = (oe) this.f18099b;
                oeVar.getClass();
                ((it0) this.f18100c).getViewTreeObserver().removeOnDrawListener(oeVar);
                ((an0) this.d).f31856a.setHideAvatar(true);
                return;
            case 28:
                vf vfVar = (vf) this.f18099b;
                Uri uri = (Uri) this.f18100c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = vfVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        } else {
                            openInputStream.close();
                            fileOutputStream.close();
                            gf gfVar = new gf(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(gfVar);
                            org.telegram.messenger.g0.h3(new z0(vfVar, arrayList5, file, 29));
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return;
                }
            default:
                ((vf) this.f18099b).J((File) this.d, (ArrayList) this.f18100c);
                return;
        }
    }
}
