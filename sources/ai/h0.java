package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.ca;
import bi.p6;
import bi.s5;
import bi.s6;
import bi.sb;
import bi.ua;
import bi.v5;
import bi.x5;
import bi.y5;
import bi.z5;
import di.o9;
import di.p9;
import di.y9;
import fi.e6;
import fi.vb;
import hi.o4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import li.d3;
import li.d6;
import li.p5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.j4;
public final class h0 implements Runnable {
    public final int f1539a;
    public final int f1540b;
    public final Object f1541c;
    public final Object d;

    public h0(int i10, Object obj, Object obj2, int i11) {
        this.f1539a = i11;
        this.f1540b = i10;
        this.f1541c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str = null;
        boolean z11 = true;
        int i10 = 0;
        switch (this.f1539a) {
            case 0:
                o0.p((r2) this.f1541c, this.f1540b + 1, (j0) this.d);
                return;
            case 1:
                bh.u uVar = (bh.u) this.f1541c;
                c6 c6Var = (c6) this.d;
                int i11 = this.f1540b;
                Editable text = uVar.h.getText();
                int spanStart = text.getSpanStart(c6Var);
                int spanEnd = text.getSpanEnd(c6Var);
                int i12 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    uVar.h.getText().delete(spanStart, spanEnd);
                    bh.q qVar = uVar.h;
                    qVar.setSelection(Math.min(i11 - i12, qVar.getText().length()));
                    return;
                }
                return;
            case 2:
                z5 z5Var = (z5) this.f1541c;
                int i13 = this.f1540b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = z5Var.V;
                v5 v5Var = z5Var.f5836f;
                s5 s5Var = z5Var.h;
                if (starGift != null) {
                    x5 x5Var = new x5(z5Var.getContext());
                    x5Var.a(starGift, false);
                    x5Var.setRotation(180.0f);
                    s5Var.f(i13, x5Var);
                    x5Var.setScaleX(0.5f);
                    x5Var.setScaleY(0.5f);
                    x5Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = x5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    ds dsVar = ds.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(dsVar);
                    interpolator.setUpdateListener(new g0(z5Var, 4));
                    interpolator.start();
                    s5Var.f5397a[i13].setVisibility(8);
                    v5Var.setVisibility(0);
                    v5Var.setAlpha(0.0f);
                    v5Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(dsVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(z5Var.getContext());
                ?? imageView = new ImageView(z5Var.getContext());
                imageView.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView((View) imageView, gb1.i(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                z5Var.f5843l0 = imageView;
                frameLayout.setBackground(new p6(AndroidUtilities.dp(12.0f), y6.o1(0.075f, -1)));
                s5Var.f5397a[i13].setVisibility(8);
                frameLayout.setRotation(180.0f);
                s5Var.f(i13, frameLayout);
                z5Var.F.a(iArr[2], iArr[3]);
                y5 y5Var = z5Var.f5830b;
                int[] iArr2 = z5Var.U;
                y5Var.a(iArr2[2], iArr2[3]);
                v5Var.a(iArr[3], iArr[2]);
                return;
            case 3:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, hi.k.F0(this.f1540b)), (s6) this.f1541c, Boolean.FALSE);
                return;
            case 4:
                ca caVar = (ca) this.f1541c;
                int i14 = this.f1540b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = caVar.f4455r;
                ArrayList[] arrayListArr = caVar.f4454q;
                int i15 = caVar.f4441a;
                caVar.f4457t[i14] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    arrayListArr[i14].addAll(starsStatus.history);
                    if (arrayListArr[i14].isEmpty() && !zArr[i14]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i14] = z10;
                    boolean[] zArr2 = caVar.f4458u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i14] = z11;
                    String[] strArr = caVar.f4456s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i14] = str;
                    caVar.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 5:
                int i16 = this.f1540b;
                qf.d.r((Context) this.f1541c, "https://" + MessagesController.getInstance(i16).linkPrefix + "/nft/" + ((String) this.d));
                return;
            case 6:
                ((di.h1) this.f1541c).F.put((String) this.d, Integer.valueOf(this.f1540b));
                return;
            case 7:
                TLObject tLObject2 = (TLObject) this.f1541c;
                int i17 = this.f1540b;
                ua uaVar = (ua) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i17) {
                            uaVar.run(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                uaVar.run(null);
                return;
            case 8:
                int i18 = this.f1540b;
                y9 y9Var = ((p9) this.f1541c).d;
                o9 o9Var = y9Var.f9445n0;
                int i19 = y9Var.h;
                o9Var.A0 = (ArrayList) this.d;
                o9Var.f8565y0 = i19;
                o9Var.setAdapter(null);
                o9Var.setAdapter(o9Var.f8566z0);
                o9Var.setCurrentItem(i18);
                o9Var.C0 = true;
                return;
            case 9:
                int i20 = this.f1540b;
                e2.o oVar = (e2.o) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1541c).iterator();
                while (it.hasNext()) {
                    e2.q qVar2 = (e2.q) it.next();
                    if (!qVar2.d) {
                        if (i20 != -1) {
                            qVar2.f9708b.b(i20);
                        }
                        qVar2.f9709c = true;
                        oVar.invoke(qVar2.f9707a);
                    }
                }
                return;
            case 10:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1541c, (String) this.d, this.f1540b);
                return;
            case 11:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1541c, (short[]) this.d, this.f1540b);
                return;
            case 12:
                e6 e6Var = (e6) this.f1541c;
                rg.l lVar = (rg.l) this.d;
                int i21 = this.f1540b;
                if (e6Var.D0.getCurrentBrush() instanceof rg.l) {
                    e6Var.R0 = true;
                }
                e6Var.i(lVar);
                sg.t1 t1Var = e6Var.Z0;
                int i22 = t1Var.d + 1;
                t1Var.a(i22);
                AndroidUtilities.updateImageViewImageAnimated(t1Var.f48516a[i22], i21);
                t1Var.e = true;
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ag.r0(this.f1540b, ((MessagesStorage) this.f1541c).getUsers(new ArrayList<>((HashSet) this.d)), 9));
                return;
            case 14:
                ((vb) this.f1541c).b((short[]) this.d, this.f1540b);
                return;
            case 15:
                int[] iArr3 = (int[]) this.f1541c;
                int i23 = this.f1540b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i23).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i23).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    return;
                }
                return;
            case 16:
                o4 o4Var = (o4) this.f1541c;
                TLObject tLObject3 = (TLObject) this.d;
                int i24 = this.f1540b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    o4Var.f13184x = tL_webViewResultUrl.query_id;
                    o4Var.f13180n.t(i24, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(o4Var.U);
                    return;
                }
                return;
            case 17:
                Pair pair = (Pair) this.d;
                ((i2.g1) this.f1541c).f13549b.h.a(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.f1540b);
                return;
            case 18:
                ig.i0 i0Var = (ig.i0) this.f1541c;
                int i25 = this.f1540b;
                String str2 = (String) this.d;
                int i26 = i0Var.f14094s0;
                i0Var.f14091r = null;
                if (i25 == i0Var.f14076d0) {
                    if (i0Var.f14086n >= 0) {
                        ConnectionsManager.getInstance(i26).cancelRequest(i0Var.f14086n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.f14086n = ConnectionsManager.getInstance(i26).sendRequest(tL_channels_searchPosts, new ig.u(i0Var, i25, str2, 0));
                    return;
                }
                return;
            case 19:
                jg.z zVar = (jg.z) this.f1541c;
                zVar.f15909b.add(this.f1540b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(zVar.f15908a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 20:
                int i27 = this.f1540b;
                li.s5 m10 = ((p5) this.f1541c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    li.g1 g1Var = m10.f17475a;
                    g1Var.r();
                    g1Var.setSelection(Math.max(0, Math.min(i27, g1Var.length())));
                    return;
                }
                return;
            case 21:
                li.a aVar = (li.a) this.d;
                int i28 = this.f1540b;
                d6 d6Var = ((li.x5) this.f1541c).f17627a;
                if (d6Var.f17203y != null) {
                    d6.e(aVar.f17054b, "");
                    ((d3) d6Var.f17203y).c(aVar, i28);
                    return;
                }
                return;
            case 22:
                n2.j jVar = (n2.j) this.f1541c;
                this.d.a(jVar.f18625a, jVar.f18626b, this.f1540b);
                return;
            case 23:
                ((CameraView) this.f1541c).lambda$createCamera$13(this.f1540b, (SurfaceTexture) this.d);
                return;
            case 24:
                NativeInstance.a((NativeInstance) this.f1541c, this.f1540b, (String) this.d);
                return;
            case 25:
                ((VoIPService) this.f1541c).lambda$createGroupInstance$74((String) this.d, this.f1540b);
                return;
            case 26:
                int i29 = this.f1540b;
                Context context = (Context) this.f1541c;
                k3[] k3VarArr = (k3[]) this.d;
                String str3 = MessagesController.getInstance(i29).freezeAppealUrl;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                qf.d.r(context, str3);
                k3VarArr[0].dismiss();
                return;
            case 27:
                j4 j4Var = (j4) this.f1541c;
                String str4 = (String) this.d;
                int i30 = this.f1540b;
                HashMap hashMap = new HashMap(j4Var.f40449u0[0].f41444c.f39887w);
                ArrayList arrayList2 = new ArrayList(j4Var.f40449u0[0].f41444c.f39888x);
                j4Var.W0 = null;
                Utilities.searchQueue.postRunnable(new sb(j4Var, arrayList2, hashMap, str4, i30, 15));
                return;
            case 28:
                j4 j4Var2 = (j4) this.f1541c;
                int i31 = this.f1540b;
                qf.c cVar = (qf.c) this.d;
                if (j4Var2.I0 == i31 && j4Var2.G0 != 0) {
                    ConnectionsManager.getInstance(j4Var2.X).cancelRequest(j4Var2.G0, false);
                    j4Var2.G0 = 0;
                }
                if (j4Var2.N0 == cVar) {
                    j4Var2.N0 = null;
                    return;
                }
                return;
            default:
                int i32 = this.f1540b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f1541c;
                MessagesController.getInstance(i32).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i32).openGuardBotWebApp(-((TLRPC.Chat) this.d).f22027id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
        }
    }

    public h0(Object obj, int i10, Object obj2, int i11) {
        this.f1539a = i11;
        this.f1541c = obj;
        this.f1540b = i10;
        this.d = obj2;
    }

    public h0(Object obj, Object obj2, int i10, int i11) {
        this.f1539a = i11;
        this.f1541c = obj;
        this.d = obj2;
        this.f1540b = i10;
    }
}
