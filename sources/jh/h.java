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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Wallet.q5;
public final class h extends View {
    public final int f17881a = 0;
    public final Paint f17882b;
    public final Object f17883c;
    public final Object d;
    public final Object f17884e;

    public h(Activity activity, i6 i6Var) {
        super(activity);
        this.f17883c = new te.a(this, kr.h, 380L);
        this.f17882b = new Paint(1);
        this.d = i6Var;
        l41 l41Var = new l41(true);
        this.f17884e = l41Var;
        l41Var.setCallback(this);
        l41Var.b(-1);
        l41Var.f37039i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f17881a) {
            case 0:
                super.onAttachedToWindow();
                ((l41) this.f17884e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f17881a) {
            case 0:
                super.onDetachedFromWindow();
                ((l41) this.f17884e).e();
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
        switch (this.f17881a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = n6.w0(n6.Pe, (i6) this.d);
                Paint paint = this.f17882b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, g0.L(19.0f), paint);
                float f10 = ((te.a) this.f17883c).f57779e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    t.b(canvas, (l41) this.f17884e, f11 * 1.35f);
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
                q5 q5Var = (q5) this.f17884e;
                int e12 = q5Var.e1();
                Paint paint2 = this.f17882b;
                paint2.setColor(e12);
                ViewGroup viewGroup = q5Var.X1;
                int[] iArr = (int[]) this.f17883c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f12 = iArr[0] - iArr2[0];
                View view = ((k71) q5Var.X1).getViewPages()[0];
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
                canvas.clipRect(i7 + f12, 0.0f, (f12 + q5Var.X1.getWidth()) - i10, getHeight());
                for (View view2 : ((k71) q5Var.X1).getViewPages()) {
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
        switch (this.f17881a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                t.d((l41) this.f17884e, i7 / 2.0f, i10 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f17881a) {
            case 0:
                if (!super.verifyDrawable(drawable) && (drawable != ((l41) this.f17884e) || ((te.a) this.f17883c).f57780f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h(q5 q5Var, Context context) {
        super(context);
        this.f17884e = q5Var;
        this.f17882b = new Paint(1);
        this.f17883c = new int[2];
        this.d = new int[2];
    }
}
