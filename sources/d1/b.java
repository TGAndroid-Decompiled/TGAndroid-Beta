package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
public final class b implements Runnable {
    public final int f7319a;
    public final e f7320b;
    public final JSONException f7321c;

    public b(e eVar, JSONException jSONException, int i7) {
        this.f7319a = i7;
        this.f7320b = eVar;
        this.f7321c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7319a) {
            case 0:
                v0.g gVar = this.f7320b.f7328f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(4), this.f7321c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7320b.f7328f;
                if (gVar2 != null) {
                    String message = this.f7321c.getMessage();
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
