package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16624a;
    public final q f16625b;
    public final x f16626c;
    public final Bundle f16627e;
    public h0 f16629g;
    public List h;
    public m f16630i;
    public int f16631j;
    public int f16632k;
    public int f16633l;
    public p f16634m;
    public a0 f16635n;
    public final Object d = new Object();
    public final RemoteCallbackList f16628f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16624a = a2;
        q qVar = new q(this);
        this.f16625b = qVar;
        this.f16626c = new x(a2.getSessionToken(), qVar);
        this.f16627e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16634m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f16635n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f16635n = a0Var;
        }
    }

    public void e(int i10) {
        this.f16631j = i10;
    }
}
