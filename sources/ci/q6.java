package ci;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class q6 extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final o6 I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final wm f5832a;
    public org.telegram.ui.Cells.z f5833b;
    public int f5834c;
    public final int[] d;
    public final int[] f5835e;
    public final RectF f5836f;
    public final RectF h;
    public final Paint f5837n;
    public boolean f5838r;
    public final org.telegram.ui.Components.u5 f5839s;
    public final org.telegram.ui.Components.g6 f5840w;
    public boolean f5841x;
    public final e0 f5842y;

    public q6(wm wmVar) {
        super(wmVar.getParentActivity());
        this.d = new int[2];
        this.f5835e = new int[2];
        this.f5836f = new RectF();
        this.h = new RectF();
        this.f5837n = new Paint();
        new Paint();
        this.f5839s = new org.telegram.ui.Components.u5(this, 0L, 420L, xq.h);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.f5840w = g6Var;
        new Matrix();
        this.K = new ArrayList();
        this.L = new int[]{2131624219, 2131624220, 2131624221, 2131624222, 2131624223};
        this.f5832a = wmVar;
        g6Var.setCallback(this);
        g6Var.r(false, true);
        g6Var.w(org.telegram.messenger.g0.L(40.0f));
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
        g6Var.u(-1);
        g6Var.f33983b = 17;
        this.I = new o6(this, 0);
        this.f5842y = new e0(12, this, wmVar);
    }

    private zi getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.f5833b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        }
        if (zVar instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) zVar).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            zi messageObject = getMessageObject();
            wm wmVar = this.f5832a;
            e9 y9 = e9.y(wmVar.getCurrentAccount(), false);
            long E = y9.E(messageObject);
            if (y9.f5032e && y9.q(null, false, false).amount < E) {
                c9 c9Var = e9.y(wmVar.getCurrentAccount(), false).B;
                if (c9Var != null) {
                    c9Var.a();
                }
                long a10 = wmVar.a();
                if (a10 >= 0) {
                    str = l10.k(wmVar.getMessagesController().a2(Long.valueOf(a10)));
                } else {
                    TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(-a10));
                    if (M0 == null) {
                        str = "";
                    } else {
                        str = M0.title;
                    }
                }
                new mb(wmVar.getParentActivity(), wmVar.getResourceProvider(), E, 5, str, new l2(this, y9, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f10, o6 o6Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 7));
        this.F.addListener(new p6(this, f10, o6Var, 0));
        this.F.setInterpolator(xq.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        org.telegram.messenger.g0.r(this.I);
        this.f5840w.t("", true, true);
        this.f5838r = false;
        invalidate();
        b(0.0f, new o6(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.f5833b != null && !this.J) {
            zi messageObject = getMessageObject();
            dh.o0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                wm wmVar = this.f5832a;
                e9 y9 = e9.y(wmVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.K;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((ch0) arrayList.remove(0)).C(true);
                }
                f5.a aVar = Utilities.f21386c;
                int[] iArr = this.L;
                ch0 ch0Var = new ch0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
                ch0Var.R(this);
                ch0Var.J(true);
                ch0Var.K(0);
                ch0Var.start();
                arrayList.add(ch0Var);
                invalidate();
                dh.l0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.p();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    e9.y(wmVar.getCurrentAccount(), false).b0(messageObject, this.f5832a, 1L, true, false, null);
                }
                org.telegram.ui.Components.g6 g6Var = this.f5840w;
                g6Var.a();
                g6Var.t("+" + y9.E(messageObject), true, true);
                this.f5838r = true;
                o6 o6Var = this.I;
                org.telegram.messenger.g0.r(o6Var);
                org.telegram.messenger.g0.i3(o6Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.G;
                if (j10 < 100) {
                    this.H += 0.5f;
                    return;
                }
                this.H = Utilities.i(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * this.H;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f5835e;
                if (measuredWidth == 0 && wmVar.getLayoutContainer() != null) {
                    wmVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.i(this.H, 0.9f, 0.3f));
                this.H = 0.0f;
                this.G = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q6.dispatchDraw(android.graphics.Canvas):void");
    }

    public dh.o0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.f5833b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).O;
        }
        if (zVar instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) zVar).F0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dh.o0 reactionsLayoutInBubble;
        if (this.f5833b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        e0 e0Var = this.f5842y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f5841x = true;
                dh.l0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.X.c(true);
                }
                org.telegram.messenger.g0.r(e0Var);
                org.telegram.messenger.g0.i3(e0Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            dh.l0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.X.c(false);
            }
            this.f5841x = false;
            org.telegram.messenger.g0.r(e0Var);
        }
        return this.f5841x;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        int f12;
        org.telegram.ui.Cells.z zVar2 = this.f5833b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.q1) this.f5833b).setInvalidateListener(null);
            this.f5833b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t0) this.f5833b).setInvalidateListener(null);
            this.f5833b.invalidate();
        }
        this.f5833b = zVar;
        if (getMessageObject() == null) {
            f12 = 0;
        } else {
            f12 = getMessageObject().f1();
        }
        this.f5834c = f12;
        org.telegram.ui.Cells.z zVar3 = this.f5833b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.q1) this.f5833b).setInvalidateListener(new o6(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.t0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.t0) this.f5833b).setInvalidateListener(new o6(this, 1));
        }
        invalidate();
    }
}
