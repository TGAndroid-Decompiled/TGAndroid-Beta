package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.u1;
import c8.l9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.nr;
import org.telegram.ui.bn;
import org.telegram.ui.mj;
public final class s extends FrameLayout {
    public final int[] E;
    public final bn f5538a;
    public r f5539b;
    public List f5540c;
    public boolean d;
    public gj f5541e;
    public final int f5542f;
    public final int h;
    public float f5543n;
    public float f5544r;
    public float f5545s;
    public long f5546w;
    public boolean f5547x;
    public boolean f5548y;

    public s(bn bnVar, Context context) {
        super(context);
        this.f5540c = Collections.EMPTY_LIST;
        this.f5542f = 22;
        this.h = 24;
        this.E = new int[2];
        setVisibility(8);
        this.f5538a = bnVar;
        setClipToPadding(false);
        setClipChildren(false);
        bnVar.A0.j(new u1(this, 4));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new q(this, 1));
            return;
        }
        this.f5548y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ah.g(this, 2));
        duration.addListener(new ai.k0(this, 4));
        duration.start();
    }

    public final gj b() {
        bj U8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f5540c.isEmpty()) {
            int i7 = 0;
            gj gjVar = (gj) this.f5540c.get(0);
            if (gjVar.c1() != 0 && (U8 = this.f5538a.U8(gjVar.c1())) != null && (arrayList = U8.d) != null) {
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    gj gjVar2 = (gj) obj;
                    TLRPC.Message message = gjVar2.f24213k;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return gjVar2;
                    }
                }
            }
            return gjVar;
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
        if (this.d && this.f5541e != null && this.f5539b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.f5546w);
            this.f5546w = System.currentTimeMillis();
            float f10 = this.f5543n;
            float f11 = this.f5544r;
            if (f10 != f11) {
                float f12 = ((float) min) / 220.0f;
                if (f11 > f10) {
                    this.f5543n = Math.min(f10 + f12, f11);
                } else if (f11 < f10) {
                    this.f5543n = Math.max(f10 - f12, f11);
                }
                org.telegram.messenger.g0.g3(new q(this, 0));
            }
            bn bnVar = this.f5538a;
            org.telegram.ui.bj bjVar = bnVar.A0;
            int[] iArr = this.E;
            bjVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f13 = (iArr[1] - iArr[1]) - bnVar.f46095ka;
            boolean z14 = false;
            for (int i11 = 0; i11 < bjVar.getChildCount(); i11++) {
                View childAt = bjVar.getChildAt(i11);
                if (childAt instanceof r1) {
                    r1 r1Var = (r1) childAt;
                    gj messageObject = r1Var.getMessageObject();
                    if (messageObject.e1() == this.f5541e.e1()) {
                        boolean P3 = messageObject.P3();
                        r rVar = this.f5539b;
                        if (rVar != null) {
                            rVar.setMirrorX(P3);
                            r rVar2 = this.f5539b;
                            int L = org.telegram.messenger.g0.L(4.0f);
                            boolean z15 = hd.f24444a0;
                            int i12 = this.h;
                            if (!z15 && !P3) {
                                i10 = i12;
                            } else {
                                i10 = 0;
                            }
                            int i13 = L + i10;
                            float f14 = this.f5542f;
                            int L2 = org.telegram.messenger.g0.L(f14);
                            int L3 = org.telegram.messenger.g0.L(4.0f);
                            if (!hd.f24444a0 && !P3) {
                                i12 = 0;
                            }
                            rVar2.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(f14));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = bjVar.getHeight();
                        }
                        if (r1Var.getCurrentMessagesGroup() != null) {
                            aj ajVar = r1Var.getCurrentMessagesGroup().f23120m;
                            height2 = ajVar.d - ajVar.f22920b;
                        } else {
                            height2 = r1Var.getHeight();
                        }
                        float y10 = (r1Var.getY() + f13) - org.telegram.messenger.g0.L(74.0f);
                        float L4 = org.telegram.messenger.g0.L(14.0f);
                        float L5 = height - org.telegram.messenger.g0.L(218.0f);
                        mj mjVar = bnVar.f46112m2;
                        if (mjVar != null && mjVar.getVisibility() == 0) {
                            L4 += mjVar.getHeight();
                        }
                        float f15 = height2;
                        if (y10 > L4 - (f15 / 2.0f) && y10 < L5) {
                            this.f5544r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y10 >= (L4 - f15) - org.telegram.messenger.g0.L(92.0f) && y10 <= L5) {
                                this.f5545s = org.telegram.messenger.g0.L(56.0f) + height2;
                                this.f5544r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f5543n = this.f5544r;
                        }
                        float interpolation = (nr.f37961f.getInterpolation(this.f5543n) * this.f5545s) + y10;
                        r rVar3 = this.f5539b;
                        if (rVar3 != null) {
                            if (z11 != rVar3.O) {
                                rVar3.setFlippedVertically(z11);
                                org.telegram.messenger.g0.g3(new q(this, 0));
                            }
                            if (z12 != this.f5539b.isEnabled()) {
                                this.f5539b.setEnabled(z12);
                                this.f5539b.invalidate();
                                if (z12) {
                                    this.f5539b.setVisibility(0);
                                    if (!this.f5548y) {
                                        this.f5548y = true;
                                        this.f5539b.p(this.f5541e, bnVar.f46181r8, true);
                                    }
                                }
                            }
                            this.f5539b.setTranslationY(l9.a(interpolation, L4, L5));
                            this.f5539b.setTranslationX(r1Var.S1(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5539b.getLayoutParams();
                            int d = i5.c.d(32.0f, r1Var.getBackgroundDrawableLeft(), 0);
                            int d2 = i5.c.d(32.0f, r1Var.getWidth() - r1Var.getBackgroundDrawableRight(), (int) r1Var.S1(true));
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
                                this.f5539b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            r rVar4 = this.f5539b;
            if (rVar4 != null && rVar4.isEnabled()) {
                this.f5539b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f5547x) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f5547x = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.gj> r10) {
        throw new UnsupportedOperationException("Method not decompiled: ch.s.setSelectedMessages(java.util.List):void");
    }
}
