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
    public final int f17154a = 0;
    public final int f17155b;
    public final boolean f17156c;
    public final Object d;
    public final Object f17157e;
    public final Object f17158f;
    public final Object f17159g;

    public a(e eVar, a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f17157e = a2VarArr;
        this.f17155b = i10;
        this.f17158f = uri;
        this.f17159g = context;
        this.f17156c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17154a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (a2[]) this.f17157e, tLObject, this.f17155b, (Uri) this.f17158f, (Context) this.f17159g, this.f17156c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((h4) this.d, tLObject, this.f17155b, (TLRPC.WebPage) this.f17157e, (MessageObject) this.f17158f, this.f17156c, (String) this.f17159g));
                return;
        }
    }

    public a(h4 h4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = h4Var;
        this.f17155b = i10;
        this.f17157e = webPage;
        this.f17158f = messageObject;
        this.f17156c = z10;
        this.f17159g = str;
    }
}
