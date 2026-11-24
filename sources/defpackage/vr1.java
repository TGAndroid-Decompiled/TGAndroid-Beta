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
public final class vr1 extends qu1 {
    public final xk4 A3;
    public final zna B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final yv1 G3;
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
    public final xk4 w3;
    public final zna x3;
    public final xk4 y3;
    public final zna z3;

    public vr1(yv1 yv1Var, Context context, wv1 wv1Var) {
        super(yv1Var, context, wv1Var);
        this.G3 = yv1Var;
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
        xk4 xk4Var = new xk4(0.0f);
        this.w3 = xk4Var;
        zna znaVar = new zna(xk4Var);
        znaVar.h = 0.0f;
        znaVar.g = 2000.0f;
        znaVar.m = aq1.j(0.0f, 1500.0f, 1.0f);
        znaVar.b(new it3(this) {
            public final vr1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(zna znaVar2, float f, float f2) {
                byte b = r2;
                vr1 vr1Var = this.b;
                switch (b) {
                    case 0:
                        vr1Var.invalidate();
                        return;
                    case 1:
                        vr1Var.invalidate();
                        return;
                    default:
                        vr1Var.invalidate();
                        return;
                }
            }
        });
        this.x3 = znaVar;
        xk4 xk4Var2 = new xk4(0.0f);
        this.y3 = xk4Var2;
        zna znaVar2 = new zna(xk4Var2);
        znaVar2.h = 0.0f;
        znaVar2.m = aq1.j(0.0f, 400.0f, 0.5f);
        znaVar2.b(new it3(this) {
            public final vr1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(zna znaVar22, float f, float f2) {
                byte b = r2;
                vr1 vr1Var = this.b;
                switch (b) {
                    case 0:
                        vr1Var.invalidate();
                        return;
                    case 1:
                        vr1Var.invalidate();
                        return;
                    default:
                        vr1Var.invalidate();
                        return;
                }
            }
        });
        this.z3 = znaVar2;
        xk4 xk4Var3 = new xk4(0.0f);
        this.A3 = xk4Var3;
        zna znaVar3 = new zna(xk4Var3);
        znaVar3.h = 0.0f;
        znaVar3.m = aq1.j(0.0f, 200.0f, 1.0f);
        znaVar3.b(new it3(this) {
            public final vr1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(zna znaVar22, float f, float f2) {
                byte b = r2;
                vr1 vr1Var = this.b;
                switch (b) {
                    case 0:
                        vr1Var.invalidate();
                        return;
                    case 1:
                        vr1Var.invalidate();
                        return;
                    default:
                        vr1Var.invalidate();
                        return;
                }
            }
        });
        this.B3 = znaVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(gm.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gm.L(2.0f));
    }

    public final void A1(android.graphics.Canvas r21, android.graphics.RectF r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr1.A1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void B1(boolean z) {
        float f;
        VelocityTracker velocityTracker;
        yv1 yv1Var = this.G3;
        if (z && (velocityTracker = yv1Var.B9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f = yv1Var.B9.getXVelocity();
        } else {
            f = 0.0f;
        }
        VelocityTracker velocityTracker2 = yv1Var.B9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            yv1Var.B9 = null;
        }
        yv1Var.y9 = false;
        yv1Var.C0.R = true;
        oyb oybVar = yv1Var.n0;
        if (oybVar != null) {
            oybVar.settle(f);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        float f;
        float f2;
        TLRPC.Chat chat;
        f47 T6;
        k47 k47Var;
        boolean z;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        yv1 yv1Var = this.G3;
        if (motionEvent != null) {
            yv1Var.R4 = true;
        }
        if (yv1Var.k8() && yv1Var.v9 == null) {
            if (motionEvent == null) {
                if (yv1Var.y9) {
                    B1(false);
                }
                yv1Var.x9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z2 = ((d) yv1Var).inPreviewMode;
                    if (!z2 && !yv1Var.B7() && motionEvent.getX() >= getMeasuredWidth() * 0.55f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    yv1Var.x9 = z3;
                    if (!z3) {
                        yv1Var.y9 = false;
                    } else {
                        yv1Var.y9 = false;
                        yv1Var.z9 = motionEvent.getX();
                        yv1Var.A9 = motionEvent.getY();
                        VelocityTracker velocityTracker = yv1Var.B9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        yv1Var.B9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                } else if (yv1Var.x9 || yv1Var.y9) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker2 = yv1Var.B9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        float x = motionEvent.getX() - yv1Var.z9;
                        float abs = Math.abs(motionEvent.getY() - yv1Var.A9);
                        if (yv1Var.x9 && !yv1Var.y9 && getScrollState() == 0 && x <= (-gm.Z0(true, 0.4f)) && Math.abs(x) / 3.0f > abs && yv1Var.C6() != null) {
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onInterceptTouchEvent(obtain2);
                            obtain2.recycle();
                            yv1Var.C0.R = false;
                            yv1Var.x9 = false;
                            yv1Var.y9 = true;
                            yv1Var.z9 = motionEvent.getX();
                            oyb oybVar = yv1Var.n0;
                            ValueAnimator valueAnimator = oybVar.K;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                oybVar.K = null;
                            }
                            gm.t1(yv1Var.m1);
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return;
                            }
                            return;
                        } else if (yv1Var.y9) {
                            yv1Var.n0.setProgress((-(motionEvent.getX() - yv1Var.z9)) / yv1Var.n0.getContentWidth());
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (yv1Var.y9) {
                            VelocityTracker velocityTracker3 = yv1Var.B9;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            if (actionMasked != 1) {
                                z4 = false;
                            }
                            B1(z4);
                        }
                        yv1Var.x9 = false;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !yv1Var.C9 && !yv1Var.w9 && yv1Var.v9 == null) {
            z = ((d) yv1Var).inPreviewMode;
            if (!z) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof rc2)) {
                    if (pressedChildView instanceof cm1) {
                        cm1 cm1Var = (cm1) pressedChildView;
                        float x2 = motionEvent.getX() - pressedChildView.getX();
                        float y = motionEvent.getY() - pressedChildView.getY();
                        if (cm1Var.S()) {
                            mmc mmcVar = cm1Var.J0;
                            float f3 = (x2 - cm1Var.L0) - (cm1Var.k0 / 2.0f);
                            float paddingTop = (y - cm1Var.M0) - cm1Var.getPaddingTop();
                            lmc lmcVar = mmcVar.m;
                            if (lmcVar != null && lmcVar.n && mmcVar.w.contains((int) f3, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (yv1Var.v9 != null) {
                    yv1Var.Bc(0.0f);
                }
                yv1Var.v9 = pressedChildView;
                k47 q7 = yv1Var.q7();
                boolean O4 = yv1Var.O4(q7);
                int i = yv1Var.g4;
                if ((i == 0 || i == 5 || i == 8 || (i == 3 && yv1Var.s4 == yv1Var.getUserConfig().e())) && (((arrayList = yv1Var.p4) == null || !arrayList.contains(q7)) && ((yv1Var.Z6(q7) != 1 || (k47.B0(q7.k) != yv1Var.d7 && !q7.l5())) && ((yv1Var.h != null || q7.e1() >= 0) && (((chat2 = yv1Var.e) == null || !sd2.c0(chat2) || O4) && !yv1Var.B7() && (!k47.c3(q7.k) || !q7.N3())))))) {
                    this.o3 = motionEvent.getPointerId(0);
                    yv1Var.w9 = true;
                    this.m3 = (int) motionEvent.getX();
                    this.n3 = (int) motionEvent.getY();
                    return;
                }
                yv1Var.Bc(0.0f);
                yv1Var.v9 = null;
                return;
            }
        }
        if (yv1Var.v9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.o3) {
            int max = Math.max(gm.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.n3);
            if (getScrollState() == 0 && yv1Var.w9 && !yv1Var.C9 && max <= (-gm.Z0(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                yv1Var.v9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                yv1Var.C0.R = false;
                yv1Var.w9 = false;
                yv1Var.C9 = true;
                this.m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (yv1Var.C9) {
                if (Math.abs(max) >= gm.L(50.0f)) {
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
                yv1Var.Bc(f4);
                k47 q72 = yv1Var.q7();
                if (q72 != null && (q72.g4() || k47.K4(q72.k))) {
                    yv1Var.vd(false, false);
                }
                View view = yv1Var.v9;
                if (view instanceof rc2) {
                    D1((rc2) view, f4);
                }
                invalidate();
            }
        } else if (yv1Var.v9 != null) {
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
                View view2 = yv1Var.v9;
                if (view2 instanceof rc2) {
                    f2 = ((rc2) view2).U1(false);
                } else if (view2 instanceof cm1) {
                    f2 = ((cm1) view2).getWalletSlidingOffset();
                } else {
                    f2 = 0.0f;
                }
                if (Math.abs(f2) >= gm.L(50.0f)) {
                    k47 q73 = yv1Var.q7();
                    boolean O42 = yv1Var.O4(q73);
                    qs1 qs1Var = yv1Var.d1;
                    if ((qs1Var != null && qs1Var.getVisibility() == 0 && ((!yv1Var.X0 || !O42) && !q73.X1)) || ((chat = yv1Var.e) != null && ((sd2.r0(chat) && !yv1Var.j8()) || ((sd2.T(yv1Var.e) && !sd2.w(5, yv1Var.e) && !yv1Var.e.megagroup) || !sd2.n(yv1Var.e))))) {
                        if (q73.c1() != 0 && (T6 = yv1Var.T6(q73.c1())) != null && (k47Var = T6.h) != null) {
                            q73 = k47Var;
                        }
                        yv1Var.F5 = q73;
                        Bundle j = td4.j(3, "onlySelect", "dialogsType", true);
                        j.putBoolean("quote", true);
                        j.putBoolean("reply_to", true);
                        yv1Var.Wa(j, q73);
                        j.putInt("messagesCount", 1);
                        j.putBoolean("canSelectTopics", true);
                        nk3 nk3Var = new nk3(j);
                        nk3Var.E2 = yv1Var;
                        yv1Var.presentFragment(nk3Var);
                    } else {
                        yv1Var.dc(yv1Var.q7());
                    }
                }
            }
            View view3 = yv1Var.v9;
            if (view3 instanceof rc2) {
                f = ((rc2) view3).getSlidingOffsetX();
            } else if (view3 instanceof cm1) {
                f = ((cm1) view3).getWalletSlidingOffset();
            } else {
                f = 0.0f;
            }
            this.r3 = f;
            if (f == 0.0f) {
                yv1Var.v9 = null;
            }
            this.p3 = System.currentTimeMillis();
            this.q3 = 0.0f;
            invalidate();
            yv1Var.w9 = false;
            yv1Var.C9 = false;
            yv1Var.C0.R = true;
        }
    }

    public final void D1(rc2 rc2Var, float f) {
        f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != rc2Var && (childAt instanceof rc2)) {
                rc2 rc2Var2 = (rc2) childAt;
                if (rc2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    rc2Var2.setSlidingOffset(f);
                    rc2Var2.invalidate();
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
        yv1 yv1Var = this.G3;
        yv1Var.K8 = null;
        canvas.save();
        this.F1.setEmpty();
        if (yv1Var.ka != 0.0f) {
            int save = canvas.save();
            if (yv1Var.ra != 0.0f) {
                f = (yv1Var.A0.getMeasuredHeight() - yv1Var.ka) * yv1Var.ra;
            } else {
                f = 0.0f;
            }
            float f2 = (-yv1Var.ka) - f;
            yv1Var.Wa = f2;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr1.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void k1(View view, float f, float f2, boolean z) {
        f47 currentMessagesGroup;
        super.k1(view, f, f2, z);
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            k47 messageObject = rc2Var.getMessageObject();
            if (!messageObject.I3() && !messageObject.U2() && (currentMessagesGroup = rc2Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != view && (childAt instanceof rc2)) {
                        rc2 rc2Var2 = (rc2) childAt;
                        if (rc2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            rc2Var2.setPressed(z);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr1.onDraw(android.graphics.Canvas):void");
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
        xz8 xz8Var;
        a aVar;
        yv1 yv1Var = this.G3;
        nu1 nu1Var = yv1Var.u9;
        nu1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gm.r(nu1Var.f0);
            nu1Var.z = false;
        }
        if (!this.W1 && ((xz8Var = yv1Var.ua) == null || !xz8Var.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            aVar = ((d) yv1Var).actionBar;
            if (!aVar.y() && !yv1Var.c8()) {
                C1(motionEvent);
                if (onInterceptTouchEvent || yv1Var.y9) {
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
        vr1 vr1Var;
        hu1 hu1Var;
        View view;
        k47 messageObject;
        int i5;
        yv1 yv1Var = this.G3;
        if (yv1Var.ub && yv1Var.tb && getMeasuredHeight() > 0 && getPaddingTop() > 0 && yv1Var.D0 != null) {
            yv1Var.ub = false;
            yv1Var.C0.G = false;
            k47 k47Var = (k47) yv1Var.G6[0].get(yv1Var.vb);
            if (k47Var != null) {
                i5 = yv1Var.M6.indexOf(k47Var);
            } else {
                i5 = -1;
            }
            if (i5 >= 0) {
                yv1Var.C0.h1(yv1Var.D0.K + i5, Math.max(gm.L(50.0f) + yv1Var.h7(k47Var), gm.L(102.0f)), false);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        if (yv1Var.vb != 0 && (vr1Var = yv1Var.A0) != null && (hu1Var = yv1Var.D0) != null && !hu1Var.O && !vr1Var.W1) {
            int childCount = vr1Var.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount) {
                    view = yv1Var.A0.getChildAt(i6);
                    if ((view instanceof rc2) && (messageObject = ((rc2) view).getMessageObject()) != null && messageObject.e1() == yv1Var.vb && k47.B0(messageObject.k) == yv1Var.l6) {
                        break;
                    }
                    i6++;
                } else {
                    view = null;
                    break;
                }
            }
            int i7 = yv1Var.wb;
            if (view == null) {
                if (i7 != Integer.MIN_VALUE) {
                    yv1Var.vb = 0;
                    yv1Var.wb = Integer.MIN_VALUE;
                }
            } else if (i7 == Integer.MIN_VALUE) {
                if (yv1Var.A0.getPaddingTop() > 0 && !yv1Var.ub) {
                    yv1Var.wb = view.getTop();
                }
            } else {
                int top = view.getTop() - i7;
                if (top != 0) {
                    yv1Var.A0.scrollBy(0, top);
                }
            }
        }
        int i8 = this.g3;
        int i9 = i3 - i;
        if (i8 != i9) {
            if (i8 != 0) {
                yv1Var.H7(false);
            }
            this.g3 = i9;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            xr1 xr1Var = yv1Var.B0;
            if (xr1Var != null) {
                xr1Var.g();
            }
            yv1Var.o9.e();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        yv1Var.j6 = false;
        nu1 nu1Var = yv1Var.u9;
        if (nu1Var != null && nu1Var.w()) {
            yv1Var.u9.v();
        }
        yv1Var.P7();
        yv1Var.h8();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        vd2 vd2Var;
        yv1 yv1Var = this.G3;
        fn0 fn0Var = yv1Var.nd;
        nu1 nu1Var = yv1Var.u9;
        nu1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gm.r(nu1Var.f0);
            nu1Var.z = false;
        }
        if (motionEvent.getAction() == 0) {
            yv1Var.Pa = true;
        }
        if (yv1Var.ka != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, yv1Var.ka / gm.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (vd2Var = yv1Var.ma) != null && !vd2Var.S) {
                if (vd2Var.L != 1.0f) {
                    float f = yv1Var.ka;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, gm.L(8.0f) + f);
                    yv1Var.na = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final vr1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            vr1 vr1Var = this.b;
                            switch (b) {
                                case 0:
                                    yv1 yv1Var2 = vr1Var.G3;
                                    yv1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    yv1Var2.A0.invalidate();
                                    return;
                                case 1:
                                    yv1 yv1Var3 = vr1Var.G3;
                                    yv1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    yv1Var3.A0.invalidate();
                                    return;
                                case 2:
                                    yv1 yv1Var4 = vr1Var.G3;
                                    yv1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    yv1Var4.A0.invalidate();
                                    return;
                                default:
                                    yv1 yv1Var5 = vr1Var.G3;
                                    yv1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    yv1Var5.A0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    d53 d53Var = d53.f;
                    ofFloat.setInterpolator(d53Var);
                    ofFloat.start();
                    final vd2 vd2Var2 = yv1Var.ma;
                    fo1 fo1Var = new fo1(this, (byte) 4);
                    AnimatorSet animatorSet = vd2Var2.K;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        vd2Var2.K.cancel();
                    }
                    vd2Var2.Z = fo1Var;
                    vd2Var2.K = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(vd2Var2.L, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            vd2 vd2Var3 = vd2Var2;
                            vd2Var3.getClass();
                            switch (b) {
                                case 0:
                                    vd2Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vd2Var3.U.invalidate();
                                    vr1 vr1Var = vd2Var3.b0;
                                    if (vr1Var != null) {
                                        vr1Var.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vd2Var3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vr1 vr1Var2 = vd2Var3.b0;
                                    if (vr1Var2 != null) {
                                        vr1Var2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(vd2Var2.M, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            vd2 vd2Var3 = vd2Var2;
                            vd2Var3.getClass();
                            switch (b) {
                                case 0:
                                    vd2Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vd2Var3.U.invalidate();
                                    vr1 vr1Var = vd2Var3.b0;
                                    if (vr1Var != null) {
                                        vr1Var.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vd2Var3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vr1 vr1Var2 = vd2Var3.b0;
                                    if (vr1Var2 != null) {
                                        vr1Var2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    vd2Var2.K.addListener(new b91(vd2Var2, (byte) 24));
                    vd2Var2.K.playTogether(ofFloat2, ofFloat3);
                    vd2Var2.K.setDuration(120L);
                    vd2Var2.K.setInterpolator(d53Var);
                    vd2Var2.K.start();
                } else {
                    yv1Var.G4();
                }
            } else {
                vd2 vd2Var3 = yv1Var.ma;
                if (vd2Var3 != null && vd2Var3.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    vd2 vd2Var4 = yv1Var.ma;
                    if (currentTimeMillis - vd2Var4.V < 500 && vd2Var4.N) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        yv1Var.na = animatorSet2;
                        if (yv1Var.ma != null) {
                            fn0Var.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(yv1Var.ka, gm.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final vr1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                vr1 vr1Var = this.b;
                                switch (b) {
                                    case 0:
                                        yv1 yv1Var2 = vr1Var.G3;
                                        yv1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var2.A0.invalidate();
                                        return;
                                    case 1:
                                        yv1 yv1Var3 = vr1Var.G3;
                                        yv1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var3.A0.invalidate();
                                        return;
                                    case 2:
                                        yv1 yv1Var4 = vr1Var.G3;
                                        yv1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var4.A0.invalidate();
                                        return;
                                    default:
                                        yv1 yv1Var5 = vr1Var.G3;
                                        yv1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(d53.f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(gm.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final vr1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                vr1 vr1Var = this.b;
                                switch (b) {
                                    case 0:
                                        yv1 yv1Var2 = vr1Var.G3;
                                        yv1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var2.A0.invalidate();
                                        return;
                                    case 1:
                                        yv1 yv1Var3 = vr1Var.G3;
                                        yv1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var3.A0.invalidate();
                                        return;
                                    case 2:
                                        yv1 yv1Var4 = vr1Var.G3;
                                        yv1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var4.A0.invalidate();
                                        return;
                                    default:
                                        yv1 yv1Var5 = vr1Var.G3;
                                        yv1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(wb2.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(yv1Var.ka, 0.0f);
                yv1Var.na = ofFloat6;
                if (yv1Var.ma != null) {
                    fn0Var.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final vr1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        vr1 vr1Var = this.b;
                        switch (b) {
                            case 0:
                                yv1 yv1Var2 = vr1Var.G3;
                                yv1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var2.A0.invalidate();
                                return;
                            case 1:
                                yv1 yv1Var3 = vr1Var.G3;
                                yv1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var3.A0.invalidate();
                                return;
                            case 2:
                                yv1 yv1Var4 = vr1Var.G3;
                                yv1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var4.A0.invalidate();
                                return;
                            default:
                                yv1 yv1Var5 = vr1Var.G3;
                                yv1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var5.A0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(wb2.V);
                ofFloat6.start();
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            aVar = ((d) yv1Var).actionBar;
            if (!aVar.y() && !yv1Var.c8()) {
                C1(motionEvent);
                if (yv1Var.C9 || yv1Var.y9 || onTouchEvent) {
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
        al9 f4;
        hyc hycVar;
        super.requestDisallowInterceptTouchEvent(z);
        View view = this.G3.v9;
        if (view != null) {
            if ((view instanceof rc2) && (f4 = ((rc2) view).f4()) != null && (hycVar = f4.e0) != null && f4.f0 && hycVar.w && !hycVar.E) {
                if (hycVar.x) {
                    if (!hycVar.y && (hycVar.L & 3) != 1) {
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
        hw1 hw1Var = this.G3.Ec;
        if (hw1Var.b != 0) {
            int childCount = hw1Var.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                hw1Var.a.getChildAt(i).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(d69 d69Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(d69Var);
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            yv1 yv1Var = this.G3;
            yv1Var.O7();
            yv1Var.Q7();
        }
    }

    public final void z1(android.graphics.Canvas r31, android.graphics.RectF r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr1.z1(android.graphics.Canvas, android.graphics.RectF):void");
    }
}
