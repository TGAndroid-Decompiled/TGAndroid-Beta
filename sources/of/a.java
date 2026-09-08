package of;

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
    public final int f17017a = 0;
    public final int f17018b;
    public final boolean f17019c;
    public final Object d;
    public final Object f17020e;
    public final Object f17021f;
    public final Object f17022g;

    public a(e eVar, b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f17020e = b2VarArr;
        this.f17018b = i10;
        this.f17021f = uri;
        this.f17022g = context;
        this.f17019c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17017a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (b2[]) this.f17020e, tLObject, this.f17018b, (Uri) this.f17021f, (Context) this.f17022g, this.f17019c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f17018b, (TLRPC.WebPage) this.f17020e, (MessageObject) this.f17021f, this.f17019c, (String) this.f17022g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f17018b = i10;
        this.f17020e = webPage;
        this.f17021f = messageObject;
        this.f17019c = z10;
        this.f17022g = str;
    }
}
