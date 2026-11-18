package bi;

import android.content.DialogInterface;
public final class u3 implements DialogInterface.OnDismissListener {
    public final int f4106a;
    public final boolean[] f4107b;
    public final long f4108c;

    public u3(boolean[] zArr, long j3, int i7) {
        this.f4106a = i7;
        this.f4107b = zArr;
        this.f4108c = j3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4106a) {
            case 0:
                if (!this.f4107b[0]) {
                    f4.f(this.f4108c);
                    return;
                }
                return;
            default:
                if (!this.f4107b[0]) {
                    f4.f(this.f4108c);
                    return;
                }
                return;
        }
    }
}
