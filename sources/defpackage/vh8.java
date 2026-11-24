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
public final class vh8 implements jac {
    public final byte a;
    public final Object b;

    public vh8(Object obj, byte b) {
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
        k0a k0aVar = (k0a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        j0a j0aVar = k0aVar.b2;
        j0a j0aVar2 = k0aVar.a2;
        TLRPC.User user = k0aVar.T1;
        j0a j0aVar3 = k0aVar.Z1;
        if (j0aVar3 != null) {
            ArrayList arrayList2 = j0aVar3.d;
            if (j0aVar2 != null) {
                ArrayList arrayList3 = j0aVar2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(z8c.h(k0aVar.a).e()));
                arrayList.add(c6c.E(3, gm.L(64.0f)));
                int i5 = 29;
                if (j0aVar != null && !TextUtils.isEmpty(j0aVar.c.q)) {
                    ArrayList arrayList4 = j0aVar.d;
                    int size = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj3 = arrayList4.get(i6);
                        i6++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(pg3.d(tLObject)))) {
                            hashSet.add(Long.valueOf(pg3.d(tLObject)));
                            c6c w = c6c.w(tLObject);
                            if (pg3.d(tLObject) == pg3.d(k0aVar.V1)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            w.L(z7);
                            arrayList.add(w);
                        }
                    }
                    if (j0aVar.f) {
                        arrayList.add(c6c.p(29));
                        arrayList.add(c6c.p(29));
                        arrayList.add(c6c.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(c6c.k(k0aVar.Y1));
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
                        if (pg3.d((TLObject) obj4) == pg3.d(user)) {
                            if (!hashSet.contains(Long.valueOf(pg3.d(user)))) {
                                if (sd2.V(k0aVar.S1)) {
                                    i4 = 2131752463;
                                } else {
                                    i4 = 2131749256;
                                }
                                arrayList.add(c6c.r(jb6.M0(i4, null)));
                                hashSet.add(Long.valueOf(pg3.d(user)));
                                c6c w2 = c6c.w(user);
                                if (pg3.d(user) == pg3.d(k0aVar.V1)) {
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
                    if (!hashSet.contains(Long.valueOf(pg3.d(tLObject2)))) {
                        if (z) {
                            if (sd2.V(k0aVar.S1)) {
                                i3 = 2131752463;
                            } else {
                                i3 = 2131749256;
                            }
                            arrayList.add(c6c.r(jb6.M0(i3, null)));
                            z = false;
                        }
                        hashSet.add(Long.valueOf(pg3.d(tLObject2)));
                        c6c w3 = c6c.w(tLObject2);
                        if (pg3.d(tLObject2) == pg3.d(k0aVar.V1)) {
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
                if (j0aVar3.f) {
                    arrayList.add(c6c.p(i10));
                    arrayList.add(c6c.p(i10));
                    arrayList.add(c6c.p(i10));
                }
                if (user != null && !hashSet.contains(Long.valueOf(pg3.d(user)))) {
                    if (sd2.V(k0aVar.S1)) {
                        i2 = 2131752226;
                    } else {
                        i2 = 2131749185;
                    }
                    arrayList.add(c6c.r(jb6.M0(i2, null)));
                    hashSet.add(Long.valueOf(pg3.d(user)));
                    c6c w4 = c6c.w(user);
                    if (pg3.d(user) == pg3.d(k0aVar.V1)) {
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
                    if (!hashSet.contains(Long.valueOf(pg3.d(tLObject3)))) {
                        if (z2) {
                            if (sd2.V(k0aVar.S1)) {
                                i = 2131752226;
                            } else {
                                i = 2131749185;
                            }
                            arrayList.add(c6c.r(jb6.M0(i, null)));
                            z2 = false;
                        }
                        hashSet.add(Long.valueOf(pg3.d(tLObject3)));
                        c6c w5 = c6c.w(tLObject3);
                        if (pg3.d(tLObject3) == pg3.d(k0aVar.V1)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        w5.L(z3);
                        arrayList.add(w5);
                    }
                }
                if (!arrayList3.isEmpty() && j0aVar2.f) {
                    arrayList.add(c6c.p(i10));
                    arrayList.add(c6c.p(i10));
                    arrayList.add(c6c.p(i10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        j0a j0aVar = (j0a) this.b;
        ArrayList arrayList = j0aVar.e;
        TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        int i = j0aVar.a;
        ArrayList arrayList2 = j0aVar.d;
        int i2 = 0;
        if (tL_error != null) {
            if (j0aVar.r) {
                arrayList2.clear();
                j0aVar.r = false;
            }
            j0aVar.h = true;
            j0aVar.f = false;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                ((Runnable) obj3).run();
            }
            return;
        }
        oc7.r1(i).d4(channels_channelparticipants.users, false);
        oc7.r1(i).X3(channels_channelparticipants.chats, false);
        if (j0aVar.r) {
            arrayList2.clear();
            j0aVar.r = false;
        }
        ArrayList<TLRPC.ChannelParticipant> arrayList3 = channels_channelparticipants.participants;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            TLRPC.ChannelParticipant channelParticipant = arrayList3.get(i3);
            i3++;
            TLObject a2 = oc7.r1(i).a2(pg3.n(channelParticipant.peer));
            if (a2 != null) {
                arrayList2.add(a2);
            }
        }
        if (channels_channelparticipants.participants.size() < 30) {
            j0aVar.h = true;
        }
        j0aVar.f = false;
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
        p0a p0aVar = (p0a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        ava avaVar = p0aVar.T1;
        if (avaVar == null) {
            return;
        }
        ArrayList arrayList2 = avaVar.l;
        arrayList.add(c6c.D(gm.L(16.0f)));
        if (avaVar.i && arrayList2.isEmpty()) {
            c6c q = c6c.q(1, 34);
            q.v = 1;
            arrayList.add(q);
            c6c q2 = c6c.q(2, 34);
            q2.v = 1;
            arrayList.add(q2);
            c6c q3 = c6c.q(3, 34);
            q3.v = 1;
            arrayList.add(q3);
            c6c q4 = c6c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            c6c q5 = c6c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            c6c q6 = c6c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
            c6c q7 = c6c.q(7, 34);
            q7.v = 1;
            arrayList.add(q7);
            c6c q8 = c6c.q(8, 34);
            q8.v = 1;
            arrayList.add(q8);
            c6c q9 = c6c.q(9, 34);
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
                if (!savedStarGift.collection_id.contains(Integer.valueOf(p0aVar.S1))) {
                    int i5 = nx4.b;
                    c6c K = c6c.K(nx4.class);
                    K.v = 1;
                    K.A = 0;
                    K.H = savedStarGift;
                    K.r = true;
                    K.f = true;
                    K.s = false;
                    HashSet hashSet = p0aVar.U1;
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
            if (avaVar.i || !avaVar.j) {
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
                    c6c q10 = c6c.q(i2, 34);
                    q10.v = 1;
                    arrayList.add(q10);
                }
            }
        }
        arrayList.add(c6c.D(gm.L(68.0f)));
    }

    private final void e(Object obj, Object obj2) {
        int i;
        long j;
        TL_stories.StoryItem storyItem;
        s0a s0aVar = (s0a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        int i2 = s0aVar.W1;
        z3b z3bVar = s0aVar.U1;
        if (z3bVar == null) {
            return;
        }
        arrayList.add(c6c.D(gm.L(16.0f)));
        ArrayList arrayList2 = z3bVar.i;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = i2;
        int i5 = 0;
        while (i5 < size) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            k47 k47Var = (k47) obj3;
            int i6 = w5b.c;
            c6c K = c6c.K(w5b.class);
            K.v = 1;
            K.A = 0;
            K.H = k47Var;
            if (k47Var != null && (storyItem = k47Var.l) != null) {
                j = storyItem.id;
            } else {
                j = -1;
            }
            K.C = j;
            K.f = true;
            K.w = i2;
            K.L(s0aVar.V1.containsKey(Integer.valueOf(k47Var.e1())));
            K.v = 1;
            arrayList.add(K);
            i4--;
            if (i4 == 0) {
                i4 = i2;
            }
        }
        if (z3bVar.k() || !z3bVar.r) {
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
                c6c q = c6c.q(i3, 34);
                q.v = 1;
                arrayList.add(q);
            }
        }
        arrayList.add(c6c.D(gm.L(68.0f)));
    }

    private final void f(Object obj, Object obj2) {
        String str;
        kpa kpaVar = (kpa) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        ArrayList arrayList2 = kpaVar.Y1;
        boolean z = kpaVar.p2;
        ef0 ef0Var = kpaVar.b2;
        ArrayList arrayList3 = kpaVar.W1;
        ArrayList arrayList4 = kpaVar.V1;
        ef0 ef0Var2 = kpaVar.a2;
        ef0 ef0Var3 = kpaVar.Z1;
        ArrayList arrayList5 = kpaVar.X1;
        if (arrayList5 != null && arrayList4 != null && arrayList3 != null) {
            arrayList.add(c6c.D(gm.L(315.0f)));
            int i = 0;
            ef0Var3.a = 0;
            ef0Var3.b();
            ef0Var2.a = 0;
            ef0Var2.b();
            ef0Var.a = 0;
            ef0Var.b();
            int i2 = kpaVar.e2.s;
            if (i2 == 0) {
                String str2 = "GiftPreviewCountModels";
                if (!z) {
                    str = "GiftPreviewCountModels";
                } else {
                    str = "GiftPreviewCountModelsCrafting";
                }
                arrayList.add(c6c.g(gm.S2(jb6.H(',', str, arrayList5.size()))));
                int size = arrayList5.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList5.get(i3);
                    i3++;
                    arrayList.add(hpa.i(i2, new gpa((TL_stars.starGiftAttributeBackdrop) ef0Var3.b(), (TL_stars.starGiftAttributePattern) ef0Var2.b(), (TL_stars.starGiftAttributeModel) obj3)));
                }
                if (!arrayList2.isEmpty()) {
                    if (z) {
                        str2 = "GiftPreviewCountModelsCrafting2";
                    }
                    arrayList.add(c6c.g(gm.S2(jb6.H(',', str2, arrayList5.size()))));
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj4 = arrayList2.get(i);
                        i++;
                        arrayList.add(hpa.i(i2, new gpa((TL_stars.starGiftAttributeBackdrop) ef0Var3.b(), (TL_stars.starGiftAttributePattern) ef0Var2.b(), (TL_stars.starGiftAttributeModel) obj4)));
                    }
                }
            } else if (i2 == 1) {
                arrayList.add(c6c.g(gm.S2(jb6.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
                int size3 = arrayList4.size();
                while (i < size3) {
                    Object obj5 = arrayList4.get(i);
                    i++;
                    arrayList.add(hpa.i(i2, new gpa((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) ef0Var2.b(), (TL_stars.starGiftAttributeModel) ef0Var.b())));
                }
            } else if (i2 == 2) {
                arrayList.add(c6c.g(gm.S2(jb6.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
                int size4 = arrayList3.size();
                while (i < size4) {
                    Object obj6 = arrayList3.get(i);
                    i++;
                    arrayList.add(hpa.i(i2, new gpa((TL_stars.starGiftAttributeBackdrop) ef0Var3.b(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) ef0Var.b())));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        int i;
        String e;
        zwa zwaVar = (zwa) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        arrayList.add(c6c.k(zwaVar.S1));
        arrayList.add(c6c.u(jb6.M0(2131743899, null)));
        ArrayList r = jva.v(zwaVar.a, false).r();
        if (r != null && !r.isEmpty()) {
            int i2 = 0;
            int i3 = 1;
            for (int i4 = 0; i4 < r.size(); i4++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) r.get(i4);
                if (!zwaVar.X1 && tL_starsGiftOption.extended) {
                    i2++;
                } else {
                    int i5 = i3 + 1;
                    int i6 = axa.b;
                    c6c K = c6c.K(axa.class);
                    K.d = i4;
                    K.A = i3;
                    long j = tL_starsGiftOption.stars;
                    K.C = j;
                    K.m = jb6.H(' ', "StarsCount", (int) j);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        e = null;
                    } else {
                        e = cj0.h().e(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    K.n = e;
                    K.H = tL_starsGiftOption;
                    arrayList.add(K);
                    i3 = i5;
                }
            }
            boolean z = zwaVar.X1;
            if (!z && i2 > 0) {
                if (z) {
                    i = 2131747578;
                } else {
                    i = 2131747569;
                }
                String M0 = jb6.M0(i, null);
                int i7 = wwa.b;
                c6c K2 = c6c.K(wwa.class);
                K2.d = -1;
                K2.m = M0;
                K2.f = !zwaVar.X1;
                K2.r = true;
                arrayList.add(K2);
            }
        } else {
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
        }
        arrayList.add(c6c.k(zwaVar.T1));
    }

    private final void h(Object obj, Object obj2) {
        dxa dxaVar = (dxa) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        long j = dxaVar.S1;
        ds0 ds0Var = dxaVar.T1;
        arrayList.add(c6c.m(ds0Var));
        boolean z = dxaVar.Y1;
        if (z) {
            aq1.o(2131743899, null, arrayList);
        }
        ArrayList w = jva.v(dxaVar.a, false).w();
        if (z) {
            if (w != null && !w.isEmpty()) {
                int i = 0;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 1;
                for (int i4 = 0; i4 < w.size(); i4++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                    if (tL_starsTopupOption.stars >= j) {
                        if (tL_starsTopupOption.extended && !dxaVar.a2 && z2) {
                            i2++;
                        } else {
                            arrayList.add(axa.i(i4, i3, tL_starsTopupOption));
                            i++;
                            z2 = true;
                            i3++;
                        }
                    }
                }
                int i5 = 2131747569;
                if (i < 3) {
                    arrayList.clear();
                    arrayList.add(c6c.k(ds0Var));
                    arrayList.add(c6c.u(jb6.M0(2131743899, null)));
                    int i6 = 0;
                    for (int i7 = 0; i7 < w.size(); i7++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) w.get(i7);
                        if (tL_starsTopupOption2.stars >= j) {
                            arrayList.add(axa.i(i7, i3, tL_starsTopupOption2));
                            i6++;
                            i3++;
                        }
                    }
                    if (i6 == 0) {
                        int i8 = 0;
                        while (i8 < w.size()) {
                            arrayList.add(axa.i(i8, i3, (TL_stars.TL_starsTopupOption) w.get(i8)));
                            i8++;
                            i3++;
                        }
                        boolean z3 = dxaVar.a2;
                        if (!z3 && i2 > 0) {
                            if (z3) {
                                i5 = 2131747578;
                            }
                            String M0 = jb6.M0(i5, null);
                            int i9 = wwa.b;
                            c6c K = c6c.K(wwa.class);
                            K.d = -1;
                            K.m = M0;
                            K.f = !dxaVar.a2;
                            K.r = true;
                            arrayList.add(K);
                        }
                    } else {
                        dxaVar.a2 = true;
                    }
                } else if (i > 0) {
                    boolean z4 = dxaVar.a2;
                    if (!z4 && i2 > 0) {
                        if (z4) {
                            i5 = 2131747578;
                        }
                        String M02 = jb6.M0(i5, null);
                        int i10 = wwa.b;
                        c6c K2 = c6c.K(wwa.class);
                        K2.d = -1;
                        K2.m = M02;
                        K2.f = !dxaVar.a2;
                        K2.r = true;
                        arrayList.add(K2);
                    }
                } else {
                    int i11 = 0;
                    while (i11 < w.size()) {
                        arrayList.add(axa.i(i11, i3, (TL_stars.TL_starsTopupOption) w.get(i11)));
                        i11++;
                        i3++;
                    }
                }
            } else {
                arrayList.add(c6c.p(31));
                arrayList.add(c6c.p(31));
                arrayList.add(c6c.p(31));
            }
        }
        arrayList.add(c6c.k(dxaVar.U1));
    }

    private final void i(Object obj, Object obj2) {
        int i;
        exa exaVar = (exa) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        aq1.o(2131743899, null, arrayList);
        ArrayList w = jva.v(exaVar.a, false).w();
        if (w != null && !w.isEmpty()) {
            int i2 = 0;
            int i3 = 1;
            for (int i4 = 0; i4 < w.size(); i4++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                if (tL_starsTopupOption.extended && !exaVar.U1) {
                    i2++;
                } else {
                    arrayList.add(axa.i(i4, i3, tL_starsTopupOption));
                    i3++;
                }
            }
            boolean z = exaVar.U1;
            if (!z && i2 > 0) {
                if (z) {
                    i = 2131747578;
                } else {
                    i = 2131747569;
                }
                String M0 = jb6.M0(i, null);
                int i5 = wwa.b;
                c6c K = c6c.K(wwa.class);
                K.d = -1;
                K.m = M0;
                K.f = !exaVar.U1;
                K.r = true;
                arrayList.add(K);
            }
        } else {
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
            arrayList.add(c6c.p(31));
        }
        arrayList.add(c6c.k(exaVar.S1));
    }

    private final void j(Object obj, Object obj2) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        boolean z;
        kxa kxaVar = (kxa) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        boolean z2 = kxaVar.e;
        int i3 = kxaVar.d;
        long j = kxaVar.f;
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i5 = kxaVar.c;
        if (i4 != 0) {
            ku0 g = ku0.g(i5);
            ArrayList arrayList3 = g.k(j).a[i3];
            int size = arrayList3.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                int i7 = hxa.b;
                c6c K = c6c.K(hxa.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.r = true;
                arrayList2.add(K);
            }
            if (!g.k(j).e[i3]) {
                arrayList2.add(c6c.q(arrayList2.size(), 7));
                arrayList2.add(c6c.q(arrayList2.size(), 7));
                arrayList2.add(c6c.q(arrayList2.size(), 7));
                return;
            }
            return;
        }
        jva v = jva.v(i5, z2);
        ArrayList[] arrayListArr = v.q;
        if (z2 && u15.c(i5)) {
            if (kxaVar.n == null) {
                kxaVar.n = new l0c();
            }
            kxaVar.r = c.C(i5).x();
            ArrayList arrayList4 = arrayListArr[i3];
            l0c l0cVar = kxaVar.n;
            t15 t15Var = u15.b[i5];
            String x = c.C(i5).x();
            HashSet hashSet = l0cVar.a;
            HashSet hashSet2 = l0cVar.a;
            HashMap hashMap = l0cVar.b;
            hashSet.clear();
            hashMap.clear();
            if (x != null && !x.isEmpty()) {
                hashSet2.add(x);
            }
            hashMap.clear();
            l0cVar.b(4, new ArrayList(hashSet2));
            if (t15Var != null && t15Var.g == null && System.currentTimeMillis() - t15Var.e <= 600000 && i3 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.id = "earnings:" + t15Var.b;
                wallettransaction.pending = true;
                wallettransaction.amount = t15Var.c;
                wallettransaction.date = t15Var.d;
                wallettransaction.peer = new i0c(x);
                arrayList2.add(k0c.i(wallettransaction, l0cVar));
            }
            HashSet e = u15.e(i5);
            int size2 = arrayList4.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj4 = arrayList4.get(i8);
                i8++;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) obj4;
                String str2 = starsTransaction.id;
                if (str2 != null && ((e.contains(str2) || (t15Var != null && starsTransaction.id.equals(t15Var.g))) && starsTransaction.amount != null)) {
                    TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                    StringBuilder sb = new StringBuilder("earnings:");
                    if (t15Var != null) {
                        arrayList = arrayList4;
                        if (starsTransaction.id.equals(t15Var.g)) {
                            str = t15Var.b;
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
                            wallettransaction2.peer = new i0c(x);
                            arrayList2.add(k0c.i(wallettransaction2, l0cVar));
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
                    wallettransaction2.peer = new i0c(x);
                    arrayList2.add(k0c.i(wallettransaction2, l0cVar));
                } else {
                    arrayList = arrayList4;
                    i2 = i3;
                    int i9 = hxa.b;
                    c6c K2 = c6c.K(hxa.class);
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
                int i11 = hxa.b;
                c6c K3 = c6c.K(hxa.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.r = false;
                arrayList2.add(K3);
            }
        }
        if (!v.u[i]) {
            arrayList2.add(c6c.q(arrayList2.size(), 7));
            arrayList2.add(c6c.q(arrayList2.size(), 7));
            arrayList2.add(c6c.q(arrayList2.size(), 7));
        }
    }

    @Override
    public final void a(java.lang.Object r29, java.lang.Object r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh8.a(java.lang.Object, java.lang.Object):void");
    }
}
