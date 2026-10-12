package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.y9;
import w7.w5;
public final class b4 extends FrameLayout {
    public final int f8964a;
    public final c6 f8965b;
    public final y9 f8966c;
    public final View d;
    public final View f8967e;
    public final ImageView f8968f;
    public final TextView h;
    public final TextView f8969n;
    public final ImageView f8970r;
    public boolean f8971s;

    public b4(Context context, int i10, c6 c6Var) {
        super(context);
        this.f8964a = i10;
        this.f8965b = c6Var;
        y9 y9Var = new y9(context);
        this.f8966c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(y9Var, w5.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 19));
        View view = new View(context);
        this.d = view;
        view.setBackground(h6.K(AndroidUtilities.dp(11.0f), h6.w0(h6.f20560d6, c6Var)));
        addView(view, w5.a(22.0f, 40.0f, 15.0f, 0.0f, 0.0f, 22, 19));
        View view2 = new View(context);
        this.f8967e = view2;
        view2.setBackground(h6.K(AndroidUtilities.dp(9.665f), h6.w0(h6.uj, c6Var)));
        addView(view2, w5.c(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f8968f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, w5.c(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w5.a(-2.0f, 66.0f, 8.66f, 10.0f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.w0(h6.G6, c6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w5.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f8969n = h;
        h.setMaxLines(1);
        h.setSingleLine(true);
        h.setEllipsize(truncateAt);
        h.setTextSize(1, 14.0f);
        h.setTextColor(h6.w0(h6.f20964z6, c6Var));
        linearLayout.addView(h, w5.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f8970r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.M6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, w5.a(24.0f, 0.0f, 0.0f, 10.0f, 0.0f, 24, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f8971s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), h6.f20682k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
