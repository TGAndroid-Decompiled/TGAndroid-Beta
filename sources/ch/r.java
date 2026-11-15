package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.z4;
import c8.i9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.er;
import org.telegram.ui.aj;
import org.telegram.ui.an;
import org.telegram.ui.lj;
public final class r extends FrameLayout {
    public final int[] E;
    public final an f5217a;
    public q f5218b;
    public List f5219c;
    public boolean d;
    public gj f5220e;
    public final int f5221f;
    public final int h;
    public float f5222n;
    public float f5223r;
    public float f5224s;
    public long f5225w;
    public boolean f5226x;
    public boolean f5227y;

    public r(an anVar, Context context) {
        super(context);
        this.f5219c = Collections.EMPTY_LIST;
        this.f5221f = 22;
        this.h = 24;
        this.E = new int[2];
        setVisibility(8);
        this.f5217a = anVar;
        setClipToPadding(false);
        setClipChildren(false);
        anVar.A0.j(new z4(this, 3));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new p(this, 1));
            return;
        }
        this.f5227y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ah.h(this, 2));
        duration.addListener(new ai.j0(this, 4));
        duration.start();
    }

    public final gj b() {
        bj U8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f5219c.isEmpty()) {
            int i7 = 0;
            gj gjVar = (gj) this.f5219c.get(0);
            if (gjVar.c1() != 0 && (U8 = this.f5217a.U8(gjVar.c1())) != null && (arrayList = U8.d) != null) {
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    gj gjVar2 = (gj) obj;
                    TLRPC.Message message = gjVar2.f23819k;
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
        if (this.d && this.f5220e != null && this.f5218b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.f5225w);
            this.f5225w = System.currentTimeMillis();
            float f10 = this.f5222n;
            float f11 = this.f5223r;
            if (f10 != f11) {
                float f12 = ((float) min) / 220.0f;
                if (f11 > f10) {
                    this.f5222n = Math.min(f10 + f12, f11);
                } else if (f11 < f10) {
                    this.f5222n = Math.max(f10 - f12, f11);
                }
                org.telegram.messenger.g0.h3(new p(this, 0));
            }
            an anVar = this.f5217a;
            aj ajVar = anVar.A0;
            int[] iArr = this.E;
            ajVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f13 = (iArr[1] - iArr[1]) - anVar.f45248ja;
            boolean z14 = false;
            for (int i11 = 0; i11 < ajVar.getChildCount(); i11++) {
                View childAt = ajVar.getChildAt(i11);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    gj messageObject = q1Var.getMessageObject();
                    if (messageObject.e1() == this.f5220e.e1()) {
                        boolean P3 = messageObject.P3();
                        q qVar = this.f5218b;
                        if (qVar != null) {
                            qVar.setMirrorX(P3);
                            q qVar2 = this.f5218b;
                            int L = org.telegram.messenger.g0.L(4.0f);
                            boolean z15 = hd.f24104a0;
                            int i12 = this.h;
                            if (!z15 && !P3) {
                                i10 = i12;
                            } else {
                                i10 = 0;
                            }
                            int i13 = L + i10;
                            float f14 = this.f5221f;
                            int L2 = org.telegram.messenger.g0.L(f14);
                            int L3 = org.telegram.messenger.g0.L(4.0f);
                            if (!hd.f24104a0 && !P3) {
                                i12 = 0;
                            }
                            qVar2.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(f14));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = ajVar.getHeight();
                        }
                        if (q1Var.getCurrentMessagesGroup() != null) {
                            org.telegram.messenger.aj ajVar2 = q1Var.getCurrentMessagesGroup().f22717m;
                            height2 = ajVar2.d - ajVar2.f22517b;
                        } else {
                            height2 = q1Var.getHeight();
                        }
                        float y10 = (q1Var.getY() + f13) - org.telegram.messenger.g0.L(74.0f);
                        float L4 = org.telegram.messenger.g0.L(14.0f);
                        float L5 = height - org.telegram.messenger.g0.L(218.0f);
                        lj ljVar = anVar.f45278m2;
                        if (ljVar != null && ljVar.getVisibility() == 0) {
                            L4 += ljVar.getHeight();
                        }
                        float f15 = height2;
                        if (y10 > L4 - (f15 / 2.0f) && y10 < L5) {
                            this.f5223r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y10 >= (L4 - f15) - org.telegram.messenger.g0.L(92.0f) && y10 <= L5) {
                                this.f5224s = org.telegram.messenger.g0.L(56.0f) + height2;
                                this.f5223r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f5222n = this.f5223r;
                        }
                        float interpolation = (er.f34419f.getInterpolation(this.f5222n) * this.f5224s) + y10;
                        q qVar3 = this.f5218b;
                        if (qVar3 != null) {
                            if (z11 != qVar3.O) {
                                qVar3.setFlippedVertically(z11);
                                org.telegram.messenger.g0.h3(new p(this, 0));
                            }
                            if (z12 != this.f5218b.isEnabled()) {
                                this.f5218b.setEnabled(z12);
                                this.f5218b.invalidate();
                                if (z12) {
                                    this.f5218b.setVisibility(0);
                                    if (!this.f5227y) {
                                        this.f5227y = true;
                                        this.f5218b.p(this.f5220e, anVar.f45333q8, true);
                                    }
                                }
                            }
                            this.f5218b.setTranslationY(i9.a(interpolation, L4, L5));
                            this.f5218b.setTranslationX(q1Var.S1(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5218b.getLayoutParams();
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
                                this.f5218b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            q qVar4 = this.f5218b;
            if (qVar4 != null && qVar4.isEnabled()) {
                this.f5218b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f5226x) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f5226x = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.gj> r10) {
        throw new UnsupportedOperationException("Method not decompiled: ch.r.setSelectedMessages(java.util.List):void");
    }
}
