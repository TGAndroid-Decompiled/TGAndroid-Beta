package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f15728a;
    public final m f15729b;
    public final r f15730c;
    public final Bundle e;
    public y f15732g;
    public List h;
    public i f15733i;
    public int f15734j;
    public int f15735k;
    public l f15736l;
    public t f15737m;
    public final Object d = new Object();
    public final RemoteCallbackList f15731f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15728a = a2;
        m mVar = new m(this);
        this.f15729b = mVar;
        this.f15730c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f15736l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f15737m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f15737m = tVar;
        }
    }
}
