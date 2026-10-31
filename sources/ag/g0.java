package ag;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import w7.b6;
public final class g0 extends FrameLayout {
    public final u5 f528a;
    public final nh.p f529b;
    public final u5 f530c;
    public final p6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f531f;

    public g0(Context context, p6 p6Var) {
        super(context);
        int i10;
        int i11;
        this.d = p6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232199);
        imageView.setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(36.0f);
        int i12 = t6.Ci;
        ShapeDrawable L2 = t6.L(L, t6.x0(null, i12, false));
        w6 N = a7.N(i12);
        imageView.setBackground(L2);
        a7.k(imageView, L2, N, null, null);
        imageView.setOnClickListener(new g(this, 1));
        addView(imageView, b6.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        u5 u5Var = new u5(context);
        this.f528a = u5Var;
        u5Var.setTextSize(15);
        a7.Y(u5Var, t6.G6, null);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u5Var.setGravity(i10);
        addView(u5Var, b6.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        u5 u5Var2 = new u5(context);
        this.f530c = u5Var2;
        u5Var2.setTextSize(14);
        int i13 = t6.f21330z6;
        a7.Y(u5Var2, i13, null);
        if (cd.X) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        u5Var2.setGravity(i11);
        addView(u5Var2, b6.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        nh.p pVar = new nh.p(context);
        this.f529b = pVar;
        pVar.setTextSize(1, 13.0f);
        pVar.setMaxLines(1);
        pVar.setEllipsize(TextUtils.TruncateAt.END);
        a7.V(pVar, i13, p6Var);
        pVar.setGravity(cd.X ? 5 : 3);
        pVar.f13892r = false;
        pVar.setUseAlphaForEmoji(false);
        zs.i(pVar);
        addView(pVar, b6.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = t6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = t6.f21052k0;
            }
            Paint paint = W0;
            float f10 = 64.0f;
            if (cd.X) {
                f7 = 0.0f;
            } else {
                f7 = 64.0f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!cd.X) {
                f10 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.i0.L(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = cd.X;
        u5 u5Var = this.f530c;
        u5 u5Var2 = this.f528a;
        if (z11) {
            u5Var2.setPadding(u5Var.getTextWidth(), 0, 0, 0);
        } else {
            u5Var2.setPadding(0, 0, u5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f) + (this.e ? 1 : 0), 1073741824));
    }
}
