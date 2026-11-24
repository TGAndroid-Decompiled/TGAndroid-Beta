package defpackage;

import android.content.Intent;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
public final class hj7 extends yw6 {
    public final byte g;
    public final Object h;

    public hj7(Object obj, byte b) {
        super((byte) 1);
        this.g = b;
        this.h = obj;
    }

    @Override
    public final void G(long j) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null) {
                    MediaController.w().h0(k47Var, ((float) (j / 1000)) / ((float) k47Var.L0()));
                    boolean z = MusicPlayerService.s;
                    ((MusicPlayerService) obj).f(j);
                    return;
                }
                return;
            default:
                lif.v.b("onSeekTo %d", Long.valueOf(j));
                k89 k89Var = ((lif) obj).n;
                if (k89Var != null) {
                    k89Var.q(new nw6(j));
                    return;
                }
                return;
        }
    }

    @Override
    public final void M(int i) {
        switch (this.g) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                int i2 = 2;
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                }
                gda.D(i2);
                MusicPlayerService.g();
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null) {
                    musicPlayerService.a(k47Var, false);
                    return;
                }
                return;
            default:
                super.M(i);
                return;
        }
    }

    @Override
    public final void P(int i) {
        switch (this.g) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i != 1 && i != 2) {
                    if (gda.J0) {
                        MediaController.w().k0(0);
                    }
                } else if (!gda.J0) {
                    MediaController.w().k0(2);
                }
                mx6 mx6Var = MusicPlayerService.w;
                if (mx6Var != null) {
                    mx6Var.u0(gda.J0 ? 1 : 0);
                }
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null) {
                    musicPlayerService.a(k47Var, false);
                    return;
                }
                return;
            default:
                super.P(i);
                return;
        }
    }

    @Override
    public final void S() {
        switch (this.g) {
            case 0:
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null && k47Var.I3()) {
                    MediaController.w().T(false);
                    return;
                }
                return;
            default:
                lif.v.b("onSkipToNext", new Object[0]);
                k89 k89Var = ((lif) this.h).n;
                if (k89Var != null) {
                    ite.e("Must be called from the main thread.");
                    if (!k89Var.w()) {
                        k89.t();
                        return;
                    } else {
                        k89.x(new z7d(k89Var, (byte) 2));
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void V() {
        switch (this.g) {
            case 0:
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null && k47Var.I3()) {
                    MediaController.w().U();
                    return;
                }
                return;
            default:
                lif.v.b("onSkipToPrevious", new Object[0]);
                k89 k89Var = ((lif) this.h).n;
                if (k89Var != null) {
                    ite.e("Must be called from the main thread.");
                    if (!k89Var.w()) {
                        k89.t();
                        return;
                    } else {
                        k89.x(new z7d(k89Var, (byte) 1));
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void f(String str) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    gda.D((gda.O0 + 1) % 3);
                    MusicPlayerService.g();
                    i30 i30Var = i30.S2;
                    if (i30Var != null) {
                        i30Var.X0();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (gda.J0) {
                        MediaController.w().k0(0);
                    } else {
                        MediaController.w().k0(2);
                    }
                    mx6 mx6Var = MusicPlayerService.w;
                    if (mx6Var != null) {
                        mx6Var.u0(gda.J0 ? 1 : 0);
                    }
                    i30 i30Var2 = i30.S2;
                    if (i30Var2 != null) {
                        i30Var2.X0();
                    }
                }
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null) {
                    boolean z = MusicPlayerService.s;
                    musicPlayerService.a(k47Var, false);
                    return;
                }
                return;
            default:
                lif lifVar = (lif) obj;
                lif.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                            long j = -lifVar.e.c;
                            k89 k89Var = lifVar.n;
                            if (k89Var != null) {
                                long min = Math.min(k89Var.g(), Math.max(0L, k89Var.a() + j));
                                k89 k89Var2 = lifVar.n;
                                if (k89Var2 != null) {
                                    k89Var2.q(new nw6(min));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                    case -668151673:
                        if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                            l8a l8aVar = lifVar.d;
                            if (l8aVar != null) {
                                l8aVar.b(true);
                                return;
                            }
                            return;
                        }
                        break;
                    case -124479363:
                        if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            l8a l8aVar2 = lifVar.d;
                            if (l8aVar2 != null) {
                                l8aVar2.b(false);
                                return;
                            }
                            return;
                        }
                        break;
                    case 1362116196:
                        if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                            long j2 = lifVar.e.c;
                            k89 k89Var3 = lifVar.n;
                            if (k89Var3 != null) {
                                long min2 = Math.min(k89Var3.g(), Math.max(0L, k89Var3.a() + j2));
                                k89 k89Var4 = lifVar.n;
                                if (k89Var4 != null) {
                                    k89Var4.q(new nw6(min2));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(lifVar.g);
                lifVar.a.sendBroadcast(intent);
                return;
        }
    }

    @Override
    public final boolean i(Intent intent) {
        k89 k89Var;
        switch (this.g) {
            case 1:
                lif.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (k89Var = ((lif) this.h).n) != null) {
                        k89Var.r();
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
        switch (this.g) {
            case 0:
                MediaController.w().Q(MediaController.w().v0, true);
                return;
            default:
                lif.v.b("onPause", new Object[0]);
                k89 k89Var = ((lif) this.h).n;
                if (k89Var != null) {
                    k89Var.r();
                    return;
                }
                return;
        }
    }

    @Override
    public final void n() {
        switch (this.g) {
            case 0:
                MediaController.w().R(MediaController.w().v0);
                return;
            default:
                lif.v.b("onPlay", new Object[0]);
                k89 k89Var = ((lif) this.h).n;
                if (k89Var != null) {
                    k89Var.r();
                    return;
                }
                return;
        }
    }
}
