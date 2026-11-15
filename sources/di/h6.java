package di;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class h6 extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final f6 I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final an f8689a;
    public org.telegram.ui.Cells.z f8690b;
    public int f8691c;
    public final int[] d;
    public final int[] f8692e;
    public final RectF f8693f;
    public final RectF h;
    public final Paint f8694n;
    public boolean f8695r;
    public final org.telegram.ui.Components.u5 f8696s;
    public final org.telegram.ui.Components.g6 f8697w;
    public boolean f8698x;
    public final s2 f8699y;

    public h6(an anVar) {
        super(anVar.getParentActivity());
        this.d = new int[2];
        this.f8692e = new int[2];
        this.f8693f = new RectF();
        this.h = new RectF();
        this.f8694n = new Paint();
        new Paint();
        this.f8696s = new org.telegram.ui.Components.u5(this, 0L, 420L, er.h);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.f8697w = g6Var;
        new Matrix();
        this.K = new ArrayList();
        this.L = new int[]{2131624220, 2131624221, 2131624222, 2131624223, 2131624224};
        this.f8689a = anVar;
        g6Var.setCallback(this);
        g6Var.r(false, true);
        g6Var.w(org.telegram.messenger.g0.L(40.0f));
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        g6Var.N = org.telegram.messenger.g0.f23609q.x;
        g6Var.u(-1);
        g6Var.f34829b = 17;
        this.I = new f6(this, 0);
        this.f8699y = new s2(7, this, anVar);
    }

    private gj getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.f8690b;
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
            gj messageObject = getMessageObject();
            an anVar = this.f8689a;
            v8 y10 = v8.y(anVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (y10.f9601e && y10.q(null, false, false).amount < E) {
                t8 t8Var = v8.y(anVar.getCurrentAccount(), false).B;
                if (t8Var != null) {
                    t8Var.a();
                }
                long a10 = anVar.a();
                if (a10 >= 0) {
                    str = q10.k(anVar.getMessagesController().a2(Long.valueOf(a10)));
                } else {
                    TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-a10));
                    if (M0 == null) {
                        str = "";
                    } else {
                        str = M0.title;
                    }
                }
                new cb(anVar.getParentActivity(), anVar.getResourceProvider(), E, 5, str, new f2(this, y10, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f10, f6 f6Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 9));
        this.F.addListener(new g6(this, f10, f6Var, 0));
        this.F.setInterpolator(er.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        org.telegram.messenger.g0.r(this.I);
        this.f8697w.t("", true, true);
        this.f8695r = false;
        invalidate();
        b(0.0f, new f6(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.f8690b != null && !this.J) {
            gj messageObject = getMessageObject();
            ch.q0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                an anVar = this.f8689a;
                v8 y10 = v8.y(anVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.K;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((ch0) arrayList.remove(0)).C(true);
                }
                g5.a aVar = Utilities.f22415c;
                int[] iArr = this.L;
                ch0 ch0Var = new ch0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
                ch0Var.R(this);
                ch0Var.J(true);
                ch0Var.K(0);
                ch0Var.start();
                arrayList.add(ch0Var);
                invalidate();
                ch.n0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.p();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    v8.y(anVar.getCurrentAccount(), false).b0(messageObject, this.f8689a, 1L, true, false, null);
                }
                org.telegram.ui.Components.g6 g6Var = this.f8697w;
                g6Var.a();
                g6Var.t("+" + y10.E(messageObject), true, true);
                this.f8695r = true;
                f6 f6Var = this.I;
                org.telegram.messenger.g0.r(f6Var);
                org.telegram.messenger.g0.i3(f6Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.G;
                if (j3 < 100) {
                    this.H += 0.5f;
                    return;
                }
                this.H = Utilities.i(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.H;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f8692e;
                if (measuredWidth == 0 && anVar.getLayoutContainer() != null) {
                    anVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: di.h6.dispatchDraw(android.graphics.Canvas):void");
    }

    public ch.q0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.f8690b;
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
        ch.q0 reactionsLayoutInBubble;
        if (this.f8690b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        s2 s2Var = this.f8699y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f8698x = true;
                ch.n0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.X.c(true);
                }
                org.telegram.messenger.g0.r(s2Var);
                org.telegram.messenger.g0.i3(s2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ch.n0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.X.c(false);
            }
            this.f8698x = false;
            org.telegram.messenger.g0.r(s2Var);
        }
        return this.f8698x;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        int e12;
        org.telegram.ui.Cells.z zVar2 = this.f8690b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.q1) this.f8690b).setInvalidateListener(null);
            this.f8690b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t0) this.f8690b).setInvalidateListener(null);
            this.f8690b.invalidate();
        }
        this.f8690b = zVar;
        if (getMessageObject() == null) {
            e12 = 0;
        } else {
            e12 = getMessageObject().e1();
        }
        this.f8691c = e12;
        org.telegram.ui.Cells.z zVar3 = this.f8690b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.q1) this.f8690b).setInvalidateListener(new f6(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.t0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.t0) this.f8690b).setInvalidateListener(new f6(this, 1));
        }
        invalidate();
    }
}
