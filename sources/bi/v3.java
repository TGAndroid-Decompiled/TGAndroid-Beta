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
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.wn;
public final class v3 implements Utilities.Callback {
    public final int f5549a;
    public final Object f5550b;
    public final Object f5551c;
    public final Object d;

    public v3(Object obj, Object obj2, Object obj3, int i10) {
        this.f5549a = i10;
        this.f5550b = obj;
        this.f5551c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        di.s6 s6Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull x12;
        int i10 = this.f5549a;
        int i11 = 0;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f5551c;
        Object obj4 = this.f5550b;
        switch (i10) {
            case 0:
                h7 h7Var = (h7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((qf.c) obj3).b();
                ((vg.n1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new f2(4, h7Var, tL_error));
                    return;
                } else {
                    h7Var.dismiss();
                    return;
                }
            case 1:
                di.u3 u3Var = (di.u3) obj4;
                u3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                aw awVar = new aw(((di.y9) obj3).f9428f, u3Var.getContext(), (org.telegram.ui.ActionBar.u6) obj2, arrayList2);
                di.j4 j4Var = u3Var.f9229z0.F1;
                if (j4Var != null) {
                    ((di.p9) j4Var).h(awVar);
                    return;
                }
                return;
            case 2:
                di.h4 h4Var = (di.h4) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                di.q4 q4Var = h4Var.f8625l;
                if ((storyItem instanceof di.r6) && (s6Var = ((di.r6) storyItem).f9121a) != null) {
                    a3.l0 l0Var = new a3.l0(s6Var, storyItem2, callback, 23);
                    if (s6Var.F != 0) {
                        ConnectionsManager.getInstance(s6Var.f9489c).cancelRequest(s6Var.F, true);
                        s6Var.F = 0;
                    }
                    s6Var.C = false;
                    s6Var.D = false;
                    s6Var.H(l0Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(q4Var.f9020r2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f22274id.add(Integer.valueOf(storyItem.f22267id));
                ConnectionsManager.getInstance(q4Var.f9020r2).sendRequest(tL_stories_getStoriesByID, new h2(h4Var, storyItem, callback, 5));
                return;
            case 3:
                di.a7 a7Var = (di.a7) obj;
                di.q4 q4Var2 = ((di.h4) obj4).f8625l;
                q4Var2.H1.c(a7Var.f8375a, q4Var2.f9015q1, (TL_stories.StoryItem) obj3);
                new org.telegram.ui.Components.wc(q4Var2.R0, (org.telegram.ui.ActionBar.u6) obj2).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, a7Var.f8376b))).j();
                return;
            case 4:
                fi.c7 c7Var = (fi.c7) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                String str2 = (String) obj2;
                Long l4 = (Long) obj;
                if (l4 == null) {
                    c7Var.run(null);
                    return;
                }
                TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                if (userOrChat instanceof TLRPC.User) {
                    c7Var.run(new fi.d7(str2, (TLRPC.User) userOrChat));
                    return;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    c7Var.run(new fi.e7(str2, (TLRPC.Chat) userOrChat));
                    return;
                } else {
                    return;
                }
            case 5:
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.e2) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && callback2 != null) {
                    callback2.run(inputPeer);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.m8.L((org.telegram.ui.Components.m8) obj4, (org.telegram.ui.ActionBar.e2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 7:
                go goVar = (go) obj4;
                wn wnVar = (wn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (wnVar.c()) {
                    org.telegram.ui.Components.g5.K(wnVar.getParentActivity(), wnVar.a(), new androidx.car.app.utils.a(goVar, tL_messageMediaToDo, l10, 28));
                    return;
                }
                goVar.f28679j0.e(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                goVar.f30254b.dismiss(true);
                return;
            case 8:
                ry ryVar = (ry) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(ryVar.f32398a.F.f32713c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new jy(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 9:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                gz0 gz0Var = (gz0) obj2;
                ((org.telegram.ui.ActionBar.e2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    e2Var.dismiss();
                    return;
                }
                gz0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(gz0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(gz0Var);
                return;
            case 10:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                String str3 = (String) obj3;
                di.x7 x7Var = (di.x7) obj2;
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
                    a1Var.x(x7Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                tg.j0 j0Var = (tg.j0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j0Var.getClass();
                ((da0) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.f48920b0.boosts++;
                    if (j0Var.f48926h0 == 32 && (x12 = j0Var.x1()) != null) {
                        x12.boosts_applied++;
                    }
                    j0Var.D1();
                    j0Var.J1(tL_premium_boostsStatus, j0Var.f48923e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f48921c0;
                    if (j0Var.f48920b0.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    canApplyBoost.isMaxLvl = z10;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    j0Var.F1();
                    return;
                }
                return;
            case 12:
                zh.m mVar = (zh.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new zh.c(mVar.getContext(), (org.telegram.ui.ActionBar.u6) obj2, mVar.f53181l0, (List) obj).show();
                return;
            default:
                zh.v vVar = (zh.v) obj4;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj2;
                List list = (List) obj;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (vVar.m0 != null) {
                    new zh.c(vVar.getContext(), u6Var, vVar.m0, list).show();
                    vVar.dismiss();
                    return;
                }
                return;
        }
    }
}
