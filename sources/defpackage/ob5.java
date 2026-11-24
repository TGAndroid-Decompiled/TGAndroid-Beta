package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class ob5 {
    public s09 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public nb5 g;
    public TLRPC.GroupCallParticipant h;
    public boolean k;
    public final mb5 i = new Runnable(this) {
        public final ob5 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            int i = 0;
            ob5 ob5Var = this.b;
            switch (b) {
                case 0:
                    ob5Var.b.N(0, null);
                    p09 p09Var = ob5Var.a;
                    p09Var.N(0, null);
                    s09 s09Var = ob5Var.c;
                    if (s09Var != null) {
                        s09Var.setAnimation(p09Var);
                        return;
                    }
                    return;
                case 1:
                    p09 p09Var2 = ob5Var.b;
                    int nextInt = Utilities.b.nextInt(100);
                    int i2 = 120;
                    if (nextInt >= 32) {
                        int i3 = 240;
                        if (nextInt >= 64) {
                            i2 = 420;
                            if (nextInt >= 97) {
                                i3 = 540;
                                if (nextInt != 98) {
                                    i2 = 720;
                                }
                            }
                            i = i3;
                        }
                        i = i2;
                        i2 = i3;
                    }
                    p09Var2.K(i2);
                    p09Var2.N(i2 - 1, ob5Var.i);
                    p09Var2.H(i);
                    s09 s09Var2 = ob5Var.c;
                    if (s09Var2 != null) {
                        s09Var2.setAnimation(p09Var2);
                        ob5Var.c.d();
                        return;
                    }
                    return;
                case 2:
                    ob5Var.e = false;
                    nb5 nb5Var = ob5Var.g;
                    if (nb5Var != null) {
                        nb5Var.a();
                    }
                    ob5Var.d = false;
                    return;
                default:
                    ob5Var.c(true);
                    return;
            }
        }
    };
    public final mb5 j = new Runnable(this) {
        public final ob5 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            int i = 0;
            ob5 ob5Var = this.b;
            switch (b) {
                case 0:
                    ob5Var.b.N(0, null);
                    p09 p09Var = ob5Var.a;
                    p09Var.N(0, null);
                    s09 s09Var = ob5Var.c;
                    if (s09Var != null) {
                        s09Var.setAnimation(p09Var);
                        return;
                    }
                    return;
                case 1:
                    p09 p09Var2 = ob5Var.b;
                    int nextInt = Utilities.b.nextInt(100);
                    int i2 = 120;
                    if (nextInt >= 32) {
                        int i3 = 240;
                        if (nextInt >= 64) {
                            i2 = 420;
                            if (nextInt >= 97) {
                                i3 = 540;
                                if (nextInt != 98) {
                                    i2 = 720;
                                }
                            }
                            i = i3;
                        }
                        i = i2;
                        i2 = i3;
                    }
                    p09Var2.K(i2);
                    p09Var2.N(i2 - 1, ob5Var.i);
                    p09Var2.H(i);
                    s09 s09Var2 = ob5Var.c;
                    if (s09Var2 != null) {
                        s09Var2.setAnimation(p09Var2);
                        ob5Var.c.d();
                        return;
                    }
                    return;
                case 2:
                    ob5Var.e = false;
                    nb5 nb5Var = ob5Var.g;
                    if (nb5Var != null) {
                        nb5Var.a();
                    }
                    ob5Var.d = false;
                    return;
                default:
                    ob5Var.c(true);
                    return;
            }
        }
    };
    public final mb5 l = new Runnable(this) {
        public final ob5 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            int i = 0;
            ob5 ob5Var = this.b;
            switch (b) {
                case 0:
                    ob5Var.b.N(0, null);
                    p09 p09Var = ob5Var.a;
                    p09Var.N(0, null);
                    s09 s09Var = ob5Var.c;
                    if (s09Var != null) {
                        s09Var.setAnimation(p09Var);
                        return;
                    }
                    return;
                case 1:
                    p09 p09Var2 = ob5Var.b;
                    int nextInt = Utilities.b.nextInt(100);
                    int i2 = 120;
                    if (nextInt >= 32) {
                        int i3 = 240;
                        if (nextInt >= 64) {
                            i2 = 420;
                            if (nextInt >= 97) {
                                i3 = 540;
                                if (nextInt != 98) {
                                    i2 = 720;
                                }
                            }
                            i = i3;
                        }
                        i = i2;
                        i2 = i3;
                    }
                    p09Var2.K(i2);
                    p09Var2.N(i2 - 1, ob5Var.i);
                    p09Var2.H(i);
                    s09 s09Var2 = ob5Var.c;
                    if (s09Var2 != null) {
                        s09Var2.setAnimation(p09Var2);
                        ob5Var.c.d();
                        return;
                    }
                    return;
                case 2:
                    ob5Var.e = false;
                    nb5 nb5Var = ob5Var.g;
                    if (nb5Var != null) {
                        nb5Var.a();
                    }
                    ob5Var.d = false;
                    return;
                default:
                    ob5Var.c(true);
                    return;
            }
        }
    };
    public final mb5 m = new Runnable(this) {
        public final ob5 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            int i = 0;
            ob5 ob5Var = this.b;
            switch (b) {
                case 0:
                    ob5Var.b.N(0, null);
                    p09 p09Var = ob5Var.a;
                    p09Var.N(0, null);
                    s09 s09Var = ob5Var.c;
                    if (s09Var != null) {
                        s09Var.setAnimation(p09Var);
                        return;
                    }
                    return;
                case 1:
                    p09 p09Var2 = ob5Var.b;
                    int nextInt = Utilities.b.nextInt(100);
                    int i2 = 120;
                    if (nextInt >= 32) {
                        int i3 = 240;
                        if (nextInt >= 64) {
                            i2 = 420;
                            if (nextInt >= 97) {
                                i3 = 540;
                                if (nextInt != 98) {
                                    i2 = 720;
                                }
                            }
                            i = i3;
                        }
                        i = i2;
                        i2 = i3;
                    }
                    p09Var2.K(i2);
                    p09Var2.N(i2 - 1, ob5Var.i);
                    p09Var2.H(i);
                    s09 s09Var2 = ob5Var.c;
                    if (s09Var2 != null) {
                        s09Var2.setAnimation(p09Var2);
                        ob5Var.c.d();
                        return;
                    }
                    return;
                case 2:
                    ob5Var.e = false;
                    nb5 nb5Var = ob5Var.g;
                    if (nb5Var != null) {
                        nb5Var.a();
                    }
                    ob5Var.d = false;
                    return;
                default:
                    ob5Var.c(true);
                    return;
            }
        }
    };
    public final p09 a = new p09(2131624327, gm.L(24.0f), gm.L(24.0f), true, null);
    public final p09 b = new p09(2131624045, gm.L(15.0f), gm.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z = this.d;
            mb5 mb5Var = this.l;
            if (z) {
                gm.r(mb5Var);
            }
            if (!this.e) {
                this.e = true;
                nb5 nb5Var = this.g;
                if (nb5Var != null) {
                    nb5Var.a();
                }
            }
            gm.d3(mb5Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.g = null;
        this.e = false;
        gm.r(this.l);
        gm.r(this.j);
        gm.r(this.m);
        this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        p09 p09Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean K;
        if (this.c != null && (groupCallParticipant = this.h) != null && (p09Var = this.a) != null) {
            if (groupCallParticipant.muted_by_you && !groupCallParticipant.self) {
                z2 = true;
            } else {
                z2 = false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.GroupCallParticipant groupCallParticipant2 = this.h;
            if (elapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500) {
                z3 = groupCallParticipant2.hasVoiceDelayed;
            } else {
                z3 = groupCallParticipant2.hasVoice;
            }
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.e && z3)) && !z2) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.e && z3))) {
                z4 = true;
            } else {
                z4 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.e) || z2) && !groupCallParticipant3.can_self_unmute && groupCallParticipant3.raise_hand_rating != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j = this.h.lastRaiseHandDate;
                long j2 = elapsedRealtime2 - j;
                if (j != 0 && j2 <= 5000) {
                    gm.d3(this.m, 5000 - j2);
                }
                K = p09Var.K(136);
            } else {
                this.c.setAnimation(p09Var);
                p09Var.N(0, null);
                if (z4) {
                    if (this.f) {
                        K = p09Var.K(36);
                    } else {
                        i = 99;
                    }
                } else {
                    i = 69;
                }
                K = p09Var.K(i);
            }
            if (z) {
                if (K) {
                    if (z5) {
                        p09Var.H(99);
                        p09Var.K(136);
                    } else if (z4 && this.f && !z5) {
                        p09Var.H(0);
                        p09Var.K(36);
                    } else if (z4) {
                        p09Var.H(69);
                        p09Var.K(99);
                    } else {
                        p09Var.H(36);
                        p09Var.K(69);
                    }
                    this.c.d();
                    this.c.invalidate();
                }
            } else {
                p09Var.I(p09Var.f - 1, false, true);
                this.c.invalidate();
            }
            this.c.setAnimation(p09Var);
            this.f = z5;
            if (this.k != z2) {
                this.k = z2;
                nb5 nb5Var = this.g;
                if (nb5Var != null) {
                    nb5Var.a();
                }
            }
        }
    }
}
