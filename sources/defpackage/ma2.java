package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class ma2 extends FrameLayout implements tjb {
    public final st a;
    public final RadialProgressView b;
    public final wjb c;
    public float d;
    public int e;

    public ma2(Context context, wjb wjbVar) {
        super(context);
        int i;
        this.c = wjbVar;
        st stVar = new st(this, context);
        this.a = stVar;
        stVar.setWillNotDraw(false);
        addView(stVar, nme.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, wjbVar);
        this.b = radialProgressView;
        radialProgressView.setSize(gl.L(28.0f));
        if (bkb.g1(wjbVar)) {
            i = bkb.Ja;
        } else {
            i = bkb.Yc;
        }
        radialProgressView.setProgressColor(bkb.v0(i, wjbVar));
        stVar.addView(radialProgressView, nme.e(32, 32, 17));
    }

    public final void a(float f, int i) {
        if (this.d != f) {
            invalidate();
        }
        this.d = f;
        this.e = i;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        this.a.setVisibility(i);
    }

    @Override
    public final void updateColors() {
        int i;
        wjb wjbVar = this.c;
        try {
            RadialProgressView radialProgressView = this.b;
            if (bkb.g1(wjbVar)) {
                i = bkb.Ja;
            } else {
                i = bkb.Yc;
            }
            radialProgressView.setProgressColor(bkb.v0(i, wjbVar));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
