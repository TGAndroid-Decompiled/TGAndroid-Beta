package oh;

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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.hx;
public final class o extends FrameLayout {
    public long B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public float J;
    public boolean K;
    public final i7 L;
    public float M;
    public float N;
    public lj0 O;
    public f P;
    public final float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final org.telegram.ui.Components.z5 U;
    public final hx V;
    public boolean f17518a;
    public int f17519b;
    public boolean f17520c;
    public boolean d;
    public j7 f17521e;
    public TLRPC.User f17522f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.z8 f17523n;
    public final ImageReceiver f17524r;
    public final ImageReceiver f17525s;
    public final org.telegram.ui.Components.z8 v;
    public boolean f17526w;
    public final FrameLayout f17527x;
    public org.telegram.ui.ActionBar.l5 f17528y;

    public o(hx hxVar, Context context) {
        super(context);
        boolean z4;
        this.V = hxVar;
        this.f17523n = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f17524r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f17525s = imageReceiver2;
        this.v = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f17526w = true;
        i7 i7Var = new i7(null, true);
        this.L = i7Var;
        this.M = 1.0f;
        this.N = 1.0f;
        this.Q = 1.0f;
        this.U = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        if (hxVar.f17578b == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        i7Var.f17237o = z4;
        i7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f17527x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.K) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, k7.c6.c(-2.0f, -1));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public void setClipInParent(boolean z4) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z4);
        }
        if (getParent() != null && getParent().getParent() != null && getParent().getParent().getParent() != null) {
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z4);
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.f17528y = l5Var;
        l5Var.setTypeface(AndroidUtilities.bold());
        this.f17528y.setGravity(17);
        this.f17528y.setTextSize(11);
        this.f17528y.setTextColor(p.a(this.V));
        NotificationCenter.listenEmojiLoading(this.f17528y);
        this.f17528y.setMaxLines(1);
        this.f17527x.addView(this.f17528y, k7.c6.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f17524r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f17525s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i10;
        hx hxVar = this.V;
        int i11 = hxVar.f17578b;
        Paint paint = hxVar.D;
        t6 t6Var = hxVar.f17600s;
        Paint paint2 = hxVar.E;
        Drawable drawable = hxVar.f17580c;
        if (this.C && !t6Var.I(this.B) && Utilities.isNullOrEmpty(t6Var.E(this.B))) {
            float dp = f10 + AndroidUtilities.dp(16.0f);
            float dp2 = f11 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.k6.l1(f12, hxVar.f(org.telegram.ui.ActionBar.k6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.k6.l1(f12, hxVar.f(org.telegram.ui.ActionBar.k6.f21932s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.k6.l1(f12, hxVar.f(org.telegram.ui.ActionBar.k6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.k6.f21932s8;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.M8;
            }
            int f13 = hxVar.f(i10);
            if (f13 != hxVar.f17583e) {
                hxVar.f17583e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z4) {
        float clamp;
        int i10;
        float f13 = this.G;
        hx hxVar = this.V;
        if (f13 != f10 || this.H != f11 || 0.0f != f12 || this.S != z4) {
            this.S = z4;
            this.G = f10;
            this.H = f11;
            invalidate();
            hxVar.h.invalidate();
        }
        if (this.K) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(hxVar.K / hxVar.f17610y0, 1.0f, 0.0f);
        }
        this.N = clamp;
        float f14 = clamp * this.M;
        FrameLayout frameLayout = this.f17527x;
        frameLayout.setAlpha(f14);
        if (f14 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        frameLayout.setVisibility(i10);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: oh.o.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.V.W) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.G) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.K || (this.f17518a && getParent() != null)) {
            ViewParent parent = getParent();
            hx hxVar = this.V;
            h hVar = hxVar.f17598r;
            if (parent == hVar) {
                hVar.invalidate();
            } else {
                hxVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17524r.onAttachedToWindow();
        this.f17525s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17524r.onDetachedFromWindow();
        this.f17525s.onDetachedFromWindow();
        this.L.g();
        j7 j7Var = this.f17521e;
        if (j7Var != null) {
            j7Var.a();
            this.f17521e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.K) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.V.J;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        boolean z4;
        TLRPC.User user;
        int i10 = this.V.f17585f;
        if (this.F != j10) {
            this.F = j10;
            if (j10 != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.E = z4;
            ImageReceiver imageReceiver = this.f17525s;
            if (z4) {
                if (j10 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    this.f17522f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    this.h = chat;
                    this.f17522f = null;
                    user = chat;
                }
                if (user != null) {
                    org.telegram.ui.Components.z8 z8Var = this.v;
                    z8Var.j(i10, user);
                    imageReceiver.setForUserOrChat(user, z8Var);
                    return;
                }
                return;
            }
            imageReceiver.clearImage();
        }
    }

    public void setDialogId(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: oh.o.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        i7 i7Var = this.L;
        if (z4 && i7Var.H == null) {
            i7Var.H = new rc(this, 1.5f, 5.0f);
        }
        rc rcVar = i7Var.H;
        if (rcVar != null) {
            rcVar.c(z4);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.K || (this.f17518a && getParent() != null)) {
            ViewParent parent = getParent();
            hx hxVar = this.V;
            h hVar = hxVar.f17598r;
            if (parent == hVar) {
                hVar.invalidate();
            }
            hxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
