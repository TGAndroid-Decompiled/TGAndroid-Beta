package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.t5;
import c8.j9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.xq;
import org.telegram.ui.aj;
import org.telegram.ui.an;
import org.telegram.ui.lj;
public final class r extends FrameLayout {
    public final int[] D;
    public final an f6384a;
    public q f6385b;
    public List f6386c;
    public boolean d;
    public ij f6387e;
    public final int f6388f;
    public final int h;
    public float f6389n;
    public float f6390r;
    public float f6391s;
    public long f6392w;
    public boolean f6393x;
    public boolean f6394y;

    public r(an anVar, Context context) {
        super(context);
        this.f6386c = Collections.EMPTY_LIST;
        this.f6388f = 22;
        this.h = 24;
        this.D = new int[2];
        setVisibility(8);
        this.f6384a = anVar;
        setClipToPadding(false);
        setClipChildren(false);
        anVar.f44013z0.j(new ai.b(this, 7));
    }

    public final void a(boolean z9) {
        if (z9) {
            setVisibility(0);
            post(new p(this, 1));
            return;
        }
        this.f6394y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ah.h(this, 10));
        duration.addListener(new t5(this, 4));
        duration.start();
    }

    public final ij b() {
        dj S8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f6386c.isEmpty()) {
            int i7 = 0;
            ij ijVar = (ij) this.f6386c.get(0);
            if (ijVar.d1() != 0 && (S8 = this.f6384a.S8(ijVar.d1())) != null && (arrayList = S8.d) != null) {
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ij ijVar2 = (ij) obj;
                    TLRPC.Message message = ijVar2.f23237k;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return ijVar2;
                    }
                }
            }
            return ijVar;
        }
        return null;
    }

    public final void c(boolean z9) {
        int height;
        int height2;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        if (this.d && this.f6387e != null && this.f6385b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.f6392w);
            this.f6392w = System.currentTimeMillis();
            float f10 = this.f6389n;
            float f11 = this.f6390r;
            if (f10 != f11) {
                float f12 = ((float) min) / 220.0f;
                if (f11 > f10) {
                    this.f6389n = Math.min(f10 + f12, f11);
                } else if (f11 < f10) {
                    this.f6389n = Math.max(f10 - f12, f11);
                }
                org.telegram.messenger.g0.h3(new p(this, 0));
            }
            an anVar = this.f6384a;
            aj ajVar = anVar.f44013z0;
            int[] iArr = this.D;
            ajVar.getLocationInWindow(iArr);
            boolean z12 = true;
            getLocationInWindow(iArr);
            float f13 = (iArr[1] - iArr[1]) - anVar.f43784ga;
            boolean z13 = false;
            for (int i11 = 0; i11 < ajVar.getChildCount(); i11++) {
                View childAt = ajVar.getChildAt(i11);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    ij messageObject = q1Var.getMessageObject();
                    if (messageObject.f1() == this.f6387e.f1()) {
                        boolean Q3 = messageObject.Q3();
                        q qVar = this.f6385b;
                        if (qVar != null) {
                            qVar.setMirrorX(Q3);
                            q qVar2 = this.f6385b;
                            int L = org.telegram.messenger.g0.L(4.0f);
                            boolean z14 = hd.f22871a0;
                            int i12 = this.h;
                            if (!z14 && !Q3) {
                                i10 = i12;
                            } else {
                                i10 = 0;
                            }
                            int i13 = L + i10;
                            float f14 = this.f6388f;
                            int L2 = org.telegram.messenger.g0.L(f14);
                            int L3 = org.telegram.messenger.g0.L(4.0f);
                            if (!hd.f22871a0 && !Q3) {
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
                            cj cjVar = q1Var.getCurrentMessagesGroup().f22012m;
                            height2 = cjVar.d - cjVar.f21822b;
                        } else {
                            height2 = q1Var.getHeight();
                        }
                        float y10 = (q1Var.getY() + f13) - org.telegram.messenger.g0.L(74.0f);
                        float L4 = org.telegram.messenger.g0.L(14.0f);
                        float L5 = height - org.telegram.messenger.g0.L(218.0f);
                        lj ljVar = anVar.f43838l2;
                        if (ljVar != null && ljVar.getVisibility() == 0) {
                            L4 += ljVar.getHeight();
                        }
                        float f15 = height2;
                        if (y10 > L4 - (f15 / 2.0f) && y10 < L5) {
                            this.f6390r = 0.0f;
                            z10 = false;
                            z11 = true;
                        } else {
                            if (y10 >= (L4 - f15) - org.telegram.messenger.g0.L(92.0f) && y10 <= L5) {
                                this.f6391s = org.telegram.messenger.g0.L(56.0f) + height2;
                                this.f6390r = 1.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 = z10;
                        }
                        if (!z9) {
                            this.f6389n = this.f6390r;
                        }
                        float interpolation = (xq.f40310f.getInterpolation(this.f6389n) * this.f6391s) + y10;
                        q qVar3 = this.f6385b;
                        if (qVar3 != null) {
                            if (z10 != qVar3.N) {
                                qVar3.setFlippedVertically(z10);
                                org.telegram.messenger.g0.h3(new p(this, 0));
                            }
                            if (z11 != this.f6385b.isEnabled()) {
                                this.f6385b.setEnabled(z11);
                                this.f6385b.invalidate();
                                if (z11) {
                                    this.f6385b.setVisibility(0);
                                    if (!this.f6394y) {
                                        this.f6394y = true;
                                        this.f6385b.p(this.f6387e, anVar.f43892p8, true);
                                    }
                                }
                            }
                            this.f6385b.setTranslationY(j9.a(interpolation, L4, L5));
                            this.f6385b.setTranslationX(q1Var.R1(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f6385b.getLayoutParams();
                            int e10 = jg.g.e(32.0f, q1Var.getBackgroundDrawableLeft(), 0);
                            int e11 = jg.g.e(32.0f, q1Var.getWidth() - q1Var.getBackgroundDrawableRight(), (int) q1Var.R1(true));
                            int L6 = org.telegram.messenger.g0.L(40.0f) * 8;
                            if ((getWidth() - e11) - e10 < L6) {
                                if (Q3) {
                                    e10 = Math.min(e10, getWidth() - L6);
                                    e11 = 0;
                                } else {
                                    e11 = Math.min(e11, getWidth() - L6);
                                    e10 = 0;
                                }
                            }
                            if (Q3) {
                                i7 = 5;
                            } else {
                                i7 = 3;
                            }
                            if (i7 != layoutParams.gravity) {
                                layoutParams.gravity = i7;
                                z13 = true;
                            }
                            if (e10 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = e10;
                                z13 = true;
                            }
                            if (e11 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = e11;
                            } else {
                                z12 = z13;
                            }
                            if (z12) {
                                this.f6385b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            q qVar4 = this.f6385b;
            if (qVar4 != null && qVar4.isEnabled()) {
                this.f6385b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f6393x) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z9) {
        this.f6393x = z9;
        if (z9) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.ij> r10) {
        throw new UnsupportedOperationException("Method not decompiled: ch.r.setSelectedMessages(java.util.List):void");
    }
}
