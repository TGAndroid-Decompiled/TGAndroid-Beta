package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f17111a;
    public final m f17112b;
    public final r f17113c;
    public final Bundle e;
    public y f17115g;
    public List h;
    public i f17116i;
    public int f17117j;
    public int f17118k;
    public l f17119l;
    public t f17120m;
    public final Object d = new Object();
    public final RemoteCallbackList f17114f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f17111a = a2;
        m mVar = new m(this);
        this.f17112b = mVar;
        this.f17113c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f17119l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f17120m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f17120m = tVar;
        }
    }
}
