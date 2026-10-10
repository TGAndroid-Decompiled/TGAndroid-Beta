package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16597a;
    public final q f16598b;
    public final w f16599c;
    public final Bundle f16600e;
    public f0 f16602g;
    public List h;
    public m f16603i;
    public int f16604j;
    public int f16605k;
    public p f16606l;
    public z f16607m;
    public final Object d = new Object();
    public final RemoteCallbackList f16601f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16597a = a2;
        q qVar = new q(this);
        this.f16598b = qVar;
        this.f16599c = new w(a2.getSessionToken(), qVar);
        this.f16600e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16606l;
        }
        return pVar;
    }

    public z c() {
        z zVar;
        synchronized (this.d) {
            zVar = this.f16607m;
        }
        return zVar;
    }

    public void d(z zVar) {
        synchronized (this.d) {
            this.f16607m = zVar;
        }
    }
}
