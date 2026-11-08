package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zw;
import org.telegram.ui.an;
public final class v3 implements c20 {
    public final int f4868a;
    public final Object f4869b;
    public final Object f4870c;
    public final Object d;

    public v3(Object obj, Object obj2, Object obj3, int i7) {
        this.f4868a = i7;
        this.f4869b = obj;
        this.f4870c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        di.j6 j6Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull N0;
        int i7 = this.f4868a;
        int i10 = 0;
        boolean z9 = false;
        Object obj2 = this.d;
        Object obj3 = this.f4870c;
        Object obj4 = this.f4869b;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((vf.b) obj3).b();
                ((wg.f1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new a4(0, k7Var, tL_error));
                    return;
                } else {
                    k7Var.dismiss();
                    return;
                }
            case 1:
                di.n3 n3Var = (di.n3) obj4;
                n3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                ru ruVar = new ru(((di.p9) obj3).f9543f, n3Var.getContext(), (org.telegram.ui.ActionBar.f6) obj2, arrayList2);
                di.b4 b4Var = n3Var.f9398z0.f9221z1;
                if (b4Var != null) {
                    ((di.g9) b4Var).h(ruVar);
                    return;
                }
                return;
            case 2:
                di.z3 z3Var = (di.z3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                c20 c20Var = (c20) obj;
                di.i4 i4Var = z3Var.f10013x;
                if ((storyItem instanceof di.i6) && (j6Var = ((di.i6) storyItem).f9228a) != null) {
                    aa.s sVar = new aa.s(j6Var, storyItem2, c20Var, 24);
                    if (j6Var.F != 0) {
                        ConnectionsManager.getInstance(j6Var.f9639c).cancelRequest(j6Var.F, true);
                        j6Var.F = 0;
                    }
                    j6Var.C = false;
                    j6Var.D = false;
                    j6Var.H(sVar);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = qp.s1(i4Var.f9168l2).j1(storyItem.dialogId);
                tL_stories_getStoriesByID.f27202id.add(Integer.valueOf(storyItem.f27195id));
                ConnectionsManager.getInstance(i4Var.f9168l2).sendRequest(tL_stories_getStoriesByID, new f2(z3Var, storyItem, c20Var, 5));
                return;
            case 3:
                di.r6 r6Var = (di.r6) obj;
                di.i4 i4Var2 = ((di.z3) obj4).f10013x;
                i4Var2.B1.c(r6Var.f9701a, i4Var2.f9164k1, (TL_stories.StoryItem) obj3);
                org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131744734, r6Var.f9702b), new org.telegram.ui.Components.hc(i4Var2.L0, (org.telegram.ui.ActionBar.f6) obj2), 2131623989, 36);
                return;
            case 4:
                fi.m6 m6Var = (fi.m6) obj4;
                qp qpVar = (qp) obj3;
                String str2 = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    m6Var.a(null);
                    return;
                }
                TLObject e22 = qpVar.e2(l10.longValue());
                if (e22 instanceof TLRPC.User) {
                    m6Var.a(new fi.n6(str2, (TLRPC.User) e22));
                    return;
                } else if (e22 instanceof TLRPC.Chat) {
                    m6Var.a(new fi.o6(str2, (TLRPC.Chat) e22));
                    return;
                } else {
                    return;
                }
            case 5:
                c20 c20Var2 = (c20) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && c20Var2 != null) {
                    c20Var2.a(inputPeer);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    u1Var.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = qp.s1(b8Var.f28616a).j1(p10.i(b8Var.f28616a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                ConnectionsManager.getInstance(b8Var.f28616a).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.ld(10, b8Var, u1Var));
                return;
            case 7:
                bn bnVar = (bn) obj4;
                an anVar = (an) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l11 = (Long) obj;
                if (anVar.c()) {
                    org.telegram.ui.Components.v4.I(anVar.getParentActivity(), anVar.a(), new a3.h(bnVar, tL_messageMediaToDo, l11, 28));
                    return;
                }
                bnVar.f32244j0.b(tL_messageMediaToDo, null, null, null, true, 0, l11.longValue());
                bnVar.f39004b.a(true);
                return;
            case 8:
                gx gxVar = (gx) obj4;
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
                        TLRPC.TL_messages_stickerSet l02 = ui.b0(gxVar.f34033a.F.f34400c1).l0(ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new zw(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 9:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj3;
                bw0 bw0Var = (bw0) obj2;
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    u1Var2.dismiss();
                    return;
                }
                bw0Var.setErrorText(".");
                org.telegram.messenger.g0.G3(-6.0f, bw0Var, null);
                org.telegram.messenger.p2.APP_ERROR.a();
                org.telegram.messenger.g0.K3(bw0Var);
                return;
            case 10:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj4;
                String str3 = (String) obj3;
                di.o7 o7Var = (di.o7) obj2;
                Boolean bool = (Boolean) obj;
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
                    x0Var.x(o7Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 11:
                ug.i0 i0Var = (ug.i0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((z70) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    i0Var.T1.boosts++;
                    if (i0Var.Z1 == 32 && (N0 = qp.s1(i0Var.f28616a).N0(-i0Var.S1)) != null) {
                        N0.boosts_applied++;
                    }
                    i0Var.t1();
                    i0Var.z1(tL_premium_boostsStatus, i0Var.W1);
                    org.telegram.messenger.e3 e3Var = i0Var.U1;
                    if (i0Var.T1.next_level_boosts <= 0) {
                        z9 = true;
                    }
                    e3Var.f22181m = z9;
                    e3Var.f22180l = true;
                    e3Var.a(tL_premium_myBoosts);
                    i0Var.v1();
                    return;
                }
                return;
            case 12:
                zh.l lVar = (zh.l) obj4;
                lVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new zh.d(lVar.getContext(), (org.telegram.ui.ActionBar.f6) obj2, lVar.d2, (List) obj).show();
                return;
            default:
                zh.u uVar = (zh.u) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                List list = (List) obj;
                uVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (uVar.f60538e2 != null) {
                    new zh.d(uVar.getContext(), f6Var, uVar.f60538e2, list).show();
                    uVar.dismiss();
                    return;
                }
                return;
        }
    }
}
