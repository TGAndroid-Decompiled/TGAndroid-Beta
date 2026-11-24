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
public final class y57 extends FrameLayout {
    public final byte a;
    public final j67 b;

    public y57(j67 j67Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = j67Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        byte b = this.a;
        j67 j67Var = this.b;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                z57 z57Var = j67Var.a0;
                z57Var.e(canvas);
                ArrayList arrayList = z57Var.G;
                boolean z = true;
                float f = -1.0f;
                if (!arrayList.isEmpty()) {
                    jw3 jw3Var = (jw3) b10.f(1, arrayList);
                    ImageReceiver imageReceiver = jw3Var.r;
                    gn5 gn5Var = imageReceiver.g0;
                    if (gn5Var == null) {
                        gn5Var = imageReceiver.P;
                    }
                    if (gn5Var == null) {
                        gn5Var = imageReceiver.X;
                    }
                    if (gn5Var != null) {
                        String str = jw3Var.s;
                        if (str == null) {
                            TLRPC.Document document = gn5Var.i;
                            if (document != null) {
                                str = bc4.r("tgs", document);
                                jw3Var.s = str;
                            } else {
                                str = bc4.r("tgs", gn5Var.f);
                                jw3Var.s = str;
                            }
                        }
                        if (str != null) {
                            Float s = fn5.z().s(jw3Var.s);
                            if (s == null) {
                                s = Float.valueOf(1.0f);
                            }
                            f = (s.floatValue() * 0.55f) + 0.15f + (s.floatValue() * 0.3f);
                        }
                    }
                }
                if (f != -2.0f) {
                    j67Var.X.h((f < 0.0f || f >= 1.0f) ? false : false);
                }
                if (!z57Var.G.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                if (j67Var.E > 0.0f && j67Var.h != null) {
                    j67Var.n.reset();
                    float width = getWidth() / j67Var.e.getWidth();
                    j67Var.n.postScale(width, width);
                    j67Var.f.setLocalMatrix(j67Var.n);
                    j67Var.h.setAlpha((int) (j67Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), j67Var.h);
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
        a67 a67Var;
        int height;
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                j67 j67Var = this.b;
                if (!j67Var.g0 || j67Var.h0) {
                    ArrayList arrayList = j67Var.N;
                    f67 f67Var = j67Var.K;
                    if (j67Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        j67Var.b(iArr);
                        j67Var.X.setScaleX(j67Var.W.getScaleX());
                        j67Var.X.setScaleY(j67Var.W.getScaleY());
                        int[] iArr2 = j67Var.r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = f67Var.getMeasuredHeight() - j67Var.X.getHeight();
                        if (j67Var.e0 != null) {
                            i5 = gm.L(320.0f);
                        } else {
                            i5 = 0;
                        }
                        int i6 = measuredHeight2 + i5;
                        int L = gm.L(8.0f) + j67Var.d.b;
                        if (arrayList.isEmpty()) {
                            f = -6.0f;
                        } else {
                            f = 48.0f;
                        }
                        int L2 = gm.L(f);
                        ViewGroup viewGroup = j67Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i7 = L2 + measuredHeight;
                        int measuredHeight3 = (j67Var.G.getMeasuredHeight() - gm.L(8.0f)) - j67Var.d.d;
                        if (iArr[1] + i7 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i7;
                        }
                        if (iArr[1] - i6 < L) {
                            iArr[1] = L + i6;
                        }
                        if (j67Var.W.getHeight() + iArr[1] + i7 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i7) - j67Var.W.getHeight();
                        }
                        j67Var.X.setX(gm.L(6.0f) + (iArr[0] - (a67Var.getWidth() - j67Var.X.l())));
                        j67Var.X.setY(iArr[1]);
                        if (j67Var.p0) {
                            iArr[0] = iArr[0] - (j67Var.Y - j67Var.W.l());
                        }
                        f67Var.setX((gm.L(7.0f) + iArr[0]) - f67Var.getMeasuredWidth());
                        if (j67Var.g0) {
                            wi8.t(f67Var.animate().translationY(((j67Var.X.getHeight() + iArr[1]) - f67Var.getMeasuredHeight()) - f67Var.getTop()), wb2.V, 250L);
                        } else {
                            f67Var.setY((j67Var.X.getHeight() + iArr[1]) - f67Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = j67Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((gm.L(7.0f) + iArr[0]) - j67Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = j67Var.Z;
                            int i8 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -gm.L(6.0f);
                            } else {
                                height = j67Var.X.getHeight();
                            }
                            viewGroup3.setY(i8 + height);
                        }
                        FrameLayout frameLayout = j67Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(b10.c(6.0f, (j67Var.X.l() + iArr[0]) - j67Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = j67Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = j67Var.d0;
                                float max = Math.max(j67Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                j67Var.c0 = max;
                                frameLayout2.setY(max);
                                b67 b67Var = j67Var.e0;
                                if (b67Var != null) {
                                    b67Var.setY(Math.max(j67Var.d.b, (j67Var.l0.top - gm.L(24.0f)) - j67Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (j67Var.X.getHeight() + iArr[1]) - f67Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = j67Var.d0;
                                float max2 = Math.max(j67Var.d.b, height2 - frameLayout3.getMeasuredHeight()) + gm.L(24.0f);
                                j67Var.c0 = max2;
                                frameLayout3.setY(max2);
                                b67 b67Var2 = j67Var.e0;
                                if (b67Var2 != null) {
                                    b67Var2.setY(Math.max(0.0f, (height2 - b67Var2.getMeasuredHeight()) - j67Var.c0));
                                }
                            }
                        }
                    }
                    j67Var.g0 = true;
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
                j67 j67Var = this.b;
                tl0.c(j67Var.j0, j67Var.F);
                ViewGroup viewGroup = j67Var.Z;
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
