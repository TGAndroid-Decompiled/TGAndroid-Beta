package ih;

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
import i7.h6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import jh.s7;
import jh.x9;
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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
public class r5 extends org.telegram.ui.ActionBar.o2 implements vd.b {
    public LinearLayout A;
    public s4 B;
    public s4 C;
    public s4 D;
    public s4 E;
    public n00 F;
    public boolean G;
    public qg.c H;
    public lg.a I;
    public final vd.a f9354a;
    public final long f9355b;
    public final String f9356c;
    public final b5 d;
    public Utilities.Callback f9357e;
    public org.telegram.ui.ActionBar.h2 f9358f;
    public View h;
    public k4 f9359n;
    public FrameLayout f9360r;
    public FrameLayout f9361s;
    public TextView v;
    public t4 f9362w;
    public boolean f9363x;
    public HorizontalScrollView f9364y;

    public r5(long j10, String str, long j11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null);
        this.f9354a = new vd.a(0, this, jr.h, 380L, false);
        this.G = true;
        this.f9355b = j10;
        this.f9356c = str;
        this.resourceProvider = c6Var;
        b5 b5Var = new b5(j11, this.currentAccount, new ag.i0(this, 15));
        this.d = b5Var;
        b5Var.g(false);
    }

    public static void U(r5 r5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == UserConfig.getInstance(r5Var.currentAccount).getClientUserId()) {
            r5Var.d.d.remove(tL_starGiftUnique);
            r5Var.e0(false);
            if (j10 == UserConfig.getInstance(r5Var.currentAccount).getClientUserId()) {
                tc a02 = tc.a0(r5Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                mc O = a02.O(document, string, LocaleController.formatString(i10, j7.l1.m(tL_starGiftUnique.num, ',', sb2)));
                O.f30660r = false;
                O.j();
            } else {
                mc O2 = tc.a0(r5Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(r5Var.currentAccount, j10)));
                O2.f30660r = false;
                O2.j();
            }
            r5Var.F.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        i4 i4Var = new i4(bundle, tL_starGiftUnique, j10);
        org.telegram.ui.ActionBar.b5 b5Var = r5Var.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).f22659b) {
            Dialog dialog = r5Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.f3) && z10) {
                ((org.telegram.ui.ActionBar.f3) dialog).skipDismissAnimation();
            }
            r5Var.finishFragment();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(i4Var, false, z10);
            }
        } else {
            r5Var.presentFragment(i4Var, true, z10);
        }
        Utilities.Callback callback = r5Var.f9357e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (!r5Var.G || b5Var.h.isEmpty()) {
            return;
        }
        j70 j70Var = new j70(r5Var, r5Var.E, false, false);
        j70Var.f29601t = false;
        j70Var.Y = true;
        j70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        j70Var.R = true;
        j70Var.f29595p = new g3(j70Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.h);
        Collections.sort(arrayList, new z3(r5Var, 0));
        u51 u51Var = new u51(r5Var, new a4(r5Var, strArr, arrayList, 0), new b4(r5Var, j70Var, 0), null);
        u51Var.U2.f29939r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        st stVar = new st(context, r5Var.resourceProvider);
        stVar.setTextSize(1, 16.0f);
        stVar.setInputType(573441);
        stVar.setRawInputType(573441);
        stVar.setHintTextColor(g6.v0(g6.A6, r5Var.resourceProvider));
        stVar.setCursorColor(g6.v0(g6.G6, r5Var.resourceProvider));
        stVar.setCursorSize(AndroidUtilities.dp(19.0f));
        stVar.setCursorWidth(1.5f);
        stVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        stVar.setTextColor(g6.v0(g6.E8, r5Var.resourceProvider));
        stVar.setBackground(null);
        frameLayout.addView(stVar, i7.f6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        stVar.addTextChangedListener(new ag.c0(1, strArr, u51Var));
        if (arrayList.size() > 8) {
            j70Var.r(frameLayout, i7.f6.n(-1, 44));
            j70Var.k();
        }
        if (!b5Var.f9052l.isEmpty()) {
            j70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 0), false);
        }
        j70Var.q(u51Var);
        j70Var.Z();
    }

    public static void W(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (!r5Var.G || b5Var.f9047f.isEmpty()) {
            return;
        }
        j70 j70Var = new j70(r5Var, r5Var.C, false, false);
        j70Var.f29601t = false;
        j70Var.Y = true;
        j70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        j70Var.R = true;
        j70Var.f29595p = new g3(j70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f9047f);
        Collections.sort(arrayList, new z3(r5Var, 2));
        u51 u51Var = new u51(r5Var, new a4(r5Var, strArr, arrayList, 2), new b4(r5Var, j70Var, 2), null);
        u51Var.U2.f29939r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        st stVar = new st(context, r5Var.resourceProvider);
        stVar.setTextSize(1, 16.0f);
        stVar.setInputType(573441);
        stVar.setRawInputType(573441);
        stVar.setHintTextColor(g6.v0(g6.A6, r5Var.resourceProvider));
        stVar.setCursorColor(g6.v0(g6.G6, r5Var.resourceProvider));
        stVar.setCursorSize(AndroidUtilities.dp(19.0f));
        stVar.setCursorWidth(1.5f);
        stVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        stVar.setTextColor(g6.v0(g6.E8, r5Var.resourceProvider));
        stVar.setBackground(null);
        frameLayout.addView(stVar, i7.f6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        stVar.addTextChangedListener(new ag.c0(2, strArr, u51Var));
        if (arrayList.size() > 8) {
            j70Var.r(frameLayout, i7.f6.n(-1, 44));
            j70Var.k();
        }
        if (!b5Var.f9050j.isEmpty()) {
            j70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 2), false);
        }
        j70Var.q(u51Var);
        j70Var.Z();
    }

    public static void X(r5 r5Var, Context context) {
        b5 b5Var = r5Var.d;
        if (!r5Var.G || b5Var.f9048g.isEmpty()) {
            return;
        }
        j70 j70Var = new j70(r5Var, r5Var.D, false, false);
        j70Var.f29601t = false;
        j70Var.Y = true;
        j70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        j70Var.R = true;
        j70Var.f29595p = new g3(j70Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(b5Var.f9048g);
        Collections.sort(arrayList, new z3(r5Var, 1));
        u51 u51Var = new u51(r5Var, new a4(r5Var, strArr, arrayList, 1), new b4(r5Var, j70Var, 1), null);
        u51Var.U2.f29939r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(r5Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        st stVar = new st(context, r5Var.resourceProvider);
        stVar.setTextSize(1, 16.0f);
        stVar.setInputType(573441);
        stVar.setRawInputType(573441);
        stVar.setHintTextColor(g6.v0(g6.A6, r5Var.resourceProvider));
        stVar.setCursorColor(g6.v0(g6.G6, r5Var.resourceProvider));
        stVar.setCursorSize(AndroidUtilities.dp(19.0f));
        stVar.setCursorWidth(1.5f);
        stVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        stVar.setTextColor(g6.v0(g6.E8, r5Var.resourceProvider));
        stVar.setBackground(null);
        frameLayout.addView(stVar, i7.f6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        stVar.addTextChangedListener(new ag.c0(3, strArr, u51Var));
        if (arrayList.size() > 8) {
            j70Var.r(frameLayout, i7.f6.n(-1, 44));
            j70Var.k();
        }
        if (!b5Var.f9051k.isEmpty()) {
            j70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new c4(r5Var, 1), false);
        }
        j70Var.q(u51Var);
        j70Var.Z();
    }

    public static void Y(r5 r5Var, w41 w41Var) {
        Object obj = w41Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            jh.h5 h5Var = new jh.h5(r5Var.getParentActivity(), r5Var.currentAccount, r5Var.f9355b, r5Var.resourceProvider, null);
            h5Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, r5Var.d);
            h5Var.K0 = new e4(r5Var);
            r5Var.showDialog(h5Var);
        }
    }

    public static org.telegram.ui.ActionBar.l Z(r5 r5Var) {
        return r5Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l a0(r5 r5Var) {
        return r5Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l b0(r5 r5Var) {
        return r5Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l c0(r5 r5Var) {
        return r5Var.actionBar;
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            this.f9361s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f9);
            u10.d(this.f9360r, f9);
        }
    }

    @Override
    public final View createView(final Context context) {
        qg.c cVar = new qg.c();
        this.H = cVar;
        int i10 = g6.f23062d6;
        cVar.a(getThemedColor(i10));
        this.I = new lg.a(this.H);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f9358f = h2Var;
        lVar.setBackButtonDrawable(h2Var);
        this.f9358f.f23476k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 1));
        this.actionBar.setTitle(this.f9356c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = g6.G6;
        lVar2.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.B(getThemedColor(g6.f23452z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(g6.f23450z6));
        j4 j4Var = new j4(this, context, 0);
        int v = g6.v(g6.v0(i10, this.resourceProvider), g6.l1(0.04f, g6.v0(i11, this.resourceProvider)));
        j4Var.setBackgroundColor(v);
        this.fragmentView = j4Var;
        x9 x9Var = new x9(context, this.currentAccount, this.resourceProvider);
        x9Var.d = true;
        h6.a(x9Var);
        x9Var.setOnClickListener(new ag.n(14, this, x9Var));
        this.actionBar.addView(x9Var, i7.f6.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? u51Var = new u51(this, new bg.t1(this, 12), new e4(this), new e4(this));
        this.f9359n = u51Var;
        u51Var.U2.f29939r = false;
        u51Var.setSpanCount(3);
        this.f9359n.j(new cg.g2(this, 4));
        this.f9359n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f9359n.setClipToPadding(false);
        j4Var.addView(this.f9359n, i7.f6.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        j4Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final r5 f9156b;

            {
                this.f9156b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b5 b5Var = this.f9156b.d;
                        b5Var.f9051k.clear();
                        b5Var.f9050j.clear();
                        b5Var.f9052l.clear();
                        b5Var.h();
                        return;
                    default:
                        b5 b5Var2 = this.f9156b.d;
                        b5Var2.f9051k.clear();
                        b5Var2.f9050j.clear();
                        b5Var2.f9052l.clear();
                        b5Var2.h();
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        frameLayout.addView(g10, i7.f6.e(-1, -2, 23));
        t9 t9Var = new t9(context);
        t9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        g10.addView(t9Var, i7.f6.q(130, 130, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.b.m(g6.G6, c6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        g10.addView(textView, i7.f6.t(-2, -2, 17, 32, 12, 32, 9));
        y80 y80Var = new y80(context, null);
        y80Var.setTextColor(g6.v0(g6.A6, c6Var));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setGravity(17);
        y80Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        y80Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        g10.addView(y80Var, i7.f6.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = g6.Oh;
        textView2.setTextColor(g6.v0(i12, c6Var));
        textView2.setBackground(g6.Y(g6.l1(0.1f, g6.v0(i12, c6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.b.e(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        h6.a(textView2);
        g10.addView(textView2, i7.f6.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f9362w = frameLayout;
        this.f9363x = false;
        frameLayout.setAlpha(0.0f);
        this.f9362w.setScaleX(0.95f);
        this.f9362w.setScaleY(0.95f);
        this.f9362w.setVisibility(8);
        j4Var.addView(this.f9362w, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.A = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.A.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f9364y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f9364y.addView(this.A);
        this.f9364y.setBackgroundColor(v);
        this.f9364y.setClipChildren(false);
        j4Var.addView(this.f9364y, i7.f6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(g6.f23063d7));
        this.h.setAlpha(0.0f);
        j4Var.addView(this.h, i7.f6.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final hp hpVar = new hp(context, 24, this.resourceProvider);
        hpVar.b(g6.f23135h7, g6.f23171j7, g6.f23190k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(false, false);
        hpVar.setDrawBackgroundAsArc(10);
        hpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        hpVar.setScaleX(0.8f);
        hpVar.setScaleY(0.8f);
        linearLayout2.addView(hpVar, i7.f6.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        org.telegram.ui.b.m(g6.f23169j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, i7.f6.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = g6.Oh;
        int v10 = g6.v(themedColor, g6.l1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(g6.i0(dp, dp, dp, dp, 0, v10, v10));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f9361s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f9361s;
        ng.d c3 = this.I.c(frameLayout3, null, false);
        c3.n(pg.a.k(this.resourceProvider));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c3);
        this.f9361s.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f9189b;

            {
                this.f9189b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f9189b.d;
                        if (b5Var != null) {
                            boolean z10 = !b5Var.f9058r;
                            b5Var.f9058r = z10;
                            hpVar.a(z10, true);
                            b5Var.h();
                            return;
                        }
                        return;
                    default:
                        final r5 r5Var = this.f9189b;
                        b5 b5Var2 = r5Var.d;
                        if (r5Var.G) {
                            j70 H = j70.H(r5Var, r5Var.B);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(a5.BY_PRICE.f9024a), new c4(r5Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(a5.BY_DATE.f9024a), new c4(r5Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(a5.BY_NUMBER.f9024a), new c4(r5Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final hp hpVar2 = hpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.f9058r) {
                                                b5Var3.f9058r = false;
                                                hpVar2.a(false, true);
                                                b5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.f9058r) {
                                                b5Var4.f9058r = true;
                                                hpVar2.a(true, true);
                                                b5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !b5Var2.f9058r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.f9058r) {
                                                b5Var3.f9058r = false;
                                                hpVar2.a(false, true);
                                                b5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.f9058r) {
                                                b5Var4.f9058r = true;
                                                hpVar2.a(true, true);
                                                b5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), b5Var2.f9058r);
                            H.f29601t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f9361s.addView(linearLayout2, i7.f6.c(-1.0f, -2));
        h6.b(this.f9361s, 0.04f, 1.5f);
        j4Var.addView(this.f9361s, i7.f6.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        s7 y8 = s7.y(this.currentAccount, true);
        if (y8.f12790e && !y8.s().k()) {
            this.f9361s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f9360r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f9360r;
        ng.d c6 = this.I.c(frameLayout5, null, false);
        c6.n(pg.a.k(this.resourceProvider));
        c6.o(AndroidUtilities.dp(8.0f));
        c6.p(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c6);
        j4Var.addView(this.f9360r, i7.f6.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new iq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i13));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v11 = g6.v(getThemedColor(i10), g6.l1(0.1f, getThemedColor(i13)));
        textView4.setBackground(g6.i0(dp2, dp2, dp2, dp2, 0, v11, v11));
        this.v.setGravity(17);
        this.f9360r.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f9156b;

            {
                this.f9156b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b5 b5Var = this.f9156b.d;
                        b5Var.f9051k.clear();
                        b5Var.f9050j.clear();
                        b5Var.f9052l.clear();
                        b5Var.h();
                        return;
                    default:
                        b5 b5Var2 = this.f9156b.d;
                        b5Var2.f9051k.clear();
                        b5Var2.f9050j.clear();
                        b5Var2.f9052l.clear();
                        b5Var2.h();
                        return;
                }
            }
        });
        this.f9360r.addView(this.v, i7.f6.c(-1.0f, -2));
        this.f9360r.setVisibility(8);
        h6.b(this.f9360r, 0.05f, 1.5f);
        s4 s4Var = new s4(context, this.resourceProvider);
        this.B = s4Var;
        s4Var.setSorting(this.d.f9056p);
        this.A.addView(this.B, i7.f6.t(-2, -2, 16, 0, 0, 6, 0));
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f9189b;

            {
                this.f9189b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        b5 b5Var = this.f9189b.d;
                        if (b5Var != null) {
                            boolean z10 = !b5Var.f9058r;
                            b5Var.f9058r = z10;
                            hpVar.a(z10, true);
                            b5Var.h();
                            return;
                        }
                        return;
                    default:
                        final r5 r5Var = this.f9189b;
                        b5 b5Var2 = r5Var.d;
                        if (r5Var.G) {
                            j70 H = j70.H(r5Var, r5Var.B);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(a5.BY_PRICE.f9024a), new c4(r5Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(a5.BY_DATE.f9024a), new c4(r5Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(a5.BY_NUMBER.f9024a), new c4(r5Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final hp hpVar2 = hpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.f9058r) {
                                                b5Var3.f9058r = false;
                                                hpVar2.a(false, true);
                                                b5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.f9058r) {
                                                b5Var4.f9058r = true;
                                                hpVar2.a(true, true);
                                                b5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !b5Var2.f9058r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            b5 b5Var3 = r5Var.d;
                                            if (b5Var3.f9058r) {
                                                b5Var3.f9058r = false;
                                                hpVar2.a(false, true);
                                                b5Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            b5 b5Var4 = r5Var.d;
                                            if (!b5Var4.f9058r) {
                                                b5Var4.f9058r = true;
                                                hpVar2.a(true, true);
                                                b5Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), b5Var2.f9058r);
                            H.f29601t = false;
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
        this.C = s4Var2;
        s4Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.A.addView(this.C, i7.f6.t(-2, -2, 16, 0, 0, 6, 0));
        this.C.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f9545b;

            {
                this.f9545b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r5.W(this.f9545b, context);
                        return;
                    case 1:
                        r5.X(this.f9545b, context);
                        return;
                    default:
                        r5.V(this.f9545b, context);
                        return;
                }
            }
        });
        s4 s4Var3 = new s4(context, this.resourceProvider);
        this.D = s4Var3;
        s4Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.A.addView(this.D, i7.f6.t(-2, -2, 16, 0, 0, 6, 0));
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f9545b;

            {
                this.f9545b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r5.W(this.f9545b, context);
                        return;
                    case 1:
                        r5.X(this.f9545b, context);
                        return;
                    default:
                        r5.V(this.f9545b, context);
                        return;
                }
            }
        });
        s4 s4Var4 = new s4(context, this.resourceProvider);
        this.E = s4Var4;
        s4Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.A.addView(this.E, i7.f6.t(-2, -2, 16, 0, 0, 0, 0));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final r5 f9545b;

            {
                this.f9545b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        r5.W(this.f9545b, context);
                        return;
                    case 1:
                        r5.X(this.f9545b, context);
                        return;
                    default:
                        r5.V(this.f9545b, context);
                        return;
                }
            }
        });
        n00 n00Var = new n00(getParentActivity());
        this.F = n00Var;
        j4Var.addView(n00Var, i7.f6.c(-1.0f, -1));
        d0(false, false);
        return j4Var;
    }

    public final void d0(boolean z10, boolean z11) {
        float f9;
        float f10;
        float f11;
        float f12;
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        float f13 = 1.0f;
        int i10 = 0;
        float f14 = 0.0f;
        if (z11) {
            this.f9364y.setVisibility(0);
            ViewPropertyAnimator animate = this.f9364y.animate();
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(45.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(f11);
            if (!z10) {
                f13 = 0.0f;
            }
            ViewPropertyAnimator alpha = translationY.alpha(f13);
            jr jrVar = jr.h;
            alpha.setInterpolator(jrVar).setDuration(420L).setListener(new h4(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(jrVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f9359n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(jrVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f9364y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f9364y;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f9);
        HorizontalScrollView horizontalScrollView3 = this.f9364y;
        if (!z10) {
            f13 = 0.0f;
        }
        horizontalScrollView3.setAlpha(f13);
        View view = this.h;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(45.0f);
        }
        view.setTranslationY(f10);
        k4 k4Var = this.f9359n;
        if (!z10) {
            f14 = -AndroidUtilities.dp(39.0f);
        }
        k4Var.setTranslationY(f14);
    }

    public final void e0(boolean z10) {
        String string;
        String string2;
        String string3;
        String formatPluralStringComma;
        k51 k51Var;
        b5 b5Var = this.d;
        int i10 = b5Var.f9046e;
        HashSet hashSet = b5Var.f9052l;
        ArrayList arrayList = b5Var.h;
        HashSet hashSet2 = b5Var.f9051k;
        ArrayList arrayList2 = b5Var.f9048g;
        HashSet hashSet3 = b5Var.f9050j;
        ArrayList arrayList3 = b5Var.f9047f;
        if (i10 > 12) {
            d0(true, true);
        }
        k4 k4Var = this.f9359n;
        boolean z11 = false;
        if (k4Var != null && (k51Var = k4Var.U2) != null) {
            k51Var.N(true);
            if (z10) {
                this.f9359n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setTitle(this.f9356c);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = b5Var.f9046e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            lVar2.setSubtitle(formatPluralStringComma);
        }
        s4 s4Var = this.B;
        if (s4Var != null) {
            s4Var.setSorting(b5Var.f9056p);
        }
        if (this.C != null) {
            int size = arrayList3.size() - hashSet3.size();
            s4 s4Var2 = this.C;
            if (size > 0 && size != arrayList3.size()) {
                string3 = LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size);
            } else {
                string3 = LocaleController.getString(R.string.Gift2ResaleFilterModel);
            }
            s4Var2.setValue(string3);
        }
        if (this.D != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            s4 s4Var3 = this.D;
            if (size2 > 0 && size2 != arrayList2.size()) {
                string2 = LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2);
            } else {
                string2 = LocaleController.getString(R.string.Gift2ResaleFilterBackdrop);
            }
            s4Var3.setValue(string2);
        }
        if (this.E != null) {
            int size3 = arrayList.size() - hashSet.size();
            s4 s4Var4 = this.E;
            if (size3 > 0 && size3 != arrayList.size()) {
                string = LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3);
            } else {
                string = LocaleController.getString(R.string.Gift2ResaleFilterSymbol);
            }
            s4Var4.setValue(string);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.f9359n.getChildCount()) {
                break;
            } else if (this.f9359n.getChildAt(i12) instanceof p00) {
                b5Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((b5Var.f9060t || b5Var.f9046e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f9354a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = g6.w0(null, g6.f23062d6, false);
            if (this.actionBar.s()) {
                w02 = g6.w0(null, g6.f23403w8, false);
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
    public final void z(float f9, int i10) {
    }
}
