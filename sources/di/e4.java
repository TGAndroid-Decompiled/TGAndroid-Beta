package di;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.w9;
import w7.a6;
public final class e4 extends FrameLayout {
    public final int f6603a;
    public final f6 f6604b;
    public final w9 f6605c;
    public final View d;
    public final View e;
    public final ImageView f6606f;
    public final TextView h;
    public final TextView f6607n;
    public final ImageView f6608r;
    public boolean f6609s;

    public e4(Context context, int i10, f6 f6Var) {
        super(context);
        this.f6603a = i10;
        this.f6604b = f6Var;
        w9 w9Var = new w9(context);
        this.f6605c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(w9Var, a6.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackground(j6.K(AndroidUtilities.dp(11.0f), j6.v0(j6.f17928d6, f6Var)));
        addView(view, a6.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        view2.setBackground(j6.K(AndroidUtilities.dp(9.665f), j6.v0(j6.uj, f6Var)));
        addView(view2, a6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f6606f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, a6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, a6.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, a6.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f6607n = g10;
        g10.setMaxLines(1);
        g10.setSingleLine(true);
        g10.setEllipsize(truncateAt);
        g10.setTextSize(1, 14.0f);
        g10.setTextColor(j6.v0(j6.f18325z6, f6Var));
        linearLayout.addView(g10, a6.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f6608r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.M6, f6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, a6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f6609s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), j6.f18049k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
