package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import lh.p6;
import nh.i9;
import nh.j7;
import nh.m6;
import nh.z8;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;
public final class h implements Utilities.Callback {
    public final int f10757a;
    public final Object f10758b;
    public final Object f10759c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f10757a = i10;
        this.d = obj;
        this.f10758b = obj2;
        this.f10759c = obj3;
    }

    @Override
    public final void run(Object obj) {
        nh.d6 d6Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        int i10 = this.f10757a;
        int i11 = 0;
        Object obj2 = this.f10759c;
        Object obj3 = this.f10758b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                s sVar = (s) obj4;
                sVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new d(sVar.getContext(), (f6) obj2, sVar.f10907i0, (List) obj).show();
                return;
            case 1:
                f0 f0Var = (f0) obj4;
                f6 f6Var = (f6) obj2;
                List list = (List) obj;
                f0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (f0Var.f10705j0 != null) {
                    new d(f0Var.getContext(), f6Var, f0Var.f10705j0, list).show();
                    f0Var.dismiss();
                    return;
                }
                return;
            case 2:
                lh.g5 g5Var = (lh.g5) obj4;
                ze.c cVar = (ze.c) obj;
                cVar.d();
                g5Var.v1(((Long) obj3).longValue(), new h(g5Var, cVar, (gg.v2[]) obj2, 3));
                return;
            case 3:
                lh.g5 g5Var2 = (lh.g5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((ze.c) obj3).b();
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
                lv lvVar = new lv(((i9) obj3).f15441f, m3Var.getContext(), (f6) obj2, arrayList2);
                nh.x3 x3Var = m3Var.f15585w0.N1;
                if (x3Var != null) {
                    ((z8) x3Var).h(lvVar);
                    return;
                }
                return;
            case 5:
                nh.w3 w3Var = (nh.w3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                nh.d4 d4Var = w3Var.f16007l;
                if ((storyItem instanceof nh.c6) && (d6Var = ((nh.c6) storyItem).f15142a) != null) {
                    p6 p6Var = new p6(d6Var, storyItem2, callback, 4);
                    if (d6Var.F != 0) {
                        ConnectionsManager.getInstance(d6Var.f15557c).cancelRequest(d6Var.F, true);
                        d6Var.F = 0;
                    }
                    d6Var.C = false;
                    d6Var.D = false;
                    d6Var.H(p6Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(d4Var.f15243z2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f19401id.add(Integer.valueOf(storyItem.f19394id));
                ConnectionsManager.getInstance(d4Var.f15243z2).sendRequest(tL_stories_getStoriesByID, new gg.y(w3Var, storyItem, callback));
                return;
            case 6:
                m6 m6Var = (m6) obj;
                nh.d4 d4Var2 = ((nh.w3) obj4).f16007l;
                d4Var2.P1.c(m6Var.f15598a, d4Var2.f15238y1, (TL_stories.StoryItem) obj3);
                new qc(d4Var2.Z0, (f6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.f15599b))).j();
                return;
            case 7:
                c8.J((c8) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 8:
                pn pnVar = (pn) obj4;
                zn znVar = (zn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (znVar.c()) {
                    org.telegram.ui.Components.z4.L(znVar.getParentActivity(), znVar.a(), new androidx.car.app.utils.a(pnVar, tL_messageMediaToDo, l10, 21));
                    return;
                }
                pnVar.f27944g0.c(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                pnVar.f24282b.dismiss(true);
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(iyVar.f25785a.C.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                String str2 = (String) obj3;
                j7 j7Var = (j7) obj2;
                Boolean bool = (Boolean) obj;
                c1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool.booleanValue()) {
                        if (TextUtils.isEmpty(str2)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    c1Var.z(j7Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
