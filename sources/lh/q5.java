package lh;

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
import mh.l7;
import mh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xt;
public final class q5 extends sa {
    public static final int f12906h0 = 0;
    public final String U;
    public final p5 V;
    public final HorizontalScrollView W;
    public final s4 X;
    public final s4 Y;
    public final s4 Z;
    public final s4 f12907a0;
    public final mh.q3 f12908b0;
    public mh.m1 f12909c0;
    public final HashSet f12910d0;
    public boolean f12911e0;
    public o5 f12912f0;
    public boolean f12913g0;

    public q5(final Context context, String str, final p5 p5Var) {
        super(context, null, false, false, false, 2, null);
        this.f12910d0 = new HashSet();
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.U = str;
        this.V = p5Var;
        this.f31015e.setTitle(y());
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
        s4 s4Var = new s4(context, this.resourcesProvider);
        this.X = s4Var;
        s4Var.setSorting(p5Var.f12896c.f12631p);
        linearLayout.addView(s4Var, k7.c6.t(-2, -2, 16, 0, 0, 6, 0));
        s4Var.setOnClickListener(new dg.n(15, this, p5Var));
        s4 s4Var2 = new s4(context, this.resourcesProvider);
        this.Y = s4Var2;
        s4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(s4Var2, k7.c6.t(-2, -2, 16, 0, 0, 6, 0));
        s4Var2.setOnClickListener(new View.OnClickListener(this) {
            public final q5 f12825b;

            {
                this.f12825b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        q5.R(this.f12825b, p5Var, context);
                        return;
                    case 1:
                        q5.W(this.f12825b, p5Var, context);
                        return;
                    default:
                        q5.S(this.f12825b, p5Var, context);
                        return;
                }
            }
        });
        s4 s4Var3 = new s4(context, this.resourcesProvider);
        this.Z = s4Var3;
        s4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(s4Var3, k7.c6.t(-2, -2, 16, 0, 0, 6, 0));
        s4Var3.setOnClickListener(new View.OnClickListener(this) {
            public final q5 f12825b;

            {
                this.f12825b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        q5.R(this.f12825b, p5Var, context);
                        return;
                    case 1:
                        q5.W(this.f12825b, p5Var, context);
                        return;
                    default:
                        q5.S(this.f12825b, p5Var, context);
                        return;
                }
            }
        });
        s4 s4Var4 = new s4(context, this.resourcesProvider);
        this.f12907a0 = s4Var4;
        s4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(s4Var4, k7.c6.t(-2, -2, 16, 0, 0, 0, 0));
        s4Var4.setOnClickListener(new View.OnClickListener(this) {
            public final q5 f12825b;

            {
                this.f12825b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        q5.R(this.f12825b, p5Var, context);
                        return;
                    case 1:
                        q5.W(this.f12825b, p5Var, context);
                        return;
                    default:
                        q5.S(this.f12825b, p5Var, context);
                        return;
                }
            }
        });
        getContext();
        f2.w wVar = new f2.w(3);
        wVar.O = new n5(this, 0);
        this.d.setLayoutManager(wVar);
        this.d.setOnItemClickListener(new c1.b(26, this, p5Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new fg.e2(this, 5));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setItemSelectorColorProvider(new k3.e(26));
        mh.q3 q3Var = new mh.q3(context);
        this.f12908b0 = q3Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        q3Var.h = dp;
        q3Var.f14629n = dp2;
        q3Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        q3Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new dg.h0(q3Var, 20), 12.0f, 12, null, new ArrayList());
        q3Var.setPivotY(0.0f);
        this.container.addView(q3Var, k7.c6.e(-1, -2, 55));
        this.f12912f0.N(false);
        p5Var.d = new f5(this, 1);
    }

    public static void P(q5 q5Var, p5 p5Var) {
        q70 F = q70.F(q5Var.container, q5Var.resourcesProvider, q5Var.X);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(a5.BY_PRICE.f12598a), new e5(p5Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(a5.BY_DATE.f12598a), new e5(p5Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(a5.BY_NUMBER.f12598a), new e5(p5Var, 5), false);
        F.f30330t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(q5 q5Var, p5 p5Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        mf.b bVar;
        j51 G = q5Var.f12912f0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z4 = G.f28020r;
                if (!TextUtils.isEmpty(starGift.gift_address) && q5Var.f12911e0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q5Var.getContext(), 0, q5Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    l.d.C(R.string.OK, alertDialog$Builder, null);
                } else if (z4 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(q5Var.getContext(), 3, null);
                    d2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(q5Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = mf.b.f13652b;
                    } else {
                        bVar = mf.b.f13651a;
                    }
                    mf.b bVar2 = bVar;
                    t7.x(q5Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new h5(q5Var, d2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z4) {
                        ArrayList arrayList = p5Var.f12895b.f14405l;
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
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(q5Var.currentAccount).getCurrentTime()) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q5Var.getContext());
                            String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.f21166a;
                            d2Var3.O = string2;
                            d2Var3.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            l.d.C(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    q5Var.f12909c0.run(starGift);
                    q5Var.dismiss();
                }
            }
        }
    }

    public static void R(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.f12896c;
        if (b5Var.f12622f.isEmpty()) {
            return;
        }
        q70 q70Var = new q70(q5Var.container, q5Var.resourcesProvider, q5Var.Y, false, true, false);
        q70Var.f30330t = false;
        q70Var.Y = true;
        q70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        q70Var.R = true;
        q70Var.f30324p = new g3(q70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f12622f);
        Collections.sort(arrayList, new g5(p5Var, 2));
        i61 i61Var = new i61(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, 0), new d5(p5Var, q70Var, 0), null, q5Var.resourcesProvider);
        i61Var.V2.f32957r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(k6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.c6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xt xtVar = new xt(context, q5Var.resourcesProvider);
        xtVar.setTextSize(1, 16.0f);
        xtVar.setInputType(573441);
        xtVar.setRawInputType(573441);
        xtVar.setHintTextColor(k6.v0(k6.A6, q5Var.resourcesProvider));
        xtVar.setCursorColor(k6.v0(k6.G6, q5Var.resourcesProvider));
        xtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        xtVar.setCursorWidth(1.5f);
        xtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        xtVar.setTextColor(k6.v0(k6.E8, q5Var.resourcesProvider));
        xtVar.setBackground(null);
        frameLayout.addView(xtVar, k7.c6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xtVar.addTextChangedListener(new dg.b0(4, strArr, i61Var));
        if (arrayList.size() > 8) {
            q70Var.r(frameLayout, k7.c6.n(-1, 44));
            q70Var.k();
        }
        if (!b5Var.f12625j.isEmpty()) {
            q70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 0), false);
        }
        q70Var.q(i61Var);
        q70Var.Z();
    }

    public static void S(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.f12896c;
        if (b5Var.h.isEmpty()) {
            return;
        }
        q70 q70Var = new q70(q5Var.container, q5Var.resourcesProvider, q5Var.f12907a0, false, true, false);
        q70Var.f30330t = false;
        q70Var.Y = true;
        q70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        q70Var.R = true;
        q70Var.f30324p = new g3(q70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.h);
        Collections.sort(arrayList, new g5(p5Var, 1));
        i61 i61Var = new i61(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, 2), new d5(p5Var, q70Var, 2), null, q5Var.resourcesProvider);
        i61Var.V2.f32957r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(k6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.c6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xt xtVar = new xt(context, q5Var.resourcesProvider);
        xtVar.setTextSize(1, 16.0f);
        xtVar.setInputType(573441);
        xtVar.setRawInputType(573441);
        xtVar.setHintTextColor(k6.v0(k6.A6, q5Var.resourcesProvider));
        xtVar.setCursorColor(k6.v0(k6.G6, q5Var.resourcesProvider));
        xtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        xtVar.setCursorWidth(1.5f);
        xtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        xtVar.setTextColor(k6.v0(k6.E8, q5Var.resourcesProvider));
        xtVar.setBackground(null);
        frameLayout.addView(xtVar, k7.c6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xtVar.addTextChangedListener(new dg.b0(6, strArr, i61Var));
        if (arrayList.size() > 8) {
            q70Var.r(frameLayout, k7.c6.n(-1, 44));
            q70Var.k();
        }
        if (!b5Var.f12627l.isEmpty()) {
            q70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 2), false);
        }
        q70Var.q(i61Var);
        q70Var.Z();
    }

    public static void T(q5 q5Var, ArrayList arrayList) {
        boolean z4;
        p5 p5Var = q5Var.V;
        if (p5Var != null) {
            l7 l7Var = p5Var.f12895b;
            b5 b5Var = p5Var.f12896c;
            if (l7Var != null && b5Var != null) {
                int currentTime = ConnectionsManager.getInstance(q5Var.currentAccount).getCurrentTime();
                arrayList.add(j51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = l7Var.f14405l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z10 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!q5Var.f12910d0.contains(Long.valueOf(savedStarGift.gift.f21070id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        j51 a2 = w1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f28010g = z4;
                        arrayList.add(a2);
                        i11++;
                        z10 = false;
                    }
                }
                if (!l7Var.f14402i && l7Var.f14403j) {
                    if (z10) {
                        arrayList.add(j51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        j51 o10 = j51.o((i15 - i13) + 1, 35);
                        o10.f28023u = 1;
                        arrayList.add(o10);
                    }
                }
                if (b5Var.f12621e > 0 || q5Var.f12913g0) {
                    q5Var.f12913g0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    j51 j51Var = new j51(42);
                    j51Var.d = -2;
                    j51Var.f28017o = string;
                    arrayList.add(j51Var);
                    HorizontalScrollView horizontalScrollView = q5Var.W;
                    if (horizontalScrollView != null) {
                        arrayList.add(j51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = b5Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(w1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (b5Var.f12635t || !b5Var.f12636u) {
                        j51 o11 = j51.o(10, 35);
                        o11.f28023u = 1;
                        arrayList.add(o11);
                        j51 o12 = j51.o(11, 35);
                        o12.f28023u = 1;
                        arrayList.add(o12);
                        j51 o13 = j51.o(12, 35);
                        o13.f28023u = 1;
                        arrayList.add(o13);
                        j51 o14 = j51.o(13, 35);
                        o14.f28023u = 1;
                        arrayList.add(o14);
                        j51 o15 = j51.o(14, 35);
                        o15.f28023u = 1;
                        arrayList.add(o15);
                        j51 o16 = j51.o(15, 35);
                        o16.f28023u = 1;
                        arrayList.add(o16);
                    }
                }
            }
        }
    }

    public static void U(q5 q5Var, org.telegram.ui.ActionBar.d2 d2Var, mf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        d2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        mh.i4 i4Var = new mh.i4(bVar, tL_payments_paymentFormStarGift);
        Context context = q5Var.getContext();
        g6 g6Var = q5Var.resourcesProvider;
        int i10 = q5Var.currentAccount;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        new mh.k4(context, g6Var, tL_starGiftUnique, i4Var, i10, j10, l.d.l(tL_starGiftUnique.num, ',', sb), true, new i5(q5Var, tL_starGiftUnique, j10, 0)).b();
    }

    public static void V(q5 q5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, mh.i4 i4Var, af.f fVar) {
        fVar.d();
        t7.x(q5Var.currentAccount, i4Var.f14231a).h(i4Var.f14232b, tL_starGiftUnique, j10, null, true, new a0(q5Var, fVar, tL_starGiftUnique, 1));
    }

    public static void W(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.f12896c;
        if (b5Var.f12623g.isEmpty()) {
            return;
        }
        q70 q70Var = new q70(q5Var.container, q5Var.resourcesProvider, q5Var.Z, false, true, false);
        q70Var.f30330t = false;
        q70Var.Y = true;
        q70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        q70Var.R = true;
        q70Var.f30324p = new g3(q70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f12623g);
        Collections.sort(arrayList, new g5(p5Var, 0));
        i61 i61Var = new i61(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, 1), new d5(p5Var, q70Var, 1), null, q5Var.resourcesProvider);
        i61Var.V2.f32957r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(k6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.c6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xt xtVar = new xt(context, q5Var.resourcesProvider);
        xtVar.setTextSize(1, 16.0f);
        xtVar.setInputType(573441);
        xtVar.setRawInputType(573441);
        xtVar.setHintTextColor(k6.v0(k6.A6, q5Var.resourcesProvider));
        xtVar.setCursorColor(k6.v0(k6.G6, q5Var.resourcesProvider));
        xtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        xtVar.setCursorWidth(1.5f);
        xtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        xtVar.setTextColor(k6.v0(k6.E8, q5Var.resourcesProvider));
        xtVar.setBackground(null);
        frameLayout.addView(xtVar, k7.c6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xtVar.addTextChangedListener(new dg.b0(5, strArr, i61Var));
        if (arrayList.size() > 8) {
            q70Var.r(frameLayout, k7.c6.n(-1, 44));
            q70Var.k();
        }
        if (!b5Var.f12626k.isEmpty()) {
            q70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 1), false);
        }
        q70Var.q(i61Var);
        q70Var.Z();
    }

    @Override
    public final void E(float f10) {
        float y10 = this.containerView.getY() + f10;
        mh.q3 q3Var = this.f12908b0;
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
        j51 G;
        int i10 = 0;
        boolean z4 = false;
        boolean z10 = false;
        while (true) {
            tl0 tl0Var = this.d;
            if (i10 >= tl0Var.getChildCount()) {
                break;
            }
            View childAt = tl0Var.getChildAt(i10);
            if ((childAt instanceof u00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f12912f0.G(R)) != null) {
                if (G.d < 10) {
                    z4 = true;
                } else {
                    z10 = true;
                }
            }
            i10++;
        }
        p5 p5Var = this.V;
        if (z4) {
            p5Var.f12895b.a();
        }
        if (z10) {
            p5Var.f12896c.g(false);
        }
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        o5 o5Var = new o5(this, tl0Var, getContext(), this.currentAccount, new eg.p1(this, 13), this.resourcesProvider);
        this.f12912f0 = o5Var;
        return o5Var;
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
