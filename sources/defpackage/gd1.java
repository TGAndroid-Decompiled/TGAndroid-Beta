package defpackage;

import com.google.android.gms.cast.MediaError;
public final class gd1 extends h69 {
    @Override
    public final void b(MediaError mediaError) {
        fa4.d("Chromecast Media Error: " + mediaError);
    }

    @Override
    public final void g() {
        fa4.b("onStatusUpdated");
        fo.E();
    }
}
