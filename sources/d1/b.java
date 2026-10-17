package d1;

import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f7722a;
    public final e f7723b;
    public final JSONException f7724c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f7722a = i10;
        this.f7723b = eVar;
        this.f7724c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7722a) {
            case 0:
                i iVar = this.f7723b.f7730f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f7724c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7723b.f7730f;
                if (iVar2 != null) {
                    String message = this.f7724c.getMessage();
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
