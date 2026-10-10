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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.zy;
import org.telegram.ui.zn;
public final class d5 implements Utilities.Callback {
    public final int f819a;
    public final Object f820b;
    public final Object f821c;
    public final Object d;

    public d5(Object obj, Object obj2, Object obj3, int i10) {
        this.f819a = i10;
        this.f820b = obj;
        this.f821c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        v8 v8Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull u12;
        int i10 = this.f819a;
        int i11 = 0;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f821c;
        Object obj4 = this.f820b;
        switch (i10) {
            case 0:
                h5 h5Var = (h5) obj4;
                h5Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                jw jwVar = new jw(((kc) obj3).f1267f, h5Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2, arrayList2);
                y5 y5Var = h5Var.f1086z0.Q1;
                if (y5Var != null) {
                    ((bc) y5Var).h(jwVar);
                    return;
                }
                return;
            case 1:
                w5 w5Var = (w5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                f6 f6Var = w5Var.f1860l;
                if ((storyItem instanceof u8) && (v8Var = ((u8) storyItem).f1806a) != null) {
                    a3.k0 k0Var = new a3.k0(v8Var, storyItem2, callback, 3);
                    if (v8Var.F != 0) {
                        ConnectionsManager.getInstance(v8Var.f895c).cancelRequest(v8Var.F, true);
                        v8Var.F = 0;
                    }
                    v8Var.C = false;
                    v8Var.D = false;
                    v8Var.H(k0Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f20286id.add(Integer.valueOf(storyItem.f20279id));
                ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_getStoriesByID, new t5(w5Var, storyItem, callback, 0));
                return;
            case 2:
                f9 f9Var = (f9) obj;
                f6 f6Var2 = ((w5) obj4).f1860l;
                f6Var2.S1.c(f9Var.f1033a, f6Var2.B1, (TL_stories.StoryItem) obj3);
                new ad(f6Var2.f955c1, (org.telegram.ui.ActionBar.e6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, f9Var.f1034b))).j();
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
                org.telegram.ui.Components.l8.L((org.telegram.ui.Components.l8) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 6:
                lo loVar = (lo) obj4;
                zn znVar = (zn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (znVar.c()) {
                    org.telegram.ui.Components.g5.K(znVar.getParentActivity(), znVar.a(), new r5(loVar, tL_messageMediaToDo, l10, 27));
                    return;
                }
                loVar.f28452j0.e(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                loVar.f30211b.dismiss(true);
                return;
            case 7:
                zy zyVar = (zy) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(zyVar.f33726a.F.f24689c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ty(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                bz0 bz0Var = (bz0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    b2Var.dismiss();
                    return;
                }
                bz0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(bz0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(bz0Var);
                return;
            case 9:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                String str3 = (String) obj3;
                ea eaVar = (ea) obj2;
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
                    b1Var.x(eaVar, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                rg.j0 j0Var = (rg.j0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j0Var.getClass();
                ((ia0) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.f47319b0.boosts++;
                    if (j0Var.f47325h0 == 32 && (u12 = j0Var.u1()) != null) {
                        u12.boosts_applied++;
                    }
                    j0Var.A1();
                    j0Var.G1(tL_premium_boostsStatus, j0Var.f47322e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f47320c0;
                    if (j0Var.f47319b0.next_level_boosts <= 0) {
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
                xh.o oVar = (xh.o) obj4;
                oVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new xh.d(oVar.getContext(), (org.telegram.ui.ActionBar.e6) obj2, oVar.f51455l0, (List) obj).show();
                return;
            case 12:
                xh.x xVar = (xh.x) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                List list = (List) obj;
                xVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (xVar.m0 != null) {
                    new xh.d(xVar.getContext(), e6Var, xVar.m0, list).show();
                    xVar.dismiss();
                    return;
                }
                return;
            case 13:
                yh.s3 s3Var = (yh.s3) obj4;
                of.e eVar = (of.e) obj;
                eVar.d();
                s3Var.w1(((Long) obj3).longValue(), new d5(s3Var, eVar, (tg.m1[]) obj2, 14));
                return;
            default:
                yh.s3 s3Var2 = (yh.s3) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((of.e) obj3).b();
                ((tg.m1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new u2.p0(17, s3Var2, tL_error));
                    return;
                } else {
                    s3Var2.dismiss();
                    return;
                }
        }
    }
}
