package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;
public final class lj0 implements DialogInterface.OnClickListener {
    public final byte a = 1;
    public final Object b;

    public lj0(mj0 mj0Var) {
        this.b = new WeakReference(mj0Var);
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((mj0) weakReference.get()).e(true);
                    return;
                }
                return;
            default:
                ((ai4) obj).D0.e(true);
                return;
        }
    }

    public lj0(ai4 ai4Var) {
        this.b = ai4Var;
    }
}
