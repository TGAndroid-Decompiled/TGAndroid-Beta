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
public final class pu9 extends r59 {
    public final byte f3;
    public final Object g3;

    public pu9(byte b, Context context, Object obj) {
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
                if (!((vgc) this.g3).n) {
                    return true;
                }
                int L = gm.L(6.0f);
                RectF rectF = ((tgc) view).c;
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
                if (getAdapter() != null && ((y9c) this.g3).B1 && getAdapter().b() <= 2) {
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
                ylb ylbVar = this.o2;
                if (i == i2) {
                    return Integer.valueOf(cmb.p1(0.1f, cmb.v0(cmb.o7, ylbVar)));
                }
                return Integer.valueOf(cmb.v0(cmb.h6, ylbVar));
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        switch (this.f3) {
            case 7:
                super.addView(view, i, layoutParams);
                if (((vgc) this.g3).W) {
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
                sj3 sj3Var = (sj3) this.g3;
                u46 u46Var = sj3Var.f0;
                sc3 sc3Var = sj3Var.d0;
                ov9 ov9Var = sj3Var.e0;
                if (ov9Var != null && sc3Var != null && u46Var != null && ov9Var.n0) {
                    canvas.save();
                    invalidate();
                    int b = ov9Var.b() - 1;
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
                if (ov9Var != null && sc3Var != null && u46Var != null && ov9Var.n0) {
                    canvas.restore();
                }
                if (ov9Var != null && ov9Var.p0 != null) {
                    canvas.save();
                    canvas.translate(ov9Var.p0.getLeft(), ov9Var.p0.getTranslationY() + ov9Var.p0.getTop());
                    ov9Var.p0.draw(canvas);
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
                LinearLayout linearLayout = ((xu9) this.g3).f;
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
                x2b x2bVar = (x2b) this.g3;
                eq eqVar = x2bVar.f2;
                if ((view instanceof y0b) && x2bVar.L1) {
                    int b = x2bVar.m1.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) eqVar.d;
                    float f = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b - ((b / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) eqVar.e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b - ((b / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) eqVar.f;
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
        ylb ylbVar = this.o2;
        Object obj = this.g3;
        switch (b) {
            case 3:
                boolean g = hx2.e().g(motionEvent, ((mia) obj).l1, null, ylbVar);
                if (super.onInterceptTouchEvent(motionEvent) || g) {
                    return true;
                }
                return false;
            case 4:
            default:
                return super.onInterceptTouchEvent(motionEvent);
            case 5:
                x2b x2bVar = (x2b) obj;
                if (x2bVar.L1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean g2 = hx2.e().g(motionEvent, x2bVar.m1, x2bVar.g2, ylbVar);
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
                ((kpa) this.g3).D0();
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
                if (!((mia) obj).q1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 4:
            default:
                super.requestLayout();
                return;
            case 5:
                if (!((x2b) obj).a2) {
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
                ((vgc) this.g3).invalidate();
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

    public pu9(KeyEvent.Callback callback, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
        this.g3 = callback;
    }
}
