package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class h92 implements jac {
    public final byte a;
    public final Object b;

    public h92(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i;
        qb7 qb7Var;
        int i2;
        final qv9 qv9Var = (qv9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        ArrayList arrayList2 = qv9Var.S;
        ArrayList arrayList3 = qv9Var.Y;
        int i3 = qv9Var.Q;
        int i4 = 0;
        if (TextUtils.isEmpty(qv9Var.e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String M0 = jb6.M0(2131745473, null);
                    if (qv9Var.X) {
                        i2 = 2131745074;
                    } else {
                        i2 = 2131745073;
                    }
                    arrayList.add(c6c.s(M0, jb6.M0(i2, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            qv9 qv9Var2 = qv9Var;
                            switch (b) {
                                case 0:
                                    qv9Var2.X = !qv9Var2.X;
                                    qv9Var2.O(true);
                                    if (qv9Var2.X) {
                                        gm.t1(qv9Var2.g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    qv9Var2.W = !qv9Var2.W;
                                    qv9Var2.O(true);
                                    if (qv9Var2.W) {
                                        gm.t1(qv9Var2.g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(c6c.r(jb6.M0(2131745473, null)));
                }
                int size = arrayList3.size();
                if (!qv9Var.X) {
                    size = Math.min(5, size);
                }
                for (int i5 = 0; i5 < size; i5++) {
                    c6c w = c6c.w((TLObject) arrayList3.get(i5));
                    w.J = true;
                    arrayList.add(w);
                }
            }
            HashMap hashMap = oc7.r1(i3).O4;
            if (hashMap == null) {
                qb7Var = null;
            } else {
                qb7Var = (qb7) hashMap.get(0L);
            }
            if (qb7Var != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = qb7Var.b;
                int size2 = arrayList5.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj3 = arrayList5.get(i6);
                    i6++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(chat.id));
                        if (sd2.r0(chat) && (L0 == null || sd2.r0(L0))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(c6c.r(jb6.M0(2131745445, null)));
                }
                int size3 = arrayList4.size();
                while (i4 < size3) {
                    Object obj4 = arrayList4.get(i4);
                    i4++;
                    arrayList.add(c6c.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(c6c.p(30));
            arrayList.add(c6c.p(29));
            arrayList.add(c6c.p(29));
            arrayList.add(c6c.p(29));
            arrayList.add(c6c.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = qv9Var.T;
        int size4 = arrayList7.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj5 = arrayList7.get(i7);
            i7++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            TLRPC.Chat L02 = oc7.r1(i3).L0(Long.valueOf(chat2.id));
            if (sd2.r0(chat2) && (L02 == null || sd2.r0(L02))) {
                arrayList6.add(chat2);
            }
        }
        ArrayList arrayList8 = qv9Var.U;
        int size5 = arrayList8.size();
        int i8 = 0;
        while (i8 < size5) {
            Object obj6 = arrayList8.get(i8);
            i8++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat L03 = oc7.r1(i3).L0(Long.valueOf(chat3.id));
            if (sd2.r0(chat3) && (L03 == null || sd2.r0(L03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = qv9Var.V;
        int size6 = arrayList9.size();
        int i9 = 0;
        while (i9 < size6) {
            Object obj7 = arrayList9.get(i9);
            i9++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat L04 = oc7.r1(i3).L0(Long.valueOf(chat4.id));
            if (sd2.r0(chat4) && (L04 == null || sd2.r0(L04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String M02 = jb6.M0(2131745548, null);
                if (qv9Var.W) {
                    i = 2131745074;
                } else {
                    i = 2131745073;
                }
                arrayList.add(c6c.s(M02, jb6.M0(i, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        qv9 qv9Var2 = qv9Var;
                        switch (b) {
                            case 0:
                                qv9Var2.X = !qv9Var2.X;
                                qv9Var2.O(true);
                                if (qv9Var2.X) {
                                    gm.t1(qv9Var2.g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                qv9Var2.W = !qv9Var2.W;
                                qv9Var2.O(true);
                                if (qv9Var2.W) {
                                    gm.t1(qv9Var2.g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(c6c.r(jb6.M0(2131745548, null)));
            }
            int size7 = arrayList6.size();
            if (!qv9Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i10 = 0; i10 < size7; i10++) {
                arrayList.add(c6c.w((TLObject) arrayList6.get(i10)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(c6c.r(jb6.M0(2131745490, null)));
            int size8 = arrayList2.size();
            while (i4 < size8) {
                Object obj8 = arrayList2.get(i4);
                i4++;
                c6c c6cVar = new c6c(33);
                c6cVar.H = (k47) obj8;
                arrayList.add(c6cVar);
            }
            if (qv9Var.b0) {
                arrayList.add(c6c.p(1));
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
        ov9 ov9Var = (ov9) ((mm3) this.b);
        nk3 nk3Var = ov9Var.J0;
        gm.t1(nk3Var.getParentActivity().getCurrentFocus());
        bu5 J = bu5.J(nk3Var, (ut8) obj);
        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
            bu5 K = J.K();
            K.b(2131231244, jb6.M0(2131753721, null), new bo1(J, (byte) 10), false);
            K.j();
            if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                K.o(13, -1, tL_sponsoredPeer.sponsor_info);
            }
            if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                    K.j();
                }
                K.o(13, -1, tL_sponsoredPeer.additional_info);
            }
            J.b(2131232094, jb6.M0(2131744937, null), new c20(J, K, (byte) 9), false);
        }
        J.b(2131232191, jb6.M0(2131754943, null), new no8(ov9Var, nk3Var, ov9Var.K0, J, (byte) 12), false);
        J.b(2131232074, jb6.M0(2131745967, null), new no8(ov9Var, nk3Var, tL_sponsoredPeer, J, (byte) 13), false);
        J.j();
        J.b(2131232093, jb6.M0(2131746053, null), new ak8(ov9Var, nk3Var, J, (byte) 28), false);
        if (jb6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        J.W(i);
        J.b0 = true;
        J.t = false;
        J.a0();
    }

    private final void d(Object obj, Object obj2) {
        ex3 ex3Var = (ex3) this.b;
        String str = (String) obj;
        px3 px3Var = ex3Var.s;
        px3Var.l1 = str;
        px3Var.m1 = ((Integer) obj2).intValue();
        ex3Var.c.D(str);
    }

    private final void e(Object obj, Object obj2) {
        String str;
        e34 e34Var = (e34) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        n24 n24Var = e34Var.S1;
        if (n24Var != null && (n24Var.getDrawable() instanceof zr2)) {
            zr2 zr2Var = (zr2) e34Var.S1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            as2 as2Var = zr2Var.c;
            if (as2Var.a != intValue) {
                as2 as2Var2 = zr2Var.g;
                if (as2Var2 != null) {
                    zr2Var.c = as2Var2;
                    as2Var = as2Var2;
                }
                if (as2Var.a != intValue) {
                    as2Var = new as2(intValue, as2Var.b ? 1 : 0);
                }
                zr2Var.g = as2Var;
                ln lnVar = zr2Var.e;
                if (lnVar != null) {
                    lnVar.e(true, 0.0f);
                }
            }
            as2 as2Var3 = zr2Var.d;
            if (as2Var3.a != intValue2) {
                as2 as2Var4 = zr2Var.h;
                if (as2Var4 != null) {
                    zr2Var.d = as2Var4;
                    as2Var3 = as2Var4;
                }
                if (as2Var3.a != intValue2) {
                    as2Var3 = new as2(intValue2, as2Var3.b ? 1 : 0);
                }
                zr2Var.h = as2Var3;
                ln lnVar2 = zr2Var.f;
                if (lnVar2 != null) {
                    lnVar2.e(true, 0.0f);
                }
            }
            zr2Var.invalidateSelf();
            String str2 = (String) e34Var.S1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                gw3.j.remove(str2);
            } else {
                StringBuilder sb = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) bs2.a.get(num.intValue());
                }
                sb.append(str);
                sb.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) bs2.a.get(num2.intValue());
                }
                sb.append(str3);
                gw3.j.put(str2, sb.toString());
            }
            gw3.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        e24 e24Var = (e24) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        ArrayList arrayList2 = e24Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList2.get(i);
            i++;
            x14 x14Var = (x14) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x14Var.b;
            boolean z = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.id != e24Var.d) {
                    z = false;
                }
                int i2 = g24.b;
                c6c K = c6c.K(g24.class);
                long j = tL_messages_stickerSet.set.id;
                K.d = (int) ((j >>> 32) ^ j);
                K.C = j;
                K.H = tL_messages_stickerSet;
                K.e = z;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = x14Var.a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.id != e24Var.d) {
                        z = false;
                    }
                    arrayList.add(g24.i(stickerSetCovered, x14Var, z));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        boolean z;
        z24 z24Var = (z24) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = z24Var.F;
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i);
            i++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                if (tL_messages_stickerSet.set.id != z24Var.d) {
                    z2 = false;
                }
                int i2 = g24.b;
                c6c K = c6c.K(g24.class);
                long j = tL_messages_stickerSet.set.id;
                K.d = (int) ((j >>> 32) ^ j);
                K.C = j;
                K.H = tL_messages_stickerSet;
                K.e = z2;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = z24Var.K;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj4 = arrayList3.get(i3);
            i3++;
            x14 x14Var = (x14) obj4;
            TLRPC.StickerSet stickerSet = x14Var.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = x14Var.a;
                if (stickerSet.id == z24Var.d) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(g24.i(stickerSetCovered, x14Var, z));
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        x34 x34Var = (x34) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        String M0 = jb6.M0(2131743676, null);
        int i = 2;
        c6c c6cVar = new c6c(2);
        c6cVar.m = M0;
        c6cVar.k = 2131624294;
        arrayList.add(c6cVar);
        c6c i2 = c6c.i(1, jb6.M0(2131743679, null));
        i2.L(x34Var.c);
        arrayList.add(i2);
        if (x34Var.c) {
            arrayList.add(c6c.C(null));
            arrayList.add(c6c.u(jb6.M0(2131743675, null)));
            sk3 sk3Var = new sk3(x34Var, (byte) 7);
            int i3 = v34.b;
            c6c K = c6c.K(v34.class);
            K.d = 2;
            K.H = sk3Var;
            if (!x34Var.e) {
                if (x34Var.d) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
            K.A = i;
            arrayList.add(K);
            arrayList.add(c6c.C(jb6.M0(2131743674, null)));
        }
    }

    private final void i(Object obj, Object obj2) {
        ud5 ud5Var = (ud5) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l7c l7cVar = (l7c) obj2;
        arrayList.add(c6c.k(ud5Var.T1));
        arrayList.add(y74.i(jb6.M0(2131750804, null), jb6.M0(2131750805, null), 2131232178));
        arrayList.add(y74.i(jb6.M0(2131750802, null), gm.D2(gm.N2(jb6.M0(2131750803, null), -1, 0, new a14(ud5Var, (byte) 7), null), true), 2131232078));
        arrayList.add(y74.i(jb6.M0(2131750800, null), jb6.M0(2131750801, null), 2131231912));
        arrayList.add(y74.i(jb6.M0(2131750798, null), jb6.M0(2131750799, null), 2131231814));
        arrayList.add(c6c.D(gm.L(68.0f)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        c6c j;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i3;
        int i4;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i5;
        int i6;
        int i7;
        qy1 qy1Var = null;
        String str = null;
        boolean z11 = true;
        int i8 = 0;
        switch (this.a) {
            case 0:
                n92 n92Var = (n92) this.b;
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                ArrayList arrayList2 = n92Var.G;
                bjb bjbVar = n92Var.e;
                if (bjbVar != null && n92Var.f != null) {
                    arrayList.add(c6c.j(1, bjbVar));
                    arrayList.add(c6c.l(2, n92Var.f));
                    int i9 = n92Var.Z;
                    if (i9 == 1 || i9 == 0 || n92Var.a) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            View view = (View) arrayList2.get(i10);
                            if (((Boolean) n92Var.H.get(i10)).booleanValue()) {
                                j = c6c.l(i10 + 100, view);
                            } else {
                                j = c6c.j(i10 + 100, view);
                            }
                            arrayList.add(j);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ba2 ba2Var = (ba2) this.b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    c41.b0(ba2Var).g0(tL_error, false);
                }
                gm.B2(ba2Var.k0);
                gm.B2(ba2Var.h0);
                gm.B2(ba2Var.j0);
                return;
            case 2:
                uf2 uf2Var = (uf2) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    uf2Var.getMessagesController().T3(updates, false);
                    return;
                }
                return;
            case 3:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                gm.d3(new wf2((wg2) this.b, (byte) 1), 1000L);
                return;
            case 4:
                yg2 yg2Var = (yg2) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                l7c l7cVar2 = (l7c) obj2;
                l7cVar2.G = true;
                arrayList3.add(c6c.l(-5, yg2Var.V1));
                TL_account.TL_connectedBot tL_connectedBot = yg2Var.S1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        aq1.o(2131745293, null, arrayList3);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList3.add(c6c.f(jb6.M0(2131745290, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i = 2;
                            arrayList3.add(c6c.f(jb6.M0(2131745289, null), tL_connectedBot.location, 2));
                        } else {
                            i = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i)) {
                            arrayList3.add(c6c.f(jb6.M0(2131745291, null), jb6.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList3.add(c6c.C(null));
                    }
                    l7cVar2.V();
                    arrayList3.add(c6c.u(jb6.M0(2131752772, null)));
                    c6c x = c6c.x(-1, jb6.M0(2131752734, null));
                    x.L(yg2Var.a2);
                    arrayList3.add(x);
                    int i11 = yg2.f2;
                    c6c x2 = c6c.x(-2, jb6.M0(2131752729, null));
                    x2.L(!yg2Var.a2);
                    arrayList3.add(x2);
                    l7cVar2.U();
                    arrayList3.add(c6c.C(null));
                    t51 t51Var = yg2Var.U1;
                    if (t51Var != null) {
                        t51Var.a(arrayList3, l7cVar2, true);
                    }
                    arrayList3.add(c6c.C(jb6.M0(2131752771, null)));
                    return;
                }
                return;
            case 5:
                final hh2 hh2Var = (hh2) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                l7c l7cVar3 = (l7c) obj2;
                LongSparseArray longSparseArray = hh2Var.O;
                String M0 = jb6.M0(2131752736, null);
                String M02 = jb6.M0(2131752735, null);
                c6c c6cVar = new c6c(2);
                c6cVar.m = M0;
                c6cVar.p = M02;
                c6cVar.n = "tg_superplaceholders_android_2";
                c6cVar.o = "🤖🏝️";
                c6cVar.A = 120;
                arrayList4.add(c6cVar);
                if (hh2Var.N != null) {
                    l7cVar3.V();
                    long j2 = hh2Var.N.id;
                    c6c c6cVar2 = new c6c(13);
                    c6cVar2.y = j2;
                    c6cVar2.L(true);
                    c6cVar2.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            byte b = r2;
                            hh2 hh2Var2 = hh2Var;
                            switch (b) {
                                case 0:
                                    hh2Var2.N = null;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights = hh2Var2.K;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = hh2Var2.K;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-14, true, new ah2(hh2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = hh2Var2.K;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-17, true, new ah2(hh2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = hh2Var2.K;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(c6cVar2);
                    l7cVar3.U();
                    z = true;
                } else {
                    l7cVar3.V();
                    arrayList4.add(c6c.k(hh2Var.e));
                    longSparseArray.clear();
                    int i12 = 0;
                    boolean z12 = false;
                    while (i12 < hh2Var.d.d.size()) {
                        TLObject tLObject = (TLObject) hh2Var.d.d.get(i12);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                boolean z13 = z11;
                                long j3 = user.id;
                                z3 = z13;
                                String str2 = hh2Var.E;
                                c6c c6cVar3 = new c6c(13);
                                c6cVar3.y = j3;
                                c6cVar3.o = str2;
                                arrayList4.add(c6cVar3);
                                longSparseArray.put(user.id, user);
                                z12 = z3;
                                i12++;
                                z11 = z3;
                            }
                        }
                        z3 = z11;
                        i12++;
                        z11 = z3;
                    }
                    z = z11;
                    for (int i13 = 0; i13 < hh2Var.d.e.size(); i13++) {
                        TLObject tLObject2 = (TLObject) hh2Var.d.e.get(i13);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j4 = user2.id;
                                String str3 = hh2Var.E;
                                c6c c6cVar4 = new c6c(13);
                                c6cVar4.y = j4;
                                c6cVar4.o = str3;
                                arrayList4.add(c6cVar4);
                                longSparseArray.put(user2.id, user2);
                                z12 = z;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(hh2Var.f.getText().toString()) || hh2Var.d.e() || hh2Var.y)) {
                        arrayList4.add(c6c.k(hh2Var.n));
                        z2 = z;
                    } else {
                        z2 = z12;
                    }
                    View view2 = hh2Var.h;
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view2.setVisibility(i2);
                    l7cVar3.U();
                }
                arrayList4.add(c6c.C(jb6.M0(2131752768, null)));
                l7cVar3.V();
                c6c u = c6c.u(jb6.M0(2131752772, null));
                if (hh2Var.N != null) {
                    z4 = z;
                } else {
                    z4 = false;
                }
                u.g = z4;
                arrayList4.add(u);
                c6c x3 = c6c.x(-1, jb6.M0(2131752734, null));
                x3.L(hh2Var.J);
                if (hh2Var.N != null) {
                    z5 = z;
                } else {
                    z5 = false;
                }
                x3.g = z5;
                arrayList4.add(x3);
                c6c x4 = c6c.x(-2, jb6.M0(2131752729, null));
                x4.L(!hh2Var.J);
                if (hh2Var.N != null) {
                    z6 = z;
                } else {
                    z6 = false;
                }
                x4.g = z6;
                arrayList4.add(x4);
                l7cVar3.U();
                arrayList4.add(c6c.C(null));
                t51 t51Var2 = hh2Var.w;
                if (hh2Var.N != null) {
                    z7 = z;
                } else {
                    z7 = false;
                }
                t51Var2.a(arrayList4, l7cVar3, z7);
                arrayList4.add(c6c.C(jb6.M0(2131752771, null)));
                if (hh2Var.N != null) {
                    l7cVar3.V();
                    arrayList4.add(c6c.u(jb6.M0(2131752761, null)));
                    String M03 = jb6.M0(2131752748, null);
                    StringBuilder sb = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = hh2Var.K;
                    sb.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb.append("/5");
                    c6c o = c6c.o(-4, M03, sb.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = hh2Var.K;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z8 = z;
                    } else {
                        z8 = false;
                    }
                    o.L(z8);
                    o.f = !hh2Var.Q;
                    boolean z14 = z;
                    final byte b = z14 ? (byte) 1 : (byte) 0;
                    o.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view22) {
                            byte b2 = b;
                            hh2 hh2Var2 = hh2Var;
                            switch (b2) {
                                case 0:
                                    hh2Var2.N = null;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = hh2Var2.K;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = hh2Var2.K;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-14, true, new ah2(hh2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = hh2Var2.K;
                                    if (tL_businessBotRights32.view_gifts && tL_businessBotRights32.sell_gifts && tL_businessBotRights32.change_gift_settings && tL_businessBotRights32.transfer_and_upgrade_gifts && tL_businessBotRights32.transfer_stars) {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-17, true, new ah2(hh2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = hh2Var2.K;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(o);
                    if (hh2Var.Q) {
                        c6c z15 = c6c.z(-5, jb6.M0(2131752750, null));
                        z15.L(z14);
                        z15.g = false;
                        z15.i = z14 ? 1 : 0;
                        arrayList4.add(z15);
                        c6c z16 = c6c.z(-6, jb6.M0(2131752749, null));
                        z16.L(hh2Var.K.reply);
                        z16.i = z14 ? 1 : 0;
                        arrayList4.add(z16);
                        c6c z17 = c6c.z(-7, jb6.M0(2131752751, null));
                        z17.L(hh2Var.K.read_messages);
                        z17.i = z14 ? 1 : 0;
                        arrayList4.add(z17);
                        c6c z18 = c6c.z(-8, jb6.M0(2131752752, null));
                        z18.L(hh2Var.K.delete_sent_messages);
                        z18.i = z14 ? 1 : 0;
                        arrayList4.add(z18);
                        c6c z19 = c6c.z(-9, jb6.M0(2131752753, null));
                        z19.L(hh2Var.K.delete_received_messages);
                        z19.i = z14 ? 1 : 0;
                        arrayList4.add(z19);
                    }
                    String M04 = jb6.M0(2131752744, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = hh2Var.K;
                    sb2.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb2.append("/4");
                    c6c o2 = c6c.o(-10, M04, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = hh2Var.K;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o2.L(z9);
                    o2.f = !hh2Var.R;
                    o2.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view22) {
                            byte b2 = b;
                            hh2 hh2Var2 = hh2Var;
                            switch (b2) {
                                case 0:
                                    hh2Var2.N = null;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = hh2Var2.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = hh2Var2.K;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-14, true, new ah2(hh2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = hh2Var2.K;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-17, true, new ah2(hh2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = hh2Var2.K;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(o2);
                    if (hh2Var.R) {
                        c6c z20 = c6c.z(-11, jb6.M0(2131752746, null));
                        z20.L(hh2Var.K.edit_name);
                        z20.i = 1;
                        arrayList4.add(z20);
                        c6c z21 = c6c.z(-12, jb6.M0(2131752747, null));
                        z21.L(hh2Var.K.edit_bio);
                        z21.i = 1;
                        arrayList4.add(z21);
                        c6c z22 = c6c.z(-13, jb6.M0(2131752745, null));
                        z22.L(hh2Var.K.edit_profile_photo);
                        z22.i = 1;
                        arrayList4.add(z22);
                        c6c z23 = c6c.z(-14, jb6.M0(2131752743, null));
                        z23.L(hh2Var.K.edit_username);
                        z23.i = 1;
                        arrayList4.add(z23);
                    }
                    String M05 = jb6.M0(2131752760, null);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = hh2Var.K;
                    sb3.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb3.append("/5");
                    c6c o3 = c6c.o(-15, M05, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = hh2Var.K;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o3.L(z10);
                    o3.f = !hh2Var.S;
                    o3.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view22) {
                            byte b2 = b;
                            hh2 hh2Var2 = hh2Var;
                            switch (b2) {
                                case 0:
                                    hh2Var2.N = null;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = hh2Var2.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = hh2Var2.K;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-14, true, new ah2(hh2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = hh2Var2.K;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-17, true, new ah2(hh2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = hh2Var2.K;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(o3);
                    if (hh2Var.S) {
                        c6c z24 = c6c.z(-16, jb6.M0(2131752755, null));
                        z24.L(hh2Var.K.view_gifts);
                        z24.i = 1;
                        arrayList4.add(z24);
                        c6c z25 = c6c.z(-17, jb6.M0(2131752759, null));
                        z25.L(hh2Var.K.sell_gifts);
                        z25.i = 1;
                        arrayList4.add(z25);
                        c6c z26 = c6c.z(-18, jb6.M0(2131752758, null));
                        z26.L(hh2Var.K.change_gift_settings);
                        z26.i = 1;
                        arrayList4.add(z26);
                        c6c z27 = c6c.z(-19, jb6.M0(2131752757, null));
                        z27.L(hh2Var.K.transfer_and_upgrade_gifts);
                        z27.i = 1;
                        arrayList4.add(z27);
                        c6c z28 = c6c.z(-20, jb6.M0(2131752756, null));
                        z28.L(hh2Var.K.transfer_stars);
                        z28.i = 1;
                        arrayList4.add(z28);
                    }
                    c6c o4 = c6c.o(-21, jb6.M0(2131752742, null), "");
                    o4.L(hh2Var.K.manage_stories);
                    o4.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view22) {
                            byte b2 = b;
                            hh2 hh2Var2 = hh2Var;
                            switch (b2) {
                                case 0:
                                    hh2Var2.N = null;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = hh2Var2.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = hh2Var2.K;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-14, true, new ah2(hh2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = hh2Var2.K;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        hh2Var2.c.g3.O(true);
                                        hh2Var2.a0(true);
                                        return;
                                    }
                                    hh2Var2.Z(-17, true, new ah2(hh2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = hh2Var2.K;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    hh2Var2.c.g3.O(true);
                                    hh2Var2.a0(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(o4);
                    l7cVar3.U();
                    arrayList4.add(c6c.B(-4, null));
                    arrayList4.add(c6c.B(-5, null));
                    arrayList4.add(c6c.B(-6, null));
                    arrayList4.add(c6c.B(-7, null));
                    return;
                }
                return;
            case 6:
                ((wm4) this.b).c0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                co2 co2Var = (co2) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                l7c l7cVar4 = (l7c) obj2;
                arrayList5.add(c6c.E(0, gm.L(12.0f)));
                arrayList5.add(c6c.j(1, co2Var.U1));
                arrayList5.add(c6c.E(2, gm.L(12.0f)));
                arrayList5.add(c6c.t(3, jb6.M0(2131751884, null)));
                co2Var.X1 = arrayList5.size();
                String M06 = jb6.M0(2131751883, null);
                boolean z29 = co2Var.W1;
                if (z29) {
                    i3 = 2131751882;
                } else {
                    i3 = 2131751881;
                }
                c6c y = c6c.y(151, M06, jb6.M0(i3, null));
                y.L(!co2Var.T1);
                arrayList5.add(y);
                String M07 = jb6.M0(2131751887, null);
                if (z29) {
                    i4 = 2131751886;
                } else {
                    i4 = 2131751885;
                }
                c6c y2 = c6c.y(150, M07, jb6.M0(i4, null));
                y2.L(co2Var.T1);
                arrayList5.add(y2);
                arrayList5.add(c6c.B(6, jb6.M0(2131751888, null)));
                return;
            case 8:
                l7c l7cVar5 = (l7c) obj2;
                ((ArrayList) obj).add(c6c.j(0, ((qo2) this.b).S1));
                return;
            case 9:
                l7c l7cVar6 = (l7c) obj2;
                ((ap2) this.b).w.c((ArrayList) obj);
                return;
            case 10:
                tu2 tu2Var = (tu2) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                l7c l7cVar7 = (l7c) obj2;
                TLRPC.User W1 = tu2Var.getMessagesController().W1(Long.valueOf(tu2Var.I));
                arrayList6.add(c6c.k(tu2Var.W));
                arrayList6.add(c6c.k(tu2Var.b));
                arrayList6.add(c6c.k(tu2Var.c));
                if (TextUtils.isEmpty(tu2Var.b0())) {
                    arrayList6.add(c6c.C(gm.G2(gm.S2(jb6.M0(2131748166, null)), m9c.k(W1, true), "%1$s")));
                } else if (tu2Var.L) {
                    arrayList6.add(c6c.C(gm.S2(jb6.a0("MobileVisibleInfo", null, 2131748165, m9c.k(W1, true)))));
                } else {
                    arrayList6.add(c6c.C(null));
                }
                if (tu2Var.J && tu2Var.L) {
                    c6c i14 = c6c.i(2, jb6.M0(2131754444, null));
                    i14.L(tu2Var.Y);
                    arrayList6.add(i14);
                    arrayList6.add(c6c.C(jb6.a0(null, null, 2131754443, m9c.k(W1, true))));
                }
                arrayList6.add(c6c.k(tu2Var.d));
                arrayList6.add(c6c.C(jb6.M0(2131754391, null)));
                if (!tu2Var.J) {
                    TLRPC.UserFull X1 = tu2Var.getMessagesController().X1(tu2Var.I);
                    if (X1 != null && X1.birthday == null) {
                        arrayList6.add(c6c.k(tu2Var.G));
                    }
                    arrayList6.add(c6c.k(tu2Var.y));
                    arrayList6.add(c6c.k(tu2Var.E));
                    if (W1 != null && (userProfilePhoto = W1.photo) != null && userProfilePhoto.personal) {
                        arrayList6.add(c6c.k(tu2Var.F));
                    }
                    arrayList6.add(c6c.C(null));
                    c6c e = c6c.e(1, jb6.M0(2131751489, null));
                    e.s = true;
                    arrayList6.add(e);
                }
                arrayList6.add(c6c.C(null));
                if (tu2Var.Z) {
                    gm.c3(new ju2(tu2Var, W1, (byte) 0));
                    tu2Var.Z = false;
                    gm.d3(new hu2(tu2Var, (byte) 1), 200L);
                    return;
                }
                return;
            case 11:
                ((hx2) this.b).f((Bitmap) obj, (Bitmap) obj2);
                return;
            case 12:
                dx2 dx2Var = (dx2) this.b;
                CharSequence charSequence = (CharSequence) obj;
                qac qacVar = (qac) obj2;
                hx2 hx2Var = dx2Var.a;
                fx2 fx2Var = hx2Var.l;
                if (fx2Var != null) {
                    String join = TextUtils.join("", hx2Var.o);
                    if (qacVar != null) {
                        qy1Var = new qy1(dx2Var, qacVar, (byte) 12);
                    }
                    fx2Var.z(charSequence, join, qy1Var);
                    if (qacVar == null) {
                        hx2Var.d();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                hz2 hz2Var = (hz2) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                l7c l7cVar8 = (l7c) obj2;
                ArrayList arrayList8 = hz2Var.V1;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int L = gm.L(13.0f) + ((gm.q.y - a.getCurrentActionBarHeight()) - gm.L(68.0f));
                    int L2 = gm.L(88.0f) + hz2Var.g2;
                    arrayList7.add(c6c.E(0, L2));
                    int i15 = L - L2;
                    int size = arrayList8.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList8.get(i16);
                        i16++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hz2Var.U1.get((String) obj3)) {
                            if (TextUtils.isEmpty(hz2Var.X1) || b1a.b1(tL_help_country, gm.I3(hz2Var.X1).toLowerCase())) {
                                i15 -= gm.L(44.0f);
                                boolean containsKey = hz2Var.e2.containsKey(tL_help_country.iso2);
                                int i17 = gz2.b;
                                c6c K = c6c.K(gz2.class);
                                K.m = tL_help_country.iso2;
                                K.H = tL_help_country;
                                K.e = containsKey;
                                arrayList7.add(K);
                            }
                        }
                    }
                    arrayList7.add(c6c.E(1, Math.max(0, i15)));
                    return;
                }
                return;
            case 14:
                c23 c23Var = (c23) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                l7c l7cVar9 = (l7c) obj2;
                arrayList9.add(c6c.k(c23Var.S1));
                arrayList9.add(c6c.C(null));
                ArrayList arrayList10 = c23Var.V1;
                if (arrayList10 != null && !arrayList10.isEmpty()) {
                    aq1.o(2131749246, null, arrayList9);
                    while (i8 < arrayList10.size()) {
                        Long l = (Long) arrayList10.get(i8);
                        l.getClass();
                        TLRPC.User W12 = oc7.r1(c23Var.a).W1(l);
                        if (W12 != null) {
                            int i18 = l1a.b;
                            c6c K2 = c6c.K(l1a.class);
                            K2.H = W12;
                            K2.L(c23Var.W1.contains(l));
                            arrayList9.add(K2);
                            i8++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                r23 r23Var = (r23) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                l7c l7cVar10 = (l7c) obj2;
                t1 t1Var = r23Var.b2;
                t1 t1Var2 = t1Var;
                if (t1Var == null) {
                    Context context = r23Var.getContext();
                    ylb ylbVar = r23Var.J0;
                    t1 t1Var3 = new t1((byte) 6, context, false);
                    t1Var3.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624324, 112, 112, null);
                    imageView.d();
                    t1Var3.addView((View) imageView, qoe.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(gm.o());
                    textView.setText(jb6.a0(null, null, 2131744123, new Object[0]));
                    textView.setTextSize(1, 20.0f);
                    anb.X(textView, cmb.F6, ylbVar);
                    t1Var3.addView(textView, qoe.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    anb.X(textView2, cmb.i5, ylbVar);
                    textView2.setText(jb6.a0(null, null, 2131742920, new Object[0]));
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    t1Var3.addView(textView2, qoe.t(-2, -2, 1, 28, 0, 28, 17));
                    r23Var.b2 = t1Var3;
                    t1Var2 = t1Var3;
                }
                arrayList11.add(c6c.k(t1Var2));
                arrayList11.add(c6c.C(null));
                arrayList11.add(c6c.u(jb6.M0(2131743115, null)));
                String str4 = r23Var.W1;
                String M08 = jb6.M0(2131743116, null);
                int i19 = q23.b;
                c6c K3 = c6c.K(q23.class);
                K3.m = str4;
                K3.o = M08;
                K3.j = false;
                K3.g = false;
                arrayList11.add(K3);
                SpannableStringBuilder spannableStringBuilder = r23Var.Y1;
                String M09 = jb6.M0(2131743117, null);
                c6c K4 = c6c.K(q23.class);
                K4.m = spannableStringBuilder;
                K4.o = M09;
                K4.j = true;
                K4.g = false;
                arrayList11.add(K4);
                if (r23Var.a2) {
                    if (r23Var.S1) {
                        i5 = 2131743112;
                    } else {
                        i5 = 2131743113;
                    }
                    str = jb6.M0(i5, null);
                }
                arrayList11.add(c6c.C(str));
                return;
            case 16:
                l53 l53Var = (l53) this.b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (tL_error4 != null) {
                    hg9.r(tL_error4.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.d.c(new k53(l53Var, currencyrates, (byte) 0));
                    return;
                }
            case 17:
                nk3 nk3Var = (nk3) this.b;
                Long l2 = (Long) obj2;
                nk3Var.R1 = (Long) obj;
                nk3Var.q5();
                return;
            case 18:
                d dVar = (d) obj;
                Long l3 = (Long) obj2;
                ((Runnable) this.b).run();
                return;
            case 19:
                final gl3 gl3Var = (gl3) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                l7c l7cVar11 = (l7c) obj2;
                int i20 = gl3Var.Q;
                sk3 sk3Var = gl3Var.k0;
                fl3 fl3Var = gl3Var.T;
                ArrayList arrayList13 = gl3Var.W;
                boolean z30 = gl3Var.S;
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(gl3Var.h0)) {
                    ArrayList arrayList14 = new ArrayList();
                    arrayList14.addAll(gl3Var.U);
                    arrayList14.addAll(gl3Var.V);
                    if (!arrayList14.isEmpty()) {
                        if (arrayList14.size() > 5 && !arrayList13.isEmpty() && !z30) {
                            String M010 = jb6.M0(2131745556, null);
                            if (gl3Var.Y) {
                                i7 = 2131745074;
                            } else {
                                i7 = 2131745073;
                            }
                            arrayList12.add(c6c.s(M010, jb6.M0(i7, null), new View.OnClickListener() {
                                @Override
                                public final void onClick(View view3) {
                                    byte b2 = r2;
                                    gl3 gl3Var2 = gl3Var;
                                    switch (b2) {
                                        case 0:
                                            gl3Var2.Y = !gl3Var2.Y;
                                            gl3Var2.O(true);
                                            return;
                                        default:
                                            gl3Var2.X = !gl3Var2.X;
                                            gl3Var2.O(true);
                                            return;
                                    }
                                }
                            }));
                        } else {
                            arrayList12.add(c6c.r(jb6.M0(2131745556, null)));
                        }
                        int size2 = arrayList14.size();
                        if (!gl3Var.Y && !arrayList13.isEmpty() && !z30) {
                            size2 = Math.min(5, size2);
                        }
                        for (int i21 = 0; i21 < size2; i21++) {
                            c6c w = c6c.w((TLObject) arrayList14.get(i21));
                            w.u = true;
                            w.I = sk3Var;
                            arrayList12.add(w);
                        }
                    }
                    if (!arrayList13.isEmpty() && !z30) {
                        arrayList12.add(c6c.r(jb6.M0(2131745490, null)));
                        int size3 = arrayList13.size();
                        while (i8 < size3) {
                            Object obj4 = arrayList13.get(i8);
                            i8++;
                            c6c c6cVar5 = new c6c(33);
                            c6cVar5.H = (k47) obj4;
                            arrayList12.add(c6cVar5);
                        }
                        if (gl3Var.e0) {
                            arrayList12.add(c6c.p(1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ArrayList arrayList15 = hs6.d0(i20).m1;
                ArrayList arrayList16 = new ArrayList();
                if (arrayList15 != null) {
                    for (int i22 = 0; i22 < arrayList15.size(); i22++) {
                        TLRPC.User W13 = oc7.r1(i20).W1(Long.valueOf(pg3.n(((TLRPC.TL_topPeer) arrayList15.get(i22)).peer)));
                        if (W13 != null && W13.bot) {
                            arrayList16.add(W13);
                        }
                    }
                }
                gl3Var.a0 = arrayList12.size();
                if (!arrayList16.isEmpty() && !z30) {
                    if (arrayList16.size() > 5) {
                        String M011 = jb6.M0(2131745554, null);
                        if (gl3Var.X) {
                            i6 = 2131745074;
                        } else {
                            i6 = 2131745073;
                        }
                        arrayList12.add(c6c.s(M011, jb6.M0(i6, null), new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                byte b2 = r2;
                                gl3 gl3Var2 = gl3Var;
                                switch (b2) {
                                    case 0:
                                        gl3Var2.Y = !gl3Var2.Y;
                                        gl3Var2.O(true);
                                        return;
                                    default:
                                        gl3Var2.X = !gl3Var2.X;
                                        gl3Var2.O(true);
                                        return;
                                }
                            }
                        }));
                    } else {
                        arrayList12.add(c6c.r(jb6.M0(2131745554, null)));
                    }
                    int i23 = 0;
                    for (int i24 = 5; i23 < arrayList16.size() && (i23 < i24 || gl3Var.X); i24 = 5) {
                        TLRPC.User user3 = (TLRPC.User) arrayList16.get(i23);
                        if (!hashSet.contains(Long.valueOf(user3.id))) {
                            hashSet.add(Long.valueOf(user3.id));
                            c6c w2 = c6c.w(user3);
                            w2.r = true;
                            w2.u = true;
                            w2.I = sk3Var;
                            arrayList12.add(w2);
                        }
                        i23++;
                    }
                }
                hashSet.clear();
                gl3Var.b0 = arrayList12.size();
                ArrayList arrayList17 = fl3Var.h;
                if (!arrayList17.isEmpty()) {
                    if (!z30) {
                        arrayList12.add(c6c.r(jb6.M0(2131745553, null)));
                    }
                    int i25 = 0;
                    while (i8 < arrayList17.size()) {
                        TLRPC.User user4 = (TLRPC.User) arrayList17.get(i8);
                        if (!hashSet.contains(Long.valueOf(user4.id))) {
                            hashSet.add(Long.valueOf(user4.id));
                            c6c w3 = c6c.w(user4);
                            w3.r = true;
                            w3.s = true;
                            w3.u = true;
                            w3.I = sk3Var;
                            arrayList12.add(w3);
                            i25 = 1;
                        }
                        i8++;
                    }
                    if (fl3Var.c || !fl3Var.e) {
                        arrayList12.add(c6c.p(29));
                        arrayList12.add(c6c.p(29));
                        arrayList12.add(c6c.p(29));
                    }
                    i8 = i25;
                } else if (fl3Var.c || !fl3Var.e) {
                    if (!z30) {
                        arrayList12.add(c6c.p(30));
                    }
                    arrayList12.add(c6c.p(29));
                    arrayList12.add(c6c.p(29));
                    arrayList12.add(c6c.p(29));
                    arrayList12.add(c6c.p(29));
                }
                if (i8 != 0) {
                    arrayList12.add(c6c.C(gl3Var.Z));
                    return;
                }
                return;
            case 20:
                b(obj, obj2);
                return;
            case 21:
                c(obj, obj2);
                return;
            case 22:
                yw3 yw3Var = (yw3) this.b;
                String str5 = (String) obj;
                px3 px3Var = yw3Var.r;
                px3Var.l1 = str5;
                px3Var.m1 = ((Integer) obj2).intValue();
                yw3Var.c.G(str5);
                return;
            case 23:
                d(obj, obj2);
                return;
            case 24:
                e(obj, obj2);
                return;
            case 25:
                f(obj, obj2);
                return;
            case 26:
                g(obj, obj2);
                return;
            case 27:
                h(obj, obj2);
                return;
            case 28:
                i(obj, obj2);
                return;
            default:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
                MediaController w4 = MediaController.w();
                boolean z31 = fragmentContextView.W;
                v7 v7Var = fragmentContextView.I;
                float floatValue = ((Float) obj).floatValue();
                v7Var.getClass();
                w4.l0(z31, (floatValue * 2.8f) + 0.2f);
                return;
        }
    }
}
