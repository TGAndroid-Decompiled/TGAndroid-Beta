package kh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import cg.r;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.y4;
public final class h extends View {
    public final int f17292a = 0;
    public final Paint f17293b;
    public final Object f17294c;
    public final Object d;
    public final Object f17295e;

    public h(Activity activity, e6 e6Var) {
        super(activity);
        this.f17294c = new qe.a(this, xq.h, 380L);
        this.f17293b = new Paint(1);
        this.d = e6Var;
        p31 p31Var = new p31(true);
        this.f17295e = p31Var;
        p31Var.setCallback(this);
        p31Var.b(-1);
        p31Var.f37058i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f17292a) {
            case 0:
                super.onAttachedToWindow();
                ((p31) this.f17295e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f17292a) {
            case 0:
                super.onDetachedFromWindow();
                ((p31) this.f17295e).e();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        int i10;
        View[] viewPages;
        switch (this.f17292a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = k6.w0(k6.Me, (e6) this.d);
                Paint paint = this.f17293b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, g0.L(19.0f), paint);
                float f10 = ((qe.a) this.f17294c).f53840e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    r.b(canvas, (p31) this.f17295e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float L = g0.L(6.666f) * f10;
                    float L2 = g0.L(2.666f) * f10;
                    canvas.drawRoundRect(width - L, height - L, width + L, L + height, L2, L2, k6.n0(-1));
                    return;
                }
                return;
            default:
                y4 y4Var = (y4) this.f17295e;
                int d12 = y4Var.d1();
                Paint paint2 = this.f17293b;
                paint2.setColor(d12);
                ViewGroup viewGroup = y4Var.U1;
                int[] iArr = (int[]) this.f17294c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f12 = iArr[0] - iArr2[0];
                View view = ((n61) y4Var.U1).getViewPages()[0];
                if (view != null) {
                    i3 = view.getPaddingLeft();
                } else {
                    i3 = 0;
                }
                if (view != null) {
                    i10 = view.getPaddingRight();
                } else {
                    i10 = 0;
                }
                canvas.save();
                canvas.clipRect(i3 + f12, 0.0f, (f12 + y4Var.U1.getWidth()) - i10, getHeight());
                for (View view2 : ((n61) y4Var.U1).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), g0.L(100.0f) + view2.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f17292a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                r.d((p31) this.f17295e, i3 / 2.0f, i10 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f17292a) {
            case 0:
                if (!super.verifyDrawable(drawable) && (drawable != ((p31) this.f17295e) || ((qe.a) this.f17294c).f53841f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h(y4 y4Var, Context context) {
        super(context);
        this.f17295e = y4Var;
        this.f17293b = new Paint(1);
        this.f17294c = new int[2];
        this.d = new int[2];
    }
}
