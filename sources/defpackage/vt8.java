package defpackage;

import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class vt8 implements ncc, occ {
    public final au8 a;

    public vt8(au8 au8Var) {
        this.a = au8Var;
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        au8 au8Var;
        TL_stars.SavedStarGift savedStarGift;
        sx4 sx4Var;
        final au8 au8Var2;
        final TL_stars.SavedStarGift savedStarGift2;
        sx4 sx4Var2;
        boolean z2;
        String str;
        boolean z3;
        int i;
        int i2;
        String str2;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        String M0;
        int i5;
        sx4 sx4Var3;
        LinearLayout linearLayout;
        boolean z6;
        TL_stars.SavedStarGift savedStarGift3;
        au8 au8Var3 = this.a;
        int i6 = au8Var3.b;
        cga cgaVar = au8Var3.a;
        boolean z7 = false;
        if (au8Var3.e != null) {
            if (view instanceof sx4) {
                Object obj = b8cVar.H;
                if (obj instanceof TL_stars.SavedStarGift) {
                    sx4 sx4Var4 = (sx4) view;
                    TL_stars.SavedStarGift savedStarGift4 = (TL_stars.SavedStarGift) obj;
                    e eVar = cgaVar.a;
                    zwa zwaVar = cgaVar.e;
                    fu5 J = fu5.J(eVar, view);
                    cgaVar.J = J;
                    if (zwaVar.h()) {
                        if (!au8Var3.d) {
                            zwaVar.d().size();
                        }
                        fu5 K = J.K();
                        K.b(2131231243, ob6.M0(2131753749, null), new vn1(J, (byte) 2), false);
                        K.j();
                        ti3 ti3Var = new ti3(au8Var3.getContext(), (byte) 5);
                        LinearLayout linearLayout2 = new LinearLayout(au8Var3.getContext());
                        ti3Var.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        boolean z8 = true;
                        K.q(ti3Var, tre.o(-1, -2));
                        if (zwaVar.d().size() + 1 < uc7.s1(i6).k4.z.f()) {
                            b8 b8Var = new b8(0, au8Var3.c, au8Var3.getContext(), false, false);
                            b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                            int i7 = aob.E8;
                            b8Var.c(i7, aob.F8);
                            b8Var.h(0.12f, i7);
                            b8Var.j(ob6.M0(2131750057, null), 2131231829, null);
                            b8Var.setOnClickListener(new lw4(au8Var3, J, savedStarGift4, (byte) 17));
                            linearLayout2.addView(b8Var, tre.o(-1, -2));
                        }
                        ArrayList d = zwaVar.d();
                        int size = d.size();
                        int i8 = 0;
                        while (i8 < size) {
                            int i9 = i8 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i8);
                            ?? r11 = zwaVar.e(tL_starGiftCollection.collection_id).l;
                            int size2 = r11.size();
                            int i10 = z7;
                            while (true) {
                                if (i10 < size2) {
                                    Object obj2 = r11.get(i10);
                                    int i11 = i10 + 1;
                                    sx4Var3 = sx4Var4;
                                    if (jxa.h((TL_stars.SavedStarGift) obj2, savedStarGift4)) {
                                        linearLayout = linearLayout2;
                                        z6 = z8;
                                        break;
                                    }
                                    sx4Var4 = sx4Var3;
                                    i10 = i11;
                                } else {
                                    sx4Var3 = sx4Var4;
                                    linearLayout = linearLayout2;
                                    z6 = false;
                                    break;
                                }
                            }
                            b8 b8Var2 = new b8(2, au8Var3.c, au8Var3.getContext(), false, false);
                            b8Var2.setChecked(z6);
                            au8 au8Var4 = au8Var3;
                            b8Var2.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                            int i12 = aob.E8;
                            b8Var2.c(i12, aob.F8);
                            b8Var2.h(0.12f, i12);
                            if (tL_starGiftCollection.icon != null) {
                                wl wlVar = new wl(3, i6, tL_starGiftCollection.icon);
                                ImageView imageView = b8Var2.getImageView();
                                savedStarGift3 = savedStarGift4;
                                imageView.addOnAttachStateChangeListener(new xc(wlVar, z8 ? (byte) 1 : (byte) 0));
                                b8Var2.j(tL_starGiftCollection.title, 0, wlVar);
                            } else {
                                savedStarGift3 = savedStarGift4;
                                b8Var2.j(tL_starGiftCollection.title, 2131232161, null);
                            }
                            ArrayList arrayList = d;
                            int i13 = size;
                            TL_stars.SavedStarGift savedStarGift5 = savedStarGift3;
                            b8Var2.setOnClickListener(new e57(au8Var4, z6, tL_starGiftCollection, savedStarGift5, J, (byte) 1));
                            linearLayout.addView(b8Var2, tre.o(-1, -2));
                            linearLayout2 = linearLayout;
                            au8Var3 = au8Var4;
                            savedStarGift4 = savedStarGift5;
                            d = arrayList;
                            size = i13;
                            i8 = i9;
                            sx4Var4 = sx4Var3;
                            z8 = true;
                            z7 = false;
                        }
                        au8Var = au8Var3;
                        savedStarGift = savedStarGift4;
                        sx4Var = sx4Var4;
                        J.b(2131232051, ob6.M0(2131750356, null), new c10(J, K, (byte) 7), false);
                        J.j();
                    } else {
                        au8Var = au8Var3;
                        savedStarGift = savedStarGift4;
                        sx4Var = sx4Var4;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (cgaVar.c() && !au8Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            if (savedStarGift.pinned_to_top) {
                                str = null;
                                M0 = ob6.M0(2131749830, null);
                                i5 = 2131232418;
                            } else {
                                str = null;
                                M0 = ob6.M0(2131750036, null);
                                i5 = 2131232298;
                            }
                            au8 au8Var5 = au8Var;
                            int i14 = i5;
                            au8Var2 = au8Var5;
                            savedStarGift2 = savedStarGift;
                            sx4Var2 = sx4Var;
                            z2 = true;
                            J.b(i14, M0, new vp8(au8Var2, savedStarGift2, sx4Var2, view, (byte) 4), false);
                            J.k(2131232797, ob6.M0(2131749991, str), new qt8(au8Var2, (byte) 0), savedStarGift2.pinned_to_top);
                        } else {
                            au8Var2 = au8Var;
                            savedStarGift2 = savedStarGift;
                            sx4Var2 = sx4Var;
                            z2 = true;
                            z2 = true;
                            z2 = true;
                            str = null;
                            if (cgaVar.c() && au8Var2.d) {
                                J.b(2131232797, ob6.M0(2131749991, null), new qt8(au8Var2, (byte) 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift2.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = uc7.s1(i6).N2 + "/nft/" + savedStarGift2.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (wua.H1(i6, wf3.n(tL_starGiftUnique.owner_id))) {
                            if (wua.J1(i6, tL_starGiftUnique)) {
                                i3 = 2131231906;
                                i4 = 2131749825;
                            } else {
                                i3 = 2131231928;
                                i4 = 2131749788;
                            }
                            J.b(i3, ob6.M0(i4, str), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r3;
                                    TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                    switch (b) {
                                        case 0:
                                            au8 au8Var6 = au8Var2;
                                            zt8 zt8Var = new zt8(au8Var6, au8Var6.getContext(), au8Var6.b, au8Var6.a.c, au8Var6.c, (byte) 0);
                                            zt8Var.o2(savedStarGift6, null);
                                            zt8Var.B2(false);
                                            return;
                                        case 1:
                                            au8 au8Var7 = au8Var2;
                                            zt8 zt8Var2 = new zt8(au8Var7, au8Var7.getContext(), au8Var7.b, au8Var7.a.c, au8Var7.c, (byte) 1);
                                            zt8Var2.o2(savedStarGift6, null);
                                            zt8Var2.O1();
                                            return;
                                        default:
                                            au8 au8Var8 = au8Var2;
                                            zt8 zt8Var3 = new zt8(au8Var8, au8Var8.getContext(), au8Var8.b, au8Var8.a.c, au8Var8.c, (byte) 2);
                                            zt8Var3.o2(savedStarGift6, null);
                                            zt8Var3.b2();
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
                        J.k(2131232209, ob6.M0(2131751727, str), new hp8(au8Var2, str2, (byte) 16), z4);
                        if (str2 != null) {
                            z5 = z2 ? 1 : 0;
                        } else {
                            z5 = false;
                        }
                        String M02 = ob6.M0(2131745187, str);
                        final byte b = z2 ? (byte) 1 : (byte) 0;
                        J.k(2131232368, M02, new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = b;
                                TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                switch (b2) {
                                    case 0:
                                        au8 au8Var6 = au8Var2;
                                        zt8 zt8Var = new zt8(au8Var6, au8Var6.getContext(), au8Var6.b, au8Var6.a.c, au8Var6.c, (byte) 0);
                                        zt8Var.o2(savedStarGift6, null);
                                        zt8Var.B2(false);
                                        return;
                                    case 1:
                                        au8 au8Var7 = au8Var2;
                                        zt8 zt8Var2 = new zt8(au8Var7, au8Var7.getContext(), au8Var7.b, au8Var7.a.c, au8Var7.c, (byte) 1);
                                        zt8Var2.o2(savedStarGift6, null);
                                        zt8Var2.O1();
                                        return;
                                    default:
                                        au8 au8Var8 = au8Var2;
                                        zt8 zt8Var3 = new zt8(au8Var8, au8Var8.getContext(), au8Var8.b, au8Var8.a.c, au8Var8.c, (byte) 2);
                                        zt8Var3.o2(savedStarGift6, null);
                                        zt8Var3.b2();
                                        return;
                                }
                            }
                        }, z5);
                    } else {
                        au8Var2 = au8Var;
                        savedStarGift2 = savedStarGift;
                        sx4Var2 = sx4Var;
                        z2 = true;
                        z2 = true;
                        z2 = true;
                        str = null;
                        if (cgaVar.c() && au8Var2.d) {
                            J.b(2131232797, ob6.M0(2131749991, null), new qt8(au8Var2, (byte) 3), false);
                        }
                    }
                    if (wua.H1(i6, cgaVar.c)) {
                        if (savedStarGift2.unsaved) {
                            i = 2131232229;
                            i2 = 2131749927;
                        } else {
                            i = 2131231836;
                            i2 = 2131750146;
                        }
                        z = false;
                        J.b(i, ob6.M0(i2, str), new sa8(au8Var2, savedStarGift2, sx4Var2, (byte) 12), false);
                    } else {
                        z = false;
                    }
                    TL_stars.StarGift starGift2 = savedStarGift2.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        if (wf3.n(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == yac.h(i6).e()) {
                            z3 = z2;
                        } else {
                            z3 = z;
                        }
                        J.k(2131231910, ob6.M0(2131749864, str), new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = b;
                                TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                switch (b2) {
                                    case 0:
                                        au8 au8Var6 = au8Var2;
                                        zt8 zt8Var = new zt8(au8Var6, au8Var6.getContext(), au8Var6.b, au8Var6.a.c, au8Var6.c, (byte) 0);
                                        zt8Var.o2(savedStarGift6, null);
                                        zt8Var.B2(false);
                                        return;
                                    case 1:
                                        au8 au8Var7 = au8Var2;
                                        zt8 zt8Var2 = new zt8(au8Var7, au8Var7.getContext(), au8Var7.b, au8Var7.a.c, au8Var7.c, (byte) 1);
                                        zt8Var2.o2(savedStarGift6, null);
                                        zt8Var2.O1();
                                        return;
                                    default:
                                        au8 au8Var8 = au8Var2;
                                        zt8 zt8Var3 = new zt8(au8Var8, au8Var8.getContext(), au8Var8.b, au8Var8.a.c, au8Var8.c, (byte) 2);
                                        zt8Var3.o2(savedStarGift6, null);
                                        zt8Var3.b2();
                                        return;
                                }
                            }
                        }, z3);
                    }
                    if (zwaVar.h() && au8Var2.d) {
                        J.b(2131232334, ob6.M0(2131749997, str), new sa8(au8Var2, savedStarGift2, J, (byte) 11), z2);
                        J.F();
                        J.t();
                    }
                    if (J.y() > 0) {
                        J.W(5);
                        J.u = z2;
                        J.v = z2;
                        J.L = z2;
                        Point point = hl.q;
                        int min = Math.min(point.x, point.y);
                        J.N = min - hl.L(32.0f);
                        J.O = (int) (min * 0.6f);
                        J.V = z2;
                        J.c0 = z2;
                        J.a0();
                        sx4Var2.E.getImageReceiver().w0(z2);
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
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        au8 au8Var = this.a;
        cga cgaVar = au8Var.a;
        int i = au8Var.b;
        if (au8Var.e != null) {
            Object obj3 = b8cVar.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (au8Var.h) {
                    if (!au8Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z = savedStarGift.pinned_to_top;
                        boolean z2 = !z;
                        if (!z && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = au8Var.e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i).sendRequest(savestargift, null, 64);
                        }
                        if (au8Var.e.q(savedStarGift, z2, true)) {
                            d31.b0(cgaVar.a).Q(2131623982, 36, ob6.H(',', "GiftsPinLimit", uc7.s1(i).k4.R1.f())).j();
                        }
                        if (!z) {
                            au8Var.f.x0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                wua wuaVar = new wua(au8Var.getContext(), au8Var.b, cgaVar.c, au8Var.c, null);
                wuaVar.i3 = new qt8(au8Var, (byte) 2);
                wuaVar.M2 = new m88(au8Var, savedStarGift, (byte) 15);
                wuaVar.o2(savedStarGift, au8Var.e);
                wuaVar.show();
            }
        }
    }
}
