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
import org.telegram.ui.ActionBar.e;
public final class wq1 extends rt1 {
    public final xk4 A3;
    public final vpa B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final zu1 G3;
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
    public final vpa x3;
    public final xk4 y3;
    public final vpa z3;

    public wq1(zu1 zu1Var, Context context, xu1 xu1Var) {
        super(zu1Var, context, xu1Var);
        this.G3 = zu1Var;
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
        vpa vpaVar = new vpa(xk4Var);
        vpaVar.h = 0.0f;
        vpaVar.g = 2000.0f;
        vpaVar.m = bp1.j(0.0f, 1500.0f, 1.0f);
        vpaVar.b(new qs3(this) {
            public final wq1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(vpa vpaVar2, float f, float f2) {
                byte b = r2;
                wq1 wq1Var = this.b;
                switch (b) {
                    case 0:
                        wq1Var.invalidate();
                        return;
                    case 1:
                        wq1Var.invalidate();
                        return;
                    default:
                        wq1Var.invalidate();
                        return;
                }
            }
        });
        this.x3 = vpaVar;
        xk4 xk4Var2 = new xk4(0.0f);
        this.y3 = xk4Var2;
        vpa vpaVar2 = new vpa(xk4Var2);
        vpaVar2.h = 0.0f;
        vpaVar2.m = bp1.j(0.0f, 400.0f, 0.5f);
        vpaVar2.b(new qs3(this) {
            public final wq1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(vpa vpaVar22, float f, float f2) {
                byte b = r2;
                wq1 wq1Var = this.b;
                switch (b) {
                    case 0:
                        wq1Var.invalidate();
                        return;
                    case 1:
                        wq1Var.invalidate();
                        return;
                    default:
                        wq1Var.invalidate();
                        return;
                }
            }
        });
        this.z3 = vpaVar2;
        xk4 xk4Var3 = new xk4(0.0f);
        this.A3 = xk4Var3;
        vpa vpaVar3 = new vpa(xk4Var3);
        vpaVar3.h = 0.0f;
        vpaVar3.m = bp1.j(0.0f, 200.0f, 1.0f);
        vpaVar3.b(new qs3(this) {
            public final wq1 b;

            {
                this.b = this;
            }

            @Override
            public final void a(vpa vpaVar22, float f, float f2) {
                byte b = r2;
                wq1 wq1Var = this.b;
                switch (b) {
                    case 0:
                        wq1Var.invalidate();
                        return;
                    case 1:
                        wq1Var.invalidate();
                        return;
                    default:
                        wq1Var.invalidate();
                        return;
                }
            }
        });
        this.B3 = vpaVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(hl.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(hl.L(2.0f));
    }

    public final void A1(android.graphics.Canvas r31, android.graphics.RectF r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.A1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void B1(android.graphics.Canvas r21, android.graphics.RectF r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.B1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void C1(boolean z) {
        float f;
        VelocityTracker velocityTracker;
        zu1 zu1Var = this.G3;
        if (z && (velocityTracker = zu1Var.B9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f = zu1Var.B9.getXVelocity();
        } else {
            f = 0.0f;
        }
        VelocityTracker velocityTracker2 = zu1Var.B9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            zu1Var.B9 = null;
        }
        zu1Var.y9 = false;
        zu1Var.C0.R = true;
        n0c n0cVar = zu1Var.n0;
        if (n0cVar != null) {
            n0cVar.settle(f);
        }
    }

    public final void D1(MotionEvent motionEvent) {
        float f;
        float f2;
        TLRPC.Chat chat;
        m47 T6;
        r47 r47Var;
        boolean z;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        zu1 zu1Var = this.G3;
        if (motionEvent != null) {
            zu1Var.R4 = true;
        }
        if (zu1Var.l8() && zu1Var.v9 == null) {
            if (motionEvent == null) {
                if (zu1Var.y9) {
                    C1(false);
                }
                zu1Var.x9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z2 = ((e) zu1Var).inPreviewMode;
                    if (!z2 && !zu1Var.B7() && motionEvent.getX() >= getMeasuredWidth() * 0.55f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zu1Var.x9 = z3;
                    if (!z3) {
                        zu1Var.y9 = false;
                    } else {
                        zu1Var.y9 = false;
                        zu1Var.z9 = motionEvent.getX();
                        zu1Var.A9 = motionEvent.getY();
                        VelocityTracker velocityTracker = zu1Var.B9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        zu1Var.B9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                } else if (zu1Var.x9 || zu1Var.y9) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker2 = zu1Var.B9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        float x = motionEvent.getX() - zu1Var.z9;
                        float abs = Math.abs(motionEvent.getY() - zu1Var.A9);
                        if (zu1Var.x9 && !zu1Var.y9 && getScrollState() == 0 && x <= (-hl.Z0(true, 0.4f)) && Math.abs(x) / 3.0f > abs && zu1Var.C6() != null) {
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onInterceptTouchEvent(obtain2);
                            obtain2.recycle();
                            zu1Var.C0.R = false;
                            zu1Var.x9 = false;
                            zu1Var.y9 = true;
                            zu1Var.z9 = motionEvent.getX();
                            n0c n0cVar = zu1Var.n0;
                            ValueAnimator valueAnimator = n0cVar.K;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                n0cVar.K = null;
                            }
                            hl.t1(zu1Var.m1);
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return;
                            }
                            return;
                        } else if (zu1Var.y9) {
                            zu1Var.n0.setProgress((-(motionEvent.getX() - zu1Var.z9)) / zu1Var.n0.getContentWidth());
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (zu1Var.y9) {
                            VelocityTracker velocityTracker3 = zu1Var.B9;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            if (actionMasked != 1) {
                                z4 = false;
                            }
                            C1(z4);
                        }
                        zu1Var.x9 = false;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !zu1Var.C9 && !zu1Var.w9 && zu1Var.v9 == null) {
            z = ((e) zu1Var).inPreviewMode;
            if (!z) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof wb2)) {
                    if (pressedChildView instanceof dl1) {
                        dl1 dl1Var = (dl1) pressedChildView;
                        float x2 = motionEvent.getX() - pressedChildView.getX();
                        float y = motionEvent.getY() - pressedChildView.getY();
                        if (dl1Var.U()) {
                            zoc zocVar = dl1Var.J0;
                            float f3 = (x2 - dl1Var.L0) - (dl1Var.k0 / 2.0f);
                            float paddingTop = (y - dl1Var.M0) - dl1Var.getPaddingTop();
                            yoc yocVar = zocVar.m;
                            if (yocVar != null && yocVar.n && zocVar.w.contains((int) f3, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (zu1Var.v9 != null) {
                    zu1Var.Bc(0.0f);
                }
                zu1Var.v9 = pressedChildView;
                r47 q7 = zu1Var.q7();
                boolean O4 = zu1Var.O4(q7);
                int i = zu1Var.g4;
                if ((i == 0 || i == 5 || i == 8 || (i == 3 && zu1Var.s4 == zu1Var.getUserConfig().e())) && (((arrayList = zu1Var.p4) == null || !arrayList.contains(q7)) && ((zu1Var.Z6(q7) != 1 || (r47.B0(q7.k) != zu1Var.d7 && !q7.l5())) && ((zu1Var.h != null || q7.e1() >= 0) && (((chat2 = zu1Var.e) == null || !xc2.c0(chat2) || O4) && !zu1Var.B7() && (!r47.c3(q7.k) || !q7.N3())))))) {
                    this.o3 = motionEvent.getPointerId(0);
                    zu1Var.w9 = true;
                    this.m3 = (int) motionEvent.getX();
                    this.n3 = (int) motionEvent.getY();
                    return;
                }
                zu1Var.Bc(0.0f);
                zu1Var.v9 = null;
                return;
            }
        }
        if (zu1Var.v9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.o3) {
            int max = Math.max(hl.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.n3);
            if (getScrollState() == 0 && zu1Var.w9 && !zu1Var.C9 && max <= (-hl.Z0(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                zu1Var.v9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                zu1Var.C0.R = false;
                zu1Var.w9 = false;
                zu1Var.C9 = true;
                this.m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (zu1Var.C9) {
                if (Math.abs(max) >= hl.L(50.0f)) {
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
                zu1Var.Bc(f4);
                r47 q72 = zu1Var.q7();
                if (q72 != null && (q72.g4() || r47.K4(q72.k))) {
                    zu1Var.vd(false, false);
                }
                View view = zu1Var.v9;
                if (view instanceof wb2) {
                    E1((wb2) view, f4);
                }
                invalidate();
            }
        } else if (zu1Var.v9 != null) {
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
                View view2 = zu1Var.v9;
                if (view2 instanceof wb2) {
                    f2 = ((wb2) view2).U1(false);
                } else if (view2 instanceof dl1) {
                    f2 = ((dl1) view2).getWalletSlidingOffset();
                } else {
                    f2 = 0.0f;
                }
                if (Math.abs(f2) >= hl.L(50.0f)) {
                    r47 q73 = zu1Var.q7();
                    boolean O42 = zu1Var.O4(q73);
                    rr1 rr1Var = zu1Var.d1;
                    if ((rr1Var != null && rr1Var.getVisibility() == 0 && ((!zu1Var.X0 || !O42) && !q73.X1)) || ((chat = zu1Var.e) != null && ((xc2.r0(chat) && !zu1Var.k8()) || ((xc2.T(zu1Var.e) && !xc2.w(5, zu1Var.e) && !zu1Var.e.megagroup) || !xc2.n(zu1Var.e))))) {
                        if (q73.c1() != 0 && (T6 = zu1Var.T6(q73.c1())) != null && (r47Var = T6.h) != null) {
                            q73 = r47Var;
                        }
                        zu1Var.F5 = q73;
                        Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
                        j.putBoolean("quote", true);
                        j.putBoolean("reply_to", true);
                        zu1Var.Xa(j, q73);
                        j.putInt("messagesCount", 1);
                        j.putBoolean("canSelectTopics", true);
                        uj3 uj3Var = new uj3(j);
                        uj3Var.E2 = zu1Var;
                        zu1Var.presentFragment(uj3Var);
                    } else {
                        zu1Var.dc(zu1Var.q7());
                    }
                }
            }
            View view3 = zu1Var.v9;
            if (view3 instanceof wb2) {
                f = ((wb2) view3).getSlidingOffsetX();
            } else if (view3 instanceof dl1) {
                f = ((dl1) view3).getWalletSlidingOffset();
            } else {
                f = 0.0f;
            }
            this.r3 = f;
            if (f == 0.0f) {
                zu1Var.v9 = null;
            }
            this.p3 = System.currentTimeMillis();
            this.q3 = 0.0f;
            invalidate();
            zu1Var.w9 = false;
            zu1Var.C9 = false;
            zu1Var.C0.R = true;
        }
    }

    public final void E1(wb2 wb2Var, float f) {
        m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != wb2Var && (childAt instanceof wb2)) {
                wb2 wb2Var2 = (wb2) childAt;
                if (wb2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    wb2Var2.setSlidingOffset(f);
                    wb2Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override
    public final boolean H0(View view) {
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
        zu1 zu1Var = this.G3;
        zu1Var.K8 = null;
        canvas.save();
        this.F1.setEmpty();
        if (zu1Var.ka != 0.0f) {
            int save = canvas.save();
            if (zu1Var.ra != 0.0f) {
                f = (zu1Var.A0.getMeasuredHeight() - zu1Var.ka) * zu1Var.ra;
            } else {
                f = 0.0f;
            }
            float f2 = (-zu1Var.ka) - f;
            zu1Var.Wa = f2;
            canvas.translate(0.0f, f2);
            A1(canvas, null);
            super.dispatchDraw(canvas);
            B1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            A1(canvas, null);
            super.dispatchDraw(canvas);
            B1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void l1(View view, float f, float f2, boolean z) {
        m47 currentMessagesGroup;
        super.l1(view, f, f2, z);
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            r47 messageObject = wb2Var.getMessageObject();
            if (!messageObject.I3() && !messageObject.U2() && (currentMessagesGroup = wb2Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != view && (childAt instanceof wb2)) {
                        wb2 wb2Var2 = (wb2) childAt;
                        if (wb2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            wb2Var2.setPressed(z);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq1.onDraw(android.graphics.Canvas):void");
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
        j19 j19Var;
        a aVar;
        zu1 zu1Var = this.G3;
        ot1 ot1Var = zu1Var.u9;
        ot1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hl.r(ot1Var.f0);
            ot1Var.z = false;
        }
        if (!this.W1 && ((j19Var = zu1Var.ua) == null || !j19Var.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            aVar = ((e) zu1Var).actionBar;
            if (!aVar.z() && !zu1Var.c8()) {
                D1(motionEvent);
                if (onInterceptTouchEvent || zu1Var.y9) {
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
        wq1 wq1Var;
        it1 it1Var;
        View view;
        r47 messageObject;
        int i5;
        zu1 zu1Var = this.G3;
        if (zu1Var.vb && zu1Var.ub && getMeasuredHeight() > 0 && getPaddingTop() > 0 && zu1Var.D0 != null) {
            zu1Var.vb = false;
            zu1Var.C0.G = false;
            r47 r47Var = (r47) zu1Var.G6[0].get(zu1Var.wb);
            if (r47Var != null) {
                i5 = zu1Var.M6.indexOf(r47Var);
            } else {
                i5 = -1;
            }
            if (i5 >= 0) {
                zu1Var.C0.h1(zu1Var.D0.K + i5, Math.max(hl.L(50.0f) + zu1Var.h7(r47Var), hl.L(102.0f)), false);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        if (zu1Var.wb != 0 && (wq1Var = zu1Var.A0) != null && (it1Var = zu1Var.D0) != null && !it1Var.O && !wq1Var.W1) {
            int childCount = wq1Var.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount) {
                    view = zu1Var.A0.getChildAt(i6);
                    if ((view instanceof wb2) && (messageObject = ((wb2) view).getMessageObject()) != null && messageObject.e1() == zu1Var.wb && r47.B0(messageObject.k) == zu1Var.l6) {
                        break;
                    }
                    i6++;
                } else {
                    view = null;
                    break;
                }
            }
            int i7 = zu1Var.xb;
            if (view == null) {
                if (i7 != Integer.MIN_VALUE) {
                    zu1Var.wb = 0;
                    zu1Var.xb = Integer.MIN_VALUE;
                }
            } else if (i7 == Integer.MIN_VALUE) {
                if (zu1Var.A0.getPaddingTop() > 0 && !zu1Var.vb) {
                    zu1Var.xb = view.getTop();
                }
            } else {
                int top = view.getTop() - i7;
                if (top != 0) {
                    zu1Var.A0.scrollBy(0, top);
                }
            }
        }
        int i8 = this.g3;
        int i9 = i3 - i;
        if (i8 != i9) {
            if (i8 != 0) {
                zu1Var.H7(false);
            }
            this.g3 = i9;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            yq1 yq1Var = zu1Var.B0;
            if (yq1Var != null) {
                yq1Var.g();
            }
            zu1Var.o9.e();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        zu1Var.j6 = false;
        ot1 ot1Var = zu1Var.u9;
        if (ot1Var != null && ot1Var.w()) {
            zu1Var.u9.v();
        }
        zu1Var.P7();
        zu1Var.h8();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        ad2 ad2Var;
        zu1 zu1Var = this.G3;
        fm0 fm0Var = zu1Var.qd;
        ot1 ot1Var = zu1Var.u9;
        ot1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hl.r(ot1Var.f0);
            ot1Var.z = false;
        }
        if (motionEvent.getAction() == 0) {
            zu1Var.Pa = true;
        }
        if (zu1Var.ka != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, zu1Var.ka / hl.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (ad2Var = zu1Var.ma) != null && !ad2Var.S) {
                if (ad2Var.L != 1.0f) {
                    float f = zu1Var.ka;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, hl.L(8.0f) + f);
                    zu1Var.na = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final wq1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            wq1 wq1Var = this.b;
                            switch (b) {
                                case 0:
                                    zu1 zu1Var2 = wq1Var.G3;
                                    zu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    zu1Var2.A0.invalidate();
                                    return;
                                case 1:
                                    zu1 zu1Var3 = wq1Var.G3;
                                    zu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    zu1Var3.A0.invalidate();
                                    return;
                                case 2:
                                    zu1 zu1Var4 = wq1Var.G3;
                                    zu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    zu1Var4.A0.invalidate();
                                    return;
                                default:
                                    zu1 zu1Var5 = wq1Var.G3;
                                    zu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    zu1Var5.A0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    k43 k43Var = k43.f;
                    ofFloat.setInterpolator(k43Var);
                    ofFloat.start();
                    final ad2 ad2Var2 = zu1Var.ma;
                    go1 go1Var = new go1(this, (byte) 4);
                    AnimatorSet animatorSet = ad2Var2.K;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        ad2Var2.K.cancel();
                    }
                    ad2Var2.Z = go1Var;
                    ad2Var2.K = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ad2Var2.L, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            ad2 ad2Var3 = ad2Var2;
                            ad2Var3.getClass();
                            switch (b) {
                                case 0:
                                    ad2Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ad2Var3.U.invalidate();
                                    wq1 wq1Var = ad2Var3.b0;
                                    if (wq1Var != null) {
                                        wq1Var.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ad2Var3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wq1 wq1Var2 = ad2Var3.b0;
                                    if (wq1Var2 != null) {
                                        wq1Var2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(ad2Var2.M, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            ad2 ad2Var3 = ad2Var2;
                            ad2Var3.getClass();
                            switch (b) {
                                case 0:
                                    ad2Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ad2Var3.U.invalidate();
                                    wq1 wq1Var = ad2Var3.b0;
                                    if (wq1Var != null) {
                                        wq1Var.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ad2Var3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wq1 wq1Var2 = ad2Var3.b0;
                                    if (wq1Var2 != null) {
                                        wq1Var2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ad2Var2.K.addListener(new jb1(ad2Var2, (byte) 22));
                    ad2Var2.K.playTogether(ofFloat2, ofFloat3);
                    ad2Var2.K.setDuration(120L);
                    ad2Var2.K.setInterpolator(k43Var);
                    ad2Var2.K.start();
                } else {
                    zu1Var.G4();
                }
            } else {
                ad2 ad2Var3 = zu1Var.ma;
                if (ad2Var3 != null && ad2Var3.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ad2 ad2Var4 = zu1Var.ma;
                    if (currentTimeMillis - ad2Var4.V < 500 && ad2Var4.N) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        zu1Var.na = animatorSet2;
                        if (zu1Var.ma != null) {
                            fm0Var.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(zu1Var.ka, hl.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final wq1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                wq1 wq1Var = this.b;
                                switch (b) {
                                    case 0:
                                        zu1 zu1Var2 = wq1Var.G3;
                                        zu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var2.A0.invalidate();
                                        return;
                                    case 1:
                                        zu1 zu1Var3 = wq1Var.G3;
                                        zu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var3.A0.invalidate();
                                        return;
                                    case 2:
                                        zu1 zu1Var4 = wq1Var.G3;
                                        zu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var4.A0.invalidate();
                                        return;
                                    default:
                                        zu1 zu1Var5 = wq1Var.G3;
                                        zu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(k43.f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(hl.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final wq1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                wq1 wq1Var = this.b;
                                switch (b) {
                                    case 0:
                                        zu1 zu1Var2 = wq1Var.G3;
                                        zu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var2.A0.invalidate();
                                        return;
                                    case 1:
                                        zu1 zu1Var3 = wq1Var.G3;
                                        zu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var3.A0.invalidate();
                                        return;
                                    case 2:
                                        zu1 zu1Var4 = wq1Var.G3;
                                        zu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var4.A0.invalidate();
                                        return;
                                    default:
                                        zu1 zu1Var5 = wq1Var.G3;
                                        zu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(bb2.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(zu1Var.ka, 0.0f);
                zu1Var.na = ofFloat6;
                if (zu1Var.ma != null) {
                    fm0Var.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final wq1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        wq1 wq1Var = this.b;
                        switch (b) {
                            case 0:
                                zu1 zu1Var2 = wq1Var.G3;
                                zu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var2.A0.invalidate();
                                return;
                            case 1:
                                zu1 zu1Var3 = wq1Var.G3;
                                zu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var3.A0.invalidate();
                                return;
                            case 2:
                                zu1 zu1Var4 = wq1Var.G3;
                                zu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var4.A0.invalidate();
                                return;
                            default:
                                zu1 zu1Var5 = wq1Var.G3;
                                zu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var5.A0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(bb2.V);
                ofFloat6.start();
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            aVar = ((e) zu1Var).actionBar;
            if (!aVar.z() && !zu1Var.c8()) {
                D1(motionEvent);
                if (zu1Var.C9 || zu1Var.y9 || onTouchEvent) {
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
        nm9 f4;
        v0d v0dVar;
        super.requestDisallowInterceptTouchEvent(z);
        View view = this.G3.v9;
        if (view != null) {
            if ((view instanceof wb2) && (f4 = ((wb2) view).f4()) != null && (v0dVar = f4.e0) != null && f4.f0 && v0dVar.w && !v0dVar.E) {
                if (v0dVar.x) {
                    if (!v0dVar.y && (v0dVar.L & 3) != 1) {
                        return;
                    }
                } else {
                    return;
                }
            }
            D1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.E3) {
            return;
        }
        iv1 iv1Var = this.G3.Fc;
        if (iv1Var.b != 0) {
            int childCount = iv1Var.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                iv1Var.a.getChildAt(i).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(o79 o79Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(o79Var);
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            zu1 zu1Var = this.G3;
            zu1Var.O7();
            zu1Var.Q7();
        }
    }
}
