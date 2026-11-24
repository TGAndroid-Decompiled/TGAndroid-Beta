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
public final class t29 extends FrameLayout {
    public int E;
    public boolean F;
    public yxa G;
    public final q29 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final q29 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final v29 Q;
    public final s29 a;
    public final s29 b;
    public final s29 c;
    public final ImageReceiver d;
    public k39 e;
    public pj8 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public t29(v29 v29Var, Context context) {
        super(context);
        this.Q = v29Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.H = new q29(this, (byte) 0);
        this.J = 1.0f;
        this.L = new q29(this, (byte) 1);
        this.P = true;
        s29 s29Var = new s29(this, context, (byte) 0);
        this.a = s29Var;
        s29 s29Var2 = new s29(this, context, (byte) 1);
        this.b = s29Var2;
        s29Var.getImageReceiver().M(0);
        s29Var.getImageReceiver().v0 = false;
        s29 s29Var3 = new s29(this, context, (byte) 2);
        this.c = s29Var3;
        addView(s29Var, qoe.e(34, 34, 17));
        addView(s29Var3, qoe.e(34, 34, 17));
        addView(s29Var2, qoe.e(34, 34, 17));
        if (v29Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        s29Var.setLayerNum(Integer.MAX_VALUE);
        s29Var2.setLayerNum(Integer.MAX_VALUE);
        s29Var2.a.M(0);
        ImageReceiver imageReceiver = s29Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        s29Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public final void a() {
        ImageReceiver imageReceiver;
        s29 s29Var = this.b;
        vm vmVar = s29Var.e;
        if (vmVar != null) {
            imageReceiver = vmVar.k;
        } else {
            imageReceiver = s29Var.a;
        }
        if (imageReceiver != null && imageReceiver.y() != null) {
            v29 v29Var = this.Q;
            if (v29Var.y0 == null && !this.O && v29Var.H0) {
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
                s29 s29Var = this.b;
                float f4 = this.J;
                if (this.x) {
                    f2 = 0.76f;
                } else {
                    f2 = 1.0f;
                }
                s29Var.setScaleY(f4 * f2);
                s29 s29Var2 = this.b;
                float f5 = this.J;
                if (!this.x) {
                    f3 = 1.0f;
                }
                s29Var2.setScaleX(f5 * f3);
                return;
            }
            return;
        }
        gm.r(this.H);
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
                gm.d3(this.H, i);
                return;
            }
            if (this.a.getImageReceiver().y() != null && this.n && !this.a.getImageReceiver().y().l0 && !this.a.getImageReceiver().y().t()) {
                this.a.getImageReceiver().y().I(this.a.getImageReceiver().y().e[0] - 1, false, false);
            }
            s29 s29Var3 = this.b;
            float f6 = this.J;
            if (this.x) {
                f = 0.76f;
            } else {
                f = 1.0f;
            }
            s29Var3.setScaleY(f6 * f);
            s29 s29Var4 = this.b;
            float f7 = this.J;
            if (!this.x) {
                f3 = 1.0f;
            }
            s29Var4.setScaleX(f7 * f3);
        } else if (!this.n) {
            this.J = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new p29(this, (byte) 0));
            this.K.setDuration(150L);
            this.K.setInterpolator(d53.h);
            this.K.setStartDelay(i * this.Q.c);
            this.K.start();
            this.n = true;
        }
    }

    public final void c() {
        float f;
        float f2;
        boolean z = this.r;
        v29 v29Var = this.Q;
        float f3 = 1.0f;
        s29 s29Var = this.b;
        if (z) {
            gm.r(this.H);
            s29 s29Var2 = this.a;
            if (s29Var2.getImageReceiver().y() != null && !s29Var2.getImageReceiver().y().t()) {
                s29Var2.getImageReceiver().y().stop();
                if (v29Var.k0) {
                    s29Var2.getImageReceiver().y().I(0, false, true);
                } else {
                    s29Var2.getImageReceiver().y().I(s29Var2.getImageReceiver().y().e[0] - 1, false, true);
                }
            }
            s29Var.setVisibility(4);
            s29Var2.setVisibility(0);
            this.w = false;
            float f4 = this.J;
            if (this.x) {
                f2 = 0.76f;
            } else {
                f2 = 1.0f;
            }
            s29Var.setScaleY(f4 * f2);
            float f5 = this.J;
            if (this.x) {
                f3 = 0.76f;
            }
            s29Var.setScaleX(f5 * f3);
        } else {
            s29Var.animate().cancel();
            if (v29Var.O0) {
                float f6 = this.J;
                if (this.x) {
                    f = 0.76f;
                } else {
                    f = 1.0f;
                }
                s29Var.setScaleY(f6 * f);
                float f7 = this.J;
                if (this.x) {
                    f3 = 0.76f;
                }
                s29Var.setScaleX(f7 * f3);
            } else {
                s29Var.setScaleY(0.0f);
                s29Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    public final void d(int i, k39 k39Var) {
        boolean z;
        boolean z2;
        int i2;
        v29 v29Var = this.Q;
        ylb ylbVar = v29Var.l0;
        byte b = v29Var.N0;
        f(k39Var, false);
        k39 k39Var2 = this.e;
        if (k39Var2 != null && k39Var2.equals(k39Var)) {
            this.E = i;
            e(k39Var);
            return;
        }
        boolean p = z8c.h(v29Var.K).p();
        if ((b == 3 && !p) || (b == 5 && k39Var.d && !p)) {
            z = true;
        } else {
            z = false;
        }
        this.I = z;
        s29 s29Var = this.b;
        if (z && this.f == null) {
            pj8 pj8Var = new pj8(1, null, getContext());
            this.f = pj8Var;
            pj8Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f.setImageReceiver(s29Var.getImageReceiver());
            addView(this.f, qoe.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        pj8 pj8Var2 = this.f;
        if (pj8Var2 != null) {
            if (this.I) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            pj8Var2.setVisibility(i2);
        }
        c();
        this.e = k39Var;
        if (!k39Var.a && (k39Var.f == null || ((!v29Var.n() && !v29Var.H0) || !e86.e(8200)))) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.r = z2;
        if (b == 4 || this.e.b) {
            this.r = false;
        }
        k39 k39Var3 = this.e;
        boolean z3 = k39Var3.a;
        s29 s29Var2 = this.c;
        s29 s29Var3 = this.a;
        if (!z3 && k39Var3.f == null) {
            s29Var2.getImageReceiver().f();
            s29Var.getImageReceiver().f();
            vm vmVar = new vm(4, v29Var.K, this.e.g);
            vm vmVar2 = new vm(3, v29Var.K, this.e.g);
            if (b != 1 && b != 2 && b != 4) {
                int i3 = cmb.u6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                anb.x(this, vmVar, i3, ylbVar, mode);
                anb.x(this, vmVar2, i3, ylbVar, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                vmVar.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                vmVar2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            s29Var2.setAnimatedEmojiDrawable(vmVar);
            s29Var.setAnimatedEmojiDrawable(vmVar2);
            pj8 pj8Var3 = this.f;
            if (pj8Var3 != null) {
                pj8Var3.setAnimatedEmojiDrawable(vmVar2);
            }
        } else {
            e(k39Var);
            s29Var2.setAnimatedEmojiDrawable(null);
            if (s29Var3.getImageReceiver().y() != null) {
                s29Var3.getImageReceiver().y().I(0, false, false);
            }
            pj8 pj8Var4 = this.f;
            if (pj8Var4 != null) {
                pj8Var4.setAnimatedEmojiDrawable(null);
            }
        }
        setFocusable(true);
        boolean z4 = this.r;
        this.s = z4;
        if (!z4) {
            s29Var3.setVisibility(8);
            s29Var.setVisibility(0);
            this.w = true;
        } else {
            this.w = false;
            s29Var3.setVisibility(0);
            s29Var.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = s29Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = s29Var.getLayoutParams();
        int L = gm.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = s29Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = s29Var3.getLayoutParams();
        int L2 = gm.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        mm mmVar;
        Paint paint;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - gm.L(1.0f);
            k39 k39Var = this.e;
            v29 v29Var = this.Q;
            if (k39Var != null && k39Var.a) {
                paint = v29Var.J0;
            } else {
                paint = v29Var.I0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        vm vmVar = this.b.e;
        if (vmVar != null && (mmVar = vmVar.k) != null) {
            int i2 = 0;
            if (this.E == 0) {
                mmVar.r0(gm.L(6.0f), 0, 0, gm.L(6.0f));
            } else {
                if (this.x) {
                    i2 = gm.L(6.0f);
                }
                mmVar.q0(i2);
            }
        }
        k39 k39Var2 = this.e;
        if (k39Var2 != null && k39Var2.a && this.G != null && e86.e(8200) && e86.e(131072)) {
            RectF rectF = gm.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            p09 y = this.a.getImageReceiver().y();
            yxa yxaVar = this.G;
            if (y != null && (i = y.b0) > 30) {
                f = Utilities.l((i - 30) / 30.0f);
            } else {
                f = 0.0f;
            }
            yxaVar.j = (int) (yxaVar.b.size() * f);
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(k39 k39Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        s29 s29Var;
        meb mebVar;
        meb mebVar2;
        meb mebVar3;
        ?? r14;
        meb mebVar4;
        TLRPC.Document document;
        meb mebVar5;
        int i;
        v29 v29Var = this.Q;
        byte b = v29Var.N0;
        s29 s29Var2 = this.a;
        s29 s29Var3 = this.b;
        if (k39Var != null && k39Var.a) {
            s29Var2.getImageReceiver().g0(new p09(2131624212, gm.L(30.0f), gm.L(30.0f)));
            s29Var3.getImageReceiver().g0(getContext().getResources().getDrawable(2131232768));
            if (this.G == null) {
                if (gda.o() == 2) {
                    i = 45;
                } else {
                    i = 18;
                }
                this.G = new yxa(1, i);
            }
        } else if (b == 4 && k39Var != null && k39Var.f != null) {
            s29Var2.getImageReceiver().g0(gw3.g(k39Var.f));
            s29Var3.getImageReceiver().g0(gw3.g(k39Var.f));
        } else {
            k39 k39Var2 = this.e;
            if (k39Var2.b) {
                oc7 r1 = oc7.r1(v29Var.K);
                long j = this.e.g;
                if (r1.X4 != null) {
                    for (int i2 = 0; i2 < r1.X4.documents.size(); i2++) {
                        if (r1.X4.documents.get(i2).id == j) {
                            document = r1.X4.documents.get(i2);
                            break;
                        }
                    }
                }
                document = null;
                meb f = eq3.f(document, cmb.l6, 0.2f, null);
                ImageReceiver imageReceiver = s29Var3.getImageReceiver();
                gn5 b2 = gn5.b(document);
                if (this.r) {
                    mebVar5 = null;
                } else {
                    mebVar5 = f;
                }
                imageReceiver.Z(b2, "60_60_firstframe", null, null, mebVar5, 0L, "tgs", this.e, 0);
            } else if (k39Var2.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) hs6.d0(v29Var.K).r.get(this.e.f);
                if (tL_availableReaction2 != null) {
                    meb f2 = eq3.f(tL_availableReaction2.activate_animation, cmb.l6, 0.2f, null);
                    if (e86.e(8200) && b != 4) {
                        mebVar = f2;
                        s29Var = s29Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        s29Var2.getImageReceiver().Z(gn5.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, mebVar, 0L, "tgs", k39Var, 0);
                        ImageReceiver imageReceiver2 = s29Var3.getImageReceiver();
                        gn5 b3 = gn5.b(tL_availableReaction.select_animation);
                        if (this.r) {
                            mebVar4 = null;
                        } else {
                            mebVar4 = mebVar;
                        }
                        imageReceiver2.Z(b3, "60_60_pcache", null, null, mebVar4, 0L, "tgs", this.e, 0);
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        s29Var = s29Var2;
                        boolean z = false;
                        mebVar = f2;
                        if (gda.o() > 0 && b != 4) {
                            s29Var.getImageReceiver().Z(gn5.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, mebVar, 0L, "tgs", k39Var, 0);
                            ImageReceiver imageReceiver3 = s29Var3.getImageReceiver();
                            gn5 b4 = gn5.b(tL_availableReaction.select_animation);
                            if (this.r) {
                                mebVar3 = null;
                            } else {
                                mebVar3 = mebVar;
                            }
                            imageReceiver3.Z(b4, "60_60_firstframe", null, null, mebVar3, 0L, "tgs", this.e, 0);
                            r14 = z;
                        } else {
                            ImageReceiver imageReceiver4 = s29Var3.getImageReceiver();
                            gn5 b5 = gn5.b(tL_availableReaction.select_animation);
                            if (this.r) {
                                mebVar2 = null;
                            } else {
                                mebVar2 = mebVar;
                            }
                            imageReceiver4.Z(b5, "60_60_firstframe", null, null, mebVar2, 0L, "tgs", this.e, 0);
                            r14 = z;
                        }
                    }
                    if (s29Var.getImageReceiver().y() != null) {
                        s29Var.getImageReceiver().y().I(r14, r14, true);
                    }
                    this.c.getImageReceiver().Z(gn5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, mebVar, 0L, "tgs", k39Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.v0 = r14;
                    hs6.d0(v29Var.K);
                    hs6.n1(imageReceiver5, gn5.b(tL_availableReaction.around_animation), g39.a());
                }
                pj8 pj8Var = this.f;
                if (pj8Var != null) {
                    pj8Var.setImageReceiver(s29Var3.getImageReceiver());
                }
            }
        }
    }

    public final void f(k39 k39Var, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z2 = this.x;
        boolean contains = this.Q.e0.contains(k39Var);
        this.x = contains;
        if (contains != z2) {
            s29 s29Var = this.b;
            s29 s29Var2 = this.a;
            float f7 = 1.0f;
            if (!z) {
                float f8 = this.J;
                if (contains) {
                    f4 = 0.76f;
                } else {
                    f4 = 1.0f;
                }
                s29Var.setScaleX(f8 * f4);
                float f9 = this.J;
                if (this.x) {
                    f5 = 0.76f;
                } else {
                    f5 = 1.0f;
                }
                s29Var.setScaleY(f9 * f5);
                float f10 = this.J;
                if (this.x) {
                    f6 = 0.76f;
                } else {
                    f6 = 1.0f;
                }
                s29Var2.setScaleX(f10 * f6);
                float f11 = this.J;
                if (this.x) {
                    f7 = 0.76f;
                }
                s29Var2.setScaleY(f11 * f7);
            } else {
                ViewPropertyAnimator animate = s29Var.animate();
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
                d53 d53Var = d53.h;
                duration.setInterpolator(d53Var).start();
                ViewPropertyAnimator animate2 = s29Var2.animate();
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
                scaleX2.scaleY(f15 * f7).setDuration(240L).setInterpolator(d53Var).start();
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
        k39 k39Var = this.e;
        if (k39Var != null) {
            String str = k39Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(jb6.M0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        byte b;
        u29 u29Var;
        if (this.P) {
            v29 v29Var = this.Q;
            if (v29Var.R == null) {
                int action = motionEvent.getAction();
                q29 q29Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (b = v29Var.N0) != 3 && b != 4 && b != 5 && ((u29Var = v29Var.h0) == null || u29Var.h())) {
                        gm.d3(q29Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((v29Var.m0 == null || v29Var.o0 > 0.8f) && v29Var.h0 != null)) {
                    v29Var.s0 = true;
                    if (System.currentTimeMillis() - v29Var.t0 > 300) {
                        v29Var.t0 = System.currentTimeMillis();
                        u29 u29Var2 = v29Var.h0;
                        k39 k39Var = this.e;
                        if (v29Var.o0 > 0.8f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        u29Var2.g(this, k39Var, z, false);
                    }
                }
                if (!v29Var.s0 && v29Var.m0 != null) {
                    v29Var.p0 = 0.0f;
                    float f = v29Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    v29Var.R = ofFloat;
                    ofFloat.addUpdateListener(new j29(v29Var, f));
                    v29Var.R.addListener(new lv7(v29Var, (byte) 2));
                    v29Var.R.setDuration(150L);
                    v29Var.R.setInterpolator(d53.f);
                    v29Var.R.start();
                }
                gm.r(q29Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
