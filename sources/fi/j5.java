package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
public final class j5 extends FrameLayout {
    public long E;
    public final d5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final n4 I;
    public float J;
    public final g5 f12149a;
    public float f12150b;
    public float f12151c;
    public float d;
    public final h5 f12152e;
    public float f12153f;
    public final c5 h;
    public float f12154n;
    public final f9 f12155r;
    public final Drawable f12156s;
    public float f12157w;
    public boolean f12158x;
    public int f12159y;

    public j5(Context context, f9 f9Var) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new n4();
        b bVar = f9Var.E;
        this.f12155r = f9Var;
        c5 c5Var = new c5(getContext(), this, f9Var);
        this.h = c5Var;
        Drawable g10 = i5.c.g(context, 2131232733);
        this.f12156s = g10;
        org.telegram.ui.ActionBar.u6.x(this, g10, org.telegram.ui.ActionBar.n6.f29524h5, bVar, PorterDuff.Mode.MULTIPLY);
        h5 h5Var = new h5(this, context);
        this.f12152e = h5Var;
        d5 d5Var = new d5(this, context);
        this.F = d5Var;
        d5Var.b(new e5(0, this));
        g5 g5Var = new g5(context, this, f9Var);
        this.f12149a = g5Var;
        d5Var.setAdapter(g5Var);
        h5Var.addView(d5Var, na.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(c5Var, na.c(-1.0f, -1));
        addView(h5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        b5 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f10;
    }

    public final void b(int i7, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j3;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ?? obj = new Object();
            obj.f12104a = (TL_stories.StoryItem) arrayList.get(i10);
            arrayList2.add(obj);
        }
        ArrayList F = mp.u1(this.f12155r.h).f25763i0.F(i10.i(i10.f24637t0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                ?? obj2 = new Object();
                obj2.f12105b = (o6) F.get(i11);
                arrayList2.add(obj2);
            }
        }
        c5 c5Var = this.h;
        ArrayList arrayList3 = c5Var.H;
        ArrayList arrayList4 = c5Var.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        c5Var.d();
        if (c5Var.getMeasuredHeight() > 0) {
            c5Var.c(i7, false, false);
        } else {
            c5Var.f11945x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((e4) arrayList3.get(i12)).a(((e4) arrayList3.get(i12)).f11888b);
        }
        d5 d5Var = this.F;
        d5Var.setAdapter(null);
        g5 g5Var = this.f12149a;
        d5Var.setAdapter(g5Var);
        g5Var.g();
        d5Var.setCurrentItem(i7);
    }

    public e4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public b5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                if (((Integer) ((b5) arrayList.get(i7)).getTag()).intValue() == this.F.getCurrentItem()) {
                    return (b5) arrayList.get(i7);
                }
                i7++;
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
                return ((i5) arrayList.get(closestPosition)).f12104a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12 = 0;
        if (this.f12155r.f11961b) {
            i11 = org.telegram.messenger.g0.f24220m;
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        c5 c5Var = this.h;
        ((FrameLayout.LayoutParams) c5Var.getLayoutParams()).topMargin = i11;
        this.f12154n = c5Var.getFinalHeight();
        this.f12150b = org.telegram.messenger.g0.L(20.0f) + i11;
        ((FrameLayout.LayoutParams) this.f12152e.getLayoutParams()).topMargin = org.telegram.messenger.g0.f24220m;
        float L = (((org.telegram.messenger.g0.L(20.0f) + i11) + this.f12154n) + org.telegram.messenger.g0.L(24.0f)) - org.telegram.messenger.g0.f24220m;
        this.d = L;
        this.f12151c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i12 < arrayList.size()) {
                ((b5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            } else {
                super.onMeasure(i7, i10);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i7) {
        boolean z10;
        boolean z11;
        b5 currentPage;
        float f10;
        if (this.f12159y >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 >= org.telegram.messenger.g0.L(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            float f11 = this.J;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            ofFloat.addUpdateListener(new ah.g(this, 22));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f12159y = i7;
        if (i7 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f11780r.dispatchTouchEvent(org.telegram.messenger.g0.R());
            FrameLayout frameLayout = currentPage.f11776c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.y((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.i1.f29066w);
            }
        }
    }

    public void setOffset(float f10) {
        int i7;
        int closestPosition;
        int i10;
        if (this.f12157w != f10) {
            this.f12157w = f10;
            this.f12152e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.f12157w);
            float f11 = this.f12153f;
            float i11 = Utilities.i(f10 / this.f12151c, 1.0f, 0.0f);
            this.f12153f = i11;
            Utilities.i(i11 / 0.5f, 1.0f, 0.0f);
            f9 f9Var = this.f12155r;
            z3 z10 = f9Var.z();
            c9 c9Var = f9Var.f12001t0;
            int i12 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            c5 c5Var = this.h;
            if (i12 == 0 && this.f12153f != 1.0f) {
                if (f9Var.O0 != null) {
                    fj fjVar = (fj) f9Var.O0.f12051i.get(Utilities.j(c5Var.getClosestPosition(), f9Var.O0.f12051i.size() - 1, 0));
                    long b10 = h6.b(fjVar);
                    ImageReceiver imageReceiver = c9Var.f11823c;
                    if (imageReceiver != null) {
                        imageReceiver.P0(true, true);
                        c9Var.f11823c = null;
                    }
                    v8 v8Var = f9Var.f11989o0;
                    int i13 = fjVar.f24078l.f28731id;
                    f9 f9Var2 = v8Var.O0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= v8Var.f12313y0.size()) {
                            break;
                        } else if (b10 == h6.b(f9Var2.O0.f(((Integer) ((ArrayList) v8Var.f12313y0.get(i14)).get(0)).intValue()))) {
                            if (f9Var2.R0) {
                                i10 = (v8Var.f12313y0.size() - 1) - i14;
                            } else {
                                i10 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) v8Var.f12313y0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) v8Var.f12313y0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (v8Var.getCurrentPeerView() != null && v8Var.getCurrentItem() == i10) {
                                z3 currentPeerView = v8Var.getCurrentPeerView();
                                if (currentPeerView.f12879t1 != i15) {
                                    currentPeerView.f12879t1 = i15;
                                    currentPeerView.d1(false);
                                }
                            } else {
                                v8Var.x(i10, false);
                                z3 currentPeerView2 = v8Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    m7 m7Var = (m7) currentPeerView2.getParent();
                                    m7Var.a(true);
                                    if (v8Var.f12313y0 != null) {
                                        z3 z3Var = m7Var.f12277a;
                                        long j3 = m7Var.f12278b;
                                        ArrayList arrayList = m7Var.f12279c;
                                        z3Var.l1 = j3;
                                        z3Var.f12843j1 = arrayList;
                                        z3Var.m0(i15);
                                    } else {
                                        m7Var.f12277a.S0(i15, m7Var.f12278b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (z10 != null && z10.f12879t1 != (closestPosition = c5Var.getClosestPosition())) {
                    z10.f12879t1 = closestPosition;
                    z10.d1(false);
                }
                c5Var.d.abortAnimation();
                ValueAnimator valueAnimator = c5Var.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    c5Var.N = null;
                }
                c5Var.c(c5Var.L, false, true);
            }
            if (z10 != null) {
                c3 c3Var = z10.M0;
                c5Var.f11936a = c3Var.getTop();
                c5Var.f11937b = c3Var.getMeasuredWidth();
                c5Var.f11938c = c3Var.getMeasuredHeight();
            }
            c5Var.setProgressToOpen(this.f12153f);
            d5 d5Var = this.F;
            if (d5Var.f11853x0 && this.f12153f != 1.0f) {
                d5Var.onTouchEvent(org.telegram.messenger.g0.R());
            }
            if (this.f12153f == 0.0f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            setVisibility(i7);
            if (this.f12153f != 1.0f) {
                d5Var.f11853x0 = false;
            }
        }
    }
}
