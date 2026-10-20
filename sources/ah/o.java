package ah;

import ai.c6;
import ai.d6;
import ai.e6;
import ai.ga;
import ai.u6;
import ai.ua;
import ai.ub;
import ai.x5;
import ai.x6;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.aa;
import ci.q9;
import ci.r9;
import ei.f6;
import ei.yb;
import gi.f4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ki.e3;
import ki.o5;
import ki.r5;
import ki.w5;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.l4;
import rg.r1;
import w7.z5;
public final class o implements Runnable {
    public final int f836a;
    public final int f837b;
    public final Object f838c;
    public final Object d;

    public o(int i10, Object obj, Object obj2, int i11) {
        this.f836a = i11;
        this.f837b = i10;
        this.f838c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11 = true;
        String str = null;
        int i10 = 0;
        switch (this.f836a) {
            case 0:
                a0 a0Var = (a0) this.f838c;
                a6 a6Var = (a6) this.d;
                int i11 = this.f837b;
                Editable text = a0Var.f643n.getText();
                int spanStart = text.getSpanStart(a6Var);
                int spanEnd = text.getSpanEnd(a6Var);
                int i12 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    a0Var.f643n.getText().delete(spanStart, spanEnd);
                    w wVar = a0Var.f643n;
                    wVar.setSelection(Math.min(i11 - i12, wVar.getText().length()));
                    return;
                }
                return;
            case 1:
                e6 e6Var = (e6) this.f838c;
                int i13 = this.f837b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = e6Var.V;
                ai.a6 a6Var2 = e6Var.f1210f;
                x5 x5Var = e6Var.h;
                if (starGift != null) {
                    c6 c6Var = new c6(e6Var.getContext());
                    c6Var.a(starGift, false);
                    c6Var.setRotation(180.0f);
                    x5Var.f(i13, c6Var);
                    c6Var.setScaleX(0.5f);
                    c6Var.setScaleY(0.5f);
                    c6Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = c6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    bs bsVar = bs.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(bsVar);
                    interpolator.setUpdateListener(new c0(e6Var, 2));
                    interpolator.start();
                    x5Var.f2435a[i13].setVisibility(8);
                    a6Var2.setVisibility(0);
                    a6Var2.setAlpha(0.0f);
                    a6Var2.animate().alpha(0.5f).setDuration(820L).setInterpolator(bsVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(e6Var.getContext());
                ?? imageView = new ImageView(e6Var.getContext());
                imageView.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView((View) imageView, z5.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                e6Var.f1217l0 = imageView;
                frameLayout.setBackground(new u6(AndroidUtilities.dp(12.0f), h6.m1(0.075f, -1)));
                x5Var.f2435a[i13].setVisibility(8);
                frameLayout.setRotation(180.0f);
                x5Var.f(i13, frameLayout);
                e6Var.F.a(iArr[2], iArr[3]);
                d6 d6Var = e6Var.f1204b;
                int[] iArr2 = e6Var.U;
                d6Var.a(iArr2[2], iArr2[3]);
                a6Var2.a(iArr[3], iArr[2]);
                return;
            case 2:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, gi.l.H0(this.f837b)), (x6) this.f838c, Boolean.FALSE);
                return;
            case 3:
                ga gaVar = (ga) this.f838c;
                int i14 = this.f837b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = gaVar.f1377r;
                ArrayList[] arrayListArr = gaVar.f1376q;
                int i15 = gaVar.f1363a;
                gaVar.f1379t[i14] = false;
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
                    boolean[] zArr2 = gaVar.f1380u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i14] = z11;
                    String[] strArr = gaVar.f1378s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i14] = str;
                    gaVar.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 4:
                int i16 = this.f837b;
                pf.d.r((Context) this.f838c, "https://" + MessagesController.getInstance(i16).linkPrefix + "/nft/" + ((String) this.d));
                return;
            case 5:
                ((ci.h1) this.f838c).F.put((String) this.d, Integer.valueOf(this.f837b));
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.f838c;
                int i17 = this.f837b;
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
            case 7:
                int i18 = this.f837b;
                aa aaVar = ((r9) this.f838c).d;
                q9 q9Var = aaVar.f5203n0;
                int i19 = aaVar.h;
                q9Var.A0 = (ArrayList) this.d;
                q9Var.f5515y0 = i19;
                q9Var.setAdapter(null);
                q9Var.setAdapter(q9Var.f5516z0);
                q9Var.setCurrentItem(i18);
                q9Var.C0 = true;
                return;
            case 8:
                int i20 = this.f837b;
                e2.o oVar = (e2.o) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f838c).iterator();
                while (it.hasNext()) {
                    e2.q qVar = (e2.q) it.next();
                    if (!qVar.d) {
                        if (i20 != -1) {
                            qVar.f8270b.b(i20);
                        }
                        qVar.f8271c = true;
                        oVar.invoke(qVar.f8269a);
                    }
                }
                return;
            case 9:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f838c, (String) this.d, this.f837b);
                return;
            case 10:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f838c, (short[]) this.d, this.f837b);
                return;
            case 11:
                f6 f6Var = (f6) this.f838c;
                qg.l lVar = (qg.l) this.d;
                int i21 = this.f837b;
                if (f6Var.O0.getCurrentBrush() instanceof qg.l) {
                    f6Var.f9002c1 = true;
                }
                f6Var.o(lVar);
                r1 r1Var = f6Var.f9018k1;
                int i22 = r1Var.d + 1;
                r1Var.a(i22);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.f45622a[i22], i21);
                r1Var.e = true;
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new g(this.f837b, ((MessagesStorage) this.f838c).getUsers(new ArrayList<>((HashSet) this.d)), 8));
                return;
            case 13:
                ((yb) this.f838c).b((short[]) this.d, this.f837b);
                return;
            case 14:
                int[] iArr3 = (int[]) this.f838c;
                int i23 = this.f837b;
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
            case 15:
                f4 f4Var = (f4) this.f838c;
                TLObject tLObject3 = (TLObject) this.d;
                int i24 = this.f837b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    f4Var.f11212x = tL_webViewResultUrl.query_id;
                    f4Var.f11208n.t(i24, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(f4Var.U);
                    return;
                }
                return;
            case 16:
                hg.h0 h0Var = (hg.h0) this.f838c;
                int i25 = this.f837b;
                String str2 = (String) this.d;
                int i26 = h0Var.f11894s0;
                h0Var.f11891r = null;
                if (i25 == h0Var.f11876d0) {
                    if (h0Var.f11886n >= 0) {
                        ConnectionsManager.getInstance(i26).cancelRequest(h0Var.f11886n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f11886n = ConnectionsManager.getInstance(i26).sendRequest(tL_channels_searchPosts, new hg.u(h0Var, i25, str2, 0));
                    return;
                }
                return;
            case 17:
                Pair pair = (Pair) this.d;
                ((i2.f1) this.f838c).f12353b.h.a(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.f837b);
                return;
            case 18:
                ig.y yVar = (ig.y) this.f838c;
                yVar.f13089b.add(this.f837b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.f13088a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 19:
                int i27 = this.f837b;
                r5 m10 = ((o5) this.f838c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    ki.h1 h1Var = m10.f15491a;
                    h1Var.r();
                    h1Var.setSelection(Math.max(0, Math.min(i27, h1Var.length())));
                    return;
                }
                return;
            case 20:
                ki.a aVar = (ki.a) this.d;
                int i28 = this.f837b;
                ki.c6 c6Var2 = ((w5) this.f838c).f15627a;
                if (c6Var2.f15188y != null) {
                    ki.c6.f(aVar.f15095b, "");
                    ((e3) c6Var2.f15188y).c(aVar, i28);
                    return;
                }
                return;
            case 21:
                n2.k kVar = (n2.k) this.f838c;
                this.d.a(kVar.f17057a, kVar.f17058b, this.f837b);
                return;
            case 22:
                ((View) this.d).postOnAnimation(new g((oh.a) this.f838c, this.f837b, 16));
                return;
            case 23:
                ((CameraView) this.f838c).lambda$createCamera$13(this.f837b, (SurfaceTexture) this.d);
                return;
            case 24:
                NativeInstance.a((NativeInstance) this.f838c, this.f837b, (String) this.d);
                return;
            case 25:
                ((VoIPService) this.f838c).lambda$createGroupInstance$74((String) this.d, this.f837b);
                return;
            case 26:
                int i29 = this.f837b;
                Context context = (Context) this.f838c;
                f3[] f3VarArr = (f3[]) this.d;
                String str3 = MessagesController.getInstance(i29).freezeAppealUrl;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                pf.d.r(context, str3);
                f3VarArr[0].dismiss();
                return;
            case 27:
                l4 l4Var = (l4) this.f838c;
                String str4 = (String) this.d;
                int i30 = this.f837b;
                HashMap hashMap = new HashMap(l4Var.f38778u0[0].f39754c.f38165w);
                ArrayList arrayList2 = new ArrayList(l4Var.f38778u0[0].f39754c.f38166x);
                l4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new ub(l4Var, arrayList2, hashMap, str4, i30, 15));
                return;
            case 28:
                l4 l4Var2 = (l4) this.f838c;
                int i31 = this.f837b;
                pf.c cVar = (pf.c) this.d;
                if (l4Var2.H0 == i31 && l4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(l4Var2.X).cancelRequest(l4Var2.F0, false);
                    l4Var2.F0 = 0;
                }
                if (l4Var2.M0 == cVar) {
                    l4Var2.M0 = null;
                    return;
                }
                return;
            default:
                int i32 = this.f837b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f838c;
                MessagesController.getInstance(i32).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i32).openGuardBotWebApp(-((TLRPC.Chat) this.d).f20276id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
        }
    }

    public o(Object obj, int i10, Object obj2, int i11) {
        this.f836a = i11;
        this.f838c = obj;
        this.f837b = i10;
        this.d = obj2;
    }

    public o(Object obj, Object obj2, int i10, int i11) {
        this.f836a = i11;
        this.f838c = obj;
        this.d = obj2;
        this.f837b = i10;
    }
}
