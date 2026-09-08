package bi;

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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;
import org.telegram.ui.lx;
public final class u extends FrameLayout {
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
    public final j9 O;
    public float P;
    public float Q;
    public bj0 R;
    public k S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f3794a;
    public final org.telegram.ui.Components.e6 f3795a0;
    public int f3796b;
    public final lx f3797b0;
    public boolean f3798c;
    public boolean d;
    public k9 f3799e;
    public TLRPC.User f3800f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.i9 f3801n;
    public final ImageReceiver f3802r;
    public final ImageReceiver f3803s;
    public final org.telegram.ui.Components.i9 v;
    public boolean f3804w;
    public final FrameLayout f3805x;
    public org.telegram.ui.ActionBar.j5 f3806y;

    public u(lx lxVar, Context context) {
        super(context);
        boolean z10;
        this.f3797b0 = lxVar;
        this.f3801n = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f3802r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f3803s = imageReceiver2;
        this.v = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.f3804w = true;
        j9 j9Var = new j9(null, true);
        this.O = j9Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f3795a0 = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        if (lxVar.f3875b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        j9Var.f3186o = z10;
        j9Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3805x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.x5.c(-2.0f, -1));
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
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.f3806y = j5Var;
        j5Var.setTypeface(AndroidUtilities.bold());
        this.f3806y.setGravity(17);
        this.f3806y.setTextSize(11);
        this.f3806y.setTextColor(v.a(this.f3797b0));
        NotificationCenter.listenEmojiLoading(this.f3806y);
        this.f3806y.setMaxLines(1);
        this.f3805x.addView(this.f3806y, w7.x5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f3802r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f3803s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        lx lxVar = this.f3797b0;
        int i11 = lxVar.f3875b;
        Paint paint = lxVar.G;
        u8 u8Var = lxVar.f3897s;
        Paint paint2 = lxVar.H;
        Drawable drawable = lxVar.f3877c;
        if (this.F && !u8Var.I(this.E) && Utilities.isNullOrEmpty(u8Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.j6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.j6.f20964s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.j6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.j6.f20964s8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.M8;
            }
            int f12 = lxVar.f(i10);
            if (f12 != lxVar.f3880e) {
                lxVar.f3880e = f12;
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
        float f12 = this.J;
        lx lxVar = this.f3797b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            lxVar.h.invalidate();
        }
        if (this.N) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(lxVar.N / lxVar.B0, 1.0f, 0.0f);
        }
        this.Q = clamp;
        float f13 = clamp * this.P;
        FrameLayout frameLayout = this.f3805x;
        frameLayout.setAlpha(f13);
        if (f13 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        frameLayout.setVisibility(i10);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: bi.u.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.f3797b0.f3878c0) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f3794a && getParent() != null)) {
            ViewParent parent = getParent();
            lx lxVar = this.f3797b0;
            m mVar = lxVar.f3895r;
            if (parent == mVar) {
                mVar.invalidate();
            } else {
                lxVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3802r.onAttachedToWindow();
        this.f3803s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3802r.onDetachedFromWindow();
        this.f3803s.onDetachedFromWindow();
        this.O.g();
        k9 k9Var = this.f3799e;
        if (k9Var != null) {
            k9Var.a();
            this.f3799e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.f3797b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f3797b0.f3882f;
        if (this.I != j3) {
            this.I = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f3803s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    this.f3800f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    this.h = chat;
                    this.f3800f = null;
                    user = chat;
                }
                if (user != null) {
                    org.telegram.ui.Components.i9 i9Var = this.v;
                    i9Var.j(i10, user);
                    imageReceiver.setForUserOrChat(user, i9Var);
                    return;
                }
                return;
            }
            imageReceiver.clearImage();
        }
    }

    public void setDialogId(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.u.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        j9 j9Var = this.O;
        if (z10 && j9Var.H == null) {
            j9Var.H = new zc(this, 1.5f, 5.0f);
        }
        zc zcVar = j9Var.H;
        if (zcVar != null) {
            zcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f3794a && getParent() != null)) {
            ViewParent parent = getParent();
            lx lxVar = this.f3797b0;
            m mVar = lxVar.f3895r;
            if (parent == mVar) {
                mVar.invalidate();
            }
            lxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
