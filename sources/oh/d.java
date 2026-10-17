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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import w7.z5;
public final class d extends FrameLayout implements y5 {
    public final d6 f17745a;
    public final ImageView f17746b;
    public final TextView f17747c;

    public d(Context context, d6 d6Var) {
        super(context);
        this.f17745a = d6Var;
        ImageView imageView = new ImageView(context);
        this.f17746b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, z5.a(48.0f, 6.0f, 0.0f, 0.0f, 0.0f, 48, 8388627));
        TextView textView = new TextView(context);
        this.f17747c = textView;
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
        int i10 = h6.Wk;
        d6 d6Var = this.f17745a;
        int i11 = (int) 153.0f;
        this.f17747c.setTextColor(i0.b.o(h6.w0(i10, d6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.b.o(h6.w0(i10, d6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f17746b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(h6.g0(i0.b.o(h6.w0(i10, d6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f17746b.setOnClickListener(onClickListener);
    }
}
