package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.util.StateSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
public final class xc2 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public byte G = -1;
    public float H;
    public jd0 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final rc2 a;
    public boolean b;
    public StaticLayout c;
    public CharSequence d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public int i;
    public ry2 j;
    public og8 k;
    public kf8 l;
    public ag8 m;
    public ag8 n;
    public int o;
    public int p;
    public int q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public long y;
    public String z;

    public xc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public static void g(int i, ArrayList arrayList, boolean z) {
        if (z && i != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new sa((byte) 24));
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && i > 0; i2++) {
                qc2 qc2Var = (qc2) arrayList.get(i2);
                int i3 = qc2Var.d;
                if (i3 > 0) {
                    qc2Var.d = i3 + 1;
                    i--;
                }
            }
        }
    }

    public final boolean a(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc2.a(android.view.MotionEvent):boolean");
    }

    public final void b(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        rc2 rc2Var = this.a;
        k47 k47Var = rc2Var.Q5;
        if (k47Var != null) {
            TLRPC.MessageMedia m1 = k47.m1(k47Var);
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
                byte b = 0;
                if (rc2Var.f7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), rc2Var.f7.length);
                    z2 = false;
                    for (int i = 0; i < min; i++) {
                        CheckBoxBase checkBoxBase = rc2Var.f7[i];
                        if (checkBoxBase != null && checkBoxBase.q) {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z5 = rc2Var.W4;
                if (!z5 && !rc2Var.X4 && this.w && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z5 && !rc2Var.X4 && !this.x) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z6 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.t) {
                    charSequence = jb6.M0(2131746910, null);
                    b = 84;
                } else if (z3 && (!poll.multiple_choice || !z4 || !z2)) {
                    if (!z6) {
                        if (k47Var.M0) {
                            charSequence = gm.F2(jb6.M0(2131746844, null), false, -gm.L(2.6666667f), 0.0f, 1.0f, 2131232247);
                            b = 82;
                        } else {
                            charSequence = gm.D2(jb6.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                            b = 81;
                        }
                    } else {
                        charSequence = jb6.a0(null, null, 2131746838, Integer.valueOf(pollResults.total_voters));
                        b = 80;
                    }
                } else if (poll.multiple_choice && z4) {
                    charSequence = jb6.M0(2131746889, null);
                    b = 83;
                } else if (!rc2Var.j6 && z6 && ((z5 && (!this.v || this.w)) || (rc2Var.X4 && pollResults.total_voters != 0))) {
                    charSequence = jb6.a0(null, null, 2131746838, Integer.valueOf(pollResults.total_voters));
                    b = 80;
                }
                if (b != 0) {
                    if (this.k == null) {
                        og8 og8Var = new og8(rc2Var, rc2Var.cc);
                        this.k = og8Var;
                        og8Var.setCallback(rc2Var);
                        og8Var.a.setCallback(rc2Var);
                        og8Var.d.setCallback(rc2Var);
                    }
                    rc2Var.z2 = charSequence;
                    this.k.d.t(charSequence, z, true);
                    rc2Var.u2 = true;
                    rc2Var.y2 = b;
                    rc2Var.x0();
                }
                rc2Var.a0(z);
            }
        }
    }

    public final boolean c(android.view.MotionEvent r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc2.c(android.view.MotionEvent):boolean");
    }

    public final boolean d(MotionEvent motionEvent) {
        ag8 ag8Var;
        ag8 ag8Var2;
        rc2 rc2Var = this.a;
        k47 k47Var = rc2Var.Q5;
        if (k47Var != null && k47Var.D == 17 && !k47Var.n4()) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int P1 = (int) rc2Var.P1(motionEvent);
            ag8 ag8Var3 = this.m;
            if (ag8Var3 != null) {
                if (ag8Var3.Y && ag8Var3.a.f && ag8Var3.L.e(x - ag8Var3.M, P1 - ag8Var3.N, action)) {
                    if (action == 0) {
                        rc2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    rc2Var.g1 = true;
                    rc2Var.invalidate();
                    return true;
                }
                ag8 ag8Var4 = this.m;
                if ((ag8Var4.Y || ag8Var4.X) && ag8Var4.k(x, P1, action)) {
                    rc2Var.g1 = true;
                    rc2Var.invalidate();
                    return true;
                }
            }
            if (rc2Var.Q5.L0 && (ag8Var2 = this.n) != null) {
                if (ag8Var2.Y && ag8Var2.a.f && ag8Var2.L.e(x - ag8Var2.M, P1 - ag8Var2.N, action)) {
                    if (action == 0) {
                        rc2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    rc2Var.g1 = true;
                    rc2Var.invalidate();
                    return true;
                }
                ag8 ag8Var5 = this.n;
                if ((ag8Var5.Y || ag8Var5.X) && ag8Var5.k(x, P1, action)) {
                    rc2Var.g1 = true;
                    rc2Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = (byte) -1;
                ag8 ag8Var6 = this.m;
                if (ag8Var6 != null && ag8Var6.T && ag8Var6.getBounds().contains(x, P1)) {
                    this.G = (byte) -2;
                    rc2Var.invalidate();
                    return true;
                } else if (rc2Var.Q5.L0 && (ag8Var = this.n) != null && ag8Var.T && ag8Var.getBounds().contains(x, P1)) {
                    this.G = (byte) -3;
                    rc2Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                rc2Var.playSoundEffect(0);
                byte b = this.G;
                if (b == -2) {
                    ag8 ag8Var7 = this.m;
                    ImageReceiver imageReceiver = ag8Var7.b;
                    TLRPC.MessageMedia messageMedia = ag8Var7.U;
                    mc2 mc2Var = rc2Var.eb;
                    if (mc2Var != null) {
                        mc2Var.m(rc2Var, null, messageMedia, -2);
                    }
                } else if (b == -3) {
                    ag8 ag8Var8 = this.n;
                    ImageReceiver imageReceiver2 = ag8Var8.b;
                    TLRPC.MessageMedia messageMedia2 = ag8Var8.U;
                    mc2 mc2Var2 = rc2Var.eb;
                    if (mc2Var2 != null) {
                        mc2Var2.m(rc2Var, null, messageMedia2, -3);
                    }
                }
                this.G = (byte) -1;
                rc2Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc2.e(int):void");
    }

    public final void f(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc2.f(android.graphics.Canvas):void");
    }

    public final void h() {
        ArrayList arrayList = this.a.Q4;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((qc2) arrayList.get(i)).w.setState(StateSet.NOTHING);
            }
        }
        kf8 kf8Var = this.l;
        if (kf8Var != null) {
            kf8Var.a.setState(StateSet.NOTHING);
        }
    }

    public final void i(defpackage.k47 r58, boolean r59) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc2.i(k47, boolean):void");
    }

    public final void j(long j) {
        jd0 jd0Var;
        k47 k47Var;
        float f;
        rc2 rc2Var = this.a;
        ArrayList arrayList = rc2Var.Q4;
        if (rc2Var.Z4) {
            int i = 360;
            this.E = ((((float) (360 * j)) / 2000.0f) + this.E) - (((int) (f / 360.0f)) * 360);
            float f2 = rc2Var.h5 + ((float) j);
            rc2Var.h5 = f2;
            if (f2 >= 500.0f) {
                rc2Var.h5 = 500.0f;
                f2 = 500.0f;
            }
            if (rc2Var.g5) {
                rc2Var.e5 = (gm.G.getInterpolation(f2 / 500.0f) * 266.0f) + 4.0f;
            } else {
                if (!rc2Var.f5) {
                    i = 270;
                }
                rc2Var.e5 = 4.0f - ((1.0f - gm.F.getInterpolation(f2 / 500.0f)) * i);
            }
            if (rc2Var.h5 == 500.0f) {
                boolean z = rc2Var.g5;
                if (z) {
                    this.E += 270.0f;
                    rc2Var.e5 = -266.0f;
                }
                rc2Var.g5 = !z;
                if (rc2Var.f5) {
                    rc2Var.f5 = false;
                }
                rc2Var.h5 = 0.0f;
            }
            rc2Var.invalidate();
        }
        if (rc2Var.r5 && ((k47Var = rc2Var.Q5) == null || !k47Var.L0)) {
            float f3 = rc2Var.s5;
            if (f3 < 1.0f) {
                float f4 = (((float) j) / 180.0f) + f3;
                rc2Var.s5 = f4;
                if (f4 > 1.0f) {
                    rc2Var.s5 = 1.0f;
                }
                rc2Var.invalidate();
            }
        } else {
            float f5 = rc2Var.s5;
            if (f5 > 0.0f) {
                float f6 = f5 - (((float) j) / 180.0f);
                rc2Var.s5 = f6;
                if (f6 < 0.0f) {
                    rc2Var.s5 = 0.0f;
                }
                rc2Var.invalidate();
            }
        }
        if (this.B) {
            float f7 = rc2Var.R4 + ((float) j);
            rc2Var.R4 = f7;
            if (f7 >= 300.0f) {
                rc2Var.R4 = 300.0f;
                f7 = 300.0f;
            }
            float interpolation = gm.F.getInterpolation(f7 / 300.0f);
            this.r = interpolation;
            if (interpolation >= 1.0f) {
                this.r = 1.0f;
                this.B = false;
                this.C = false;
                rc2Var.Z4 = false;
                if (rc2Var.b5 && rc2Var.c5 && (jd0Var = this.I) != null) {
                    jd0Var.d(null, false);
                }
                rc2Var.b5 = false;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((qc2) arrayList.get(i2)).k = false;
                }
            }
            rc2Var.invalidate();
        }
    }
}
