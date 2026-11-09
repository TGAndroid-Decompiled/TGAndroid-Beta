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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Wallet.w5;
import org.telegram.ui.cn;
public final class z0 implements Runnable {
    public final int f18101a;
    public final Object f18102b;
    public final Object f18103c;
    public final Object d;

    public z0(Object obj, Object obj2, Object obj3, int i7) {
        this.f18101a = i7;
        this.f18102b = obj;
        this.f18103c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.f18101a) {
            case 0:
                x2.g0 g0Var = (x2.g0) this.d;
                m2.e eVar = ((a1) this.f18102b).f17744c;
                h9.t1 f10 = ((h9.f0) this.f18103c).f();
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
                Pair pair = (Pair) this.f18103c;
                ((g1) this.f18102b).f17822b.h.b(((Integer) pair.first).intValue(), (x2.g0) pair.second, (qb.a) this.d);
                return;
            case 2:
                Pair pair2 = (Pair) this.f18103c;
                ((g1) this.f18102b).f17822b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.d);
                return;
            case 3:
                t3 t3Var = (t3) this.f18102b;
                l60 l60Var = (l60) this.f18103c;
                m5 m5Var = (m5) this.d;
                if (t3Var.f18894q4 == l60Var) {
                    t3Var.f18894q4 = null;
                    if (t3Var.J3 && t3Var.f18892p4 == m5Var && !m5Var.H.isEmpty()) {
                        t3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                t3 t3Var2 = (t3) this.f18102b;
                li.a aVar = (li.a) this.f18103c;
                li.a aVar2 = (li.a) this.d;
                ArrayList arrayList = t3Var2.f18906w4;
                g3 g3Var = t3Var2.f18901u3;
                if (g3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList.indexOf(aVar);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i7 < arrayList.size()) {
                            li.a aVar3 = (li.a) arrayList.get(i7);
                            long j3 = aVar3.f18408t;
                            if (j3 != 0) {
                                g3Var.X(i7, c6.l((TL_iv.RichText) t3Var2.f18899t3.get(Long.valueOf(j3))));
                            } else {
                                g3Var.X(i7, a6.z(aVar3.f18392b));
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
                ((t3) this.f18102b).d5((String) this.d, (li.a) this.f18103c);
                return;
            case 6:
                li.a aVar4 = (li.a) this.f18103c;
                z5 z5Var = (z5) this.d;
                x5 x5Var = ((u5) this.f18102b).f18925a.D;
                if (x5Var != null) {
                    ((c3) x5Var).d(aVar4, z5Var.f19048a, z5Var.f19049b, z5Var.f19050c, z5Var.d, z5Var.f19051e);
                    return;
                }
                return;
            case 7:
                mi.l lVar = (mi.l) this.f18102b;
                ArrayList arrayList2 = (ArrayList) this.f18103c;
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
                mi.l lVar2 = (mi.l) this.f18102b;
                View view = (View) this.f18103c;
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
                m2.e eVar2 = ((c0) ((n2.s) ((j2.n) this.f18102b).f16457c)).f17772a.f17882s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1009, new m2.d(U, (e2.u) this.f18103c, (e) this.d));
                return;
            case 10:
                AudioTrack audioTrack = (AudioTrack) this.f18102b;
                Handler handler = (Handler) this.f18103c;
                h2.r rVar = (h2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new a0(rVar, 11));
                    }
                    synchronized (n2.f0.f20160t) {
                        try {
                            int i11 = n2.f0.v - 1;
                            n2.f0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.f0.f20161u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.f0.f20161u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new a0(rVar, 11));
                    }
                    synchronized (n2.f0.f20160t) {
                        try {
                            int i12 = n2.f0.v - 1;
                            n2.f0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.f0.f20161u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.f0.f20161u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 11:
                SpannableString spannableString = (SpannableString) this.f18102b;
                ni.m.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((j2.n) this.f18103c).f16456b);
                ((org.telegram.ui.ActionBar.p) this.d).run();
                return;
            case 12:
                SpannableString spannableString2 = (SpannableString) this.f18102b;
                ni.m.a(spannableString2, spannableString2.length(), (com.google.android.gms.internal.play_billing.s0) ((j2.n) this.f18103c).f16456b);
                ((ya) this.d).a(spannableString2);
                return;
            case 13:
                ((VideoAds) this.f18102b).lambda$show$3((cc) this.f18103c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 14:
                ((VideoAds) this.f18102b).lambda$show$5((cc) this.f18103c, (boolean[]) this.d);
                return;
            case 15:
                ((VideoPlayerHolderBase) this.f18102b).lambda$release$3((TLRPC.Document) this.f18103c, (Runnable) this.d);
                return;
            case 16:
                ((v10) this.f18102b).a((TLObject) this.f18103c, (TLRPC.TL_error) this.d);
                return;
            case 17:
                ((v10) this.f18102b).a((TLRPC.Updates) this.f18103c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18102b;
                f2 f2Var = (f2) this.f18103c;
                f2 f2Var2 = (f2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (!actionBarLayout.h && !actionBarLayout.f27231a0) {
                    actionBarLayout.f27278w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f27278w.setScaleX(1.0f);
                    actionBarLayout.f27278w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.f27231a0 = false;
                }
                actionBarLayout.m(f2Var);
                f2Var.setRemovingFromStack(false);
                f2Var.onTransitionAnimationEnd(false, true);
                f2Var2.onTransitionAnimationEnd(true, true);
                f2Var2.onBecomeFullyVisible();
                return;
            case 19:
                ((f2) this.f18103c).presentFragment((cn) this.d);
                ((d3) this.f18102b).f27414c = false;
                return;
            case 20:
                d3 d3Var = (d3) this.f18102b;
                ArrayList arrayList4 = (ArrayList) this.f18103c;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.d;
                d3Var.getClass();
                while (i7 < arrayList4.size()) {
                    if (((a3) arrayList4.get(i7)).f27306a == c3Var) {
                        arrayList4.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                d3Var.invalidate();
                return;
            case 21:
                k6 k6Var = (k6) this.f18102b;
                TLObject tLObject = (TLObject) this.f18103c;
                k6 k6Var2 = (k6) this.d;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                    k6Var.f27747g0 = w7.r(null, tL_wallPaper.document);
                    qs.f(k6Var.E).b(k6Var, 142);
                    qs.f(k6Var.E).b(k6Var, 143);
                    w7.G(k6Var2.E).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                k6Var.s();
                return;
            case 22:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f18102b;
                w5.G0(t0Var.getContext(), t0Var.H, (TL_wallet.walletTransaction) this.f18103c, null, null, null, (org.telegram.ui.Cells.m0) this.d, t0Var.f30319g1);
                return;
            case 23:
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.f18102b;
                t0Var2.f30316f1.W(t0Var2, (TLRPC.TL_premiumGiftOption) this.f18103c, (String) this.d);
                return;
            case 24:
                k6 k6Var3 = (k6) this.f18103c;
                k6Var3.f27745f = true ^ k6Var3.d((File) this.d, k6Var3.f27740c);
                org.telegram.messenger.g0.h3(new ea(8, (ga) this.f18102b, k6Var3));
                return;
            case 25:
                org.telegram.ui.Components.g0 g0Var2 = (org.telegram.ui.Components.g0) this.f18102b;
                v4.J((Context) this.f18103c, g0Var2.d2, new org.telegram.ui.Components.n(g0Var2), (g6) this.d);
                return;
            case 26:
                org.telegram.ui.Components.b8 b8Var2 = (org.telegram.ui.Components.b8) this.f18102b;
                TLObject tLObject2 = (TLObject) this.d;
                ((org.telegram.ui.ActionBar.u1) this.f18103c).dismiss();
                if (tLObject2 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.f26984id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    tL_inputDocument.f26968id = document.f26962id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    kp kpVar = b8Var2.f32140m2;
                    if (kpVar != null) {
                        kpVar.f23741c.add(0, kpVar.d(document));
                        kpVar.e();
                    }
                    b8Var2.f32141n2.clear();
                    b8Var2.f32141n2.addAll(b8Var2.f32140m2.f23741c);
                    b8Var2.f32146q1.f();
                    ConnectionsManager.getInstance(b8Var2.f28621a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 27:
                oe oeVar = (oe) this.f18102b;
                oeVar.getClass();
                ((kt0) this.f18103c).getViewTreeObserver().removeOnDrawListener(oeVar);
                ((bn0) this.d).f32331a.setHideAvatar(true);
                return;
            case 28:
                vf vfVar = (vf) this.f18102b;
                Uri uri = (Uri) this.f18103c;
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
                ((vf) this.f18102b).J((File) this.d, (ArrayList) this.f18103c);
                return;
        }
    }
}
