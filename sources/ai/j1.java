package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.e4;
import bi.x4;
import bi.z4;
import c8.ma;
import di.a5;
import di.b5;
import di.n8;
import di.p5;
import di.p9;
import di.s5;
import di.v4;
import di.y8;
import fi.f9;
import fi.v8;
import fi.w8;
import hi.k5;
import hi.va;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ki.s3;
import oi.a6;
import oi.d3;
import oi.m5;
import oi.u5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.t10;
import org.telegram.messenger.ur;
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
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.g4;
public final class j1 implements Runnable {
    public final int f1250a;
    public final int f1251b;
    public final Object f1252c;
    public final Object d;

    public j1(int i7, Object obj, Object obj2, int i10) {
        this.f1250a = i10;
        this.f1251b = i7;
        this.f1252c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str = null;
        boolean z11 = true;
        int i7 = 0;
        switch (this.f1250a) {
            case 0:
                int i10 = this.f1251b;
                int[] iArr = (int[]) this.f1252c;
                k1 k1Var = (k1) this.d;
                ls f10 = ls.f(i10);
                int length = iArr.length;
                while (i7 < length) {
                    f10.n(k1Var, iArr[i7]);
                    i7++;
                }
                return;
            case 1:
                int i11 = this.f1251b;
                ((z4) this.f1252c).run();
                org.telegram.messenger.g0.g3(new e4(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749566, x4.k(((org.telegram.ui.Wallet.p0) this.d).f44776b), hd.x(i11, true))), 0));
                return;
            case 2:
                gq0 gq0Var = (gq0) this.f1252c;
                int i12 = this.f1251b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                n8 n8Var = gq0Var.f4094e;
                if (i12 != -1) {
                    int i13 = tL_starGiftCollection.collection_id;
                    int i14 = n8Var.f9406a;
                    int f11 = n8Var.f(i13);
                    if (f11 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) n8Var.f9409e.remove(f11);
                        n8Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = np.u1(i14).l1(n8Var.f9407b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i14).sendRequest(deletestargiftcollection, null);
                    }
                    gq0Var.f(true);
                    i71 i71Var = gq0Var.f4096n;
                    if (i12 < n8Var.d().size()) {
                        i12++;
                    }
                    i71Var.e(-1, i12);
                    gq0Var.o();
                    return;
                }
                return;
            case 3:
                ch.p pVar = (ch.p) this.f1252c;
                y5 y5Var = (y5) this.d;
                int i15 = this.f1251b;
                Editable text = pVar.h.getText();
                int spanStart = text.getSpanStart(y5Var);
                int spanEnd = text.getSpanEnd(y5Var);
                int i16 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    pVar.h.getText().delete(spanStart, spanEnd);
                    ch.m mVar = pVar.h;
                    mVar.setSelection(Math.min(i15 - i16, mVar.getText().length()));
                    return;
                }
                return;
            case 4:
                ci.b0.p((org.telegram.ui.ActionBar.g2) this.f1252c, this.f1251b + 1, (ci.z) this.d);
                return;
            case 5:
                b5 b5Var = (b5) this.f1252c;
                int i17 = this.f1251b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr2 = b5Var.W;
                di.x4 x4Var = b5Var.f8567f;
                v4 v4Var = b5Var.h;
                if (starGift != null) {
                    di.z4 z4Var = new di.z4(b5Var.getContext());
                    z4Var.a(starGift, false);
                    z4Var.setRotation(180.0f);
                    v4Var.f(i17, z4Var);
                    z4Var.setScaleX(0.5f);
                    z4Var.setScaleY(0.5f);
                    z4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = z4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    nr nrVar = nr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(nrVar);
                    interpolator.setUpdateListener(new ah.g(b5Var, 6));
                    interpolator.start();
                    v4Var.f9944a[i17].setVisibility(8);
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
                v4Var.f9944a[i17].setVisibility(8);
                frameLayout.setRotation(180.0f);
                v4Var.f(i17, frameLayout);
                b5Var.G.a(iArr2[2], iArr2[3]);
                a5 a5Var = b5Var.f8560b;
                int[] iArr3 = b5Var.V;
                a5Var.a(iArr3[2], iArr3[3]);
                x4Var.a(iArr2[3], iArr2[2]);
                return;
            case 6:
                ((t10) this.d).a(hd.a0(null, null, 2131750029, ki.j.J0(this.f1251b)), (s5) this.f1252c, Boolean.FALSE);
                return;
            case 7:
                y8 y8Var = (y8) this.f1252c;
                int i18 = this.f1251b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = y8Var.f10100r;
                ArrayList[] arrayListArr = y8Var.f10099q;
                int i19 = y8Var.f10085a;
                y8Var.f10102t[i18] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    np.u1(i19).f4(starsStatus.users, false);
                    np.u1(i19).Z3(starsStatus.chats, false);
                    arrayListArr[i18].addAll(starsStatus.history);
                    if (arrayListArr[i18].isEmpty() && !zArr[i18]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i18] = z10;
                    boolean[] zArr2 = y8Var.f10103u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i18] = z11;
                    String[] strArr = y8Var.f10101s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i18] = str;
                    y8Var.i0(starsStatus.balance);
                    ls.f(i19).k(224, new Object[0]);
                    return;
                }
                return;
            case 8:
                int i20 = this.f1251b;
                vf.c.t((Context) this.f1252c, "https://" + np.u1(i20).X2 + "/nft/" + ((String) this.d));
                return;
            case 9:
                ((fi.c1) this.f1252c).G.put((String) this.d, Integer.valueOf(this.f1251b));
                return;
            case 10:
                TLObject tLObject2 = (TLObject) this.f1252c;
                int i21 = this.f1251b;
                p9 p9Var = (p9) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i7 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i7);
                        i7++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i21) {
                            p9Var.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                p9Var.a(null);
                return;
            case 11:
                int i22 = this.f1251b;
                f9 f9Var = ((w8) this.f1252c).d;
                v8 v8Var = f9Var.f12027o0;
                int i23 = f9Var.h;
                v8Var.B0 = (ArrayList) this.d;
                v8Var.f12352z0 = i23;
                v8Var.setAdapter(null);
                v8Var.setAdapter(v8Var.A0);
                v8Var.setCurrentItem(i22);
                v8Var.D0 = true;
                return;
            case 12:
                int i24 = this.f1251b;
                h2.o oVar = (h2.o) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1252c).iterator();
                while (it.hasNext()) {
                    h2.q qVar = (h2.q) it.next();
                    if (!qVar.d) {
                        if (i24 != -1) {
                            qVar.f13840b.b(i24);
                        }
                        qVar.f13841c = true;
                        oVar.invoke(qVar.f13839a);
                    }
                }
                return;
            case 13:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1252c, (String) this.d, this.f1251b);
                return;
            case 14:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1252c, (short[]) this.d, this.f1251b);
                return;
            case 15:
                k5 k5Var = (k5) this.f1252c;
                sg.g gVar = (sg.g) this.d;
                int i25 = this.f1251b;
                if (k5Var.f14914y0.getCurrentBrush() instanceof sg.g) {
                    k5Var.M0 = true;
                }
                k5Var.w(gVar);
                tg.i1 i1Var = k5Var.U0;
                int i26 = i1Var.d + 1;
                i1Var.a(i26);
                org.telegram.messenger.g0.P3(i1Var.f57961a[i26], i25);
                i1Var.f57964e = true;
                return;
            case 16:
                org.telegram.messenger.g0.g3(new c1(this.f1251b, ((ur) this.f1252c).l0(new ArrayList((HashSet) this.d)), 11));
                return;
            case 17:
                ((va) this.f1252c).b((short[]) this.d, this.f1251b);
                return;
            case 18:
                jg.h0 h0Var = (jg.h0) this.f1252c;
                int i27 = this.f1251b;
                String str2 = (String) this.d;
                int i28 = h0Var.f17518t0;
                h0Var.f17514r = null;
                if (i27 == h0Var.f17500e0) {
                    if (h0Var.f17509n >= 0) {
                        ConnectionsManager.getInstance(i28).cancelRequest(h0Var.f17509n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f17509n = ConnectionsManager.getInstance(i28).sendRequest(tL_channels_searchPosts, new jg.u(h0Var, i27, str2, 0));
                    return;
                }
                return;
            case 19:
                kg.z zVar = (kg.z) this.f1252c;
                zVar.f18579b.add(this.f1251b, (TL_account.TL_businessChatLink) this.d);
                ls.f(zVar.f18578a).k(125, new Object[0]);
                return;
            case 20:
                int[] iArr4 = (int[]) this.f1252c;
                int i29 = this.f1251b;
                gs[] gsVarArr = (gs[]) this.d;
                if (iArr4[0] >= 0) {
                    ConnectionsManager.getInstance(i29).cancelRequest(iArr4[0], true);
                    iArr4[0] = -1;
                }
                if (gsVarArr[0] != null) {
                    ls.f(i29).n(gsVarArr[0], 59);
                    gsVarArr[0] = null;
                    return;
                }
                return;
            case 21:
                s3 s3Var = (s3) this.f1252c;
                TLObject tLObject3 = (TLObject) this.d;
                int i30 = this.f1251b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    s3Var.f18973y = tL_webViewResultUrl.query_id;
                    s3Var.f18968n.t(i30, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.g3(s3Var.V);
                    return;
                }
                return;
            case 22:
                Pair pair = (Pair) this.d;
                ((l2.c1) this.f1252c).f19304b.h.N(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.f1251b);
                return;
            case 23:
                int i31 = this.f1251b;
                oi.p5 m10 = ((m5) this.f1252c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    oi.f1 f1Var = m10.f22315a;
                    f1Var.O();
                    f1Var.setSelection(Math.max(0, Math.min(i31, f1Var.length())));
                    return;
                }
                return;
            case 24:
                oi.a aVar = (oi.a) this.d;
                int i32 = this.f1251b;
                a6 a6Var = ((u5) this.f1252c).f22470a;
                if (a6Var.E != null) {
                    a6.e(aVar.f21935b, "");
                    ((d3) a6Var.E).c(aVar, i32);
                    return;
                }
                return;
            case 25:
                ((CameraView) this.f1252c).lambda$createCamera$13(this.f1251b, (SurfaceTexture) this.d);
                return;
            case 26:
                ((NativeInstance) this.f1252c).lambda$onEmitJoinPayload$3(this.f1251b, (String) this.d);
                return;
            case 27:
                ((VoIPService) this.f1252c).lambda$createGroupInstance$74((String) this.d, this.f1251b);
                return;
            case 28:
                int i33 = this.f1251b;
                Context context = (Context) this.f1252c;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.d;
                String str3 = np.u1(i33).R6;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                vf.c.t(context, str3);
                w2VarArr[0].dismiss();
                return;
            default:
                g4 g4Var = (g4) this.f1252c;
                String str4 = (String) this.d;
                int i34 = this.f1251b;
                HashMap hashMap = new HashMap(g4Var.f47973v0[0].f49183c.f47132x);
                ArrayList arrayList2 = new ArrayList(g4Var.f47973v0[0].f49183c.f47133y);
                g4Var.X0 = null;
                Utilities.f22812g.c(new i1(g4Var, arrayList2, hashMap, str4, i34, 10));
                return;
        }
    }

    public j1(Object obj, int i7, Object obj2, int i10) {
        this.f1250a = i10;
        this.f1252c = obj;
        this.f1251b = i7;
        this.d = obj2;
    }

    public j1(Object obj, Object obj2, int i7, int i10) {
        this.f1250a = i10;
        this.f1252c = obj;
        this.d = obj2;
        this.f1251b = i7;
    }
}
