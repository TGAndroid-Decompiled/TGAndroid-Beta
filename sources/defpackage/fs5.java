package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class fs5 extends FrameLayout {
    public final byte a = 0;
    public float b;
    public final Path c;
    public final Object d;
    public Object e;
    public final Object f;

    public fs5(hs5 hs5Var, Context context) {
        super(context);
        this.f = hs5Var;
        this.c = new Path();
        this.e = new RectF();
        this.b = -1.0f;
        jl0 c = hs5Var.getBaseSimpleGlass().c.c(this, null, false);
        c.p(dtd.l(hs5Var.getResourceProvider()));
        c.q(hl.L(6.0f));
        this.d = c;
        setWillNotDraw(false);
        addView(hs5Var.e, tre.c(-1.0f, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        View[] viewArr;
        Object obj;
        b8c G;
        byte b = this.a;
        Object obj2 = this.d;
        float f3 = 0.0f;
        Object obj3 = this.f;
        float f4 = 1.0f;
        Path path = this.c;
        switch (b) {
            case 0:
                RectF rectF = (RectF) this.e;
                jl0 jl0Var = (jl0) obj2;
                float f5 = ((hs5) obj3).a.f;
                if (f5 >= 1.0f) {
                    float min = Math.min(1.0f, f5 / hl.L(44.0f));
                    float L = (1.0f - min) * hl.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f5);
                    float min2 = Math.min(f5 / 2.0f, hl.L(22.0f));
                    if (Math.abs(min2 - this.b) > 0.5f) {
                        this.b = min2;
                        jl0Var.r(min2);
                    }
                    int L2 = hl.L(6.0f);
                    jl0Var.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    jl0Var.setAlpha((int) (min * 255.0f));
                    jl0Var.draw(canvas);
                    canvas.save();
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                nb9 nb9Var = (nb9) obj3;
                View[] viewPages = nb9Var.l1.getViewPages();
                this.b = 0.0f;
                int length = viewPages.length;
                int i = 0;
                while (i < length) {
                    View view = viewPages[i];
                    if (view == null) {
                        viewArr = viewPages;
                        obj = obj2;
                        f2 = f4;
                    } else {
                        mb9 mb9Var = (mb9) view;
                        FrameLayout frameLayout = mb9Var.e;
                        q9c q9cVar = mb9Var.f;
                        float i2 = Utilities.i(f4 - Math.abs(mb9Var.getTranslationX() / mb9Var.getMeasuredWidth()), f4, f3);
                        float f6 = this.b;
                        float paddingTop = frameLayout.getPaddingTop();
                        f2 = f4;
                        int i3 = 0;
                        while (true) {
                            int childCount = q9cVar.getChildCount();
                            viewArr = viewPages;
                            l9c l9cVar = q9cVar.g3;
                            float f7 = i2;
                            if (i3 < childCount) {
                                View childAt = q9cVar.getChildAt(i3);
                                q9cVar.f3.getClass();
                                int G2 = q79.G(childAt);
                                Object obj4 = obj2;
                                if (G2 >= 0 && G2 < l9cVar.E.size() && (G = l9cVar.G(G2)) != null && G.a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i3++;
                                viewPages = viewArr;
                                i2 = f7;
                                obj2 = obj4;
                            } else {
                                obj = obj2;
                                this.b = (paddingTop * f7) + f6;
                                if (mb9Var.getVisibility() == 0) {
                                    jo0 jo0Var = mb9Var.h;
                                    float f8 = -jo0Var.getHeight();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < q9cVar.getChildCount()) {
                                            View childAt2 = q9cVar.getChildAt(i4);
                                            q9cVar.f3.getClass();
                                            if (l9cVar.G(q79.G(childAt2)).a == 28) {
                                                f8 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    jo0Var.setTranslationY(Math.max(hl.m, f8));
                                }
                            }
                        }
                    }
                    i++;
                    f4 = f2;
                    viewPages = viewArr;
                    obj2 = obj;
                    f3 = 0.0f;
                }
                float f9 = f4;
                mm mmVar = (mm) obj2;
                if (this.b <= hl.m) {
                    f = f9;
                } else {
                    f = 0.0f;
                }
                float e = mmVar.e(false, f);
                float f10 = hl.m;
                float f11 = f10 * e;
                float max = Math.max(f10, this.b) - (hl.m * e);
                this.b = max;
                RectF rectF2 = hl.P;
                rectF2.set(nb9Var.u0, max, getWidth() - nb9Var.u0, hl.L(8.0f) + getHeight());
                float U1 = hl.U1(e, hl.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, U1, U1, nb9Var.m1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (f11 > hl.m / 2.0f) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z) {
                    if (hl.B(aob.v0(aob.h5, nb9Var.J0)) > 0.721f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (hl.B(aob.v(aob.v0(aob.s8, nb9Var.J0), 855638016)) > 0.721f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.e = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    hl.n3(nb9Var.getWindow(), z2);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() > ((hs5) obj).a.f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.b) {
                    ((nb9) obj).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 1:
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((hs5) this.f).x, 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                return;
        }
    }

    public fs5(nb9 nb9Var, Context context) {
        super(context);
        this.f = nb9Var;
        this.d = new mm(250L, this, k43.h);
        this.c = new Path();
    }
}
