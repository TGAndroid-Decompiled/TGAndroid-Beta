package n4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;
public class r {
    public final MediaSession f16620a;
    public final q f16621b;
    public final x f16622c;
    public final Bundle f16623e;
    public h0 f16625g;
    public List h;
    public m f16626i;
    public int f16627j;
    public int f16628k;
    public int f16629l;
    public p f16630m;
    public a0 f16631n;
    public final Object d = new Object();
    public final RemoteCallbackList f16624f = new RemoteCallbackList();

    public r(Context context, String str, Bundle bundle) {
        MediaSession a2 = a(context, str, bundle);
        this.f16620a = a2;
        q qVar = new q(this);
        this.f16621b = qVar;
        this.f16622c = new x(a2.getSessionToken(), qVar);
        this.f16623e = bundle;
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final p b() {
        p pVar;
        synchronized (this.d) {
            pVar = this.f16630m;
        }
        return pVar;
    }

    public a0 c() {
        a0 a0Var;
        synchronized (this.d) {
            a0Var = this.f16631n;
        }
        return a0Var;
    }

    public void d(a0 a0Var) {
        synchronized (this.d) {
            this.f16631n = a0Var;
        }
    }

    public void e(int i10) {
        this.f16627j = i10;
    }
}
