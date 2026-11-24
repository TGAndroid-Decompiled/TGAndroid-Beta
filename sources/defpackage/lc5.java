package defpackage;

import android.content.Context;
import android.view.View;
public final class lc5 extends a1b {
    public final byte L;

    public lc5(Context context, View view, int i, ylb ylbVar, byte b) {
        super(context, view, i, ylbVar);
        this.L = b;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.L) {
            case 0:
                super.onAttachedToWindow();
                this.b.getImageReceiver().w0(false);
                return;
            case 1:
                super.onAttachedToWindow();
                this.b.getImageReceiver().w0(false);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.L) {
            case 2:
                super.setVisibility(i);
                if (i != 0) {
                    e(false, false);
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }
}
