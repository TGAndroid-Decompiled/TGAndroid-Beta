package cg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class j2 extends FrameLayout {
    public float f3169a;
    public final i2 f3170b;
    public final ImageReceiver f3171c;
    public final ImageReceiver d;
    public boolean f3172e;
    public boolean f3173f;
    public float h;
    public float f3174n;
    public TLRPC.Document f3175r;
    public boolean f3176s;
    public final h1 v;

    public j2(h1 h1Var, Context context) {
        super(context);
        this.v = h1Var;
        this.f3173f = true;
        i2 i2Var = new i2(this, context);
        this.f3170b = i2Var;
        ImageReceiver imageReceiver = new ImageReceiver(i2Var);
        this.f3171c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(i2Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(i2Var, f6.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f9;
        boolean z13 = this.f3172e;
        i2 i2Var = this.f3170b;
        float f10 = 0.0f;
        if (z13 != z11) {
            this.f3172e = z11;
            if (!z12) {
                if (z11) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                this.h = f9;
            }
            i2Var.invalidate();
        }
        if (this.f3173f != z10) {
            this.f3173f = z10;
            if (!z12) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f3174n = f10;
            }
            i2Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3171c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3171c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f3189g3 * 0.6f);
        i2 i2Var = this.f3170b;
        ViewGroup.LayoutParams layoutParams = i2Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = i2Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
