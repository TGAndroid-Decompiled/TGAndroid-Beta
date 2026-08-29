package lh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.xw;
public final class o extends FrameLayout {
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
    public final h7 K;
    public float L;
    public float M;
    public bj0 N;
    public f O;
    public final float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final org.telegram.ui.Components.d6 T;
    public final xw U;
    public boolean f15995a;
    public int f15996b;
    public boolean f15997c;
    public boolean d;
    public i7 f15998e;
    public TLRPC.User f15999f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.e9 f16000n;
    public final ImageReceiver f16001r;
    public final ImageReceiver f16002s;
    public final org.telegram.ui.Components.e9 v;
    public boolean f16003w;
    public final FrameLayout f16004x;
    public org.telegram.ui.ActionBar.h5 f16005y;

    public o(xw xwVar, Context context) {
        super(context);
        boolean z10;
        this.U = xwVar;
        this.f16000n = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f16001r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f16002s = imageReceiver2;
        this.v = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f16003w = true;
        h7 h7Var = new h7(null, true);
        this.K = h7Var;
        this.L = 1.0f;
        this.M = 1.0f;
        this.P = 1.0f;
        this.T = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        if (xwVar.f16044b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        h7Var.f15677o = z10;
        h7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f16004x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.J) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, i7.f6.c(-2.0f, -1));
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
        this.f16005y = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        this.f16005y.setGravity(17);
        this.f16005y.setTextSize(11);
        this.f16005y.setTextColor(p.a(this.U));
        NotificationCenter.listenEmojiLoading(this.f16005y);
        this.f16005y.setMaxLines(1);
        this.f16004x.addView(this.f16005y, i7.f6.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f16001r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f16002s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f9, float f10, float f11) {
        int i10;
        xw xwVar = this.U;
        int i11 = xwVar.f16044b;
        Paint paint = xwVar.C;
        s6 s6Var = xwVar.f16066s;
        Paint paint2 = xwVar.D;
        Drawable drawable = xwVar.f16046c;
        if (this.B && !s6Var.I(this.A) && Utilities.isNullOrEmpty(s6Var.E(this.A))) {
            float dp = f9 + AndroidUtilities.dp(16.0f);
            float dp2 = f10 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(f11, xwVar.f(org.telegram.ui.ActionBar.g6.hl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(f11, xwVar.f(org.telegram.ui.ActionBar.g6.f23329s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(f11, xwVar.f(org.telegram.ui.ActionBar.g6.M8)));
            }
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.g6.f23329s8;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.M8;
            }
            int f12 = xwVar.f(i10);
            if (f12 != xwVar.f16049e) {
                xwVar.f16049e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (dp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + dp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + dp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f9, float f10, float f11, boolean z10) {
        float clamp;
        int i10;
        float f12 = this.F;
        xw xwVar = this.U;
        if (f12 != f9 || this.G != f10 || 0.0f != f11 || this.R != z10) {
            this.R = z10;
            this.F = f9;
            this.G = f10;
            invalidate();
            xwVar.h.invalidate();
        }
        if (this.J) {
            clamp = 0.0f;
        } else {
            clamp = 1.0f - Utilities.clamp(xwVar.J / xwVar.f16074x0, 1.0f, 0.0f);
        }
        this.M = clamp;
        float f13 = clamp * this.L;
        FrameLayout frameLayout = this.f16004x;
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
        throw new UnsupportedOperationException("Method not decompiled: lh.o.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float dp = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp) / 2.0f, this.U.V) + (AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), dp, this.F) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.J || (this.f15995a && getParent() != null)) {
            ViewParent parent = getParent();
            xw xwVar = this.U;
            h hVar = xwVar.f16064r;
            if (parent == hVar) {
                hVar.invalidate();
            } else {
                xwVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16001r.onAttachedToWindow();
        this.f16002s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16001r.onDetachedFromWindow();
        this.f16002s.onDetachedFromWindow();
        this.K.g();
        i7 i7Var = this.f15998e;
        if (i7Var != null) {
            i7Var.a();
            this.f15998e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.J) {
            i12 = AndroidUtilities.dp(70.0f);
        } else {
            i12 = this.U.I;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.U.f16051f;
        if (this.E != j10) {
            this.E = j10;
            if (j10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D = z10;
            ImageReceiver imageReceiver = this.f16002s;
            if (z10) {
                if (j10 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    this.f15999f = user2;
                    this.h = null;
                    user = user2;
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    this.h = chat;
                    this.f15999f = null;
                    user = chat;
                }
                if (user != null) {
                    org.telegram.ui.Components.e9 e9Var = this.v;
                    e9Var.j(i10, user);
                    imageReceiver.setForUserOrChat(user, e9Var);
                    return;
                }
                return;
            }
            imageReceiver.clearImage();
        }
    }

    public void setDialogId(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: lh.o.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        h7 h7Var = this.K;
        if (z10 && h7Var.H == null) {
            h7Var.H = new uc(this, 1.5f, 5.0f);
        }
        uc ucVar = h7Var.H;
        if (ucVar != null) {
            ucVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.J || (this.f15995a && getParent() != null)) {
            ViewParent parent = getParent();
            xw xwVar = this.U;
            h hVar = xwVar.f16064r;
            if (parent == hVar) {
                hVar.invalidate();
            }
            xwVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
