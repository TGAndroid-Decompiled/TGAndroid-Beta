package of;

import android.util.Log;
import c6.k;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import e6.h;
import n6.l;
public final class a extends e6.g {
    public final h f15687a;
    public final d6.g f15688b;
    public final d6.c f15689c;
    public g d;
    public int e;
    public int f15690f;
    public int f15691g;
    public int h;

    public a(d6.c cVar, d6.g gVar, h hVar) {
        this.f15689c = cVar;
        this.f15688b = gVar;
        this.f15687a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f15689c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f15689c.a());
        sb2.append(" ");
        Integer num = mediaError.f5971c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f5970b);
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
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f15689c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f15689c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f15689c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f15689c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f15689c.a());
        int b10 = this.f15687a.b();
        if (b10 != this.f15690f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f15690f = b10;
            if (b10 == 2) {
                this.f15688b.b(true);
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
        if (this.f15691g < this.d.f15714a.size()) {
            fVar = this.d.a(this.f15691g);
        } else {
            fVar = d.f15698l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i10, fVar.d) + ("?index=" + this.f15691g + "&attempt=" + this.h), 1, fVar.f15710a, fVar.f15711b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            l.e("Must be called from the main thread.");
            h hVar = this.f15687a;
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
            this.f15691g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f15691g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.f15691g + " " + this.h);
        p();
    }
}
