package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import ci.e9;
import ci.s8;
import ci.w9;
import ei.g9;
import ei.i9;
import ei.r9;
import gi.ya;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.p10;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class e3 implements Runnable {
    public final int f616a;
    public final int f617b;
    public final Object f618c;
    public final Object d;

    public e3(int i3, Object obj, Object obj2, int i10) {
        this.f616a = i10;
        this.f617b = i3;
        this.f618c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        String str = null;
        int i3 = 0;
        switch (this.f616a) {
            case 0:
                vp0 vp0Var = (vp0) this.f618c;
                int i10 = this.f617b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                s8 s8Var = vp0Var.f1013e;
                if (i10 != -1) {
                    int i11 = tL_starGiftCollection.collection_id;
                    int i12 = s8Var.f5965a;
                    int f10 = s8Var.f(i11);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) s8Var.f5968e.remove(f10);
                        s8Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = hp.s1(i12).j1(s8Var.f5966b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i12).sendRequest(deletestargiftcollection, null);
                    }
                    vp0Var.f(true);
                    m61 m61Var = vp0Var.f1015n;
                    if (i10 < s8Var.d().size()) {
                        i10++;
                    }
                    m61Var.d(-1, i10);
                    vp0Var.o();
                    return;
                }
                return;
            case 1:
                bi.a0.p((org.telegram.ui.ActionBar.d2) this.f618c, this.f617b + 1, (bi.y) this.d);
                return;
            case 2:
                ci.h5 h5Var = (ci.h5) this.f618c;
                int i13 = this.f617b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = h5Var.W;
                ci.d5 d5Var = h5Var.f5226f;
                ci.b5 b5Var = h5Var.h;
                if (starGift != null) {
                    ci.f5 f5Var = new ci.f5(h5Var.getContext());
                    f5Var.a(starGift, false);
                    f5Var.setRotation(180.0f);
                    b5Var.f(i13, f5Var);
                    f5Var.setScaleX(0.5f);
                    f5Var.setScaleY(0.5f);
                    f5Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = f5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    xq xqVar = xq.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(xqVar);
                    interpolator.setUpdateListener(new bh.f(h5Var, 4));
                    interpolator.start();
                    b5Var.f4865a[i13].setVisibility(8);
                    d5Var.setVisibility(0);
                    d5Var.setAlpha(0.0f);
                    d5Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(xqVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(h5Var.getContext());
                ?? imageView = new ImageView(h5Var.getContext());
                imageView.f(2131624034, 32, 32, null);
                frameLayout.addView((View) imageView, mf.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                h5Var.m0 = imageView;
                frameLayout.setBackground(new ci.v5(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.r1(0.075f, -1)));
                b5Var.f4865a[i13].setVisibility(8);
                frameLayout.setRotation(180.0f);
                b5Var.f(i13, frameLayout);
                h5Var.G.a(iArr[2], iArr[3]);
                ci.g5 g5Var = h5Var.f5219b;
                int[] iArr2 = h5Var.V;
                g5Var.a(iArr2[2], iArr2[3]);
                d5Var.a(iArr[3], iArr[2]);
                return;
            case 3:
                ((p10) this.d).a(bd.a0(null, null, 2131750054, ii.k.J0(this.f617b)), (ci.y5) this.f618c, Boolean.FALSE);
                return;
            case 4:
                e9 e9Var = (e9) this.f618c;
                int i14 = this.f617b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = e9Var.f5044r;
                ArrayList[] arrayListArr = e9Var.f5043q;
                int i15 = e9Var.f5029a;
                e9Var.f5046t[i14] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    hp.s1(i15).Y3(starsStatus.users, false);
                    hp.s1(i15).S3(starsStatus.chats, false);
                    arrayListArr[i14].addAll(starsStatus.history);
                    if (arrayListArr[i14].isEmpty() && !zArr[i14]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i14] = z10;
                    boolean[] zArr2 = e9Var.f5047u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i14] = z11;
                    String[] strArr = e9Var.f5045s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i14] = str;
                    e9Var.i0(starsStatus.balance);
                    hs.f(i15).k(222, new Object[0]);
                    return;
                }
                return;
            case 5:
                int i16 = this.f617b;
                sf.c.t((Context) this.f618c, "https://" + hp.s1(i16).V2 + "/nft/" + ((String) this.d));
                return;
            case 6:
                dh.o oVar = (dh.o) this.f618c;
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) this.d;
                int i17 = this.f617b;
                Editable text = oVar.h.getText();
                int spanStart = text.getSpanStart(p5Var);
                int spanEnd = text.getSpanEnd(p5Var);
                int i18 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    oVar.h.getText().delete(spanStart, spanEnd);
                    dh.l lVar = oVar.h;
                    lVar.setSelection(Math.min(i17 - i18, lVar.getText().length()));
                    return;
                }
                return;
            case 7:
                ((ei.g1) this.f618c).G.put((String) this.d, Integer.valueOf(this.f617b));
                return;
            case 8:
                TLObject tLObject2 = (TLObject) this.f618c;
                int i19 = this.f617b;
                w9 w9Var = (w9) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i3 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i3);
                        i3++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i19) {
                            w9Var.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                w9Var.a(null);
                return;
            case 9:
                int i20 = this.f617b;
                r9 r9Var = ((i9) this.f618c).d;
                g9 g9Var = r9Var.f10939o0;
                int i21 = r9Var.h;
                g9Var.B0 = (ArrayList) this.d;
                g9Var.f11212z0 = i21;
                g9Var.setAdapter(null);
                g9Var.setAdapter(g9Var.A0);
                g9Var.setCurrentItem(i20);
                g9Var.D0 = true;
                return;
            case 10:
                int i22 = this.f617b;
                g2.p pVar = (g2.p) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f618c).iterator();
                while (it.hasNext()) {
                    g2.r rVar = (g2.r) it.next();
                    if (!rVar.d) {
                        if (i22 != -1) {
                            rVar.f11898b.b(i22);
                        }
                        rVar.f11899c = true;
                        pVar.invoke(rVar.f11897a);
                    }
                }
                return;
            case 11:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f618c, (String) this.d, this.f617b);
                return;
            case 12:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f618c, (short[]) this.d, this.f617b);
                return;
            case 13:
                gi.m5 m5Var = (gi.m5) this.f618c;
                tg.g gVar = (tg.g) this.d;
                int i23 = this.f617b;
                if (m5Var.f13239y0.getCurrentBrush() instanceof tg.g) {
                    m5Var.M0 = true;
                }
                m5Var.C(gVar);
                ug.g1 g1Var = m5Var.U0;
                int i24 = g1Var.d + 1;
                g1Var.a(i24);
                org.telegram.messenger.g0.R3(g1Var.f56014a[i24], i23);
                g1Var.f56017e = true;
                return;
            case 14:
                org.telegram.messenger.g0.h3(new cg.l0(this.f617b, ((qr) this.f618c).l0(new ArrayList((HashSet) this.d)), 8));
                return;
            case 15:
                ((ya) this.f618c).b((short[]) this.d, this.f617b);
                return;
            case 16:
                int[] iArr3 = (int[]) this.f618c;
                int i25 = this.f617b;
                cs[] csVarArr = (cs[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i25).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (csVarArr[0] != null) {
                    hs.f(i25).n(csVarArr[0], 59);
                    csVarArr[0] = null;
                    return;
                }
                return;
            case 17:
                ii.d4 d4Var = (ii.d4) this.f618c;
                TLObject tLObject3 = (TLObject) this.d;
                int i26 = this.f617b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    d4Var.f14903y = tL_webViewResultUrl.query_id;
                    d4Var.f14898n.t(i26, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.h3(d4Var.V);
                    return;
                }
                return;
            case 18:
                Pair pair = (Pair) this.d;
                ((k2.f1) this.f618c).f16503b.h.M(((Integer) pair.first).intValue(), (w2.g0) pair.second, this.f617b);
                return;
            case 19:
                kg.e0 e0Var = (kg.e0) this.f618c;
                int i27 = this.f617b;
                String str2 = (String) this.d;
                int i28 = e0Var.f16980t0;
                e0Var.f16976r = null;
                if (i27 == e0Var.f16962e0) {
                    if (e0Var.f16971n >= 0) {
                        ConnectionsManager.getInstance(i28).cancelRequest(e0Var.f16971n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    e0Var.f16971n = ConnectionsManager.getInstance(i28).sendRequest(tL_channels_searchPosts, new kg.t(e0Var, i27, str2, 0));
                    return;
                }
                return;
            case 20:
                lg.z zVar = (lg.z) this.f618c;
                zVar.f18525b.add(this.f617b, (TL_account.TL_businessChatLink) this.d);
                hs.f(zVar.f18524a).k(125, new Object[0]);
                return;
            case 21:
                int i29 = this.f617b;
                mi.q5 m10 = ((mi.n5) this.f618c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    mi.h1 h1Var = m10.f19842a;
                    h1Var.N();
                    h1Var.setSelection(Math.max(0, Math.min(i29, h1Var.length())));
                    return;
                }
                return;
            case 22:
                mi.a aVar = (mi.a) this.d;
                int i30 = this.f617b;
                mi.b6 b6Var = ((mi.v5) this.f618c).f19986a;
                if (b6Var.E != null) {
                    mi.b6.e(aVar.f19431b, "");
                    ((mi.d3) b6Var.E).c(aVar, i30);
                    return;
                }
                return;
            case 23:
                ((CameraView) this.f618c).lambda$createCamera$13(this.f617b, (SurfaceTexture) this.d);
                return;
            case 24:
                ((NativeInstance) this.f618c).lambda$onEmitJoinPayload$3(this.f617b, (String) this.d);
                return;
            case 25:
                ((VoIPService) this.f618c).lambda$createGroupInstance$74((String) this.d, this.f617b);
                return;
            case 26:
                int i31 = this.f617b;
                Context context = (Context) this.f618c;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.d;
                String str3 = hp.s1(i31).O6;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                sf.c.t(context, str3);
                t2VarArr[0].dismiss();
                return;
            case 27:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f618c;
                String str4 = (String) this.d;
                int i32 = this.f617b;
                HashMap hashMap = new HashMap(i4Var.f46100v0[0].f47084c.f45522x);
                ArrayList arrayList2 = new ArrayList(i4Var.f46100v0[0].f47084c.f45523y);
                i4Var.X0 = null;
                Utilities.f21389g.c(new p1(i4Var, arrayList2, hashMap, str4, i32, 10));
                return;
            case 28:
                org.telegram.ui.i4 i4Var2 = (org.telegram.ui.i4) this.f618c;
                int i33 = this.f617b;
                sf.b bVar = (sf.b) this.d;
                if (i4Var2.J0 == i33 && i4Var2.H0 != 0) {
                    ConnectionsManager.getInstance(i4Var2.Y).cancelRequest(i4Var2.H0, false);
                    i4Var2.H0 = 0;
                }
                if (i4Var2.O0 == bVar) {
                    i4Var2.O0 = null;
                    return;
                }
                return;
            default:
                int i34 = this.f617b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f618c;
                hp.s1(i34).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(i34).c(-((TLRPC.Chat) this.d).f27001id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
        }
    }

    public e3(Object obj, int i3, Object obj2, int i10) {
        this.f616a = i10;
        this.f618c = obj;
        this.f617b = i3;
        this.d = obj2;
    }

    public e3(Object obj, Object obj2, int i3, int i10) {
        this.f616a = i10;
        this.f618c = obj;
        this.d = obj2;
        this.f617b = i3;
    }
}
