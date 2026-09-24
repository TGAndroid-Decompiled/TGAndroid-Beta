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
    public final int f15410a = 0;
    public final int f15411b;
    public final boolean f15412c;
    public final Object d;
    public final Object e;
    public final Object f15413f;
    public final Object f15414g;

    public a(e eVar, a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = a2VarArr;
        this.f15411b = i10;
        this.f15413f = uri;
        this.f15414g = context;
        this.f15412c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15410a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (a2[]) this.e, tLObject, this.f15411b, (Uri) this.f15413f, (Context) this.f15414g, this.f15412c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f15411b, (TLRPC.WebPage) this.e, (MessageObject) this.f15413f, this.f15412c, (String) this.f15414g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f15411b = i10;
        this.e = webPage;
        this.f15413f = messageObject;
        this.f15412c = z10;
        this.f15414g = str;
    }
}
