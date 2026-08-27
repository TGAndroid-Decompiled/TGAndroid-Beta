package hh;

import android.content.DialogInterface;

public final class a3 implements DialogInterface.OnDismissListener {

    public final int f8948a;

    public final i5 f8949b;

    public a3(i5 i5Var, int i10) {
        this.f8948a = i10;
        this.f8949b = i5Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8948a) {
            case 0:
                this.f8949b.f9461f0.setLoading(false);
                break;
            default:
                this.f8949b.f9461f0.setLoading(false);
                break;
        }
    }
}
