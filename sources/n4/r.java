package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16629a;
    public final q f16630b;
    public final x f16631c;
    public final Bundle f16632e;
    public h0 f16634g;
    public List h;
    public m f16635i;
    public int f16636j;
    public int f16637k;
    public int f16638l;
    public p f16639m;
    public a0 f16640n;
    public final Object d = new Object();
    public final RemoteCallbackList f16633f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16629a = a2;
        q qVar = new q(this);
        this.f16630b = qVar;
        this.f16631c = new x(a2.getSessionToken(), qVar);
        this.f16632e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16639m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f16640n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f16640n = a0Var;
        }
    }

    public void e(int i10) {
        this.f16636j = i10;
    }
}
