package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f17171a;
    public final m f17172b;
    public final r f17173c;
    public final Bundle e;
    public y f17175g;
    public List h;
    public i f17176i;
    public int f17177j;
    public int f17178k;
    public l f17179l;
    public t f17180m;
    public final Object d = new Object();
    public final RemoteCallbackList f17174f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f17171a = a2;
        m mVar = new m(this);
        this.f17172b = mVar;
        this.f17173c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f17179l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f17180m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f17180m = tVar;
        }
    }
}
