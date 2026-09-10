package nf;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.j4;
public final class a implements RequestDelegate {
    public final int f14028a = 0;
    public final int f14029b;
    public final boolean f14030c;
    public final Object d;
    public final Object e;
    public final Object f14031f;
    public final Object f14032g;

    public a(e eVar, d2[] d2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = d2VarArr;
        this.f14029b = i10;
        this.f14031f = uri;
        this.f14032g = context;
        this.f14030c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14028a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (d2[]) this.e, tLObject, this.f14029b, (Uri) this.f14031f, (Context) this.f14032g, this.f14030c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((j4) this.d, tLObject, this.f14029b, (TLRPC.WebPage) this.e, (MessageObject) this.f14031f, this.f14030c, (String) this.f14032g));
                return;
        }
    }

    public a(j4 j4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = j4Var;
        this.f14029b = i10;
        this.e = webPage;
        this.f14031f = messageObject;
        this.f14030c = z10;
        this.f14032g = str;
    }
}
