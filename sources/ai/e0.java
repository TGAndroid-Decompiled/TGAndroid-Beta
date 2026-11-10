package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.b6;
import bi.c6;
import bi.d6;
import bi.ea;
import bi.t6;
import bi.ub;
import bi.w5;
import bi.w6;
import bi.ya;
import bi.z5;
import c8.ha;
import di.g9;
import di.h9;
import di.q9;
import fi.o5;
import hi.c4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import li.a6;
import li.c3;
import li.m5;
import li.p5;
import li.u5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.id;
import org.telegram.messenger.k2;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.e4;
import org.telegram.ui.g4;
public final class e0 implements Runnable {
    public final int f1163a;
    public final int f1164b;
    public final Object f1165c;
    public final Object d;

    public e0(int i7, Object obj, Object obj2, int i10) {
        this.f1163a = i10;
        this.f1164b = i7;
        this.f1165c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10 = true;
        String str = null;
        int i7 = 0;
        switch (this.f1163a) {
            case 0:
                i0.p((f2) this.f1165c, this.f1164b + 1, (f0) this.d);
                return;
            case 1:
                d6 d6Var = (d6) this.f1165c;
                int i10 = this.f1164b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = d6Var.V;
                z5 z5Var = d6Var.f3663f;
                w5 w5Var = d6Var.h;
                if (starGift != null) {
                    b6 b6Var = new b6(d6Var.getContext());
                    b6Var.a(starGift, false);
                    b6Var.setRotation(180.0f);
                    w5Var.f(i10, b6Var);
                    b6Var.setScaleX(0.5f);
                    b6Var.setScaleY(0.5f);
                    b6Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = b6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    wq wqVar = wq.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(wqVar);
                    interpolator.setUpdateListener(new ah.h(d6Var, 4));
                    interpolator.start();
                    w5Var.f4965a[i10].setVisibility(8);
                    z5Var.setVisibility(0);
                    z5Var.setAlpha(0.0f);
                    z5Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(wqVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(d6Var.getContext());
                ?? imageView = new ImageView(d6Var.getContext());
                imageView.f(2131624034, 32, 32, null);
                frameLayout.addView((View) imageView, ha.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                d6Var.f3670l0 = imageView;
                frameLayout.setBackground(new t6(org.telegram.messenger.g0.L(12.0f), m6.r1(0.075f, -1)));
                w5Var.f4965a[i10].setVisibility(8);
                frameLayout.setRotation(180.0f);
                w5Var.f(i10, frameLayout);
                d6Var.F.a(iArr[2], iArr[3]);
                c6 c6Var = d6Var.f3656b;
                int[] iArr2 = d6Var.U;
                c6Var.a(iArr2[2], iArr2[3]);
                z5Var.a(iArr[3], iArr[2]);
                return;
            case 2:
                ((x10) this.d).a(id.a0(null, null, 2131750046, hi.j.J0(this.f1164b)), (w6) this.f1165c, Boolean.FALSE);
                return;
            case 3:
                ea eaVar = (ea) this.f1165c;
                int i11 = this.f1164b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = eaVar.f3819r;
                ArrayList[] arrayListArr = eaVar.f3818q;
                int i12 = eaVar.f3804a;
                eaVar.f3821t[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    qp.s1(i12).Y3(starsStatus.users, false);
                    qp.s1(i12).S3(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    if (arrayListArr[i11].isEmpty() && !zArr[i11]) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    zArr[i11] = z9;
                    boolean[] zArr2 = eaVar.f3822u;
                    if ((starsStatus.flags & 1) != 0) {
                        z10 = false;
                    }
                    zArr2[i11] = z10;
                    String[] strArr = eaVar.f3820s;
                    if (!z10) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i11] = str;
                    eaVar.i0(starsStatus.balance);
                    qs.f(i12).k(222, new Object[0]);
                    return;
                }
                return;
            case 4:
                int i13 = this.f1164b;
                vf.c.t((Context) this.f1165c, "https://" + qp.s1(i13).U2 + "/nft/" + ((String) this.d));
                return;
            case 5:
                ch.o oVar = (ch.o) this.f1165c;
                q5 q5Var = (q5) this.d;
                int i14 = this.f1164b;
                Editable text = oVar.h.getText();
                int spanStart = text.getSpanStart(q5Var);
                int spanEnd = text.getSpanEnd(q5Var);
                int i15 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    oVar.h.getText().delete(spanStart, spanEnd);
                    ch.l lVar = oVar.h;
                    lVar.setSelection(Math.min(i14 - i15, lVar.getText().length()));
                    return;
                }
                return;
            case 6:
                ((di.g1) this.f1165c).F.put((String) this.d, Integer.valueOf(this.f1164b));
                return;
            case 7:
                TLObject tLObject2 = (TLObject) this.f1165c;
                int i16 = this.f1164b;
                ya yaVar = (ya) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i7 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i7);
                        i7++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i16) {
                            yaVar.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                yaVar.a(null);
                return;
            case 8:
                int i17 = this.f1164b;
                q9 q9Var = ((h9) this.f1165c).d;
                g9 g9Var = q9Var.f9629n0;
                int i18 = q9Var.h;
                g9Var.A0 = (ArrayList) this.d;
                g9Var.f9942y0 = i18;
                g9Var.setAdapter(null);
                g9Var.setAdapter(g9Var.f9943z0);
                g9Var.setCurrentItem(i17);
                g9Var.C0 = true;
                return;
            case 9:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1165c, (String) this.d, this.f1164b);
                return;
            case 10:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1165c, (short[]) this.d, this.f1164b);
                return;
            case 11:
                o5 o5Var = (o5) this.f1165c;
                sg.g gVar = (sg.g) this.d;
                int i19 = this.f1164b;
                if (o5Var.f12557x0.getCurrentBrush() instanceof sg.g) {
                    o5Var.L0 = true;
                }
                o5Var.w(gVar);
                tg.h1 h1Var = o5Var.T0;
                int i20 = h1Var.d + 1;
                h1Var.a(i20);
                org.telegram.messenger.g0.R3(h1Var.f55725a[i20], i19);
                h1Var.f55728e = true;
                return;
            case 12:
                org.telegram.messenger.g0.h3(new bg.m0(this.f1164b, ((yr) this.f1165c).l0(new ArrayList((HashSet) this.d)), 8));
                return;
            case 13:
                ((fi.ya) this.f1165c).b((short[]) this.d, this.f1164b);
                return;
            case 14:
                int i21 = this.f1164b;
                h2.o oVar2 = (h2.o) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1165c).iterator();
                while (it.hasNext()) {
                    h2.q qVar = (h2.q) it.next();
                    if (!qVar.d) {
                        if (i21 != -1) {
                            qVar.f14139b.b(i21);
                        }
                        qVar.f14140c = true;
                        oVar2.invoke(qVar.f14138a);
                    }
                }
                return;
            case 15:
                int[] iArr3 = (int[]) this.f1165c;
                int i22 = this.f1164b;
                ls[] lsVarArr = (ls[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i22).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (lsVarArr[0] != null) {
                    qs.f(i22).n(lsVarArr[0], 59);
                    lsVarArr[0] = null;
                    return;
                }
                return;
            case 16:
                c4 c4Var = (c4) this.f1165c;
                TLObject tLObject3 = (TLObject) this.d;
                int i23 = this.f1164b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    c4Var.f14599y = tL_webViewResultUrl.query_id;
                    c4Var.f14594n.t(i23, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.g0.h3(c4Var.U);
                    return;
                }
                return;
            case 17:
                jg.h0 h0Var = (jg.h0) this.f1165c;
                int i24 = this.f1164b;
                String str2 = (String) this.d;
                int i25 = h0Var.f16760s0;
                h0Var.f16757r = null;
                if (i24 == h0Var.f16741d0) {
                    if (h0Var.f16752n >= 0) {
                        ConnectionsManager.getInstance(i25).cancelRequest(h0Var.f16752n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f16752n = ConnectionsManager.getInstance(i25).sendRequest(tL_channels_searchPosts, new jg.v(h0Var, i24, str2, 0));
                    return;
                }
                return;
            case 18:
                kg.y yVar = (kg.y) this.f1165c;
                yVar.f17589b.add(this.f1164b, (TL_account.TL_businessChatLink) this.d);
                qs.f(yVar.f17588a).k(125, new Object[0]);
                return;
            case 19:
                Pair pair = (Pair) this.d;
                ((l2.g1) this.f1165c).f17825b.h.N(((Integer) pair.first).intValue(), (x2.f0) pair.second, this.f1164b);
                return;
            case 20:
                int i26 = this.f1164b;
                p5 m10 = ((m5) this.f1165c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    li.g1 g1Var = m10.f18781a;
                    g1Var.N();
                    g1Var.setSelection(Math.max(0, Math.min(i26, g1Var.length())));
                    return;
                }
                return;
            case 21:
                li.a aVar = (li.a) this.d;
                int i27 = this.f1164b;
                a6 a6Var = ((u5) this.f1165c).f18928a;
                if (a6Var.D != null) {
                    a6.e(aVar.f18395b, "");
                    ((c3) a6Var.D).c(aVar, i27);
                    return;
                }
                return;
            case 22:
                ((CameraView) this.f1165c).lambda$createCamera$13(this.f1164b, (SurfaceTexture) this.d);
                return;
            case 23:
                ((NativeInstance) this.f1165c).lambda$onEmitJoinPayload$3(this.f1164b, (String) this.d);
                return;
            case 24:
                ((VoIPService) this.f1165c).lambda$createGroupInstance$74((String) this.d, this.f1164b);
                return;
            case 25:
                int i28 = this.f1164b;
                Context context = (Context) this.f1165c;
                w2[] w2VarArr = (w2[]) this.d;
                String str3 = qp.s1(i28).O6;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                vf.c.t(context, str3);
                w2VarArr[0].dismiss();
                return;
            case 26:
                g4 g4Var = (g4) this.f1165c;
                String str4 = (String) this.d;
                int i29 = this.f1164b;
                HashMap hashMap = new HashMap(g4Var.f45971u0[0].f47143c.f45124x);
                ArrayList arrayList2 = new ArrayList(g4Var.f45971u0[0].f47143c.f45125y);
                g4Var.W0 = null;
                Utilities.f21343g.c(new ub(g4Var, arrayList2, hashMap, str4, i29, 8));
                return;
            case 27:
                g4 g4Var2 = (g4) this.f1165c;
                int i30 = this.f1164b;
                vf.b bVar = (vf.b) this.d;
                if (g4Var2.I0 == i30 && g4Var2.G0 != 0) {
                    ConnectionsManager.getInstance(g4Var2.X).cancelRequest(g4Var2.G0, false);
                    g4Var2.G0 = 0;
                }
                if (g4Var2.N0 == bVar) {
                    g4Var2.N0 = null;
                    return;
                }
                return;
            case 28:
                int i31 = this.f1164b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f1165c;
                qp.s1(i31).Y3(tL_chatInviteJoinResultWebView.users, false);
                k2.b(i31).c(-((TLRPC.Chat) this.d).f26960id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                e4 e4Var = (e4) this.f1165c;
                e4Var.K = this.f1164b;
                e4Var.J = (int[]) this.d;
                e4Var.M.d0();
                return;
        }
    }

    public e0(Object obj, int i7, Object obj2, int i10) {
        this.f1163a = i10;
        this.f1165c = obj;
        this.f1164b = i7;
        this.d = obj2;
    }

    public e0(Object obj, Object obj2, int i7, int i10) {
        this.f1163a = i10;
        this.f1165c = obj;
        this.d = obj2;
        this.f1164b = i7;
    }

    public e0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.f1163a = 29;
        this.f1165c = e4Var;
        this.f1164b = i7;
        this.d = iArr2;
    }
}
