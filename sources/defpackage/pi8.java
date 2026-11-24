package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class pi8 extends FrameLayout {
    public float a;
    public final oi8 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final dh8 w;

    public pi8(dh8 dh8Var, Context context) {
        super(context);
        this.w = dh8Var;
        this.f = true;
        oi8 oi8Var = new oi8(this, context);
        this.b = oi8Var;
        ImageReceiver imageReceiver = new ImageReceiver(oi8Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(oi8Var);
        this.d = imageReceiver2;
        imageReceiver.u0 = false;
        imageReceiver2.u0 = false;
        setClipChildren(false);
        addView(oi8Var, nme.e(-1, -2, 21));
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        float f;
        boolean z4 = this.e;
        oi8 oi8Var = this.b;
        float f2 = 0.0f;
        if (z4 != z2) {
            this.e = z2;
            if (!z3) {
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.h = f;
            }
            oi8Var.invalidate();
        }
        if (this.f != z) {
            this.f = z;
            if (!z3) {
                if (z) {
                    f2 = 1.0f;
                }
                this.n = f2;
            }
            oi8Var.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.I();
        this.d.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.K();
        this.d.K();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = (int) (this.w.s3 * 0.6f);
        oi8 oi8Var = this.b;
        ViewGroup.LayoutParams layoutParams = oi8Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = oi8Var.getLayoutParams();
        int L = i3 - gl.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i3 * 0.7f), 1073741824));
    }
}
