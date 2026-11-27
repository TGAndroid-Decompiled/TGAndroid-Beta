package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
public final class b4b implements ncc, occ {
    public final StickersActivity a;

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        StickersActivity stickersActivity = this.a;
        boolean z = false;
        if (stickersActivity.x.isEmpty() && (b8cVar.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.q0((p3b) view);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.k0((b8c) obj, (View) obj2);
    }
}
