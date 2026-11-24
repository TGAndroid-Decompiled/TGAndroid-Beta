package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class w1b extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public boolean e;
    public CharSequence f;
    public int h;
    public int n;
    public CharSequence r;
    public int s;
    public final ylb w;

    public w1b(Context context, boolean z, boolean z2, ylb ylbVar, boolean z3) {
        super(context);
        wmb M;
        float f;
        float f2;
        ViewGroup.LayoutParams d;
        wmb M2;
        int p1;
        int i;
        wmb K;
        wmb K2;
        wmb M3;
        ViewGroup.LayoutParams d2;
        wmb M4;
        float f3;
        ViewGroup.LayoutParams d3;
        float f4;
        float f5;
        float f6;
        this.w = ylbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        if (z3) {
            M = anb.g(cmb.Ml, 153);
        } else {
            M = anb.M(cmb.Kf);
        }
        anb.Y(textView, M, ylbVar);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z2) {
            if (z) {
                f5 = 5.0f;
            } else {
                f5 = 15.0f;
            }
            if (z) {
                f6 = 15.0f;
            } else {
                f6 = 25.0f;
            }
            d = qoe.i(-2.0f, -2.0f, 8388659, f5, 5.0f, f6, 0.0f);
        } else {
            if (z) {
                f = 5.0f;
            } else {
                f = 15.0f;
            }
            if (z) {
                f2 = 15.0f;
            } else {
                f2 = 25.0f;
            }
            d = qoe.d(-2, -2.0f, 51, f, 5.0f, f2, 0.0f);
        }
        addView(linearLayout, d);
        TextView m = wi8.m(linearLayout, textView, qoe.p(-2, -2, 1.0f, 16), context);
        this.c = m;
        if (z3) {
            M2 = anb.g(cmb.Ml, 153);
        } else {
            M2 = anb.M(cmb.Kf);
        }
        anb.Y(m, M2, ylbVar);
        m.setTextSize(1, 11.0f);
        m.setTypeface(gm.o());
        m.setEllipsize(truncateAt);
        m.setPadding(gm.L(6.0f), 0, gm.L(6.33f), 0);
        int L = gm.L(9.0f);
        if (z3) {
            int i2 = cmb.Ml;
            i = on2.p(cmb.v0(i2, ylbVar), 12);
            p1 = on2.p(cmb.v0(i2, ylbVar), 20);
        } else {
            int i3 = cmb.Kf;
            int p12 = cmb.p1(0.1f, cmb.v0(i3, ylbVar));
            p1 = cmb.p1(0.24f, cmb.v0(i3, ylbVar));
            i = p12;
        }
        fg0 i0 = cmb.i0(L, L, L, L, i, p1, p1);
        if (z3) {
            int i4 = cmb.Ml;
            K = anb.g(i4, 12);
            K2 = anb.g(i4, 20);
        } else {
            int i5 = cmb.Kf;
            K = anb.K(0.1f, i5);
            K2 = anb.K(0.24f, i5);
        }
        m.setBackground(i0);
        anb.j(m, i0, K, K2, ylbVar);
        m.setGravity(17);
        m.setSingleLine(true);
        rve.a(m);
        linearLayout.addView(m, qoe.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        m.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        if (z3) {
            M3 = anb.g(cmb.Ml, 153);
        } else {
            M3 = anb.M(cmb.Kf);
        }
        anb.Y(textView2, M3, ylbVar);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z2) {
            d2 = qoe.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d2 = qoe.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d2);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z3) {
            M4 = anb.g(cmb.Ml, 153);
        } else {
            M4 = anb.M(cmb.Mf);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i6 = M4.a;
        int i7 = M4.b;
        byte b = M4.c;
        float f7 = M4.d;
        int P = anb.P(i6, i7, b, f7, ylbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        anb.N(imageView, 5, i6, i7, b, f7, ylbVar, P, porterDuffColorFilter).h = mode;
        int i8 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i8, ylbVar), 3, -1);
        wmb M5 = anb.M(i8);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M5, ylbVar);
        if (z2) {
            if (z) {
                f4 = 0.0f;
            } else {
                f4 = 10.0f;
            }
            d3 = qoe.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f4, 0.0f);
        } else {
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 10.0f;
            }
            d3 = qoe.d(24, 24.0f, 53, 0.0f, 0.0f, f3, 0.0f);
        }
        imageView.setTranslationY(gm.L(4.0f));
        addView(imageView, d3);
    }

    public final void a(int i, CharSequence charSequence) {
        b(charSequence, i, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i, String str, int i2, int i3) {
        this.f = charSequence;
        this.h = i2;
        this.n = i3;
        TextView textView = this.a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.e = false;
            if (i3 != 0) {
                d();
            } else {
                textView.setText(gw3.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
            }
            if (i != 0) {
                imageView.setImageResource(i);
                imageView.setContentDescription(str);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.c.setVisibility(8);
    }

    public final void c(int i, CharSequence charSequence) {
        int i2;
        this.r = charSequence;
        this.s = i;
        if (charSequence != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.b.setVisibility(i2);
        e();
    }

    public final void d() {
        if (this.f != null && this.n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f);
            try {
                do4 do4Var = new do4(cmb.Lf, this.w);
                int i = this.h;
                spannableStringBuilder.setSpan(do4Var, i, this.n + i, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.a;
            textView.setText(gw3.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public final void e() {
        ylb ylbVar = this.w;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new v1b(cmb.Lf, ylbVar), 0, this.s, 33);
                spannableStringBuilder.setSpan(new v1b(cmb.Kf, ylbVar), this.s, this.r.length(), 33);
            } catch (Exception unused) {
            }
            this.b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override
    public final void invalidate() {
        this.a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view == this.b) {
            i2 = hg9.v(16.0f, this.a.getMeasuredWidth(), i2);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 1073741825);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(jb6.M0(2131751194, null));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i) {
        this.a.setTextColor(i);
    }
}
