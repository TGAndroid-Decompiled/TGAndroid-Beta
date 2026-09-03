package kh;

import android.content.Context;
import android.view.View;
import lh.aa;
import org.telegram.ui.ActionBar.f6;
public final class m implements View.OnClickListener {
    public final int f10808a;
    public final Context f10809b;
    public final f6 f10810c;

    public m(Context context, int i10, f6 f6Var) {
        this.f10808a = i10;
        this.f10809b = context;
        this.f10810c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10808a) {
            case 0:
                new aa(this.f10809b, this.f10810c).show();
                return;
            case 1:
                new aa(this.f10809b, this.f10810c).show();
                return;
            default:
                new aa(this.f10809b, this.f10810c).show();
                return;
        }
    }
}
