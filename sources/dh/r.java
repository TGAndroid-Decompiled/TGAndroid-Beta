package dh;

import ai.e1;
import ai.j5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.be;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.ti;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hj;
import org.telegram.ui.wi;
import org.telegram.ui.wm;
public final class r extends FrameLayout {
    public final int[] E;
    public final wm f9140a;
    public q f9141b;
    public List f9142c;
    public boolean d;
    public zi f9143e;
    public final int f9144f;
    public final int h;
    public float f9145n;
    public float f9146r;
    public float f9147s;
    public long f9148w;
    public boolean f9149x;
    public boolean f9150y;

    public r(wm wmVar, Context context) {
        super(context);
        this.f9142c = Collections.EMPTY_LIST;
        this.f9144f = 22;
        this.h = 24;
        this.E = new int[2];
        setVisibility(8);
        this.f9140a = wmVar;
        setClipToPadding(false);
        setClipChildren(false);
        wmVar.A0.j(new j5(this, 10));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new p(this, 1));
            return;
        }
        this.f9150y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new bh.f(this, 10));
        duration.addListener(new e1(this, 5));
        duration.start();
    }

    public final zi b() {
        ui S8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f9142c.isEmpty()) {
            int i3 = 0;
            zi ziVar = (zi) this.f9142c.get(0);
            if (ziVar.d1() != 0 && (S8 = this.f9140a.S8(ziVar.d1())) != null && (arrayList = S8.d) != null) {
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    zi ziVar2 = (zi) obj;
                    TLRPC.Message message = ziVar2.f26868k;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return ziVar2;
                    }
                }
            }
            return ziVar;
        }
        return null;
    }

    public final void c(boolean z10) {
        int height;
        int height2;
        boolean z11;
        boolean z12;
        int i3;
        int i10;
        if (this.d && this.f9143e != null && this.f9141b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.f9148w);
            this.f9148w = System.currentTimeMillis();
            float f10 = this.f9145n;
            float f11 = this.f9146r;
            if (f10 != f11) {
                float f12 = ((float) min) / 220.0f;
                if (f11 > f10) {
                    this.f9145n = Math.min(f10 + f12, f11);
                } else if (f11 < f10) {
                    this.f9145n = Math.max(f10 - f12, f11);
                }
                org.telegram.messenger.g0.h3(new p(this, 0));
            }
            wm wmVar = this.f9140a;
            wi wiVar = wmVar.A0;
            int[] iArr = this.E;
            wiVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f13 = (iArr[1] - iArr[1]) - wmVar.f51343ha;
            boolean z14 = false;
            for (int i11 = 0; i11 < wiVar.getChildCount(); i11++) {
                View childAt = wiVar.getChildAt(i11);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    zi messageObject = q1Var.getMessageObject();
                    if (messageObject.f1() == this.f9143e.f1()) {
                        boolean Q3 = messageObject.Q3();
                        q qVar = this.f9141b;
                        if (qVar != null) {
                            qVar.setMirrorX(Q3);
                            q qVar2 = this.f9141b;
                            int L = org.telegram.messenger.g0.L(4.0f);
                            boolean z15 = bd.f21784a0;
                            int i12 = this.h;
                            if (!z15 && !Q3) {
                                i10 = i12;
                            } else {
                                i10 = 0;
                            }
                            int i13 = L + i10;
                            float f14 = this.f9144f;
                            int L2 = org.telegram.messenger.g0.L(f14);
                            int L3 = org.telegram.messenger.g0.L(4.0f);
                            if (!bd.f21784a0 && !Q3) {
                                i12 = 0;
                            }
                            qVar2.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(f14));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = wiVar.getHeight();
                        }
                        if (q1Var.getCurrentMessagesGroup() != null) {
                            ti tiVar = q1Var.getCurrentMessagesGroup().f25709m;
                            height2 = tiVar.d - tiVar.f25528b;
                        } else {
                            height2 = q1Var.getHeight();
                        }
                        float y9 = (q1Var.getY() + f13) - org.telegram.messenger.g0.L(74.0f);
                        float L4 = org.telegram.messenger.g0.L(14.0f);
                        float L5 = height - org.telegram.messenger.g0.L(218.0f);
                        hj hjVar = wmVar.f51395m2;
                        if (hjVar != null && hjVar.getVisibility() == 0) {
                            L4 += hjVar.getHeight();
                        }
                        float f15 = height2;
                        if (y9 > L4 - (f15 / 2.0f) && y9 < L5) {
                            this.f9146r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y9 >= (L4 - f15) - org.telegram.messenger.g0.L(92.0f) && y9 <= L5) {
                                this.f9147s = org.telegram.messenger.g0.L(56.0f) + height2;
                                this.f9146r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f9145n = this.f9146r;
                        }
                        float interpolation = (xq.f40452f.getInterpolation(this.f9145n) * this.f9147s) + y9;
                        q qVar3 = this.f9141b;
                        if (qVar3 != null) {
                            if (z11 != qVar3.O) {
                                qVar3.setFlippedVertically(z11);
                                org.telegram.messenger.g0.h3(new p(this, 0));
                            }
                            if (z12 != this.f9141b.isEnabled()) {
                                this.f9141b.setEnabled(z12);
                                this.f9141b.invalidate();
                                if (z12) {
                                    this.f9141b.setVisibility(0);
                                    if (!this.f9150y) {
                                        this.f9150y = true;
                                        this.f9141b.p(this.f9143e, wmVar.f51453q8, true);
                                    }
                                }
                            }
                            this.f9141b.setTranslationY(be.a(interpolation, L4, L5));
                            this.f9141b.setTranslationX(q1Var.R1(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9141b.getLayoutParams();
                            int d = p1.d(32.0f, q1Var.getBackgroundDrawableLeft(), 0);
                            int d10 = p1.d(32.0f, q1Var.getWidth() - q1Var.getBackgroundDrawableRight(), (int) q1Var.R1(true));
                            int L6 = org.telegram.messenger.g0.L(40.0f) * 8;
                            if ((getWidth() - d10) - d < L6) {
                                if (Q3) {
                                    d = Math.min(d, getWidth() - L6);
                                    d10 = 0;
                                } else {
                                    d10 = Math.min(d10, getWidth() - L6);
                                    d = 0;
                                }
                            }
                            if (Q3) {
                                i3 = 5;
                            } else {
                                i3 = 3;
                            }
                            if (i3 != layoutParams.gravity) {
                                layoutParams.gravity = i3;
                                z14 = true;
                            }
                            if (d != layoutParams.leftMargin) {
                                layoutParams.leftMargin = d;
                                z14 = true;
                            }
                            if (d10 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = d10;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.f9141b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            q qVar4 = this.f9141b;
            if (qVar4 != null && qVar4.isEnabled()) {
                this.f9141b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f9149x) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f9149x = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.zi> r10) {
        throw new UnsupportedOperationException("Method not decompiled: dh.r.setSelectedMessages(java.util.List):void");
    }
}
