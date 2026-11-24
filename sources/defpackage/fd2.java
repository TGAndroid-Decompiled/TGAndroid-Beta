package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class fd2 extends FrameLayout {
    public final int[] E;
    public final mu1 a;
    public ed2 b;
    public List c;
    public boolean d;
    public k27 e;
    public final byte f;
    public final byte h;
    public float n;
    public float r;
    public float s;
    public long w;
    public boolean x;
    public boolean y;

    public fd2(mu1 mu1Var, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = (byte) 22;
        this.h = (byte) 24;
        this.E = new int[2];
        setVisibility(8);
        this.a = mu1Var;
        setClipToPadding(false);
        setClipChildren(false);
        mu1Var.A0.j(new y(this, (byte) 25));
    }

    public final void a(boolean z) {
        if (z) {
            setVisibility(0);
            post(new dd2(this, (byte) 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new uz1(this, (byte) 8));
        duration.addListener(new bb1(this, (byte) 23));
        duration.start();
    }

    public final k27 b() {
        f27 K6;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList;
        if (this.d && !this.c.isEmpty()) {
            int i = 0;
            k27 k27Var = (k27) this.c.get(0);
            if (k27Var.c1() != 0 && (K6 = this.a.K6(k27Var.c1())) != null) {
                ArrayList arrayList2 = K6.d;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    k27 k27Var2 = (k27) obj;
                    TLRPC.Message message = k27Var2.k;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList = tL_messageReactions.results) != null && !arrayList.isEmpty()) {
                        return k27Var2;
                    }
                }
            }
            return k27Var;
        }
        return null;
    }

    public final void c(boolean z) {
        int height;
        int height2;
        boolean z2;
        boolean z3;
        byte b;
        if (this.d && this.e != null && this.b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.w);
            this.w = System.currentTimeMillis();
            float f = this.n;
            float f2 = this.r;
            boolean z4 = false;
            if (f != f2) {
                float f3 = ((float) min) / 220.0f;
                if (f2 > f) {
                    this.n = Math.min(f + f3, f2);
                } else if (f2 < f) {
                    this.n = Math.max(f - f3, f2);
                }
                gl.d3(new dd2(this, (byte) 0));
            }
            mu1 mu1Var = this.a;
            jq1 jq1Var = mu1Var.A0;
            int[] iArr = this.E;
            jq1Var.getLocationInWindow(iArr);
            boolean z5 = true;
            getLocationInWindow(iArr);
            float f4 = (iArr[1] - iArr[1]) - mu1Var.ka;
            for (int i = 0; i < jq1Var.getChildCount(); i++) {
                View childAt = jq1Var.getChildAt(i);
                if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    k27 messageObject = gb2Var.getMessageObject();
                    if (messageObject.e1() == this.e.e1()) {
                        boolean O3 = messageObject.O3();
                        ed2 ed2Var = this.b;
                        if (ed2Var != null) {
                            ed2Var.setMirrorX(O3);
                            ed2 ed2Var2 = this.b;
                            int L = gl.L(4.0f);
                            boolean z6 = k96.a0;
                            byte b2 = this.h;
                            if (!z6 && !O3) {
                                b = b2;
                            } else {
                                b = 0;
                            }
                            int i2 = L + b;
                            float f5 = this.f;
                            int L2 = gl.L(f5);
                            int L3 = gl.L(4.0f);
                            if (!k96.a0 && !O3) {
                                b2 = 0;
                            }
                            ed2Var2.setPadding(i2, L2, L3 + b2, gl.L(f5));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = jq1Var.getHeight();
                        }
                        if (gb2Var.getCurrentMessagesGroup() != null) {
                            e27 e27Var = gb2Var.getCurrentMessagesGroup().m;
                            height2 = e27Var.d - e27Var.b;
                        } else {
                            height2 = gb2Var.getHeight();
                        }
                        float y = (gb2Var.getY() + f4) - gl.L(74.0f);
                        float L4 = gl.L(14.0f);
                        float L5 = height - gl.L(218.0f);
                        uq1 uq1Var = mu1Var.m2;
                        if (uq1Var != null && uq1Var.getVisibility() == 0) {
                            L4 += uq1Var.getHeight();
                        }
                        float f6 = height2;
                        if (y > L4 - (f6 / 2.0f) && y < L5) {
                            this.r = 0.0f;
                            z3 = true;
                            z2 = false;
                        } else {
                            if (y >= (L4 - f6) - gl.L(92.0f) && y <= L5) {
                                this.s = gl.L(56.0f) + height2;
                                this.r = 1.0f;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = z2;
                        }
                        if (!z) {
                            this.n = this.r;
                        }
                        float interpolation = (s33.f.getInterpolation(this.n) * this.s) + y;
                        ed2 ed2Var3 = this.b;
                        if (ed2Var3 != null) {
                            if (z2 != ed2Var3.O) {
                                ed2Var3.setFlippedVertically(z2);
                                gl.d3(new dd2(this, (byte) 0));
                            }
                            if (z3 != this.b.isEnabled()) {
                                this.b.setEnabled(z3);
                                this.b.invalidate();
                                if (z3) {
                                    this.b.setVisibility(0);
                                    if (!this.y) {
                                        this.y = true;
                                        this.b.m(this.e, mu1Var.r8, true);
                                    }
                                }
                            }
                            this.b.setTranslationY(moe.a(interpolation, L4, L5));
                            this.b.setTranslationX(gb2Var.U1(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                            int c = b00.c(32.0f, gb2Var.getBackgroundDrawableLeft(), 0);
                            int c2 = b00.c(32.0f, gb2Var.getWidth() - gb2Var.getBackgroundDrawableRight(), (int) gb2Var.U1(true));
                            int i3 = 3;
                            int L6 = gl.L(40.0f) << 3;
                            if ((getWidth() - c2) - c < L6) {
                                if (O3) {
                                    c = Math.min(c, getWidth() - L6);
                                    c2 = 0;
                                } else {
                                    c2 = Math.min(c2, getWidth() - L6);
                                    c = 0;
                                }
                            }
                            if (O3) {
                                i3 = 5;
                            }
                            if (i3 != layoutParams.gravity) {
                                layoutParams.gravity = i3;
                                z4 = true;
                            }
                            if (c != layoutParams.leftMargin) {
                                layoutParams.leftMargin = c;
                                z4 = true;
                            }
                            if (c2 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = c2;
                            } else {
                                z5 = z4;
                            }
                            if (z5) {
                                this.b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            ed2 ed2Var4 = this.b;
            if (ed2Var4 != null && ed2Var4.isEnabled()) {
                this.b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.x) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z) {
        this.x = z;
        if (z) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<defpackage.k27> r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd2.setSelectedMessages(java.util.List):void");
    }
}
