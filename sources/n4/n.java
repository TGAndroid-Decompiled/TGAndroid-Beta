package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f17107a;
    public final m f17108b;
    public final r f17109c;
    public final Bundle e;
    public y f17111g;
    public List h;
    public i f17112i;
    public int f17113j;
    public int f17114k;
    public l f17115l;
    public t f17116m;
    public final Object d = new Object();
    public final RemoteCallbackList f17110f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f17107a = a2;
        m mVar = new m(this);
        this.f17108b = mVar;
        this.f17109c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f17115l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f17116m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f17116m = tVar;
        }
    }
}
