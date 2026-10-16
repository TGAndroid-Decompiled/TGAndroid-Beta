package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.z5;
public final class k extends FrameLayout {
    public final ImageView f9345a;
    public final TextView f9346b;
    public final TextView f9347c;

    public k(Context context, c6 c6Var, boolean z10) {
        super(context);
        float f7;
        ImageView imageView = new ImageView(context);
        this.f9345a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.a(24.0f, 20.0f, 11.46f, 0.0f, 0.0f, 24, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f7 = 2.0f;
        } else {
            f7 = 9.8f;
        }
        addView(linearLayout, z5.a(-2.0f, 64.0f, f7, 24.0f, z10 ? 4.0f : 9.8f, -1, 23));
        TextView textView = new TextView(context);
        this.f9346b = textView;
        textView.setTextColor(g6.w0(i10, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f9347c = i11;
        sk.o(g6.f20005z6, c6Var, i11, 1, 14.0f);
        linearLayout.addView(i11, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f9345a.setImageResource(i10);
        this.f9346b.setText(charSequence);
        this.f9347c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f9347c.setText(charSequence);
    }
}
