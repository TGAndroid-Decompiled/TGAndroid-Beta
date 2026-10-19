package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f17110a;
    public final m f17111b;
    public final r f17112c;
    public final Bundle e;
    public y f17114g;
    public List h;
    public i f17115i;
    public int f17116j;
    public int f17117k;
    public l f17118l;
    public t f17119m;
    public final Object d = new Object();
    public final RemoteCallbackList f17113f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f17110a = a2;
        m mVar = new m(this);
        this.f17111b = mVar;
        this.f17112c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f17118l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f17119m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f17119m = tVar;
        }
    }
}
