package defpackage;

import android.view.View;
public final class mt implements Runnable {
    public final byte a = 0;
    public final bw b;
    public final View c;

    public mt(bw bwVar, View view) {
        this.b = bwVar;
        this.c = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.c;
        bw bwVar = this.b;
        switch (b) {
            case 0:
                view.post(new mt(bwVar, view));
                return;
            default:
                bwVar.J.clear();
                bwVar.L.set(null);
                view.invalidate();
                return;
        }
    }

    public mt(View view, bw bwVar) {
        this.c = view;
        this.b = bwVar;
    }
}
