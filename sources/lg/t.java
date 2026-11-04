package lg;

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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
public final class t extends FrameLayout {
    public final k5 f18459a;
    public final yh.l f18460b;
    public final k5 f18461c;
    public final e6 d;
    public boolean f18462e;
    public TL_account.TL_businessChatLink f18463f;

    public t(Context context, e6 e6Var) {
        super(context);
        int i3;
        int i10;
        this.d = e6Var;
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
        imageView.setOnClickListener(new ii.m(this, 11));
        addView(imageView, mf.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.f18459a = k5Var;
        k5Var.setTextSize(15);
        r6.Y(k5Var, k6.G6, null);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        k5Var.setGravity(i3);
        addView(k5Var, mf.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        k5 k5Var2 = new k5(context);
        this.f18461c = k5Var2;
        k5Var2.setTextSize(14);
        int i12 = k6.f28290z6;
        r6.Y(k5Var2, i12, null);
        if (bd.f21784a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        k5Var2.setGravity(i10);
        addView(k5Var2, mf.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        yh.l lVar = new yh.l(context);
        this.f18460b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(lVar, i12, e6Var);
        lVar.setGravity(bd.f21784a0 ? 5 : 3);
        lVar.f59560r = false;
        lVar.setUseAlphaForEmoji(false);
        hs.i(lVar);
        addView(lVar, mf.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f18462e) {
            Paint W0 = k6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = k6.f28002k0;
            }
            Paint paint = W0;
            float f11 = 64.0f;
            if (bd.f21784a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!bd.f21784a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z11 = bd.f21784a0;
        k5 k5Var = this.f18461c;
        k5 k5Var2 = this.f18459a;
        if (z11) {
            k5Var2.setPadding(k5Var.getTextWidth(), 0, 0, 0);
        } else {
            k5Var2.setPadding(0, 0, k5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.f18462e ? 1 : 0), 1073741824));
    }
}
