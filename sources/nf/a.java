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
    public final int f15425a = 0;
    public final int f15426b;
    public final boolean f15427c;
    public final Object d;
    public final Object e;
    public final Object f15428f;
    public final Object f15429g;

    public a(e eVar, a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = a2VarArr;
        this.f15426b = i10;
        this.f15428f = uri;
        this.f15429g = context;
        this.f15427c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15425a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (a2[]) this.e, tLObject, this.f15426b, (Uri) this.f15428f, (Context) this.f15429g, this.f15427c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f15426b, (TLRPC.WebPage) this.e, (MessageObject) this.f15428f, this.f15427c, (String) this.f15429g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f15426b = i10;
        this.e = webPage;
        this.f15428f = messageObject;
        this.f15427c = z10;
        this.f15429g = str;
    }
}
