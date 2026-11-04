package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_stories;
public final class s5 extends FrameLayout {
    public long E;
    public final m5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final w4 I;
    public float J;
    public final p5 f10997a;
    public float f10998b;
    public float f10999c;
    public float d;
    public final q5 f11000e;
    public float f11001f;
    public final l5 h;
    public float f11002n;
    public final r9 f11003r;
    public final Drawable f11004s;
    public float f11005w;
    public boolean f11006x;
    public int f11007y;

    public s5(Context context, r9 r9Var) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new w4();
        b bVar = r9Var.E;
        this.f11003r = r9Var;
        l5 l5Var = new l5(getContext(), this, r9Var);
        this.h = l5Var;
        Drawable g7 = k2.p1.g(context, 2131232726);
        this.f11004s = g7;
        org.telegram.ui.ActionBar.r6.y(this, g7, org.telegram.ui.ActionBar.k6.f27954h5, bVar, PorterDuff.Mode.MULTIPLY);
        q5 q5Var = new q5(this, context);
        this.f11000e = q5Var;
        m5 m5Var = new m5(this, context);
        this.F = m5Var;
        m5Var.b(new n5(0, this));
        p5 p5Var = new p5(context, this, r9Var);
        this.f10997a = p5Var;
        m5Var.setAdapter(p5Var);
        q5Var.addView(m5Var, mf.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(l5Var, mf.c(-1.0f, -1));
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

    public final void b(int i3, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j10;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ?? obj = new Object();
            obj.f10868a = (TL_stories.StoryItem) arrayList.get(i10);
            arrayList2.add(obj);
        }
        ArrayList F = hp.s1(this.f11003r.h).f23027i0.F(h10.i(h10.f22829t0).e());
        if (F != null) {
            for (int i11 = 0; i11 < F.size(); i11++) {
                ?? obj2 = new Object();
                obj2.f10869b = (y6) F.get(i11);
                arrayList2.add(obj2);
            }
        }
        l5 l5Var = this.h;
        ArrayList arrayList3 = l5Var.H;
        ArrayList arrayList4 = l5Var.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        l5Var.d();
        if (l5Var.getMeasuredHeight() > 0) {
            l5Var.c(i3, false, false);
        } else {
            l5Var.f10767x = i3;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            ((o4) arrayList3.get(i12)).a(((o4) arrayList3.get(i12)).f10689b);
        }
        m5 m5Var = this.F;
        m5Var.setAdapter(null);
        p5 p5Var = this.f10997a;
        m5Var.setAdapter(p5Var);
        p5Var.g();
        m5Var.setCurrentItem(i3);
    }

    public o4 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public k5 getCurrentPage() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 < arrayList.size()) {
                if (((Integer) ((k5) arrayList.get(i3)).getTag()).intValue() == this.F.getCurrentItem()) {
                    return (k5) arrayList.get(i3);
                }
                i3++;
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
                return ((r5) arrayList.get(closestPosition)).f10868a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12 = 0;
        if (this.f11003r.f10911b) {
            i11 = org.telegram.messenger.g0.f22602m;
        } else {
            i11 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        l5 l5Var = this.h;
        ((FrameLayout.LayoutParams) l5Var.getLayoutParams()).topMargin = i11;
        this.f11002n = l5Var.getFinalHeight();
        this.f10998b = org.telegram.messenger.g0.L(20.0f) + i11;
        ((FrameLayout.LayoutParams) this.f11000e.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22602m;
        float L = (((org.telegram.messenger.g0.L(20.0f) + i11) + this.f11002n) + org.telegram.messenger.g0.L(24.0f)) - org.telegram.messenger.g0.f22602m;
        this.d = L;
        this.f10999c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i12 < arrayList.size()) {
                ((k5) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            } else {
                super.onMeasure(i3, i10);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i3) {
        boolean z10;
        boolean z11;
        k5 currentPage;
        float f10;
        if (this.f11007y >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 >= org.telegram.messenger.g0.L(20.0f)) {
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
            ofFloat.addUpdateListener(new bh.f(this, 22));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f11007y = i3;
        if (i3 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f10577r.dispatchTouchEvent(org.telegram.messenger.g0.R());
            FrameLayout frameLayout = currentPage.f10573c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.h1.f27551w);
            }
        }
    }

    public void setOffset(float f10) {
        int i3;
        int closestPosition;
        int i10;
        if (this.f11005w != f10) {
            this.f11005w = f10;
            this.f11000e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.f11005w);
            float f11 = this.f11001f;
            float i11 = Utilities.i(f10 / this.f10999c, 1.0f, 0.0f);
            this.f11001f = i11;
            Utilities.i(i11 / 0.5f, 1.0f, 0.0f);
            r9 r9Var = this.f11003r;
            j4 H = r9Var.H();
            o9 o9Var = r9Var.f10951t0;
            int i12 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            l5 l5Var = this.h;
            if (i12 == 0 && this.f11001f != 1.0f) {
                if (r9Var.P0 != null) {
                    zi ziVar = (zi) r9Var.P0.f10876i.get(Utilities.j(l5Var.getClosestPosition(), r9Var.P0.f10876i.size() - 1, 0));
                    long b10 = r6.b(ziVar);
                    ImageReceiver imageReceiver = o9Var.f10728c;
                    if (imageReceiver != null) {
                        imageReceiver.O0(true, true);
                        o9Var.f10728c = null;
                    }
                    g9 g9Var = r9Var.f10939o0;
                    int i13 = ziVar.f26871l.f27240id;
                    r9 r9Var2 = g9Var.O0;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= g9Var.f11211y0.size()) {
                            break;
                        } else if (b10 == r6.b(r9Var2.P0.f(((Integer) ((ArrayList) g9Var.f11211y0.get(i14)).get(0)).intValue()))) {
                            if (r9Var2.S0) {
                                i10 = (g9Var.f11211y0.size() - 1) - i14;
                            } else {
                                i10 = i14;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < ((ArrayList) g9Var.f11211y0.get(i14)).size()) {
                                    if (((Integer) ((ArrayList) g9Var.f11211y0.get(i14)).get(i15)).intValue() == i13) {
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
                                if (currentPeerView.f10507t1 != i15) {
                                    currentPeerView.f10507t1 = i15;
                                    currentPeerView.d1(false);
                                }
                            } else {
                                g9Var.x(i10, false);
                                j4 currentPeerView2 = g9Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    w7 w7Var = (w7) currentPeerView2.getParent();
                                    w7Var.a(true);
                                    if (g9Var.f11211y0 != null) {
                                        j4 j4Var = w7Var.f11189a;
                                        long j10 = w7Var.f11190b;
                                        ArrayList arrayList = w7Var.f11191c;
                                        j4Var.f10477l1 = j10;
                                        j4Var.f10470j1 = arrayList;
                                        j4Var.m0(i15);
                                    } else {
                                        w7Var.f11189a.S0(i15, w7Var.f11190b);
                                    }
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                } else if (H != null && H.f10507t1 != (closestPosition = l5Var.getClosestPosition())) {
                    H.f10507t1 = closestPosition;
                    H.d1(false);
                }
                l5Var.d.abortAnimation();
                ValueAnimator valueAnimator = l5Var.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    l5Var.N = null;
                }
                l5Var.c(l5Var.L, false, true);
            }
            if (H != null) {
                m3 m3Var = H.M0;
                l5Var.f10758a = m3Var.getTop();
                l5Var.f10759b = m3Var.getMeasuredWidth();
                l5Var.f10760c = m3Var.getMeasuredHeight();
            }
            l5Var.setProgressToOpen(this.f11001f);
            m5 m5Var = this.F;
            if (m5Var.f10639x0 && this.f11001f != 1.0f) {
                m5Var.onTouchEvent(org.telegram.messenger.g0.R());
            }
            if (this.f11001f == 0.0f) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            setVisibility(i3);
            if (this.f11001f != 1.0f) {
                m5Var.f10639x0 = false;
            }
        }
    }
}
