package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;
public final class kg3 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;

    public kg3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mg3 mg3Var = (mg3) obj;
                Dialog dialog = mg3Var.w0;
                if (dialog != null) {
                    mg3Var.onDismiss(dialog);
                    return;
                }
                return;
            default:
                ImageView imageView = ((PhotoViewer) obj).E3;
                if (imageView != null) {
                    imageView.animate().alpha(0.0f).withEndAction(new q78(this, (byte) 3)).setDuration(150L).start();
                    return;
                }
                return;
        }
    }
}
