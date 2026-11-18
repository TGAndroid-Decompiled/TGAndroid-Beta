package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class j extends FrameLayout {
    public final ImageView f18724a;
    public final TextView f18725b;
    public final TextView f18726c;

    public j(Context context, i6 i6Var, boolean z10) {
        super(context);
        float f10;
        ImageView imageView = new ImageView(context);
        this.f18724a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = n6.G6;
        u6.s(imageView, i7, i6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ma.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f10 = 2.0f;
        } else {
            f10 = 9.8f;
        }
        addView(linearLayout, ma.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f18725b = textView;
        u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f11 = n10.f(linearLayout, textView, ma.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f18726c = f11;
        u6.U(f11, n6.f29807z6, i6Var);
        f11.setTextSize(1, 14.0f);
        linearLayout.addView(f11, ma.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f18724a.setImageResource(i7);
        this.f18725b.setText(charSequence);
        this.f18726c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f18726c.setText(charSequence);
    }
}
