package ch;

import ag.q0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import cg.i2;
import f2.r;
import gh.a2;
import gh.i0;
import gh.i5;
import gh.k2;
import gh.o4;
import gh.p0;
import gh.r2;
import gh.t3;
import gh.v;
import gh.x5;
import gh.y3;
import gh.y5;
import gh.z3;
import hh.c0;
import hh.e0;
import hh.ea;
import hh.fa;
import hh.g0;
import hh.g1;
import hh.i1;
import hh.ia;
import hh.l1;
import hh.la;
import hh.m7;
import hh.o0;
import hh.oa;
import hh.u7;
import hh.x9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kh.s;
import kh.u;
import lh.f6;
import lh.l2;
import lh.m;
import lh.u1;
import lh.z1;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.c91;
import org.telegram.ui.df;

public final class c implements Utilities.Callback2 {

    public final int f2904a;

    public final Object f2905b;

    public c(Object obj, int i10) {
        this.f2904a = i10;
        this.f2905b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        Utilities.Callback callback;
        int i11 = this.f2904a;
        int i12 = 8;
        int i13 = 17;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        Object obj3 = this.f2905b;
        switch (i11) {
            case 0:
                h hVar = (h) obj3;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = hVar.W;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int iDp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int iDp2 = AndroidUtilities.dp(88.0f) + hVar.f2923h0;
                    arrayList.add(n41.D(0, iDp2));
                    int iDp3 = iDp - iDp2;
                    int size = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj4 = arrayList2.get(i20);
                        i20++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hVar.V.get((String) obj4)) {
                            if (TextUtils.isEmpty(hVar.Y) || i2.U(tL_help_country, AndroidUtilities.translitSafe(hVar.Y).toLowerCase())) {
                                iDp3 -= AndroidUtilities.dp(44.0f);
                                boolean zContainsKey = hVar.f2921f0.containsKey(tL_help_country.iso2);
                                int i21 = g.f2914a;
                                n41 n41VarJ = n41.J(g.class);
                                n41VarJ.f30844l = tL_help_country.iso2;
                                n41VarJ.G = tL_help_country;
                                n41VarJ.f30838e = zContainsKey;
                                arrayList.add(n41VarJ);
                            }
                        }
                    }
                    arrayList.add(n41.D(1, Math.max(0, iDp3)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                c91 c91Var = ((i) obj3).U;
                if (c91Var != null) {
                    arrayList3.add(n41.C(AndroidUtilities.dp(12.0f)));
                    arrayList3.add(n41.h(0, 0, c91Var));
                }
                break;
            case 2:
                ((df) obj3).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 3:
                gh.d dVar = (gh.d) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.T;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = dVar.U;
                        q0 q0Var = new q0(i12, dVar, tL_StarGiftAuctionAcquiredGift);
                        int i22 = gh.b.f7142a;
                        n41 n41VarJ2 = n41.J(gh.b.class);
                        n41VarJ2.G = tL_StarGiftAuctionAcquiredGift;
                        n41VarJ2.H = auction;
                        n41VarJ2.D = q0Var;
                        arrayList4.add(n41VarJ2);
                    }
                    arrayList4.add(n41.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 4:
                ((ArrayList) obj).add(((gh.f) obj3).T);
                break;
            case 5:
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(((v) obj3).U);
                arrayList5.add(n41.C(AndroidUtilities.dp(16.0f)));
                break;
            case 6:
                ((ArrayList) obj).add(n41.j(-1, ((i0) obj3).V));
                break;
            case 7:
                ((ArrayList) obj).add(n41.j(-1, ((p0) obj3).V));
                break;
            case 8:
                ((k2) obj3).U((ArrayList) obj, (b51) obj2);
                break;
            case 9:
                t3 t3Var = (t3) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                wq0 wq0Var = t3Var.f7533a;
                m7 m7Var = t3Var.f7536e;
                if (m7Var != null) {
                    if ((!m7Var.f9747e || m7Var.f9749g != 783) && m7Var.f9753l.size() <= 0) {
                        m7 m7Var2 = t3Var.f7536e;
                        if (m7Var2.f9751j && !m7Var2.f9750i) {
                        }
                    }
                    m7 m7Var3 = t3Var.f7536e;
                    int iMax = Math.max(1, (m7Var3 == null || (i10 = m7Var3.f9755n) == 0) ? 3 : Math.min(3, i10));
                    m7 m7Var4 = t3Var.f7536e;
                    if (m7Var4 != null) {
                        ArrayList arrayList7 = m7Var4.f9753l;
                        int size2 = arrayList7.size();
                        int i23 = 0;
                        int i24 = 3;
                        while (i23 < size2) {
                            Object obj5 = arrayList7.get(i23);
                            i23++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                            boolean z11 = t3Var.d;
                            int i25 = a2.f7134a;
                            n41 n41VarJ3 = n41.J(a2.class);
                            n41VarJ3.f30853u = 1;
                            n41VarJ3.f30857z = 0;
                            n41VarJ3.G = savedStarGift;
                            n41VarJ3.f30849q = true;
                            n41VarJ3.f30839f = false;
                            n41VarJ3.f30850r = z11;
                            n41VarJ3.h = t3Var.f7538n && (t3Var.f7536e != wq0Var.d || savedStarGift.pinned_to_top);
                            arrayList6.add(n41VarJ3);
                            i24--;
                            if (i24 == 0) {
                                i24 = 3;
                            }
                        }
                        m7 m7Var5 = t3Var.f7536e;
                        if (m7Var5.f9750i || !m7Var5.f9751j) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < (i24 <= 0 ? 3 : i24)) {
                                    i26++;
                                    n41 n41VarO = n41.o(i26, 34);
                                    n41VarO.f30853u = 1;
                                    arrayList6.add(n41VarO);
                                }
                            }
                        }
                    }
                    if (wq0Var.d == t3Var.f7536e) {
                        arrayList6.add(n41.C(AndroidUtilities.dp(20.0f)));
                        if (wq0Var.f7199c == UserConfig.getInstance(t3Var.f7534b).getClientUserId()) {
                            int iV0 = g6.v0(g6.f23441z6, t3Var.f7535c);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int iDp4 = AndroidUtilities.dp(24.0f);
                            int i27 = z3.f7700a;
                            n41 n41VarJ4 = n41.J(z3.class);
                            n41VarJ4.f30844l = string;
                            n41VarJ4.f30857z = 17;
                            n41VarJ4.B = iV0;
                            n41VarJ4.A = 14.0f;
                            n41VarJ4.f30841i = iDp4;
                            n41VarJ4.f30843k = 0;
                            n41VarJ4.f30849q = false;
                            arrayList6.add(n41VarJ4);
                        }
                        arrayList6.add(n41.C(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList6.isEmpty()) {
                        arrayList6.add(n41.C(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList6.add(0, n41.C(AndroidUtilities.dp(t3Var.E ? 42.0f : 12.0f)));
                    }
                    if (t3Var.f7537f.getSpanCount() != iMax) {
                        AndroidUtilities.runOnUIThread(new r2(t3Var, iMax, i19));
                    }
                    wq0Var.o();
                    wq0Var.post(new r(wq0Var, 10));
                    break;
                }
                break;
            case 10:
                y3 y3Var = (y3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                m7 m7Var6 = y3Var.U;
                if (m7Var6 != null) {
                    ArrayList arrayList9 = m7Var6.f9753l;
                    arrayList8.add(n41.C(AndroidUtilities.dp(16.0f)));
                    if (m7Var6.f9750i && arrayList9.isEmpty()) {
                        n41 n41VarO2 = n41.o(1, 34);
                        n41VarO2.f30853u = 1;
                        arrayList8.add(n41VarO2);
                        n41 n41VarO3 = n41.o(2, 34);
                        n41VarO3.f30853u = 1;
                        arrayList8.add(n41VarO3);
                        n41 n41VarO4 = n41.o(3, 34);
                        n41VarO4.f30853u = 1;
                        arrayList8.add(n41VarO4);
                        n41 n41VarO5 = n41.o(4, 34);
                        n41VarO5.f30853u = 1;
                        arrayList8.add(n41VarO5);
                        n41 n41VarO6 = n41.o(5, 34);
                        n41VarO6.f30853u = 1;
                        arrayList8.add(n41VarO6);
                        n41 n41VarO7 = n41.o(6, 34);
                        n41VarO7.f30853u = 1;
                        arrayList8.add(n41VarO7);
                        n41 n41VarO8 = n41.o(7, 34);
                        n41VarO8.f30853u = 1;
                        arrayList8.add(n41VarO8);
                        n41 n41VarO9 = n41.o(8, 34);
                        n41VarO9.f30853u = 1;
                        arrayList8.add(n41VarO9);
                        n41 n41VarO10 = n41.o(9, 34);
                        n41VarO10.f30853u = 1;
                        arrayList8.add(n41VarO10);
                    } else {
                        int size3 = arrayList9.size();
                        int i28 = 3;
                        int i29 = 0;
                        while (i29 < size3) {
                            Object obj6 = arrayList9.get(i29);
                            i29++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(y3Var.T))) {
                                int i30 = a2.f7134a;
                                n41 n41VarJ5 = n41.J(a2.class);
                                n41VarJ5.f30853u = 1;
                                n41VarJ5.f30857z = z10 ? 1 : 0;
                                n41VarJ5.G = savedStarGift2;
                                n41VarJ5.f30849q = true;
                                n41VarJ5.f30839f = true;
                                n41VarJ5.f30850r = z10;
                                HashSet hashSet = y3Var.V;
                                int i31 = savedStarGift2.msg_id;
                                ArrayList arrayList10 = arrayList9;
                                n41VarJ5.K(hashSet.contains(Long.valueOf(i31 == 0 ? savedStarGift2.saved_id : i31)));
                                n41VarJ5.f30853u = 1;
                                arrayList8.add(n41VarJ5);
                                i28--;
                                if (i28 == 0) {
                                    i28 = 3;
                                }
                                arrayList9 = arrayList10;
                                z10 = false;
                            }
                        }
                        if (m7Var6.f9750i || !m7Var6.f9751j) {
                            int i32 = 0;
                            while (true) {
                                if (i32 < (i28 <= 0 ? 3 : i28)) {
                                    i32++;
                                    n41 n41VarO11 = n41.o(i32, 34);
                                    n41VarO11.f30853u = 1;
                                    arrayList8.add(n41VarO11);
                                }
                            }
                        }
                    }
                    arrayList8.add(n41.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 11:
                y5 y5Var = (y5) obj3;
                ArrayList arrayList11 = (ArrayList) obj;
                i5 i5Var = y5Var.d;
                ArrayList arrayList12 = i5Var.d;
                int size4 = arrayList12.size();
                int i33 = 0;
                while (i33 < size4) {
                    Object obj7 = arrayList12.get(i33);
                    i33++;
                    arrayList11.add(a2.a(0, (TL_stars.TL_starGiftUnique) obj7, false, false, false, true, false));
                }
                if (i5Var.f7340t || !i5Var.f7341u) {
                    n41 n41VarO12 = n41.o(-1, 34);
                    n41VarO12.f30853u = 1;
                    arrayList11.add(n41VarO12);
                    n41 n41VarO13 = n41.o(-2, 34);
                    n41VarO13.f30853u = 1;
                    arrayList11.add(n41VarO13);
                    n41 n41VarO14 = n41.o(-3, 34);
                    n41VarO14.f30853u = 1;
                    arrayList11.add(n41VarO14);
                    if (i5Var.d.isEmpty()) {
                        n41 n41VarO15 = n41.o(-4, 34);
                        n41VarO15.f30853u = 1;
                        arrayList11.add(n41VarO15);
                        n41 n41VarO16 = n41.o(-5, 34);
                        n41VarO16.f30853u = 1;
                        arrayList11.add(n41VarO16);
                        n41 n41VarO17 = n41.o(-6, 34);
                        n41VarO17.f30853u = 1;
                        arrayList11.add(n41VarO17);
                        n41 n41VarO18 = n41.o(-7, 34);
                        n41VarO18.f30853u = 1;
                        arrayList11.add(n41VarO18);
                        n41 n41VarO19 = n41.o(-8, 34);
                        n41VarO19.f30853u = 1;
                        arrayList11.add(n41VarO19);
                        n41 n41VarO20 = n41.o(-9, 34);
                        n41VarO20.f30853u = 1;
                        arrayList11.add(n41VarO20);
                        n41 n41VarO21 = n41.o(-10, 34);
                        n41VarO21.f30853u = 1;
                        arrayList11.add(n41VarO21);
                        n41 n41VarO22 = n41.o(-11, 34);
                        n41VarO22.f30853u = 1;
                        arrayList11.add(n41VarO22);
                        n41 n41VarO23 = n41.o(-12, 34);
                        n41VarO23.f30853u = 1;
                        arrayList11.add(n41VarO23);
                        n41 n41VarO24 = n41.o(-13, 34);
                        n41VarO24.f30853u = 1;
                        arrayList11.add(n41VarO24);
                        n41 n41VarO25 = n41.o(-14, 34);
                        n41VarO25.f30853u = 1;
                        arrayList11.add(n41VarO25);
                        n41 n41VarO26 = n41.o(-15, 34);
                        n41VarO26.f30853u = 1;
                        arrayList11.add(n41VarO26);
                    }
                }
                boolean z12 = arrayList11.isEmpty() && !i5Var.f7340t;
                if (y5Var.f7689x != z12) {
                    y5Var.f7689x = z12;
                    y5Var.f7688w.setVisibility(0);
                    y5Var.f7688w.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.95f).scaleY(z12 ? 1.0f : 0.95f).setInterpolator(er.h).setDuration(320L).setListener(new o4(y5Var, z12, 1)).start();
                    break;
                }
                break;
            case 12:
                x5.T((x5) obj3, (ArrayList) obj);
                break;
            case 13:
                hh.r.Y((hh.r) obj3, (ArrayList) obj);
                break;
            case 14:
                g0 g0Var = (g0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                arrayList13.add(n41.k(g0Var.U));
                arrayList13.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList13.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new r(g0Var, i13)), true), R.drawable.msg_bot));
                arrayList13.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList13.add(e0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList13.add(n41.C(AndroidUtilities.dp(68.0f)));
                break;
            case 15:
                ArrayList arrayList14 = (ArrayList) obj;
                n41 n41Var = ((o0) obj3).f9813r0;
                if (n41Var != null) {
                    arrayList14.add(n41Var);
                }
                break;
            case 16:
                l1 l1Var = (l1) obj3;
                ArrayList arrayList15 = (ArrayList) obj;
                ArrayList arrayList16 = l1Var.Z;
                boolean z13 = l1Var.f9655s0;
                com.google.android.gms.common.api.internal.r rVar = l1Var.f9640c0;
                ArrayList arrayList17 = l1Var.X;
                ArrayList arrayList18 = l1Var.W;
                com.google.android.gms.common.api.internal.r rVar2 = l1Var.f9639b0;
                com.google.android.gms.common.api.internal.r rVar3 = l1Var.f9638a0;
                ArrayList arrayList19 = l1Var.Y;
                if (arrayList19 != null && arrayList18 != null && arrayList17 != null) {
                    arrayList15.add(n41.C(AndroidUtilities.dp(315.0f)));
                    rVar3.f3338a = 0;
                    rVar3.c();
                    rVar2.f3338a = 0;
                    rVar2.c();
                    rVar.f3338a = 0;
                    rVar.c();
                    int i34 = l1Var.f9643f0.f9573r;
                    if (i34 == 0) {
                        arrayList15.add(n41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList19.size()))));
                        int size5 = arrayList19.size();
                        int i35 = 0;
                        while (i35 < size5) {
                            Object obj8 = arrayList19.get(i35);
                            i35++;
                            arrayList15.add(i1.a(i34, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList16.isEmpty()) {
                            arrayList15.add(n41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList19.size()))));
                            int size6 = arrayList16.size();
                            while (i16 < size6) {
                                Object obj9 = arrayList16.get(i16);
                                i16++;
                                arrayList15.add(i1.a(i34, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                        }
                    } else if (i34 == 1) {
                        arrayList15.add(n41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList18.size()))));
                        int size7 = arrayList18.size();
                        while (i17 < size7) {
                            Object obj10 = arrayList18.get(i17);
                            i17++;
                            arrayList15.add(i1.a(i34, new g1((TL_stars.starGiftAttributeBackdrop) obj10, (TL_stars.starGiftAttributePattern) rVar2.c(), (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                    } else if (i34 == 2) {
                        arrayList15.add(n41.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList17.size()))));
                        int size8 = arrayList17.size();
                        while (i18 < size8) {
                            Object obj11 = arrayList17.get(i18);
                            i18++;
                            arrayList15.add(i1.a(i34, new g1((TL_stars.starGiftAttributeBackdrop) rVar3.c(), (TL_stars.starGiftAttributePattern) obj11, (TL_stars.starGiftAttributeModel) rVar.c())));
                        }
                    }
                    break;
                }
                break;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l10, bool);
                }
                break;
            case 18:
                ((oa) obj3).H0((ArrayList) obj, (b51) obj2);
                break;
            case 19:
                ((x9) obj3).R((ArrayList) obj, (b51) obj2);
                break;
            case 20:
                ((ea) obj3).R((ArrayList) obj, (b51) obj2);
                break;
            case 21:
                ((fa) obj3).R((ArrayList) obj, (b51) obj2);
                break;
            case 22:
                la laVar = (la) obj3;
                ArrayList arrayList20 = (ArrayList) obj;
                int i36 = laVar.f9690c;
                int i37 = laVar.d;
                long j10 = laVar.f9692f;
                if (j10 != 0) {
                    c0 c0VarG = c0.g(i36);
                    ArrayList arrayList21 = c0VarG.k(j10).f8983a[i37];
                    int size9 = arrayList21.size();
                    while (i15 < size9) {
                        Object obj12 = arrayList21.get(i15);
                        i15++;
                        int i38 = ia.f9496a;
                        n41 n41VarJ6 = n41.J(ia.class);
                        n41VarJ6.G = (TL_stars.StarsTransaction) obj12;
                        n41VarJ6.f30849q = true;
                        arrayList20.add(n41VarJ6);
                    }
                    if (!c0VarG.k(j10).f8986e[i37]) {
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                    }
                } else {
                    u7 u7VarY = u7.y(i36, laVar.f9691e);
                    ArrayList arrayList22 = u7VarY.f10165q[i37];
                    int size10 = arrayList22.size();
                    int i39 = 0;
                    while (i39 < size10) {
                        Object obj13 = arrayList22.get(i39);
                        i39++;
                        int i40 = ia.f9496a;
                        n41 n41VarJ7 = n41.J(ia.class);
                        n41VarJ7.G = (TL_stars.StarsTransaction) obj13;
                        n41VarJ7.f30849q = false;
                        arrayList20.add(n41VarJ7);
                    }
                    if (!u7VarY.f10169u[i37]) {
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                        arrayList20.add(n41.o(arrayList20.size(), 7));
                    }
                }
                break;
            case 23:
                ArrayList arrayList23 = (ArrayList) obj;
                ((u) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i14 < size11) {
                    TranslateController.Language language = languages.get(i14);
                    i14++;
                    int i41 = s.f15225a;
                    n41 n41VarJ8 = n41.J(s.class);
                    n41VarJ8.G = language;
                    arrayList23.add(n41VarJ8);
                }
                break;
            case 24:
                m mVar = (m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.E;
                RectF rectF = mVar.f16357v0;
                lh.g gVar = mVar.f16338f;
                if (!mVar.g()) {
                    Paint paintC = mVar.L.c(1.0f);
                    gVar.getEditText().setHintColor(paintC == null ? -2130706433 : -1);
                    if (paintC == null) {
                        runnable.run();
                    } else {
                        lt editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), paintC);
                        canvas.restore();
                    }
                } else if (mVar.C == null) {
                    runnable.run();
                } else {
                    lt editText2 = gVar.getEditText();
                    canvas.translate(-editText2.hintLayoutX, 0.0f);
                    canvas.saveLayerAlpha(0.0f, 0.0f, mVar.C.getWidth(), mVar.C.getHeight(), 255, 31);
                    rectF.set(0.0f, 1.0f, mVar.C.getWidth(), mVar.C.getHeight() - 1);
                    mVar.h(mVar.L, canvas, rectF, 0.0f, true, (-gVar.getX()) - editText2.getPaddingLeft(), ((-gVar.getY()) - editText2.getPaddingTop()) - editText2.getExtendedPaddingTop(), true);
                    canvas.save();
                    paint.setAlpha(165);
                    canvas.drawBitmap(mVar.C, 0.0f, 0.0f, paint);
                    canvas.restore();
                    canvas.restore();
                }
                break;
            case 25:
                u1 u1Var = (u1) obj3;
                String str = (String) obj;
                l2 l2Var = u1Var.f16901r;
                l2Var.f16285b = str;
                l2Var.f16286c = ((Integer) obj2).intValue();
                u1Var.f16897c.H(str);
                break;
            case 26:
                z1 z1Var = (z1) obj3;
                String str2 = (String) obj;
                l2 l2Var2 = z1Var.f17179s;
                l2Var2.f16285b = str2;
                l2Var2.f16286c = ((Integer) obj2).intValue();
                z1Var.f17174c.D(str2);
                break;
            case 27:
                lh.t3 t3Var2 = (lh.t3) obj3;
                if (obj == null) {
                    t3Var2.getClass();
                } else if (t3Var2.f16846e == null && (obj instanceof MediaController.PhotoEntry) && (callback = t3Var2.f16847f) != null) {
                    callback.run((MediaController.PhotoEntry) obj);
                }
                break;
            default:
                f6 f6Var = (f6) obj3;
                f6Var.d0(f6Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
        }
    }
}
