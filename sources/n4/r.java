package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16476a;
    public final q f16477b;
    public final x f16478c;
    public final Bundle f16479e;
    public h0 f16481g;
    public List h;
    public m f16482i;
    public int f16483j;
    public int f16484k;
    public int f16485l;
    public p f16486m;
    public a0 f16487n;
    public final Object d = new Object();
    public final RemoteCallbackList f16480f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16476a = a2;
        q qVar = new q(this);
        this.f16477b = qVar;
        this.f16478c = new x(a2.getSessionToken(), qVar);
        this.f16479e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16486m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f16487n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f16487n = a0Var;
        }
    }

    public void e(int i10) {
        this.f16483j = i10;
    }
}
