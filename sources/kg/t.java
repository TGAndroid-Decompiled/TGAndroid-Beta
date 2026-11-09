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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
public final class t extends FrameLayout {
    public final l5 f17538a;
    public final xh.l f17539b;
    public final l5 f17540c;
    public final g6 d;
    public boolean f17541e;
    public TL_account.TL_businessChatLink f17542f;

    public t(Context context, g6 g6Var) {
        super(context);
        int i7;
        int i10;
        this.d = g6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232200);
        imageView.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(36.0f);
        int i11 = l6.Ci;
        ShapeDrawable L2 = l6.L(L, l6.x0(null, i11, false));
        o6 M = s6.M(i11);
        imageView.setBackground(L2);
        s6.j(imageView, L2, M, null, null);
        imageView.setOnClickListener(new ii.g(this, 8));
        addView(imageView, ha.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.f17538a = l5Var;
        l5Var.setTextSize(15);
        s6.X(l5Var, l6.G6, null);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        l5Var.setGravity(i7);
        addView(l5Var, ha.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        l5 l5Var2 = new l5(context);
        this.f17540c = l5Var2;
        l5Var2.setTextSize(14);
        int i12 = l6.f28275z6;
        s6.X(l5Var2, i12, null);
        if (id.f23157a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        l5Var2.setGravity(i10);
        addView(l5Var2, ha.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        this.f17539b = lVar;
        lVar.setTextSize(1, 13.0f);
        lVar.setMaxLines(1);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        s6.U(lVar, i12, g6Var);
        lVar.setGravity(id.f23157a0 ? 5 : 3);
        lVar.f58852r = false;
        lVar.setUseAlphaForEmoji(false);
        qs.i(lVar);
        addView(lVar, ha.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f17541e) {
            Paint W0 = l6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = l6.f27988k0;
            }
            Paint paint = W0;
            float f11 = 64.0f;
            if (id.f23157a0) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!id.f23157a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z10 = id.f23157a0;
        l5 l5Var = this.f17540c;
        l5 l5Var2 = this.f17538a;
        if (z10) {
            l5Var2.setPadding(l5Var.getTextWidth(), 0, 0, 0);
        } else {
            l5Var2.setPadding(0, 0, l5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f) + (this.f17541e ? 1 : 0), 1073741824));
    }
}
