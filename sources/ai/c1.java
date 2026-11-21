package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.a5;
import bi.e4;
import bi.y4;
import c8.ma;
import di.b5;
import di.n8;
import di.p5;
import di.p9;
import di.s5;
import di.v4;
import di.x4;
import di.y8;
import di.z4;
import fi.f9;
import fi.v8;
import fi.w8;
import hi.k5;
import hi.va;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ki.s3;
import oi.a6;
import oi.d3;
import oi.m5;
import oi.u5;
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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class c1 implements Runnable {
    public final int f1135a;
    public final int f1136b;
    public final Object f1137c;
    public final Object d;

    public c1(int i7, Object obj, Object obj2, int i10) {
        this.f1135a = i10;
        this.f1136b = i7;
        this.f1137c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7 = this.f1135a;
        String str = null;
        int i10 = 0;
        boolean z11 = true;
        Object obj = this.d;
        Object obj2 = this.f1137c;
        int i11 = this.f1136b;
        switch (i7) {
            case 0:
                DictationLid.c((byte[]) obj2, i11, (e1) obj);
                return;
            case 1:
                int[] iArr = (int[]) obj2;
                j1 j1Var = (j1) obj;
                ks f10 = ks.f(i11);
                int length = iArr.length;
                while (i10 < length) {
                    f10.n(j1Var, iArr[i10]);
                    i10++;
                }
                return;
            case 2:
                ((a5) obj2).run();
                org.telegram.messenger.g0.g3(new e4(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749566, y4.k(((org.telegram.ui.Wallet.p0) obj).f44772b), gd.x(i11, true))), 0));
                return;
            case 3:
                gq0 gq0Var = (gq0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                n8 n8Var = gq0Var.f4117e;
                if (i11 != -1) {
                    int i12 = tL_starGiftCollection.collection_id;
                    int i13 = n8Var.f9403a;
                    int f11 = n8Var.f(i12);
                    if (f11 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) n8Var.f9406e.remove(f11);
                        n8Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = mp.u1(i13).l1(n8Var.f9404b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i13).sendRequest(deletestargiftcollection, null);
                    }
                    gq0Var.f(true);
                    i71 i71Var = gq0Var.f4119n;
                    if (i11 < n8Var.d().size()) {
                        i11++;
                    }
                    i71Var.e(-1, i11);
                    gq0Var.o();
                    return;
                }
                return;
            case 4:
                ch.p pVar = (ch.p) obj2;
                y5 y5Var = (y5) obj;
                Editable text = pVar.h.getText();
                int spanStart = text.getSpanStart(y5Var);
                int spanEnd = text.getSpanEnd(y5Var);
                int i14 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    pVar.h.getText().delete(spanStart, spanEnd);
                    ch.m mVar = pVar.h;
                    mVar.setSelection(Math.min(i11 - i14, mVar.getText().length()));
                    return;
                }
                return;
            case 5:
                ci.b0.p((org.telegram.ui.ActionBar.g2) obj2, i11 + 1, (ci.z) obj);
                return;
            case 6:
                b5 b5Var = (b5) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr2 = b5Var.W;
                x4 x4Var = b5Var.f8564f;
                v4 v4Var = b5Var.h;
                if (starGift != null) {
                    z4 z4Var = new z4(b5Var.getContext());
                    z4Var.a(starGift, false);
                    z4Var.setRotation(180.0f);
                    v4Var.f(i11, z4Var);
                    z4Var.setScaleX(0.5f);
                    z4Var.setScaleY(0.5f);
                    z4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = z4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    nr nrVar = nr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(nrVar);
                    interpolator.setUpdateListener(new ah.g(b5Var, 6));
                    interpolator.start();
                    v4Var.f9941a[i11].setVisibility(8);
                    x4Var.setVisibility(0);
                    x4Var.setAlpha(0.0f);
                    x4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(nrVar).start();
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
                frameLayout.setBackground(new p5(org.telegram.messenger.g0.L(12.0f), m6.r1(0.075f, -1)));
                v4Var.f9941a[i11].setVisibility(8);
                frameLayout.setRotation(180.0f);
                v4Var.f(i11, frameLayout);
                b5Var.G.a(iArr2[2], iArr2[3]);
                di.a5 a5Var = b5Var.f8557b;
                int[] iArr3 = b5Var.V;
                a5Var.a(iArr3[2], iArr3[3]);
                x4Var.a(iArr2[3], iArr2[2]);
                return;
            case 7:
                ((s10) obj).a(gd.a0(null, null, 2131750029, ki.j.J0(i11)), (s5) obj2, Boolean.FALSE);
                return;
            case 8:
                y8 y8Var = (y8) obj2;
                TLObject tLObject = (TLObject) obj;
                boolean[] zArr = y8Var.f10097r;
                ArrayList[] arrayListArr = y8Var.f10096q;
                int i15 = y8Var.f10082a;
                y8Var.f10099t[i11] = false;
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
                    boolean[] zArr2 = y8Var.f10100u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i11] = z11;
                    String[] strArr = y8Var.f10098s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i11] = str;
                    y8Var.i0(starsStatus.balance);
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
                p9 p9Var = (p9) obj;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i11) {
                            p9Var.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                p9Var.a(null);
                return;
            case 12:
                f9 f9Var = ((w8) obj2).d;
                v8 v8Var = f9Var.f12024o0;
                int i16 = f9Var.h;
                v8Var.B0 = (ArrayList) obj;
                v8Var.f12349z0 = i16;
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
                            qVar.f13837b.b(i11);
                        }
                        qVar.f13838c = true;
                        oVar.invoke(qVar.f13836a);
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
                k5 k5Var = (k5) obj2;
                sg.g gVar = (sg.g) obj;
                if (k5Var.f14911y0.getCurrentBrush() instanceof sg.g) {
                    k5Var.M0 = true;
                }
                k5Var.w(gVar);
                tg.i1 i1Var = k5Var.U0;
                int i17 = i1Var.d + 1;
                i1Var.a(i17);
                org.telegram.messenger.g0.P3(i1Var.f57957a[i17], i11);
                i1Var.f57960e = true;
                return;
            case 17:
                org.telegram.messenger.g0.g3(new y0(i11, ((tr) obj2).l0(new ArrayList((HashSet) obj)), 11));
                return;
            case 18:
                ((va) obj2).b((short[]) obj, i11);
                return;
            case 19:
                jg.h0 h0Var = (jg.h0) obj2;
                String str2 = (String) obj;
                int i18 = h0Var.f17515t0;
                h0Var.f17511r = null;
                if (i11 == h0Var.f17497e0) {
                    if (h0Var.f17506n >= 0) {
                        ConnectionsManager.getInstance(i18).cancelRequest(h0Var.f17506n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f17506n = ConnectionsManager.getInstance(i18).sendRequest(tL_channels_searchPosts, new jg.u(h0Var, i11, str2, 0));
                    return;
                }
                return;
            case 20:
                kg.z zVar = (kg.z) obj2;
                zVar.f18576b.add(i11, (TL_account.TL_businessChatLink) obj);
                ks.f(zVar.f18575a).k(125, new Object[0]);
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
                s3 s3Var = (s3) obj2;
                TLObject tLObject3 = (TLObject) obj;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    s3Var.f18970y = tL_webViewResultUrl.query_id;
                    s3Var.f18965n.t(i11, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.g3(s3Var.V);
                    return;
                }
                return;
            case 23:
                Pair pair = (Pair) obj;
                ((l2.c1) obj2).f19301b.h.N(((Integer) pair.first).intValue(), (x2.g0) pair.second, i11);
                return;
            case 24:
                oi.p5 m10 = ((m5) obj2).getGrid().m((TL_iv.pageTableCell) obj);
                if (m10 != null) {
                    oi.f1 f1Var = m10.f22312a;
                    f1Var.O();
                    f1Var.setSelection(Math.max(0, Math.min(i11, f1Var.length())));
                    return;
                }
                return;
            case 25:
                oi.a aVar = (oi.a) obj;
                a6 a6Var = ((u5) obj2).f22467a;
                if (a6Var.E != null) {
                    a6.e(aVar.f21932b, "");
                    ((d3) a6Var.E).c(aVar, i11);
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
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj;
                String str3 = mp.u1(i11).R6;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                vf.c.t(context, str3);
                w2VarArr[0].dismiss();
                return;
        }
    }

    public c1(Object obj, int i7, Object obj2, int i10) {
        this.f1135a = i10;
        this.f1137c = obj;
        this.f1136b = i7;
        this.d = obj2;
    }

    public c1(Object obj, Object obj2, int i7, int i10) {
        this.f1135a = i10;
        this.f1137c = obj;
        this.d = obj2;
        this.f1136b = i7;
    }
}
