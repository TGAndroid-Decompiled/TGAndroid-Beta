package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class hj8 implements icc {
    public final byte a;
    public final Object b;

    public hj8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        boolean z6;
        boolean z7;
        b2a b2aVar = (b2a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        a2a a2aVar = b2aVar.b2;
        a2a a2aVar2 = b2aVar.a2;
        TLRPC.User user = b2aVar.T1;
        a2a a2aVar3 = b2aVar.Z1;
        if (a2aVar3 != null) {
            ArrayList arrayList2 = a2aVar3.d;
            if (a2aVar2 != null) {
                ArrayList arrayList3 = a2aVar2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(yac.h(b2aVar.a).e()));
                arrayList.add(b8c.E(3, hl.L(64.0f)));
                int i5 = 29;
                if (a2aVar != null && !TextUtils.isEmpty(a2aVar.c.q)) {
                    ArrayList arrayList4 = a2aVar.d;
                    int size = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj3 = arrayList4.get(i6);
                        i6++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(wf3.d(tLObject)))) {
                            hashSet.add(Long.valueOf(wf3.d(tLObject)));
                            b8c w = b8c.w(tLObject);
                            if (wf3.d(tLObject) == wf3.d(b2aVar.V1)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            w.L(z7);
                            arrayList.add(w);
                        }
                    }
                    if (a2aVar.f) {
                        arrayList.add(b8c.p(29));
                        arrayList.add(b8c.p(29));
                        arrayList.add(b8c.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(b8c.k(b2aVar.Y1));
                        return;
                    }
                    return;
                }
                if (user != null) {
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size2) {
                            break;
                        }
                        Object obj4 = arrayList2.get(i7);
                        i7++;
                        if (wf3.d((TLObject) obj4) == wf3.d(user)) {
                            if (!hashSet.contains(Long.valueOf(wf3.d(user)))) {
                                if (xc2.V(b2aVar.S1)) {
                                    i4 = 2131752491;
                                } else {
                                    i4 = 2131749253;
                                }
                                arrayList.add(b8c.r(ob6.M0(i4, null)));
                                hashSet.add(Long.valueOf(wf3.d(user)));
                                b8c w2 = b8c.w(user);
                                if (wf3.d(user) == wf3.d(b2aVar.V1)) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                w2.L(z6);
                                arrayList.add(w2);
                                z = false;
                            }
                        }
                    }
                }
                z = true;
                int size3 = arrayList2.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj5 = arrayList2.get(i8);
                    i8++;
                    TLObject tLObject2 = (TLObject) obj5;
                    int i9 = i5;
                    if (!hashSet.contains(Long.valueOf(wf3.d(tLObject2)))) {
                        if (z) {
                            if (xc2.V(b2aVar.S1)) {
                                i3 = 2131752491;
                            } else {
                                i3 = 2131749253;
                            }
                            arrayList.add(b8c.r(ob6.M0(i3, null)));
                            z = false;
                        }
                        hashSet.add(Long.valueOf(wf3.d(tLObject2)));
                        b8c w3 = b8c.w(tLObject2);
                        if (wf3.d(tLObject2) == wf3.d(b2aVar.V1)) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        w3.L(z5);
                        arrayList.add(w3);
                    }
                    i5 = i9;
                }
                int i10 = i5;
                if (a2aVar3.f) {
                    arrayList.add(b8c.p(i10));
                    arrayList.add(b8c.p(i10));
                    arrayList.add(b8c.p(i10));
                }
                if (user != null && !hashSet.contains(Long.valueOf(wf3.d(user)))) {
                    if (xc2.V(b2aVar.S1)) {
                        i2 = 2131752254;
                    } else {
                        i2 = 2131749182;
                    }
                    arrayList.add(b8c.r(ob6.M0(i2, null)));
                    hashSet.add(Long.valueOf(wf3.d(user)));
                    b8c w4 = b8c.w(user);
                    if (wf3.d(user) == wf3.d(b2aVar.V1)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    w4.L(z4);
                    arrayList.add(w4);
                    z2 = false;
                } else {
                    z2 = true;
                }
                int size4 = arrayList3.size();
                int i11 = 0;
                while (i11 < size4) {
                    Object obj6 = arrayList3.get(i11);
                    i11++;
                    TLObject tLObject3 = (TLObject) obj6;
                    if (!hashSet.contains(Long.valueOf(wf3.d(tLObject3)))) {
                        if (z2) {
                            if (xc2.V(b2aVar.S1)) {
                                i = 2131752254;
                            } else {
                                i = 2131749182;
                            }
                            arrayList.add(b8c.r(ob6.M0(i, null)));
                            z2 = false;
                        }
                        hashSet.add(Long.valueOf(wf3.d(tLObject3)));
                        b8c w5 = b8c.w(tLObject3);
                        if (wf3.d(tLObject3) == wf3.d(b2aVar.V1)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        w5.L(z3);
                        arrayList.add(w5);
                    }
                }
                if (!arrayList3.isEmpty() && a2aVar2.f) {
                    arrayList.add(b8c.p(i10));
                    arrayList.add(b8c.p(i10));
                    arrayList.add(b8c.p(i10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        a2a a2aVar = (a2a) this.b;
        ArrayList arrayList = a2aVar.e;
        TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        int i = a2aVar.a;
        ArrayList arrayList2 = a2aVar.d;
        int i2 = 0;
        if (tL_error != null) {
            if (a2aVar.r) {
                arrayList2.clear();
                a2aVar.r = false;
            }
            a2aVar.h = true;
            a2aVar.f = false;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                ((Runnable) obj3).run();
            }
            return;
        }
        uc7.s1(i).j4(channels_channelparticipants.users, false);
        uc7.s1(i).c4(channels_channelparticipants.chats, false);
        if (a2aVar.r) {
            arrayList2.clear();
            a2aVar.r = false;
        }
        ArrayList<TLRPC.ChannelParticipant> arrayList3 = channels_channelparticipants.participants;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            TLRPC.ChannelParticipant channelParticipant = arrayList3.get(i3);
            i3++;
            TLObject b2 = uc7.s1(i).b2(wf3.n(channelParticipant.peer));
            if (b2 != null) {
                arrayList2.add(b2);
            }
        }
        if (channels_channelparticipants.participants.size() < 30) {
            a2aVar.h = true;
        }
        a2aVar.f = false;
        int size3 = arrayList.size();
        while (i2 < size3) {
            Object obj4 = arrayList.get(i2);
            i2++;
            ((Runnable) obj4).run();
        }
    }

    private final void d(Object obj, Object obj2) {
        int i;
        long j;
        h2a h2aVar = (h2a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        axa axaVar = h2aVar.T1;
        if (axaVar == null) {
            return;
        }
        ArrayList arrayList2 = axaVar.l;
        arrayList.add(b8c.D(hl.L(16.0f)));
        if (axaVar.i && arrayList2.isEmpty()) {
            b8c q = b8c.q(1, 34);
            q.v = 1;
            arrayList.add(q);
            b8c q2 = b8c.q(2, 34);
            q2.v = 1;
            arrayList.add(q2);
            b8c q3 = b8c.q(3, 34);
            q3.v = 1;
            arrayList.add(q3);
            b8c q4 = b8c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            b8c q5 = b8c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            b8c q6 = b8c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
            b8c q7 = b8c.q(7, 34);
            q7.v = 1;
            arrayList.add(q7);
            b8c q8 = b8c.q(8, 34);
            q8.v = 1;
            arrayList.add(q8);
            b8c q9 = b8c.q(9, 34);
            q9.v = 1;
            arrayList.add(q9);
        } else {
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 3;
            int i4 = 0;
            while (i4 < size) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (!savedStarGift.collection_id.contains(Integer.valueOf(h2aVar.S1))) {
                    int i5 = rx4.b;
                    b8c K = b8c.K(rx4.class);
                    K.v = 1;
                    K.A = 0;
                    K.H = savedStarGift;
                    K.r = true;
                    K.f = true;
                    K.s = false;
                    HashSet hashSet = h2aVar.U1;
                    int i6 = savedStarGift.msg_id;
                    if (i6 == 0) {
                        j = savedStarGift.saved_id;
                    } else {
                        j = i6;
                    }
                    K.L(hashSet.contains(Long.valueOf(j)));
                    K.v = 1;
                    arrayList.add(K);
                    i3--;
                    if (i3 == 0) {
                        i3 = 3;
                    }
                }
            }
            if (axaVar.i || !axaVar.j) {
                while (true) {
                    if (i3 <= 0) {
                        i = 3;
                    } else {
                        i = i3;
                    }
                    if (i2 >= i) {
                        break;
                    }
                    i2++;
                    b8c q10 = b8c.q(i2, 34);
                    q10.v = 1;
                    arrayList.add(q10);
                }
            }
        }
        arrayList.add(b8c.D(hl.L(68.0f)));
    }

    private final void e(Object obj, Object obj2) {
        int i;
        long j;
        TL_stories.StoryItem storyItem;
        k2a k2aVar = (k2a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        int i2 = k2aVar.W1;
        v5b v5bVar = k2aVar.U1;
        if (v5bVar == null) {
            return;
        }
        arrayList.add(b8c.D(hl.L(16.0f)));
        ArrayList arrayList2 = v5bVar.i;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = i2;
        int i5 = 0;
        while (i5 < size) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            r47 r47Var = (r47) obj3;
            int i6 = s7b.c;
            b8c K = b8c.K(s7b.class);
            K.v = 1;
            K.A = 0;
            K.H = r47Var;
            if (r47Var != null && (storyItem = r47Var.l) != null) {
                j = storyItem.id;
            } else {
                j = -1;
            }
            K.C = j;
            K.f = true;
            K.w = i2;
            K.L(k2aVar.V1.containsKey(Integer.valueOf(r47Var.e1())));
            K.v = 1;
            arrayList.add(K);
            i4--;
            if (i4 == 0) {
                i4 = i2;
            }
        }
        if (v5bVar.k() || !v5bVar.r) {
            while (true) {
                if (i4 <= 0) {
                    i = i2;
                } else {
                    i = i4;
                }
                if (i3 >= i) {
                    break;
                }
                i3++;
                b8c q = b8c.q(i3, 34);
                q.v = 1;
                arrayList.add(q);
            }
        }
        arrayList.add(b8c.D(hl.L(68.0f)));
    }

    private final void f(Object obj, Object obj2) {
        String str;
        gra graVar = (gra) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        ArrayList arrayList2 = graVar.Y1;
        boolean z = graVar.p2;
        ge0 ge0Var = graVar.b2;
        ArrayList arrayList3 = graVar.W1;
        ArrayList arrayList4 = graVar.V1;
        ge0 ge0Var2 = graVar.a2;
        ge0 ge0Var3 = graVar.Z1;
        ArrayList arrayList5 = graVar.X1;
        if (arrayList5 != null && arrayList4 != null && arrayList3 != null) {
            arrayList.add(b8c.D(hl.L(315.0f)));
            int i = 0;
            ge0Var3.a = 0;
            ge0Var3.b();
            ge0Var2.a = 0;
            ge0Var2.b();
            ge0Var.a = 0;
            ge0Var.b();
            int i2 = graVar.e2.s;
            if (i2 == 0) {
                String str2 = "GiftPreviewCountModels";
                if (!z) {
                    str = "GiftPreviewCountModels";
                } else {
                    str = "GiftPreviewCountModelsCrafting";
                }
                arrayList.add(b8c.g(hl.S2(ob6.H(',', str, arrayList5.size()))));
                int size = arrayList5.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList5.get(i3);
                    i3++;
                    arrayList.add(dra.i(i2, new cra((TL_stars.starGiftAttributeBackdrop) ge0Var3.b(), (TL_stars.starGiftAttributePattern) ge0Var2.b(), (TL_stars.starGiftAttributeModel) obj3)));
                }
                if (!arrayList2.isEmpty()) {
                    if (z) {
                        str2 = "GiftPreviewCountModelsCrafting2";
                    }
                    arrayList.add(b8c.g(hl.S2(ob6.H(',', str2, arrayList5.size()))));
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj4 = arrayList2.get(i);
                        i++;
                        arrayList.add(dra.i(i2, new cra((TL_stars.starGiftAttributeBackdrop) ge0Var3.b(), (TL_stars.starGiftAttributePattern) ge0Var2.b(), (TL_stars.starGiftAttributeModel) obj4)));
                    }
                }
            } else if (i2 == 1) {
                arrayList.add(b8c.g(hl.S2(ob6.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
                int size3 = arrayList4.size();
                while (i < size3) {
                    Object obj5 = arrayList4.get(i);
                    i++;
                    arrayList.add(dra.i(i2, new cra((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) ge0Var2.b(), (TL_stars.starGiftAttributeModel) ge0Var.b())));
                }
            } else if (i2 == 2) {
                arrayList.add(b8c.g(hl.S2(ob6.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
                int size4 = arrayList3.size();
                while (i < size4) {
                    Object obj6 = arrayList3.get(i);
                    i++;
                    arrayList.add(dra.i(i2, new cra((TL_stars.starGiftAttributeBackdrop) ge0Var3.b(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) ge0Var.b())));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        int i;
        String e;
        zya zyaVar = (zya) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        arrayList.add(b8c.k(zyaVar.S1));
        arrayList.add(b8c.u(ob6.M0(2131743867, null)));
        ArrayList r = jxa.v(zyaVar.a, false).r();
        if (r != null && !r.isEmpty()) {
            int i2 = 0;
            int i3 = 1;
            for (int i4 = 0; i4 < r.size(); i4++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) r.get(i4);
                if (!zyaVar.X1 && tL_starsGiftOption.extended) {
                    i2++;
                } else {
                    int i5 = i3 + 1;
                    int i6 = aza.b;
                    b8c K = b8c.K(aza.class);
                    K.d = i4;
                    K.A = i3;
                    long j = tL_starsGiftOption.stars;
                    K.C = j;
                    K.m = ob6.H(' ', "StarsCount", (int) j);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        e = null;
                    } else {
                        e = di0.h().e(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    K.n = e;
                    K.H = tL_starsGiftOption;
                    arrayList.add(K);
                    i3 = i5;
                }
            }
            boolean z = zyaVar.X1;
            if (!z && i2 > 0) {
                if (z) {
                    i = 2131747572;
                } else {
                    i = 2131747563;
                }
                String M0 = ob6.M0(i, null);
                int i7 = wya.b;
                b8c K2 = b8c.K(wya.class);
                K2.d = -1;
                K2.m = M0;
                K2.f = !zyaVar.X1;
                K2.r = true;
                arrayList.add(K2);
            }
        } else {
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
        }
        arrayList.add(b8c.k(zyaVar.T1));
    }

    private final void h(Object obj, Object obj2) {
        dza dzaVar = (dza) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        long j = dzaVar.S1;
        dr0 dr0Var = dzaVar.T1;
        arrayList.add(b8c.m(dr0Var));
        boolean z = dzaVar.Y1;
        if (z) {
            bp1.o(2131743867, null, arrayList);
        }
        ArrayList w = jxa.v(dzaVar.a, false).w();
        if (z) {
            if (w != null && !w.isEmpty()) {
                int i = 0;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 1;
                for (int i4 = 0; i4 < w.size(); i4++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                    if (tL_starsTopupOption.stars >= j) {
                        if (tL_starsTopupOption.extended && !dzaVar.a2 && z2) {
                            i2++;
                        } else {
                            arrayList.add(aza.i(i4, i3, tL_starsTopupOption));
                            i++;
                            z2 = true;
                            i3++;
                        }
                    }
                }
                int i5 = 2131747563;
                if (i < 3) {
                    arrayList.clear();
                    arrayList.add(b8c.k(dr0Var));
                    arrayList.add(b8c.u(ob6.M0(2131743867, null)));
                    int i6 = 0;
                    for (int i7 = 0; i7 < w.size(); i7++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) w.get(i7);
                        if (tL_starsTopupOption2.stars >= j) {
                            arrayList.add(aza.i(i7, i3, tL_starsTopupOption2));
                            i6++;
                            i3++;
                        }
                    }
                    if (i6 == 0) {
                        int i8 = 0;
                        while (i8 < w.size()) {
                            arrayList.add(aza.i(i8, i3, (TL_stars.TL_starsTopupOption) w.get(i8)));
                            i8++;
                            i3++;
                        }
                        boolean z3 = dzaVar.a2;
                        if (!z3 && i2 > 0) {
                            if (z3) {
                                i5 = 2131747572;
                            }
                            String M0 = ob6.M0(i5, null);
                            int i9 = wya.b;
                            b8c K = b8c.K(wya.class);
                            K.d = -1;
                            K.m = M0;
                            K.f = !dzaVar.a2;
                            K.r = true;
                            arrayList.add(K);
                        }
                    } else {
                        dzaVar.a2 = true;
                    }
                } else if (i > 0) {
                    boolean z4 = dzaVar.a2;
                    if (!z4 && i2 > 0) {
                        if (z4) {
                            i5 = 2131747572;
                        }
                        String M02 = ob6.M0(i5, null);
                        int i10 = wya.b;
                        b8c K2 = b8c.K(wya.class);
                        K2.d = -1;
                        K2.m = M02;
                        K2.f = !dzaVar.a2;
                        K2.r = true;
                        arrayList.add(K2);
                    }
                } else {
                    int i11 = 0;
                    while (i11 < w.size()) {
                        arrayList.add(aza.i(i11, i3, (TL_stars.TL_starsTopupOption) w.get(i11)));
                        i11++;
                        i3++;
                    }
                }
            } else {
                arrayList.add(b8c.p(31));
                arrayList.add(b8c.p(31));
                arrayList.add(b8c.p(31));
            }
        }
        arrayList.add(b8c.k(dzaVar.U1));
    }

    private final void i(Object obj, Object obj2) {
        int i;
        eza ezaVar = (eza) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        bp1.o(2131743867, null, arrayList);
        ArrayList w = jxa.v(ezaVar.a, false).w();
        if (w != null && !w.isEmpty()) {
            int i2 = 0;
            int i3 = 1;
            for (int i4 = 0; i4 < w.size(); i4++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                if (tL_starsTopupOption.extended && !ezaVar.U1) {
                    i2++;
                } else {
                    arrayList.add(aza.i(i4, i3, tL_starsTopupOption));
                    i3++;
                }
            }
            boolean z = ezaVar.U1;
            if (!z && i2 > 0) {
                if (z) {
                    i = 2131747572;
                } else {
                    i = 2131747563;
                }
                String M0 = ob6.M0(i, null);
                int i5 = wya.b;
                b8c K = b8c.K(wya.class);
                K.d = -1;
                K.m = M0;
                K.f = !ezaVar.U1;
                K.r = true;
                arrayList.add(K);
            }
        } else {
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
            arrayList.add(b8c.p(31));
        }
        arrayList.add(b8c.k(ezaVar.S1));
    }

    private final void j(Object obj, Object obj2) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        boolean z;
        kza kzaVar = (kza) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        boolean z2 = kzaVar.e;
        int i3 = kzaVar.d;
        long j = kzaVar.f;
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i5 = kzaVar.c;
        if (i4 != 0) {
            kt0 g = kt0.g(i5);
            ArrayList arrayList3 = g.k(j).a[i3];
            int size = arrayList3.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                int i7 = hza.b;
                b8c K = b8c.K(hza.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.r = true;
                arrayList2.add(K);
            }
            if (!g.k(j).e[i3]) {
                arrayList2.add(b8c.q(arrayList2.size(), 7));
                arrayList2.add(b8c.q(arrayList2.size(), 7));
                arrayList2.add(b8c.q(arrayList2.size(), 7));
                return;
            }
            return;
        }
        jxa v = jxa.v(i5, z2);
        ArrayList[] arrayListArr = v.q;
        if (z2 && z15.c(i5)) {
            if (kzaVar.n == null) {
                kzaVar.n = new k2c();
            }
            kzaVar.r = c.C(i5).x();
            ArrayList arrayList4 = arrayListArr[i3];
            k2c k2cVar = kzaVar.n;
            y15 y15Var = z15.b[i5];
            String x = c.C(i5).x();
            HashSet hashSet = k2cVar.a;
            HashSet hashSet2 = k2cVar.a;
            HashMap hashMap = k2cVar.b;
            hashSet.clear();
            hashMap.clear();
            if (x != null && !x.isEmpty()) {
                hashSet2.add(x);
            }
            hashMap.clear();
            k2cVar.b(4, new ArrayList(hashSet2));
            if (y15Var != null && y15Var.g == null && System.currentTimeMillis() - y15Var.e <= 600000 && i3 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.id = "earnings:" + y15Var.b;
                wallettransaction.pending = true;
                wallettransaction.amount = y15Var.c;
                wallettransaction.date = y15Var.d;
                wallettransaction.peer = new h2c(x);
                arrayList2.add(j2c.i(wallettransaction, k2cVar));
            }
            HashSet e = z15.e(i5);
            int size2 = arrayList4.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj4 = arrayList4.get(i8);
                i8++;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) obj4;
                String str2 = starsTransaction.id;
                if (str2 != null && ((e.contains(str2) || (y15Var != null && starsTransaction.id.equals(y15Var.g))) && starsTransaction.amount != null)) {
                    TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                    StringBuilder sb = new StringBuilder("earnings:");
                    if (y15Var != null) {
                        arrayList = arrayList4;
                        if (starsTransaction.id.equals(y15Var.g)) {
                            str = y15Var.b;
                            sb.append(str);
                            wallettransaction2.id = sb.toString();
                            if (!starsTransaction.pending && !starsTransaction.failed) {
                                z = true;
                            } else {
                                z = false;
                            }
                            wallettransaction2.pending = z;
                            wallettransaction2.failed = starsTransaction.failed;
                            i2 = i3;
                            wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                            wallettransaction2.date = starsTransaction.date;
                            wallettransaction2.peer = new h2c(x);
                            arrayList2.add(j2c.i(wallettransaction2, k2cVar));
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    str = starsTransaction.id;
                    sb.append(str);
                    wallettransaction2.id = sb.toString();
                    if (!starsTransaction.pending) {
                    }
                    z = false;
                    wallettransaction2.pending = z;
                    wallettransaction2.failed = starsTransaction.failed;
                    i2 = i3;
                    wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                    wallettransaction2.date = starsTransaction.date;
                    wallettransaction2.peer = new h2c(x);
                    arrayList2.add(j2c.i(wallettransaction2, k2cVar));
                } else {
                    arrayList = arrayList4;
                    i2 = i3;
                    int i9 = hza.b;
                    b8c K2 = b8c.K(hza.class);
                    K2.H = starsTransaction;
                    K2.r = false;
                    arrayList2.add(K2);
                }
                i3 = i2;
                arrayList4 = arrayList;
            }
            i = i3;
        } else {
            i = i3;
            ArrayList arrayList5 = arrayListArr[i];
            int size3 = arrayList5.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj5 = arrayList5.get(i10);
                i10++;
                int i11 = hza.b;
                b8c K3 = b8c.K(hza.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.r = false;
                arrayList2.add(K3);
            }
        }
        if (!v.u[i]) {
            arrayList2.add(b8c.q(arrayList2.size(), 7));
            arrayList2.add(b8c.q(arrayList2.size(), 7));
            arrayList2.add(b8c.q(arrayList2.size(), 7));
        }
    }

    @Override
    public final void a(java.lang.Object r31, java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj8.a(java.lang.Object, java.lang.Object):void");
    }
}
