package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;
public final class kj0 implements DialogInterface.OnClickListener {
    public final byte a = 1;
    public final Object b;

    public kj0(lj0 lj0Var) {
        this.b = new WeakReference(lj0Var);
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((lj0) weakReference.get()).e(true);
                    return;
                }
                return;
            default:
                ((bg4) obj).D0.e(true);
                return;
        }
    }

    public kj0(bg4 bg4Var) {
        this.b = bg4Var;
    }
}
