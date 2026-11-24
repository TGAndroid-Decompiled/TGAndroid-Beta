package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class jq1 extends et1 {
    public final ti4 A3;
    public final yla B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final mu1 G3;
    public int g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public int m3;
    public int n3;
    public int o3;
    public long p3;
    public float q3;
    public float r3;
    public boolean s3;
    public final float t3;
    public final Paint u3;
    public final Paint v3;
    public final ti4 w3;
    public final yla x3;
    public final ti4 y3;
    public final yla z3;

    public jq1(mu1 mu1Var, Context context, ku1 ku1Var) {
        super(mu1Var, context, ku1Var);
        this.G3 = mu1Var;
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList(10);
        this.t3 = 2000.0f;
        Paint paint = new Paint(1);
        this.u3 = paint;
        Paint paint2 = new Paint(1);
        this.v3 = paint2;
        ti4 ti4Var = new ti4(0.0f);
        this.w3 = ti4Var;
        yla ylaVar = new yla(ti4Var);
        ylaVar.h = 0.0f;
        ylaVar.g = 2000.0f;
        ylaVar.m = oo1.j(0.0f, 1500.0f, 1.0f);
        ylaVar.b(new yr3(this) {
            public final jq1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(yla ylaVar2, float f, float f2) {
                byte b = r2;
                jq1 jq1Var = this.b;
                switch (b) {
                    case 0:
                        jq1Var.invalidate();
                        return;
                    case 1:
                        jq1Var.invalidate();
                        return;
                    default:
                        jq1Var.invalidate();
                        return;
                }
            }
        });
        this.x3 = ylaVar;
        ti4 ti4Var2 = new ti4(0.0f);
        this.y3 = ti4Var2;
        yla ylaVar2 = new yla(ti4Var2);
        ylaVar2.h = 0.0f;
        ylaVar2.m = oo1.j(0.0f, 400.0f, 0.5f);
        ylaVar2.b(new yr3(this) {
            public final jq1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(yla ylaVar22, float f, float f2) {
                byte b = r2;
                jq1 jq1Var = this.b;
                switch (b) {
                    case 0:
                        jq1Var.invalidate();
                        return;
                    case 1:
                        jq1Var.invalidate();
                        return;
                    default:
                        jq1Var.invalidate();
                        return;
                }
            }
        });
        this.z3 = ylaVar2;
        ti4 ti4Var3 = new ti4(0.0f);
        this.A3 = ti4Var3;
        yla ylaVar3 = new yla(ti4Var3);
        ylaVar3.h = 0.0f;
        ylaVar3.m = oo1.j(0.0f, 200.0f, 1.0f);
        ylaVar3.b(new yr3(this) {
            public final jq1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(yla ylaVar22, float f, float f2) {
                byte b = r2;
                jq1 jq1Var = this.b;
                switch (b) {
                    case 0:
                        jq1Var.invalidate();
                        return;
                    case 1:
                        jq1Var.invalidate();
                        return;
                    default:
                        jq1Var.invalidate();
                        return;
                }
            }
        });
        this.B3 = ylaVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(gl.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gl.L(2.0f));
    }

    public final void A1(android.graphics.Canvas r21, android.graphics.RectF r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq1.A1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void B1(boolean z) {
        float f;
        VelocityTracker velocityTracker;
        mu1 mu1Var = this.G3;
        if (z && (velocityTracker = mu1Var.B9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f = mu1Var.B9.getXVelocity();
        } else {
            f = 0.0f;
        }
        VelocityTracker velocityTracker2 = mu1Var.B9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            mu1Var.B9 = null;
        }
        mu1Var.y9 = false;
        mu1Var.C0.R = true;
        lwb lwbVar = mu1Var.n0;
        if (lwbVar != null) {
            lwbVar.settle(f);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        float f;
        float f2;
        TLRPC.Chat chat;
        f27 K6;
        k27 k27Var;
        boolean z;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        mu1 mu1Var = this.G3;
        if (motionEvent != null) {
            mu1Var.R4 = true;
        }
        if (mu1Var.Z7() && mu1Var.v9 == null) {
            if (motionEvent == null) {
                if (mu1Var.y9) {
                    B1(false);
                }
                mu1Var.x9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z2 = ((d) mu1Var).inPreviewMode;
                    if (!z2 && !mu1Var.r7() && motionEvent.getX() >= getMeasuredWidth() * 0.55f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mu1Var.x9 = z3;
                    if (!z3) {
                        mu1Var.y9 = false;
                    } else {
                        mu1Var.y9 = false;
                        mu1Var.z9 = motionEvent.getX();
                        mu1Var.A9 = motionEvent.getY();
                        VelocityTracker velocityTracker = mu1Var.B9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        mu1Var.B9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                } else if (mu1Var.x9 || mu1Var.y9) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker2 = mu1Var.B9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        float x = motionEvent.getX() - mu1Var.z9;
                        float abs = Math.abs(motionEvent.getY() - mu1Var.A9);
                        if (mu1Var.x9 && !mu1Var.y9 && getScrollState() == 0 && x <= (-gl.Z0(true, 0.4f)) && Math.abs(x) / 3.0f > abs && mu1Var.t6() != null) {
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onInterceptTouchEvent(obtain2);
                            obtain2.recycle();
                            mu1Var.C0.R = false;
                            mu1Var.x9 = false;
                            mu1Var.y9 = true;
                            mu1Var.z9 = motionEvent.getX();
                            lwb lwbVar = mu1Var.n0;
                            ValueAnimator valueAnimator = lwbVar.K;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                lwbVar.K = null;
                            }
                            gl.t1(mu1Var.m1);
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return;
                            }
                            return;
                        } else if (mu1Var.y9) {
                            mu1Var.n0.setProgress((-(motionEvent.getX() - mu1Var.z9)) / mu1Var.n0.getContentWidth());
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (mu1Var.y9) {
                            VelocityTracker velocityTracker3 = mu1Var.B9;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            if (actionMasked != 1) {
                                z4 = false;
                            }
                            B1(z4);
                        }
                        mu1Var.x9 = false;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !mu1Var.C9 && !mu1Var.w9 && mu1Var.v9 == null) {
            z = ((d) mu1Var).inPreviewMode;
            if (!z) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof gb2)) {
                    if (pressedChildView instanceof uk1) {
                        uk1 uk1Var = (uk1) pressedChildView;
                        float x2 = motionEvent.getX() - pressedChildView.getX();
                        float y = motionEvent.getY() - pressedChildView.getY();
                        if (uk1Var.V()) {
                            nkc nkcVar = uk1Var.J0;
                            float f3 = (x2 - uk1Var.L0) - (uk1Var.k0 / 2.0f);
                            float paddingTop = (y - uk1Var.M0) - uk1Var.getPaddingTop();
                            mkc mkcVar = nkcVar.m;
                            if (mkcVar != null && mkcVar.n && nkcVar.w.contains((int) f3, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (mu1Var.v9 != null) {
                    mu1Var.nc(0.0f);
                }
                mu1Var.v9 = pressedChildView;
                k27 g7 = mu1Var.g7();
                boolean I4 = mu1Var.I4(g7);
                int i = mu1Var.g4;
                if ((i == 0 || i == 5 || i == 8 || (i == 3 && mu1Var.s4 == mu1Var.getUserConfig().e())) && (((arrayList = mu1Var.p4) == null || !arrayList.contains(g7)) && ((mu1Var.Q6(g7) != 1 || (k27.B0(g7.k) != mu1Var.d7 && !g7.l5())) && ((mu1Var.h != null || g7.e1() >= 0) && (((chat2 = mu1Var.e) == null || !hc2.c0(chat2) || I4) && !mu1Var.r7() && (!k27.c3(g7.k) || !g7.N3())))))) {
                    this.o3 = motionEvent.getPointerId(0);
                    mu1Var.w9 = true;
                    this.m3 = (int) motionEvent.getX();
                    this.n3 = (int) motionEvent.getY();
                    return;
                }
                mu1Var.nc(0.0f);
                mu1Var.v9 = null;
                return;
            }
        }
        if (mu1Var.v9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.o3) {
            int max = Math.max(gl.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.n3);
            if (getScrollState() == 0 && mu1Var.w9 && !mu1Var.C9 && max <= (-gl.Z0(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                mu1Var.v9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                mu1Var.C0.R = false;
                mu1Var.w9 = false;
                mu1Var.C9 = true;
                this.m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (mu1Var.C9) {
                if (Math.abs(max) >= gl.L(50.0f)) {
                    if (!this.s3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.s3 = true;
                    }
                } else {
                    this.s3 = false;
                }
                float f4 = max;
                mu1Var.nc(f4);
                k27 g72 = mu1Var.g7();
                if (g72 != null && (g72.g4() || k27.K4(g72.k))) {
                    mu1Var.hd(false, false);
                }
                View view = mu1Var.v9;
                if (view instanceof gb2) {
                    D1((gb2) view, f4);
                }
                invalidate();
            }
        } else if (mu1Var.v9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.o3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = mu1Var.v9;
                if (view2 instanceof gb2) {
                    f2 = ((gb2) view2).U1(false);
                } else if (view2 instanceof uk1) {
                    f2 = ((uk1) view2).getWalletSlidingOffset();
                } else {
                    f2 = 0.0f;
                }
                if (Math.abs(f2) >= gl.L(50.0f)) {
                    k27 g73 = mu1Var.g7();
                    boolean I42 = mu1Var.I4(g73);
                    er1 er1Var = mu1Var.d1;
                    if ((er1Var != null && er1Var.getVisibility() == 0 && ((!mu1Var.X0 || !I42) && !g73.X1)) || ((chat = mu1Var.e) != null && ((hc2.r0(chat) && !mu1Var.Y7()) || ((hc2.T(mu1Var.e) && !hc2.w(5, mu1Var.e) && !mu1Var.e.megagroup) || !hc2.n(mu1Var.e))))) {
                        if (g73.c1() != 0 && (K6 = mu1Var.K6(g73.c1())) != null && (k27Var = K6.h) != null) {
                            g73 = k27Var;
                        }
                        mu1Var.F5 = g73;
                        Bundle j = tb4.j(3, "onlySelect", "dialogsType", true);
                        j.putBoolean("quote", true);
                        j.putBoolean("reply_to", true);
                        mu1Var.Ka(j, g73);
                        j.putInt("messagesCount", 1);
                        j.putBoolean("canSelectTopics", true);
                        cj3 cj3Var = new cj3(j);
                        cj3Var.E2 = mu1Var;
                        mu1Var.presentFragment(cj3Var);
                    } else {
                        mu1Var.Pb(mu1Var.g7());
                    }
                }
            }
            View view3 = mu1Var.v9;
            if (view3 instanceof gb2) {
                f = ((gb2) view3).getSlidingOffsetX();
            } else if (view3 instanceof uk1) {
                f = ((uk1) view3).getWalletSlidingOffset();
            } else {
                f = 0.0f;
            }
            this.r3 = f;
            if (f == 0.0f) {
                mu1Var.v9 = null;
            }
            this.p3 = System.currentTimeMillis();
            this.q3 = 0.0f;
            invalidate();
            mu1Var.w9 = false;
            mu1Var.C9 = false;
            mu1Var.C0.R = true;
        }
    }

    public final void D1(gb2 gb2Var, float f) {
        f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != gb2Var && (childAt instanceof gb2)) {
                gb2 gb2Var2 = (gb2) childAt;
                if (gb2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    gb2Var2.setSlidingOffset(f);
                    gb2Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override
    public final boolean G0(View view) {
        if (view.getVisibility() != 4 && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        mu1 mu1Var = this.G3;
        mu1Var.K8 = null;
        canvas.save();
        this.F1.setEmpty();
        if (mu1Var.ka != 0.0f) {
            int save = canvas.save();
            if (mu1Var.ra != 0.0f) {
                f = (mu1Var.A0.getMeasuredHeight() - mu1Var.ka) * mu1Var.ra;
            } else {
                f = 0.0f;
            }
            float f2 = (-mu1Var.ka) - f;
            mu1Var.Wa = f2;
            canvas.translate(0.0f, f2);
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq1.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void k1(View view, float f, float f2, boolean z) {
        f27 currentMessagesGroup;
        super.k1(view, f, f2, z);
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            k27 messageObject = gb2Var.getMessageObject();
            if (!messageObject.I3() && !messageObject.U2() && (currentMessagesGroup = gb2Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != view && (childAt instanceof gb2)) {
                        gb2 gb2Var2 = (gb2) childAt;
                        if (gb2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            gb2Var2.setPressed(z);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wx8 wx8Var;
        a aVar;
        mu1 mu1Var = this.G3;
        bt1 bt1Var = mu1Var.u9;
        bt1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gl.r(bt1Var.f0);
            bt1Var.z = false;
        }
        if (!this.W1 && ((wx8Var = mu1Var.ua) == null || !wx8Var.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            aVar = ((d) mu1Var).actionBar;
            if (!aVar.y() && !mu1Var.R7()) {
                C1(motionEvent);
                if (onInterceptTouchEvent || mu1Var.y9) {
                    return true;
                }
            } else {
                return onInterceptTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.g3;
        int i6 = i3 - i;
        mu1 mu1Var = this.G3;
        if (i5 != i6) {
            if (i5 != 0) {
                mu1Var.x7(false);
            }
            this.g3 = i6;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            lq1 lq1Var = mu1Var.B0;
            if (lq1Var != null) {
                lq1Var.g();
            }
            mu1Var.o9.d();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        mu1Var.j6 = false;
        bt1 bt1Var = mu1Var.u9;
        if (bt1Var != null && bt1Var.w()) {
            mu1Var.u9.v();
        }
        mu1Var.F7();
        mu1Var.W7();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        kc2 kc2Var;
        mu1 mu1Var = this.G3;
        fm0 fm0Var = mu1Var.cd;
        bt1 bt1Var = mu1Var.u9;
        bt1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gl.r(bt1Var.f0);
            bt1Var.z = false;
        }
        if (motionEvent.getAction() == 0) {
            mu1Var.Pa = true;
        }
        if (mu1Var.ka != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, mu1Var.ka / gl.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (kc2Var = mu1Var.ma) != null && !kc2Var.S) {
                if (kc2Var.L != 1.0f) {
                    float f = mu1Var.ka;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, gl.L(8.0f) + f);
                    mu1Var.na = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final jq1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            jq1 jq1Var = this.b;
                            switch (b) {
                                case 0:
                                    mu1 mu1Var2 = jq1Var.G3;
                                    mu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    mu1Var2.A0.invalidate();
                                    return;
                                case 1:
                                    mu1 mu1Var3 = jq1Var.G3;
                                    mu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    mu1Var3.A0.invalidate();
                                    return;
                                case 2:
                                    mu1 mu1Var4 = jq1Var.G3;
                                    mu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    mu1Var4.A0.invalidate();
                                    return;
                                default:
                                    mu1 mu1Var5 = jq1Var.G3;
                                    mu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    mu1Var5.A0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    s33 s33Var = s33.f;
                    ofFloat.setInterpolator(s33Var);
                    ofFloat.start();
                    final kc2 kc2Var2 = mu1Var.ma;
                    hq1 hq1Var = new hq1(this, (byte) 0);
                    AnimatorSet animatorSet = kc2Var2.K;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        kc2Var2.K.cancel();
                    }
                    kc2Var2.Z = hq1Var;
                    kc2Var2.K = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(kc2Var2.L, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            kc2 kc2Var3 = kc2Var2;
                            kc2Var3.getClass();
                            switch (b) {
                                case 0:
                                    kc2Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    kc2Var3.U.invalidate();
                                    jq1 jq1Var = kc2Var3.b0;
                                    if (jq1Var != null) {
                                        jq1Var.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    kc2Var3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    jq1 jq1Var2 = kc2Var3.b0;
                                    if (jq1Var2 != null) {
                                        jq1Var2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(kc2Var2.M, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            kc2 kc2Var3 = kc2Var2;
                            kc2Var3.getClass();
                            switch (b) {
                                case 0:
                                    kc2Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    kc2Var3.U.invalidate();
                                    jq1 jq1Var = kc2Var3.b0;
                                    if (jq1Var != null) {
                                        jq1Var.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    kc2Var3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    jq1 jq1Var2 = kc2Var3.b0;
                                    if (jq1Var2 != null) {
                                        jq1Var2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    kc2Var2.K.addListener(new bb1(kc2Var2, (byte) 22));
                    kc2Var2.K.playTogether(ofFloat2, ofFloat3);
                    kc2Var2.K.setDuration(120L);
                    kc2Var2.K.setInterpolator(s33Var);
                    kc2Var2.K.start();
                } else {
                    mu1Var.A4();
                }
            } else {
                kc2 kc2Var3 = mu1Var.ma;
                if (kc2Var3 != null && kc2Var3.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    kc2 kc2Var4 = mu1Var.ma;
                    if (currentTimeMillis - kc2Var4.V < 500 && kc2Var4.N) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        mu1Var.na = animatorSet2;
                        if (mu1Var.ma != null) {
                            fm0Var.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(mu1Var.ka, gl.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final jq1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                jq1 jq1Var = this.b;
                                switch (b) {
                                    case 0:
                                        mu1 mu1Var2 = jq1Var.G3;
                                        mu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var2.A0.invalidate();
                                        return;
                                    case 1:
                                        mu1 mu1Var3 = jq1Var.G3;
                                        mu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var3.A0.invalidate();
                                        return;
                                    case 2:
                                        mu1 mu1Var4 = jq1Var.G3;
                                        mu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var4.A0.invalidate();
                                        return;
                                    default:
                                        mu1 mu1Var5 = jq1Var.G3;
                                        mu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(s33.f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(gl.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final jq1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                jq1 jq1Var = this.b;
                                switch (b) {
                                    case 0:
                                        mu1 mu1Var2 = jq1Var.G3;
                                        mu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var2.A0.invalidate();
                                        return;
                                    case 1:
                                        mu1 mu1Var3 = jq1Var.G3;
                                        mu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var3.A0.invalidate();
                                        return;
                                    case 2:
                                        mu1 mu1Var4 = jq1Var.G3;
                                        mu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var4.A0.invalidate();
                                        return;
                                    default:
                                        mu1 mu1Var5 = jq1Var.G3;
                                        mu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(la2.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(mu1Var.ka, 0.0f);
                mu1Var.na = ofFloat6;
                if (mu1Var.ma != null) {
                    fm0Var.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jq1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        jq1 jq1Var = this.b;
                        switch (b) {
                            case 0:
                                mu1 mu1Var2 = jq1Var.G3;
                                mu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var2.A0.invalidate();
                                return;
                            case 1:
                                mu1 mu1Var3 = jq1Var.G3;
                                mu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var3.A0.invalidate();
                                return;
                            case 2:
                                mu1 mu1Var4 = jq1Var.G3;
                                mu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var4.A0.invalidate();
                                return;
                            default:
                                mu1 mu1Var5 = jq1Var.G3;
                                mu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var5.A0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(la2.V);
                ofFloat6.start();
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            aVar = ((d) mu1Var).actionBar;
            if (!aVar.y() && !mu1Var.R7()) {
                C1(motionEvent);
                if (mu1Var.C9 || mu1Var.y9 || onTouchEvent) {
                    return true;
                }
            } else {
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.G3.g9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        zi9 f4;
        gwc gwcVar;
        super.requestDisallowInterceptTouchEvent(z);
        View view = this.G3.v9;
        if (view != null) {
            if ((view instanceof gb2) && (f4 = ((gb2) view).f4()) != null && (gwcVar = f4.e0) != null && f4.f0 && gwcVar.w && !gwcVar.E) {
                if (gwcVar.x) {
                    if (!gwcVar.y && (gwcVar.L & 3) != 1) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.E3) {
            return;
        }
        vu1 vu1Var = this.G3.uc;
        if (vu1Var.b != 0) {
            int childCount = vu1Var.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                vu1Var.a.getChildAt(i).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(b49 b49Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(b49Var);
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            mu1 mu1Var = this.G3;
            mu1Var.E7();
            mu1Var.G7();
        }
    }

    public final void z1(android.graphics.Canvas r31, android.graphics.RectF r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq1.z1(android.graphics.Canvas, android.graphics.RectF):void");
    }
}
