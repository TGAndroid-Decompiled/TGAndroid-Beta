package af;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.l4;
public final class a implements RequestDelegate {
    public final int f163a = 0;
    public final int f164b;
    public final boolean f165c;
    public final Object d;
    public final Object f166e;
    public final Object f167f;
    public final Object f168g;

    public a(f fVar, d2[] d2VarArr, int i10, Uri uri, Context context, boolean z4) {
        this.d = fVar;
        this.f166e = d2VarArr;
        this.f164b = i10;
        this.f167f = uri;
        this.f168g = context;
        this.f165c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f163a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d((f) this.d, (d2[]) this.f166e, tLObject, this.f164b, (Uri) this.f167f, (Context) this.f168g, this.f165c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new d((l4) this.d, tLObject, this.f164b, (TLRPC.WebPage) this.f166e, (MessageObject) this.f167f, this.f165c, (String) this.f168g));
                return;
        }
    }

    public a(l4 l4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z4, String str) {
        this.d = l4Var;
        this.f164b = i10;
        this.f166e = webPage;
        this.f167f = messageObject;
        this.f165c = z4;
        this.f168g = str;
    }
}
