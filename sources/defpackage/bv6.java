package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.ArrayList;
public class bv6 {
    public final MediaSession a;
    public final av6 b;
    public final kv6 c;
    public final Bundle e;
    public dc8 g;
    public ArrayList h;
    public kr6 i;
    public byte j;
    public int k;
    public yu6 l;
    public mw6 m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public bv6(Context context, String str, Bundle bundle) {
        MediaSession a = a(context, str, bundle);
        this.a = a;
        av6 av6Var = new av6(this);
        this.b = av6Var;
        this.c = new kv6(a.getSessionToken(), av6Var);
        this.e = bundle;
        a.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final yu6 b() {
        yu6 yu6Var;
        synchronized (this.d) {
            yu6Var = this.l;
        }
        return yu6Var;
    }

    public mw6 c() {
        mw6 mw6Var;
        synchronized (this.d) {
            mw6Var = this.m;
        }
        return mw6Var;
    }

    public void d(mw6 mw6Var) {
        synchronized (this.d) {
            this.m = mw6Var;
        }
    }
}
