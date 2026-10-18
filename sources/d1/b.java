package d1;

import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f7723a;
    public final e f7724b;
    public final JSONException f7725c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f7723a = i10;
        this.f7724b = eVar;
        this.f7725c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f7723a) {
            case 0:
                i iVar = this.f7724b.f7731f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f7725c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f7724b.f7731f;
                if (iVar2 != null) {
                    String message = this.f7725c.getMessage();
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
