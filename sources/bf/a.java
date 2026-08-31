package bf;

import android.util.Log;
import b6.m;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import q5.k;
import s5.j;
public final class a extends s5.g {
    public final s5.h f1928a;
    public final r5.g f1929b;
    public final r5.c f1930c;
    public h d;
    public int f1931e;
    public int f1932f;
    public int f1933g;
    public int h;

    public a(r5.c cVar, r5.g gVar, s5.h hVar) {
        this.f1930c = cVar;
        this.f1929b = gVar;
        this.f1928a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f1930c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb = new StringBuilder("onMediaError ");
        sb.append(this.f1930c.a());
        sb.append(" ");
        Integer num = mediaError.f2608c;
        sb.append(num);
        sb.append(" ");
        sb.append(mediaError.f2607b);
        Log.d("CAST_CLIENT", sb.toString());
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        this.f1931e = i10;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f1930c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f1930c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f1930c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f1930c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f1930c.a());
        int b10 = this.f1928a.b();
        if (b10 != this.f1932f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f1932f = b10;
            if (b10 == 2) {
                this.f1929b.b(true);
            } else if (b10 == 4) {
                int i10 = this.f1931e;
                if (i10 == 104) {
                    q(true);
                } else if (i10 == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        g gVar;
        this.f1931e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i10 = e.i();
        if (this.f1933g < this.d.f1961a.size()) {
            gVar = this.d.a(this.f1933g);
        } else {
            gVar = e.f1942l;
        }
        MediaInfo mediaInfo = new MediaInfo(e.j(i10, gVar.d) + ("?index=" + this.f1933g + "&attempt=" + this.h), 1, gVar.f1956a, gVar.f1957b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            m.e("Must be called from the main thread.");
            s5.h hVar = this.f1928a;
            if (!hVar.w()) {
                s5.h.t();
                return;
            } else {
                s5.h.x(new j(hVar, kVar, 1));
                return;
            }
        }
        throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
    }

    public final void q(boolean z4) {
        if (z4) {
            this.f1933g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f1933g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f1931e + " " + this.f1933g + " " + this.h);
        p();
    }
}
