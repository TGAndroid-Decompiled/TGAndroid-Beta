package defpackage;

import android.content.Context;
import android.view.View;
public final class kz implements View.OnClickListener {
    public final byte a;
    public final Context b;
    public final ylb c;

    public kz(Context context, ylb ylbVar, byte b) {
        this.a = b;
        this.b = context;
        this.c = ylbVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new exa(this.b, this.c).show();
                return;
            case 1:
                new exa(this.b, this.c).show();
                return;
            case 2:
                new exa(this.b, this.c).show();
                return;
            default:
                new exa(this.b, this.c).show();
                return;
        }
    }
}
