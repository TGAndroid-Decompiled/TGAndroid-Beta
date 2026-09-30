package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f15219a;
    public final q f15220b;
    public final x f15221c;
    public final Bundle e;
    public h0 f15223g;
    public List h;
    public m f15224i;
    public int f15225j;
    public int f15226k;
    public int f15227l;
    public p f15228m;
    public a0 f15229n;
    public final Object d = new Object();
    public final RemoteCallbackList f15222f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15219a = a2;
        q qVar = new q(this);
        this.f15220b = qVar;
        this.f15221c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f15228m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f15229n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f15229n = a0Var;
        }
    }

    public void e(int i10) {
        this.f15225j = i10;
    }
}
