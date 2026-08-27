package ag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

public final class c3 extends FrameLayout {

    public float f319a;

    public final b3 f320b;

    public final ImageReceiver f321c;
    public final ImageReceiver d;

    public boolean f322e;

    public boolean f323f;
    public float h;

    public float f324n;

    public TLRPC.Document f325r;

    public boolean f326s;
    public final w1 v;

    public c3(w1 w1Var, Context context) {
        super(context);
        this.v = w1Var;
        this.f323f = true;
        b3 b3Var = new b3(this, context);
        this.f320b = b3Var;
        ImageReceiver imageReceiver = new ImageReceiver(b3Var);
        this.f321c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(b3Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(b3Var, z5.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.f322e;
        b3 b3Var = this.f320b;
        if (z13 != z11) {
            this.f322e = z11;
            if (!z12) {
                this.h = z11 ? 1.0f : 0.0f;
            }
            b3Var.invalidate();
        }
        if (this.f323f != z10) {
            this.f323f = z10;
            if (!z12) {
                this.f324n = z10 ? 1.0f : 0.0f;
            }
            b3Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f321c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f321c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.f340g3 * 0.6f);
        b3 b3Var = this.f320b;
        ViewGroup.LayoutParams layoutParams = b3Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = b3Var.getLayoutParams();
        int iDp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = iDp;
        layoutParams.width = iDp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), 1073741824));
    }
}
