package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class x6 extends View {

    public final b4 f14133a;

    public boolean f14134b;

    public final org.telegram.ui.Components.y5 f14135c;
    public final ImageReceiver d;

    public final ImageReceiver f14136e;

    public org.telegram.ui.Components.k5 f14137f;
    public boolean h;

    public boolean f14138n;

    public boolean f14139r;

    public boolean f14140s;

    public x6(Context context, b4 b4Var) {
        super(context);
        this.f14135c = new org.telegram.ui.Components.y5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f14136e = new ImageReceiver(this);
        this.h = true;
        this.f14133a = b4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f14136e.onAttachedToWindow();
        this.f14140s = true;
        org.telegram.ui.Components.k5 k5Var = this.f14137f;
        if (k5Var != null) {
            k5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f14136e.onDetachedFromWindow();
        this.f14140s = false;
        org.telegram.ui.Components.k5 k5Var = this.f14137f;
        if (k5Var != null) {
            k5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f14138n) {
            float fD = this.f14135c.d(this.f14134b ? 1.0f : 0.0f, false);
            b4 b4Var = this.f14133a;
            if (fD < 1.0f) {
                Drawable drawable = b4Var.f13094o;
                Drawable drawable2 = b4Var.f13094o;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable2.setAlpha(255);
                drawable2.draw(canvas);
            }
            if (fD > 0.0f) {
                Drawable drawable3 = b4Var.f13095p;
                Drawable drawable4 = b4Var.f13095p;
                drawable3.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                drawable4.setAlpha((int) (fD * 255.0f));
                drawable4.draw(canvas);
                return;
            }
            return;
        }
        if (this.h) {
            org.telegram.ui.Components.k5 k5Var = this.f14137f;
            ImageReceiver imageReceiver = this.d;
            ImageReceiver imageReceiver2 = k5Var != null ? k5Var.f29961k : imageReceiver;
            if (this.f14139r) {
                ImageReceiver imageReceiver3 = this.f14136e;
                if (imageReceiver3.getBitmap() != null) {
                    int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                    float f10 = measuredWidth / 2.0f;
                    float f11 = measuredWidth * 2;
                    imageReceiver3.setImageCoords(getPaddingLeft() - f10, getPaddingTop() - f10, f11, f11);
                    if (imageReceiver3.getLottieAnimation() != null && imageReceiver3.getLottieAnimation().y()) {
                        this.f14139r = false;
                        imageReceiver.setCrossfadeAlpha((byte) 0);
                    }
                    imageReceiver2 = imageReceiver3;
                } else if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(getPaddingLeft(), getPaddingTop(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                }
            } else if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(getPaddingLeft(), getPaddingTop(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            }
            if (imageReceiver2 != null) {
                imageReceiver2.draw(canvas);
            }
        }
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(ig.q0 q0Var) {
        String str;
        String str2;
        this.f14138n = q0Var == null || ((str2 = q0Var.f11412f) != null && str2.equals("❤"));
        if (q0Var == null || (str = q0Var.f11412f) == null || !str.equals("❤")) {
            this.f14134b = false;
        } else {
            this.f14134b = true;
        }
        org.telegram.ui.Components.k5 k5Var = this.f14137f;
        if (k5Var != null) {
            k5Var.o(this);
        }
        this.f14137f = null;
        if (q0Var != null) {
            if (q0Var.f11413g != 0) {
                org.telegram.ui.Components.k5 k5Var2 = new org.telegram.ui.Components.k5(3, UserConfig.selectedAccount, q0Var.f11413g);
                this.f14137f = k5Var2;
                if (this.f14140s) {
                    k5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f11412f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
