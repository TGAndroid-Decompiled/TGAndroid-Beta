package i6;

import android.content.Intent;
import android.support.v4.media.session.a0;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import f6.p;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.b8;
import q6.m;
public final class g extends s {
    public final int f15377g;
    public final Object h;

    public g(Object obj, int i7) {
        super(0);
        this.f15377g = i7;
        this.h = obj;
    }

    @Override
    public final void G(long j3) {
        int i7 = this.f15377g;
        Object obj = this.h;
        switch (i7) {
            case 0:
                h.v.b("onSeekTo %d", Long.valueOf(j3));
                h6.h hVar = ((h) obj).f15389n;
                if (hVar != null) {
                    hVar.q(new p(j3));
                    return;
                }
                return;
            default:
                ij ijVar = MediaController.B().f21295u0;
                if (ijVar != null) {
                    MediaController.B().i0(ijVar, ((float) (j3 / 1000)) / ((float) ijVar.L0()));
                    boolean z9 = MusicPlayerService.f21310w;
                    ((MusicPlayerService) obj).f(j3);
                    return;
                }
                return;
        }
    }

    @Override
    public void M(int i7) {
        switch (this.f15377g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                int i10 = 2;
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                }
                iz.E(i10);
                boolean z9 = MusicPlayerService.f21310w;
                musicPlayerService.g();
                ij ijVar = MediaController.B().f21295u0;
                if (ijVar != null) {
                    musicPlayerService.a(ijVar, false);
                    return;
                }
                return;
            default:
                super.M(i7);
                return;
        }
    }

    @Override
    public void P(int i7) {
        switch (this.f15377g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i7 != 1 && i7 != 2) {
                    if (iz.N0) {
                        MediaController.B().l0(0);
                    }
                } else if (!iz.N0) {
                    MediaController.B().l0(2);
                }
                boolean z9 = MusicPlayerService.f21310w;
                a0 a0Var = musicPlayerService.f21313c;
                if (a0Var != null) {
                    a0Var.x(iz.N0 ? 1 : 0);
                }
                ij ijVar = MediaController.B().f21295u0;
                if (ijVar != null) {
                    musicPlayerService.a(ijVar, false);
                    return;
                }
                return;
            default:
                super.P(i7);
                return;
        }
    }

    @Override
    public final void S() {
        switch (this.f15377g) {
            case 0:
                h.v.b("onSkipToNext", new Object[0]);
                h6.h hVar = ((h) this.h).f15389n;
                if (hVar != null) {
                    m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        h6.h.t();
                        return;
                    } else {
                        h6.h.x(new h6.i(hVar, 2));
                        return;
                    }
                }
                return;
            default:
                ij ijVar = MediaController.B().f21295u0;
                if (ijVar != null && ijVar.J3()) {
                    MediaController.B().U(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void V() {
        switch (this.f15377g) {
            case 0:
                h.v.b("onSkipToPrevious", new Object[0]);
                h6.h hVar = ((h) this.h).f15389n;
                if (hVar != null) {
                    m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        h6.h.t();
                        return;
                    } else {
                        h6.h.x(new h6.i(hVar, 1));
                        return;
                    }
                }
                return;
            default:
                ij ijVar = MediaController.B().f21295u0;
                if (ijVar != null && ijVar.J3()) {
                    MediaController.B().V();
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(String str) {
        int i7 = this.f15377g;
        Object obj = this.h;
        switch (i7) {
            case 0:
                h hVar = (h) obj;
                h.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                            long j3 = -hVar.f15381e.f14237c;
                            h6.h hVar2 = hVar.f15389n;
                            if (hVar2 != null) {
                                long min = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j3));
                                h6.h hVar3 = hVar.f15389n;
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
                            g6.g gVar = hVar.d;
                            if (gVar != null) {
                                gVar.b(true);
                                return;
                            }
                            return;
                        }
                        break;
                    case -124479363:
                        if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            g6.g gVar2 = hVar.d;
                            if (gVar2 != null) {
                                gVar2.b(false);
                                return;
                            }
                            return;
                        }
                        break;
                    case 1362116196:
                        if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                            long j10 = hVar.f15381e.f14237c;
                            h6.h hVar4 = hVar.f15389n;
                            if (hVar4 != null) {
                                long min2 = Math.min(hVar4.g(), Math.max(0L, hVar4.a() + j10));
                                h6.h hVar5 = hVar.f15389n;
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
                intent.setComponent(hVar.f15383g);
                hVar.f15378a.sendBroadcast(intent);
                return;
            default:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    iz.E((iz.S0 + 1) % 3);
                    boolean z9 = MusicPlayerService.f21310w;
                    musicPlayerService.g();
                    b8 b8Var = b8.P2;
                    if (b8Var != null) {
                        b8Var.c1();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (iz.N0) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(2);
                    }
                    boolean z10 = MusicPlayerService.f21310w;
                    a0 a0Var = musicPlayerService.f21313c;
                    if (a0Var != null) {
                        a0Var.x(iz.N0 ? 1 : 0);
                    }
                    b8 b8Var2 = b8.P2;
                    if (b8Var2 != null) {
                        b8Var2.c1();
                    }
                }
                ij ijVar = MediaController.B().f21295u0;
                if (ijVar != null) {
                    boolean z11 = MusicPlayerService.f21310w;
                    musicPlayerService.a(ijVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean i(Intent intent) {
        h6.h hVar;
        switch (this.f15377g) {
            case 0:
                h.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (hVar = ((h) this.h).f15389n) != null) {
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
        switch (this.f15377g) {
            case 0:
                h.v.b("onPause", new Object[0]);
                h6.h hVar = ((h) this.h).f15389n;
                if (hVar != null) {
                    hVar.r();
                    return;
                }
                return;
            default:
                MediaController.B().R(MediaController.B().f21295u0, true);
                return;
        }
    }

    @Override
    public final void n() {
        switch (this.f15377g) {
            case 0:
                h.v.b("onPlay", new Object[0]);
                h6.h hVar = ((h) this.h).f15389n;
                if (hVar != null) {
                    hVar.r();
                    return;
                }
                return;
            default:
                MediaController.B().S(MediaController.B().f21295u0);
                return;
        }
    }
}
