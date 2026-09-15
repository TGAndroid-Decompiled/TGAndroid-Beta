package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f14975a;
    public final q f14976b;
    public final x f14977c;
    public final Bundle e;
    public h0 f14979g;
    public List h;
    public m f14980i;
    public int f14981j;
    public int f14982k;
    public int f14983l;
    public p f14984m;
    public a0 f14985n;
    public final Object d = new Object();
    public final RemoteCallbackList f14978f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f14975a = a2;
        q qVar = new q(this);
        this.f14976b = qVar;
        this.f14977c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f14984m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f14985n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f14985n = a0Var;
        }
    }

    public void e(int i10) {
        this.f14981j = i10;
    }
}
