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
    public final int f15382a = 0;
    public final int f15383b;
    public final boolean f15384c;
    public final Object d;
    public final Object e;
    public final Object f15385f;
    public final Object f15386g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = b2VarArr;
        this.f15383b = i10;
        this.f15385f = uri;
        this.f15386g = context;
        this.f15384c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15382a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.e, tLObject, this.f15383b, (Uri) this.f15385f, (Context) this.f15386g, this.f15384c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((h4) this.d, tLObject, this.f15383b, (TLRPC.WebPage) this.e, (MessageObject) this.f15385f, this.f15384c, (String) this.f15386g));
                return;
        }
    }

    public a(h4 h4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = h4Var;
        this.f15383b = i10;
        this.e = webPage;
        this.f15385f = messageObject;
        this.f15384c = z10;
        this.f15386g = str;
    }
}
