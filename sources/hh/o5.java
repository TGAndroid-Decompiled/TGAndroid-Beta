package hh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class o5 extends View {
    public ValueAnimator A;
    public long B;
    public float C;
    public final l5 D;
    public boolean E;
    public final ArrayList F;
    public final int[] G;

    public final rn f9826a;

    public org.telegram.ui.Cells.a0 f9827b;

    public int f9828c;
    public final int[] d;

    public final int[] f9829e;

    public final RectF f9830f;
    public final RectF h;

    public final Paint f9831n;

    public boolean f9832r;

    public final org.telegram.ui.Components.y5 f9833s;
    public final org.telegram.ui.Components.i6 v;

    public boolean f9834w;

    public final m5 f9835x;

    public float f9836y;

    public o5(rn rnVar) {
        super(rnVar.getParentActivity());
        this.d = new int[2];
        this.f9829e = new int[2];
        this.f9830f = new RectF();
        this.h = new RectF();
        this.f9831n = new Paint();
        new Paint();
        this.f9833s = new org.telegram.ui.Components.y5(this, 0L, 420L, er.h);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.v = i6Var;
        new Matrix();
        this.F = new ArrayList();
        this.G = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f9826a = rnVar;
        i6Var.setCallback(this);
        i6Var.o(false, true, false);
        i6Var.t(AndroidUtilities.dp(40.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        i6Var.f29239b = 17;
        int i10 = 0;
        this.D = new l5(this, i10);
        this.f9835x = new m5(i10, this, rnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f9827b;
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) a0Var).getPrimaryMessageObject();
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String forcedFirstName;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            rn rnVar = this.f9826a;
            u7 u7VarY = u7.y(rnVar.getCurrentAccount(), false);
            long jE = u7VarY.E(messageObject);
            if (!u7VarY.f10154e || u7VarY.q(false, false, null).amount >= jE) {
                return;
            }
            t7 t7Var = u7.y(rnVar.getCurrentAccount(), false).B;
            if (t7Var != null) {
                t7Var.a();
            }
            long jA = rnVar.a();
            if (jA >= 0) {
                forcedFirstName = UserObject.getForcedFirstName(rnVar.getMessagesController().getUser(Long.valueOf(jA)));
            } else {
                TLRPC.Chat chat = rnVar.getMessagesController().getChat(Long.valueOf(-jA));
                forcedFirstName = chat == null ? "" : chat.title;
            }
            new ea(rnVar.getParentActivity(), rnVar.getResourceProvider(), jE, 5, forcedFirstName, new e2(this, u7VarY, messageObject, jE, 3), 0L).show();
        }
    }

    public final void b(float f10, l5 l5Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            this.A = null;
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f9836y, f10);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 9));
        this.A.addListener(new n5(this, f10, l5Var, 0));
        this.A.setInterpolator(er.h);
        this.A.setDuration(320L);
        this.A.start();
    }

    public final void c() {
        this.E = true;
        AndroidUtilities.cancelRunOnUIThread(this.D);
        this.v.q("", true, true);
        this.f9832r = false;
        invalidate();
        b(0.0f, new l5(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.f9827b == null || this.E) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        ig.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        rn rnVar = this.f9826a;
        u7 u7VarY = u7.y(rnVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.F;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((oi0) arrayList.remove(0)).A(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.G;
        int i10 = iArr[random.nextInt(iArr.length)];
        oi0 oi0Var = new oi0(i10, AndroidUtilities.dp(70.0f), i0.a.k(i10, ""), AndroidUtilities.dp(70.0f));
        oi0Var.f31328r0 = this;
        oi0Var.H(true);
        oi0Var.I(0);
        oi0Var.start();
        arrayList.add(oi0Var);
        invalidate();
        ig.o0 o0VarM = reactionsLayoutInBubble.m("stars");
        if (o0VarM != null) {
            o0VarM.q();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            u7.y(rnVar.getCurrentAccount(), false).d0(messageObject, this.f9826a, 1L, true, false, null);
        }
        org.telegram.ui.Components.i6 i6Var = this.v;
        i6Var.b();
        i6Var.q("+" + u7VarY.E(messageObject), true, true);
        this.f9832r = true;
        l5 l5Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(l5Var);
        AndroidUtilities.runOnUIThread(l5Var, 1500L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.B;
        if (j10 < 100) {
            this.C += 0.5f;
            return;
        }
        this.C = Utilities.clamp(1.0f - ((j10 - 100) / 200.0f), 1.0f, 0.0f) * this.C;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.f9829e;
        if (measuredWidth != 0 || rnVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            rnVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.clamp(this.C, 0.9f, 0.3f));
        this.C = 0.0f;
        this.B = jCurrentTimeMillis;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c10;
        char c11;
        Integer numValueOf;
        float f11;
        int iDp;
        int i10;
        ArrayList arrayList;
        float f12;
        float fDp;
        float f13;
        oi0 oi0Var;
        org.telegram.ui.Cells.a0 a0Var = this.f9827b;
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            if (!((org.telegram.ui.Cells.s1) a0Var).I0) {
                return;
            }
        } else if ((a0Var instanceof org.telegram.ui.Cells.v0) && !((org.telegram.ui.Cells.v0) a0Var).Q1) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.getId() : 0) != this.f9828c) {
            setMessageCell(null);
            return;
        }
        ig.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float fLerp = AndroidUtilities.lerp(1.0f, 1.8f, this.f9836y);
        rn rnVar = this.f9826a;
        float y10 = rnVar.f42213t0.getY() + (((rnVar.R9 == null || (rnVar.N9 && !rnVar.O9)) && !rnVar.Ka) ? (rnVar.f42160o9 - rnVar.q9) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (rnVar.fragmentView.getBottom() - rnVar.f42213t0.getBottom()) + (((rnVar.R9 == null || (rnVar.N9 && !rnVar.O9)) && !rnVar.Ka) ? rnVar.wa : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.f9836y) * y10, getWidth(), org.telegram.ui.Cells.pa.b(1.0f, this.f9836y, bottom, getHeight()));
        int[] iArr = this.f9829e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.a0 a0Var2 = this.f9827b;
        int[] iArr2 = this.d;
        a0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) rnVar.f42236ua);
        canvas.save();
        ig.o0 o0VarM = reactionsLayoutInBubble.m("stars");
        RectF rectF = this.f9830f;
        if (o0VarM != null) {
            f10 = 4.0f;
            int i11 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.f11420c + o0VarM.f11404x;
            int i12 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.d + o0VarM.f11405y;
            float f14 = i11;
            float f15 = i12;
            c10 = 1;
            rectF.set(f14, f15, i11 + o0VarM.A, i12 + o0VarM.B);
            AndroidUtilities.scaleRect(rectF, fLerp, (o0VarM.A * 0.1f) + f14, (o0VarM.B / 2.0f) + f15);
            Paint paint = this.f9831n;
            paint.setColor(0);
            c11 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.l1(this.f9836y, 1426063360));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
            canvas.scale(fLerp, fLerp, (o0VarM.A * 0.1f) + f14, (o0VarM.B / 2.0f) + f15);
            numValueOf = Integer.valueOf(o0VarM.f11399r.hashCode());
        } else {
            f10 = 4.0f;
            c10 = 1;
            c11 = 0;
            numValueOf = null;
        }
        canvas.translate(iArr2[c11] - iArr[c11], this.f9827b.getPaddingTop() + (iArr2[c10] - iArr[c10]));
        org.telegram.ui.Cells.a0 a0Var3 = this.f9827b;
        if (!(a0Var3 instanceof org.telegram.ui.Cells.s1)) {
            if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) a0Var3;
                v0Var.setScrimReaction(null);
                v0Var.D(canvas, true, numValueOf);
                org.telegram.ui.Cells.u0 u0Var = v0Var.f25741e2;
                ig.r0 r0Var = v0Var.f25785y0;
                float alpha = v0Var.getAlpha();
                org.telegram.ui.ActionBar.c6 c6Var = v0Var.U0;
                if (c6Var != null) {
                    f11 = 255.0f;
                    c6Var.m(v0Var.f25764q0, v0Var.f25762p0 + AndroidUtilities.dp(f10), v0Var.getMeasuredWidth(), v0Var.f25767r0);
                } else {
                    f11 = 255.0f;
                    org.telegram.ui.ActionBar.g6.q(v0Var.f25764q0, v0Var.f25762p0 + AndroidUtilities.dp(f10), v0Var.getMeasuredWidth(), v0Var.f25767r0);
                }
                MessageObject messageObject2 = v0Var.D0;
                if (messageObject2 == null || !messageObject2.shouldDrawReactions() || (r0Var.f11419b && !(u0Var.f25690b && r0Var.f11427l))) {
                    rectF = rectF;
                } else {
                    r0Var.f11418a = 1.0f;
                    if (alpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, v0Var.getWidth(), v0Var.getHeight(), (int) (alpha * f11), 31);
                    }
                    r0Var.e(canvas, u0Var.f25690b ? u0Var.f25691c : 1.0f);
                    if (alpha < 1.0f) {
                        canvas.restore();
                    }
                }
                v0Var.setScrimReaction(numValueOf);
            }
            canvas.restore();
            canvas.restore();
            if (o0VarM != null) {
                RectF rectF2 = this.h;
                rectF2.set(rectF);
                rectF2.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
                iDp = (int) (AndroidUtilities.dp(90.0f) * fLerp);
                i10 = 0;
                while (true) {
                    arrayList = this.F;
                    if (i10 < arrayList.size()) {
                        break;
                    }
                    oi0Var = (oi0) arrayList.get(i10);
                    if (oi0Var.X >= oi0Var.f31312e[c11]) {
                        arrayList.remove(i10);
                        i10--;
                    } else {
                        float f16 = iDp / 2.0f;
                        oi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * fLerp) + rectF.left) - f16), (int) (rectF.centerY() - f16), (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(15.0f), fLerp, rectF.left, f16), (int) (rectF.centerY() + f16));
                        oi0Var.setAlpha((int) (this.f9836y * f11));
                        oi0Var.draw(canvas);
                    }
                    i10++;
                }
                float fCenterX = rectF.centerX();
                float fDp2 = rectF.top - AndroidUtilities.dp(36.0f);
                canvas.save();
                float fE = this.f9833s.e(this.f9832r);
                if (this.f9832r) {
                    fDp = AndroidUtilities.dp(60.0f);
                    f12 = 1.0f;
                } else {
                    f12 = 1.0f;
                    fDp = -AndroidUtilities.dp(30.0f);
                }
                canvas.translate(0.0f, (f12 - fE) * fDp);
                if (this.f9832r) {
                    f13 = 1.8f;
                } else {
                    f13 = 1.3f;
                }
                float fLerp2 = AndroidUtilities.lerp(f13, f12, fE);
                canvas.scale(fLerp2, fLerp2, fCenterX, fDp2);
                org.telegram.ui.Components.i6 i6Var = this.v;
                i6Var.f29257w = (int) (fE * f11);
                i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.g6.l1(fE, -1442840576));
                i6Var.l(fCenterX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), fCenterX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
                i6Var.draw(canvas);
                canvas.restore();
            }
            if (!this.f9832r) {
                a();
            }
            invalidate();
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) a0Var3;
        s1Var.setScrimReaction(null);
        s1Var.c2(canvas, 1.0f, numValueOf);
        s1Var.d2(canvas);
        s1Var.setScrimReaction(numValueOf);
        rectF = rectF;
        f11 = 255.0f;
        canvas.restore();
        canvas.restore();
        if (o0VarM != null) {
            RectF rectF3 = this.h;
            rectF3.set(rectF);
            rectF3.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
            iDp = (int) (AndroidUtilities.dp(90.0f) * fLerp);
            i10 = 0;
            while (true) {
                arrayList = this.F;
                if (i10 < arrayList.size()) {
                    break;
                    break;
                }
                oi0Var = (oi0) arrayList.get(i10);
                if (oi0Var.X >= oi0Var.f31312e[c11]) {
                    arrayList.remove(i10);
                    i10--;
                } else {
                    float f17 = iDp / 2.0f;
                    oi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * fLerp) + rectF.left) - f17), (int) (rectF.centerY() - f17), (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(15.0f), fLerp, rectF.left, f17), (int) (rectF.centerY() + f17));
                    oi0Var.setAlpha((int) (this.f9836y * f11));
                    oi0Var.draw(canvas);
                }
                i10++;
            }
            float fCenterX2 = rectF.centerX();
            float fDp3 = rectF.top - AndroidUtilities.dp(36.0f);
            canvas.save();
            float fE2 = this.f9833s.e(this.f9832r);
            if (this.f9832r) {
                fDp = AndroidUtilities.dp(60.0f);
                f12 = 1.0f;
            } else {
                f12 = 1.0f;
                fDp = -AndroidUtilities.dp(30.0f);
            }
            canvas.translate(0.0f, (f12 - fE2) * fDp);
            if (this.f9832r) {
                f13 = 1.8f;
            } else {
                f13 = 1.3f;
            }
            float fLerp3 = AndroidUtilities.lerp(f13, f12, fE2);
            canvas.scale(fLerp3, fLerp3, fCenterX2, fDp3);
            org.telegram.ui.Components.i6 i6Var2 = this.v;
            i6Var2.f29257w = (int) (fE2 * f11);
            i6Var2.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.g6.l1(fE2, -1442840576));
            i6Var2.l(fCenterX2 - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), fCenterX2 + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
            i6Var2.draw(canvas);
            canvas.restore();
        }
        if (!this.f9832r) {
            a();
        }
        invalidate();
    }

    public ig.r0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f9827b;
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) a0Var).J;
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).f25785y0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ig.r0 reactionsLayoutInBubble;
        if (this.f9827b == null || this.E || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        m5 m5Var = this.f9835x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f9834w = true;
                ig.o0 o0VarM = reactionsLayoutInBubble.m("stars");
                if (o0VarM != null) {
                    o0VarM.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(m5Var);
                AndroidUtilities.runOnUIThread(m5Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ig.o0 o0VarM2 = reactionsLayoutInBubble.m("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (o0VarM2 != null) {
                o0VarM2.Y.c(false);
            }
            this.f9834w = false;
            AndroidUtilities.cancelRunOnUIThread(m5Var);
        }
        return this.f9834w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        org.telegram.ui.Cells.a0 a0Var2 = this.f9827b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.s1) this.f9827b).setInvalidateListener(null);
            this.f9827b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.f9827b).setInvalidateListener(null);
            this.f9827b.invalidate();
        }
        this.f9827b = a0Var;
        this.f9828c = getMessageObject() == null ? 0 : getMessageObject().getId();
        org.telegram.ui.Cells.a0 a0Var3 = this.f9827b;
        if (a0Var3 instanceof org.telegram.ui.Cells.s1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.s1) this.f9827b).setInvalidateListener(new l5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.v0) this.f9827b).setInvalidateListener(new l5(this, 1));
        }
        invalidate();
    }
}
