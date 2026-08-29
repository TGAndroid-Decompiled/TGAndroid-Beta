package ih;

import java.util.ArrayList;
import java.util.List;
import lh.i9;
import lh.l6;
import lh.z8;
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
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wx;
import org.telegram.ui.tn;
public final class i implements Utilities.Callback {
    public final int f9229a;
    public final Object f9230b;
    public final Object f9231c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f9229a = i10;
        this.d = obj;
        this.f9230b = obj2;
        this.f9231c = obj3;
    }

    @Override
    public final void run(Object obj) {
        lh.c6 c6Var;
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.f9229a;
        int i11 = 0;
        Object obj2 = this.f9231c;
        Object obj3 = this.f9230b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                t tVar = (t) obj4;
                tVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new d(tVar.getContext(), (org.telegram.ui.ActionBar.c6) obj2, tVar.f9385h0, (List) obj).show();
                return;
            case 1:
                g0 g0Var = (g0) obj4;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) obj2;
                List list = (List) obj;
                g0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (g0Var.f9173i0 != null) {
                    new d(g0Var.getContext(), c6Var2, g0Var.f9173i0, list).show();
                    g0Var.dismiss();
                    return;
                }
                return;
            case 2:
                jh.h5 h5Var = (jh.h5) obj4;
                ye.c cVar = (ye.c) obj;
                cVar.d();
                h5Var.v1(((Long) obj3).longValue(), new i(h5Var, cVar, (eg.w2[]) obj2, 3));
                return;
            case 3:
                jh.h5 h5Var2 = (jh.h5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((ye.c) obj3).b();
                ((eg.w2[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ef.c(29, h5Var2, tL_error));
                    return;
                } else {
                    h5Var2.dismiss();
                    return;
                }
            case 4:
                lh.l3 l3Var = (lh.l3) obj4;
                l3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                jv jvVar = new jv(((i9) obj3).f15756f, l3Var.getContext(), (org.telegram.ui.ActionBar.c6) obj2, arrayList2);
                lh.x3 x3Var = l3Var.f15876v0.M1;
                if (x3Var != null) {
                    ((z8) x3Var).h(jvVar);
                    return;
                }
                return;
            case 5:
                lh.w3 w3Var = (lh.w3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                lh.d4 d4Var = w3Var.f16362l;
                if ((storyItem instanceof lh.b6) && (c6Var = ((lh.b6) storyItem).f15400a) != null) {
                    l3.m mVar = new l3.m(c6Var, storyItem2, callback, 4);
                    if (c6Var.F != 0) {
                        ConnectionsManager.getInstance(c6Var.f15834c).cancelRequest(c6Var.F, true);
                        c6Var.F = 0;
                    }
                    c6Var.C = false;
                    c6Var.D = false;
                    c6Var.H(mVar);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(d4Var.f15545y2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f22636id.add(Integer.valueOf(storyItem.f22629id));
                ConnectionsManager.getInstance(d4Var.f15545y2).sendRequest(tL_stories_getStoriesByID, new eg.z(w3Var, storyItem, callback));
                return;
            case 6:
                l6 l6Var = (l6) obj;
                lh.d4 d4Var2 = ((lh.w3) obj4).f16362l;
                d4Var2.O1.c(l6Var.f15893a, d4Var2.f15540x1, (TL_stories.StoryItem) obj3);
                new tc(d4Var2.Y0, (org.telegram.ui.ActionBar.c6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, l6Var.f15894b))).j();
                return;
            case 7:
                g8.J((g8) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 8:
                on onVar = (on) obj4;
                tn tnVar = (tn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (tnVar.c()) {
                    org.telegram.ui.Components.c5.L(tnVar.getParentActivity(), tnVar.a(), new androidx.car.app.utils.a(onVar, tL_messageMediaToDo, l10, 23));
                    return;
                }
                onVar.f31410f0.e(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                onVar.f28403b.dismiss(true);
                return;
            case 9:
                dy dyVar = (dy) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(dyVar.f27885a.B.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new wx(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 10:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                rx0 rx0Var = (rx0) obj2;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    c2Var.dismiss();
                    return;
                }
                rx0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(rx0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(rx0Var);
                return;
            case 11:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                String str = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (user == null) {
                    z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                    return;
                }
                TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(z0Var.Q);
                tL_messages_sendBotRequestedPeer.webapp_req_id = str;
                tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user));
                ConnectionsManager.getInstance(z0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new b0(z0Var, str, user, 8));
                z0Var.v("requested_chat_sent", org.telegram.ui.web.z0.x(str, "req_id"));
                return;
            default:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    z0Var2.v("file_download_requested", org.telegram.ui.web.z0.x("cancelled", "status"));
                    return;
                }
                z0Var2.f44272h0.b(str2, str3);
                z0Var2.v("file_download_requested", org.telegram.ui.web.z0.x("downloading", "status"));
                return;
        }
    }
}
