package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class n {
    public final MediaSession f16014a;
    public final m f16015b;
    public final r f16016c;
    public final Bundle e;
    public y f16018g;
    public List h;
    public i f16019i;
    public int f16020j;
    public int f16021k;
    public l f16022l;
    public t f16023m;
    public final Object d = new Object();
    public final RemoteCallbackList f16017f = new RemoteCallbackList();

    public n(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16014a = a2;
        m mVar = new m(this);
        this.f16015b = mVar;
        this.f16016c = new r(a2.getSessionToken(), mVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final l b() {
        l lVar;
        synchronized (this.d) {
            lVar = this.f16022l;
        }
        return lVar;
    }

    public t c() {
        t tVar;
        synchronized (this.d) {
            tVar = this.f16023m;
        }
        return tVar;
    }

    public void d(t tVar) {
        synchronized (this.d) {
            this.f16023m = tVar;
        }
    }
}
