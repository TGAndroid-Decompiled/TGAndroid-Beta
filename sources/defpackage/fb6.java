package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class fb6 extends FrameLayout implements tjb {
    public final wjb a;
    public final FrameLayout b;
    public int c;
    public boolean d;

    public fb6(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(sjb.e(bkb.v0(bkb.Ei, wjbVar), 8.0f));
        addView(frameLayout, nme.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        jia jiaVar = new jia(context);
        jiaVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        jiaVar.setGravity(17);
        jiaVar.setDrawablePadding(gl.L(8.0f));
        zkb.W(jiaVar, bkb.Ii, wjbVar);
        jiaVar.setTextSize(14);
        jiaVar.l(k96.M0(2131751424, null), false);
        jiaVar.setLeftDrawable(2131231106);
        jiaVar.setTypeface(gl.o());
        frameLayout.addView(jiaVar, nme.c(-1.0f, -1));
        frameLayout.setOutlineProvider(zdc.b);
        frameLayout.setClipToOutline(true);
        ote.b(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int v0 = bkb.v0(bkb.Ei, this.a);
            FrameLayout frameLayout = this.b;
            if (frameLayout != null && (v0 != this.c || this.d != bkb.I.o())) {
                this.d = bkb.I.o();
                this.c = v0;
                bkb.F1(frameLayout.getBackground(), v0, false);
                bkb.F1(frameLayout.getBackground(), sjb.b(v0), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
