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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.z5;
import w7.y5;
public final class d extends FrameLayout implements z5 {
    public final e6 f15498a;
    public final ImageView f15499b;
    public final TextView f15500c;

    public d(Context context, e6 e6Var) {
        super(context);
        this.f15498a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f15499b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, y5.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f15500c = textView;
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
        int i10 = i6.Wk;
        e6 e6Var = this.f15498a;
        int i11 = (int) 153.0f;
        this.f15500c.setTextColor(i0.a.k(i6.v0(i10, e6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(i6.v0(i10, e6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f15499b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(i6.f0(i0.a.k(i6.v0(i10, e6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f15499b.setOnClickListener(onClickListener);
    }
}
