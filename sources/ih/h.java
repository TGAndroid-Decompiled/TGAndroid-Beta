package ih;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Wallet.o4;
import zf.p;
public final class h extends View {
    public final int f13179a = 0;
    public final Paint f13180b;
    public final Object f13181c;
    public final Object d;
    public final Object e;

    public h(Activity activity, g6 g6Var) {
        super(activity);
        this.f13181c = new ne.b(this, bs.h, 380L);
        this.f13180b = new Paint(1);
        this.d = g6Var;
        k61 k61Var = new k61(true);
        this.e = k61Var;
        k61Var.setCallback(this);
        k61Var.b(-1);
        k61Var.f27897i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f13179a) {
            case 0:
                super.onAttachedToWindow();
                ((k61) this.e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f13179a) {
            case 0:
                super.onDetachedFromWindow();
                ((k61) this.e).e();
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
        switch (this.f13179a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = k6.w0(k6.Yd, (g6) this.d);
                Paint paint = this.f13180b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((ne.b) this.f13181c).e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    p.b(canvas, (k61) this.e, f10 * 1.35f);
                    invalidate();
                }
                if (f7 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f7;
                    float dp2 = AndroidUtilities.dp(2.666f) * f7;
                    canvas.drawRoundRect(width - dp, height - dp, width + dp, dp + height, dp2, dp2, k6.m0(-1));
                    return;
                }
                return;
            default:
                o4 o4Var = (o4) this.e;
                o4Var.getClass();
                int themedColor = o4Var.getThemedColor(k6.f21183d6);
                Paint paint2 = this.f13180b;
                paint2.setColor(themedColor);
                ViewGroup viewGroup = o4Var.f34930b0;
                int[] iArr = (int[]) this.f13181c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f11 = iArr[0] - iArr2[0];
                View view = ((l91) o4Var.f34930b0).getViewPages()[0];
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
                canvas.clipRect(i10 + f11, 0.0f, (f11 + o4Var.f34930b0.getWidth()) - i11, getHeight());
                for (View view2 : ((l91) o4Var.f34930b0).getViewPages()) {
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
        switch (this.f13179a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                p.d((k61) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f13179a) {
            case 0:
                if (!super.verifyDrawable(drawable) && (drawable != ((k61) this.e) || ((ne.b) this.f13181c).f17447f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h(o4 o4Var, Context context) {
        super(context);
        this.e = o4Var;
        this.f13180b = new Paint(1);
        this.f13181c = new int[2];
        this.d = new int[2];
    }
}
