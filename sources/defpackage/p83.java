package defpackage;

import android.content.DialogInterface;
public final class p83 implements DialogInterface.OnClickListener {
    public final byte a;
    public final int b;

    public p83(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = 2 - i;
                if (i2 == this.b) {
                    gba.v(-1);
                    return;
                } else {
                    gba.v(i2);
                    return;
                }
            default:
                int i3 = 2 - i;
                if (i3 == this.b) {
                    gba.v(-1);
                    return;
                } else {
                    gba.v(i3);
                    return;
                }
        }
    }
}
