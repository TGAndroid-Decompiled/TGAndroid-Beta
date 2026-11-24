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
public final class tf8 implements i8c {
    public final byte a;
    public final Object b;

    public tf8(Object obj, byte b) {
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
        iy9 iy9Var = (iy9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        hy9 hy9Var = iy9Var.b2;
        hy9 hy9Var2 = iy9Var.a2;
        TLRPC.User user = iy9Var.T1;
        hy9 hy9Var3 = iy9Var.Z1;
        if (hy9Var3 != null) {
            ArrayList arrayList2 = hy9Var3.d;
            if (hy9Var2 != null) {
                ArrayList arrayList3 = hy9Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(y6c.h(iy9Var.a).e()));
                arrayList.add(c4c.E(3, gl.L(64.0f)));
                int i5 = 29;
                if (hy9Var != null && !TextUtils.isEmpty(hy9Var.c.q)) {
                    ArrayList arrayList4 = hy9Var.d;
                    int size = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj3 = arrayList4.get(i6);
                        i6++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(cf3.d(tLObject)))) {
                            hashSet.add(Long.valueOf(cf3.d(tLObject)));
                            c4c w = c4c.w(tLObject);
                            if (cf3.d(tLObject) == cf3.d(iy9Var.V1)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            w.L(z7);
                            arrayList.add(w);
                        }
                    }
                    if (hy9Var.f) {
                        arrayList.add(c4c.p(29));
                        arrayList.add(c4c.p(29));
                        arrayList.add(c4c.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(c4c.k(iy9Var.Y1));
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
                        if (cf3.d((TLObject) obj4) == cf3.d(user)) {
                            if (!hashSet.contains(Long.valueOf(cf3.d(user)))) {
                                if (hc2.V(iy9Var.S1)) {
                                    i4 = 2131752504;
                                } else {
                                    i4 = 2131749307;
                                }
                                arrayList.add(c4c.r(k96.M0(i4, null)));
                                hashSet.add(Long.valueOf(cf3.d(user)));
                                c4c w2 = c4c.w(user);
                                if (cf3.d(user) == cf3.d(iy9Var.V1)) {
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
                    if (!hashSet.contains(Long.valueOf(cf3.d(tLObject2)))) {
                        if (z) {
                            if (hc2.V(iy9Var.S1)) {
                                i3 = 2131752504;
                            } else {
                                i3 = 2131749307;
                            }
                            arrayList.add(c4c.r(k96.M0(i3, null)));
                            z = false;
                        }
                        hashSet.add(Long.valueOf(cf3.d(tLObject2)));
                        c4c w3 = c4c.w(tLObject2);
                        if (cf3.d(tLObject2) == cf3.d(iy9Var.V1)) {
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
                if (hy9Var3.f) {
                    arrayList.add(c4c.p(i10));
                    arrayList.add(c4c.p(i10));
                    arrayList.add(c4c.p(i10));
                }
                if (user != null && !hashSet.contains(Long.valueOf(cf3.d(user)))) {
                    if (hc2.V(iy9Var.S1)) {
                        i2 = 2131752276;
                    } else {
                        i2 = 2131749236;
                    }
                    arrayList.add(c4c.r(k96.M0(i2, null)));
                    hashSet.add(Long.valueOf(cf3.d(user)));
                    c4c w4 = c4c.w(user);
                    if (cf3.d(user) == cf3.d(iy9Var.V1)) {
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
                    if (!hashSet.contains(Long.valueOf(cf3.d(tLObject3)))) {
                        if (z2) {
                            if (hc2.V(iy9Var.S1)) {
                                i = 2131752276;
                            } else {
                                i = 2131749236;
                            }
                            arrayList.add(c4c.r(k96.M0(i, null)));
                            z2 = false;
                        }
                        hashSet.add(Long.valueOf(cf3.d(tLObject3)));
                        c4c w5 = c4c.w(tLObject3);
                        if (cf3.d(tLObject3) == cf3.d(iy9Var.V1)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        w5.L(z3);
                        arrayList.add(w5);
                    }
                }
                if (!arrayList3.isEmpty() && hy9Var2.f) {
                    arrayList.add(c4c.p(i10));
                    arrayList.add(c4c.p(i10));
                    arrayList.add(c4c.p(i10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        hy9 hy9Var = (hy9) this.b;
        ArrayList arrayList = hy9Var.e;
        TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        int i = hy9Var.a;
        ArrayList arrayList2 = hy9Var.d;
        int i2 = 0;
        if (tL_error != null) {
            if (hy9Var.r) {
                arrayList2.clear();
                hy9Var.r = false;
            }
            hy9Var.h = true;
            hy9Var.f = false;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                ((Runnable) obj3).run();
            }
            return;
        }
        na7.q1(i).a4(channels_channelparticipants.users, false);
        na7.q1(i).U3(channels_channelparticipants.chats, false);
        if (hy9Var.r) {
            arrayList2.clear();
            hy9Var.r = false;
        }
        ArrayList<TLRPC.ChannelParticipant> arrayList3 = channels_channelparticipants.participants;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            TLRPC.ChannelParticipant channelParticipant = arrayList3.get(i3);
            i3++;
            TLObject Z1 = na7.q1(i).Z1(cf3.n(channelParticipant.peer));
            if (Z1 != null) {
                arrayList2.add(Z1);
            }
        }
        if (channels_channelparticipants.participants.size() < 30) {
            hy9Var.h = true;
        }
        hy9Var.f = false;
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
        ny9 ny9Var = (ny9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        xsa xsaVar = ny9Var.T1;
        if (xsaVar == null) {
            return;
        }
        ArrayList arrayList2 = xsaVar.l;
        arrayList.add(c4c.D(gl.L(16.0f)));
        if (xsaVar.i && arrayList2.isEmpty()) {
            c4c q = c4c.q(1, 34);
            q.v = 1;
            arrayList.add(q);
            c4c q2 = c4c.q(2, 34);
            q2.v = 1;
            arrayList.add(q2);
            c4c q3 = c4c.q(3, 34);
            q3.v = 1;
            arrayList.add(q3);
            c4c q4 = c4c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            c4c q5 = c4c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            c4c q6 = c4c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
            c4c q7 = c4c.q(7, 34);
            q7.v = 1;
            arrayList.add(q7);
            c4c q8 = c4c.q(8, 34);
            q8.v = 1;
            arrayList.add(q8);
            c4c q9 = c4c.q(9, 34);
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
                if (!savedStarGift.collection_id.contains(Integer.valueOf(ny9Var.S1))) {
                    int i5 = mv4.b;
                    c4c K = c4c.K(mv4.class);
                    K.v = 1;
                    K.A = 0;
                    K.H = savedStarGift;
                    K.r = true;
                    K.f = true;
                    K.s = false;
                    HashSet hashSet = ny9Var.U1;
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
            if (xsaVar.i || !xsaVar.j) {
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
                    c4c q10 = c4c.q(i2, 34);
                    q10.v = 1;
                    arrayList.add(q10);
                }
            }
        }
        arrayList.add(c4c.D(gl.L(68.0f)));
    }

    private final void e(Object obj, Object obj2) {
        int i;
        long j;
        TL_stories.StoryItem storyItem;
        qy9 qy9Var = (qy9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        int i2 = qy9Var.W1;
        y1b y1bVar = qy9Var.U1;
        if (y1bVar == null) {
            return;
        }
        arrayList.add(c4c.D(gl.L(16.0f)));
        ArrayList arrayList2 = y1bVar.i;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = i2;
        int i5 = 0;
        while (i5 < size) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            k27 k27Var = (k27) obj3;
            int i6 = v3b.c;
            c4c K = c4c.K(v3b.class);
            K.v = 1;
            K.A = 0;
            K.H = k27Var;
            if (k27Var != null && (storyItem = k27Var.l) != null) {
                j = storyItem.id;
            } else {
                j = -1;
            }
            K.C = j;
            K.f = true;
            K.w = i2;
            K.L(qy9Var.V1.containsKey(Integer.valueOf(k27Var.e1())));
            K.v = 1;
            arrayList.add(K);
            i4--;
            if (i4 == 0) {
                i4 = i2;
            }
        }
        if (y1bVar.k() || !y1bVar.r) {
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
                c4c q = c4c.q(i3, 34);
                q.v = 1;
                arrayList.add(q);
            }
        }
        arrayList.add(c4c.D(gl.L(68.0f)));
    }

    private final void f(Object obj, Object obj2) {
        String str;
        kna knaVar = (kna) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        ArrayList arrayList2 = knaVar.Y1;
        boolean z = knaVar.p2;
        ee0 ee0Var = knaVar.b2;
        ArrayList arrayList3 = knaVar.W1;
        ArrayList arrayList4 = knaVar.V1;
        ee0 ee0Var2 = knaVar.a2;
        ee0 ee0Var3 = knaVar.Z1;
        ArrayList arrayList5 = knaVar.X1;
        if (arrayList5 != null && arrayList4 != null && arrayList3 != null) {
            arrayList.add(c4c.D(gl.L(315.0f)));
            int i = 0;
            ee0Var3.a = 0;
            ee0Var3.b();
            ee0Var2.a = 0;
            ee0Var2.b();
            ee0Var.a = 0;
            ee0Var.b();
            int i2 = knaVar.e2.s;
            if (i2 == 0) {
                String str2 = "GiftPreviewCountModels";
                if (!z) {
                    str = "GiftPreviewCountModels";
                } else {
                    str = "GiftPreviewCountModelsCrafting";
                }
                arrayList.add(c4c.g(gl.T2(k96.H(',', str, arrayList5.size()))));
                int size = arrayList5.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList5.get(i3);
                    i3++;
                    arrayList.add(hna.i(i2, new gna((TL_stars.starGiftAttributeBackdrop) ee0Var3.b(), (TL_stars.starGiftAttributePattern) ee0Var2.b(), (TL_stars.starGiftAttributeModel) obj3)));
                }
                if (!arrayList2.isEmpty()) {
                    if (z) {
                        str2 = "GiftPreviewCountModelsCrafting2";
                    }
                    arrayList.add(c4c.g(gl.T2(k96.H(',', str2, arrayList5.size()))));
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj4 = arrayList2.get(i);
                        i++;
                        arrayList.add(hna.i(i2, new gna((TL_stars.starGiftAttributeBackdrop) ee0Var3.b(), (TL_stars.starGiftAttributePattern) ee0Var2.b(), (TL_stars.starGiftAttributeModel) obj4)));
                    }
                }
            } else if (i2 == 1) {
                arrayList.add(c4c.g(gl.T2(k96.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
                int size3 = arrayList4.size();
                while (i < size3) {
                    Object obj5 = arrayList4.get(i);
                    i++;
                    arrayList.add(hna.i(i2, new gna((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) ee0Var2.b(), (TL_stars.starGiftAttributeModel) ee0Var.b())));
                }
            } else if (i2 == 2) {
                arrayList.add(c4c.g(gl.T2(k96.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
                int size4 = arrayList3.size();
                while (i < size4) {
                    Object obj6 = arrayList3.get(i);
                    i++;
                    arrayList.add(hna.i(i2, new gna((TL_stars.starGiftAttributeBackdrop) ee0Var3.b(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) ee0Var.b())));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        int i;
        String e;
        vua vuaVar = (vua) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        arrayList.add(c4c.k(vuaVar.S1));
        arrayList.add(c4c.u(k96.M0(2131743973, null)));
        ArrayList r = gta.v(vuaVar.a, false).r();
        if (r != null && !r.isEmpty()) {
            int i2 = 0;
            int i3 = 1;
            for (int i4 = 0; i4 < r.size(); i4++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) r.get(i4);
                if (!vuaVar.X1 && tL_starsGiftOption.extended) {
                    i2++;
                } else {
                    int i5 = i3 + 1;
                    int i6 = wua.b;
                    c4c K = c4c.K(wua.class);
                    K.d = i4;
                    K.A = i3;
                    long j = tL_starsGiftOption.stars;
                    K.C = j;
                    K.m = k96.H(' ', "StarsCount", (int) j);
                    if (tL_starsGiftOption.loadingStorePrice) {
                        e = null;
                    } else {
                        e = ci0.h().e(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    }
                    K.n = e;
                    K.H = tL_starsGiftOption;
                    arrayList.add(K);
                    i3 = i5;
                }
            }
            boolean z = vuaVar.X1;
            if (!z && i2 > 0) {
                if (z) {
                    i = 2131747652;
                } else {
                    i = 2131747643;
                }
                String M0 = k96.M0(i, null);
                int i7 = sua.b;
                c4c K2 = c4c.K(sua.class);
                K2.d = -1;
                K2.m = M0;
                K2.f = !vuaVar.X1;
                K2.r = true;
                arrayList.add(K2);
            }
        } else {
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
        }
        arrayList.add(c4c.k(vuaVar.T1));
    }

    private final void h(Object obj, Object obj2) {
        zua zuaVar = (zua) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        long j = zuaVar.S1;
        dr0 dr0Var = zuaVar.T1;
        arrayList.add(c4c.m(dr0Var));
        boolean z = zuaVar.Y1;
        if (z) {
            oo1.o(2131743973, null, arrayList);
        }
        ArrayList w = gta.v(zuaVar.a, false).w();
        if (z) {
            if (w != null && !w.isEmpty()) {
                int i = 0;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 1;
                for (int i4 = 0; i4 < w.size(); i4++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                    if (tL_starsTopupOption.stars >= j) {
                        if (tL_starsTopupOption.extended && !zuaVar.a2 && z2) {
                            i2++;
                        } else {
                            arrayList.add(wua.i(i4, i3, tL_starsTopupOption));
                            i++;
                            z2 = true;
                            i3++;
                        }
                    }
                }
                int i5 = 2131747643;
                if (i < 3) {
                    arrayList.clear();
                    arrayList.add(c4c.k(dr0Var));
                    arrayList.add(c4c.u(k96.M0(2131743973, null)));
                    int i6 = 0;
                    for (int i7 = 0; i7 < w.size(); i7++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) w.get(i7);
                        if (tL_starsTopupOption2.stars >= j) {
                            arrayList.add(wua.i(i7, i3, tL_starsTopupOption2));
                            i6++;
                            i3++;
                        }
                    }
                    if (i6 == 0) {
                        int i8 = 0;
                        while (i8 < w.size()) {
                            arrayList.add(wua.i(i8, i3, (TL_stars.TL_starsTopupOption) w.get(i8)));
                            i8++;
                            i3++;
                        }
                        boolean z3 = zuaVar.a2;
                        if (!z3 && i2 > 0) {
                            if (z3) {
                                i5 = 2131747652;
                            }
                            String M0 = k96.M0(i5, null);
                            int i9 = sua.b;
                            c4c K = c4c.K(sua.class);
                            K.d = -1;
                            K.m = M0;
                            K.f = !zuaVar.a2;
                            K.r = true;
                            arrayList.add(K);
                        }
                    } else {
                        zuaVar.a2 = true;
                    }
                } else if (i > 0) {
                    boolean z4 = zuaVar.a2;
                    if (!z4 && i2 > 0) {
                        if (z4) {
                            i5 = 2131747652;
                        }
                        String M02 = k96.M0(i5, null);
                        int i10 = sua.b;
                        c4c K2 = c4c.K(sua.class);
                        K2.d = -1;
                        K2.m = M02;
                        K2.f = !zuaVar.a2;
                        K2.r = true;
                        arrayList.add(K2);
                    }
                } else {
                    int i11 = 0;
                    while (i11 < w.size()) {
                        arrayList.add(wua.i(i11, i3, (TL_stars.TL_starsTopupOption) w.get(i11)));
                        i11++;
                        i3++;
                    }
                }
            } else {
                arrayList.add(c4c.p(31));
                arrayList.add(c4c.p(31));
                arrayList.add(c4c.p(31));
            }
        }
        arrayList.add(c4c.k(zuaVar.U1));
    }

    private final void i(Object obj, Object obj2) {
        int i;
        ava avaVar = (ava) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        oo1.o(2131743973, null, arrayList);
        ArrayList w = gta.v(avaVar.a, false).w();
        if (w != null && !w.isEmpty()) {
            int i2 = 0;
            int i3 = 1;
            for (int i4 = 0; i4 < w.size(); i4++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) w.get(i4);
                if (tL_starsTopupOption.extended && !avaVar.U1) {
                    i2++;
                } else {
                    arrayList.add(wua.i(i4, i3, tL_starsTopupOption));
                    i3++;
                }
            }
            boolean z = avaVar.U1;
            if (!z && i2 > 0) {
                if (z) {
                    i = 2131747652;
                } else {
                    i = 2131747643;
                }
                String M0 = k96.M0(i, null);
                int i5 = sua.b;
                c4c K = c4c.K(sua.class);
                K.d = -1;
                K.m = M0;
                K.f = !avaVar.U1;
                K.r = true;
                arrayList.add(K);
            }
        } else {
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
            arrayList.add(c4c.p(31));
        }
        arrayList.add(c4c.k(avaVar.S1));
    }

    private final void j(Object obj, Object obj2) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        boolean z;
        gva gvaVar = (gva) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        l5c l5cVar = (l5c) obj2;
        boolean z2 = gvaVar.e;
        int i3 = gvaVar.d;
        long j = gvaVar.f;
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i5 = gvaVar.c;
        if (i4 != 0) {
            ct0 g = ct0.g(i5);
            ArrayList arrayList3 = g.k(j).a[i3];
            int size = arrayList3.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                int i7 = dva.b;
                c4c K = c4c.K(dva.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.r = true;
                arrayList2.add(K);
            }
            if (!g.k(j).e[i3]) {
                arrayList2.add(c4c.q(arrayList2.size(), 7));
                arrayList2.add(c4c.q(arrayList2.size(), 7));
                arrayList2.add(c4c.q(arrayList2.size(), 7));
                return;
            }
            return;
        }
        gta v = gta.v(i5, z2);
        ArrayList[] arrayListArr = v.q;
        if (z2 && uz4.c(i5)) {
            if (gvaVar.n == null) {
                gvaVar.n = new kyb();
            }
            gvaVar.r = c.C(i5).x();
            ArrayList arrayList4 = arrayListArr[i3];
            kyb kybVar = gvaVar.n;
            tz4 tz4Var = uz4.b[i5];
            String x = c.C(i5).x();
            HashSet hashSet = kybVar.a;
            HashSet hashSet2 = kybVar.a;
            HashMap hashMap = kybVar.b;
            hashSet.clear();
            hashMap.clear();
            if (x != null && !x.isEmpty()) {
                hashSet2.add(x);
            }
            hashMap.clear();
            kybVar.b(4, new ArrayList(hashSet2));
            if (tz4Var != null && tz4Var.g == null && System.currentTimeMillis() - tz4Var.e <= 600000 && i3 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.id = "earnings:" + tz4Var.b;
                wallettransaction.pending = true;
                wallettransaction.amount = tz4Var.c;
                wallettransaction.date = tz4Var.d;
                wallettransaction.peer = new hyb(x);
                arrayList2.add(jyb.i(wallettransaction, kybVar));
            }
            HashSet e = uz4.e(i5);
            int size2 = arrayList4.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj4 = arrayList4.get(i8);
                i8++;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) obj4;
                String str2 = starsTransaction.id;
                if (str2 != null && ((e.contains(str2) || (tz4Var != null && starsTransaction.id.equals(tz4Var.g))) && starsTransaction.amount != null)) {
                    TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                    StringBuilder sb = new StringBuilder("earnings:");
                    if (tz4Var != null) {
                        arrayList = arrayList4;
                        if (starsTransaction.id.equals(tz4Var.g)) {
                            str = tz4Var.b;
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
                            wallettransaction2.peer = new hyb(x);
                            arrayList2.add(jyb.i(wallettransaction2, kybVar));
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
                    wallettransaction2.peer = new hyb(x);
                    arrayList2.add(jyb.i(wallettransaction2, kybVar));
                } else {
                    arrayList = arrayList4;
                    i2 = i3;
                    int i9 = dva.b;
                    c4c K2 = c4c.K(dva.class);
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
                int i11 = dva.b;
                c4c K3 = c4c.K(dva.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.r = false;
                arrayList2.add(K3);
            }
        }
        if (!v.u[i]) {
            arrayList2.add(c4c.q(arrayList2.size(), 7));
            arrayList2.add(c4c.q(arrayList2.size(), 7));
            arrayList2.add(c4c.q(arrayList2.size(), 7));
        }
    }

    @Override
    public final void a(java.lang.Object r31, java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf8.a(java.lang.Object, java.lang.Object):void");
    }
}
