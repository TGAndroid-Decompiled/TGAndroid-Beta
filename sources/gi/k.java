package gi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.a6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.z5;
public final class k extends FrameLayout {
    public final ImageView f11293a;
    public final TextView f11294b;
    public final TextView f11295c;

    public k(Context context, d6 d6Var, boolean z10) {
        super(context);
        float f7;
        ImageView imageView = new ImageView(context);
        this.f11293a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN));
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
        this.f11294b = textView;
        textView.setTextColor(h6.w0(i10, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView i11 = a6.i(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f11295c = i11;
        wh.o(h6.f21391z6, d6Var, i11, 1, 14.0f);
        linearLayout.addView(i11, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f11293a.setImageResource(i10);
        this.f11294b.setText(charSequence);
        this.f11295c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f11295c.setText(charSequence);
    }
}
