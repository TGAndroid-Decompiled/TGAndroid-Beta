package fi;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class c4 extends FrameLayout {
    public final int f9209a;
    public final c6 f9210b;
    public final z9 f9211c;
    public final View d;
    public final View e;
    public final ImageView f9212f;
    public final TextView h;
    public final TextView f9213n;
    public final ImageView f9214r;
    public boolean f9215s;

    public c4(Context context, int i10, c6 c6Var) {
        super(context);
        this.f9209a = i10;
        this.f9210b = c6Var;
        z9 z9Var = new z9(context);
        this.f9211c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(z9Var, a6.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 19));
        View view = new View(context);
        this.d = view;
        view.setBackground(g6.K(AndroidUtilities.dp(11.0f), g6.w0(g6.f19901d6, c6Var)));
        addView(view, a6.a(22.0f, 40.0f, 15.0f, 0.0f, 0.0f, 22, 19));
        View view2 = new View(context);
        this.e = view2;
        view2.setBackground(g6.K(AndroidUtilities.dp(9.665f), g6.w0(g6.uj, c6Var)));
        addView(view2, a6.c(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f9212f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, a6.c(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, a6.a(-2.0f, 66.0f, 8.66f, 10.0f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.w0(g6.G6, c6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, a6.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f9213n = i11;
        i11.setMaxLines(1);
        i11.setSingleLine(true);
        i11.setEllipsize(truncateAt);
        i11.setTextSize(1, 14.0f);
        i11.setTextColor(g6.w0(g6.f20305z6, c6Var));
        linearLayout.addView(i11, a6.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f9214r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.M6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, a6.a(24.0f, 0.0f, 0.0f, 10.0f, 0.0f, 24, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f9215s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), g6.f20022k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
