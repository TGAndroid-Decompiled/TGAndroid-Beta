package nh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import w7.y5;
public final class d extends FrameLayout implements x5 {
    public final d6 f15463a;
    public final ImageView f15464b;
    public final TextView f15465c;

    public d(Context context, d6 d6Var) {
        super(context);
        this.f15463a = d6Var;
        ImageView imageView = new ImageView(context);
        this.f15464b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, y5.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f15465c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, y5.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void e() {
        int i10 = h6.Wk;
        d6 d6Var = this.f15463a;
        int i11 = (int) 153.0f;
        this.f15465c.setTextColor(i0.a.k(h6.v0(i10, d6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(h6.v0(i10, d6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f15464b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(h6.f0(i0.a.k(h6.v0(i10, d6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f15464b.setOnClickListener(onClickListener);
    }
}
