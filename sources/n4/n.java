package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f17108a;
    public final m f17109b;
    public final r f17110c;
    public final Bundle e;
    public y f17112g;
    public List h;
    public i f17113i;
    public int f17114j;
    public int f17115k;
    public l f17116l;
    public t f17117m;
    public final Object d = new Object();
    public final RemoteCallbackList f17111f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f17108a = a2;
        m mVar = new m(this);
        this.f17109b = mVar;
        this.f17110c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f17116l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f17117m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f17117m = tVar;
        }
    }
}
