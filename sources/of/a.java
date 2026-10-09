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
    public final int f17104a = 0;
    public final int f17105b;
    public final boolean f17106c;
    public final Object d;
    public final Object f17107e;
    public final Object f17108f;
    public final Object f17109g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f17107e = b2VarArr;
        this.f17105b = i10;
        this.f17108f = uri;
        this.f17109g = context;
        this.f17106c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17104a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.f17107e, tLObject, this.f17105b, (Uri) this.f17108f, (Context) this.f17109g, this.f17106c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f17105b, (TLRPC.WebPage) this.f17107e, (MessageObject) this.f17108f, this.f17106c, (String) this.f17109g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f17105b = i10;
        this.f17107e = webPage;
        this.f17108f = messageObject;
        this.f17106c = z10;
        this.f17109g = str;
    }
}
