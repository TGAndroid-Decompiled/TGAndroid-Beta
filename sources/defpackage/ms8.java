package defpackage;

import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class ms8 implements oac, pac {
    public final rs8 a;

    public ms8(rs8 rs8Var) {
        this.a = rs8Var;
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        rs8 rs8Var;
        TL_stars.SavedStarGift savedStarGift;
        ox4 ox4Var;
        final rs8 rs8Var2;
        final TL_stars.SavedStarGift savedStarGift2;
        ox4 ox4Var2;
        String str;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        String str2;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        String str3;
        String M0;
        int i5;
        ox4 ox4Var3;
        boolean z6;
        TL_stars.SavedStarGift savedStarGift3;
        rs8 rs8Var3 = this.a;
        int i6 = rs8Var3.b;
        lea leaVar = rs8Var3.a;
        boolean z7 = false;
        if (rs8Var3.e != null) {
            if (view instanceof ox4) {
                Object obj = c6cVar.H;
                if (obj instanceof TL_stars.SavedStarGift) {
                    ox4 ox4Var4 = (ox4) view;
                    TL_stars.SavedStarGift savedStarGift4 = (TL_stars.SavedStarGift) obj;
                    d dVar = leaVar.a;
                    yua yuaVar = leaVar.e;
                    bu5 J = bu5.J(dVar, view);
                    leaVar.J = J;
                    if (yuaVar.h()) {
                        if (!rs8Var3.d) {
                            yuaVar.d().size();
                        }
                        bu5 K = J.K();
                        K.b(2131231244, jb6.M0(2131753721, null), new bo1(J, (byte) 2), false);
                        K.j();
                        lj3 lj3Var = new lj3(rs8Var3.getContext(), (byte) 5);
                        LinearLayout linearLayout = new LinearLayout(rs8Var3.getContext());
                        lj3Var.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        boolean z8 = true;
                        K.q(lj3Var, qoe.o(-1, -2));
                        if (yuaVar.d().size() + 1 < oc7.r1(i6).l4.x.f()) {
                            a8 a8Var = new a8(0, rs8Var3.c, rs8Var3.getContext(), false, false);
                            a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                            int i7 = cmb.D8;
                            a8Var.c(i7, cmb.E8);
                            a8Var.h(0.12f, i7);
                            a8Var.j(jb6.M0(2131750031, null), 2131231830, null);
                            a8Var.setOnClickListener(new jw4(rs8Var3, J, savedStarGift4, (byte) 16));
                            linearLayout.addView(a8Var, qoe.o(-1, -2));
                        }
                        ArrayList d = yuaVar.d();
                        int size = d.size();
                        int i8 = 0;
                        while (i8 < size) {
                            int i9 = i8 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i8);
                            ?? r9 = yuaVar.e(tL_starGiftCollection.collection_id).l;
                            int size2 = r9.size();
                            int i10 = z7;
                            while (true) {
                                if (i10 < size2) {
                                    Object obj2 = r9.get(i10);
                                    int i11 = i10 + 1;
                                    ox4Var3 = ox4Var4;
                                    if (jva.h((TL_stars.SavedStarGift) obj2, savedStarGift4)) {
                                        z6 = z8;
                                        break;
                                    }
                                    ox4Var4 = ox4Var3;
                                    i10 = i11;
                                } else {
                                    ox4Var3 = ox4Var4;
                                    z6 = false;
                                    break;
                                }
                            }
                            a8 a8Var2 = new a8(2, rs8Var3.c, rs8Var3.getContext(), false, false);
                            a8Var2.setChecked(z6);
                            rs8 rs8Var4 = rs8Var3;
                            a8Var2.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                            int i12 = cmb.D8;
                            a8Var2.c(i12, cmb.E8);
                            a8Var2.h(0.12f, i12);
                            if (tL_starGiftCollection.icon != null) {
                                vm vmVar = new vm(3, i6, tL_starGiftCollection.icon);
                                ImageView imageView = a8Var2.getImageView();
                                savedStarGift3 = savedStarGift4;
                                imageView.addOnAttachStateChangeListener(new wd(vmVar, z8 ? (byte) 1 : (byte) 0));
                                a8Var2.j(tL_starGiftCollection.title, 0, vmVar);
                            } else {
                                savedStarGift3 = savedStarGift4;
                                a8Var2.j(tL_starGiftCollection.title, 2131232162, null);
                            }
                            ArrayList arrayList = d;
                            TL_stars.SavedStarGift savedStarGift5 = savedStarGift3;
                            boolean z9 = z6;
                            LinearLayout linearLayout2 = linearLayout;
                            a8Var2.setOnClickListener(new x47(rs8Var4, z9, tL_starGiftCollection, savedStarGift5, J, (byte) 1));
                            linearLayout2.addView(a8Var2, qoe.o(-1, -2));
                            savedStarGift4 = savedStarGift5;
                            d = arrayList;
                            size = size;
                            i8 = i9;
                            z8 = true;
                            z7 = false;
                            rs8Var3 = rs8Var4;
                            linearLayout = linearLayout2;
                            ox4Var4 = ox4Var3;
                        }
                        rs8Var = rs8Var3;
                        savedStarGift = savedStarGift4;
                        ox4Var = ox4Var4;
                        J.b(2131232052, jb6.M0(2131750328, null), new c20(J, K, (byte) 7), false);
                        J.j();
                    } else {
                        rs8Var = rs8Var3;
                        savedStarGift = savedStarGift4;
                        ox4Var = ox4Var4;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (leaVar.c() && !rs8Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            if (savedStarGift.pinned_to_top) {
                                str3 = null;
                                M0 = jb6.M0(2131749817, null);
                                i5 = 2131232419;
                            } else {
                                str3 = null;
                                M0 = jb6.M0(2131750011, null);
                                i5 = 2131232299;
                            }
                            rs8 rs8Var5 = rs8Var;
                            int i13 = i5;
                            rs8Var2 = rs8Var5;
                            str = str3;
                            savedStarGift2 = savedStarGift;
                            ox4Var2 = ox4Var;
                            z2 = true;
                            J.b(i13, M0, new no8(rs8Var2, savedStarGift2, ox4Var2, view, (byte) 3), false);
                            J.k(2131232791, jb6.M0(2131749966, str), new hs8(rs8Var2, (byte) 0), savedStarGift2.pinned_to_top);
                        } else {
                            rs8Var2 = rs8Var;
                            savedStarGift2 = savedStarGift;
                            ox4Var2 = ox4Var;
                            str = null;
                            z2 = true;
                            z2 = true;
                            z2 = true;
                            if (leaVar.c() && rs8Var2.d) {
                                J.b(2131232791, jb6.M0(2131749966, null), new hs8(rs8Var2, (byte) 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift2.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = oc7.r1(i6).N2 + "/nft/" + savedStarGift2.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (wsa.G1(i6, pg3.n(tL_starGiftUnique.owner_id))) {
                            if (wsa.I1(i6, tL_starGiftUnique)) {
                                i3 = 2131231907;
                                i4 = 2131749812;
                            } else {
                                i3 = 2131231929;
                                i4 = 2131749775;
                            }
                            J.b(i3, jb6.M0(i4, str), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r3;
                                    TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                    switch (b) {
                                        case 0:
                                            rs8 rs8Var6 = rs8Var2;
                                            qs8 qs8Var = new qs8(rs8Var6, rs8Var6.getContext(), rs8Var6.b, rs8Var6.a.c, rs8Var6.c, (byte) 0);
                                            qs8Var.n2(savedStarGift6, null);
                                            qs8Var.A2(false);
                                            return;
                                        case 1:
                                            rs8 rs8Var7 = rs8Var2;
                                            qs8 qs8Var2 = new qs8(rs8Var7, rs8Var7.getContext(), rs8Var7.b, rs8Var7.a.c, rs8Var7.c, (byte) 1);
                                            qs8Var2.n2(savedStarGift6, null);
                                            qs8Var2.N1();
                                            return;
                                        default:
                                            rs8 rs8Var8 = rs8Var2;
                                            qs8 qs8Var3 = new qs8(rs8Var8, rs8Var8.getContext(), rs8Var8.b, rs8Var8.a.c, rs8Var8.c, (byte) 2);
                                            qs8Var3.n2(savedStarGift6, null);
                                            qs8Var3.a2();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (str2 != null) {
                            z4 = z2 ? 1 : 0;
                        } else {
                            z4 = false;
                        }
                        J.k(2131232210, jb6.M0(2131751699, str), new mn8(rs8Var2, str2, (byte) 20), z4);
                        if (str2 != null) {
                            z5 = z2 ? 1 : 0;
                        } else {
                            z5 = false;
                        }
                        String M02 = jb6.M0(2131745193, str);
                        final byte b = z2 ? (byte) 1 : (byte) 0;
                        J.k(2131232369, M02, new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = b;
                                TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                switch (b2) {
                                    case 0:
                                        rs8 rs8Var6 = rs8Var2;
                                        qs8 qs8Var = new qs8(rs8Var6, rs8Var6.getContext(), rs8Var6.b, rs8Var6.a.c, rs8Var6.c, (byte) 0);
                                        qs8Var.n2(savedStarGift6, null);
                                        qs8Var.A2(false);
                                        return;
                                    case 1:
                                        rs8 rs8Var7 = rs8Var2;
                                        qs8 qs8Var2 = new qs8(rs8Var7, rs8Var7.getContext(), rs8Var7.b, rs8Var7.a.c, rs8Var7.c, (byte) 1);
                                        qs8Var2.n2(savedStarGift6, null);
                                        qs8Var2.N1();
                                        return;
                                    default:
                                        rs8 rs8Var8 = rs8Var2;
                                        qs8 qs8Var3 = new qs8(rs8Var8, rs8Var8.getContext(), rs8Var8.b, rs8Var8.a.c, rs8Var8.c, (byte) 2);
                                        qs8Var3.n2(savedStarGift6, null);
                                        qs8Var3.a2();
                                        return;
                                }
                            }
                        }, z5);
                    } else {
                        rs8Var2 = rs8Var;
                        savedStarGift2 = savedStarGift;
                        ox4Var2 = ox4Var;
                        str = null;
                        z2 = true;
                        z2 = true;
                        z2 = true;
                        if (leaVar.c() && rs8Var2.d) {
                            J.b(2131232791, jb6.M0(2131749966, null), new hs8(rs8Var2, (byte) 3), false);
                        }
                    }
                    if (wsa.G1(i6, leaVar.c)) {
                        if (savedStarGift2.unsaved) {
                            i = 2131232230;
                            i2 = 2131749914;
                        } else {
                            i = 2131231837;
                            i2 = 2131750120;
                        }
                        z = false;
                        J.b(i, jb6.M0(i2, str), new ak8((Object) rs8Var2, (Object) savedStarGift2, (Object) ox4Var2, (byte) 7), false);
                    } else {
                        z = false;
                    }
                    TL_stars.StarGift starGift2 = savedStarGift2.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        if (pg3.n(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == z8c.h(i6).e()) {
                            z3 = z2;
                        } else {
                            z3 = z;
                        }
                        J.k(2131231911, jb6.M0(2131749851, str), new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = b;
                                TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                switch (b2) {
                                    case 0:
                                        rs8 rs8Var6 = rs8Var2;
                                        qs8 qs8Var = new qs8(rs8Var6, rs8Var6.getContext(), rs8Var6.b, rs8Var6.a.c, rs8Var6.c, (byte) 0);
                                        qs8Var.n2(savedStarGift6, null);
                                        qs8Var.A2(false);
                                        return;
                                    case 1:
                                        rs8 rs8Var7 = rs8Var2;
                                        qs8 qs8Var2 = new qs8(rs8Var7, rs8Var7.getContext(), rs8Var7.b, rs8Var7.a.c, rs8Var7.c, (byte) 1);
                                        qs8Var2.n2(savedStarGift6, null);
                                        qs8Var2.N1();
                                        return;
                                    default:
                                        rs8 rs8Var8 = rs8Var2;
                                        qs8 qs8Var3 = new qs8(rs8Var8, rs8Var8.getContext(), rs8Var8.b, rs8Var8.a.c, rs8Var8.c, (byte) 2);
                                        qs8Var3.n2(savedStarGift6, null);
                                        qs8Var3.a2();
                                        return;
                                }
                            }
                        }, z3);
                    }
                    if (yuaVar.h() && rs8Var2.d) {
                        J.b(2131232335, jb6.M0(2131749972, str), new ak8((Object) rs8Var2, (Object) savedStarGift2, (Object) J, (byte) 6), z2);
                        J.F();
                        J.t();
                    }
                    if (J.y() > 0) {
                        J.W(5);
                        J.u = z2;
                        J.v = z2;
                        J.L = z2;
                        Point point = gm.q;
                        int min = Math.min(point.x, point.y);
                        J.N = min - gm.L(32.0f);
                        J.O = (int) (min * 0.6f);
                        J.S = z2;
                        J.Z = z2;
                        J.a0();
                        ox4Var2.E.getImageReceiver().w0(z2);
                        z7 = z2;
                    }
                    z7 = z;
                }
            }
            z = false;
            z7 = z;
        }
        return Boolean.valueOf(z7);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        rs8 rs8Var = this.a;
        lea leaVar = rs8Var.a;
        int i = rs8Var.b;
        if (rs8Var.e != null) {
            Object obj3 = c6cVar.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (rs8Var.h) {
                    if (!rs8Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z = savedStarGift.pinned_to_top;
                        boolean z2 = !z;
                        if (!z && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = rs8Var.e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i).sendRequest(savestargift, null, 64);
                        }
                        if (rs8Var.e.q(savedStarGift, z2, true)) {
                            c41.b0(leaVar.a).Q(2131623982, 36, jb6.H(',', "GiftsPinLimit", oc7.r1(i).l4.J1.f())).j();
                        }
                        if (!z) {
                            rs8Var.f.w0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                wsa wsaVar = new wsa(rs8Var.getContext(), rs8Var.b, leaVar.c, rs8Var.c, null);
                wsaVar.i3 = new hs8(rs8Var, (byte) 2);
                wsaVar.M2 = new xr8(rs8Var, savedStarGift, (byte) 1);
                wsaVar.n2(savedStarGift, rs8Var.e);
                wsaVar.show();
            }
        }
    }
}
