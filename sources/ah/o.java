package ah;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import bi.ib;
import bi.jb;
import bi.sb;
import bi.t1;
import di.nc;
import di.o6;
import fi.l3;
import fi.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ji.c6;
import ji.f3;
import ji.i6;
import ji.u5;
import ji.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.voip.d2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.fo;
import org.telegram.ui.i4;
import org.telegram.ui.k4;
import org.telegram.ui.oh;
public final class o implements Runnable {
    public final int f832a;
    public final int f833b;
    public final Object f834c;
    public final Object d;

    public o(int i10, Object obj, Object obj2, int i11) {
        this.f832a = i11;
        this.f833b = i10;
        this.f834c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f832a) {
            case 0:
                a0 a0Var = (a0) this.f834c;
                b6 b6Var = (b6) this.d;
                int i10 = this.f833b;
                Editable text = a0Var.f639n.getText();
                int spanStart = text.getSpanStart(b6Var);
                int spanEnd = text.getSpanEnd(b6Var);
                int i11 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    a0Var.f639n.getText().delete(spanStart, spanEnd);
                    w wVar = a0Var.f639n;
                    wVar.setSelection(Math.min(i10 - i11, wVar.getText().length()));
                    return;
                }
                return;
            case 1:
                int i12 = this.f833b;
                ((t1) this.f834c).F.put((String) this.d, Integer.valueOf(i12));
                return;
            case 2:
                TLObject tLObject = (TLObject) this.f834c;
                int i13 = this.f833b;
                gi.m0 m0Var = (gi.m0) this.d;
                if (tLObject instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i14);
                        i14++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i13) {
                            m0Var.run(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                m0Var.run(null);
                return;
            case 3:
                int i15 = this.f833b;
                sb sbVar = ((jb) this.f834c).d;
                ib ibVar = sbVar.f3689n0;
                int i16 = sbVar.h;
                ibVar.A0 = (ArrayList) this.d;
                ibVar.f3986y0 = i16;
                ibVar.setAdapter(null);
                ibVar.setAdapter(ibVar.f3987z0);
                ibVar.setCurrentItem(i15);
                ibVar.C0 = true;
                return;
            case 4:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f834c, (String) this.d, this.f833b);
                return;
            case 5:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f834c, (short[]) this.d, this.f833b);
                return;
            case 6:
                o6 o6Var = (o6) this.f834c;
                qg.l lVar = (qg.l) this.d;
                int i17 = this.f833b;
                if (o6Var.O0.getCurrentBrush() instanceof qg.l) {
                    o6Var.f7515c1 = true;
                }
                o6Var.o(lVar);
                rg.t1 t1Var = o6Var.f7531k1;
                int i18 = t1Var.d + 1;
                t1Var.a(i18);
                AndroidUtilities.updateImageViewImageAnimated(t1Var.f44551a[i18], i17);
                t1Var.e = true;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new g(this.f833b, ((MessagesStorage) this.f834c).getUsers(new ArrayList<>((HashSet) this.d)), 6));
                return;
            case 8:
                ((nc) this.f834c).b((short[]) this.d, this.f833b);
                return;
            case 9:
                int i19 = this.f833b;
                e2.o oVar = (e2.o) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f834c).iterator();
                while (it.hasNext()) {
                    e2.q qVar = (e2.q) it.next();
                    if (!qVar.d) {
                        if (i19 != -1) {
                            qVar.f8390b.b(i19);
                        }
                        qVar.f8391c = true;
                        oVar.invoke(qVar.f8389a);
                    }
                }
                return;
            case 10:
                int[] iArr = (int[]) this.f834c;
                int i20 = this.f833b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i20).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i20).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    return;
                }
                return;
            case 11:
                q4 q4Var = (q4) this.f834c;
                TLObject tLObject2 = (TLObject) this.d;
                int i21 = this.f833b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    q4Var.f9499x = tL_webViewResultUrl.query_id;
                    q4Var.f9495n.t(i21, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(q4Var.U);
                    return;
                }
                return;
            case 12:
                hg.h0 h0Var = (hg.h0) this.f834c;
                int i22 = this.f833b;
                String str = (String) this.d;
                int i23 = h0Var.f10586s0;
                h0Var.f10583r = null;
                if (i22 == h0Var.f10568d0) {
                    if (h0Var.f10578n >= 0) {
                        ConnectionsManager.getInstance(i23).cancelRequest(h0Var.f10578n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f10578n = ConnectionsManager.getInstance(i23).sendRequest(tL_channels_searchPosts, new hg.u(h0Var, i22, str, 0));
                    return;
                }
                return;
            case 13:
                Pair pair = (Pair) this.d;
                ((i2.g1) this.f834c).f10977b.h.a(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.f833b);
                return;
            case 14:
                ig.y yVar = (ig.y) this.f834c;
                yVar.f11698b.add(this.f833b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.f11697a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 15:
                int i24 = this.f833b;
                x5 m10 = ((u5) this.f834c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    ji.h1 h1Var = m10.f13658a;
                    h1Var.r();
                    h1Var.setSelection(Math.max(0, Math.min(i24, h1Var.length())));
                    return;
                }
                return;
            case 16:
                ji.a aVar = (ji.a) this.d;
                int i25 = this.f833b;
                i6 i6Var = ((c6) this.f834c).f13188a;
                if (i6Var.f13343y != null) {
                    i6.f(aVar.f13103b, "");
                    ((f3) i6Var.f13343y).c(aVar, i25);
                    return;
                }
                return;
            case 17:
                n2.k kVar = (n2.k) this.f834c;
                this.d.a(kVar.f15963a, kVar.f15964b, this.f833b);
                return;
            case 18:
                ((View) this.d).postOnAnimation(new g((oh.a) this.f834c, this.f833b, 14));
                return;
            case 19:
                ((CameraView) this.f834c).lambda$createCamera$13(this.f833b, (SurfaceTexture) this.d);
                return;
            case 20:
                NativeInstance.a((NativeInstance) this.f834c, this.f833b, (String) this.d);
                return;
            case 21:
                ((VoIPService) this.f834c).lambda$createGroupInstance$74((String) this.d, this.f833b);
                return;
            case 22:
                int i26 = this.f833b;
                Context context = (Context) this.f834c;
                e3[] e3VarArr = (e3[]) this.d;
                String str2 = MessagesController.getInstance(i26).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                pf.d.s(context, str2);
                e3VarArr[0].dismiss();
                return;
            case 23:
                k4 k4Var = (k4) this.f834c;
                String str3 = (String) this.d;
                int i27 = this.f833b;
                HashMap hashMap = new HashMap(k4Var.f37557u0[0].f38848c.f37026w);
                ArrayList arrayList2 = new ArrayList(k4Var.f37557u0[0].f38848c.f37027x);
                k4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new l3(k4Var, arrayList2, hashMap, str3, i27, 14));
                return;
            case 24:
                k4 k4Var2 = (k4) this.f834c;
                int i28 = this.f833b;
                pf.c cVar = (pf.c) this.d;
                if (k4Var2.H0 == i28 && k4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(k4Var2.X).cancelRequest(k4Var2.F0, false);
                    k4Var2.F0 = 0;
                }
                if (k4Var2.M0 == cVar) {
                    k4Var2.M0 = null;
                    return;
                }
                return;
            case 25:
                int i29 = this.f833b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f834c;
                MessagesController.getInstance(i29).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i29).openGuardBotWebApp(-((TLRPC.Chat) this.d).f19216id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 26:
                i4 i4Var = (i4) this.f834c;
                i4Var.J = this.f833b;
                i4Var.I = (int[]) this.d;
                i4Var.L.f0();
                return;
            case 27:
                int i30 = this.f833b;
                e3[] e3VarArr2 = (e3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.f834c);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                d2.g(LaunchActivity.G1, i30, tL_inputGroupCallSlug, false, null, null);
                e3VarArr2[0].dismiss();
                return;
            case 28:
                ((fo) this.f834c).Oa((ArrayList) this.d, this.f833b, false, false);
                return;
            default:
                int i31 = this.f833b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((fo) this.f834c).f36160x0.v0(0, i31, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new oh(0, editTextBoldCursor), 100L);
                return;
        }
    }

    public o(Object obj, int i10, Object obj2, int i11) {
        this.f832a = i11;
        this.f834c = obj;
        this.f833b = i10;
        this.d = obj2;
    }

    public o(Object obj, Object obj2, int i10, int i11) {
        this.f832a = i11;
        this.f834c = obj;
        this.d = obj2;
        this.f833b = i10;
    }

    public o(i4 i4Var, int i10, int[] iArr, int[] iArr2) {
        this.f832a = 26;
        this.f834c = i4Var;
        this.f833b = i10;
        this.d = iArr2;
    }
}
