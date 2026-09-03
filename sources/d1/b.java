package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
import v0.i;
public final class b implements Runnable {
    public final int f4068a;
    public final e f4069b;
    public final JSONException f4070c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f4068a = i10;
        this.f4069b = eVar;
        this.f4070c = jSONException;
    }

    @Override
    public final void run() {
        y0.a aVar;
        switch (this.f4068a) {
            case 0:
                i iVar = this.f4069b.f4076f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f4070c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4069b.f4076f;
                if (iVar2 != null) {
                    String message = this.f4070c.getMessage();
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
