package bi;

import android.text.TextUtils;
import fi.i7;
import fi.i9;
import fi.z8;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.y7;
import org.telegram.ui.an;
import org.telegram.ui.v7;
public final class j implements z10 {
    public final int f3624a;
    public final Object f3625b;
    public final Object f3626c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f3624a = i7;
        this.d = obj;
        this.f3625b = obj2;
        this.f3626c = obj3;
    }

    @Override
    public final void a(Object obj) {
        fi.c6 c6Var;
        ArrayList<TLRPC.Document> arrayList;
        String str;
        TLRPC.ChatFull N0;
        int i7 = this.f3624a;
        int i10 = 0;
        boolean z10 = false;
        Object obj2 = this.f3626c;
        Object obj3 = this.f3625b;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                y yVar = (y) obj4;
                yVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new e(yVar.getContext(), (org.telegram.ui.ActionBar.e6) obj2, yVar.f3994h2, (List) obj).show();
                return;
            case 1:
                m0 m0Var = (m0) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                List list = (List) obj;
                m0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (m0Var.f3695i2 != null) {
                    new e(m0Var.getContext(), e6Var, m0Var.f3695i2, list).show();
                    m0Var.dismiss();
                    return;
                }
                return;
            case 2:
                di.c6 c6Var2 = (di.c6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((vf.b) obj3).b();
                ((wg.c1[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new di.s2(2, c6Var2, tL_error));
                    return;
                } else {
                    c6Var2.dismiss();
                    return;
                }
            case 3:
                fi.i3 i3Var = (fi.i3) obj4;
                i3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                wu wuVar = new wu(((i9) obj3).f11844f, i3Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2, arrayList2);
                fi.u3 u3Var = i3Var.A0.A1;
                if (u3Var != null) {
                    ((z8) u3Var).h(wuVar);
                    return;
                }
                return;
            case 4:
                fi.t3 t3Var = (fi.t3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                z10 z10Var = (z10) obj;
                fi.b4 b4Var = t3Var.f12360x;
                if ((storyItem instanceof fi.b6) && (c6Var = ((fi.b6) storyItem).f11567a) != null) {
                    aa.r rVar = new aa.r(c6Var, storyItem2, z10Var, 29);
                    if (c6Var.F != 0) {
                        ConnectionsManager.getInstance(c6Var.f11940c).cancelRequest(c6Var.F, true);
                        c6Var.F = 0;
                    }
                    c6Var.C = false;
                    c6Var.D = false;
                    c6Var.H(rVar);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = np.s1(b4Var.f11497m2).j1(storyItem.dialogId);
                tL_stories_getStoriesByID.f28297id.add(Integer.valueOf(storyItem.f28290id));
                ConnectionsManager.getInstance(b4Var.f11497m2).sendRequest(tL_stories_getStoriesByID, new j6(t3Var, storyItem, z10Var, 6));
                return;
            case 5:
                fi.l6 l6Var = (fi.l6) obj;
                fi.b4 b4Var2 = ((fi.t3) obj4).f12360x;
                b4Var2.C1.c(l6Var.f11998a, b4Var2.l1, (TL_stories.StoryItem) obj3);
                i20.t(hd.a0(null, null, 2131744731, l6Var.f11999b), new cc(b4Var2.M0, (org.telegram.ui.ActionBar.e6) obj2), 2131623990, 36);
                return;
            case 6:
                hi.l6 l6Var2 = (hi.l6) obj4;
                np npVar = (np) obj3;
                String str2 = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    l6Var2.a(null);
                    return;
                }
                TLObject e22 = npVar.e2(l10.longValue());
                if (e22 instanceof TLRPC.User) {
                    l6Var2.a(new hi.m6(str2, (TLRPC.User) e22));
                    return;
                } else if (e22 instanceof TLRPC.Chat) {
                    l6Var2.a(new hi.n6(str2, (TLRPC.Chat) e22));
                    return;
                } else {
                    return;
                }
            case 7:
                z10 z10Var2 = (z10) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.t1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && z10Var2 != null) {
                    z10Var2.a(inputPeer);
                    return;
                }
                return;
            case 8:
                y7 y7Var = (y7) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    t1Var.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = np.s1(y7Var.f29679a).j1(m10.i(y7Var.f29679a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                ConnectionsManager.getInstance(y7Var.f29679a).sendRequest(tL_messages_uploadMedia, new v7(12, y7Var, t1Var));
                return;
            case 9:
                jn jnVar = (jn) obj4;
                an anVar = (an) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l11 = (Long) obj;
                if (anVar.c()) {
                    org.telegram.ui.Components.t4.I(anVar.getParentActivity(), anVar.a(), new a3.h(jnVar, tL_messageMediaToDo, l11, 29));
                    return;
                }
                jnVar.f36082k0.c(tL_messageMediaToDo, null, null, null, true, 0, l11.longValue());
                jnVar.f33609b.a(true);
                return;
            case 10:
                kx kxVar = (kx) obj4;
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
                        TLRPC.TL_messages_stickerSet l02 = si.b0(kxVar.f36635a.G.f36941d1).l0(si.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (l02 != null) {
                            arrayList = l02.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ex(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) obj3;
                ew0 ew0Var = (ew0) obj2;
                ((org.telegram.ui.ActionBar.t1) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    t1Var2.dismiss();
                    return;
                }
                ew0Var.setErrorText(".");
                org.telegram.messenger.g0.F3(-6.0f, ew0Var, null);
                org.telegram.messenger.p2.APP_ERROR.a();
                org.telegram.messenger.g0.J3(ew0Var);
                return;
            case 12:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                String str3 = (String) obj3;
                i7 i7Var = (i7) obj2;
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
                    v0Var.x(i7Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ug.j0 j0Var = (ug.j0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((c80) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.X1.boosts++;
                    if (j0Var.d2 == 32 && (N0 = np.s1(j0Var.f29679a).N0(-j0Var.W1)) != null) {
                        N0.boosts_applied++;
                    }
                    j0Var.t1();
                    j0Var.z1(tL_premium_boostsStatus, j0Var.f58130a2);
                    org.telegram.messenger.e3 e3Var = j0Var.Y1;
                    if (j0Var.X1.next_level_boosts <= 0) {
                        z10 = true;
                    }
                    e3Var.f23264m = z10;
                    e3Var.f23263l = true;
                    e3Var.a(tL_premium_myBoosts);
                    j0Var.v1();
                    return;
                }
                return;
        }
    }
}
