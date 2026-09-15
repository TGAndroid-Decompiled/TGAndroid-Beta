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
import org.telegram.ui.bo;
import org.telegram.ui.em;
import org.telegram.ui.jh;
import org.telegram.ui.nm;
import org.telegram.ui.ua0;
public final class s1 implements Runnable {
    public final int f1489a;
    public final int f1490b;
    public final Object f1491c;
    public final Object d;

    public s1(int i10, Object obj, Object obj2, int i11) {
        this.f1489a = i11;
        this.f1490b = i10;
        this.f1491c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f1489a) {
            case 0:
                int i11 = this.f1490b;
                ((d2) this.f1491c).F.put((String) this.d, Integer.valueOf(i11));
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f1491c;
                int i12 = this.f1490b;
                ua0 ua0Var = (ua0) this.d;
                if (tLObject instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i13);
                        i13++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i12) {
                            ua0Var.accept(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                ua0Var.accept(null);
                return;
            case 2:
                int i14 = this.f1490b;
                jc jcVar = ((ac) this.f1491c).d;
                zb zbVar = jcVar.f1091n0;
                int i15 = jcVar.h;
                zbVar.A0 = (ArrayList) this.d;
                zbVar.f1304y0 = i15;
                zbVar.setAdapter(null);
                zbVar.setAdapter(zbVar.f1305z0);
                zbVar.setCurrentItem(i14);
                zbVar.C0 = true;
                return;
            case 3:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1491c, (String) this.d, this.f1490b);
                return;
            case 4:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1491c, (short[]) this.d, this.f1490b);
                return;
            case 5:
                ci.r6 r6Var = (ci.r6) this.f1491c;
                pg.l lVar = (pg.l) this.d;
                int i16 = this.f1490b;
                if (r6Var.O0.getCurrentBrush() instanceof pg.l) {
                    r6Var.f5407c1 = true;
                }
                r6Var.b(lVar);
                qg.u1 u1Var = r6Var.f5423k1;
                int i17 = u1Var.d + 1;
                u1Var.a(i17);
                AndroidUtilities.updateImageViewImageAnimated(u1Var.f41664a[i17], i16);
                u1Var.e = true;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n8(this.f1490b, ((MessagesStorage) this.f1491c).getUsers(new ArrayList<>((HashSet) this.d)), 5));
                return;
            case 7:
                ((ci.rc) this.f1491c).b((short[]) this.d, this.f1490b);
                return;
            case 8:
                int i18 = this.f1490b;
                e2.m mVar = (e2.m) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1491c).iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i18 != -1) {
                            oVar.f7909b.b(i18);
                        }
                        oVar.f7910c = true;
                        mVar.invoke(oVar.f7908a);
                    }
                }
                return;
            case 9:
                int[] iArr = (int[]) this.f1491c;
                int i19 = this.f1490b;
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
                ei.q4 q4Var = (ei.q4) this.f1491c;
                TLObject tLObject2 = (TLObject) this.d;
                int i20 = this.f1490b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    q4Var.f8569x = tL_webViewResultUrl.query_id;
                    q4Var.f8565n.u(i20, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(q4Var.U);
                    return;
                }
                return;
            case 11:
                gg.i0 i0Var = (gg.i0) this.f1491c;
                int i21 = this.f1490b;
                String str = (String) this.d;
                int i22 = i0Var.f9779s0;
                i0Var.f9776r = null;
                if (i21 == i0Var.f9761d0) {
                    if (i0Var.f9771n >= 0) {
                        ConnectionsManager.getInstance(i22).cancelRequest(i0Var.f9771n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.f9771n = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new gg.u(i0Var, i21, str, 0));
                    return;
                }
                return;
            case 12:
                hg.y yVar = (hg.y) this.f1491c;
                yVar.f10478b.add(this.f1490b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.f10477a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 13:
                Pair pair = (Pair) this.d;
                ((i2.c1) this.f1491c).f10630b.h.a(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.f1490b);
                return;
            case 14:
                int i23 = this.f1490b;
                ii.r5 m10 = ((ii.o5) this.f1491c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    ii.i1 i1Var = m10.f11603a;
                    i1Var.r();
                    i1Var.setSelection(Math.max(0, Math.min(i23, i1Var.length())));
                    return;
                }
                return;
            case 15:
                ii.a aVar = (ii.a) this.d;
                int i24 = this.f1490b;
                ii.d6 d6Var = ((ii.x5) this.f1491c).f11767a;
                if (d6Var.f11343y != null) {
                    ii.d6.f(aVar.f11201b, "");
                    ((ii.e3) d6Var.f11343y).c(aVar, i24);
                    return;
                }
                return;
            case 16:
                n2.j jVar = (n2.j) this.f1491c;
                this.d.a(jVar.f14905a, jVar.f14906b, this.f1490b);
                return;
            case 17:
                ((View) this.d).postOnAnimation(new n8((nh.a) this.f1491c, this.f1490b, 13));
                return;
            case 18:
                ((CameraView) this.f1491c).lambda$createCamera$13(this.f1490b, (SurfaceTexture) this.d);
                return;
            case 19:
                NativeInstance.a((NativeInstance) this.f1491c, this.f1490b, (String) this.d);
                return;
            case 20:
                ((VoIPService) this.f1491c).lambda$createGroupInstance$74((String) this.d, this.f1490b);
                return;
            case 21:
                int i25 = this.f1490b;
                Context context = (Context) this.f1491c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.d;
                String str2 = MessagesController.getInstance(i25).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                nf.f.s(context, str2);
                f3VarArr[0].dismiss();
                return;
            case 22:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f1491c;
                String str3 = (String) this.d;
                int i26 = this.f1490b;
                HashMap hashMap = new HashMap(h4Var.f34151u0[0].f35312c.f33474w);
                ArrayList arrayList2 = new ArrayList(h4Var.f34151u0[0].f35312c.f33475x);
                h4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new ei.l3(h4Var, arrayList2, hashMap, str3, i26, 13));
                return;
            case 23:
                org.telegram.ui.h4 h4Var2 = (org.telegram.ui.h4) this.f1491c;
                int i27 = this.f1490b;
                nf.e eVar = (nf.e) this.d;
                if (h4Var2.H0 == i27 && h4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(h4Var2.X).cancelRequest(h4Var2.F0, false);
                    h4Var2.F0 = 0;
                }
                if (h4Var2.M0 == eVar) {
                    h4Var2.M0 = null;
                    return;
                }
                return;
            case 24:
                int i28 = this.f1490b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f1491c;
                MessagesController.getInstance(i28).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i28).openGuardBotWebApp(-((TLRPC.Chat) this.d).f18112id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 25:
                org.telegram.ui.f4 f4Var = (org.telegram.ui.f4) this.f1491c;
                f4Var.J = this.f1490b;
                f4Var.I = (int[]) this.d;
                f4Var.L.f0();
                return;
            case 26:
                int i29 = this.f1490b;
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) this.f1491c;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.d);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i29, tL_inputGroupCallSlug, false, null, null);
                f3VarArr2[0].dismiss();
                return;
            case 27:
                ((bo) this.f1491c).Ka((ArrayList) this.d, this.f1490b, false, false);
                return;
            case 28:
                int i30 = this.f1490b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((bo) this.f1491c).f32524x0.v0(0, i30, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new jh(0, editTextBoldCursor), 100L);
                return;
            default:
                em emVar = (em) this.f1491c;
                int i31 = this.f1490b;
                emVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.d).getMessageObject();
                nm nmVar = emVar.f33371a;
                bo boVar = nmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == nmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                boVar.F(i31, id2, i10, 0, true, true);
                return;
        }
    }

    public s1(Object obj, int i10, Object obj2, int i11) {
        this.f1489a = i11;
        this.f1491c = obj;
        this.f1490b = i10;
        this.d = obj2;
    }

    public s1(Object obj, Object obj2, int i10, int i11) {
        this.f1489a = i11;
        this.f1491c = obj;
        this.d = obj2;
        this.f1490b = i10;
    }

    public s1(String str, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1489a = 26;
        this.d = str;
        this.f1490b = i10;
        this.f1491c = f3VarArr;
    }

    public s1(org.telegram.ui.f4 f4Var, int i10, int[] iArr, int[] iArr2) {
        this.f1489a = 25;
        this.f1491c = f4Var;
        this.f1490b = i10;
        this.d = iArr2;
    }
}
