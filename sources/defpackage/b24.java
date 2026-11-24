package defpackage;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b24 implements View.OnClickListener {
    public final boolean[] a;
    public final k6d b;
    public final g6 c;

    public b24(g6 g6Var, boolean[] zArr, k6d k6dVar) {
        this.c = g6Var;
        this.a = zArr;
        this.b = k6dVar;
    }

    @Override
    public final void onClick(View view) {
        e24 e24Var = (e24) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        he[] heVarArr = {new he(3, null, e24Var.G.getContext())};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        e34 e34Var = e24Var.G;
        String str = e24Var.x;
        if (str == null) {
            str = e34Var.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        gm.d3(new wc7(this, heVarArr, ConnectionsManager.getInstance(e34Var.d1).sendRequest(tL_messages_getEmojiURL, new eo0(this, heVarArr, this.b, (byte) 23)), (byte) 24), 1000L);
    }
}
