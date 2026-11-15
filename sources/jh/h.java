package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import bg.s;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.z31;
import org.telegram.ui.Wallet.a5;
public final class h extends View {
    public final int f17402a = 0;
    public final Paint f17403b;
    public final Object f17404c;
    public final Object d;
    public final Object f17405e;

    public h(Activity activity, e6 e6Var) {
        super(activity);
        this.f17404c = new te.a(this, er.h, 380L);
        this.f17403b = new Paint(1);
        this.d = e6Var;
        z31 z31Var = new z31(true);
        this.f17405e = z31Var;
        z31Var.setCallback(this);
        z31Var.b(-1);
        z31Var.f42235i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f17402a) {
            case 0:
                super.onAttachedToWindow();
                ((z31) this.f17405e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f17402a) {
            case 0:
                super.onDetachedFromWindow();
                ((z31) this.f17405e).e();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        View[] viewPages;
        switch (this.f17402a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = j6.w0(j6.Pe, (e6) this.d);
                Paint paint = this.f17403b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, g0.L(19.0f), paint);
                float f10 = ((te.a) this.f17404c).f57081e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    s.b(canvas, (z31) this.f17405e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float L = g0.L(6.666f) * f10;
                    float L2 = g0.L(2.666f) * f10;
                    canvas.drawRoundRect(width - L, height - L, width + L, L + height, L2, L2, j6.n0(-1));
                    return;
                }
                return;
            default:
                a5 a5Var = (a5) this.f17405e;
                int d12 = a5Var.d1();
                Paint paint2 = this.f17403b;
                paint2.setColor(d12);
                ViewGroup viewGroup = a5Var.X1;
                int[] iArr = (int[]) this.f17404c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f12 = iArr[0] - iArr2[0];
                View view = ((w61) a5Var.X1).getViewPages()[0];
                if (view != null) {
                    i7 = view.getPaddingLeft();
                } else {
                    i7 = 0;
                }
                if (view != null) {
                    i10 = view.getPaddingRight();
                } else {
                    i10 = 0;
                }
                canvas.save();
                canvas.clipRect(i7 + f12, 0.0f, (f12 + a5Var.X1.getWidth()) - i10, getHeight());
                for (View view2 : ((w61) a5Var.X1).getViewPages()) {
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
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f17402a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                s.d((z31) this.f17405e, i7 / 2.0f, i10 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f17402a) {
            case 0:
                if (!super.verifyDrawable(drawable) && (drawable != ((z31) this.f17405e) || ((te.a) this.f17404c).f57082f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h(a5 a5Var, Context context) {
        super(context);
        this.f17405e = a5Var;
        this.f17403b = new Paint(1);
        this.f17404c = new int[2];
        this.d = new int[2];
    }
}
