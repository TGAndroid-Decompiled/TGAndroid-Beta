package nh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;

public final class j extends FrameLayout {

    public final ImageView f18764a;

    public final TextView f18765b;

    public final TextView f18766c;

    public j(Context context, c6 c6Var, boolean z10) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f18764a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.d(-1, -2.0f, 23, 64.0f, z10 ? 2.0f : 9.8f, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f18765b = textView;
        textView.setTextColor(g6.v0(i10, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView textViewI = pa.i(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f18766c = textViewI;
        rl.l(g6.f23441z6, c6Var, textViewI, 1, 14.0f);
        linearLayout.addView(textViewI, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f18764a.setImageResource(i10);
        this.f18765b.setText(charSequence);
        this.f18766c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f18766c.setText(charSequence);
    }
}
