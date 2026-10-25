package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class u extends FrameLayout {
    public final b6 f15857a;
    public final xh.n f15858b;
    public final b6 f15859c;
    public final u6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f15860f;

    public u(Context context, u6 u6Var) {
        super(context);
        int i10;
        int i11;
        this.d = u6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(36.0f);
        int i12 = y6.Oh;
        ShapeDrawable K = y6.K(dp, y6.x0(null, i12, false));
        b7 N = f7.N(i12);
        imageView.setBackground(K);
        f7.k(imageView, K, N, null, null);
        imageView.setOnClickListener(new ig.d0(this, 7));
        addView(imageView, gb1.m(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        b6 b6Var = new b6(context);
        this.f15857a = b6Var;
        b6Var.setTextSize(15);
        f7.Y(b6Var, y6.G6, null);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        b6Var.setGravity(i10);
        addView(b6Var, gb1.m(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        b6 b6Var2 = new b6(context);
        this.f15859c = b6Var2;
        b6Var2.setTextSize(14);
        int i13 = y6.f23765z6;
        f7.Y(b6Var2, i13, null);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        b6Var2.setGravity(i11);
        addView(b6Var2, gb1.m(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.n nVar = new xh.n(context);
        this.f15858b = nVar;
        nVar.setTextSize(1, 13.0f);
        nVar.setMaxLines(1);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        f7.V(nVar, i13, u6Var);
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        nVar.f51910r = false;
        nVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, gb1.m(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.e) {
            Paint V0 = y6.V0("paintDivider", this.d);
            if (V0 == null) {
                V0 = y6.f23476k0;
            }
            Paint paint = V0;
            float f10 = 64.0f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 64.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        b6 b6Var = this.f15859c;
        b6 b6Var2 = this.f15857a;
        if (z11) {
            b6Var2.setPadding(b6Var.getTextWidth(), 0, 0, 0);
        } else {
            b6Var2.setPadding(0, 0, b6Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), 1073741824));
    }
}
