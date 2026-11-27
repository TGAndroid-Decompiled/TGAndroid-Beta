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
public final class g49 extends FrameLayout {
    public int E;
    public boolean F;
    public yza G;
    public final d49 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final d49 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final i49 Q;
    public final f49 a;
    public final f49 b;
    public final f49 c;
    public final ImageReceiver d;
    public w49 e;
    public cl8 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public g49(i49 i49Var, Context context) {
        super(context);
        this.Q = i49Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.y = true;
        this.H = new d49(this, (byte) 0);
        this.J = 1.0f;
        this.L = new d49(this, (byte) 1);
        this.P = true;
        f49 f49Var = new f49(this, context, (byte) 0);
        this.a = f49Var;
        f49 f49Var2 = new f49(this, context, (byte) 1);
        this.b = f49Var2;
        f49Var.getImageReceiver().M(0);
        f49Var.getImageReceiver().v0 = false;
        f49 f49Var3 = new f49(this, context, (byte) 2);
        this.c = f49Var3;
        addView(f49Var, tre.e(34, 34, 17));
        addView(f49Var3, tre.e(34, 34, 17));
        addView(f49Var2, tre.e(34, 34, 17));
        if (i49Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        f49Var.setLayerNum(Integer.MAX_VALUE);
        f49Var2.setLayerNum(Integer.MAX_VALUE);
        f49Var2.a.M(0);
        ImageReceiver imageReceiver = f49Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        f49Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public final void a() {
        ImageReceiver imageReceiver;
        f49 f49Var = this.b;
        wl wlVar = f49Var.e;
        if (wlVar != null) {
            imageReceiver = wlVar.k;
        } else {
            imageReceiver = f49Var.a;
        }
        if (imageReceiver != null && imageReceiver.y() != null) {
            i49 i49Var = this.Q;
            if (i49Var.y0 == null && !this.O && i49Var.H0) {
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
                f49 f49Var = this.b;
                float f4 = this.J;
                if (this.x) {
                    f2 = 0.76f;
                } else {
                    f2 = 1.0f;
                }
                f49Var.setScaleY(f4 * f2);
                f49 f49Var2 = this.b;
                float f5 = this.J;
                if (!this.x) {
                    f3 = 1.0f;
                }
                f49Var2.setScaleX(f5 * f3);
                return;
            }
            return;
        }
        hl.r(this.H);
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
                hl.d3(this.H, i);
                return;
            }
            if (this.a.getImageReceiver().y() != null && this.n && !this.a.getImageReceiver().y().l0 && !this.a.getImageReceiver().y().t()) {
                this.a.getImageReceiver().y().I(this.a.getImageReceiver().y().e[0] - 1, false, false);
            }
            f49 f49Var3 = this.b;
            float f6 = this.J;
            if (this.x) {
                f = 0.76f;
            } else {
                f = 1.0f;
            }
            f49Var3.setScaleY(f6 * f);
            f49 f49Var4 = this.b;
            float f7 = this.J;
            if (!this.x) {
                f3 = 1.0f;
            }
            f49Var4.setScaleX(f7 * f3);
        } else if (!this.n) {
            this.J = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new b49(this, (byte) 1));
            this.K.setDuration(150L);
            this.K.setInterpolator(k43.h);
            this.K.setStartDelay(i * this.Q.c);
            this.K.start();
            this.n = true;
        }
    }

    public final void c() {
        float f;
        float f2;
        boolean z = this.r;
        i49 i49Var = this.Q;
        float f3 = 1.0f;
        f49 f49Var = this.b;
        if (z) {
            hl.r(this.H);
            f49 f49Var2 = this.a;
            if (f49Var2.getImageReceiver().y() != null && !f49Var2.getImageReceiver().y().t()) {
                f49Var2.getImageReceiver().y().stop();
                if (i49Var.k0) {
                    f49Var2.getImageReceiver().y().I(0, false, true);
                } else {
                    f49Var2.getImageReceiver().y().I(f49Var2.getImageReceiver().y().e[0] - 1, false, true);
                }
            }
            f49Var.setVisibility(4);
            f49Var2.setVisibility(0);
            this.w = false;
            float f4 = this.J;
            if (this.x) {
                f2 = 0.76f;
            } else {
                f2 = 1.0f;
            }
            f49Var.setScaleY(f4 * f2);
            float f5 = this.J;
            if (this.x) {
                f3 = 0.76f;
            }
            f49Var.setScaleX(f5 * f3);
        } else {
            f49Var.animate().cancel();
            if (i49Var.O0) {
                float f6 = this.J;
                if (this.x) {
                    f = 0.76f;
                } else {
                    f = 1.0f;
                }
                f49Var.setScaleY(f6 * f);
                float f7 = this.J;
                if (this.x) {
                    f3 = 0.76f;
                }
                f49Var.setScaleX(f7 * f3);
            } else {
                f49Var.setScaleY(0.0f);
                f49Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    public final void d(int i, w49 w49Var) {
        boolean z;
        boolean z2;
        int i2;
        i49 i49Var = this.Q;
        vnb vnbVar = i49Var.l0;
        byte b = i49Var.N0;
        f(w49Var, false);
        w49 w49Var2 = this.e;
        if (w49Var2 != null && w49Var2.equals(w49Var)) {
            this.E = i;
            e(w49Var);
            return;
        }
        boolean p = yac.h(i49Var.K).p();
        if ((b == 3 && !p) || (b == 5 && w49Var.d && !p)) {
            z = true;
        } else {
            z = false;
        }
        this.I = z;
        f49 f49Var = this.b;
        if (z && this.f == null) {
            cl8 cl8Var = new cl8(1, null, getContext());
            this.f = cl8Var;
            cl8Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f.setImageReceiver(f49Var.getImageReceiver());
            addView(this.f, tre.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        cl8 cl8Var2 = this.f;
        if (cl8Var2 != null) {
            if (this.I) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            cl8Var2.setVisibility(i2);
        }
        c();
        this.e = w49Var;
        if (!w49Var.a && (w49Var.f == null || ((!i49Var.n() && !i49Var.H0) || !i86.e(8200)))) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.r = z2;
        if (b == 4 || this.e.b) {
            this.r = false;
        }
        w49 w49Var3 = this.e;
        boolean z3 = w49Var3.a;
        f49 f49Var2 = this.c;
        f49 f49Var3 = this.a;
        if (!z3 && w49Var3.f == null) {
            f49Var2.getImageReceiver().f();
            f49Var.getImageReceiver().f();
            wl wlVar = new wl(4, i49Var.K, this.e.g);
            wl wlVar2 = new wl(3, i49Var.K, this.e.g);
            if (b != 1 && b != 2 && b != 4) {
                int i3 = aob.v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                yob.x(this, wlVar, i3, vnbVar, mode);
                yob.x(this, wlVar2, i3, vnbVar, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                wlVar.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                wlVar2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            f49Var2.setAnimatedEmojiDrawable(wlVar);
            f49Var.setAnimatedEmojiDrawable(wlVar2);
            cl8 cl8Var3 = this.f;
            if (cl8Var3 != null) {
                cl8Var3.setAnimatedEmojiDrawable(wlVar2);
            }
        } else {
            e(w49Var);
            f49Var2.setAnimatedEmojiDrawable(null);
            if (f49Var3.getImageReceiver().y() != null) {
                f49Var3.getImageReceiver().y().I(0, false, false);
            }
            cl8 cl8Var4 = this.f;
            if (cl8Var4 != null) {
                cl8Var4.setAnimatedEmojiDrawable(null);
            }
        }
        setFocusable(true);
        boolean z4 = this.r;
        this.s = z4;
        if (!z4) {
            f49Var3.setVisibility(8);
            f49Var.setVisibility(0);
            this.w = true;
        } else {
            this.w = false;
            f49Var3.setVisibility(0);
            f49Var.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = f49Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = f49Var.getLayoutParams();
        int L = hl.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = f49Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = f49Var3.getLayoutParams();
        int L2 = hl.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        nl nlVar;
        Paint paint;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - hl.L(1.0f);
            w49 w49Var = this.e;
            i49 i49Var = this.Q;
            if (w49Var != null && w49Var.a) {
                paint = i49Var.J0;
            } else {
                paint = i49Var.I0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        wl wlVar = this.b.e;
        if (wlVar != null && (nlVar = wlVar.k) != null) {
            int i2 = 0;
            if (this.E == 0) {
                nlVar.r0(hl.L(6.0f), 0, 0, hl.L(6.0f));
            } else {
                if (this.x) {
                    i2 = hl.L(6.0f);
                }
                nlVar.q0(i2);
            }
        }
        w49 w49Var2 = this.e;
        if (w49Var2 != null && w49Var2.a && this.G != null && i86.e(8200) && i86.e(131072)) {
            RectF rectF = hl.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            b29 y = this.a.getImageReceiver().y();
            yza yzaVar = this.G;
            if (y != null && (i = y.b0) > 30) {
                f = Utilities.l((i - 30) / 30.0f);
            } else {
                f = 0.0f;
            }
            yzaVar.j = (int) (yzaVar.b.size() * f);
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(w49 w49Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        f49 f49Var;
        ggb ggbVar;
        ggb ggbVar2;
        ggb ggbVar3;
        ?? r14;
        ggb ggbVar4;
        TLRPC.Document document;
        ggb ggbVar5;
        int i;
        i49 i49Var = this.Q;
        byte b = i49Var.N0;
        f49 f49Var2 = this.a;
        f49 f49Var3 = this.b;
        if (w49Var != null && w49Var.a) {
            f49Var2.getImageReceiver().g0(new b29(2131624212, hl.L(30.0f), hl.L(30.0f)));
            f49Var3.getImageReceiver().g0(getContext().getResources().getDrawable(2131232774));
            if (this.G == null) {
                if (xea.o() == 2) {
                    i = 45;
                } else {
                    i = 18;
                }
                this.G = new yza(1, i);
            }
        } else if (b == 4 && w49Var != null && w49Var.f != null) {
            f49Var2.getImageReceiver().g0(pv3.g(w49Var.f));
            f49Var3.getImageReceiver().g0(pv3.g(w49Var.f));
        } else {
            w49 w49Var2 = this.e;
            if (w49Var2.b) {
                uc7 s1 = uc7.s1(i49Var.K);
                long j = this.e.g;
                if (s1.W4 != null) {
                    for (int i2 = 0; i2 < s1.W4.documents.size(); i2++) {
                        if (s1.W4.documents.get(i2).id == j) {
                            document = s1.W4.documents.get(i2);
                            break;
                        }
                    }
                }
                document = null;
                ggb f = lp3.f(document, aob.m6, 0.2f, null);
                ImageReceiver imageReceiver = f49Var3.getImageReceiver();
                jn5 b2 = jn5.b(document);
                if (this.r) {
                    ggbVar5 = null;
                } else {
                    ggbVar5 = f;
                }
                imageReceiver.Z(b2, "60_60_firstframe", null, null, ggbVar5, 0L, "tgs", this.e, 0);
            } else if (w49Var2.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) ls6.d0(i49Var.K).r.get(this.e.f);
                if (tL_availableReaction2 != null) {
                    ggb f2 = lp3.f(tL_availableReaction2.activate_animation, aob.m6, 0.2f, null);
                    if (i86.e(8200) && b != 4) {
                        ggbVar = f2;
                        f49Var = f49Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        f49Var2.getImageReceiver().Z(jn5.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, ggbVar, 0L, "tgs", w49Var, 0);
                        ImageReceiver imageReceiver2 = f49Var3.getImageReceiver();
                        jn5 b3 = jn5.b(tL_availableReaction.select_animation);
                        if (this.r) {
                            ggbVar4 = null;
                        } else {
                            ggbVar4 = ggbVar;
                        }
                        imageReceiver2.Z(b3, "60_60_pcache", null, null, ggbVar4, 0L, "tgs", this.e, 0);
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        f49Var = f49Var2;
                        boolean z = false;
                        ggbVar = f2;
                        if (xea.o() > 0 && b != 4) {
                            f49Var.getImageReceiver().Z(jn5.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, ggbVar, 0L, "tgs", w49Var, 0);
                            ImageReceiver imageReceiver3 = f49Var3.getImageReceiver();
                            jn5 b4 = jn5.b(tL_availableReaction.select_animation);
                            if (this.r) {
                                ggbVar3 = null;
                            } else {
                                ggbVar3 = ggbVar;
                            }
                            imageReceiver3.Z(b4, "60_60_firstframe", null, null, ggbVar3, 0L, "tgs", this.e, 0);
                            r14 = z;
                        } else {
                            ImageReceiver imageReceiver4 = f49Var3.getImageReceiver();
                            jn5 b5 = jn5.b(tL_availableReaction.select_animation);
                            if (this.r) {
                                ggbVar2 = null;
                            } else {
                                ggbVar2 = ggbVar;
                            }
                            imageReceiver4.Z(b5, "60_60_firstframe", null, null, ggbVar2, 0L, "tgs", this.e, 0);
                            r14 = z;
                        }
                    }
                    if (f49Var.getImageReceiver().y() != null) {
                        f49Var.getImageReceiver().y().I(r14, r14, true);
                    }
                    this.c.getImageReceiver().Z(jn5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, ggbVar, 0L, "tgs", w49Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.v0 = r14;
                    ls6.d0(i49Var.K);
                    ls6.n1(imageReceiver5, jn5.b(tL_availableReaction.around_animation), s49.a());
                }
                cl8 cl8Var = this.f;
                if (cl8Var != null) {
                    cl8Var.setImageReceiver(f49Var3.getImageReceiver());
                }
            }
        }
    }

    public final void f(w49 w49Var, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z2 = this.x;
        boolean contains = this.Q.e0.contains(w49Var);
        this.x = contains;
        if (contains != z2) {
            f49 f49Var = this.b;
            f49 f49Var2 = this.a;
            float f7 = 1.0f;
            if (!z) {
                float f8 = this.J;
                if (contains) {
                    f4 = 0.76f;
                } else {
                    f4 = 1.0f;
                }
                f49Var.setScaleX(f8 * f4);
                float f9 = this.J;
                if (this.x) {
                    f5 = 0.76f;
                } else {
                    f5 = 1.0f;
                }
                f49Var.setScaleY(f9 * f5);
                float f10 = this.J;
                if (this.x) {
                    f6 = 0.76f;
                } else {
                    f6 = 1.0f;
                }
                f49Var2.setScaleX(f10 * f6);
                float f11 = this.J;
                if (this.x) {
                    f7 = 0.76f;
                }
                f49Var2.setScaleY(f11 * f7);
            } else {
                ViewPropertyAnimator animate = f49Var.animate();
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
                k43 k43Var = k43.h;
                duration.setInterpolator(k43Var).start();
                ViewPropertyAnimator animate2 = f49Var2.animate();
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
                scaleX2.scaleY(f15 * f7).setDuration(240L).setInterpolator(k43Var).start();
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
        w49 w49Var = this.e;
        if (w49Var != null) {
            String str = w49Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(ob6.M0(2131754886, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        byte b;
        h49 h49Var;
        if (this.P) {
            i49 i49Var = this.Q;
            if (i49Var.R == null) {
                int action = motionEvent.getAction();
                d49 d49Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (b = i49Var.N0) != 3 && b != 4 && b != 5 && ((h49Var = i49Var.h0) == null || h49Var.j())) {
                        hl.d3(d49Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((i49Var.m0 == null || i49Var.o0 > 0.8f) && i49Var.h0 != null)) {
                    i49Var.s0 = true;
                    if (System.currentTimeMillis() - i49Var.t0 > 300) {
                        i49Var.t0 = System.currentTimeMillis();
                        h49 h49Var2 = i49Var.h0;
                        w49 w49Var = this.e;
                        if (i49Var.o0 > 0.8f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        h49Var2.e(this, w49Var, z, false);
                    }
                }
                if (!i49Var.s0 && i49Var.m0 != null) {
                    i49Var.p0 = 0.0f;
                    float f = i49Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    i49Var.R = ofFloat;
                    ofFloat.addUpdateListener(new w39(i49Var, f));
                    i49Var.R.addListener(new rw7(i49Var, (byte) 2));
                    i49Var.R.setDuration(150L);
                    i49Var.R.setInterpolator(k43.f);
                    i49Var.R.start();
                }
                hl.r(d49Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
