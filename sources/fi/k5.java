package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
public final class k5 extends FrameLayout {
    public long E;
    public final e5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final o4 I;
    public float J;
    public final h5 f11927a;
    public float f11928b;
    public float f11929c;
    public float d;
    public final i5 f11930e;
    public float f11931f;
    public final d5 h;
    public float f11932n;
    public final i9 f11933r;
    public final Drawable f11934s;
    public float f11935w;
    public boolean f11936x;
    public int f11937y;

    public k5(Context context, i9 i9Var) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new o4();
        b bVar = i9Var.E;
        this.f11933r = i9Var;
        d5 d5Var = new d5(getContext(), this, i9Var);
        this.h = d5Var;
        Drawable g10 = i5.c.g(context, 2131232729);
        this.f11934s = g10;
        org.telegram.ui.ActionBar.q6.x(this, g10, org.telegram.ui.ActionBar.j6.f28922h5, bVar, PorterDuff.Mode.MULTIPLY);
        i5 i5Var = new i5(this, context);
        this.f11930e = i5Var;
        e5 e5Var = new e5(this, context);
        this.F = e5Var;
        e5Var.b(new f5(0, this));
        h5 h5Var = new h5(context, this, i9Var);
        this.f11927a = h5Var;
        e5Var.setAdapter(h5Var);
        i5Var.addView(e5Var, ja.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(d5Var, ja.c(-1.0f, -1));
        addView(i5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        c5 currentPage = getCurrentPage();
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
            obj.f11899a = (TL_stories.StoryItem) arrayList.get(i10);
            arrayList2.add(obj);
        }
        ArrayList F = np.s1(this.f11933r.h).f25299i0.F(m10.i(m10.f24934t0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                ?? obj2 = new Object();
                obj2.f11900b = (r6) F.get(i11);
                arrayList2.add(obj2);
            }
        }
        d5 d5Var = this.h;
        ArrayList arrayList3 = d5Var.H;
        ArrayList arrayList4 = d5Var.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        d5Var.d();
        if (d5Var.getMeasuredHeight() > 0) {
            d5Var.c(i7, false, false);
        } else {
            d5Var.f11772x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((g4) arrayList3.get(i12)).a(((g4) arrayList3.get(i12)).f11737b);
        }
        e5 e5Var = this.F;
        e5Var.setAdapter(null);
        h5 h5Var = this.f11927a;
        e5Var.setAdapter(h5Var);
        h5Var.g();
        e5Var.setCurrentItem(i7);
    }

    public g4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public c5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                if (((Integer) ((c5) arrayList.get(i7)).getTag()).intValue() == this.F.getCurrentItem()) {
                    return (c5) arrayList.get(i7);
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
                return ((j5) arrayList.get(closestPosition)).f11899a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12 = 0;
        if (this.f11933r.f11833b) {
            i11 = org.telegram.messenger.g0.f23603m;
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        d5 d5Var = this.h;
        ((FrameLayout.LayoutParams) d5Var.getLayoutParams()).topMargin = i11;
        this.f11932n = d5Var.getFinalHeight();
        this.f11928b = org.telegram.messenger.g0.L(20.0f) + i11;
        ((FrameLayout.LayoutParams) this.f11930e.getLayoutParams()).topMargin = org.telegram.messenger.g0.f23603m;
        float L = (((org.telegram.messenger.g0.L(20.0f) + i11) + this.f11932n) + org.telegram.messenger.g0.L(24.0f)) - org.telegram.messenger.g0.f23603m;
        this.d = L;
        this.f11929c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i12 < arrayList.size()) {
                ((c5) arrayList.get(i12)).setListBottomPadding(this.d);
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
        c5 currentPage;
        float f10;
        if (this.f11937y >= org.telegram.messenger.g0.L(20.0f)) {
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
            ofFloat.addUpdateListener(new ah.h(this, 22));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f11937y = i7;
        if (i7 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f11603r.dispatchTouchEvent(org.telegram.messenger.g0.R());
            FrameLayout frameLayout = currentPage.f11599c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.x((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.i1.f28644w);
            }
        }
    }

    public void setOffset(float f10) {
        int i7;
        int closestPosition;
        int i10;
        if (this.f11935w != f10) {
            this.f11935w = f10;
            this.f11930e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.f11935w);
            float f11 = this.f11931f;
            float i11 = Utilities.i(f10 / this.f11929c, 1.0f, 0.0f);
            this.f11931f = i11;
            Utilities.i(i11 / 0.5f, 1.0f, 0.0f);
            i9 i9Var = this.f11933r;
            b4 z10 = i9Var.z();
            f9 f9Var = i9Var.f11873t0;
            int i12 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            d5 d5Var = this.h;
            if (i12 == 0 && this.f11931f != 1.0f) {
                if (i9Var.O0 != null) {
                    gj gjVar = (gj) i9Var.O0.f11944i.get(Utilities.j(d5Var.getClosestPosition(), i9Var.O0.f11944i.size() - 1, 0));
                    long b10 = k6.b(gjVar);
                    ImageReceiver imageReceiver = f9Var.f11712c;
                    if (imageReceiver != null) {
                        imageReceiver.O0(true, true);
                        f9Var.f11712c = null;
                    }
                    y8 y8Var = i9Var.f11861o0;
                    int i13 = gjVar.f23822l.f28290id;
                    i9 i9Var2 = y8Var.O0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= y8Var.f12233y0.size()) {
                            break;
                        } else if (b10 == k6.b(i9Var2.O0.f(((Integer) ((ArrayList) y8Var.f12233y0.get(i14)).get(0)).intValue()))) {
                            if (i9Var2.R0) {
                                i10 = (y8Var.f12233y0.size() - 1) - i14;
                            } else {
                                i10 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) y8Var.f12233y0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) y8Var.f12233y0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (y8Var.getCurrentPeerView() != null && y8Var.getCurrentItem() == i10) {
                                b4 currentPeerView = y8Var.getCurrentPeerView();
                                if (currentPeerView.f11523t1 != i15) {
                                    currentPeerView.f11523t1 = i15;
                                    currentPeerView.d1(false);
                                }
                            } else {
                                y8Var.x(i10, false);
                                b4 currentPeerView2 = y8Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    p7 p7Var = (p7) currentPeerView2.getParent();
                                    p7Var.a(true);
                                    if (y8Var.f12233y0 != null) {
                                        b4 b4Var = p7Var.f12179a;
                                        long j3 = p7Var.f12180b;
                                        ArrayList arrayList = p7Var.f12181c;
                                        b4Var.l1 = j3;
                                        b4Var.f11487j1 = arrayList;
                                        b4Var.m0(i15);
                                    } else {
                                        p7Var.f12179a.S0(i15, p7Var.f12180b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (z10 != null && z10.f11523t1 != (closestPosition = d5Var.getClosestPosition())) {
                    z10.f11523t1 = closestPosition;
                    z10.d1(false);
                }
                d5Var.d.abortAnimation();
                ValueAnimator valueAnimator = d5Var.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    d5Var.N = null;
                }
                d5Var.c(d5Var.L, false, true);
            }
            if (z10 != null) {
                e3 e3Var = z10.M0;
                d5Var.f11763a = e3Var.getTop();
                d5Var.f11764b = e3Var.getMeasuredWidth();
                d5Var.f11765c = e3Var.getMeasuredHeight();
            }
            d5Var.setProgressToOpen(this.f11931f);
            e5 e5Var = this.F;
            if (e5Var.f11673x0 && this.f11931f != 1.0f) {
                e5Var.onTouchEvent(org.telegram.messenger.g0.R());
            }
            if (this.f11931f == 0.0f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            setVisibility(i7);
            if (this.f11931f != 1.0f) {
                e5Var.f11673x0 = false;
            }
        }
    }
}
