package defpackage;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
public final class kh2 extends u99 {
    public final v99 a;
    public final baa b;
    public final md1 c;
    public qh2 d;
    public int e;
    public int f;
    public int g;
    public int h;

    public kh2(md1 md1Var, baa baaVar, v99 v99Var) {
        this.c = md1Var;
        this.b = baaVar;
        this.a = v99Var;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i;
        StringBuilder sb = new StringBuilder("onMediaError ");
        sb.append(this.c.a());
        sb.append(" ");
        Integer num = mediaError.c;
        sb.append(num);
        sb.append(" ");
        sb.append(mediaError.b);
        Log.d("CAST_CLIENT", sb.toString());
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        this.e = i;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.c.a());
        int b = this.a.b();
        if (b != this.f) {
            Log.d("CAST_CLIENT", "idleReason " + b);
            this.f = b;
            if (b == 2) {
                this.b.b(true);
            } else if (b == 4) {
                int i = this.e;
                if (i == 104) {
                    q(true);
                } else if (i == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        ph2 ph2Var;
        this.e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String h = nh2.h();
        if (this.g < this.d.a.size()) {
            ph2Var = this.d.h(this.g);
        } else {
            ph2Var = nh2.l;
        }
        kt6 kt6Var = new kt6(new MediaInfo(nh2.i(h, ph2Var.d).concat("?index=" + this.g + "&attempt=" + this.h), 1, ph2Var.a, ph2Var.b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null), null, Boolean.TRUE, -1L, 1.0d, null, null, null, null, null, null, 0L);
        xve.e("Must be called from the main thread.");
        v99 v99Var = this.a;
        if (!v99Var.w()) {
            v99.t();
        } else {
            v99.x(new hed(v99Var, kt6Var, (byte) 1));
        }
    }

    public final void q(boolean z) {
        if (z) {
            this.g++;
        } else {
            int i = this.h + 1;
            this.h = i;
            if (i > 3) {
                this.h = 0;
                this.g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.g + " " + this.h);
        p();
    }
}
