package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
public final class t5 extends FrameLayout {
    public long D;
    public final n5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final x4 H;
    public float I;
    public final q5 f9789a;
    public float f9790b;
    public float f9791c;
    public float d;
    public final r5 f9792e;
    public float f9793f;
    public final m5 h;
    public float f9794n;
    public final q9 f9795r;
    public final Drawable f9796s;
    public float f9797w;
    public boolean f9798x;
    public int f9799y;

    public t5(Context context, q9 q9Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new x4();
        b bVar = q9Var.D;
        this.f9795r = q9Var;
        m5 m5Var = new m5(getContext(), this, q9Var);
        this.h = m5Var;
        Drawable h = jg.g.h(context, 2131232728);
        this.f9796s = h;
        org.telegram.ui.ActionBar.t6.x(this, h, org.telegram.ui.ActionBar.m6.f27963h5, bVar, PorterDuff.Mode.MULTIPLY);
        r5 r5Var = new r5(this, context);
        this.f9792e = r5Var;
        n5 n5Var = new n5(this, context);
        this.E = n5Var;
        n5Var.b(new o5(0, this));
        q5 q5Var = new q5(context, this, q9Var);
        this.f9789a = q5Var;
        n5Var.setAdapter(q5Var);
        r5Var.addView(n5Var, ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(m5Var, ha.c(-1.0f, -1));
        addView(r5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        l5 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f10;
    }

    public final void b(int i7, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.D = j3;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ?? obj = new Object();
            obj.f9735a = (TL_stories.StoryItem) arrayList.get(i10);
            arrayList2.add(obj);
        }
        ArrayList F = qp.s1(this.f9795r.h).f24799h0.F(p10.i(p10.f24474s0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                ?? obj2 = new Object();
                obj2.f9736b = (y6) F.get(i11);
                arrayList2.add(obj2);
            }
        }
        m5 m5Var = this.h;
        ArrayList arrayList3 = m5Var.G;
        ArrayList arrayList4 = m5Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        m5Var.d();
        if (m5Var.getMeasuredHeight() > 0) {
            m5Var.c(i7, false, false);
        } else {
            m5Var.f9512x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((o4) arrayList3.get(i12)).a(((o4) arrayList3.get(i12)).f9438b);
        }
        n5 n5Var = this.E;
        n5Var.setAdapter(null);
        q5 q5Var = this.f9789a;
        n5Var.setAdapter(q5Var);
        q5Var.g();
        n5Var.setCurrentItem(i7);
    }

    public o4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public l5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 < arrayList.size()) {
                if (((Integer) ((l5) arrayList.get(i7)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (l5) arrayList.get(i7);
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
            ArrayList arrayList = this.F;
            if (closestPosition < arrayList.size()) {
                return ((s5) arrayList.get(closestPosition)).f9735a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12 = 0;
        if (this.f9795r.f9602b) {
            i11 = org.telegram.messenger.g0.f22561m;
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        m5 m5Var = this.h;
        ((FrameLayout.LayoutParams) m5Var.getLayoutParams()).topMargin = i11;
        this.f9794n = m5Var.getFinalHeight();
        this.f9790b = org.telegram.messenger.g0.L(20.0f) + i11;
        ((FrameLayout.LayoutParams) this.f9792e.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22561m;
        float L = (((org.telegram.messenger.g0.L(20.0f) + i11) + this.f9794n) + org.telegram.messenger.g0.L(24.0f)) - org.telegram.messenger.g0.f22561m;
        this.d = L;
        this.f9791c = size - L;
        while (true) {
            ArrayList arrayList = this.G;
            if (i12 < arrayList.size()) {
                ((l5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            } else {
                super.onMeasure(i7, i10);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i7) {
        boolean z9;
        boolean z10;
        l5 currentPage;
        float f10;
        if (this.f9799y >= org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z9) {
            float f11 = this.I;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            ofFloat.addUpdateListener(new ah.h(this, 21));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f9799y = i7;
        if (i7 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f9334r.dispatchTouchEvent(org.telegram.messenger.g0.R());
            FrameLayout frameLayout = currentPage.f9330c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.y((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.i1.f27527w);
            }
        }
    }

    public void setOffset(float f10) {
        int i7;
        int closestPosition;
        int i10;
        if (this.f9797w != f10) {
            this.f9797w = f10;
            this.f9792e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.f9797w);
            float f11 = this.f9793f;
            float i11 = Utilities.i(f10 / this.f9791c, 1.0f, 0.0f);
            this.f9793f = i11;
            Utilities.i(i11 / 0.5f, 1.0f, 0.0f);
            q9 q9Var = this.f9795r;
            j4 z9 = q9Var.z();
            n9 n9Var = q9Var.f9640s0;
            int i12 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            m5 m5Var = this.h;
            if (i12 == 0 && this.f9793f != 1.0f) {
                if (q9Var.N0 != null) {
                    ij ijVar = (ij) q9Var.N0.f9699i.get(Utilities.j(m5Var.getClosestPosition(), q9Var.N0.f9699i.size() - 1, 0));
                    long b10 = r6.b(ijVar);
                    ImageReceiver imageReceiver = n9Var.f9410c;
                    if (imageReceiver != null) {
                        imageReceiver.O0(true, true);
                        n9Var.f9410c = null;
                    }
                    g9 g9Var = q9Var.f9629n0;
                    int i13 = ijVar.f23270l.f27199id;
                    q9 q9Var2 = g9Var.N0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= g9Var.f9941x0.size()) {
                            break;
                        } else if (b10 == r6.b(q9Var2.N0.f(((Integer) ((ArrayList) g9Var.f9941x0.get(i14)).get(0)).intValue()))) {
                            if (q9Var2.Q0) {
                                i10 = (g9Var.f9941x0.size() - 1) - i14;
                            } else {
                                i10 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) g9Var.f9941x0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) g9Var.f9941x0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (g9Var.getCurrentPeerView() != null && g9Var.getCurrentItem() == i10) {
                                j4 currentPeerView = g9Var.getCurrentPeerView();
                                if (currentPeerView.f9230s1 != i15) {
                                    currentPeerView.f9230s1 = i15;
                                    currentPeerView.d1(false);
                                }
                            } else {
                                g9Var.x(i10, false);
                                j4 currentPeerView2 = g9Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    w7 w7Var = (w7) currentPeerView2.getParent();
                                    w7Var.a(true);
                                    if (g9Var.f9941x0 != null) {
                                        j4 j4Var = w7Var.f9906a;
                                        long j3 = w7Var.f9907b;
                                        ArrayList arrayList = w7Var.f9908c;
                                        j4Var.f9201k1 = j3;
                                        j4Var.f9194i1 = arrayList;
                                        j4Var.m0(i15);
                                    } else {
                                        w7Var.f9906a.S0(i15, w7Var.f9907b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (z9 != null && z9.f9230s1 != (closestPosition = m5Var.getClosestPosition())) {
                    z9.f9230s1 = closestPosition;
                    z9.d1(false);
                }
                m5Var.d.abortAnimation();
                ValueAnimator valueAnimator = m5Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m5Var.M = null;
                }
                m5Var.c(m5Var.K, false, true);
            }
            if (z9 != null) {
                j3 j3Var = z9.L0;
                m5Var.f9503a = j3Var.getTop();
                m5Var.f9504b = j3Var.getMeasuredWidth();
                m5Var.f9505c = j3Var.getMeasuredHeight();
            }
            m5Var.setProgressToOpen(this.f9793f);
            n5 n5Var = this.E;
            if (n5Var.f9397w0 && this.f9793f != 1.0f) {
                n5Var.onTouchEvent(org.telegram.messenger.g0.R());
            }
            if (this.f9793f == 0.0f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            setVisibility(i7);
            if (this.f9793f != 1.0f) {
                n5Var.f9397w0 = false;
            }
        }
    }
}
