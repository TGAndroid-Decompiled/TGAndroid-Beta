package defpackage;

import android.content.DialogInterface;
public final class i93 implements DialogInterface.OnClickListener {
    public final byte a;
    public final int b;

    public i93(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = 2 - i;
                if (i2 == this.b) {
                    xea.v(-1);
                    return;
                } else {
                    xea.v(i2);
                    return;
                }
            default:
                int i3 = 2 - i;
                if (i3 == this.b) {
                    xea.v(-1);
                    return;
                } else {
                    xea.v(i3);
                    return;
                }
        }
    }
}
