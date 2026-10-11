package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16675a;
    public final q f16676b;
    public final w f16677c;
    public final Bundle f16678e;
    public f0 f16680g;
    public List h;
    public m f16681i;
    public int f16682j;
    public int f16683k;
    public p f16684l;
    public z f16685m;
    public final Object d = new Object();
    public final RemoteCallbackList f16679f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16675a = a2;
        q qVar = new q(this);
        this.f16676b = qVar;
        this.f16677c = new w(a2.getSessionToken(), qVar);
        this.f16678e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16684l;
        }
        return pVar;
    }

    public z c() {
        z zVar;
        synchronized (this.d) {
            zVar = this.f16685m;
        }
        return zVar;
    }

    public void d(z zVar) {
        synchronized (this.d) {
            this.f16685m = zVar;
        }
    }
}
