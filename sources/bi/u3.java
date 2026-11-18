package bi;

import android.content.DialogInterface;
public final class u3 implements DialogInterface.OnDismissListener {
    public final int f4077a;
    public final boolean[] f4078b;
    public final long f4079c;

    public u3(boolean[] zArr, long j3, int i7) {
        this.f4077a = i7;
        this.f4078b = zArr;
        this.f4079c = j3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4077a) {
            case 0:
                if (!this.f4078b[0]) {
                    e4.g(this.f4079c);
                    return;
                }
                return;
            default:
                if (!this.f4078b[0]) {
                    e4.g(this.f4079c);
                    return;
                }
                return;
        }
    }
}
