package bh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class e extends FrameLayout implements b6 {
    public final g6 f1990a;
    public final ImageView f1991b;
    public final TextView f1992c;

    public e(Context context, g6 g6Var) {
        super(context);
        this.f1990a = g6Var;
        ImageView imageView = new ImageView(context);
        this.f1991b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, c6.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f1992c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c6.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void e() {
        int i10 = k6.Wk;
        g6 g6Var = this.f1990a;
        int i11 = (int) 153.0f;
        this.f1992c.setTextColor(i0.a.k(k6.v0(i10, g6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(k6.v0(i10, g6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f1991b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(k6.f0(i0.a.k(k6.v0(i10, g6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f1991b.setOnClickListener(onClickListener);
    }
}
