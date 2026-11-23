package bi;

import android.content.DialogInterface;
public final class y3 implements DialogInterface.OnDismissListener {
    public final int f4304a;
    public final boolean[] f4305b;
    public final long f4306c;

    public y3(boolean[] zArr, long j3, int i7) {
        this.f4304a = i7;
        this.f4305b = zArr;
        this.f4306c = j3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4304a) {
            case 0:
                if (!this.f4305b[0]) {
                    i4.g(this.f4306c);
                    return;
                }
                return;
            default:
                if (!this.f4305b[0]) {
                    i4.g(this.f4306c);
                    return;
                }
                return;
        }
    }
}
