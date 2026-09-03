package lh;

import java.util.ArrayList;
import java.util.List;
import mh.p6;
import oh.i9;
import oh.m6;
import oh.z8;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rn;
import org.telegram.ui.xn;
public final class h implements Utilities.Callback {
    public final int f12785a;
    public final Object f12786b;
    public final Object f12787c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f12785a = i10;
        this.d = obj;
        this.f12786b = obj2;
        this.f12787c = obj3;
    }

    @Override
    public final void run(Object obj) {
        oh.d6 d6Var;
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.f12785a;
        int i11 = 0;
        Object obj2 = this.f12787c;
        Object obj3 = this.f12786b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                s sVar = (s) obj4;
                sVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new d(sVar.getContext(), (g6) obj2, sVar.f12947i0, (List) obj).show();
                return;
            case 1:
                f0 f0Var = (f0) obj4;
                g6 g6Var = (g6) obj2;
                List list = (List) obj;
                f0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (f0Var.f12729j0 != null) {
                    new d(f0Var.getContext(), g6Var, f0Var.f12729j0, list).show();
                    f0Var.dismiss();
                    return;
                }
                return;
            case 2:
                mh.g5 g5Var = (mh.g5) obj4;
                af.f fVar = (af.f) obj;
                fVar.d();
                g5Var.v1(((Long) obj3).longValue(), new h(g5Var, fVar, (hg.v2[]) obj2, 3));
                return;
            case 3:
                mh.g5 g5Var2 = (mh.g5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((af.f) obj3).b();
                ((hg.v2[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new mh.m2(1, g5Var2, tL_error));
                    return;
                } else {
                    g5Var2.dismiss();
                    return;
                }
            case 4:
                oh.n3 n3Var = (oh.n3) obj4;
                n3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                ov ovVar = new ov(((i9) obj3).f17268f, n3Var.getContext(), (g6) obj2, arrayList2);
                oh.z3 z3Var = n3Var.f17483w0.N1;
                if (z3Var != null) {
                    ((z8) z3Var).h(ovVar);
                    return;
                }
                return;
            case 5:
                oh.y3 y3Var = (oh.y3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                oh.f4 f4Var = y3Var.f17952l;
                if ((storyItem instanceof oh.c6) && (d6Var = ((oh.c6) storyItem).f16942a) != null) {
                    p6 p6Var = new p6(d6Var, storyItem2, callback, 6);
                    if (d6Var.F != 0) {
                        ConnectionsManager.getInstance(d6Var.f17400c).cancelRequest(d6Var.F, true);
                        d6Var.F = 0;
                    }
                    d6Var.C = false;
                    d6Var.D = false;
                    d6Var.H(p6Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(f4Var.f17135z2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f21089id.add(Integer.valueOf(storyItem.f21082id));
                ConnectionsManager.getInstance(f4Var.f17135z2).sendRequest(tL_stories_getStoriesByID, new hg.y(y3Var, storyItem, callback));
                return;
            case 6:
                m6 m6Var = (m6) obj;
                oh.f4 f4Var2 = ((oh.y3) obj4).f17952l;
                f4Var2.P1.c(m6Var.f17441a, f4Var2.f17130y1, (TL_stories.StoryItem) obj3);
                new qc(f4Var2.Z0, (g6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.f17442b))).j();
                return;
            case 7:
                c8.J((c8) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 8:
                rn rnVar = (rn) obj4;
                xn xnVar = (xn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (xnVar.c()) {
                    org.telegram.ui.Components.z4.L(xnVar.getParentActivity(), xnVar.a(), new androidx.car.app.utils.a(rnVar, tL_messageMediaToDo, l10, 21));
                    return;
                }
                rnVar.f30826g0.b(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                rnVar.f26590b.dismiss(true);
                return;
            case 9:
                ky kyVar = (ky) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(kyVar.f28513a.C.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new dy(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 10:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                by0 by0Var = (by0) obj2;
                ((org.telegram.ui.ActionBar.d2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    d2Var.dismiss();
                    return;
                }
                by0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(by0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(by0Var);
                return;
            case 11:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                String str = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (user == null) {
                    a1Var.v("requested_chat_failed", org.telegram.ui.web.a1.x(str, "req_id"));
                    return;
                }
                TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.R);
                tL_messages_sendBotRequestedPeer.webapp_req_id = str;
                tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user));
                ConnectionsManager.getInstance(a1Var.J).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new a0(a1Var, str, user, 8));
                a1Var.v("requested_chat_sent", org.telegram.ui.web.a1.x(str, "req_id"));
                return;
            default:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    a1Var2.v("file_download_requested", org.telegram.ui.web.a1.x("cancelled", "status"));
                    return;
                }
                a1Var2.f42442i0.b(str2, str3);
                a1Var2.v("file_download_requested", org.telegram.ui.web.a1.x("downloading", "status"));
                return;
        }
    }
}
