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
    public final int f16872a = 0;
    public final int f16873b;
    public final boolean f16874c;
    public final Object d;
    public final Object f16875e;
    public final Object f16876f;
    public final Object f16877g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f16875e = b2VarArr;
        this.f16873b = i10;
        this.f16876f = uri;
        this.f16877g = context;
        this.f16874c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16872a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.f16875e, tLObject, this.f16873b, (Uri) this.f16876f, (Context) this.f16877g, this.f16874c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f16873b, (TLRPC.WebPage) this.f16875e, (MessageObject) this.f16876f, this.f16874c, (String) this.f16877g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f16873b = i10;
        this.f16875e = webPage;
        this.f16876f = messageObject;
        this.f16874c = z10;
        this.f16877g = str;
    }
}
