package of;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.i4;
public final class a implements RequestDelegate {
    public final int f16856a = 0;
    public final int f16857b;
    public final boolean f16858c;
    public final Object d;
    public final Object f16859e;
    public final Object f16860f;
    public final Object f16861g;

    public a(e eVar, a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f16859e = a2VarArr;
        this.f16857b = i10;
        this.f16860f = uri;
        this.f16861g = context;
        this.f16858c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16856a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (a2[]) this.f16859e, tLObject, this.f16857b, (Uri) this.f16860f, (Context) this.f16861g, this.f16858c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f16857b, (TLRPC.WebPage) this.f16859e, (MessageObject) this.f16860f, this.f16858c, (String) this.f16861g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f16857b = i10;
        this.f16859e = webPage;
        this.f16860f = messageObject;
        this.f16858c = z10;
        this.f16861g = str;
    }
}
