package ai;

import android.content.Context;
import android.view.View;
public final class pd implements View.OnClickListener {
    public final int f2040a;
    public final Context f2041b;
    public final org.telegram.ui.ActionBar.d6 f2042c;

    public pd(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f2040a = i10;
        this.f2041b = context;
        this.f2042c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2040a) {
            case 0:
                new dd(this.f2041b, this.f2042c).show();
                return;
            case 1:
                new dd(this.f2041b, this.f2042c).show();
                return;
            default:
                new dd(this.f2041b, this.f2042c).show();
                return;
        }
    }
}
