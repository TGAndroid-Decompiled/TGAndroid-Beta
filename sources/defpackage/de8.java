package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class de8 {
    public float A;
    public float B;
    public ValueAnimator C;
    public r47 D;
    public be8 E;
    public ce8 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup a;
    public final ViewGroup b;
    public final boolean c;
    public m98 d;
    public ViewGroup e;
    public ImageReceiver f;
    public ImageReceiver g;
    public ImageReceiver h;
    public boolean i;
    public final npa j;
    public mpa k;
    public final Path l;
    public final float[] m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public de8(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.j = new npa();
        this.l = new Path();
        this.m = new float[8];
        this.Q = new float[2];
        this.a = viewGroup;
        this.b = viewGroup2;
        this.c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, r47 r47Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        jn5 c;
        jn5 jn5Var;
        if (!i(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i6 = -1;
                int i7 = -1;
                for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
                    if (this.M == motionEvent.getPointerId(i8)) {
                        i6 = i8;
                    }
                    if (this.N == motionEvent.getPointerId(i8)) {
                        i7 = i8;
                    }
                }
                if (i6 != -1 && i7 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i7) - motionEvent.getX(i6), motionEvent.getY(i7) - motionEvent.getY(i6))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i7) - motionEvent.getX(i6), motionEvent.getY(i7) - motionEvent.getY(i6));
                        float x = (motionEvent.getX(i7) + motionEvent.getX(i6)) / 2.0f;
                        this.s = x;
                        this.G = x;
                        float y = (motionEvent.getY(i7) + motionEvent.getY(i6)) / 2.0f;
                        this.t = y;
                        this.H = y;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.e = viewGroup;
                        this.D = r47Var;
                        m98 m98Var = this.d;
                        ViewGroup viewGroup2 = this.a;
                        boolean z2 = this.c;
                        if (m98Var == null && !z2) {
                            i4 = -1;
                            m98 m98Var2 = new m98(this, viewGroup2.getContext());
                            this.d = m98Var2;
                            m98Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i4 = -1;
                        }
                        if (this.g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver(null);
                            this.g = imageReceiver2;
                            imageReceiver2.l1 = (byte) 2;
                            imageReceiver2.B0 = false;
                            imageReceiver2.I();
                            ImageReceiver imageReceiver3 = new ImageReceiver(null);
                            this.h = imageReceiver3;
                            imageReceiver3.l1 = (byte) 2;
                            imageReceiver3.B0 = false;
                            imageReceiver3.I();
                        }
                        this.n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z2) {
                            viewGroup2.addView(this.d);
                            if (r47Var != null && r47Var.t2() && !r47Var.O0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.i = z;
                            if (z && this.k == null) {
                                mpa e = mpa.e(this.d);
                                this.k = e;
                                if (e != null) {
                                    e.k.put(this.d, Integer.valueOf(i));
                                }
                            }
                            if (this.h.n() != null) {
                                this.h.n().recycle();
                                this.h.g0(null);
                            }
                            if (imageReceiver.n() != null && !imageReceiver.n().isRecycled() && this.i) {
                                this.h.f0(Utilities.D(imageReceiver.n(), false));
                                ImageReceiver imageReceiver4 = this.h;
                                ColorMatrixColorFilter colorMatrixColorFilter = this.S;
                                if (colorMatrixColorFilter == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    hl.l2(colorMatrix, 0.9f);
                                    hl.i(colorMatrix, 0.6f);
                                    ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                                    this.S = colorMatrixColorFilter2;
                                    colorMatrixColorFilter = colorMatrixColorFilter2;
                                }
                                imageReceiver4.p1 = colorMatrixColorFilter;
                            } else {
                                this.h.p1 = null;
                            }
                            if (r47Var == null || !r47.R3(r47Var.k)) {
                                i5 = i6;
                                i2 = i7;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = r47Var.k;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize w = xb4.w(r47Var.p0, hl.Y0(false), false, null, false);
                                        if (w != null) {
                                            int i9 = w.size;
                                            iArr[0] = i9;
                                            if (i9 == 0) {
                                                iArr[0] = i4;
                                            }
                                            c = jn5.f(w, r47Var.n0);
                                            jn5Var = c;
                                        } else {
                                            iArr[0] = i4;
                                        }
                                    }
                                    jn5Var = null;
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (r47.t3(message)) {
                                            c = jn5.b(r47Var.F0());
                                        } else {
                                            TLRPC.PhotoSize w2 = xb4.w(r47Var.p0, hl.Y0(false), false, null, true);
                                            if (w2 != null) {
                                                int i10 = w2.size;
                                                iArr[0] = i10;
                                                if (i10 == 0) {
                                                    iArr[0] = i4;
                                                }
                                                c = jn5.f(w2, r47Var.n0);
                                            } else {
                                                iArr[0] = i4;
                                                jn5Var = null;
                                            }
                                        }
                                        jn5Var = c;
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                            c = jn5.p(jxc.c(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                        } else {
                                            if (r47Var.F0() != null) {
                                                TLRPC.Document F0 = r47Var.F0();
                                                if (r47.W2(r47Var.F0())) {
                                                    TLRPC.PhotoSize w3 = xb4.w(F0.thumbs, 90, false, null, false);
                                                    int i11 = w3.size;
                                                    iArr[0] = i11;
                                                    if (i11 == 0) {
                                                        iArr[0] = i4;
                                                    }
                                                    c = jn5.c(w3, F0);
                                                }
                                            }
                                            jn5Var = null;
                                        }
                                        jn5Var = c;
                                    }
                                }
                                if (jn5Var != null) {
                                    i2 = i7;
                                    i5 = i6;
                                    this.g.Z(jn5Var, null, null, null, null, iArr[0], null, r47Var, r47Var.Y4() ? 1 : 0);
                                    this.g.l1 = (byte) 2;
                                } else {
                                    i5 = i6;
                                    i2 = i7;
                                }
                                h();
                            }
                            this.u = imageReceiver.L0;
                            this.v = imageReceiver.M0 + viewGroup.getPaddingTop();
                            this.w = imageReceiver.O0;
                            this.x = imageReceiver.N0;
                            this.y = imageReceiver.o();
                            float q = imageReceiver.q();
                            this.z = q;
                            float f = this.y;
                            float f2 = f / q;
                            float f3 = this.w;
                            float f4 = this.x;
                            float f5 = f3 / f4;
                            if (f2 != f5) {
                                if (f2 < f5) {
                                    this.z = (q / f) * f3;
                                    this.y = f3;
                                } else {
                                    this.y = f2 * f4;
                                    this.z = f4;
                                }
                            } else {
                                this.y = f3;
                                this.z = f4;
                            }
                            if (r47Var != null && r47.K4(r47Var.k) && MediaController.z().H(r47Var)) {
                                this.R = true;
                                MediaController z3 = MediaController.z();
                                m98 m98Var3 = this.d;
                                z3.s0((TextureView) m98Var3.d, (jx) m98Var3.e, (FrameLayout) m98Var3.c, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.c).getLayoutParams();
                                ((FrameLayout) this.d.c).setTag(2131296593, imageReceiver);
                                if (layoutParams.width != imageReceiver.N0 || layoutParams.height != imageReceiver.O0) {
                                    ((jx) this.d.e).setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.N0;
                                    layoutParams.height = (int) imageReceiver.O0;
                                    ((FrameLayout) this.d.c).setLayoutParams(layoutParams);
                                }
                                ((TextureView) this.d.d).setScaleX(1.0f);
                                ((TextureView) this.d.d).setScaleY(1.0f);
                                be8 be8Var = this.E;
                                if (be8Var != null) {
                                    this.d.b.setImageBitmap(be8Var.D().getBitmap((int) this.z, (int) this.y));
                                    this.d.b.t((int) this.z, (int) this.y);
                                    this.d.b.getImageReceiver().s0(imageReceiver.z());
                                }
                                ((FrameLayout) this.d.c).setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver(null);
                                this.f = imageReceiver5;
                                imageReceiver5.I();
                                Drawable t = imageReceiver.t();
                                this.f.g0(t);
                                if (t instanceof lm) {
                                    lm lmVar = (lm) t;
                                    lmVar.f(this.d);
                                    lmVar.S = true;
                                }
                                this.f.i0(this.u, this.v, this.x, this.w);
                                ImageReceiver imageReceiver6 = this.f;
                                imageReceiver6.S0 = imageReceiver.S0;
                                imageReceiver6.s0(imageReceiver.z());
                                this.g.s0(imageReceiver.z());
                                this.g.S0 = imageReceiver.S0;
                                ((FrameLayout) this.d.c).setVisibility(8);
                            }
                        } else {
                            i5 = i6;
                            i2 = i7;
                        }
                        be8 be8Var2 = this.E;
                        if (be8Var2 != null) {
                            be8Var2.k(r47Var);
                        }
                        this.P = 0.0f;
                        i3 = i5;
                    } else {
                        i2 = i7;
                        i3 = i6;
                    }
                    float x2 = motionEvent.getX(i3);
                    int i12 = i2;
                    float y2 = motionEvent.getY(i3);
                    float x3 = this.G - ((motionEvent.getX(i12) + x2) / 2.0f);
                    float y3 = this.H - ((motionEvent.getY(i12) + y2) / 2.0f);
                    float f6 = -x3;
                    float f7 = this.O;
                    this.J = f6 / f7;
                    this.K = (-y3) / f7;
                    e();
                } else {
                    this.L = false;
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                    d();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
                this.L = false;
                if (viewGroup != null && viewGroup.getParent() != null) {
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                }
                d();
            }
        } else if (!this.L && motionEvent.getPointerCount() == 2) {
            this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
            float x4 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.s = x4;
            this.G = x4;
            float y4 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.t = y4;
            this.H = y4;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.n) {
            be8 be8Var = this.E;
            if (be8Var != null) {
                be8Var.J(this.D);
            }
            this.n = false;
        }
        m98 m98Var = this.d;
        if (m98Var != null && m98Var.getParent() != null) {
            this.a.removeView(this.d);
            this.d.b.getImageReceiver().f();
            mpa mpaVar = this.k;
            if (mpaVar != null) {
                mpaVar.b(this.d);
                this.k = null;
            }
            ImageReceiver imageReceiver = this.f;
            if (imageReceiver != null) {
                Drawable t = imageReceiver.t();
                if (t instanceof lm) {
                    ((lm) t).w(this.d);
                }
            }
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f;
        if (imageReceiver2 != null) {
            imageReceiver2.K();
            this.f.f();
            this.f = null;
        }
        ImageReceiver imageReceiver3 = this.g;
        if (imageReceiver3 != null) {
            imageReceiver3.K();
            this.g.f();
            this.g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.K();
            this.h.f();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.n) {
            if (!this.c && !h()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new pv7(this, (byte) 9));
            this.C.addListener(new n88(this, (byte) 12));
            this.C.setDuration(220L);
            this.C.setInterpolator(k43.f);
            this.C.start();
        }
    }

    public void e() {
        ViewGroup viewGroup;
        if (this.c && (viewGroup = this.e) != null) {
            viewGroup.invalidate();
        }
        m98 m98Var = this.d;
        if (m98Var != null) {
            m98Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.n && view == this.e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (h() && this.e != null) {
            motionEvent.offsetLocation(-this.q, -this.r);
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final boolean h() {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (View view = this.e; view != this.a; view = (View) view.getParent()) {
            if (view != null) {
                f2 += view.getLeft();
                f3 += view.getTop();
                if (!(view.getParent() instanceof View)) {
                    break;
                }
            } else {
                return false;
            }
        }
        float f4 = 0.0f;
        for (View view2 = this.e; view2 != this.b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f += view2.getLeft();
            f4 += view2.getTop();
        }
        this.q = f;
        this.r = f4;
        this.o = f2;
        this.p = f3;
        return true;
    }

    public boolean i(ViewGroup viewGroup, ImageReceiver imageReceiver) {
        if (!this.c) {
            if (imageReceiver.t() instanceof lm) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((lm) imageReceiver.t()).v0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.s) {
                    return false;
                }
                return true;
            } else if (imageReceiver.T == null && imageReceiver.k0 == null) {
                Drawable drawable = imageReceiver.n0;
                if (!(drawable instanceof idc)) {
                    if (drawable == null || (drawable instanceof rb0) || imageReceiver.R != null || imageReceiver.i0 != null) {
                        return false;
                    }
                    return true;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public de8() {
        this.g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.j = new npa();
        this.l = new Path();
        this.m = new float[8];
        this.Q = new float[2];
        this.a = null;
        this.b = null;
        this.c = true;
    }

    public void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
    }
}
