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
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.zx0;
import org.telegram.ui.bo;
public final class d5 implements Utilities.Callback {
    public final int f700a;
    public final Object f701b;
    public final Object f702c;
    public final Object d;

    public d5(Object obj, Object obj2, Object obj3, int i10) {
        this.f700a = i10;
        this.f701b = obj;
        this.f702c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        t8 t8Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        int i10 = this.f700a;
        int i11 = 0;
        Object obj2 = this.d;
        Object obj3 = this.f702c;
        Object obj4 = this.f701b;
        switch (i10) {
            case 0:
                h5 h5Var = (h5) obj4;
                h5Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                sv svVar = new sv(((jc) obj3).f1077f, h5Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2, arrayList2);
                y5 y5Var = h5Var.f943z0.Q1;
                if (y5Var != null) {
                    ((ac) y5Var).h(svVar);
                    return;
                }
                return;
            case 1:
                w5 w5Var = (w5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                f6 f6Var = w5Var.f1655l;
                if ((storyItem instanceof s8) && (t8Var = ((s8) storyItem).f1508a) != null) {
                    a3.k0 k0Var = new a3.k0(t8Var, storyItem2, callback, 3);
                    if (t8Var.F != 0) {
                        ConnectionsManager.getInstance(t8Var.f715c).cancelRequest(t8Var.F, true);
                        t8Var.F = 0;
                    }
                    t8Var.C = false;
                    t8Var.D = false;
                    t8Var.H(k0Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_getStoriesByID.f18351id.add(Integer.valueOf(storyItem.f18344id));
                ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_getStoriesByID, new t5(w5Var, storyItem, callback, 0));
                return;
            case 2:
                e9 e9Var = (e9) obj;
                f6 f6Var2 = ((w5) obj4).f1655l;
                f6Var2.S1.c(e9Var.f770a, f6Var2.B1, (TL_stories.StoryItem) obj3);
                new vc(f6Var2.f800c1, (org.telegram.ui.ActionBar.e6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, e9Var.f771b))).j();
                return;
            case 3:
                org.telegram.ui.Components.h8.K((org.telegram.ui.Components.h8) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                return;
            case 4:
                un unVar = (un) obj4;
                bo boVar = (bo) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l4 = (Long) obj;
                if (boVar.c()) {
                    org.telegram.ui.Components.c5.L(boVar.getParentActivity(), boVar.a(), new r5(unVar, tL_messageMediaToDo, l4, 26));
                    return;
                }
                unVar.f28448j0.e(tL_messageMediaToDo, null, null, null, true, 0, l4.longValue());
                unVar.f26461b.dismiss(true);
                return;
            case 5:
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(iyVar.f25164a.F.f25700c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new cy(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 6:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                zx0 zx0Var = (zx0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    b2Var.dismiss();
                    return;
                }
                zx0Var.setErrorText(".");
                AndroidUtilities.shakeViewSpring(zx0Var, -6.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AndroidUtilities.showKeyboard(zx0Var);
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
                new xh.c(mVar.getContext(), (org.telegram.ui.ActionBar.e6) obj2, mVar.f45991l0, (List) obj).show();
                return;
            case 9:
                xh.v vVar = (xh.v) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                List list = (List) obj;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (vVar.m0 != null) {
                    new xh.c(vVar.getContext(), e6Var, vVar.m0, list).show();
                    vVar.dismiss();
                    return;
                }
                return;
            case 10:
                yh.z3 z3Var = (yh.z3) obj4;
                nf.e eVar = (nf.e) obj;
                eVar.d();
                z3Var.v1(((Long) obj3).longValue(), new d5(z3Var, eVar, (tg.n1[]) obj2, 11));
                return;
            default:
                yh.z3 z3Var2 = (yh.z3) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((nf.e) obj3).b();
                ((tg.n1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new uh.i(12, z3Var2, tL_error));
                    return;
                } else {
                    z3Var2.dismiss();
                    return;
                }
        }
    }
}
