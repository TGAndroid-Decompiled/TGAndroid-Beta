package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class nlb extends o39 {
    public boolean f3;
    public float g3;
    public final qmb h3;

    public nlb(qmb qmbVar, Context context) {
        super(context, null);
        this.h3 = qmbVar;
    }

    @Override
    public final boolean G0(View view) {
        s49 T;
        nlb nlbVar = this.h3.w0;
        View F = nlbVar.F(view);
        if (F == null) {
            T = null;
        } else {
            T = nlbVar.T(F);
        }
        if (T != null && T.f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        s49 T;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            gb2Var.getMessageObject();
            ImageReceiver avatarImage = gb2Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean K2 = gb2Var.K2();
                qmb qmbVar = this.h3;
                if (K2 && (T = qmbVar.w0.T(view)) != null) {
                    if (qmbVar.w0.K(T.b() - 1) != null) {
                        avatarImage.M0 = -gl.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = gb2Var.getTranslationX();
                int layoutHeight = gb2Var.getLayoutHeight() + view.getTop();
                int measuredHeight = qmbVar.w0.getMeasuredHeight() - qmbVar.w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (gb2Var.L2() && (r11 = qmbVar.w0.T(view)) != null) {
                    int i = 0;
                    while (i < 20) {
                        i++;
                        s49 T2 = qmbVar.w0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - gl.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof gb2) && ((gb2) view2).L2()) {
                            top = top2;
                        } else {
                            top = top2;
                            break;
                        }
                    }
                }
                if (layoutHeight - gl.L(48.0f) < top) {
                    layoutHeight = gl.L(48.0f) + top;
                }
                int i2 = (translationX > 0.0f ? 1 : (translationX == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.M0 = layoutHeight - gl.L(44.0f);
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
        if (z && (view instanceof gb2) && !((gb2) view).E2(f)) {
            return;
        }
        super.k1(view, f, f2, z);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h3.W0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        qmb qmbVar = this.h3;
        if (action == 1) {
            if (!qmbVar.t0 && (qmbVar.D1 instanceof krc) && qmbVar.N0[0].getVisibility() == 0) {
                qmbVar.j1(0, false, true);
            }
            qmbVar.t0 = false;
        }
        if (qmbVar.c2) {
            if (motionEvent.getAction() == 0) {
                this.g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f3 && Math.abs(this.g3 - motionEvent.getX()) > gl.e) {
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
            qmbVar.U1.a(motionEvent);
        }
        if (!this.f3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        qmb qmbVar = this.h3;
        int i = 0;
        if (qmbVar.L0 != null) {
            int i2 = 0;
            while (true) {
                rqc[] rqcVarArr = qmbVar.L0;
                if (i2 >= rqcVarArr.length) {
                    break;
                }
                rqcVarArr[i2].invalidate();
                i2++;
            }
        }
        if (qmbVar.M0 != null) {
            while (true) {
                rqc[] rqcVarArr2 = qmbVar.M0;
                if (i >= rqcVarArr2.length) {
                    break;
                }
                rqcVarArr2[i].invalidate();
                i++;
            }
        }
        qlb qlbVar = qmbVar.F0;
        if (qlbVar != null) {
            qlbVar.invalidate();
        }
        qlb qlbVar2 = qmbVar.G0;
        if (qlbVar2 != null) {
            qlbVar2.invalidate();
        }
    }
}
