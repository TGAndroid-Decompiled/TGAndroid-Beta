package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
public final class b implements Runnable {
    public final int f7596a;
    public final e f7597b;
    public final JSONException f7598c;

    public b(e eVar, JSONException jSONException, int i7) {
        this.f7596a = i7;
        this.f7597b = eVar;
        this.f7598c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7596a) {
            case 0:
                v0.g gVar = this.f7597b.f7605f;
                if (gVar != null) {
                    gVar.T(new y0.a(new x0.a(4), this.f7598c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.f7597b.f7605f;
                if (gVar2 != null) {
                    String message = this.f7598c.getMessage();
                    if (message != null && message.length() > 0) {
                        aVar = new y0.a(new x0.a(4), message);
                    } else {
                        aVar = new y0.a(new x0.a(4), "Unknown error");
                    }
                    gVar2.T(aVar);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}
