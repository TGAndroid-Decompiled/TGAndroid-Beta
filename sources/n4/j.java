package n4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class j {
    public final MediaController f16654a;
    public final Object f16655b = new Object();
    public final ArrayList f16656c = new ArrayList();
    public final HashMap d = new HashMap();
    public final w f16657e;

    public j(Context context, w wVar) {
        this.f16657e = wVar;
        MediaController mediaController = new MediaController(context, wVar.f16691b);
        this.f16654a = mediaController;
        if (wVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.f16657e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f16656c;
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
