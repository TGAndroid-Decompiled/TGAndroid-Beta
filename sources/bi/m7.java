package bi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class m7 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final k7 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final un f5087a;
    public org.telegram.ui.Cells.z f5088b;
    public int f5089c;
    public final int[] d;
    public final int[] e;
    public final RectF f5090f;
    public final RectF h;
    public final Paint f5091n;
    public boolean f5092r;
    public final org.telegram.ui.Components.h6 f5093s;
    public final org.telegram.ui.Components.r6 v;
    public boolean f5094w;
    public final f2 f5095x;
    public float f5096y;

    public m7(un unVar) {
        super(unVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f5090f = new RectF();
        this.h = new RectF();
        this.f5091n = new Paint();
        new Paint();
        this.f5093s = new org.telegram.ui.Components.h6(this, 0L, 420L, ds.h);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, false, false);
        this.v = r6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f5087a = unVar;
        r6Var.setCallback(this);
        r6Var.r(false, true);
        r6Var.w(AndroidUtilities.dp(40.0f));
        r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        r6Var.s(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.u(-1);
        r6Var.f32119b = 17;
        this.H = new k7(this, 0);
        this.f5095x = new f2(9, this, unVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.f5088b;
        if (zVar instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) zVar).getPrimaryMessageObject();
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
            un unVar = this.f5087a;
            ca y3 = ca.y(unVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.e && y3.q(false, false, null).amount < E) {
                aa aaVar = ca.y(unVar.getCurrentAccount(), false).B;
                if (aaVar != null) {
                    aaVar.a();
                }
                long a2 = unVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(unVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = unVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new tc(unVar.getParentActivity(), unVar.getResourceProvider(), E, 5, str, new y2(this, y3, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f7, k7 k7Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5096y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ai.g0(this, 7));
        this.E.addListener(new l7(this, f7, k7Var, 0));
        this.E.setInterpolator(ds.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.t("", true, true);
        this.f5092r = false;
        invalidate();
        b(0.0f, new k7(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f5088b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            bh.y0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                un unVar = this.f5087a;
                ca y3 = ca.y(unVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((xj0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                xj0 xj0Var = new xj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                xj0Var.R(this);
                xj0Var.J(true);
                xj0Var.K(0);
                xj0Var.start();
                arrayList.add(xj0Var);
                invalidate();
                bh.v0 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    ca.y(unVar.getCurrentAccount(), false).d0(messageObject, this.f5087a, 1L, true, false, null);
                }
                org.telegram.ui.Components.r6 r6Var = this.v;
                r6Var.a();
                r6Var.t("+" + y3.E(messageObject), true, true);
                this.f5092r = true;
                k7 k7Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(k7Var);
                AndroidUtilities.runOnUIThread(k7Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.F;
                if (j10 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && unVar.getLayoutContainer() != null) {
                    unVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: bi.m7.dispatchDraw(android.graphics.Canvas):void");
    }

    public bh.y0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.f5088b;
        if (zVar instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) zVar).N;
        }
        if (zVar instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) zVar).E0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bh.y0 reactionsLayoutInBubble;
        if (this.f5088b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        f2 f2Var = this.f5095x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f5094w = true;
                bh.v0 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(f2Var);
                AndroidUtilities.runOnUIThread(f2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            bh.v0 m11 = reactionsLayoutInBubble.m("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (m11 != null) {
                m11.Y.c(false);
            }
            this.f5094w = false;
            AndroidUtilities.cancelRunOnUIThread(f2Var);
        }
        return this.f5094w;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        int id2;
        org.telegram.ui.Cells.z zVar2 = this.f5088b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.s1) this.f5088b).setInvalidateListener(null);
            this.f5088b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.f5088b).setInvalidateListener(null);
            this.f5088b.invalidate();
        }
        this.f5088b = zVar;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f5089c = id2;
        org.telegram.ui.Cells.z zVar3 = this.f5088b;
        if (zVar3 instanceof org.telegram.ui.Cells.s1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.s1) this.f5088b).setInvalidateListener(new k7(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.v0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.v0) this.f5088b).setInvalidateListener(new k7(this, 1));
        }
        invalidate();
    }
}
