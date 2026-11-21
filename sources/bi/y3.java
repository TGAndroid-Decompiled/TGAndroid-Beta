package bi;

import android.content.DialogInterface;
public final class y3 implements DialogInterface.OnDismissListener {
    public final int f4283a;
    public final boolean[] f4284b;
    public final long f4285c;

    public y3(boolean[] zArr, long j3, int i7) {
        this.f4283a = i7;
        this.f4284b = zArr;
        this.f4285c = j3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4283a) {
            case 0:
                if (!this.f4284b[0]) {
                    i4.g(this.f4285c);
                    return;
                }
                return;
            default:
                if (!this.f4284b[0]) {
                    i4.g(this.f4285c);
                    return;
                }
                return;
        }
    }
}
