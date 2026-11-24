package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class gw1 extends FrameLayout {
    public final fw1 a;
    public final tk5 b;
    public View c;
    public int d;
    public boolean e;

    public gw1(Context context, tk5 tk5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = tk5Var;
        fw1 fw1Var = new fw1(this, bundle);
        this.a = fw1Var;
        fw1Var.mb = true;
    }

    public void a() {
        int i;
        fw1 fw1Var = this.a;
        if (fw1Var.onFragmentCreate()) {
            this.c = fw1Var.fragmentView;
            fw1Var.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = fw1Var.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    fw1Var.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            vr1 vr1Var = fw1Var.A0;
            if (vr1Var != null && (i = this.d) != 0) {
                vr1Var.setPadding(0, i, 0, 0);
            }
            fw1Var.Ga();
            addView(this.c, qoe.c(-1.0f, -1));
            if (this.e) {
                fw1Var.onResume();
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
