package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class j extends FrameLayout {
    public final ImageView f13037a;
    public final TextView f13038b;
    public final TextView f13039c;

    public j(Context context, u6 u6Var, boolean z10) {
        super(context);
        float f7;
        ImageView imageView = new ImageView(context);
        this.f13037a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = y6.G6;
        f7.t(imageView, i10, u6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, gb1.h(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f7 = 2.0f;
        } else {
            f7 = 9.8f;
        }
        addView(linearLayout, gb1.h(-1, -2.0f, 23, 64.0f, f7, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f13038b = textView;
        f7.V(textView, i10, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView e = vh.e(linearLayout, textView, gb1.x(-1, -2, 55, 0, 0, 0, 1), context);
        this.f13039c = e;
        f7.V(e, y6.f23767z6, u6Var);
        e.setTextSize(1, 14.0f);
        linearLayout.addView(e, gb1.x(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f13037a.setImageResource(i10);
        this.f13038b.setText(charSequence);
        this.f13039c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f13039c.setText(charSequence);
    }
}
