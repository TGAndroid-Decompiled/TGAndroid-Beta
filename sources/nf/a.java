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
    public final int f15173a = 0;
    public final int f15174b;
    public final boolean f15175c;
    public final Object d;
    public final Object e;
    public final Object f15176f;
    public final Object f15177g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = b2VarArr;
        this.f15174b = i10;
        this.f15176f = uri;
        this.f15177g = context;
        this.f15175c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15173a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.e, tLObject, this.f15174b, (Uri) this.f15176f, (Context) this.f15177g, this.f15175c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f15174b, (TLRPC.WebPage) this.e, (MessageObject) this.f15176f, this.f15175c, (String) this.f15177g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f15174b = i10;
        this.e = webPage;
        this.f15176f = messageObject;
        this.f15175c = z10;
        this.f15177g = str;
    }
}
