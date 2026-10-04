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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.y5;
import w7.z5;
public final class d extends FrameLayout implements y5 {
    public final d6 f16905a;
    public final ImageView f16906b;
    public final TextView f16907c;

    public d(Context context, d6 d6Var) {
        super(context);
        this.f16905a = d6Var;
        ImageView imageView = new ImageView(context);
        this.f16906b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, z5.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f16907c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, z5.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void e() {
        int i10 = i6.Wk;
        d6 d6Var = this.f16905a;
        int i11 = (int) 153.0f;
        this.f16907c.setTextColor(i0.a.k(i6.v0(i10, d6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(i6.v0(i10, d6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f16906b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(i6.f0(i0.a.k(i6.v0(i10, d6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f16906b.setOnClickListener(onClickListener);
    }
}
