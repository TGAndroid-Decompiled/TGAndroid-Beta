package f6;

import android.content.Intent;
import android.support.v4.media.session.a0;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import c6.p;
import n6.l;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.kj;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.w7;
public final class h extends s {
    public final int f6942g;
    public final Object h;

    public h(Object obj, int i10) {
        super(0);
        this.f6942g = i10;
        this.h = obj;
    }

    @Override
    public final void G(long j10) {
        int i10 = this.f6942g;
        Object obj = this.h;
        switch (i10) {
            case 0:
                i.v.b("onSeekTo %d", Long.valueOf(j10));
                e6.h hVar = ((i) obj).f6953n;
                if (hVar != null) {
                    hVar.q(new p(j10));
                    return;
                }
                return;
            default:
                kj kjVar = MediaController.B().f14483u0;
                if (kjVar != null) {
                    MediaController.B().i0(kjVar, ((float) (j10 / 1000)) / ((float) kjVar.L0()));
                    boolean z10 = MusicPlayerService.f14498w;
                    ((MusicPlayerService) obj).f(j10);
                    return;
                }
                return;
        }
    }

    @Override
    public void M(int i10) {
        switch (this.f6942g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                int i11 = 2;
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                }
                uz.E(i11);
                boolean z10 = MusicPlayerService.f14498w;
                musicPlayerService.g();
                kj kjVar = MediaController.B().f14483u0;
                if (kjVar != null) {
                    musicPlayerService.a(kjVar, false);
                    return;
                }
                return;
            default:
                super.M(i10);
                return;
        }
    }

    @Override
    public void P(int i10) {
        switch (this.f6942g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i10 != 1 && i10 != 2) {
                    if (uz.N0) {
                        MediaController.B().l0(0);
                    }
                } else if (!uz.N0) {
                    MediaController.B().l0(2);
                }
                boolean z10 = MusicPlayerService.f14498w;
                a0 a0Var = musicPlayerService.f14501c;
                if (a0Var != null) {
                    a0Var.F(uz.N0 ? 1 : 0);
                }
                kj kjVar = MediaController.B().f14483u0;
                if (kjVar != null) {
                    musicPlayerService.a(kjVar, false);
                    return;
                }
                return;
            default:
                super.P(i10);
                return;
        }
    }

    @Override
    public final void S() {
        switch (this.f6942g) {
            case 0:
                i.v.b("onSkipToNext", new Object[0]);
                e6.h hVar = ((i) this.h).f6953n;
                if (hVar != null) {
                    l.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        e6.h.t();
                        return;
                    } else {
                        e6.h.x(new e6.i(hVar, 2));
                        return;
                    }
                }
                return;
            default:
                kj kjVar = MediaController.B().f14483u0;
                if (kjVar != null && kjVar.I3()) {
                    MediaController.B().U(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void V() {
        switch (this.f6942g) {
            case 0:
                i.v.b("onSkipToPrevious", new Object[0]);
                e6.h hVar = ((i) this.h).f6953n;
                if (hVar != null) {
                    l.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        e6.h.t();
                        return;
                    } else {
                        e6.h.x(new e6.i(hVar, 1));
                        return;
                    }
                }
                return;
            default:
                kj kjVar = MediaController.B().f14483u0;
                if (kjVar != null && kjVar.I3()) {
                    MediaController.B().V();
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(String str) {
        int i10 = this.f6942g;
        Object obj = this.h;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                i.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                            long j10 = -iVar.e.f6276c;
                            e6.h hVar = iVar.f6953n;
                            if (hVar != null) {
                                long min = Math.min(hVar.g(), Math.max(0L, hVar.a() + j10));
                                e6.h hVar2 = iVar.f6953n;
                                if (hVar2 != null) {
                                    hVar2.q(new p(min));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                    case -668151673:
                        if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                            d6.g gVar = iVar.d;
                            if (gVar != null) {
                                gVar.b(true);
                                return;
                            }
                            return;
                        }
                        break;
                    case -124479363:
                        if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            d6.g gVar2 = iVar.d;
                            if (gVar2 != null) {
                                gVar2.b(false);
                                return;
                            }
                            return;
                        }
                        break;
                    case 1362116196:
                        if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                            long j11 = iVar.e.f6276c;
                            e6.h hVar3 = iVar.f6953n;
                            if (hVar3 != null) {
                                long min2 = Math.min(hVar3.g(), Math.max(0L, hVar3.a() + j11));
                                e6.h hVar4 = iVar.f6953n;
                                if (hVar4 != null) {
                                    hVar4.q(new p(min2));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(iVar.f6947g);
                iVar.f6943a.sendBroadcast(intent);
                return;
            default:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    uz.E((uz.S0 + 1) % 3);
                    boolean z10 = MusicPlayerService.f14498w;
                    musicPlayerService.g();
                    w7 w7Var = w7.P2;
                    if (w7Var != null) {
                        w7Var.c1();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (uz.N0) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(2);
                    }
                    boolean z11 = MusicPlayerService.f14498w;
                    a0 a0Var = musicPlayerService.f14501c;
                    if (a0Var != null) {
                        a0Var.F(uz.N0 ? 1 : 0);
                    }
                    w7 w7Var2 = w7.P2;
                    if (w7Var2 != null) {
                        w7Var2.c1();
                    }
                }
                kj kjVar = MediaController.B().f14483u0;
                if (kjVar != null) {
                    boolean z12 = MusicPlayerService.f14498w;
                    musicPlayerService.a(kjVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean i(Intent intent) {
        e6.h hVar;
        switch (this.f6942g) {
            case 0:
                i.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (hVar = ((i) this.h).f6953n) != null) {
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
        switch (this.f6942g) {
            case 0:
                i.v.b("onPause", new Object[0]);
                e6.h hVar = ((i) this.h).f6953n;
                if (hVar != null) {
                    hVar.r();
                    return;
                }
                return;
            default:
                MediaController.B().R(MediaController.B().f14483u0, true);
                return;
        }
    }

    @Override
    public final void n() {
        switch (this.f6942g) {
            case 0:
                i.v.b("onPlay", new Object[0]);
                e6.h hVar = ((i) this.h).f6953n;
                if (hVar != null) {
                    hVar.r();
                    return;
                }
                return;
            default:
                MediaController.B().S(MediaController.B().f14483u0);
                return;
        }
    }
}
