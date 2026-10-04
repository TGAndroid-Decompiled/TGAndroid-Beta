package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16619a;
    public final q f16620b;
    public final x f16621c;
    public final Bundle f16622e;
    public h0 f16624g;
    public List h;
    public m f16625i;
    public int f16626j;
    public int f16627k;
    public int f16628l;
    public p f16629m;
    public a0 f16630n;
    public final Object d = new Object();
    public final RemoteCallbackList f16623f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16619a = a2;
        q qVar = new q(this);
        this.f16620b = qVar;
        this.f16621c = new x(a2.getSessionToken(), qVar);
        this.f16622e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16629m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f16630n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f16630n = a0Var;
        }
    }

    public void e(int i10) {
        this.f16626j = i10;
    }
}
