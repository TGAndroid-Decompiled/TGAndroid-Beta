package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Wallet.p5;
public final class h extends View {
    public final int f17788a = 0;
    public final Paint f17789b;
    public final Object f17790c;
    public final Object d;
    public final Object f17791e;

    public h(Activity activity, i6 i6Var) {
        super(activity);
        this.f17790c = new te.a(this, lr.h, 380L);
        this.f17789b = new Paint(1);
        this.d = i6Var;
        j41 j41Var = new j41(true);
        this.f17791e = j41Var;
        j41Var.setCallback(this);
        j41Var.b(-1);
        j41Var.f36335i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f17788a) {
            case 0:
                super.onAttachedToWindow();
                ((j41) this.f17791e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f17788a) {
            case 0:
                super.onDetachedFromWindow();
                ((j41) this.f17791e).e();
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
        switch (this.f17788a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = n6.w0(n6.Pe, (i6) this.d);
                Paint paint = this.f17789b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, g0.L(19.0f), paint);
                float f10 = ((te.a) this.f17790c).f57657e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    t.b(canvas, (j41) this.f17791e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float L = g0.L(6.666f) * f10;
                    float L2 = g0.L(2.666f) * f10;
                    canvas.drawRoundRect(width - L, height - L, width + L, L + height, L2, L2, n6.n0(-1));
                    return;
                }
                return;
            default:
                p5 p5Var = (p5) this.f17791e;
                int e12 = p5Var.e1();
                Paint paint2 = this.f17789b;
                paint2.setColor(e12);
                ViewGroup viewGroup = p5Var.X1;
                int[] iArr = (int[]) this.f17790c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f12 = iArr[0] - iArr2[0];
                View view = ((g71) p5Var.X1).getViewPages()[0];
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
                canvas.clipRect(i7 + f12, 0.0f, (f12 + p5Var.X1.getWidth()) - i10, getHeight());
                for (View view2 : ((g71) p5Var.X1).getViewPages()) {
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
        switch (this.f17788a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                t.d((j41) this.f17791e, i7 / 2.0f, i10 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f17788a) {
            case 0:
                if (!super.verifyDrawable(drawable) && (drawable != ((j41) this.f17791e) || ((te.a) this.f17790c).f57658f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h(p5 p5Var, Context context) {
        super(context);
        this.f17791e = p5Var;
        this.f17789b = new Paint(1);
        this.f17790c = new int[2];
        this.d = new int[2];
    }
}
