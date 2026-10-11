package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16639a;
    public final q f16640b;
    public final w f16641c;
    public final Bundle f16642e;
    public f0 f16644g;
    public List h;
    public m f16645i;
    public int f16646j;
    public int f16647k;
    public p f16648l;
    public z f16649m;
    public final Object d = new Object();
    public final RemoteCallbackList f16643f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16639a = a2;
        q qVar = new q(this);
        this.f16640b = qVar;
        this.f16641c = new w(a2.getSessionToken(), qVar);
        this.f16642e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16648l;
        }
        return pVar;
    }

    public z c() {
        z zVar;
        synchronized (this.d) {
            zVar = this.f16649m;
        }
        return zVar;
    }

    public void d(z zVar) {
        synchronized (this.d) {
            this.f16649m = zVar;
        }
    }
}
