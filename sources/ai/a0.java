package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.is;
import org.telegram.ui.jx;
public final class a0 extends FrameLayout {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final da O;
    public float P;
    public float Q;
    public hk0 R;
    public o S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f620a;
    public final org.telegram.ui.Components.g6 f621a0;
    public int f622b;
    public final jx f623b0;
    public boolean f624c;
    public boolean d;
    public ea f625e;
    public TLRPC.User f626f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.j9 f627n;
    public final ImageReceiver f628r;
    public final ImageReceiver f629s;
    public final org.telegram.ui.Components.j9 v;
    public boolean f630w;
    public final FrameLayout f631x;
    public org.telegram.ui.ActionBar.h5 f632y;

    public a0(jx jxVar, Context context) {
        super(context);
        boolean z10;
        this.f623b0 = jxVar;
        this.f627n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f628r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f629s = imageReceiver2;
        this.v = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        this.f630w = true;
        da daVar = new da(null, true);
        this.O = daVar;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f621a0 = new org.telegram.ui.Components.g6(this, 0L, 350L, is.h);
        if (jxVar.f662b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        daVar.f850o = z10;
        daVar.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f631x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.x5.d(-2.0f, -1));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() != null && getParent().getParent() != null && getParent().getParent().getParent() != null) {
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f632y = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        this.f632y.setGravity(17);
        this.f632y.setTextSize(11);
        this.f632y.setTextColor(b0.a(this.f623b0));
        NotificationCenter.listenEmojiLoading(this.f632y);
        this.f632y.setMaxLines(1);
        this.f631x.addView(this.f632y, w7.x5.a(-2.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1, 0));
        this.f628r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f629s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        jx jxVar = this.f623b0;
        int i11 = jxVar.f662b;
        Paint paint = jxVar.G;
        m9 m9Var = jxVar.f684s;
        Paint paint2 = jxVar.H;
        Drawable drawable = jxVar.f664c;
        if (this.F && !m9Var.I(this.E) && Utilities.isNullOrEmpty(m9Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.h6.m1(f11, jxVar.f(org.telegram.ui.ActionBar.h6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(f11, jxVar.f(org.telegram.ui.ActionBar.h6.f21101s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(f11, jxVar.f(org.telegram.ui.ActionBar.h6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.h6.f21101s8;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.M8;
            }
            int f12 = jxVar.f(i10);
            if (f12 != jxVar.f667e) {
                jxVar.f667e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float clamp;
        int i10;
        int i11 = (this.J > f7 ? 1 : (this.J == f7 ? 0 : -1));
        jx jxVar = this.f623b0;
        if (i11 != 0 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            jxVar.h.invalidate();
        }
        if (this.N) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(jxVar.N / jxVar.B0, 1.0f, 0.0f);
        }
        this.Q = clamp;
        float f12 = clamp * this.P;
        FrameLayout frameLayout = this.f631x;
        frameLayout.setAlpha(f12);
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        frameLayout.setVisibility(i10);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: ai.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.f623b0.f665c0) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f620a && getParent() != null)) {
            ViewParent parent = getParent();
            jx jxVar = this.f623b0;
            q qVar = jxVar.f682r;
            if (parent == qVar) {
                qVar.invalidate();
            } else {
                jxVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f628r.onAttachedToWindow();
        this.f629s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f628r.onDetachedFromWindow();
        this.f629s.onDetachedFromWindow();
        this.O.g();
        ea eaVar = this.f625e;
        if (eaVar != null) {
            eaVar.a();
            this.f625e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.f623b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f623b0.f669f;
        if (this.I != j3) {
            this.I = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f629s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    this.f626f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    this.h = chat;
                    this.f626f = null;
                    user = chat;
                }
                if (user != null) {
                    org.telegram.ui.Components.j9 j9Var = this.v;
                    j9Var.j(i10, user);
                    imageReceiver.setForUserOrChat(user, j9Var);
                    return;
                }
                return;
            }
            imageReceiver.clearImage();
        }
    }

    public void setDialogId(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ai.a0.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        da daVar = this.O;
        if (z10 && daVar.H == null) {
            daVar.H = new bd(this, 1.5f, 5.0f);
        }
        bd bdVar = daVar.H;
        if (bdVar != null) {
            bdVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f620a && getParent() != null)) {
            ViewParent parent = getParent();
            jx jxVar = this.f623b0;
            q qVar = jxVar.f682r;
            if (parent == qVar) {
                qVar.invalidate();
            }
            jxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
