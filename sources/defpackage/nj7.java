package defpackage;

import android.content.Intent;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
public final class nj7 extends dx6 {
    public final byte g;
    public final Object h;

    public nj7(Object obj, byte b) {
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
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null) {
                    MediaController.z().k0(r47Var, ((float) (j / 1000)) / ((float) r47Var.L0()));
                    boolean z = MusicPlayerService.s;
                    ((MusicPlayerService) obj).f(j);
                    return;
                }
                return;
            default:
                alf.v.b("onSeekTo %d", Long.valueOf(j));
                v99 v99Var = ((alf) obj).n;
                if (v99Var != null) {
                    v99Var.q(new sw6(j));
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
                xea.D(i2);
                MusicPlayerService.g();
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null) {
                    musicPlayerService.a(r47Var, false);
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
                    if (xea.J0) {
                        MediaController.z().n0(0);
                    }
                } else if (!xea.J0) {
                    MediaController.z().n0(2);
                }
                rx6 rx6Var = MusicPlayerService.w;
                if (rx6Var != null) {
                    rx6Var.v0(xea.J0 ? 1 : 0);
                }
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null) {
                    musicPlayerService.a(r47Var, false);
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
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null && r47Var.I3()) {
                    MediaController.z().X(false);
                    return;
                }
                return;
            default:
                alf.v.b("onSkipToNext", new Object[0]);
                v99 v99Var = ((alf) this.h).n;
                if (v99Var != null) {
                    xve.e("Must be called from the main thread.");
                    if (!v99Var.w()) {
                        v99.t();
                        return;
                    } else {
                        v99.x(new qad(v99Var, (byte) 2));
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
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null && r47Var.I3()) {
                    MediaController.z().Y();
                    return;
                }
                return;
            default:
                alf.v.b("onSkipToPrevious", new Object[0]);
                v99 v99Var = ((alf) this.h).n;
                if (v99Var != null) {
                    xve.e("Must be called from the main thread.");
                    if (!v99Var.w()) {
                        v99.t();
                        return;
                    } else {
                        v99.x(new qad(v99Var, (byte) 1));
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
                    xea.D((xea.O0 + 1) % 3);
                    MusicPlayerService.g();
                    j20 j20Var = j20.S2;
                    if (j20Var != null) {
                        j20Var.Y0();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (xea.J0) {
                        MediaController.z().n0(0);
                    } else {
                        MediaController.z().n0(2);
                    }
                    rx6 rx6Var = MusicPlayerService.w;
                    if (rx6Var != null) {
                        rx6Var.v0(xea.J0 ? 1 : 0);
                    }
                    j20 j20Var2 = j20.S2;
                    if (j20Var2 != null) {
                        j20Var2.Y0();
                    }
                }
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null) {
                    boolean z = MusicPlayerService.s;
                    musicPlayerService.a(r47Var, false);
                    return;
                }
                return;
            default:
                alf alfVar = (alf) obj;
                alf.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                            long j = -alfVar.e.c;
                            v99 v99Var = alfVar.n;
                            if (v99Var != null) {
                                long min = Math.min(v99Var.g(), Math.max(0L, v99Var.a() + j));
                                v99 v99Var2 = alfVar.n;
                                if (v99Var2 != null) {
                                    v99Var2.q(new sw6(min));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                    case -668151673:
                        if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                            baa baaVar = alfVar.d;
                            if (baaVar != null) {
                                baaVar.b(true);
                                return;
                            }
                            return;
                        }
                        break;
                    case -124479363:
                        if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            baa baaVar2 = alfVar.d;
                            if (baaVar2 != null) {
                                baaVar2.b(false);
                                return;
                            }
                            return;
                        }
                        break;
                    case 1362116196:
                        if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                            long j2 = alfVar.e.c;
                            v99 v99Var3 = alfVar.n;
                            if (v99Var3 != null) {
                                long min2 = Math.min(v99Var3.g(), Math.max(0L, v99Var3.a() + j2));
                                v99 v99Var4 = alfVar.n;
                                if (v99Var4 != null) {
                                    v99Var4.q(new sw6(min2));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(alfVar.g);
                alfVar.a.sendBroadcast(intent);
                return;
        }
    }

    @Override
    public final boolean i(Intent intent) {
        v99 v99Var;
        switch (this.g) {
            case 1:
                alf.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (v99Var = ((alf) this.h).n) != null) {
                        v99Var.r();
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
                MediaController.z().U(MediaController.z().v0, true);
                return;
            default:
                alf.v.b("onPause", new Object[0]);
                v99 v99Var = ((alf) this.h).n;
                if (v99Var != null) {
                    v99Var.r();
                    return;
                }
                return;
        }
    }

    @Override
    public final void n() {
        switch (this.g) {
            case 0:
                MediaController.z().V(MediaController.z().v0);
                return;
            default:
                alf.v.b("onPlay", new Object[0]);
                v99 v99Var = ((alf) this.h).n;
                if (v99Var != null) {
                    v99Var.r();
                    return;
                }
                return;
        }
    }
}
