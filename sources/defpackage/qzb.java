package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class qzb extends of3 {
    public boolean b5;
    public int c5;
    public TLRPC.TL_forumTopic d5;
    public wl e5;
    public Drawable f5;
    public boolean g5;
    public boolean h5;
    public boolean i5;
    public Boolean j5;
    public float k5;
    public ValueAnimator l5;
    public final tzb m5;

    public qzb(tzb tzbVar, Context context, boolean z) {
        super(context, z);
        byte b;
        this.m5 = tzbVar;
        this.c5 = -1;
        this.y = false;
        if (tzbVar.isInPreviewMode()) {
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
    public final void C() {
        super.C();
        n0();
    }

    @Override
    public final boolean M() {
        return this.i5;
    }

    public final void n0() {
        Drawable drawable = this.f5;
        boolean z = drawable instanceof qo4;
        tzb tzbVar = this.m5;
        if (z) {
            ((qo4) drawable).a(vm2.f(this.k5, tzbVar.getThemedColor(aob.R9), tzbVar.getThemedColor(aob.L7)));
        }
        Drawable[] drawableArr = this.i0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof qo4) {
                ((qo4) drawable2).a(vm2.f(this.k5, tzbVar.getThemedColor(aob.R9), tzbVar.getThemedColor(aob.L7)));
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
            ofFloat.addUpdateListener(new pzb(this, (byte) 0));
            this.l5.setInterpolator(k43.g);
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
        wl wlVar = this.e5;
        if (wlVar != null) {
            wlVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g5 = false;
        wl wlVar = this.e5;
        if (wlVar != null) {
            wlVar.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        ey8 ey8Var;
        int L;
        za zaVar;
        tzb tzbVar = this.m5;
        if (tzbVar.getMessagesController().B2(-tzbVar.a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.l0 && (zaVar = this.r2) != null) {
            f = zaVar.getProgress() * hl.L(30.0f);
        } else {
            f = 0.0f;
        }
        this.G3 = f;
        canvas.save();
        float f2 = this.G3;
        int i = -hl.L(4.0f);
        this.F3 = i;
        canvas.translate(f2, i);
        canvas.drawColor(tzbVar.getThemedColor(aob.d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.x1, 0.0f);
        if (this.b5) {
            if (this.u2) {
                L = 0;
            } else {
                L = hl.L(this.J);
            }
            boolean z = ob6.a0;
            float f3 = this.x1;
            if (z) {
                canvas.drawLine(0.0f - f3, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, aob.j0);
            } else {
                canvas.drawLine(L - f3, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
            }
        }
        if ((!this.h5 || (ey8Var = this.f2) == null || ey8Var.C != 0.0f) && (this.e5 != null || this.f5 != null)) {
            int L2 = hl.L(10.0f);
            int L3 = hl.L(10.0f);
            int L4 = hl.L(28.0f);
            wl wlVar = this.e5;
            boolean z2 = ob6.a0;
            if (wlVar != null) {
                if (z2) {
                    wlVar.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    wlVar.setBounds(L2, L3, L2 + L4, L4 + L3);
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

    public void setAnimatedEmojiDrawable(wl wlVar) {
        wl wlVar2 = this.e5;
        if (wlVar2 != wlVar) {
            if (wlVar2 != null && this.g5) {
                wlVar2.o(this);
            }
            if (wlVar != null) {
                wlVar.setColorFilter(aob.v3);
            }
            this.e5 = wlVar;
            if (wlVar != null && this.g5) {
                wlVar.b(this);
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
        tzb tzbVar = this.m5;
        if (tL_forumTopic != null && this != tzbVar.d1) {
            if (tL_forumTopic.hidden) {
                this.M1 = true;
                this.N1 = aob.d9;
                this.O1 = aob.c9;
                this.P1 = "Unhide";
                this.Q1 = 2131743539;
                this.R1 = aob.y1;
            } else {
                this.M1 = true;
                this.N1 = aob.c9;
                this.O1 = aob.d9;
                this.P1 = "Hide";
                this.Q1 = 2131749079;
                this.R1 = aob.x1;
            }
            invalidate();
        }
        if (this.l0) {
            return;
        }
        if (tL_forumTopic != null) {
            if (tL_forumTopic.id == 1) {
                setAnimatedEmojiDrawable(null);
                setForumIcon(ro4.d(getContext(), 1.0f, tzbVar.getThemedColor(aob.rd), false));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                setForumIcon(null);
                wl wlVar = this.e5;
                if (wlVar == null || wlVar.h() != tL_forumTopic.icon_emoji_id) {
                    if (tzbVar.v0) {
                        i = 13;
                    } else {
                        i = 10;
                    }
                    i2 = ((e) tzbVar).currentAccount;
                    setAnimatedEmojiDrawable(new wl(i, i2, tL_forumTopic.icon_emoji_id));
                }
            }
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z4 = true;
            }
            o0(z4);
            C();
        }
        setAnimatedEmojiDrawable(null);
        setForumIcon(ro4.f(tL_forumTopic));
        if (tL_forumTopic != null) {
            z4 = true;
        }
        o0(z4);
        C();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.j5 != null) {
                n0();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
