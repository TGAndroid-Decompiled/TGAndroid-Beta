package bi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
public final class n extends FrameLayout {
    public final TextView f3798a;
    public final TextView f3799b;
    public final h0 f3800c;

    public n(h0 h0Var, Context context) {
        super(context);
        this.f3800c = h0Var;
        TextView textView = new TextView(context);
        this.f3798a = textView;
        textView.setTextColor(h0Var.f3848y);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView, mf.d(-1, -1.0f, 51, 15.0f, 8.0f, 15.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f3799b = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setText(bd.M0(2131743886, null));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(620756991);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(13.0f));
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new ai.b(this, 5));
        addView(textView2, mf.d(-2, 26.0f, 21, 0.0f, 4.0f, 12.0f, 0.0f));
    }
}
