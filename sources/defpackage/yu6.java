package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
public final class yu6 implements IBinder.DeathRecipient {
    public final vo6 a = new vo6(this);
    public ra3 b;
    public wo6 c;
    public final byte d;
    public final ep e;

    public yu6(ep epVar, byte b) {
        this.d = b;
        this.e = epVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        byte b = this.d;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        ep epVar = this.e;
        switch (b) {
            case 0:
                bv6 bv6Var = (bv6) epVar;
                if (mediaMetadataCompat != null) {
                    mediaDescriptionCompat = mediaMetadataCompat.a();
                }
                bv6Var.m0 = mediaDescriptionCompat;
                bv6Var.r();
                bv6Var.q(false);
                return;
            default:
                wv6 wv6Var = (wv6) epVar;
                if (mediaMetadataCompat != null) {
                    mediaDescriptionCompat = mediaMetadataCompat.a();
                }
                wv6Var.c0 = mediaDescriptionCompat;
                wv6Var.f();
                wv6Var.k();
                return;
        }
    }

    public final void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                bv6 bv6Var = (bv6) this.e;
                bv6Var.l0 = playbackStateCompat;
                bv6Var.q(false);
                return;
            default:
                return;
        }
    }

    @Override
    public final void binderDied() {
        e(8, null, null);
    }

    public final void d() {
        byte b = this.d;
        ep epVar = this.e;
        switch (b) {
            case 0:
                bv6 bv6Var = (bv6) epVar;
                um4 um4Var = bv6Var.j0;
                if (um4Var != null) {
                    um4Var.e0(bv6Var.k0);
                    bv6Var.j0 = null;
                    return;
                }
                return;
            default:
                wv6 wv6Var = (wv6) epVar;
                um4 um4Var2 = wv6Var.a0;
                if (um4Var2 != null) {
                    um4Var2.e0(wv6Var.b0);
                    wv6Var.a0 = null;
                    return;
                }
                return;
        }
    }

    public final void e(int i, Object obj, Bundle bundle) {
        ra3 ra3Var = this.b;
        if (ra3Var != null) {
            Message obtainMessage = ra3Var.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler == null) {
            ra3 ra3Var = this.b;
            if (ra3Var != null) {
                ra3Var.b = false;
                ra3Var.removeCallbacksAndMessages(null);
                this.b = null;
                return;
            }
            return;
        }
        ra3 ra3Var2 = new ra3(this, handler.getLooper());
        this.b = ra3Var2;
        ra3Var2.b = true;
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
