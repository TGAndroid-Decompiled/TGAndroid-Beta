package bh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import bg.q2;
import bg.u1;
import fh.d4;
import fh.e2;
import fh.f4;
import fh.g6;
import fh.k0;
import fh.o1;
import fh.p2;
import fh.p5;
import fh.r0;
import fh.u4;
import fh.w2;
import fh.x;
import fh.y3;
import gh.c0;
import gh.e0;
import gh.ea;
import gh.fa;
import gh.g0;
import gh.g1;
import gh.i1;
import gh.ia;
import gh.l1;
import gh.la;
import gh.n7;
import gh.o0;
import gh.oa;
import gh.r;
import gh.v7;
import gh.y9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jh.t;
import kh.b2;
import kh.m;
import kh.n2;
import kh.u3;
import kh.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.df;
import org.telegram.ui.e91;
public final class c implements Utilities.Callback2 {
    public final int f2016a;
    public final Object f2017b;

    public c(Object obj, int i9) {
        this.f2016a = i9;
        this.f2017b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9;
        int i10;
        boolean z10;
        int i11;
        float f10;
        int i12;
        boolean z11;
        float f11;
        String str;
        mt editText;
        Utilities.Callback callback;
        int i13 = this.f2016a;
        float f12 = 0.0f;
        float f13 = 1.0f;
        int i14 = -1;
        boolean z12 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        float f14 = 12.0f;
        Object obj3 = this.f2017b;
        switch (i13) {
            case 0:
                j jVar = (j) obj3;
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                ArrayList arrayList2 = jVar.W;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + jVar.f2042h0;
                    arrayList.add(l41.D(0, dp2));
                    int i20 = dp - dp2;
                    int size = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj4 = arrayList2.get(i21);
                        i21++;
                        for (TLRPC.TL_help_country tL_help_country : (List) jVar.V.get((String) obj4)) {
                            if (TextUtils.isEmpty(jVar.Y) || q2.T(tL_help_country, AndroidUtilities.translitSafe(jVar.Y).toLowerCase())) {
                                i20 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = jVar.f2040f0.containsKey(tL_help_country.iso2);
                                int i22 = i.f2033a;
                                l41 J = l41.J(i.class);
                                J.f30339l = tL_help_country.iso2;
                                J.G = tL_help_country;
                                J.f30333e = containsKey;
                                arrayList.add(J);
                            }
                        }
                    }
                    arrayList.add(l41.D(1, Math.max(0, i20)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                z41 z41Var2 = (z41) obj2;
                e91 e91Var = ((k) obj3).U;
                if (e91Var != null) {
                    arrayList3.add(l41.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(l41.h(0, 0, e91Var));
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((df) obj3).run((TL_stats.TL_statsPollStats) obj);
                return;
            case 3:
                fh.d dVar = (fh.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                z41 z41Var3 = (z41) obj2;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.T;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.U;
                        u1 u1Var = new u1(7, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i23 = fh.b.f6356a;
                        l41 J2 = l41.J(fh.b.class);
                        J2.G = tL_StarGiftAuctionAcquiredGift;
                        J2.H = auction;
                        J2.D = u1Var;
                        arrayList4.add(J2);
                    }
                    arrayList4.add(l41.C(AndroidUtilities.dp(16.0f)));
                    return;
                }
                return;
            case 4:
                z41 z41Var4 = (z41) obj2;
                ((ArrayList) obj).add(((fh.f) obj3).T);
                return;
            case 5:
                ArrayList arrayList5 = (ArrayList) obj;
                z41 z41Var5 = (z41) obj2;
                arrayList5.add(((x) obj3).U);
                arrayList5.add(l41.C(AndroidUtilities.dp(16.0f)));
                return;
            case 6:
                z41 z41Var6 = (z41) obj2;
                ((ArrayList) obj).add(l41.j(-1, ((k0) obj3).V));
                return;
            case 7:
                z41 z41Var7 = (z41) obj2;
                ((ArrayList) obj).add(l41.j(-1, ((r0) obj3).V));
                return;
            case 8:
                ((p2) obj3).T((ArrayList) obj, (z41) obj2);
                return;
            case 9:
                y3 y3Var = (y3) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                z41 z41Var8 = (z41) obj2;
                vq0 vq0Var = y3Var.f6880a;
                n7 n7Var = y3Var.f6883e;
                if (n7Var != null) {
                    if ((!n7Var.f8619e || n7Var.f8621g != 783) && n7Var.f8625l.size() <= 0) {
                        n7 n7Var2 = y3Var.f6883e;
                        if (n7Var2.f8623j && !n7Var2.f8622i) {
                            return;
                        }
                    }
                    n7 n7Var3 = y3Var.f6883e;
                    if (n7Var3 != null && (i11 = n7Var3.f8627n) != 0) {
                        i9 = Math.min(3, i11);
                    } else {
                        i9 = 3;
                    }
                    int max = Math.max(1, i9);
                    n7 n7Var4 = y3Var.f6883e;
                    if (n7Var4 != null) {
                        ArrayList arrayList7 = n7Var4.f8625l;
                        int size2 = arrayList7.size();
                        int i24 = 3;
                        int i25 = 0;
                        while (i25 < size2) {
                            Object obj5 = arrayList7.get(i25);
                            i25++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z13 = y3Var.d;
                            int i26 = e2.f6424a;
                            l41 J3 = l41.J(e2.class);
                            J3.f30348u = 1;
                            J3.f30352z = 0;
                            J3.G = savedStarGift;
                            J3.f30344q = true;
                            J3.f30334f = false;
                            J3.f30345r = z13;
                            if (y3Var.f6885n && (y3Var.f6883e != vq0Var.d || savedStarGift.pinned_to_top)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J3.h = z10;
                            arrayList6.add(J3);
                            i24--;
                            if (i24 == 0) {
                                i24 = 3;
                            }
                        }
                        n7 n7Var5 = y3Var.f6883e;
                        if (n7Var5.f8622i || !n7Var5.f8623j) {
                            int i27 = 0;
                            while (true) {
                                if (i24 <= 0) {
                                    i10 = 3;
                                } else {
                                    i10 = i24;
                                }
                                if (i27 < i10) {
                                    i27++;
                                    l41 o6 = l41.o(i27, 34);
                                    o6.f30348u = 1;
                                    arrayList6.add(o6);
                                }
                            }
                        }
                    }
                    if (vq0Var.d == y3Var.f6883e) {
                        arrayList6.add(l41.C(AndroidUtilities.dp(20.0f)));
                        if (vq0Var.f6547c == UserConfig.getInstance(y3Var.f6881b).getClientUserId()) {
                            int v02 = f6.v0(f6.f23386z6, y3Var.f6882c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i28 = f4.f6457a;
                            l41 J4 = l41.J(f4.class);
                            J4.f30339l = string;
                            J4.f30352z = 17;
                            J4.B = v02;
                            J4.A = 14.0f;
                            J4.f30336i = dp3;
                            J4.f30338k = 0;
                            J4.f30344q = false;
                            arrayList6.add(J4);
                        }
                        arrayList6.add(l41.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(l41.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        if (y3Var.E) {
                            f14 = 42.0f;
                        }
                        arrayList6.add(0, l41.C(AndroidUtilities.dp(f14)));
                    }
                    if (y3Var.f6884f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new w2(y3Var, max, 1));
                    }
                    vq0Var.o();
                    vq0Var.post(new o1(vq0Var, 3));
                    return;
                }
                return;
            case 10:
                d4 d4Var = (d4) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                z41 z41Var9 = (z41) obj2;
                n7 n7Var6 = d4Var.U;
                if (n7Var6 != null) {
                    ArrayList arrayList9 = n7Var6.f8625l;
                    arrayList8.add(l41.C(AndroidUtilities.dp(16.0f)));
                    if (n7Var6.f8622i && arrayList9.isEmpty()) {
                        l41 o9 = l41.o(1, 34);
                        o9.f30348u = 1;
                        arrayList8.add(o9);
                        l41 o10 = l41.o(2, 34);
                        o10.f30348u = 1;
                        arrayList8.add(o10);
                        l41 o11 = l41.o(3, 34);
                        o11.f30348u = 1;
                        arrayList8.add(o11);
                        l41 o12 = l41.o(4, 34);
                        o12.f30348u = 1;
                        arrayList8.add(o12);
                        l41 o13 = l41.o(5, 34);
                        o13.f30348u = 1;
                        arrayList8.add(o13);
                        l41 o14 = l41.o(6, 34);
                        o14.f30348u = 1;
                        arrayList8.add(o14);
                        l41 o15 = l41.o(7, 34);
                        o15.f30348u = 1;
                        arrayList8.add(o15);
                        l41 o16 = l41.o(8, 34);
                        o16.f30348u = 1;
                        arrayList8.add(o16);
                        l41 o17 = l41.o(9, 34);
                        o17.f30348u = 1;
                        arrayList8.add(o17);
                        f10 = 68.0f;
                    } else {
                        int size3 = arrayList9.size();
                        int i29 = 3;
                        int i30 = 0;
                        while (i30 < size3) {
                            Object obj6 = arrayList9.get(i30);
                            i30++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(d4Var.T))) {
                                int i31 = e2.f6424a;
                                l41 J5 = l41.J(e2.class);
                                J5.f30348u = 1;
                                J5.f30352z = z12 ? 1 : 0;
                                J5.G = savedStarGift2;
                                J5.f30344q = true;
                                J5.f30334f = true;
                                J5.f30345r = z12;
                                HashSet hashSet = d4Var.V;
                                int i32 = savedStarGift2.msg_id;
                                J5.K(hashSet.contains(Long.valueOf(i32 == 0 ? savedStarGift2.saved_id : i32)));
                                J5.f30348u = 1;
                                arrayList8.add(J5);
                                i29--;
                                if (i29 == 0) {
                                    i29 = 3;
                                }
                                z12 = false;
                            }
                        }
                        f10 = 68.0f;
                        if (n7Var6.f8622i || !n7Var6.f8623j) {
                            int i33 = 0;
                            while (true) {
                                if (i29 <= 0) {
                                    i12 = 3;
                                } else {
                                    i12 = i29;
                                }
                                if (i33 < i12) {
                                    i33++;
                                    l41 o18 = l41.o(i33, 34);
                                    o18.f30348u = 1;
                                    arrayList8.add(o18);
                                }
                            }
                        }
                    }
                    arrayList8.add(l41.C(AndroidUtilities.dp(f10)));
                    return;
                }
                return;
            case 11:
                g6 g6Var = (g6) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                z41 z41Var10 = (z41) obj2;
                p5 p5Var = g6Var.d;
                ArrayList arrayList11 = p5Var.d;
                int size4 = arrayList11.size();
                int i34 = 0;
                while (i34 < size4) {
                    Object obj7 = arrayList11.get(i34);
                    i34++;
                    arrayList10.add(e2.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (p5Var.f6718t || !p5Var.f6719u) {
                    l41 o19 = l41.o(-1, 34);
                    o19.f30348u = 1;
                    arrayList10.add(o19);
                    l41 o20 = l41.o(-2, 34);
                    o20.f30348u = 1;
                    arrayList10.add(o20);
                    l41 o21 = l41.o(-3, 34);
                    o21.f30348u = 1;
                    arrayList10.add(o21);
                    if (p5Var.d.isEmpty()) {
                        l41 o22 = l41.o(-4, 34);
                        o22.f30348u = 1;
                        arrayList10.add(o22);
                        l41 o23 = l41.o(-5, 34);
                        o23.f30348u = 1;
                        arrayList10.add(o23);
                        l41 o24 = l41.o(-6, 34);
                        o24.f30348u = 1;
                        arrayList10.add(o24);
                        l41 o25 = l41.o(-7, 34);
                        o25.f30348u = 1;
                        arrayList10.add(o25);
                        l41 o26 = l41.o(-8, 34);
                        o26.f30348u = 1;
                        arrayList10.add(o26);
                        l41 o27 = l41.o(-9, 34);
                        o27.f30348u = 1;
                        arrayList10.add(o27);
                        l41 o28 = l41.o(-10, 34);
                        o28.f30348u = 1;
                        arrayList10.add(o28);
                        l41 o29 = l41.o(-11, 34);
                        o29.f30348u = 1;
                        arrayList10.add(o29);
                        l41 o30 = l41.o(-12, 34);
                        o30.f30348u = 1;
                        arrayList10.add(o30);
                        l41 o31 = l41.o(-13, 34);
                        o31.f30348u = 1;
                        arrayList10.add(o31);
                        l41 o32 = l41.o(-14, 34);
                        o32.f30348u = 1;
                        arrayList10.add(o32);
                        l41 o33 = l41.o(-15, 34);
                        o33.f30348u = 1;
                        arrayList10.add(o33);
                    }
                }
                if (arrayList10.isEmpty() && !p5Var.f6718t) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g6Var.f6491x != z11) {
                    g6Var.f6491x = z11;
                    g6Var.f6490w.setVisibility(0);
                    ViewPropertyAnimator animate = g6Var.f6490w.animate();
                    if (z11) {
                        f12 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f12);
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.95f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                    if (!z11) {
                        f13 = 0.95f;
                    }
                    scaleX.scaleY(f13).setInterpolator(gr.h).setDuration(320L).setListener(new u4(g6Var, z11, 1)).start();
                    return;
                }
                return;
            case 12:
                z41 z41Var11 = (z41) obj2;
                fh.f6.S((fh.f6) obj3, (ArrayList) obj);
                return;
            case 13:
                z41 z41Var12 = (z41) obj2;
                r.X((r) obj3, (ArrayList) obj);
                return;
            case 14:
                g0 g0Var = (g0) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                z41 z41Var13 = (z41) obj2;
                arrayList12.add(l41.k(g0Var.U));
                arrayList12.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList12.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new o1(g0Var, 6)), true), R.drawable.msg_bot));
                arrayList12.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList12.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList12.add(l41.C(AndroidUtilities.dp(68.0f)));
                return;
            case 15:
                ArrayList arrayList13 = (ArrayList) obj;
                z41 z41Var14 = (z41) obj2;
                l41 l41Var = ((o0) obj3).f8657r0;
                if (l41Var != null) {
                    arrayList13.add(l41Var);
                    return;
                }
                return;
            case 16:
                l1 l1Var = (l1) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                z41 z41Var15 = (z41) obj2;
                ArrayList arrayList15 = l1Var.Z;
                boolean z14 = l1Var.f8478s0;
                com.google.android.gms.common.api.internal.r rVar = l1Var.f8463c0;
                ArrayList arrayList16 = l1Var.X;
                ArrayList arrayList17 = l1Var.W;
                com.google.android.gms.common.api.internal.r rVar2 = l1Var.f8462b0;
                com.google.android.gms.common.api.internal.r rVar3 = l1Var.f8461a0;
                ArrayList arrayList18 = l1Var.Y;
                if (arrayList18 != null && arrayList17 != null && arrayList16 != null) {
                    arrayList14.add(l41.C(AndroidUtilities.dp(315.0f)));
                    rVar3.f2893a = 0;
                    rVar3.c();
                    rVar2.f2893a = 0;
                    rVar2.c();
                    rVar.f2893a = 0;
                    rVar.c();
                    int i35 = l1Var.f8466f0.f8385r;
                    if (i35 == 0) {
                        String str2 = "GiftPreviewCountModels";
                        if (!z14) {
                            str = "GiftPreviewCountModels";
                        } else {
                            str = "GiftPreviewCountModelsCrafting";
                        }
                        arrayList14.add(l41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(str, arrayList18.size()))));
                        int size5 = arrayList18.size();
                        int i36 = 0;
                        while (i36 < size5) {
                            Object obj8 = arrayList18.get(i36);
                            i36++;
                            arrayList14.add(i1.a(i35, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList15.isEmpty()) {
                            if (z14) {
                                str2 = "GiftPreviewCountModelsCrafting2";
                            }
                            arrayList14.add(l41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(str2, arrayList18.size()))));
                            int size6 = arrayList15.size();
                            while (i17 < size6) {
                                Object obj9 = arrayList15.get(i17);
                                i17++;
                                arrayList14.add(i1.a(i35, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            return;
                        }
                        return;
                    } else if (i35 == 1) {
                        arrayList14.add(l41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList17.size()))));
                        int size7 = arrayList17.size();
                        while (i18 < size7) {
                            Object obj10 = arrayList17.get(i18);
                            i18++;
                            arrayList14.add(i1.a(i35, new g1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        return;
                    } else if (i35 == 2) {
                        arrayList14.add(l41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList16.size()))));
                        int size8 = arrayList16.size();
                        while (i19 < size8) {
                            Object obj11 = arrayList16.get(i19);
                            i19++;
                            arrayList14.add(i1.a(i35, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l10, bool);
                    return;
                }
                return;
            case 18:
                ((oa) obj3).G0((ArrayList) obj, (z41) obj2);
                return;
            case 19:
                ((y9) obj3).Q((ArrayList) obj, (z41) obj2);
                return;
            case 20:
                ((ea) obj3).Q((ArrayList) obj, (z41) obj2);
                return;
            case 21:
                ((fa) obj3).Q((ArrayList) obj, (z41) obj2);
                return;
            case 22:
                la laVar = (la) obj3;
                ArrayList arrayList19 = (ArrayList) obj;
                z41 z41Var16 = (z41) obj2;
                int i37 = laVar.f8517c;
                int i38 = laVar.d;
                long j10 = laVar.f8519f;
                if (j10 != 0) {
                    c0 g10 = c0.g(i37);
                    ArrayList arrayList20 = g10.k(j10).f7825a[i38];
                    int size9 = arrayList20.size();
                    while (i16 < size9) {
                        Object obj12 = arrayList20.get(i16);
                        i16++;
                        int i39 = ia.f8310a;
                        l41 J6 = l41.J(ia.class);
                        J6.G = (TL_stars.StarsTransaction) obj12;
                        J6.f30344q = true;
                        arrayList19.add(J6);
                    }
                    if (!g10.k(j10).f7828e[i38]) {
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        arrayList19.add(l41.o(arrayList19.size(), 7));
                        return;
                    }
                    return;
                }
                v7 y10 = v7.y(i37, laVar.f8518e);
                ArrayList arrayList21 = y10.f9059q[i38];
                int size10 = arrayList21.size();
                int i40 = 0;
                while (i40 < size10) {
                    Object obj13 = arrayList21.get(i40);
                    i40++;
                    int i41 = ia.f8310a;
                    l41 J7 = l41.J(ia.class);
                    J7.G = (TL_stars.StarsTransaction) obj13;
                    J7.f30344q = false;
                    arrayList19.add(J7);
                }
                if (!y10.f9063u[i38]) {
                    arrayList19.add(l41.o(arrayList19.size(), 7));
                    arrayList19.add(l41.o(arrayList19.size(), 7));
                    arrayList19.add(l41.o(arrayList19.size(), 7));
                    return;
                }
                return;
            case 23:
                ArrayList arrayList22 = (ArrayList) obj;
                z41 z41Var17 = (z41) obj2;
                ((t) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i15 < size11) {
                    TranslateController.Language language = languages.get(i15);
                    i15++;
                    int i42 = jh.r.f14374a;
                    l41 J8 = l41.J(jh.r.class);
                    J8.G = language;
                    arrayList22.add(J8);
                }
                return;
            case 24:
                m mVar = (m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.E;
                RectF rectF = mVar.f15651v0;
                kh.g gVar = mVar.f15632f;
                if (mVar.g()) {
                    if (mVar.C == null) {
                        runnable.run();
                        return;
                    }
                    canvas.translate(-gVar.getEditText().hintLayoutX, 0.0f);
                    canvas.saveLayerAlpha(0.0f, 0.0f, mVar.C.getWidth(), mVar.C.getHeight(), 255, 31);
                    rectF.set(0.0f, 1.0f, mVar.C.getWidth(), mVar.C.getHeight() - 1);
                    mVar.h(mVar.L, canvas, rectF, 0.0f, true, (-gVar.getX()) - editText.getPaddingLeft(), ((-gVar.getY()) - editText.getPaddingTop()) - editText.getExtendedPaddingTop(), true);
                    canvas.save();
                    paint.setAlpha(165);
                    canvas.drawBitmap(mVar.C, 0.0f, 0.0f, paint);
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                Paint c10 = mVar.L.c(1.0f);
                mt editText2 = gVar.getEditText();
                if (c10 == null) {
                    i14 = -2130706433;
                }
                editText2.setHintColor(i14);
                if (c10 == null) {
                    runnable.run();
                    return;
                }
                mt editText3 = gVar.getEditText();
                canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
                runnable.run();
                canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c10);
                canvas.restore();
                return;
            case 25:
                w1 w1Var = (w1) obj3;
                String str3 = (String) obj;
                n2 n2Var = w1Var.f16233r;
                n2Var.f15733b = str3;
                n2Var.f15734c = ((Integer) obj2).intValue();
                w1Var.f16229c.H(str3);
                return;
            case 26:
                b2 b2Var = (b2) obj3;
                String str4 = (String) obj;
                n2 n2Var2 = b2Var.f14988s;
                n2Var2.f15733b = str4;
                n2Var2.f15734c = ((Integer) obj2).intValue();
                b2Var.f14983c.D(str4);
                return;
            case 27:
                u3 u3Var = (u3) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                if (obj != null) {
                    if (u3Var.f16140e == null && (obj instanceof MediaController.PhotoEntry) && (callback = u3Var.f16141f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        return;
                    }
                    return;
                }
                u3Var.getClass();
                return;
            default:
                kh.g6 g6Var2 = (kh.g6) obj3;
                g6Var2.d0(g6Var2.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
        }
    }
}
