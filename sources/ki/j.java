package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public final class j extends FrameLayout {
    public final ImageView f18366a;
    public final TextView f18367b;
    public final TextView f18368c;

    public j(Context context, e6 e6Var, boolean z10) {
        super(context);
        float f10;
        ImageView imageView = new ImageView(context);
        this.f18366a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = j6.G6;
        q6.s(imageView, i7, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ja.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f10 = 2.0f;
        } else {
            f10 = 9.8f;
        }
        addView(linearLayout, ja.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f18367b = textView;
        q6.U(textView, i7, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f11 = i20.f(linearLayout, textView, ja.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f18368c = f11;
        q6.U(f11, j6.f29260z6, e6Var);
        f11.setTextSize(1, 14.0f);
        linearLayout.addView(f11, ja.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f18366a.setImageResource(i7);
        this.f18367b.setText(charSequence);
        this.f18368c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f18368c.setText(charSequence);
    }
}
