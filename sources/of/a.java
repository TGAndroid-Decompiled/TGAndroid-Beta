package of;

import android.util.Log;
import c6.k;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import e6.h;
import n6.l;
public final class a extends e6.g {
    public final h f14288a;
    public final d6.g f14289b;
    public final d6.c f14290c;
    public g d;
    public int e;
    public int f14291f;
    public int f14292g;
    public int h;

    public a(d6.c cVar, d6.g gVar, h hVar) {
        this.f14290c = cVar;
        this.f14289b = gVar;
        this.f14288a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f14290c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f14290c.a());
        sb2.append(" ");
        Integer num = mediaError.f4762c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f4761b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        this.e = i10;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f14290c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f14290c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f14290c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f14290c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f14290c.a());
        int b10 = this.f14288a.b();
        if (b10 != this.f14291f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f14291f = b10;
            if (b10 == 2) {
                this.f14289b.b(true);
            } else if (b10 == 4) {
                int i10 = this.e;
                if (i10 == 104) {
                    q(true);
                } else if (i10 == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        f fVar;
        this.e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i10 = d.i();
        if (this.f14292g < this.d.f14315a.size()) {
            fVar = this.d.a(this.f14292g);
        } else {
            fVar = d.f14299l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i10, fVar.d) + ("?index=" + this.f14292g + "&attempt=" + this.h), 1, fVar.f14311a, fVar.f14312b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            l.e("Must be called from the main thread.");
            h hVar = this.f14288a;
            if (!hVar.w()) {
                h.t();
                return;
            } else {
                h.x(new e6.k(hVar, kVar, 1));
                return;
            }
        }
        throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
    }

    public final void q(boolean z10) {
        if (z10) {
            this.f14292g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f14292g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.f14292g + " " + this.h);
        p();
    }
}
