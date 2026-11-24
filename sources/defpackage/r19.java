package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class r19 extends FrameLayout implements vlb {
    public static final p57 I;
    public static final p57 J;
    public static final p57 K;
    public static final p57 L;
    public long E;
    public final u82 F;
    public float G;
    public ValueAnimator H;
    public boolean a;
    public final int b;
    public final q19 c;
    public final dg0 d;
    public final lka e;
    public final bf0 f;
    public final bf0 h;
    public int n;
    public final pc0 r;
    public final View s;
    public final d0b w;
    public final ylb x;
    public final boolean y;

    static {
        int i = cmb.x6;
        I = new p57(2131232240, i);
        p57 p57Var = new p57(2131232329, i);
        p57Var.g = 16;
        p57Var.h = 16;
        p57Var.i = 5.66f;
        J = p57Var;
        int i2 = cmb.Xk;
        K = new p57(2131231976, i2);
        L = new p57(2131231950, i2);
    }

    public r19(int i, int i2, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        this.r = new pc0((ylb) null);
        this.G = 1.0f;
        this.y = i;
        this.b = i2;
        this.x = ylbVar;
        this.F = new u82(this, ylbVar);
        setLayoutParams(new g69(-1, gm.L(50.0f)));
        if (i == 1) {
            i3 = 48;
        } else {
            i3 = 34;
        }
        q19 q19Var = new q19(this, context, i);
        this.c = q19Var;
        float f5 = i3;
        q19Var.setRoundRadius(gm.L(f5));
        addView(q19Var, qoe.i(f5, f5, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            setClipChildren(false);
        }
        dg0 dg0Var = new dg0(context, (byte) 4);
        this.d = dg0Var;
        nm7.i(dg0Var);
        dg0Var.setTextSize(16);
        anb.W(dg0Var, cmb.D8, ylbVar);
        dg0Var.setEllipsizeByGradient(true);
        dg0Var.setImportantForAccessibility(2);
        dg0Var.setRightPadding(gm.L(30.0f));
        if (jb6.a0) {
            f = gm.L(30.0f);
        } else {
            f = 0.0f;
        }
        dg0Var.setTranslationX(f);
        dg0Var.setRightDrawableOutside(true);
        if (i == 1) {
            f2 = 7.66f;
            f3 = 73.0f;
        } else {
            f2 = 5.33f;
            f3 = 55.0f;
        }
        float f6 = f3;
        addView(dg0Var, qoe.i(-1.0f, -2.0f, 55, f6, f2, 12.0f, 0.0f));
        d0b d0bVar = new d0b(this);
        this.w = d0bVar;
        dg0Var.setDrawablePadding(gm.L(3.0f));
        dg0Var.i(d0bVar.a);
        lka lkaVar = new lka(context);
        this.e = lkaVar;
        lkaVar.setTextSize(13);
        anb.W(lkaVar, cmb.x6, ylbVar);
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.setImportantForAccessibility(2);
        lkaVar.setTranslationX(jb6.a0 ? gm.L(30.0f) : 0.0f);
        if (i == 1) {
            f4 = 24.0f;
        } else {
            f4 = 19.0f;
        }
        addView(lkaVar, qoe.i(-1.0f, -2.0f, 55, f6, f4, 20.0f, 0.0f));
        if (z2) {
            bf0 bf0Var = new bf0(context);
            this.f = bf0Var;
            addView(bf0Var, qoe.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            bf0 bf0Var2 = new bf0(context);
            this.h = bf0Var2;
            addView(bf0Var2, qoe.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z) {
            View view = new View(context);
            this.s = view;
            view.setBackground(cmb.L0(false));
            addView(view, qoe.c(-1.0f, -1));
        }
    }

    public final void a(boolean z, float f) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new fx7(this, (byte) 25));
            this.H.addListener(new t7(this, f, (byte) 6));
            this.H.setInterpolator(d53.h);
            this.H.setDuration(420L);
            this.H.start();
            return;
        }
        this.G = f;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r20, org.telegram.tgnet.TLRPC.Chat r21, org.telegram.tgnet.TLRPC.Reaction r22, boolean r23, long r24, org.telegram.tgnet.tl.TL_stories.StoryItem r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r19.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        float f;
        if (this.G < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.G * 255.0f), 31);
            z = true;
        } else {
            z = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            if (this.y) {
                f = 73.0f;
            } else {
                f = 55.0f;
            }
            float L2 = gm.L(f);
            boolean z2 = jb6.a0;
            ylb ylbVar = this.x;
            if (z2) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, cmb.U0("paintDivider", ylbVar));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.U0("paintDivider", ylbVar));
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public ylb getResourcesProvider() {
        return this.x;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.a.b();
        this.F.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!this.y) {
            i3 = 50;
        } else {
            i3 = 58;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(i3), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.Chat L0;
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long B1 = k47.B1(messagePeerReaction.peer_id);
        int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i2 = this.b;
        if (i > 0) {
            user = oc7.r1(i2).W1(Long.valueOf(B1));
            L0 = null;
        } else {
            L0 = oc7.r1(i2).L0(Long.valueOf(-B1));
            user = null;
        }
        c(user, L0, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z;
        int i;
        d0b d0bVar = this.w;
        if (d0bVar != null) {
            try {
                tm tmVar = d0bVar.a;
                if (tmVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && tmVar.G != null) {
                    if (this.y) {
                        i = cmb.F6;
                    } else {
                        i = cmb.y9;
                    }
                    tmVar.k(Integer.valueOf(cmb.v0(i, this.x)));
                    dg0 dg0Var = this.d;
                    if (dg0Var != null) {
                        dg0Var.invalidate();
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j) {
    }
}
