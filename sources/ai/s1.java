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
import org.telegram.ui.cm;
import org.telegram.ui.lm;
import org.telegram.ui.ph;
import org.telegram.ui.wa0;
import org.telegram.ui.zn;
public final class s1 implements Runnable {
    public final int f1491a;
    public final int f1492b;
    public final Object f1493c;
    public final Object d;

    public s1(int i10, Object obj, Object obj2, int i11) {
        this.f1491a = i11;
        this.f1492b = i10;
        this.f1493c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f1491a) {
            case 0:
                int i11 = this.f1492b;
                ((d2) this.f1493c).F.put((String) this.d, Integer.valueOf(i11));
                return;
            case 1:
                TLObject tLObject = (TLObject) this.f1493c;
                int i12 = this.f1492b;
                wa0 wa0Var = (wa0) this.d;
                if (tLObject instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject).albums;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i13);
                        i13++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i12) {
                            wa0Var.accept(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                wa0Var.accept(null);
                return;
            case 2:
                int i14 = this.f1492b;
                jc jcVar = ((ac) this.f1493c).d;
                zb zbVar = jcVar.f1093n0;
                int i15 = jcVar.h;
                zbVar.A0 = (ArrayList) this.d;
                zbVar.f1306y0 = i15;
                zbVar.setAdapter(null);
                zbVar.setAdapter(zbVar.f1307z0);
                zbVar.setCurrentItem(i14);
                zbVar.C0 = true;
                return;
            case 3:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f1493c, (String) this.d, this.f1492b);
                return;
            case 4:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f1493c, (short[]) this.d, this.f1492b);
                return;
            case 5:
                ci.r6 r6Var = (ci.r6) this.f1493c;
                pg.l lVar = (pg.l) this.d;
                int i16 = this.f1492b;
                if (r6Var.O0.getCurrentBrush() instanceof pg.l) {
                    r6Var.f5411c1 = true;
                }
                r6Var.b(lVar);
                qg.s1 s1Var = r6Var.f5427k1;
                int i17 = s1Var.d + 1;
                s1Var.a(i17);
                AndroidUtilities.updateImageViewImageAnimated(s1Var.f41953a[i17], i16);
                s1Var.e = true;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n8(this.f1492b, ((MessagesStorage) this.f1493c).getUsers(new ArrayList<>((HashSet) this.d)), 5));
                return;
            case 7:
                ((ci.rc) this.f1493c).b((short[]) this.d, this.f1492b);
                return;
            case 8:
                int i18 = this.f1492b;
                e2.m mVar = (e2.m) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f1493c).iterator();
                while (it.hasNext()) {
                    e2.o oVar = (e2.o) it.next();
                    if (!oVar.d) {
                        if (i18 != -1) {
                            oVar.f7913b.b(i18);
                        }
                        oVar.f7914c = true;
                        mVar.invoke(oVar.f7912a);
                    }
                }
                return;
            case 9:
                int[] iArr = (int[]) this.f1493c;
                int i19 = this.f1492b;
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
                ei.q4 q4Var = (ei.q4) this.f1493c;
                TLObject tLObject2 = (TLObject) this.d;
                int i20 = this.f1492b;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    q4Var.f8573x = tL_webViewResultUrl.query_id;
                    q4Var.f8569n.u(i20, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(q4Var.U);
                    return;
                }
                return;
            case 11:
                gg.i0 i0Var = (gg.i0) this.f1493c;
                int i21 = this.f1492b;
                String str = (String) this.d;
                int i22 = i0Var.f9784s0;
                i0Var.f9781r = null;
                if (i21 == i0Var.f9766d0) {
                    if (i0Var.f9776n >= 0) {
                        ConnectionsManager.getInstance(i22).cancelRequest(i0Var.f9776n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.f9776n = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new gg.u(i0Var, i21, str, 0));
                    return;
                }
                return;
            case 12:
                hg.y yVar = (hg.y) this.f1493c;
                yVar.f10484b.add(this.f1492b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.f10483a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 13:
                Pair pair = (Pair) this.d;
                ((i2.c1) this.f1493c).f10634b.h.a(((Integer) pair.first).intValue(), (u2.f0) pair.second, this.f1492b);
                return;
            case 14:
                int i23 = this.f1492b;
                ii.r5 m10 = ((ii.o5) this.f1493c).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m10 != null) {
                    ii.i1 i1Var = m10.f11607a;
                    i1Var.r();
                    i1Var.setSelection(Math.max(0, Math.min(i23, i1Var.length())));
                    return;
                }
                return;
            case 15:
                ii.a aVar = (ii.a) this.d;
                int i24 = this.f1492b;
                ii.d6 d6Var = ((ii.x5) this.f1493c).f11771a;
                if (d6Var.f11347y != null) {
                    ii.d6.f(aVar.f11205b, "");
                    ((ii.e3) d6Var.f11347y).c(aVar, i24);
                    return;
                }
                return;
            case 16:
                n2.j jVar = (n2.j) this.f1493c;
                this.d.a(jVar.f15142a, jVar.f15143b, this.f1492b);
                return;
            case 17:
                ((View) this.d).postOnAnimation(new n8((nh.a) this.f1493c, this.f1492b, 13));
                return;
            case 18:
                ((CameraView) this.f1493c).lambda$createCamera$13(this.f1492b, (SurfaceTexture) this.d);
                return;
            case 19:
                NativeInstance.a((NativeInstance) this.f1493c, this.f1492b, (String) this.d);
                return;
            case 20:
                ((VoIPService) this.f1493c).lambda$createGroupInstance$74((String) this.d, this.f1492b);
                return;
            case 21:
                int i25 = this.f1492b;
                Context context = (Context) this.f1493c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.d;
                String str2 = MessagesController.getInstance(i25).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                nf.f.s(context, str2);
                f3VarArr[0].dismiss();
                return;
            case 22:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f1493c;
                String str3 = (String) this.d;
                int i26 = this.f1492b;
                HashMap hashMap = new HashMap(h4Var.f34130u0[0].f35306c.f33507w);
                ArrayList arrayList2 = new ArrayList(h4Var.f34130u0[0].f35306c.f33508x);
                h4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new ei.l3(h4Var, arrayList2, hashMap, str3, i26, 14));
                return;
            case 23:
                org.telegram.ui.h4 h4Var2 = (org.telegram.ui.h4) this.f1493c;
                int i27 = this.f1492b;
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
                int i28 = this.f1492b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f1493c;
                MessagesController.getInstance(i28).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i28).openGuardBotWebApp(-((TLRPC.Chat) this.d).f18343id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 25:
                org.telegram.ui.f4 f4Var = (org.telegram.ui.f4) this.f1493c;
                f4Var.J = this.f1492b;
                f4Var.I = (int[]) this.d;
                f4Var.L.f0();
                return;
            case 26:
                int i29 = this.f1492b;
                org.telegram.ui.ActionBar.f3[] f3VarArr2 = (org.telegram.ui.ActionBar.f3[]) this.f1493c;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.d);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i29, tL_inputGroupCallSlug, false, null, null);
                f3VarArr2[0].dismiss();
                return;
            case 27:
                ((zn) this.f1493c).Ka((ArrayList) this.d, this.f1492b, false, false);
                return;
            case 28:
                int i30 = this.f1492b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((zn) this.f1493c).f40551x0.w0(0, i30, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ph(0, editTextBoldCursor), 100L);
                return;
            default:
                cm cmVar = (cm) this.f1493c;
                int i31 = this.f1492b;
                cmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.d).getMessageObject();
                lm lmVar = cmVar.f32809a;
                zn znVar = lmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == lmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                znVar.E(i31, id2, i10, 0, true, true);
                return;
        }
    }

    public s1(Object obj, int i10, Object obj2, int i11) {
        this.f1491a = i11;
        this.f1493c = obj;
        this.f1492b = i10;
        this.d = obj2;
    }

    public s1(Object obj, Object obj2, int i10, int i11) {
        this.f1491a = i11;
        this.f1493c = obj;
        this.d = obj2;
        this.f1492b = i10;
    }

    public s1(String str, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1491a = 26;
        this.d = str;
        this.f1492b = i10;
        this.f1493c = f3VarArr;
    }

    public s1(org.telegram.ui.f4 f4Var, int i10, int[] iArr, int[] iArr2) {
        this.f1491a = 25;
        this.f1493c = f4Var;
        this.f1492b = i10;
        this.d = iArr2;
    }
}
