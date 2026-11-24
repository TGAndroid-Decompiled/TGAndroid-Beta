package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.SessionsActivity;
public final class ns9 extends o39 {
    public final byte f3;
    public final Object g3;

    public ns9(byte b, Context context, Object obj) {
        super(context, null);
        this.f3 = b;
        this.g3 = obj;
    }

    @Override
    public final boolean I0(View view, float f, float f2) {
        switch (this.f3) {
            case 4:
                return true;
            case 7:
                if (!((vec) this.g3).n) {
                    return true;
                }
                int L = gl.L(6.0f);
                RectF rectF = ((tec) view).c;
                float f3 = L;
                if (rectF.left - f3 >= f || rectF.right + f3 <= f) {
                    return true;
                }
                return false;
            default:
                return super.I0(view, f, f2);
        }
    }

    @Override
    public final boolean S0() {
        switch (this.f3) {
            case 6:
                if (getAdapter() != null && ((x7c) this.g3).B1 && getAdapter().b() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public final Integer W0(int i) {
        int i2;
        switch (this.f3) {
            case 0:
                return 0;
            case 1:
            default:
                return super.W0(i);
            case 2:
                i2 = ((SessionsActivity) this.g3).terminateAllSessionsRow;
                wjb wjbVar = this.o2;
                if (i == i2) {
                    return Integer.valueOf(bkb.p1(0.1f, bkb.v0(bkb.o7, wjbVar)));
                }
                return Integer.valueOf(bkb.v0(bkb.h6, wjbVar));
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        switch (this.f3) {
            case 7:
                super.addView(view, i, layoutParams);
                if (((vec) this.g3).W) {
                    view.setScaleX(0.3f);
                    view.setScaleY(0.3f);
                    view.setAlpha(0.0f);
                    return;
                }
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setAlpha(1.0f);
                return;
            default:
                super.addView(view, i, layoutParams);
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f3) {
            case 1:
                hi3 hi3Var = (hi3) this.g3;
                t26 t26Var = hi3Var.f0;
                gb3 gb3Var = hi3Var.d0;
                mt9 mt9Var = hi3Var.e0;
                if (mt9Var != null && gb3Var != null && t26Var != null && mt9Var.n0) {
                    canvas.save();
                    invalidate();
                    int b = mt9Var.b() - 1;
                    int i = 0;
                    while (true) {
                        if (i < getChildCount()) {
                            View childAt = getChildAt(i);
                            if (RecyclerView.R(childAt) == b) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt.getTranslationY() + childAt.getBottom());
                            } else {
                                i++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (mt9Var != null && gb3Var != null && t26Var != null && mt9Var.n0) {
                    canvas.restore();
                }
                if (mt9Var != null && mt9Var.p0 != null) {
                    canvas.save();
                    canvas.translate(mt9Var.p0.getLeft(), mt9Var.p0.getTranslationY() + mt9Var.p0.getTop());
                    mt9Var.p0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                LinearLayout linearLayout = ((vs9) this.g3).f;
                if (linearLayout != null && linearLayout.getAlpha() > 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float floatValue;
        float floatValue2;
        switch (this.f3) {
            case 5:
                u0b u0bVar = (u0b) this.g3;
                ep epVar = u0bVar.f2;
                if ((view instanceof xya) && u0bVar.L1) {
                    int b = u0bVar.m1.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) epVar.d;
                    float f = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b - ((b / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) epVar.e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b - ((b / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) epVar.f;
                    if (!arrayList3.isEmpty()) {
                        f = ((Float) arrayList3.get(b - ((b / 6) * 6))).floatValue();
                    }
                    canvas.translate(floatValue2, f);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    invalidate();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        wjb wjbVar = this.o2;
        Object obj = this.g3;
        switch (b) {
            case 3:
                boolean g = xv2.e().g(motionEvent, ((kga) obj).l1, null, wjbVar);
                if (super.onInterceptTouchEvent(motionEvent) || g) {
                    return true;
                }
                return false;
            case 4:
            default:
                return super.onInterceptTouchEvent(motionEvent);
            case 5:
                u0b u0bVar = (u0b) obj;
                if (u0bVar.L1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean g2 = xv2.e().g(motionEvent, u0bVar.m1, u0bVar.g2, wjbVar);
                if (super.onInterceptTouchEvent(motionEvent) || g2) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f3) {
            case 4:
                ((kna) this.g3).D0();
                super.onLayout(z, i, i2, i3, i4);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 3:
                if (!((kga) obj).q1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
            default:
                super.requestLayout();
                return;
            case 5:
                if (!((u0b) obj).a2) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.f3) {
            case 7:
                super.setAlpha(f);
                ((vec) this.g3).invalidate();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.f3) {
            case 6:
                super.setTranslationY(f);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public ns9(KeyEvent.Callback callback, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.f3 = b;
        this.g3 = callback;
    }
}
