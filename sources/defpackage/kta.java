package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class kta extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final jta I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final yv1 a;
    public hg0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final ln s;
    public final ho w;
    public boolean x;
    public final e6a y;

    public kta(yv1 yv1Var) {
        super(yv1Var.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        this.s = new ln(this, 0L, 420L, d53.h);
        ho hoVar = new ho(false, false, false);
        this.w = hoVar;
        this.K = new ArrayList();
        this.L = new int[]{2131624214, 2131624215, 2131624216, 2131624217, 2131624218};
        this.a = yv1Var;
        hoVar.setCallback(this);
        hoVar.r(false, true);
        hoVar.w(gm.L(40.0f));
        hoVar.x(gm.n1("fonts/num.otf"));
        hoVar.s(gm.L(12.0f), gm.L(3.5f), 0);
        hoVar.N = gm.q.x;
        hoVar.u(-1);
        hoVar.b = 17;
        this.I = new jta(this, (byte) 0);
        this.y = new e6a(this, yv1Var, (byte) 26);
    }

    private k47 getMessageObject() {
        hg0 hg0Var = this.b;
        if (hg0Var instanceof rc2) {
            return ((rc2) hg0Var).getPrimaryMessageObject();
        }
        if (hg0Var instanceof cm1) {
            return ((cm1) hg0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            k47 messageObject = getMessageObject();
            yv1 yv1Var = this.a;
            jva v = jva.v(yv1Var.getCurrentAccount(), false);
            long B = v.B(messageObject);
            if (v.e && v.n(null, false, false).amount < B) {
                hva hvaVar = jva.v(yv1Var.getCurrentAccount(), false).B;
                if (hvaVar != null) {
                    hvaVar.a();
                }
                long a = yv1Var.a();
                if (a >= 0) {
                    str = m9c.l(yv1Var.getMessagesController().W1(Long.valueOf(a)));
                } else {
                    TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-a));
                    if (L0 == null) {
                        str = "";
                    } else {
                        str = L0.title;
                    }
                }
                new dxa(yv1Var.getParentActivity(), yv1Var.getResourceProvider(), B, 5, str, new nz8(this, v, messageObject, B, (byte) 6), 0L).show();
            }
        }
    }

    public final void b(float f, jta jtaVar) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new rha(this, (byte) 7));
        this.F.addListener(new ok4(this, f, jtaVar, (byte) 4));
        this.F.setInterpolator(d53.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        gm.r(this.I);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new jta(this, (byte) 2));
    }

    public final void d(float f, float f2, boolean z) {
        ArrayList arrayList;
        if (this.b != null && !this.J) {
            k47 messageObject = getMessageObject();
            l39 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                yv1 yv1Var = this.a;
                jva v = jva.v(yv1Var.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.K;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((p09) arrayList.remove(0)).x(true);
                }
                z0d z0dVar = Utilities.c;
                int[] iArr = this.L;
                p09 p09Var = new p09(iArr[z0dVar.nextInt(iArr.length)], gm.L(70.0f), gm.L(70.0f));
                p09Var.M(this);
                p09Var.E(true);
                p09Var.F(0);
                p09Var.start();
                arrayList.add(p09Var);
                invalidate();
                i39 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.p();
                }
                if (z) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    jva.v(yv1Var.getCurrentAccount(), false).b0(messageObject, this.a, 1L, true, false, null);
                }
                ho hoVar = this.w;
                hoVar.a();
                hoVar.t("+" + v.B(messageObject), true, true);
                this.r = true;
                jta jtaVar = this.I;
                gm.r(jtaVar);
                gm.d3(jtaVar, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.G;
                int i = (j > 100L ? 1 : (j == 100L ? 0 : -1));
                float f3 = this.H;
                if (i < 0) {
                    this.H = f3 + 0.5f;
                    return;
                }
                this.H = Utilities.i(1.0f - (((float) (j - 100)) / 200.0f), 1.0f, 0.0f) * f3;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && yv1Var.getLayoutContainer() != null) {
                    yv1Var.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.a0(iArr2[0] + f, iArr2[1] + f2, Utilities.i(this.H, 0.9f, 0.3f));
                this.H = 0.0f;
                this.G = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kta.dispatchDraw(android.graphics.Canvas):void");
    }

    public l39 getReactionsLayoutInBubble() {
        hg0 hg0Var = this.b;
        if (hg0Var instanceof rc2) {
            return ((rc2) hg0Var).O;
        }
        if (hg0Var instanceof cm1) {
            return ((cm1) hg0Var).F0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l39 reactionsLayoutInBubble;
        if (this.b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        e6a e6aVar = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                i39 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.X.c(true);
                }
                gm.r(e6aVar);
                gm.d3(e6aVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i39 l2 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l2 != null) {
                l2.X.c(false);
            }
            this.x = false;
            gm.r(e6aVar);
        }
        return this.x;
    }

    public void setMessageCell(hg0 hg0Var) {
        int e1;
        hg0 hg0Var2 = this.b;
        if (hg0Var2 == hg0Var) {
            return;
        }
        if (hg0Var2 instanceof rc2) {
            ((rc2) hg0Var2).setScrimReaction(null);
            ((rc2) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (hg0Var2 instanceof cm1) {
            ((cm1) hg0Var2).setScrimReaction(null);
            ((cm1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = hg0Var;
        if (getMessageObject() == null) {
            e1 = 0;
        } else {
            e1 = getMessageObject().e1();
        }
        this.c = e1;
        hg0 hg0Var3 = this.b;
        if (hg0Var3 instanceof rc2) {
            hg0Var3.invalidate();
            ((rc2) this.b).setInvalidateListener(new jta(this, (byte) 1));
        } else if (hg0Var3 instanceof cm1) {
            hg0Var3.invalidate();
            ((cm1) this.b).setInvalidateListener(new jta(this, (byte) 1));
        }
        invalidate();
    }
}
