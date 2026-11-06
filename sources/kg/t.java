package kg;

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
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
public final class t extends FrameLayout {
    public final k5 f17535a;
    public final xh.l f17536b;
    public final k5 f17537c;
    public final f6 d;
    public boolean f17538e;
    public TL_account.TL_businessChatLink f17539f;

    public t(Context context, f6 f6Var) {
        super(context);
        int i7;
        int i10;
        this.d = f6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232200);
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(36.0f);
        int i11 = k6.Ci;
        ShapeDrawable L2 = k6.L(L, k6.x0(null, i11, false));
        n6 N = r6.N(i11);
        imageView.setBackground(L2);
        r6.k(imageView, L2, N, null, null);
        imageView.setOnClickListener(new ii.g(this, 8));
        addView(imageView, ha.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.f17535a = k5Var;
        k5Var.setTextSize(15);
        r6.Y(k5Var, k6.G6, null);
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        k5Var.setGravity(i7);
        addView(k5Var, ha.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        k5 k5Var2 = new k5(context);
        this.f17537c = k5Var2;
        k5Var2.setTextSize(14);
        int i12 = k6.f28258z6;
        r6.Y(k5Var2, i12, null);
        if (hd.f22871a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        k5Var2.setGravity(i10);
        addView(k5Var2, ha.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        this.f17536b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(lVar, i12, f6Var);
        lVar.setGravity(hd.f22871a0 ? 5 : 3);
        lVar.f58723r = false;
        lVar.setUseAlphaForEmoji(false);
        qs.i(lVar);
        addView(lVar, ha.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f17538e) {
            Paint W0 = k6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = k6.f27971k0;
            }
            Paint paint = W0;
            float f11 = 64.0f;
            if (hd.f22871a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!hd.f22871a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z10 = hd.f22871a0;
        k5 k5Var = this.f17537c;
        k5 k5Var2 = this.f17535a;
        if (z10) {
            k5Var2.setPadding(k5Var.getTextWidth(), 0, 0, 0);
        } else {
            k5Var2.setPadding(0, 0, k5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.f17538e ? 1 : 0), 1073741824));
    }
}
