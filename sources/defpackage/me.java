package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class me implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Runnable b;

    public me(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                runnable.run();
                return;
            default:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
