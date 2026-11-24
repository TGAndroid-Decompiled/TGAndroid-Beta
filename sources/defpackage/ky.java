package defpackage;

import android.content.Context;
import android.view.View;
public final class ky implements View.OnClickListener {
    public final byte a;
    public final Context b;
    public final wjb c;

    public ky(Context context, wjb wjbVar, byte b) {
        this.a = b;
        this.b = context;
        this.c = wjbVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new ava(this.b, this.c).show();
                return;
            case 1:
                new ava(this.b, this.c).show();
                return;
            case 2:
                new ava(this.b, this.c).show();
                return;
            default:
                new ava(this.b, this.c).show();
                return;
        }
    }
}
