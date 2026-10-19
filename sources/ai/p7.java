package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class p7 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final n7 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final qn f2013a;
    public org.telegram.ui.Cells.a0 f2014b;
    public int f2015c;
    public final int[] d;
    public final int[] e;
    public final RectF f2016f;
    public final RectF h;
    public final Paint f2017n;
    public boolean f2018r;
    public final org.telegram.ui.Components.f6 f2019s;
    public final org.telegram.ui.Components.p6 v;
    public boolean f2020w;
    public final a1.f f2021x;
    public float f2022y;

    public p7(qn qnVar) {
        super(qnVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f2016f = new RectF();
        this.h = new RectF();
        this.f2017n = new Paint();
        new Paint();
        this.f2019s = new org.telegram.ui.Components.f6(this, 0L, 420L, bs.h);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false);
        this.v = p6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f2013a = qnVar;
        p6Var.setCallback(this);
        p6Var.r(false, true);
        p6Var.w(AndroidUtilities.dp(40.0f));
        p6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.s(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.u(-1);
        p6Var.f29182b = 17;
        this.H = new n7(this, 0);
        this.f2021x = new a1.f(25, this, qnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f2014b;
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) a0Var).getPrimaryMessageObject();
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
            qn qnVar = this.f2013a;
            ga y3 = ga.y(qnVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.e && y3.q(false, false, null).amount < E) {
                fa faVar = ga.y(qnVar.getCurrentAccount(), false).B;
                if (faVar != null) {
                    faVar.a();
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
                new cd(qnVar.getParentActivity(), qnVar.getResourceProvider(), E, 5, str, new b2(this, y3, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f7, n7 n7Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f2022y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 5));
        this.E.addListener(new o7(this, f7, n7Var, 0));
        this.E.setInterpolator(bs.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.t("", true, true);
        this.f2018r = false;
        invalidate();
        b(0.0f, new n7(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f2014b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            ah.j1 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                qn qnVar = this.f2013a;
                ga y3 = ga.y(qnVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((uj0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                uj0 uj0Var = new uj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                uj0Var.R(this);
                uj0Var.J(true);
                uj0Var.K(0);
                uj0Var.start();
                arrayList.add(uj0Var);
                invalidate();
                ah.g1 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    ga.y(qnVar.getCurrentAccount(), false).d0(messageObject, this.f2013a, 1L, true, false, null);
                }
                org.telegram.ui.Components.p6 p6Var = this.v;
                p6Var.a();
                p6Var.t("+" + y3.E(messageObject), true, true);
                this.f2018r = true;
                n7 n7Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(n7Var);
                AndroidUtilities.runOnUIThread(n7Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.F;
                if (j10 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && qnVar.getLayoutContainer() != null) {
                    qnVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.c0(iArr2[0] + f7, iArr2[1] + f10, Utilities.clamp(this.G, 0.9f, 0.3f));
                this.G = 0.0f;
                this.F = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.p7.dispatchDraw(android.graphics.Canvas):void");
    }

    public ah.j1 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f2014b;
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) a0Var).N;
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).E0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ah.j1 reactionsLayoutInBubble;
        if (this.f2014b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        a1.f fVar = this.f2021x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f2020w = true;
                ah.g1 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(fVar);
                AndroidUtilities.runOnUIThread(fVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ah.g1 m11 = reactionsLayoutInBubble.m("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (m11 != null) {
                m11.Y.c(false);
            }
            this.f2020w = false;
            AndroidUtilities.cancelRunOnUIThread(fVar);
        }
        return this.f2020w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f2014b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.u1) this.f2014b).setInvalidateListener(null);
            this.f2014b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f2014b).setInvalidateListener(null);
            this.f2014b.invalidate();
        }
        this.f2014b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f2015c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f2014b;
        if (a0Var3 instanceof org.telegram.ui.Cells.u1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.u1) this.f2014b).setInvalidateListener(new n7(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f2014b).setInvalidateListener(new n7(this, 1));
        }
        invalidate();
    }
}
