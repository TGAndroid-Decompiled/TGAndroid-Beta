package d1;

import kotlin.jvm.internal.i;
import org.json.JSONException;
import v0.h;
public final class b implements Runnable {
    public final int f5630a;
    public final f f5631b;
    public final JSONException f5632c;

    public b(f fVar, JSONException jSONException, int i10) {
        this.f5630a = i10;
        this.f5631b = fVar;
        this.f5632c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f5630a) {
            case 0:
                h hVar = this.f5631b.f5641f;
                if (hVar != null) {
                    hVar.g(new y0.a(new x0.a(4), this.f5632c.getMessage()));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f5631b.f5641f;
                if (hVar2 != null) {
                    String message = this.f5632c.getMessage();
                    if (message != null && message.length() > 0) {
                        aVar = new y0.a(new x0.a(4), message);
                    } else {
                        aVar = new y0.a(new x0.a(4), "Unknown error");
                    }
                    hVar2.g(aVar);
                    return;
                }
                i.h("callback");
                throw null;
        }
    }
}
