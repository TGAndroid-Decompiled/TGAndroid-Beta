package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class qz8 extends FrameLayout implements tjb {
    public static final p37 I;
    public static final p37 J;
    public static final p37 K;
    public static final p37 L;
    public long E;
    public final j72 F;
    public float G;
    public ValueAnimator H;
    public boolean a;
    public final int b;
    public final pz8 c;
    public final df0 d;
    public final jia e;
    public final be0 f;
    public final be0 h;
    public int n;
    public final pb0 r;
    public final View s;
    public final aya w;
    public final wjb x;
    public final boolean y;

    static {
        int i = bkb.x6;
        I = new p37(2131232239, i);
        p37 p37Var = new p37(2131232328, i);
        p37Var.g = 16;
        p37Var.h = 16;
        p37Var.i = 5.66f;
        J = p37Var;
        int i2 = bkb.Xk;
        K = new p37(2131231975, i2);
        L = new p37(2131231949, i2);
    }

    public qz8(int i, int i2, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        this.r = new pb0((wjb) null);
        this.G = 1.0f;
        this.y = i;
        this.b = i2;
        this.x = wjbVar;
        this.F = new j72(this, wjbVar);
        setLayoutParams(new e49(-1, gl.L(50.0f)));
        if (i == 1) {
            i3 = 48;
        } else {
            i3 = 34;
        }
        pz8 pz8Var = new pz8(this, context, i);
        this.c = pz8Var;
        float f5 = i3;
        pz8Var.setRoundRadius(gl.L(f5));
        addView(pz8Var, nme.i(f5, f5, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            setClipChildren(false);
        }
        df0 df0Var = new df0(context, (byte) 4);
        this.d = df0Var;
        kk7.i(df0Var);
        df0Var.setTextSize(16);
        zkb.W(df0Var, bkb.D8, wjbVar);
        df0Var.setEllipsizeByGradient(true);
        df0Var.setImportantForAccessibility(2);
        df0Var.setRightPadding(gl.L(30.0f));
        if (k96.a0) {
            f = gl.L(30.0f);
        } else {
            f = 0.0f;
        }
        df0Var.setTranslationX(f);
        df0Var.setRightDrawableOutside(true);
        if (i == 1) {
            f2 = 7.66f;
            f3 = 73.0f;
        } else {
            f2 = 5.33f;
            f3 = 55.0f;
        }
        float f6 = f3;
        addView(df0Var, nme.i(-1.0f, -2.0f, 55, f6, f2, 12.0f, 0.0f));
        aya ayaVar = new aya(this);
        this.w = ayaVar;
        df0Var.setDrawablePadding(gl.L(3.0f));
        df0Var.i(ayaVar.a);
        jia jiaVar = new jia(context);
        this.e = jiaVar;
        jiaVar.setTextSize(13);
        zkb.W(jiaVar, bkb.x6, wjbVar);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.setImportantForAccessibility(2);
        jiaVar.setTranslationX(k96.a0 ? gl.L(30.0f) : 0.0f);
        if (i == 1) {
            f4 = 24.0f;
        } else {
            f4 = 19.0f;
        }
        addView(jiaVar, nme.i(-1.0f, -2.0f, 55, f6, f4, 20.0f, 0.0f));
        if (z2) {
            be0 be0Var = new be0(context);
            this.f = be0Var;
            addView(be0Var, nme.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            be0 be0Var2 = new be0(context);
            this.h = be0Var2;
            addView(be0Var2, nme.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z) {
            View view = new View(context);
            this.s = view;
            view.setBackground(bkb.L0(false));
            addView(view, nme.c(-1.0f, -1));
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
            ofFloat.addUpdateListener(new u28(this, (byte) 23));
            this.H.addListener(new t7(this, f, (byte) 6));
            this.H.setInterpolator(s33.h);
            this.H.setDuration(420L);
            this.H.start();
            return;
        }
        this.G = f;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r20, org.telegram.tgnet.TLRPC.Chat r21, org.telegram.tgnet.TLRPC.Reaction r22, boolean r23, long r24, org.telegram.tgnet.tl.TL_stories.StoryItem r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz8.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
            float L2 = gl.L(f);
            boolean z2 = k96.a0;
            wjb wjbVar = this.x;
            if (z2) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, bkb.U0("paintDivider", wjbVar));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.U0("paintDivider", wjbVar));
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public wjb getResourcesProvider() {
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(i3), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.Chat K0;
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long B1 = k27.B1(messagePeerReaction.peer_id);
        int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i2 = this.b;
        if (i > 0) {
            user = na7.q1(i2).V1(Long.valueOf(B1));
            K0 = null;
        } else {
            K0 = na7.q1(i2).K0(Long.valueOf(-B1));
            user = null;
        }
        c(user, K0, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z;
        int i;
        aya ayaVar = this.w;
        if (ayaVar != null) {
            try {
                tl tlVar = ayaVar.a;
                if (tlVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && tlVar.G != null) {
                    if (this.y) {
                        i = bkb.F6;
                    } else {
                        i = bkb.y9;
                    }
                    tlVar.k(Integer.valueOf(bkb.v0(i, this.x)));
                    df0 df0Var = this.d;
                    if (df0Var != null) {
                        df0Var.invalidate();
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j) {
    }
}
