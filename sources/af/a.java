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
    public final int f150a = 0;
    public final int f151b;
    public final boolean f152c;
    public final Object d;
    public final Object e;
    public final Object f153f;
    public final Object f154g;

    public a(f fVar, d2[] d2VarArr, int i10, Uri uri, Context context, boolean z4) {
        this.d = fVar;
        this.e = d2VarArr;
        this.f151b = i10;
        this.f153f = uri;
        this.f154g = context;
        this.f152c = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f150a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d((f) this.d, (d2[]) this.e, tLObject, this.f151b, (Uri) this.f153f, (Context) this.f154g, this.f152c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new d((l4) this.d, tLObject, this.f151b, (TLRPC.WebPage) this.e, (MessageObject) this.f153f, this.f152c, (String) this.f154g));
                return;
        }
    }

    public a(l4 l4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z4, String str) {
        this.d = l4Var;
        this.f151b = i10;
        this.e = webPage;
        this.f153f = messageObject;
        this.f152c = z4;
        this.f154g = str;
    }
}
