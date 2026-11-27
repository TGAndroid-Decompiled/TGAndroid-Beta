package defpackage;

import android.view.View;
public final class el3 implements View.OnClickListener {
    public final byte a;
    public final Runnable b;

    public el3(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            case 5:
                runnable.run();
                return;
            case 6:
                runnable.run();
                return;
            case 7:
                runnable.run();
                return;
            case 8:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
