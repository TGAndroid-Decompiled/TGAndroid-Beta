package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f15204a;
    public final q f15205b;
    public final x f15206c;
    public final Bundle e;
    public h0 f15208g;
    public List h;
    public m f15209i;
    public int f15210j;
    public int f15211k;
    public int f15212l;
    public p f15213m;
    public a0 f15214n;
    public final Object d = new Object();
    public final RemoteCallbackList f15207f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15204a = a2;
        q qVar = new q(this);
        this.f15205b = qVar;
        this.f15206c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f15213m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f15214n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f15214n = a0Var;
        }
    }

    public void e(int i10) {
        this.f15210j = i10;
    }
}
