package n4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class j {
    public final MediaController f14932a;
    public final Object f14933b = new Object();
    public final ArrayList f14934c = new ArrayList();
    public final HashMap d = new HashMap();
    public final x e;

    public j(Context context, x xVar) {
        this.e = xVar;
        MediaController mediaController = new MediaController(context, xVar.f14966b);
        this.f14932a = mediaController;
        if (xVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f14934c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else if (it.next() == null) {
            this.d.put(null, new i());
            throw null;
        } else {
            throw new ClassCastException();
        }
    }
}
