package defpackage;

import android.content.DialogInterface;
public final class ba3 implements DialogInterface.OnClickListener {
    public final byte a;
    public final int b;

    public ba3(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = 2 - i;
                if (i2 == this.b) {
                    gda.v(-1);
                    return;
                } else {
                    gda.v(i2);
                    return;
                }
            default:
                int i3 = 2 - i;
                if (i3 == this.b) {
                    gda.v(-1);
                    return;
                } else {
                    gda.v(i3);
                    return;
                }
        }
    }
}
