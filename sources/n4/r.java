package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f15160a;
    public final q f15161b;
    public final x f15162c;
    public final Bundle e;
    public h0 f15164g;
    public List h;
    public m f15165i;
    public int f15166j;
    public int f15167k;
    public int f15168l;
    public p f15169m;
    public a0 f15170n;
    public final Object d = new Object();
    public final RemoteCallbackList f15163f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15160a = a2;
        q qVar = new q(this);
        this.f15161b = qVar;
        this.f15162c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f15169m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f15170n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f15170n = a0Var;
        }
    }

    public void e(int i10) {
        this.f15166j = i10;
    }
}
