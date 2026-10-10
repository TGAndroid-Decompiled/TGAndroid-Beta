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
import w7.x5;
public final class d extends FrameLayout implements z5 {
    public final e6 f16868a;
    public final ImageView f16869b;
    public final TextView f16870c;

    public d(Context context, e6 e6Var) {
        super(context);
        this.f16868a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f16869b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, x5.a(48.0f, 6.0f, 0.0f, 0.0f, 0.0f, 48, 8388627));
        TextView textView = new TextView(context);
        this.f16870c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, x5.a(-2.0f, 50.0f, 0.0f, 16.0f, 0.0f, -2, 8388627));
        e();
    }

    @Override
    public final void e() {
        int i10 = i6.Wk;
        e6 e6Var = this.f16868a;
        int i11 = (int) 153.0f;
        this.f16870c.setTextColor(i0.a.k(i6.w0(i10, e6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(i6.w0(i10, e6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f16869b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(i6.g0(i0.a.k(i6.w0(i10, e6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f16869b.setOnClickListener(onClickListener);
    }
}
