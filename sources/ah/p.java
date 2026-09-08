package ah;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import bi.fb;
import bi.gb;
import bi.pb;
import bi.t1;
import di.q6;
import di.sc;
import fi.l3;
import fi.r4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ji.a6;
import ji.d3;
import ji.g6;
import ji.s5;
import ji.v5;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.voip.d2;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.co;
import org.telegram.ui.g4;
import org.telegram.ui.i4;
import org.telegram.ui.kh;
import org.telegram.ui.ua0;
public final class p implements Runnable {
    public final int f664a;
    public final int f665b;
    public final Object f666c;
    public final Object d;

    public p(int i10, Object obj, Object obj2, int i11) {
        this.f664a = i11;
        this.f665b = i10;
        this.f666c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f664a) {
            case 0:
                b0 b0Var = (b0) this.f666c;
                z5 z5Var = (z5) this.d;
                int i10 = this.f665b;
                Editable text = b0Var.f460n.getText();
                int spanStart = text.getSpanStart(z5Var);
                int spanEnd = text.getSpanEnd(z5Var);
                int i11 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    b0Var.f460n.getText().delete(spanStart, spanEnd);
                    x xVar = b0Var.f460n;
                    xVar.setSelection(Math.min(i10 - i11, xVar.getText().length()));
                    return;
                }
                return;
            case 1:
                int i12 = this.f665b;
                ((t1) this.f666c).F.put((String) this.d, Integer.valueOf(i12));
                return;
            case 2:
                TLObject tLObject = (TLObject) this.f666c;
                int i13 = this.f665b;
                ua0 ua0Var = (ua0) this.d;
                if (tLObject instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i14);
                        i14++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i13) {
                            ua0Var.accept(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                ua0Var.accept(null);
                return;
            case 3:
                int i15 = this.f665b;
                pb pbVar = ((gb) this.f666c).d;
                fb fbVar = pbVar.f3588n0;
                int i16 = pbVar.h;
                fbVar.A0 = (ArrayList) this.d;
                fbVar.f3857y0 = i16;
                fbVar.setAdapter(null);
                fbVar.setAdapter(fbVar.f3858z0);
                fbVar.setCurrentItem(i15);
                fbVar.C0 = true;
                return;
            case 4:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f666c, (String) this.d, this.f665b);
                return;
            case 5:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f666c, (short[]) this.d, this.f665b);
                return;
            case 6:
                q6 q6Var = (q6) this.f666c;
                qg.l lVar = (qg.l) this.d;
                int i17 = this.f665b;
                if (q6Var.O0.getCurrentBrush() instanceof qg.l) {
                    q6Var.f7984c1 = true;
                }
                q6Var.o(lVar);
                rg.t1 t1Var = q6Var.f8000k1;
                int i18 = t1Var.d + 1;
                t1Var.a(i18);
                AndroidUtilities.updateImageViewImageAnimated(t1Var.f45519a[i18], i17);
                t1Var.f45522e = true;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new g(this.f665b, ((MessagesStorage) this.f666c).getUsers(new ArrayList<>((HashSet) this.d)), 6));
                return;
            case 8:
                ((sc) this.f666c).b((short[]) this.d, this.f665b);
                return;
            case 9:
                int i19 = this.f665b;
                e2.m mVar = (e2.m) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f666c).iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i19 != -1) {
                            oVar.f8793b.b(i19);
                        }
                        oVar.f8794c = true;
                        mVar.invoke(oVar.f8792a);
                    }
                }
                return;
            case 10:
                int[] iArr = (int[]) this.f666c;
                int i20 = this.f665b;
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
                r4 r4Var = (r4) this.f666c;
                TLObject tLObject2 = (TLObject) this.d;
                int i21 = this.f665b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    r4Var.f9962x = tL_webViewResultUrl.query_id;
                    r4Var.f9958n.u(i21, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(r4Var.U);
                    return;
                }
                return;
            case 12:
                hg.i0 i0Var = (hg.i0) this.f666c;
                int i22 = this.f665b;
                String str = (String) this.d;
                int i23 = i0Var.f11119s0;
                i0Var.f11116r = null;
                if (i22 == i0Var.f11100d0) {
                    if (i0Var.f11111n >= 0) {
                        ConnectionsManager.getInstance(i23).cancelRequest(i0Var.f11111n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.f11111n = ConnectionsManager.getInstance(i23).sendRequest(tL_channels_searchPosts, new hg.u(i0Var, i22, str, 0));
                    return;
                }
                return;
            case 13:
                Pair pair = (Pair) this.d;
                ((i2.c1) this.f666c).f11499b.h.a(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.f665b);
                return;
            case 14:
                ig.y yVar = (ig.y) this.f666c;
                yVar.f12310b.add(this.f665b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.f12309a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 15:
                int i24 = this.f665b;
                v5 m10 = ((s5) this.f666c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    ji.h1 h1Var = m10.f14303a;
                    h1Var.r();
                    h1Var.setSelection(Math.max(0, Math.min(i24, h1Var.length())));
                    return;
                }
                return;
            case 16:
                ji.a aVar = (ji.a) this.d;
                int i25 = this.f665b;
                g6 g6Var = ((a6) this.f666c).f13804a;
                if (g6Var.f13965y != null) {
                    g6.f(aVar.f13758b, "");
                    ((d3) g6Var.f13965y).c(aVar, i25);
                    return;
                }
                return;
            case 17:
                n2.j jVar = (n2.j) this.f666c;
                this.d.a(jVar.f16427a, jVar.f16428b, this.f665b);
                return;
            case 18:
                ((View) this.d).postOnAnimation(new g((oh.a) this.f666c, this.f665b, 14));
                return;
            case 19:
                ((CameraView) this.f666c).lambda$createCamera$13(this.f665b, (SurfaceTexture) this.d);
                return;
            case 20:
                NativeInstance.a((NativeInstance) this.f666c, this.f665b, (String) this.d);
                return;
            case 21:
                ((VoIPService) this.f666c).lambda$createGroupInstance$74((String) this.d, this.f665b);
                return;
            case 22:
                int i26 = this.f665b;
                Context context = (Context) this.f666c;
                f3[] f3VarArr = (f3[]) this.d;
                String str2 = MessagesController.getInstance(i26).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                of.f.s(context, str2);
                f3VarArr[0].dismiss();
                return;
            case 23:
                i4 i4Var = (i4) this.f666c;
                String str3 = (String) this.d;
                int i27 = this.f665b;
                HashMap hashMap = new HashMap(i4Var.f37259u0[0].f38579c.f36582w);
                ArrayList arrayList2 = new ArrayList(i4Var.f37259u0[0].f38579c.f36583x);
                i4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new l3(i4Var, arrayList2, hashMap, str3, i27, 13));
                return;
            case 24:
                i4 i4Var2 = (i4) this.f666c;
                int i28 = this.f665b;
                of.e eVar = (of.e) this.d;
                if (i4Var2.H0 == i28 && i4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(i4Var2.X).cancelRequest(i4Var2.F0, false);
                    i4Var2.F0 = 0;
                }
                if (i4Var2.M0 == eVar) {
                    i4Var2.M0 = null;
                    return;
                }
                return;
            case 25:
                int i29 = this.f665b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f666c;
                MessagesController.getInstance(i29).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i29).openGuardBotWebApp(-((TLRPC.Chat) this.d).f19896id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 26:
                g4 g4Var = (g4) this.f666c;
                g4Var.J = this.f665b;
                g4Var.I = (int[]) this.d;
                g4Var.L.f0();
                return;
            case 27:
                int i30 = this.f665b;
                f3[] f3VarArr2 = (f3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.f666c);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                d2.g(LaunchActivity.G1, i30, tL_inputGroupCallSlug, false, null, null);
                f3VarArr2[0].dismiss();
                return;
            case 28:
                ((co) this.f666c).Ka((ArrayList) this.d, this.f665b, false, false);
                return;
            default:
                int i31 = this.f665b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((co) this.f666c).f35500x0.v0(0, i31, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new kh(0, editTextBoldCursor), 100L);
                return;
        }
    }

    public p(Object obj, int i10, Object obj2, int i11) {
        this.f664a = i11;
        this.f666c = obj;
        this.f665b = i10;
        this.d = obj2;
    }

    public p(Object obj, Object obj2, int i10, int i11) {
        this.f664a = i11;
        this.f666c = obj;
        this.d = obj2;
        this.f665b = i10;
    }

    public p(g4 g4Var, int i10, int[] iArr, int[] iArr2) {
        this.f664a = 26;
        this.f666c = g4Var;
        this.f665b = i10;
        this.d = iArr2;
    }
}
