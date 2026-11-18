package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.q1;
import c8.l9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.bj;
import org.telegram.ui.bn;
import org.telegram.ui.mj;
public final class s extends FrameLayout {
    public final int[] E;
    public final bn f5509a;
    public r f5510b;
    public List f5511c;
    public boolean d;
    public fj f5512e;
    public final int f5513f;
    public final int h;
    public float f5514n;
    public float f5515r;
    public float f5516s;
    public long f5517w;
    public boolean f5518x;
    public boolean f5519y;

    public s(bn bnVar, Context context) {
        super(context);
        this.f5511c = Collections.EMPTY_LIST;
        this.f5513f = 22;
        this.h = 24;
        this.E = new int[2];
        setVisibility(8);
        this.f5509a = bnVar;
        setClipToPadding(false);
        setClipChildren(false);
        bnVar.A0.j(new q1(this, 4));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new q(this, 1));
            return;
        }
        this.f5519y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ah.g(this, 2));
        duration.addListener(new ai.j0(this, 4));
        duration.start();
    }

    public final fj b() {
        aj U8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f5511c.isEmpty()) {
            int i7 = 0;
            fj fjVar = (fj) this.f5511c.get(0);
            if (fjVar.c1() != 0 && (U8 = this.f5509a.U8(fjVar.c1())) != null && (arrayList = U8.d) != null) {
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    fj fjVar2 = (fj) obj;
                    TLRPC.Message message = fjVar2.f23968k;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return fjVar2;
                    }
                }
            }
            return fjVar;
        }
        return null;
    }

    public final void c(boolean z10) {
        int height;
        int height2;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        if (this.d && this.f5512e != null && this.f5510b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.f5517w);
            this.f5517w = System.currentTimeMillis();
            float f10 = this.f5514n;
            float f11 = this.f5515r;
            if (f10 != f11) {
                float f12 = ((float) min) / 220.0f;
                if (f11 > f10) {
                    this.f5514n = Math.min(f10 + f12, f11);
                } else if (f11 < f10) {
                    this.f5514n = Math.max(f10 - f12, f11);
                }
                org.telegram.messenger.g0.g3(new q(this, 0));
            }
            bn bnVar = this.f5509a;
            bj bjVar = bnVar.A0;
            int[] iArr = this.E;
            bjVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f13 = (iArr[1] - iArr[1]) - bnVar.f46077ka;
            boolean z14 = false;
            for (int i11 = 0; i11 < bjVar.getChildCount(); i11++) {
                View childAt = bjVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    fj messageObject = q1Var.getMessageObject();
                    if (messageObject.e1() == this.f5512e.e1()) {
                        boolean P3 = messageObject.P3();
                        r rVar = this.f5510b;
                        if (rVar != null) {
                            rVar.setMirrorX(P3);
                            r rVar2 = this.f5510b;
                            int L = org.telegram.messenger.g0.L(4.0f);
                            boolean z15 = gd.f24216a0;
                            int i12 = this.h;
                            if (!z15 && !P3) {
                                i10 = i12;
                            } else {
                                i10 = 0;
                            }
                            int i13 = L + i10;
                            float f14 = this.f5513f;
                            int L2 = org.telegram.messenger.g0.L(f14);
                            int L3 = org.telegram.messenger.g0.L(4.0f);
                            if (!gd.f24216a0 && !P3) {
                                i12 = 0;
                            }
                            rVar2.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(f14));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = bjVar.getHeight();
                        }
                        if (q1Var.getCurrentMessagesGroup() != null) {
                            zi ziVar = q1Var.getCurrentMessagesGroup().f22908m;
                            height2 = ziVar.d - ziVar.f28303b;
                        } else {
                            height2 = q1Var.getHeight();
                        }
                        float y10 = (q1Var.getY() + f13) - org.telegram.messenger.g0.L(74.0f);
                        float L4 = org.telegram.messenger.g0.L(14.0f);
                        float L5 = height - org.telegram.messenger.g0.L(218.0f);
                        mj mjVar = bnVar.f46094m2;
                        if (mjVar != null && mjVar.getVisibility() == 0) {
                            L4 += mjVar.getHeight();
                        }
                        float f15 = height2;
                        if (y10 > L4 - (f15 / 2.0f) && y10 < L5) {
                            this.f5515r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y10 >= (L4 - f15) - org.telegram.messenger.g0.L(92.0f) && y10 <= L5) {
                                this.f5516s = org.telegram.messenger.g0.L(56.0f) + height2;
                                this.f5515r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f5514n = this.f5515r;
                        }
                        float interpolation = (lr.f37208f.getInterpolation(this.f5514n) * this.f5516s) + y10;
                        r rVar3 = this.f5510b;
                        if (rVar3 != null) {
                            if (z11 != rVar3.O) {
                                rVar3.setFlippedVertically(z11);
                                org.telegram.messenger.g0.g3(new q(this, 0));
                            }
                            if (z12 != this.f5510b.isEnabled()) {
                                this.f5510b.setEnabled(z12);
                                this.f5510b.invalidate();
                                if (z12) {
                                    this.f5510b.setVisibility(0);
                                    if (!this.f5519y) {
                                        this.f5519y = true;
                                        this.f5510b.p(this.f5512e, bnVar.f46163r8, true);
                                    }
                                }
                            }
                            this.f5510b.setTranslationY(l9.a(interpolation, L4, L5));
                            this.f5510b.setTranslationX(q1Var.S1(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5510b.getLayoutParams();
                            int d = i5.c.d(32.0f, q1Var.getBackgroundDrawableLeft(), 0);
                            int d2 = i5.c.d(32.0f, q1Var.getWidth() - q1Var.getBackgroundDrawableRight(), (int) q1Var.S1(true));
                            int L6 = org.telegram.messenger.g0.L(40.0f) * 8;
                            if ((getWidth() - d2) - d < L6) {
                                if (P3) {
                                    d = Math.min(d, getWidth() - L6);
                                    d2 = 0;
                                } else {
                                    d2 = Math.min(d2, getWidth() - L6);
                                    d = 0;
                                }
                            }
                            if (P3) {
                                i7 = 5;
                            } else {
                                i7 = 3;
                            }
                            if (i7 != layoutParams.gravity) {
                                layoutParams.gravity = i7;
                                z14 = true;
                            }
                            if (d != layoutParams.leftMargin) {
                                layoutParams.leftMargin = d;
                                z14 = true;
                            }
                            if (d2 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = d2;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.f5510b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            r rVar4 = this.f5510b;
            if (rVar4 != null && rVar4.isEnabled()) {
                this.f5510b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f5518x) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f5518x = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.fj> r10) {
        throw new UnsupportedOperationException("Method not decompiled: ch.s.setSelectedMessages(java.util.List):void");
    }
}
