package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gt4 extends LinearLayout {
    public final b61 a;
    public final b61 b;
    public final b61 c;
    public final long d;

    public gt4(Context context, int i) {
        super(context);
        int i2;
        TLRPC.TL_emojiList a = oc0.a(i);
        setOrientation(1);
        bf0 bf0Var = new bf0(context);
        bf0Var.setImageDrawable(new p09(2131624317, gm.L(110.0f), gm.L(110.0f)));
        if (!gm.O1()) {
            addView(bf0Var, qoe.r(110, 110, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        anb.X(textView, cmb.F6, null);
        textView.setGravity(1);
        textView.setText(jb6.M0(2131750416, null));
        textView.setTypeface(gm.o());
        addView(textView, qoe.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.b7, null);
        textView2.setGravity(1);
        if (z8c.h(i).p()) {
            i2 = 2131750411;
        } else {
            i2 = 2131750412;
        }
        textView2.setText(jb6.M0(i2, null));
        textView2.setMaxWidth(gm.L(260.0f));
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView2, qoe.t(-2, -2, 49, 0, 0, 0, 14));
        b61 b61Var = new b61(null, context, true);
        this.a = b61Var;
        b61Var.f();
        b61Var.i(jb6.M0(2131750415, null), false, true);
        addView(b61Var, qoe.r(-2, 44, 49));
        b61 b61Var2 = new b61(null, context, false);
        this.b = b61Var2;
        b61Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new pn2(2131232494, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) jb6.M0(2131750413, null));
        b61Var2.i(spannableStringBuilder, false, true);
        addView(b61Var2, qoe.t(-2, 44, 49, 0, 8, 0, 0));
        b61 b61Var3 = new b61(null, context, false);
        this.c = b61Var3;
        b61Var3.f();
        b61Var3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new gn(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131743484, null));
        b61Var3.i(spannableStringBuilder2, false, true);
        addView(b61Var3, qoe.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), 1073741824);
        b61 b61Var = this.a;
        b61Var.setUseWrapContent(true);
        b61 b61Var2 = this.b;
        b61Var2.setUseWrapContent(true);
        b61 b61Var3 = this.c;
        b61Var3.setUseWrapContent(true);
        b61Var.measure(makeMeasureSpec, makeMeasureSpec2);
        b61Var2.measure(makeMeasureSpec, makeMeasureSpec2);
        b61Var3.measure(makeMeasureSpec, makeMeasureSpec2);
        b61Var.setUseWrapContent(false);
        b61Var2.setUseWrapContent(false);
        b61Var3.setUseWrapContent(false);
        int max = Math.max(Math.max(b61Var.getMeasuredWidth(), b61Var2.getMeasuredWidth()), b61Var3.getMeasuredWidth());
        b61Var.getLayoutParams().width = gm.L(80.0f) + max;
        b61Var2.getLayoutParams().width = gm.L(80.0f) + max;
        b61Var3.getLayoutParams().width = gm.L(80.0f) + max;
        super.onMeasure(i, i2);
    }

    public void setUseAnEmojiVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.c.setVisibility(i);
    }
}
