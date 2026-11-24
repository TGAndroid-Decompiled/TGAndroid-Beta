package defpackage;

import com.google.android.gms.cast.MediaError;
public final class oe1 extends j89 {
    @Override
    public final void b(MediaError mediaError) {
        fc4.d("Chromecast Media Error: " + mediaError);
    }

    @Override
    public final void g() {
        fc4.b("onStatusUpdated");
        fp.E();
    }
}
