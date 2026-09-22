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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wc;
import org.telegram.ui.lx;
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
    public bj0 R;
    public o S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f492a;
    public final org.telegram.ui.Components.c6 f493a0;
    public int f494b;
    public final lx f495b0;
    public boolean f496c;
    public boolean d;
    public da e;
    public TLRPC.User f497f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.f9 f498n;
    public final ImageReceiver f499r;
    public final ImageReceiver f500s;
    public final org.telegram.ui.Components.f9 v;
    public boolean f501w;
    public final FrameLayout f502x;
    public org.telegram.ui.ActionBar.j5 f503y;

    public a0(lx lxVar, Context context) {
        super(context);
        boolean z10;
        this.f495b0 = lxVar;
        this.f498n = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f499r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f500s = imageReceiver2;
        this.v = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        this.f501w = true;
        ca caVar = new ca(null, true);
        this.O = caVar;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f493a0 = new org.telegram.ui.Components.c6(this, 0L, 350L, qr.h);
        if (lxVar.f539b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        caVar.f658o = z10;
        caVar.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f502x = frameLayout;
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
        this.f503y = j5Var;
        j5Var.setTypeface(AndroidUtilities.bold());
        this.f503y.setGravity(17);
        this.f503y.setTextSize(11);
        this.f503y.setTextColor(b0.a(this.f495b0));
        NotificationCenter.listenEmojiLoading(this.f503y);
        this.f503y.setMaxLines(1);
        this.f502x.addView(this.f503y, w7.x5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f499r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f500s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        lx lxVar = this.f495b0;
        int i11 = lxVar.f539b;
        Paint paint = lxVar.G;
        l9 l9Var = lxVar.f560s;
        Paint paint2 = lxVar.H;
        Drawable drawable = lxVar.f541c;
        if (this.F && !l9Var.I(this.E) && Utilities.isNullOrEmpty(l9Var.E(this.E))) {
            float dp = f7 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.i6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.i6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.i6.f19110s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(f11, lxVar.f(org.telegram.ui.ActionBar.i6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.i6.f19110s8;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.M8;
            }
            int f12 = lxVar.f(i10);
            if (f12 != lxVar.e) {
                lxVar.e = f12;
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
        lx lxVar = this.f495b0;
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
        FrameLayout frameLayout = this.f502x;
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
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.f495b0.f542c0) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f492a && getParent() != null)) {
            ViewParent parent = getParent();
            lx lxVar = this.f495b0;
            q qVar = lxVar.f558r;
            if (parent == qVar) {
                qVar.invalidate();
            } else {
                lxVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f499r.onAttachedToWindow();
        this.f500s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f499r.onDetachedFromWindow();
        this.f500s.onDetachedFromWindow();
        this.O.g();
        da daVar = this.e;
        if (daVar != null) {
            daVar.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.f495b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f495b0.f545f;
        if (this.I != j3) {
            this.I = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f500s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    this.f497f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    this.h = chat;
                    this.f497f = null;
                    user = chat;
                }
                if (user != null) {
                    org.telegram.ui.Components.f9 f9Var = this.v;
                    f9Var.j(i10, user);
                    imageReceiver.setForUserOrChat(user, f9Var);
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
            caVar.H = new wc(this, 1.5f, 5.0f);
        }
        wc wcVar = caVar.H;
        if (wcVar != null) {
            wcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f492a && getParent() != null)) {
            ViewParent parent = getParent();
            lx lxVar = this.f495b0;
            q qVar = lxVar.f558r;
            if (parent == qVar) {
                qVar.invalidate();
            }
            lxVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
