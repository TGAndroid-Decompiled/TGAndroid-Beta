package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
public final class d0b implements n8c, o8c {
    public final StickersActivity a;

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        StickersActivity stickersActivity = this.a;
        boolean z = false;
        if (stickersActivity.x.isEmpty() && (c4cVar.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.q0((rza) view);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.k0((c4c) obj, (View) obj2);
    }
}
