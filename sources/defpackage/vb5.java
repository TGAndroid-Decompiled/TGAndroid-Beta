package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;
public final class vb5 extends View implements GestureDetector.OnGestureListener {
    public float E;
    public float F;
    public int G;
    public long H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Scroller O;
    public final GestureDetector P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public final Paint a;
    public ub5 a0;
    public final ArrayList b;
    public ValueAnimator b0;
    public final ArrayList c;
    public ValueAnimator c0;
    public final ArrayList d;
    public float d0;
    public final ArrayList e;
    public int f;
    public long h;
    public final int n;
    public final int r;
    public final int s;
    public final int w;
    public int x;
    public float y;

    public vb5(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.a = paint;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.E = 1.0f;
        this.F = 0.0f;
        this.M = -1;
        this.T = true;
        this.U = -1;
        this.W = true;
        this.P = new GestureDetector(contextThemeWrapper, this);
        this.O = new Scroller(contextThemeWrapper);
        this.n = gl.L(42.0f);
        this.r = gl.L(56.0f);
        this.w = gl.L(1.0f);
        this.s = i;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.A1 = false;
        } else {
            arrayList.remove(0);
            imageReceiver = (ImageReceiver) arrayList.get(0);
        }
        this.c.add(imageReceiver);
        imageReceiver.d = ((r78) this.a0).a.U;
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return (this.n + (this.w << 1)) * this.f;
    }

    private int getMinScrollX() {
        return (this.n + (this.w << 1)) * (-((this.d.size() - this.f) - 1));
    }

    public final void a(int i, boolean z) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (!z && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = false;
            this.y = 1.0f;
            this.E = 1.0f;
            this.F = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (!arrayList3.isEmpty()) {
                int measuredWidth = getMeasuredWidth();
                int i4 = this.n;
                int measuredWidth2 = (getMeasuredWidth() / 2) - (i4 / 2);
                int i5 = this.w;
                if (z) {
                    int size = arrayList2.size();
                    int i6 = 0;
                    i2 = Integer.MIN_VALUE;
                    i3 = Integer.MAX_VALUE;
                    while (i6 < size) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i6);
                        int i7 = imageReceiver.f;
                        int i8 = ((i4 + i5) * (i7 - this.f)) + measuredWidth2 + i;
                        if (i8 > measuredWidth || i8 + i4 < 0) {
                            arrayList.add(imageReceiver);
                            arrayList2.remove(i6);
                            size--;
                            i6--;
                        }
                        i3 = Math.min(i3, i7 - 1);
                        i2 = Math.max(i2, i7 + 1);
                        i6++;
                    }
                } else {
                    i2 = this.f;
                    i3 = i2 - 1;
                }
                int i9 = this.r;
                int i10 = this.s;
                ArrayList arrayList4 = this.e;
                if (i2 != Integer.MIN_VALUE) {
                    int size2 = arrayList3.size();
                    while (i2 < size2) {
                        int i11 = ((i4 + i5) * (i2 - this.f)) + measuredWidth2 + i;
                        if (i11 >= measuredWidth) {
                            break;
                        }
                        gl5 gl5Var = (gl5) arrayList3.get(i2);
                        ImageReceiver freeReceiver = getFreeReceiver();
                        int i12 = measuredWidth;
                        int i13 = measuredWidth2;
                        freeReceiver.i0(i11, i10, i4, i9);
                        if (arrayList4.get(0) instanceof k27) {
                            obj2 = arrayList4.get(i2);
                        } else {
                            boolean z2 = arrayList4.get(0) instanceof TL_iv.PageBlock;
                            ub5 ub5Var = this.a0;
                            if (z2) {
                                l98 l98Var = ((r78) ub5Var).a.i7;
                                if (l98Var != null) {
                                    obj2 = l98Var.g();
                                } else {
                                    obj2 = null;
                                }
                            } else {
                                obj2 = "avatar_" + ((r78) ub5Var).a.y5;
                            }
                        }
                        freeReceiver.Z(null, null, gl5Var, "80_80", null, 0L, null, obj2, 1);
                        freeReceiver.f = i2;
                        i2++;
                        measuredWidth = i12;
                        measuredWidth2 = i13;
                    }
                }
                int i14 = measuredWidth2;
                if (i3 != Integer.MAX_VALUE) {
                    while (i3 >= 0) {
                        int i15 = ((i4 + i5) * (i3 - this.f)) + i14 + i + i4;
                        if (i15 <= 0) {
                            break;
                        }
                        gl5 gl5Var2 = (gl5) arrayList3.get(i3);
                        ImageReceiver freeReceiver2 = getFreeReceiver();
                        freeReceiver2.i0(i15, i10, i4, i9);
                        if (arrayList4.get(0) instanceof k27) {
                            obj = arrayList4.get(i3);
                        } else {
                            boolean z3 = arrayList4.get(0) instanceof TL_iv.PageBlock;
                            ub5 ub5Var2 = this.a0;
                            if (z3) {
                                l98 l98Var2 = ((r78) ub5Var2).a.i7;
                                if (l98Var2 != null) {
                                    obj = l98Var2.g();
                                } else {
                                    obj = null;
                                }
                            } else {
                                obj = "avatar_" + ((r78) ub5Var2).a.y5;
                            }
                        }
                        freeReceiver2.Z(null, null, gl5Var2, "80_80", null, 0L, null, obj, 1);
                        freeReceiver2.f = i3;
                        i3--;
                    }
                }
                ValueAnimator valueAnimator = this.b0;
                if (valueAnimator != null && !valueAnimator.isStarted()) {
                    this.b0.start();
                }
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb5.b():void");
    }

    public final boolean c() {
        if (this.V && this.c0 == null) {
            if (this.d0 <= 0.0f && this.W) {
                ValueAnimator valueAnimator = this.b0;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.V = false;
        if (this.T) {
            this.d0 = 0.0f;
        }
    }

    public final void e() {
        this.Q = false;
        Scroller scroller = this.O;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i = this.U;
        if (i >= 0 && i < this.e.size()) {
            this.R = true;
            this.N = false;
            int i2 = this.U;
            this.M = i2;
            this.G = i2;
            this.K = (this.n + this.w) * (this.f - i2);
            this.L = this.x;
            this.y = 1.0f;
            this.U = -1;
            ub5 ub5Var = this.a0;
            if (ub5Var != null) {
                PhotoViewer photoViewer = ((r78) ub5Var).a;
                if (PhotoViewer.a2(photoViewer.S4)) {
                    photoViewer.Y2 = true;
                    photoViewer.Y0(true);
                    photoViewer.w(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i;
        List list;
        int i2;
        int i3;
        int i4 = this.x;
        int abs = Math.abs(i4);
        int i5 = this.n;
        int i6 = this.w;
        int i7 = (i5 / 2) + i6;
        int i8 = -1;
        if (abs > i7) {
            if (i4 > 0) {
                i2 = i4 - i7;
                i3 = 1;
            } else {
                i2 = i4 + i7;
                i3 = -1;
            }
            i = (i2 / (i5 + (i6 << 1))) + i3;
        } else {
            i = 0;
        }
        this.U = this.f - i;
        PhotoViewer photoViewer = ((r78) this.a0).a;
        int i9 = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        l98 l98Var = photoViewer.i7;
        if (l98Var != null) {
            list = l98Var.getAll();
        } else {
            list = null;
        }
        int i10 = this.U;
        if (i9 != i10 && i10 >= 0 && i10 < this.d.size()) {
            Object obj = this.e.get(this.U);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i8 = arrayList2.indexOf((k27) obj);
            } else if (list != null && !list.isEmpty()) {
                i8 = list.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i8 = arrayList.indexOf((gl5) obj);
            }
            if (i8 >= 0) {
                this.S = true;
                ((r78) this.a0).a(i8);
            }
        }
        if (!this.Q) {
            this.Q = true;
            this.R = false;
        }
        a(this.x, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.O;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.M = -1;
        this.N = false;
        return true;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        float f;
        float interpolation;
        int i4;
        int i5;
        int i6;
        float f2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z = this.V;
        ArrayList arrayList = this.c;
        if (z || !arrayList.isEmpty()) {
            float f3 = this.d0;
            if (!this.W) {
                if (this.V) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
            }
            Paint paint = this.a;
            paint.setAlpha((int) (f3 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i7 = this.x;
                int i8 = this.n;
                float f4 = i8;
                int i9 = (int) (f4 * 2.0f);
                int L = gl.L(8.0f);
                int i10 = this.f;
                ArrayList arrayList2 = this.d;
                gl5 gl5Var = (gl5) arrayList2.get(i10);
                int i11 = this.r;
                if (gl5Var != null && (photoSize2 = gl5Var.k) != null) {
                    i = Math.max(i8, (int) ((i11 / photoSize2.h) * photoSize2.w));
                } else {
                    i = i11;
                }
                int min = Math.min(i9, i);
                float f5 = L << 1;
                float f6 = this.E;
                int i12 = ((int) ((min - i8) * f6)) + i8 + ((int) (f5 * f6));
                int i13 = this.G;
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    gl5 gl5Var2 = (gl5) arrayList2.get(this.G);
                    if (gl5Var2 != null && (photoSize = gl5Var2.k) != null) {
                        i11 = Math.max(i8, (int) ((i11 / photoSize.h) * photoSize.w));
                    }
                } else {
                    i11 = i8;
                }
                int min2 = Math.min(i9, i11);
                float f7 = this.F;
                int i14 = (int) (f5 * f7);
                float f8 = i7;
                float f9 = (((min2 + i14) - i8) / 2) * f7;
                if (this.G > this.f) {
                    i3 = -1;
                } else {
                    i3 = 1;
                }
                int i15 = (int) ((f9 * i3) + f8);
                int i16 = ((int) ((min2 - i8) * f7)) + i8 + i14;
                int measuredWidth = (getMeasuredWidth() - i12) / 2;
                int i17 = 0;
                while (i17 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i17);
                    int i18 = imageReceiver.f;
                    int i19 = this.f;
                    if (i18 == i19) {
                        imageReceiver.L0 = (i2 / 2) + measuredWidth + i15;
                        imageReceiver.N0 = i12 - i2;
                        i6 = size;
                    } else {
                        int i20 = this.G;
                        i6 = size;
                        int i21 = this.w;
                        if (i20 < i19) {
                            if (i18 < i19) {
                                int i22 = i18 - i19;
                                if (i18 <= i20) {
                                    f2 = ((((i8 + i21) * (i22 + 1)) + measuredWidth) - (i21 + i16)) + i15;
                                    imageReceiver.L0 = f2;
                                } else {
                                    f2 = ((i21 + i8) * i22) + measuredWidth + i15;
                                    imageReceiver.L0 = f2;
                                }
                            } else {
                                f2 = ((i21 + i8) * ((i18 - i19) - 1)) + measuredWidth + i12 + i21 + i15;
                                imageReceiver.L0 = f2;
                            }
                        } else if (i18 < i19) {
                            f2 = ((i21 + i8) * (i18 - i19)) + measuredWidth + i15;
                            imageReceiver.L0 = f2;
                        } else {
                            int i23 = measuredWidth + i12 + i21;
                            int i24 = i18 - i19;
                            if (i18 <= i20) {
                                f2 = ((i21 + i8) * (i24 - 1)) + i23 + i15;
                                imageReceiver.L0 = f2;
                            } else {
                                f2 = i21 + i16 + ((i8 + i21) * (i24 - 2)) + i23 + i15;
                                imageReceiver.L0 = f2;
                            }
                        }
                        if (i18 == i20) {
                            imageReceiver.N0 = i16 - i14;
                            imageReceiver.L0 = (int) (f2 + (i14 / 2));
                        } else {
                            imageReceiver.N0 = f4;
                        }
                    }
                    imageReceiver.setAlpha(this.d0);
                    imageReceiver.q0(gl.L(2.0f));
                    imageReceiver.h(canvas, null);
                    i17++;
                    size = i6;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.H;
                if (j > 17) {
                    j = 17;
                }
                this.H = currentTimeMillis;
                int i25 = this.M;
                if (i25 >= 0) {
                    float f10 = this.y;
                    if (f10 > 0.0f) {
                        float f11 = (float) j;
                        if (this.N) {
                            f = 100.0f;
                        } else {
                            f = 200.0f;
                        }
                        float f12 = f10 - (f11 / f);
                        this.y = f12;
                        if (i25 == this.f) {
                            float f13 = this.E;
                            if (f13 < 1.0f) {
                                f13 += f11 / 200.0f;
                                this.E = f13;
                                if (f13 > 1.0f) {
                                    this.E = 1.0f;
                                    f13 = 1.0f;
                                }
                            }
                            this.x = this.L + ((int) Math.ceil(f13 * (this.K - i5)));
                        } else {
                            s33 s33Var = s33.g;
                            this.F = s33Var.getInterpolation(1.0f - f12);
                            if (this.R) {
                                float f14 = this.E;
                                if (f14 > 0.0f) {
                                    float f15 = f14 - (f11 / 200.0f);
                                    this.E = f15;
                                    if (f15 < 0.0f) {
                                        this.E = 0.0f;
                                    }
                                }
                                this.x = this.L + ((int) Math.ceil(interpolation * (this.K - i4)));
                            } else {
                                this.E = s33Var.getInterpolation(this.y);
                                this.x = (int) Math.ceil(this.F * this.K);
                            }
                        }
                        if (this.y <= 0.0f) {
                            this.f = this.M;
                            this.y = 1.0f;
                            this.E = 1.0f;
                            this.F = 0.0f;
                            this.I = false;
                            this.R = false;
                            this.x = 0;
                            this.M = -1;
                            this.N = false;
                        }
                    }
                    a(this.x, true);
                    invalidate();
                }
                if (this.Q) {
                    float f16 = this.E;
                    if (f16 > 0.0f) {
                        float f17 = f16 - (((float) j) / 200.0f);
                        this.E = f17;
                        if (f17 < 0.0f) {
                            this.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                Scroller scroller = this.O;
                if (!scroller.isFinished()) {
                    if (scroller.computeScrollOffset()) {
                        this.x = scroller.getCurrX();
                        f();
                        invalidate();
                    }
                    if (scroller.isFinished()) {
                        e();
                    }
                }
            }
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Scroller scroller = this.O;
        scroller.abortAnimation();
        if (this.d.size() >= 10) {
            scroller.fling(this.x, 0, Math.round(f), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(0, false);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.x = (int) (this.x - f);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i = this.x;
        if (i < minScrollX) {
            this.x = minScrollX;
        } else if (i > maxScrollX) {
            this.x = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        List list;
        PhotoViewer photoViewer = ((r78) this.a0).a;
        int i = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        l98 l98Var = photoViewer.i7;
        if (l98Var != null) {
            list = l98Var.getAll();
        } else {
            list = null;
        }
        e();
        ArrayList arrayList3 = this.c;
        int size = arrayList3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i2);
            if (imageReceiver.H(motionEvent.getX(), motionEvent.getY())) {
                int i3 = imageReceiver.f;
                if (i3 >= 0) {
                    ArrayList arrayList4 = this.e;
                    if (i3 < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((k27) arrayList4.get(i3));
                            if (i != indexOf) {
                                this.y = 1.0f;
                                this.J = true;
                                ((r78) this.a0).a(indexOf);
                                return false;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            int indexOf2 = list.indexOf((TL_iv.PageBlock) arrayList4.get(i3));
                            if (i != indexOf2) {
                                this.y = 1.0f;
                                this.J = true;
                                ((r78) this.a0).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((gl5) arrayList4.get(i3));
                            if (i != indexOf3) {
                                this.y = 1.0f;
                                this.J = true;
                                ((r78) this.a0).a(indexOf3);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            i2++;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.d.isEmpty() && getAlpha() == 1.0f) {
            if (this.P.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
                z = true;
            }
            if (this.Q && motionEvent.getAction() == 1 && this.O.isFinished()) {
                e();
            }
        }
        return z;
    }

    public void setAnimateBackground(boolean z) {
        this.W = z;
    }

    public void setAnimationsEnabled(boolean z) {
        if (this.T != z) {
            this.T = z;
            if (!z) {
                ValueAnimator valueAnimator = this.b0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.b0 = null;
                }
                ValueAnimator valueAnimator2 = this.c0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.c0 = null;
                }
                this.d0 = 0.0f;
                invalidate();
            }
        }
    }

    public void setDelegate(ub5 ub5Var) {
        this.a0 = ub5Var;
    }

    public void setMoveProgress(float f) {
        int i;
        float f2;
        boolean z;
        if (!this.Q && this.M < 0) {
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int i3 = this.f;
            if (i2 > 0) {
                i = i3 - 1;
                this.G = i;
            } else {
                i = i3 + 1;
                this.G = i;
            }
            ArrayList arrayList = this.d;
            if (i >= 0 && i < arrayList.size()) {
                f2 = 1.0f - Math.abs(f);
                this.E = f2;
            } else {
                this.E = 1.0f;
                f2 = 1.0f;
            }
            this.F = 1.0f - f2;
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            this.I = z;
            invalidate();
            if (!arrayList.isEmpty()) {
                if (f >= 0.0f || this.f != arrayList.size() - 1) {
                    if (i2 <= 0 || this.f != 0) {
                        int i4 = (int) (f * (this.n + this.w));
                        this.x = i4;
                        a(i4, true);
                    }
                }
            }
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
