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
public final class cc2 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public byte G = -1;
    public float H;
    public lc0 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final wb2 a;
    public boolean b;
    public StaticLayout c;
    public CharSequence d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public int i;
    public by2 j;
    public ai8 k;
    public wg8 l;
    public mh8 m;
    public mh8 n;
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

    public cc2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public static void g(int i, ArrayList arrayList, boolean z) {
        if (z && i != 0 && !arrayList.isEmpty()) {
            Collections.sort(arrayList, new ta((byte) 24));
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && i > 0; i2++) {
                vb2 vb2Var = (vb2) arrayList.get(i2);
                int i3 = vb2Var.d;
                if (i3 > 0) {
                    vb2Var.d = i3 + 1;
                    i--;
                }
            }
        }
    }

    public final boolean a(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc2.a(android.view.MotionEvent):boolean");
    }

    public final void b(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        wb2 wb2Var = this.a;
        r47 r47Var = wb2Var.Q5;
        if (r47Var != null) {
            TLRPC.MessageMedia m1 = r47.m1(r47Var);
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
                byte b = 0;
                if (wb2Var.f7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), wb2Var.f7.length);
                    z2 = false;
                    for (int i = 0; i < min; i++) {
                        CheckBoxBase checkBoxBase = wb2Var.f7[i];
                        if (checkBoxBase != null && checkBoxBase.q) {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z5 = wb2Var.W4;
                if (!z5 && !wb2Var.X4 && this.w && pollResults != null && pollResults.total_voters != 0 && tL_messageMediaPoll.poll.creator) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z5 && !wb2Var.X4 && !this.x) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z6 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.t) {
                    charSequence = ob6.M0(2131746904, null);
                    b = 84;
                } else if (z3 && (!poll.multiple_choice || !z4 || !z2)) {
                    if (!z6) {
                        if (r47Var.M0) {
                            charSequence = hl.F2(ob6.M0(2131746838, null), false, -hl.L(2.6666667f), 0.0f, 1.0f, 2131232246);
                            b = 82;
                        } else {
                            charSequence = hl.D2(ob6.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                            b = 81;
                        }
                    } else {
                        charSequence = ob6.a0(null, null, 2131746832, Integer.valueOf(pollResults.total_voters));
                        b = 80;
                    }
                } else if (poll.multiple_choice && z4) {
                    charSequence = ob6.M0(2131746883, null);
                    b = 83;
                } else if (!wb2Var.j6 && z6 && ((z5 && (!this.v || this.w)) || (wb2Var.X4 && pollResults.total_voters != 0))) {
                    charSequence = ob6.a0(null, null, 2131746832, Integer.valueOf(pollResults.total_voters));
                    b = 80;
                }
                if (b != 0) {
                    if (this.k == null) {
                        ai8 ai8Var = new ai8(wb2Var, wb2Var.cc);
                        this.k = ai8Var;
                        ai8Var.setCallback(wb2Var);
                        ai8Var.a.setCallback(wb2Var);
                        ai8Var.d.setCallback(wb2Var);
                    }
                    wb2Var.z2 = charSequence;
                    this.k.d.t(charSequence, z, true);
                    wb2Var.u2 = true;
                    wb2Var.y2 = b;
                    wb2Var.y0();
                }
                wb2Var.b0(z);
            }
        }
    }

    public final boolean c(android.view.MotionEvent r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc2.c(android.view.MotionEvent):boolean");
    }

    public final boolean d(MotionEvent motionEvent) {
        mh8 mh8Var;
        mh8 mh8Var2;
        wb2 wb2Var = this.a;
        r47 r47Var = wb2Var.Q5;
        if (r47Var != null && r47Var.D == 17 && !r47Var.n4()) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int P1 = (int) wb2Var.P1(motionEvent);
            mh8 mh8Var3 = this.m;
            if (mh8Var3 != null) {
                if (mh8Var3.Y && mh8Var3.a.f && mh8Var3.L.e(x - mh8Var3.M, P1 - mh8Var3.N, action)) {
                    if (action == 0) {
                        wb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    wb2Var.g1 = true;
                    wb2Var.invalidate();
                    return true;
                }
                mh8 mh8Var4 = this.m;
                if ((mh8Var4.Y || mh8Var4.X) && mh8Var4.k(x, P1, action)) {
                    wb2Var.g1 = true;
                    wb2Var.invalidate();
                    return true;
                }
            }
            if (wb2Var.Q5.L0 && (mh8Var2 = this.n) != null) {
                if (mh8Var2.Y && mh8Var2.a.f && mh8Var2.L.e(x - mh8Var2.M, P1 - mh8Var2.N, action)) {
                    if (action == 0) {
                        wb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    wb2Var.g1 = true;
                    wb2Var.invalidate();
                    return true;
                }
                mh8 mh8Var5 = this.n;
                if ((mh8Var5.Y || mh8Var5.X) && mh8Var5.k(x, P1, action)) {
                    wb2Var.g1 = true;
                    wb2Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = (byte) -1;
                mh8 mh8Var6 = this.m;
                if (mh8Var6 != null && mh8Var6.T && mh8Var6.getBounds().contains(x, P1)) {
                    this.G = (byte) -2;
                    wb2Var.invalidate();
                    return true;
                } else if (wb2Var.Q5.L0 && (mh8Var = this.n) != null && mh8Var.T && mh8Var.getBounds().contains(x, P1)) {
                    this.G = (byte) -3;
                    wb2Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                wb2Var.playSoundEffect(0);
                byte b = this.G;
                if (b == -2) {
                    mh8 mh8Var7 = this.m;
                    ImageReceiver imageReceiver = mh8Var7.b;
                    TLRPC.MessageMedia messageMedia = mh8Var7.U;
                    rb2 rb2Var = wb2Var.eb;
                    if (rb2Var != null) {
                        rb2Var.m(wb2Var, null, messageMedia, -2);
                    }
                } else if (b == -3) {
                    mh8 mh8Var8 = this.n;
                    ImageReceiver imageReceiver2 = mh8Var8.b;
                    TLRPC.MessageMedia messageMedia2 = mh8Var8.U;
                    rb2 rb2Var2 = wb2Var.eb;
                    if (rb2Var2 != null) {
                        rb2Var2.m(wb2Var, null, messageMedia2, -3);
                    }
                }
                this.G = (byte) -1;
                wb2Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc2.e(int):void");
    }

    public final void f(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc2.f(android.graphics.Canvas):void");
    }

    public final void h() {
        ArrayList arrayList = this.a.Q4;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((vb2) arrayList.get(i)).w.setState(StateSet.NOTHING);
            }
        }
        wg8 wg8Var = this.l;
        if (wg8Var != null) {
            wg8Var.a.setState(StateSet.NOTHING);
        }
    }

    public final void i(defpackage.r47 r58, boolean r59) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc2.i(r47, boolean):void");
    }

    public final void j(long j) {
        lc0 lc0Var;
        r47 r47Var;
        float f;
        wb2 wb2Var = this.a;
        ArrayList arrayList = wb2Var.Q4;
        if (wb2Var.Z4) {
            int i = 360;
            this.E = ((((float) (360 * j)) / 2000.0f) + this.E) - (((int) (f / 360.0f)) * 360);
            float f2 = wb2Var.h5 + ((float) j);
            wb2Var.h5 = f2;
            if (f2 >= 500.0f) {
                wb2Var.h5 = 500.0f;
                f2 = 500.0f;
            }
            if (wb2Var.g5) {
                wb2Var.e5 = (hl.G.getInterpolation(f2 / 500.0f) * 266.0f) + 4.0f;
            } else {
                if (!wb2Var.f5) {
                    i = 270;
                }
                wb2Var.e5 = 4.0f - ((1.0f - hl.F.getInterpolation(f2 / 500.0f)) * i);
            }
            if (wb2Var.h5 == 500.0f) {
                boolean z = wb2Var.g5;
                if (z) {
                    this.E += 270.0f;
                    wb2Var.e5 = -266.0f;
                }
                wb2Var.g5 = !z;
                if (wb2Var.f5) {
                    wb2Var.f5 = false;
                }
                wb2Var.h5 = 0.0f;
            }
            wb2Var.invalidate();
        }
        if (wb2Var.r5 && ((r47Var = wb2Var.Q5) == null || !r47Var.L0)) {
            float f3 = wb2Var.s5;
            if (f3 < 1.0f) {
                float f4 = (((float) j) / 180.0f) + f3;
                wb2Var.s5 = f4;
                if (f4 > 1.0f) {
                    wb2Var.s5 = 1.0f;
                }
                wb2Var.invalidate();
            }
        } else {
            float f5 = wb2Var.s5;
            if (f5 > 0.0f) {
                float f6 = f5 - (((float) j) / 180.0f);
                wb2Var.s5 = f6;
                if (f6 < 0.0f) {
                    wb2Var.s5 = 0.0f;
                }
                wb2Var.invalidate();
            }
        }
        if (this.B) {
            float f7 = wb2Var.R4 + ((float) j);
            wb2Var.R4 = f7;
            if (f7 >= 300.0f) {
                wb2Var.R4 = 300.0f;
                f7 = 300.0f;
            }
            float interpolation = hl.F.getInterpolation(f7 / 300.0f);
            this.r = interpolation;
            if (interpolation >= 1.0f) {
                this.r = 1.0f;
                this.B = false;
                this.C = false;
                wb2Var.Z4 = false;
                if (wb2Var.b5 && wb2Var.c5 && (lc0Var = this.I) != null) {
                    lc0Var.d(null, false);
                }
                wb2Var.b5 = false;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((vb2) arrayList.get(i2)).k = false;
                }
            }
            wb2Var.invalidate();
        }
    }
}
