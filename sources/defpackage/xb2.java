package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class xb2 extends FrameLayout implements vlb {
    public final su a;
    public final RadialProgressView b;
    public final ylb c;
    public float d;
    public int e;

    public xb2(Context context, ylb ylbVar) {
        super(context);
        int i;
        this.c = ylbVar;
        su suVar = new su(this, context);
        this.a = suVar;
        suVar.setWillNotDraw(false);
        addView(suVar, qoe.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, ylbVar);
        this.b = radialProgressView;
        radialProgressView.setSize(gm.L(28.0f));
        if (cmb.g1(ylbVar)) {
            i = cmb.Ja;
        } else {
            i = cmb.Yc;
        }
        radialProgressView.setProgressColor(cmb.v0(i, ylbVar));
        suVar.addView(radialProgressView, qoe.e(32, 32, 17));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), 1073741824));
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
        ylb ylbVar = this.c;
        try {
            RadialProgressView radialProgressView = this.b;
            if (cmb.g1(ylbVar)) {
                i = cmb.Ja;
            } else {
                i = cmb.Yc;
            }
            radialProgressView.setProgressColor(cmb.v0(i, ylbVar));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
