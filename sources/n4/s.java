package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class s {
    public final MediaSession f16344a;
    public final r f16345b;
    public final x f16346c;
    public final Bundle f16347e;
    public g0 f16349g;
    public List h;
    public n f16350i;
    public int f16351j;
    public int f16352k;
    public q f16353l;
    public a0 f16354m;
    public final Object d = new Object();
    public final RemoteCallbackList f16348f = new RemoteCallbackList();

    public s(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16344a = a2;
        r rVar = new r(this);
        this.f16345b = rVar;
        this.f16346c = new x(a2.getSessionToken(), rVar);
        this.f16347e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final q b() {
        q qVar;
        synchronized (this.d) {
            qVar = this.f16353l;
        }
        return qVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f16354m;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f16354m = a0Var;
        }
    }
}
