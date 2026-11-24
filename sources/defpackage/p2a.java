package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class p2a extends FrameLayout {
    public long E;
    public final k2a F;
    public final ArrayList G;
    public final ArrayList H;
    public final v1a I;
    public float J;
    public final m2a a;
    public float b;
    public float c;
    public float d;
    public final n2a e;
    public float f;
    public final j2a h;
    public float n;
    public final oab r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public p2a(oab oabVar, Context context) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new v1a();
        r63 r63Var = oabVar.E;
        this.r = oabVar;
        j2a j2aVar = new j2a(this, oabVar, getContext());
        this.h = j2aVar;
        Drawable d = b10.d(context, 2131232745);
        this.s = d;
        anb.x(this, d, cmb.g5, r63Var, PorterDuff.Mode.MULTIPLY);
        n2a n2aVar = new n2a(this, context);
        this.e = n2aVar;
        k2a k2aVar = new k2a(this, context);
        this.F = k2aVar;
        k2aVar.b(new lw(this, (byte) 4));
        m2a m2aVar = new m2a(this, oabVar, context);
        this.a = m2aVar;
        k2aVar.setAdapter(m2aVar);
        n2aVar.addView(k2aVar, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(j2aVar, qoe.c(-1.0f, -1));
        addView(n2aVar);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f = this.d;
        i2a currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f;
    }

    public final void b(int i, long j, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ?? obj = new Object();
            obj.a = (TL_stories.StoryItem) arrayList.get(i2);
            arrayList2.add(obj);
        }
        ArrayList E = oc7.r1(this.r.h).e0.E(z8c.h(z8c.t0).e());
        if (E != null) {
            for (int i3 = 0; i3 < E.size(); i3++) {
                ?? obj2 = new Object();
                obj2.b = (g4b) E.get(i3);
                arrayList2.add(obj2);
            }
        }
        j2a j2aVar = this.h;
        ArrayList arrayList3 = j2aVar.H;
        ArrayList arrayList4 = j2aVar.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        j2aVar.d();
        if (j2aVar.getMeasuredHeight() > 0) {
            j2aVar.c(i, false, false);
        } else {
            j2aVar.x = i;
        }
        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
            ((o1a) arrayList3.get(i4)).a(((o1a) arrayList3.get(i4)).b);
        }
        k2a k2aVar = this.F;
        k2aVar.setAdapter(null);
        m2a m2aVar = this.a;
        k2aVar.setAdapter(m2aVar);
        m2aVar.g();
        k2aVar.setCurrentItem(i);
    }

    public o1a getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public i2a getCurrentPage() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i < arrayList.size()) {
                if (((Integer) ((i2a) arrayList.get(i)).getTag()).intValue() == this.F.getCurrentItem()) {
                    return (i2a) arrayList.get(i);
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition >= 0) {
            ArrayList arrayList = this.G;
            if (closestPosition < arrayList.size()) {
                return ((o2a) arrayList.get(closestPosition)).a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.r.b) {
            i3 = gm.m;
        } else {
            i3 = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        j2a j2aVar = this.h;
        ((FrameLayout.LayoutParams) j2aVar.getLayoutParams()).topMargin = i3;
        this.n = j2aVar.getFinalHeight();
        this.b = gm.L(20.0f) + i3;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = gm.m;
        float L = (((gm.L(20.0f) + i3) + this.n) + gm.L(24.0f)) - gm.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i4 < arrayList.size()) {
                ((i2a) arrayList.get(i4)).setListBottomPadding(this.d);
                i4++;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i) {
        boolean z;
        boolean z2;
        i2a currentPage;
        float f;
        if (this.y >= gm.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (i >= gm.L(20.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            float f2 = this.J;
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            ofFloat.addUpdateListener(new p29(this, (byte) 23));
            ofFloat.setInterpolator(gb.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i;
        if (i > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.r.dispatchTouchEvent(gm.R());
            FrameLayout frameLayout = currentPage.c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.z((int) frameLayout.getTranslationY(), 250L, gb.w);
            }
        }
    }

    public void setOffset(float f) {
        int i;
        int closestPosition;
        int i2;
        if (this.w != f) {
            this.w = f;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.w);
            float f2 = this.f;
            this.f = Utilities.i(f / this.c, 1.0f, 0.0f);
            oab oabVar = this.r;
            a58 w = oabVar.w();
            lab labVar = oabVar.t0;
            int i3 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            j2a j2aVar = this.h;
            if (i3 == 0 && this.f != 1.0f) {
                if (oabVar.O0 != null) {
                    k47 k47Var = (k47) oabVar.O0.i.get(Utilities.j(j2aVar.getClosestPosition(), oabVar.O0.i.size() - 1, 0));
                    long b = z3b.b(k47Var);
                    ImageReceiver imageReceiver = labVar.c;
                    if (imageReceiver != null) {
                        imageReceiver.v0(true, true);
                        labVar.c = null;
                    }
                    eab eabVar = oabVar.o0;
                    int i4 = k47Var.l.id;
                    oab oabVar2 = eabVar.O0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= eabVar.y0.size()) {
                            break;
                        } else if (b == z3b.b(oabVar2.O0.f(((Integer) ((ArrayList) eabVar.y0.get(i5)).get(0)).intValue()))) {
                            if (oabVar2.R0) {
                                i2 = (eabVar.y0.size() - 1) - i5;
                            } else {
                                i2 = i5;
                            }
                            int i6 = 0;
                            while (true) {
                                if (i6 < ((ArrayList) eabVar.y0.get(i5)).size()) {
                                    if (((Integer) ((ArrayList) eabVar.y0.get(i5)).get(i6)).intValue() == i4) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    i6 = 0;
                                    break;
                                }
                            }
                            if (eabVar.getCurrentPeerView() != null && eabVar.getCurrentItem() == i2) {
                                a58 currentPeerView = eabVar.getCurrentPeerView();
                                if (currentPeerView.z1 != i6) {
                                    currentPeerView.z1 = i6;
                                    currentPeerView.c1(false);
                                }
                            } else {
                                eabVar.x(i2, false);
                                a58 currentPeerView2 = eabVar.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    b5b b5bVar = (b5b) currentPeerView2.getParent();
                                    b5bVar.a(true);
                                    ArrayList arrayList = eabVar.y0;
                                    a58 a58Var = b5bVar.a;
                                    long j = b5bVar.b;
                                    if (arrayList != null) {
                                        ArrayList arrayList2 = b5bVar.c;
                                        a58Var.r1 = j;
                                        a58Var.p1 = arrayList2;
                                        a58Var.e0(i6);
                                    } else {
                                        a58Var.P0(i6, j);
                                    }
                                }
                            }
                        } else {
                            i5++;
                        }
                    }
                } else if (w != null && w.z1 != (closestPosition = j2aVar.getClosestPosition())) {
                    w.z1 = closestPosition;
                    w.c1(false);
                }
                j2aVar.d.abortAnimation();
                ValueAnimator valueAnimator = j2aVar.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j2aVar.N = null;
                }
                j2aVar.c(j2aVar.L, false, true);
            }
            if (w != null) {
                g48 g48Var = w.S0;
                j2aVar.a = g48Var.getTop();
                j2aVar.b = g48Var.getMeasuredWidth();
                j2aVar.c = g48Var.getMeasuredHeight();
            }
            j2aVar.setProgressToOpen(this.f);
            k2a k2aVar = this.F;
            if (k2aVar.x0 && this.f != 1.0f) {
                k2aVar.onTouchEvent(gm.R());
            }
            if (this.f == 0.0f) {
                i = 4;
            } else {
                i = 0;
            }
            setVisibility(i);
            if (this.f != 1.0f) {
                k2aVar.x0 = false;
            }
        }
    }
}
