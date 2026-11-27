package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class e39 extends FrameLayout implements snb {
    public static final w57 I;
    public static final w57 J;
    public static final w57 K;
    public static final w57 L;
    public long E;
    public final a82 F;
    public float G;
    public ValueAnimator H;
    public boolean a;
    public final int b;
    public final d39 c;
    public final ff0 d;
    public final ema e;
    public final de0 f;
    public final de0 h;
    public int n;
    public final rb0 r;
    public final View s;
    public final c2b w;
    public final vnb x;
    public final boolean y;

    static {
        int i = aob.y6;
        I = new w57(2131232239, i);
        w57 w57Var = new w57(2131232328, i);
        w57Var.g = 16;
        w57Var.h = 16;
        w57Var.i = 5.66f;
        J = w57Var;
        int i2 = aob.Yk;
        K = new w57(2131231975, i2);
        L = new w57(2131231949, i2);
    }

    public e39(int i, int i2, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        this.r = new rb0((vnb) null);
        this.G = 1.0f;
        this.y = i;
        this.b = i2;
        this.x = vnbVar;
        this.F = new a82(this, vnbVar);
        setLayoutParams(new r79(-1, hl.L(50.0f)));
        if (i == 1) {
            i3 = 48;
        } else {
            i3 = 34;
        }
        d39 d39Var = new d39(this, context, i);
        this.c = d39Var;
        float f5 = i3;
        d39Var.setRoundRadius(hl.L(f5));
        addView(d39Var, tre.i(f5, f5, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            setClipChildren(false);
        }
        ff0 ff0Var = new ff0(context, (byte) 4);
        this.d = ff0Var;
        jn7.i(ff0Var);
        ff0Var.setTextSize(16);
        yob.W(ff0Var, aob.E8, vnbVar);
        ff0Var.setEllipsizeByGradient(true);
        ff0Var.setImportantForAccessibility(2);
        ff0Var.setRightPadding(hl.L(30.0f));
        if (ob6.a0) {
            f = hl.L(30.0f);
        } else {
            f = 0.0f;
        }
        ff0Var.setTranslationX(f);
        ff0Var.setRightDrawableOutside(true);
        if (i == 1) {
            f2 = 7.66f;
            f3 = 73.0f;
        } else {
            f2 = 5.33f;
            f3 = 55.0f;
        }
        float f6 = f3;
        addView(ff0Var, tre.i(-1.0f, -2.0f, 55, f6, f2, 12.0f, 0.0f));
        c2b c2bVar = new c2b(this);
        this.w = c2bVar;
        ff0Var.setDrawablePadding(hl.L(3.0f));
        ff0Var.i(c2bVar.a);
        ema emaVar = new ema(context);
        this.e = emaVar;
        emaVar.setTextSize(13);
        yob.W(emaVar, aob.y6, vnbVar);
        emaVar.setEllipsizeByGradient(true);
        emaVar.setImportantForAccessibility(2);
        emaVar.setTranslationX(ob6.a0 ? hl.L(30.0f) : 0.0f);
        if (i == 1) {
            f4 = 24.0f;
        } else {
            f4 = 19.0f;
        }
        addView(emaVar, tre.i(-1.0f, -2.0f, 55, f6, f4, 20.0f, 0.0f));
        if (z2) {
            de0 de0Var = new de0(context);
            this.f = de0Var;
            addView(de0Var, tre.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            de0 de0Var2 = new de0(context);
            this.h = de0Var2;
            addView(de0Var2, tre.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z) {
            View view = new View(context);
            this.s = view;
            view.setBackground(aob.L0(false));
            addView(view, tre.c(-1.0f, -1));
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
            ofFloat.addUpdateListener(new pv7(this, (byte) 26));
            this.H.addListener(new u7(this, f, (byte) 6));
            this.H.setInterpolator(k43.h);
            this.H.setDuration(420L);
            this.H.start();
            return;
        }
        this.G = f;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r20, org.telegram.tgnet.TLRPC.Chat r21, org.telegram.tgnet.TLRPC.Reaction r22, boolean r23, long r24, org.telegram.tgnet.tl.TL_stories.StoryItem r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e39.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
            float L2 = hl.L(f);
            boolean z2 = ob6.a0;
            vnb vnbVar = this.x;
            if (z2) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, aob.U0("paintDivider", vnbVar));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.U0("paintDivider", vnbVar));
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public vnb getResourcesProvider() {
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(i3), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.Chat M0;
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long B1 = r47.B1(messagePeerReaction.peer_id);
        int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i2 = this.b;
        if (i > 0) {
            user = uc7.s1(i2).X1(Long.valueOf(B1));
            M0 = null;
        } else {
            M0 = uc7.s1(i2).M0(Long.valueOf(-B1));
            user = null;
        }
        c(user, M0, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z;
        int i;
        c2b c2bVar = this.w;
        if (c2bVar != null) {
            try {
                ul ulVar = c2bVar.a;
                if (ulVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && ulVar.G != null) {
                    if (this.y) {
                        i = aob.G6;
                    } else {
                        i = aob.z9;
                    }
                    ulVar.k(Integer.valueOf(aob.v0(i, this.x)));
                    ff0 ff0Var = this.d;
                    if (ff0Var != null) {
                        ff0Var.invalidate();
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j) {
    }
}
