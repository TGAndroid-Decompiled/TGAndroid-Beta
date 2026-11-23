package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.qn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class j implements w10 {
    public final int f3709a;
    public final Object f3710b;
    public final Object f3711c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f3709a = i7;
        this.d = obj;
        this.f3710b = obj2;
        this.f3711c = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        kc k10;
        fi.a6 a6Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull P0;
        int i10 = this.f3709a;
        int i11 = 0;
        boolean z10 = false;
        Object obj2 = this.f3711c;
        Object obj3 = this.f3710b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                y yVar = (y) obj4;
                yVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new e(yVar.getContext(), (org.telegram.ui.ActionBar.i6) obj2, yVar.f4229h2, (List) obj).show();
                return;
            case 1:
                m0 m0Var = (m0) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                List list = (List) obj;
                m0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (m0Var.f3826i2 != null) {
                    new e(m0Var.getContext(), i6Var, m0Var.f3826i2, list).show();
                    m0Var.dismiss();
                    return;
                }
                return;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                Boolean bool = (Boolean) obj3;
                String str2 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    i7 = 2131749619;
                } else if (bool.booleanValue()) {
                    i7 = 2131749616;
                } else {
                    i7 = 2131749617;
                }
                a5.s(tL_starGiftUnique, gd.a0(null, null, i7, str2));
                return;
            case 3:
                di.f6 f6Var = (di.f6) obj4;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                f6Var.w1(((Long) obj3).longValue(), new j(f6Var, bVar, (f2[]) obj2, 5));
                return;
            case 4:
                di.f6 f6Var2 = (di.f6) obj4;
                f2 f2Var = (f2) obj2;
                String str3 = (String) obj;
                ((vf.b) obj3).b();
                if (!org.telegram.ui.Wallet.v0.L(str3)) {
                    if (str3 != null) {
                        if (f2Var != null) {
                            k10 = new kc(f2Var.f30229c, f6Var2.J0);
                        } else {
                            k10 = f6Var2.k();
                        }
                        k10.f0(str3, false);
                        return;
                    }
                    if (f2Var != null) {
                        f2Var.dismiss();
                    }
                    f6Var2.dismiss();
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T instanceof org.telegram.ui.Wallet.o6) {
                        ((org.telegram.ui.Wallet.o6) T).T0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                di.f6 f6Var3 = (di.f6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((vf.b) obj3).b();
                ((f2[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new di.f2(3, f6Var3, tL_error));
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
                bv bvVar = new bv(((fi.f9) obj3).f11972f, g3Var.getContext(), (org.telegram.ui.ActionBar.i6) obj2, arrayList2);
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
                w10 w10Var = (w10) obj;
                fi.z3 z3Var = r3Var.f12494x;
                if ((storyItem instanceof fi.z5) && (a6Var = ((fi.z5) storyItem).f12910a) != null) {
                    di.a8 a8Var = new di.a8(a6Var, storyItem2, w10Var, 4);
                    if (a6Var.F != 0) {
                        ConnectionsManager.getInstance(a6Var.f12047c).cancelRequest(a6Var.F, true);
                        a6Var.F = 0;
                    }
                    a6Var.C = false;
                    a6Var.D = false;
                    a6Var.H(a8Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = mp.u1(z3Var.f12853m2).l1(storyItem.dialogId);
                tL_stories_getStoriesByID.f28738id.add(Integer.valueOf(storyItem.f28731id));
                ConnectionsManager.getInstance(z3Var.f12853m2).sendRequest(tL_stories_getStoriesByID, new q1(r3Var, storyItem, w10Var, 8));
                return;
            case 8:
                fi.i6 i6Var2 = (fi.i6) obj;
                fi.z3 z3Var2 = ((fi.r3) obj4).f12494x;
                z3Var2.C1.c(i6Var2.f12106a, z3Var2.l1, (TL_stories.StoryItem) obj3);
                m10.u(gd.a0(null, null, 2131744490, i6Var2.f12107b), new kc(z3Var2.M0, (org.telegram.ui.ActionBar.i6) obj2), 2131623990, 36);
                return;
            case 9:
                hi.t6 t6Var = (hi.t6) obj4;
                mp mpVar = (mp) obj3;
                String str4 = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    t6Var.a(null);
                    return;
                }
                TLObject g22 = mpVar.g2(l10.longValue());
                if (g22 instanceof TLRPC.User) {
                    t6Var.a(new hi.u6(str4, (TLRPC.User) g22));
                    return;
                } else if (g22 instanceof TLRPC.Chat) {
                    t6Var.a(new hi.v6(str4, (TLRPC.Chat) g22));
                    return;
                } else {
                    return;
                }
            case 10:
                w10 w10Var2 = (w10) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.t1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && w10Var2 != null) {
                    w10Var2.a(inputPeer);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    t1Var.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = mp.u1(e8Var.f30223a).l1(i10.i(e8Var.f30223a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                ConnectionsManager.getInstance(e8Var.f30223a).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.v7(12, e8Var, t1Var));
                return;
            case 12:
                qn qnVar = (qn) obj4;
                bn bnVar = (bn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l11 = (Long) obj;
                if (bnVar.c()) {
                    org.telegram.ui.Components.b5.I(bnVar.getParentActivity(), bnVar.a(), new a3.h(qnVar, tL_messageMediaToDo, l11, 29));
                    return;
                }
                qnVar.f38929k0.c(tL_messageMediaToDo, null, null, null, true, 0, l11.longValue());
                qnVar.f37135b.a(true);
                return;
            case 13:
                ox oxVar = (ox) obj4;
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
                        TLRPC.TL_messages_stickerSet n02 = ri.d0(oxVar.f38273a.G.f39047d1).n0(ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (n02 != null) {
                            arrayList = n02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new jx(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 14:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) obj3;
                mw0 mw0Var = (mw0) obj2;
                ((org.telegram.ui.ActionBar.t1) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    t1Var2.dismiss();
                    return;
                }
                mw0Var.setErrorText(".");
                org.telegram.messenger.g0.E3(-6.0f, mw0Var, null);
                org.telegram.messenger.q2.APP_ERROR.a();
                org.telegram.messenger.g0.I3(mw0Var);
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
                ug.k0 k0Var = (ug.k0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((m80) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    k0Var.X1.boosts++;
                    if (k0Var.d2 == 32 && (P0 = mp.u1(k0Var.f30223a).P0(-k0Var.W1)) != null) {
                        P0.boosts_applied++;
                    }
                    k0Var.u1();
                    k0Var.A1(tL_premium_boostsStatus, k0Var.f58848a2);
                    org.telegram.messenger.g3 g3Var2 = k0Var.Y1;
                    if (k0Var.X1.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    g3Var2.f24264m = z10;
                    g3Var2.f24263l = true;
                    g3Var2.a(tL_premium_myBoosts);
                    k0Var.w1();
                    return;
                }
                return;
        }
    }
}
