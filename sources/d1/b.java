package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f4146a;
    public final e f4147b;
    public final JSONException f4148c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f4146a = i10;
        this.f4147b = eVar;
        this.f4148c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f4146a) {
            case 0:
                i iVar = this.f4147b.f4155f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f4148c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4147b.f4155f;
                if (iVar2 != null) {
                    String message = this.f4148c.getMessage();
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
