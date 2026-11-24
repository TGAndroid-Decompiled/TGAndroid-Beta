package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class onb extends r59 {
    public boolean f3;
    public float g3;
    public final rob h3;

    public onb(rob robVar, Context context) {
        super(context, null);
        this.h3 = robVar;
    }

    @Override
    public final boolean G0(View view) {
        u69 T;
        onb onbVar = this.h3.w0;
        View F = onbVar.F(view);
        if (F == null) {
            T = null;
        } else {
            T = onbVar.T(F);
        }
        if (T != null && T.f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        u69 T;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            rc2Var.getMessageObject();
            ImageReceiver avatarImage = rc2Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean K2 = rc2Var.K2();
                rob robVar = this.h3;
                if (K2 && (T = robVar.w0.T(view)) != null) {
                    if (robVar.w0.K(T.b() - 1) != null) {
                        avatarImage.M0 = -gm.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = rc2Var.getTranslationX();
                int layoutHeight = rc2Var.getLayoutHeight() + view.getTop();
                int measuredHeight = robVar.w0.getMeasuredHeight() - robVar.w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (rc2Var.L2() && (r11 = robVar.w0.T(view)) != null) {
                    int i = 0;
                    while (i < 20) {
                        i++;
                        u69 T2 = robVar.w0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - gm.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof rc2) && ((rc2) view2).L2()) {
                            top = top2;
                        } else {
                            top = top2;
                            break;
                        }
                    }
                }
                if (layoutHeight - gm.L(48.0f) < top) {
                    layoutHeight = gm.L(48.0f) + top;
                }
                int i2 = (translationX > 0.0f ? 1 : (translationX == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.M0 = layoutHeight - gm.L(44.0f);
                avatarImage.h(canvas, null);
                if (i2 != 0) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override
    public final void k1(View view, float f, float f2, boolean z) {
        if (z && (view instanceof rc2) && !((rc2) view).E2(f)) {
            return;
        }
        super.k1(view, f, f2, z);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h3.X0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        rob robVar = this.h3;
        if (action == 1) {
            if (!robVar.t0 && (robVar.D1 instanceof mtc) && robVar.N0[0].getVisibility() == 0) {
                robVar.k1(0, false, true);
            }
            robVar.t0 = false;
        }
        if (robVar.c2) {
            if (motionEvent.getAction() == 0) {
                this.g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f3 && Math.abs(this.g3 - motionEvent.getX()) > gm.e) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            robVar.U1.a(motionEvent);
        }
        if (!this.f3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        rob robVar = this.h3;
        int i = 0;
        if (robVar.L0 != null) {
            int i2 = 0;
            while (true) {
                tsc[] tscVarArr = robVar.L0;
                if (i2 >= tscVarArr.length) {
                    break;
                }
                tscVarArr[i2].invalidate();
                i2++;
            }
        }
        if (robVar.M0 != null) {
            while (true) {
                tsc[] tscVarArr2 = robVar.M0;
                if (i >= tscVarArr2.length) {
                    break;
                }
                tscVarArr2[i].invalidate();
                i++;
            }
        }
        rnb rnbVar = robVar.F0;
        if (rnbVar != null) {
            rnbVar.invalidate();
        }
        rnb rnbVar2 = robVar.G0;
        if (rnbVar2 != null) {
            rnbVar2.invalidate();
        }
    }
}
