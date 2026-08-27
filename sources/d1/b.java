package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
import v0.i;

public final class b implements Runnable {

    public final int f4683a;

    public final e f4684b;

    public final JSONException f4685c;

    public b(e eVar, JSONException jSONException, int i10) {
        this.f4683a = i10;
        this.f4684b = eVar;
        this.f4685c = jSONException;
    }

    @Override
    public final void run() {
        switch (this.f4683a) {
            case 0:
                i iVar = this.f4684b.f4692f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.f4685c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.f4684b.f4692f;
                if (iVar2 == null) {
                    j.h("callback");
                    throw null;
                }
                String message = this.f4685c.getMessage();
                iVar2.onError((message == null || message.length() <= 0) ? new y0.a(new x0.a(4), "Unknown error") : new y0.a(new x0.a(4), message));
                return;
        }
    }
}
