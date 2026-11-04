package ci;

import android.content.DialogInterface;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
public final class ja implements DialogInterface.OnDismissListener {
    public final int f5350a = 0;
    public final int f5351b;
    public final cs f5352c;

    public ja(int i3, va vaVar) {
        this.f5351b = i3;
        this.f5352c = vaVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5350a) {
            case 0:
                hs.f(this.f5351b).n((va) this.f5352c, 223);
                return;
            default:
                ug.f0 f0Var = (ug.f0) this.f5352c;
                f0Var.o0(false);
                f0Var.B0(this.f5351b);
                return;
        }
    }

    public ja(ug.f0 f0Var, int i3) {
        this.f5352c = f0Var;
        this.f5351b = i3;
    }
}
