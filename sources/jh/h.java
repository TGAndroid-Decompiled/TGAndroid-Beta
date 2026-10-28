package jh;

import ag.v;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Wallet.m4;
public final class h extends View {
    public final int f15953a = 0;
    public final Paint f15954b;
    public final Object f15955c;
    public final Object d;
    public final Object e;

    public h(Activity activity, u6 u6Var) {
        super(activity);
        this.f15955c = new oe.b(this, ds.h, 380L);
        this.f15954b = new Paint(1);
        this.d = u6Var;
        s61 s61Var = new s61(true);
        this.e = s61Var;
        s61Var.setCallback(this);
        s61Var.b(-1);
        s61Var.f32499i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f15953a) {
            case 0:
                super.onAttachedToWindow();
                ((s61) this.e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f15953a) {
            case 0:
                super.onDetachedFromWindow();
                ((s61) this.e).e();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        View[] viewPages;
        switch (this.f15953a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = y6.w0(y6.Yd, (u6) this.d);
                Paint paint = this.f15954b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((oe.b) this.f15955c).e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    v.b(canvas, (s61) this.e, f10 * 1.35f);
                    invalidate();
                }
                if (f7 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f7;
                    float dp2 = AndroidUtilities.dp(2.666f) * f7;
                    canvas.drawRoundRect(width - dp, height - dp, width + dp, dp + height, dp2, dp2, y6.m0(-1));
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.e;
                m4Var.getClass();
                int themedColor = m4Var.getThemedColor(y6.f23357d6);
                Paint paint2 = this.f15954b;
                paint2.setColor(themedColor);
                ViewGroup viewGroup = m4Var.f36938b0;
                int[] iArr = (int[]) this.f15955c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f11 = iArr[0] - iArr2[0];
                View view = ((v91) m4Var.f36938b0).getViewPages()[0];
                if (view != null) {
                    i10 = view.getPaddingLeft();
                } else {
                    i10 = 0;
                }
                if (view != null) {
                    i11 = view.getPaddingRight();
                } else {
                    i11 = 0;
                }
                canvas.save();
                canvas.clipRect(i10 + f11, 0.0f, (f11 + m4Var.f36938b0.getWidth()) - i11, getHeight());
                for (View view2 : ((v91) m4Var.f36938b0).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), AndroidUtilities.dp(100.0f) + view2.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f15953a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                v.d((s61) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f15953a) {
            case 0:
                if (!super.verifyDrawable(drawable) && (drawable != ((s61) this.e) || ((oe.b) this.f15955c).f19326f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h(m4 m4Var, Context context) {
        super(context);
        this.e = m4Var;
        this.f15954b = new Paint(1);
        this.f15955c = new int[2];
        this.d = new int[2];
    }
}
