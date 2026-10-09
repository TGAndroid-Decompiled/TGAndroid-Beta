package d1;

import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f8036a;
    public final e f8037b;
    public final JSONException f8038c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f8036a = i10;
        this.f8037b = eVar;
        this.f8038c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f8036a) {
            case 0:
                i iVar = this.f8037b.f8045f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f8038c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f8037b.f8045f;
                if (iVar2 != null) {
                    String message = this.f8038c.getMessage();
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
