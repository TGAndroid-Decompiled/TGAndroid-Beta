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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.qn;
public final class a4 implements Utilities.Callback {
    public final int f953a;
    public final Object f954b;
    public final Object f955c;
    public final Object d;

    public a4(Object obj, Object obj2, Object obj3, int i10) {
        this.f953a = i10;
        this.f954b = obj;
        this.f955c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        ci.t6 t6Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull u12;
        int i10 = this.f953a;
        int i11 = 0;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f955c;
        Object obj4 = this.f954b;
        switch (i10) {
            case 0:
                l7 l7Var = (l7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((pf.c) obj3).b();
                ((ug.m1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new a1.f(20, l7Var, tL_error));
                    return;
                } else {
                    l7Var.dismiss();
                    return;
                }
            case 1:
                ci.v3 v3Var = (ci.v3) obj4;
                v3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                aw awVar = new aw(((ci.aa) obj3).f5187f, v3Var.getContext(), (org.telegram.ui.ActionBar.d6) obj2, arrayList2);
                ci.j4 j4Var = v3Var.f6077z0.Q1;
                if (j4Var != null) {
                    ((ci.r9) j4Var).h(awVar);
                    return;
                }
                return;
            case 2:
                ci.h4 h4Var = (ci.h4) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ci.q4 q4Var = h4Var.f5461l;
                if ((storyItem instanceof ci.s6) && (t6Var = ((ci.s6) storyItem).f5972a) != null) {
                    a3.l0 l0Var = new a3.l0(t6Var, storyItem2, callback, 21);
                    if (t6Var.F != 0) {
                        ConnectionsManager.getInstance(t6Var.f5146c).cancelRequest(t6Var.F, true);
                        t6Var.F = 0;
                    }
                    t6Var.C = false;
                    t6Var.D = false;
                    t6Var.H(l0Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(q4Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f20517id.add(Integer.valueOf(storyItem.f20510id));
                ConnectionsManager.getInstance(q4Var.C2).sendRequest(tL_stories_getStoriesByID, new j2(h4Var, storyItem, callback, 5));
                return;
            case 3:
                ci.b7 b7Var = (ci.b7) obj;
                ci.q4 q4Var2 = ((ci.h4) obj4).f5461l;
                q4Var2.S1.c(b7Var.f5251a, q4Var2.B1, (TL_stories.StoryItem) obj3);
                new org.telegram.ui.Components.xc(q4Var2.f5769c1, (org.telegram.ui.ActionBar.d6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, b7Var.f5252b))).j();
                return;
            case 4:
                ei.f7 f7Var = (ei.f7) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                String str2 = (String) obj2;
                Long l4 = (Long) obj;
                if (l4 == null) {
                    f7Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    f7Var.run(new ei.g7(str2, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    f7Var.run(new ei.h7(str2, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            case 5:
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && callback2 != null) {
                    callback2.run(inputPeer);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.k8.L((org.telegram.ui.Components.k8) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 7:
                fo foVar = (fo) obj4;
                qn qnVar = (qn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (qnVar.c()) {
                    org.telegram.ui.Components.f5.K(qnVar.getParentActivity(), qnVar.a(), new u2(foVar, tL_messageMediaToDo, l10, 28));
                    return;
                }
                foVar.f26301j0.d(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                foVar.f28173b.dismiss(true);
                return;
            case 8:
                sy syVar = (sy) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(syVar.f30372a.F.f30722c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ky(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                ty0 ty0Var = (ty0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    b2Var.dismiss();
                    return;
                }
                ty0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(ty0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(ty0Var);
                return;
            case 10:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                String str3 = (String) obj3;
                ci.z7 z7Var = (ci.z7) obj2;
                Boolean bool = (Boolean) obj;
                a1Var.getClass();
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
                    a1Var.x(z7Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                sg.k0 k0Var = (sg.k0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                k0Var.getClass();
                ((aa0) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    k0Var.f46287b0.boosts++;
                    if (k0Var.f46293h0 == 32 && (u12 = k0Var.u1()) != null) {
                        u12.boosts_applied++;
                    }
                    k0Var.A1();
                    k0Var.G1(tL_premium_boostsStatus, k0Var.f46290e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.f46288c0;
                    if (k0Var.f46287b0.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    canApplyBoost.isMaxLvl = z10;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    k0Var.C1();
                    return;
                }
                return;
            case 12:
                yh.m mVar = (yh.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new yh.c(mVar.getContext(), (org.telegram.ui.ActionBar.d6) obj2, mVar.f50388l0, (List) obj).show();
                return;
            default:
                yh.v vVar = (yh.v) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                List list = (List) obj;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (vVar.m0 != null) {
                    new yh.c(vVar.getContext(), d6Var, vVar.m0, list).show();
                    vVar.dismiss();
                    return;
                }
                return;
        }
    }
}
