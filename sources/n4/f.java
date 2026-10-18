package n4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class f {
    public final MediaController f17088a;
    public final Object f17089b = new Object();
    public final ArrayList f17090c = new ArrayList();
    public final HashMap d = new HashMap();
    public final r e;

    public f(Context context, r rVar) {
        this.e = rVar;
        MediaController mediaController = new MediaController(context, rVar.f17121b);
        this.f17088a = mediaController;
        if (rVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new c1.d(this));
        }
    }

    public final void a() {
        if (this.e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f17090c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else if (it.next() == null) {
            this.d.put(null, new e());
            throw null;
        } else {
            throw new ClassCastException();
        }
    }
}
