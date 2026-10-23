package ig;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class t extends FrameLayout {
    public final n5 f13071a;
    public final wh.n f13072b;
    public final n5 f13073c;
    public final g6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f13074f;

    public t(Context context, g6 g6Var) {
        super(context);
        int i10;
        int i11;
        this.d = g6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(36.0f);
        int i12 = k6.Oh;
        ShapeDrawable K = k6.K(dp, k6.x0(null, i12, false));
        n6 O = r6.O(i12);
        imageView.setBackground(K);
        r6.k(imageView, K, O, null, null);
        imageView.setOnClickListener(new hg.r0(this, 6));
        addView(imageView, z5.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.f13071a = n5Var;
        n5Var.setTextSize(15);
        r6.Z(n5Var, k6.G6, null);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n5Var.setGravity(i10);
        addView(n5Var, z5.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        n5 n5Var2 = new n5(context);
        this.f13073c = n5Var2;
        n5Var2.setTextSize(14);
        int i13 = k6.f21588z6;
        r6.Z(n5Var2, i13, null);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        n5Var2.setGravity(i11);
        addView(n5Var2, z5.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        wh.n nVar = new wh.n(context);
        this.f13072b = nVar;
        nVar.setTextSize(1, 13.0f);
        nVar.setMaxLines(1);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        r6.W(nVar, i13, g6Var);
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        nVar.f49551r = false;
        nVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, z5.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.e) {
            Paint V0 = k6.V0("paintDivider", this.d);
            if (V0 == null) {
                V0 = k6.f21304k0;
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
        n5 n5Var = this.f13073c;
        n5 n5Var2 = this.f13071a;
        if (z11) {
            n5Var2.setPadding(n5Var.getTextWidth(), 0, 0, 0);
        } else {
            n5Var2.setPadding(0, 0, n5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), 1073741824));
    }
}
