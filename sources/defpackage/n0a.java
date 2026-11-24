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
public final class n0a extends FrameLayout {
    public long E;
    public final i0a F;
    public final ArrayList G;
    public final ArrayList H;
    public final tz9 I;
    public float J;
    public final k0a a;
    public float b;
    public float c;
    public float d;
    public final l0a e;
    public float f;
    public final h0a h;
    public float n;
    public final m8b r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public n0a(m8b m8bVar, Context context) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new tz9();
        f53 f53Var = m8bVar.E;
        this.r = m8bVar;
        h0a h0aVar = new h0a(this, m8bVar, getContext());
        this.h = h0aVar;
        Drawable d = b00.d(context, 2131232733);
        this.s = d;
        zkb.x(this, d, bkb.g5, f53Var, PorterDuff.Mode.MULTIPLY);
        l0a l0aVar = new l0a(this, context);
        this.e = l0aVar;
        i0a i0aVar = new i0a(this, context);
        this.F = i0aVar;
        i0aVar.b(new lv(this, (byte) 4));
        k0a k0aVar = new k0a(this, m8bVar, context);
        this.a = k0aVar;
        i0aVar.setAdapter(k0aVar);
        l0aVar.addView(i0aVar, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(h0aVar, nme.c(-1.0f, -1));
        addView(l0aVar);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f = this.d;
        g0a currentPage = getCurrentPage();
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
        ArrayList E = na7.q1(this.r.h).e0.E(y6c.h(y6c.t0).e());
        if (E != null) {
            for (int i3 = 0; i3 < E.size(); i3++) {
                ?? obj2 = new Object();
                obj2.b = (f2b) E.get(i3);
                arrayList2.add(obj2);
            }
        }
        h0a h0aVar = this.h;
        ArrayList arrayList3 = h0aVar.H;
        ArrayList arrayList4 = h0aVar.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        h0aVar.d();
        if (h0aVar.getMeasuredHeight() > 0) {
            h0aVar.c(i, false, false);
        } else {
            h0aVar.x = i;
        }
        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
            ((mz9) arrayList3.get(i4)).a(((mz9) arrayList3.get(i4)).b);
        }
        i0a i0aVar = this.F;
        i0aVar.setAdapter(null);
        k0a k0aVar = this.a;
        i0aVar.setAdapter(k0aVar);
        k0aVar.g();
        i0aVar.setCurrentItem(i);
    }

    public mz9 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public g0a getCurrentPage() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i < arrayList.size()) {
                if (((Integer) ((g0a) arrayList.get(i)).getTag()).intValue() == this.F.getCurrentItem()) {
                    return (g0a) arrayList.get(i);
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
                return ((m0a) arrayList.get(closestPosition)).a;
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
            i3 = gl.m;
        } else {
            i3 = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        h0a h0aVar = this.h;
        ((FrameLayout.LayoutParams) h0aVar.getLayoutParams()).topMargin = i3;
        this.n = h0aVar.getFinalHeight();
        this.b = gl.L(20.0f) + i3;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = gl.m;
        float L = (((gl.L(20.0f) + i3) + this.n) + gl.L(24.0f)) - gl.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i4 < arrayList.size()) {
                ((g0a) arrayList.get(i4)).setListBottomPadding(this.d);
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
        g0a currentPage;
        float f;
        if (this.y >= gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (i >= gl.L(20.0f)) {
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
            ofFloat.addUpdateListener(new x89(this, (byte) 21));
            ofFloat.setInterpolator(gb.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i;
        if (i > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.r.dispatchTouchEvent(gl.R());
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
            m8b m8bVar = this.r;
            y28 w = m8bVar.w();
            j8b j8bVar = m8bVar.t0;
            int i3 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            h0a h0aVar = this.h;
            if (i3 == 0 && this.f != 1.0f) {
                if (m8bVar.O0 != null) {
                    k27 k27Var = (k27) m8bVar.O0.i.get(Utilities.j(h0aVar.getClosestPosition(), m8bVar.O0.i.size() - 1, 0));
                    long b = y1b.b(k27Var);
                    ImageReceiver imageReceiver = j8bVar.c;
                    if (imageReceiver != null) {
                        imageReceiver.v0(true, true);
                        j8bVar.c = null;
                    }
                    c8b c8bVar = m8bVar.o0;
                    int i4 = k27Var.l.id;
                    m8b m8bVar2 = c8bVar.O0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= c8bVar.y0.size()) {
                            break;
                        } else if (b == y1b.b(m8bVar2.O0.f(((Integer) ((ArrayList) c8bVar.y0.get(i5)).get(0)).intValue()))) {
                            if (m8bVar2.R0) {
                                i2 = (c8bVar.y0.size() - 1) - i5;
                            } else {
                                i2 = i5;
                            }
                            int i6 = 0;
                            while (true) {
                                if (i6 < ((ArrayList) c8bVar.y0.get(i5)).size()) {
                                    if (((Integer) ((ArrayList) c8bVar.y0.get(i5)).get(i6)).intValue() == i4) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    i6 = 0;
                                    break;
                                }
                            }
                            if (c8bVar.getCurrentPeerView() != null && c8bVar.getCurrentItem() == i2) {
                                y28 currentPeerView = c8bVar.getCurrentPeerView();
                                if (currentPeerView.z1 != i6) {
                                    currentPeerView.z1 = i6;
                                    currentPeerView.c1(false);
                                }
                            } else {
                                c8bVar.x(i2, false);
                                y28 currentPeerView2 = c8bVar.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    a3b a3bVar = (a3b) currentPeerView2.getParent();
                                    a3bVar.a(true);
                                    ArrayList arrayList = c8bVar.y0;
                                    y28 y28Var = a3bVar.a;
                                    long j = a3bVar.b;
                                    if (arrayList != null) {
                                        ArrayList arrayList2 = a3bVar.c;
                                        y28Var.r1 = j;
                                        y28Var.p1 = arrayList2;
                                        y28Var.e0(i6);
                                    } else {
                                        y28Var.P0(i6, j);
                                    }
                                }
                            }
                        } else {
                            i5++;
                        }
                    }
                } else if (w != null && w.z1 != (closestPosition = h0aVar.getClosestPosition())) {
                    w.z1 = closestPosition;
                    w.c1(false);
                }
                h0aVar.d.abortAnimation();
                ValueAnimator valueAnimator = h0aVar.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    h0aVar.N = null;
                }
                h0aVar.c(h0aVar.L, false, true);
            }
            if (w != null) {
                d28 d28Var = w.S0;
                h0aVar.a = d28Var.getTop();
                h0aVar.b = d28Var.getMeasuredWidth();
                h0aVar.c = d28Var.getMeasuredHeight();
            }
            h0aVar.setProgressToOpen(this.f);
            i0a i0aVar = this.F;
            if (i0aVar.x0 && this.f != 1.0f) {
                i0aVar.onTouchEvent(gl.R());
            }
            if (this.f == 0.0f) {
                i = 4;
            } else {
                i = 0;
            }
            setVisibility(i);
            if (this.f != 1.0f) {
                i0aVar.x0 = false;
            }
        }
    }
}
