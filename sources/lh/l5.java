package lh;

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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class l5 extends View {
    public ValueAnimator B;
    public long C;
    public float D;
    public final j5 E;
    public boolean F;
    public final ArrayList G;
    public final int[] H;
    public final zn f12735a;
    public org.telegram.ui.Cells.a0 f12736b;
    public int f12737c;
    public final int[] d;
    public final int[] e;
    public final RectF f12738f;
    public final RectF h;
    public final Paint f12739n;
    public boolean f12740r;
    public final org.telegram.ui.Components.z5 f12741s;
    public final org.telegram.ui.Components.j6 v;
    public boolean f12742w;
    public final n2 f12743x;
    public float f12744y;

    public l5(zn znVar) {
        super(znVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f12738f = new RectF();
        this.h = new RectF();
        this.f12739n = new Paint();
        new Paint();
        this.f12741s = new org.telegram.ui.Components.z5(this, 0L, 420L, mr.h);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.v = j6Var;
        new Matrix();
        this.G = new ArrayList();
        this.H = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f12735a = znVar;
        j6Var.setCallback(this);
        j6Var.o(false, true, false);
        j6Var.t(AndroidUtilities.dp(40.0f));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.r(-1);
        j6Var.f25847b = 17;
        this.E = new j5(this, 0);
        this.f12743x = new n2(9, this, znVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f12736b;
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) a0Var).getPrimaryMessageObject();
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
            zn znVar = this.f12735a;
            t7 y10 = t7.y(znVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (y10.e && y10.q(false, false, null).amount < E) {
                s7 s7Var = t7.y(znVar.getCurrentAccount(), false).B;
                if (s7Var != null) {
                    s7Var.a();
                }
                long a2 = znVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = znVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new z9(znVar.getParentActivity(), znVar.getResourceProvider(), E, 5, str, new c2(this, y10, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f10, j5 j5Var) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            this.B = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12744y, f10);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new dg.o1(this, 15));
        this.B.addListener(new k5(this, f10, j5Var, 0));
        this.B.setInterpolator(mr.h);
        this.B.setDuration(320L);
        this.B.start();
    }

    public final void c() {
        this.F = true;
        AndroidUtilities.cancelRunOnUIThread(this.E);
        this.v.q("", true, true);
        this.f12740r = false;
        invalidate();
        b(0.0f, new j5(this, 2));
    }

    public final void d(float f10, float f11, boolean z4) {
        ArrayList arrayList;
        if (this.f12736b != null && !this.F) {
            MessageObject messageObject = getMessageObject();
            mg.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                zn znVar = this.f12735a;
                t7 y10 = t7.y(znVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.G;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((gj0) arrayList.remove(0)).A(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.H;
                gj0 gj0Var = new gj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                gj0Var.f25176s0 = this;
                gj0Var.H(true);
                gj0Var.I(0);
                gj0Var.start();
                arrayList.add(gj0Var);
                invalidate();
                mg.o0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.q();
                }
                if (z4) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    t7.y(znVar.getCurrentAccount(), false).d0(messageObject, this.f12735a, 1L, true, false, null);
                }
                org.telegram.ui.Components.j6 j6Var = this.v;
                j6Var.b();
                j6Var.q("+" + y10.E(messageObject), true, true);
                this.f12740r = true;
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
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && znVar.getLayoutContainer() != null) {
                    znVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: lh.l5.dispatchDraw(android.graphics.Canvas):void");
    }

    public mg.r0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f12736b;
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) a0Var).K;
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).f22454z0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mg.r0 reactionsLayoutInBubble;
        if (this.f12736b == null || this.F || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        n2 n2Var = this.f12743x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f12742w = true;
                mg.o0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(n2Var);
                AndroidUtilities.runOnUIThread(n2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            mg.o0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.Y.c(false);
            }
            this.f12742w = false;
            AndroidUtilities.cancelRunOnUIThread(n2Var);
        }
        return this.f12742w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f12736b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.s1) this.f12736b).setInvalidateListener(null);
            this.f12736b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.f12736b).setInvalidateListener(null);
            this.f12736b.invalidate();
        }
        this.f12736b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f12737c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f12736b;
        if (a0Var3 instanceof org.telegram.ui.Cells.s1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.s1) this.f12736b).setInvalidateListener(new j5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.v0) this.f12736b).setInvalidateListener(new j5(this, 1));
        }
        invalidate();
    }
}
