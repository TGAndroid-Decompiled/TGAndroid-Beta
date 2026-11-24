package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
public final class e2b implements oac, pac {
    public final StickersActivity a;

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        StickersActivity stickersActivity = this.a;
        boolean z = false;
        if (stickersActivity.x.isEmpty() && (c6cVar.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.r0((s1b) view);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.l0((c6c) obj, (View) obj2);
    }
}
