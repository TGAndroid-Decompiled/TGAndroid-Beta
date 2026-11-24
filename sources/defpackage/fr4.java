package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fr4 extends LinearLayout {
    public final u41 a;
    public final u41 b;
    public final u41 c;
    public final long d;

    public fr4(Context context, int i) {
        super(context);
        int i2;
        TLRPC.TL_emojiList a = ob0.a(i);
        setOrientation(1);
        be0 be0Var = new be0(context);
        be0Var.setImageDrawable(new oy8(2131624317, gl.L(110.0f), gl.L(110.0f)));
        if (!gl.O1()) {
            addView(be0Var, nme.r(110, 110, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        zkb.X(textView, bkb.F6, null);
        textView.setGravity(1);
        textView.setText(k96.M0(2131750467, null));
        textView.setTypeface(gl.o());
        addView(textView, nme.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.b7, null);
        textView2.setGravity(1);
        if (y6c.h(i).p()) {
            i2 = 2131750462;
        } else {
            i2 = 2131750463;
        }
        textView2.setText(k96.M0(i2, null));
        textView2.setMaxWidth(gl.L(260.0f));
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView2, nme.t(-2, -2, 49, 0, 0, 0, 14));
        u41 u41Var = new u41(null, context, true);
        this.a = u41Var;
        u41Var.f();
        u41Var.i(k96.M0(2131750466, null), false, true);
        addView(u41Var, nme.r(-2, 44, 49));
        u41 u41Var2 = new u41(null, context, false);
        this.b = u41Var2;
        u41Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new cm2(2131232482, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) k96.M0(2131750464, null));
        u41Var2.i(spannableStringBuilder, false, true);
        addView(u41Var2, nme.t(-2, 44, 49, 0, 8, 0, 0));
        u41 u41Var3 = new u41(null, context, false);
        this.c = u41Var3;
        u41Var3.f();
        u41Var3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a.document_id;
        if (arrayList != null && !arrayList.isEmpty()) {
            long longValue = a.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new gm(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        } else {
            this.d = 0L;
        }
        spannableStringBuilder2.append((CharSequence) k96.M0(2131743558, null));
        u41Var3.i(spannableStringBuilder2, false, true);
        addView(u41Var3, nme.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), 1073741824);
        u41 u41Var = this.a;
        u41Var.setUseWrapContent(true);
        u41 u41Var2 = this.b;
        u41Var2.setUseWrapContent(true);
        u41 u41Var3 = this.c;
        u41Var3.setUseWrapContent(true);
        u41Var.measure(makeMeasureSpec, makeMeasureSpec2);
        u41Var2.measure(makeMeasureSpec, makeMeasureSpec2);
        u41Var3.measure(makeMeasureSpec, makeMeasureSpec2);
        u41Var.setUseWrapContent(false);
        u41Var2.setUseWrapContent(false);
        u41Var3.setUseWrapContent(false);
        int max = Math.max(Math.max(u41Var.getMeasuredWidth(), u41Var2.getMeasuredWidth()), u41Var3.getMeasuredWidth());
        u41Var.getLayoutParams().width = gl.L(80.0f) + max;
        u41Var2.getLayoutParams().width = gl.L(80.0f) + max;
        u41Var3.getLayoutParams().width = gl.L(80.0f) + max;
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
