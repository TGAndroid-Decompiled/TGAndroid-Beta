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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class i48 implements qac {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public i48(vqc vqcVar, qac qacVar, c cVar, g35 g35Var) {
        this.a = (byte) 14;
        this.b = vqcVar;
        this.c = qacVar;
        this.d = g35Var;
    }

    @Override
    public final void a(Object obj) {
        t3b t3bVar;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        c41 j;
        String str;
        byte b = this.a;
        int i = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                l48 l48Var = (l48) obj4;
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                az3 az3Var = new az3(((oab) obj3).f, l48Var.getContext(), (r63) obj2, arrayList2);
                w48 w48Var = l48Var.z0.G1;
                if (w48Var != null) {
                    ((fab) w48Var).h(az3Var);
                    return;
                }
                return;
            case 1:
                v48 v48Var = (v48) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                qac qacVar = (qac) obj;
                a58 a58Var = v48Var.x;
                if ((storyItem instanceof s3b) && (t3bVar = ((s3b) storyItem).a) != null) {
                    ud7 ud7Var = new ud7(t3bVar, storyItem2, qacVar, (byte) 21);
                    if (t3bVar.F != 0) {
                        ConnectionsManager.getInstance(t3bVar.c).cancelRequest(t3bVar.F, true);
                        t3bVar.F = 0;
                    }
                    t3bVar.C = false;
                    t3bVar.D = false;
                    t3bVar.H(ud7Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = oc7.r1(a58Var.s2).i1(storyItem.dialogId);
                tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                ConnectionsManager.getInstance(a58Var.s2).sendRequest(tL_stories_getStoriesByID, new i65(v48Var, storyItem, qacVar, (byte) 27));
                return;
            case 2:
                a4b a4bVar = (a4b) obj;
                a58 a58Var2 = ((v48) obj4).x;
                a58Var2.I1.b(a4bVar.a, a58Var2.r1, (TL_stories.StoryItem) obj3);
                b10.u(jb6.a0(null, null, 2131744420, a4bVar.b), new c41(a58Var2.S0, (r63) obj2), 2131623990, 36);
                return;
            case 3:
                zq8 zq8Var = (zq8) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document j2 = vz9.j(tL_messages_stickerSet, num + "️⃣");
                    if (j2 == null) {
                        j2 = vz9.j(tL_messages_stickerSet, num + "⃣");
                    }
                    if (j2 == null) {
                        String[] strArr = cr8.s;
                        fc4.d("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        return;
                    }
                    hashMap.put(num, j2);
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    zq8Var.e.add(imageReceiver);
                    imageReceiver.h1 = new ar8(new Runnable[]{new mn8(zq8Var, imageReceiver, (byte) 18)});
                    imageReceiver.d0(gn5.b((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.I();
                    hashMap2.put(num2, imageReceiver);
                }
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    Integer num3 = (Integer) arrayList3.get(i2);
                    num3.getClass();
                    zq8Var.d.add((br8) hashMap2.get(num3));
                }
                zq8Var.g[0] = true;
                zq8Var.a();
                return;
            case 4:
                is9 is9Var = (is9) obj4;
                oc7 oc7Var = (oc7) obj3;
                String str2 = (String) obj2;
                Long l = (Long) obj;
                if (l == null) {
                    is9Var.a(null);
                    return;
                }
                TLObject a2 = oc7Var.a2(l.longValue());
                if (a2 instanceof TLRPC.User) {
                    is9Var.a(new js9(str2, (TLRPC.User) a2));
                    return;
                } else if (a2 instanceof TLRPC.Chat) {
                    is9Var.a(new ks9(str2, (TLRPC.Chat) a2));
                    return;
                } else {
                    return;
                }
            case 5:
                ArrayList arrayList4 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i3 = ((vz9) obj4).W;
                ArrayList t0 = hs6.d0(i3).t0(5);
                HashSet hashSet = new HashSet();
                String I3 = gm.I3((String) obj3);
                String concat = " ".concat(I3);
                if (t0 != null) {
                    for (int i4 = 0; i4 < t0.size(); i4++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t0.get(i4);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String I32 = gm.I3(tL_messages_stickerSet2.set.title);
                            if (I32.startsWith(I3) || I32.contains(concat)) {
                                arrayList4.add(new sz9(I32));
                                arrayList4.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList5 = hs6.d0(i3).t0[1];
                if (arrayList5 != null) {
                    while (i < arrayList5.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList5.get(i);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                            String I33 = gm.I3(stickerSetCovered.set.title);
                            if (I33.startsWith(I3) || I33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet m0 = hs6.d0(i3).m0(hs6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
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
                                    arrayList4.add(new sz9(stickerSetCovered.set.title));
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
                vm.g(((vz9) obj4).W).f(arrayList6);
                int size = arrayList6.size();
                while (i < size) {
                    Object obj5 = arrayList6.get(i);
                    i++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).id));
                }
                runnable2.run();
                return;
            case 7:
                wsa wsaVar = (wsa) obj4;
                k11 k11Var = (k11) obj;
                k11Var.d();
                wsaVar.k1(((Long) obj3).longValue(), new i48(wsaVar, k11Var, (yw4[]) obj2, (byte) 9));
                return;
            case 8:
                wsa wsaVar2 = (wsa) obj4;
                yw4 yw4Var = (yw4) obj2;
                String str3 = (String) obj;
                ((k11) obj3).b();
                if (!c.K(str3)) {
                    if (str3 != null) {
                        if (yw4Var != null) {
                            j = new c41(yw4Var.c, wsaVar2.J0);
                        } else {
                            j = wsaVar2.j();
                        }
                        j.f0(str3, false);
                        return;
                    }
                    if (yw4Var != null) {
                        yw4Var.dismiss();
                    }
                    wsaVar2.dismiss();
                    d S = LaunchActivity.S();
                    if (S instanceof goc) {
                        ((goc) S).T0();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                wsa wsaVar3 = (wsa) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((k11) obj3).b();
                ((yw4[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    gm.c3(new e6a(wsaVar3, tL_error, (byte) 18));
                    return;
                } else {
                    wsaVar3.dismiss();
                    return;
                }
            case 10:
                he heVar = (he) obj3;
                a3b a3bVar = (a3b) obj2;
                ((he) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    heVar.dismiss();
                    return;
                }
                a3bVar.setErrorText(".");
                gm.A3(-6.0f, a3bVar, null);
                xx0.APP_ERROR.a();
                gm.E3(a3bVar);
                return;
            case 11:
                qac qacVar2 = (qac) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((he) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    qacVar2.a(inputPeer);
                    return;
                }
                return;
            case 12:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                zf5 zf5Var = (zf5) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    zf5Var.a(wallettransaction2);
                    return;
                }
                return;
            case 13:
                el7[] el7VarArr = (el7[]) obj3;
                ylb ylbVar = (ylb) obj2;
                String str4 = (String) obj;
                ((b61) obj4).setLoading(false);
                if (!c.K(str4)) {
                    if (!TextUtils.isEmpty(str4)) {
                        new c41(el7VarArr[0].F, ylbVar).f0(str4, false);
                        return;
                    } else {
                        el7VarArr[0].dismiss();
                        return;
                    }
                }
                return;
            case 14:
                ((vqc) obj4).f0((qac) obj3, (g35) obj2, (y25) obj);
                return;
            case 15:
                asc ascVar = (asc) obj4;
                c cVar = (c) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!ascVar.r) {
                    if (!TextUtils.isEmpty(str5) && c.b(ascVar.f, cVar.x())) {
                        q25 q25Var = new q25(cVar, str5, ascVar.e, null, new nv0(ascVar, cVar, user, str5));
                        cVar.x0(q25Var);
                        ascVar.n = new qn4(q25Var, (byte) 15);
                        return;
                    }
                    ascVar.h = false;
                    ascVar.a0.setLoading(false);
                    c41 b0 = c41.b0(ascVar);
                    if (TextUtils.isEmpty(str5)) {
                        str = jb6.M0(2131742702, null);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    b0.f0(str, false);
                    return;
                }
                return;
            case 16:
                ((ut8) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                return;
            default:
                el7 el7Var = (el7) obj3;
                ylb ylbVar2 = (ylb) obj2;
                String str6 = (String) obj;
                ((b61) obj4).setLoading(false);
                if (str6 == null) {
                    el7Var.dismiss();
                    return;
                } else {
                    c41.d0(str6, el7Var.F, ylbVar2);
                    return;
                }
        }
    }

    public i48(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
