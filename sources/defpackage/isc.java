package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class isc extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        jsc jscVar = (jsc) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) c6cVar.H;
        jscVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                jscVar.b.p(gn5.p(vuc.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            jscVar.c.setText(tonconnectsession.manifest.name);
            jscVar.d.setText(gm.J0(tonconnectsession.manifest.url, false));
        }
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new jsc(context, ylbVar);
    }
}
