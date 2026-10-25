package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f18679a;
    public final m f18680b;
    public final r f18681c;
    public final Bundle e;
    public z f18683g;
    public List h;
    public i f18684i;
    public int f18685j;
    public int f18686k;
    public l f18687l;
    public t f18688m;
    public final Object d = new Object();
    public final RemoteCallbackList f18682f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f18679a = a2;
        m mVar = new m(this);
        this.f18680b = mVar;
        this.f18681c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f18687l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f18688m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f18688m = tVar;
        }
    }
}
