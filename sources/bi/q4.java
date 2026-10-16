package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class q4 implements Utilities.Callback {
    public final int f3505a;
    public final Object f3506b;
    public final Object f3507c;
    public final Object d;

    public q4(Object obj, Object obj2, Object obj3, int i10) {
        this.f3505a = i10;
        this.f3506b = obj;
        this.f3507c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        f8 f8Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull u12;
        int i10 = this.f3505a;
        int i11 = 0;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f3507c;
        Object obj4 = this.f3506b;
        switch (i10) {
            case 0:
                u4 u4Var = (u4) obj4;
                u4Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                ew ewVar = new ew(((sb) obj3).f3677f, u4Var.getContext(), (org.telegram.ui.ActionBar.c6) obj2, arrayList2);
                j5 j5Var = u4Var.f3787z0.Q1;
                if (j5Var != null) {
                    ((jb) j5Var).h(ewVar);
                    return;
                }
                return;
            case 1:
                h5 h5Var = (h5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                q5 q5Var = h5Var.f3126l;
                if ((storyItem instanceof e8) && (f8Var = ((e8) storyItem).f3002a) != null) {
                    a3.l0 l0Var = new a3.l0(f8Var, storyItem2, callback, 6);
                    if (f8Var.F != 0) {
                        ConnectionsManager.getInstance(f8Var.f3430c).cancelRequest(f8Var.F, true);
                        f8Var.F = 0;
                    }
                    f8Var.C = false;
                    f8Var.D = false;
                    f8Var.H(l0Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(q5Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f19158id.add(Integer.valueOf(storyItem.f19151id));
                ConnectionsManager.getInstance(q5Var.C2).sendRequest(tL_stories_getStoriesByID, new e5(h5Var, storyItem, callback, 0));
                return;
            case 2:
                p8 p8Var = (p8) obj;
                q5 q5Var2 = ((h5) obj4).f3126l;
                q5Var2.S1.c(p8Var.f3477a, q5Var2.B1, (TL_stories.StoryItem) obj3);
                new zc(q5Var2.f3515c1, (org.telegram.ui.ActionBar.c6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, p8Var.f3478b))).j();
                return;
            case 3:
                di.o7 o7Var = (di.o7) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                String str2 = (String) obj2;
                Long l4 = (Long) obj;
                if (l4 == null) {
                    o7Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    o7Var.run(new di.p7(str2, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    o7Var.run(new di.q7(str2, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            case 4:
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.a2) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && callback2 != null) {
                    callback2.run(inputPeer);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.m8.L((org.telegram.ui.Components.m8) obj4, (org.telegram.ui.ActionBar.a2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 6:
                io ioVar = (io) obj4;
                fo foVar = (fo) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (foVar.c()) {
                    org.telegram.ui.Components.g5.K(foVar.getParentActivity(), foVar.a(), new androidx.car.app.utils.a(ioVar, tL_messageMediaToDo, l10, 27));
                    return;
                }
                ioVar.f25682j0.d(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                ioVar.f27360b.dismiss(true);
                return;
            case 7:
                uy uyVar = (uy) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(uyVar.f29486a.F.f30707c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new oy(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 8:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj3;
                xy0 xy0Var = (xy0) obj2;
                ((org.telegram.ui.ActionBar.a2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    a2Var.dismiss();
                    return;
                }
                xy0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(xy0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(xy0Var);
                return;
            case 9:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                String str3 = (String) obj3;
                n9 n9Var = (n9) obj2;
                Boolean bool = (Boolean) obj;
                c1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool.booleanValue()) {
                        if (TextUtils.isEmpty(str3)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    c1Var.x(n9Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 10:
                sg.j0 j0Var = (sg.j0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j0Var.getClass();
                ((ga0) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.f45204b0.boosts++;
                    if (j0Var.f45210h0 == 32 && (u12 = j0Var.u1()) != null) {
                        u12.boosts_applied++;
                    }
                    j0Var.A1();
                    j0Var.G1(tL_premium_boostsStatus, j0Var.f45207e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f45205c0;
                    if (j0Var.f45204b0.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    canApplyBoost.isMaxLvl = z10;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    j0Var.C1();
                    return;
                }
                return;
            case 11:
                yh.n nVar = (yh.n) obj4;
                nVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new yh.d(nVar.getContext(), (org.telegram.ui.ActionBar.c6) obj2, nVar.f49017l0, (List) obj).show();
                return;
            case 12:
                yh.w wVar = (yh.w) obj4;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                List list = (List) obj;
                wVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (wVar.m0 != null) {
                    new yh.d(wVar.getContext(), c6Var, wVar.m0, list).show();
                    wVar.dismiss();
                    return;
                }
                return;
            case 13:
                zh.r3 r3Var = (zh.r3) obj4;
                pf.c cVar = (pf.c) obj;
                cVar.d();
                r3Var.w1(((Long) obj3).longValue(), new q4(r3Var, cVar, (ug.m1[]) obj2, 14));
                return;
            default:
                zh.r3 r3Var2 = (zh.r3) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((pf.c) obj3).b();
                ((ug.m1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new zh.m(3, r3Var2, tL_error));
                    return;
                } else {
                    r3Var2.dismiss();
                    return;
                }
        }
    }
}
