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
public final class g4a extends FrameLayout {
    public long E;
    public final b4a F;
    public final ArrayList G;
    public final ArrayList H;
    public final n3a I;
    public float J;
    public final d4a a;
    public float b;
    public float c;
    public float d;
    public final e4a e;
    public float f;
    public final a4a h;
    public float n;
    public final lcb r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public g4a(lcb lcbVar, Context context) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new n3a();
        x53 x53Var = lcbVar.E;
        this.r = lcbVar;
        a4a a4aVar = new a4a(this, lcbVar, getContext());
        this.h = a4aVar;
        Drawable e = c00.e(context, 2131232744);
        this.s = e;
        yob.x(this, e, aob.h5, x53Var, PorterDuff.Mode.MULTIPLY);
        e4a e4aVar = new e4a(this, context);
        this.e = e4aVar;
        b4a b4aVar = new b4a(this, context);
        this.F = b4aVar;
        b4aVar.b(new mv(this, (byte) 4));
        d4a d4aVar = new d4a(this, lcbVar, context);
        this.a = d4aVar;
        b4aVar.setAdapter(d4aVar);
        e4aVar.addView(b4aVar, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a4aVar, tre.c(-1.0f, -1));
        addView(e4aVar);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f = this.d;
        z3a currentPage = getCurrentPage();
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
        ArrayList E = uc7.s1(this.r.h).e0.E(yac.h(yac.t0).e());
        if (E != null) {
            for (int i3 = 0; i3 < E.size(); i3++) {
                ?? obj2 = new Object();
                obj2.b = (b6b) E.get(i3);
                arrayList2.add(obj2);
            }
        }
        a4a a4aVar = this.h;
        ArrayList arrayList3 = a4aVar.H;
        ArrayList arrayList4 = a4aVar.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        a4aVar.d();
        if (a4aVar.getMeasuredHeight() > 0) {
            a4aVar.c(i, false, false);
        } else {
            a4aVar.x = i;
        }
        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
            ((g3a) arrayList3.get(i4)).a(((g3a) arrayList3.get(i4)).b);
        }
        b4a b4aVar = this.F;
        b4aVar.setAdapter(null);
        d4a d4aVar = this.a;
        b4aVar.setAdapter(d4aVar);
        d4aVar.g();
        b4aVar.setCurrentItem(i);
    }

    public g3a getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public z3a getCurrentPage() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i < arrayList.size()) {
                if (((Integer) ((z3a) arrayList.get(i)).getTag()).intValue() == this.F.getCurrentItem()) {
                    return (z3a) arrayList.get(i);
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
                return ((f4a) arrayList.get(closestPosition)).a;
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
            i3 = hl.m;
        } else {
            i3 = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        a4a a4aVar = this.h;
        ((FrameLayout.LayoutParams) a4aVar.getLayoutParams()).topMargin = i3;
        this.n = a4aVar.getFinalHeight();
        this.b = hl.L(20.0f) + i3;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = hl.m;
        float L = (((hl.L(20.0f) + i3) + this.n) + hl.L(24.0f)) - hl.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i4 < arrayList.size()) {
                ((z3a) arrayList.get(i4)).setListBottomPadding(this.d);
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
        z3a currentPage;
        float f;
        if (this.y >= hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (i >= hl.L(20.0f)) {
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
            ofFloat.addUpdateListener(new b49(this, (byte) 23));
            ofFloat.setInterpolator(hb.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i;
        if (i > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.r.dispatchTouchEvent(hl.R());
            FrameLayout frameLayout = currentPage.c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.A((int) frameLayout.getTranslationY(), 250L, hb.w);
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
            lcb lcbVar = this.r;
            o68 w = lcbVar.w();
            icb icbVar = lcbVar.t0;
            int i3 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            a4a a4aVar = this.h;
            if (i3 == 0 && this.f != 1.0f) {
                if (lcbVar.O0 != null) {
                    r47 r47Var = (r47) lcbVar.O0.i.get(Utilities.j(a4aVar.getClosestPosition(), lcbVar.O0.i.size() - 1, 0));
                    long b = u5b.b(r47Var);
                    ImageReceiver imageReceiver = icbVar.c;
                    if (imageReceiver != null) {
                        imageReceiver.v0(true, true);
                        icbVar.c = null;
                    }
                    acb acbVar = lcbVar.o0;
                    int i4 = r47Var.l.id;
                    lcb lcbVar2 = acbVar.O0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= acbVar.y0.size()) {
                            break;
                        } else if (b == u5b.b(lcbVar2.O0.f(((Integer) ((ArrayList) acbVar.y0.get(i5)).get(0)).intValue()))) {
                            if (lcbVar2.R0) {
                                i2 = (acbVar.y0.size() - 1) - i5;
                            } else {
                                i2 = i5;
                            }
                            int i6 = 0;
                            while (true) {
                                if (i6 < ((ArrayList) acbVar.y0.get(i5)).size()) {
                                    if (((Integer) ((ArrayList) acbVar.y0.get(i5)).get(i6)).intValue() == i4) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    i6 = 0;
                                    break;
                                }
                            }
                            if (acbVar.getCurrentPeerView() != null && acbVar.getCurrentItem() == i2) {
                                o68 currentPeerView = acbVar.getCurrentPeerView();
                                if (currentPeerView.t1 != i6) {
                                    currentPeerView.t1 = i6;
                                    currentPeerView.c1(false);
                                }
                            } else {
                                acbVar.x(i2, false);
                                o68 currentPeerView2 = acbVar.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    w6b w6bVar = (w6b) currentPeerView2.getParent();
                                    w6bVar.a(true);
                                    ArrayList arrayList = acbVar.y0;
                                    o68 o68Var = w6bVar.a;
                                    long j = w6bVar.b;
                                    if (arrayList != null) {
                                        ArrayList arrayList2 = w6bVar.c;
                                        o68Var.l1 = j;
                                        o68Var.j1 = arrayList2;
                                        o68Var.e0(i6);
                                    } else {
                                        o68Var.P0(i6, j);
                                    }
                                }
                            }
                        } else {
                            i5++;
                        }
                    }
                } else if (w != null && w.t1 != (closestPosition = a4aVar.getClosestPosition())) {
                    w.t1 = closestPosition;
                    w.c1(false);
                }
                a4aVar.d.abortAnimation();
                ValueAnimator valueAnimator = a4aVar.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    a4aVar.N = null;
                }
                a4aVar.c(a4aVar.L, false, true);
            }
            if (w != null) {
                t58 t58Var = w.M0;
                a4aVar.a = t58Var.getTop();
                a4aVar.b = t58Var.getMeasuredWidth();
                a4aVar.c = t58Var.getMeasuredHeight();
            }
            a4aVar.setProgressToOpen(this.f);
            b4a b4aVar = this.F;
            if (b4aVar.x0 && this.f != 1.0f) {
                b4aVar.onTouchEvent(hl.R());
            }
            if (this.f == 0.0f) {
                i = 4;
            } else {
                i = 0;
            }
            setVisibility(i);
            if (this.f != 1.0f) {
                b4aVar.x0 = false;
            }
        }
    }
}
