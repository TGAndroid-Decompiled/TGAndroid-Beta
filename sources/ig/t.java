package ig;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import w7.z5;
public final class t extends FrameLayout {
    public final j5 f13036a;
    public final wh.n f13037b;
    public final j5 f13038c;
    public final d6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f13039f;

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
        imageView.setBackground(h6.K(AndroidUtilities.dp(36.0f), h6.x0(null, h6.Oh, false)));
        imageView.setOnClickListener(new hg.r0(this, 6));
        addView(imageView, z5.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.f13036a = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTextColor(h6.x0(null, h6.G6, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        addView(j5Var, z5.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        j5 j5Var2 = new j5(context);
        this.f13038c = j5Var2;
        j5Var2.setTextSize(14);
        int i12 = h6.f21391z6;
        j5Var2.setTextColor(h6.x0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        j5Var2.setGravity(i11);
        addView(j5Var2, z5.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        wh.n nVar = new wh.n(context);
        this.f13037b = nVar;
        nVar.setTextSize(1, 13.0f);
        nVar.setMaxLines(1);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        nVar.setTextColor(h6.w0(i12, d6Var));
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        nVar.f49121r = false;
        nVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, z5.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = h6.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = h6.f21107k0;
            }
            Paint paint = U0;
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
        j5 j5Var = this.f13038c;
        j5 j5Var2 = this.f13036a;
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
