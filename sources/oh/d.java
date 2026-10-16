package oh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import w7.z5;
public final class d extends FrameLayout implements x5 {
    public final c6 f16351a;
    public final ImageView f16352b;
    public final TextView f16353c;

    public d(Context context, c6 c6Var) {
        super(context);
        this.f16351a = c6Var;
        ImageView imageView = new ImageView(context);
        this.f16352b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, z5.a(48.0f, 6.0f, 0.0f, 0.0f, 0.0f, 48, 8388627));
        TextView textView = new TextView(context);
        this.f16353c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, z5.a(-2.0f, 50.0f, 0.0f, 16.0f, 0.0f, -2, 8388627));
        d();
    }

    @Override
    public final void d() {
        int i10 = g6.Wk;
        c6 c6Var = this.f16351a;
        int i11 = (int) 153.0f;
        this.f16353c.setTextColor(i0.a.k(g6.w0(i10, c6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(g6.w0(i10, c6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f16352b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(g6.g0(i0.a.k(g6.w0(i10, c6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f16352b.setOnClickListener(onClickListener);
    }
}
