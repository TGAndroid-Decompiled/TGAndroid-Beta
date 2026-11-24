package defpackage;

import android.content.Intent;
import android.view.KeyEvent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
public final class eh7 extends yu6 {
    public final byte g;
    public final Object h;

    public eh7(Object obj, byte b) {
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
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null) {
                    MediaController.w().h0(k27Var, ((float) (j / 1000)) / ((float) k27Var.L0()));
                    boolean z = MusicPlayerService.s;
                    ((MusicPlayerService) obj).f(j);
                    return;
                }
                return;
            default:
                kgf.v.b("onSeekTo %d", Long.valueOf(j));
                i69 i69Var = ((kgf) obj).n;
                if (i69Var != null) {
                    i69Var.q(new nu6(j));
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
                gba.D(i2);
                MusicPlayerService.g();
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null) {
                    musicPlayerService.a(k27Var, false);
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
                    if (gba.K0) {
                        MediaController.w().k0(0);
                    }
                } else if (!gba.K0) {
                    MediaController.w().k0(2);
                }
                mv6 mv6Var = MusicPlayerService.w;
                if (mv6Var != null) {
                    mv6Var.q0(gba.K0 ? 1 : 0);
                }
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null) {
                    musicPlayerService.a(k27Var, false);
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
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null && k27Var.I3()) {
                    MediaController.w().T(false);
                    return;
                }
                return;
            default:
                kgf.v.b("onSkipToNext", new Object[0]);
                i69 i69Var = ((kgf) this.h).n;
                if (i69Var != null) {
                    fre.e("Must be called from the main thread.");
                    if (!i69Var.w()) {
                        i69.t();
                        return;
                    } else {
                        i69.x(new x5d(i69Var, (byte) 2));
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
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null && k27Var.I3()) {
                    MediaController.w().U();
                    return;
                }
                return;
            default:
                kgf.v.b("onSkipToPrevious", new Object[0]);
                i69 i69Var = ((kgf) this.h).n;
                if (i69Var != null) {
                    fre.e("Must be called from the main thread.");
                    if (!i69Var.w()) {
                        i69.t();
                        return;
                    } else {
                        i69.x(new x5d(i69Var, (byte) 1));
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
                    gba.D((gba.P0 + 1) % 3);
                    MusicPlayerService.g();
                    i20 i20Var = i20.S2;
                    if (i20Var != null) {
                        i20Var.X0();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (gba.K0) {
                        MediaController.w().k0(0);
                    } else {
                        MediaController.w().k0(2);
                    }
                    mv6 mv6Var = MusicPlayerService.w;
                    if (mv6Var != null) {
                        mv6Var.q0(gba.K0 ? 1 : 0);
                    }
                    i20 i20Var2 = i20.S2;
                    if (i20Var2 != null) {
                        i20Var2.X0();
                    }
                }
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null) {
                    boolean z = MusicPlayerService.s;
                    musicPlayerService.a(k27Var, false);
                    return;
                }
                return;
            default:
                kgf kgfVar = (kgf) obj;
                kgf.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                            long j = -kgfVar.e.c;
                            i69 i69Var = kgfVar.n;
                            if (i69Var != null) {
                                long min = Math.min(i69Var.g(), Math.max(0L, i69Var.a() + j));
                                i69 i69Var2 = kgfVar.n;
                                if (i69Var2 != null) {
                                    i69Var2.q(new nu6(min));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                    case -668151673:
                        if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                            j6a j6aVar = kgfVar.d;
                            if (j6aVar != null) {
                                j6aVar.b(true);
                                return;
                            }
                            return;
                        }
                        break;
                    case -124479363:
                        if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            j6a j6aVar2 = kgfVar.d;
                            if (j6aVar2 != null) {
                                j6aVar2.b(false);
                                return;
                            }
                            return;
                        }
                        break;
                    case 1362116196:
                        if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                            long j2 = kgfVar.e.c;
                            i69 i69Var3 = kgfVar.n;
                            if (i69Var3 != null) {
                                long min2 = Math.min(i69Var3.g(), Math.max(0L, i69Var3.a() + j2));
                                i69 i69Var4 = kgfVar.n;
                                if (i69Var4 != null) {
                                    i69Var4.q(new nu6(min2));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(kgfVar.g);
                kgfVar.a.sendBroadcast(intent);
                return;
        }
    }

    @Override
    public final boolean i(Intent intent) {
        i69 i69Var;
        switch (this.g) {
            case 1:
                kgf.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (i69Var = ((kgf) this.h).n) != null) {
                        i69Var.r();
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
                kgf.v.b("onPause", new Object[0]);
                i69 i69Var = ((kgf) this.h).n;
                if (i69Var != null) {
                    i69Var.r();
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
                kgf.v.b("onPlay", new Object[0]);
                i69 i69Var = ((kgf) this.h).n;
                if (i69Var != null) {
                    i69Var.r();
                    return;
                }
                return;
        }
    }
}
