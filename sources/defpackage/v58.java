package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class v58 implements pcc {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public v58(gtc gtcVar, pcc pccVar, c cVar, k35 k35Var) {
        this.a = (byte) 14;
        this.b = gtcVar;
        this.c = pccVar;
        this.d = k35Var;
    }

    @Override
    public final void a(Object obj) {
        o5b o5bVar;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        d31 j;
        String str;
        byte b = this.a;
        int i = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                y58 y58Var = (y58) obj4;
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                ly3 ly3Var = new ly3(((lcb) obj3).f, y58Var.getContext(), (x53) obj2, arrayList2);
                k68 k68Var = y58Var.z0.A1;
                if (k68Var != null) {
                    ((ccb) k68Var).h(ly3Var);
                    return;
                }
                return;
            case 1:
                j68 j68Var = (j68) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                pcc pccVar = (pcc) obj;
                o68 o68Var = j68Var.x;
                if ((storyItem instanceof n5b) && (o5bVar = ((n5b) storyItem).a) != null) {
                    fd7 fd7Var = new fd7(o5bVar, storyItem2, pccVar, (byte) 25);
                    if (o5bVar.F != 0) {
                        ConnectionsManager.getInstance(o5bVar.c).cancelRequest(o5bVar.F, true);
                        o5bVar.F = 0;
                    }
                    o5bVar.C = false;
                    o5bVar.D = false;
                    o5bVar.H(fd7Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = uc7.s1(o68Var.m2).j1(storyItem.dialogId);
                tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                ConnectionsManager.getInstance(o68Var.m2).sendRequest(tL_stories_getStoriesByID, new m65(j68Var, storyItem, pccVar, (byte) 27));
                return;
            case 2:
                v5b v5bVar = (v5b) obj;
                o68 o68Var2 = ((j68) obj4).x;
                o68Var2.C1.b(v5bVar.a, o68Var2.l1, (TL_stories.StoryItem) obj3);
                c00.v(ob6.a0(null, null, 2131744388, v5bVar.b), new d31(o68Var2.M0, (x53) obj2), 2131623990, 36);
                return;
            case 3:
                ks8 ks8Var = (ks8) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document j2 = n1a.j(tL_messages_stickerSet, num + "️⃣");
                    if (j2 == null) {
                        j2 = n1a.j(tL_messages_stickerSet, num + "⃣");
                    }
                    if (j2 == null) {
                        String[] strArr = ns8.s;
                        cc4.d("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        return;
                    }
                    hashMap.put(num, j2);
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    ks8Var.e.add(imageReceiver);
                    imageReceiver.h1 = new ls8(new Runnable[]{new hp8(ks8Var, imageReceiver, (byte) 14)});
                    imageReceiver.d0(jn5.b((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.I();
                    hashMap2.put(num2, imageReceiver);
                }
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    Integer num3 = (Integer) arrayList3.get(i2);
                    num3.getClass();
                    ks8Var.d.add((ms8) hashMap2.get(num3));
                }
                ks8Var.g[0] = true;
                ks8Var.a();
                return;
            case 4:
                zt9 zt9Var = (zt9) obj4;
                uc7 uc7Var = (uc7) obj3;
                String str2 = (String) obj2;
                Long l = (Long) obj;
                if (l == null) {
                    zt9Var.a(null);
                    return;
                }
                TLObject b2 = uc7Var.b2(l.longValue());
                if (b2 instanceof TLRPC.User) {
                    zt9Var.a(new au9(str2, (TLRPC.User) b2));
                    return;
                } else if (b2 instanceof TLRPC.Chat) {
                    zt9Var.a(new bu9(str2, (TLRPC.Chat) b2));
                    return;
                } else {
                    return;
                }
            case 5:
                ArrayList arrayList4 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i3 = ((n1a) obj4).W;
                ArrayList t0 = ls6.d0(i3).t0(5);
                HashSet hashSet = new HashSet();
                String I3 = hl.I3((String) obj3);
                String concat = " ".concat(I3);
                if (t0 != null) {
                    for (int i4 = 0; i4 < t0.size(); i4++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t0.get(i4);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String I32 = hl.I3(tL_messages_stickerSet2.set.title);
                            if (I32.startsWith(I3) || I32.contains(concat)) {
                                arrayList4.add(new k1a(I32));
                                arrayList4.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList5 = ls6.d0(i3).t0[1];
                if (arrayList5 != null) {
                    while (i < arrayList5.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList5.get(i);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                            String I33 = hl.I3(stickerSetCovered.set.title);
                            if (I33.startsWith(I3) || I33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet m0 = ls6.d0(i3).m0(ls6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    if (m0 != null) {
                                        arrayList = m0.documents;
                                    } else {
                                        arrayList = null;
                                    }
                                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                } else {
                                    arrayList = stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList4.add(new k1a(stickerSetCovered.set.title));
                                    arrayList4.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                }
                            }
                        }
                        i++;
                    }
                }
                runnable.run();
                return;
            case 6:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                wl.g(((n1a) obj4).W).f(arrayList6);
                int size = arrayList6.size();
                while (i < size) {
                    Object obj5 = arrayList6.get(i);
                    i++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).id));
                }
                runnable2.run();
                return;
            case 7:
                wua wuaVar = (wua) obj4;
                l01 l01Var = (l01) obj;
                l01Var.d();
                wuaVar.l1(((Long) obj3).longValue(), new v58(wuaVar, l01Var, (bx4[]) obj2, (byte) 9));
                return;
            case 8:
                wua wuaVar2 = (wua) obj4;
                bx4 bx4Var = (bx4) obj2;
                String str3 = (String) obj;
                ((l01) obj3).b();
                if (!c.K(str3)) {
                    if (str3 != null) {
                        if (bx4Var != null) {
                            j = new d31(bx4Var.c, wuaVar2.J0);
                        } else {
                            j = wuaVar2.j();
                        }
                        j.f0(str3, false);
                        return;
                    }
                    if (bx4Var != null) {
                        bx4Var.dismiss();
                    }
                    wuaVar2.dismiss();
                    e S = LaunchActivity.S();
                    if (S instanceof uqc) {
                        ((uqc) S).S0();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                wua wuaVar3 = (wua) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((l01) obj3).b();
                ((bx4[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    hl.c3(new ida(wuaVar3, tL_error, (byte) 13));
                    return;
                } else {
                    wuaVar3.dismiss();
                    return;
                }
            case 10:
                id idVar = (id) obj3;
                v4b v4bVar = (v4b) obj2;
                ((id) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    idVar.dismiss();
                    return;
                }
                v4bVar.setErrorText(".");
                hl.A3(-6.0f, v4bVar, null);
                yw0.APP_ERROR.a();
                hl.E3(v4bVar);
                return;
            case 11:
                pcc pccVar2 = (pcc) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((id) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    pccVar2.a(inputPeer);
                    return;
                }
                return;
            case 12:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                cg5 cg5Var = (cg5) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    cg5Var.a(wallettransaction2);
                    return;
                }
                return;
            case 13:
                jl7[] jl7VarArr = (jl7[]) obj3;
                vnb vnbVar = (vnb) obj2;
                String str4 = (String) obj;
                ((c51) obj4).setLoading(false);
                if (!c.K(str4)) {
                    if (!TextUtils.isEmpty(str4)) {
                        new d31(jl7VarArr[0].F, vnbVar).f0(str4, false);
                        return;
                    } else {
                        jl7VarArr[0].dismiss();
                        return;
                    }
                }
                return;
            case 14:
                ((gtc) obj4).e0((pcc) obj3, (k35) obj2, (c35) obj);
                return;
            case 15:
                muc mucVar = (muc) obj4;
                c cVar = (c) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!mucVar.r) {
                    if (!TextUtils.isEmpty(str5) && c.b(mucVar.f, cVar.x())) {
                        u25 u25Var = new u25(cVar, str5, mucVar.e, null, new nu0(mucVar, cVar, user, str5));
                        cVar.A0(u25Var);
                        mucVar.n = new rj4(u25Var, (byte) 22);
                        return;
                    }
                    mucVar.h = false;
                    mucVar.a0.setLoading(false);
                    d31 b0 = d31.b0(mucVar);
                    if (TextUtils.isEmpty(str5)) {
                        str = ob6.M0(2131742670, null);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    b0.f0(str, false);
                    return;
                }
                return;
            case 16:
                ((bv8) ((View) obj)).C((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                return;
            default:
                jl7 jl7Var = (jl7) obj3;
                vnb vnbVar2 = (vnb) obj2;
                String str6 = (String) obj;
                ((c51) obj4).setLoading(false);
                if (str6 == null) {
                    jl7Var.dismiss();
                    return;
                } else {
                    d31.d0(str6, jl7Var.F, vnbVar2);
                    return;
                }
        }
    }

    public v58(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
