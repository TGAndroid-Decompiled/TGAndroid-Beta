package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import w7.b6;
public final class y1 extends FrameLayout {
    public float f11340a;
    public final x1 f11341b;
    public final ImageReceiver f11342c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f11343f;
    public float h;
    public float f11344n;
    public TLRPC.Document f11345r;
    public boolean f11346s;
    public final b1 f11347w;

    public y1(b1 b1Var, Context context) {
        super(context);
        this.f11347w = b1Var;
        this.f11343f = true;
        x1 x1Var = new x1(this, context);
        this.f11341b = x1Var;
        ImageReceiver imageReceiver = new ImageReceiver(x1Var);
        this.f11342c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(x1Var);
        this.d = imageReceiver2;
        imageReceiver.f14409t0 = false;
        imageReceiver2.f14409t0 = false;
        setClipChildren(false);
        addView(x1Var, b6.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        float f7;
        boolean z13 = this.e;
        x1 x1Var = this.f11341b;
        float f10 = 0.0f;
        if (z13 != z11) {
            this.e = z11;
            if (!z12) {
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.h = f7;
            }
            x1Var.invalidate();
        }
        if (this.f11343f != z10) {
            this.f11343f = z10;
            if (!z12) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f11344n = f10;
            }
            x1Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11342c.P();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11342c.R();
        this.d.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.f11347w.f11366r3 * 0.6f);
        x1 x1Var = this.f11341b;
        ViewGroup.LayoutParams layoutParams = x1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = x1Var.getLayoutParams();
        int L = i12 - org.telegram.messenger.i0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
