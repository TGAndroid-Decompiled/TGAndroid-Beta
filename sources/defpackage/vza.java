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
public final class vza extends FrameLayout {
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
    public final wjb w;

    public vza(Context context, boolean z, boolean z2, wjb wjbVar, boolean z3) {
        super(context);
        vkb M;
        float f;
        float f2;
        ViewGroup.LayoutParams d;
        vkb M2;
        int p1;
        int i;
        vkb K;
        vkb K2;
        vkb M3;
        ViewGroup.LayoutParams d2;
        vkb M4;
        float f3;
        ViewGroup.LayoutParams d3;
        float f4;
        float f5;
        float f6;
        this.w = wjbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        if (z3) {
            M = zkb.g(bkb.Ml, 153);
        } else {
            M = zkb.M(bkb.Kf);
        }
        zkb.Y(textView, M, wjbVar);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.o());
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
            d = nme.i(-2.0f, -2.0f, 8388659, f5, 5.0f, f6, 0.0f);
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
            d = nme.d(-2, -2.0f, 51, f, 5.0f, f2, 0.0f);
        }
        addView(linearLayout, d);
        TextView m = ug8.m(linearLayout, textView, nme.p(-2, -2, 1.0f, 16), context);
        this.c = m;
        if (z3) {
            M2 = zkb.g(bkb.Ml, 153);
        } else {
            M2 = zkb.M(bkb.Kf);
        }
        zkb.Y(m, M2, wjbVar);
        m.setTextSize(1, 11.0f);
        m.setTypeface(gl.o());
        m.setEllipsize(truncateAt);
        m.setPadding(gl.L(6.0f), 0, gl.L(6.33f), 0);
        int L = gl.L(9.0f);
        if (z3) {
            int i2 = bkb.Ml;
            i = bm2.o(bkb.v0(i2, wjbVar), 12);
            p1 = bm2.o(bkb.v0(i2, wjbVar), 20);
        } else {
            int i3 = bkb.Kf;
            int p12 = bkb.p1(0.1f, bkb.v0(i3, wjbVar));
            p1 = bkb.p1(0.24f, bkb.v0(i3, wjbVar));
            i = p12;
        }
        ff0 i0 = bkb.i0(L, L, L, L, i, p1, p1);
        if (z3) {
            int i4 = bkb.Ml;
            K = zkb.g(i4, 12);
            K2 = zkb.g(i4, 20);
        } else {
            int i5 = bkb.Kf;
            K = zkb.K(0.1f, i5);
            K2 = zkb.K(0.24f, i5);
        }
        m.setBackground(i0);
        zkb.j(m, i0, K, K2, wjbVar);
        m.setGravity(17);
        m.setSingleLine(true);
        ote.a(m);
        linearLayout.addView(m, nme.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        m.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        if (z3) {
            M3 = zkb.g(bkb.Ml, 153);
        } else {
            M3 = zkb.M(bkb.Kf);
        }
        zkb.Y(textView2, M3, wjbVar);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z2) {
            d2 = nme.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d2 = nme.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d2);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z3) {
            M4 = zkb.g(bkb.Ml, 153);
        } else {
            M4 = zkb.M(bkb.Mf);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i6 = M4.a;
        int i7 = M4.b;
        byte b = M4.c;
        float f7 = M4.d;
        int P = zkb.P(i6, i7, b, f7, wjbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        zkb.N(imageView, 5, i6, i7, b, f7, wjbVar, P, porterDuffColorFilter).h = mode;
        int i8 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i8, wjbVar), 3, -1);
        vkb M5 = zkb.M(i8);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M5, wjbVar);
        if (z2) {
            if (z) {
                f4 = 0.0f;
            } else {
                f4 = 10.0f;
            }
            d3 = nme.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f4, 0.0f);
        } else {
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 10.0f;
            }
            d3 = nme.d(24, 24.0f, 53, 0.0f, 0.0f, f3, 0.0f);
        }
        imageView.setTranslationY(gl.L(4.0f));
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
                textView.setText(vu3.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
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
                cm4 cm4Var = new cm4(bkb.Lf, this.w);
                int i = this.h;
                spannableStringBuilder.setSpan(cm4Var, i, this.n + i, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.a;
            textView.setText(vu3.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public final void e() {
        wjb wjbVar = this.w;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new uza(bkb.Lf, wjbVar), 0, this.s, 33);
                spannableStringBuilder.setSpan(new uza(bkb.Kf, wjbVar), this.s, this.r.length(), 33);
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
            i2 = de9.w(16.0f, this.a.getMeasuredWidth(), i2);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 1073741825);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(k96.M0(2131751245, null));
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
