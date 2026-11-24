package defpackage;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
public final class gi2 extends j89 {
    public final k89 a;
    public final l8a b;
    public final me1 c;
    public mi2 d;
    public int e;
    public int f;
    public int g;
    public int h;

    public gi2(me1 me1Var, l8a l8aVar, k89 k89Var) {
        this.c = me1Var;
        this.b = l8aVar;
        this.a = k89Var;
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
        li2 li2Var;
        this.e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String h = ji2.h();
        if (this.g < this.d.a.size()) {
            li2Var = this.d.c(this.g);
        } else {
            li2Var = ji2.l;
        }
        gt6 gt6Var = new gt6(new MediaInfo(ji2.i(h, li2Var.d).concat("?index=" + this.g + "&attempt=" + this.h), 1, li2Var.a, li2Var.b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null), null, Boolean.TRUE, -1L, 1.0d, null, null, null, null, null, null, 0L);
        ite.e("Must be called from the main thread.");
        k89 k89Var = this.a;
        if (!k89Var.w()) {
            k89.t();
        } else {
            k89.x(new qbd(k89Var, gt6Var, (byte) 1));
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
