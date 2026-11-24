package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class gh8 extends FrameLayout {
    public final fn a;
    public final TextView b;
    public final mh2 c;
    public final ih8 d;

    public gh8(ih8 ih8Var, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.d = ih8Var;
        anb.h(cmb.h5, null, this);
        fn fnVar = new fn(getContext());
        this.a = fnVar;
        fnVar.setTextSize(1, 14.0f);
        fnVar.setTypeface(gm.o());
        int i7 = cmb.e7;
        anb.X(fnVar, i7, null);
        fnVar.setSingleLine(true);
        fnVar.setEllipsize(TextUtils.TruncateAt.END);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        fnVar.setGravity(i | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        anb.X(textView, i7, null);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        mh2 mh2Var = new mh2(this, getContext(), (byte) 3);
        this.c = mh2Var;
        mh2Var.setTextSize(gm.L(14.0f));
        anb.U(mh2Var, i7, null);
        if (jb6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        mh2Var.setGravity(i3);
        mh2Var.setOnClickListener(new m67(this, (byte) 25));
        boolean z = jb6.a0;
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
        addView(fnVar, qoe.d(-2, -1.0f, i8, i5, 0.0f, z ? 16 : 0, 0.0f));
        if (jb6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        addView(textView, qoe.d(-2, -1.0f, i6 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(mh2Var, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        fn fnVar = this.a;
        if (arrayList != null) {
            nm7.i(fnVar);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            hs6.h(arrayList, str, spannableStringBuilder2, -1);
            CharSequence m = gw3.m(spannableStringBuilder2, fnVar.getPaint().getFontMetricsInt(), false, null, 0);
            k47.A5(m, arrayList, fnVar.getPaint().getFontMetricsInt(), false);
            fnVar.setText(m);
        } else {
            fnVar.setText(gw3.m(str, fnVar.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i));
        if (jb6.a0) {
            spannableStringBuilder = new SpannableStringBuilder(aq1.n(i, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(td4.o(i, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new z5c(gm.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder);
        mh2 mh2Var = this.c;
        if (i3 == 0) {
            if (this.d.s1.quiz) {
                mh2Var.c(jb6.G(i2, "Answer", new Object[0]), z, true);
            } else {
                mh2Var.c(jb6.G(i2, "Vote", new Object[0]), z, true);
            }
        } else if (i3 == 1) {
            mh2Var.c(jb6.M0(2131746904, null), z, true);
        } else {
            mh2Var.c(jb6.M0(2131746908, null), z, true);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = jb6.a0;
        TextView textView = this.b;
        fn fnVar = this.a;
        if (z2) {
            int left = fnVar.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = fnVar.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), 1073741824);
        TextView textView = this.b;
        measureChildWithMargins(textView, i, 0, makeMeasureSpec, 0);
        mh2 mh2Var = this.c;
        measureChildWithMargins(mh2Var, i, 0, makeMeasureSpec, 0);
        int measuredWidth = mh2Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.a, i, gm.L(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(32.0f));
    }
}
