package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class xy implements Runnable {
    public final byte a;
    public final Context b;
    public final wjb c;
    public final TL_stars.StarGift d;

    public xy(Context context, wjb wjbVar, TL_stars.StarGift starGift, byte b) {
        this.a = b;
        this.b = context;
        this.c = wjbVar;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ez.b1(this.c, this.b, this.d);
                return;
            default:
                ez.b1(this.c, this.b, this.d);
                return;
        }
    }
}
