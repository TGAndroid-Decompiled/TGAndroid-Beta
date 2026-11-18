package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.a4;
import bi.v4;
import bi.x4;
import c8.ma;
import di.a5;
import di.b5;
import di.m8;
import di.o9;
import di.p5;
import di.s5;
import di.x8;
import di.z4;
import fi.f9;
import fi.v8;
import fi.w8;
import hi.l5;
import hi.wa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ki.t3;
import oi.c3;
import oi.o5;
import oi.t5;
import oi.z5;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.s10;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class a1 implements Runnable {
    public final int f1115a;
    public final int f1116b;
    public final Object f1117c;
    public final Object d;

    public a1(int i7, Object obj, Object obj2, int i10) {
        this.f1115a = i10;
        this.f1116b = i7;
        this.f1117c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7 = this.f1115a;
        String str = null;
        int i10 = 0;
        boolean z11 = true;
        Object obj = this.d;
        Object obj2 = this.f1117c;
        int i11 = this.f1116b;
        switch (i7) {
            case 0:
                DictationLid.c((byte[]) obj2, i11, (c1) obj);
                return;
            case 1:
                int[] iArr = (int[]) obj2;
                h1 h1Var = (h1) obj;
                ks f10 = ks.f(i11);
                int length = iArr.length;
                while (i10 < length) {
                    f10.n(h1Var, iArr[i10]);
                    i10++;
                }
                return;
            case 2:
                ((x4) obj2).run();
                org.telegram.messenger.g0.g3(new a4(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749567, v4.k(((org.telegram.ui.Wallet.p0) obj).f44732b), gd.x(i11, true))), 0));
                return;
            case 3:
                eq0 eq0Var = (eq0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                m8 m8Var = eq0Var.f4006e;
                if (i11 != -1) {
                    int i12 = tL_starGiftCollection.collection_id;
                    int i13 = m8Var.f9322a;
                    int f11 = m8Var.f(i12);
                    if (f11 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) m8Var.f9325e.remove(f11);
                        m8Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = mp.u1(i13).l1(m8Var.f9323b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i13).sendRequest(deletestargiftcollection, null);
                    }
                    eq0Var.f(true);
                    f71 f71Var = eq0Var.f4008n;
                    if (i11 < m8Var.d().size()) {
                        i11++;
                    }
                    f71Var.e(-1, i11);
                    eq0Var.o();
                    return;
                }
                return;
            case 4:
                ch.p pVar = (ch.p) obj2;
                x5 x5Var = (x5) obj;
                Editable text = pVar.h.getText();
                int spanStart = text.getSpanStart(x5Var);
                int spanEnd = text.getSpanEnd(x5Var);
                int i14 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    pVar.h.getText().delete(spanStart, spanEnd);
                    ch.m mVar = pVar.h;
                    mVar.setSelection(Math.min(i11 - i14, mVar.getText().length()));
                    return;
                }
                return;
            case 5:
                ci.b0.p((org.telegram.ui.ActionBar.h2) obj2, i11 + 1, (ci.z) obj);
                return;
            case 6:
                b5 b5Var = (b5) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr2 = b5Var.W;
                di.x4 x4Var = b5Var.f8546f;
                di.v4 v4Var = b5Var.h;
                if (starGift != null) {
                    z4 z4Var = new z4(b5Var.getContext());
                    z4Var.a(starGift, false);
                    z4Var.setRotation(180.0f);
                    v4Var.f(i11, z4Var);
                    z4Var.setScaleX(0.5f);
                    z4Var.setScaleY(0.5f);
                    z4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = z4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    lr lrVar = lr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(lrVar);
                    interpolator.setUpdateListener(new ah.g(b5Var, 6));
                    interpolator.start();
                    v4Var.f9915a[i11].setVisibility(8);
                    x4Var.setVisibility(0);
                    x4Var.setAlpha(0.0f);
                    x4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(lrVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(b5Var.getContext());
                ?? imageView = new ImageView(b5Var.getContext());
                imageView.f(2131624035, 32, 32, null);
                frameLayout.addView((View) imageView, ma.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                b5Var.m0 = imageView;
                frameLayout.setBackground(new p5(org.telegram.messenger.g0.L(12.0f), n6.r1(0.075f, -1)));
                v4Var.f9915a[i11].setVisibility(8);
                frameLayout.setRotation(180.0f);
                v4Var.f(i11, frameLayout);
                b5Var.G.a(iArr2[2], iArr2[3]);
                a5 a5Var = b5Var.f8539b;
                int[] iArr3 = b5Var.V;
                a5Var.a(iArr3[2], iArr3[3]);
                x4Var.a(iArr2[3], iArr2[2]);
                return;
            case 7:
                ((s10) obj).a(gd.a0(null, null, 2131750030, ki.k.J0(i11)), (s5) obj2, Boolean.FALSE);
                return;
            case 8:
                x8 x8Var = (x8) obj2;
                TLObject tLObject = (TLObject) obj;
                boolean[] zArr = x8Var.f10033r;
                ArrayList[] arrayListArr = x8Var.f10032q;
                int i15 = x8Var.f10018a;
                x8Var.f10035t[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    mp.u1(i15).f4(starsStatus.users, false);
                    mp.u1(i15).Z3(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    if (arrayListArr[i11].isEmpty() && !zArr[i11]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i11] = z10;
                    boolean[] zArr2 = x8Var.f10036u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i11] = z11;
                    String[] strArr = x8Var.f10034s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i11] = str;
                    x8Var.i0(starsStatus.balance);
                    ks.f(i15).k(224, new Object[0]);
                    return;
                }
                return;
            case 9:
                vf.c.t((Context) obj2, "https://" + mp.u1(i11).X2 + "/nft/" + ((String) obj));
                return;
            case 10:
                ((fi.c1) obj2).G.put((String) obj, Integer.valueOf(i11));
                return;
            case 11:
                TLObject tLObject2 = (TLObject) obj2;
                o9 o9Var = (o9) obj;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i11) {
                            o9Var.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                o9Var.a(null);
                return;
            case 12:
                f9 f9Var = ((w8) obj2).d;
                v8 v8Var = f9Var.f11986o0;
                int i16 = f9Var.h;
                v8Var.B0 = (ArrayList) obj;
                v8Var.f12310z0 = i16;
                v8Var.setAdapter(null);
                v8Var.setAdapter(v8Var.A0);
                v8Var.setCurrentItem(i11);
                v8Var.D0 = true;
                return;
            case 13:
                h2.o oVar = (h2.o) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    h2.q qVar = (h2.q) it.next();
                    if (!qVar.d) {
                        if (i11 != -1) {
                            qVar.f13811b.b(i11);
                        }
                        qVar.f13812c = true;
                        oVar.invoke(qVar.f13810a);
                    }
                }
                return;
            case 14:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) obj2, (String) obj, i11);
                return;
            case 15:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) obj2, (short[]) obj, i11);
                return;
            case 16:
                l5 l5Var = (l5) obj2;
                sg.g gVar = (sg.g) obj;
                if (l5Var.f14939y0.getCurrentBrush() instanceof sg.g) {
                    l5Var.M0 = true;
                }
                l5Var.w(gVar);
                tg.h1 h1Var2 = l5Var.U0;
                int i17 = h1Var2.d + 1;
                h1Var2.a(i17);
                org.telegram.messenger.g0.P3(h1Var2.f57898a[i17], i11);
                h1Var2.f57901e = true;
                return;
            case 17:
                org.telegram.messenger.g0.g3(new w0(i11, ((tr) obj2).l0(new ArrayList((HashSet) obj)), 11));
                return;
            case 18:
                ((wa) obj2).b((short[]) obj, i11);
                return;
            case 19:
                jg.h0 h0Var = (jg.h0) obj2;
                String str2 = (String) obj;
                int i18 = h0Var.f17493t0;
                h0Var.f17489r = null;
                if (i11 == h0Var.f17475e0) {
                    if (h0Var.f17484n >= 0) {
                        ConnectionsManager.getInstance(i18).cancelRequest(h0Var.f17484n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f17484n = ConnectionsManager.getInstance(i18).sendRequest(tL_channels_searchPosts, new jg.u(h0Var, i11, str2, 0));
                    return;
                }
                return;
            case 20:
                kg.y yVar = (kg.y) obj2;
                yVar.f18539b.add(i11, (TL_account.TL_businessChatLink) obj);
                ks.f(yVar.f18538a).k(125, new Object[0]);
                return;
            case 21:
                int[] iArr4 = (int[]) obj2;
                fs[] fsVarArr = (fs[]) obj;
                if (iArr4[0] >= 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(iArr4[0], true);
                    iArr4[0] = -1;
                }
                if (fsVarArr[0] != null) {
                    ks.f(i11).n(fsVarArr[0], 59);
                    fsVarArr[0] = null;
                    return;
                }
                return;
            case 22:
                t3 t3Var = (t3) obj2;
                TLObject tLObject3 = (TLObject) obj;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    t3Var.f18963y = tL_webViewResultUrl.query_id;
                    t3Var.f18958n.t(i11, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.g3(t3Var.V);
                    return;
                }
                return;
            case 23:
                Pair pair = (Pair) obj;
                ((l2.c1) obj2).f19276b.h.N(((Integer) pair.first).intValue(), (x2.g0) pair.second, i11);
                return;
            case 24:
                o5 m10 = ((oi.l5) obj2).getGrid().m((TL_iv.pageTableCell) obj);
                if (m10 != null) {
                    oi.e1 e1Var = m10.f22226a;
                    e1Var.O();
                    e1Var.setSelection(Math.max(0, Math.min(i11, e1Var.length())));
                    return;
                }
                return;
            case 25:
                oi.a aVar = (oi.a) obj;
                z5 z5Var = ((t5) obj2).f22381a;
                if (z5Var.E != null) {
                    z5.e(aVar.f21910b, "");
                    ((c3) z5Var.E).c(aVar, i11);
                    return;
                }
                return;
            case 26:
                ((CameraView) obj2).lambda$createCamera$13(i11, (SurfaceTexture) obj);
                return;
            case 27:
                NativeInstance.a((NativeInstance) obj2, i11, (String) obj);
                return;
            case 28:
                ((VoIPService) obj2).lambda$createGroupInstance$74((String) obj, i11);
                return;
            default:
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) obj;
                String str3 = mp.u1(i11).R6;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                vf.c.t(context, str3);
                x2VarArr[0].dismiss();
                return;
        }
    }

    public a1(Object obj, int i7, Object obj2, int i10) {
        this.f1115a = i10;
        this.f1117c = obj;
        this.f1116b = i7;
        this.d = obj2;
    }

    public a1(Object obj, Object obj2, int i7, int i10) {
        this.f1115a = i10;
        this.f1117c = obj;
        this.d = obj2;
        this.f1116b = i7;
    }
}
