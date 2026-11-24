package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
public final class ts6 implements IBinder.DeathRecipient {
    public final rm6 a = new rm6(this);
    public y93 b;
    public sm6 c;
    public final byte d;
    public final dp e;

    public ts6(dp dpVar, byte b) {
        this.d = b;
        this.e = dpVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        byte b = this.d;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        dp dpVar = this.e;
        switch (b) {
            case 0:
                ws6 ws6Var = (ws6) dpVar;
                if (mediaMetadataCompat != null) {
                    mediaDescriptionCompat = mediaMetadataCompat.a();
                }
                ws6Var.m0 = mediaDescriptionCompat;
                ws6Var.r();
                ws6Var.q(false);
                return;
            default:
                rt6 rt6Var = (rt6) dpVar;
                if (mediaMetadataCompat != null) {
                    mediaDescriptionCompat = mediaMetadataCompat.a();
                }
                rt6Var.c0 = mediaDescriptionCompat;
                rt6Var.f();
                rt6Var.k();
                return;
        }
    }

    public final void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                ws6 ws6Var = (ws6) this.e;
                ws6Var.l0 = playbackStateCompat;
                ws6Var.q(false);
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
        dp dpVar = this.e;
        switch (b) {
            case 0:
                ws6 ws6Var = (ws6) dpVar;
                wk4 wk4Var = ws6Var.j0;
                if (wk4Var != null) {
                    wk4Var.h0(ws6Var.k0);
                    ws6Var.j0 = null;
                    return;
                }
                return;
            default:
                rt6 rt6Var = (rt6) dpVar;
                wk4 wk4Var2 = rt6Var.a0;
                if (wk4Var2 != null) {
                    wk4Var2.h0(rt6Var.b0);
                    rt6Var.a0 = null;
                    return;
                }
                return;
        }
    }

    public final void e(int i, Object obj, Bundle bundle) {
        y93 y93Var = this.b;
        if (y93Var != null) {
            Message obtainMessage = y93Var.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler == null) {
            y93 y93Var = this.b;
            if (y93Var != null) {
                y93Var.b = false;
                y93Var.removeCallbacksAndMessages(null);
                this.b = null;
                return;
            }
            return;
        }
        y93 y93Var2 = new y93(this, handler.getLooper());
        this.b = y93Var2;
        y93Var2.b = true;
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
