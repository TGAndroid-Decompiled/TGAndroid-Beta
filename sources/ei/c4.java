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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class c4 extends FrameLayout {
    public final int f8959a;
    public final d6 f8960b;
    public final w9 f8961c;
    public final View d;
    public final View f8962e;
    public final ImageView f8963f;
    public final TextView h;
    public final TextView f8964n;
    public final ImageView f8965r;
    public boolean f8966s;

    public c4(Context context, int i10, d6 d6Var) {
        super(context);
        this.f8959a = i10;
        this.f8960b = d6Var;
        w9 w9Var = new w9(context);
        this.f8961c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(w9Var, z5.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackground(i6.K(AndroidUtilities.dp(11.0f), i6.v0(i6.f20827d6, d6Var)));
        addView(view, z5.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f8962e = view2;
        view2.setBackground(i6.K(AndroidUtilities.dp(9.665f), i6.v0(i6.uj, d6Var)));
        addView(view2, z5.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f8963f = imageView;
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
        textView.setTextColor(i6.v0(i6.G6, d6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, z5.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f8964n = h;
        h.setMaxLines(1);
        h.setSingleLine(true);
        h.setEllipsize(truncateAt);
        h.setTextSize(1, 14.0f);
        h.setTextColor(i6.v0(i6.f21233z6, d6Var));
        linearLayout.addView(h, z5.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f8965r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.M6, d6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, z5.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f8966s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), i6.f20950k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
