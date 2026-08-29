package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f5250a;
    public final e f5251b;
    public final JSONException f5252c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f5250a = i10;
        this.f5251b = eVar;
        this.f5252c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f5250a) {
            case 0:
                i iVar = this.f5251b.f5259f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f5252c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f5251b.f5259f;
                if (iVar2 != null) {
                    String message = this.f5252c.getMessage();
                    if (message != null && message.length() > 0) {
                        aVar = new y0.a(new x0.a(4), message);
                    } else {
                        aVar = new y0.a(new x0.a(4), "Unknown error");
                    }
                    iVar2.onError(aVar);
                    return;
                }
                j.h("callback");
                throw null;
        }
    }
}
