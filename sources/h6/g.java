package h6;

import android.content.Intent;
import android.support.v4.media.session.a0;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import e6.p;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.az;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.z7;
import p6.m;
public final class g extends s {
    public final int f14331g;
    public final Object h;

    public g(Object obj, int i3) {
        super(0);
        this.f14331g = i3;
        this.h = obj;
    }

    @Override
    public final void G(long j10) {
        int i3 = this.f14331g;
        Object obj = this.h;
        switch (i3) {
            case 0:
                h.v.b("onSeekTo %d", Long.valueOf(j10));
                g6.h hVar = ((h) obj).f14343n;
                if (hVar != null) {
                    hVar.q(new p(j10));
                    return;
                }
                return;
            default:
                zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null) {
                    MediaController.B().i0(ziVar, ((float) (j10 / 1000)) / ((float) ziVar.L0()));
                    boolean z10 = MusicPlayerService.f21361w;
                    ((MusicPlayerService) obj).f(j10);
                    return;
                }
                return;
        }
    }

    @Override
    public void M(int i3) {
        switch (this.f14331g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                int i10 = 2;
                if (i3 != 1) {
                    if (i3 != 2 && i3 != 3) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                }
                az.E(i10);
                boolean z10 = MusicPlayerService.f21361w;
                musicPlayerService.g();
                zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null) {
                    musicPlayerService.a(ziVar, false);
                    return;
                }
                return;
            default:
                super.M(i3);
                return;
        }
    }

    @Override
    public void P(int i3) {
        switch (this.f14331g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i3 != 1 && i3 != 2) {
                    if (az.N0) {
                        MediaController.B().l0(0);
                    }
                } else if (!az.N0) {
                    MediaController.B().l0(2);
                }
                boolean z10 = MusicPlayerService.f21361w;
                a0 a0Var = musicPlayerService.f21364c;
                if (a0Var != null) {
                    a0Var.w(az.N0 ? 1 : 0);
                }
                zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null) {
                    musicPlayerService.a(ziVar, false);
                    return;
                }
                return;
            default:
                super.P(i3);
                return;
        }
    }

    @Override
    public final void S() {
        switch (this.f14331g) {
            case 0:
                h.v.b("onSkipToNext", new Object[0]);
                g6.h hVar = ((h) this.h).f14343n;
                if (hVar != null) {
                    m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        g6.h.t();
                        return;
                    } else {
                        g6.h.x(new g6.i(hVar, 2));
                        return;
                    }
                }
                return;
            default:
                zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null && ziVar.J3()) {
                    MediaController.B().U(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void V() {
        switch (this.f14331g) {
            case 0:
                h.v.b("onSkipToPrevious", new Object[0]);
                g6.h hVar = ((h) this.h).f14343n;
                if (hVar != null) {
                    m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        g6.h.t();
                        return;
                    } else {
                        g6.h.x(new g6.i(hVar, 1));
                        return;
                    }
                }
                return;
            default:
                zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null && ziVar.J3()) {
                    MediaController.B().V();
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(String str) {
        int i3 = this.f14331g;
        Object obj = this.h;
        switch (i3) {
            case 0:
                h hVar = (h) obj;
                h.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                            long j10 = -hVar.f14335e.f11997c;
                            g6.h hVar2 = hVar.f14343n;
                            if (hVar2 != null) {
                                long min = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j10));
                                g6.h hVar3 = hVar.f14343n;
                                if (hVar3 != null) {
                                    hVar3.q(new p(min));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                    case -668151673:
                        if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                            f6.g gVar = hVar.d;
                            if (gVar != null) {
                                gVar.b(true);
                                return;
                            }
                            return;
                        }
                        break;
                    case -124479363:
                        if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            f6.g gVar2 = hVar.d;
                            if (gVar2 != null) {
                                gVar2.b(false);
                                return;
                            }
                            return;
                        }
                        break;
                    case 1362116196:
                        if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                            long j11 = hVar.f14335e.f11997c;
                            g6.h hVar4 = hVar.f14343n;
                            if (hVar4 != null) {
                                long min2 = Math.min(hVar4.g(), Math.max(0L, hVar4.a() + j11));
                                g6.h hVar5 = hVar.f14343n;
                                if (hVar5 != null) {
                                    hVar5.q(new p(min2));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(hVar.f14337g);
                hVar.f14332a.sendBroadcast(intent);
                return;
            default:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    az.E((az.S0 + 1) % 3);
                    boolean z10 = MusicPlayerService.f21361w;
                    musicPlayerService.g();
                    z7 z7Var = z7.Q2;
                    if (z7Var != null) {
                        z7Var.c1();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (az.N0) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(2);
                    }
                    boolean z11 = MusicPlayerService.f21361w;
                    a0 a0Var = musicPlayerService.f21364c;
                    if (a0Var != null) {
                        a0Var.w(az.N0 ? 1 : 0);
                    }
                    z7 z7Var2 = z7.Q2;
                    if (z7Var2 != null) {
                        z7Var2.c1();
                    }
                }
                zi ziVar = MediaController.B().f21348v0;
                if (ziVar != null) {
                    boolean z12 = MusicPlayerService.f21361w;
                    musicPlayerService.a(ziVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean i(Intent intent) {
        g6.h hVar;
        switch (this.f14331g) {
            case 0:
                h.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (hVar = ((h) this.h).f14343n) != null) {
                        hVar.r();
                        return true;
                    }
                    return true;
                }
                return true;
            default:
                return super.i(intent);
        }
    }

    @Override
    public final void k() {
        switch (this.f14331g) {
            case 0:
                h.v.b("onPause", new Object[0]);
                g6.h hVar = ((h) this.h).f14343n;
                if (hVar != null) {
                    hVar.r();
                    return;
                }
                return;
            default:
                MediaController.B().R(MediaController.B().f21348v0, true);
                return;
        }
    }

    @Override
    public final void n() {
        switch (this.f14331g) {
            case 0:
                h.v.b("onPlay", new Object[0]);
                g6.h hVar = ((h) this.h).f14343n;
                if (hVar != null) {
                    hVar.r();
                    return;
                }
                return;
            default:
                MediaController.B().S(MediaController.B().f21348v0);
                return;
        }
    }
}
