package defpackage;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r09 extends FrameLayout {
    public int E;
    public boolean F;
    public vva G;
    public final o09 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final o09 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final t09 Q;
    public final q09 a;
    public final q09 b;
    public final q09 c;
    public final ImageReceiver d;
    public h19 e;
    public oh8 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public r09(t09 t09Var, Context context) {
        super(context);
        this.Q = t09Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.H = new o09(this, (byte) 0);
        this.J = 1.0f;
        this.L = new o09(this, (byte) 1);
        this.P = true;
        q09 q09Var = new q09(this, context, (byte) 0);
        this.a = q09Var;
        q09 q09Var2 = new q09(this, context, (byte) 1);
        this.b = q09Var2;
        q09Var.getImageReceiver().M(0);
        q09Var.getImageReceiver().v0 = false;
        q09 q09Var3 = new q09(this, context, (byte) 2);
        this.c = q09Var3;
        addView(q09Var, nme.e(34, 34, 17));
        addView(q09Var3, nme.e(34, 34, 17));
        addView(q09Var2, nme.e(34, 34, 17));
        if (t09Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        q09Var.setLayerNum(Integer.MAX_VALUE);
        q09Var2.setLayerNum(Integer.MAX_VALUE);
        q09Var2.a.M(0);
        ImageReceiver imageReceiver = q09Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        q09Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public final void a() {
        ImageReceiver imageReceiver;
        q09 q09Var = this.b;
        vl vlVar = q09Var.e;
        if (vlVar != null) {
            imageReceiver = vlVar.k;
        } else {
            imageReceiver = q09Var.a;
        }
        if (imageReceiver != null && imageReceiver.y() != null) {
            t09 t09Var = this.Q;
            if (t09Var.y0 == null && !this.O && t09Var.H0) {
                if (imageReceiver.y().b0 <= 2) {
                    imageReceiver.y().stop();
                    return;
                }
                return;
            }
            imageReceiver.y().start();
        }
    }

    public final void b(int i) {
        float f;
        float f2;
        float f3 = 0.76f;
        if (!this.Q.k0) {
            c();
            this.n = true;
            if (!this.r) {
                this.b.setVisibility(0);
                q09 q09Var = this.b;
                float f4 = this.J;
                if (this.x) {
                    f2 = 0.76f;
                } else {
                    f2 = 1.0f;
                }
                q09Var.setScaleY(f4 * f2);
                q09 q09Var2 = this.b;
                float f5 = this.J;
                if (!this.x) {
                    f3 = 1.0f;
                }
                q09Var2.setScaleX(f5 * f3);
                return;
            }
            return;
        }
        gl.r(this.H);
        if (this.r) {
            if (this.a.getImageReceiver().y() != null && !this.a.getImageReceiver().y().t() && !this.n) {
                this.n = true;
                if (i == 0) {
                    this.F = false;
                    this.a.getImageReceiver().y().stop();
                    this.a.getImageReceiver().y().I(0, false, false);
                    this.H.run();
                    return;
                }
                this.F = true;
                this.a.getImageReceiver().y().stop();
                this.a.getImageReceiver().y().I(0, false, false);
                gl.d3(this.H, i);
                return;
            }
            if (this.a.getImageReceiver().y() != null && this.n && !this.a.getImageReceiver().y().l0 && !this.a.getImageReceiver().y().t()) {
                this.a.getImageReceiver().y().I(this.a.getImageReceiver().y().e[0] - 1, false, false);
            }
            q09 q09Var3 = this.b;
            float f6 = this.J;
            if (this.x) {
                f = 0.76f;
            } else {
                f = 1.0f;
            }
            q09Var3.setScaleY(f6 * f);
            q09 q09Var4 = this.b;
            float f7 = this.J;
            if (!this.x) {
                f3 = 1.0f;
            }
            q09Var4.setScaleX(f7 * f3);
        } else if (!this.n) {
            this.J = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new u28(this, (byte) 28));
            this.K.setDuration(150L);
            this.K.setInterpolator(s33.h);
            this.K.setStartDelay(i * this.Q.c);
            this.K.start();
            this.n = true;
        }
    }

    public final void c() {
        float f;
        float f2;
        boolean z = this.r;
        t09 t09Var = this.Q;
        float f3 = 1.0f;
        q09 q09Var = this.b;
        if (z) {
            gl.r(this.H);
            q09 q09Var2 = this.a;
            if (q09Var2.getImageReceiver().y() != null && !q09Var2.getImageReceiver().y().t()) {
                q09Var2.getImageReceiver().y().stop();
                if (t09Var.k0) {
                    q09Var2.getImageReceiver().y().I(0, false, true);
                } else {
                    q09Var2.getImageReceiver().y().I(q09Var2.getImageReceiver().y().e[0] - 1, false, true);
                }
            }
            q09Var.setVisibility(4);
            q09Var2.setVisibility(0);
            this.w = false;
            float f4 = this.J;
            if (this.x) {
                f2 = 0.76f;
            } else {
                f2 = 1.0f;
            }
            q09Var.setScaleY(f4 * f2);
            float f5 = this.J;
            if (this.x) {
                f3 = 0.76f;
            }
            q09Var.setScaleX(f5 * f3);
        } else {
            q09Var.animate().cancel();
            if (t09Var.O0) {
                float f6 = this.J;
                if (this.x) {
                    f = 0.76f;
                } else {
                    f = 1.0f;
                }
                q09Var.setScaleY(f6 * f);
                float f7 = this.J;
                if (this.x) {
                    f3 = 0.76f;
                }
                q09Var.setScaleX(f7 * f3);
            } else {
                q09Var.setScaleY(0.0f);
                q09Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    public final void d(int i, h19 h19Var) {
        boolean z;
        boolean z2;
        int i2;
        t09 t09Var = this.Q;
        wjb wjbVar = t09Var.l0;
        byte b = t09Var.N0;
        f(h19Var, false);
        h19 h19Var2 = this.e;
        if (h19Var2 != null && h19Var2.equals(h19Var)) {
            this.E = i;
            e(h19Var);
            return;
        }
        boolean p = y6c.h(t09Var.K).p();
        if ((b == 3 && !p) || (b == 5 && h19Var.d && !p)) {
            z = true;
        } else {
            z = false;
        }
        this.I = z;
        q09 q09Var = this.b;
        if (z && this.f == null) {
            oh8 oh8Var = new oh8(1, null, getContext());
            this.f = oh8Var;
            oh8Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f.setImageReceiver(q09Var.getImageReceiver());
            addView(this.f, nme.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        oh8 oh8Var2 = this.f;
        if (oh8Var2 != null) {
            if (this.I) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            oh8Var2.setVisibility(i2);
        }
        c();
        this.e = h19Var;
        if (!h19Var.a && (h19Var.f == null || ((!t09Var.n() && !t09Var.H0) || !e66.e(8200)))) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.r = z2;
        if (b == 4 || this.e.b) {
            this.r = false;
        }
        h19 h19Var3 = this.e;
        boolean z3 = h19Var3.a;
        q09 q09Var2 = this.c;
        q09 q09Var3 = this.a;
        if (!z3 && h19Var3.f == null) {
            q09Var2.getImageReceiver().f();
            q09Var.getImageReceiver().f();
            vl vlVar = new vl(4, t09Var.K, this.e.g);
            vl vlVar2 = new vl(3, t09Var.K, this.e.g);
            if (b != 1 && b != 2 && b != 4) {
                int i3 = bkb.u6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                zkb.x(this, vlVar, i3, wjbVar, mode);
                zkb.x(this, vlVar2, i3, wjbVar, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                vlVar.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                vlVar2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            q09Var2.setAnimatedEmojiDrawable(vlVar);
            q09Var.setAnimatedEmojiDrawable(vlVar2);
            oh8 oh8Var3 = this.f;
            if (oh8Var3 != null) {
                oh8Var3.setAnimatedEmojiDrawable(vlVar2);
            }
        } else {
            e(h19Var);
            q09Var2.setAnimatedEmojiDrawable(null);
            if (q09Var3.getImageReceiver().y() != null) {
                q09Var3.getImageReceiver().y().I(0, false, false);
            }
            oh8 oh8Var4 = this.f;
            if (oh8Var4 != null) {
                oh8Var4.setAnimatedEmojiDrawable(null);
            }
        }
        setFocusable(true);
        boolean z4 = this.r;
        this.s = z4;
        if (!z4) {
            q09Var3.setVisibility(8);
            q09Var.setVisibility(0);
            this.w = true;
        } else {
            this.w = false;
            q09Var3.setVisibility(0);
            q09Var.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = q09Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = q09Var.getLayoutParams();
        int L = gl.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = q09Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = q09Var3.getLayoutParams();
        int L2 = gl.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        ml mlVar;
        Paint paint;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - gl.L(1.0f);
            h19 h19Var = this.e;
            t09 t09Var = this.Q;
            if (h19Var != null && h19Var.a) {
                paint = t09Var.J0;
            } else {
                paint = t09Var.I0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        vl vlVar = this.b.e;
        if (vlVar != null && (mlVar = vlVar.k) != null) {
            int i2 = 0;
            if (this.E == 0) {
                mlVar.r0(gl.L(6.0f), 0, 0, gl.L(6.0f));
            } else {
                if (this.x) {
                    i2 = gl.L(6.0f);
                }
                mlVar.q0(i2);
            }
        }
        h19 h19Var2 = this.e;
        if (h19Var2 != null && h19Var2.a && this.G != null && e66.e(8200) && e66.e(131072)) {
            RectF rectF = gl.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            oy8 y = this.a.getImageReceiver().y();
            vva vvaVar = this.G;
            if (y != null && (i = y.b0) > 30) {
                f = Utilities.l((i - 30) / 30.0f);
            } else {
                f = 0.0f;
            }
            vvaVar.j = (int) (vvaVar.b.size() * f);
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(h19 h19Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        q09 q09Var;
        kcb kcbVar;
        kcb kcbVar2;
        kcb kcbVar3;
        ?? r14;
        kcb kcbVar4;
        TLRPC.Document document;
        kcb kcbVar5;
        int i;
        t09 t09Var = this.Q;
        byte b = t09Var.N0;
        q09 q09Var2 = this.a;
        q09 q09Var3 = this.b;
        if (h19Var != null && h19Var.a) {
            q09Var2.getImageReceiver().g0(new oy8(2131624212, gl.L(30.0f), gl.L(30.0f)));
            q09Var3.getImageReceiver().g0(getContext().getResources().getDrawable(2131232756));
            if (this.G == null) {
                if (gba.o() == 2) {
                    i = 45;
                } else {
                    i = 18;
                }
                this.G = new vva(1, i);
            }
        } else if (b == 4 && h19Var != null && h19Var.f != null) {
            q09Var2.getImageReceiver().g0(vu3.g(h19Var.f));
            q09Var3.getImageReceiver().g0(vu3.g(h19Var.f));
        } else {
            h19 h19Var2 = this.e;
            if (h19Var2.b) {
                na7 q1 = na7.q1(t09Var.K);
                long j = this.e.g;
                if (q1.V4 != null) {
                    for (int i2 = 0; i2 < q1.V4.documents.size(); i2++) {
                        if (q1.V4.documents.get(i2).id == j) {
                            document = q1.V4.documents.get(i2);
                            break;
                        }
                    }
                }
                document = null;
                kcb f = uo3.f(document, bkb.l6, 0.2f, null);
                ImageReceiver imageReceiver = q09Var3.getImageReceiver();
                gl5 b2 = gl5.b(document);
                if (this.r) {
                    kcbVar5 = null;
                } else {
                    kcbVar5 = f;
                }
                imageReceiver.Z(b2, "60_60_firstframe", null, null, kcbVar5, 0L, "tgs", this.e, 0);
            } else if (h19Var2.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) hq6.d0(t09Var.K).r.get(this.e.f);
                if (tL_availableReaction2 != null) {
                    kcb f2 = uo3.f(tL_availableReaction2.activate_animation, bkb.l6, 0.2f, null);
                    if (e66.e(8200) && b != 4) {
                        kcbVar = f2;
                        q09Var = q09Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        q09Var2.getImageReceiver().Z(gl5.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, kcbVar, 0L, "tgs", h19Var, 0);
                        ImageReceiver imageReceiver2 = q09Var3.getImageReceiver();
                        gl5 b3 = gl5.b(tL_availableReaction.select_animation);
                        if (this.r) {
                            kcbVar4 = null;
                        } else {
                            kcbVar4 = kcbVar;
                        }
                        imageReceiver2.Z(b3, "60_60_pcache", null, null, kcbVar4, 0L, "tgs", this.e, 0);
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        q09Var = q09Var2;
                        boolean z = false;
                        kcbVar = f2;
                        if (gba.o() > 0 && b != 4) {
                            q09Var.getImageReceiver().Z(gl5.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, kcbVar, 0L, "tgs", h19Var, 0);
                            ImageReceiver imageReceiver3 = q09Var3.getImageReceiver();
                            gl5 b4 = gl5.b(tL_availableReaction.select_animation);
                            if (this.r) {
                                kcbVar3 = null;
                            } else {
                                kcbVar3 = kcbVar;
                            }
                            imageReceiver3.Z(b4, "60_60_firstframe", null, null, kcbVar3, 0L, "tgs", this.e, 0);
                            r14 = z;
                        } else {
                            ImageReceiver imageReceiver4 = q09Var3.getImageReceiver();
                            gl5 b5 = gl5.b(tL_availableReaction.select_animation);
                            if (this.r) {
                                kcbVar2 = null;
                            } else {
                                kcbVar2 = kcbVar;
                            }
                            imageReceiver4.Z(b5, "60_60_firstframe", null, null, kcbVar2, 0L, "tgs", this.e, 0);
                            r14 = z;
                        }
                    }
                    if (q09Var.getImageReceiver().y() != null) {
                        q09Var.getImageReceiver().y().I(r14, r14, true);
                    }
                    this.c.getImageReceiver().Z(gl5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, kcbVar, 0L, "tgs", h19Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.v0 = r14;
                    hq6.d0(t09Var.K);
                    hq6.n1(imageReceiver5, gl5.b(tL_availableReaction.around_animation), d19.a());
                }
                oh8 oh8Var = this.f;
                if (oh8Var != null) {
                    oh8Var.setImageReceiver(q09Var3.getImageReceiver());
                }
            }
        }
    }

    public final void f(h19 h19Var, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z2 = this.x;
        boolean contains = this.Q.e0.contains(h19Var);
        this.x = contains;
        if (contains != z2) {
            q09 q09Var = this.b;
            q09 q09Var2 = this.a;
            float f7 = 1.0f;
            if (!z) {
                float f8 = this.J;
                if (contains) {
                    f4 = 0.76f;
                } else {
                    f4 = 1.0f;
                }
                q09Var.setScaleX(f8 * f4);
                float f9 = this.J;
                if (this.x) {
                    f5 = 0.76f;
                } else {
                    f5 = 1.0f;
                }
                q09Var.setScaleY(f9 * f5);
                float f10 = this.J;
                if (this.x) {
                    f6 = 0.76f;
                } else {
                    f6 = 1.0f;
                }
                q09Var2.setScaleX(f10 * f6);
                float f11 = this.J;
                if (this.x) {
                    f7 = 0.76f;
                }
                q09Var2.setScaleY(f11 * f7);
            } else {
                ViewPropertyAnimator animate = q09Var.animate();
                float f12 = this.J;
                if (this.x) {
                    f = 0.76f;
                } else {
                    f = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f12 * f);
                float f13 = this.J;
                if (this.x) {
                    f2 = 0.76f;
                } else {
                    f2 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f13 * f2).setDuration(240L);
                s33 s33Var = s33.h;
                duration.setInterpolator(s33Var).start();
                ViewPropertyAnimator animate2 = q09Var2.animate();
                float f14 = this.J;
                if (this.x) {
                    f3 = 0.76f;
                } else {
                    f3 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f14 * f3);
                float f15 = this.J;
                if (this.x) {
                    f7 = 0.76f;
                }
                scaleX2.scaleY(f15 * f7).setDuration(240L).setInterpolator(s33Var).start();
            }
            requestLayout();
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        this.d.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h19 h19Var = this.e;
        if (h19Var != null) {
            String str = h19Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(k96.M0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        byte b;
        s09 s09Var;
        if (this.P) {
            t09 t09Var = this.Q;
            if (t09Var.R == null) {
                int action = motionEvent.getAction();
                o09 o09Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (b = t09Var.N0) != 3 && b != 4 && b != 5 && ((s09Var = t09Var.h0) == null || s09Var.r())) {
                        gl.d3(o09Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((t09Var.m0 == null || t09Var.o0 > 0.8f) && t09Var.h0 != null)) {
                    t09Var.s0 = true;
                    if (System.currentTimeMillis() - t09Var.t0 > 300) {
                        t09Var.t0 = System.currentTimeMillis();
                        s09 s09Var2 = t09Var.h0;
                        h19 h19Var = this.e;
                        if (t09Var.o0 > 0.8f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        s09Var2.q(this, h19Var, z, false);
                    }
                }
                if (!t09Var.s0 && t09Var.m0 != null) {
                    t09Var.p0 = 0.0f;
                    float f = t09Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    t09Var.R = ofFloat;
                    ofFloat.addUpdateListener(new i09(t09Var, f));
                    t09Var.R.addListener(new kt7(t09Var, (byte) 2));
                    t09Var.R.setDuration(150L);
                    t09Var.R.setInterpolator(s33.f);
                    t09Var.R.start();
                }
                gl.r(o09Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
