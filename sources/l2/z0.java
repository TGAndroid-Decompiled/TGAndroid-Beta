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
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.uf;
import org.telegram.ui.cn;
public final class z0 implements Runnable {
    public final int f18104a;
    public final Object f18105b;
    public final Object f18106c;
    public final Object d;

    public z0(Object obj, Object obj2, Object obj3, int i7) {
        this.f18104a = i7;
        this.f18105b = obj;
        this.f18106c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.f18104a) {
            case 0:
                x2.f0 f0Var = (x2.f0) this.d;
                m2.e eVar = ((a1) this.f18105b).f17747c;
                h9.t1 f10 = ((h9.f0) this.f18106c).f();
                b8 b8Var = eVar.d;
                e2.c1 c1Var = eVar.h;
                c1Var.getClass();
                b8Var.getClass();
                b8Var.f336b = h9.i0.q(f10);
                if (!f10.isEmpty()) {
                    b8Var.f338e = (x2.f0) f10.get(0);
                    f0Var.getClass();
                    b8Var.f339f = f0Var;
                }
                if (((x2.f0) b8Var.d) == null) {
                    b8Var.d = b8.f(c1Var, (h9.i0) b8Var.f336b, (x2.f0) b8Var.f338e, (e2.i1) b8Var.f335a);
                }
                b8Var.s(c1Var.y0());
                return;
            case 1:
                Pair pair = (Pair) this.f18106c;
                ((g1) this.f18105b).f17825b.h.b(((Integer) pair.first).intValue(), (x2.f0) pair.second, (qb.a) this.d);
                return;
            case 2:
                Pair pair2 = (Pair) this.f18106c;
                ((g1) this.f18105b).f17825b.h.K(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, (Exception) this.d);
                return;
            case 3:
                t3 t3Var = (t3) this.f18105b;
                k60 k60Var = (k60) this.f18106c;
                m5 m5Var = (m5) this.d;
                if (t3Var.f18897q4 == k60Var) {
                    t3Var.f18897q4 = null;
                    if (t3Var.J3 && t3Var.f18895p4 == m5Var && !m5Var.H.isEmpty()) {
                        t3Var.P2();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                t3 t3Var2 = (t3) this.f18105b;
                li.a aVar = (li.a) this.f18106c;
                li.a aVar2 = (li.a) this.d;
                ArrayList arrayList = t3Var2.f18909w4;
                g3 g3Var = t3Var2.f18904u3;
                if (g3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList.indexOf(aVar);
                    int indexOf2 = arrayList.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i7 < arrayList.size()) {
                            li.a aVar3 = (li.a) arrayList.get(i7);
                            long j3 = aVar3.f18411t;
                            if (j3 != 0) {
                                g3Var.X(i7, c6.l((TL_iv.RichText) t3Var2.f18902t3.get(Long.valueOf(j3))));
                            } else {
                                g3Var.X(i7, a6.z(aVar3.f18395b));
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
                ((t3) this.f18105b).d5((String) this.d, (li.a) this.f18106c);
                return;
            case 6:
                li.a aVar4 = (li.a) this.f18106c;
                z5 z5Var = (z5) this.d;
                x5 x5Var = ((u5) this.f18105b).f18928a.D;
                if (x5Var != null) {
                    ((c3) x5Var).d(aVar4, z5Var.f19053a, z5Var.f19054b, z5Var.f19055c, z5Var.d, z5Var.f19056e);
                    return;
                }
                return;
            case 7:
                mi.l lVar = (mi.l) this.f18105b;
                ArrayList arrayList2 = (ArrayList) this.f18106c;
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
                mi.l lVar2 = (mi.l) this.f18105b;
                View view = (View) this.f18106c;
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
                String str = h2.m0.f14114a;
                m2.e eVar2 = ((c0) ((n2.s) ((j2.n) this.f18105b).f16457c)).f17775a.f17885s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1009, new m2.d(U, (e2.u) this.f18106c, (e) this.d));
                return;
            case 10:
                AudioTrack audioTrack = (AudioTrack) this.f18105b;
                Handler handler = (Handler) this.f18106c;
                h2.r rVar = (h2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new a0(rVar, 11));
                    }
                    synchronized (n2.f0.f20165t) {
                        try {
                            int i11 = n2.f0.v - 1;
                            n2.f0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.f0.f20166u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.f0.f20166u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new a0(rVar, 11));
                    }
                    synchronized (n2.f0.f20165t) {
                        try {
                            int i12 = n2.f0.v - 1;
                            n2.f0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.f0.f20166u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.f0.f20166u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 11:
                SpannableString spannableString = (SpannableString) this.f18105b;
                ni.m.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((j2.n) this.f18106c).f16456b);
                ((org.telegram.ui.ActionBar.c) this.d).run();
                return;
            case 12:
                SpannableString spannableString2 = (SpannableString) this.f18105b;
                ni.m.a(spannableString2, spannableString2.length(), (com.google.android.gms.internal.play_billing.s0) ((j2.n) this.f18106c).f16456b);
                ((ya) this.d).a(spannableString2);
                return;
            case 13:
                ((VideoAds) this.f18105b).lambda$show$3((bc) this.f18106c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 14:
                ((VideoAds) this.f18105b).lambda$show$5((bc) this.f18106c, (boolean[]) this.d);
                return;
            case 15:
                ((VideoPlayerHolderBase) this.f18105b).lambda$release$3((TLRPC.Document) this.f18106c, (Runnable) this.d);
                return;
            case 16:
                ((v10) this.f18105b).a((TLObject) this.f18106c, (TLRPC.TL_error) this.d);
                return;
            case 17:
                ((v10) this.f18105b).a((TLRPC.Updates) this.f18106c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18105b;
                f2 f2Var = (f2) this.f18106c;
                f2 f2Var2 = (f2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (!actionBarLayout.h && !actionBarLayout.f27235a0) {
                    actionBarLayout.f27282w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f27282w.setScaleX(1.0f);
                    actionBarLayout.f27282w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.f27235a0 = false;
                }
                actionBarLayout.m(f2Var);
                f2Var.setRemovingFromStack(false);
                f2Var.onTransitionAnimationEnd(false, true);
                f2Var2.onTransitionAnimationEnd(true, true);
                f2Var2.onBecomeFullyVisible();
                return;
            case 19:
                ((f2) this.f18106c).presentFragment((cn) this.d);
                ((e3) this.f18105b).f27434c = false;
                return;
            case 20:
                e3 e3Var = (e3) this.f18105b;
                ArrayList arrayList4 = (ArrayList) this.f18106c;
                d3 d3Var = (d3) this.d;
                e3Var.getClass();
                while (i7 < arrayList4.size()) {
                    if (((b3) arrayList4.get(i7)).f27327a == d3Var) {
                        arrayList4.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                e3Var.invalidate();
                return;
            case 21:
                l6 l6Var = (l6) this.f18105b;
                TLObject tLObject = (TLObject) this.f18106c;
                l6 l6Var2 = (l6) this.d;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                    l6Var.f27776g0 = w7.r(null, tL_wallPaper.document);
                    qs.f(l6Var.E).b(l6Var, 142);
                    qs.f(l6Var.E).b(l6Var, 143);
                    w7.G(l6Var2.E).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                l6Var.s();
                return;
            case 22:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.f18105b;
                org.telegram.ui.Wallet.z5.G0(t0Var.getContext(), t0Var.H, (TL_wallet.walletTransaction) this.f18106c, null, null, null, (org.telegram.ui.Cells.m0) this.d, t0Var.f30330g1);
                return;
            case 23:
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.f18105b;
                t0Var2.f30327f1.W(t0Var2, (TLRPC.TL_premiumGiftOption) this.f18106c, (String) this.d);
                return;
            case 24:
                l6 l6Var3 = (l6) this.f18106c;
                l6Var3.f27774f = true ^ l6Var3.d((File) this.d, l6Var3.f27769c);
                org.telegram.messenger.g0.h3(new ea(8, (ga) this.f18105b, l6Var3));
                return;
            case 25:
                org.telegram.ui.Components.f0 f0Var2 = (org.telegram.ui.Components.f0) this.f18105b;
                u4.J((Context) this.f18106c, f0Var2.f33410g2, new org.telegram.ui.Components.m(f0Var2), (h6) this.d);
                return;
            case 26:
                a8 a8Var = (a8) this.f18105b;
                TLObject tLObject2 = (TLObject) this.d;
                ((org.telegram.ui.ActionBar.u1) this.f18106c).dismiss();
                if (tLObject2 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.f26988id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    tL_inputDocument.f26972id = document.f26966id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    kp kpVar = a8Var.f31751p2;
                    if (kpVar != null) {
                        kpVar.f23745c.add(0, kpVar.d(document));
                        kpVar.e();
                    }
                    a8Var.f31753q2.clear();
                    a8Var.f31753q2.addAll(a8Var.f31751p2.f23745c);
                    a8Var.f31758t1.f();
                    ConnectionsManager.getInstance(a8Var.f28669a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 27:
                ne neVar = (ne) this.f18105b;
                neVar.getClass();
                ((jt0) this.f18106c).getViewTreeObserver().removeOnDrawListener(neVar);
                ((an0) this.d).f31934a.setHideAvatar(true);
                return;
            case 28:
                uf ufVar = (uf) this.f18105b;
                Uri uri = (Uri) this.f18106c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = ufVar.getContext().getContentResolver().openInputStream(uri);
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
                            org.telegram.messenger.g0.h3(new z0(ufVar, arrayList5, file, 29));
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return;
                }
            default:
                ((uf) this.f18105b).J((File) this.d, (ArrayList) this.f18106c);
                return;
        }
    }
}
