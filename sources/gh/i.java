package gh;

import java.util.ArrayList;
import java.util.List;
import jh.i9;
import jh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.vx;
import org.telegram.ui.rn;

public final class i implements Utilities.Callback {

    public final int f7298a;

    public final Object f7299b;

    public final Object f7300c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f7298a = i10;
        this.d = obj;
        this.f7299b = obj2;
        this.f7300c = obj3;
    }

    @Override
    public final void run(Object obj) {
        jh.b6 b6Var;
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.f7298a;
        int i11 = 0;
        Object obj2 = this.f7300c;
        Object obj3 = this.f7299b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                v vVar = (v) obj4;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new d(vVar.getContext(), (org.telegram.ui.ActionBar.c6) obj2, vVar.f7572h0, (List) obj).show();
                break;
            case 1:
                i0 i0Var = (i0) obj4;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                List list = (List) obj;
                i0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (i0Var.f7310i0 != null) {
                    new d(i0Var.getContext(), c6Var, i0Var.f7310i0, list).show();
                    i0Var.dismiss();
                }
                break;
            case 2:
                hh.i5 i5Var = (hh.i5) obj4;
                we.d dVar = (we.d) obj;
                dVar.d();
                i5Var.v1(((Long) obj3).longValue(), new i(i5Var, dVar, (cg.y2[]) obj2, 3));
                break;
            case 3:
                hh.i5 i5Var2 = (hh.i5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((we.d) obj3).b();
                ((cg.y2[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    i5Var2.dismiss();
                } else {
                    AndroidUtilities.runOnUIThread(new d5.u(22, i5Var2, tL_error));
                }
                break;
            case 4:
                jh.n3 n3Var = (jh.n3) obj4;
                n3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                cv cvVar = new cv(((i9) obj3).f13478f, n3Var.getContext(), (org.telegram.ui.ActionBar.c6) obj2, arrayList2);
                jh.y3 y3Var = n3Var.f13696v0.M1;
                if (y3Var != null) {
                    ((z8) y3Var).h(cvVar);
                }
                break;
            case 5:
                jh.x3 x3Var = (jh.x3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                jh.e4 e4Var = x3Var.f14128l;
                if ((storyItem instanceof jh.a6) && (b6Var = ((jh.a6) storyItem).f13045a) != null) {
                    j3.m mVar = new j3.m(b6Var, storyItem2, callback, 4);
                    if (b6Var.F != 0) {
                        ConnectionsManager.getInstance(b6Var.f13536c).cancelRequest(b6Var.F, true);
                        b6Var.F = 0;
                    }
                    b6Var.C = false;
                    b6Var.D = false;
                    b6Var.H(mVar);
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(e4Var.f13296y2).getInputPeer(storyItem.dialogId);
                    tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(storyItem.f22617id));
                    ConnectionsManager.getInstance(e4Var.f13296y2).sendRequest(tL_stories_getStoriesByID, new cg.y(x3Var, storyItem, callback));
                }
                break;
            case 6:
                jh.k6 k6Var = (jh.k6) obj;
                jh.e4 e4Var2 = ((jh.x3) obj4).f14128l;
                e4Var2.O1.c(k6Var.f13588a, e4Var2.f13291x1, (TL_stories.StoryItem) obj3);
                new mc(e4Var2.Y0, (org.telegram.ui.ActionBar.c6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, k6Var.f13589b))).j();
                break;
            case 7:
                b8.K((b8) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                break;
            case 8:
                in inVar = (in) obj4;
                rn rnVar = (rn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (!rnVar.c()) {
                    inVar.f29420f0.e(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                    inVar.f34900b.dismiss(true);
                } else {
                    org.telegram.ui.Components.y4.L(rnVar.getParentActivity(), rnVar.a(), new ag.l0(inVar, tL_messageMediaToDo, l10, 25));
                }
                break;
            case 9:
                vx vxVar = (vx) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj5 = arrayList4.get(i11);
                    i11++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(vxVar.f34062a.B.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new px(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 10:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                ix0 ix0Var = (ix0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    ix0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(ix0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(ix0Var);
                } else {
                    b2Var.dismiss();
                }
                break;
            case 11:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                String str = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(z0Var.Q);
                    tL_messages_sendBotRequestedPeer.webapp_req_id = str;
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user));
                    ConnectionsManager.getInstance(z0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new d0(z0Var, str, user, 8));
                    z0Var.v("requested_chat_sent", org.telegram.ui.web.z0.x(str, "req_id"));
                } else {
                    z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                }
                break;
            default:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    z0Var2.v("file_download_requested", org.telegram.ui.web.z0.x("cancelled", "status"));
                } else {
                    z0Var2.f44069h0.b(str2, str3);
                    z0Var2.v("file_download_requested", org.telegram.ui.web.z0.x("downloading", "status"));
                }
                break;
        }
    }
}
