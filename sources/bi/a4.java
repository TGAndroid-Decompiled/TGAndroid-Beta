package bi;

import android.content.DialogInterface;
public final class a4 implements DialogInterface.OnDismissListener {
    public final int f3351a;
    public final boolean[] f3352b;
    public final long f3353c;

    public a4(boolean[] zArr, long j3, int i7) {
        this.f3351a = i7;
        this.f3352b = zArr;
        this.f3353c = j3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f3351a) {
            case 0:
                if (!this.f3352b[0]) {
                    l4.g(this.f3353c);
                    return;
                }
                return;
            default:
                if (!this.f3352b[0]) {
                    l4.g(this.f3353c);
                    return;
                }
                return;
        }
    }
}
