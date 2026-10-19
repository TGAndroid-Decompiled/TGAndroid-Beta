package d1;

import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f7720a;
    public final e f7721b;
    public final JSONException f7722c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f7720a = i10;
        this.f7721b = eVar;
        this.f7722c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7720a) {
            case 0:
                i iVar = this.f7721b.f7728f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f7722c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7721b.f7728f;
                if (iVar2 != null) {
                    String message = this.f7722c.getMessage();
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
