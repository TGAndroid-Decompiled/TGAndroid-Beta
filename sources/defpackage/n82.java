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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
public final class n82 implements icc {
    public final byte a;
    public final Object b;

    public n82(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i;
        wb7 wb7Var;
        int i2;
        final ix9 ix9Var = (ix9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        ArrayList arrayList2 = ix9Var.S;
        ArrayList arrayList3 = ix9Var.Y;
        int i3 = ix9Var.Q;
        int i4 = 0;
        if (TextUtils.isEmpty(ix9Var.e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String M0 = ob6.M0(2131745467, null);
                    if (ix9Var.X) {
                        i2 = 2131745068;
                    } else {
                        i2 = 2131745067;
                    }
                    arrayList.add(b8c.s(M0, ob6.M0(i2, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            ix9 ix9Var2 = ix9Var;
                            switch (b) {
                                case 0:
                                    ix9Var2.X = !ix9Var2.X;
                                    ix9Var2.O(true);
                                    if (ix9Var2.X) {
                                        hl.t1(ix9Var2.g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    ix9Var2.W = !ix9Var2.W;
                                    ix9Var2.O(true);
                                    if (ix9Var2.W) {
                                        hl.t1(ix9Var2.g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(b8c.r(ob6.M0(2131745467, null)));
                }
                int size = arrayList3.size();
                if (!ix9Var.X) {
                    size = Math.min(5, size);
                }
                for (int i5 = 0; i5 < size; i5++) {
                    b8c w = b8c.w((TLObject) arrayList3.get(i5));
                    w.J = true;
                    arrayList.add(w);
                }
            }
            HashMap hashMap = uc7.s1(i3).N4;
            if (hashMap == null) {
                wb7Var = null;
            } else {
                wb7Var = (wb7) hashMap.get(0L);
            }
            if (wb7Var != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = wb7Var.b;
                int size2 = arrayList5.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj3 = arrayList5.get(i6);
                    i6++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat M02 = uc7.s1(i3).M0(Long.valueOf(chat.id));
                        if (xc2.r0(chat) && (M02 == null || xc2.r0(M02))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(b8c.r(ob6.M0(2131745439, null)));
                }
                int size3 = arrayList4.size();
                while (i4 < size3) {
                    Object obj4 = arrayList4.get(i4);
                    i4++;
                    arrayList.add(b8c.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(b8c.p(30));
            arrayList.add(b8c.p(29));
            arrayList.add(b8c.p(29));
            arrayList.add(b8c.p(29));
            arrayList.add(b8c.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = ix9Var.T;
        int size4 = arrayList7.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj5 = arrayList7.get(i7);
            i7++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            TLRPC.Chat M03 = uc7.s1(i3).M0(Long.valueOf(chat2.id));
            if (xc2.r0(chat2) && (M03 == null || xc2.r0(M03))) {
                arrayList6.add(chat2);
            }
        }
        ArrayList arrayList8 = ix9Var.U;
        int size5 = arrayList8.size();
        int i8 = 0;
        while (i8 < size5) {
            Object obj6 = arrayList8.get(i8);
            i8++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat M04 = uc7.s1(i3).M0(Long.valueOf(chat3.id));
            if (xc2.r0(chat3) && (M04 == null || xc2.r0(M04))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = ix9Var.V;
        int size6 = arrayList9.size();
        int i9 = 0;
        while (i9 < size6) {
            Object obj7 = arrayList9.get(i9);
            i9++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat M05 = uc7.s1(i3).M0(Long.valueOf(chat4.id));
            if (xc2.r0(chat4) && (M05 == null || xc2.r0(M05))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String M06 = ob6.M0(2131745542, null);
                if (ix9Var.W) {
                    i = 2131745068;
                } else {
                    i = 2131745067;
                }
                arrayList.add(b8c.s(M06, ob6.M0(i, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        ix9 ix9Var2 = ix9Var;
                        switch (b) {
                            case 0:
                                ix9Var2.X = !ix9Var2.X;
                                ix9Var2.O(true);
                                if (ix9Var2.X) {
                                    hl.t1(ix9Var2.g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                ix9Var2.W = !ix9Var2.W;
                                ix9Var2.O(true);
                                if (ix9Var2.W) {
                                    hl.t1(ix9Var2.g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(b8c.r(ob6.M0(2131745542, null)));
            }
            int size7 = arrayList6.size();
            if (!ix9Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i10 = 0; i10 < size7; i10++) {
                arrayList.add(b8c.w((TLObject) arrayList6.get(i10)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(b8c.r(ob6.M0(2131745484, null)));
            int size8 = arrayList2.size();
            while (i4 < size8) {
                Object obj8 = arrayList2.get(i4);
                i4++;
                b8c b8cVar = new b8c(33);
                b8cVar.H = (r47) obj8;
                arrayList.add(b8cVar);
            }
            if (ix9Var.b0) {
                arrayList.add(b8c.p(1));
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
        gx9 gx9Var = (gx9) ((tl3) this.b);
        uj3 uj3Var = gx9Var.J0;
        hl.t1(uj3Var.getParentActivity().getCurrentFocus());
        fu5 J = fu5.J(uj3Var, (bv8) obj);
        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
            fu5 K = J.K();
            K.b(2131231243, ob6.M0(2131753749, null), new vn1(J, (byte) 11), false);
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
            J.b(2131232093, ob6.M0(2131744905, null), new c10(J, K, (byte) 9), false);
        }
        J.b(2131232190, ob6.M0(2131754939, null), new vp8(gx9Var, uj3Var, gx9Var.K0, J, (byte) 13), false);
        J.b(2131232073, ob6.M0(2131745961, null), new vp8(gx9Var, uj3Var, tL_sponsoredPeer, J, (byte) 14), false);
        J.j();
        J.b(2131232092, ob6.M0(2131746047, null), new jr9(gx9Var, uj3Var, J, (byte) 4), false);
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        J.W(i);
        J.e0 = true;
        J.t = false;
        J.a0();
    }

    private final void d(Object obj, Object obj2) {
        ow3 ow3Var = (ow3) this.b;
        String str = (String) obj;
        zw3 zw3Var = ow3Var.s;
        zw3Var.l1 = str;
        zw3Var.m1 = ((Integer) obj2).intValue();
        ow3Var.c.D(str);
    }

    private final void e(Object obj, Object obj2) {
        String str;
        o24 o24Var = (o24) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        x14 x14Var = o24Var.S1;
        if (x14Var != null && (x14Var.getDrawable() instanceof hr2)) {
            hr2 hr2Var = (hr2) o24Var.S1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            ir2 ir2Var = hr2Var.c;
            if (ir2Var.a != intValue) {
                ir2 ir2Var2 = hr2Var.g;
                if (ir2Var2 != null) {
                    hr2Var.c = ir2Var2;
                    ir2Var = ir2Var2;
                }
                if (ir2Var.a != intValue) {
                    ir2Var = new ir2(intValue, ir2Var.b ? 1 : 0);
                }
                hr2Var.g = ir2Var;
                mm mmVar = hr2Var.e;
                if (mmVar != null) {
                    mmVar.e(true, 0.0f);
                }
            }
            ir2 ir2Var3 = hr2Var.d;
            if (ir2Var3.a != intValue2) {
                ir2 ir2Var4 = hr2Var.h;
                if (ir2Var4 != null) {
                    hr2Var.d = ir2Var4;
                    ir2Var3 = ir2Var4;
                }
                if (ir2Var3.a != intValue2) {
                    ir2Var3 = new ir2(intValue2, ir2Var3.b ? 1 : 0);
                }
                hr2Var.h = ir2Var3;
                mm mmVar2 = hr2Var.f;
                if (mmVar2 != null) {
                    mmVar2.e(true, 0.0f);
                }
            }
            hr2Var.invalidateSelf();
            String str2 = (String) o24Var.S1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                pv3.j.remove(str2);
            } else {
                StringBuilder sb = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) jr2.a.get(num.intValue());
                }
                sb.append(str);
                sb.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) jr2.a.get(num2.intValue());
                }
                sb.append(str3);
                pv3.j.put(str2, sb.toString());
            }
            pv3.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        o14 o14Var = (o14) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        ArrayList arrayList2 = o14Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList2.get(i);
            i++;
            h14 h14Var = (h14) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = h14Var.b;
            boolean z = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.id != o14Var.d) {
                    z = false;
                }
                int i2 = q14.b;
                b8c K = b8c.K(q14.class);
                long j = tL_messages_stickerSet.set.id;
                K.d = (int) ((j >>> 32) ^ j);
                K.C = j;
                K.H = tL_messages_stickerSet;
                K.e = z;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = h14Var.a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.id != o14Var.d) {
                        z = false;
                    }
                    arrayList.add(q14.i(stickerSetCovered, h14Var, z));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        boolean z;
        j24 j24Var = (j24) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = j24Var.F;
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
                if (tL_messages_stickerSet.set.id != j24Var.d) {
                    z2 = false;
                }
                int i2 = q14.b;
                b8c K = b8c.K(q14.class);
                long j = tL_messages_stickerSet.set.id;
                K.d = (int) ((j >>> 32) ^ j);
                K.C = j;
                K.H = tL_messages_stickerSet;
                K.e = z2;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = j24Var.K;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj4 = arrayList3.get(i3);
            i3++;
            h14 h14Var = (h14) obj4;
            TLRPC.StickerSet stickerSet = h14Var.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = h14Var.a;
                if (stickerSet.id == j24Var.d) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(q14.i(stickerSetCovered, h14Var, z));
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        h34 h34Var = (h34) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        String M0 = ob6.M0(2131743644, null);
        int i = 2;
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.k = 2131624294;
        arrayList.add(b8cVar);
        b8c i2 = b8c.i(1, ob6.M0(2131743647, null));
        i2.L(h34Var.c);
        arrayList.add(i2);
        if (h34Var.c) {
            arrayList.add(b8c.C(null));
            arrayList.add(b8c.u(ob6.M0(2131743643, null)));
            zj3 zj3Var = new zj3(h34Var, (byte) 7);
            int i3 = f34.b;
            b8c K = b8c.K(f34.class);
            K.d = 2;
            K.H = zj3Var;
            if (!h34Var.e) {
                if (h34Var.d) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
            K.A = i;
            arrayList.add(K);
            arrayList.add(b8c.C(ob6.M0(2131743642, null)));
        }
    }

    private final void i(Object obj, Object obj2) {
        xd5 xd5Var = (xd5) this.b;
        ArrayList arrayList = (ArrayList) obj;
        l9c l9cVar = (l9c) obj2;
        arrayList.add(b8c.k(xd5Var.T1));
        arrayList.add(j74.i(ob6.M0(2131750832, null), ob6.M0(2131750833, null), 2131232177));
        arrayList.add(j74.i(ob6.M0(2131750830, null), hl.D2(hl.N2(ob6.M0(2131750831, null), -1, 0, new lw3(xd5Var, (byte) 11), null), true), 2131232077));
        arrayList.add(j74.i(ob6.M0(2131750828, null), ob6.M0(2131750829, null), 2131231911));
        arrayList.add(j74.i(ob6.M0(2131750826, null), ob6.M0(2131750827, null), 2131231813));
        arrayList.add(b8c.D(hl.L(68.0f)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        b8c j;
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
        rx1 rx1Var = null;
        String str = null;
        boolean z11 = true;
        int i8 = 0;
        switch (this.a) {
            case 0:
                t82 t82Var = (t82) this.b;
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                ArrayList arrayList2 = t82Var.G;
                wkb wkbVar = t82Var.e;
                if (wkbVar != null && t82Var.f != null) {
                    arrayList.add(b8c.j(1, wkbVar));
                    arrayList.add(b8c.l(2, t82Var.f));
                    int i9 = t82Var.Z;
                    if (i9 == 1 || i9 == 0 || t82Var.a) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            View view = (View) arrayList2.get(i10);
                            if (((Boolean) t82Var.H.get(i10)).booleanValue()) {
                                j = b8c.l(i10 + 100, view);
                            } else {
                                j = b8c.j(i10 + 100, view);
                            }
                            arrayList.add(j);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g92 g92Var = (g92) this.b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    d31.b0(g92Var).g0(tL_error, false);
                }
                hl.B2(g92Var.k0);
                hl.B2(g92Var.h0);
                hl.B2(g92Var.j0);
                return;
            case 2:
                af2 af2Var = (af2) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    af2Var.getMessagesController().Y3(updates, false);
                    return;
                }
                return;
            case 3:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                hl.d3(new cf2((bg2) this.b, (byte) 1), 1000L);
                return;
            case 4:
                dg2 dg2Var = (dg2) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                l9c l9cVar2 = (l9c) obj2;
                l9cVar2.G = true;
                arrayList3.add(b8c.l(-5, dg2Var.V1));
                TL_account.TL_connectedBot tL_connectedBot = dg2Var.S1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        bp1.o(2131745287, null, arrayList3);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList3.add(b8c.f(ob6.M0(2131745284, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i = 2;
                            arrayList3.add(b8c.f(ob6.M0(2131745283, null), tL_connectedBot.location, 2));
                        } else {
                            i = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i)) {
                            arrayList3.add(b8c.f(ob6.M0(2131745285, null), ob6.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList3.add(b8c.C(null));
                    }
                    l9cVar2.V();
                    arrayList3.add(b8c.u(ob6.M0(2131752800, null)));
                    b8c x = b8c.x(-1, ob6.M0(2131752762, null));
                    x.L(dg2Var.a2);
                    arrayList3.add(x);
                    int i11 = dg2.f2;
                    b8c x2 = b8c.x(-2, ob6.M0(2131752757, null));
                    x2.L(!dg2Var.a2);
                    arrayList3.add(x2);
                    l9cVar2.U();
                    arrayList3.add(b8c.C(null));
                    u41 u41Var = dg2Var.U1;
                    if (u41Var != null) {
                        u41Var.a(arrayList3, l9cVar2, true);
                    }
                    arrayList3.add(b8c.C(ob6.M0(2131752799, null)));
                    return;
                }
                return;
            case 5:
                final mg2 mg2Var = (mg2) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                l9c l9cVar3 = (l9c) obj2;
                LongSparseArray longSparseArray = mg2Var.O;
                String M0 = ob6.M0(2131752764, null);
                String M02 = ob6.M0(2131752763, null);
                b8c b8cVar = new b8c(2);
                b8cVar.m = M0;
                b8cVar.p = M02;
                b8cVar.n = "tg_superplaceholders_android_2";
                b8cVar.o = "🤖🏝️";
                b8cVar.A = 120;
                arrayList4.add(b8cVar);
                if (mg2Var.N != null) {
                    l9cVar3.V();
                    long j2 = mg2Var.N.id;
                    b8c b8cVar2 = new b8c(13);
                    b8cVar2.y = j2;
                    b8cVar2.L(true);
                    b8cVar2.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            byte b = r2;
                            mg2 mg2Var2 = mg2Var;
                            switch (b) {
                                case 0:
                                    mg2Var2.N = null;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights = mg2Var2.K;
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
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = mg2Var2.K;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-14, true, new fg2(mg2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = mg2Var2.K;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-17, true, new fg2(mg2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = mg2Var2.K;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(b8cVar2);
                    l9cVar3.U();
                    z = true;
                } else {
                    l9cVar3.V();
                    arrayList4.add(b8c.k(mg2Var.e));
                    longSparseArray.clear();
                    int i12 = 0;
                    boolean z12 = false;
                    while (i12 < mg2Var.d.d.size()) {
                        TLObject tLObject = (TLObject) mg2Var.d.d.get(i12);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                boolean z13 = z11;
                                long j3 = user.id;
                                z3 = z13;
                                String str2 = mg2Var.E;
                                b8c b8cVar3 = new b8c(13);
                                b8cVar3.y = j3;
                                b8cVar3.o = str2;
                                arrayList4.add(b8cVar3);
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
                    for (int i13 = 0; i13 < mg2Var.d.e.size(); i13++) {
                        TLObject tLObject2 = (TLObject) mg2Var.d.e.get(i13);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j4 = user2.id;
                                String str3 = mg2Var.E;
                                b8c b8cVar4 = new b8c(13);
                                b8cVar4.y = j4;
                                b8cVar4.o = str3;
                                arrayList4.add(b8cVar4);
                                longSparseArray.put(user2.id, user2);
                                z12 = z;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(mg2Var.f.getText().toString()) || mg2Var.d.e() || mg2Var.y)) {
                        arrayList4.add(b8c.k(mg2Var.n));
                        z2 = z;
                    } else {
                        z2 = z12;
                    }
                    View view2 = mg2Var.h;
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view2.setVisibility(i2);
                    l9cVar3.U();
                }
                arrayList4.add(b8c.C(ob6.M0(2131752796, null)));
                l9cVar3.V();
                b8c u = b8c.u(ob6.M0(2131752800, null));
                if (mg2Var.N != null) {
                    z4 = z;
                } else {
                    z4 = false;
                }
                u.g = z4;
                arrayList4.add(u);
                b8c x3 = b8c.x(-1, ob6.M0(2131752762, null));
                x3.L(mg2Var.J);
                if (mg2Var.N != null) {
                    z5 = z;
                } else {
                    z5 = false;
                }
                x3.g = z5;
                arrayList4.add(x3);
                b8c x4 = b8c.x(-2, ob6.M0(2131752757, null));
                x4.L(!mg2Var.J);
                if (mg2Var.N != null) {
                    z6 = z;
                } else {
                    z6 = false;
                }
                x4.g = z6;
                arrayList4.add(x4);
                l9cVar3.U();
                arrayList4.add(b8c.C(null));
                u41 u41Var2 = mg2Var.w;
                if (mg2Var.N != null) {
                    z7 = z;
                } else {
                    z7 = false;
                }
                u41Var2.a(arrayList4, l9cVar3, z7);
                arrayList4.add(b8c.C(ob6.M0(2131752799, null)));
                if (mg2Var.N != null) {
                    l9cVar3.V();
                    arrayList4.add(b8c.u(ob6.M0(2131752789, null)));
                    String M03 = ob6.M0(2131752776, null);
                    StringBuilder sb = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = mg2Var.K;
                    sb.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb.append("/5");
                    b8c o = b8c.o(-4, M03, sb.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = mg2Var.K;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z8 = z;
                    } else {
                        z8 = false;
                    }
                    o.L(z8);
                    o.f = !mg2Var.Q;
                    boolean z14 = z;
                    final byte b = z14 ? (byte) 1 : (byte) 0;
                    o.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view22) {
                            byte b2 = b;
                            mg2 mg2Var2 = mg2Var;
                            switch (b2) {
                                case 0:
                                    mg2Var2.N = null;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = mg2Var2.K;
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
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = mg2Var2.K;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-14, true, new fg2(mg2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = mg2Var2.K;
                                    if (tL_businessBotRights32.view_gifts && tL_businessBotRights32.sell_gifts && tL_businessBotRights32.change_gift_settings && tL_businessBotRights32.transfer_and_upgrade_gifts && tL_businessBotRights32.transfer_stars) {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-17, true, new fg2(mg2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = mg2Var2.K;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(o);
                    if (mg2Var.Q) {
                        b8c z15 = b8c.z(-5, ob6.M0(2131752778, null));
                        z15.L(z14);
                        z15.g = false;
                        z15.i = z14 ? 1 : 0;
                        arrayList4.add(z15);
                        b8c z16 = b8c.z(-6, ob6.M0(2131752777, null));
                        z16.L(mg2Var.K.reply);
                        z16.i = z14 ? 1 : 0;
                        arrayList4.add(z16);
                        b8c z17 = b8c.z(-7, ob6.M0(2131752779, null));
                        z17.L(mg2Var.K.read_messages);
                        z17.i = z14 ? 1 : 0;
                        arrayList4.add(z17);
                        b8c z18 = b8c.z(-8, ob6.M0(2131752780, null));
                        z18.L(mg2Var.K.delete_sent_messages);
                        z18.i = z14 ? 1 : 0;
                        arrayList4.add(z18);
                        b8c z19 = b8c.z(-9, ob6.M0(2131752781, null));
                        z19.L(mg2Var.K.delete_received_messages);
                        z19.i = z14 ? 1 : 0;
                        arrayList4.add(z19);
                    }
                    String M04 = ob6.M0(2131752772, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = mg2Var.K;
                    sb2.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb2.append("/4");
                    b8c o2 = b8c.o(-10, M04, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = mg2Var.K;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o2.L(z9);
                    o2.f = !mg2Var.R;
                    o2.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view22) {
                            byte b2 = b;
                            mg2 mg2Var2 = mg2Var;
                            switch (b2) {
                                case 0:
                                    mg2Var2.N = null;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = mg2Var2.K;
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
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = mg2Var2.K;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-14, true, new fg2(mg2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = mg2Var2.K;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-17, true, new fg2(mg2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = mg2Var2.K;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(o2);
                    if (mg2Var.R) {
                        b8c z20 = b8c.z(-11, ob6.M0(2131752774, null));
                        z20.L(mg2Var.K.edit_name);
                        z20.i = 1;
                        arrayList4.add(z20);
                        b8c z21 = b8c.z(-12, ob6.M0(2131752775, null));
                        z21.L(mg2Var.K.edit_bio);
                        z21.i = 1;
                        arrayList4.add(z21);
                        b8c z22 = b8c.z(-13, ob6.M0(2131752773, null));
                        z22.L(mg2Var.K.edit_profile_photo);
                        z22.i = 1;
                        arrayList4.add(z22);
                        b8c z23 = b8c.z(-14, ob6.M0(2131752771, null));
                        z23.L(mg2Var.K.edit_username);
                        z23.i = 1;
                        arrayList4.add(z23);
                    }
                    String M05 = ob6.M0(2131752788, null);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = mg2Var.K;
                    sb3.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb3.append("/5");
                    b8c o3 = b8c.o(-15, M05, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = mg2Var.K;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o3.L(z10);
                    o3.f = !mg2Var.S;
                    o3.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view22) {
                            byte b2 = b;
                            mg2 mg2Var2 = mg2Var;
                            switch (b2) {
                                case 0:
                                    mg2Var2.N = null;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = mg2Var2.K;
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
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = mg2Var2.K;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-14, true, new fg2(mg2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = mg2Var2.K;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-17, true, new fg2(mg2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = mg2Var2.K;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(o3);
                    if (mg2Var.S) {
                        b8c z24 = b8c.z(-16, ob6.M0(2131752783, null));
                        z24.L(mg2Var.K.view_gifts);
                        z24.i = 1;
                        arrayList4.add(z24);
                        b8c z25 = b8c.z(-17, ob6.M0(2131752787, null));
                        z25.L(mg2Var.K.sell_gifts);
                        z25.i = 1;
                        arrayList4.add(z25);
                        b8c z26 = b8c.z(-18, ob6.M0(2131752786, null));
                        z26.L(mg2Var.K.change_gift_settings);
                        z26.i = 1;
                        arrayList4.add(z26);
                        b8c z27 = b8c.z(-19, ob6.M0(2131752785, null));
                        z27.L(mg2Var.K.transfer_and_upgrade_gifts);
                        z27.i = 1;
                        arrayList4.add(z27);
                        b8c z28 = b8c.z(-20, ob6.M0(2131752784, null));
                        z28.L(mg2Var.K.transfer_stars);
                        z28.i = 1;
                        arrayList4.add(z28);
                    }
                    b8c o4 = b8c.o(-21, ob6.M0(2131752770, null), "");
                    o4.L(mg2Var.K.manage_stories);
                    o4.E = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view22) {
                            byte b2 = b;
                            mg2 mg2Var2 = mg2Var;
                            switch (b2) {
                                case 0:
                                    mg2Var2.N = null;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = mg2Var2.K;
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
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = mg2Var2.K;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-14, true, new fg2(mg2Var2, (byte) 2));
                                    return;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = mg2Var2.K;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        mg2Var2.c.g3.O(true);
                                        mg2Var2.Z(true);
                                        return;
                                    }
                                    mg2Var2.Y(-17, true, new fg2(mg2Var2, (byte) 1));
                                    return;
                                default:
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = mg2Var2.K;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    mg2Var2.c.g3.O(true);
                                    mg2Var2.Z(true);
                                    return;
                            }
                        }
                    };
                    arrayList4.add(o4);
                    l9cVar3.U();
                    arrayList4.add(b8c.B(-4, null));
                    arrayList4.add(b8c.B(-5, null));
                    arrayList4.add(b8c.B(-6, null));
                    arrayList4.add(b8c.B(-7, null));
                    return;
                }
                return;
            case 6:
                ((um4) this.b).a0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                kn2 kn2Var = (kn2) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                l9c l9cVar4 = (l9c) obj2;
                arrayList5.add(b8c.E(0, hl.L(12.0f)));
                arrayList5.add(b8c.j(1, kn2Var.U1));
                arrayList5.add(b8c.E(2, hl.L(12.0f)));
                arrayList5.add(b8c.t(3, ob6.M0(2131751912, null)));
                kn2Var.X1 = arrayList5.size();
                String M06 = ob6.M0(2131751911, null);
                boolean z29 = kn2Var.W1;
                if (z29) {
                    i3 = 2131751910;
                } else {
                    i3 = 2131751909;
                }
                b8c y = b8c.y(151, M06, ob6.M0(i3, null));
                y.L(!kn2Var.T1);
                arrayList5.add(y);
                String M07 = ob6.M0(2131751915, null);
                if (z29) {
                    i4 = 2131751914;
                } else {
                    i4 = 2131751913;
                }
                b8c y2 = b8c.y(150, M07, ob6.M0(i4, null));
                y2.L(kn2Var.T1);
                arrayList5.add(y2);
                arrayList5.add(b8c.B(6, ob6.M0(2131751916, null)));
                return;
            case 8:
                l9c l9cVar5 = (l9c) obj2;
                ((ArrayList) obj).add(b8c.j(0, ((yn2) this.b).S1));
                return;
            case 9:
                l9c l9cVar6 = (l9c) obj2;
                ((io2) this.b).w.c((ArrayList) obj);
                return;
            case 10:
                cu2 cu2Var = (cu2) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                l9c l9cVar7 = (l9c) obj2;
                TLRPC.User X1 = cu2Var.getMessagesController().X1(Long.valueOf(cu2Var.I));
                arrayList6.add(b8c.k(cu2Var.W));
                arrayList6.add(b8c.k(cu2Var.b));
                arrayList6.add(b8c.k(cu2Var.c));
                if (TextUtils.isEmpty(cu2Var.a0())) {
                    arrayList6.add(b8c.C(hl.G2(hl.S2(ob6.M0(2131748163, null)), lbc.k(X1, true), "%1$s")));
                } else if (cu2Var.L) {
                    arrayList6.add(b8c.C(hl.S2(ob6.a0("MobileVisibleInfo", null, 2131748162, lbc.k(X1, true)))));
                } else {
                    arrayList6.add(b8c.C(null));
                }
                if (cu2Var.J && cu2Var.L) {
                    b8c i14 = b8c.i(2, ob6.M0(2131754440, null));
                    i14.L(cu2Var.Y);
                    arrayList6.add(i14);
                    arrayList6.add(b8c.C(ob6.a0(null, null, 2131754439, lbc.k(X1, true))));
                }
                arrayList6.add(b8c.k(cu2Var.d));
                arrayList6.add(b8c.C(ob6.M0(2131754387, null)));
                if (!cu2Var.J) {
                    TLRPC.UserFull Y1 = cu2Var.getMessagesController().Y1(cu2Var.I);
                    if (Y1 != null && Y1.birthday == null) {
                        arrayList6.add(b8c.k(cu2Var.G));
                    }
                    arrayList6.add(b8c.k(cu2Var.y));
                    arrayList6.add(b8c.k(cu2Var.E));
                    if (X1 != null && (userProfilePhoto = X1.photo) != null && userProfilePhoto.personal) {
                        arrayList6.add(b8c.k(cu2Var.F));
                    }
                    arrayList6.add(b8c.C(null));
                    b8c e = b8c.e(1, ob6.M0(2131751517, null));
                    e.s = true;
                    arrayList6.add(e);
                }
                arrayList6.add(b8c.C(null));
                if (cu2Var.Z) {
                    hl.c3(new st2(cu2Var, X1, (byte) 0));
                    cu2Var.Z = false;
                    hl.d3(new qt2(cu2Var, (byte) 1), 200L);
                    return;
                }
                return;
            case 11:
                ((rw2) this.b).f((Bitmap) obj, (Bitmap) obj2);
                return;
            case 12:
                nw2 nw2Var = (nw2) this.b;
                CharSequence charSequence = (CharSequence) obj;
                pcc pccVar = (pcc) obj2;
                rw2 rw2Var = nw2Var.a;
                pw2 pw2Var = rw2Var.l;
                if (pw2Var != null) {
                    String join = TextUtils.join("", rw2Var.o);
                    if (pccVar != null) {
                        rx1Var = new rx1(nw2Var, pccVar, (byte) 12);
                    }
                    pw2Var.F(charSequence, join, rx1Var);
                    if (pccVar == null) {
                        rw2Var.d();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ry2 ry2Var = (ry2) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                l9c l9cVar8 = (l9c) obj2;
                ArrayList arrayList8 = ry2Var.V1;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int L = hl.L(13.0f) + ((hl.q.y - a.getCurrentActionBarHeight()) - hl.L(68.0f));
                    int L2 = hl.L(88.0f) + ry2Var.g2;
                    arrayList7.add(b8c.E(0, L2));
                    int i15 = L - L2;
                    int size = arrayList8.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList8.get(i16);
                        i16++;
                        for (TLRPC.TL_help_country tL_help_country : (List) ry2Var.U1.get((String) obj3)) {
                            if (TextUtils.isEmpty(ry2Var.X1) || t2a.c1(tL_help_country, hl.I3(ry2Var.X1).toLowerCase())) {
                                i15 -= hl.L(44.0f);
                                boolean containsKey = ry2Var.e2.containsKey(tL_help_country.iso2);
                                int i17 = qy2.b;
                                b8c K = b8c.K(qy2.class);
                                K.m = tL_help_country.iso2;
                                K.H = tL_help_country;
                                K.e = containsKey;
                                arrayList7.add(K);
                            }
                        }
                    }
                    arrayList7.add(b8c.E(1, Math.max(0, i15)));
                    return;
                }
                return;
            case 14:
                j13 j13Var = (j13) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                l9c l9cVar9 = (l9c) obj2;
                arrayList9.add(b8c.k(j13Var.S1));
                arrayList9.add(b8c.C(null));
                ArrayList arrayList10 = j13Var.V1;
                if (arrayList10 != null && !arrayList10.isEmpty()) {
                    bp1.o(2131749243, null, arrayList9);
                    while (i8 < arrayList10.size()) {
                        Long l = (Long) arrayList10.get(i8);
                        l.getClass();
                        TLRPC.User X12 = uc7.s1(j13Var.a).X1(l);
                        if (X12 != null) {
                            int i18 = d3a.b;
                            b8c K2 = b8c.K(d3a.class);
                            K2.H = X12;
                            K2.L(j13Var.W1.contains(l));
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
                y13 y13Var = (y13) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                l9c l9cVar10 = (l9c) obj2;
                u1 u1Var = y13Var.b2;
                u1 u1Var2 = u1Var;
                if (u1Var == null) {
                    Context context = y13Var.getContext();
                    vnb vnbVar = y13Var.J0;
                    u1 u1Var3 = new u1((byte) 6, context, false);
                    u1Var3.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624324, 112, 112, null);
                    imageView.d();
                    u1Var3.addView((View) imageView, tre.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(hl.o());
                    textView.setText(ob6.a0(null, null, 2131744091, new Object[0]));
                    textView.setTextSize(1, 20.0f);
                    yob.X(textView, aob.G6, vnbVar);
                    u1Var3.addView(textView, tre.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    yob.X(textView2, aob.j5, vnbVar);
                    textView2.setText(ob6.a0(null, null, 2131742888, new Object[0]));
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    u1Var3.addView(textView2, tre.t(-2, -2, 1, 28, 0, 28, 17));
                    y13Var.b2 = u1Var3;
                    u1Var2 = u1Var3;
                }
                arrayList11.add(b8c.k(u1Var2));
                arrayList11.add(b8c.C(null));
                arrayList11.add(b8c.u(ob6.M0(2131743083, null)));
                String str4 = y13Var.W1;
                String M08 = ob6.M0(2131743084, null);
                int i19 = x13.b;
                b8c K3 = b8c.K(x13.class);
                K3.m = str4;
                K3.o = M08;
                K3.j = false;
                K3.g = false;
                arrayList11.add(K3);
                SpannableStringBuilder spannableStringBuilder = y13Var.Y1;
                String M09 = ob6.M0(2131743085, null);
                b8c K4 = b8c.K(x13.class);
                K4.m = spannableStringBuilder;
                K4.o = M09;
                K4.j = true;
                K4.g = false;
                arrayList11.add(K4);
                if (y13Var.a2) {
                    if (y13Var.S1) {
                        i5 = 2131743080;
                    } else {
                        i5 = 2131743081;
                    }
                    str = ob6.M0(i5, null);
                }
                arrayList11.add(b8c.C(str));
                return;
            case 16:
                s43 s43Var = (s43) this.b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (tL_error4 != null) {
                    uh9.s(tL_error4.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    return;
                } else {
                    Utilities.d.c(new r43(s43Var, currencyrates, (byte) 0));
                    return;
                }
            case 17:
                uj3 uj3Var = (uj3) this.b;
                Long l2 = (Long) obj2;
                uj3Var.R1 = (Long) obj;
                uj3Var.q5();
                return;
            case 18:
                e eVar = (e) obj;
                Long l3 = (Long) obj2;
                ((Runnable) this.b).run();
                return;
            case 19:
                final nk3 nk3Var = (nk3) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                l9c l9cVar11 = (l9c) obj2;
                int i20 = nk3Var.Q;
                zj3 zj3Var = nk3Var.k0;
                mk3 mk3Var = nk3Var.T;
                ArrayList arrayList13 = nk3Var.W;
                boolean z30 = nk3Var.S;
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(nk3Var.h0)) {
                    ArrayList arrayList14 = new ArrayList();
                    arrayList14.addAll(nk3Var.U);
                    arrayList14.addAll(nk3Var.V);
                    if (!arrayList14.isEmpty()) {
                        if (arrayList14.size() > 5 && !arrayList13.isEmpty() && !z30) {
                            String M010 = ob6.M0(2131745550, null);
                            if (nk3Var.Y) {
                                i7 = 2131745068;
                            } else {
                                i7 = 2131745067;
                            }
                            arrayList12.add(b8c.s(M010, ob6.M0(i7, null), new View.OnClickListener() {
                                @Override
                                public final void onClick(View view3) {
                                    byte b2 = r2;
                                    nk3 nk3Var2 = nk3Var;
                                    switch (b2) {
                                        case 0:
                                            nk3Var2.Y = !nk3Var2.Y;
                                            nk3Var2.O(true);
                                            return;
                                        default:
                                            nk3Var2.X = !nk3Var2.X;
                                            nk3Var2.O(true);
                                            return;
                                    }
                                }
                            }));
                        } else {
                            arrayList12.add(b8c.r(ob6.M0(2131745550, null)));
                        }
                        int size2 = arrayList14.size();
                        if (!nk3Var.Y && !arrayList13.isEmpty() && !z30) {
                            size2 = Math.min(5, size2);
                        }
                        for (int i21 = 0; i21 < size2; i21++) {
                            b8c w = b8c.w((TLObject) arrayList14.get(i21));
                            w.u = true;
                            w.I = zj3Var;
                            arrayList12.add(w);
                        }
                    }
                    if (!arrayList13.isEmpty() && !z30) {
                        arrayList12.add(b8c.r(ob6.M0(2131745484, null)));
                        int size3 = arrayList13.size();
                        while (i8 < size3) {
                            Object obj4 = arrayList13.get(i8);
                            i8++;
                            b8c b8cVar5 = new b8c(33);
                            b8cVar5.H = (r47) obj4;
                            arrayList12.add(b8cVar5);
                        }
                        if (nk3Var.e0) {
                            arrayList12.add(b8c.p(1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ArrayList arrayList15 = ls6.d0(i20).m1;
                ArrayList arrayList16 = new ArrayList();
                if (arrayList15 != null) {
                    for (int i22 = 0; i22 < arrayList15.size(); i22++) {
                        TLRPC.User X13 = uc7.s1(i20).X1(Long.valueOf(wf3.n(((TLRPC.TL_topPeer) arrayList15.get(i22)).peer)));
                        if (X13 != null && X13.bot) {
                            arrayList16.add(X13);
                        }
                    }
                }
                nk3Var.a0 = arrayList12.size();
                if (!arrayList16.isEmpty() && !z30) {
                    if (arrayList16.size() > 5) {
                        String M011 = ob6.M0(2131745548, null);
                        if (nk3Var.X) {
                            i6 = 2131745068;
                        } else {
                            i6 = 2131745067;
                        }
                        arrayList12.add(b8c.s(M011, ob6.M0(i6, null), new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                byte b2 = r2;
                                nk3 nk3Var2 = nk3Var;
                                switch (b2) {
                                    case 0:
                                        nk3Var2.Y = !nk3Var2.Y;
                                        nk3Var2.O(true);
                                        return;
                                    default:
                                        nk3Var2.X = !nk3Var2.X;
                                        nk3Var2.O(true);
                                        return;
                                }
                            }
                        }));
                    } else {
                        arrayList12.add(b8c.r(ob6.M0(2131745548, null)));
                    }
                    int i23 = 0;
                    for (int i24 = 5; i23 < arrayList16.size() && (i23 < i24 || nk3Var.X); i24 = 5) {
                        TLRPC.User user3 = (TLRPC.User) arrayList16.get(i23);
                        if (!hashSet.contains(Long.valueOf(user3.id))) {
                            hashSet.add(Long.valueOf(user3.id));
                            b8c w2 = b8c.w(user3);
                            w2.r = true;
                            w2.u = true;
                            w2.I = zj3Var;
                            arrayList12.add(w2);
                        }
                        i23++;
                    }
                }
                hashSet.clear();
                nk3Var.b0 = arrayList12.size();
                ArrayList arrayList17 = mk3Var.h;
                if (!arrayList17.isEmpty()) {
                    if (!z30) {
                        arrayList12.add(b8c.r(ob6.M0(2131745547, null)));
                    }
                    int i25 = 0;
                    while (i8 < arrayList17.size()) {
                        TLRPC.User user4 = (TLRPC.User) arrayList17.get(i8);
                        if (!hashSet.contains(Long.valueOf(user4.id))) {
                            hashSet.add(Long.valueOf(user4.id));
                            b8c w3 = b8c.w(user4);
                            w3.r = true;
                            w3.s = true;
                            w3.u = true;
                            w3.I = zj3Var;
                            arrayList12.add(w3);
                            i25 = 1;
                        }
                        i8++;
                    }
                    if (mk3Var.c || !mk3Var.e) {
                        arrayList12.add(b8c.p(29));
                        arrayList12.add(b8c.p(29));
                        arrayList12.add(b8c.p(29));
                    }
                    i8 = i25;
                } else if (mk3Var.c || !mk3Var.e) {
                    if (!z30) {
                        arrayList12.add(b8c.p(30));
                    }
                    arrayList12.add(b8c.p(29));
                    arrayList12.add(b8c.p(29));
                    arrayList12.add(b8c.p(29));
                    arrayList12.add(b8c.p(29));
                }
                if (i8 != 0) {
                    arrayList12.add(b8c.C(nk3Var.Z));
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
                hw3 hw3Var = (hw3) this.b;
                String str5 = (String) obj;
                zw3 zw3Var = hw3Var.r;
                zw3Var.l1 = str5;
                zw3Var.m1 = ((Integer) obj2).intValue();
                hw3Var.c.G(str5);
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
                MediaController z31 = MediaController.z();
                boolean z32 = fragmentContextView.W;
                w7 w7Var = fragmentContextView.I;
                float floatValue = ((Float) obj).floatValue();
                w7Var.getClass();
                z31.o0(z32, (floatValue * 2.8f) + 0.2f);
                return;
        }
    }
}
