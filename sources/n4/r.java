package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f13805a;
    public final q f13806b;
    public final x f13807c;
    public final Bundle e;
    public h0 f13809g;
    public List h;
    public m f13810i;
    public int f13811j;
    public int f13812k;
    public int f13813l;
    public p f13814m;
    public a0 f13815n;
    public final Object d = new Object();
    public final RemoteCallbackList f13808f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f13805a = a2;
        q qVar = new q(this);
        this.f13806b = qVar;
        this.f13807c = new x(a2.getSessionToken(), qVar);
        this.e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f13814m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f13815n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f13815n = a0Var;
        }
    }

    public void e(int i10) {
        this.f13811j = i10;
    }
}
