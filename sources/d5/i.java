package d5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bg.c2;
import bg.q0;
import c2.a1;
import fh.g1;
import g7.e6;
import gh.b4;
import gh.e4;
import gh.g4;
import gh.h4;
import gh.i4;
import gh.l7;
import gh.v7;
import gh.w4;
import gh.z4;
import ih.c9;
import ih.d9;
import ih.f1;
import ih.m9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kh.g6;
import kh.zb;
import mh.z3;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.j4;
import org.telegram.ui.l4;
import org.telegram.ui.qn;
import org.telegram.ui.yg;
import org.telegram.ui.z90;
import yf.r1;
public final class i implements Runnable {
    public final int f4362a;
    public final int f4363b;
    public final Object f4364c;
    public final Object d;

    public i(int i9, Object obj, Object obj2, int i10) {
        this.f4362a = i10;
        this.f4363b = i9;
        this.f4364c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str = null;
        boolean z11 = true;
        int i9 = 0;
        switch (this.f4362a) {
            case 0:
                int i10 = this.f4363b;
                k kVar = (k) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f4364c).iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    if (!mVar.d) {
                        if (i10 != -1) {
                            mVar.f4367b.b(i10);
                        }
                        mVar.f4368c = true;
                        kVar.invoke(mVar.f4366a);
                    }
                }
                return;
            case 1:
                ((e2.d) ((a1) this.f4364c).f2112c).g(this.f4363b, this.d);
                return;
            case 2:
                vq0 vq0Var = (vq0) this.f4364c;
                int i11 = this.f4363b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                l7 l7Var = vq0Var.f6548e;
                if (i11 != -1) {
                    int i12 = tL_starGiftCollection.collection_id;
                    int i13 = l7Var.f8501a;
                    int f10 = l7Var.f(i12);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) l7Var.f8504e.remove(f10);
                        l7Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i13).getInputPeer(l7Var.f8502b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i13).sendRequest(deletestargiftcollection, null);
                    }
                    vq0Var.f(true);
                    m71 m71Var = vq0Var.f6550n;
                    if (i11 < l7Var.d().size()) {
                        i11++;
                    }
                    m71Var.d(-1, i11);
                    vq0Var.n();
                    return;
                }
                return;
            case 3:
                i4 i4Var = (i4) this.f4364c;
                int i14 = this.f4363b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = i4Var.R;
                e4 e4Var = i4Var.f8288f;
                b4 b4Var = i4Var.h;
                if (starGift != null) {
                    g4 g4Var = new g4(i4Var.getContext());
                    g4Var.a(starGift, false);
                    g4Var.setRotation(180.0f);
                    b4Var.f(i14, g4Var);
                    g4Var.setScaleX(0.5f);
                    g4Var.setScaleY(0.5f);
                    g4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = g4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    gr grVar = gr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(grVar);
                    interpolator.setUpdateListener(new bg.b(i4Var, 3));
                    interpolator.start();
                    b4Var.f7842a[i14].setVisibility(8);
                    e4Var.setVisibility(0);
                    e4Var.setAlpha(0.0f);
                    e4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(grVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(i4Var.getContext());
                ?? imageView = new ImageView(i4Var.getContext());
                imageView.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView((View) imageView, e6.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                i4Var.f8291h0 = imageView;
                frameLayout.setBackground(new w4(AndroidUtilities.dp(12.0f), f6.l1(0.075f, -1)));
                b4Var.f7842a[i14].setVisibility(8);
                frameLayout.setRotation(180.0f);
                b4Var.f(i14, frameLayout);
                i4Var.B.a(iArr[2], iArr[3]);
                h4 h4Var = i4Var.f8281b;
                int[] iArr2 = i4Var.Q;
                h4Var.a(iArr2[2], iArr2[3]);
                e4Var.a(iArr[3], iArr[2]);
                return;
            case 4:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, mh.l.F0(this.f4363b)), (z4) this.f4364c, Boolean.FALSE);
                return;
            case 5:
                v7 v7Var = (v7) this.f4364c;
                int i15 = this.f4363b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = v7Var.f9060r;
                ArrayList[] arrayListArr = v7Var.f9059q;
                int i16 = v7Var.f9045a;
                v7Var.f9062t[i15] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i16).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i16).putChats(starsStatus.chats, false);
                    arrayListArr[i15].addAll(starsStatus.history);
                    if (arrayListArr[i15].isEmpty() && !zArr[i15]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i15] = z10;
                    boolean[] zArr2 = v7Var.f9063u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i15] = z11;
                    String[] strArr = v7Var.f9061s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i15] = str;
                    v7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 6:
                int i17 = this.f4363b;
                ve.e.s((Context) this.f4364c, "https://" + MessagesController.getInstance(i17).linkPrefix + "/nft/" + ((String) this.d));
                return;
            case 7:
                hg.s sVar = (hg.s) this.f4364c;
                t5 t5Var = (t5) this.d;
                int i18 = this.f4363b;
                Editable text = sVar.f10724n.getText();
                int spanStart = text.getSpanStart(t5Var);
                int spanEnd = text.getSpanEnd(t5Var);
                int i19 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.f10724n.getText().delete(spanStart, spanEnd);
                    hg.p pVar = sVar.f10724n;
                    pVar.setSelection(Math.min(i18 - i19, pVar.getText().length()));
                    return;
                }
                return;
            case 8:
                ((f1) this.f4364c).B.put((String) this.d, Integer.valueOf(this.f4363b));
                return;
            case 9:
                TLObject tLObject2 = (TLObject) this.f4364c;
                int i20 = this.f4363b;
                z90 z90Var = (z90) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i9 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i9);
                        i9++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i20) {
                            z90Var.accept(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                z90Var.accept(null);
                return;
            case 10:
                int i21 = this.f4363b;
                m9 m9Var = ((d9) this.f4364c).d;
                c9 c9Var = m9Var.f11806j0;
                int i22 = m9Var.h;
                c9Var.f12206w0 = (ArrayList) this.d;
                c9Var.f12204u0 = i22;
                c9Var.setAdapter(null);
                c9Var.setAdapter(c9Var.f12205v0);
                c9Var.setCurrentItem(i21);
                c9Var.f12208y0 = true;
                return;
            case 11:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f4364c, (String) this.d, this.f4363b);
                return;
            case 12:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f4364c, (short[]) this.d, this.f4363b);
                return;
            case 13:
                g6 g6Var = (g6) this.f4364c;
                xf.l lVar = (xf.l) this.d;
                int i23 = this.f4363b;
                if (g6Var.K0.getCurrentBrush() instanceof xf.l) {
                    g6Var.Y0 = true;
                }
                g6Var.n(lVar);
                r1 r1Var = g6Var.f15279g1;
                int i24 = r1Var.d + 1;
                r1Var.a(i24);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.f50089a[i24], i23);
                r1Var.f50092e = true;
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new c2(this.f4363b, ((MessagesStorage) this.f4364c).getUsers(new ArrayList<>((HashSet) this.d)), 10));
                return;
            case 15:
                ((zb) this.f4364c).b((short[]) this.d, this.f4363b);
                return;
            case 16:
                int[] iArr3 = (int[]) this.f4364c;
                int i25 = this.f4363b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i25).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i25).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    return;
                }
                return;
            case 17:
                mh.g4 g4Var2 = (mh.g4) this.f4364c;
                TLObject tLObject3 = (TLObject) this.d;
                int i26 = this.f4363b;
                z3 z3Var = g4Var2.f17861n;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    g4Var2.f17865x = tL_webViewResultUrl.query_id;
                    if (tL_webViewResultUrl.same_origin) {
                        z3Var.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    z3Var.r(i26, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(g4Var2.Q);
                    return;
                }
                return;
            case 18:
                of.f0 f0Var = (of.f0) this.f4364c;
                int i27 = this.f4363b;
                String str2 = (String) this.d;
                int i28 = f0Var.f19303o0;
                f0Var.f19306r = null;
                if (i27 == f0Var.Z) {
                    if (f0Var.f19301n >= 0) {
                        ConnectionsManager.getInstance(i28).cancelRequest(f0Var.f19301n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    f0Var.f19301n = ConnectionsManager.getInstance(i28).sendRequest(tL_channels_searchPosts, new q0(f0Var, i27, str2, 1));
                    return;
                }
                return;
            case 19:
                ((CameraView) this.f4364c).lambda$createCamera$13(this.f4363b, (SurfaceTexture) this.d);
                return;
            case 20:
                ((NativeInstance) this.f4364c).lambda$onEmitJoinPayload$3(this.f4363b, (String) this.d);
                return;
            case 21:
                ((VoIPService) this.f4364c).lambda$createGroupInstance$74((String) this.d, this.f4363b);
                return;
            case 22:
                int i29 = this.f4363b;
                Context context = (Context) this.f4364c;
                f3[] f3VarArr = (f3[]) this.d;
                String str3 = MessagesController.getInstance(i29).freezeAppealUrl;
                if (!str3.startsWith("http://") && !str3.startsWith("https://")) {
                    str3 = "https://".concat(str3);
                }
                ve.e.s(context, str3);
                f3VarArr[0].dismiss();
                return;
            case 23:
                l4 l4Var = (l4) this.f4364c;
                String str4 = (String) this.d;
                int i30 = this.f4363b;
                HashMap hashMap = new HashMap(l4Var.f40026q0[0].f41321c.f39365w);
                ArrayList arrayList2 = new ArrayList(l4Var.f40026q0[0].f41321c.f39366x);
                l4Var.R0 = null;
                Utilities.searchQueue.postRunnable(new g1(l4Var, arrayList2, hashMap, str4, i30, 13));
                return;
            case 24:
                l4 l4Var2 = (l4) this.f4364c;
                int i31 = this.f4363b;
                ve.d dVar = (ve.d) this.d;
                if (l4Var2.D0 == i31 && l4Var2.B0 != 0) {
                    ConnectionsManager.getInstance(l4Var2.T).cancelRequest(l4Var2.B0, false);
                    l4Var2.B0 = 0;
                }
                if (l4Var2.I0 == dVar) {
                    l4Var2.I0 = null;
                    return;
                }
                return;
            case 25:
                int i32 = this.f4363b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f4364c;
                MessagesController.getInstance(i32).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i32).openGuardBotWebApp(-((TLRPC.Chat) this.d).f22380id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 26:
                j4 j4Var = (j4) this.f4364c;
                j4Var.F = this.f4363b;
                j4Var.E = (int[]) this.d;
                j4Var.H.f0();
                return;
            case 27:
                int i33 = this.f4363b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.f4364c);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                e2.h(LaunchActivity.C1, i33, tL_inputGroupCallSlug, false, null, null);
                ((f3[]) this.d)[0].dismiss();
                return;
            case 28:
                ((qn) this.f4364c).Ka((ArrayList) this.d, this.f4363b, false, false);
                return;
            default:
                int i34 = this.f4363b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((qn) this.f4364c).f42077t0.v0(0, i34, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new yg(0, editTextBoldCursor), 100L);
                return;
        }
    }

    public i(Object obj, int i9, Object obj2, int i10) {
        this.f4362a = i10;
        this.f4364c = obj;
        this.f4363b = i9;
        this.d = obj2;
    }

    public i(Object obj, Object obj2, int i9, int i10) {
        this.f4362a = i10;
        this.f4364c = obj;
        this.d = obj2;
        this.f4363b = i9;
    }

    public i(j4 j4Var, int i9, int[] iArr, int[] iArr2) {
        this.f4362a = 26;
        this.f4364c = j4Var;
        this.f4363b = i9;
        this.d = iArr2;
    }
}
