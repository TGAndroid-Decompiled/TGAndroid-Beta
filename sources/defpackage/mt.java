package defpackage;

import android.view.View;
public final class mt implements Runnable {
    public final byte a = 0;
    public final cw b;
    public final View c;

    public mt(cw cwVar, View view) {
        this.b = cwVar;
        this.c = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.c;
        cw cwVar = this.b;
        switch (b) {
            case 0:
                view.post(new mt(cwVar, view));
                return;
            default:
                cwVar.J.clear();
                cwVar.L.set(null);
                view.invalidate();
                return;
        }
    }

    public mt(View view, cw cwVar) {
        this.c = view;
        this.b = cwVar;
    }
}
