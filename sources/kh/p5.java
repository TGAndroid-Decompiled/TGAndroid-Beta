package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import lh.l7;
import lh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ut;
public final class p5 extends sa {
    public static final int f10859h0 = 0;
    public final String U;
    public final o5 V;
    public final HorizontalScrollView W;
    public final r4 X;
    public final r4 Y;
    public final r4 Z;
    public final r4 f10860a0;
    public final lh.q3 f10861b0;
    public lh.n1 f10862c0;
    public final HashSet f10863d0;
    public boolean f10864e0;
    public n5 f10865f0;
    public boolean f10866g0;

    public p5(final Context context, String str, final o5 o5Var) {
        super(context, null, false, false, false, 2, null);
        this.f10863d0 = new HashSet();
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.U = str;
        this.V = o5Var;
        this.e.setTitle(y());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.W = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        r4 r4Var = new r4(context, this.resourcesProvider);
        this.X = r4Var;
        r4Var.setSorting(o5Var.f10851c.f10592p);
        linearLayout.addView(r4Var, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        r4Var.setOnClickListener(new cg.n(15, this, o5Var));
        r4 r4Var2 = new r4(context, this.resourcesProvider);
        this.Y = r4Var2;
        r4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(r4Var2, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        r4Var2.setOnClickListener(new View.OnClickListener(this) {
            public final p5 f10781b;

            {
                this.f10781b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        p5.R(this.f10781b, o5Var, context);
                        return;
                    case 1:
                        p5.W(this.f10781b, o5Var, context);
                        return;
                    default:
                        p5.S(this.f10781b, o5Var, context);
                        return;
                }
            }
        });
        r4 r4Var3 = new r4(context, this.resourcesProvider);
        this.Z = r4Var3;
        r4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(r4Var3, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        r4Var3.setOnClickListener(new View.OnClickListener(this) {
            public final p5 f10781b;

            {
                this.f10781b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        p5.R(this.f10781b, o5Var, context);
                        return;
                    case 1:
                        p5.W(this.f10781b, o5Var, context);
                        return;
                    default:
                        p5.S(this.f10781b, o5Var, context);
                        return;
                }
            }
        });
        r4 r4Var4 = new r4(context, this.resourcesProvider);
        this.f10860a0 = r4Var4;
        r4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(r4Var4, k7.b6.t(-2, -2, 16, 0, 0, 0, 0));
        r4Var4.setOnClickListener(new View.OnClickListener(this) {
            public final p5 f10781b;

            {
                this.f10781b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        p5.R(this.f10781b, o5Var, context);
                        return;
                    case 1:
                        p5.W(this.f10781b, o5Var, context);
                        return;
                    default:
                        p5.S(this.f10781b, o5Var, context);
                        return;
                }
            }
        });
        getContext();
        f2.w wVar = new f2.w(3);
        wVar.O = new m5(this, 0);
        this.d.setLayoutManager(wVar);
        this.d.setOnItemClickListener(new c1.b(26, this, o5Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new eg.f2(this, 5));
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setItemSelectorColorProvider(new k3.e(12));
        lh.q3 q3Var = new lh.q3(context);
        this.f10861b0 = q3Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        q3Var.h = dp;
        q3Var.f12959n = dp2;
        q3Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        q3Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new cg.h0(q3Var, 20), 12.0f, 12, null, new ArrayList());
        q3Var.setPivotY(0.0f);
        this.container.addView(q3Var, k7.b6.e(-1, -2, 55));
        this.f10865f0.N(false);
        o5Var.d = new e5(this, 1);
    }

    public static void P(p5 p5Var, o5 o5Var) {
        p70 F = p70.F(p5Var.container, p5Var.resourcesProvider, p5Var.X);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(z4.BY_PRICE.f11086a), new d5(o5Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(z4.BY_DATE.f11086a), new d5(o5Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(z4.BY_NUMBER.f11086a), new d5(o5Var, 5), false);
        F.f27778t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(p5 p5Var, o5 o5Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        lf.b bVar;
        i51 G = p5Var.f10865f0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z4 = G.f25591r;
                if (!TextUtils.isEmpty(starGift.gift_address) && p5Var.f10864e0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5Var.getContext(), 0, p5Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    kf.k0.C(R.string.OK, alertDialog$Builder, null);
                } else if (z4 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(p5Var.getContext(), 3, null);
                    d2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(p5Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = lf.b.f12057b;
                    } else {
                        bVar = lf.b.f12056a;
                    }
                    lf.b bVar2 = bVar;
                    t7.x(p5Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new g5(p5Var, d2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z4) {
                        ArrayList arrayList = o5Var.f10850b.f12756l;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj2 = arrayList.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj2;
                                if (savedStarGift.gift == starGift) {
                                    break;
                                }
                            } else {
                                savedStarGift = null;
                                break;
                            }
                        }
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(p5Var.currentAccount).getCurrentTime()) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p5Var.getContext());
                            String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.f19478a;
                            d2Var3.O = string2;
                            d2Var3.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            kf.k0.C(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    p5Var.f10862c0.run(starGift);
                    p5Var.dismiss();
                }
            }
        }
    }

    public static void R(p5 p5Var, o5 o5Var, Context context) {
        a5 a5Var = o5Var.f10851c;
        if (a5Var.f10583f.isEmpty()) {
            return;
        }
        p70 p70Var = new p70(p5Var.container, p5Var.resourcesProvider, p5Var.Y, false, true, false);
        p70Var.f27778t = false;
        p70Var.Y = true;
        p70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        p70Var.R = true;
        p70Var.f27772p = new f3(p70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(a5Var.f10583f);
        Collections.sort(arrayList, new f5(o5Var, 2));
        g61 g61Var = new g61(context, p5Var.currentAccount, 0, false, new b5(strArr, o5Var, arrayList, 0), new c5(o5Var, p70Var, 0), null, p5Var.resourcesProvider);
        g61Var.V2.f30148r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(p5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ut utVar = new ut(context, p5Var.resourcesProvider);
        utVar.setTextSize(1, 16.0f);
        utVar.setInputType(573441);
        utVar.setRawInputType(573441);
        utVar.setHintTextColor(j6.v0(j6.A6, p5Var.resourcesProvider));
        utVar.setCursorColor(j6.v0(j6.G6, p5Var.resourcesProvider));
        utVar.setCursorSize(AndroidUtilities.dp(19.0f));
        utVar.setCursorWidth(1.5f);
        utVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        utVar.setTextColor(j6.v0(j6.E8, p5Var.resourcesProvider));
        utVar.setBackground(null);
        frameLayout.addView(utVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        utVar.addTextChangedListener(new cg.b0(4, strArr, g61Var));
        if (arrayList.size() > 8) {
            p70Var.r(frameLayout, k7.b6.n(-1, 44));
            p70Var.k();
        }
        if (!a5Var.f10586j.isEmpty()) {
            p70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new d5(o5Var, 0), false);
        }
        p70Var.q(g61Var);
        p70Var.Z();
    }

    public static void S(p5 p5Var, o5 o5Var, Context context) {
        a5 a5Var = o5Var.f10851c;
        if (a5Var.h.isEmpty()) {
            return;
        }
        p70 p70Var = new p70(p5Var.container, p5Var.resourcesProvider, p5Var.f10860a0, false, true, false);
        p70Var.f27778t = false;
        p70Var.Y = true;
        p70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        p70Var.R = true;
        p70Var.f27772p = new f3(p70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(a5Var.h);
        Collections.sort(arrayList, new f5(o5Var, 1));
        g61 g61Var = new g61(context, p5Var.currentAccount, 0, false, new b5(strArr, o5Var, arrayList, 2), new c5(o5Var, p70Var, 2), null, p5Var.resourcesProvider);
        g61Var.V2.f30148r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(p5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ut utVar = new ut(context, p5Var.resourcesProvider);
        utVar.setTextSize(1, 16.0f);
        utVar.setInputType(573441);
        utVar.setRawInputType(573441);
        utVar.setHintTextColor(j6.v0(j6.A6, p5Var.resourcesProvider));
        utVar.setCursorColor(j6.v0(j6.G6, p5Var.resourcesProvider));
        utVar.setCursorSize(AndroidUtilities.dp(19.0f));
        utVar.setCursorWidth(1.5f);
        utVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        utVar.setTextColor(j6.v0(j6.E8, p5Var.resourcesProvider));
        utVar.setBackground(null);
        frameLayout.addView(utVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        utVar.addTextChangedListener(new cg.b0(6, strArr, g61Var));
        if (arrayList.size() > 8) {
            p70Var.r(frameLayout, k7.b6.n(-1, 44));
            p70Var.k();
        }
        if (!a5Var.f10588l.isEmpty()) {
            p70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new d5(o5Var, 2), false);
        }
        p70Var.q(g61Var);
        p70Var.Z();
    }

    public static void T(p5 p5Var, ArrayList arrayList) {
        boolean z4;
        o5 o5Var = p5Var.V;
        if (o5Var != null) {
            l7 l7Var = o5Var.f10850b;
            a5 a5Var = o5Var.f10851c;
            if (l7Var != null && a5Var != null) {
                int currentTime = ConnectionsManager.getInstance(p5Var.currentAccount).getCurrentTime();
                arrayList.add(i51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = l7Var.f12756l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z10 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!p5Var.f10863d0.contains(Long.valueOf(savedStarGift.gift.f19384id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i51 a2 = w1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f25581g = z4;
                        arrayList.add(a2);
                        i11++;
                        z10 = false;
                    }
                }
                if (!l7Var.f12753i && l7Var.f12754j) {
                    if (z10) {
                        arrayList.add(i51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        i51 o10 = i51.o((i15 - i13) + 1, 35);
                        o10.f25594u = 1;
                        arrayList.add(o10);
                    }
                }
                if (a5Var.e > 0 || p5Var.f10866g0) {
                    p5Var.f10866g0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    i51 i51Var = new i51(42);
                    i51Var.d = -2;
                    i51Var.f25588o = string;
                    arrayList.add(i51Var);
                    HorizontalScrollView horizontalScrollView = p5Var.W;
                    if (horizontalScrollView != null) {
                        arrayList.add(i51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = a5Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(w1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (a5Var.f10596t || !a5Var.f10597u) {
                        i51 o11 = i51.o(10, 35);
                        o11.f25594u = 1;
                        arrayList.add(o11);
                        i51 o12 = i51.o(11, 35);
                        o12.f25594u = 1;
                        arrayList.add(o12);
                        i51 o13 = i51.o(12, 35);
                        o13.f25594u = 1;
                        arrayList.add(o13);
                        i51 o14 = i51.o(13, 35);
                        o14.f25594u = 1;
                        arrayList.add(o14);
                        i51 o15 = i51.o(14, 35);
                        o15.f25594u = 1;
                        arrayList.add(o15);
                        i51 o16 = i51.o(15, 35);
                        o16.f25594u = 1;
                        arrayList.add(o16);
                    }
                }
            }
        }
    }

    public static void U(p5 p5Var, org.telegram.ui.ActionBar.d2 d2Var, lf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        d2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        lh.i4 i4Var = new lh.i4(bVar, tL_payments_paymentFormStarGift);
        Context context = p5Var.getContext();
        f6 f6Var = p5Var.resourcesProvider;
        int i10 = p5Var.currentAccount;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        new lh.k4(context, f6Var, tL_starGiftUnique, i4Var, i10, j10, kf.k0.l(tL_starGiftUnique.num, ',', sb), true, new h5(p5Var, tL_starGiftUnique, j10, 0)).b();
    }

    public static void V(p5 p5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, lh.i4 i4Var, ze.c cVar) {
        cVar.d();
        t7.x(p5Var.currentAccount, i4Var.f12569a).h(i4Var.f12570b, tL_starGiftUnique, j10, null, true, new a0(p5Var, cVar, tL_starGiftUnique, 1));
    }

    public static void W(p5 p5Var, o5 o5Var, Context context) {
        a5 a5Var = o5Var.f10851c;
        if (a5Var.f10584g.isEmpty()) {
            return;
        }
        p70 p70Var = new p70(p5Var.container, p5Var.resourcesProvider, p5Var.Z, false, true, false);
        p70Var.f27778t = false;
        p70Var.Y = true;
        p70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        p70Var.R = true;
        p70Var.f27772p = new f3(p70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(a5Var.f10584g);
        Collections.sort(arrayList, new f5(o5Var, 0));
        g61 g61Var = new g61(context, p5Var.currentAccount, 0, false, new b5(strArr, o5Var, arrayList, 1), new c5(o5Var, p70Var, 1), null, p5Var.resourcesProvider);
        g61Var.V2.f30148r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(p5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ut utVar = new ut(context, p5Var.resourcesProvider);
        utVar.setTextSize(1, 16.0f);
        utVar.setInputType(573441);
        utVar.setRawInputType(573441);
        utVar.setHintTextColor(j6.v0(j6.A6, p5Var.resourcesProvider));
        utVar.setCursorColor(j6.v0(j6.G6, p5Var.resourcesProvider));
        utVar.setCursorSize(AndroidUtilities.dp(19.0f));
        utVar.setCursorWidth(1.5f);
        utVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        utVar.setTextColor(j6.v0(j6.E8, p5Var.resourcesProvider));
        utVar.setBackground(null);
        frameLayout.addView(utVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        utVar.addTextChangedListener(new cg.b0(5, strArr, g61Var));
        if (arrayList.size() > 8) {
            p70Var.r(frameLayout, k7.b6.n(-1, 44));
            p70Var.k();
        }
        if (!a5Var.f10587k.isEmpty()) {
            p70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new d5(o5Var, 1), false);
        }
        p70Var.q(g61Var);
        p70Var.Z();
    }

    @Override
    public final void E(float f10) {
        float y10 = this.containerView.getY() + f10;
        lh.q3 q3Var = this.f10861b0;
        float measuredHeight = y10 - q3Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / q3Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        q3Var.setScaleX(clamp01);
        q3Var.setScaleY(clamp01);
        q3Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        q3Var.setTranslationY(measuredHeight);
    }

    public final void Z() {
        int R;
        i51 G;
        int i10 = 0;
        boolean z4 = false;
        boolean z10 = false;
        while (true) {
            rl0 rl0Var = this.d;
            if (i10 >= rl0Var.getChildCount()) {
                break;
            }
            View childAt = rl0Var.getChildAt(i10);
            if ((childAt instanceof u00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f10865f0.G(R)) != null) {
                if (G.d < 10) {
                    z4 = true;
                } else {
                    z10 = true;
                }
            }
            i10++;
        }
        o5 o5Var = this.V;
        if (z4) {
            o5Var.f10850b.a();
        }
        if (z10) {
            o5Var.f10851c.g(false);
        }
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        n5 n5Var = new n5(this, rl0Var, getContext(), this.currentAccount, new dg.r1(this, 13), this.resourcesProvider);
        this.f10865f0 = n5Var;
        return n5Var;
    }

    @Override
    public final CharSequence y() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(R.string.GiftCraftSelectTitle);
    }
}
