package defpackage;

import com.google.android.gms.cast.MediaError;
public final class od1 extends u99 {
    @Override
    public final void b(MediaError mediaError) {
        cc4.d("Chromecast Media Error: " + mediaError);
    }

    @Override
    public final void g() {
        cc4.b("onStatusUpdated");
        go.E();
    }
}
