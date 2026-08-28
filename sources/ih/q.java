package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.vw;
public final class q extends FrameLayout {
    public long A;
    public boolean B;
    public boolean C;
    public boolean D;
    public long E;
    public float F;
    public float G;
    public float H;
    public float I;
    public boolean J;
    public final l7 K;
    public float L;
    public float M;
    public qi0 N;
    public h O;
    public final float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final org.telegram.ui.Components.y5 T;
    public final vw U;
    public boolean f11979a;
    public int f11980b;
    public boolean f11981c;
    public boolean d;
    public m7 f11982e;
    public TLRPC.User f11983f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.z8 f11984n;
    public final ImageReceiver f11985r;
    public final ImageReceiver f11986s;
    public final org.telegram.ui.Components.z8 v;
    public boolean f11987w;
    public final FrameLayout f11988x;
    public org.telegram.ui.ActionBar.h5 f11989y;

    public q(vw vwVar, Context context) {
        super(context);
        boolean z10;
        this.U = vwVar;
        this.f11984n = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f11985r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f11986s = imageReceiver2;
        this.v = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f11987w = true;
        l7 l7Var = new l7(null, true);
        this.K = l7Var;
        this.L = 1.0f;
        this.M = 1.0f;
        this.P = 1.0f;
        this.T = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        if (vwVar.f12020b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        l7Var.f11728o = z10;
        l7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11988x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.J) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, g7.e6.c(-2.0f, -1));
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
        this.f11989y = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        this.f11989y.setGravity(17);
        this.f11989y.setTextSize(11);
        this.f11989y.setTextColor(r.a(this.U));
        NotificationCenter.listenEmojiLoading(this.f11989y);
        this.f11989y.setMaxLines(1);
        this.f11988x.addView(this.f11989y, g7.e6.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f11985r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f11986s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i9;
        vw vwVar = this.U;
        int i10 = vwVar.f12020b;
        Paint paint = vwVar.C;
        v6 v6Var = vwVar.f12042s;
        Paint paint2 = vwVar.D;
        Drawable drawable = vwVar.f12022c;
        if (this.B && !v6Var.I(this.A) && Utilities.isNullOrEmpty(v6Var.E(this.A))) {
            float dp = f10 + AndroidUtilities.dp(16.0f);
            float dp2 = f11 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(f12, vwVar.f(org.telegram.ui.ActionBar.f6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.f6.l1(f12, vwVar.f(org.telegram.ui.ActionBar.f6.f23269s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.f6.l1(f12, vwVar.f(org.telegram.ui.ActionBar.f6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i10 == 0) {
                i9 = org.telegram.ui.ActionBar.f6.f23269s8;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.M8;
            }
            int f13 = vwVar.f(i9);
            if (f13 != vwVar.f12025e) {
                vwVar.f12025e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z10) {
        float clamp;
        int i9;
        float f13 = this.F;
        vw vwVar = this.U;
        if (f13 != f10 || this.G != f11 || 0.0f != f12 || this.R != z10) {
            this.R = z10;
            this.F = f10;
            this.G = f11;
            invalidate();
            vwVar.h.invalidate();
        }
        if (this.J) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(vwVar.J / vwVar.f12050x0, 1.0f, 0.0f);
        }
        this.M = clamp;
        float f14 = clamp * this.L;
        FrameLayout frameLayout = this.f11988x;
        frameLayout.setAlpha(f14);
        if (f14 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        frameLayout.setVisibility(i9);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: ih.q.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp) / 2.0f, this.U.V) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.F) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.J || (this.f11979a && getParent() != null)) {
            ViewParent parent = getParent();
            vw vwVar = this.U;
            j jVar = vwVar.f12040r;
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
        this.f11985r.onAttachedToWindow();
        this.f11986s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11985r.onDetachedFromWindow();
        this.f11986s.onDetachedFromWindow();
        this.K.g();
        m7 m7Var = this.f11982e;
        if (m7Var != null) {
            m7Var.a();
            this.f11982e = null;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        if (this.J) {
            i11 = AndroidUtilities.dp(70.0f);
        } else {
            i11 = this.U.I;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        boolean z10;
        TLRPC.User user;
        int i9 = this.U.f12027f;
        if (this.E != j10) {
            this.E = j10;
            if (j10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D = z10;
            ImageReceiver imageReceiver = this.f11986s;
            if (z10) {
                if (j10 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                    this.f11983f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
                    this.h = chat;
                    this.f11983f = null;
                    user = chat;
                }
                if (user != null) {
                    org.telegram.ui.Components.z8 z8Var = this.v;
                    z8Var.j(i9, user);
                    imageReceiver.setForUserOrChat(user, z8Var);
                    return;
                }
                return;
            }
            imageReceiver.clearImage();
        }
    }

    public void setDialogId(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ih.q.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        l7 l7Var = this.K;
        if (z10 && l7Var.H == null) {
            l7Var.H = new pc(this, 1.5f, 5.0f);
        }
        pc pcVar = l7Var.H;
        if (pcVar != null) {
            pcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (this.J || (this.f11979a && getParent() != null)) {
            ViewParent parent = getParent();
            vw vwVar = this.U;
            j jVar = vwVar.f12040r;
            if (parent == jVar) {
                jVar.invalidate();
            }
            vwVar.invalidate();
        }
        super.invalidate(i9, i10, i11, i12);
    }
}
