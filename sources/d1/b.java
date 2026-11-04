package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
import v0.h;
public final class b implements Runnable {
    public final int f7987a;
    public final e f7988b;
    public final JSONException f7989c;

    public b(e eVar, JSONException jSONException, int i3) {
        this.f7987a = i3;
        this.f7988b = eVar;
        this.f7989c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7987a) {
            case 0:
                h hVar = this.f7988b.f7996f;
                if (hVar != null) {
                    hVar.a(new y0.a(new x0.a(4), this.f7989c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.f7988b.f7996f;
                if (hVar2 != null) {
                    String message = this.f7989c.getMessage();
                    if (message != null && message.length() > 0) {
                        aVar = new y0.a(new x0.a(4), message);
                    } else {
                        aVar = new y0.a(new x0.a(4), "Unknown error");
                    }
                    hVar2.a(aVar);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}
