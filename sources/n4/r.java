package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f15203a;
    public final q f15204b;
    public final x f15205c;
    public final Bundle e;
    public h0 f15207g;
    public List h;
    public m f15208i;
    public int f15209j;
    public int f15210k;
    public int f15211l;
    public p f15212m;
    public a0 f15213n;
    public final Object d = new Object();
    public final RemoteCallbackList f15206f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15203a = a2;
        q qVar = new q(this);
        this.f15204b = qVar;
        this.f15205c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f15212m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f15213n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f15213n = a0Var;
        }
    }

    public void e(int i10) {
        this.f15209j = i10;
    }
}
