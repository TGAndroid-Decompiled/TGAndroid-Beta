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
    public final int f17108a = 0;
    public final int f17109b;
    public final boolean f17110c;
    public final Object d;
    public final Object f17111e;
    public final Object f17112f;
    public final Object f17113g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f17111e = b2VarArr;
        this.f17109b = i10;
        this.f17112f = uri;
        this.f17113g = context;
        this.f17110c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17108a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.f17111e, tLObject, this.f17109b, (Uri) this.f17112f, (Context) this.f17113g, this.f17110c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f17109b, (TLRPC.WebPage) this.f17111e, (MessageObject) this.f17112f, this.f17110c, (String) this.f17113g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f17109b = i10;
        this.f17111e = webPage;
        this.f17112f = messageObject;
        this.f17110c = z10;
        this.f17113g = str;
    }
}
