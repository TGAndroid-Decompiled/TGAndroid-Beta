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
import org.telegram.ui.Components.zj0;
import org.telegram.ui.tw;
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
    public final y7 O;
    public float P;
    public float Q;
    public zj0 R;
    public h S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f5736a;
    public final org.telegram.ui.Components.f6 f5737a0;
    public int f5738b;
    public final tw f5739b0;
    public boolean f5740c;
    public boolean d;
    public z7 e;
    public TLRPC.User f5741f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.h9 f5742n;
    public final ImageReceiver f5743r;
    public final ImageReceiver f5744s;
    public final org.telegram.ui.Components.h9 v;
    public boolean f5745w;
    public final FrameLayout f5746x;
    public org.telegram.ui.ActionBar.j5 f5747y;

    public q(tw twVar, Context context) {
        super(context);
        boolean z10;
        this.f5739b0 = twVar;
        this.f5742n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5743r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f5744s = imageReceiver2;
        this.v = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f5745w = true;
        y7 y7Var = new y7(null, true);
        this.O = y7Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f5737a0 = new org.telegram.ui.Components.f6(this, 0L, 350L, bs.h);
        if (twVar.f5868b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        y7Var.f6220o = z10;
        y7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f5746x = frameLayout;
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
        this.f5747y = j5Var;
        j5Var.setTypeface(AndroidUtilities.bold());
        this.f5747y.setGravity(17);
        this.f5747y.setTextSize(11);
        this.f5747y.setTextColor(r.a(this.f5739b0));
        NotificationCenter.listenEmojiLoading(this.f5747y);
        this.f5747y.setMaxLines(1);
        this.f5746x.addView(this.f5747y, w7.z5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f5743r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f5744s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        tw twVar = this.f5739b0;
        int i11 = twVar.f5868b;
        Paint paint = twVar.G;
        i7 i7Var = twVar.f5889s;
        Paint paint2 = twVar.H;
        Drawable drawable = twVar.f5870c;
        if (this.F && !i7Var.I(this.E) && Utilities.isNullOrEmpty(i7Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.h6.m1(f11, twVar.f(org.telegram.ui.ActionBar.h6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(f11, twVar.f(org.telegram.ui.ActionBar.h6.f21273s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(f11, twVar.f(org.telegram.ui.ActionBar.h6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.h6.f21273s8;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.M8;
            }
            int f12 = twVar.f(i10);
            if (f12 != twVar.e) {
                twVar.e = f12;
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
        tw twVar = this.f5739b0;
        if (i11 != 0 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            twVar.h.invalidate();
        }
        if (this.N) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(twVar.N / twVar.B0, 1.0f, 0.0f);
        }
        this.Q = clamp;
        float f12 = clamp * this.P;
        FrameLayout frameLayout = this.f5746x;
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
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.f5739b0.f5871c0) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f5736a && getParent() != null)) {
            ViewParent parent = getParent();
            tw twVar = this.f5739b0;
            j jVar = twVar.f5887r;
            if (parent == jVar) {
                jVar.invalidate();
            } else {
                twVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5743r.onAttachedToWindow();
        this.f5744s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5743r.onDetachedFromWindow();
        this.f5744s.onDetachedFromWindow();
        this.O.g();
        z7 z7Var = this.e;
        if (z7Var != null) {
            z7Var.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.f5739b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f5739b0.f5874f;
        if (this.I != j10) {
            this.I = j10;
            if (j10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f5744s;
            if (z10) {
                if (j10 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    this.f5741f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    this.h = chat;
                    this.f5741f = null;
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
        y7 y7Var = this.O;
        if (z10 && y7Var.H == null) {
            y7Var.H = new yc(this, 1.5f, 5.0f);
        }
        yc ycVar = y7Var.H;
        if (ycVar != null) {
            ycVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f5736a && getParent() != null)) {
            ViewParent parent = getParent();
            tw twVar = this.f5739b0;
            j jVar = twVar.f5887r;
            if (parent == jVar) {
                jVar.invalidate();
            }
            twVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
