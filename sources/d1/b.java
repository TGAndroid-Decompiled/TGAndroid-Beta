package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
public final class b implements Runnable {
    public final int f7930a;
    public final e f7931b;
    public final JSONException f7932c;

    public b(e eVar, JSONException jSONException, int i7) {
        this.f7930a = i7;
        this.f7931b = eVar;
        this.f7932c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7930a) {
            case 0:
                v0.g gVar = this.f7931b.f7939f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(4), this.f7932c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7931b.f7939f;
                if (gVar2 != null) {
                    String message = this.f7932c.getMessage();
                    if (message != null && message.length() > 0) {
                        aVar = new y0.a(new x0.a(4), message);
                    } else {
                        aVar = new y0.a(new x0.a(4), "Unknown error");
                    }
                    gVar2.a(aVar);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}
