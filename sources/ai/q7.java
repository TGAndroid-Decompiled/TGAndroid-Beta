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
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class q7 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final o7 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final sn f2064a;
    public org.telegram.ui.Cells.z f2065b;
    public int f2066c;
    public final int[] d;
    public final int[] e;
    public final RectF f2067f;
    public final RectF h;
    public final Paint f2068n;
    public boolean f2069r;
    public final org.telegram.ui.Components.f6 f2070s;
    public final org.telegram.ui.Components.p6 v;
    public boolean f2071w;
    public final a1.f f2072x;
    public float f2073y;

    public q7(sn snVar) {
        super(snVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f2067f = new RectF();
        this.h = new RectF();
        this.f2068n = new Paint();
        new Paint();
        this.f2070s = new org.telegram.ui.Components.f6(this, 0L, 420L, bs.h);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false);
        this.v = p6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f2064a = snVar;
        p6Var.setCallback(this);
        p6Var.r(false, true);
        p6Var.w(AndroidUtilities.dp(40.0f));
        p6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.s(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.u(-1);
        p6Var.f29437b = 17;
        this.H = new o7(this, 0);
        this.f2072x = new a1.f(25, this, snVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.f2065b;
        if (zVar instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) zVar).getPrimaryMessageObject();
        }
        if (zVar instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) zVar).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            sn snVar = this.f2064a;
            ha y3 = ha.y(snVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.e && y3.q(false, false, null).amount < E) {
                fa faVar = ha.y(snVar.getCurrentAccount(), false).B;
                if (faVar != null) {
                    faVar.a();
                }
                long a2 = snVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(snVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = snVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new dd(snVar.getParentActivity(), snVar.getResourceProvider(), E, 5, str, new c3(this, y3, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f7, o7 o7Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f2073y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 5));
        this.E.addListener(new p7(this, f7, o7Var, 0));
        this.E.setInterpolator(bs.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.t("", true, true);
        this.f2069r = false;
        invalidate();
        b(0.0f, new o7(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f2065b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            ah.j1 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                sn snVar = this.f2064a;
                ha y3 = ha.y(snVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((yj0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                yj0 yj0Var = new yj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                yj0Var.R(this);
                yj0Var.J(true);
                yj0Var.K(0);
                yj0Var.start();
                arrayList.add(yj0Var);
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
                    ha.y(snVar.getCurrentAccount(), false).d0(messageObject, this.f2064a, 1L, true, false, null);
                }
                org.telegram.ui.Components.p6 p6Var = this.v;
                p6Var.a();
                p6Var.t("+" + y3.E(messageObject), true, true);
                this.f2069r = true;
                o7 o7Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(o7Var);
                AndroidUtilities.runOnUIThread(o7Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.F;
                if (j10 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && snVar.getLayoutContainer() != null) {
                    snVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: ai.q7.dispatchDraw(android.graphics.Canvas):void");
    }

    public ah.j1 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.f2065b;
        if (zVar instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) zVar).N;
        }
        if (zVar instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) zVar).E0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ah.j1 reactionsLayoutInBubble;
        if (this.f2065b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        a1.f fVar = this.f2072x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f2071w = true;
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
            this.f2071w = false;
            AndroidUtilities.cancelRunOnUIThread(fVar);
        }
        return this.f2071w;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        int id2;
        org.telegram.ui.Cells.z zVar2 = this.f2065b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t1) this.f2065b).setInvalidateListener(null);
            this.f2065b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.f2065b).setInvalidateListener(null);
            this.f2065b.invalidate();
        }
        this.f2065b = zVar;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f2066c = id2;
        org.telegram.ui.Cells.z zVar3 = this.f2065b;
        if (zVar3 instanceof org.telegram.ui.Cells.t1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.t1) this.f2065b).setInvalidateListener(new o7(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.v0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.v0) this.f2065b).setInvalidateListener(new o7(this, 1));
        }
        invalidate();
    }
}
