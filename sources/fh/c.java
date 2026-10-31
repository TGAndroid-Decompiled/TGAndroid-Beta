package fh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public final class c extends FrameLayout implements k6 {
    public final p6 f7100a;
    public final ImageView f7101b;
    public final TextView f7102c;
    public int d;
    public boolean e;

    public c(Context context, p6 p6Var) {
        super(context);
        this.f7100a = p6Var;
        ImageView imageView = new ImageView(context);
        this.f7101b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232056);
        addView(imageView, b6.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f7102c = textView;
        textView.setText(cd.L0(2131751167, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(i0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, b6.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f7) {
        return i0.b.o(t6.w0(t6.Kl, this.f7100a), (int) (f7 * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Kl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f7101b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.f7102c.setTextColor(a(0.6f));
        int a2 = a(1.0f);
        if (this.e && a2 == this.d) {
            return;
        }
        this.e = true;
        this.d = a2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f7101b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            t6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(t6.h0(a(0.1f), 1, -1));
        }
    }
}
