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
public final class e0 extends fy0 implements gk7 {
    public final TL_aicompose.AiComposeTone S1;
    public final ic T1;
    public final ImageView U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final TextView X1;
    public final FrameLayout Y1;
    public final FrameLayout Z1;
    public final u41 a2;
    public l5c b2;
    public int c2;
    public final TL_aicompose.aiComposeToneExample[] d2;
    public int e2;

    public e0(Context context, TL_aicompose.AiComposeTone aiComposeTone, wjb wjbVar) {
        super(context, null, false, false, 2, wjbVar);
        int i;
        this.c2 = 0;
        ic O1 = na7.q1(this.a).O1();
        this.T1 = O1;
        O1.b();
        this.S1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[na7.q1(this.a).k4.T.f()];
        this.d2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.U1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        int i2 = bkb.F6;
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_ATOP);
        ff0 f0 = bkb.f0(bkb.p1(0.1f, bkb.v0(i2, this.J0)), 1, -1);
        vkb K = zkb.K(0.1f, i2);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, K, wjbVar);
        this.b.addView(imageView, nme.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        ote.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new a0(this, (byte) 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = gl.L(100.0f);
        int i3 = bkb.c6;
        ShapeDrawable K2 = bkb.K(L, bkb.v0(i3, wjbVar));
        vkb M = zkb.M(i3);
        frameLayout2.setBackground(K2);
        zkb.j(frameLayout2, K2, M, null, wjbVar);
        frameLayout.addView(frameLayout2, nme.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        be0 be0Var = new be0(context);
        be0Var.setAnimatedEmojiDrawable(new vl(4, this.a, aiComposeTone.emoji_id));
        frameLayout2.addView(be0Var, nme.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.W1 = textView;
        tb4.w(textView, i2, wjbVar, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.X1 = textView2;
        zkb.X(textView2, i2, wjbVar);
        textView2.setTextSize(1, 14.0f);
        de9.q(textView2, 17, null, 2131754966);
        this.o1.setTitle(aiComposeTone.title);
        int i4 = bkb.Z6;
        this.b0 = i4;
        s0(bkb.v0(i4, this.J0));
        o39 o39Var = this.n1;
        int i5 = this.u0;
        o39Var.setPadding(i5, 0, i5, gl.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new u(this, (byte) 1));
        this.F1 = false;
        this.E1 = gl.L(36.0f);
        this.u1 = 0.35f;
        this.I1 = true;
        d0 d0Var = new d0(this);
        d0Var.m = false;
        d0Var.C = false;
        d0Var.o(s33.h);
        d0Var.n(350L);
        this.n1.setItemAnimator(d0Var);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.setPadding(gl.L(16.0f), gl.L(6.0f), gl.L(16.0f), gl.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, bkb.v0(i4, this.J0)), bkb.v0(i4, this.J0), bkb.v0(i4, this.J0)}));
        FrameLayout.LayoutParams e = nme.e(-1, -2, 80);
        int i6 = e.leftMargin;
        int i7 = this.u0;
        e.leftMargin = i6 + i7;
        e.rightMargin += i7;
        this.b.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i8 = d.leftMargin;
        int i9 = this.u0;
        d.leftMargin = i8 + i9;
        d.rightMargin += i9;
        this.b.addView(frameLayout4, d);
        u41 i10 = yjb.i(24, wjbVar, context, true);
        this.a2 = i10;
        if (Y0()) {
            i = 2131754980;
        } else {
            i = 2131755005;
        }
        i10.setText(k96.M0(i, null));
        i10.setOnClickListener(new b0(this, aiComposeTone, wjbVar, (byte) 0));
        frameLayout3.addView(i10, nme.e(-1, 48, 119));
        this.b2.O(false);
    }

    public static SpannableStringBuilder Z0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = gl.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) k96.M0(2131748587, null));
            u86 u86Var = new u86(null, L, 0, null);
            u86Var.f = gl.L(6.0f);
            u86Var.h = 0.5f;
            u86Var.n = true;
            spannableStringBuilder.setSpan(u86Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new f(this, (byte) 1), this.J0);
        this.b2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
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
        by0 by0Var = this.o1;
        jia titleTextView = by0Var.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
        float translationY = by0Var.getTranslationY() + gl.m;
        ImageView imageView = this.U1;
        imageView.setTranslationY(((1.0f - f) * gl.L(28.0f)) + (((by0Var.getHeight() - gl.m) - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean Y0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i = 0;
            while (true) {
                ic icVar = this.T1;
                if (i >= icVar.b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) icVar.b.get(i);
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
        if (i == kk7.a4) {
            if (Y0()) {
                i3 = 2131754980;
            } else {
                i3 = 2131755005;
            }
            this.a2.setText(k96.M0(i3, null));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        kk7.f(this.a).n(this, kk7.a4);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = bkb.v0(bkb.Z6, this.J0);
            if (v0 != this.e2) {
                this.e2 = v0;
                s0(v0);
                this.Y1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        kk7.f(this.a).b(this, kk7.a4);
    }
}
