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
public final class qib extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final rib r;

    public qib(rib ribVar, Context context) {
        super(context);
        this.r = ribVar;
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
        rib ribVar = this.r;
        if (ribVar.w() && !ribVar.i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && loe.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < ribVar.m) {
                    ribVar.J(motionEvent.getRawX(), motionEvent.getRawY());
                    ribVar.t();
                    ribVar.e(false);
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
        rib ribVar = this.r;
        if (ribVar.i0 && (viewGroup = ribVar.F) != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        kya kyaVar;
        int i;
        char c;
        float f;
        int i2;
        boolean isRtlCharAt;
        k27 k27Var;
        float f2;
        boolean z;
        int i3;
        rib ribVar = this.r;
        kya kyaVar2 = ribVar.m0;
        OvershootInterpolator overshootInterpolator = ribVar.c0;
        RectF rectF = ribVar.S;
        RectF rectF2 = ribVar.T;
        hi2 hi2Var = ribVar.a0;
        if (ribVar.w()) {
            int L = gl.L(22.0f);
            int i4 = ribVar.x;
            ribVar.M();
            mib mibVar = ribVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (mibVar != null) {
                canvas.save();
                int[] k = ribVar.k();
                c = 1;
                float f3 = k[1] + ribVar.b;
                f = 8.0f;
                float f4 = k[0] + ribVar.a;
                canvas.translate(f4, f3);
                mib mibVar2 = ribVar.W;
                if (mibVar2 instanceof gb2) {
                    k27Var = ((gb2) mibVar2).getMessageObject();
                } else {
                    k27Var = null;
                }
                if (k27Var != null && k27Var.O3()) {
                    paint.setColor(ribVar.s(bkb.Mc));
                } else {
                    paint.setColor(ribVar.s(bkb.lg));
                }
                int length = ribVar.r(ribVar.W, false).length();
                int i5 = ribVar.v;
                if (i5 >= 0 && i5 <= length) {
                    ribVar.h(i5, hi2Var, false);
                    Layout layout = (Layout) hi2Var.d;
                    if (layout != null) {
                        kyaVar = kyaVar2;
                        int i6 = ribVar.v - hi2Var.a;
                        int length2 = layout.getText().length();
                        if (i6 > length2) {
                            i6 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i6);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i6);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + hi2Var.b);
                        float f5 = primaryHorizontal + hi2Var.c;
                        Rect rect = (Rect) hi2Var.e;
                        if (rect != null) {
                            float f6 = rect.right - ribVar.a;
                            i3 = rect.bottom - ribVar.b;
                            f2 = f6;
                            z = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(ribVar.v);
                            f2 = f5;
                            z = isRtlCharAt2;
                            i3 = lineBottom;
                        }
                        float f7 = i3;
                        float f8 = f3 + f7;
                        i = i4;
                        if (f8 > i + ribVar.d0 && f8 < ribVar.F.getMeasuredHeight()) {
                            if (!z) {
                                canvas.save();
                                canvas.translate(f2, f7);
                                float interpolation = overshootInterpolator.getInterpolation(ribVar.V);
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
                                rectF2.inset(-gl.L(8.0f), -gl.L(8.0f));
                                i2 = 1;
                                canvas.restore();
                            } else {
                                canvas.save();
                                float f12 = L;
                                canvas.translate(f2 - f12, f7);
                                float interpolation2 = overshootInterpolator.getInterpolation(ribVar.V);
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
                                rectF2.inset(-gl.L(8.0f), -gl.L(8.0f));
                            }
                        } else {
                            rectF2.setEmpty();
                        }
                        i2 = 0;
                        canvas.restore();
                    }
                }
                kyaVar = kyaVar2;
                i = i4;
                i2 = 0;
                canvas.restore();
            } else {
                kyaVar = kyaVar2;
                i = i4;
                c = 1;
                f = 8.0f;
                i2 = 0;
            }
            ribVar.N();
            if (ribVar.W != null) {
                canvas.save();
                int[] k2 = ribVar.k();
                float f15 = k2[c] + ribVar.b;
                float f16 = k2[0] + ribVar.a;
                canvas.translate(f16, f15);
                int length3 = ribVar.r(ribVar.W, false).length();
                int i7 = ribVar.u;
                if (i7 >= 0 && i7 <= length3) {
                    ribVar.h(i7, hi2Var, false);
                    Layout layout2 = (Layout) hi2Var.d;
                    if (layout2 != null) {
                        int i8 = ribVar.u - hi2Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i8);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i8);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + hi2Var.b);
                        float f17 = primaryHorizontal2 + hi2Var.c;
                        Rect rect2 = (Rect) hi2Var.e;
                        if (rect2 != null) {
                            f17 = rect2.left - ribVar.a;
                            lineBottom2 = rect2.bottom - ribVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(ribVar.u);
                        }
                        float f18 = lineBottom2;
                        float f19 = f15 + f18;
                        if (f19 > i + ribVar.d0 && f19 < ribVar.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f20 = L;
                                canvas.translate(f17 - f20, f18);
                                float interpolation3 = overshootInterpolator.getInterpolation(ribVar.V);
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
                                rectF.inset(-gl.L(f), -gl.L(f));
                                i2++;
                            } else {
                                canvas.save();
                                canvas.translate(f17, f18);
                                float interpolation4 = overshootInterpolator.getInterpolation(ribVar.V);
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
                                rectF.inset(-gl.L(f), -gl.L(f));
                            }
                        } else {
                            if (f19 > 0.0f && f19 - ribVar.l() < ribVar.F.getMeasuredHeight()) {
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
            if (i2 != 0 && ribVar.i) {
                if (!ribVar.j) {
                    ribVar.M();
                }
                ribVar.T(ribVar.b0);
                if (ribVar.I != ribVar.H || ribVar.L != ribVar.K) {
                    invalidate();
                }
            }
            if (!ribVar.Q) {
                gl.r(kyaVar);
                gl.c3(kyaVar);
            }
            yi4 yi4Var = ribVar.Y;
            if (yi4Var != null) {
                yi4Var.invalidateContentRect();
                yi4 yi4Var2 = ribVar.Y;
                if (yi4Var2 != null) {
                    yi4Var2.c();
                }
            }
            if (ribVar.k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qib.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
