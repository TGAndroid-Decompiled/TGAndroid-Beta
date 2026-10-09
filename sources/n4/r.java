package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16593a;
    public final q f16594b;
    public final w f16595c;
    public final Bundle f16596e;
    public f0 f16598g;
    public List h;
    public m f16599i;
    public int f16600j;
    public int f16601k;
    public p f16602l;
    public z f16603m;
    public final Object d = new Object();
    public final RemoteCallbackList f16597f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16593a = a2;
        q qVar = new q(this);
        this.f16594b = qVar;
        this.f16595c = new w(a2.getSessionToken(), qVar);
        this.f16596e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16602l;
        }
        return pVar;
    }

    public z c() {
        z zVar;
        synchronized (this.d) {
            zVar = this.f16603m;
        }
        return zVar;
    }

    public void d(z zVar) {
        synchronized (this.d) {
            this.f16603m = zVar;
        }
    }
}
