package gh;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pi0;
public final class i4 extends FrameLayout {
    public final org.telegram.ui.Components.s5 A;
    public final y3 B;
    public final LinearLayout C;
    public final org.telegram.ui.Components.j6 D;
    public final org.telegram.ui.Components.j6 E;
    public final pi0 F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final LinearLayout J;
    public fh.f2[] K;
    public final FrameLayout L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final FrameLayout O;
    public kh.x3 P;
    public final int[] Q;
    public final int[] R;
    public int S;
    public long T;
    public TLRPC.Document U;
    public String V;
    public ArrayList W;
    public final org.telegram.ui.ActionBar.b6 f8279a;
    public Utilities.Callback3 f8280a0;
    public final h4 f8281b;
    public Utilities.Callback2 f8282b0;
    public final ImageView f8283c;
    public Runnable f8284c0;
    public final c4[] d;
    public boolean f8285d0;
    public final c4 f8286e;
    public boolean f8287e0;
    public final e4 f8288f;
    public boolean f8289f0;
    public Runnable f8290g0;
    public final b4 h;
    public pi0 f8291h0;
    public SpannableStringBuilder f8292i0;
    public final g4[] f8293n;
    public final dh.u f8294r;
    public boolean f8295s;
    public final LinearLayout v;
    public final LinearLayout f8296w;
    public final x3[] f8297x;
    public final x3[] f8298y;

    public i4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        float f10;
        boolean z10;
        float f11;
        int i9;
        this.Q = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.R = new int[]{org.telegram.ui.ActionBar.f6.l1(0.08f, -1), org.telegram.ui.ActionBar.f6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f8279a = b6Var;
        h4 h4Var = new h4();
        this.f8281b = h4Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        h4Var.f8208g = mutate;
        setBackground(h4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        addView(frameLayout, g7.e6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f8283c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new w4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
        frameLayout.addView(imageView, g7.e6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new v3(this, 0));
        g7.g6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new w4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, g7.e6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new v3(this, 1));
        g7.g6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, g7.e6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        addView(frameLayout2, g7.e6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.N = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, g7.e6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.O = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, g7.e6.e(-1, -1, 119));
        dh.u uVar = new dh.u(context);
        this.f8294r = uVar;
        uVar.setGravity(17);
        uVar.setTextSize(1, 13.0f);
        uVar.setTextColor(-1);
        frameLayout2.addView(uVar, g7.e6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        gr grVar = gr.h;
        layoutTransition.setInterpolator(2, grVar);
        layoutTransition.setInterpolator(3, grVar);
        layoutTransition.setInterpolator(0, grVar);
        layoutTransition.setInterpolator(1, grVar);
        layoutTransition.setInterpolator(4, grVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f8296w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, grVar);
        layoutTransition2.setInterpolator(3, grVar);
        layoutTransition2.setInterpolator(0, grVar);
        layoutTransition2.setInterpolator(1, grVar);
        layoutTransition2.setInterpolator(4, grVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f8297x = new x3[4];
        this.f8298y = new x3[4];
        for (int i10 = 0; i10 < 4; i10++) {
            LinearLayout linearLayout3 = this.v;
            x3[] x3VarArr = this.f8297x;
            x3 x3Var = new x3(context);
            x3VarArr[i10] = x3Var;
            linearLayout3.addView(x3Var, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f8297x[i10].setOnClickListener(new v3(this, 2));
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout4 = this.v;
            x3[] x3VarArr2 = this.f8298y;
            x3 x3Var2 = new x3(context);
            x3VarArr2[i11] = x3Var2;
            linearLayout4.addView(x3Var2, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f8298y[i11].setOnClickListener(new v3(this, 3));
        }
        this.f8293n = new g4[4];
        this.d = new c4[6];
        int i12 = 0;
        for (int i13 = 6; i12 < i13; i13 = 6) {
            c4[] c4VarArr = this.d;
            if (i12 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new w4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, g7.e6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            o9Var.setImageResource(R.drawable.large_forge);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.45f;
            }
            o9Var.setAlpha(f11);
            if (z10) {
                i9 = 42;
            } else {
                i9 = 64;
            }
            frameLayout6.addView(o9Var, g7.e6.e(i9, z10 ? 42 : 64, 17));
            if (z10) {
                o9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                d4 d4Var = new d4(context);
                frameLayout5.f7916b = d4Var;
                d4Var.f7962e = AndroidUtilities.dp(37.0f);
                d4Var.f7959a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(d4Var, g7.e6.e(90, 90, 17));
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
                frameLayout5.f7915a = j6Var;
                j6Var.getDrawable().o(false, true, false);
                j6Var.setTypeface(AndroidUtilities.bold());
                j6Var.setTextColor(-1);
                j6Var.setTextSize(AndroidUtilities.dp(14.0f));
                j6Var.setGravity(17);
                j6Var.setText("0%");
                frameLayout6.addView(j6Var, g7.e6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            c4VarArr[i12] = frameLayout5;
            i12++;
        }
        this.f8286e = this.d[5];
        e4 e4Var = new e4(context);
        this.f8288f = e4Var;
        e4Var.setVisibility(8);
        e4Var.setAlpha(0.0f);
        addView(e4Var, g7.e6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        b4 b4Var = new b4(context, this.d);
        this.h = b4Var;
        addView(b4Var, g7.e6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.A = s5Var;
        s5Var.setTextSize(1, 12.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        s5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        s5Var.setGravity(17);
        s5Var.setTextColor(-1);
        if (this.W != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        s5Var.setAlpha(f10);
        s5Var.setBackground(new w4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
        g7.g6.b(s5Var, 0.02f, 1.2f);
        this.M.addView(s5Var, g7.e6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        s5Var.setOnClickListener(new bg.u1(19, this, b6Var));
        this.M.addView(this.v, g7.e6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.M.addView(this.f8296w, g7.e6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.C = linearLayout5;
        linearLayout5.setOrientation(1);
        y3 y3Var = new y3();
        this.B = y3Var;
        linearLayout5.setBackground(y3Var);
        y3Var.a(org.telegram.ui.ActionBar.f6.l1(0.08f, -1), org.telegram.ui.ActionBar.f6.l1(0.08f, -1));
        g7.g6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, g7.e6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new v3(this, 4));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.D = j6Var2;
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setGravity(17);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.75f, -1));
        j6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(j6Var2, g7.e6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.E = j6Var3;
        j6Var3.getDrawable().o(true, false, false);
        j6Var3.setGravity(17);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.75f, -1));
        j6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        j6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(j6Var3, g7.e6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, g7.e6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, g7.e6.t(-2, -2, 17, 0, 0, 0, 0));
        this.N.addView(linearLayout6, g7.e6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView g10 = org.telegram.ui.Cells.j2.g(this.N, textView3, g7.e6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.H = g10;
        g10.setTextSize(1, 13.0f);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setGravity(17);
        g10.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        g10.setBackground(new w4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
        TextView g11 = org.telegram.ui.Cells.j2.g(this.N, g10, g7.e6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        g11.setTextSize(1, 13.0f);
        g11.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.5f, -1));
        g11.setGravity(17);
        g11.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView g12 = org.telegram.ui.Cells.j2.g(this.N, g11, g7.e6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        g12.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        g12.setTextColor(-505270);
        g12.setTextSize(1, 20.0f);
        g12.setTypeface(AndroidUtilities.bold());
        g12.setGravity(17);
        TextView g13 = org.telegram.ui.Cells.j2.g(this.O, g12, g7.e6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.I = g13;
        g13.setTextColor(-17253);
        g13.setTextSize(1, 13.0f);
        g13.setGravity(17);
        this.O.addView(g13, g7.e6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.J = linearLayout7;
        linearLayout7.setOrientation(0);
        this.O.addView(linearLayout7, g7.e6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.K = null;
        d(true);
    }

    public final void a(int i9, long j10, TLRPC.Document document, String str) {
        g4[] g4VarArr;
        float f10;
        this.S = i9;
        this.T = j10;
        this.U = document;
        this.V = str;
        this.f8285d0 = false;
        this.f8289f0 = false;
        int i10 = 0;
        while (true) {
            g4VarArr = this.f8293n;
            if (i10 >= g4VarArr.length) {
                break;
            }
            g4 g4Var = g4VarArr[i10];
            if (g4Var != null) {
                AndroidUtilities.removeFromParent(g4Var);
            }
            i10++;
        }
        b4 b4Var = this.h;
        View[] viewArr = b4Var.f7842a;
        a4 a4Var = b4Var.D;
        if (a4Var != null) {
            a4Var.f7781e = true;
            a4Var.f7787l = false;
            a4Var.f7778a.D = null;
            b4Var.D = null;
        }
        ValueAnimator valueAnimator = b4Var.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            b4Var.C = null;
        }
        b4Var.B = -1;
        b4Var.A = 0.0f;
        b4Var.v.clear();
        b4Var.f7850w.clear();
        b4Var.f7851x.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            b4Var.f7852y[i11] = 0.0f;
        }
        b4Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            b4Var.addView(viewArr[i12], g7.e6.e(108, 108, 17));
        }
        Matrix.setIdentityM(b4Var.f7844c, 0);
        b4Var.f7845e = 0.0f;
        b4Var.d = 0.0f;
        b4Var.f7846f = true;
        g4 g4Var2 = new g4(getContext());
        g4VarArr[0] = g4Var2;
        addView(g4Var2, g7.e6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        g4 g4Var3 = new g4(getContext());
        g4VarArr[1] = g4Var3;
        addView(g4Var3, g7.e6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        g4 g4Var4 = new g4(getContext());
        g4VarArr[2] = g4Var4;
        addView(g4Var4, g7.e6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        g4 g4Var5 = new g4(getContext());
        g4VarArr[3] = g4Var5;
        addView(g4Var5, g7.e6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < g4VarArr.length; i13++) {
            g7.g6.a(g4VarArr[i13]);
            g4VarArr[i13].setClickable(true);
            g4VarArr[i13].setOnClickListener(new v3(this, 5));
        }
        d(false);
        this.f8285d0 = false;
        FrameLayout frameLayout = this.M;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.C;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.N;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.O;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.L;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        if (this.f8295s) {
            f10 = 0.0f;
        } else if (this.W != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        this.A.setAlpha(f10);
        e4 e4Var = this.f8288f;
        e4Var.setVisibility(8);
        e4Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.j6 j6Var = this.D;
        j6Var.setText(string);
        j6Var.setTranslationY(0.0f);
        this.E.setAlpha(1.0f);
        GiftAuctionController.getInstance(i9).requestAuctionUpgrades(j10, new w3(this, j10, j10, 0));
    }

    public final void b(x3 x3Var) {
        if (x3Var.d != null) {
            c(x3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(x3Var.f9148f * 100.0f), x3Var.d.name)));
        } else if (x3Var.f9147e != null) {
            c(x3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(x3Var.f9148f * 100.0f), x3Var.f9147e.name)));
        }
    }

    public final void c(x3 x3Var, SpannableStringBuilder spannableStringBuilder) {
        float f10;
        float f11;
        kh.x3 x3Var2 = this.P;
        View view = null;
        if (x3Var2 != null) {
            x3Var2.e(true);
            this.P = null;
        }
        if (!this.f8285d0 && !this.f8289f0) {
            if (x3Var.getParent() instanceof View) {
                view = (View) x3Var.getParent();
            }
            if (view != null) {
                f10 = view.getX();
            } else {
                f10 = 0.0f;
            }
            float x10 = x3Var.getX() + f10;
            if (view != null) {
                f11 = view.getY();
            } else {
                f11 = 0.0f;
            }
            float y10 = x3Var.getY() + f11;
            kh.x3 x3Var3 = new kh.x3(getContext(), 3);
            this.P = x3Var3;
            x3Var3.q(true);
            this.P.t(spannableStringBuilder);
            kh.x3 x3Var4 = this.P;
            x3Var4.h = kh.x3.a(x3Var4.getText(), this.P.getTextPaint());
            kh.x3 x3Var5 = this.P;
            x3Var5.G = Layout.Alignment.ALIGN_CENTER;
            x3Var5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.P, g7.e6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.P.setTranslationY(y10 - AndroidUtilities.dp(100.0f));
            this.P.n(0.0f, ((x3Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.P.v();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: gh.i4.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i9 = 0;
        while (true) {
            g4[] g4VarArr = this.f8293n;
            if (i9 >= g4VarArr.length) {
                return null;
            }
            g4 g4Var = g4VarArr[i9];
            if (g4Var != null) {
                TL_stars.StarGift starGift2 = g4Var.h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        return null;
                    }
                    return starGift2;
                }
            }
            i9++;
        }
    }

    public int getGiftsSelectedCount() {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            g4[] g4VarArr = this.f8293n;
            if (i9 < g4VarArr.length) {
                g4 g4Var = g4VarArr[i9];
                if (g4Var != null) {
                    TL_stars.StarGift starGift = g4Var.h;
                    if (starGift == null) {
                        starGift = null;
                    }
                    if (starGift != null) {
                        i10++;
                    }
                }
                i9++;
            } else {
                return i10;
            }
        }
    }

    public int getGiftsSuccessChance() {
        TL_stars.StarGift starGift;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            g4[] g4VarArr = this.f8293n;
            if (i9 < g4VarArr.length) {
                g4 g4Var = g4VarArr[i9];
                if (g4Var != null) {
                    TL_stars.StarGift starGift2 = g4Var.h;
                    if (starGift2 != null) {
                        starGift = starGift2;
                    } else {
                        starGift = null;
                    }
                    if (starGift != null) {
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        i10 += starGift2.craft_chance_permille;
                    }
                }
                i9++;
            } else {
                return i10;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setOnAddGift(Utilities.Callback2<Utilities.Callback<TL_stars.StarGift>, Boolean> callback2) {
        this.f8282b0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f8284c0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f8280a0 = callback3;
    }
}
