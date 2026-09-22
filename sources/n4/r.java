package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f14973a;
    public final q f14974b;
    public final x f14975c;
    public final Bundle e;
    public h0 f14977g;
    public List h;
    public m f14978i;
    public int f14979j;
    public int f14980k;
    public int f14981l;
    public p f14982m;
    public a0 f14983n;
    public final Object d = new Object();
    public final RemoteCallbackList f14976f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f14973a = a2;
        q qVar = new q(this);
        this.f14974b = qVar;
        this.f14975c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f14982m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f14983n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f14983n = a0Var;
        }
    }

    public void e(int i10) {
        this.f14979j = i10;
    }
}
