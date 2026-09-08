package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16503a;
    public final q f16504b;
    public final x f16505c;
    public final Bundle f16506e;
    public h0 f16508g;
    public List h;
    public m f16509i;
    public int f16510j;
    public int f16511k;
    public int f16512l;
    public p f16513m;
    public a0 f16514n;
    public final Object d = new Object();
    public final RemoteCallbackList f16507f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16503a = a2;
        q qVar = new q(this);
        this.f16504b = qVar;
        this.f16505c = new x(a2.getSessionToken(), qVar);
        this.f16506e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16513m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f16514n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f16514n = a0Var;
        }
    }

    public void e(int i10) {
        this.f16510j = i10;
    }
}
