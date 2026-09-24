package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.MessageObject;
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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.am;
import org.telegram.ui.jm;
import org.telegram.ui.mh;
import org.telegram.ui.wn;
public final class s1 implements Runnable {
    public final int f1483a;
    public final int f1484b;
    public final Object f1485c;
    public final Object d;

    public s1(int i10, Object obj, Object obj2, int i11) {
        this.f1483a = i11;
        this.f1484b = i10;
        this.f1485c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f1483a) {
            case 0:
                int i11 = this.f1484b;
                ((d2) this.f1485c).F.put((String) this.d, Integer.valueOf(i11));
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f1485c;
                int i12 = this.f1484b;
                fi.m0 m0Var = (fi.m0) this.d;
                if (tLObject instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i13);
                        i13++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i12) {
                            m0Var.run(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                m0Var.run(null);
                return;
            case 2:
                int i14 = this.f1484b;
                jc jcVar = ((ac) this.f1485c).d;
                zb zbVar = jcVar.f1087n0;
                int i15 = jcVar.h;
                zbVar.A0 = (ArrayList) this.d;
                zbVar.f1310y0 = i15;
                zbVar.setAdapter(null);
                zbVar.setAdapter(zbVar.f1311z0);
                zbVar.setCurrentItem(i14);
                zbVar.C0 = true;
                return;
            case 3:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1485c, (String) this.d, this.f1484b);
                return;
            case 4:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1485c, (short[]) this.d, this.f1484b);
                return;
            case 5:
                ci.q6 q6Var = (ci.q6) this.f1485c;
                pg.l lVar = (pg.l) this.d;
                int i16 = this.f1484b;
                if (q6Var.O0.getCurrentBrush() instanceof pg.l) {
                    q6Var.f5334c1 = true;
                }
                q6Var.b(lVar);
                qg.s1 s1Var = q6Var.f5350k1;
                int i17 = s1Var.d + 1;
                s1Var.a(i17);
                AndroidUtilities.updateImageViewImageAnimated(s1Var.f41904a[i17], i16);
                s1Var.e = true;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new o8(this.f1484b, ((MessagesStorage) this.f1485c).getUsers(new ArrayList<>((HashSet) this.d)), 5));
                return;
            case 7:
                ((ci.oc) this.f1485c).b((short[]) this.d, this.f1484b);
                return;
            case 8:
                int i18 = this.f1484b;
                e2.m mVar = (e2.m) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1485c).iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i18 != -1) {
                            oVar.f7896b.b(i18);
                        }
                        oVar.f7897c = true;
                        mVar.invoke(oVar.f7895a);
                    }
                }
                return;
            case 9:
                int[] iArr = (int[]) this.f1485c;
                int i19 = this.f1484b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i19).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i19).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    return;
                }
                return;
            case 10:
                ei.q4 q4Var = (ei.q4) this.f1485c;
                TLObject tLObject2 = (TLObject) this.d;
                int i20 = this.f1484b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    q4Var.f8556x = tL_webViewResultUrl.query_id;
                    q4Var.f8552n.u(i20, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(q4Var.U);
                    return;
                }
                return;
            case 11:
                gg.i0 i0Var = (gg.i0) this.f1485c;
                int i21 = this.f1484b;
                String str = (String) this.d;
                int i22 = i0Var.f9765s0;
                i0Var.f9762r = null;
                if (i21 == i0Var.f9747d0) {
                    if (i0Var.f9757n >= 0) {
                        ConnectionsManager.getInstance(i22).cancelRequest(i0Var.f9757n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.f9757n = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new gg.u(i0Var, i21, str, 0));
                    return;
                }
                return;
            case 12:
                hg.a0 a0Var = (hg.a0) this.f1485c;
                a0Var.f10193b.add(this.f1484b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(a0Var.f10192a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 13:
                Pair pair = (Pair) this.d;
                ((i2.d1) this.f1485c).f10626b.h.a(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.f1484b);
                return;
            case 14:
                int i23 = this.f1484b;
                ii.s5 m10 = ((ii.p5) this.f1485c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    ii.i1 i1Var = m10.f11616a;
                    i1Var.r();
                    i1Var.setSelection(Math.max(0, Math.min(i23, i1Var.length())));
                    return;
                }
                return;
            case 15:
                ii.a aVar = (ii.a) this.d;
                int i24 = this.f1484b;
                ii.e6 e6Var = ((ii.y5) this.f1485c).f11779a;
                if (e6Var.f11355y != null) {
                    ii.e6.f(aVar.f11191b, "");
                    ((ii.f3) e6Var.f11355y).c(aVar, i24);
                    return;
                }
                return;
            case 16:
                n2.k kVar = (n2.k) this.f1485c;
                this.d.a(kVar.f15118a, kVar.f15119b, this.f1484b);
                return;
            case 17:
                ((View) this.d).postOnAnimation(new o8((nh.a) this.f1485c, this.f1484b, 13));
                return;
            case 18:
                ((CameraView) this.f1485c).lambda$createCamera$13(this.f1484b, (SurfaceTexture) this.d);
                return;
            case 19:
                NativeInstance.a((NativeInstance) this.f1485c, this.f1484b, (String) this.d);
                return;
            case 20:
                ((VoIPService) this.f1485c).lambda$createGroupInstance$74((String) this.d, this.f1484b);
                return;
            case 21:
                int i25 = this.f1484b;
                Context context = (Context) this.f1485c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.d;
                String str2 = MessagesController.getInstance(i25).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                nf.f.s(context, str2);
                e3VarArr[0].dismiss();
                return;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f1485c;
                String str3 = (String) this.d;
                int i26 = this.f1484b;
                HashMap hashMap = new HashMap(i4Var.f34394u0[0].f35448c.f33801w);
                ArrayList arrayList2 = new ArrayList(i4Var.f34394u0[0].f35448c.f33802x);
                i4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new ei.l3(i4Var, arrayList2, hashMap, str3, i26, 14));
                return;
            case 23:
                org.telegram.ui.i4 i4Var2 = (org.telegram.ui.i4) this.f1485c;
                int i27 = this.f1484b;
                nf.e eVar = (nf.e) this.d;
                if (i4Var2.H0 == i27 && i4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(i4Var2.X).cancelRequest(i4Var2.F0, false);
                    i4Var2.F0 = 0;
                }
                if (i4Var2.M0 == eVar) {
                    i4Var2.M0 = null;
                    return;
                }
                return;
            case 24:
                int i28 = this.f1484b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f1485c;
                MessagesController.getInstance(i28).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i28).openGuardBotWebApp(-((TLRPC.Chat) this.d).f18321id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 25:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f1485c;
                g4Var.J = this.f1484b;
                g4Var.I = (int[]) this.d;
                g4Var.L.f0();
                return;
            case 26:
                int i29 = this.f1484b;
                org.telegram.ui.ActionBar.e3[] e3VarArr2 = (org.telegram.ui.ActionBar.e3[]) this.f1485c;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.d);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i29, tL_inputGroupCallSlug, false, null, null);
                e3VarArr2[0].dismiss();
                return;
            case 27:
                ((wn) this.f1485c).Ka((ArrayList) this.d, this.f1484b, false, false);
                return;
            case 28:
                int i30 = this.f1484b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((wn) this.f1485c).f39680x0.v0(0, i30, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new mh(0, editTextBoldCursor), 100L);
                return;
            default:
                am amVar = (am) this.f1485c;
                int i31 = this.f1484b;
                amVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.d).getMessageObject();
                jm jmVar = amVar.f32184a;
                wn wnVar = jmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == jmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                wnVar.F(i31, id2, i10, 0, true, true);
                return;
        }
    }

    public s1(Object obj, int i10, Object obj2, int i11) {
        this.f1483a = i11;
        this.f1485c = obj;
        this.f1484b = i10;
        this.d = obj2;
    }

    public s1(Object obj, Object obj2, int i10, int i11) {
        this.f1483a = i11;
        this.f1485c = obj;
        this.d = obj2;
        this.f1484b = i10;
    }

    public s1(String str, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f1483a = 26;
        this.d = str;
        this.f1484b = i10;
        this.f1485c = e3VarArr;
    }

    public s1(org.telegram.ui.g4 g4Var, int i10, int[] iArr, int[] iArr2) {
        this.f1483a = 25;
        this.f1485c = g4Var;
        this.f1484b = i10;
        this.d = iArr2;
    }
}
