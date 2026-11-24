package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yh1 implements lac {
    public final vi1 a;
    public final int b;
    public final View c;

    public yh1(vi1 vi1Var, int i, View view) {
        this.a = vi1Var;
        this.b = i;
        this.c = view;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        boolean z;
        Long l = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        vi1 vi1Var = this.a;
        int i = vi1Var.V;
        int i2 = this.b;
        if (i2 == i) {
            vi1Var.n = l.longValue();
            vi1Var.h1(true);
        } else if (i2 == vi1Var.d0) {
            vi1Var.x = l.longValue();
            vi1Var.i1();
        } else if (i2 == vi1Var.g0) {
            if (l.longValue() == 0) {
                vi1Var.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible n0 = oc7.n0(tL_starGiftUnique);
                if (num != null) {
                    n0.flags |= 1;
                    n0.until = num.intValue();
                }
                vi1Var.E = n0;
                vi1Var.s = -1;
                vi1Var.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                vi1Var.E = tL_emojiStatus;
            }
            vi1Var.i1();
        }
        vi1Var.e1(true);
        ji1 ji1Var = (ji1) this.c;
        long longValue = l.longValue();
        if (tL_starGiftUnique != null) {
            z = true;
        } else {
            z = false;
        }
        ji1Var.c(longValue, z, true);
        vi1Var.g1(true);
    }
}
