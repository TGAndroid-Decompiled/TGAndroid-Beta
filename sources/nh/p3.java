package nh;

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
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.n9;

public final class p3 extends FrameLayout {

    public final int f18874a;

    public final c6 f18875b;

    public final n9 f18876c;
    public final View d;

    public final View f18877e;

    public final ImageView f18878f;
    public final TextView h;

    public final TextView f18879n;

    public final ImageView f18880r;

    public boolean f18881s;

    public p3(Context context, int i10, c6 c6Var) {
        super(context);
        this.f18874a = i10;
        this.f18875b = c6Var;
        n9 n9Var = new n9(context);
        this.f18876c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(n9Var, z5.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackground(g6.K(AndroidUtilities.dp(11.0f), g6.v0(g6.f23053d6, c6Var)));
        addView(view, z5.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f18877e = view2;
        view2.setBackground(g6.K(AndroidUtilities.dp(9.665f), g6.v0(g6.uj, c6Var)));
        addView(view2, z5.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f18878f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, z5.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.v0(g6.G6, c6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textViewI = pa.i(linearLayout, textView, z5.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f18879n = textViewI;
        textViewI.setMaxLines(1);
        textViewI.setSingleLine(true);
        textViewI.setEllipsize(truncateAt);
        textViewI.setTextSize(1, 14.0f);
        textViewI.setTextColor(g6.v0(g6.f23441z6, c6Var));
        linearLayout.addView(textViewI, z5.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f18880r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.M6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, z5.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f18881s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
