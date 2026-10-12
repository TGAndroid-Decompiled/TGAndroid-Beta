package of;

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
    public final int f16855a = 0;
    public final int f16856b;
    public final boolean f16857c;
    public final Object d;
    public final Object f16858e;
    public final Object f16859f;
    public final Object f16860g;

    public a(e eVar, a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.f16858e = a2VarArr;
        this.f16856b = i10;
        this.f16859f = uri;
        this.f16860g = context;
        this.f16857c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16855a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (a2[]) this.f16858e, tLObject, this.f16856b, (Uri) this.f16859f, (Context) this.f16860g, this.f16857c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((i4) this.d, tLObject, this.f16856b, (TLRPC.WebPage) this.f16858e, (MessageObject) this.f16859f, this.f16857c, (String) this.f16860g));
                return;
        }
    }

    public a(i4 i4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = i4Var;
        this.f16856b = i10;
        this.f16858e = webPage;
        this.f16859f = messageObject;
        this.f16857c = z10;
        this.f16860g = str;
    }
}
