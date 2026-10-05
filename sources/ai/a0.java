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
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zc;
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
    public final ca O;
    public float P;
    public float Q;
    public oj0 R;
    public o S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f537a;
    public final org.telegram.ui.Components.e6 f538a0;
    public int f539b;
    public final jx f540b0;
    public boolean f541c;
    public boolean d;
    public da f542e;
    public TLRPC.User f543f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.h9 f544n;
    public final ImageReceiver f545r;
    public final ImageReceiver f546s;
    public final org.telegram.ui.Components.h9 v;
    public boolean f547w;
    public final FrameLayout f548x;
    public org.telegram.ui.ActionBar.i5 f549y;

    public a0(jx jxVar, Context context) {
        super(context);
        boolean z10;
        this.f540b0 = jxVar;
        this.f544n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f545r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f546s = imageReceiver2;
        this.v = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f547w = true;
        ca caVar = new ca(null, true);
        this.O = caVar;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f538a0 = new org.telegram.ui.Components.e6(this, 0L, 350L, tr.h);
        if (jxVar.f595b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        caVar.f724o = z10;
        caVar.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f548x = frameLayout;
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
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(getContext());
        this.f549y = i5Var;
        i5Var.setTypeface(AndroidUtilities.bold());
        this.f549y.setGravity(17);
        this.f549y.setTextSize(11);
        this.f549y.setTextColor(b0.a(this.f540b0));
        NotificationCenter.listenEmojiLoading(this.f549y);
        this.f549y.setMaxLines(1);
        this.f548x.addView(this.f549y, w7.z5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f545r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f546s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        jx jxVar = this.f540b0;
        int i11 = jxVar.f595b;
        Paint paint = jxVar.G;
        l9 l9Var = jxVar.f617s;
        Paint paint2 = jxVar.H;
        Drawable drawable = jxVar.f597c;
        if (this.F && !l9Var.I(this.E) && Utilities.isNullOrEmpty(l9Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.i6.l1(f11, jxVar.f(org.telegram.ui.ActionBar.i6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(f11, jxVar.f(org.telegram.ui.ActionBar.i6.f21109s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(f11, jxVar.f(org.telegram.ui.ActionBar.i6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.i6.f21109s8;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.M8;
            }
            int f12 = jxVar.f(i10);
            if (f12 != jxVar.f600e) {
                jxVar.f600e = f12;
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
        jx jxVar = this.f540b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
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
        float f13 = clamp * this.P;
        FrameLayout frameLayout = this.f548x;
        frameLayout.setAlpha(f13);
        if (f13 > 0.0f) {
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
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.f540b0.f598c0) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f537a && getParent() != null)) {
            ViewParent parent = getParent();
            jx jxVar = this.f540b0;
            q qVar = jxVar.f615r;
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
        this.f545r.onAttachedToWindow();
        this.f546s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f545r.onDetachedFromWindow();
        this.f546s.onDetachedFromWindow();
        this.O.g();
        da daVar = this.f542e;
        if (daVar != null) {
            daVar.a();
            this.f542e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.f540b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f540b0.f602f;
        if (this.I != j3) {
            this.I = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f546s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    this.f543f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    this.h = chat;
                    this.f543f = null;
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
        throw new UnsupportedOperationException("Method not decompiled: ai.a0.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        ca caVar = this.O;
        if (z10 && caVar.H == null) {
            caVar.H = new zc(this, 1.5f, 5.0f);
        }
        zc zcVar = caVar.H;
        if (zcVar != null) {
            zcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f537a && getParent() != null)) {
            ViewParent parent = getParent();
            jx jxVar = this.f540b0;
            q qVar = jxVar.f615r;
            if (parent == qVar) {
                qVar.invalidate();
            }
            jxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
