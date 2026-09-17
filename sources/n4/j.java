package n4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class j {
    public final MediaController f16482a;
    public final Object f16483b = new Object();
    public final ArrayList f16484c = new ArrayList();
    public final HashMap d = new HashMap();
    public final x f16485e;

    public j(Context context, x xVar) {
        this.f16485e = xVar;
        MediaController mediaController = new MediaController(context, xVar.f16520b);
        this.f16482a = mediaController;
        if (xVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.f16485e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f16484c;
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
