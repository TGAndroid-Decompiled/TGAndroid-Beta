package bi;

import android.text.TextUtils;
import di.ga;
import fi.f9;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.rn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class j implements x10 {
    public final int f3714a;
    public final Object f3715b;
    public final Object f3716c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f3714a = i7;
        this.d = obj;
        this.f3715b = obj2;
        this.f3716c = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        lc k10;
        fi.z5 z5Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull P0;
        int i10 = this.f3714a;
        int i11 = 0;
        boolean z10 = false;
        Object obj2 = this.f3716c;
        Object obj3 = this.f3715b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                y yVar = (y) obj4;
                yVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new e(yVar.getContext(), (org.telegram.ui.ActionBar.i6) obj2, yVar.f4199h2, (List) obj).show();
                return;
            case 1:
                m0 m0Var = (m0) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                List list = (List) obj;
                m0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (m0Var.f3837i2 != null) {
                    new e(m0Var.getContext(), i6Var, m0Var.f3837i2, list).show();
                    m0Var.dismiss();
                    return;
                }
                return;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                Boolean bool = (Boolean) obj3;
                String str2 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    i7 = 2131749620;
                } else if (bool.booleanValue()) {
                    i7 = 2131749617;
                } else {
                    i7 = 2131749618;
                }
                u4.s(tL_starGiftUnique, gd.a0(null, null, i7, str2));
                return;
            case 3:
                di.f6 f6Var = (di.f6) obj4;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                f6Var.w1(((Long) obj3).longValue(), new j(f6Var, bVar, (a2[]) obj2, 5));
                return;
            case 4:
                di.f6 f6Var2 = (di.f6) obj4;
                a2 a2Var = (a2) obj2;
                String str3 = (String) obj;
                ((vf.b) obj3).b();
                if (!org.telegram.ui.Wallet.u0.L(str3)) {
                    if (str3 != null) {
                        if (a2Var != null) {
                            k10 = new lc(a2Var.f30193c, f6Var2.J0);
                        } else {
                            k10 = f6Var2.k();
                        }
                        k10.f0(str3, false);
                        return;
                    }
                    if (a2Var != null) {
                        a2Var.dismiss();
                    }
                    f6Var2.dismiss();
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T instanceof org.telegram.ui.Wallet.n6) {
                        ((org.telegram.ui.Wallet.n6) T).T0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                di.f6 f6Var3 = (di.f6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((vf.b) obj3).b();
                ((a2[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new di.w2(1, f6Var3, tL_error));
                    return;
                } else {
                    f6Var3.dismiss();
                    return;
                }
            case 6:
                fi.g3 g3Var = (fi.g3) obj4;
                g3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                bv bvVar = new bv(((f9) obj3).f11966f, g3Var.getContext(), (org.telegram.ui.ActionBar.i6) obj2, arrayList2);
                fi.s3 s3Var = g3Var.A0.A1;
                if (s3Var != null) {
                    ((fi.w8) s3Var).h(bvVar);
                    return;
                }
                return;
            case 7:
                fi.r3 r3Var = (fi.r3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                x10 x10Var = (x10) obj;
                fi.z3 z3Var = r3Var.f12498x;
                if ((storyItem instanceof fi.y5) && (z5Var = ((fi.y5) storyItem).f12780a) != null) {
                    ga gaVar = new ga(z5Var, storyItem2, x10Var, 3);
                    if (z5Var.F != 0) {
                        ConnectionsManager.getInstance(z5Var.f12041c).cancelRequest(z5Var.F, true);
                        z5Var.F = 0;
                    }
                    z5Var.C = false;
                    z5Var.D = false;
                    z5Var.H(gaVar);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = mp.u1(z3Var.f12847m2).l1(storyItem.dialogId);
                tL_stories_getStoriesByID.f28649id.add(Integer.valueOf(storyItem.f28642id));
                ConnectionsManager.getInstance(z3Var.f12847m2).sendRequest(tL_stories_getStoriesByID, new m1(r3Var, storyItem, x10Var, 8));
                return;
            case 8:
                fi.i6 i6Var2 = (fi.i6) obj;
                fi.z3 z3Var2 = ((fi.r3) obj4).f12498x;
                z3Var2.C1.c(i6Var2.f12109a, z3Var2.l1, (TL_stories.StoryItem) obj3);
                n10.u(gd.a0(null, null, 2131744496, i6Var2.f12110b), new lc(z3Var2.M0, (org.telegram.ui.ActionBar.i6) obj2), 2131623990, 36);
                return;
            case 9:
                hi.k6 k6Var = (hi.k6) obj4;
                mp mpVar = (mp) obj3;
                String str4 = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    k6Var.a(null);
                    return;
                }
                TLObject g22 = mpVar.g2(l10.longValue());
                if (g22 instanceof TLRPC.User) {
                    k6Var.a(new hi.l6(str4, (TLRPC.User) g22));
                    return;
                } else if (g22 instanceof TLRPC.Chat) {
                    k6Var.a(new hi.m6(str4, (TLRPC.Chat) g22));
                    return;
                } else {
                    return;
                }
            case 10:
                x10 x10Var2 = (x10) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && x10Var2 != null) {
                    x10Var2.a(inputPeer);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    u1Var.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = mp.u1(g8Var.f30187a).l1(j10.i(g8Var.f30187a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                ConnectionsManager.getInstance(g8Var.f30187a).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.u7(12, g8Var, u1Var));
                return;
            case 12:
                rn rnVar = (rn) obj4;
                bn bnVar = (bn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l11 = (Long) obj;
                if (bnVar.c()) {
                    org.telegram.ui.Components.b5.I(bnVar.getParentActivity(), bnVar.a(), new a3.h(rnVar, tL_messageMediaToDo, l11, 29));
                    return;
                }
                rnVar.f39227k0.d(tL_messageMediaToDo, null, null, null, true, 0, l11.longValue());
                rnVar.f36766b.a(true);
                return;
            case 13:
                px pxVar = (px) obj4;
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
                        TLRPC.TL_messages_stickerSet n02 = ri.d0(pxVar.f38591a.G.f39345d1).n0(ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (n02 != null) {
                            arrayList = n02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new kx(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 14:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj3;
                lw0 lw0Var = (lw0) obj2;
                ((org.telegram.ui.ActionBar.u1) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    u1Var2.dismiss();
                    return;
                }
                lw0Var.setErrorText(".");
                org.telegram.messenger.g0.E3(-6.0f, lw0Var, null);
                org.telegram.messenger.q2.APP_ERROR.a();
                org.telegram.messenger.g0.I3(lw0Var);
                return;
            case 15:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                String str5 = (String) obj3;
                fi.f7 f7Var = (fi.f7) obj2;
                Boolean bool2 = (Boolean) obj;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool2.booleanValue()) {
                        if (TextUtils.isEmpty(str5)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    v0Var.x(f7Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ug.l0 l0Var = (ug.l0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((n80) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    l0Var.X1.boosts++;
                    if (l0Var.d2 == 32 && (P0 = mp.u1(l0Var.f30187a).P0(-l0Var.W1)) != null) {
                        P0.boosts_applied++;
                    }
                    l0Var.u1();
                    l0Var.A1(tL_premium_boostsStatus, l0Var.f58729a2);
                    org.telegram.messenger.g3 g3Var2 = l0Var.Y1;
                    if (l0Var.X1.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    g3Var2.f24162m = z10;
                    g3Var2.f24161l = true;
                    g3Var2.a(tL_premium_myBoosts);
                    l0Var.w1();
                    return;
                }
                return;
        }
    }
}
