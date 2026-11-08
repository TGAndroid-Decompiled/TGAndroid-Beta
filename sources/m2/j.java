package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class j {
    public static final j f19561c;
    public final String f19562a;
    public final i f19563b;

    static {
        new j("");
        f19561c = new j("preload");
    }

    public j(String str) {
        i iVar;
        this.f19562a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new i();
        } else {
            iVar = null;
        }
        this.f19563b = iVar;
    }

    public final synchronized LogSessionId a() {
        i iVar;
        iVar = this.f19563b;
        iVar.getClass();
        return (LogSessionId) iVar.f19560b;
    }
}
