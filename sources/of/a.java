package of;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.h4;
public final class a implements RequestDelegate {
    public final int f17190a = 0;
    public final int f17191b;
    public final boolean f17192c;
    public final Object d;
    public final Object f17193e;
    public final Object f17194f;
    public final Object f17195g;

    public a(e eVar, a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f17193e = a2VarArr;
        this.f17191b = i10;
        this.f17194f = uri;
        this.f17195g = context;
        this.f17192c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17190a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (a2[]) this.f17193e, tLObject, this.f17191b, (Uri) this.f17194f, (Context) this.f17195g, this.f17192c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((h4) this.d, tLObject, this.f17191b, (TLRPC.WebPage) this.f17193e, (MessageObject) this.f17194f, this.f17192c, (String) this.f17195g));
                return;
        }
    }

    public a(h4 h4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = h4Var;
        this.f17191b = i10;
        this.f17193e = webPage;
        this.f17194f = messageObject;
        this.f17192c = z10;
        this.f17195g = str;
    }
}
