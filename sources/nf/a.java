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
    public final int f15426a = 0;
    public final int f15427b;
    public final boolean f15428c;
    public final Object d;
    public final Object e;
    public final Object f15429f;
    public final Object f15430g;

    public a(e eVar, a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = a2VarArr;
        this.f15427b = i10;
        this.f15429f = uri;
        this.f15430g = context;
        this.f15428c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15426a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (a2[]) this.e, tLObject, this.f15427b, (Uri) this.f15429f, (Context) this.f15430g, this.f15428c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f15427b, (TLRPC.WebPage) this.e, (MessageObject) this.f15429f, this.f15428c, (String) this.f15430g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f15427b = i10;
        this.e = webPage;
        this.f15429f = messageObject;
        this.f15428c = z10;
        this.f15430g = str;
    }
}
