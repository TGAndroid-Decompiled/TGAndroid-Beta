package n4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class j {
    public final MediaController f16455a;
    public final Object f16456b = new Object();
    public final ArrayList f16457c = new ArrayList();
    public final HashMap d = new HashMap();
    public final x f16458e;

    public j(Context context, x xVar) {
        this.f16458e = xVar;
        MediaController mediaController = new MediaController(context, xVar.f16493b);
        this.f16455a = mediaController;
        if (xVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.f16458e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f16457c;
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
