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
import org.telegram.ui.bm;
import org.telegram.ui.km;
import org.telegram.ui.oh;
import org.telegram.ui.xn;
public final class s1 implements Runnable {
    public final int f1485a;
    public final int f1486b;
    public final Object f1487c;
    public final Object d;

    public s1(int i10, Object obj, Object obj2, int i11) {
        this.f1485a = i11;
        this.f1486b = i10;
        this.f1487c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f1485a) {
            case 0:
                int i11 = this.f1486b;
                ((d2) this.f1487c).F.put((String) this.d, Integer.valueOf(i11));
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f1487c;
                int i12 = this.f1486b;
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
                int i14 = this.f1486b;
                jc jcVar = ((ac) this.f1487c).d;
                zb zbVar = jcVar.f1089n0;
                int i15 = jcVar.h;
                zbVar.A0 = (ArrayList) this.d;
                zbVar.f1312y0 = i15;
                zbVar.setAdapter(null);
                zbVar.setAdapter(zbVar.f1313z0);
                zbVar.setCurrentItem(i14);
                zbVar.C0 = true;
                return;
            case 3:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1487c, (String) this.d, this.f1486b);
                return;
            case 4:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1487c, (short[]) this.d, this.f1486b);
                return;
            case 5:
                ci.q6 q6Var = (ci.q6) this.f1487c;
                pg.l lVar = (pg.l) this.d;
                int i16 = this.f1486b;
                if (q6Var.O0.getCurrentBrush() instanceof pg.l) {
                    q6Var.f5338c1 = true;
                }
                q6Var.b(lVar);
                qg.r1 r1Var = q6Var.f5354k1;
                int i17 = r1Var.d + 1;
                r1Var.a(i17);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.f41944a[i17], i16);
                r1Var.e = true;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new o8(this.f1486b, ((MessagesStorage) this.f1487c).getUsers(new ArrayList<>((HashSet) this.d)), 5));
                return;
            case 7:
                ((ci.nc) this.f1487c).b((short[]) this.d, this.f1486b);
                return;
            case 8:
                int i18 = this.f1486b;
                e2.m mVar = (e2.m) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1487c).iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i18 != -1) {
                            oVar.f7898b.b(i18);
                        }
                        oVar.f7899c = true;
                        mVar.invoke(oVar.f7897a);
                    }
                }
                return;
            case 9:
                int[] iArr = (int[]) this.f1487c;
                int i19 = this.f1486b;
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
                ei.q4 q4Var = (ei.q4) this.f1487c;
                TLObject tLObject2 = (TLObject) this.d;
                int i20 = this.f1486b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    q4Var.f8559x = tL_webViewResultUrl.query_id;
                    q4Var.f8555n.u(i20, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(q4Var.U);
                    return;
                }
                return;
            case 11:
                gg.i0 i0Var = (gg.i0) this.f1487c;
                int i21 = this.f1486b;
                String str = (String) this.d;
                int i22 = i0Var.f9771s0;
                i0Var.f9768r = null;
                if (i21 == i0Var.f9753d0) {
                    if (i0Var.f9763n >= 0) {
                        ConnectionsManager.getInstance(i22).cancelRequest(i0Var.f9763n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.f9763n = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new gg.u(i0Var, i21, str, 0));
                    return;
                }
                return;
            case 12:
                hg.y yVar = (hg.y) this.f1487c;
                yVar.f10471b.add(this.f1486b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.f10470a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 13:
                Pair pair = (Pair) this.d;
                ((i2.d1) this.f1487c).f10629b.h.a(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.f1486b);
                return;
            case 14:
                int i23 = this.f1486b;
                ii.s5 m10 = ((ii.p5) this.f1487c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    ii.i1 i1Var = m10.f11619a;
                    i1Var.r();
                    i1Var.setSelection(Math.max(0, Math.min(i23, i1Var.length())));
                    return;
                }
                return;
            case 15:
                ii.a aVar = (ii.a) this.d;
                int i24 = this.f1486b;
                ii.e6 e6Var = ((ii.y5) this.f1487c).f11782a;
                if (e6Var.f11358y != null) {
                    ii.e6.f(aVar.f11194b, "");
                    ((ii.f3) e6Var.f11358y).c(aVar, i24);
                    return;
                }
                return;
            case 16:
                n2.j jVar = (n2.j) this.f1487c;
                this.d.a(jVar.f15168a, jVar.f15169b, this.f1486b);
                return;
            case 17:
                ((View) this.d).postOnAnimation(new o8((nh.a) this.f1487c, this.f1486b, 13));
                return;
            case 18:
                ((CameraView) this.f1487c).lambda$createCamera$13(this.f1486b, (SurfaceTexture) this.d);
                return;
            case 19:
                NativeInstance.a((NativeInstance) this.f1487c, this.f1486b, (String) this.d);
                return;
            case 20:
                ((VoIPService) this.f1487c).lambda$createGroupInstance$74((String) this.d, this.f1486b);
                return;
            case 21:
                int i25 = this.f1486b;
                Context context = (Context) this.f1487c;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.d;
                String str2 = MessagesController.getInstance(i25).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                nf.f.s(context, str2);
                g3VarArr[0].dismiss();
                return;
            case 22:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f1487c;
                String str3 = (String) this.d;
                int i26 = this.f1486b;
                HashMap hashMap = new HashMap(j4Var.f34627u0[0].f35796c.f34128w);
                ArrayList arrayList2 = new ArrayList(j4Var.f34627u0[0].f35796c.f34129x);
                j4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new ei.l3(j4Var, arrayList2, hashMap, str3, i26, 14));
                return;
            case 23:
                org.telegram.ui.j4 j4Var2 = (org.telegram.ui.j4) this.f1487c;
                int i27 = this.f1486b;
                nf.e eVar = (nf.e) this.d;
                if (j4Var2.H0 == i27 && j4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(j4Var2.X).cancelRequest(j4Var2.F0, false);
                    j4Var2.F0 = 0;
                }
                if (j4Var2.M0 == eVar) {
                    j4Var2.M0 = null;
                    return;
                }
                return;
            case 24:
                int i28 = this.f1486b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f1487c;
                MessagesController.getInstance(i28).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i28).openGuardBotWebApp(-((TLRPC.Chat) this.d).f18329id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 25:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f1487c;
                h4Var.J = this.f1486b;
                h4Var.I = (int[]) this.d;
                h4Var.L.f0();
                return;
            case 26:
                int i29 = this.f1486b;
                org.telegram.ui.ActionBar.g3[] g3VarArr2 = (org.telegram.ui.ActionBar.g3[]) this.f1487c;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.d);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i29, tL_inputGroupCallSlug, false, null, null);
                g3VarArr2[0].dismiss();
                return;
            case 27:
                ((xn) this.f1487c).Ka((ArrayList) this.d, this.f1486b, false, false);
                return;
            case 28:
                int i30 = this.f1486b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((xn) this.f1487c).f39977x0.w0(0, i30, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new oh(0, editTextBoldCursor), 100L);
                return;
            default:
                bm bmVar = (bm) this.f1487c;
                int i31 = this.f1486b;
                bmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.d).getMessageObject();
                km kmVar = bmVar.f32390a;
                xn xnVar = kmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == kmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                xnVar.F(i31, id2, i10, 0, true, true);
                return;
        }
    }

    public s1(Object obj, int i10, Object obj2, int i11) {
        this.f1485a = i11;
        this.f1487c = obj;
        this.f1486b = i10;
        this.d = obj2;
    }

    public s1(Object obj, Object obj2, int i10, int i11) {
        this.f1485a = i11;
        this.f1487c = obj;
        this.d = obj2;
        this.f1486b = i10;
    }

    public s1(String str, int i10, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f1485a = 26;
        this.d = str;
        this.f1486b = i10;
        this.f1487c = g3VarArr;
    }

    public s1(org.telegram.ui.h4 h4Var, int i10, int[] iArr, int[] iArr2) {
        this.f1485a = 25;
        this.f1487c = h4Var;
        this.f1486b = i10;
        this.d = iArr2;
    }
}
