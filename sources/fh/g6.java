package fh;

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
import gh.da;
import gh.v7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
public class g6 extends org.telegram.ui.ActionBar.o2 implements td.b {
    public LinearLayout A;
    public g5 B;
    public g5 C;
    public g5 D;
    public g5 E;
    public c00 F;
    public boolean G;
    public ng.c H;
    public ig.a I;
    public final td.a f6482a;
    public final long f6483b;
    public final String f6484c;
    public final p5 d;
    public Utilities.Callback f6485e;
    public org.telegram.ui.ActionBar.h2 f6486f;
    public View h;
    public y4 f6487n;
    public FrameLayout f6488r;
    public FrameLayout f6489s;
    public TextView v;
    public h5 f6490w;
    public boolean f6491x;
    public HorizontalScrollView f6492y;

    public g6(long j10, String str, long j11, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null);
        this.f6482a = new td.a(0, this, gr.h, 380L, false);
        this.G = true;
        this.f6483b = j10;
        this.f6484c = str;
        this.resourceProvider = b6Var;
        p5 p5Var = new p5(j11, this.currentAccount, new bg.i(this, 8));
        this.d = p5Var;
        p5Var.g(false);
    }

    public static void T(g6 g6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == UserConfig.getInstance(g6Var.currentAccount).getClientUserId()) {
            g6Var.d.d.remove(tL_starGiftUnique);
            g6Var.d0(false);
            if (j10 == UserConfig.getInstance(g6Var.currentAccount).getClientUserId()) {
                oc a02 = oc.a0(g6Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i9 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                gc O = a02.O(document, string, LocaleController.formatString(i9, j3.r0.n(tL_starGiftUnique.num, ',', sb2)));
                O.f28745r = false;
                O.j();
            } else {
                gc O2 = oc.a0(g6Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(g6Var.currentAccount, j10)));
                O2.f28745r = false;
                O2.j();
            }
            g6Var.F.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        v4 v4Var = new v4(bundle, tL_starGiftUnique, j10);
        org.telegram.ui.ActionBar.b5 b5Var = g6Var.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).f22647b) {
            Dialog dialog = g6Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.f3) && z10) {
                ((org.telegram.ui.ActionBar.f3) dialog).skipDismissAnimation();
            }
            g6Var.finishFragment();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(v4Var, false, z10);
            }
        } else {
            g6Var.presentFragment(v4Var, true, z10);
        }
        Utilities.Callback callback = g6Var.f6485e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void U(g6 g6Var, Context context) {
        p5 p5Var = g6Var.d;
        if (!g6Var.G || p5Var.h.isEmpty()) {
            return;
        }
        x60 x60Var = new x60(g6Var, g6Var.E, false, false);
        x60Var.f34581t = false;
        x60Var.Y = true;
        x60Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        x60Var.R = true;
        x60Var.f34575p = new r3(x60Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(p5Var.h);
        Collections.sort(arrayList, new l4(g6Var, 0));
        i51 i51Var = new i51(g6Var, new m4(g6Var, strArr, arrayList, 0), new n4(g6Var, x60Var, 0), null);
        i51Var.U2.f35188r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g6Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, g6Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        mtVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, g6Var.resourceProvider));
        mtVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, g6Var.resourceProvider));
        mtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        mtVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, g6Var.resourceProvider));
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, g7.e6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new t4(0, strArr, i51Var));
        if (arrayList.size() > 8) {
            x60Var.r(frameLayout, g7.e6.n(-1, 44));
            x60Var.k();
        }
        if (!p5Var.f6710l.isEmpty()) {
            x60Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new o4(g6Var, 0), false);
        }
        x60Var.q(i51Var);
        x60Var.Z();
    }

    public static void V(g6 g6Var, Context context) {
        p5 p5Var = g6Var.d;
        if (!g6Var.G || p5Var.f6705f.isEmpty()) {
            return;
        }
        x60 x60Var = new x60(g6Var, g6Var.C, false, false);
        x60Var.f34581t = false;
        x60Var.Y = true;
        x60Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        x60Var.R = true;
        x60Var.f34575p = new r3(x60Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(p5Var.f6705f);
        Collections.sort(arrayList, new l4(g6Var, 2));
        i51 i51Var = new i51(g6Var, new m4(g6Var, strArr, arrayList, 2), new n4(g6Var, x60Var, 2), null);
        i51Var.U2.f35188r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g6Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, g6Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        mtVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, g6Var.resourceProvider));
        mtVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, g6Var.resourceProvider));
        mtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        mtVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, g6Var.resourceProvider));
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, g7.e6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new t4(1, strArr, i51Var));
        if (arrayList.size() > 8) {
            x60Var.r(frameLayout, g7.e6.n(-1, 44));
            x60Var.k();
        }
        if (!p5Var.f6708j.isEmpty()) {
            x60Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new o4(g6Var, 2), false);
        }
        x60Var.q(i51Var);
        x60Var.Z();
    }

    public static void W(g6 g6Var, Context context) {
        p5 p5Var = g6Var.d;
        if (!g6Var.G || p5Var.f6706g.isEmpty()) {
            return;
        }
        x60 x60Var = new x60(g6Var, g6Var.D, false, false);
        x60Var.f34581t = false;
        x60Var.Y = true;
        x60Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        x60Var.R = true;
        x60Var.f34575p = new r3(x60Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(p5Var.f6706g);
        Collections.sort(arrayList, new l4(g6Var, 1));
        i51 i51Var = new i51(g6Var, new m4(g6Var, strArr, arrayList, 1), new n4(g6Var, x60Var, 1), null);
        i51Var.U2.f35188r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g6Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, g6Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        mtVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, g6Var.resourceProvider));
        mtVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, g6Var.resourceProvider));
        mtVar.setCursorSize(AndroidUtilities.dp(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        mtVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, g6Var.resourceProvider));
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, g7.e6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new t4(2, strArr, i51Var));
        if (arrayList.size() > 8) {
            x60Var.r(frameLayout, g7.e6.n(-1, 44));
            x60Var.k();
        }
        if (!p5Var.f6709k.isEmpty()) {
            x60Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new o4(g6Var, 1), false);
        }
        x60Var.q(i51Var);
        x60Var.Z();
    }

    public static void X(g6 g6Var, l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            gh.k5 k5Var = new gh.k5(g6Var.getParentActivity(), g6Var.currentAccount, g6Var.f6483b, g6Var.resourceProvider, null);
            k5Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, g6Var.d);
            k5Var.K0 = new q4(g6Var);
            g6Var.showDialog(k5Var);
        }
    }

    public static org.telegram.ui.ActionBar.k Y(g6 g6Var) {
        return g6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k Z(g6 g6Var) {
        return g6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(g6 g6Var) {
        return g6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k b0(g6 g6Var) {
        return g6Var.actionBar;
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            this.f6489s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f10);
            j10.d(this.f6488r, f10);
        }
    }

    public final void c0(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        float f14 = 1.0f;
        int i9 = 0;
        float f15 = 0.0f;
        if (z11) {
            this.f6492y.setVisibility(0);
            ViewPropertyAnimator animate = this.f6492y.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(f12);
            if (!z10) {
                f14 = 0.0f;
            }
            ViewPropertyAnimator alpha = translationY.alpha(f14);
            gr grVar = gr.h;
            alpha.setInterpolator(grVar).setDuration(420L).setListener(new u4(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f13).setInterpolator(grVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f6487n.animate();
            if (!z10) {
                f15 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f15).setInterpolator(grVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f6492y;
        if (!z10) {
            i9 = 8;
        }
        horizontalScrollView.setVisibility(i9);
        HorizontalScrollView horizontalScrollView2 = this.f6492y;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f10);
        HorizontalScrollView horizontalScrollView3 = this.f6492y;
        if (!z10) {
            f14 = 0.0f;
        }
        horizontalScrollView3.setAlpha(f14);
        View view = this.h;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = -AndroidUtilities.dp(45.0f);
        }
        view.setTranslationY(f11);
        y4 y4Var = this.f6487n;
        if (!z10) {
            f15 = -AndroidUtilities.dp(39.0f);
        }
        y4Var.setTranslationY(f15);
    }

    @Override
    public final View createView(final Context context) {
        ng.c cVar = new ng.c();
        this.H = cVar;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        cVar.a(getThemedColor(i9));
        this.I = new ig.a(this.H);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f6486f = h2Var;
        kVar.setBackButtonDrawable(h2Var);
        this.f6486f.f23455k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 0));
        this.actionBar.setTitle(this.f6484c);
        this.actionBar.setBackgroundColor(getThemedColor(i9));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        kVar2.C(getThemedColor(i10), false);
        this.actionBar.C(getThemedColor(i10), true);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), false);
        this.actionBar.setTitleColor(getThemedColor(i10));
        this.actionBar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23386z6));
        x4 x4Var = new x4(this, context, 0);
        int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(i9, this.resourceProvider), org.telegram.ui.ActionBar.f6.l1(0.04f, org.telegram.ui.ActionBar.f6.v0(i10, this.resourceProvider)));
        x4Var.setBackgroundColor(v);
        this.fragmentView = x4Var;
        da daVar = new da(context, this.currentAccount, this.resourceProvider);
        daVar.d = true;
        g7.g6.a(daVar);
        daVar.setOnClickListener(new bg.u1(10, this, daVar));
        this.actionBar.addView(daVar, g7.e6.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? i51Var = new i51(this, new bh.c(this, 11), new q4(this), new q4(this));
        this.f6487n = i51Var;
        i51Var.U2.f35188r = false;
        i51Var.setSpanCount(3);
        this.f6487n.j(new bg.o2(this, 3));
        this.f6487n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f6487n.setClipToPadding(false);
        x4Var.addView(this.f6487n, g7.e6.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        x4Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final g6 f6740b;

            {
                this.f6740b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p5 p5Var = this.f6740b.d;
                        p5Var.f6709k.clear();
                        p5Var.f6708j.clear();
                        p5Var.f6710l.clear();
                        p5Var.h();
                        return;
                    default:
                        p5 p5Var2 = this.f6740b.d;
                        p5Var2.f6709k.clear();
                        p5Var2.f6708j.clear();
                        p5Var2.f6710l.clear();
                        p5Var2.h();
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.b6 b6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout f10 = ll.f(context, 1);
        frameLayout.addView(f10, g7.e6.e(-1, -2, 23));
        o9 o9Var = new o9(context);
        o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        f10.addView(o9Var, g7.e6.q(130, 130, 17));
        TextView textView = new TextView(context);
        ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f10.addView(textView, g7.e6.t(-2, -2, 17, 32, 12, 32, 9));
        l80 l80Var = new l80(context, null);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setGravity(17);
        l80Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        l80Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f10.addView(l80Var, g7.e6.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        textView2.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.j2.c(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        g7.g6.a(textView2);
        f10.addView(textView2, g7.e6.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f6490w = frameLayout;
        this.f6491x = false;
        frameLayout.setAlpha(0.0f);
        this.f6490w.setScaleX(0.95f);
        this.f6490w.setScaleY(0.95f);
        this.f6490w.setVisibility(8);
        x4Var.addView(this.f6490w, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.A = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.A.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f6492y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f6492y.addView(this.A);
        this.f6492y.setBackgroundColor(v);
        this.f6492y.setClipChildren(false);
        x4Var.addView(this.f6492y, g7.e6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23002d7));
        this.h.setAlpha(0.0f);
        x4Var.addView(this.h, g7.e6.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final dp dpVar = new dp(context, 24, this.resourceProvider);
        dpVar.b(org.telegram.ui.ActionBar.f6.f23074h7, org.telegram.ui.ActionBar.f6.f23110j7, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(true);
        dpVar.a(false, false);
        dpVar.setDrawBackgroundAsArc(10);
        dpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        dpVar.setScaleX(0.8f);
        dpVar.setScaleY(0.8f);
        linearLayout2.addView(dpVar, g7.e6.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        ll.n(org.telegram.ui.ActionBar.f6.f23108j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, g7.e6.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i9);
        int i12 = org.telegram.ui.ActionBar.f6.Oh;
        int v4 = org.telegram.ui.ActionBar.f6.v(themedColor, org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i12)));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, v4, v4));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f6489s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f6489s;
        kg.d c10 = this.I.c(frameLayout3, null, false);
        c10.n(mg.c.k(this.resourceProvider));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f6489s.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f6753b;

            {
                this.f6753b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        p5 p5Var = this.f6753b.d;
                        if (p5Var != null) {
                            boolean z10 = !p5Var.f6716r;
                            p5Var.f6716r = z10;
                            dpVar.a(z10, true);
                            p5Var.h();
                            return;
                        }
                        return;
                    default:
                        final g6 g6Var = this.f6753b;
                        p5 p5Var2 = g6Var.d;
                        if (g6Var.G) {
                            x60 H = x60.H(g6Var, g6Var.B);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(o5.BY_PRICE.f6670a), new o4(g6Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(o5.BY_DATE.f6670a), new o4(g6Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(o5.BY_NUMBER.f6670a), new o4(g6Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final dp dpVar2 = dpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            p5 p5Var3 = g6Var.d;
                                            if (p5Var3.f6716r) {
                                                p5Var3.f6716r = false;
                                                dpVar2.a(false, true);
                                                p5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            p5 p5Var4 = g6Var.d;
                                            if (!p5Var4.f6716r) {
                                                p5Var4.f6716r = true;
                                                dpVar2.a(true, true);
                                                p5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !p5Var2.f6716r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            p5 p5Var3 = g6Var.d;
                                            if (p5Var3.f6716r) {
                                                p5Var3.f6716r = false;
                                                dpVar2.a(false, true);
                                                p5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            p5 p5Var4 = g6Var.d;
                                            if (!p5Var4.f6716r) {
                                                p5Var4.f6716r = true;
                                                dpVar2.a(true, true);
                                                p5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), p5Var2.f6716r);
                            H.f34581t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f6489s.addView(linearLayout2, g7.e6.c(-1.0f, -2));
        g7.g6.b(this.f6489s, 0.04f, 1.5f);
        x4Var.addView(this.f6489s, g7.e6.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        v7 y10 = v7.y(this.currentAccount, true);
        if (y10.f9048e && !y10.s().k()) {
            this.f6489s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f6488r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f6488r;
        kg.d c11 = this.I.c(frameLayout5, null, false);
        c11.n(mg.c.k(this.resourceProvider));
        c11.o(AndroidUtilities.dp(8.0f));
        c11.p(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        x4Var.addView(this.f6488r, g7.e6.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new eq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i12));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = org.telegram.ui.ActionBar.f6.v(getThemedColor(i9), org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i12)));
        textView4.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        this.f6488r.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f6740b;

            {
                this.f6740b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        p5 p5Var = this.f6740b.d;
                        p5Var.f6709k.clear();
                        p5Var.f6708j.clear();
                        p5Var.f6710l.clear();
                        p5Var.h();
                        return;
                    default:
                        p5 p5Var2 = this.f6740b.d;
                        p5Var2.f6709k.clear();
                        p5Var2.f6708j.clear();
                        p5Var2.f6710l.clear();
                        p5Var2.h();
                        return;
                }
            }
        });
        this.f6488r.addView(this.v, g7.e6.c(-1.0f, -2));
        this.f6488r.setVisibility(8);
        g7.g6.b(this.f6488r, 0.05f, 1.5f);
        g5 g5Var = new g5(context, this.resourceProvider);
        this.B = g5Var;
        g5Var.setSorting(this.d.f6714p);
        this.A.addView(this.B, g7.e6.t(-2, -2, 16, 0, 0, 6, 0));
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f6753b;

            {
                this.f6753b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        p5 p5Var = this.f6753b.d;
                        if (p5Var != null) {
                            boolean z10 = !p5Var.f6716r;
                            p5Var.f6716r = z10;
                            dpVar.a(z10, true);
                            p5Var.h();
                            return;
                        }
                        return;
                    default:
                        final g6 g6Var = this.f6753b;
                        p5 p5Var2 = g6Var.d;
                        if (g6Var.G) {
                            x60 H = x60.H(g6Var, g6Var.B);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(o5.BY_PRICE.f6670a), new o4(g6Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(o5.BY_DATE.f6670a), new o4(g6Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(o5.BY_NUMBER.f6670a), new o4(g6Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final dp dpVar2 = dpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            p5 p5Var3 = g6Var.d;
                                            if (p5Var3.f6716r) {
                                                p5Var3.f6716r = false;
                                                dpVar2.a(false, true);
                                                p5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            p5 p5Var4 = g6Var.d;
                                            if (!p5Var4.f6716r) {
                                                p5Var4.f6716r = true;
                                                dpVar2.a(true, true);
                                                p5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !p5Var2.f6716r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            p5 p5Var3 = g6Var.d;
                                            if (p5Var3.f6716r) {
                                                p5Var3.f6716r = false;
                                                dpVar2.a(false, true);
                                                p5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            p5 p5Var4 = g6Var.d;
                                            if (!p5Var4.f6716r) {
                                                p5Var4.f6716r = true;
                                                dpVar2.a(true, true);
                                                p5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), p5Var2.f6716r);
                            H.f34581t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        g5 g5Var2 = new g5(context, this.resourceProvider);
        this.C = g5Var2;
        g5Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.A.addView(this.C, g7.e6.t(-2, -2, 16, 0, 0, 6, 0));
        this.C.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f6589b;

            {
                this.f6589b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        g6.V(this.f6589b, context);
                        return;
                    case 1:
                        g6.W(this.f6589b, context);
                        return;
                    default:
                        g6.U(this.f6589b, context);
                        return;
                }
            }
        });
        g5 g5Var3 = new g5(context, this.resourceProvider);
        this.D = g5Var3;
        g5Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.A.addView(this.D, g7.e6.t(-2, -2, 16, 0, 0, 6, 0));
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f6589b;

            {
                this.f6589b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        g6.V(this.f6589b, context);
                        return;
                    case 1:
                        g6.W(this.f6589b, context);
                        return;
                    default:
                        g6.U(this.f6589b, context);
                        return;
                }
            }
        });
        g5 g5Var4 = new g5(context, this.resourceProvider);
        this.E = g5Var4;
        g5Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.A.addView(this.E, g7.e6.t(-2, -2, 16, 0, 0, 0, 0));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f6589b;

            {
                this.f6589b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        g6.V(this.f6589b, context);
                        return;
                    case 1:
                        g6.W(this.f6589b, context);
                        return;
                    default:
                        g6.U(this.f6589b, context);
                        return;
                }
            }
        });
        c00 c00Var = new c00(getParentActivity());
        this.F = c00Var;
        x4Var.addView(c00Var, g7.e6.c(-1.0f, -1));
        c0(false, false);
        return x4Var;
    }

    public final void d0(boolean z10) {
        String string;
        String string2;
        String string3;
        String formatPluralStringComma;
        z41 z41Var;
        p5 p5Var = this.d;
        int i9 = p5Var.f6704e;
        HashSet hashSet = p5Var.f6710l;
        ArrayList arrayList = p5Var.h;
        HashSet hashSet2 = p5Var.f6709k;
        ArrayList arrayList2 = p5Var.f6706g;
        HashSet hashSet3 = p5Var.f6708j;
        ArrayList arrayList3 = p5Var.f6705f;
        if (i9 > 12) {
            c0(true, true);
        }
        y4 y4Var = this.f6487n;
        boolean z11 = false;
        if (y4Var != null && (z41Var = y4Var.U2) != null) {
            z41Var.N(true);
            if (z10) {
                this.f6487n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f6484c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i10 = p5Var.f6704e;
            if (i10 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i10);
            }
            kVar2.setSubtitle(formatPluralStringComma);
        }
        g5 g5Var = this.B;
        if (g5Var != null) {
            g5Var.setSorting(p5Var.f6714p);
        }
        if (this.C != null) {
            int size = arrayList3.size() - hashSet3.size();
            g5 g5Var2 = this.C;
            if (size > 0 && size != arrayList3.size()) {
                string3 = LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size);
            } else {
                string3 = LocaleController.getString(R.string.Gift2ResaleFilterModel);
            }
            g5Var2.setValue(string3);
        }
        if (this.D != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            g5 g5Var3 = this.D;
            if (size2 > 0 && size2 != arrayList2.size()) {
                string2 = LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2);
            } else {
                string2 = LocaleController.getString(R.string.Gift2ResaleFilterBackdrop);
            }
            g5Var3.setValue(string2);
        }
        if (this.E != null) {
            int size3 = arrayList.size() - hashSet.size();
            g5 g5Var4 = this.E;
            if (size3 > 0 && size3 != arrayList.size()) {
                string = LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3);
            } else {
                string = LocaleController.getString(R.string.Gift2ResaleFilterSymbol);
            }
            g5Var4.setValue(string);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f6487n.getChildCount()) {
                break;
            } else if (this.f6487n.getChildAt(i11) instanceof e00) {
                p5Var.g(false);
                break;
            } else {
                i11++;
            }
        }
        if ((p5Var.f6718t || p5Var.f6704e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f6482a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w8, false);
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
    public final void B(float f10, int i9) {
    }
}
