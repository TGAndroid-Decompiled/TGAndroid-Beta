package hf;

import android.util.Log;
import bi.j4;
import c6.k;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import e6.g;
import e6.h;
import e6.j;
import n6.l;
public final class a extends g {
    public final h f7652a;
    public final d6.g f7653b;
    public final d6.c f7654c;
    public j4 d;
    public int e;
    public int f7655f;
    public int f7656g;
    public int h;

    public a(d6.c cVar, d6.g gVar, h hVar) {
        this.f7654c = cVar;
        this.f7653b = gVar;
        this.f7652a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f7654c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f7654c.a());
        sb2.append(" ");
        Integer num = mediaError.f4300c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f4299b);
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
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f7654c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f7654c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f7654c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f7654c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f7654c.a());
        int b10 = this.f7652a.b();
        if (b10 != this.f7655f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f7655f = b10;
            if (b10 == 2) {
                this.f7653b.b(true);
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
        if (this.f7656g < this.d.f3120a.size()) {
            fVar = this.d.c(this.f7656g);
        } else {
            fVar = d.f7663l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i10, fVar.d) + ("?index=" + this.f7656g + "&attempt=" + this.h), 1, fVar.f7675a, fVar.f7676b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            l.d("Must be called from the main thread.");
            h hVar = this.f7652a;
            if (!hVar.w()) {
                h.t();
                return;
            } else {
                h.x(new j(hVar, kVar, 1));
                return;
            }
        }
        throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
    }

    public final void q(boolean z10) {
        if (z10) {
            this.f7656g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f7656g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.f7656g + " " + this.h);
        p();
    }
}
