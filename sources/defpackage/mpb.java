package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class mpb extends d79 {
    public boolean f3;
    public float g3;
    public final pqb h3;

    public mpb(pqb pqbVar, Context context) {
        super(context, null);
        this.h3 = pqbVar;
    }

    @Override
    public final boolean H0(View view) {
        f89 U;
        mpb mpbVar = this.h3.w0;
        View G = mpbVar.G(view);
        if (G == null) {
            U = null;
        } else {
            U = mpbVar.U(G);
        }
        if (U != null && U.f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        f89 U;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            wb2Var.getMessageObject();
            ImageReceiver avatarImage = wb2Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean K2 = wb2Var.K2();
                pqb pqbVar = this.h3;
                if (K2 && (U = pqbVar.w0.U(view)) != null) {
                    if (pqbVar.w0.L(U.b() - 1) != null) {
                        avatarImage.M0 = -hl.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = wb2Var.getTranslationX();
                int layoutHeight = wb2Var.getLayoutHeight() + view.getTop();
                int measuredHeight = pqbVar.w0.getMeasuredHeight() - pqbVar.w0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (wb2Var.L2() && (r11 = pqbVar.w0.U(view)) != null) {
                    int i = 0;
                    while (i < 20) {
                        i++;
                        f89 U2 = pqbVar.w0.L(U2.b() + 1);
                        if (U2 == null) {
                            break;
                        }
                        View view2 = U2.a;
                        int top2 = view2.getTop();
                        if (layoutHeight - hl.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof wb2) && ((wb2) view2).L2()) {
                            top = top2;
                        } else {
                            top = top2;
                            break;
                        }
                    }
                }
                if (layoutHeight - hl.L(48.0f) < top) {
                    layoutHeight = hl.L(48.0f) + top;
                }
                int i2 = (translationX > 0.0f ? 1 : (translationX == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.M0 = layoutHeight - hl.L(44.0f);
                avatarImage.h(canvas, null);
                if (i2 != 0) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override
    public final void l1(View view, float f, float f2, boolean z) {
        if (z && (view instanceof wb2) && !((wb2) view).E2(f)) {
            return;
        }
        super.l1(view, f, f2, z);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h3.X0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        pqb pqbVar = this.h3;
        if (action == 1) {
            if (!pqbVar.t0 && (pqbVar.D1 instanceof yvc) && pqbVar.N0[0].getVisibility() == 0) {
                pqbVar.k1(0, false, true);
            }
            pqbVar.t0 = false;
        }
        if (pqbVar.c2) {
            if (motionEvent.getAction() == 0) {
                this.g3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f3 && Math.abs(this.g3 - motionEvent.getX()) > hl.e) {
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
            pqbVar.U1.a(motionEvent);
        }
        if (!this.f3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        pqb pqbVar = this.h3;
        int i = 0;
        if (pqbVar.L0 != null) {
            int i2 = 0;
            while (true) {
                fvc[] fvcVarArr = pqbVar.L0;
                if (i2 >= fvcVarArr.length) {
                    break;
                }
                fvcVarArr[i2].invalidate();
                i2++;
            }
        }
        if (pqbVar.M0 != null) {
            while (true) {
                fvc[] fvcVarArr2 = pqbVar.M0;
                if (i >= fvcVarArr2.length) {
                    break;
                }
                fvcVarArr2[i].invalidate();
                i++;
            }
        }
        ppb ppbVar = pqbVar.F0;
        if (ppbVar != null) {
            ppbVar.invalidate();
        }
        ppb ppbVar2 = pqbVar.G0;
        if (ppbVar2 != null) {
            ppbVar2.invalidate();
        }
    }
}
