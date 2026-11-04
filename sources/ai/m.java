package ai;

import android.text.TextUtils;
import ei.i9;
import ei.p7;
import ei.r9;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xw;
import org.telegram.ui.Components.z7;
import org.telegram.ui.wm;
public final class m implements u10 {
    public final int f789a;
    public final Object f790b;
    public final Object f791c;
    public final Object d;

    public m(Object obj, Object obj2, Object obj3, int i3) {
        this.f789a = i3;
        this.d = obj;
        this.f790b = obj2;
        this.f791c = obj3;
    }

    @Override
    public final void a(Object obj) {
        ei.k6 k6Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull N0;
        int i3 = this.f789a;
        int i10 = 0;
        boolean z10 = false;
        Object obj2 = this.f791c;
        Object obj3 = this.f790b;
        Object obj4 = this.d;
        switch (i3) {
            case 0:
                e0 e0Var = (e0) obj4;
                e0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                new g(e0Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2, e0Var.f599e2, (List) obj).show();
                return;
            case 1:
                s0 s0Var = (s0) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                List list = (List) obj;
                s0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (s0Var.f962f2 != null) {
                    new g(s0Var.getContext(), e6Var, s0Var.f962f2, list).show();
                    s0Var.dismiss();
                    return;
                }
                return;
            case 2:
                ci.l6 l6Var = (ci.l6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((sf.b) obj3).b();
                ((xg.e1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new ci.e0(7, l6Var, tL_error));
                    return;
                } else {
                    l6Var.dismiss();
                    return;
                }
            case 3:
                ei.q3 q3Var = (ei.q3) obj4;
                q3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                pu puVar = new pu(((r9) obj3).f10922f, q3Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2, arrayList2);
                ei.c4 c4Var = q3Var.A0.A1;
                if (c4Var != null) {
                    ((i9) c4Var).h(puVar);
                    return;
                }
                return;
            case 4:
                ei.b4 b4Var = (ei.b4) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                u10 u10Var = (u10) obj;
                ei.j4 j4Var = b4Var.f10126x;
                if ((storyItem instanceof ei.j6) && (k6Var = ((ei.j6) storyItem).f10551a) != null) {
                    k3 k3Var = new k3(k6Var, storyItem2, u10Var, 26);
                    if (k6Var.F != 0) {
                        ConnectionsManager.getInstance(k6Var.f10872c).cancelRequest(k6Var.F, true);
                        k6Var.F = 0;
                    }
                    k6Var.C = false;
                    k6Var.D = false;
                    k6Var.H(k3Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = hp.s1(j4Var.f10480m2).j1(storyItem.dialogId);
                tL_stories_getStoriesByID.f27247id.add(Integer.valueOf(storyItem.f27240id));
                ConnectionsManager.getInstance(j4Var.f10480m2).sendRequest(tL_stories_getStoriesByID, new r6(b4Var, storyItem, u10Var, 6));
                return;
            case 5:
                ei.s6 s6Var = (ei.s6) obj;
                ei.j4 j4Var2 = ((ei.b4) obj4).f10126x;
                j4Var2.C1.c(s6Var.f11008a, j4Var2.f10477l1, (TL_stories.StoryItem) obj3);
                org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131744741, s6Var.f11009b), new fc(j4Var2.M0, (org.telegram.ui.ActionBar.e6) obj2), 2131623989, 36);
                return;
            case 6:
                gi.n6 n6Var = (gi.n6) obj4;
                hp hpVar = (hp) obj3;
                String str2 = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    n6Var.a(null);
                    return;
                }
                TLObject e22 = hpVar.e2(l10.longValue());
                if (e22 instanceof TLRPC.User) {
                    n6Var.a(new gi.o6(str2, (TLRPC.User) e22));
                    return;
                } else if (e22 instanceof TLRPC.Chat) {
                    n6Var.a(new gi.p6(str2, (TLRPC.Chat) e22));
                    return;
                } else {
                    return;
                }
            case 7:
                u10 u10Var2 = (u10) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.s1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && u10Var2 != null) {
                    u10Var2.a(inputPeer);
                    return;
                }
                return;
            case 8:
                z7 z7Var = (z7) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    s1Var.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = hp.s1(z7Var.f28583a).j1(h10.i(z7Var.f28583a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                ConnectionsManager.getInstance(z7Var.f28583a).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.ActionBar.h6(13, z7Var, s1Var));
                return;
            case 9:
                an anVar = (an) obj4;
                wm wmVar = (wm) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l11 = (Long) obj;
                if (wmVar.c()) {
                    org.telegram.ui.Components.t4.K(wmVar.getParentActivity(), wmVar.a(), new aa.a(anVar, tL_messageMediaToDo, l11, 28));
                    return;
                }
                anVar.f31924k0.c(tL_messageMediaToDo, null, null, null, true, 0, l11.longValue());
                anVar.f38416b.a(true);
                return;
            case 10:
                dx dxVar = (dx) obj4;
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
                        TLRPC.TL_messages_stickerSet l02 = li.b0(dxVar.f33204a.G.f33529d1).l0(li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new xw(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) obj3;
                aw0 aw0Var = (aw0) obj2;
                ((org.telegram.ui.ActionBar.s1) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    s1Var2.dismiss();
                    return;
                }
                aw0Var.setErrorText(".");
                org.telegram.messenger.g0.G3(-6.0f, aw0Var, null);
                org.telegram.messenger.p2.APP_ERROR.a();
                org.telegram.messenger.g0.K3(aw0Var);
                return;
            case 12:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj4;
                String str3 = (String) obj3;
                p7 p7Var = (p7) obj2;
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
                    w0Var.x(p7Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                vg.i0 i0Var = (vg.i0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((v70) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    i0Var.U1.boosts++;
                    if (i0Var.f56651a2 == 32 && (N0 = hp.s1(i0Var.f28583a).N0(-i0Var.T1)) != null) {
                        N0.boosts_applied++;
                    }
                    i0Var.t1();
                    i0Var.z1(tL_premium_boostsStatus, i0Var.X1);
                    org.telegram.messenger.e3 e3Var = i0Var.V1;
                    if (i0Var.U1.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    e3Var.f22309m = z10;
                    e3Var.f22308l = true;
                    e3Var.a(tL_premium_myBoosts);
                    i0Var.v1();
                    return;
                }
                return;
        }
    }
}
