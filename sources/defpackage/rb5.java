package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class rb5 {
    public e29 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public qb5 g;
    public TLRPC.GroupCallParticipant h;
    public boolean k;
    public final pb5 i = new Runnable(this) {
        public final rb5 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            int i = 0;
            rb5 rb5Var = this.b;
            switch (b) {
                case 0:
                    rb5Var.b.N(0, null);
                    b29 b29Var = rb5Var.a;
                    b29Var.N(0, null);
                    e29 e29Var = rb5Var.c;
                    if (e29Var != null) {
                        e29Var.setAnimation(b29Var);
                        return;
                    }
                    return;
                case 1:
                    b29 b29Var2 = rb5Var.b;
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
                    b29Var2.K(i2);
                    b29Var2.N(i2 - 1, rb5Var.i);
                    b29Var2.H(i);
                    e29 e29Var2 = rb5Var.c;
                    if (e29Var2 != null) {
                        e29Var2.setAnimation(b29Var2);
                        rb5Var.c.d();
                        return;
                    }
                    return;
                case 2:
                    rb5Var.e = false;
                    qb5 qb5Var = rb5Var.g;
                    if (qb5Var != null) {
                        qb5Var.a();
                    }
                    rb5Var.d = false;
                    return;
                default:
                    rb5Var.c(true);
                    return;
            }
        }
    };
    public final pb5 j = new Runnable(this) {
        public final rb5 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            int i = 0;
            rb5 rb5Var = this.b;
            switch (b) {
                case 0:
                    rb5Var.b.N(0, null);
                    b29 b29Var = rb5Var.a;
                    b29Var.N(0, null);
                    e29 e29Var = rb5Var.c;
                    if (e29Var != null) {
                        e29Var.setAnimation(b29Var);
                        return;
                    }
                    return;
                case 1:
                    b29 b29Var2 = rb5Var.b;
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
                    b29Var2.K(i2);
                    b29Var2.N(i2 - 1, rb5Var.i);
                    b29Var2.H(i);
                    e29 e29Var2 = rb5Var.c;
                    if (e29Var2 != null) {
                        e29Var2.setAnimation(b29Var2);
                        rb5Var.c.d();
                        return;
                    }
                    return;
                case 2:
                    rb5Var.e = false;
                    qb5 qb5Var = rb5Var.g;
                    if (qb5Var != null) {
                        qb5Var.a();
                    }
                    rb5Var.d = false;
                    return;
                default:
                    rb5Var.c(true);
                    return;
            }
        }
    };
    public final pb5 l = new Runnable(this) {
        public final rb5 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            int i = 0;
            rb5 rb5Var = this.b;
            switch (b) {
                case 0:
                    rb5Var.b.N(0, null);
                    b29 b29Var = rb5Var.a;
                    b29Var.N(0, null);
                    e29 e29Var = rb5Var.c;
                    if (e29Var != null) {
                        e29Var.setAnimation(b29Var);
                        return;
                    }
                    return;
                case 1:
                    b29 b29Var2 = rb5Var.b;
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
                    b29Var2.K(i2);
                    b29Var2.N(i2 - 1, rb5Var.i);
                    b29Var2.H(i);
                    e29 e29Var2 = rb5Var.c;
                    if (e29Var2 != null) {
                        e29Var2.setAnimation(b29Var2);
                        rb5Var.c.d();
                        return;
                    }
                    return;
                case 2:
                    rb5Var.e = false;
                    qb5 qb5Var = rb5Var.g;
                    if (qb5Var != null) {
                        qb5Var.a();
                    }
                    rb5Var.d = false;
                    return;
                default:
                    rb5Var.c(true);
                    return;
            }
        }
    };
    public final pb5 m = new Runnable(this) {
        public final rb5 b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            int i = 0;
            rb5 rb5Var = this.b;
            switch (b) {
                case 0:
                    rb5Var.b.N(0, null);
                    b29 b29Var = rb5Var.a;
                    b29Var.N(0, null);
                    e29 e29Var = rb5Var.c;
                    if (e29Var != null) {
                        e29Var.setAnimation(b29Var);
                        return;
                    }
                    return;
                case 1:
                    b29 b29Var2 = rb5Var.b;
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
                    b29Var2.K(i2);
                    b29Var2.N(i2 - 1, rb5Var.i);
                    b29Var2.H(i);
                    e29 e29Var2 = rb5Var.c;
                    if (e29Var2 != null) {
                        e29Var2.setAnimation(b29Var2);
                        rb5Var.c.d();
                        return;
                    }
                    return;
                case 2:
                    rb5Var.e = false;
                    qb5 qb5Var = rb5Var.g;
                    if (qb5Var != null) {
                        qb5Var.a();
                    }
                    rb5Var.d = false;
                    return;
                default:
                    rb5Var.c(true);
                    return;
            }
        }
    };
    public final b29 a = new b29(2131624327, hl.L(24.0f), hl.L(24.0f), true, null);
    public final b29 b = new b29(2131624045, hl.L(15.0f), hl.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z = this.d;
            pb5 pb5Var = this.l;
            if (z) {
                hl.r(pb5Var);
            }
            if (!this.e) {
                this.e = true;
                qb5 qb5Var = this.g;
                if (qb5Var != null) {
                    qb5Var.a();
                }
            }
            hl.d3(pb5Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.g = null;
        this.e = false;
        hl.r(this.l);
        hl.r(this.j);
        hl.r(this.m);
        this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        b29 b29Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean K;
        if (this.c != null && (groupCallParticipant = this.h) != null && (b29Var = this.a) != null) {
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
                    hl.d3(this.m, 5000 - j2);
                }
                K = b29Var.K(136);
            } else {
                this.c.setAnimation(b29Var);
                b29Var.N(0, null);
                if (z4) {
                    if (this.f) {
                        K = b29Var.K(36);
                    } else {
                        i = 99;
                    }
                } else {
                    i = 69;
                }
                K = b29Var.K(i);
            }
            if (z) {
                if (K) {
                    if (z5) {
                        b29Var.H(99);
                        b29Var.K(136);
                    } else if (z4 && this.f && !z5) {
                        b29Var.H(0);
                        b29Var.K(36);
                    } else if (z4) {
                        b29Var.H(69);
                        b29Var.K(99);
                    } else {
                        b29Var.H(36);
                        b29Var.K(69);
                    }
                    this.c.d();
                    this.c.invalidate();
                }
            } else {
                b29Var.I(b29Var.f - 1, false, true);
                this.c.invalidate();
            }
            this.c.setAnimation(b29Var);
            this.f = z5;
            if (this.k != z2) {
                this.k = z2;
                qb5 qb5Var = this.g;
                if (qb5Var != null) {
                    qb5Var.a();
                }
            }
        }
    }
}
