package mh;

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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class d extends FrameLayout implements a6 {
    public final f6 f13665a;
    public final ImageView f13666b;
    public final TextView f13667c;

    public d(Context context, f6 f6Var) {
        super(context);
        this.f13665a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f13666b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, w7.a6.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f13667c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.a6.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void e() {
        int i10 = j6.Wk;
        f6 f6Var = this.f13665a;
        int i11 = (int) 153.0f;
        this.f13667c.setTextColor(i0.a.k(j6.v0(i10, f6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(j6.v0(i10, f6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f13666b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(j6.f0(i0.a.k(j6.v0(i10, f6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f13666b.setOnClickListener(onClickListener);
    }
}
