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
    public final int f16867a = 0;
    public final int f16868b;
    public final boolean f16869c;
    public final Object d;
    public final Object f16870e;
    public final Object f16871f;
    public final Object f16872g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f16870e = b2VarArr;
        this.f16868b = i10;
        this.f16871f = uri;
        this.f16872g = context;
        this.f16869c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16867a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.f16870e, tLObject, this.f16868b, (Uri) this.f16871f, (Context) this.f16872g, this.f16869c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f16868b, (TLRPC.WebPage) this.f16870e, (MessageObject) this.f16871f, this.f16869c, (String) this.f16872g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f16868b = i10;
        this.f16870e = webPage;
        this.f16871f = messageObject;
        this.f16869c = z10;
        this.f16872g = str;
    }
}
