package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vx3 extends LinearLayout {
    public final vf6 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final boolean h;
    public final boolean n;
    public final cy3 r;

    public vx3(cy3 cy3Var, Context context, boolean z, boolean z2) {
        super(context);
        this.r = cy3Var;
        this.h = z;
        this.n = z2;
        this.a = new vf6();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i) {
        View childAt = getChildAt(moe.b(i, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        cy3 cy3Var = this.r;
        boolean z = cy3Var.h;
        by3 by3Var = cy3Var.G;
        for (Map.Entry entry : cy3Var.H.entrySet()) {
            View view = (View) entry.getKey();
            if (view != null) {
                Rect rect = (Rect) entry.getValue();
                canvas.save();
                canvas.translate(rect.left, rect.top);
                canvas.scale(view.getScaleX(), view.getScaleY(), rect.width() / 2.0f, rect.height() / 2.0f);
                view.draw(canvas);
                canvas.restore();
            }
        }
        lm lmVar = cy3Var.r;
        if (lmVar == null) {
            lmVar = new lm(350L, this, s33.h);
            cy3Var.r = lmVar;
        }
        float f3 = 0.0f;
        if (cy3Var.n) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        int i = 0;
        float e = lmVar.e(false, f);
        int floor = (int) Math.floor(cy3Var.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(cy3Var.K));
        float f4 = cy3Var.K - floor;
        RectF rectF3 = this.e;
        gl.X1(rectF, rectF2, f4, rectF3);
        if (by3Var != null) {
            float f5 = cy3Var.K;
            if (cy3Var.E != null) {
                i = 1;
            }
            f3 = 1.0f - Utilities.l(Math.abs(f5 - (i + 1)));
        }
        float f6 = cy3Var.L;
        float f7 = (1.0f - f6) * 4.0f * f6;
        float z2 = yjb.z(f7, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = yjb.B(f7, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - z2, rectF3.centerY() - B, rectF3.centerX() + z2, rectF3.centerY() + B);
        float L = gl.L(gl.R1(8.0f, 16.0f, f3));
        int k = cy3Var.k();
        Paint paint = this.b;
        paint.setColor(k);
        if (z) {
            paint.setAlpha((int) yjb.B(f3, 0.5f, 1.0f, paint.getAlpha() * e));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e));
        }
        Path path = this.f;
        path.rewind();
        if (this.n) {
            float height = rectF3.height() / 2.0f;
            L = rectF3.height() / 2.0f;
            f2 = height;
        } else {
            f2 = L;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f2, L, direction);
        canvas.drawPath(path, paint);
        if (z) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, gl.N(16.0f), gl.N(16.0f), direction);
            paint.setColor(cy3Var.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (by3Var != null) {
            path.addCircle(gl.L(15.0f) + by3Var.getLeft(), (by3Var.getBottom() + by3Var.getTop()) / 2.0f, gl.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.r.G) {
            canvas.save();
            canvas.clipPath(this.f);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        vf6 vf6Var;
        long j;
        TLRPC.StickerSet stickerSet;
        cy3 cy3Var = this.r;
        zx3 zx3Var = cy3Var.F;
        int i5 = (i4 - i2) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i6 = 0;
            while (true) {
                int childCount = getChildCount();
                vf6Var = this.a;
                if (i6 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i6);
                if (childAt != zx3Var && !cy3Var.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i5 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i5);
                    boolean z2 = childAt instanceof zx3;
                    Long l = null;
                    if (z2) {
                        zx3 zx3Var2 = (zx3) childAt;
                        Long l2 = zx3Var2.a;
                        if (l2 == null) {
                            h04 h04Var = zx3Var2.w;
                            if (h04Var != null && (stickerSet = h04Var.b) != null) {
                                l = Long.valueOf(stickerSet.id);
                            } else {
                                l2 = zx3Var2.r;
                                if (l2 == null) {
                                    TLRPC.Document document = zx3Var2.s;
                                    if (document != null) {
                                        l = Long.valueOf(document.id);
                                    }
                                }
                            }
                        }
                        l = l2;
                    } else if (childAt instanceof by3) {
                        l = Long.valueOf(((by3) childAt).h);
                    }
                    if (cy3Var.O && z2) {
                        zx3 zx3Var3 = (zx3) childAt;
                        if (zx3Var3.b) {
                            zx3Var3.b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (pg5.d()) {
                                j = 0;
                            } else {
                                j = 200;
                            }
                            alpha.setDuration(j).setInterpolator(s33.h).start();
                        }
                    }
                    if (l != null) {
                        Integer num = (Integer) vf6Var.f(l.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < gl.L(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(s33.h).start();
                        }
                        vf6Var.k(Integer.valueOf(paddingLeft), l.longValue());
                    }
                    if ((childAt != cy3Var.y || cy3Var.W) && (childAt != cy3Var.E || cy3Var.b0)) {
                        paddingLeft = de9.w(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i6++;
            }
            if (zx3Var != null) {
                Long l3 = zx3Var.a;
                if (getPaddingRight() + zx3Var.getMeasuredWidth() + paddingLeft <= cy3Var.getMeasuredWidth()) {
                    int i7 = i3 - i;
                    paddingLeft = (i7 - getPaddingRight()) - zx3Var.getMeasuredWidth();
                    zx3Var.layout(paddingLeft, i5 - (zx3Var.getMeasuredHeight() / 2), i7 - getPaddingRight(), (zx3Var.getMeasuredHeight() / 2) + i5);
                } else {
                    zx3Var.layout(paddingLeft, i5 - (zx3Var.getMeasuredHeight() / 2), zx3Var.getMeasuredWidth() + paddingLeft, (zx3Var.getMeasuredHeight() / 2) + i5);
                }
                if (l3 != null) {
                    if (vf6Var.f(l3.longValue()) != null && ((Integer) vf6Var.f(l3.longValue())).intValue() != paddingLeft) {
                        zx3Var.setTranslationX(((Integer) vf6Var.f(l3.longValue())).intValue() - paddingLeft);
                        zx3Var.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    vf6Var.k(Integer.valueOf(paddingLeft), l3.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!cy3Var.W ? 1 : 0)) - (!cy3Var.b0 ? 1 : 0);
        int paddingLeft2 = (int) (((((i3 - i) - getPaddingLeft()) - getPaddingRight()) - (gl.L(30.0f) * childCount2)) / Math.max(1, childCount2 - 1));
        int paddingLeft3 = getPaddingLeft();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt((!cy3Var.W ? 1 : 0) + (!cy3Var.b0 ? 1 : 0) + i8);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft3, i5 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft3, (childAt2.getMeasuredHeight() / 2) + i5);
                paddingLeft3 = childAt2.getMeasuredWidth() + paddingLeft2 + paddingLeft3;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        zx3 zx3Var;
        zx3 zx3Var2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        cy3 cy3Var = this.r;
        float f2 = 0.0f;
        if (!cy3Var.W && (zx3Var2 = cy3Var.y) != null) {
            f = zx3Var2.getAlpha() * gl.L(33.0f);
        } else {
            f = 0.0f;
        }
        int i4 = paddingRight - ((int) f);
        if (!cy3Var.b0 && (zx3Var = cy3Var.E) != null) {
            f2 = zx3Var.getAlpha() * gl.L(33.0f);
        }
        int i5 = i4 - ((int) f2);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null) {
                childAt.measure(-2047483649, i2);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i6 + 1 < getChildCount()) {
                    i3 = gl.L(3.0f);
                } else {
                    i3 = 0;
                }
                i5 = measuredWidth + i3 + i5;
            }
        }
        if (!this.h) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else {
            setMeasuredDimension(Math.max(i5, View.MeasureSpec.getSize(i)), View.MeasureSpec.getSize(i2));
        }
    }
}
