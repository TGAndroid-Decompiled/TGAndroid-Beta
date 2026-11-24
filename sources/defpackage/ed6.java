package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ed6 extends FrameLayout implements vlb {
    public final ylb a;
    public final FrameLayout b;
    public int c;
    public boolean d;

    public ed6(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(ulb.e(cmb.v0(cmb.Ei, ylbVar), 8.0f));
        addView(frameLayout, qoe.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        lka lkaVar = new lka(context);
        lkaVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        lkaVar.setGravity(17);
        lkaVar.setDrawablePadding(gm.L(8.0f));
        anb.W(lkaVar, cmb.Ii, ylbVar);
        lkaVar.setTextSize(14);
        lkaVar.l(jb6.M0(2131751373, null), false);
        lkaVar.setLeftDrawable(2131231107);
        lkaVar.setTypeface(gm.o());
        frameLayout.addView(lkaVar, qoe.c(-1.0f, -1));
        frameLayout.setOutlineProvider(agc.b);
        frameLayout.setClipToOutline(true);
        rve.b(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int v0 = cmb.v0(cmb.Ei, this.a);
            FrameLayout frameLayout = this.b;
            if (frameLayout != null && (v0 != this.c || this.d != cmb.I.o())) {
                this.d = cmb.I.o();
                this.c = v0;
                cmb.F1(frameLayout.getBackground(), v0, false);
                cmb.F1(frameLayout.getBackground(), ulb.b(v0), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
