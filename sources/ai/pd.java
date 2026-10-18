package ai;

import android.content.Context;
import android.view.View;
public final class pd implements View.OnClickListener {
    public final int f2041a;
    public final Context f2042b;
    public final org.telegram.ui.ActionBar.d6 f2043c;

    public pd(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f2041a = i10;
        this.f2042b = context;
        this.f2043c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2041a) {
            case 0:
                new dd(this.f2042b, this.f2043c).show();
                return;
            case 1:
                new dd(this.f2042b, this.f2043c).show();
                return;
            default:
                new dd(this.f2042b, this.f2043c).show();
                return;
        }
    }
}
