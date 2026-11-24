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
public final class f28 implements p8c {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public f28(toc tocVar, p8c p8cVar, c cVar, g15 g15Var) {
        this.a = (byte) 14;
        this.b = tocVar;
        this.c = p8cVar;
        this.d = g15Var;
    }

    @Override
    public final void a(Object obj) {
        s1b s1bVar;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        u21 j;
        String str;
        byte b = this.a;
        int i = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                i28 i28Var = (i28) obj4;
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                qx3 qx3Var = new qx3(((m8b) obj3).f, i28Var.getContext(), (f53) obj2, arrayList2);
                t28 t28Var = i28Var.z0.G1;
                if (t28Var != null) {
                    ((d8b) t28Var).h(qx3Var);
                    return;
                }
                return;
            case 1:
                s28 s28Var = (s28) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                p8c p8cVar = (p8c) obj;
                y28 y28Var = s28Var.x;
                if ((storyItem instanceof q1b) && (s1bVar = ((q1b) storyItem).a) != null) {
                    pc7 pc7Var = new pc7(s1bVar, storyItem2, p8cVar, (byte) 18);
                    if (s1bVar.F != 0) {
                        ConnectionsManager.getInstance(s1bVar.c).cancelRequest(s1bVar.F, true);
                        s1bVar.F = 0;
                    }
                    s1bVar.C = false;
                    s1bVar.D = false;
                    s1bVar.H(pc7Var);
                    return;
                }
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = na7.q1(y28Var.s2).h1(storyItem.dialogId);
                tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                ConnectionsManager.getInstance(y28Var.s2).sendRequest(tL_stories_getStoriesByID, new k45(s28Var, storyItem, p8cVar, (byte) 27));
                return;
            case 2:
                z1b z1bVar = (z1b) obj;
                y28 y28Var2 = ((s28) obj4).x;
                y28Var2.I1.b(z1bVar.a, y28Var2.r1, (TL_stories.StoryItem) obj3);
                b00.u(k96.a0(null, null, 2131744494, z1bVar.b), new u21(y28Var2.S0, (f53) obj2), 2131623990, 36);
                return;
            case 3:
                yo8 yo8Var = (yo8) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document j2 = tx9.j(tL_messages_stickerSet, num + "️⃣");
                    if (j2 == null) {
                        j2 = tx9.j(tL_messages_stickerSet, num + "⃣");
                    }
                    if (j2 == null) {
                        String[] strArr = bp8.s;
                        fa4.d("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        return;
                    }
                    hashMap.put(num, j2);
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    yo8Var.e.add(imageReceiver);
                    imageReceiver.h1 = new zo8(new Runnable[]{new ll8(yo8Var, imageReceiver, (byte) 16)});
                    imageReceiver.d0(gl5.b((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.I();
                    hashMap2.put(num2, imageReceiver);
                }
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    Integer num3 = (Integer) arrayList3.get(i2);
                    num3.getClass();
                    yo8Var.d.add((ap8) hashMap2.get(num3));
                }
                yo8Var.g[0] = true;
                yo8Var.a();
                return;
            case 4:
                hq9 hq9Var = (hq9) obj4;
                na7 na7Var = (na7) obj3;
                String str2 = (String) obj2;
                Long l = (Long) obj;
                if (l == null) {
                    hq9Var.a(null);
                    return;
                }
                TLObject Z1 = na7Var.Z1(l.longValue());
                if (Z1 instanceof TLRPC.User) {
                    hq9Var.a(new iq9(str2, (TLRPC.User) Z1));
                    return;
                } else if (Z1 instanceof TLRPC.Chat) {
                    hq9Var.a(new jq9(str2, (TLRPC.Chat) Z1));
                    return;
                } else {
                    return;
                }
            case 5:
                ArrayList arrayList4 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                int i3 = ((tx9) obj4).W;
                ArrayList t0 = hq6.d0(i3).t0(5);
                HashSet hashSet = new HashSet();
                String J3 = gl.J3((String) obj3);
                String concat = " ".concat(J3);
                if (t0 != null) {
                    for (int i4 = 0; i4 < t0.size(); i4++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) t0.get(i4);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String J32 = gl.J3(tL_messages_stickerSet2.set.title);
                            if (J32.startsWith(J3) || J32.contains(concat)) {
                                arrayList4.add(new qx9(J32));
                                arrayList4.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList5 = hq6.d0(i3).t0[1];
                if (arrayList5 != null) {
                    while (i < arrayList5.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList5.get(i);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                            String J33 = gl.J3(stickerSetCovered.set.title);
                            if (J33.startsWith(J3) || J33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet m0 = hq6.d0(i3).m0(hq6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
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
                                    arrayList4.add(new qx9(stickerSetCovered.set.title));
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
                vl.g(((tx9) obj4).W).f(arrayList6);
                int size = arrayList6.size();
                while (i < size) {
                    Object obj5 = arrayList6.get(i);
                    i++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).id));
                }
                runnable2.run();
                return;
            case 7:
                vqa vqaVar = (vqa) obj4;
                c01 c01Var = (c01) obj;
                c01Var.d();
                vqaVar.k1(((Long) obj3).longValue(), new f28(vqaVar, c01Var, (xu4[]) obj2, (byte) 9));
                return;
            case 8:
                vqa vqaVar2 = (vqa) obj4;
                xu4 xu4Var = (xu4) obj2;
                String str3 = (String) obj;
                ((c01) obj3).b();
                if (!c.K(str3)) {
                    if (str3 != null) {
                        if (xu4Var != null) {
                            j = new u21(xu4Var.c, vqaVar2.J0);
                        } else {
                            j = vqaVar2.j();
                        }
                        j.f0(str3, false);
                        return;
                    }
                    if (xu4Var != null) {
                        xu4Var.dismiss();
                    }
                    vqaVar2.dismiss();
                    d S = LaunchActivity.S();
                    if (S instanceof hmc) {
                        ((hmc) S).S0();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                vqa vqaVar3 = (vqa) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((c01) obj3).b();
                ((xu4[]) obj2)[0].dismiss();
                if (tL_error != null) {
                    gl.d3(new t7a(vqaVar3, tL_error, (byte) 16));
                    return;
                } else {
                    vqaVar3.dismiss();
                    return;
                }
            case 10:
                hd hdVar = (hd) obj3;
                y0b y0bVar = (y0b) obj2;
                ((hd) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    hdVar.dismiss();
                    return;
                }
                y0bVar.setErrorText(".");
                gl.B3(-6.0f, y0bVar, null);
                pw0.APP_ERROR.a();
                gl.F3(y0bVar);
                return;
            case 11:
                p8c p8cVar2 = (p8c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((hd) obj4).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    p8cVar2.a(inputPeer);
                    return;
                }
                return;
            case 12:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                be5 be5Var = (be5) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    be5Var.a(wallettransaction2);
                    return;
                }
                return;
            case 13:
                cj7[] cj7VarArr = (cj7[]) obj3;
                wjb wjbVar = (wjb) obj2;
                String str4 = (String) obj;
                ((u41) obj4).setLoading(false);
                if (!c.K(str4)) {
                    if (!TextUtils.isEmpty(str4)) {
                        new u21(cj7VarArr[0].F, wjbVar).f0(str4, false);
                        return;
                    } else {
                        cj7VarArr[0].dismiss();
                        return;
                    }
                }
                return;
            case 14:
                ((toc) obj4).e0((p8c) obj3, (g15) obj2, (y05) obj);
                return;
            case 15:
                ypc ypcVar = (ypc) obj4;
                c cVar = (c) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!ypcVar.r) {
                    if (!TextUtils.isEmpty(str5) && c.b(ypcVar.f, cVar.x())) {
                        q05 q05Var = new q05(cVar, str5, ypcVar.e, null, new eu0(ypcVar, cVar, user, str5));
                        cVar.x0(q05Var);
                        ypcVar.n = new iu4(q05Var, (byte) 8);
                        return;
                    }
                    ypcVar.h = false;
                    ypcVar.a0.setLoading(false);
                    u21 b0 = u21.b0(ypcVar);
                    if (TextUtils.isEmpty(str5)) {
                        str = k96.M0(2131742776, null);
                    } else {
                        str = "WALLET_CHANGED";
                    }
                    b0.f0(str, false);
                    return;
                }
                return;
            case 16:
                ((rr8) ((View) obj)).z((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                return;
            default:
                cj7 cj7Var = (cj7) obj3;
                wjb wjbVar2 = (wjb) obj2;
                String str6 = (String) obj;
                ((u41) obj4).setLoading(false);
                if (str6 == null) {
                    cj7Var.dismiss();
                    return;
                } else {
                    u21.d0(str6, cj7Var.F, wjbVar2);
                    return;
                }
        }
    }

    public f28(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
