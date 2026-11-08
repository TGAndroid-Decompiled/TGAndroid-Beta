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
public final class s5 extends FrameLayout {
    public long D;
    public final m5 E;
    public final ArrayList F;
    public final ArrayList G;
    public final w4 H;
    public float I;
    public final p5 f9755a;
    public float f9756b;
    public float f9757c;
    public float d;
    public final q5 f9758e;
    public float f9759f;
    public final l5 h;
    public float f9760n;
    public final p9 f9761r;
    public final Drawable f9762s;
    public float f9763w;
    public boolean f9764x;
    public int f9765y;

    public s5(Context context, p9 p9Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new w4();
        b bVar = p9Var.D;
        this.f9761r = p9Var;
        l5 l5Var = new l5(getContext(), this, p9Var);
        this.h = l5Var;
        Drawable h = jg.g.h(context, 2131232728);
        this.f9762s = h;
        org.telegram.ui.ActionBar.r6.y(this, h, org.telegram.ui.ActionBar.k6.f27925h5, bVar, PorterDuff.Mode.MULTIPLY);
        q5 q5Var = new q5(this, context);
        this.f9758e = q5Var;
        m5 m5Var = new m5(this, context);
        this.E = m5Var;
        m5Var.b(new n5(0, this));
        p5 p5Var = new p5(context, this, p9Var);
        this.f9755a = p5Var;
        m5Var.setAdapter(p5Var);
        q5Var.addView(m5Var, ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(l5Var, ha.c(-1.0f, -1));
        addView(q5Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f10 = this.d;
        k5 currentPage = getCurrentPage();
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
            obj.f9699a = (TL_stories.StoryItem) arrayList.get(i10);
            arrayList2.add(obj);
        }
        ArrayList F = qp.s1(this.f9761r.h).f24795h0.F(p10.i(p10.f24470s0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                ?? obj2 = new Object();
                obj2.f9700b = (x6) F.get(i11);
                arrayList2.add(obj2);
            }
        }
        l5 l5Var = this.h;
        ArrayList arrayList3 = l5Var.G;
        ArrayList arrayList4 = l5Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        l5Var.d();
        if (l5Var.getMeasuredHeight() > 0) {
            l5Var.c(i7, false, false);
        } else {
            l5Var.f9463x = i7;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((n4) arrayList3.get(i12)).a(((n4) arrayList3.get(i12)).f9400b);
        }
        m5 m5Var = this.E;
        m5Var.setAdapter(null);
        p5 p5Var = this.f9755a;
        m5Var.setAdapter(p5Var);
        p5Var.g();
        m5Var.setCurrentItem(i7);
    }

    public n4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public k5 getCurrentPage() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 < arrayList.size()) {
                if (((Integer) ((k5) arrayList.get(i7)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (k5) arrayList.get(i7);
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
                return ((r5) arrayList.get(closestPosition)).f9699a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12 = 0;
        if (this.f9761r.f9532b) {
            i11 = org.telegram.messenger.g0.f22557m;
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        l5 l5Var = this.h;
        ((FrameLayout.LayoutParams) l5Var.getLayoutParams()).topMargin = i11;
        this.f9760n = l5Var.getFinalHeight();
        this.f9756b = org.telegram.messenger.g0.L(20.0f) + i11;
        ((FrameLayout.LayoutParams) this.f9758e.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22557m;
        float L = (((org.telegram.messenger.g0.L(20.0f) + i11) + this.f9760n) + org.telegram.messenger.g0.L(24.0f)) - org.telegram.messenger.g0.f22557m;
        this.d = L;
        this.f9757c = size - L;
        while (true) {
            ArrayList arrayList = this.G;
            if (i12 < arrayList.size()) {
                ((k5) arrayList.get(i12)).setListBottomPadding(this.d);
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
        k5 currentPage;
        float f10;
        if (this.f9765y >= org.telegram.messenger.g0.L(20.0f)) {
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
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27544w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f9765y = i7;
        if (i7 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f9305r.dispatchTouchEvent(org.telegram.messenger.g0.R());
            FrameLayout frameLayout = currentPage.f9301c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.y((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.i1.f27544w);
            }
        }
    }

    public void setOffset(float f10) {
        int i7;
        int closestPosition;
        int i10;
        if (this.f9763w != f10) {
            this.f9763w = f10;
            this.f9758e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.f9763w);
            float f11 = this.f9759f;
            float i11 = Utilities.i(f10 / this.f9757c, 1.0f, 0.0f);
            this.f9759f = i11;
            Utilities.i(i11 / 0.5f, 1.0f, 0.0f);
            p9 p9Var = this.f9761r;
            i4 z9 = p9Var.z();
            m9 m9Var = p9Var.f9570s0;
            int i12 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            l5 l5Var = this.h;
            if (i12 == 0 && this.f9759f != 1.0f) {
                if (p9Var.N0 != null) {
                    ij ijVar = (ij) p9Var.N0.f9643i.get(Utilities.j(l5Var.getClosestPosition(), p9Var.N0.f9643i.size() - 1, 0));
                    long b10 = q6.b(ijVar);
                    ImageReceiver imageReceiver = m9Var.f9364c;
                    if (imageReceiver != null) {
                        imageReceiver.O0(true, true);
                        m9Var.f9364c = null;
                    }
                    f9 f9Var = p9Var.f9559n0;
                    int i13 = ijVar.f23266l.f27195id;
                    p9 p9Var2 = f9Var.N0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= f9Var.f9940x0.size()) {
                            break;
                        } else if (b10 == q6.b(p9Var2.N0.f(((Integer) ((ArrayList) f9Var.f9940x0.get(i14)).get(0)).intValue()))) {
                            if (p9Var2.Q0) {
                                i10 = (f9Var.f9940x0.size() - 1) - i14;
                            } else {
                                i10 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) f9Var.f9940x0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) f9Var.f9940x0.get(i14)).get(i15)).intValue() == i13) {
                                        break;
                                    }
                                    i15++;
                                } else {
                                    i15 = 0;
                                    break;
                                }
                            }
                            if (f9Var.getCurrentPeerView() != null && f9Var.getCurrentItem() == i10) {
                                i4 currentPeerView = f9Var.getCurrentPeerView();
                                if (currentPeerView.f9193s1 != i15) {
                                    currentPeerView.f9193s1 = i15;
                                    currentPeerView.d1(false);
                                }
                            } else {
                                f9Var.x(i10, false);
                                i4 currentPeerView2 = f9Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    w7 w7Var = (w7) currentPeerView2.getParent();
                                    w7Var.a(true);
                                    if (f9Var.f9940x0 != null) {
                                        i4 i4Var = w7Var.f9910a;
                                        long j3 = w7Var.f9911b;
                                        ArrayList arrayList = w7Var.f9912c;
                                        i4Var.f9164k1 = j3;
                                        i4Var.f9157i1 = arrayList;
                                        i4Var.m0(i15);
                                    } else {
                                        w7Var.f9910a.S0(i15, w7Var.f9911b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (z9 != null && z9.f9193s1 != (closestPosition = l5Var.getClosestPosition())) {
                    z9.f9193s1 = closestPosition;
                    z9.d1(false);
                }
                l5Var.d.abortAnimation();
                ValueAnimator valueAnimator = l5Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    l5Var.M = null;
                }
                l5Var.c(l5Var.K, false, true);
            }
            if (z9 != null) {
                j3 j3Var = z9.L0;
                l5Var.f9454a = j3Var.getTop();
                l5Var.f9455b = j3Var.getMeasuredWidth();
                l5Var.f9456c = j3Var.getMeasuredHeight();
            }
            l5Var.setProgressToOpen(this.f9759f);
            m5 m5Var = this.E;
            if (m5Var.f9351w0 && this.f9759f != 1.0f) {
                m5Var.onTouchEvent(org.telegram.messenger.g0.R());
            }
            if (this.f9759f == 0.0f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            setVisibility(i7);
            if (this.f9759f != 1.0f) {
                m5Var.f9351w0 = false;
            }
        }
    }
}
