package af;

import android.util.Log;
import b6.m;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import q5.k;
public final class b extends s5.g {
    public final s5.h f150a;
    public final r5.g f151b;
    public final r5.c f152c;
    public j d;
    public int e;
    public int f153f;
    public int f154g;
    public int h;

    public b(r5.c cVar, r5.g gVar, s5.h hVar) {
        this.f152c = cVar;
        this.f151b = gVar;
        this.f150a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f152c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb = new StringBuilder("onMediaError ");
        sb.append(this.f152c.a());
        sb.append(" ");
        Integer num = mediaError.f2667c;
        sb.append(num);
        sb.append(" ");
        sb.append(mediaError.f2666b);
        Log.d("CAST_CLIENT", sb.toString());
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        this.e = i10;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f152c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f152c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f152c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f152c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f152c.a());
        int b10 = this.f150a.b();
        if (b10 != this.f153f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f153f = b10;
            if (b10 == 2) {
                this.f151b.b(true);
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
        i iVar;
        this.e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i10 = g.i();
        if (this.f154g < this.d.f182a.size()) {
            iVar = this.d.a(this.f154g);
        } else {
            iVar = g.f166l;
        }
        MediaInfo mediaInfo = new MediaInfo(g.j(i10, iVar.d) + ("?index=" + this.f154g + "&attempt=" + this.h), 1, iVar.f178a, iVar.f179b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            m.e("Must be called from the main thread.");
            s5.h hVar = this.f150a;
            if (!hVar.w()) {
                s5.h.t();
                return;
            } else {
                s5.h.x(new s5.j(hVar, kVar, 1));
                return;
            }
        }
        throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
    }

    public final void q(boolean z4) {
        if (z4) {
            this.f154g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f154g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.f154g + " " + this.h);
        p();
    }
}
