package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class yy implements Runnable {
    public final byte a;
    public final Context b;
    public final vnb c;
    public final TL_stars.StarGift d;

    public yy(Context context, vnb vnbVar, TL_stars.StarGift starGift, byte b) {
        this.a = b;
        this.b = context;
        this.c = vnbVar;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                fz.c1(this.c, this.b, this.d);
                return;
            default:
                fz.c1(this.c, this.b, this.d);
                return;
        }
    }
}
