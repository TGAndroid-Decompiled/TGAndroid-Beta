package bi;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class p7 extends View {
    public float D;
    public ValueAnimator E;
    public long F;
    public float G;
    public final n7 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final an f4518a;
    public org.telegram.ui.Cells.z f4519b;
    public int f4520c;
    public final int[] d;
    public final int[] f4521e;
    public final RectF f4522f;
    public final RectF h;
    public final Paint f4523n;
    public boolean f4524r;
    public final org.telegram.ui.Components.w5 f4525s;
    public final org.telegram.ui.Components.i6 f4526w;
    public boolean f4527x;
    public final a4 f4528y;

    public p7(an anVar) {
        super(anVar.getParentActivity());
        this.d = new int[2];
        this.f4521e = new int[2];
        this.f4522f = new RectF();
        this.h = new RectF();
        this.f4523n = new Paint();
        new Paint();
        this.f4525s = new org.telegram.ui.Components.w5(this, 0L, 420L, xq.h);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false);
        this.f4526w = i6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{2131624219, 2131624220, 2131624221, 2131624222, 2131624223};
        this.f4518a = anVar;
        i6Var.setCallback(this);
        i6Var.r(false, true);
        i6Var.w(org.telegram.messenger.g0.L(40.0f));
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        i6Var.M = org.telegram.messenger.g0.f22537q.x;
        i6Var.u(-1);
        i6Var.f34477b = 17;
        this.H = new n7(this, 0);
        this.f4528y = new a4(5, this, anVar);
    }

    private ij getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.f4519b;
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
            ij messageObject = getMessageObject();
            an anVar = this.f4518a;
            ea y10 = ea.y(anVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (y10.f3810e && y10.q(null, false, false).amount < E) {
                ca caVar = ea.y(anVar.getCurrentAccount(), false).B;
                if (caVar != null) {
                    caVar.a();
                }
                long a10 = anVar.a();
                if (a10 >= 0) {
                    str = t10.k(anVar.getMessagesController().a2(Long.valueOf(a10)));
                } else {
                    TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-a10));
                    if (M0 == null) {
                        str = "";
                    } else {
                        str = M0.title;
                    }
                }
                new tc(anVar.getParentActivity(), anVar.getResourceProvider(), E, 5, str, new w2(this, y10, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f10, n7 n7Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 7));
        this.E.addListener(new o7(this, f10, n7Var, 0));
        this.E.setInterpolator(xq.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        org.telegram.messenger.g0.r(this.H);
        this.f4526w.t("", true, true);
        this.f4524r = false;
        invalidate();
        b(0.0f, new n7(this, 2));
    }

    public final void d(float f10, float f11, boolean z9) {
        ArrayList arrayList;
        if (this.f4519b != null && !this.I) {
            ij messageObject = getMessageObject();
            ch.p0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                an anVar = this.f4518a;
                ea y10 = ea.y(anVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((zg0) arrayList.remove(0)).C(true);
                }
                g5.a aVar = Utilities.f21332c;
                int[] iArr = this.K;
                zg0 zg0Var = new zg0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
                zg0Var.R(this);
                zg0Var.J(true);
                zg0Var.K(0);
                zg0Var.start();
                arrayList.add(zg0Var);
                invalidate();
                ch.m0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.p();
                }
                if (z9) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    ea.y(anVar.getCurrentAccount(), false).b0(messageObject, this.f4518a, 1L, true, false, null);
                }
                org.telegram.ui.Components.i6 i6Var = this.f4526w;
                i6Var.a();
                i6Var.t("+" + y10.E(messageObject), true, true);
                this.f4524r = true;
                n7 n7Var = this.H;
                org.telegram.messenger.g0.r(n7Var);
                org.telegram.messenger.g0.i3(n7Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.F;
                if (j3 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.i(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f4521e;
                if (measuredWidth == 0 && anVar.getLayoutContainer() != null) {
                    anVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.i(this.G, 0.9f, 0.3f));
                this.G = 0.0f;
                this.F = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.p7.dispatchDraw(android.graphics.Canvas):void");
    }

    public ch.p0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.f4519b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).N;
        }
        if (zVar instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) zVar).E0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ch.p0 reactionsLayoutInBubble;
        if (this.f4519b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        a4 a4Var = this.f4528y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f4527x = true;
                ch.m0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.X.c(true);
                }
                org.telegram.messenger.g0.r(a4Var);
                org.telegram.messenger.g0.i3(a4Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ch.m0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.X.c(false);
            }
            this.f4527x = false;
            org.telegram.messenger.g0.r(a4Var);
        }
        return this.f4527x;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        int f12;
        org.telegram.ui.Cells.z zVar2 = this.f4519b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.q1) this.f4519b).setInvalidateListener(null);
            this.f4519b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t0) this.f4519b).setInvalidateListener(null);
            this.f4519b.invalidate();
        }
        this.f4519b = zVar;
        if (getMessageObject() == null) {
            f12 = 0;
        } else {
            f12 = getMessageObject().f1();
        }
        this.f4520c = f12;
        org.telegram.ui.Cells.z zVar3 = this.f4519b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.q1) this.f4519b).setInvalidateListener(new n7(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.t0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.t0) this.f4519b).setInvalidateListener(new n7(this, 1));
        }
        invalidate();
    }
}
