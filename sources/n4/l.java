package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class l {
    public final MediaSession f13510a;
    public final k f13511b;
    public final p f13512c;
    public final Bundle e;
    public w f13514g;
    public List h;
    public i f13515i;
    public int f13516j;
    public int f13517k;
    public android.support.v4.media.session.s f13518l;
    public r f13519m;
    public final Object d = new Object();
    public final RemoteCallbackList f13513f = new RemoteCallbackList();

    public l(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f13510a = a2;
        k kVar = new k(this);
        this.f13511b = kVar;
        this.f13512c = new p(a2.getSessionToken(), kVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final android.support.v4.media.session.s b() {
        android.support.v4.media.session.s sVar;
        synchronized (this.d) {
            sVar = this.f13518l;
        }
        return sVar;
    }

    public r c() {
        r rVar;
        synchronized (this.d) {
            rVar = this.f13519m;
        }
        return rVar;
    }

    public void d(r rVar) {
        synchronized (this.d) {
            this.f13519m = rVar;
        }
    }
}
