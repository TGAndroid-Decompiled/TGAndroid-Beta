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
public final class qy3 extends LinearLayout {
    public final zh6 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final boolean h;
    public final boolean n;
    public final xy3 r;

    public qy3(xy3 xy3Var, Context context, boolean z, boolean z2) {
        super(context);
        this.r = xy3Var;
        this.h = z;
        this.n = z2;
        this.a = new zh6();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i) {
        View childAt = getChildAt(ete.b(i, 0, getChildCount() - 1));
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
        xy3 xy3Var = this.r;
        boolean z = xy3Var.h;
        wy3 wy3Var = xy3Var.G;
        for (Map.Entry entry : xy3Var.H.entrySet()) {
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
        mm mmVar = xy3Var.r;
        if (mmVar == null) {
            mmVar = new mm(350L, this, k43.h);
            xy3Var.r = mmVar;
        }
        float f3 = 0.0f;
        if (xy3Var.n) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        int i = 0;
        float e = mmVar.e(false, f);
        int floor = (int) Math.floor(xy3Var.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(xy3Var.K));
        float f4 = xy3Var.K - floor;
        RectF rectF3 = this.e;
        hl.X1(rectF, rectF2, f4, rectF3);
        if (wy3Var != null) {
            float f5 = xy3Var.K;
            if (xy3Var.E != null) {
                i = 1;
            }
            f3 = 1.0f - Utilities.l(Math.abs(f5 - (i + 1)));
        }
        float f6 = xy3Var.L;
        float f7 = (1.0f - f6) * 4.0f * f6;
        float z2 = xnb.z(f7, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = xnb.B(f7, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - z2, rectF3.centerY() - B, rectF3.centerX() + z2, rectF3.centerY() + B);
        float L = hl.L(hl.R1(8.0f, 16.0f, f3));
        int k = xy3Var.k();
        Paint paint = this.b;
        paint.setColor(k);
        if (z) {
            paint.setAlpha((int) xnb.B(f3, 0.5f, 1.0f, paint.getAlpha() * e));
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
            path.addRoundRect(rectF3, hl.N(16.0f), hl.N(16.0f), direction);
            paint.setColor(xy3Var.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (wy3Var != null) {
            path.addCircle(hl.L(15.0f) + wy3Var.getLeft(), (wy3Var.getBottom() + wy3Var.getTop()) / 2.0f, hl.L(15.0f), direction);
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
        zh6 zh6Var;
        long j;
        TLRPC.StickerSet stickerSet;
        xy3 xy3Var = this.r;
        uy3 uy3Var = xy3Var.F;
        int i5 = (i4 - i2) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i6 = 0;
            while (true) {
                int childCount = getChildCount();
                zh6Var = this.a;
                if (i6 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i6);
                if (childAt != uy3Var && !xy3Var.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i5 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i5);
                    boolean z2 = childAt instanceof uy3;
                    Long l = null;
                    if (z2) {
                        uy3 uy3Var2 = (uy3) childAt;
                        Long l2 = uy3Var2.a;
                        if (l2 == null) {
                            c14 c14Var = uy3Var2.w;
                            if (c14Var != null && (stickerSet = c14Var.b) != null) {
                                l = Long.valueOf(stickerSet.id);
                            } else {
                                l2 = uy3Var2.r;
                                if (l2 == null) {
                                    TLRPC.Document document = uy3Var2.s;
                                    if (document != null) {
                                        l = Long.valueOf(document.id);
                                    }
                                }
                            }
                        }
                        l = l2;
                    } else if (childAt instanceof wy3) {
                        l = Long.valueOf(((wy3) childAt).h);
                    }
                    if (xy3Var.O && z2) {
                        uy3 uy3Var3 = (uy3) childAt;
                        if (uy3Var3.b) {
                            uy3Var3.b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (ri5.d()) {
                                j = 0;
                            } else {
                                j = 200;
                            }
                            alpha.setDuration(j).setInterpolator(k43.h).start();
                        }
                    }
                    if (l != null) {
                        Integer num = (Integer) zh6Var.f(l.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < hl.L(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(k43.h).start();
                        }
                        zh6Var.k(l.longValue(), Integer.valueOf(paddingLeft));
                    }
                    if ((childAt != xy3Var.y || xy3Var.W) && (childAt != xy3Var.E || xy3Var.b0)) {
                        paddingLeft = uh9.w(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i6++;
            }
            if (uy3Var != null) {
                Long l3 = uy3Var.a;
                if (getPaddingRight() + uy3Var.getMeasuredWidth() + paddingLeft <= xy3Var.getMeasuredWidth()) {
                    int i7 = i3 - i;
                    paddingLeft = (i7 - getPaddingRight()) - uy3Var.getMeasuredWidth();
                    uy3Var.layout(paddingLeft, i5 - (uy3Var.getMeasuredHeight() / 2), i7 - getPaddingRight(), (uy3Var.getMeasuredHeight() / 2) + i5);
                } else {
                    uy3Var.layout(paddingLeft, i5 - (uy3Var.getMeasuredHeight() / 2), uy3Var.getMeasuredWidth() + paddingLeft, (uy3Var.getMeasuredHeight() / 2) + i5);
                }
                if (l3 != null) {
                    if (zh6Var.f(l3.longValue()) != null && ((Integer) zh6Var.f(l3.longValue())).intValue() != paddingLeft) {
                        uy3Var.setTranslationX(((Integer) zh6Var.f(l3.longValue())).intValue() - paddingLeft);
                        uy3Var.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    zh6Var.k(l3.longValue(), Integer.valueOf(paddingLeft));
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!xy3Var.W ? 1 : 0)) - (!xy3Var.b0 ? 1 : 0);
        int paddingLeft2 = (int) (((((i3 - i) - getPaddingLeft()) - getPaddingRight()) - (hl.L(30.0f) * childCount2)) / Math.max(1, childCount2 - 1));
        int paddingLeft3 = getPaddingLeft();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt((!xy3Var.W ? 1 : 0) + (!xy3Var.b0 ? 1 : 0) + i8);
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
        uy3 uy3Var;
        uy3 uy3Var2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        xy3 xy3Var = this.r;
        float f2 = 0.0f;
        if (!xy3Var.W && (uy3Var2 = xy3Var.y) != null) {
            f = uy3Var2.getAlpha() * hl.L(33.0f);
        } else {
            f = 0.0f;
        }
        int i4 = paddingRight - ((int) f);
        if (!xy3Var.b0 && (uy3Var = xy3Var.E) != null) {
            f2 = uy3Var.getAlpha() * hl.L(33.0f);
        }
        int i5 = i4 - ((int) f2);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null) {
                childAt.measure(-2047483649, i2);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i6 + 1 < getChildCount()) {
                    i3 = hl.L(3.0f);
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
