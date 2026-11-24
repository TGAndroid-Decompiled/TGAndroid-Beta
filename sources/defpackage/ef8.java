package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class ef8 extends FrameLayout {
    public final fm a;
    public final TextView b;
    public final yf2 c;
    public final gf8 d;

    public ef8(gf8 gf8Var, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.d = gf8Var;
        zkb.h(bkb.h5, null, this);
        fm fmVar = new fm(getContext());
        this.a = fmVar;
        fmVar.setTextSize(1, 14.0f);
        fmVar.setTypeface(gl.o());
        int i7 = bkb.e7;
        zkb.X(fmVar, i7, null);
        fmVar.setSingleLine(true);
        fmVar.setEllipsize(TextUtils.TruncateAt.END);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        fmVar.setGravity(i | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, i7, null);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        yf2 yf2Var = new yf2(this, getContext(), (byte) 3);
        this.c = yf2Var;
        yf2Var.setTextSize(gl.L(14.0f));
        zkb.U(yf2Var, i7, null);
        if (k96.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        yf2Var.setGravity(i3);
        yf2Var.setOnClickListener(new fr7(this, (byte) 22));
        boolean z = k96.a0;
        if (z) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i8 = i4 | 48;
        if (z) {
            i5 = 0;
        } else {
            i5 = 16;
        }
        addView(fmVar, nme.d(-2, -1.0f, i8, i5, 0.0f, z ? 16 : 0, 0.0f));
        if (k96.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        addView(textView, nme.d(-2, -1.0f, i6 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(yf2Var, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        fm fmVar = this.a;
        if (arrayList != null) {
            kk7.i(fmVar);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            hq6.h(arrayList, str, spannableStringBuilder2, -1);
            CharSequence m = vu3.m(spannableStringBuilder2, fmVar.getPaint().getFontMetricsInt(), false, null, 0);
            k27.A5(m, arrayList, fmVar.getPaint().getFontMetricsInt(), false);
            fmVar.setText(m);
        } else {
            fmVar.setText(vu3.m(str, fmVar.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i));
        if (k96.a0) {
            spannableStringBuilder = new SpannableStringBuilder(oo1.n(i, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(tb4.n(i, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new z3c(gl.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder);
        yf2 yf2Var = this.c;
        if (i3 == 0) {
            if (this.d.s1.quiz) {
                yf2Var.c(k96.G(i2, "Answer", new Object[0]), z, true);
            } else {
                yf2Var.c(k96.G(i2, "Vote", new Object[0]), z, true);
            }
        } else if (i3 == 1) {
            yf2Var.c(k96.M0(2131746978, null), z, true);
        } else {
            yf2Var.c(k96.M0(2131746982, null), z, true);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = k96.a0;
        TextView textView = this.b;
        fm fmVar = this.a;
        if (z2) {
            int left = fmVar.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = fmVar.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), 1073741824);
        TextView textView = this.b;
        measureChildWithMargins(textView, i, 0, makeMeasureSpec, 0);
        yf2 yf2Var = this.c;
        measureChildWithMargins(yf2Var, i, 0, makeMeasureSpec, 0);
        int measuredWidth = yf2Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.a, i, gl.L(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(32.0f));
    }
}
