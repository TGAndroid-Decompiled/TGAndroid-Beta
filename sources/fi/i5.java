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
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
public final class i5 extends FrameLayout {
    public long E;
    public final c5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final m4 I;
    public float J;
    public final f5 f12093a;
    public float f12094b;
    public float f12095c;
    public float d;
    public final g5 f12096e;
    public float f12097f;
    public final b5 h;
    public float f12098n;
    public final f9 f12099r;
    public final Drawable f12100s;
    public float f12101w;
    public boolean f12102x;
    public int f12103y;

    public i5(Context context, f9 f9Var) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new m4();
        b bVar = f9Var.E;
        this.f12099r = f9Var;
        b5 b5Var = new b5(getContext(), this, f9Var);
        this.h = b5Var;
        Drawable g10 = i5.c.g(context, 2131232730);
        this.f12100s = g10;
        org.telegram.ui.ActionBar.t6.x(this, g10, org.telegram.ui.ActionBar.m6.f29420h5, bVar, PorterDuff.Mode.MULTIPLY);
        g5 g5Var = new g5(this, context);
        this.f12096e = g5Var;
        c5 c5Var = new c5(this, context);
        this.F = c5Var;
        c5Var.b(new d5(0, this));
        f5 f5Var = new f5(context, this, f9Var);
        this.f12093a = f5Var;
        c5Var.setAdapter(f5Var);
        g5Var.addView(c5Var, na.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(b5Var, na.c(-1.0f, -1));
        addView(g5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        a5 currentPage = getCurrentPage();
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
            obj.f12032a = (TL_stories.StoryItem) arrayList.get(i10);
            arrayList2.add(obj);
        }
        ArrayList F = np.u1(this.f12099r.h).f25831i0.F(k10.i(k10.f24932t0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                ?? obj2 = new Object();
                obj2.f12033b = (o6) F.get(i11);
                arrayList2.add(obj2);
            }
        }
        b5 b5Var = this.h;
        ArrayList arrayList3 = b5Var.H;
        ArrayList arrayList4 = b5Var.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        b5Var.d();
        if (b5Var.getMeasuredHeight() > 0) {
            b5Var.c(i7, false, false);
        } else {
            b5Var.f11933x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((e4) arrayList3.get(i12)).a(((e4) arrayList3.get(i12)).f11877b);
        }
        c5 c5Var = this.F;
        c5Var.setAdapter(null);
        f5 f5Var = this.f12093a;
        c5Var.setAdapter(f5Var);
        f5Var.g();
        c5Var.setCurrentItem(i7);
    }

    public e4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public a5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                if (((Integer) ((a5) arrayList.get(i7)).getTag()).intValue() == this.F.getCurrentItem()) {
                    return (a5) arrayList.get(i7);
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
                return ((h5) arrayList.get(closestPosition)).f12032a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12 = 0;
        if (this.f12099r.f11950b) {
            i11 = org.telegram.messenger.g0.f24004m;
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        b5 b5Var = this.h;
        ((FrameLayout.LayoutParams) b5Var.getLayoutParams()).topMargin = i11;
        this.f12098n = b5Var.getFinalHeight();
        this.f12094b = org.telegram.messenger.g0.L(20.0f) + i11;
        ((FrameLayout.LayoutParams) this.f12096e.getLayoutParams()).topMargin = org.telegram.messenger.g0.f24004m;
        float L = (((org.telegram.messenger.g0.L(20.0f) + i11) + this.f12098n) + org.telegram.messenger.g0.L(24.0f)) - org.telegram.messenger.g0.f24004m;
        this.d = L;
        this.f12095c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i12 < arrayList.size()) {
                ((a5) arrayList.get(i12)).setListBottomPadding(this.d);
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
        a5 currentPage;
        float f10;
        if (this.f12103y >= org.telegram.messenger.g0.L(20.0f)) {
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
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f12103y = i7;
        if (i7 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f11726r.dispatchTouchEvent(org.telegram.messenger.g0.R());
            FrameLayout frameLayout = currentPage.f11722c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.i1.f28971w);
            }
        }
    }

    public void setOffset(float f10) {
        int i7;
        int closestPosition;
        int i10;
        if (this.f12101w != f10) {
            this.f12101w = f10;
            this.f12096e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.f12101w);
            float f11 = this.f12097f;
            float i11 = Utilities.i(f10 / this.f12095c, 1.0f, 0.0f);
            this.f12097f = i11;
            Utilities.i(i11 / 0.5f, 1.0f, 0.0f);
            f9 f9Var = this.f12099r;
            z3 z10 = f9Var.z();
            c9 c9Var = f9Var.f11990t0;
            int i12 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            b5 b5Var = this.h;
            if (i12 == 0 && this.f12097f != 1.0f) {
                if (f9Var.O0 != null) {
                    gj gjVar = (gj) f9Var.O0.f12040i.get(Utilities.j(b5Var.getClosestPosition(), f9Var.O0.f12040i.size() - 1, 0));
                    long b10 = h6.b(gjVar);
                    ImageReceiver imageReceiver = c9Var.f11813c;
                    if (imageReceiver != null) {
                        imageReceiver.O0(true, true);
                        c9Var.f11813c = null;
                    }
                    v8 v8Var = f9Var.f11978o0;
                    int i13 = gjVar.f24182l.f28637id;
                    f9 f9Var2 = v8Var.O0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= v8Var.f12301y0.size()) {
                            break;
                        } else if (b10 == h6.b(f9Var2.O0.f(((Integer) ((ArrayList) v8Var.f12301y0.get(i14)).get(0)).intValue()))) {
                            if (f9Var2.R0) {
                                i10 = (v8Var.f12301y0.size() - 1) - i14;
                            } else {
                                i10 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) v8Var.f12301y0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) v8Var.f12301y0.get(i14)).get(i15)).intValue() == i13) {
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
                                if (currentPeerView.f12868t1 != i15) {
                                    currentPeerView.f12868t1 = i15;
                                    currentPeerView.d1(false);
                                }
                            } else {
                                v8Var.x(i10, false);
                                z3 currentPeerView2 = v8Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    m7 m7Var = (m7) currentPeerView2.getParent();
                                    m7Var.a(true);
                                    if (v8Var.f12301y0 != null) {
                                        z3 z3Var = m7Var.f12269a;
                                        long j3 = m7Var.f12270b;
                                        ArrayList arrayList = m7Var.f12271c;
                                        z3Var.l1 = j3;
                                        z3Var.f12832j1 = arrayList;
                                        z3Var.m0(i15);
                                    } else {
                                        m7Var.f12269a.S0(i15, m7Var.f12270b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (z10 != null && z10.f12868t1 != (closestPosition = b5Var.getClosestPosition())) {
                    z10.f12868t1 = closestPosition;
                    z10.d1(false);
                }
                b5Var.d.abortAnimation();
                ValueAnimator valueAnimator = b5Var.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    b5Var.N = null;
                }
                b5Var.c(b5Var.L, false, true);
            }
            if (z10 != null) {
                c3 c3Var = z10.M0;
                b5Var.f11924a = c3Var.getTop();
                b5Var.f11925b = c3Var.getMeasuredWidth();
                b5Var.f11926c = c3Var.getMeasuredHeight();
            }
            b5Var.setProgressToOpen(this.f12097f);
            c5 c5Var = this.F;
            if (c5Var.f11805x0 && this.f12097f != 1.0f) {
                c5Var.onTouchEvent(org.telegram.messenger.g0.R());
            }
            if (this.f12097f == 0.0f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            setVisibility(i7);
            if (this.f12097f != 1.0f) {
                c5Var.f11805x0 = false;
            }
        }
    }
}
