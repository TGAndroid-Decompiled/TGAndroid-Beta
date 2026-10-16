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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.es;
import org.telegram.ui.px;
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
    public final m9 O;
    public float P;
    public float Q;
    public ck0 R;
    public k S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f3762a;
    public final org.telegram.ui.Components.g6 f3763a0;
    public int f3764b;
    public final px f3765b0;
    public boolean f3766c;
    public boolean d;
    public n9 e;
    public TLRPC.User f3767f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.k9 f3768n;
    public final ImageReceiver f3769r;
    public final ImageReceiver f3770s;
    public final org.telegram.ui.Components.k9 v;
    public boolean f3771w;
    public final FrameLayout f3772x;
    public org.telegram.ui.ActionBar.h5 f3773y;

    public u(px pxVar, Context context) {
        super(context);
        boolean z10;
        this.f3765b0 = pxVar;
        this.f3768n = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f3769r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f3770s = imageReceiver2;
        this.v = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.f3771w = true;
        m9 m9Var = new m9(null, true);
        this.O = m9Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f3763a0 = new org.telegram.ui.Components.g6(this, 0L, 350L, es.h);
        if (pxVar.f3817b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        m9Var.f3339o = z10;
        m9Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3772x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.z5.d(-2.0f, -1));
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
        this.f3773y = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        this.f3773y.setGravity(17);
        this.f3773y.setTextSize(11);
        this.f3773y.setTextColor(v.a(this.f3765b0));
        NotificationCenter.listenEmojiLoading(this.f3773y);
        this.f3773y.setMaxLines(1);
        this.f3772x.addView(this.f3773y, w7.z5.a(-2.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1, 0));
        this.f3769r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f3770s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        px pxVar = this.f3765b0;
        int i11 = pxVar.f3817b;
        Paint paint = pxVar.G;
        x8 x8Var = pxVar.f3838s;
        Paint paint2 = pxVar.H;
        Drawable drawable = pxVar.f3819c;
        if (this.F && !x8Var.I(this.E) && Utilities.isNullOrEmpty(x8Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.g6.m1(f11, pxVar.f(org.telegram.ui.ActionBar.g6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.g6.m1(f11, pxVar.f(org.telegram.ui.ActionBar.g6.f19880s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.g6.m1(f11, pxVar.f(org.telegram.ui.ActionBar.g6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.g6.f19880s8;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.M8;
            }
            int f12 = pxVar.f(i10);
            if (f12 != pxVar.e) {
                pxVar.e = f12;
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
        px pxVar = this.f3765b0;
        if (i11 != 0 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            pxVar.h.invalidate();
        }
        if (this.N) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(pxVar.N / pxVar.B0, 1.0f, 0.0f);
        }
        this.Q = clamp;
        float f12 = clamp * this.P;
        FrameLayout frameLayout = this.f3772x;
        frameLayout.setAlpha(f12);
        if (f12 > 0.0f) {
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
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.f3765b0.f3820c0) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f3762a && getParent() != null)) {
            ViewParent parent = getParent();
            px pxVar = this.f3765b0;
            m mVar = pxVar.f3836r;
            if (parent == mVar) {
                mVar.invalidate();
            } else {
                pxVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3769r.onAttachedToWindow();
        this.f3770s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3769r.onDetachedFromWindow();
        this.f3770s.onDetachedFromWindow();
        this.O.g();
        n9 n9Var = this.e;
        if (n9Var != null) {
            n9Var.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.f3765b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f3765b0.f3823f;
        if (this.I != j10) {
            this.I = j10;
            if (j10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f3770s;
            if (z10) {
                if (j10 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    this.f3767f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    this.h = chat;
                    this.f3767f = null;
                    user = chat;
                }
                if (user != null) {
                    org.telegram.ui.Components.k9 k9Var = this.v;
                    k9Var.j(i10, user);
                    imageReceiver.setForUserOrChat(user, k9Var);
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
        m9 m9Var = this.O;
        if (z10 && m9Var.H == null) {
            m9Var.H = new ad(this, 1.5f, 5.0f);
        }
        ad adVar = m9Var.H;
        if (adVar != null) {
            adVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f3762a && getParent() != null)) {
            ViewParent parent = getParent();
            px pxVar = this.f3765b0;
            m mVar = pxVar.f3836r;
            if (parent == mVar) {
                mVar.invalidate();
            }
            pxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
