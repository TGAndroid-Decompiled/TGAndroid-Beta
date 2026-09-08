package d1;

import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f6484a;
    public final e f6485b;
    public final JSONException f6486c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f6484a = i10;
        this.f6485b = eVar;
        this.f6486c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f6484a) {
            case 0:
                i iVar = this.f6485b.f6493f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f6486c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f6485b.f6493f;
                if (iVar2 != null) {
                    String message = this.f6486c.getMessage();
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
