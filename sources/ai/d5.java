package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
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
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;
public final class d5 implements Utilities.Callback {
    public final int f703a;
    public final Object f704b;
    public final Object f705c;
    public final Object d;

    public d5(Object obj, Object obj2, Object obj3, int i10) {
        this.f703a = i10;
        this.f704b = obj;
        this.f705c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        t8 t8Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        int i10 = this.f703a;
        int i11 = 0;
        Object obj2 = this.d;
        Object obj3 = this.f705c;
        Object obj4 = this.f704b;
        switch (i10) {
            case 0:
                h5 h5Var = (h5) obj4;
                h5Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                tv tvVar = new tv(((jc) obj3).f1080f, h5Var.getContext(), (org.telegram.ui.ActionBar.f6) obj2, arrayList2);
                y5 y5Var = h5Var.f946z0.Q1;
                if (y5Var != null) {
                    ((ac) y5Var).h(tvVar);
                    return;
                }
                return;
            case 1:
                w5 w5Var = (w5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                f6 f6Var = w5Var.f1658l;
                if ((storyItem instanceof s8) && (t8Var = ((s8) storyItem).f1511a) != null) {
                    a3.k0 k0Var = new a3.k0(t8Var, storyItem2, callback, 3);
                    if (t8Var.F != 0) {
                        ConnectionsManager.getInstance(t8Var.f718c).cancelRequest(t8Var.F, true);
                        t8Var.F = 0;
                    }
                    t8Var.C = false;
                    t8Var.D = false;
                    t8Var.H(k0Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f18570id.add(Integer.valueOf(storyItem.f18563id));
                ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_getStoriesByID, new t5(w5Var, storyItem, callback, 0));
                return;
            case 2:
                e9 e9Var = (e9) obj;
                f6 f6Var2 = ((w5) obj4).f1658l;
                f6Var2.S1.c(e9Var.f773a, f6Var2.B1, (TL_stories.StoryItem) obj3);
                new xc(f6Var2.f803c1, (org.telegram.ui.ActionBar.f6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, e9Var.f774b))).j();
                return;
            case 3:
                org.telegram.ui.Components.i8.K((org.telegram.ui.Components.i8) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 4:
                un unVar = (un) obj4;
                zn znVar = (zn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l4 = (Long) obj;
                if (znVar.c()) {
                    org.telegram.ui.Components.d5.L(znVar.getParentActivity(), znVar.a(), new r5(unVar, tL_messageMediaToDo, l4, 26));
                    return;
                }
                unVar.f28752j0.e(tL_messageMediaToDo, null, null, null, true, 0, l4.longValue());
                unVar.f26655b.dismiss(true);
                return;
            case 5:
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(jyVar.f25558a.F.f25898c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
            case 6:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                ky0 ky0Var = (ky0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    b2Var.dismiss();
                    return;
                }
                ky0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(ky0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(ky0Var);
                return;
            case 7:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj4;
                String str2 = (String) obj3;
                da daVar = (da) obj2;
                Boolean bool = (Boolean) obj;
                d1Var.getClass();
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
                    d1Var.y(daVar, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                xh.m mVar = (xh.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new xh.c(mVar.getContext(), (org.telegram.ui.ActionBar.f6) obj2, mVar.f46291l0, (List) obj).show();
                return;
            case 9:
                xh.v vVar = (xh.v) obj4;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) obj2;
                List list = (List) obj;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (vVar.m0 != null) {
                    new xh.c(vVar.getContext(), f6Var3, vVar.m0, list).show();
                    vVar.dismiss();
                    return;
                }
                return;
            case 10:
                yh.y3 y3Var = (yh.y3) obj4;
                nf.e eVar = (nf.e) obj;
                eVar.d();
                y3Var.v1(((Long) obj3).longValue(), new d5(y3Var, eVar, (tg.m1[]) obj2, 11));
                return;
            default:
                yh.y3 y3Var2 = (yh.y3) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((nf.e) obj3).b();
                ((tg.m1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new u2.j0(18, y3Var2, tL_error));
                    return;
                } else {
                    y3Var2.dismiss();
                    return;
                }
        }
    }
}
