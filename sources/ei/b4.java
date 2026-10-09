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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class b4 extends FrameLayout {
    public final int f8967a;
    public final e6 f8968b;
    public final y9 f8969c;
    public final View d;
    public final View f8970e;
    public final ImageView f8971f;
    public final TextView h;
    public final TextView f8972n;
    public final ImageView f8973r;
    public boolean f8974s;

    public b4(Context context, int i10, e6 e6Var) {
        super(context);
        this.f8967a = i10;
        this.f8968b = e6Var;
        y9 y9Var = new y9(context);
        this.f8969c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(y9Var, x5.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 19));
        View view = new View(context);
        this.d = view;
        view.setBackground(i6.K(AndroidUtilities.dp(11.0f), i6.w0(i6.f20797d6, e6Var)));
        addView(view, x5.a(22.0f, 40.0f, 15.0f, 0.0f, 0.0f, 22, 19));
        View view2 = new View(context);
        this.f8970e = view2;
        view2.setBackground(i6.K(AndroidUtilities.dp(9.665f), i6.w0(i6.uj, e6Var)));
        addView(view2, x5.c(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f8971f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, x5.c(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.a(-2.0f, 66.0f, 8.66f, 10.0f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i6.w0(i6.G6, e6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f8972n = h;
        h.setMaxLines(1);
        h.setSingleLine(true);
        h.setEllipsize(truncateAt);
        h.setTextSize(1, 14.0f);
        h.setTextColor(i6.w0(i6.f21199z6, e6Var));
        linearLayout.addView(h, x5.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f8973r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.w0(i6.M6, e6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, x5.a(24.0f, 0.0f, 0.0f, 10.0f, 0.0f, 24, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f8974s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), i6.f20919k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
