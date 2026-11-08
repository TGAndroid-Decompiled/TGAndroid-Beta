package di;

import a8.wa;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dt;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.xq;
public abstract class k5 extends FrameLayout implements org.telegram.ui.ActionBar.a6, ls {
    public r5 D;
    public j5 E;
    public j5 F;
    public t6 G;
    public int H;
    public boolean I;
    public final si0 J;
    public final p9 K;
    public final v4 L;
    public final w4 M;
    public final ai.i N;
    public final w4 O;
    public final a5 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f9298a;
    public int f9299a0;
    public final View f9300b;
    public final FrameLayout f9301c;
    public final wa d;
    public int f9302e;
    public z4 f9303f;
    public final TextView h;
    public int f9304n;
    public final r4 f9305r;
    public final b f9306s;
    public final int f9307w;
    public final g5 f9308x;
    public final my f9309y;

    public k5(p9 p9Var, Context context, w4 w4Var, ai.i iVar) {
        super(context);
        this.f9302e = 96;
        this.O = new w4();
        this.M = w4Var;
        this.N = iVar;
        b bVar = p9Var.D;
        this.f9306s = bVar;
        this.K = p9Var;
        this.f9307w = p9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        a5 a5Var = new a5(this, getContext());
        this.P = a5Var;
        r4 r4Var = new r4(this, context, bVar);
        this.f9305r = r4Var;
        r4Var.setClipToPadding(false);
        this.J = new si0(r4Var, true);
        my myVar = new my(0, r4Var);
        this.f9309y = myVar;
        r4Var.setLayoutManager(myVar);
        r4Var.setNestedScrollingEnabled(true);
        g5 g5Var = new g5(this);
        this.f9308x = g5Var;
        r4Var.setAdapter(g5Var);
        new SparseArray();
        new HashMap();
        addView(r4Var);
        this.d = new wa(r4Var);
        r4Var.setOnScrollListener(new ai.b(this, 9));
        r4Var.setOnItemClickListener(new p4(0, this, p9Var));
        r4Var.setOnItemLongClickListener(new u4(this, p9Var));
        g5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f9301c = frameLayout;
        View view = new View(getContext());
        this.f9298a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.k6.f27925h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, bVar);
        this.f9299a0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, ha.d(-1, 8.0f, 0, 0.0f, this.f9302e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f9300b = view2;
        org.telegram.ui.ActionBar.r6.i(i7, view2, bVar);
        frameLayout.addView(view2, ha.d(-1, 10.0f, 0, 0.0f, this.f9302e - 17, 0.0f, 0.0f));
        frameLayout.addView(a5Var);
        frameLayout.addView(textView);
        v4 v4Var = new v4(this, getContext(), bVar);
        this.L = v4Var;
        v4Var.setHint(id.M0(2131745839, null));
        frameLayout.addView(v4Var, ha.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(k5 k5Var) {
        new ug.w0(k5Var.K.f9543f, 14, false).show();
    }

    public static void b(k5 k5Var) {
        j5 j5Var = k5Var.E;
        if (j5Var != null) {
            j5Var.f9270r.remove(k5Var);
        }
        j5 j5Var2 = k5Var.F;
        k5Var.E = j5Var2;
        if (j5Var2 == null) {
            return;
        }
        ArrayList arrayList = j5Var2.f9270r;
        if (!arrayList.contains(k5Var)) {
            arrayList.add(k5Var);
        }
        k5Var.E.e(k5Var.O, k5Var.T, k5Var.S);
        k5Var.f9308x.E();
        k5Var.f9309y.h1(0, (int) (k5Var.getTopOffset() - k5Var.f9305r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        j5 j5Var;
        int i10;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) qp.s1(i7).f24795h0.f9983x.f(storyItem.dialogId);
            if (sparseArray == null) {
                j5Var = null;
            } else {
                j5Var = (j5) sparseArray.get(storyItem.f27195id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i10 = 0;
            } else {
                i10 = storyViews.views_count;
            }
            if (j5Var != null && j5Var.f9255a == i10) {
                return;
            }
            if (j5Var != null) {
                j5Var.d();
            }
            j5 j5Var2 = new j5(i7, j3, storyItem);
            j5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = qp.s1(i7).f24795h0.f9983x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f27195id, j5Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f9309y.N0() > this.f9308x.f9047c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        fi.e7 e7Var;
        fi.q8 q8Var;
        if (storyView != null) {
            int i7 = this.f9307w;
            if (qp.s1(i7).P1().N(storyView) || qp.s1(i7).G0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(storyView.user_id));
            r5 r5Var = this.D;
            if (r5Var != null) {
                TL_stories.StoryItem storyItem = r5Var.f9699a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new fi.q8(i7, storyItem.privacy);
                    }
                    return this.D.f9699a.parsedPrivacy.b(a22);
                }
                x6 x6Var = r5Var.f9700b;
                if (x6Var != null && (e7Var = x6Var.f9930c) != null && (q8Var = e7Var.E0) != null) {
                    return q8Var.b(a22);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int R;
        float f10;
        int i11 = 0;
        if (i7 == qs.f25095v5) {
            if (this.D.f9700b != null) {
                int i12 = this.f9307w;
                TL_stories.PeerStories y10 = qp.s1(i12).f24795h0.y(p10.i(i12).f24489n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.D.f9700b.f9931e)) {
                            r5 r5Var = this.D;
                            r5Var.f9700b = null;
                            r5Var.f9699a = storyItem;
                            g(this.W, r5Var);
                            return;
                        }
                        i11++;
                    }
                }
            }
        } else if (i7 != qs.f24970a3) {
        } else {
            while (true) {
                r4 r4Var = this.f9305r;
                if (i11 < r4Var.getChildCount()) {
                    View childAt = r4Var.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.m6) && (R = RecyclerView.R(childAt)) >= 0) {
                        g5 g5Var = this.f9308x;
                        if (R < g5Var.f9047c.size()) {
                            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                            if (d(((b5) g5Var.f9047c.get(R)).f8844b)) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            m6Var.a(true, f10);
                        }
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        r4 r4Var;
        int paddingTop;
        View view = null;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            r4Var = this.f9305r;
            if (i10 >= r4Var.getChildCount()) {
                break;
            }
            View childAt = r4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i7 || i7 == -1) {
                view = childAt;
                i7 = S;
            }
            i10++;
        }
        if (i7 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i7 > 0) {
            paddingTop = 0;
        } else {
            paddingTop = r4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f9301c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            o5 o5Var = (o5) this;
            int intValue = ((Integer) o5Var.getTag()).intValue();
            s5 s5Var = o5Var.f9465b0.f9513e;
            l5 l5Var = s5Var.h;
            if (intValue == s5Var.E.getCurrentItem()) {
                l5Var.setAlpha(Utilities.i(f10 / s5Var.d, 1.0f, 0.0f));
                l5Var.setTranslationY((-(s5Var.d - f10)) / 2.0f);
            }
        }
        this.U.setBounds(-org.telegram.messenger.g0.L(6.0f), paddingTop, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != r4Var.getPaddingTop()) {
                int i11 = (frameLayout.getTranslationY() > (r4Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (r4Var.getPaddingTop() / 2.0f) ? 0 : -1));
                wa waVar = this.d;
                if (i11 > 0) {
                    waVar.x((int) (-(r4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    waVar.x((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f9305r) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(this.f9302e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(j5 j5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        g5 g5Var = this.f9308x;
        int size = g5Var.f9047c.size();
        w4 w4Var = this.O;
        if (TextUtils.isEmpty(w4Var.f9903c) && !w4Var.f9902b) {
            i();
        }
        g5Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = j5Var.f9261i;
            if (j5Var == this.E && arrayList != null && this.H < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = this.H; i7 < arrayList.size(); i7++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i7);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id);
                        arrayList2.add(storyItem);
                    }
                }
                this.H = arrayList.size();
                if (!arrayList2.isEmpty()) {
                    this.G.F(arrayList2);
                }
            }
        }
    }

    public final void g(long j3, r5 r5Var) {
        this.W = j3;
        this.D = r5Var;
        i();
        h(false);
        if (r5Var != null && r5Var.f9699a != null) {
            dt t6 = dt.t(this.f9307w);
            int i7 = r5Var.f9699a.f27195id;
            if (j3 == t6.getUserConfig().e()) {
                dt.f22076k0.c(new xs(t6, i7, 5));
            }
        }
    }

    public float getTopOffset() {
        return this.f9301c.getTranslationY();
    }

    public final void h(boolean z9) {
        int i7;
        w4 w4Var = this.O;
        boolean z10 = w4Var.f9902b;
        a5 a5Var = this.P;
        if (z10 != a5Var.f8811s || !z9) {
            ValueAnimator valueAnimator = a5Var.f8813x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                a5Var.f8813x.cancel();
            }
            a5Var.f8811s = z10 ? 1 : 0;
            if (!z9) {
                a5Var.f8810r = 1.0f;
                a5Var.invalidate();
            } else {
                a5Var.f8807e.set(a5Var.f8809n);
                a5Var.f8808f = a5Var.f8806c.getAlpha();
                a5Var.h = a5Var.d.getAlpha();
                a5Var.f8810r = 0.0f;
                a5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                a5Var.f8813x = ofFloat;
                ofFloat.addUpdateListener(new ah.h(a5Var, 20));
                a5Var.f8813x.addListener(new bi.t5(a5Var, 13));
                a5Var.f8813x.setDuration(250L);
                a5Var.f8813x.setInterpolator(xq.f40366f);
                a5Var.f8813x.start();
            }
        }
        boolean z11 = w4Var.f9901a;
        xj0 xj0Var = a5Var.f8812w;
        if (z11) {
            j5 j5Var = this.E;
            if (j5Var != null && j5Var.f9259f) {
                i7 = 2131231923;
            } else {
                i7 = 2131231918;
            }
        } else {
            i7 = 2131231921;
        }
        xj0Var.a(i7, z9);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: di.k5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        j5 j5Var = this.E;
        if (j5Var != null) {
            ArrayList arrayList = j5Var.f9270r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f9268p.clear();
        }
        this.f9308x.E();
        int i7 = this.f9307w;
        qs.f(i7).c(this, qs.f25095v5);
        qs.f(i7).c(this, qs.f24970a3);
        setTag(2131296351, new ch.v(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        j5 j5Var = this.E;
        if (j5Var != null) {
            j5Var.f9270r.remove(this);
        }
        int i7 = this.f9307w;
        qs.f(i7).n(this, qs.f25095v5);
        qs.f(i7).n(this, qs.f24970a3);
        setTag(2131296351, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f9301c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f9301c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        r4 r4Var = this.f9305r;
        if (f10 != r4Var.getPaddingBottom()) {
            r4Var.setPadding(0, (int) f10, 0, 0);
            r4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, this.f9306s);
            View view = this.f9298a;
            if (view != null && w02 != this.f9299a0) {
                this.f9299a0 = w02;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, 0}));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
