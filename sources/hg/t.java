package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import w7.z5;
public final class t extends FrameLayout {
    public final i5 f11324a;
    public final vh.n f11325b;
    public final i5 f11326c;
    public final d6 d;
    public boolean f11327e;
    public TL_account.TL_businessChatLink f11328f;

    public t(Context context, d6 d6Var) {
        super(context);
        int i10;
        int i11;
        this.d = d6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(i6.K(AndroidUtilities.dp(36.0f), i6.w0(null, i6.Oh, false)));
        imageView.setOnClickListener(new ai.v0(this, 25));
        addView(imageView, z5.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        i5 i5Var = new i5(context);
        this.f11324a = i5Var;
        i5Var.setTextSize(15);
        i5Var.setTextColor(i6.w0(null, i6.G6, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        i5Var.setGravity(i10);
        addView(i5Var, z5.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        i5 i5Var2 = new i5(context);
        this.f11326c = i5Var2;
        i5Var2.setTextSize(14);
        int i12 = i6.f21223z6;
        i5Var2.setTextColor(i6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        i5Var2.setGravity(i11);
        addView(i5Var2, z5.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        vh.n nVar = new vh.n(context);
        this.f11325b = nVar;
        nVar.setTextSize(1, 13.0f);
        nVar.setMaxLines(1);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        nVar.setTextColor(i6.v0(i12, d6Var));
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        nVar.f48435f = false;
        nVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, z5.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f11327e) {
            Paint T0 = i6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = i6.f20940k0;
            }
            Paint paint = T0;
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
        i5 i5Var = this.f11326c;
        i5 i5Var2 = this.f11324a;
        if (z11) {
            i5Var2.setPadding(i5Var.getTextWidth(), 0, 0, 0);
        } else {
            i5Var2.setPadding(0, 0, i5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.f11327e ? 1 : 0), 1073741824));
    }
}
