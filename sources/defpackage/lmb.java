package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public final class lmb extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final mmb r;

    public lmb(mmb mmbVar, Context context) {
        super(context);
        this.r = mmbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        mmb mmbVar = this.r;
        if (mmbVar.w() && !mmbVar.i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && dte.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < mmbVar.m) {
                    mmbVar.J(motionEvent.getRawX(), motionEvent.getRawY());
                    mmbVar.t();
                    mmbVar.e(false);
                    return true;
                }
            } else {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        mmb mmbVar = this.r;
        if (mmbVar.i0 && (viewGroup = mmbVar.F) != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        s8b s8bVar;
        int i;
        char c;
        float f;
        int i2;
        boolean isRtlCharAt;
        r47 r47Var;
        float f2;
        boolean z;
        int i3;
        mmb mmbVar = this.r;
        s8b s8bVar2 = mmbVar.m0;
        OvershootInterpolator overshootInterpolator = mmbVar.c0;
        RectF rectF = mmbVar.S;
        RectF rectF2 = mmbVar.T;
        dj2 dj2Var = mmbVar.a0;
        if (mmbVar.w()) {
            int L = hl.L(22.0f);
            int i4 = mmbVar.x;
            mmbVar.M();
            hmb hmbVar = mmbVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (hmbVar != null) {
                canvas.save();
                int[] k = mmbVar.k();
                c = 1;
                float f3 = k[1] + mmbVar.b;
                f = 8.0f;
                float f4 = k[0] + mmbVar.a;
                canvas.translate(f4, f3);
                hmb hmbVar2 = mmbVar.W;
                if (hmbVar2 instanceof wb2) {
                    r47Var = ((wb2) hmbVar2).getMessageObject();
                } else {
                    r47Var = null;
                }
                if (r47Var != null && r47Var.O3()) {
                    paint.setColor(mmbVar.s(aob.Nc));
                } else {
                    paint.setColor(mmbVar.s(aob.mg));
                }
                int length = mmbVar.r(mmbVar.W, false).length();
                int i5 = mmbVar.v;
                if (i5 >= 0 && i5 <= length) {
                    mmbVar.h(i5, dj2Var, false);
                    Layout layout = (Layout) dj2Var.d;
                    if (layout != null) {
                        s8bVar = s8bVar2;
                        int i6 = mmbVar.v - dj2Var.a;
                        int length2 = layout.getText().length();
                        if (i6 > length2) {
                            i6 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i6);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i6);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + dj2Var.b);
                        float f5 = primaryHorizontal + dj2Var.c;
                        Rect rect = (Rect) dj2Var.e;
                        if (rect != null) {
                            float f6 = rect.right - mmbVar.a;
                            i3 = rect.bottom - mmbVar.b;
                            f2 = f6;
                            z = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(mmbVar.v);
                            f2 = f5;
                            z = isRtlCharAt2;
                            i3 = lineBottom;
                        }
                        float f7 = i3;
                        float f8 = f3 + f7;
                        i = i4;
                        if (f8 > i + mmbVar.d0 && f8 < mmbVar.F.getMeasuredHeight()) {
                            if (!z) {
                                canvas.save();
                                canvas.translate(f2, f7);
                                float interpolation = overshootInterpolator.getInterpolation(mmbVar.V);
                                float f9 = L;
                                float f10 = f9 / 2.0f;
                                canvas.scale(interpolation, interpolation, f10, f10);
                                path.reset();
                                Path.Direction direction = Path.Direction.CCW;
                                path.addCircle(f10, f10, f10, direction);
                                path.addRect(0.0f, 0.0f, f10, f10, direction);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f11 = f4 + f2;
                                rectF2.set(f11, f8 - f9, f11 + f9, f8 + f9);
                                rectF2.inset(-hl.L(8.0f), -hl.L(8.0f));
                                i2 = 1;
                                canvas.restore();
                            } else {
                                canvas.save();
                                float f12 = L;
                                canvas.translate(f2 - f12, f7);
                                float interpolation2 = overshootInterpolator.getInterpolation(mmbVar.V);
                                float f13 = f12 / 2.0f;
                                canvas.scale(interpolation2, interpolation2, f13, f13);
                                path.reset();
                                Path.Direction direction2 = Path.Direction.CCW;
                                path.addCircle(f13, f13, f13, direction2);
                                path.addRect(f13, 0.0f, f12, f13, direction2);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f14 = f4 + f2;
                                rectF2.set(f14 - f12, f8 - f12, f14, f8 + f12);
                                rectF2.inset(-hl.L(8.0f), -hl.L(8.0f));
                            }
                        } else {
                            rectF2.setEmpty();
                        }
                        i2 = 0;
                        canvas.restore();
                    }
                }
                s8bVar = s8bVar2;
                i = i4;
                i2 = 0;
                canvas.restore();
            } else {
                s8bVar = s8bVar2;
                i = i4;
                c = 1;
                f = 8.0f;
                i2 = 0;
            }
            mmbVar.N();
            if (mmbVar.W != null) {
                canvas.save();
                int[] k2 = mmbVar.k();
                float f15 = k2[c] + mmbVar.b;
                float f16 = k2[0] + mmbVar.a;
                canvas.translate(f16, f15);
                int length3 = mmbVar.r(mmbVar.W, false).length();
                int i7 = mmbVar.u;
                if (i7 >= 0 && i7 <= length3) {
                    mmbVar.h(i7, dj2Var, false);
                    Layout layout2 = (Layout) dj2Var.d;
                    if (layout2 != null) {
                        int i8 = mmbVar.u - dj2Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i8);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i8);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + dj2Var.b);
                        float f17 = primaryHorizontal2 + dj2Var.c;
                        Rect rect2 = (Rect) dj2Var.e;
                        if (rect2 != null) {
                            f17 = rect2.left - mmbVar.a;
                            lineBottom2 = rect2.bottom - mmbVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(mmbVar.u);
                        }
                        float f18 = lineBottom2;
                        float f19 = f15 + f18;
                        if (f19 > i + mmbVar.d0 && f19 < mmbVar.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f20 = L;
                                canvas.translate(f17 - f20, f18);
                                float interpolation3 = overshootInterpolator.getInterpolation(mmbVar.V);
                                float f21 = f20 / 2.0f;
                                canvas.scale(interpolation3, interpolation3, f21, f21);
                                path.reset();
                                Path.Direction direction3 = Path.Direction.CCW;
                                path.addCircle(f21, f21, f21, direction3);
                                path.addRect(f21, 0.0f, f20, f21, direction3);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f22 = f16 + f17;
                                rectF.set(f22 - f20, f19 - f20, f22, f19 + f20);
                                rectF.inset(-hl.L(f), -hl.L(f));
                                i2++;
                            } else {
                                canvas.save();
                                canvas.translate(f17, f18);
                                float interpolation4 = overshootInterpolator.getInterpolation(mmbVar.V);
                                float f23 = L;
                                float f24 = f23 / 2.0f;
                                canvas.scale(interpolation4, interpolation4, f24, f24);
                                path.reset();
                                Path.Direction direction4 = Path.Direction.CCW;
                                path.addCircle(f24, f24, f24, direction4);
                                path.addRect(0.0f, 0.0f, f24, f24, direction4);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f25 = f16 + f17;
                                rectF.set(f25, f19 - f23, f25 + f23, f19 + f23);
                                rectF.inset(-hl.L(f), -hl.L(f));
                            }
                        } else {
                            if (f19 > 0.0f && f19 - mmbVar.l() < mmbVar.F.getMeasuredHeight()) {
                                i2++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i2 != 0 && mmbVar.i) {
                if (!mmbVar.j) {
                    mmbVar.M();
                }
                mmbVar.T(mmbVar.b0);
                if (mmbVar.I != mmbVar.H || mmbVar.L != mmbVar.K) {
                    invalidate();
                }
            }
            if (!mmbVar.Q) {
                hl.r(s8bVar);
                hl.c3(s8bVar);
            }
            cl4 cl4Var = mmbVar.Y;
            if (cl4Var != null) {
                cl4Var.invalidateContentRect();
                cl4 cl4Var2 = mmbVar.Y;
                if (cl4Var2 != null) {
                    cl4Var2.c();
                }
            }
            if (mmbVar.k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmb.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
