package lh;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import mh.t7;
import mh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xt;
import org.telegram.ui.LaunchActivity;
public class r5 extends org.telegram.ui.ActionBar.p2 implements xd.b {
    public LinearLayout B;
    public s4 C;
    public s4 D;
    public s4 E;
    public s4 F;
    public s00 G;
    public boolean H;
    public tg.c I;
    public og.a J;
    public final xd.a f12925a;
    public final long f12926b;
    public final String f12927c;
    public final b5 d;
    public Utilities.Callback f12928e;
    public org.telegram.ui.ActionBar.i2 f12929f;
    public View h;
    public k4 f12930n;
    public FrameLayout f12931r;
    public FrameLayout f12932s;
    public TextView v;
    public t4 f12933w;
    public boolean f12934x;
    public HorizontalScrollView f12935y;

    public r5(long j10, String str, long j11, g6 g6Var) {
        super(null);
        this.f12925a = new xd.a(0, this, pr.h, 380L, false);
        this.H = true;
        this.f12926b = j10;
        this.f12927c = str;
        this.resourceProvider = g6Var;
        b5 b5Var = new b5(j11, this.currentAccount, new dg.h0(this, 15));
        this.d = b5Var;
        b5Var.g(false);
    }

    public static void U(r5 r5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z4) {
        if (j10 == UserConfig.getInstance(r5Var.currentAccount).getClientUserId()) {
            r5Var.d.d.remove(tL_starGiftUnique);
            r5Var.e0(false);
            if (j10 == UserConfig.getInstance(r5Var.currentAccount).getClientUserId()) {
                qc a02 = qc.a0(r5Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb = new StringBuilder();
                sb.append(tL_starGiftUnique.title);
                sb.append(" #");
                ic O = a02.O(document, string, LocaleController.formatString(i10, l.d.l(tL_starGiftUnique.num, ',', sb)));
                O.f27753r = false;
                O.j();
            } else {
                ic O2 = qc.a0(r5Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(r5Var.currentAccount, j10)));
                O2.f27753r = false;
                O2.j();
            }
            r5Var.G.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        i4 i4Var = new i4(bundle, tL_starGiftUnique, j10);
        org.telegram.ui.ActionBar.f5 f5Var = r5Var.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).f21111b) {
            Dialog dialog = r5Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.h3) && z4) {
                ((org.telegram.ui.ActionBar.h3) dialog).skipDismissAnimation();
            }
            r5Var.finishFragment();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(i4Var, false, z4);
            }
        } else {
            r5Var.presentFragment(i4Var, true, z4);
        }
        Utilities.Callback callback = r5Var.f12928e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z4));
        }
    }

    public static void V(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (!r5Var.H || b5Var.h.isEmpty()) {
            return;
        }
        q70 q70Var = new q70(r5Var, r5Var.F, false, false);
        q70Var.f30330t = false;
        q70Var.Y = true;
        q70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        q70Var.R = true;
        q70Var.f30324p = new g3(q70Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.h);
        Collections.sort(arrayList, new z3(r5Var, 0));
        i61 i61Var = new i61(r5Var, new a4(r5Var, strArr, arrayList, 0), new b4(r5Var, q70Var, 0), null);
        i61Var.V2.f32957r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(k6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.c6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xt xtVar = new xt(context, r5Var.resourceProvider);
        xtVar.setTextSize(1, 16.0f);
        xtVar.setInputType(573441);
        xtVar.setRawInputType(573441);
        xtVar.setHintTextColor(k6.v0(k6.A6, r5Var.resourceProvider));
        xtVar.setCursorColor(k6.v0(k6.G6, r5Var.resourceProvider));
        xtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        xtVar.setCursorWidth(1.5f);
        xtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        xtVar.setTextColor(k6.v0(k6.E8, r5Var.resourceProvider));
        xtVar.setBackground(null);
        frameLayout.addView(xtVar, k7.c6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xtVar.addTextChangedListener(new dg.b0(1, strArr, i61Var));
        if (arrayList.size() > 8) {
            q70Var.r(frameLayout, k7.c6.n(-1, 44));
            q70Var.k();
        }
        if (!b5Var.f12627l.isEmpty()) {
            q70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 0), false);
        }
        q70Var.q(i61Var);
        q70Var.Z();
    }

    public static void W(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (!r5Var.H || b5Var.f12622f.isEmpty()) {
            return;
        }
        q70 q70Var = new q70(r5Var, r5Var.D, false, false);
        q70Var.f30330t = false;
        q70Var.Y = true;
        q70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        q70Var.R = true;
        q70Var.f30324p = new g3(q70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f12622f);
        Collections.sort(arrayList, new z3(r5Var, 2));
        i61 i61Var = new i61(r5Var, new a4(r5Var, strArr, arrayList, 2), new b4(r5Var, q70Var, 2), null);
        i61Var.V2.f32957r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(k6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.c6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xt xtVar = new xt(context, r5Var.resourceProvider);
        xtVar.setTextSize(1, 16.0f);
        xtVar.setInputType(573441);
        xtVar.setRawInputType(573441);
        xtVar.setHintTextColor(k6.v0(k6.A6, r5Var.resourceProvider));
        xtVar.setCursorColor(k6.v0(k6.G6, r5Var.resourceProvider));
        xtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        xtVar.setCursorWidth(1.5f);
        xtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        xtVar.setTextColor(k6.v0(k6.E8, r5Var.resourceProvider));
        xtVar.setBackground(null);
        frameLayout.addView(xtVar, k7.c6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xtVar.addTextChangedListener(new dg.b0(2, strArr, i61Var));
        if (arrayList.size() > 8) {
            q70Var.r(frameLayout, k7.c6.n(-1, 44));
            q70Var.k();
        }
        if (!b5Var.f12625j.isEmpty()) {
            q70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 2), false);
        }
        q70Var.q(i61Var);
        q70Var.Z();
    }

    public static void X(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (!r5Var.H || b5Var.f12623g.isEmpty()) {
            return;
        }
        q70 q70Var = new q70(r5Var, r5Var.E, false, false);
        q70Var.f30330t = false;
        q70Var.Y = true;
        q70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        q70Var.R = true;
        q70Var.f30324p = new g3(q70Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f12623g);
        Collections.sort(arrayList, new z3(r5Var, 1));
        i61 i61Var = new i61(r5Var, new a4(r5Var, strArr, arrayList, 1), new b4(r5Var, q70Var, 1), null);
        i61Var.V2.f32957r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(k6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.c6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        xt xtVar = new xt(context, r5Var.resourceProvider);
        xtVar.setTextSize(1, 16.0f);
        xtVar.setInputType(573441);
        xtVar.setRawInputType(573441);
        xtVar.setHintTextColor(k6.v0(k6.A6, r5Var.resourceProvider));
        xtVar.setCursorColor(k6.v0(k6.G6, r5Var.resourceProvider));
        xtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        xtVar.setCursorWidth(1.5f);
        xtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        xtVar.setTextColor(k6.v0(k6.E8, r5Var.resourceProvider));
        xtVar.setBackground(null);
        frameLayout.addView(xtVar, k7.c6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        xtVar.addTextChangedListener(new dg.b0(3, strArr, i61Var));
        if (arrayList.size() > 8) {
            q70Var.r(frameLayout, k7.c6.n(-1, 44));
            q70Var.k();
        }
        if (!b5Var.f12626k.isEmpty()) {
            q70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 1), false);
        }
        q70Var.q(i61Var);
        q70Var.Z();
    }

    public static void Y(r5 r5Var, j51 j51Var) {
        Object obj = j51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            mh.g5 g5Var = new mh.g5(r5Var.getParentActivity(), r5Var.currentAccount, r5Var.f12926b, r5Var.resourceProvider, null);
            g5Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, r5Var.d);
            g5Var.L0 = new e4(r5Var);
            r5Var.showDialog(g5Var);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(r5 r5Var) {
        return r5Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(r5 r5Var) {
        return r5Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k b0(r5 r5Var) {
        return r5Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k c0(r5 r5Var) {
        return r5Var.actionBar;
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            this.f12932s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f10);
            a20.d(this.f12931r, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        tg.c cVar = new tg.c();
        this.I = cVar;
        int i10 = k6.f21659d6;
        cVar.a(getThemedColor(i10));
        this.J = new og.a(this.I);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f12929f = i2Var;
        kVar.setBackButtonDrawable(i2Var);
        this.f12929f.f21458k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 1));
        this.actionBar.setTitle(this.f12927c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = k6.G6;
        kVar2.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.B(getThemedColor(k6.f22055z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(k6.f22053z6));
        j4 j4Var = new j4(this, context, 0);
        int v = k6.v(k6.v0(i10, this.resourceProvider), k6.l1(0.04f, k6.v0(i11, this.resourceProvider)));
        j4Var.setBackgroundColor(v);
        this.fragmentView = j4Var;
        y9 y9Var = new y9(context, this.currentAccount, this.resourceProvider);
        y9Var.d = true;
        k7.e6.a(y9Var);
        y9Var.setOnClickListener(new dg.n(14, this, y9Var));
        this.actionBar.addView(y9Var, k7.c6.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? i61Var = new i61(this, new eg.p1(this, 12), new e4(this), new e4(this));
        this.f12930n = i61Var;
        i61Var.V2.f32957r = false;
        i61Var.setSpanCount(3);
        this.f12930n.j(new fg.e2(this, 4));
        this.f12930n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f12930n.setClipToPadding(false);
        j4Var.addView(this.f12930n, k7.c6.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        j4Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final r5 f12742b;

            {
                this.f12742b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b5 b5Var = this.f12742b.d;
                        b5Var.f12626k.clear();
                        b5Var.f12625j.clear();
                        b5Var.f12627l.clear();
                        b5Var.h();
                        return;
                    default:
                        b5 b5Var2 = this.f12742b.d;
                        b5Var2.f12626k.clear();
                        b5Var2.f12625j.clear();
                        b5Var2.f12627l.clear();
                        b5Var2.h();
                        return;
                }
            }
        };
        g6 g6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        frameLayout.addView(f10, k7.c6.e(-1, -2, 23));
        p9 p9Var = new p9(context);
        p9Var.setImageDrawable(new ij0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        f10.addView(p9Var, k7.c6.q(130, 130, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(k6.G6, g6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f10.addView(textView, k7.c6.t(-2, -2, 17, 32, 12, 32, 9));
        g90 g90Var = new g90(context, null);
        g90Var.setTextColor(k6.v0(k6.A6, g6Var));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setGravity(17);
        g90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        g90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f10.addView(g90Var, k7.c6.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = k6.Oh;
        textView2.setTextColor(k6.v0(i12, g6Var));
        textView2.setBackground(k6.Y(k6.l1(0.1f, k6.v0(i12, g6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.b.e(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        k7.e6.a(textView2);
        f10.addView(textView2, k7.c6.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f12933w = frameLayout;
        this.f12934x = false;
        frameLayout.setAlpha(0.0f);
        this.f12933w.setScaleX(0.95f);
        this.f12933w.setScaleY(0.95f);
        this.f12933w.setVisibility(8);
        j4Var.addView(this.f12933w, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.B = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.B.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f12935y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f12935y.addView(this.B);
        this.f12935y.setBackgroundColor(v);
        this.f12935y.setClipChildren(false);
        j4Var.addView(this.f12935y, k7.c6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(k6.f21660d7));
        this.h.setAlpha(0.0f);
        j4Var.addView(this.h, k7.c6.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final np npVar = new np(context, 24, this.resourceProvider);
        npVar.b(k6.f21733h7, k6.f21768j7, k6.f21786k7);
        npVar.setDrawUnchecked(true);
        npVar.a(false, false);
        npVar.setDrawBackgroundAsArc(10);
        npVar.setTranslationX(AndroidUtilities.dp(4.0f));
        npVar.setScaleX(0.8f);
        npVar.setScaleY(0.8f);
        linearLayout2.addView(npVar, k7.c6.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        org.telegram.ui.b.l(k6.f21766j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, k7.c6.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = k6.Oh;
        int v10 = k6.v(themedColor, k6.l1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(k6.i0(dp, dp, dp, dp, 0, v10, v10));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12932s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f12932s;
        qg.b c3 = this.J.c(frameLayout3, null, false);
        c3.n(sg.b.k(this.resourceProvider));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c3);
        this.f12932s.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f12779b;

            {
                this.f12779b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f12779b.d;
                        if (b5Var != null) {
                            boolean z4 = !b5Var.f12633r;
                            b5Var.f12633r = z4;
                            npVar.a(z4, true);
                            b5Var.h();
                            return;
                        }
                        return;
                    default:
                        final r5 r5Var = this.f12779b;
                        b5 b5Var2 = r5Var.d;
                        if (r5Var.H) {
                            q70 H = q70.H(r5Var, r5Var.C);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(a5.BY_PRICE.f12598a), new c4(r5Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(a5.BY_DATE.f12598a), new c4(r5Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(a5.BY_NUMBER.f12598a), new c4(r5Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final np npVar2 = npVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.f12633r) {
                                                b5Var3.f12633r = false;
                                                npVar2.a(false, true);
                                                b5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.f12633r) {
                                                b5Var4.f12633r = true;
                                                npVar2.a(true, true);
                                                b5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !b5Var2.f12633r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.f12633r) {
                                                b5Var3.f12633r = false;
                                                npVar2.a(false, true);
                                                b5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.f12633r) {
                                                b5Var4.f12633r = true;
                                                npVar2.a(true, true);
                                                b5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), b5Var2.f12633r);
                            H.f30330t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f12932s.addView(linearLayout2, k7.c6.c(-1.0f, -2));
        k7.e6.b(this.f12932s, 0.04f, 1.5f);
        j4Var.addView(this.f12932s, k7.c6.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        t7 y10 = t7.y(this.currentAccount, true);
        if (y10.f14831e && !y10.s().k()) {
            this.f12932s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f12931r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f12931r;
        qg.b c10 = this.J.c(frameLayout5, null, false);
        c10.n(sg.b.k(this.resourceProvider));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c10);
        j4Var.addView(this.f12931r, k7.c6.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new oq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i13));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v11 = k6.v(getThemedColor(i10), k6.l1(0.1f, getThemedColor(i13)));
        textView4.setBackground(k6.i0(dp2, dp2, dp2, dp2, 0, v11, v11));
        this.v.setGravity(17);
        this.f12931r.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f12742b;

            {
                this.f12742b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b5 b5Var = this.f12742b.d;
                        b5Var.f12626k.clear();
                        b5Var.f12625j.clear();
                        b5Var.f12627l.clear();
                        b5Var.h();
                        return;
                    default:
                        b5 b5Var2 = this.f12742b.d;
                        b5Var2.f12626k.clear();
                        b5Var2.f12625j.clear();
                        b5Var2.f12627l.clear();
                        b5Var2.h();
                        return;
                }
            }
        });
        this.f12931r.addView(this.v, k7.c6.c(-1.0f, -2));
        this.f12931r.setVisibility(8);
        k7.e6.b(this.f12931r, 0.05f, 1.5f);
        s4 s4Var = new s4(context, this.resourceProvider);
        this.C = s4Var;
        s4Var.setSorting(this.d.f12631p);
        this.B.addView(this.C, k7.c6.t(-2, -2, 16, 0, 0, 6, 0));
        this.C.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f12779b;

            {
                this.f12779b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f12779b.d;
                        if (b5Var != null) {
                            boolean z4 = !b5Var.f12633r;
                            b5Var.f12633r = z4;
                            npVar.a(z4, true);
                            b5Var.h();
                            return;
                        }
                        return;
                    default:
                        final r5 r5Var = this.f12779b;
                        b5 b5Var2 = r5Var.d;
                        if (r5Var.H) {
                            q70 H = q70.H(r5Var, r5Var.C);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(a5.BY_PRICE.f12598a), new c4(r5Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(a5.BY_DATE.f12598a), new c4(r5Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(a5.BY_NUMBER.f12598a), new c4(r5Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final np npVar2 = npVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.f12633r) {
                                                b5Var3.f12633r = false;
                                                npVar2.a(false, true);
                                                b5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.f12633r) {
                                                b5Var4.f12633r = true;
                                                npVar2.a(true, true);
                                                b5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !b5Var2.f12633r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.f12633r) {
                                                b5Var3.f12633r = false;
                                                npVar2.a(false, true);
                                                b5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.f12633r) {
                                                b5Var4.f12633r = true;
                                                npVar2.a(true, true);
                                                b5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), b5Var2.f12633r);
                            H.f30330t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        s4 s4Var2 = new s4(context, this.resourceProvider);
        this.D = s4Var2;
        s4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.B.addView(this.D, k7.c6.t(-2, -2, 16, 0, 0, 6, 0));
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f13122b;

            {
                this.f13122b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r5.W(this.f13122b, context);
                        return;
                    case 1:
                        r5.X(this.f13122b, context);
                        return;
                    default:
                        r5.V(this.f13122b, context);
                        return;
                }
            }
        });
        s4 s4Var3 = new s4(context, this.resourceProvider);
        this.E = s4Var3;
        s4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.B.addView(this.E, k7.c6.t(-2, -2, 16, 0, 0, 6, 0));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f13122b;

            {
                this.f13122b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r5.W(this.f13122b, context);
                        return;
                    case 1:
                        r5.X(this.f13122b, context);
                        return;
                    default:
                        r5.V(this.f13122b, context);
                        return;
                }
            }
        });
        s4 s4Var4 = new s4(context, this.resourceProvider);
        this.F = s4Var4;
        s4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.B.addView(this.F, k7.c6.t(-2, -2, 16, 0, 0, 0, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f13122b;

            {
                this.f13122b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r5.W(this.f13122b, context);
                        return;
                    case 1:
                        r5.X(this.f13122b, context);
                        return;
                    default:
                        r5.V(this.f13122b, context);
                        return;
                }
            }
        });
        s00 s00Var = new s00(getParentActivity());
        this.G = s00Var;
        j4Var.addView(s00Var, k7.c6.c(-1.0f, -1));
        d0(false, false);
        return j4Var;
    }

    public final void d0(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.H == z4) {
            return;
        }
        this.H = z4;
        float f14 = 1.0f;
        int i10 = 0;
        float f15 = 0.0f;
        if (z10) {
            this.f12935y.setVisibility(0);
            ViewPropertyAnimator animate = this.f12935y.animate();
            if (z4) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(f12);
            if (!z4) {
                f14 = 0.0f;
            }
            ViewPropertyAnimator alpha = translationY.alpha(f14);
            pr prVar = pr.h;
            alpha.setInterpolator(prVar).setDuration(420L).setListener(new h4(this, z4, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z4) {
                f13 = 0.0f;
            } else {
                f13 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f13).setInterpolator(prVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f12930n.animate();
            if (!z4) {
                f15 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f15).setInterpolator(prVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f12935y;
        if (!z4) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f12935y;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f10);
        HorizontalScrollView horizontalScrollView3 = this.f12935y;
        if (!z4) {
            f14 = 0.0f;
        }
        horizontalScrollView3.setAlpha(f14);
        View view = this.h;
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = -AndroidUtilities.dp(45.0f);
        }
        view.setTranslationY(f11);
        k4 k4Var = this.f12930n;
        if (!z4) {
            f15 = -AndroidUtilities.dp(39.0f);
        }
        k4Var.setTranslationY(f15);
    }

    public final void e0(boolean z4) {
        String string;
        String string2;
        String string3;
        String formatPluralStringComma;
        x51 x51Var;
        b5 b5Var = this.d;
        int i10 = b5Var.f12621e;
        HashSet hashSet = b5Var.f12627l;
        ArrayList arrayList = b5Var.h;
        HashSet hashSet2 = b5Var.f12626k;
        ArrayList arrayList2 = b5Var.f12623g;
        HashSet hashSet3 = b5Var.f12625j;
        ArrayList arrayList3 = b5Var.f12622f;
        if (i10 > 12) {
            d0(true, true);
        }
        k4 k4Var = this.f12930n;
        boolean z10 = false;
        if (k4Var != null && (x51Var = k4Var.V2) != null) {
            x51Var.N(true);
            if (z4) {
                this.f12930n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f12927c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = b5Var.f12621e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            kVar2.setSubtitle(formatPluralStringComma);
        }
        s4 s4Var = this.C;
        if (s4Var != null) {
            s4Var.setSorting(b5Var.f12631p);
        }
        if (this.D != null) {
            int size = arrayList3.size() - hashSet3.size();
            s4 s4Var2 = this.D;
            if (size > 0 && size != arrayList3.size()) {
                string3 = LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size);
            } else {
                string3 = LocaleController.getString(R.string.Gift2ResaleFilterModel);
            }
            s4Var2.setValue(string3);
        }
        if (this.E != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            s4 s4Var3 = this.E;
            if (size2 > 0 && size2 != arrayList2.size()) {
                string2 = LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2);
            } else {
                string2 = LocaleController.getString(R.string.Gift2ResaleFilterBackdrop);
            }
            s4Var3.setValue(string2);
        }
        if (this.F != null) {
            int size3 = arrayList.size() - hashSet.size();
            s4 s4Var4 = this.F;
            if (size3 > 0 && size3 != arrayList.size()) {
                string = LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3);
            } else {
                string = LocaleController.getString(R.string.Gift2ResaleFilterSymbol);
            }
            s4Var4.setValue(string);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.f12930n.getChildCount()) {
                break;
            } else if (this.f12930n.getChildAt(i12) instanceof u00) {
                b5Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((b5Var.f12635t || b5Var.f12621e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z10 = true;
        }
        this.f12925a.a(z10, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = k6.w0(null, k6.f21659d6, false);
            if (this.actionBar.s()) {
                w02 = k6.w0(null, k6.f22000w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
