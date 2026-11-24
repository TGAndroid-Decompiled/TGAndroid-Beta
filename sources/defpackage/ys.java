package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ys extends FrameLayout implements jm7 {
    public final int a;
    public final l66 b;
    public final Runnable c;

    public ys(Context context, int i, ylb ylbVar, Runnable runnable, xf2 xf2Var) {
        super(context);
        int i2;
        this.a = i;
        this.c = runnable;
        bw2.r(i).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = gm.L(80.0f);
        int i3 = cmb.J7;
        ShapeDrawable K = cmb.K(L, cmb.v0(i3, ylbVar));
        wmb M = anb.M(i3);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, ylbVar);
        imageView.setImageResource(2131231606);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (xf2Var != null) {
            i2 = 14;
        } else {
            i2 = 0;
        }
        linearLayout.addView(imageView, qoe.t(80, 80, 49, 0, i2, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        textView.setText(jb6.M0(2131754132, null));
        linearLayout.addView(textView, qoe.t(-1, -2, 1, 32, 0, 32, 9));
        l66 l66Var = new l66(context, null);
        this.b = l66Var;
        l66Var.setTextSize(1, 14.0f);
        anb.X(l66Var, cmb.y6, ylbVar);
        l66Var.setGravity(1);
        b();
        linearLayout.addView(l66Var, qoe.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(2131232058, jb6.N0("ArchiveHintSection1"), jb6.N0("ArchiveHintSection1Info"), ylbVar), qoe.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232059, jb6.N0("ArchiveHintSection2"), jb6.N0("ArchiveHintSection2Info"), ylbVar), qoe.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232061, jb6.N0("ArchiveHintSection3"), jb6.N0("ArchiveHintSection3Info"), ylbVar), qoe.t(-1, -2, 7, 32, 0, 32, 16));
        if (xf2Var != null) {
            b61 i4 = mlb.i(24, ylbVar, context, true);
            i4.i(jb6.N0("GotIt"), false, true);
            i4.setOnClickListener(new j1(xf2Var, (byte) 10));
            linearLayout.addView(i4, qoe.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i, String str, String str2, ylb ylbVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i2 = cmb.i5;
        anb.s(imageView, i2, ylbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i);
        frameLayout.addView(imageView, qoe.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        anb.X(textView, i2, ylbVar);
        textView.setTypeface(gm.o());
        textView.setTextSize(0, gm.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, qoe.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        anb.X(textView2, cmb.y6, ylbVar);
        textView2.setTextSize(0, gm.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, qoe.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, qoe.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = bw2.r(this.a).Y;
        if (globalPrivacySettings != null) {
            z = globalPrivacySettings.keep_archived_unmuted;
        } else {
            z = true;
        }
        if (z) {
            str = "ArchiveHintSubtitle";
        } else {
            str = "ArchiveHintSubtitleUnmutedMove";
        }
        String N0 = jb6.N0(str);
        int i = cmb.Wc;
        SpannableStringBuilder N2 = gm.N2(N0, i, 0, this.c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(2131232065).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        pn2 pn2Var = new pn2(0, mutate);
        pn2Var.a(i);
        pn2Var.c(gm.L(18.0f));
        pn2Var.F = gm.L(11.0f);
        pn2Var.r = -gm.L(5.0f);
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        this.b.setText(gm.G2(N2, spannableString, ">"));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.k0) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.k0);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.k0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(400.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
    }
}
