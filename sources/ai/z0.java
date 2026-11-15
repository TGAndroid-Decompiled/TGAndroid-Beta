package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import di.k8;
import di.m5;
import di.m9;
import di.s4;
import di.u4;
import di.v8;
import di.w4;
import di.x4;
import di.y4;
import fi.i9;
import fi.y8;
import fi.z8;
import hi.va;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ki.y3;
import oi.a3;
import oi.k5;
import oi.n5;
import oi.s5;
import oi.y5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.g4;
public final class z0 implements Runnable {
    public final int f1638a;
    public final int f1639b;
    public final Object f1640c;
    public final Object d;

    public z0(int i7, Object obj, Object obj2, int i10) {
        this.f1638a = i10;
        this.f1639b = i7;
        this.f1640c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str = null;
        boolean z11 = true;
        int i7 = 0;
        switch (this.f1638a) {
            case 0:
                DictationLid.c((byte[]) this.f1640c, this.f1639b, (b1) this.d);
                return;
            case 1:
                int i10 = this.f1639b;
                int[] iArr = (int[]) this.f1640c;
                g1 g1Var = (g1) this.d;
                ns f10 = ns.f(i10);
                int length = iArr.length;
                while (i7 < length) {
                    f10.n(g1Var, iArr[i7]);
                    i7++;
                }
                return;
            case 2:
                wp0 wp0Var = (wp0) this.f1640c;
                int i11 = this.f1639b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                k8 k8Var = wp0Var.f3610e;
                if (i11 != -1) {
                    int i12 = tL_starGiftCollection.collection_id;
                    int i13 = k8Var.f8920a;
                    int f11 = k8Var.f(i12);
                    if (f11 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) k8Var.f8923e.remove(f11);
                        k8Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = np.s1(i13).j1(k8Var.f8921b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i13).sendRequest(deletestargiftcollection, null);
                    }
                    wp0Var.f(true);
                    v61 v61Var = wp0Var.f3612n;
                    if (i11 < k8Var.d().size()) {
                        i11++;
                    }
                    v61Var.d(-1, i11);
                    wp0Var.o();
                    return;
                }
                return;
            case 3:
                ch.o oVar = (ch.o) this.f1640c;
                p5 p5Var = (p5) this.d;
                int i14 = this.f1639b;
                Editable text = oVar.h.getText();
                int spanStart = text.getSpanStart(p5Var);
                int spanEnd = text.getSpanEnd(p5Var);
                int i15 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    oVar.h.getText().delete(spanStart, spanEnd);
                    ch.l lVar = oVar.h;
                    lVar.setSelection(Math.min(i14 - i15, lVar.getText().length()));
                    return;
                }
                return;
            case 4:
                ci.a0.p((org.telegram.ui.ActionBar.e2) this.f1640c, this.f1639b + 1, (ci.y) this.d);
                return;
            case 5:
                y4 y4Var = (y4) this.f1640c;
                int i16 = this.f1639b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr2 = y4Var.W;
                u4 u4Var = y4Var.f9778f;
                s4 s4Var = y4Var.h;
                if (starGift != null) {
                    w4 w4Var = new w4(y4Var.getContext());
                    w4Var.a(starGift, false);
                    w4Var.setRotation(180.0f);
                    s4Var.f(i16, w4Var);
                    w4Var.setScaleX(0.5f);
                    w4Var.setScaleY(0.5f);
                    w4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = w4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    er erVar = er.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(erVar);
                    interpolator.setUpdateListener(new ah.h(y4Var, 6));
                    interpolator.start();
                    s4Var.f9384a[i16].setVisibility(8);
                    u4Var.setVisibility(0);
                    u4Var.setAlpha(0.0f);
                    u4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(erVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(y4Var.getContext());
                ?? imageView = new ImageView(y4Var.getContext());
                imageView.f(2131624035, 32, 32, null);
                frameLayout.addView((View) imageView, ja.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                y4Var.m0 = imageView;
                frameLayout.setBackground(new m5(org.telegram.messenger.g0.L(12.0f), j6.r1(0.075f, -1)));
                s4Var.f9384a[i16].setVisibility(8);
                frameLayout.setRotation(180.0f);
                s4Var.f(i16, frameLayout);
                y4Var.G.a(iArr2[2], iArr2[3]);
                x4 x4Var = y4Var.f9771b;
                int[] iArr3 = y4Var.V;
                x4Var.a(iArr3[2], iArr3[3]);
                u4Var.a(iArr2[3], iArr2[2]);
                return;
            case 6:
                ((u10) this.d).a(hd.a0(null, null, 2131750046, ki.k.J0(this.f1639b)), (di.p5) this.f1640c, Boolean.FALSE);
                return;
            case 7:
                v8 v8Var = (v8) this.f1640c;
                int i17 = this.f1639b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = v8Var.f9613r;
                ArrayList[] arrayListArr = v8Var.f9612q;
                int i18 = v8Var.f9598a;
                v8Var.f9615t[i17] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    np.s1(i18).Y3(starsStatus.users, false);
                    np.s1(i18).S3(starsStatus.chats, false);
                    arrayListArr[i17].addAll(starsStatus.history);
                    if (arrayListArr[i17].isEmpty() && !zArr[i17]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i17] = z10;
                    boolean[] zArr2 = v8Var.f9616u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i17] = z11;
                    String[] strArr = v8Var.f9614s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i17] = str;
                    v8Var.i0(starsStatus.balance);
                    ns.f(i18).k(222, new Object[0]);
                    return;
                }
                return;
            case 8:
                int i19 = this.f1639b;
                vf.c.t((Context) this.f1640c, "https://" + np.s1(i19).V2 + "/nft/" + ((String) this.d));
                return;
            case 9:
                ((fi.e1) this.f1640c).G.put((String) this.d, Integer.valueOf(this.f1639b));
                return;
            case 10:
                TLObject tLObject2 = (TLObject) this.f1640c;
                int i20 = this.f1639b;
                m9 m9Var = (m9) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i7 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i7);
                        i7++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i20) {
                            m9Var.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                m9Var.a(null);
                return;
            case 11:
                int i21 = this.f1639b;
                i9 i9Var = ((z8) this.f1640c).d;
                y8 y8Var = i9Var.f11861o0;
                int i22 = i9Var.h;
                y8Var.B0 = (ArrayList) this.d;
                y8Var.f12234z0 = i22;
                y8Var.setAdapter(null);
                y8Var.setAdapter(y8Var.A0);
                y8Var.setCurrentItem(i21);
                y8Var.D0 = true;
                return;
            case 12:
                int i23 = this.f1639b;
                h2.o oVar2 = (h2.o) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1640c).iterator();
                while (it.hasNext()) {
                    h2.q qVar = (h2.q) it.next();
                    if (!qVar.d) {
                        if (i23 != -1) {
                            qVar.f13496b.b(i23);
                        }
                        qVar.f13497c = true;
                        oVar2.invoke(qVar.f13495a);
                    }
                }
                return;
            case 13:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1640c, (String) this.d, this.f1639b);
                return;
            case 14:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1640c, (short[]) this.d, this.f1639b);
                return;
            case 15:
                hi.m5 m5Var = (hi.m5) this.f1640c;
                sg.g gVar = (sg.g) this.d;
                int i24 = this.f1639b;
                if (m5Var.f14700y0.getCurrentBrush() instanceof sg.g) {
                    m5Var.M0 = true;
                }
                m5Var.w(gVar);
                tg.h1 h1Var = m5Var.U0;
                int i25 = h1Var.d + 1;
                h1Var.a(i25);
                org.telegram.messenger.g0.Q3(h1Var.f57322a[i25], i24);
                h1Var.f57325e = true;
                return;
            case 16:
                org.telegram.messenger.g0.h3(new v0(this.f1639b, ((vr) this.f1640c).l0(new ArrayList((HashSet) this.d)), 8));
                return;
            case 17:
                ((va) this.f1640c).b((short[]) this.d, this.f1639b);
                return;
            case 18:
                jg.h0 h0Var = (jg.h0) this.f1640c;
                int i26 = this.f1639b;
                String str2 = (String) this.d;
                int i27 = h0Var.f17107t0;
                h0Var.f17103r = null;
                if (i26 == h0Var.f17089e0) {
                    if (h0Var.f17098n >= 0) {
                        ConnectionsManager.getInstance(i27).cancelRequest(h0Var.f17098n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f17098n = ConnectionsManager.getInstance(i27).sendRequest(tL_channels_searchPosts, new jg.u(h0Var, i26, str2, 0));
                    return;
                }
                return;
            case 19:
                kg.y yVar = (kg.y) this.f1640c;
                yVar.f18144b.add(this.f1639b, (TL_account.TL_businessChatLink) this.d);
                ns.f(yVar.f18143a).k(125, new Object[0]);
                return;
            case 20:
                int[] iArr4 = (int[]) this.f1640c;
                int i28 = this.f1639b;
                is[] isVarArr = (is[]) this.d;
                if (iArr4[0] >= 0) {
                    ConnectionsManager.getInstance(i28).cancelRequest(iArr4[0], true);
                    iArr4[0] = -1;
                }
                if (isVarArr[0] != null) {
                    ns.f(i28).n(isVarArr[0], 59);
                    isVarArr[0] = null;
                    return;
                }
                return;
            case 21:
                y3 y3Var = (y3) this.f1640c;
                TLObject tLObject3 = (TLObject) this.d;
                int i29 = this.f1639b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    y3Var.f18720y = tL_webViewResultUrl.query_id;
                    y3Var.f18715n.t(i29, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.h3(y3Var.V);
                    return;
                }
                return;
            case 22:
                Pair pair = (Pair) this.d;
                ((l2.c1) this.f1640c).f18909b.h.N(((Integer) pair.first).intValue(), (x2.f0) pair.second, this.f1639b);
                return;
            case 23:
                int i30 = this.f1639b;
                n5 m10 = ((k5) this.f1640c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    oi.e1 e1Var = m10.f21845a;
                    e1Var.O();
                    e1Var.setSelection(Math.max(0, Math.min(i30, e1Var.length())));
                    return;
                }
                return;
            case 24:
                oi.a aVar = (oi.a) this.d;
                int i31 = this.f1639b;
                y5 y5Var = ((s5) this.f1640c).f21998a;
                if (y5Var.E != null) {
                    y5.e(aVar.f21544b, "");
                    ((a3) y5Var.E).c(aVar, i31);
                    return;
                }
                return;
            case 25:
                ((CameraView) this.f1640c).lambda$createCamera$13(this.f1639b, (SurfaceTexture) this.d);
                return;
            case 26:
                NativeInstance.a((NativeInstance) this.f1640c, this.f1639b, (String) this.d);
                return;
            case 27:
                ((VoIPService) this.f1640c).lambda$createGroupInstance$74((String) this.d, this.f1639b);
                return;
            case 28:
                int i32 = this.f1639b;
                Context context = (Context) this.f1640c;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.d;
                String str3 = np.s1(i32).P6;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                vf.c.t(context, str3);
                u2VarArr[0].dismiss();
                return;
            default:
                g4 g4Var = (g4) this.f1640c;
                String str4 = (String) this.d;
                int i33 = this.f1639b;
                HashMap hashMap = new HashMap(g4Var.f47336v0[0].f48550c.f46547x);
                ArrayList arrayList2 = new ArrayList(g4Var.f47336v0[0].f48550c.f46548y);
                g4Var.X0 = null;
                Utilities.f22418g.c(new f1(g4Var, arrayList2, hashMap, str4, i33, 10));
                return;
        }
    }

    public z0(Object obj, int i7, Object obj2, int i10) {
        this.f1638a = i10;
        this.f1640c = obj;
        this.f1639b = i7;
        this.d = obj2;
    }

    public z0(Object obj, Object obj2, int i7, int i10) {
        this.f1638a = i10;
        this.f1640c = obj;
        this.d = obj2;
        this.f1639b = i7;
    }
}
