package fh;

import ih.d9;
import ih.m9;
import java.util.ArrayList;
import java.util.List;
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
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.ux;
import org.telegram.ui.qn;
public final class i implements Utilities.Callback {
    public final int f6505a;
    public final Object f6506b;
    public final Object f6507c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i9) {
        this.f6505a = i9;
        this.d = obj;
        this.f6506b = obj2;
        this.f6507c = obj3;
    }

    @Override
    public final void run(Object obj) {
        ih.f6 f6Var;
        ArrayList<TLRPC.Document> arrayList;
        int i9 = this.f6505a;
        int i10 = 0;
        Object obj2 = this.f6507c;
        Object obj3 = this.f6506b;
        Object obj4 = this.d;
        switch (i9) {
            case 0:
                x xVar = (x) obj4;
                xVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new d(xVar.getContext(), (org.telegram.ui.ActionBar.b6) obj2, xVar.f6847h0, (List) obj).show();
                return;
            case 1:
                k0 k0Var = (k0) obj4;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                List list = (List) obj;
                k0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (k0Var.f6570i0 != null) {
                    new d(k0Var.getContext(), b6Var, k0Var.f6570i0, list).show();
                    k0Var.dismiss();
                    return;
                }
                return;
            case 2:
                gh.k5 k5Var = (gh.k5) obj4;
                ve.d dVar = (ve.d) obj;
                dVar.d();
                k5Var.v1(((Long) obj3).longValue(), new i(k5Var, dVar, (bg.g3[]) obj2, 3));
                return;
            case 3:
                gh.k5 k5Var2 = (gh.k5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((ve.d) obj3).b();
                ((bg.g3[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new e5.u(13, k5Var2, tL_error));
                    return;
                } else {
                    k5Var2.dismiss();
                    return;
                }
            case 4:
                ih.p3 p3Var = (ih.p3) obj4;
                p3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                dv dvVar = new dv(((m9) obj3).f11797f, p3Var.getContext(), (org.telegram.ui.ActionBar.b6) obj2, arrayList2);
                ih.c4 c4Var = p3Var.f11946v0.M1;
                if (c4Var != null) {
                    ((d9) c4Var).h(dvVar);
                    return;
                }
                return;
            case 5:
                ih.b4 b4Var = (ih.b4) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ih.i4 i4Var = b4Var.f11268l;
                if ((storyItem instanceof ih.e6) && (f6Var = ((ih.e6) storyItem).f11366a) != null) {
                    ih.h3 h3Var = new ih.h3(f6Var, storyItem2, callback, 2);
                    if (f6Var.F != 0) {
                        ConnectionsManager.getInstance(f6Var.f11847c).cancelRequest(f6Var.F, true);
                        f6Var.F = 0;
                    }
                    f6Var.C = false;
                    f6Var.D = false;
                    f6Var.H(h3Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(i4Var.f11609y2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(storyItem.f22617id));
                ConnectionsManager.getInstance(i4Var.f11609y2).sendRequest(tL_stories_getStoriesByID, new bg.b0(b4Var, storyItem, callback));
                return;
            case 6:
                ih.o6 o6Var = (ih.o6) obj;
                ih.i4 i4Var2 = ((ih.b4) obj4).f11268l;
                i4Var2.O1.c(o6Var.f11901a, i4Var2.f11604x1, (TL_stories.StoryItem) obj3);
                new oc(i4Var2.Y0, (org.telegram.ui.ActionBar.b6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, o6Var.f11902b))).j();
                return;
            case 7:
                c8.J((c8) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 8:
                jn jnVar = (jn) obj4;
                qn qnVar = (qn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (qnVar.c()) {
                    org.telegram.ui.Components.y4.L(qnVar.getParentActivity(), qnVar.a(), new androidx.car.app.utils.a(jnVar, tL_messageMediaToDo, l10, 25));
                    return;
                }
                jnVar.f29774f0.e(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                jnVar.f27493b.dismiss(true);
                return;
            case 9:
                ux uxVar = (ux) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj5 = arrayList4.get(i10);
                    i10++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(uxVar.f33157a.B.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ox(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 10:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                gx0 gx0Var = (gx0) obj2;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    c2Var.dismiss();
                    return;
                }
                gx0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(gx0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(gx0Var);
                return;
            case 11:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                String str = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (user == null) {
                    y0Var.v("requested_chat_failed", org.telegram.ui.web.y0.x(str, "req_id"));
                    return;
                }
                TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(y0Var.Q);
                tL_messages_sendBotRequestedPeer.webapp_req_id = str;
                tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user));
                ConnectionsManager.getInstance(y0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new f0(y0Var, str, user, 8));
                y0Var.v("requested_chat_sent", org.telegram.ui.web.y0.x(str, "req_id"));
                return;
            default:
                org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    y0Var2.v("file_download_requested", org.telegram.ui.web.y0.x("cancelled", "status"));
                    return;
                }
                y0Var2.f44082h0.b(str2, str3);
                y0Var2.v("file_download_requested", org.telegram.ui.web.y0.x("downloading", "status"));
                return;
        }
    }
}
