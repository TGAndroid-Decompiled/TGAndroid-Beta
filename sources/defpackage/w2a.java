package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
public final class w2a extends View {
    public final byte a = 0;
    public final Paint b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w2a(Activity activity, ylb ylbVar) {
        super(activity);
        this.c = new fn0(380L, this, d53.h);
        this.b = new Paint(1);
        this.d = ylbVar;
        a6c a6cVar = new a6c(true);
        this.e = a6cVar;
        a6cVar.setCallback(this);
        a6cVar.b(-1);
        a6cVar.i = true;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                ((a6c) this.e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                ((a6c) this.e).e();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        View[] viewPages;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v0 = cmb.v0(cmb.Oe, (ylb) obj);
                Paint paint = this.b;
                paint.setColor(v0);
                canvas.drawCircle(width, height, gm.L(19.0f), paint);
                float f = ((fn0) obj2).e;
                float f2 = 1.0f - f;
                if (f2 > 0.0f) {
                    ur3.b(canvas, (a6c) obj3, f2 * 1.35f);
                    invalidate();
                }
                if (f > 0.0f) {
                    float L = gm.L(6.666f) * f;
                    float L2 = gm.L(2.666f) * f;
                    canvas.drawRoundRect(width - L, height - L, width + L, height + L, L2, L2, cmb.l0(-1));
                    return;
                }
                return;
            default:
                jnc jncVar = (jnc) obj3;
                int Y0 = jncVar.Y0();
                Paint paint2 = this.b;
                paint2.setColor(Y0);
                ViewGroup viewGroup = jncVar.W1;
                int[] iArr = (int[]) obj2;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) obj;
                getLocationInWindow(iArr2);
                float f3 = iArr[0] - iArr2[0];
                View view = ((wgc) viewGroup).getViewPages()[0];
                if (view != null) {
                    i2 = view.getPaddingLeft();
                    i = view.getPaddingRight();
                } else {
                    i = 0;
                    i2 = 0;
                }
                canvas.save();
                canvas.clipRect(i2 + f3, 0.0f, (f3 + viewGroup.getWidth()) - i, getHeight());
                for (View view2 : ((wgc) viewGroup).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), gm.L(100.0f) + view2.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                ur3.d((a6c) this.e, i / 2.0f, i2 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                if (!super.verifyDrawable(drawable) && (drawable != ((a6c) this.e) || ((fn0) this.c).f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public w2a(jnc jncVar, Context context) {
        super(context);
        this.e = jncVar;
        this.b = new Paint(1);
        this.c = new int[2];
        this.d = new int[2];
    }
}
