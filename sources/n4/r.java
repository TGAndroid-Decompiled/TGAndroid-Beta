package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f14950a;
    public final q f14951b;
    public final x f14952c;
    public final Bundle e;
    public h0 f14954g;
    public List h;
    public m f14955i;
    public int f14956j;
    public int f14957k;
    public int f14958l;
    public p f14959m;
    public a0 f14960n;
    public final Object d = new Object();
    public final RemoteCallbackList f14953f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f14950a = a2;
        q qVar = new q(this);
        this.f14951b = qVar;
        this.f14952c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f14959m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f14960n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f14960n = a0Var;
        }
    }

    public void e(int i10) {
        this.f14956j = i10;
    }
}
