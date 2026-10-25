package d1;

import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f7824a;
    public final e f7825b;
    public final JSONException f7826c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f7824a = i10;
        this.f7825b = eVar;
        this.f7826c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7824a) {
            case 0:
                i iVar = this.f7825b.f7832f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f7826c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7825b.f7832f;
                if (iVar2 != null) {
                    String message = this.f7826c.getMessage();
                    if (message != null && message.length() > 0) {
                        aVar = new y0.a(new x0.a(4), message);
                    } else {
                        aVar = new y0.a(new x0.a(4), "Unknown error");
                    }
                    iVar2.onError(aVar);
                    return;
                }
                kotlin.jvm.internal.i.h("callback");
                throw null;
        }
    }
}
