package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.u9;
import w7.z5;
public final class r3 extends FrameLayout {
    public final int f11452a;
    public final g6 f11453b;
    public final u9 f11454c;
    public final View d;
    public final View e;
    public final ImageView f11455f;
    public final TextView h;
    public final TextView f11456n;
    public final ImageView f11457r;
    public boolean f11458s;

    public r3(Context context, int i10, g6 g6Var) {
        super(context);
        this.f11452a = i10;
        this.f11453b = g6Var;
        u9 u9Var = new u9(context);
        this.f11454c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(u9Var, z5.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int dp = AndroidUtilities.dp(11.0f);
        int i11 = k6.f21184d6;
        Drawable K = k6.K(dp, k6.w0(i11, g6Var));
        n6 O = r6.O(i11);
        view.setBackground(K);
        r6.k(view, K, O, null, g6Var);
        addView(view, z5.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        int dp2 = AndroidUtilities.dp(9.665f);
        int i12 = k6.uj;
        Drawable K2 = k6.K(dp2, k6.w0(i12, g6Var));
        n6 O2 = r6.O(i12);
        view2.setBackground(K2);
        r6.k(view2, K2, O2, null, g6Var);
        addView(view2, z5.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f11455f = imageView;
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
        r6.W(textView, k6.G6, g6Var);
        NotificationCenter.listenEmojiLoading(textView);
        TextView f7 = tl.f(linearLayout, textView, z5.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f11456n = f7;
        f7.setMaxLines(1);
        f7.setSingleLine(true);
        f7.setEllipsize(truncateAt);
        f7.setTextSize(1, 14.0f);
        r6.W(f7, k6.f21589z6, g6Var);
        linearLayout.addView(f7, z5.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f11457r = imageView2;
        r6.t(imageView2, k6.M6, g6Var, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, z5.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f11458s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), k6.f21305k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
