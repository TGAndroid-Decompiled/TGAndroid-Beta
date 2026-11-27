package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class cb2 extends FrameLayout implements snb {
    public final tt a;
    public final RadialProgressView b;
    public final vnb c;
    public float d;
    public int e;

    public cb2(Context context, vnb vnbVar) {
        super(context);
        int i;
        this.c = vnbVar;
        tt ttVar = new tt(this, context);
        this.a = ttVar;
        ttVar.setWillNotDraw(false);
        addView(ttVar, tre.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, vnbVar);
        this.b = radialProgressView;
        radialProgressView.setSize(hl.L(28.0f));
        if (aob.g1(vnbVar)) {
            i = aob.Ka;
        } else {
            i = aob.Zc;
        }
        radialProgressView.setProgressColor(aob.v0(i, vnbVar));
        ttVar.addView(radialProgressView, tre.e(32, 32, 17));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(44.0f), 1073741824));
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
        vnb vnbVar = this.c;
        try {
            RadialProgressView radialProgressView = this.b;
            if (aob.g1(vnbVar)) {
                i = aob.Ka;
            } else {
                i = aob.Zc;
            }
            radialProgressView.setProgressColor(aob.v0(i, vnbVar));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
