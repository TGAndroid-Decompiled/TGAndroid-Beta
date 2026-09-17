package nf;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.h4;
public final class a implements RequestDelegate {
    public final int f15208a = 0;
    public final int f15209b;
    public final boolean f15210c;
    public final Object d;
    public final Object e;
    public final Object f15211f;
    public final Object f15212g;

    public a(e eVar, c2[] c2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = c2VarArr;
        this.f15209b = i10;
        this.f15211f = uri;
        this.f15212g = context;
        this.f15210c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15208a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (c2[]) this.e, tLObject, this.f15209b, (Uri) this.f15211f, (Context) this.f15212g, this.f15210c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((h4) this.d, tLObject, this.f15209b, (TLRPC.WebPage) this.e, (MessageObject) this.f15211f, this.f15210c, (String) this.f15212g));
                return;
        }
    }

    public a(h4 h4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = h4Var;
        this.f15209b = i10;
        this.e = webPage;
        this.f15211f = messageObject;
        this.f15210c = z10;
        this.f15212g = str;
    }
}
