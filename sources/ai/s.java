package ai;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.id;
public final class s extends FrameLayout {
    public final TextView f1610a;
    public final TextView f1611b;
    public final q0 f1612c;

    public s(q0 q0Var, Context context) {
        super(context);
        this.f1612c = q0Var;
        TextView textView = new TextView(context);
        this.f1610a = textView;
        textView.setTextColor(q0Var.f1681y);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView, ha.d(-1, -1.0f, 51, 15.0f, 8.0f, 15.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1611b = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setText(id.M0(2131743876, null));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(620756991);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(13.0f));
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new ah.d(this, 1));
        addView(textView2, ha.d(-2, 26.0f, 21, 0.0f, 4.0f, 12.0f, 0.0f));
    }
}
