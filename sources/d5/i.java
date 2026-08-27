package d5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c2.z0;
import cg.w1;
import gh.e1;
import h7.z5;
import hh.c4;
import hh.e4;
import hh.f4;
import hh.g4;
import hh.k7;
import hh.u4;
import hh.u7;
import hh.x4;
import hh.z3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import jh.d1;
import jh.i9;
import jh.y8;
import jh.z8;
import lh.f6;
import lh.vb;
import nh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.ah;
import org.telegram.ui.da0;
import org.telegram.ui.dm;
import org.telegram.ui.k4;
import org.telegram.ui.m4;
import org.telegram.ui.rn;
import org.telegram.ui.ul;
import zf.r1;

public final class i implements Runnable {

    public final int f4807a;

    public final int f4808b;

    public final Object f4809c;
    public final Object d;

    public i(int i10, Object obj, Object obj2, int i11) {
        this.f4807a = i11;
        this.f4808b = i10;
        this.f4809c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i10 = 0;
        switch (this.f4807a) {
            case 0:
                CopyOnWriteArraySet<m> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f4809c;
                int i11 = this.f4808b;
                k kVar = (k) this.d;
                for (m mVar : copyOnWriteArraySet) {
                    if (!mVar.d) {
                        if (i11 != -1) {
                            mVar.f4812b.b(i11);
                        }
                        mVar.f4813c = true;
                        kVar.invoke(mVar.f4811a);
                    }
                }
                break;
            case 1:
                ((e2.c) ((z0) this.f4809c).f2412c).n(this.f4808b, this.d);
                break;
            case 2:
                wq0 wq0Var = (wq0) this.f4809c;
                int i12 = this.f4808b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                k7 k7Var = wq0Var.f7200e;
                if (i12 != -1) {
                    int i13 = tL_starGiftCollection.collection_id;
                    int i14 = k7Var.f9611a;
                    int iF = k7Var.f(i13);
                    if (iF != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) k7Var.f9614e.remove(iF);
                        k7Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i14).getInputPeer(k7Var.f9612b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i14).sendRequest(deletestargiftcollection, null);
                    }
                    wq0Var.f(true);
                    o71 o71Var = wq0Var.f7202n;
                    if (i12 < k7Var.d().size()) {
                        i12++;
                    }
                    o71Var.d(-1, i12);
                    wq0Var.n();
                }
                break;
            case 3:
                g4 g4Var = (g4) this.f4809c;
                int i15 = this.f4808b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = g4Var.R;
                c4 c4Var = g4Var.f9310f;
                z3 z3Var = g4Var.h;
                if (starGift != null) {
                    e4 e4Var = new e4(g4Var.getContext());
                    e4Var.a(starGift, false);
                    e4Var.setRotation(180.0f);
                    z3Var.f(i15, e4Var);
                    e4Var.setScaleX(0.5f);
                    e4Var.setScaleY(0.5f);
                    e4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = e4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    er erVar = er.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(erVar);
                    interpolator.setUpdateListener(new ag.u(g4Var, 6));
                    interpolator.start();
                    z3Var.f10410a[i15].setVisibility(8);
                    c4Var.setVisibility(0);
                    c4Var.setAlpha(0.0f);
                    c4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(erVar).start();
                } else {
                    FrameLayout frameLayout = new FrameLayout(g4Var.getContext());
                    ri0 ri0Var = new ri0(g4Var.getContext());
                    ri0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(ri0Var, z5.e(32, 32, 17));
                    ri0Var.setScaleX(0.5f);
                    ri0Var.setScaleY(0.5f);
                    ri0Var.setAlpha(0.0f);
                    ri0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    g4Var.f9313h0 = ri0Var;
                    frameLayout.setBackground(new u4(AndroidUtilities.dp(12.0f), g6.l1(0.075f, -1)));
                    z3Var.f10410a[i15].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    z3Var.f(i15, frameLayout);
                    g4Var.B.a(iArr[2], iArr[3]);
                    f4 f4Var = g4Var.f9303b;
                    int[] iArr2 = g4Var.Q;
                    f4Var.a(iArr2[2], iArr2[3]);
                    c4Var.a(iArr[3], iArr[2]);
                }
                break;
            case 4:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, nh.k.G0(this.f4808b)), (x4) this.f4809c, Boolean.FALSE);
                break;
            case 5:
                u7 u7Var = (u7) this.f4809c;
                int i16 = this.f4808b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = u7Var.f10166r;
                ArrayList[] arrayListArr = u7Var.f10165q;
                int i17 = u7Var.f10151a;
                u7Var.f10168t[i16] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i17).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i17).putChats(starsStatus.chats, false);
                    arrayListArr[i16].addAll(starsStatus.history);
                    zArr[i16] = !arrayListArr[i16].isEmpty() || zArr[i16];
                    boolean[] zArr2 = u7Var.f10169u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i16] = z10;
                    u7Var.f10167s[i16] = z10 ? null : starsStatus.next_offset;
                    u7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                break;
            case 6:
                Context context = (Context) this.f4809c;
                int i18 = this.f4808b;
                we.e.s(context, "https://" + MessagesController.getInstance(i18).linkPrefix + "/nft/" + ((String) this.d));
                break;
            case 7:
                ig.s sVar = (ig.s) this.f4809c;
                t5 t5Var = (t5) this.d;
                int i19 = this.f4808b;
                Editable text = sVar.f11446n.getText();
                int spanStart = text.getSpanStart(t5Var);
                int spanEnd = text.getSpanEnd(t5Var);
                int i20 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.f11446n.getText().delete(spanStart, spanEnd);
                    ig.p pVar = sVar.f11446n;
                    pVar.setSelection(Math.min(i19 - i20, pVar.getText().length()));
                    break;
                }
                break;
            case 8:
                ((d1) this.f4809c).B.put((String) this.d, Integer.valueOf(this.f4808b));
                break;
            case 9:
                TLObject tLObject2 = (TLObject) this.f4809c;
                int i21 = this.f4808b;
                da0 da0Var = (da0) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i21) {
                            da0Var.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                da0Var.accept(null);
                break;
            case 10:
                z8 z8Var = (z8) this.f4809c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i22 = this.f4808b;
                i9 i9Var = z8Var.d;
                y8 y8Var = i9Var.f13487j0;
                int i23 = i9Var.h;
                y8Var.f13867w0 = arrayList2;
                y8Var.f13865u0 = i23;
                y8Var.setAdapter(null);
                y8Var.setAdapter(y8Var.f13866v0);
                y8Var.setCurrentItem(i22);
                y8Var.f13869y0 = true;
                break;
            case 11:
                ((FfmpegAudioWaveformLoader) this.f4809c).lambda$new$0((String) this.d, this.f4808b);
                break;
            case 12:
                ((FfmpegAudioWaveformLoader) this.f4809c).lambda$receiveChunk$1((short[]) this.d, this.f4808b);
                break;
            case 13:
                f6 f6Var = (f6) this.f4809c;
                yf.l lVar = (yf.l) this.d;
                int i24 = this.f4808b;
                if (f6Var.K0.getCurrentBrush() instanceof yf.l) {
                    f6Var.Y0 = true;
                }
                f6Var.l(lVar);
                r1 r1Var = f6Var.f15969g1;
                int i25 = r1Var.d + 1;
                r1Var.a(i25);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.f50684a[i25], i24);
                r1Var.f50687e = true;
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new w1(this.f4808b, ((MessagesStorage) this.f4809c).getUsers(new ArrayList<>((HashSet) this.d)), 10));
                break;
            case 15:
                ((vb) this.f4809c).b((short[]) this.d, this.f4808b);
                break;
            case 16:
                int[] iArr3 = (int[]) this.f4809c;
                int i26 = this.f4808b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i26).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i26).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                }
                break;
            case 17:
                nh.e4 e4Var2 = (nh.e4) this.f4809c;
                TLObject tLObject3 = (TLObject) this.d;
                int i27 = this.f4808b;
                x3 x3Var = e4Var2.f18669n;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    e4Var2.f18673x = tL_webViewResultUrl.query_id;
                    if (tL_webViewResultUrl.same_origin) {
                        x3Var.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    x3Var.r(i27, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(e4Var2.Q);
                }
                break;
            case 18:
                ((CameraView) this.f4809c).lambda$createCamera$13(this.f4808b, (SurfaceTexture) this.d);
                break;
            case 19:
                ((NativeInstance) this.f4809c).lambda$onEmitJoinPayload$3(this.f4808b, (String) this.d);
                break;
            case 20:
                ((VoIPService) this.f4809c).lambda$createGroupInstance$74((String) this.d, this.f4808b);
                break;
            case 21:
                int i28 = this.f4808b;
                Context context2 = (Context) this.f4809c;
                e3[] e3VarArr = (e3[]) this.d;
                String strConcat = MessagesController.getInstance(i28).freezeAppealUrl;
                if (!strConcat.startsWith("http://") && !strConcat.startsWith("https://")) {
                    strConcat = "https://".concat(strConcat);
                }
                we.e.s(context2, strConcat);
                e3VarArr[0].dismiss();
                break;
            case 22:
                m4 m4Var = (m4) this.f4809c;
                String str = (String) this.d;
                int i29 = this.f4808b;
                HashMap map = new HashMap(m4Var.f40347q0[0].f41497c.f39595w);
                ArrayList arrayList3 = new ArrayList(m4Var.f40347q0[0].f41497c.f39596x);
                m4Var.R0 = null;
                Utilities.searchQueue.postRunnable(new e1(m4Var, arrayList3, map, str, i29, 11));
                break;
            case 23:
                m4 m4Var2 = (m4) this.f4809c;
                int i30 = this.f4808b;
                we.d dVar = (we.d) this.d;
                if (m4Var2.D0 == i30 && m4Var2.B0 != 0) {
                    ConnectionsManager.getInstance(m4Var2.T).cancelRequest(m4Var2.B0, false);
                    m4Var2.B0 = 0;
                }
                if (m4Var2.I0 == dVar) {
                    m4Var2.I0 = null;
                }
                break;
            case 24:
                int i31 = this.f4808b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f4809c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i31).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i31).openGuardBotWebApp(-chat.f22380id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 25:
                k4 k4Var = (k4) this.f4809c;
                int i32 = this.f4808b;
                int[] iArr4 = (int[]) this.d;
                k4Var.F = i32;
                k4Var.E = iArr4;
                k4Var.H.f0();
                break;
            case 26:
                String str2 = (String) this.f4809c;
                int i33 = this.f4808b;
                e3[] e3VarArr2 = (e3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri uri = Uri.parse(str2);
                tL_inputGroupCallSlug.slug = uri.getPathSegments().get(uri.getPathSegments().size() - 1);
                e2.h(LaunchActivity.C1, i33, tL_inputGroupCallSlug, false, null, null);
                e3VarArr2[0].dismiss();
                break;
            case 27:
                ((rn) this.f4809c).Ka((ArrayList) this.d, this.f4808b, false, false);
                break;
            case 28:
                rn rnVar = (rn) this.f4809c;
                int i34 = this.f4808b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                rnVar.f42213t0.v0(0, i34, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ah(i10, editTextBoldCursor), 100L);
                break;
            default:
                ul ulVar = (ul) this.f4809c;
                v0 v0Var = (v0) this.d;
                int i35 = this.f4808b;
                ulVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                dm dmVar = ulVar.f43247a;
                dmVar.M.j(i35, messageObject.getId(), true, messageObject.getDialogId() == dmVar.M.H6 ? 1 : 0, true, 0);
                break;
        }
    }

    public i(Object obj, int i10, Object obj2, int i11) {
        this.f4807a = i11;
        this.f4809c = obj;
        this.f4808b = i10;
        this.d = obj2;
    }

    public i(Object obj, Object obj2, int i10, int i11) {
        this.f4807a = i11;
        this.f4809c = obj;
        this.d = obj2;
        this.f4808b = i10;
    }

    public i(k4 k4Var, int i10, int[] iArr, int[] iArr2) {
        this.f4807a = 25;
        this.f4809c = k4Var;
        this.f4808b = i10;
        this.d = iArr2;
    }
}
