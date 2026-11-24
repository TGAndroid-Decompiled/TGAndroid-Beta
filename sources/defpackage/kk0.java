package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;
public final class kk0 implements DialogInterface.OnClickListener {
    public final byte a = 1;
    public final Object b;

    public kk0(lk0 lk0Var) {
        this.b = new WeakReference(lk0Var);
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((lk0) weakReference.get()).e(true);
                    return;
                }
                return;
            default:
                ((di4) obj).D0.e(true);
                return;
        }
    }

    public kk0(di4 di4Var) {
        this.b = di4Var;
    }
}
