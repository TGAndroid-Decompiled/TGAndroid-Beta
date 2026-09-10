package bi;

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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.eo;
import org.telegram.ui.gm;
import org.telegram.ui.kh;
import org.telegram.ui.pm;
public final class g3 implements Runnable {
    public final int f2739a;
    public final Object f2740b;
    public final int f2741c;
    public final Object d;

    public g3(int i10, Object obj, Object obj2, int i11) {
        this.f2739a = i11;
        this.f2741c = i10;
        this.f2740b = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i10;
        UndoView undoView;
        switch (this.f2739a) {
            case 0:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f2740b, (String) this.d, this.f2741c);
                return;
            case 1:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f2740b, (short[]) this.d, this.f2741c);
                return;
            case 2:
                r7 r7Var = (r7) this.f2740b;
                og.l lVar = (og.l) this.d;
                int i11 = this.f2741c;
                if (r7Var.O0.getCurrentBrush() instanceof og.l) {
                    r7Var.f3503c1 = true;
                }
                r7Var.B(lVar);
                pg.r1 r1Var = r7Var.f3519k1;
                int i12 = r1Var.d + 1;
                r1Var.a(i12);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.f40272a[i12], i11);
                r1Var.e = true;
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new s(this.f2741c, ((MessagesStorage) this.f2740b).getUsers(new ArrayList<>((HashSet) this.d)), 3));
                return;
            case 4:
                ((fe) this.f2740b).b((short[]) this.d, this.f2741c);
                return;
            case 5:
                int[] iArr = (int[]) this.f2740b;
                int i13 = this.f2741c;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i13).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i13).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    return;
                }
                return;
            case 6:
                di.u4 u4Var = (di.u4) this.f2740b;
                TLObject tLObject = (TLObject) this.d;
                int i14 = this.f2741c;
                if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                    u4Var.f6951x = tL_webViewResultUrl.query_id;
                    u4Var.f6947n.u(i14, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(u4Var.U);
                    return;
                }
                return;
            case 7:
                int i15 = this.f2741c;
                e2.m mVar = (e2.m) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f2740b).iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i15 != -1) {
                            oVar.f7214b.b(i15);
                        }
                        oVar.f7215c = true;
                        mVar.invoke(oVar.f7213a);
                    }
                }
                return;
            case 8:
                fg.h0 h0Var = (fg.h0) this.f2740b;
                int i16 = this.f2741c;
                String str = (String) this.d;
                int i17 = h0Var.f8050s0;
                h0Var.f8047r = null;
                if (i16 == h0Var.f8032d0) {
                    if (h0Var.f8042n >= 0) {
                        ConnectionsManager.getInstance(i17).cancelRequest(h0Var.f8042n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.f8042n = ConnectionsManager.getInstance(i17).sendRequest(tL_channels_searchPosts, new fg.t(h0Var, i16, str, 0));
                    return;
                }
                return;
            case 9:
                gg.b0 b0Var = (gg.b0) this.f2740b;
                b0Var.f8817b.add(this.f2741c, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(b0Var.f8816a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 10:
                int i18 = this.f2741c;
                hi.u5 m10 = ((hi.r5) this.f2740b).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    hi.k1 k1Var = m10.f9892a;
                    k1Var.r();
                    k1Var.setSelection(Math.max(0, Math.min(i18, k1Var.length())));
                    return;
                }
                return;
            case 11:
                hi.a aVar = (hi.a) this.d;
                int i19 = this.f2741c;
                hi.g6 g6Var = ((hi.a6) this.f2740b).f9461a;
                if (g6Var.f9627y != null) {
                    hi.g6.f(aVar.f9421b, "");
                    ((hi.h3) g6Var.f9627y).c(aVar, i19);
                    return;
                }
                return;
            case 12:
                Pair pair = (Pair) this.d;
                ((i2.b1) this.f2740b).f10110b.h.a(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.f2741c);
                return;
            case 13:
                ((View) this.d).postOnAnimation(new s((mh.a) this.f2740b, this.f2741c, 11));
                return;
            case 14:
                n2.j jVar = (n2.j) this.f2740b;
                this.d.a(jVar.f13734a, jVar.f13735b, this.f2741c);
                return;
            case 15:
                og.v0 v0Var = (og.v0) this.f2740b;
                v0Var.e((og.k1) this.d, this.f2741c, v0Var.h);
                v0Var.h = null;
                return;
            case 16:
                ((CameraView) this.f2740b).lambda$createCamera$13(this.f2741c, (SurfaceTexture) this.d);
                return;
            case 17:
                NativeInstance.a((NativeInstance) this.f2740b, this.f2741c, (String) this.d);
                return;
            case 18:
                ((VoIPService) this.f2740b).lambda$createGroupInstance$74((String) this.d, this.f2741c);
                return;
            case 19:
                int i20 = this.f2741c;
                Context context = (Context) this.f2740b;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.d;
                String str2 = MessagesController.getInstance(i20).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                nf.f.s(context, str2);
                h3VarArr[0].dismiss();
                return;
            case 20:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f2740b;
                String str3 = (String) this.d;
                int i21 = this.f2741c;
                HashMap hashMap = new HashMap(j4Var.f33920u0[0].f35103c.f33265w);
                ArrayList arrayList = new ArrayList(j4Var.f33920u0[0].f35103c.f33266x);
                j4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new di.o3(j4Var, arrayList, hashMap, str3, i21, 13));
                return;
            case 21:
                org.telegram.ui.j4 j4Var2 = (org.telegram.ui.j4) this.f2740b;
                int i22 = this.f2741c;
                nf.e eVar = (nf.e) this.d;
                if (j4Var2.H0 == i22 && j4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(j4Var2.X).cancelRequest(j4Var2.F0, false);
                    j4Var2.F0 = 0;
                }
                if (j4Var2.M0 == eVar) {
                    j4Var2.M0 = null;
                    return;
                }
                return;
            case 22:
                int i23 = this.f2741c;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f2740b;
                MessagesController.getInstance(i23).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i23).openGuardBotWebApp(-((TLRPC.Chat) this.d).f17195id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 23:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f2740b;
                h4Var.J = this.f2741c;
                h4Var.I = (int[]) this.d;
                h4Var.L.f0();
                return;
            case 24:
                int i24 = this.f2741c;
                org.telegram.ui.ActionBar.h3[] h3VarArr2 = (org.telegram.ui.ActionBar.h3[]) this.f2740b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.d);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, i24, tL_inputGroupCallSlug, false, null, null);
                h3VarArr2[0].dismiss();
                return;
            case 25:
                ((eo) this.f2740b).Ka((ArrayList) this.d, this.f2741c, false, false);
                return;
            case 26:
                int i25 = this.f2741c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((eo) this.f2740b).f32542x0.v0(0, i25, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new kh(0, editTextBoldCursor), 100L);
                return;
            case 27:
                gm gmVar = (gm) this.f2740b;
                int i26 = this.f2741c;
                gmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.d).getMessageObject();
                pm pmVar = gmVar.f33136a;
                eo eoVar = pmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == pmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                eoVar.E(i26, id2, i10, 0, true, true);
                return;
            case 28:
                zn znVar = (zn) this.f2740b;
                int i27 = this.f2741c;
                View view = (View) this.d;
                znVar.V = 0;
                znVar.U = i27;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    znVar.U((org.telegram.ui.Cells.s8) view, true);
                    return;
                } else {
                    znVar.f29760r.m(znVar.I0);
                    return;
                }
            default:
                a0.i iVar = (a0.i) this.d;
                int i28 = this.f2741c;
                org.telegram.ui.ActionBar.p2 p2Var = ((jv) this.f2740b).f24500b1.f28842c;
                if (p2Var instanceof eo) {
                    eo eoVar2 = (eo) p2Var;
                    eoVar2.Q7();
                    undoView = eoVar2.y3;
                } else if (p2Var instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) p2Var).M;
                } else {
                    undoView = null;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (iVar.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) iVar.n(0)).f17199id, Integer.valueOf(i28), 53);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i28), Integer.valueOf(iVar.m()), null, null);
                        return;
                    }
                }
                return;
        }
    }

    public g3(Object obj, int i10, Object obj2, int i11) {
        this.f2739a = i11;
        this.f2740b = obj;
        this.f2741c = i10;
        this.d = obj2;
    }

    public g3(Object obj, Object obj2, int i10, int i11) {
        this.f2739a = i11;
        this.f2740b = obj;
        this.d = obj2;
        this.f2741c = i10;
    }

    public g3(String str, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f2739a = 24;
        this.d = str;
        this.f2741c = i10;
        this.f2740b = h3VarArr;
    }

    public g3(org.telegram.ui.h4 h4Var, int i10, int[] iArr, int[] iArr2) {
        this.f2739a = 23;
        this.f2740b = h4Var;
        this.f2741c = i10;
        this.d = iArr2;
    }
}
