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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import w7.y5;
public final class t extends FrameLayout {
    public final j5 f10410a;
    public final vh.o f10411b;
    public final j5 f10412c;
    public final f6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f10413f;

    public t(Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        this.d = f6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(j6.K(AndroidUtilities.dp(36.0f), j6.w0(null, j6.Oh, false)));
        imageView.setOnClickListener(new ai.v0(this, 25));
        addView(imageView, y5.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.f10410a = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTextColor(j6.w0(null, j6.G6, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        addView(j5Var, y5.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        j5 j5Var2 = new j5(context);
        this.f10412c = j5Var2;
        j5Var2.setTextSize(14);
        int i12 = j6.f19496z6;
        j5Var2.setTextColor(j6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        j5Var2.setGravity(i11);
        addView(j5Var2, y5.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        vh.o oVar = new vh.o(context);
        this.f10411b = oVar;
        oVar.setTextSize(1, 13.0f);
        oVar.setMaxLines(1);
        oVar.setEllipsize(TextUtils.TruncateAt.END);
        oVar.setTextColor(j6.v0(i12, f6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.f44751f = false;
        oVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(oVar);
        addView(oVar, y5.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.e) {
            Paint T0 = j6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = j6.f19216k0;
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
        j5 j5Var = this.f10412c;
        j5 j5Var2 = this.f10410a;
        if (z11) {
            j5Var2.setPadding(j5Var.getTextWidth(), 0, 0, 0);
        } else {
            j5Var2.setPadding(0, 0, j5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), 1073741824));
    }
}
