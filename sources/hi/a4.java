package hi;

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
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;
public final class a4 extends FrameLayout {
    public final int f12860a;
    public final u6 f12861b;
    public final y9 f12862c;
    public final View d;
    public final View e;
    public final ImageView f12863f;
    public final TextView h;
    public final TextView f12864n;
    public final ImageView f12865r;
    public boolean f12866s;

    public a4(Context context, int i10, u6 u6Var) {
        super(context);
        this.f12860a = i10;
        this.f12861b = u6Var;
        y9 y9Var = new y9(context);
        this.f12862c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(y9Var, kb1.h(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int dp = AndroidUtilities.dp(11.0f);
        int i11 = y6.f23357d6;
        Drawable K = y6.K(dp, y6.w0(i11, u6Var));
        b7 N = f7.N(i11);
        view.setBackground(K);
        f7.k(view, K, N, null, u6Var);
        addView(view, kb1.h(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        int dp2 = AndroidUtilities.dp(9.665f);
        int i12 = y6.uj;
        Drawable K2 = y6.K(dp2, y6.w0(i12, u6Var));
        b7 N2 = f7.N(i12);
        view2.setBackground(K2);
        f7.k(view2, K2, N2, null, u6Var);
        addView(view2, kb1.f(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f12863f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, kb1.f(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.h(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        f7.V(textView, y6.G6, u6Var);
        NotificationCenter.listenEmojiLoading(textView);
        TextView e = wh.e(linearLayout, textView, kb1.x(-1, -2, 55, 6, 0, 24, 0), context);
        this.f12864n = e;
        e.setMaxLines(1);
        e.setSingleLine(true);
        e.setEllipsize(truncateAt);
        e.setTextSize(1, 14.0f);
        f7.V(e, y6.f23768z6, u6Var);
        linearLayout.addView(e, kb1.x(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f12865r = imageView2;
        f7.t(imageView2, y6.M6, u6Var, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, kb1.h(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f12866s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), y6.f23479k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
