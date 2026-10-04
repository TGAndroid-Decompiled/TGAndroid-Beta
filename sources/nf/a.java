package nf;

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
    public final int f16862a = 0;
    public final int f16863b;
    public final boolean f16864c;
    public final Object d;
    public final Object f16865e;
    public final Object f16866f;
    public final Object f16867g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f16865e = b2VarArr;
        this.f16863b = i10;
        this.f16866f = uri;
        this.f16867g = context;
        this.f16864c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16862a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.f16865e, tLObject, this.f16863b, (Uri) this.f16866f, (Context) this.f16867g, this.f16864c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f16863b, (TLRPC.WebPage) this.f16865e, (MessageObject) this.f16866f, this.f16864c, (String) this.f16867g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f16863b = i10;
        this.f16865e = webPage;
        this.f16866f = messageObject;
        this.f16864c = z10;
        this.f16867g = str;
    }
}
