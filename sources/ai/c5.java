package ai;

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
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.xn;
public final class c5 implements Utilities.Callback {
    public final int f639a;
    public final Object f640b;
    public final Object f641c;
    public final Object d;

    public c5(Object obj, Object obj2, Object obj3, int i10) {
        this.f639a = i10;
        this.f640b = obj;
        this.f641c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        u8 u8Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull t12;
        int i10 = this.f639a;
        int i11 = 0;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f641c;
        Object obj4 = this.f640b;
        switch (i10) {
            case 0:
                g5 g5Var = (g5) obj4;
                g5Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                tv tvVar = new tv(((jc) obj3).f1071f, g5Var.getContext(), (org.telegram.ui.ActionBar.d6) obj2, arrayList2);
                x5 x5Var = g5Var.f898z0.Q1;
                if (x5Var != null) {
                    ((ac) x5Var).h(tvVar);
                    return;
                }
                return;
            case 1:
                v5 v5Var = (v5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                e6 e6Var = v5Var.f1612l;
                if ((storyItem instanceof t8) && (u8Var = ((t8) storyItem).f1559a) != null) {
                    a3.k0 k0Var = new a3.k0(u8Var, storyItem2, callback, 3);
                    if (u8Var.F != 0) {
                        ConnectionsManager.getInstance(u8Var.f722c).cancelRequest(u8Var.F, true);
                        u8Var.F = 0;
                    }
                    u8Var.C = false;
                    u8Var.D = false;
                    u8Var.H(k0Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(e6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f18325id.add(Integer.valueOf(storyItem.f18318id));
                ConnectionsManager.getInstance(e6Var.C2).sendRequest(tL_stories_getStoriesByID, new s5(v5Var, storyItem, callback, 0));
                return;
            case 2:
                e9 e9Var = (e9) obj;
                e6 e6Var2 = ((v5) obj4).f1612l;
                e6Var2.S1.c(e9Var.f854a, e6Var2.B1, (TL_stories.StoryItem) obj3);
                new xc(e6Var2.f776c1, (org.telegram.ui.ActionBar.d6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, e9Var.f855b))).j();
                return;
            case 3:
                ci.p7 p7Var = (ci.p7) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                String str2 = (String) obj2;
                Long l4 = (Long) obj;
                if (l4 == null) {
                    p7Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    p7Var.run(new ci.q7(str2, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    p7Var.run(new ci.r7(str2, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            case 4:
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && callback2 != null) {
                    callback2.run(inputPeer);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.j8.K((org.telegram.ui.Components.j8) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 6:
                vn vnVar = (vn) obj4;
                xn xnVar = (xn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (xnVar.c()) {
                    org.telegram.ui.Components.e5.L(xnVar.getParentActivity(), xnVar.a(), new q5(vnVar, tL_messageMediaToDo, l10, 26));
                    return;
                }
                vnVar.f28793j0.e(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                vnVar.f26744b.dismiss(true);
                return;
            case 7:
                jy jyVar = (jy) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(jyVar.f25438a.F.f25968c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                yx0 yx0Var = (yx0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    b2Var.dismiss();
                    return;
                }
                yx0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(yx0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(yx0Var);
                return;
            case 9:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                String str3 = (String) obj3;
                da daVar = (da) obj2;
                Boolean bool = (Boolean) obj;
                b1Var.getClass();
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
                    b1Var.y(daVar, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 10:
                rg.j0 j0Var = (rg.j0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j0Var.getClass();
                ((g90) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.f42262b0.boosts++;
                    if (j0Var.f42268h0 == 32 && (t12 = j0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    j0Var.z1();
                    j0Var.F1(tL_premium_boostsStatus, j0Var.f42265e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f42263c0;
                    if (j0Var.f42262b0.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    canApplyBoost.isMaxLvl = z10;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    j0Var.B1();
                    return;
                }
                return;
            case 11:
                xh.m mVar = (xh.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new xh.c(mVar.getContext(), (org.telegram.ui.ActionBar.d6) obj2, mVar.f45943l0, (List) obj).show();
                return;
            case 12:
                xh.v vVar = (xh.v) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                List list = (List) obj;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (vVar.m0 != null) {
                    new xh.c(vVar.getContext(), d6Var, vVar.m0, list).show();
                    vVar.dismiss();
                    return;
                }
                return;
            case 13:
                yh.y3 y3Var = (yh.y3) obj4;
                nf.e eVar = (nf.e) obj;
                eVar.d();
                y3Var.v1(((Long) obj3).longValue(), new c5(y3Var, eVar, (tg.n1[]) obj2, 14));
                return;
            default:
                yh.y3 y3Var2 = (yh.y3) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((nf.e) obj3).b();
                ((tg.n1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new uh.i(12, y3Var2, tL_error));
                    return;
                } else {
                    y3Var2.dismiss();
                    return;
                }
        }
    }
}
