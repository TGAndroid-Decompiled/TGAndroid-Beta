package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f15212a;
    public final q f15213b;
    public final x f15214c;
    public final Bundle e;
    public h0 f15216g;
    public List h;
    public m f15217i;
    public int f15218j;
    public int f15219k;
    public int f15220l;
    public p f15221m;
    public a0 f15222n;
    public final Object d = new Object();
    public final RemoteCallbackList f15215f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15212a = a2;
        q qVar = new q(this);
        this.f15213b = qVar;
        this.f15214c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f15221m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f15222n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f15222n = a0Var;
        }
    }

    public void e(int i10) {
        this.f15218j = i10;
    }
}
