package bg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import ih.b5;
import ih.h4;
import ih.q5;
import ih.r5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jh.ca;
import jh.fa;
import jh.ia;
import jh.k7;
import jh.s7;
import jh.s9;
import jh.y9;
import jh.z9;
import nh.f5;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.w41;
import org.telegram.ui.f91;
public final class t1 implements Utilities.Callback2 {
    public final int f2531a;
    public final Object f2532b;

    public t1(Object obj, int i10) {
        this.f2531a = i10;
        this.f2532b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        float f9;
        int i13;
        boolean z11;
        float f10;
        String str;
        st editText;
        Utilities.Callback callback;
        int i14 = this.f2531a;
        float f11 = 0.0f;
        float f12 = 1.0f;
        int i15 = -1;
        boolean z12 = false;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        float f13 = 12.0f;
        Object obj3 = this.f2532b;
        switch (i14) {
            case 0:
                f5 f5Var = (f5) obj3;
                f5Var.f2155u0 = ((Integer) obj).intValue();
                f5Var.f2156v0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new a4.g(f5Var, 13), 60L);
                return;
            case 1:
                eh.f fVar = (eh.f) obj3;
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                ArrayList arrayList2 = fVar.W;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.f6226h0;
                    arrayList.add(w41.D(0, dp2));
                    int i21 = dp - dp2;
                    int size = arrayList2.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj4 = arrayList2.get(i22);
                        i22++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.V.get((String) obj4)) {
                            if (TextUtils.isEmpty(fVar.Y) || eg.g2.U(tL_help_country, AndroidUtilities.translitSafe(fVar.Y).toLowerCase())) {
                                i21 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.f6224f0.containsKey(tL_help_country.iso2);
                                int i23 = eh.e.f6217a;
                                w41 J = w41.J(eh.e.class);
                                J.f34300l = tL_help_country.iso2;
                                J.G = tL_help_country;
                                J.f34294e = containsKey;
                                arrayList.add(J);
                            }
                        }
                    }
                    arrayList.add(w41.D(1, Math.max(0, i21)));
                    return;
                }
                return;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj;
                k51 k51Var2 = (k51) obj2;
                f91 f91Var = ((eh.g) obj3).U;
                if (f91Var != null) {
                    arrayList3.add(w41.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(w41.h(0, 0, f91Var));
                    return;
                }
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((ih.b1) obj3).run((TL_stats.TL_statsPollStats) obj);
                return;
            case 4:
                ih.d dVar = (ih.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                k51 k51Var3 = (k51) obj2;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.T;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.U;
                        ag.n nVar = new ag.n(11, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i24 = ih.b.f9025a;
                        w41 J2 = w41.J(ih.b.class);
                        J2.G = tL_StarGiftAuctionAcquiredGift;
                        J2.H = auction;
                        J2.D = nVar;
                        arrayList4.add(J2);
                    }
                    arrayList4.add(w41.C(AndroidUtilities.dp(16.0f)));
                    return;
                }
                return;
            case 5:
                k51 k51Var4 = (k51) obj2;
                ((ArrayList) obj).add(((ih.f) obj3).T);
                return;
            case 6:
                ArrayList arrayList5 = (ArrayList) obj;
                k51 k51Var5 = (k51) obj2;
                arrayList5.add(((ih.t) obj3).U);
                arrayList5.add(w41.C(AndroidUtilities.dp(16.0f)));
                return;
            case 7:
                k51 k51Var6 = (k51) obj2;
                ((ArrayList) obj).add(w41.j(-1, ((ih.g0) obj3).V));
                return;
            case 8:
                k51 k51Var7 = (k51) obj2;
                ((ArrayList) obj).add(w41.j(-1, ((ih.n0) obj3).V));
                return;
            case 9:
                ((ih.h2) obj3).U((ArrayList) obj, (k51) obj2);
                return;
            case 10:
                ih.n3 n3Var = (ih.n3) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                k51 k51Var8 = (k51) obj2;
                gr0 gr0Var = n3Var.f9293a;
                k7 k7Var = n3Var.f9296e;
                if (k7Var != null) {
                    if ((!k7Var.f12381e || k7Var.f12383g != 783) && k7Var.f12387l.size() <= 0) {
                        k7 k7Var2 = n3Var.f9296e;
                        if (k7Var2.f12385j && !k7Var2.f12384i) {
                            return;
                        }
                    }
                    k7 k7Var3 = n3Var.f9296e;
                    if (k7Var3 != null && (i12 = k7Var3.f12389n) != 0) {
                        i10 = Math.min(3, i12);
                    } else {
                        i10 = 3;
                    }
                    int max = Math.max(1, i10);
                    k7 k7Var4 = n3Var.f9296e;
                    if (k7Var4 != null) {
                        ArrayList arrayList7 = k7Var4.f12387l;
                        int size2 = arrayList7.size();
                        int i25 = 0;
                        int i26 = 3;
                        while (i25 < size2) {
                            Object obj5 = arrayList7.get(i25);
                            i25++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z13 = n3Var.d;
                            int i27 = ih.x1.f9498a;
                            w41 J3 = w41.J(ih.x1.class);
                            J3.f34309u = 1;
                            J3.f34313z = 0;
                            J3.G = savedStarGift;
                            J3.f34305q = true;
                            J3.f34295f = false;
                            J3.f34306r = z13;
                            if (n3Var.f9298n && (n3Var.f9296e != gr0Var.d || savedStarGift.pinned_to_top)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J3.h = z10;
                            arrayList6.add(J3);
                            i26--;
                            if (i26 == 0) {
                                i26 = 3;
                            }
                        }
                        k7 k7Var5 = n3Var.f9296e;
                        if (k7Var5.f12384i || !k7Var5.f12385j) {
                            int i28 = 0;
                            while (true) {
                                if (i26 <= 0) {
                                    i11 = 3;
                                } else {
                                    i11 = i26;
                                }
                                if (i28 < i11) {
                                    i28++;
                                    w41 o10 = w41.o(i28, 34);
                                    o10.f34309u = 1;
                                    arrayList6.add(o10);
                                }
                            }
                        }
                    }
                    if (gr0Var.d == n3Var.f9296e) {
                        arrayList6.add(w41.C(AndroidUtilities.dp(20.0f)));
                        if (gr0Var.f9503c == UserConfig.getInstance(n3Var.f9294b).getClientUserId()) {
                            int v02 = g6.v0(g6.f23450z6, n3Var.f9295c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i29 = ih.t3.f9402a;
                            w41 J4 = w41.J(ih.t3.class);
                            J4.f34300l = string;
                            J4.f34313z = 17;
                            J4.B = v02;
                            J4.A = 14.0f;
                            J4.f34297i = dp3;
                            J4.f34299k = 0;
                            J4.f34305q = false;
                            arrayList6.add(J4);
                        }
                        arrayList6.add(w41.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(w41.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        if (n3Var.E) {
                            f13 = 42.0f;
                        }
                        arrayList6.add(0, w41.C(AndroidUtilities.dp(f13)));
                    }
                    if (n3Var.f9297f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new ih.n2(n3Var, max, 1));
                    }
                    gr0Var.o();
                    gr0Var.post(new cg.m2(gr0Var, 23));
                    return;
                }
                return;
            case 11:
                ih.s3 s3Var = (ih.s3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                k51 k51Var9 = (k51) obj2;
                k7 k7Var6 = s3Var.U;
                if (k7Var6 != null) {
                    ArrayList arrayList9 = k7Var6.f12387l;
                    arrayList8.add(w41.C(AndroidUtilities.dp(16.0f)));
                    if (k7Var6.f12384i && arrayList9.isEmpty()) {
                        w41 o11 = w41.o(1, 34);
                        o11.f34309u = 1;
                        arrayList8.add(o11);
                        w41 o12 = w41.o(2, 34);
                        o12.f34309u = 1;
                        arrayList8.add(o12);
                        w41 o13 = w41.o(3, 34);
                        o13.f34309u = 1;
                        arrayList8.add(o13);
                        w41 o14 = w41.o(4, 34);
                        o14.f34309u = 1;
                        arrayList8.add(o14);
                        w41 o15 = w41.o(5, 34);
                        o15.f34309u = 1;
                        arrayList8.add(o15);
                        w41 o16 = w41.o(6, 34);
                        o16.f34309u = 1;
                        arrayList8.add(o16);
                        w41 o17 = w41.o(7, 34);
                        o17.f34309u = 1;
                        arrayList8.add(o17);
                        w41 o18 = w41.o(8, 34);
                        o18.f34309u = 1;
                        arrayList8.add(o18);
                        w41 o19 = w41.o(9, 34);
                        o19.f34309u = 1;
                        arrayList8.add(o19);
                        f9 = 68.0f;
                    } else {
                        int size3 = arrayList9.size();
                        int i30 = 3;
                        int i31 = 0;
                        while (i31 < size3) {
                            Object obj6 = arrayList9.get(i31);
                            i31++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(s3Var.T))) {
                                int i32 = ih.x1.f9498a;
                                w41 J5 = w41.J(ih.x1.class);
                                J5.f34309u = 1;
                                J5.f34313z = z12 ? 1 : 0;
                                J5.G = savedStarGift2;
                                J5.f34305q = true;
                                J5.f34295f = true;
                                J5.f34306r = z12;
                                HashSet hashSet = s3Var.V;
                                int i33 = savedStarGift2.msg_id;
                                int i34 = size3;
                                J5.K(hashSet.contains(Long.valueOf(i33 == 0 ? savedStarGift2.saved_id : i33)));
                                J5.f34309u = 1;
                                arrayList8.add(J5);
                                i30--;
                                if (i30 == 0) {
                                    i30 = 3;
                                }
                                size3 = i34;
                                z12 = false;
                            }
                        }
                        f9 = 68.0f;
                        if (k7Var6.f12384i || !k7Var6.f12385j) {
                            int i35 = 0;
                            while (true) {
                                if (i30 <= 0) {
                                    i13 = 3;
                                } else {
                                    i13 = i30;
                                }
                                if (i35 < i13) {
                                    i35++;
                                    w41 o20 = w41.o(i35, 34);
                                    o20.f34309u = 1;
                                    arrayList8.add(o20);
                                }
                            }
                        }
                    }
                    arrayList8.add(w41.C(AndroidUtilities.dp(f9)));
                    return;
                }
                return;
            case 12:
                r5 r5Var = (r5) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                k51 k51Var10 = (k51) obj2;
                b5 b5Var = r5Var.d;
                ArrayList arrayList11 = b5Var.d;
                int size4 = arrayList11.size();
                int i36 = 0;
                while (i36 < size4) {
                    Object obj7 = arrayList11.get(i36);
                    i36++;
                    arrayList10.add(ih.x1.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (b5Var.f9060t || !b5Var.f9061u) {
                    w41 o21 = w41.o(-1, 34);
                    o21.f34309u = 1;
                    arrayList10.add(o21);
                    w41 o22 = w41.o(-2, 34);
                    o22.f34309u = 1;
                    arrayList10.add(o22);
                    w41 o23 = w41.o(-3, 34);
                    o23.f34309u = 1;
                    arrayList10.add(o23);
                    if (b5Var.d.isEmpty()) {
                        w41 o24 = w41.o(-4, 34);
                        o24.f34309u = 1;
                        arrayList10.add(o24);
                        w41 o25 = w41.o(-5, 34);
                        o25.f34309u = 1;
                        arrayList10.add(o25);
                        w41 o26 = w41.o(-6, 34);
                        o26.f34309u = 1;
                        arrayList10.add(o26);
                        w41 o27 = w41.o(-7, 34);
                        o27.f34309u = 1;
                        arrayList10.add(o27);
                        w41 o28 = w41.o(-8, 34);
                        o28.f34309u = 1;
                        arrayList10.add(o28);
                        w41 o29 = w41.o(-9, 34);
                        o29.f34309u = 1;
                        arrayList10.add(o29);
                        w41 o30 = w41.o(-10, 34);
                        o30.f34309u = 1;
                        arrayList10.add(o30);
                        w41 o31 = w41.o(-11, 34);
                        o31.f34309u = 1;
                        arrayList10.add(o31);
                        w41 o32 = w41.o(-12, 34);
                        o32.f34309u = 1;
                        arrayList10.add(o32);
                        w41 o33 = w41.o(-13, 34);
                        o33.f34309u = 1;
                        arrayList10.add(o33);
                        w41 o34 = w41.o(-14, 34);
                        o34.f34309u = 1;
                        arrayList10.add(o34);
                        w41 o35 = w41.o(-15, 34);
                        o35.f34309u = 1;
                        arrayList10.add(o35);
                    }
                }
                if (arrayList10.isEmpty() && !b5Var.f9060t) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (r5Var.f9363x != z11) {
                    r5Var.f9363x = z11;
                    r5Var.f9362w.setVisibility(0);
                    ViewPropertyAnimator animate = r5Var.f9362w.animate();
                    if (z11) {
                        f11 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f11);
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.95f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                    if (!z11) {
                        f12 = 0.95f;
                    }
                    scaleX.scaleY(f12).setInterpolator(jr.h).setDuration(320L).setListener(new h4(r5Var, z11, 1)).start();
                    return;
                }
                return;
            case 13:
                k51 k51Var11 = (k51) obj2;
                q5.T((q5) obj3, (ArrayList) obj);
                return;
            case 14:
                k51 k51Var12 = (k51) obj2;
                jh.q.Y((jh.q) obj3, (ArrayList) obj);
                return;
            case 15:
                jh.f0 f0Var = (jh.f0) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                k51 k51Var13 = (k51) obj2;
                arrayList12.add(w41.k(f0Var.U));
                arrayList12.add(jh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList12.add(jh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new jh.o(f0Var, 1)), true), R.drawable.msg_bot));
                arrayList12.add(jh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList12.add(jh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList12.add(w41.C(AndroidUtilities.dp(68.0f)));
                return;
            case 16:
                ArrayList arrayList13 = (ArrayList) obj;
                k51 k51Var14 = (k51) obj2;
                w41 w41Var = ((jh.n0) obj3).f12498r0;
                if (w41Var != null) {
                    arrayList13.add(w41Var);
                    return;
                }
                return;
            case 17:
                jh.j1 j1Var = (jh.j1) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                k51 k51Var15 = (k51) obj2;
                ArrayList arrayList15 = j1Var.Z;
                boolean z14 = j1Var.f12300s0;
                com.google.android.gms.common.api.internal.r rVar = j1Var.f12285c0;
                ArrayList arrayList16 = j1Var.X;
                ArrayList arrayList17 = j1Var.W;
                com.google.android.gms.common.api.internal.r rVar2 = j1Var.f12284b0;
                com.google.android.gms.common.api.internal.r rVar3 = j1Var.f12283a0;
                ArrayList arrayList18 = j1Var.Y;
                if (arrayList18 != null && arrayList17 != null && arrayList16 != null) {
                    arrayList14.add(w41.C(AndroidUtilities.dp(315.0f)));
                    rVar3.f3907a = 0;
                    rVar3.c();
                    rVar2.f3907a = 0;
                    rVar2.c();
                    rVar.f3907a = 0;
                    rVar.c();
                    int i37 = j1Var.f12288f0.f12235r;
                    if (i37 == 0) {
                        String str2 = "GiftPreviewCountModels";
                        if (!z14) {
                            str = "GiftPreviewCountModels";
                        } else {
                            str = "GiftPreviewCountModelsCrafting";
                        }
                        arrayList14.add(w41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(str, arrayList18.size()))));
                        int size5 = arrayList18.size();
                        int i38 = 0;
                        while (i38 < size5) {
                            Object obj8 = arrayList18.get(i38);
                            i38++;
                            arrayList14.add(jh.g1.a(i37, new jh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList15.isEmpty()) {
                            if (z14) {
                                str2 = "GiftPreviewCountModelsCrafting2";
                            }
                            arrayList14.add(w41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(str2, arrayList18.size()))));
                            int size6 = arrayList15.size();
                            while (i18 < size6) {
                                Object obj9 = arrayList15.get(i18);
                                i18++;
                                arrayList14.add(jh.g1.a(i37, new jh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            return;
                        }
                        return;
                    } else if (i37 == 1) {
                        arrayList14.add(w41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList17.size()))));
                        int size7 = arrayList17.size();
                        while (i19 < size7) {
                            Object obj10 = arrayList17.get(i19);
                            i19++;
                            arrayList14.add(jh.g1.a(i37, new jh.f1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        return;
                    } else if (i37 == 2) {
                        arrayList14.add(w41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList16.size()))));
                        int size8 = arrayList16.size();
                        while (i20 < size8) {
                            Object obj11 = arrayList16.get(i20);
                            i20++;
                            arrayList14.add(jh.g1.a(i37, new jh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 18:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l10, bool);
                    return;
                }
                return;
            case 19:
                ((ia) obj3).H0((ArrayList) obj, (k51) obj2);
                return;
            case 20:
                ((s9) obj3).R((ArrayList) obj, (k51) obj2);
                return;
            case 21:
                ((y9) obj3).R((ArrayList) obj, (k51) obj2);
                return;
            case 22:
                ((z9) obj3).R((ArrayList) obj, (k51) obj2);
                return;
            case 23:
                fa faVar = (fa) obj3;
                ArrayList arrayList19 = (ArrayList) obj;
                k51 k51Var16 = (k51) obj2;
                int i39 = faVar.f12075c;
                int i40 = faVar.d;
                long j10 = faVar.f12077f;
                if (j10 != 0) {
                    jh.b0 g10 = jh.b0.g(i39);
                    ArrayList arrayList20 = g10.k(j10).f11702a[i40];
                    int size9 = arrayList20.size();
                    while (i17 < size9) {
                        Object obj12 = arrayList20.get(i17);
                        i17++;
                        int i41 = ca.f11886a;
                        w41 J6 = w41.J(ca.class);
                        J6.G = (TL_stars.StarsTransaction) obj12;
                        J6.f34305q = true;
                        arrayList19.add(J6);
                    }
                    if (!g10.k(j10).f11705e[i40]) {
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        arrayList19.add(w41.o(arrayList19.size(), 7));
                        return;
                    }
                    return;
                }
                s7 y8 = s7.y(i39, faVar.f12076e);
                ArrayList arrayList21 = y8.f12801q[i40];
                int size10 = arrayList21.size();
                int i42 = 0;
                while (i42 < size10) {
                    Object obj13 = arrayList21.get(i42);
                    i42++;
                    int i43 = ca.f11886a;
                    w41 J7 = w41.J(ca.class);
                    J7.G = (TL_stars.StarsTransaction) obj13;
                    J7.f34305q = false;
                    arrayList19.add(J7);
                }
                if (!y8.f12805u[i40]) {
                    arrayList19.add(w41.o(arrayList19.size(), 7));
                    arrayList19.add(w41.o(arrayList19.size(), 7));
                    arrayList19.add(w41.o(arrayList19.size(), 7));
                    return;
                }
                return;
            case 24:
                ArrayList arrayList22 = (ArrayList) obj;
                k51 k51Var17 = (k51) obj2;
                ((mh.u) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i16 < size11) {
                    TranslateController.Language language = languages.get(i16);
                    i16++;
                    int i44 = mh.s.f17052a;
                    w41 J8 = w41.J(mh.s.class);
                    J8.G = language;
                    arrayList22.add(J8);
                }
                return;
            case 25:
                nh.m mVar = (nh.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.E;
                RectF rectF = mVar.f18095v0;
                nh.g gVar = mVar.f18076f;
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
                Paint c3 = mVar.L.c(1.0f);
                st editText2 = gVar.getEditText();
                if (c3 == null) {
                    i15 = -2130706433;
                }
                editText2.setHintColor(i15);
                if (c3 == null) {
                    runnable.run();
                    return;
                }
                st editText3 = gVar.getEditText();
                canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
                runnable.run();
                canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c3);
                canvas.restore();
                return;
            case 26:
                nh.t1 t1Var = (nh.t1) obj3;
                String str3 = (String) obj;
                nh.k2 k2Var = t1Var.f18584r;
                k2Var.f17990b = str3;
                k2Var.f17991c = ((Integer) obj2).intValue();
                t1Var.f18580c.H(str3);
                return;
            case 27:
                nh.y1 y1Var = (nh.y1) obj3;
                String str4 = (String) obj;
                nh.k2 k2Var2 = y1Var.f18859s;
                k2Var2.f17990b = str4;
                k2Var2.f17991c = ((Integer) obj2).intValue();
                y1Var.f18854c.D(str4);
                return;
            default:
                nh.r3 r3Var = (nh.r3) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                if (obj != null) {
                    if (r3Var.f18510e == null && (obj instanceof MediaController.PhotoEntry) && (callback = r3Var.f18511f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        return;
                    }
                    return;
                }
                r3Var.getClass();
                return;
        }
    }
}
