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
import org.telegram.ui.dm;
import org.telegram.ui.kh;
import org.telegram.ui.mm;
import org.telegram.ui.zn;
public final class s1 implements Runnable {
    public final int f1688a;
    public final int f1689b;
    public final Object f1690c;
    public final Object d;

    public s1(int i10, Object obj, Object obj2, int i11) {
        this.f1688a = i11;
        this.f1689b = i10;
        this.f1690c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f1688a) {
            case 0:
                int i11 = this.f1689b;
                ((d2) this.f1690c).F.put((String) this.d, Integer.valueOf(i11));
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f1690c;
                int i12 = this.f1689b;
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
                int i14 = this.f1689b;
                kc kcVar = ((bc) this.f1690c).d;
                ac acVar = kcVar.f1283n0;
                int i15 = kcVar.h;
                acVar.A0 = (ArrayList) this.d;
                acVar.f1543y0 = i15;
                acVar.setAdapter(null);
                acVar.setAdapter(acVar.f1544z0);
                acVar.setCurrentItem(i14);
                acVar.C0 = true;
                return;
            case 3:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1690c, (String) this.d, this.f1689b);
                return;
            case 4:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1690c, (short[]) this.d, this.f1689b);
                return;
            case 5:
                ci.q6 q6Var = (ci.q6) this.f1690c;
                pg.l lVar = (pg.l) this.d;
                int i16 = this.f1689b;
                if (q6Var.O0.getCurrentBrush() instanceof pg.l) {
                    q6Var.f5793c1 = true;
                }
                q6Var.b(lVar);
                qg.r1 r1Var = q6Var.f5809k1;
                int i17 = r1Var.d + 1;
                r1Var.a(i17);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.f46530a[i17], i16);
                r1Var.f46533e = true;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new p8(this.f1689b, ((MessagesStorage) this.f1690c).getUsers(new ArrayList<>((HashSet) this.d)), 5));
                return;
            case 7:
                ((ci.oc) this.f1690c).b((short[]) this.d, this.f1689b);
                return;
            case 8:
                int i18 = this.f1689b;
                e2.m mVar = (e2.m) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1690c).iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i18 != -1) {
                            oVar.f8560b.b(i18);
                        }
                        oVar.f8561c = true;
                        mVar.invoke(oVar.f8559a);
                    }
                }
                return;
            case 9:
                int[] iArr = (int[]) this.f1690c;
                int i19 = this.f1689b;
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
                ei.p4 p4Var = (ei.p4) this.f1690c;
                TLObject tLObject2 = (TLObject) this.d;
                int i20 = this.f1689b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    p4Var.f9296x = tL_webViewResultUrl.query_id;
                    p4Var.f9292n.t(i20, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(p4Var.U);
                    return;
                }
                return;
            case 11:
                gg.h0 h0Var = (gg.h0) this.f1690c;
                int i21 = this.f1689b;
                String str = (String) this.d;
                int i22 = h0Var.f10638s0;
                h0Var.f10635r = null;
                if (i21 == h0Var.f10619d0) {
                    if (h0Var.f10630n >= 0) {
                        ConnectionsManager.getInstance(i22).cancelRequest(h0Var.f10630n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f10630n = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new gg.u(h0Var, i21, str, 0));
                    return;
                }
                return;
            case 12:
                hg.z zVar = (hg.z) this.f1690c;
                zVar.f11462b.add(this.f1689b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(zVar.f11461a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 13:
                Pair pair = (Pair) this.d;
                ((i2.d1) this.f1690c).f11631b.h.a(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.f1689b);
                return;
            case 14:
                int i23 = this.f1689b;
                ii.t5 m10 = ((ii.q5) this.f1690c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    ii.i1 i1Var = m10.f12708a;
                    i1Var.r();
                    i1Var.setSelection(Math.max(0, Math.min(i23, i1Var.length())));
                    return;
                }
                return;
            case 15:
                ii.a aVar = (ii.a) this.d;
                int i24 = this.f1689b;
                ii.f6 f6Var = ((ii.z5) this.f1690c).f12882a;
                if (f6Var.f12425y != null) {
                    ii.f6.f(aVar.f12234b, "");
                    ((ii.f3) f6Var.f12425y).c(aVar, i24);
                    return;
                }
                return;
            case 16:
                n2.j jVar = (n2.j) this.f1690c;
                this.d.a(jVar.f16518a, jVar.f16519b, this.f1689b);
                return;
            case 17:
                ((View) this.d).postOnAnimation(new p8((nh.a) this.f1690c, this.f1689b, 12));
                return;
            case 18:
                ((CameraView) this.f1690c).lambda$createCamera$13(this.f1689b, (SurfaceTexture) this.d);
                return;
            case 19:
                NativeInstance.a((NativeInstance) this.f1690c, this.f1689b, (String) this.d);
                return;
            case 20:
                ((VoIPService) this.f1690c).lambda$createGroupInstance$74((String) this.d, this.f1689b);
                return;
            case 21:
                int i25 = this.f1689b;
                Context context = (Context) this.f1690c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.d;
                String str2 = MessagesController.getInstance(i25).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                of.f.s(context, str2);
                f3VarArr[0].dismiss();
                return;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f1690c;
                String str3 = (String) this.d;
                int i26 = this.f1689b;
                HashMap hashMap = new HashMap(i4Var.f38515u0[0].f39753c.f37772w);
                ArrayList arrayList2 = new ArrayList(i4Var.f38515u0[0].f39753c.f37773x);
                i4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new ei.l3(i4Var, arrayList2, hashMap, str3, i26, 14));
                return;
            case 23:
                org.telegram.ui.i4 i4Var2 = (org.telegram.ui.i4) this.f1690c;
                int i27 = this.f1689b;
                of.e eVar = (of.e) this.d;
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
                int i28 = this.f1689b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f1690c;
                MessagesController.getInstance(i28).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i28).openGuardBotWebApp(-((TLRPC.Chat) this.d).f20038id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 25:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f1690c;
                g4Var.J = this.f1689b;
                g4Var.I = (int[]) this.d;
                g4Var.L.f0();
                return;
            case 26:
                int i29 = this.f1689b;
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) this.f1690c;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.d);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i29, tL_inputGroupCallSlug, false, null, null);
                f3VarArr2[0].dismiss();
                return;
            case 27:
                ((zn) this.f1690c).Oa((ArrayList) this.d, this.f1689b, false, false);
                return;
            case 28:
                int i30 = this.f1689b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((zn) this.f1690c).f44990x0.v0(0, i30, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new kh(0, editTextBoldCursor), 100L);
                return;
            default:
                dm dmVar = (dm) this.f1690c;
                int i31 = this.f1689b;
                dmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.d).getMessageObject();
                mm mmVar = dmVar.f37050a;
                zn znVar = mmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == mmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                znVar.F(i31, id2, i10, 0, true, true);
                return;
        }
    }

    public s1(Object obj, int i10, Object obj2, int i11) {
        this.f1688a = i11;
        this.f1690c = obj;
        this.f1689b = i10;
        this.d = obj2;
    }

    public s1(Object obj, Object obj2, int i10, int i11) {
        this.f1688a = i11;
        this.f1690c = obj;
        this.d = obj2;
        this.f1689b = i10;
    }

    public s1(String str, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1688a = 26;
        this.d = str;
        this.f1689b = i10;
        this.f1690c = f3VarArr;
    }

    public s1(org.telegram.ui.g4 g4Var, int i10, int[] iArr, int[] iArr2) {
        this.f1688a = 25;
        this.f1690c = g4Var;
        this.f1689b = i10;
        this.d = iArr2;
    }
}
