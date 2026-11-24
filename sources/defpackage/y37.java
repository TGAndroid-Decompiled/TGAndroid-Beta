package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class y37 extends FrameLayout {
    public final byte a;
    public final j47 b;

    public y37(j47 j47Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = j47Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        byte b = this.a;
        j47 j47Var = this.b;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                z37 z37Var = j47Var.a0;
                z37Var.e(canvas);
                ArrayList arrayList = z37Var.G;
                boolean z = true;
                float f = -1.0f;
                if (!arrayList.isEmpty()) {
                    yu3 yu3Var = (yu3) b00.f(1, arrayList);
                    ImageReceiver imageReceiver = yu3Var.r;
                    gl5 gl5Var = imageReceiver.g0;
                    if (gl5Var == null) {
                        gl5Var = imageReceiver.P;
                    }
                    if (gl5Var == null) {
                        gl5Var = imageReceiver.X;
                    }
                    if (gl5Var != null) {
                        String str = yu3Var.s;
                        if (str == null) {
                            TLRPC.Document document = gl5Var.i;
                            if (document != null) {
                                str = ba4.r("tgs", document);
                                yu3Var.s = str;
                            } else {
                                str = ba4.r("tgs", gl5Var.f);
                                yu3Var.s = str;
                            }
                        }
                        if (str != null) {
                            Float s = fl5.z().s(yu3Var.s);
                            if (s == null) {
                                s = Float.valueOf(1.0f);
                            }
                            f = (s.floatValue() * 0.55f) + 0.15f + (s.floatValue() * 0.3f);
                        }
                    }
                }
                if (f != -2.0f) {
                    j47Var.X.h((f < 0.0f || f >= 1.0f) ? false : false);
                }
                if (!z37Var.G.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                if (j47Var.E > 0.0f && j47Var.h != null) {
                    j47Var.n.reset();
                    float width = getWidth() / j47Var.e.getWidth();
                    j47Var.n.postScale(width, width);
                    j47Var.f.setLocalMatrix(j47Var.n);
                    j47Var.h.setAlpha((int) (j47Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), j47Var.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int measuredHeight;
        a47 a47Var;
        int height;
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                j47 j47Var = this.b;
                if (!j47Var.g0 || j47Var.h0) {
                    ArrayList arrayList = j47Var.N;
                    f47 f47Var = j47Var.K;
                    if (j47Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        j47Var.b(iArr);
                        j47Var.X.setScaleX(j47Var.W.getScaleX());
                        j47Var.X.setScaleY(j47Var.W.getScaleY());
                        int[] iArr2 = j47Var.r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = f47Var.getMeasuredHeight() - j47Var.X.getHeight();
                        if (j47Var.e0 != null) {
                            i5 = gl.L(320.0f);
                        } else {
                            i5 = 0;
                        }
                        int i6 = measuredHeight2 + i5;
                        int L = gl.L(8.0f) + j47Var.d.b;
                        if (arrayList.isEmpty()) {
                            f = -6.0f;
                        } else {
                            f = 48.0f;
                        }
                        int L2 = gl.L(f);
                        ViewGroup viewGroup = j47Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i7 = L2 + measuredHeight;
                        int measuredHeight3 = (j47Var.G.getMeasuredHeight() - gl.L(8.0f)) - j47Var.d.d;
                        if (iArr[1] + i7 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i7;
                        }
                        if (iArr[1] - i6 < L) {
                            iArr[1] = L + i6;
                        }
                        if (j47Var.W.getHeight() + iArr[1] + i7 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i7) - j47Var.W.getHeight();
                        }
                        j47Var.X.setX(gl.L(6.0f) + (iArr[0] - (a47Var.getWidth() - j47Var.X.l())));
                        j47Var.X.setY(iArr[1]);
                        if (j47Var.p0) {
                            iArr[0] = iArr[0] - (j47Var.Y - j47Var.W.l());
                        }
                        f47Var.setX((gl.L(7.0f) + iArr[0]) - f47Var.getMeasuredWidth());
                        if (j47Var.g0) {
                            ug8.t(f47Var.animate().translationY(((j47Var.X.getHeight() + iArr[1]) - f47Var.getMeasuredHeight()) - f47Var.getTop()), la2.V, 250L);
                        } else {
                            f47Var.setY((j47Var.X.getHeight() + iArr[1]) - f47Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = j47Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((gl.L(7.0f) + iArr[0]) - j47Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = j47Var.Z;
                            int i8 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -gl.L(6.0f);
                            } else {
                                height = j47Var.X.getHeight();
                            }
                            viewGroup3.setY(i8 + height);
                        }
                        FrameLayout frameLayout = j47Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(b00.c(6.0f, (j47Var.X.l() + iArr[0]) - j47Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = j47Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = j47Var.d0;
                                float max = Math.max(j47Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                j47Var.c0 = max;
                                frameLayout2.setY(max);
                                b47 b47Var = j47Var.e0;
                                if (b47Var != null) {
                                    b47Var.setY(Math.max(j47Var.d.b, (j47Var.l0.top - gl.L(24.0f)) - j47Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (j47Var.X.getHeight() + iArr[1]) - f47Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = j47Var.d0;
                                float max2 = Math.max(j47Var.d.b, height2 - frameLayout3.getMeasuredHeight()) + gl.L(24.0f);
                                j47Var.c0 = max2;
                                frameLayout3.setY(max2);
                                b47 b47Var2 = j47Var.e0;
                                if (b47Var2 != null) {
                                    b47Var2.setY(Math.max(0.0f, (height2 - b47Var2.getMeasuredHeight()) - j47Var.c0));
                                }
                            }
                        }
                    }
                    j47Var.g0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i, i2, i3, i4);
                j47 j47Var = this.b;
                tk0.c(j47Var.j0, j47Var.F);
                ViewGroup viewGroup = j47Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }
}
