package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f15238a;
    public final q f15239b;
    public final x f15240c;
    public final Bundle e;
    public h0 f15242g;
    public List h;
    public m f15243i;
    public int f15244j;
    public int f15245k;
    public int f15246l;
    public p f15247m;
    public a0 f15248n;
    public final Object d = new Object();
    public final RemoteCallbackList f15241f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f15238a = a2;
        q qVar = new q(this);
        this.f15239b = qVar;
        this.f15240c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f15247m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f15248n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f15248n = a0Var;
        }
    }

    public void e(int i10) {
        this.f15244j = i10;
    }
}
