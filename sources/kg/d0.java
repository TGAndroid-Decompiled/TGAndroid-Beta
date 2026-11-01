package kg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h3;
import org.telegram.messenger.r20;
import org.telegram.messenger.t2;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tx;
import org.telegram.ui.Components.w7;
import org.telegram.ui.un;
import rh.e4;
import rh.l5;
import th.f7;
import th.o7;
import th.p4;
import th.q4;
import th.u2;
import th.v2;
import th.y4;
import th.z2;
import vh.w4;
import vh.x4;
public final class d0 implements r20 {
    public final int f11027a;
    public final Object f11028b;
    public final Object f11029c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f11027a = i10;
        this.f11028b = obj;
        this.f11029c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.ChatFull M0;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        q4 q4Var;
        int i10 = this.f11027a;
        boolean z10 = false;
        int i11 = 0;
        Object obj2 = this.d;
        Object obj3 = this.f11029c;
        Object obj4 = this.f11028b;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((s80) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    q0Var.T1.boosts++;
                    if (q0Var.Z1 == 32 && (M0 = wp.r1(q0Var.f21584a).M0(-q0Var.S1)) != null) {
                        M0.boosts_applied++;
                    }
                    q0Var.t1();
                    q0Var.z1(tL_premium_boostsStatus, q0Var.W1);
                    h3 h3Var = q0Var.U1;
                    if (q0Var.T1.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    h3Var.f16014m = z10;
                    h3Var.f16013l = true;
                    h3Var.a(tL_premium_myBoosts);
                    q0Var.v1();
                    return;
                }
                return;
            case 1:
                w7 w7Var = (w7) obj4;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    x1Var.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = wp.r1(w7Var.f21584a).i1(e20.i(w7Var.f21584a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                ConnectionsManager.getInstance(w7Var.f21584a).sendRequest(tL_messages_uploadMedia, new ag.k0(24, w7Var, x1Var));
                return;
            case 2:
                jn jnVar = (jn) obj4;
                un unVar = (un) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l4 = (Long) obj;
                if (unVar.c()) {
                    s4.K(unVar.getParentActivity(), unVar.a(), new androidx.car.app.utils.a(jnVar, tL_messageMediaToDo, l4, 20));
                    return;
                }
                jnVar.f27494j0.e(tL_messageMediaToDo, null, null, null, true, 0, l4.longValue());
                jnVar.f30964b.a(true);
                return;
            case 3:
                tx txVar = (tx) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i11 < size) {
                    Object obj5 = arrayList3.get(i11);
                    i11++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet l02 = vi.b0(txVar.f30727a.F.f31943c1).l0(vi.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList2.add(new nx(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 4:
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) obj3;
                gx0 gx0Var = (gx0) obj2;
                ((org.telegram.ui.ActionBar.x1) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    x1Var2.dismiss();
                    return;
                }
                gx0Var.setErrorText(".");
                org.telegram.messenger.i0.F3(-6.0f, gx0Var, null);
                t2.APP_ERROR.a();
                org.telegram.messenger.i0.J3(gx0Var);
                return;
            case 5:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                String str2 = (String) obj3;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj2;
                Boolean bool = (Boolean) obj;
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
                    z0Var.y(x0Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 6:
                ph.m mVar = (ph.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new ph.c(mVar.getContext(), (p6) obj2, mVar.f45227d2, (List) obj).show();
                return;
            case 7:
                ph.w wVar = (ph.w) obj4;
                p6 p6Var = (p6) obj2;
                List list = (List) obj;
                wVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (wVar.f45351e2 != null) {
                    new ph.c(wVar.getContext(), p6Var, wVar.f45351e2, list).show();
                    wVar.dismiss();
                    return;
                }
                return;
            case 8:
                e4 e4Var = (e4) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((gf.e) obj3).b();
                ((mg.i2[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new rh.n(7, e4Var, tL_error));
                    return;
                } else {
                    e4Var.dismiss();
                    return;
                }
            case 9:
                th.k2 k2Var = (th.k2) obj4;
                k2Var.getClass();
                ArrayList arrayList4 = new ArrayList(1);
                arrayList4.add((TLRPC.InputStickerSet) obj);
                cv cvVar = new cv(((o7) obj3).f49317f, k2Var.getContext(), (p6) obj2, arrayList4);
                v2 v2Var = k2Var.f49156z0.f49797z1;
                if (v2Var != null) {
                    ((f7) v2Var).h(cvVar);
                    return;
                }
                return;
            case 10:
                u2 u2Var = (u2) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                r20 r20Var = (r20) obj;
                z2 z2Var = u2Var.f49526x;
                if ((storyItem instanceof p4) && (q4Var = ((p4) storyItem).f49382a) != null) {
                    l5 l5Var = new l5(q4Var, storyItem2, r20Var, 5);
                    if (q4Var.F != 0) {
                        ConnectionsManager.getInstance(q4Var.f49647c).cancelRequest(q4Var.F, true);
                        q4Var.F = 0;
                    }
                    q4Var.C = false;
                    q4Var.D = false;
                    q4Var.H(l5Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = wp.r1(z2Var.f49744l2).i1(storyItem.dialogId);
                tL_stories_getStoriesByID.f20039id.add(Integer.valueOf(storyItem.f20032id));
                ConnectionsManager.getInstance(z2Var.f49744l2).sendRequest(tL_stories_getStoriesByID, new ag.p0(u2Var, storyItem, r20Var, 23));
                return;
            case 11:
                y4 y4Var = (y4) obj;
                z2 z2Var2 = ((u2) obj4).f49526x;
                z2Var2.B1.c(y4Var.f49694a, z2Var2.f49740k1, (TL_stories.StoryItem) obj3);
                a30.s(dd.a0(null, null, 2131744749, y4Var.f49695b), new cc(z2Var2.L0, (p6) obj2), 2131623989, 36);
                return;
            case 12:
                w4 w4Var = (w4) obj4;
                wp wpVar = (wp) obj3;
                String str3 = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    w4Var.a(null);
                    return;
                }
                TLObject d22 = wpVar.d2(l10.longValue());
                if (d22 instanceof TLRPC.User) {
                    w4Var.a(new x4(str3, (TLRPC.User) d22));
                    return;
                } else if (d22 instanceof TLRPC.Chat) {
                    w4Var.a(new vh.y4(str3, (TLRPC.Chat) d22));
                    return;
                } else {
                    return;
                }
            default:
                r20 r20Var2 = (r20) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.x1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && r20Var2 != null) {
                    r20Var2.a(inputPeer);
                    return;
                }
                return;
        }
    }
}
