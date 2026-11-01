package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f13511a;
    public final k f13512b;
    public final p f13513c;
    public final Bundle e;
    public w f13515g;
    public List h;
    public i f13516i;
    public int f13517j;
    public int f13518k;
    public android.support.v4.media.session.s f13519l;
    public r f13520m;
    public final Object d = new Object();
    public final RemoteCallbackList f13514f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f13511a = a2;
        k kVar = new k(this);
        this.f13512b = kVar;
        this.f13513c = new p(a2.getSessionToken(), kVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f13519l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f13520m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f13520m = rVar;
        }
    }
}
