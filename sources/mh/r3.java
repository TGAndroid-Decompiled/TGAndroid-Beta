package mh;

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
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
public final class r3 extends FrameLayout {
    public final int f18078a;
    public final b6 f18079b;
    public final o9 f18080c;
    public final View d;
    public final View f18081e;
    public final ImageView f18082f;
    public final TextView h;
    public final TextView f18083n;
    public final ImageView f18084r;
    public boolean f18085s;

    public r3(Context context, int i9, b6 b6Var) {
        super(context);
        this.f18078a = i9;
        this.f18079b = b6Var;
        o9 o9Var = new o9(context);
        this.f18080c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(o9Var, e6.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackground(f6.K(AndroidUtilities.dp(11.0f), f6.v0(f6.f23001d6, b6Var)));
        addView(view, e6.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f18081e = view2;
        view2.setBackground(f6.K(AndroidUtilities.dp(9.665f), f6.v0(f6.uj, b6Var)));
        addView(view2, e6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f18082f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, e6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, e6.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(f6.v0(f6.G6, b6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView h = j3.r0.h(linearLayout, textView, e6.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f18083n = h;
        h.setMaxLines(1);
        h.setSingleLine(true);
        h.setEllipsize(truncateAt);
        h.setTextSize(1, 14.0f);
        h.setTextColor(f6.v0(f6.f23386z6, b6Var));
        linearLayout.addView(h, e6.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f18084r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.M6, b6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, e6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f18085s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
