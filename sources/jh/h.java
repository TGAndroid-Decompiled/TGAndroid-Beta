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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.z4;
public final class h extends View {
    public final int f17050a = 0;
    public final Paint f17051b;
    public final Object f17052c;
    public final Object d;
    public final Object f17053e;

    public h(Activity activity, f6 f6Var) {
        super(activity);
        this.f17052c = new te.a(this, xq.h, 380L);
        this.f17051b = new Paint(1);
        this.d = f6Var;
        v31 v31Var = new v31(true);
        this.f17053e = v31Var;
        v31Var.setCallback(this);
        v31Var.b(-1);
        v31Var.f38846i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f17050a) {
            case 0:
                super.onAttachedToWindow();
                ((v31) this.f17053e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f17050a) {
            case 0:
                super.onDetachedFromWindow();
                ((v31) this.f17053e).e();
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
        switch (this.f17050a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = k6.w0(k6.Me, (f6) this.d);
                Paint paint = this.f17051b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, g0.L(19.0f), paint);
                float f10 = ((te.a) this.f17052c).f55486e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    s.b(canvas, (v31) this.f17053e, f11 * 1.35f);
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
                z4 z4Var = (z4) this.f17053e;
                int d12 = z4Var.d1();
                Paint paint2 = this.f17051b;
                paint2.setColor(d12);
                ViewGroup viewGroup = z4Var.T1;
                int[] iArr = (int[]) this.f17052c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f12 = iArr[0] - iArr2[0];
                View view = ((v61) z4Var.T1).getViewPages()[0];
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
                canvas.clipRect(i7 + f12, 0.0f, (f12 + z4Var.T1.getWidth()) - i10, getHeight());
                for (View view2 : ((v61) z4Var.T1).getViewPages()) {
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
        switch (this.f17050a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                s.d((v31) this.f17053e, i7 / 2.0f, i10 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f17050a) {
            case 0:
                if (!super.verifyDrawable(drawable) && (drawable != ((v31) this.f17053e) || ((te.a) this.f17052c).f55487f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h(z4 z4Var, Context context) {
        super(context);
        this.f17053e = z4Var;
        this.f17051b = new Paint(1);
        this.f17052c = new int[2];
        this.d = new int[2];
    }
}
