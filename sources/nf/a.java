package nf;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.j4;
public final class a implements RequestDelegate {
    public final int f15460a = 0;
    public final int f15461b;
    public final boolean f15462c;
    public final Object d;
    public final Object e;
    public final Object f15463f;
    public final Object f15464g;

    public a(e eVar, c2[] c2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = c2VarArr;
        this.f15461b = i10;
        this.f15463f = uri;
        this.f15464g = context;
        this.f15462c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15460a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c((e) this.d, (c2[]) this.e, tLObject, this.f15461b, (Uri) this.f15463f, (Context) this.f15464g, this.f15462c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c((j4) this.d, tLObject, this.f15461b, (TLRPC.WebPage) this.e, (MessageObject) this.f15463f, this.f15462c, (String) this.f15464g));
                return;
        }
    }

    public a(j4 j4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = j4Var;
        this.f15461b = i10;
        this.e = webPage;
        this.f15463f = messageObject;
        this.f15462c = z10;
        this.f15464g = str;
    }
}
