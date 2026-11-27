package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class si8 extends FrameLayout {
    public final gm a;
    public final TextView b;
    public final qg2 c;
    public final ui8 d;

    public si8(ui8 ui8Var, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.d = ui8Var;
        yob.h(aob.i5, null, this);
        gm gmVar = new gm(getContext());
        this.a = gmVar;
        gmVar.setTextSize(1, 14.0f);
        gmVar.setTypeface(hl.o());
        int i7 = aob.f7;
        yob.X(gmVar, i7, null);
        gmVar.setSingleLine(true);
        gmVar.setEllipsize(TextUtils.TruncateAt.END);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        gmVar.setGravity(i | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        yob.X(textView, i7, null);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 16);
        qg2 qg2Var = new qg2(this, getContext(), (byte) 3);
        this.c = qg2Var;
        qg2Var.setTextSize(hl.L(14.0f));
        yob.U(qg2Var, i7, null);
        if (ob6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        qg2Var.setGravity(i3);
        qg2Var.setOnClickListener(new am7(this, (byte) 24));
        boolean z = ob6.a0;
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
        addView(gmVar, tre.d(-2, -1.0f, i8, i5, 0.0f, z ? 16 : 0, 0.0f));
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        addView(textView, tre.d(-2, -1.0f, i6 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(qg2Var, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        gm gmVar = this.a;
        if (arrayList != null) {
            jn7.i(gmVar);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            ls6.h(arrayList, str, spannableStringBuilder2, -1);
            CharSequence m = pv3.m(spannableStringBuilder2, gmVar.getPaint().getFontMetricsInt(), false, null, 0);
            r47.A5(m, arrayList, gmVar.getPaint().getFontMetricsInt(), false);
            gmVar.setText(m);
        } else {
            gmVar.setText(pv3.m(str, gmVar.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i));
        if (ob6.a0) {
            spannableStringBuilder = new SpannableStringBuilder(bp1.n(i, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(qd4.n(i, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new y7c(hl.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder);
        qg2 qg2Var = this.c;
        if (i3 == 0) {
            if (this.d.s1.quiz) {
                qg2Var.c(ob6.G(i2, "Answer", new Object[0]), z, true);
            } else {
                qg2Var.c(ob6.G(i2, "Vote", new Object[0]), z, true);
            }
        } else if (i3 == 1) {
            qg2Var.c(ob6.M0(2131746898, null), z, true);
        } else {
            qg2Var.c(ob6.M0(2131746902, null), z, true);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = ob6.a0;
        TextView textView = this.b;
        gm gmVar = this.a;
        if (z2) {
            int left = gmVar.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = gmVar.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824);
        TextView textView = this.b;
        measureChildWithMargins(textView, i, 0, makeMeasureSpec, 0);
        qg2 qg2Var = this.c;
        measureChildWithMargins(qg2Var, i, 0, makeMeasureSpec, 0);
        int measuredWidth = qg2Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.a, i, hl.L(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(32.0f));
    }
}
