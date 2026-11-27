package defpackage;

import android.content.Context;
import android.view.View;
public final class ly implements View.OnClickListener {
    public final byte a;
    public final Context b;
    public final vnb c;

    public ly(Context context, vnb vnbVar, byte b) {
        this.a = b;
        this.b = context;
        this.c = vnbVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new eza(this.b, this.c).show();
                return;
            case 1:
                new eza(this.b, this.c).show();
                return;
            case 2:
                new eza(this.b, this.c).show();
                return;
            default:
                new eza(this.b, this.c).show();
                return;
        }
    }
}
