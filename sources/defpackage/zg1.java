package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zg1 implements kcc {
    public final wh1 a;
    public final int b;
    public final View c;

    public zg1(wh1 wh1Var, int i, View view) {
        this.a = wh1Var;
        this.b = i;
        this.c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z;
        Long l = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        wh1 wh1Var = this.a;
        int i = wh1Var.V;
        int i2 = this.b;
        if (i2 == i) {
            wh1Var.n = l.longValue();
            wh1Var.h1(true);
        } else if (i2 == wh1Var.d0) {
            wh1Var.x = l.longValue();
            wh1Var.i1();
        } else if (i2 == wh1Var.g0) {
            if (l.longValue() == 0) {
                wh1Var.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible p0 = uc7.p0(tL_starGiftUnique);
                if (num != null) {
                    p0.flags |= 1;
                    p0.until = num.intValue();
                }
                wh1Var.E = p0;
                wh1Var.s = -1;
                wh1Var.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                wh1Var.E = tL_emojiStatus;
            }
            wh1Var.i1();
        }
        wh1Var.e1(true);
        kh1 kh1Var = (kh1) this.c;
        long longValue = l.longValue();
        if (tL_starGiftUnique != null) {
            z = true;
        } else {
            z = false;
        }
        kh1Var.c(longValue, z, true);
        wh1Var.g1(true);
    }
}
