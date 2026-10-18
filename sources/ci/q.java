package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.vw;
public final class q extends FrameLayout {
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
    public final x7 O;
    public float P;
    public float Q;
    public yj0 R;
    public h S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f5749a;
    public final org.telegram.ui.Components.f6 f5750a0;
    public int f5751b;
    public final vw f5752b0;
    public boolean f5753c;
    public boolean d;
    public y7 e;
    public TLRPC.User f5754f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.h9 f5755n;
    public final ImageReceiver f5756r;
    public final ImageReceiver f5757s;
    public final org.telegram.ui.Components.h9 v;
    public boolean f5758w;
    public final FrameLayout f5759x;
    public org.telegram.ui.ActionBar.j5 f5760y;

    public q(vw vwVar, Context context) {
        super(context);
        boolean z10;
        this.f5752b0 = vwVar;
        this.f5755n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5756r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f5757s = imageReceiver2;
        this.v = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f5758w = true;
        x7 x7Var = new x7(null, true);
        this.O = x7Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f5750a0 = new org.telegram.ui.Components.f6(this, 0L, 350L, bs.h);
        if (vwVar.f5809b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        x7Var.f6123o = z10;
        x7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f5759x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.z5.c(-2.0f, -1));
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
        this.f5760y = j5Var;
        j5Var.setTypeface(AndroidUtilities.bold());
        this.f5760y.setGravity(17);
        this.f5760y.setTextSize(11);
        this.f5760y.setTextColor(r.a(this.f5752b0));
        NotificationCenter.listenEmojiLoading(this.f5760y);
        this.f5760y.setMaxLines(1);
        this.f5759x.addView(this.f5760y, w7.z5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f5756r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f5757s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        vw vwVar = this.f5752b0;
        int i11 = vwVar.f5809b;
        Paint paint = vwVar.G;
        h7 h7Var = vwVar.f5830s;
        Paint paint2 = vwVar.H;
        Drawable drawable = vwVar.f5811c;
        if (this.F && !h7Var.I(this.E) && Utilities.isNullOrEmpty(h7Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.h6.m1(f11, vwVar.f(org.telegram.ui.ActionBar.h6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(f11, vwVar.f(org.telegram.ui.ActionBar.h6.f21265s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(f11, vwVar.f(org.telegram.ui.ActionBar.h6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.h6.f21265s8;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.M8;
            }
            int f12 = vwVar.f(i10);
            if (f12 != vwVar.e) {
                vwVar.e = f12;
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
        vw vwVar = this.f5752b0;
        if (i11 != 0 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            vwVar.h.invalidate();
        }
        if (this.N) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(vwVar.N / vwVar.B0, 1.0f, 0.0f);
        }
        this.Q = clamp;
        float f12 = clamp * this.P;
        FrameLayout frameLayout = this.f5759x;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.q.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.f5752b0.f5812c0) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f5749a && getParent() != null)) {
            ViewParent parent = getParent();
            vw vwVar = this.f5752b0;
            j jVar = vwVar.f5828r;
            if (parent == jVar) {
                jVar.invalidate();
            } else {
                vwVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5756r.onAttachedToWindow();
        this.f5757s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5756r.onDetachedFromWindow();
        this.f5757s.onDetachedFromWindow();
        this.O.g();
        y7 y7Var = this.e;
        if (y7Var != null) {
            y7Var.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.f5752b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f5752b0.f5815f;
        if (this.I != j10) {
            this.I = j10;
            if (j10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f5757s;
            if (z10) {
                if (j10 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    this.f5754f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    this.h = chat;
                    this.f5754f = null;
                    user = chat;
                }
                if (user != null) {
                    org.telegram.ui.Components.h9 h9Var = this.v;
                    h9Var.j(i10, user);
                    imageReceiver.setForUserOrChat(user, h9Var);
                    return;
                }
                return;
            }
            imageReceiver.clearImage();
        }
    }

    public void setDialogId(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        x7 x7Var = this.O;
        if (z10 && x7Var.H == null) {
            x7Var.H = new yc(this, 1.5f, 5.0f);
        }
        yc ycVar = x7Var.H;
        if (ycVar != null) {
            ycVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f5749a && getParent() != null)) {
            ViewParent parent = getParent();
            vw vwVar = this.f5752b0;
            j jVar = vwVar.f5828r;
            if (parent == jVar) {
                jVar.invalidate();
            }
            vwVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
