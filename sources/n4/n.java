package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f18678a;
    public final m f18679b;
    public final r f18680c;
    public final Bundle e;
    public z f18682g;
    public List h;
    public i f18683i;
    public int f18684j;
    public int f18685k;
    public l f18686l;
    public t f18687m;
    public final Object d = new Object();
    public final RemoteCallbackList f18681f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f18678a = a2;
        m mVar = new m(this);
        this.f18679b = mVar;
        this.f18680c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f18686l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f18687m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f18687m = tVar;
        }
    }
}
