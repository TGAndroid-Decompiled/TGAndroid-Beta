package nf;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.h4;
public final class a implements RequestDelegate {
    public final int f15196a = 0;
    public final int f15197b;
    public final boolean f15198c;
    public final Object d;
    public final Object e;
    public final Object f15199f;
    public final Object f15200g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = b2VarArr;
        this.f15197b = i10;
        this.f15199f = uri;
        this.f15200g = context;
        this.f15198c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15196a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.e, tLObject, this.f15197b, (Uri) this.f15199f, (Context) this.f15200g, this.f15198c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((h4) this.d, tLObject, this.f15197b, (TLRPC.WebPage) this.e, (MessageObject) this.f15199f, this.f15198c, (String) this.f15200g));
                return;
        }
    }

    public a(h4 h4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = h4Var;
        this.f15197b = i10;
        this.e = webPage;
        this.f15199f = messageObject;
        this.f15198c = z10;
        this.f15200g = str;
    }
}
