package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f15199a;
    public final q f15200b;
    public final x f15201c;
    public final Bundle e;
    public h0 f15203g;
    public List h;
    public m f15204i;
    public int f15205j;
    public int f15206k;
    public int f15207l;
    public p f15208m;
    public a0 f15209n;
    public final Object d = new Object();
    public final RemoteCallbackList f15202f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15199a = a2;
        q qVar = new q(this);
        this.f15200b = qVar;
        this.f15201c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f15208m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f15209n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f15209n = a0Var;
        }
    }

    public void e(int i10) {
        this.f15205j = i10;
    }
}
