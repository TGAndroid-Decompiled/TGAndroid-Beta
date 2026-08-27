package hh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

public final class k8 implements View.OnClickListener {

    public final int f9620a;

    public final da f9621b;

    public k8(da daVar, int i10) {
        this.f9620a = i10;
        this.f9621b = daVar;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 n2VarR;
        org.telegram.ui.ActionBar.n2 n2VarR2;
        switch (this.f9620a) {
            case 0:
                if (this.f9621b.f9146f > 0 && (n2VarR = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    n2VarR.showAsSheet(new oa(), l2Var);
                }
                break;
            default:
                if (this.f9621b.f9146f > 0 && (n2VarR2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.f23619a = true;
                    n2VarR2.showAsSheet(new oa(), l2Var2);
                }
                break;
        }
    }
}
