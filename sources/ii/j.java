package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class j extends FrameLayout {
    public final ImageView f15021a;
    public final TextView f15022b;
    public final TextView f15023c;

    public j(Context context, e6 e6Var, boolean z10) {
        super(context);
        float f10;
        ImageView imageView = new ImageView(context);
        this.f15021a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = k6.G6;
        r6.t(imageView, i3, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, mf.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f10 = 2.0f;
        } else {
            f10 = 9.8f;
        }
        addView(linearLayout, mf.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f15022b = textView;
        r6.V(textView, i3, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f15023c = f11;
        r6.V(f11, k6.f28290z6, e6Var);
        f11.setTextSize(1, 14.0f);
        linearLayout.addView(f11, mf.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i3, CharSequence charSequence, CharSequence charSequence2) {
        this.f15021a.setImageResource(i3);
        this.f15022b.setText(charSequence);
        this.f15023c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f15023c.setText(charSequence);
    }
}
