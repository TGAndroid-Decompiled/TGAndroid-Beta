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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vt;
public final class q5 extends sa {
    public static final int f10763h0 = 0;
    public final String U;
    public final p5 V;
    public final HorizontalScrollView W;
    public final s4 X;
    public final s4 Y;
    public final s4 Z;
    public final s4 f10764a0;
    public final lh.q3 f10765b0;
    public lh.n1 f10766c0;
    public final HashSet f10767d0;
    public boolean f10768e0;
    public o5 f10769f0;
    public boolean f10770g0;

    public q5(final Context context, String str, final p5 p5Var) {
        super(context, null, false, false, false, 2, null);
        this.f10767d0 = new HashSet();
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.U = str;
        this.V = p5Var;
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
        s4 s4Var = new s4(context, this.resourcesProvider);
        this.X = s4Var;
        s4Var.setSorting(p5Var.f10752c.f10494p);
        linearLayout.addView(s4Var, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        s4Var.setOnClickListener(new cg.n(15, this, p5Var));
        s4 s4Var2 = new s4(context, this.resourcesProvider);
        this.Y = s4Var2;
        s4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(s4Var2, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        s4Var2.setOnClickListener(new View.OnClickListener(this) {
            public final q5 f10685b;

            {
                this.f10685b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        q5.R(this.f10685b, p5Var, context);
                        return;
                    case 1:
                        q5.W(this.f10685b, p5Var, context);
                        return;
                    default:
                        q5.S(this.f10685b, p5Var, context);
                        return;
                }
            }
        });
        s4 s4Var3 = new s4(context, this.resourcesProvider);
        this.Z = s4Var3;
        s4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(s4Var3, k7.b6.t(-2, -2, 16, 0, 0, 6, 0));
        s4Var3.setOnClickListener(new View.OnClickListener(this) {
            public final q5 f10685b;

            {
                this.f10685b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        q5.R(this.f10685b, p5Var, context);
                        return;
                    case 1:
                        q5.W(this.f10685b, p5Var, context);
                        return;
                    default:
                        q5.S(this.f10685b, p5Var, context);
                        return;
                }
            }
        });
        s4 s4Var4 = new s4(context, this.resourcesProvider);
        this.f10764a0 = s4Var4;
        s4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(s4Var4, k7.b6.t(-2, -2, 16, 0, 0, 0, 0));
        s4Var4.setOnClickListener(new View.OnClickListener(this) {
            public final q5 f10685b;

            {
                this.f10685b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        q5.R(this.f10685b, p5Var, context);
                        return;
                    case 1:
                        q5.W(this.f10685b, p5Var, context);
                        return;
                    default:
                        q5.S(this.f10685b, p5Var, context);
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
        this.d.setOnScrollListener(new eg.f2(this, 5));
        f2.l lVar = new f2.l();
        lVar.f5818m = false;
        lVar.C = false;
        lVar.o(nr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setItemSelectorColorProvider(new k3.e(11));
        lh.q3 q3Var = new lh.q3(context);
        this.f10765b0 = q3Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        q3Var.h = dp;
        q3Var.f12975n = dp2;
        q3Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        q3Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new cg.h0(q3Var, 20), 12.0f, 12, null, new ArrayList());
        q3Var.setPivotY(0.0f);
        this.container.addView(q3Var, k7.b6.e(-1, -2, 55));
        this.f10769f0.N(false);
        p5Var.d = new f5(this, 1);
    }

    public static void P(q5 q5Var, p5 p5Var) {
        o70 F = o70.F(q5Var.container, q5Var.resourcesProvider, q5Var.X);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(a5.BY_PRICE.f10467a), new e5(p5Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(a5.BY_DATE.f10467a), new e5(p5Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(a5.BY_NUMBER.f10467a), new e5(p5Var, 5), false);
        F.f27490t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(q5 q5Var, p5 p5Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        mf.b bVar;
        i51 G = q5Var.f10769f0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z4 = G.f25571r;
                if (!TextUtils.isEmpty(starGift.gift_address) && q5Var.f10768e0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q5Var.getContext(), 0, q5Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    a2.C(R.string.OK, alertDialog$Builder, null);
                } else if (z4 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(q5Var.getContext(), 3, null);
                    d2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(q5Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = mf.b.f13931b;
                    } else {
                        bVar = mf.b.f13930a;
                    }
                    mf.b bVar2 = bVar;
                    t7.x(q5Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new h5(q5Var, d2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z4) {
                        ArrayList arrayList = p5Var.f10751b.f12772l;
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
                            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.f19503a;
                            d2Var3.O = string2;
                            d2Var3.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            a2.C(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    q5Var.f10766c0.run(starGift);
                    q5Var.dismiss();
                }
            }
        }
    }

    public static void R(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.f10752c;
        if (b5Var.f10485f.isEmpty()) {
            return;
        }
        o70 o70Var = new o70(q5Var.container, q5Var.resourcesProvider, q5Var.Y, false, true, false);
        o70Var.f27490t = false;
        o70Var.Y = true;
        o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        o70Var.R = true;
        o70Var.f27484p = new g3(o70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f10485f);
        Collections.sort(arrayList, new g5(p5Var, 2));
        g61 g61Var = new g61(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, 0), new d5(p5Var, o70Var, 0), null, q5Var.resourcesProvider);
        g61Var.V2.f30240r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        vt vtVar = new vt(context, q5Var.resourcesProvider);
        vtVar.setTextSize(1, 16.0f);
        vtVar.setInputType(573441);
        vtVar.setRawInputType(573441);
        vtVar.setHintTextColor(j6.v0(j6.A6, q5Var.resourcesProvider));
        vtVar.setCursorColor(j6.v0(j6.G6, q5Var.resourcesProvider));
        vtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        vtVar.setCursorWidth(1.5f);
        vtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        vtVar.setTextColor(j6.v0(j6.E8, q5Var.resourcesProvider));
        vtVar.setBackground(null);
        frameLayout.addView(vtVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        vtVar.addTextChangedListener(new cg.b0(4, strArr, g61Var));
        if (arrayList.size() > 8) {
            o70Var.r(frameLayout, k7.b6.n(-1, 44));
            o70Var.k();
        }
        if (!b5Var.f10488j.isEmpty()) {
            o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 0), false);
        }
        o70Var.q(g61Var);
        o70Var.Z();
    }

    public static void S(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.f10752c;
        if (b5Var.h.isEmpty()) {
            return;
        }
        o70 o70Var = new o70(q5Var.container, q5Var.resourcesProvider, q5Var.f10764a0, false, true, false);
        o70Var.f27490t = false;
        o70Var.Y = true;
        o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        o70Var.R = true;
        o70Var.f27484p = new g3(o70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.h);
        Collections.sort(arrayList, new g5(p5Var, 1));
        g61 g61Var = new g61(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, 2), new d5(p5Var, o70Var, 2), null, q5Var.resourcesProvider);
        g61Var.V2.f30240r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        vt vtVar = new vt(context, q5Var.resourcesProvider);
        vtVar.setTextSize(1, 16.0f);
        vtVar.setInputType(573441);
        vtVar.setRawInputType(573441);
        vtVar.setHintTextColor(j6.v0(j6.A6, q5Var.resourcesProvider));
        vtVar.setCursorColor(j6.v0(j6.G6, q5Var.resourcesProvider));
        vtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        vtVar.setCursorWidth(1.5f);
        vtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        vtVar.setTextColor(j6.v0(j6.E8, q5Var.resourcesProvider));
        vtVar.setBackground(null);
        frameLayout.addView(vtVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        vtVar.addTextChangedListener(new cg.b0(6, strArr, g61Var));
        if (arrayList.size() > 8) {
            o70Var.r(frameLayout, k7.b6.n(-1, 44));
            o70Var.k();
        }
        if (!b5Var.f10490l.isEmpty()) {
            o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 2), false);
        }
        o70Var.q(g61Var);
        o70Var.Z();
    }

    public static void T(q5 q5Var, ArrayList arrayList) {
        boolean z4;
        p5 p5Var = q5Var.V;
        if (p5Var != null) {
            l7 l7Var = p5Var.f10751b;
            b5 b5Var = p5Var.f10752c;
            if (l7Var != null && b5Var != null) {
                int currentTime = ConnectionsManager.getInstance(q5Var.currentAccount).getCurrentTime();
                arrayList.add(i51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = l7Var.f12772l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z10 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!q5Var.f10767d0.contains(Long.valueOf(savedStarGift.gift.f19409id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i51 a2 = w1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f25561g = z4;
                        arrayList.add(a2);
                        i11++;
                        z10 = false;
                    }
                }
                if (!l7Var.f12769i && l7Var.f12770j) {
                    if (z10) {
                        arrayList.add(i51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        i51 o10 = i51.o((i15 - i13) + 1, 35);
                        o10.f25574u = 1;
                        arrayList.add(o10);
                    }
                }
                if (b5Var.e > 0 || q5Var.f10770g0) {
                    q5Var.f10770g0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    i51 i51Var = new i51(42);
                    i51Var.d = -2;
                    i51Var.f25568o = string;
                    arrayList.add(i51Var);
                    HorizontalScrollView horizontalScrollView = q5Var.W;
                    if (horizontalScrollView != null) {
                        arrayList.add(i51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = b5Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(w1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (b5Var.f10498t || !b5Var.f10499u) {
                        i51 o11 = i51.o(10, 35);
                        o11.f25574u = 1;
                        arrayList.add(o11);
                        i51 o12 = i51.o(11, 35);
                        o12.f25574u = 1;
                        arrayList.add(o12);
                        i51 o13 = i51.o(12, 35);
                        o13.f25574u = 1;
                        arrayList.add(o13);
                        i51 o14 = i51.o(13, 35);
                        o14.f25574u = 1;
                        arrayList.add(o14);
                        i51 o15 = i51.o(14, 35);
                        o15.f25574u = 1;
                        arrayList.add(o15);
                        i51 o16 = i51.o(15, 35);
                        o16.f25574u = 1;
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
        lh.i4 i4Var = new lh.i4(bVar, tL_payments_paymentFormStarGift);
        Context context = q5Var.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = q5Var.resourcesProvider;
        int i10 = q5Var.currentAccount;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        new lh.k4(context, f6Var, tL_starGiftUnique, i4Var, i10, j10, a2.l(tL_starGiftUnique.num, ',', sb), true, new i5(q5Var, tL_starGiftUnique, j10, 0)).b();
    }

    public static void V(q5 q5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, lh.i4 i4Var, af.f fVar) {
        fVar.d();
        t7.x(q5Var.currentAccount, i4Var.f12585a).h(i4Var.f12586b, tL_starGiftUnique, j10, null, true, new a0(q5Var, fVar, tL_starGiftUnique, 1));
    }

    public static void W(q5 q5Var, p5 p5Var, Context context) {
        b5 b5Var = p5Var.f10752c;
        if (b5Var.f10486g.isEmpty()) {
            return;
        }
        o70 o70Var = new o70(q5Var.container, q5Var.resourcesProvider, q5Var.Z, false, true, false);
        o70Var.f27490t = false;
        o70Var.Y = true;
        o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        o70Var.R = true;
        o70Var.f27484p = new g3(o70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f10486g);
        Collections.sort(arrayList, new g5(p5Var, 0));
        g61 g61Var = new g61(context, q5Var.currentAccount, 0, false, new c5(strArr, p5Var, arrayList, 1), new d5(p5Var, o70Var, 1), null, q5Var.resourcesProvider);
        g61Var.V2.f30240r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(q5Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        vt vtVar = new vt(context, q5Var.resourcesProvider);
        vtVar.setTextSize(1, 16.0f);
        vtVar.setInputType(573441);
        vtVar.setRawInputType(573441);
        vtVar.setHintTextColor(j6.v0(j6.A6, q5Var.resourcesProvider));
        vtVar.setCursorColor(j6.v0(j6.G6, q5Var.resourcesProvider));
        vtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        vtVar.setCursorWidth(1.5f);
        vtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        vtVar.setTextColor(j6.v0(j6.E8, q5Var.resourcesProvider));
        vtVar.setBackground(null);
        frameLayout.addView(vtVar, k7.b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        vtVar.addTextChangedListener(new cg.b0(5, strArr, g61Var));
        if (arrayList.size() > 8) {
            o70Var.r(frameLayout, k7.b6.n(-1, 44));
            o70Var.k();
        }
        if (!b5Var.f10489k.isEmpty()) {
            o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new e5(p5Var, 1), false);
        }
        o70Var.q(g61Var);
        o70Var.Z();
    }

    @Override
    public final void E(float f10) {
        float y10 = this.containerView.getY() + f10;
        lh.q3 q3Var = this.f10765b0;
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
            sl0 sl0Var = this.d;
            if (i10 >= sl0Var.getChildCount()) {
                break;
            }
            View childAt = sl0Var.getChildAt(i10);
            if ((childAt instanceof t00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f10769f0.G(R)) != null) {
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
            p5Var.f10751b.a();
        }
        if (z10) {
            p5Var.f10752c.g(false);
        }
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        o5 o5Var = new o5(this, sl0Var, getContext(), this.currentAccount, new dg.r1(this, 13), this.resourcesProvider);
        this.f10769f0 = o5Var;
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
