package eg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class i2 extends FrameLayout {
    public float f5307a;
    public final h2 f5308b;
    public final ImageReceiver f5309c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f5310f;
    public float h;
    public float f5311n;
    public TLRPC.Document f5312r;
    public boolean f5313s;
    public final g1 v;

    public i2(g1 g1Var, Context context) {
        super(context);
        this.v = g1Var;
        this.f5310f = true;
        h2 h2Var = new h2(this, context);
        this.f5308b = h2Var;
        ImageReceiver imageReceiver = new ImageReceiver(h2Var);
        this.f5309c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(h2Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(h2Var, b6.e(-1, -2, 21));
    }

    public final void a(boolean z4, boolean z10, boolean z11) {
        float f10;
        boolean z12 = this.e;
        h2 h2Var = this.f5308b;
        float f11 = 0.0f;
        if (z12 != z10) {
            this.e = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
            }
            h2Var.invalidate();
        }
        if (this.f5310f != z4) {
            this.f5310f = z4;
            if (!z11) {
                if (z4) {
                    f11 = 1.0f;
                }
                this.f5311n = f11;
            }
            h2Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5309c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5309c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f5325h3 * 0.6f);
        h2 h2Var = this.f5308b;
        ViewGroup.LayoutParams layoutParams = h2Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = h2Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
