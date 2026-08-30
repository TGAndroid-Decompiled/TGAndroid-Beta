package dg;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kh.b5;
import kh.h4;
import kh.q5;
import kh.r5;
import lh.aa;
import lh.da;
import lh.ga;
import lh.ja;
import lh.l7;
import lh.t7;
import lh.t9;
import lh.z9;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.w51;
import org.telegram.ui.cu;
import org.telegram.ui.s91;
import ph.o4;
public final class r1 implements Utilities.Callback2 {
    public final int f4765a;
    public final Object f4766b;

    public r1(Object obj, int i10) {
        this.f4765a = i10;
        this.f4766b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z4;
        int i12;
        float f10;
        int i13;
        boolean z10;
        float f11;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        vt editText;
        int i14 = this.f4765a;
        float f12 = 0.0f;
        float f13 = 1.0f;
        int i15 = -1;
        ?? r14 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        float f14 = 12.0f;
        Object obj3 = this.f4766b;
        switch (i14) {
            case 0:
                o4 o4Var = (o4) obj3;
                o4Var.f4358v0 = ((Integer) obj).intValue();
                o4Var.f4359w0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new ag.d(o4Var, 21), 60L);
                return;
            case 1:
                gh.f fVar = (gh.f) obj3;
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                ArrayList arrayList2 = fVar.X;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.f6847i0;
                    arrayList.add(i51.D(0, dp2));
                    int i22 = dp - dp2;
                    int size = arrayList2.size();
                    int i23 = i22;
                    int i24 = 0;
                    while (i24 < size) {
                        Object obj4 = arrayList2.get(i24);
                        i24++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.W.get((String) obj4)) {
                            if (TextUtils.isEmpty(fVar.Z) || gg.f2.U(tL_help_country, AndroidUtilities.translitSafe(fVar.Z).toLowerCase())) {
                                i23 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.f6845g0.containsKey(tL_help_country.iso2);
                                int i25 = gh.e.f6837a;
                                i51 J = i51.J(gh.e.class);
                                J.f25565l = tL_help_country.iso2;
                                J.G = tL_help_country;
                                J.e = containsKey;
                                arrayList.add(J);
                            }
                        }
                    }
                    arrayList.add(i51.D(1, Math.max(0, i23)));
                    return;
                }
                return;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                s91 s91Var = ((gh.g) obj3).V;
                if (s91Var != null) {
                    arrayList3.add(i51.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(i51.h(0, 0, s91Var));
                    return;
                }
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((kh.a1) obj3).run((TL_stats.TL_statsPollStats) obj);
                return;
            case 4:
                kh.d dVar = (kh.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.U;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.V;
                        cg.n nVar = new cg.n(11, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i26 = kh.b.f10468a;
                        i51 J2 = i51.J(kh.b.class);
                        J2.G = tL_StarGiftAuctionAcquiredGift;
                        J2.H = auction;
                        J2.D = nVar;
                        arrayList4.add(J2);
                    }
                    arrayList4.add(i51.C(AndroidUtilities.dp(16.0f)));
                    return;
                }
                return;
            case 5:
                w51 w51Var4 = (w51) obj2;
                ((ArrayList) obj).add(((kh.f) obj3).U);
                return;
            case 6:
                ArrayList arrayList5 = (ArrayList) obj;
                w51 w51Var5 = (w51) obj2;
                arrayList5.add(((kh.s) obj3).V);
                arrayList5.add(i51.C(AndroidUtilities.dp(16.0f)));
                return;
            case 7:
                w51 w51Var6 = (w51) obj2;
                ((ArrayList) obj).add(i51.j(-1, ((kh.f0) obj3).W));
                return;
            case 8:
                w51 w51Var7 = (w51) obj2;
                ((ArrayList) obj).add(i51.j(-1, ((kh.m0) obj3).W));
                return;
            case 9:
                ((kh.h2) obj3).U((ArrayList) obj, (w51) obj2);
                return;
            case 10:
                kh.n3 n3Var = (kh.n3) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                w51 w51Var8 = (w51) obj2;
                or0 or0Var = n3Var.f10719a;
                l7 l7Var = n3Var.e;
                if (l7Var != null) {
                    if ((!l7Var.e || l7Var.f12768g != 783) && l7Var.f12772l.size() <= 0) {
                        l7 l7Var2 = n3Var.e;
                        if (l7Var2.f12770j && !l7Var2.f12769i) {
                            return;
                        }
                    }
                    l7 l7Var3 = n3Var.e;
                    if (l7Var3 != null && (i12 = l7Var3.f12774n) != 0) {
                        i10 = Math.min(3, i12);
                    } else {
                        i10 = 3;
                    }
                    int max = Math.max(1, i10);
                    l7 l7Var4 = n3Var.e;
                    if (l7Var4 != null) {
                        ArrayList arrayList7 = l7Var4.f12772l;
                        int size2 = arrayList7.size();
                        int i27 = 3;
                        int i28 = 0;
                        while (i28 < size2) {
                            Object obj5 = arrayList7.get(i28);
                            i28++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z15 = n3Var.d;
                            int i29 = kh.w1.f10903a;
                            i51 J3 = i51.J(kh.w1.class);
                            J3.f25574u = 1;
                            J3.f25578z = r14;
                            J3.G = savedStarGift;
                            J3.f25570q = true;
                            J3.f25560f = r14;
                            J3.f25571r = z15;
                            if (n3Var.f10723n && (n3Var.e != or0Var.d || savedStarGift.pinned_to_top)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            J3.h = z4;
                            arrayList6.add(J3);
                            i27--;
                            if (i27 == 0) {
                                i27 = 3;
                            }
                            r14 = 0;
                        }
                        l7 l7Var5 = n3Var.e;
                        if (l7Var5.f12769i || !l7Var5.f12770j) {
                            int i30 = 0;
                            while (true) {
                                if (i27 <= 0) {
                                    i11 = 3;
                                } else {
                                    i11 = i27;
                                }
                                if (i30 < i11) {
                                    i30++;
                                    i51 o10 = i51.o(i30, 34);
                                    o10.f25574u = 1;
                                    arrayList6.add(o10);
                                }
                            }
                        }
                    }
                    if (or0Var.d == n3Var.e) {
                        arrayList6.add(i51.C(AndroidUtilities.dp(20.0f)));
                        if (or0Var.f10941c == UserConfig.getInstance(n3Var.f10720b).getClientUserId()) {
                            int v02 = j6.v0(j6.f20298z6, n3Var.f10721c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp3 = AndroidUtilities.dp(24.0f);
                            int i31 = kh.t3.f10828a;
                            i51 J4 = i51.J(kh.t3.class);
                            J4.f25565l = string;
                            J4.f25578z = 17;
                            J4.B = v02;
                            J4.A = 14.0f;
                            J4.f25562i = dp3;
                            J4.f25564k = 0;
                            J4.f25570q = false;
                            arrayList6.add(J4);
                        }
                        arrayList6.add(i51.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(i51.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        if (n3Var.F) {
                            f14 = 42.0f;
                        }
                        arrayList6.add(0, i51.C(AndroidUtilities.dp(f14)));
                    }
                    if (n3Var.f10722f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new kh.n2(n3Var, max, 1));
                    }
                    or0Var.o();
                    or0Var.post(new ef.e(or0Var, 27));
                    return;
                }
                return;
            case 11:
                kh.s3 s3Var = (kh.s3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                w51 w51Var9 = (w51) obj2;
                l7 l7Var6 = s3Var.V;
                if (l7Var6 != null) {
                    ArrayList arrayList9 = l7Var6.f12772l;
                    arrayList8.add(i51.C(AndroidUtilities.dp(16.0f)));
                    if (l7Var6.f12769i && arrayList9.isEmpty()) {
                        i51 o11 = i51.o(1, 34);
                        o11.f25574u = 1;
                        arrayList8.add(o11);
                        i51 o12 = i51.o(2, 34);
                        o12.f25574u = 1;
                        arrayList8.add(o12);
                        i51 o13 = i51.o(3, 34);
                        o13.f25574u = 1;
                        arrayList8.add(o13);
                        i51 o14 = i51.o(4, 34);
                        o14.f25574u = 1;
                        arrayList8.add(o14);
                        i51 o15 = i51.o(5, 34);
                        o15.f25574u = 1;
                        arrayList8.add(o15);
                        i51 o16 = i51.o(6, 34);
                        o16.f25574u = 1;
                        arrayList8.add(o16);
                        i51 o17 = i51.o(7, 34);
                        o17.f25574u = 1;
                        arrayList8.add(o17);
                        i51 o18 = i51.o(8, 34);
                        o18.f25574u = 1;
                        arrayList8.add(o18);
                        i51 o19 = i51.o(9, 34);
                        o19.f25574u = 1;
                        arrayList8.add(o19);
                        f10 = 68.0f;
                    } else {
                        int size3 = arrayList9.size();
                        int i32 = 3;
                        int i33 = 0;
                        while (i33 < size3) {
                            Object obj6 = arrayList9.get(i33);
                            i33++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(s3Var.U))) {
                                int i34 = kh.w1.f10903a;
                                i51 J5 = i51.J(kh.w1.class);
                                J5.f25574u = 1;
                                J5.f25578z = 0;
                                J5.G = savedStarGift2;
                                J5.f25570q = true;
                                J5.f25560f = true;
                                J5.f25571r = false;
                                HashSet hashSet = s3Var.W;
                                int i35 = savedStarGift2.msg_id;
                                J5.K(hashSet.contains(Long.valueOf(i35 == 0 ? savedStarGift2.saved_id : i35)));
                                J5.f25574u = 1;
                                arrayList8.add(J5);
                                i32--;
                                if (i32 == 0) {
                                    i32 = 3;
                                }
                            }
                        }
                        f10 = 68.0f;
                        if (l7Var6.f12769i || !l7Var6.f12770j) {
                            while (true) {
                                if (i32 <= 0) {
                                    i13 = 3;
                                } else {
                                    i13 = i32;
                                }
                                if (i21 < i13) {
                                    i21++;
                                    i51 o20 = i51.o(i21, 34);
                                    o20.f25574u = 1;
                                    arrayList8.add(o20);
                                }
                            }
                        }
                    }
                    arrayList8.add(i51.C(AndroidUtilities.dp(f10)));
                    return;
                }
                return;
            case 12:
                r5 r5Var = (r5) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                w51 w51Var10 = (w51) obj2;
                b5 b5Var = r5Var.d;
                ArrayList arrayList11 = b5Var.d;
                int size4 = arrayList11.size();
                int i36 = 0;
                while (i36 < size4) {
                    Object obj7 = arrayList11.get(i36);
                    i36++;
                    arrayList10.add(kh.w1.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (b5Var.f10498t || !b5Var.f10499u) {
                    i51 o21 = i51.o(-1, 34);
                    o21.f25574u = 1;
                    arrayList10.add(o21);
                    i51 o22 = i51.o(-2, 34);
                    o22.f25574u = 1;
                    arrayList10.add(o22);
                    i51 o23 = i51.o(-3, 34);
                    o23.f25574u = 1;
                    arrayList10.add(o23);
                    if (b5Var.d.isEmpty()) {
                        i51 o24 = i51.o(-4, 34);
                        o24.f25574u = 1;
                        arrayList10.add(o24);
                        i51 o25 = i51.o(-5, 34);
                        o25.f25574u = 1;
                        arrayList10.add(o25);
                        i51 o26 = i51.o(-6, 34);
                        o26.f25574u = 1;
                        arrayList10.add(o26);
                        i51 o27 = i51.o(-7, 34);
                        o27.f25574u = 1;
                        arrayList10.add(o27);
                        i51 o28 = i51.o(-8, 34);
                        o28.f25574u = 1;
                        arrayList10.add(o28);
                        i51 o29 = i51.o(-9, 34);
                        o29.f25574u = 1;
                        arrayList10.add(o29);
                        i51 o30 = i51.o(-10, 34);
                        o30.f25574u = 1;
                        arrayList10.add(o30);
                        i51 o31 = i51.o(-11, 34);
                        o31.f25574u = 1;
                        arrayList10.add(o31);
                        i51 o32 = i51.o(-12, 34);
                        o32.f25574u = 1;
                        arrayList10.add(o32);
                        i51 o33 = i51.o(-13, 34);
                        o33.f25574u = 1;
                        arrayList10.add(o33);
                        i51 o34 = i51.o(-14, 34);
                        o34.f25574u = 1;
                        arrayList10.add(o34);
                        i51 o35 = i51.o(-15, 34);
                        o35.f25574u = 1;
                        arrayList10.add(o35);
                    }
                }
                if (arrayList10.isEmpty() && !b5Var.f10498t) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (r5Var.f10787x != z10) {
                    r5Var.f10787x = z10;
                    r5Var.f10786w.setVisibility(0);
                    ViewPropertyAnimator animate = r5Var.f10786w.animate();
                    if (z10) {
                        f12 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f12);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.95f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                    if (!z10) {
                        f13 = 0.95f;
                    }
                    scaleX.scaleY(f13).setInterpolator(nr.h).setDuration(320L).setListener(new h4(r5Var, z10, 1)).start();
                    return;
                }
                return;
            case 13:
                w51 w51Var11 = (w51) obj2;
                q5.T((q5) obj3, (ArrayList) obj);
                return;
            case 14:
                w51 w51Var12 = (w51) obj2;
                lh.q.Y((lh.q) obj3, (ArrayList) obj);
                return;
            case 15:
                lh.f0 f0Var = (lh.f0) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                w51 w51Var13 = (w51) obj2;
                arrayList12.add(i51.k(f0Var.V));
                arrayList12.add(lh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList12.add(lh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new lh.b(f0Var, 2)), true), R.drawable.msg_bot));
                arrayList12.add(lh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList12.add(lh.d0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList12.add(i51.C(AndroidUtilities.dp(68.0f)));
                return;
            case 16:
                ArrayList arrayList13 = (ArrayList) obj;
                w51 w51Var14 = (w51) obj2;
                i51 i51Var = ((lh.n0) obj3).f12828s0;
                if (i51Var != null) {
                    arrayList13.add(i51Var);
                    return;
                }
                return;
            case 17:
                lh.j1 j1Var = (lh.j1) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                w51 w51Var15 = (w51) obj2;
                ArrayList arrayList15 = j1Var.f12636a0;
                boolean z16 = j1Var.f12654t0;
                com.google.android.gms.common.api.internal.r rVar = j1Var.f12639d0;
                ArrayList arrayList16 = j1Var.Y;
                ArrayList arrayList17 = j1Var.X;
                com.google.android.gms.common.api.internal.r rVar2 = j1Var.f12638c0;
                com.google.android.gms.common.api.internal.r rVar3 = j1Var.f12637b0;
                ArrayList arrayList18 = j1Var.Z;
                if (arrayList18 != null && arrayList17 != null && arrayList16 != null) {
                    arrayList14.add(i51.C(AndroidUtilities.dp(315.0f)));
                    rVar3.f2861a = 0;
                    rVar3.c();
                    rVar2.f2861a = 0;
                    rVar2.c();
                    rVar.f2861a = 0;
                    rVar.c();
                    int i37 = j1Var.f12642g0.f12578r;
                    if (i37 == 0) {
                        String str2 = "GiftPreviewCountModels";
                        if (!z16) {
                            str = "GiftPreviewCountModels";
                        } else {
                            str = "GiftPreviewCountModelsCrafting";
                        }
                        arrayList14.add(i51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(str, arrayList18.size()))));
                        int size5 = arrayList18.size();
                        int i38 = 0;
                        while (i38 < size5) {
                            Object obj8 = arrayList18.get(i38);
                            i38++;
                            arrayList14.add(lh.g1.a(i37, new lh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList15.isEmpty()) {
                            if (z16) {
                                str2 = "GiftPreviewCountModelsCrafting2";
                            }
                            arrayList14.add(i51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(str2, arrayList18.size()))));
                            int size6 = arrayList15.size();
                            while (i18 < size6) {
                                Object obj9 = arrayList15.get(i18);
                                i18++;
                                arrayList14.add(lh.g1.a(i37, new lh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            return;
                        }
                        return;
                    } else if (i37 == 1) {
                        arrayList14.add(i51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList17.size()))));
                        int size7 = arrayList17.size();
                        while (i19 < size7) {
                            Object obj10 = arrayList17.get(i19);
                            i19++;
                            arrayList14.add(lh.g1.a(i37, new lh.f1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                        return;
                    } else if (i37 == 2) {
                        arrayList14.add(i51.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList16.size()))));
                        int size8 = arrayList16.size();
                        while (i20 < size8) {
                            Object obj11 = arrayList16.get(i20);
                            i20++;
                            arrayList14.add(lh.g1.a(i37, new lh.f1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
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
                ((ja) obj3).H0((ArrayList) obj, (w51) obj2);
                return;
            case 20:
                ((t9) obj3).R((ArrayList) obj, (w51) obj2);
                return;
            case 21:
                ((z9) obj3).R((ArrayList) obj, (w51) obj2);
                return;
            case 22:
                ((aa) obj3).R((ArrayList) obj, (w51) obj2);
                return;
            case 23:
                ga gaVar = (ga) obj3;
                ArrayList arrayList19 = (ArrayList) obj;
                w51 w51Var16 = (w51) obj2;
                int i39 = gaVar.f12514c;
                int i40 = gaVar.d;
                long j10 = gaVar.f12515f;
                if (j10 != 0) {
                    lh.b0 g10 = lh.b0.g(i39);
                    ArrayList arrayList20 = g10.k(j10).f12085a[i40];
                    int size9 = arrayList20.size();
                    while (i17 < size9) {
                        Object obj12 = arrayList20.get(i17);
                        i17++;
                        int i41 = da.f12321a;
                        i51 J6 = i51.J(da.class);
                        J6.G = (TL_stars.StarsTransaction) obj12;
                        J6.f25570q = true;
                        arrayList19.add(J6);
                    }
                    if (!g10.k(j10).e[i40]) {
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        arrayList19.add(i51.o(arrayList19.size(), 7));
                        return;
                    }
                    return;
                }
                t7 y10 = t7.y(i39, gaVar.e);
                ArrayList arrayList21 = y10.f13162q[i40];
                int size10 = arrayList21.size();
                int i42 = 0;
                while (i42 < size10) {
                    Object obj13 = arrayList21.get(i42);
                    i42++;
                    int i43 = da.f12321a;
                    i51 J7 = i51.J(da.class);
                    J7.G = (TL_stars.StarsTransaction) obj13;
                    J7.f25570q = false;
                    arrayList19.add(J7);
                }
                if (!y10.f13166u[i40]) {
                    arrayList19.add(i51.o(arrayList19.size(), 7));
                    arrayList19.add(i51.o(arrayList19.size(), 7));
                    arrayList19.add(i51.o(arrayList19.size(), 7));
                    return;
                }
                return;
            case 24:
                ArrayList arrayList22 = (ArrayList) obj;
                w51 w51Var17 = (w51) obj2;
                ((oh.u) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i16 < size11) {
                    TranslateController.Language language = languages.get(i16);
                    i16++;
                    int i44 = oh.s.f16611a;
                    i51 J8 = i51.J(oh.s.class);
                    J8.G = language;
                    arrayList22.add(J8);
                }
                return;
            case 25:
                final org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) obj3;
                ArrayList arrayList23 = (ArrayList) obj;
                w51 w51Var18 = (w51) obj2;
                org.telegram.ui.web.i iVar = kVar.f39555y;
                ArrayList arrayList24 = kVar.f39554x;
                if (!kVar.f39547b && arrayList24.isEmpty()) {
                    arrayList23.add(i51.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList25 = new ArrayList();
                String string2 = sharedPreferences.getString("queries_json", null);
                if (string2 != null) {
                    try {
                        ArrayList arrayList26 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string2);
                        for (int i45 = 0; i45 < jSONArray.length(); i45++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i45);
                            org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            jVar.f39540c = jSONObject.optDouble("rank", 0.0d);
                            arrayList26.add(jVar);
                        }
                        Collections.sort(arrayList26, new cu(14));
                        int size12 = arrayList26.size();
                        int i46 = 0;
                        while (i46 < size12) {
                            Object obj14 = arrayList26.get(i46);
                            i46++;
                            org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj14;
                            if (arrayList25.size() < 20) {
                                arrayList25.add(jVar2.f39538a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList24.size();
                arrayList25.size();
                if (!arrayList24.isEmpty()) {
                    arrayList23.add(i51.k(kVar.v));
                }
                for (int i47 = 0; i47 < arrayList24.size(); i47++) {
                    final String str3 = (String) arrayList24.get(i47);
                    if (i47 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i47 == arrayList24.size() - 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.t tVar = kVar.J;
                                    if (tVar != null) {
                                        tVar.run(str3);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.t tVar2 = kVar.J;
                                    if (tVar2 != null) {
                                        tVar2.run(str3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    int i48 = org.telegram.ui.web.d.f39468a;
                    i51 J9 = i51.J(org.telegram.ui.web.d.class);
                    J9.f25578z = 1;
                    J9.f25565l = str3;
                    J9.D = onClickListener;
                    J9.f25570q = z13;
                    J9.f25571r = z14;
                    J9.G = Boolean.TRUE;
                    J9.H = kVar;
                    arrayList23.add(J9);
                }
                if (!arrayList25.isEmpty()) {
                    arrayList23.add(i51.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new oh.n(kVar, 5)));
                    for (int i49 = 0; i49 < arrayList25.size(); i49++) {
                        final String str4 = (String) arrayList25.get(i49);
                        if (i49 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i49 == arrayList25.size() - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (r3) {
                                    case 0:
                                        org.telegram.ui.t tVar = kVar.J;
                                        if (tVar != null) {
                                            tVar.run(str4);
                                            return;
                                        }
                                        return;
                                    default:
                                        org.telegram.ui.t tVar2 = kVar.J;
                                        if (tVar2 != null) {
                                            tVar2.run(str4);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        int i50 = org.telegram.ui.web.d.f39468a;
                        i51 J10 = i51.J(org.telegram.ui.web.d.class);
                        J10.f25578z = 0;
                        J10.f25565l = str4;
                        J10.D = onClickListener2;
                        J10.f25570q = z11;
                        J10.f25571r = z12;
                        J10.G = Boolean.TRUE;
                        J10.H = kVar;
                        arrayList23.add(J10);
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList27 = iVar.f39526a;
                    if (!arrayList27.isEmpty()) {
                        arrayList23.add(i51.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i51 = 0; i51 < arrayList27.size(); i51++) {
                            MessageObject messageObject = (MessageObject) arrayList27.get(i51);
                            if (!TextUtils.isEmpty(org.telegram.ui.web.k.a(messageObject))) {
                                int i52 = org.telegram.ui.web.g.f39501a;
                                i51 J11 = i51.J(org.telegram.ui.web.g.class);
                                J11.f25578z = 3;
                                J11.f25570q = true;
                                J11.H = messageObject;
                                arrayList23.add(J11);
                            }
                        }
                        if (!iVar.f39529f) {
                            arrayList23.add(i51.o(arrayList23.size(), 32));
                            arrayList23.add(i51.o(arrayList23.size(), 32));
                            arrayList23.add(i51.o(arrayList23.size(), 32));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ph.k kVar2 = (ph.k) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = kVar2.F;
                RectF rectF = kVar2.f41830w0;
                ph.f fVar2 = kVar2.f41809f;
                if (kVar2.g()) {
                    if (kVar2.D == null) {
                        runnable.run();
                        return;
                    }
                    canvas.translate(-fVar2.getEditText().hintLayoutX, 0.0f);
                    canvas.saveLayerAlpha(0.0f, 0.0f, kVar2.D.getWidth(), kVar2.D.getHeight(), 255, 31);
                    rectF.set(0.0f, 1.0f, kVar2.D.getWidth(), kVar2.D.getHeight() - 1);
                    kVar2.h(kVar2.M, canvas, rectF, 0.0f, true, (-fVar2.getX()) - editText.getPaddingLeft(), ((-fVar2.getY()) - editText.getPaddingTop()) - editText.getExtendedPaddingTop(), true);
                    canvas.save();
                    paint.setAlpha(165);
                    canvas.drawBitmap(kVar2.D, 0.0f, 0.0f, paint);
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                Paint c3 = kVar2.M.c(1.0f);
                vt editText2 = fVar2.getEditText();
                if (c3 == null) {
                    i15 = -2130706433;
                }
                editText2.setHintColor(i15);
                if (c3 == null) {
                    runnable.run();
                    return;
                }
                vt editText3 = fVar2.getEditText();
                canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
                runnable.run();
                canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c3);
                canvas.restore();
                return;
            case 27:
                ph.i1 i1Var = (ph.i1) obj3;
                String str5 = (String) obj;
                ph.y1 y1Var = i1Var.f41737r;
                y1Var.f42603b = str5;
                y1Var.f42604c = ((Integer) obj2).intValue();
                i1Var.f41734c.H(str5);
                return;
            default:
                ph.o1 o1Var = (ph.o1) obj3;
                String str6 = (String) obj;
                ph.y1 y1Var2 = o1Var.f42043s;
                y1Var2.f42603b = str6;
                y1Var2.f42604c = ((Integer) obj2).intValue();
                o1Var.f42039c.D(str6);
                return;
        }
    }
}
