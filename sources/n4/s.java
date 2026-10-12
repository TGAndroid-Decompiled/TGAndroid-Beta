package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class s {
    public final MediaSession f16343a;
    public final r f16344b;
    public final x f16345c;
    public final Bundle f16346e;
    public g0 f16348g;
    public List h;
    public n f16349i;
    public int f16350j;
    public int f16351k;
    public q f16352l;
    public a0 f16353m;
    public final Object d = new Object();
    public final RemoteCallbackList f16347f = new RemoteCallbackList();

    public s(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16343a = a2;
        r rVar = new r(this);
        this.f16344b = rVar;
        this.f16345c = new x(a2.getSessionToken(), rVar);
        this.f16346e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final q b() {
        q qVar;
        synchronized (this.d) {
            qVar = this.f16352l;
        }
        return qVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f16353m;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f16353m = a0Var;
        }
    }
}
