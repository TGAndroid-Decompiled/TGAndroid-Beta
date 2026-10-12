package n4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class j {
    public final MediaController f16322a;
    public final Object f16323b = new Object();
    public final ArrayList f16324c = new ArrayList();
    public final HashMap d = new HashMap();
    public final x f16325e;

    public j(Context context, x xVar) {
        this.f16325e = xVar;
        MediaController mediaController = new MediaController(context, xVar.f16360b);
        this.f16322a = mediaController;
        if (xVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.f16325e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f16324c;
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
