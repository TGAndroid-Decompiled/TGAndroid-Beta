package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class pxb extends hg3 {
    public boolean b5;
    public int c5;
    public TLRPC.TL_forumTopic d5;
    public vm e5;
    public Drawable f5;
    public boolean g5;
    public boolean h5;
    public boolean i5;
    public Boolean j5;
    public float k5;
    public ValueAnimator l5;
    public final sxb m5;

    public pxb(sxb sxbVar, Context context, boolean z) {
        super(context, z);
        byte b;
        this.m5 = sxbVar;
        this.c5 = -1;
        this.y = false;
        if (sxbVar.isInPreviewMode()) {
            b = 11;
        } else {
            b = 50;
        }
        this.J = b;
        this.V = 24.0f;
        this.K = (byte) 64;
        this.L = (byte) 76;
        this.o1 = true;
    }

    @Override
    public final boolean J() {
        return this.i5;
    }

    public final void n0() {
        Drawable drawable = this.f5;
        boolean z = drawable instanceof mo4;
        sxb sxbVar = this.m5;
        if (z) {
            ((mo4) drawable).a(on2.f(this.k5, sxbVar.getThemedColor(cmb.Q9), sxbVar.getThemedColor(cmb.K7)));
        }
        Drawable[] drawableArr = this.i0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof mo4) {
                ((mo4) drawable2).a(on2.f(this.k5, sxbVar.getThemedColor(cmb.Q9), sxbVar.getThemedColor(cmb.K7)));
            }
        }
        invalidate();
    }

    public final void o0(boolean z) {
        boolean z2;
        if (this.j5 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        ValueAnimator valueAnimator = this.l5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l5 = null;
        }
        this.j5 = Boolean.valueOf(z);
        float f = 0.0f;
        if (z2) {
            float f2 = this.k5;
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.l5 = ofFloat;
            ofFloat.addUpdateListener(new oxb(this, (byte) 0));
            this.l5.setInterpolator(d53.g);
            this.l5.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.k5 = f;
        n0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g5 = true;
        vm vmVar = this.e5;
        if (vmVar != null) {
            vmVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g5 = false;
        vm vmVar = this.e5;
        if (vmVar != null) {
            vmVar.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        ww8 ww8Var;
        int L;
        ya yaVar;
        sxb sxbVar = this.m5;
        if (sxbVar.getMessagesController().y2(-sxbVar.a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.l0 && (yaVar = this.r2) != null) {
            f = yaVar.getProgress() * gm.L(30.0f);
        } else {
            f = 0.0f;
        }
        this.G3 = f;
        canvas.save();
        float f2 = this.G3;
        int i = -gm.L(4.0f);
        this.F3 = i;
        canvas.translate(f2, i);
        canvas.drawColor(sxbVar.getThemedColor(cmb.c6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.x1, 0.0f);
        if (this.b5) {
            if (this.u2) {
                L = 0;
            } else {
                L = gm.L(this.J);
            }
            boolean z = jb6.a0;
            float f3 = this.x1;
            if (z) {
                canvas.drawLine(0.0f - f3, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, cmb.j0);
            } else {
                canvas.drawLine(L - f3, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.j0);
            }
        }
        if ((!this.h5 || (ww8Var = this.f2) == null || ww8Var.C != 0.0f) && (this.e5 != null || this.f5 != null)) {
            int L2 = gm.L(10.0f);
            int L3 = gm.L(10.0f);
            int L4 = gm.L(28.0f);
            vm vmVar = this.e5;
            boolean z2 = jb6.a0;
            if (vmVar != null) {
                if (z2) {
                    vmVar.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    vmVar.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.e5.draw(canvas);
            } else {
                Drawable drawable = this.f5;
                if (z2) {
                    drawable.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    drawable.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(vm vmVar) {
        vm vmVar2 = this.e5;
        if (vmVar2 != vmVar) {
            if (vmVar2 != null && this.g5) {
                vmVar2.o(this);
            }
            if (vmVar != null) {
                vmVar.setColorFilter(cmb.u3);
            }
            this.e5 = vmVar;
            if (vmVar != null && this.g5) {
                vmVar.b(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        this.d5 = tL_forumTopic;
        boolean z4 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z = true;
        } else {
            z = false;
        }
        this.i5 = z;
        if (this.l0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z3 = true;
            } else {
                z3 = false;
            }
            o0(z3);
        }
        if (tL_forumTopic != null && tL_forumTopic.id == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h5 = z2;
        sxb sxbVar = this.m5;
        if (tL_forumTopic != null && this != sxbVar.d1) {
            if (tL_forumTopic.hidden) {
                this.M1 = true;
                this.N1 = cmb.c9;
                this.O1 = cmb.b9;
                this.P1 = "Unhide";
                this.Q1 = 2131743571;
                this.R1 = cmb.x1;
            } else {
                this.M1 = true;
                this.N1 = cmb.b9;
                this.O1 = cmb.c9;
                this.P1 = "Hide";
                this.Q1 = 2131749082;
                this.R1 = cmb.w1;
            }
            invalidate();
        }
        if (this.l0) {
            return;
        }
        if (tL_forumTopic != null) {
            if (tL_forumTopic.id == 1) {
                setAnimatedEmojiDrawable(null);
                setForumIcon(no4.d(getContext(), 1.0f, sxbVar.getThemedColor(cmb.qd), false));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                setForumIcon(null);
                vm vmVar = this.e5;
                if (vmVar == null || vmVar.h() != tL_forumTopic.icon_emoji_id) {
                    if (sxbVar.v0) {
                        i = 13;
                    } else {
                        i = 10;
                    }
                    i2 = ((d) sxbVar).currentAccount;
                    setAnimatedEmojiDrawable(new vm(i, i2, tL_forumTopic.icon_emoji_id));
                }
            }
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z4 = true;
            }
            o0(z4);
            x();
        }
        setAnimatedEmojiDrawable(null);
        setForumIcon(no4.f(tL_forumTopic));
        if (tL_forumTopic != null) {
            z4 = true;
        }
        o0(z4);
        x();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.j5 != null) {
                n0();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void x() {
        super.x();
        n0();
    }
}
