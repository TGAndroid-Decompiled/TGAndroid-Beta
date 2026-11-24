package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
public final class jk2 extends FrameLayout {
    public final hw a;
    public fk2 b;
    public p8c c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public jk2(Context context, mi4 mi4Var) {
        super(context);
        hw hwVar = new hw(this, context);
        this.a = hwVar;
        hwVar.setAdapter(new hk2(this, context, mi4Var, (byte) 0));
        hwVar.setLayoutManager(new t26(0, false));
        hwVar.setClipToPadding(false);
        hwVar.setVisibility(8);
        hwVar.setWillNotDraw(false);
        hwVar.setOnItemClickListener(new u(this, (byte) 14));
        addView(hwVar, nme.c(56.0f, -1));
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z) {
            return;
        }
        this.e = z;
        float f = 0.0f;
        int i = 0;
        hw hwVar = this.a;
        if (z2) {
            hwVar.setVisibility(0);
            float f2 = this.d;
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new uz1(this, (byte) 12));
            this.f.addListener(new y7((byte) 21, this, z));
            this.f.setInterpolator(s33.h);
            this.f.setDuration(340L);
            this.f.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.d = f;
        hwVar.invalidate();
        if (!z) {
            i = 8;
        }
        hwVar.setVisibility(i);
    }

    public void setOnLayoutClick(p8c p8cVar) {
        this.c = p8cVar;
    }

    public void setSelected(fk2 fk2Var) {
        this.b = fk2Var;
        gl.V3(this.a);
    }
}
