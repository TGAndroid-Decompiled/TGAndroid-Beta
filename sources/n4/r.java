package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f15188a;
    public final q f15189b;
    public final x f15190c;
    public final Bundle e;
    public h0 f15192g;
    public List h;
    public m f15193i;
    public int f15194j;
    public int f15195k;
    public int f15196l;
    public p f15197m;
    public a0 f15198n;
    public final Object d = new Object();
    public final RemoteCallbackList f15191f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15188a = a2;
        q qVar = new q(this);
        this.f15189b = qVar;
        this.f15190c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f15197m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f15198n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f15198n = a0Var;
        }
    }

    public void e(int i10) {
        this.f15194j = i10;
    }
}
