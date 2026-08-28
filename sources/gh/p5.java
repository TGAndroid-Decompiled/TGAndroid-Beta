package gh;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class p5 extends View {
    public ValueAnimator A;
    public long B;
    public float C;
    public final n5 D;
    public boolean E;
    public final ArrayList F;
    public final int[] G;
    public final qn f8713a;
    public org.telegram.ui.Cells.a0 f8714b;
    public int f8715c;
    public final int[] d;
    public final int[] f8716e;
    public final RectF f8717f;
    public final RectF h;
    public final Paint f8718n;
    public boolean f8719r;
    public final org.telegram.ui.Components.y5 f8720s;
    public final org.telegram.ui.Components.i6 v;
    public boolean f8721w;
    public final e5.u f8722x;
    public float f8723y;

    public p5(qn qnVar) {
        super(qnVar.getParentActivity());
        this.d = new int[2];
        this.f8716e = new int[2];
        this.f8717f = new RectF();
        this.h = new RectF();
        this.f8718n = new Paint();
        new Paint();
        this.f8720s = new org.telegram.ui.Components.y5(this, 0L, 420L, gr.h);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.v = i6Var;
        new Matrix();
        this.F = new ArrayList();
        this.G = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f8713a = qnVar;
        i6Var.setCallback(this);
        i6Var.o(false, true, false);
        i6Var.t(AndroidUtilities.dp(40.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        i6Var.f29333b = 17;
        this.D = new n5(this, 0);
        this.f8722x = new e5.u(21, this, qnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f8714b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            qn qnVar = this.f8713a;
            v7 y10 = v7.y(qnVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (y10.f9048e && y10.q(false, false, null).amount < E) {
                u7 u7Var = v7.y(qnVar.getCurrentAccount(), false).B;
                if (u7Var != null) {
                    u7Var.a();
                }
                long a2 = qnVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(qnVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = qnVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new ea(qnVar.getParentActivity(), qnVar.getResourceProvider(), E, 5, str, new e2(this, y10, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f10, n5 n5Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            this.A = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f8723y, f10);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 6));
        this.A.addListener(new o5(this, f10, n5Var, 0));
        this.A.setInterpolator(gr.h);
        this.A.setDuration(320L);
        this.A.start();
    }

    public final void c() {
        this.E = true;
        AndroidUtilities.cancelRunOnUIThread(this.D);
        this.v.q("", true, true);
        this.f8719r = false;
        invalidate();
        b(0.0f, new n5(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.f8714b != null && !this.E) {
            MessageObject messageObject = getMessageObject();
            hg.s0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                qn qnVar = this.f8713a;
                v7 y10 = v7.y(qnVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.F;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((mi0) arrayList.remove(0)).A(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.G;
                int i9 = iArr[random.nextInt(iArr.length)];
                mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(70.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(70.0f));
                mi0Var.f30863r0 = this;
                mi0Var.H(true);
                mi0Var.I(0);
                mi0Var.start();
                arrayList.add(mi0Var);
                invalidate();
                hg.p0 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    v7.y(qnVar.getCurrentAccount(), false).d0(messageObject, this.f8713a, 1L, true, false, null);
                }
                org.telegram.ui.Components.i6 i6Var = this.v;
                i6Var.b();
                i6Var.q("+" + y10.E(messageObject), true, true);
                this.f8719r = true;
                n5 n5Var = this.D;
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                AndroidUtilities.runOnUIThread(n5Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.B;
                if (j10 < 100) {
                    this.C += 0.5f;
                    return;
                }
                this.C = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * this.C;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f8716e;
                if (measuredWidth == 0 && qnVar.getLayoutContainer() != null) {
                    qnVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.clamp(this.C, 0.9f, 0.3f));
                this.C = 0.0f;
                this.B = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: gh.p5.dispatchDraw(android.graphics.Canvas):void");
    }

    public hg.s0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f8714b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).J;
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).f25882y0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hg.s0 reactionsLayoutInBubble;
        if (this.f8714b == null || this.E || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        e5.u uVar = this.f8722x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f8721w = true;
                hg.p0 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(uVar);
                AndroidUtilities.runOnUIThread(uVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hg.p0 m11 = reactionsLayoutInBubble.m("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (m11 != null) {
                m11.Y.c(false);
            }
            this.f8721w = false;
            AndroidUtilities.cancelRunOnUIThread(uVar);
        }
        return this.f8721w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f8714b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t1) this.f8714b).setInvalidateListener(null);
            this.f8714b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f8714b).setInvalidateListener(null);
            this.f8714b.invalidate();
        }
        this.f8714b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f8715c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f8714b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.t1) this.f8714b).setInvalidateListener(new n5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f8714b).setInvalidateListener(new n5(this, 1));
        }
        invalidate();
    }
}
