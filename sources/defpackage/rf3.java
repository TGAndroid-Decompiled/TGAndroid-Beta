package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;
public final class rf3 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;

    public rf3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                tf3 tf3Var = (tf3) obj;
                Dialog dialog = tf3Var.w0;
                if (dialog != null) {
                    tf3Var.onDismiss(dialog);
                    return;
                }
                return;
            default:
                ImageView imageView = ((PhotoViewer) obj).E3;
                if (imageView != null) {
                    imageView.animate().alpha(0.0f).withEndAction(new x38(this, (byte) 11)).setDuration(150L).start();
                    return;
                }
                return;
        }
    }
}
