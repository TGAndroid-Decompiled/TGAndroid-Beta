package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class uu1 extends FrameLayout {
    public final tu1 a;
    public final ui5 b;
    public View c;
    public int d;
    public boolean e;

    public uu1(Context context, ui5 ui5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = ui5Var;
        tu1 tu1Var = new tu1(this, bundle);
        this.a = tu1Var;
        tu1Var.mb = true;
    }

    public void a() {
        int i;
        tu1 tu1Var = this.a;
        if (tu1Var.onFragmentCreate()) {
            this.c = tu1Var.fragmentView;
            tu1Var.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = tu1Var.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    tu1Var.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            jq1 jq1Var = tu1Var.A0;
            if (jq1Var != null && (i = this.d) != 0) {
                jq1Var.setPadding(0, i, 0, 0);
            }
            tu1Var.wa();
            addView(this.c, nme.c(-1.0f, -1));
            if (this.e) {
                tu1Var.onResume();
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
