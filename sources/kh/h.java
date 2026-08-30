package kh;

import java.util.ArrayList;
import java.util.List;
import lh.p6;
import nh.i9;
import nh.m6;
import nh.z8;
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
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qn;
import org.telegram.ui.xn;
public final class h implements Utilities.Callback {
    public final int f10630a;
    public final Object f10631b;
    public final Object f10632c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f10630a = i10;
        this.d = obj;
        this.f10631b = obj2;
        this.f10632c = obj3;
    }

    @Override
    public final void run(Object obj) {
        nh.d6 d6Var;
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.f10630a;
        int i11 = 0;
        Object obj2 = this.f10632c;
        Object obj3 = this.f10631b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                s sVar = (s) obj4;
                sVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new d(sVar.getContext(), (org.telegram.ui.ActionBar.f6) obj2, sVar.f10798i0, (List) obj).show();
                return;
            case 1:
                f0 f0Var = (f0) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                List list = (List) obj;
                f0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (f0Var.f10594j0 != null) {
                    new d(f0Var.getContext(), f6Var, f0Var.f10594j0, list).show();
                    f0Var.dismiss();
                    return;
                }
                return;
            case 2:
                lh.g5 g5Var = (lh.g5) obj4;
                af.f fVar = (af.f) obj;
                fVar.d();
                g5Var.v1(((Long) obj3).longValue(), new h(g5Var, fVar, (gg.v2[]) obj2, 3));
                return;
            case 3:
                lh.g5 g5Var2 = (lh.g5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((af.f) obj3).b();
                ((gg.v2[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new lh.n2(1, g5Var2, tL_error));
                    return;
                } else {
                    g5Var2.dismiss();
                    return;
                }
            case 4:
                nh.m3 m3Var = (nh.m3) obj4;
                m3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                mv mvVar = new mv(((i9) obj3).f15461f, m3Var.getContext(), (org.telegram.ui.ActionBar.f6) obj2, arrayList2);
                nh.x3 x3Var = m3Var.f15605w0.N1;
                if (x3Var != null) {
                    ((z8) x3Var).h(mvVar);
                    return;
                }
                return;
            case 5:
                nh.w3 w3Var = (nh.w3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                nh.d4 d4Var = w3Var.f16027l;
                if ((storyItem instanceof nh.c6) && (d6Var = ((nh.c6) storyItem).f15162a) != null) {
                    p6 p6Var = new p6(d6Var, storyItem2, callback, 4);
                    if (d6Var.F != 0) {
                        ConnectionsManager.getInstance(d6Var.f15577c).cancelRequest(d6Var.F, true);
                        d6Var.F = 0;
                    }
                    d6Var.C = false;
                    d6Var.D = false;
                    d6Var.H(p6Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(d4Var.f15263z2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f19426id.add(Integer.valueOf(storyItem.f19419id));
                ConnectionsManager.getInstance(d4Var.f15263z2).sendRequest(tL_stories_getStoriesByID, new gg.y(w3Var, storyItem, callback));
                return;
            case 6:
                m6 m6Var = (m6) obj;
                nh.d4 d4Var2 = ((nh.w3) obj4).f16027l;
                d4Var2.P1.c(m6Var.f15618a, d4Var2.f15258y1, (TL_stories.StoryItem) obj3);
                new qc(d4Var2.Z0, (org.telegram.ui.ActionBar.f6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.f15619b))).j();
                return;
            case 7:
                c8.J((c8) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 8:
                qn qnVar = (qn) obj4;
                xn xnVar = (xn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (xnVar.c()) {
                    org.telegram.ui.Components.z4.L(xnVar.getParentActivity(), xnVar.a(), new androidx.car.app.utils.a(qnVar, tL_messageMediaToDo, l10, 21));
                    return;
                }
                qnVar.f28172g0.b(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                qnVar.f24278b.dismiss(true);
                return;
            case 9:
                iy iyVar = (iy) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(iyVar.f25796a.C.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ay(stickerSetCovered, arrayList));
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
                a1Var2.f39432i0.b(str2, str3);
                a1Var2.v("file_download_requested", org.telegram.ui.web.a1.x("downloading", "status"));
                return;
        }
    }
}
