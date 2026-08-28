package d1;

import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f4241a;
    public final e f4242b;
    public final JSONException f4243c;

    public b(e eVar, JSONException jSONException, int i9) {
        this.f4241a = i9;
        this.f4242b = eVar;
        this.f4243c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f4241a) {
            case 0:
                i iVar = this.f4242b.f4250f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f4243c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4242b.f4250f;
                if (iVar2 != null) {
                    String message = this.f4243c.getMessage();
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
