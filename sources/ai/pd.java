package ai;

import android.content.Context;
import android.view.View;
public final class pd implements View.OnClickListener {
    public final int f2038a;
    public final Context f2039b;
    public final org.telegram.ui.ActionBar.d6 f2040c;

    public pd(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f2038a = i10;
        this.f2039b = context;
        this.f2040c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2038a) {
            case 0:
                new dd(this.f2039b, this.f2040c).show();
                return;
            case 1:
                new dd(this.f2039b, this.f2040c).show();
                return;
            default:
                new dd(this.f2039b, this.f2040c).show();
                return;
        }
    }
}
