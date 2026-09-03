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
    public float f5296a;
    public final h2 f5297b;
    public final ImageReceiver f5298c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f5299f;
    public float h;
    public float f5300n;
    public TLRPC.Document f5301r;
    public boolean f5302s;
    public final g1 v;

    public i2(g1 g1Var, Context context) {
        super(context);
        this.v = g1Var;
        this.f5299f = true;
        h2 h2Var = new h2(this, context);
        this.f5297b = h2Var;
        ImageReceiver imageReceiver = new ImageReceiver(h2Var);
        this.f5298c = imageReceiver;
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
        h2 h2Var = this.f5297b;
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
        if (this.f5299f != z4) {
            this.f5299f = z4;
            if (!z11) {
                if (z4) {
                    f11 = 1.0f;
                }
                this.f5300n = f11;
            }
            h2Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5298c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5298c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f5314h3 * 0.6f);
        h2 h2Var = this.f5297b;
        ViewGroup.LayoutParams layoutParams = h2Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = h2Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
