package kh;

import android.content.Context;
import android.view.View;
import lh.aa;
public final class m implements View.OnClickListener {
    public final int f10699a;
    public final Context f10700b;
    public final org.telegram.ui.ActionBar.f6 f10701c;

    public m(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f10699a = i10;
        this.f10700b = context;
        this.f10701c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10699a) {
            case 0:
                new aa(this.f10700b, this.f10701c).show();
                return;
            case 1:
                new aa(this.f10700b, this.f10701c).show();
                return;
            default:
                new aa(this.f10700b, this.f10701c).show();
                return;
        }
    }
}
