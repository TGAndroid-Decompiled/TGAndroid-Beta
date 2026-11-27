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
public final class lva extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final kva I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final zu1 a;
    public jf0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final mm s;
    public final hn w;
    public boolean x;
    public final ida y;

    public lva(zu1 zu1Var) {
        super(zu1Var.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        this.s = new mm(this, 0L, 420L, k43.h);
        hn hnVar = new hn(false, false, false);
        this.w = hnVar;
        this.K = new ArrayList();
        this.L = new int[]{2131624214, 2131624215, 2131624216, 2131624217, 2131624218};
        this.a = zu1Var;
        hnVar.setCallback(this);
        hnVar.r(false, true);
        hnVar.w(hl.L(40.0f));
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.s(hl.L(12.0f), hl.L(3.5f), 0);
        hnVar.N = hl.q.x;
        hnVar.u(-1);
        hnVar.b = 17;
        this.I = new kva(this, (byte) 0);
        this.y = new ida(this, zu1Var, (byte) 21);
    }

    private r47 getMessageObject() {
        jf0 jf0Var = this.b;
        if (jf0Var instanceof wb2) {
            return ((wb2) jf0Var).getPrimaryMessageObject();
        }
        if (jf0Var instanceof dl1) {
            return ((dl1) jf0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            r47 messageObject = getMessageObject();
            zu1 zu1Var = this.a;
            jxa v = jxa.v(zu1Var.getCurrentAccount(), false);
            long B = v.B(messageObject);
            if (v.e && v.n(null, false, false).amount < B) {
                hxa hxaVar = jxa.v(zu1Var.getCurrentAccount(), false).B;
                if (hxaVar != null) {
                    hxaVar.a();
                }
                long a = zu1Var.a();
                if (a >= 0) {
                    str = lbc.l(zu1Var.getMessagesController().X1(Long.valueOf(a)));
                } else {
                    TLRPC.Chat M0 = zu1Var.getMessagesController().M0(Long.valueOf(-a));
                    if (M0 == null) {
                        str = "";
                    } else {
                        str = M0.title;
                    }
                }
                new dza(zu1Var.getParentActivity(), zu1Var.getResourceProvider(), B, 5, str, new y09(this, v, messageObject, B, (byte) 6), 0L).show();
            }
        }
    }

    public final void b(float f, kva kvaVar) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ija(this, (byte) 7));
        this.F.addListener(new ok4(this, f, kvaVar, (byte) 4));
        this.F.setInterpolator(k43.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        hl.r(this.I);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new kva(this, (byte) 2));
    }

    public final void d(float f, float f2, boolean z) {
        ArrayList arrayList;
        if (this.b != null && !this.J) {
            r47 messageObject = getMessageObject();
            x49 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                zu1 zu1Var = this.a;
                jxa v = jxa.v(zu1Var.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.K;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((b29) arrayList.remove(0)).x(true);
                }
                o3d o3dVar = Utilities.c;
                int[] iArr = this.L;
                b29 b29Var = new b29(iArr[o3dVar.nextInt(iArr.length)], hl.L(70.0f), hl.L(70.0f));
                b29Var.M(this);
                b29Var.E(true);
                b29Var.F(0);
                b29Var.start();
                arrayList.add(b29Var);
                invalidate();
                u49 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.p();
                }
                if (z) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    jxa.v(zu1Var.getCurrentAccount(), false).c0(messageObject, this.a, 1L, true, false, null);
                }
                hn hnVar = this.w;
                hnVar.a();
                hnVar.t("+" + v.B(messageObject), true, true);
                this.r = true;
                kva kvaVar = this.I;
                hl.r(kvaVar);
                hl.d3(kvaVar, 1500L);
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
                if (measuredWidth == 0 && zu1Var.getLayoutContainer() != null) {
                    zu1Var.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lva.dispatchDraw(android.graphics.Canvas):void");
    }

    public x49 getReactionsLayoutInBubble() {
        jf0 jf0Var = this.b;
        if (jf0Var instanceof wb2) {
            return ((wb2) jf0Var).O;
        }
        if (jf0Var instanceof dl1) {
            return ((dl1) jf0Var).F0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x49 reactionsLayoutInBubble;
        if (this.b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        ida idaVar = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                u49 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.X.c(true);
                }
                hl.r(idaVar);
                hl.d3(idaVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            u49 l2 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l2 != null) {
                l2.X.c(false);
            }
            this.x = false;
            hl.r(idaVar);
        }
        return this.x;
    }

    public void setMessageCell(jf0 jf0Var) {
        int e1;
        jf0 jf0Var2 = this.b;
        if (jf0Var2 == jf0Var) {
            return;
        }
        if (jf0Var2 instanceof wb2) {
            ((wb2) jf0Var2).setScrimReaction(null);
            ((wb2) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (jf0Var2 instanceof dl1) {
            ((dl1) jf0Var2).setScrimReaction(null);
            ((dl1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = jf0Var;
        if (getMessageObject() == null) {
            e1 = 0;
        } else {
            e1 = getMessageObject().e1();
        }
        this.c = e1;
        jf0 jf0Var3 = this.b;
        if (jf0Var3 instanceof wb2) {
            jf0Var3.invalidate();
            ((wb2) this.b).setInvalidateListener(new kva(this, (byte) 1));
        } else if (jf0Var3 instanceof dl1) {
            jf0Var3.invalidate();
            ((dl1) this.b).setInvalidateListener(new kva(this, (byte) 1));
        }
        invalidate();
    }
}
