package li;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import m4.n1;
import mg.s1;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.h20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.pp;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.un;
public final class s implements Runnable {
    public final int f12239a;
    public final Object f12240b;
    public final Object f12241c;
    public final Object d;

    public s(Object obj, Object obj2, Object obj3, int i10) {
        this.f12239a = i10;
        this.f12240b = obj;
        this.f12241c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.User Z1;
        ViewGroup viewGroup;
        switch (this.f12239a) {
            case 0:
                v vVar = (v) this.f12240b;
                HandlerThread handlerThread = (HandlerThread) this.f12241c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                vVar.getClass();
                try {
                    vVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 1:
                x0 x0Var = (x0) this.f12240b;
                z zVar = (z) this.f12241c;
                File file = (File) this.d;
                Handler handler = x0Var.f12312i;
                try {
                    zVar.c(file);
                    x0Var.g();
                    long h = zVar.h();
                    x0Var.f12316m.b("preview snapshot completed: durationMs=" + h + ", size=" + file.length() + ", elapsedMs=" + x0.f(x0Var.M));
                    handler.post(new i0(x0Var, h, 1));
                    return;
                } catch (Exception e) {
                    handler.post(new h0(x0Var, e, 3));
                    return;
                }
            case 2:
                File file2 = (File) this.d;
                u0 u0Var = ((x0) this.f12240b).e;
                long j10 = ((t0) this.f12241c).f12247a;
                lz0 lz0Var = (lz0) u0Var;
                synchronized (lz0Var) {
                    if (!lz0Var.d) {
                        lz0Var.f28230c.put(Long.valueOf(j10), new jz0(file2));
                        return;
                    }
                    return;
                }
            case 3:
                m4.b0 b0Var = (m4.b0) this.f12240b;
                m4.w wVar = (m4.w) this.f12241c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.f0 f0Var = b0Var.f12703b;
                if (f0Var.i(wVar)) {
                    f0Var.b(keyEvent, false, false);
                } else {
                    m4.p0 p0Var = f0Var.h;
                    n4.r rVar = wVar.f12981a;
                    rVar.getClass();
                    p0Var.getClass();
                    p0Var.i0(1, new m4.i0(p0Var, 9), rVar, true);
                }
                b0Var.f12702a = null;
                return;
            case 4:
                m4.f0 f0Var2 = (m4.f0) this.f12240b;
                m4.v0 v0Var = (m4.v0) this.f12241c;
                m4.x xVar = (m4.x) this.d;
                if (!f0Var2.j()) {
                    n1 n1Var = f0Var2.f12754t;
                    v0Var.getClass();
                    w7.y.b(n1Var, xVar);
                    return;
                }
                return;
            case 5:
                ((s1) this.f12240b).a(new Pair((HashMap) this.f12241c, (ArrayList) this.d));
                return;
            case 6:
                TLObject tLObject = (TLObject) this.f12240b;
                vp vpVar = (vp) this.f12241c;
                s1 s1Var = (s1) this.d;
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    vpVar.V3(tL_channels_channelParticipants.users, false);
                    vpVar.P3(tL_channels_channelParticipants.chats, false);
                    long e7 = d20.i(d20.f15147s0).e();
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i10).peer;
                        if (peer != null && jj.C1(peer) != e7 && (Z1 = vpVar.Z1(Long.valueOf(peer.user_id))) != null && !h20.x(Z1) && !Z1.bot) {
                            arrayList.add(vpVar.l1(peer));
                        }
                    }
                    s1Var.a(arrayList);
                    return;
                }
                return;
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12240b;
                q20 q20Var = (q20) this.f12241c;
                q20 q20Var2 = (q20) this.d;
                if (tL_error != null) {
                    q20Var.a(tL_error);
                    return;
                } else {
                    q20Var2.a(null);
                    return;
                }
            case 8:
                ((ag.l) this.f12240b).a(new Pair((HashMap) this.f12241c, (ArrayList) this.d));
                return;
            case 9:
                n2.j jVar = (n2.j) this.f12240b;
                this.f12241c.j(jVar.f13461a, jVar.f13462b, (Exception) this.d);
                return;
            case 10:
                n2.j jVar2 = (n2.j) this.f12240b;
                this.f12241c.l(jVar2.f13461a, jVar2.f13462b, (oa.d) this.d);
                return;
            case 11:
                nh.p pVar = (nh.p) this.f12240b;
                q80 q80Var = (q80) this.f12241c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                o80 o80Var = pVar.G;
                if (o80Var != null && pVar.H == q80Var) {
                    o80Var.a(clickableSpan);
                    pVar.H = null;
                    pVar.f13896y.f(true);
                    return;
                }
                return;
            case 12:
                of.d dVar = (of.d) this.f12240b;
                TLObject tLObject2 = (TLObject) this.f12241c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str = dVar.f14163b;
                int i11 = dVar.f14162a;
                if (tLObject2 != null) {
                    ui.b0(i11).i1(str, (TLRPC.Document) tLObject2, false);
                } else {
                    dVar.a();
                    ui.b0(i11).i1(str, null, true);
                    if (tL_error2 != null) {
                        zs.f(i11).d(new mh.k(6, dVar, tL_error2));
                    }
                }
                dVar.a();
                return;
            case 13:
                ((VideoAds) this.f12240b).lambda$show$3((wb) this.f12241c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 14:
                ((VideoAds) this.f12240b).lambda$show$5((wb) this.f12241c, (boolean[]) this.d);
                return;
            case 15:
                ((VideoPlayerHolderBase) this.f12240b).lambda$release$3((TLRPC.Document) this.f12241c, (Runnable) this.d);
                return;
            case 16:
                ((j20) this.f12240b).a((TLObject) this.f12241c, (TLRPC.TL_error) this.d);
                return;
            case 17:
                ((j20) this.f12240b).a((TLRPC.Updates) this.f12241c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f12240b;
                k2 k2Var = (k2) this.f12241c;
                k2 k2Var2 = (k2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (!actionBarLayout.h && !actionBarLayout.f20070a0) {
                    actionBarLayout.f20117w.setTranslationX(0.0f);
                } else {
                    actionBarLayout.f20117w.setScaleX(1.0f);
                    actionBarLayout.f20117w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.f20070a0 = false;
                }
                actionBarLayout.m(k2Var);
                k2Var.setRemovingFromStack(false);
                k2Var.onTransitionAnimationEnd(false, true);
                k2Var2.onTransitionAnimationEnd(true, true);
                k2Var2.onBecomeFullyVisible();
                return;
            case 19:
                ((k2) this.f12241c).presentFragment((un) this.d);
                ((i3) this.f12240b).f20394c = false;
                return;
            case 20:
                i3 i3Var = (i3) this.f12240b;
                ArrayList arrayList2 = (ArrayList) this.f12241c;
                h3 h3Var = (h3) this.d;
                i3Var.getClass();
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    if (((f3) arrayList2.get(i12)).f20298a == h3Var) {
                        arrayList2.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                i3Var.invalidate();
                return;
            case 21:
                s6 s6Var = (s6) this.f12240b;
                TLObject tLObject3 = (TLObject) this.f12241c;
                s6 s6Var2 = (s6) this.d;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    s6Var.f20811g0 = b8.r(null, tL_wallPaper.document);
                    zs.f(s6Var.E).b(s6Var, 142);
                    zs.f(s6Var.E).b(s6Var, 143);
                    b8.G(s6Var2.E).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                s6Var.s();
                return;
            case 22:
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.f12240b;
                b6.F0(s0Var.getContext(), s0Var.H, (TL_wallet.walletTransaction) this.f12241c, null, null, null, (org.telegram.ui.Cells.m0) this.d, s0Var.f22910g1);
                return;
            case 23:
                org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) this.f12240b;
                s0Var2.f22907f1.R0(s0Var2, (TLRPC.TL_premiumGiftOption) this.f12241c, (String) this.d);
                return;
            case 24:
                s6 s6Var3 = (s6) this.f12241c;
                s6Var3.f20809f = !s6Var3.d((File) this.d, s6Var3.f20805c);
                org.telegram.messenger.i0.g3(new ea(8, (ga) this.f12240b, s6Var3));
                return;
            case 25:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) this.f12240b;
                s4.L((Context) this.f12241c, g0Var.f26181d2, new m2.t(g0Var, 8), (p6) this.d);
                return;
            case 26:
                w7 w7Var = (w7) this.f12240b;
                TLObject tLObject4 = (TLObject) this.d;
                ((x1) this.f12241c).dismiss();
                if (tLObject4 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.f19821id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject4).document;
                    tL_inputDocument.f19805id = document.f19799id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    pp ppVar = w7Var.f32059m2;
                    if (ppVar != null) {
                        ppVar.f17469c.add(0, ppVar.d(document));
                        ppVar.e();
                    }
                    w7Var.f32061n2.clear();
                    w7Var.f32061n2.addAll(w7Var.f32059m2.f17469c);
                    w7Var.f32066q1.f();
                    ConnectionsManager.getInstance(w7Var.f21583a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 27:
                je jeVar = (je) this.f12240b;
                jeVar.getClass();
                ((lu0) this.f12241c).getViewTreeObserver().removeOnDrawListener(jeVar);
                ((bo0) this.d).f24847a.setHideAvatar(true);
                return;
            case 28:
                rf rfVar = (rf) this.f12240b;
                Uri uri = (Uri) this.f12241c;
                File file3 = (File) this.d;
                try {
                    InputStream openInputStream = rfVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        } else {
                            openInputStream.close();
                            fileOutputStream.close();
                            ef efVar = new ef(-1, file3.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(efVar);
                            org.telegram.messenger.i0.g3(new s(rfVar, arrayList3, file3, 29));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            default:
                ((rf) this.f12240b).J((File) this.d, (ArrayList) this.f12241c);
                return;
        }
    }
}
