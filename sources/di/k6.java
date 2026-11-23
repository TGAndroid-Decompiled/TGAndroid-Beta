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
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class k6 extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final i6 I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final bn f9197a;
    public org.telegram.ui.Cells.z f9198b;
    public int f9199c;
    public final int[] d;
    public final int[] f9200e;
    public final RectF f9201f;
    public final RectF h;
    public final Paint f9202n;
    public boolean f9203r;
    public final org.telegram.ui.Components.d6 f9204s;
    public final org.telegram.ui.Components.n6 f9205w;
    public boolean f9206x;
    public final f2 f9207y;

    public k6(bn bnVar) {
        super(bnVar.getParentActivity());
        this.d = new int[2];
        this.f9200e = new int[2];
        this.f9201f = new RectF();
        this.h = new RectF();
        this.f9202n = new Paint();
        new Paint();
        this.f9204s = new org.telegram.ui.Components.d6(this, 0L, 420L, nr.h);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false);
        this.f9205w = n6Var;
        new Matrix();
        this.K = new ArrayList();
        this.L = new int[]{2131624220, 2131624221, 2131624222, 2131624223, 2131624224};
        this.f9197a = bnVar;
        n6Var.setCallback(this);
        n6Var.r(false, true);
        n6Var.w(org.telegram.messenger.g0.L(40.0f));
        n6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        n6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        n6Var.N = org.telegram.messenger.g0.f24046q.x;
        n6Var.u(-1);
        n6Var.f37795b = 17;
        this.I = new i6(this, 0);
        this.f9207y = new f2(11, this, bnVar);
    }

    private gj getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.f9198b;
        if (zVar instanceof org.telegram.ui.Cells.r1) {
            return ((org.telegram.ui.Cells.r1) zVar).getPrimaryMessageObject();
        }
        if (zVar instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) zVar).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            gj messageObject = getMessageObject();
            bn bnVar = this.f9197a;
            y8 y10 = y8.y(bnVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (y10.f10088e && y10.q(null, false, false).amount < E) {
                w8 w8Var = y8.y(bnVar.getCurrentAccount(), false).B;
                if (w8Var != null) {
                    w8Var.a();
                }
                long a10 = bnVar.a();
                if (a10 >= 0) {
                    str = p10.l(bnVar.getMessagesController().c2(Long.valueOf(a10)));
                } else {
                    TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-a10));
                    if (O0 == null) {
                        str = "";
                    } else {
                        str = O0.title;
                    }
                }
                new fb(bnVar.getParentActivity(), bnVar.getResourceProvider(), E, 5, str, new j2(this, y10, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f10, i6 i6Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 9));
        this.F.addListener(new j6(this, f10, i6Var, 0));
        this.F.setInterpolator(nr.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        org.telegram.messenger.g0.r(this.I);
        this.f9205w.t("", true, true);
        this.f9203r = false;
        invalidate();
        b(0.0f, new i6(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.f9198b != null && !this.J) {
            gj messageObject = getMessageObject();
            ch.q0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                bn bnVar = this.f9197a;
                y8 y10 = y8.y(bnVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.K;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((oh0) arrayList.remove(0)).C(true);
                }
                g5.a aVar = Utilities.f22809c;
                int[] iArr = this.L;
                oh0 oh0Var = new oh0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
                oh0Var.R(this);
                oh0Var.J(true);
                oh0Var.K(0);
                oh0Var.start();
                arrayList.add(oh0Var);
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
                    y8.y(bnVar.getCurrentAccount(), false).b0(messageObject, this.f9197a, 1L, true, false, null);
                }
                org.telegram.ui.Components.n6 n6Var = this.f9205w;
                n6Var.a();
                n6Var.t("+" + y10.E(messageObject), true, true);
                this.f9203r = true;
                i6 i6Var = this.I;
                org.telegram.messenger.g0.r(i6Var);
                org.telegram.messenger.g0.h3(i6Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.G;
                if (j3 < 100) {
                    this.H += 0.5f;
                    return;
                }
                this.H = Utilities.i(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.H;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f9200e;
                if (measuredWidth == 0 && bnVar.getLayoutContainer() != null) {
                    bnVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: di.k6.dispatchDraw(android.graphics.Canvas):void");
    }

    public ch.q0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.f9198b;
        if (zVar instanceof org.telegram.ui.Cells.r1) {
            return ((org.telegram.ui.Cells.r1) zVar).O;
        }
        if (zVar instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) zVar).F0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ch.q0 reactionsLayoutInBubble;
        if (this.f9198b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        f2 f2Var = this.f9207y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f9206x = true;
                ch.n0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.X.c(true);
                }
                org.telegram.messenger.g0.r(f2Var);
                org.telegram.messenger.g0.h3(f2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ch.n0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.X.c(false);
            }
            this.f9206x = false;
            org.telegram.messenger.g0.r(f2Var);
        }
        return this.f9206x;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        int e12;
        org.telegram.ui.Cells.z zVar2 = this.f9198b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.r1) this.f9198b).setInvalidateListener(null);
            this.f9198b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.f9198b).setInvalidateListener(null);
            this.f9198b.invalidate();
        }
        this.f9198b = zVar;
        if (getMessageObject() == null) {
            e12 = 0;
        } else {
            e12 = getMessageObject().e1();
        }
        this.f9199c = e12;
        org.telegram.ui.Cells.z zVar3 = this.f9198b;
        if (zVar3 instanceof org.telegram.ui.Cells.r1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.r1) this.f9198b).setInvalidateListener(new i6(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.v0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.v0) this.f9198b).setInvalidateListener(new i6(this, 1));
        }
        invalidate();
    }
}
