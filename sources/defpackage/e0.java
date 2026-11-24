package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e0 extends mz0 implements jm7 {
    public final TL_aicompose.AiComposeTone S1;
    public final id T1;
    public final ImageView U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final TextView X1;
    public final FrameLayout Y1;
    public final FrameLayout Z1;
    public final b61 a2;
    public l7c b2;
    public int c2;
    public final TL_aicompose.aiComposeToneExample[] d2;
    public int e2;

    public e0(Context context, TL_aicompose.AiComposeTone aiComposeTone, ylb ylbVar) {
        super(context, null, false, false, 2, ylbVar);
        int i;
        this.c2 = 0;
        id P1 = oc7.r1(this.a).P1();
        this.T1 = P1;
        P1.b();
        this.S1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[oc7.r1(this.a).l4.T.f()];
        this.d2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.U1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231273);
        int i2 = cmb.F6;
        anb.s(imageView, i2, ylbVar, PorterDuff.Mode.SRC_ATOP);
        fg0 f0 = cmb.f0(cmb.p1(0.1f, cmb.v0(i2, this.J0)), 1, -1);
        wmb K = anb.K(0.1f, i2);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, K, ylbVar);
        this.b.addView(imageView, qoe.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        rve.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new a0(this, (byte) 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = gm.L(100.0f);
        int i3 = cmb.c6;
        ShapeDrawable K2 = cmb.K(L, cmb.v0(i3, ylbVar));
        wmb M = anb.M(i3);
        frameLayout2.setBackground(K2);
        anb.j(frameLayout2, K2, M, null, ylbVar);
        frameLayout.addView(frameLayout2, qoe.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        bf0Var.setAnimatedEmojiDrawable(new vm(4, this.a, aiComposeTone.emoji_id));
        frameLayout2.addView(bf0Var, qoe.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.W1 = textView;
        td4.x(textView, i2, ylbVar, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.X1 = textView2;
        anb.X(textView2, i2, ylbVar);
        textView2.setTextSize(1, 14.0f);
        hg9.p(textView2, 17, null, 2131754966);
        this.o1.setTitle(aiComposeTone.title);
        int i4 = cmb.Z6;
        this.b0 = i4;
        s0(cmb.v0(i4, this.J0));
        r59 r59Var = this.n1;
        int i5 = this.u0;
        r59Var.setPadding(i5, 0, i5, gm.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new u(this, (byte) 1));
        this.F1 = false;
        this.E1 = gm.L(36.0f);
        this.u1 = 0.35f;
        this.I1 = true;
        d0 d0Var = new d0(this);
        d0Var.m = false;
        d0Var.C = false;
        d0Var.o(d53.h);
        d0Var.n(350L);
        this.n1.setItemAnimator(d0Var);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.setPadding(gm.L(16.0f), gm.L(6.0f), gm.L(16.0f), gm.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, cmb.v0(i4, this.J0)), cmb.v0(i4, this.J0), cmb.v0(i4, this.J0)}));
        FrameLayout.LayoutParams e = qoe.e(-1, -2, 80);
        int i6 = e.leftMargin;
        int i7 = this.u0;
        e.leftMargin = i6 + i7;
        e.rightMargin += i7;
        this.b.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i8 = d.leftMargin;
        int i9 = this.u0;
        d.leftMargin = i8 + i9;
        d.rightMargin += i9;
        this.b.addView(frameLayout4, d);
        b61 i10 = mlb.i(24, ylbVar, context, true);
        this.a2 = i10;
        if (Y0()) {
            i = 2131754980;
        } else {
            i = 2131755005;
        }
        i10.setText(jb6.M0(i, null));
        i10.setOnClickListener(new b0(this, aiComposeTone, ylbVar, (byte) 0));
        frameLayout3.addView(i10, qoe.e(-1, 48, 119));
        this.b2.O(false);
    }

    public static SpannableStringBuilder Z0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = gm.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131748536, null));
            ta6 ta6Var = new ta6(null, L, 0, null);
            ta6Var.f = gm.L(6.0f);
            ta6Var.h = 0.5f;
            ta6Var.n = true;
            spannableStringBuilder.setSpan(ta6Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new f(this, (byte) 1), this.J0);
        this.b2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }

    @Override
    public final void L0(float f) {
        iz0 iz0Var = this.o1;
        lka titleTextView = iz0Var.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
        float translationY = iz0Var.getTranslationY() + gm.m;
        ImageView imageView = this.U1;
        imageView.setTranslationY(((1.0f - f) * gm.L(28.0f)) + (((iz0Var.getHeight() - gm.m) - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean Y0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i = 0;
            while (true) {
                id idVar = this.T1;
                if (i >= idVar.b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) idVar.b.get(i);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).id == tL_aiComposeTone.id) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == nm7.b4) {
            if (Y0()) {
                i3 = 2131754980;
            } else {
                i3 = 2131755005;
            }
            this.a2.setText(jb6.M0(i3, null));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        nm7.f(this.a).n(this, nm7.b4);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (v0 != this.e2) {
                this.e2 = v0;
                s0(v0);
                this.Y1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        nm7.f(this.a).b(this, nm7.b4);
    }
}
