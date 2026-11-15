package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
public final class b implements Runnable {
    public final int f7322a;
    public final e f7323b;
    public final JSONException f7324c;

    public b(e eVar, JSONException jSONException, int i7) {
        this.f7322a = i7;
        this.f7323b = eVar;
        this.f7324c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7322a) {
            case 0:
                v0.g gVar = this.f7323b.f7331f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(4), this.f7324c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7323b.f7331f;
                if (gVar2 != null) {
                    String message = this.f7324c.getMessage();
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
