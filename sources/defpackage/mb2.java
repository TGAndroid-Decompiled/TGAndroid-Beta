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
public final class mb2 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public byte G = -1;
    public float H;
    public jc0 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final gb2 a;
    public boolean b;
    public StaticLayout c;
    public CharSequence d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public int i;
    public hx2 j;
    public me8 k;
    public id8 l;
    public yd8 m;
    public yd8 n;
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

    public mb2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public static void g(int i, ArrayList arrayList, boolean z) {
        if (z && i != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new sa((byte) 24));
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && i > 0; i2++) {
                fb2 fb2Var = (fb2) arrayList.get(i2);
                int i3 = fb2Var.d;
                if (i3 > 0) {
                    fb2Var.d = i3 + 1;
                    i--;
                }
            }
        }
    }

    public final boolean a(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.a(android.view.MotionEvent):boolean");
    }

    public final void b(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        gb2 gb2Var = this.a;
        k27 k27Var = gb2Var.Q5;
        if (k27Var != null) {
            TLRPC.MessageMedia m1 = k27.m1(k27Var);
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
                byte b = 0;
                if (gb2Var.f7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), gb2Var.f7.length);
                    z2 = false;
                    for (int i = 0; i < min; i++) {
                        CheckBoxBase checkBoxBase = gb2Var.f7[i];
                        if (checkBoxBase != null && checkBoxBase.q) {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z5 = gb2Var.W4;
                if (!z5 && !gb2Var.X4 && this.w && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z5 && !gb2Var.X4 && !this.x) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z6 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.t) {
                    charSequence = k96.M0(2131746984, null);
                    b = 84;
                } else if (z3 && (!poll.multiple_choice || !z4 || !z2)) {
                    if (!z6) {
                        if (k27Var.M0) {
                            charSequence = gl.G2(k96.M0(2131746918, null), false, -gl.L(2.6666667f), 0.0f, 1.0f, 2131232246);
                            b = 82;
                        } else {
                            charSequence = gl.E2(k96.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                            b = 81;
                        }
                    } else {
                        charSequence = k96.a0(null, null, 2131746912, Integer.valueOf(pollResults.total_voters));
                        b = 80;
                    }
                } else if (poll.multiple_choice && z4) {
                    charSequence = k96.M0(2131746963, null);
                    b = 83;
                } else if (!gb2Var.j6 && z6 && ((z5 && (!this.v || this.w)) || (gb2Var.X4 && pollResults.total_voters != 0))) {
                    charSequence = k96.a0(null, null, 2131746912, Integer.valueOf(pollResults.total_voters));
                    b = 80;
                }
                if (b != 0) {
                    if (this.k == null) {
                        me8 me8Var = new me8(gb2Var, gb2Var.cc);
                        this.k = me8Var;
                        me8Var.setCallback(gb2Var);
                        me8Var.a.setCallback(gb2Var);
                        me8Var.d.setCallback(gb2Var);
                    }
                    gb2Var.z2 = charSequence;
                    this.k.d.t(charSequence, z, true);
                    gb2Var.u2 = true;
                    gb2Var.y2 = b;
                    gb2Var.y0();
                }
                gb2Var.c0(z);
            }
        }
    }

    public final boolean c(android.view.MotionEvent r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.c(android.view.MotionEvent):boolean");
    }

    public final boolean d(MotionEvent motionEvent) {
        yd8 yd8Var;
        yd8 yd8Var2;
        gb2 gb2Var = this.a;
        k27 k27Var = gb2Var.Q5;
        if (k27Var != null && k27Var.D == 17 && !k27Var.n4()) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int P1 = (int) gb2Var.P1(motionEvent);
            yd8 yd8Var3 = this.m;
            if (yd8Var3 != null) {
                if (yd8Var3.Y && yd8Var3.a.f && yd8Var3.L.e(x - yd8Var3.M, P1 - yd8Var3.N, action)) {
                    if (action == 0) {
                        gb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    gb2Var.g1 = true;
                    gb2Var.invalidate();
                    return true;
                }
                yd8 yd8Var4 = this.m;
                if ((yd8Var4.Y || yd8Var4.X) && yd8Var4.k(x, P1, action)) {
                    gb2Var.g1 = true;
                    gb2Var.invalidate();
                    return true;
                }
            }
            if (gb2Var.Q5.L0 && (yd8Var2 = this.n) != null) {
                if (yd8Var2.Y && yd8Var2.a.f && yd8Var2.L.e(x - yd8Var2.M, P1 - yd8Var2.N, action)) {
                    if (action == 0) {
                        gb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    gb2Var.g1 = true;
                    gb2Var.invalidate();
                    return true;
                }
                yd8 yd8Var5 = this.n;
                if ((yd8Var5.Y || yd8Var5.X) && yd8Var5.k(x, P1, action)) {
                    gb2Var.g1 = true;
                    gb2Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = (byte) -1;
                yd8 yd8Var6 = this.m;
                if (yd8Var6 != null && yd8Var6.T && yd8Var6.getBounds().contains(x, P1)) {
                    this.G = (byte) -2;
                    gb2Var.invalidate();
                    return true;
                } else if (gb2Var.Q5.L0 && (yd8Var = this.n) != null && yd8Var.T && yd8Var.getBounds().contains(x, P1)) {
                    this.G = (byte) -3;
                    gb2Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                gb2Var.playSoundEffect(0);
                byte b = this.G;
                if (b == -2) {
                    yd8 yd8Var7 = this.m;
                    ImageReceiver imageReceiver = yd8Var7.b;
                    TLRPC.MessageMedia messageMedia = yd8Var7.U;
                    bb2 bb2Var = gb2Var.eb;
                    if (bb2Var != null) {
                        bb2Var.s(gb2Var, null, messageMedia, -2);
                    }
                } else if (b == -3) {
                    yd8 yd8Var8 = this.n;
                    ImageReceiver imageReceiver2 = yd8Var8.b;
                    TLRPC.MessageMedia messageMedia2 = yd8Var8.U;
                    bb2 bb2Var2 = gb2Var.eb;
                    if (bb2Var2 != null) {
                        bb2Var2.s(gb2Var, null, messageMedia2, -3);
                    }
                }
                this.G = (byte) -1;
                gb2Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.e(int):void");
    }

    public final void f(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.f(android.graphics.Canvas):void");
    }

    public final void h() {
        ArrayList arrayList = this.a.Q4;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((fb2) arrayList.get(i)).w.setState(StateSet.NOTHING);
            }
        }
        id8 id8Var = this.l;
        if (id8Var != null) {
            id8Var.a.setState(StateSet.NOTHING);
        }
    }

    public final void i(defpackage.k27 r58, boolean r59) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.i(k27, boolean):void");
    }

    public final void j(long j) {
        jc0 jc0Var;
        k27 k27Var;
        float f;
        gb2 gb2Var = this.a;
        ArrayList arrayList = gb2Var.Q4;
        if (gb2Var.Z4) {
            int i = 360;
            this.E = ((((float) (360 * j)) / 2000.0f) + this.E) - (((int) (f / 360.0f)) * 360);
            float f2 = gb2Var.h5 + ((float) j);
            gb2Var.h5 = f2;
            if (f2 >= 500.0f) {
                gb2Var.h5 = 500.0f;
                f2 = 500.0f;
            }
            if (gb2Var.g5) {
                gb2Var.e5 = (gl.G.getInterpolation(f2 / 500.0f) * 266.0f) + 4.0f;
            } else {
                if (!gb2Var.f5) {
                    i = 270;
                }
                gb2Var.e5 = 4.0f - ((1.0f - gl.F.getInterpolation(f2 / 500.0f)) * i);
            }
            if (gb2Var.h5 == 500.0f) {
                boolean z = gb2Var.g5;
                if (z) {
                    this.E += 270.0f;
                    gb2Var.e5 = -266.0f;
                }
                gb2Var.g5 = !z;
                if (gb2Var.f5) {
                    gb2Var.f5 = false;
                }
                gb2Var.h5 = 0.0f;
            }
            gb2Var.invalidate();
        }
        if (gb2Var.r5 && ((k27Var = gb2Var.Q5) == null || !k27Var.L0)) {
            float f3 = gb2Var.s5;
            if (f3 < 1.0f) {
                float f4 = (((float) j) / 180.0f) + f3;
                gb2Var.s5 = f4;
                if (f4 > 1.0f) {
                    gb2Var.s5 = 1.0f;
                }
                gb2Var.invalidate();
            }
        } else {
            float f5 = gb2Var.s5;
            if (f5 > 0.0f) {
                float f6 = f5 - (((float) j) / 180.0f);
                gb2Var.s5 = f6;
                if (f6 < 0.0f) {
                    gb2Var.s5 = 0.0f;
                }
                gb2Var.invalidate();
            }
        }
        if (this.B) {
            float f7 = gb2Var.R4 + ((float) j);
            gb2Var.R4 = f7;
            if (f7 >= 300.0f) {
                gb2Var.R4 = 300.0f;
                f7 = 300.0f;
            }
            float interpolation = gl.F.getInterpolation(f7 / 300.0f);
            this.r = interpolation;
            if (interpolation >= 1.0f) {
                this.r = 1.0f;
                this.B = false;
                this.C = false;
                gb2Var.Z4 = false;
                if (gb2Var.b5 && gb2Var.c5 && (jc0Var = this.I) != null) {
                    jc0Var.d(null, false);
                }
                gb2Var.b5 = false;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((fb2) arrayList.get(i2)).k = false;
                }
            }
            gb2Var.invalidate();
        }
    }
}
