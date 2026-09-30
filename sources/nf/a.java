package nf;

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
    public final int f15441a = 0;
    public final int f15442b;
    public final boolean f15443c;
    public final Object d;
    public final Object e;
    public final Object f15444f;
    public final Object f15445g;

    public a(e eVar, a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = a2VarArr;
        this.f15442b = i10;
        this.f15444f = uri;
        this.f15445g = context;
        this.f15443c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15441a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (a2[]) this.e, tLObject, this.f15442b, (Uri) this.f15444f, (Context) this.f15445g, this.f15443c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f15442b, (TLRPC.WebPage) this.e, (MessageObject) this.f15444f, this.f15443c, (String) this.f15445g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f15442b = i10;
        this.e = webPage;
        this.f15444f = messageObject;
        this.f15443c = z10;
        this.f15445g = str;
    }
}
