package defpackage;

import android.view.View;
public final class mu implements Runnable {
    public final byte a = 0;
    public final bx b;
    public final View c;

    public mu(bx bxVar, View view) {
        this.b = bxVar;
        this.c = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.c;
        bx bxVar = this.b;
        switch (b) {
            case 0:
                view.post(new mu(bxVar, view));
                return;
            default:
                bxVar.J.clear();
                bxVar.L.set(null);
                view.invalidate();
                return;
        }
    }

    public mu(View view, bx bxVar) {
        this.c = view;
        this.b = bxVar;
    }
}
