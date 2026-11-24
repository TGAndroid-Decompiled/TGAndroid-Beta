package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.ArrayList;
public class bx6 {
    public final MediaSession a;
    public final ax6 b;
    public final kx6 c;
    public final Bundle e;
    public ge8 g;
    public ArrayList h;
    public lt6 i;
    public byte j;
    public int k;
    public yw6 l;
    public my6 m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public bx6(Context context, String str, Bundle bundle) {
        MediaSession a = a(context, str, bundle);
        this.a = a;
        ax6 ax6Var = new ax6(this);
        this.b = ax6Var;
        this.c = new kx6(a.getSessionToken(), ax6Var);
        this.e = bundle;
        a.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final yw6 b() {
        yw6 yw6Var;
        synchronized (this.d) {
            yw6Var = this.l;
        }
        return yw6Var;
    }

    public my6 c() {
        my6 my6Var;
        synchronized (this.d) {
            my6Var = this.m;
        }
        return my6Var;
    }

    public void d(my6 my6Var) {
        synchronized (this.d) {
            this.m = my6Var;
        }
    }
}
