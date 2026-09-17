package of;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.i4;
public final class a implements RequestDelegate {
    public final int f16990a = 0;
    public final int f16991b;
    public final boolean f16992c;
    public final Object d;
    public final Object f16993e;
    public final Object f16994f;
    public final Object f16995g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f16993e = b2VarArr;
        this.f16991b = i10;
        this.f16994f = uri;
        this.f16995g = context;
        this.f16992c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16990a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.f16993e, tLObject, this.f16991b, (Uri) this.f16994f, (Context) this.f16995g, this.f16992c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f16991b, (TLRPC.WebPage) this.f16993e, (MessageObject) this.f16994f, this.f16992c, (String) this.f16995g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f16991b = i10;
        this.f16993e = webPage;
        this.f16994f = messageObject;
        this.f16992c = z10;
        this.f16995g = str;
    }
}
