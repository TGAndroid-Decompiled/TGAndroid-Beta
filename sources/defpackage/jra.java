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
public final class jra extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final ira I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final mu1 a;
    public hf0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final lm s;
    public final gn w;
    public boolean x;
    public final t7a y;

    public jra(mu1 mu1Var) {
        super(mu1Var.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        this.s = new lm(this, 0L, 420L, s33.h);
        gn gnVar = new gn(false, false, false);
        this.w = gnVar;
        this.K = new ArrayList();
        this.L = new int[]{2131624215, 2131624216, 2131624217, 2131624218, 2131624219};
        this.a = mu1Var;
        gnVar.setCallback(this);
        gnVar.r(false, true);
        gnVar.w(gl.L(40.0f));
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.s(gl.L(12.0f), gl.L(3.5f), 0);
        gnVar.N = gl.q.x;
        gnVar.u(-1);
        gnVar.b = 17;
        this.I = new ira(this, (byte) 0);
        this.y = new t7a(this, mu1Var, (byte) 24);
    }

    private k27 getMessageObject() {
        hf0 hf0Var = this.b;
        if (hf0Var instanceof gb2) {
            return ((gb2) hf0Var).getPrimaryMessageObject();
        }
        if (hf0Var instanceof uk1) {
            return ((uk1) hf0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            k27 messageObject = getMessageObject();
            mu1 mu1Var = this.a;
            gta v = gta.v(mu1Var.getCurrentAccount(), false);
            long B = v.B(messageObject);
            if (v.e && v.n(null, false, false).amount < B) {
                eta etaVar = gta.v(mu1Var.getCurrentAccount(), false).B;
                if (etaVar != null) {
                    etaVar.a();
                }
                long a = mu1Var.a();
                if (a >= 0) {
                    str = l7c.l(mu1Var.getMessagesController().V1(Long.valueOf(a)));
                } else {
                    TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(-a));
                    if (K0 == null) {
                        str = "";
                    } else {
                        str = K0.title;
                    }
                }
                new zua(mu1Var.getParentActivity(), mu1Var.getResourceProvider(), B, 5, str, new mx8(this, v, messageObject, B, (byte) 6), 0L).show();
            }
        }
    }

    public final void b(float f, ira iraVar) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new gja(this, (byte) 5));
        this.F.addListener(new ji4(this, f, iraVar, (byte) 4));
        this.F.setInterpolator(s33.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        gl.r(this.I);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new ira(this, (byte) 2));
    }

    public final void d(float f, float f2, boolean z) {
        ArrayList arrayList;
        if (this.b != null && !this.J) {
            k27 messageObject = getMessageObject();
            i19 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                mu1 mu1Var = this.a;
                gta v = gta.v(mu1Var.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.K;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((oy8) arrayList.remove(0)).x(true);
                }
                yyc yycVar = Utilities.c;
                int[] iArr = this.L;
                oy8 oy8Var = new oy8(iArr[yycVar.nextInt(iArr.length)], gl.L(70.0f), gl.L(70.0f));
                oy8Var.M(this);
                oy8Var.E(true);
                oy8Var.F(0);
                oy8Var.start();
                arrayList.add(oy8Var);
                invalidate();
                f19 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.p();
                }
                if (z) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    gta.v(mu1Var.getCurrentAccount(), false).b0(messageObject, this.a, 1L, true, false, null);
                }
                gn gnVar = this.w;
                gnVar.a();
                gnVar.t("+" + v.B(messageObject), true, true);
                this.r = true;
                ira iraVar = this.I;
                gl.r(iraVar);
                gl.e3(iraVar, 1500L);
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
                if (measuredWidth == 0 && mu1Var.getLayoutContainer() != null) {
                    mu1Var.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jra.dispatchDraw(android.graphics.Canvas):void");
    }

    public i19 getReactionsLayoutInBubble() {
        hf0 hf0Var = this.b;
        if (hf0Var instanceof gb2) {
            return ((gb2) hf0Var).O;
        }
        if (hf0Var instanceof uk1) {
            return ((uk1) hf0Var).F0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i19 reactionsLayoutInBubble;
        if (this.b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        t7a t7aVar = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                f19 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.X.c(true);
                }
                gl.r(t7aVar);
                gl.e3(t7aVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            f19 l2 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l2 != null) {
                l2.X.c(false);
            }
            this.x = false;
            gl.r(t7aVar);
        }
        return this.x;
    }

    public void setMessageCell(hf0 hf0Var) {
        int e1;
        hf0 hf0Var2 = this.b;
        if (hf0Var2 == hf0Var) {
            return;
        }
        if (hf0Var2 instanceof gb2) {
            ((gb2) hf0Var2).setScrimReaction(null);
            ((gb2) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (hf0Var2 instanceof uk1) {
            ((uk1) hf0Var2).setScrimReaction(null);
            ((uk1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = hf0Var;
        if (getMessageObject() == null) {
            e1 = 0;
        } else {
            e1 = getMessageObject().e1();
        }
        this.c = e1;
        hf0 hf0Var3 = this.b;
        if (hf0Var3 instanceof gb2) {
            hf0Var3.invalidate();
            ((gb2) this.b).setInvalidateListener(new ira(this, (byte) 1));
        } else if (hf0Var3 instanceof uk1) {
            hf0Var3.invalidate();
            ((uk1) this.b).setInvalidateListener(new ira(this, (byte) 1));
        }
        invalidate();
    }
}
