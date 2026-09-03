package mh;

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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class l5 extends View {
    public ValueAnimator B;
    public long C;
    public float D;
    public final j5 E;
    public boolean F;
    public final ArrayList G;
    public final int[] H;
    public final xn f14384a;
    public org.telegram.ui.Cells.a0 f14385b;
    public int f14386c;
    public final int[] d;
    public final int[] f14387e;
    public final RectF f14388f;
    public final RectF h;
    public final Paint f14389n;
    public boolean f14390r;
    public final org.telegram.ui.Components.z5 f14391s;
    public final org.telegram.ui.Components.j6 v;
    public boolean f14392w;
    public final m2 f14393x;
    public float f14394y;

    public l5(xn xnVar) {
        super(xnVar.getParentActivity());
        this.d = new int[2];
        this.f14387e = new int[2];
        this.f14388f = new RectF();
        this.h = new RectF();
        this.f14389n = new Paint();
        new Paint();
        this.f14391s = new org.telegram.ui.Components.z5(this, 0L, 420L, pr.h);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.v = j6Var;
        new Matrix();
        this.G = new ArrayList();
        this.H = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f14384a = xnVar;
        j6Var.setCallback(this);
        j6Var.o(false, true, false);
        j6Var.t(AndroidUtilities.dp(40.0f));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.r(-1);
        j6Var.f27999b = 17;
        this.E = new j5(this, 0);
        this.f14393x = new m2(9, this, xnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f14385b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            xn xnVar = this.f14384a;
            t7 y10 = t7.y(xnVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (y10.f14833e && y10.q(false, false, null).amount < E) {
                s7 s7Var = t7.y(xnVar.getCurrentAccount(), false).B;
                if (s7Var != null) {
                    s7Var.a();
                }
                long a2 = xnVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(xnVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = xnVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new z9(xnVar.getParentActivity(), xnVar.getResourceProvider(), E, 5, str, new b2(this, y10, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f10, j5 j5Var) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            this.B = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f14394y, f10);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new eg.m1(this, 15));
        this.B.addListener(new k5(this, f10, j5Var, 0));
        this.B.setInterpolator(pr.h);
        this.B.setDuration(320L);
        this.B.start();
    }

    public final void c() {
        this.F = true;
        AndroidUtilities.cancelRunOnUIThread(this.E);
        this.v.q("", true, true);
        this.f14390r = false;
        invalidate();
        b(0.0f, new j5(this, 2));
    }

    public final void d(float f10, float f11, boolean z4) {
        ArrayList arrayList;
        if (this.f14385b != null && !this.F) {
            MessageObject messageObject = getMessageObject();
            ng.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                xn xnVar = this.f14384a;
                t7 y10 = t7.y(xnVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.G;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((hj0) arrayList.remove(0)).A(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.H;
                hj0 hj0Var = new hj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                hj0Var.f27542s0 = this;
                hj0Var.H(true);
                hj0Var.I(0);
                hj0Var.start();
                arrayList.add(hj0Var);
                invalidate();
                ng.o0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.q();
                }
                if (z4) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    t7.y(xnVar.getCurrentAccount(), false).d0(messageObject, this.f14384a, 1L, true, false, null);
                }
                org.telegram.ui.Components.j6 j6Var = this.v;
                j6Var.b();
                j6Var.q("+" + y10.E(messageObject), true, true);
                this.f14390r = true;
                j5 j5Var = this.E;
                AndroidUtilities.cancelRunOnUIThread(j5Var);
                AndroidUtilities.runOnUIThread(j5Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.C;
                if (j10 < 100) {
                    this.D += 0.5f;
                    return;
                }
                this.D = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * this.D;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f14387e;
                if (measuredWidth == 0 && xnVar.getLayoutContainer() != null) {
                    xnVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.clamp(this.D, 0.9f, 0.3f));
                this.D = 0.0f;
                this.C = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: mh.l5.dispatchDraw(android.graphics.Canvas):void");
    }

    public ng.r0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f14385b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).K;
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).f24300z0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ng.r0 reactionsLayoutInBubble;
        if (this.f14385b == null || this.F || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        m2 m2Var = this.f14393x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f14392w = true;
                ng.o0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(m2Var);
                AndroidUtilities.runOnUIThread(m2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ng.o0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.Y.c(false);
            }
            this.f14392w = false;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
        }
        return this.f14392w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f14385b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t1) this.f14385b).setInvalidateListener(null);
            this.f14385b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.f14385b).setInvalidateListener(null);
            this.f14385b.invalidate();
        }
        this.f14385b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f14386c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f14385b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.t1) this.f14385b).setInvalidateListener(new j5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.v0) this.f14385b).setInvalidateListener(new j5(this, 1));
        }
        invalidate();
    }
}
