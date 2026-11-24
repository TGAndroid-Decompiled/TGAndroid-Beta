package defpackage;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q04 implements View.OnClickListener {
    public final boolean[] a;
    public final i4d b;
    public final g6 c;

    public q04(g6 g6Var, boolean[] zArr, i4d i4dVar) {
        this.c = g6Var;
        this.a = zArr;
        this.b = i4dVar;
    }

    @Override
    public final void onClick(View view) {
        t04 t04Var = (t04) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        hd[] hdVarArr = {new hd(3, null, t04Var.G.getContext())};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        t14 t14Var = t04Var.G;
        String str = t04Var.x;
        if (str == null) {
            str = t14Var.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        gl.e3(new va7(this, hdVarArr, ConnectionsManager.getInstance(t14Var.d1).sendRequest(tL_messages_getEmojiURL, new en0(this, hdVarArr, this.b, (byte) 23)), (byte) 24), 1000L);
    }
}
