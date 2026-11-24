package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class gqc extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        hqc hqcVar = (hqc) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) c4cVar.H;
        hqcVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                hqcVar.b.p(gl5.p(usc.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            hqcVar.c.setText(tonconnectsession.manifest.name);
            hqcVar.d.setText(gl.J0(tonconnectsession.manifest.url, false));
        }
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new hqc(context, wjbVar);
    }
}
