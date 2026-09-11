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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import w7.x5;
public final class d extends FrameLayout implements z5 {
    public final f6 f17033a;
    public final ImageView f17034b;
    public final TextView f17035c;

    public d(Context context, f6 f6Var) {
        super(context);
        this.f17033a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f17034b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, x5.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f17035c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, x5.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int i10 = j6.Wk;
        f6 f6Var = this.f17033a;
        int i11 = (int) 153.0f;
        this.f17035c.setTextColor(i0.a.k(j6.v0(i10, f6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(j6.v0(i10, f6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f17034b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(j6.f0(i0.a.k(j6.v0(i10, f6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f17034b.setOnClickListener(onClickListener);
    }
}
