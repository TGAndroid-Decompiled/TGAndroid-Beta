package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class hv1 extends FrameLayout {
    public final gv1 a;
    public final wk5 b;
    public View c;
    public int d;
    public boolean e;

    public hv1(Context context, wk5 wk5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = wk5Var;
        gv1 gv1Var = new gv1(this, bundle);
        this.a = gv1Var;
        gv1Var.mb = true;
    }

    public void a() {
        int i;
        gv1 gv1Var = this.a;
        if (gv1Var.onFragmentCreate()) {
            this.c = gv1Var.fragmentView;
            gv1Var.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = gv1Var.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    gv1Var.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            wq1 wq1Var = gv1Var.A0;
            if (wq1Var != null && (i = this.d) != 0) {
                wq1Var.setPadding(0, i, 0, 0);
            }
            gv1Var.Ha();
            addView(this.c, tre.c(-1.0f, -1));
            if (this.e) {
                gv1Var.onResume();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setTopPadding(int i) {
        this.d = i;
    }

    public void b(boolean z) {
    }
}
