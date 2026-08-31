package fg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h2 extends FrameLayout {
    public float f6327a;
    public final g2 f6328b;
    public final ImageReceiver f6329c;
    public final ImageReceiver d;
    public boolean f6330e;
    public boolean f6331f;
    public float h;
    public float f6332n;
    public TLRPC.Document f6333r;
    public boolean f6334s;
    public final f1 v;

    public h2(f1 f1Var, Context context) {
        super(context);
        this.v = f1Var;
        this.f6331f = true;
        g2 g2Var = new g2(this, context);
        this.f6328b = g2Var;
        ImageReceiver imageReceiver = new ImageReceiver(g2Var);
        this.f6329c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(g2Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(g2Var, c6.e(-1, -2, 21));
    }

    public final void a(boolean z4, boolean z10, boolean z11) {
        float f10;
        boolean z12 = this.f6330e;
        g2 g2Var = this.f6328b;
        float f11 = 0.0f;
        if (z12 != z10) {
            this.f6330e = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
            }
            g2Var.invalidate();
        }
        if (this.f6331f != z4) {
            this.f6331f = z4;
            if (!z11) {
                if (z4) {
                    f11 = 1.0f;
                }
                this.f6332n = f11;
            }
            g2Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6329c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6329c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f6345h3 * 0.6f);
        g2 g2Var = this.f6328b;
        ViewGroup.LayoutParams layoutParams = g2Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = g2Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
