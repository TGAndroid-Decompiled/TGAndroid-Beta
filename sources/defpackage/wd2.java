package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class wd2 extends FrameLayout {
    public final int[] E;
    public final zu1 a;
    public ud2 b;
    public List c;
    public boolean d;
    public r47 e;
    public final byte f;
    public final byte h;
    public float n;
    public float r;
    public float s;
    public long w;
    public boolean x;
    public boolean y;

    public wd2(zu1 zu1Var, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = (byte) 22;
        this.h = (byte) 24;
        this.E = new int[2];
        setVisibility(8);
        this.a = zu1Var;
        setClipToPadding(false);
        setClipChildren(false);
        zu1Var.A0.j(new y(this, (byte) 25));
    }

    public final void a(boolean z) {
        if (z) {
            setVisibility(0);
            post(new td2(this, (byte) 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new az1(this, (byte) 9));
        duration.addListener(new jb1(this, (byte) 23));
        duration.start();
    }

    public final r47 b() {
        m47 T6;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList;
        if (this.d && !this.c.isEmpty()) {
            int i = 0;
            r47 r47Var = (r47) this.c.get(0);
            if (r47Var.c1() != 0 && (T6 = this.a.T6(r47Var.c1())) != null) {
                ArrayList arrayList2 = T6.d;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    r47 r47Var2 = (r47) obj;
                    TLRPC.Message message = r47Var2.k;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList = tL_messageReactions.results) != null && !arrayList.isEmpty()) {
                        return r47Var2;
                    }
                }
            }
            return r47Var;
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
                hl.c3(new td2(this, (byte) 0));
            }
            zu1 zu1Var = this.a;
            wq1 wq1Var = zu1Var.A0;
            int[] iArr = this.E;
            wq1Var.getLocationInWindow(iArr);
            boolean z5 = true;
            getLocationInWindow(iArr);
            float f4 = (iArr[1] - iArr[1]) - zu1Var.ka;
            for (int i = 0; i < wq1Var.getChildCount(); i++) {
                View childAt = wq1Var.getChildAt(i);
                if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    r47 messageObject = wb2Var.getMessageObject();
                    if (messageObject.e1() == this.e.e1()) {
                        boolean O3 = messageObject.O3();
                        ud2 ud2Var = this.b;
                        if (ud2Var != null) {
                            ud2Var.setMirrorX(O3);
                            ud2 ud2Var2 = this.b;
                            int L = hl.L(4.0f);
                            boolean z6 = ob6.a0;
                            byte b2 = this.h;
                            if (!z6 && !O3) {
                                b = b2;
                            } else {
                                b = 0;
                            }
                            int i2 = L + b;
                            float f5 = this.f;
                            int L2 = hl.L(f5);
                            int L3 = hl.L(4.0f);
                            if (!ob6.a0 && !O3) {
                                b2 = 0;
                            }
                            ud2Var2.setPadding(i2, L2, L3 + b2, hl.L(f5));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = wq1Var.getHeight();
                        }
                        if (wb2Var.getCurrentMessagesGroup() != null) {
                            l47 l47Var = wb2Var.getCurrentMessagesGroup().m;
                            height2 = l47Var.d - l47Var.b;
                        } else {
                            height2 = wb2Var.getHeight();
                        }
                        float y = (wb2Var.getY() + f4) - hl.L(74.0f);
                        float L4 = hl.L(14.0f);
                        float L5 = height - hl.L(218.0f);
                        hr1 hr1Var = zu1Var.m2;
                        if (hr1Var != null && hr1Var.getVisibility() == 0) {
                            L4 += hr1Var.getHeight();
                        }
                        float f6 = height2;
                        if (y > L4 - (f6 / 2.0f) && y < L5) {
                            this.r = 0.0f;
                            z3 = true;
                            z2 = false;
                        } else {
                            if (y >= (L4 - f6) - hl.L(92.0f) && y <= L5) {
                                this.s = hl.L(56.0f) + height2;
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
                        float interpolation = (k43.f.getInterpolation(this.n) * this.s) + y;
                        ud2 ud2Var3 = this.b;
                        if (ud2Var3 != null) {
                            if (z2 != ud2Var3.O) {
                                ud2Var3.setFlippedVertically(z2);
                                hl.c3(new td2(this, (byte) 0));
                            }
                            if (z3 != this.b.isEnabled()) {
                                this.b.setEnabled(z3);
                                this.b.invalidate();
                                if (z3) {
                                    this.b.setVisibility(0);
                                    if (!this.y) {
                                        this.y = true;
                                        this.b.m(this.e, zu1Var.r8, true);
                                    }
                                }
                            }
                            this.b.setTranslationY(ete.a(interpolation, L4, L5));
                            this.b.setTranslationX(wb2Var.U1(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                            int d = c00.d(32.0f, wb2Var.getBackgroundDrawableLeft(), 0);
                            int d2 = c00.d(32.0f, wb2Var.getWidth() - wb2Var.getBackgroundDrawableRight(), (int) wb2Var.U1(true));
                            int i3 = 3;
                            int L6 = hl.L(40.0f) << 3;
                            if ((getWidth() - d2) - d < L6) {
                                if (O3) {
                                    d = Math.min(d, getWidth() - L6);
                                    d2 = 0;
                                } else {
                                    d2 = Math.min(d2, getWidth() - L6);
                                    d = 0;
                                }
                            }
                            if (O3) {
                                i3 = 5;
                            }
                            if (i3 != layoutParams.gravity) {
                                layoutParams.gravity = i3;
                                z4 = true;
                            }
                            if (d != layoutParams.leftMargin) {
                                layoutParams.leftMargin = d;
                                z4 = true;
                            }
                            if (d2 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = d2;
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
            ud2 ud2Var4 = this.b;
            if (ud2Var4 != null && ud2Var4.isEnabled()) {
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

    public void setSelectedMessages(java.util.List<defpackage.r47> r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd2.setSelectedMessages(java.util.List):void");
    }
}
