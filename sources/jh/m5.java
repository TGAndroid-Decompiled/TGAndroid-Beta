package jh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class m5 extends View {
    public ValueAnimator A;
    public long B;
    public float C;
    public final k5 D;
    public boolean E;
    public final ArrayList F;
    public final int[] G;
    public final tn f12454a;
    public org.telegram.ui.Cells.a0 f12455b;
    public int f12456c;
    public final int[] d;
    public final int[] f12457e;
    public final RectF f12458f;
    public final RectF h;
    public final Paint f12459n;
    public boolean f12460r;
    public final org.telegram.ui.Components.d6 f12461s;
    public final org.telegram.ui.Components.n6 v;
    public boolean f12462w;
    public final w2 f12463x;
    public float f12464y;

    public m5(tn tnVar) {
        super(tnVar.getParentActivity());
        this.d = new int[2];
        this.f12457e = new int[2];
        this.f12458f = new RectF();
        this.h = new RectF();
        this.f12459n = new Paint();
        new Paint();
        this.f12461s = new org.telegram.ui.Components.d6(this, 0L, 420L, jr.h);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.v = n6Var;
        new Matrix();
        this.F = new ArrayList();
        this.G = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f12454a = tnVar;
        n6Var.setCallback(this);
        n6Var.o(false, true, false);
        n6Var.t(AndroidUtilities.dp(40.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        n6Var.f30862b = 17;
        this.D = new k5(this, 0);
        this.f12463x = new w2(7, this, tnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f12455b;
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
            tn tnVar = this.f12454a;
            s7 y8 = s7.y(tnVar.getCurrentAccount(), false);
            long E = y8.E(messageObject);
            if (y8.f12790e && y8.q(false, false, null).amount < E) {
                r7 r7Var = s7.y(tnVar.getCurrentAccount(), false).B;
                if (r7Var != null) {
                    r7Var.a();
                }
                long a2 = tnVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(tnVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = tnVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new y9(tnVar.getParentActivity(), tnVar.getResourceProvider(), E, 5, str, new c2(this, y8, messageObject, E, 3), 0L).show();
            }
        }
    }

    public final void b(float f9, k5 k5Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            this.A = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12464y, f9);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new bg.q1(this, 15));
        this.A.addListener(new l5(this, f9, k5Var, 0));
        this.A.setInterpolator(jr.h);
        this.A.setDuration(320L);
        this.A.start();
    }

    public final void c() {
        this.E = true;
        AndroidUtilities.cancelRunOnUIThread(this.D);
        this.v.q("", true, true);
        this.f12460r = false;
        invalidate();
        b(0.0f, new k5(this, 2));
    }

    public final void d(float f9, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f12455b != null && !this.E) {
            MessageObject messageObject = getMessageObject();
            kg.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                tn tnVar = this.f12454a;
                s7 y8 = s7.y(tnVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.F;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((xi0) arrayList.remove(0)).A(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.G;
                int i10 = iArr[random.nextInt(iArr.length)];
                xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(70.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(70.0f));
                xi0Var.f34753r0 = this;
                xi0Var.H(true);
                xi0Var.I(0);
                xi0Var.start();
                arrayList.add(xi0Var);
                invalidate();
                kg.o0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    s7.y(tnVar.getCurrentAccount(), false).d0(messageObject, this.f12454a, 1L, true, false, null);
                }
                org.telegram.ui.Components.n6 n6Var = this.v;
                n6Var.b();
                n6Var.q("+" + y8.E(messageObject), true, true);
                this.f12460r = true;
                k5 k5Var = this.D;
                AndroidUtilities.cancelRunOnUIThread(k5Var);
                AndroidUtilities.runOnUIThread(k5Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.B;
                if (j10 < 100) {
                    this.C += 0.5f;
                    return;
                }
                this.C = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * this.C;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.f12457e;
                if (measuredWidth == 0 && tnVar.getLayoutContainer() != null) {
                    tnVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.b0(iArr2[0] + f9, iArr2[1] + f10, Utilities.clamp(this.C, 0.9f, 0.3f));
                this.C = 0.0f;
                this.B = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: jh.m5.dispatchDraw(android.graphics.Canvas):void");
    }

    public kg.r0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f12455b;
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) a0Var).J;
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).f25815y0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kg.r0 reactionsLayoutInBubble;
        if (this.f12455b == null || this.E || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        w2 w2Var = this.f12463x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f12462w = true;
                kg.o0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(w2Var);
                AndroidUtilities.runOnUIThread(w2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            kg.o0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.Y.c(false);
            }
            this.f12462w = false;
            AndroidUtilities.cancelRunOnUIThread(w2Var);
        }
        return this.f12462w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f12455b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.s1) this.f12455b).setInvalidateListener(null);
            this.f12455b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.f12455b).setInvalidateListener(null);
            this.f12455b.invalidate();
        }
        this.f12455b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f12456c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f12455b;
        if (a0Var3 instanceof org.telegram.ui.Cells.s1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.s1) this.f12455b).setInvalidateListener(new k5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.v0) this.f12455b).setInvalidateListener(new k5(this, 1));
        }
        invalidate();
    }
}
