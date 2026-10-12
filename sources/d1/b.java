package d1;

import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f8033a;
    public final e f8034b;
    public final JSONException f8035c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f8033a = i10;
        this.f8034b = eVar;
        this.f8035c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f8033a) {
            case 0:
                i iVar = this.f8034b.f8042f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f8035c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8034b.f8042f;
                if (iVar2 != null) {
                    String message = this.f8035c.getMessage();
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
