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
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xj0;
public abstract class l5 extends FrameLayout implements org.telegram.ui.ActionBar.c6, ls {
    public s5 D;
    public k5 E;
    public k5 F;
    public u6 G;
    public int H;
    public boolean I;
    public final si0 J;
    public final q9 K;
    public final w4 L;
    public final x4 M;
    public final ai.i N;
    public final x4 O;
    public final b5 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f9327a;
    public int f9328a0;
    public final View f9329b;
    public final FrameLayout f9330c;
    public final wa d;
    public int f9331e;
    public a5 f9332f;
    public final TextView h;
    public int f9333n;
    public final s4 f9334r;
    public final b f9335s;
    public final int f9336w;
    public final h5 f9337x;
    public final ly f9338y;

    public l5(q9 q9Var, Context context, x4 x4Var, ai.i iVar) {
        super(context);
        this.f9331e = 96;
        this.O = new x4();
        this.M = x4Var;
        this.N = iVar;
        b bVar = q9Var.D;
        this.f9335s = bVar;
        this.K = q9Var;
        this.f9336w = q9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        b5 b5Var = new b5(this, getContext());
        this.P = b5Var;
        s4 s4Var = new s4(this, context, bVar);
        this.f9334r = s4Var;
        s4Var.setClipToPadding(false);
        this.J = new si0(s4Var, true);
        ly lyVar = new ly(0, s4Var);
        this.f9338y = lyVar;
        s4Var.setLayoutManager(lyVar);
        s4Var.setNestedScrollingEnabled(true);
        h5 h5Var = new h5(this);
        this.f9337x = h5Var;
        s4Var.setAdapter(h5Var);
        new SparseArray();
        new HashMap();
        addView(s4Var);
        this.d = new wa(s4Var);
        s4Var.setOnScrollListener(new ai.b(this, 9));
        s4Var.setOnItemClickListener(new q4(0, this, q9Var));
        s4Var.setOnItemLongClickListener(new v4(this, q9Var));
        h5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f9330c = frameLayout;
        View view = new View(getContext());
        this.f9327a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.m6.f27963h5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, bVar);
        this.f9328a0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, ha.d(-1, 8.0f, 0, 0.0f, this.f9331e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f9329b = view2;
        org.telegram.ui.ActionBar.t6.h(i7, view2, bVar);
        frameLayout.addView(view2, ha.d(-1, 10.0f, 0, 0.0f, this.f9331e - 17, 0.0f, 0.0f));
        frameLayout.addView(b5Var);
        frameLayout.addView(textView);
        w4 w4Var = new w4(this, getContext(), bVar);
        this.L = w4Var;
        w4Var.setHint(id.M0(2131745836, null));
        frameLayout.addView(w4Var, ha.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(l5 l5Var) {
        new ug.w0(l5Var.K.f9613f, 14, false).show();
    }

    public static void b(l5 l5Var) {
        k5 k5Var = l5Var.E;
        if (k5Var != null) {
            k5Var.f9301r.remove(l5Var);
        }
        k5 k5Var2 = l5Var.F;
        l5Var.E = k5Var2;
        if (k5Var2 == null) {
            return;
        }
        ArrayList arrayList = k5Var2.f9301r;
        if (!arrayList.contains(l5Var)) {
            arrayList.add(l5Var);
        }
        l5Var.E.e(l5Var.O, l5Var.T, l5Var.S);
        l5Var.f9337x.E();
        l5Var.f9338y.h1(0, (int) (l5Var.getTopOffset() - l5Var.f9334r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        k5 k5Var;
        int i10;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) qp.s1(i7).f24799h0.f10017x.f(storyItem.dialogId);
            if (sparseArray == null) {
                k5Var = null;
            } else {
                k5Var = (k5) sparseArray.get(storyItem.f27199id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i10 = 0;
            } else {
                i10 = storyViews.views_count;
            }
            if (k5Var != null && k5Var.f9286a == i10) {
                return;
            }
            if (k5Var != null) {
                k5Var.d();
            }
            k5 k5Var2 = new k5(i7, j3, storyItem);
            k5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = qp.s1(i7).f24799h0.f10017x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f27199id, k5Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f9338y.N0() > this.f9337x.f9078c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        fi.e7 e7Var;
        fi.q8 q8Var;
        if (storyView != null) {
            int i7 = this.f9336w;
            if (qp.s1(i7).P1().N(storyView) || qp.s1(i7).G0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(storyView.user_id));
            s5 s5Var = this.D;
            if (s5Var != null) {
                TL_stories.StoryItem storyItem = s5Var.f9735a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new fi.q8(i7, storyItem.privacy);
                    }
                    return this.D.f9735a.parsedPrivacy.b(a22);
                }
                y6 y6Var = s5Var.f9736b;
                if (y6Var != null && (e7Var = y6Var.f9965c) != null && (q8Var = e7Var.E0) != null) {
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
        if (i7 == qs.f25099v5) {
            if (this.D.f9736b != null) {
                int i12 = this.f9336w;
                TL_stories.PeerStories y10 = qp.s1(i12).f24799h0.y(p10.i(i12).f24493n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.D.f9736b.f9966e)) {
                            s5 s5Var = this.D;
                            s5Var.f9736b = null;
                            s5Var.f9735a = storyItem;
                            g(this.W, s5Var);
                            return;
                        }
                        i11++;
                    }
                }
            }
        } else if (i7 != qs.f24974a3) {
        } else {
            while (true) {
                s4 s4Var = this.f9334r;
                if (i11 < s4Var.getChildCount()) {
                    View childAt = s4Var.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.m6) && (R = RecyclerView.R(childAt)) >= 0) {
                        h5 h5Var = this.f9337x;
                        if (R < h5Var.f9078c.size()) {
                            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                            if (d(((c5) h5Var.f9078c.get(R)).f8875b)) {
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
        s4 s4Var;
        int paddingTop;
        View view = null;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            s4Var = this.f9334r;
            if (i10 >= s4Var.getChildCount()) {
                break;
            }
            View childAt = s4Var.getChildAt(i10);
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
            paddingTop = s4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f9330c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            p5 p5Var = (p5) this;
            int intValue = ((Integer) p5Var.getTag()).intValue();
            t5 t5Var = p5Var.f9514b0.f9583e;
            m5 m5Var = t5Var.h;
            if (intValue == t5Var.E.getCurrentItem()) {
                m5Var.setAlpha(Utilities.i(f10 / t5Var.d, 1.0f, 0.0f));
                m5Var.setTranslationY((-(t5Var.d - f10)) / 2.0f);
            }
        }
        this.U.setBounds(-org.telegram.messenger.g0.L(6.0f), paddingTop, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != s4Var.getPaddingTop()) {
                int i11 = (frameLayout.getTranslationY() > (s4Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (s4Var.getPaddingTop() / 2.0f) ? 0 : -1));
                wa waVar = this.d;
                if (i11 > 0) {
                    waVar.x((int) (-(s4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    waVar.x((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f9334r) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(this.f9331e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(k5 k5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        h5 h5Var = this.f9337x;
        int size = h5Var.f9078c.size();
        x4 x4Var = this.O;
        if (TextUtils.isEmpty(x4Var.f9933c) && !x4Var.f9932b) {
            i();
        }
        h5Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = k5Var.f9292i;
            if (k5Var == this.E && arrayList != null && this.H < arrayList.size()) {
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

    public final void g(long j3, s5 s5Var) {
        this.W = j3;
        this.D = s5Var;
        i();
        h(false);
        if (s5Var != null && s5Var.f9735a != null) {
            dt t6 = dt.t(this.f9336w);
            int i7 = s5Var.f9735a.f27199id;
            if (j3 == t6.getUserConfig().e()) {
                dt.f22080k0.c(new xs(t6, i7, 5));
            }
        }
    }

    public float getTopOffset() {
        return this.f9330c.getTranslationY();
    }

    public final void h(boolean z9) {
        int i7;
        x4 x4Var = this.O;
        boolean z10 = x4Var.f9932b;
        b5 b5Var = this.P;
        if (z10 != b5Var.f8850s || !z9) {
            ValueAnimator valueAnimator = b5Var.f8852x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                b5Var.f8852x.cancel();
            }
            b5Var.f8850s = z10 ? 1 : 0;
            if (!z9) {
                b5Var.f8849r = 1.0f;
                b5Var.invalidate();
            } else {
                b5Var.f8846e.set(b5Var.f8848n);
                b5Var.f8847f = b5Var.f8845c.getAlpha();
                b5Var.h = b5Var.d.getAlpha();
                b5Var.f8849r = 0.0f;
                b5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                b5Var.f8852x = ofFloat;
                ofFloat.addUpdateListener(new ah.h(b5Var, 20));
                b5Var.f8852x.addListener(new bi.t5(b5Var, 13));
                b5Var.f8852x.setDuration(250L);
                b5Var.f8852x.setInterpolator(wq.f40046f);
                b5Var.f8852x.start();
            }
        }
        boolean z11 = x4Var.f9931a;
        xj0 xj0Var = b5Var.f8851w;
        if (z11) {
            k5 k5Var = this.E;
            if (k5Var != null && k5Var.f9290f) {
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
        throw new UnsupportedOperationException("Method not decompiled: di.l5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        k5 k5Var = this.E;
        if (k5Var != null) {
            ArrayList arrayList = k5Var.f9301r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f9299p.clear();
        }
        this.f9337x.E();
        int i7 = this.f9336w;
        qs.f(i7).c(this, qs.f25099v5);
        qs.f(i7).c(this, qs.f24974a3);
        setTag(2131296351, new ch.v(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        k5 k5Var = this.E;
        if (k5Var != null) {
            k5Var.f9301r.remove(this);
        }
        int i7 = this.f9336w;
        qs.f(i7).n(this, qs.f25099v5);
        qs.f(i7).n(this, qs.f24974a3);
        setTag(2131296351, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f9330c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f9330c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        s4 s4Var = this.f9334r;
        if (f10 != s4Var.getPaddingBottom()) {
            s4Var.setPadding(0, (int) f10, 0, 0);
            s4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.f9335s);
            View view = this.f9327a;
            if (view != null && w02 != this.f9328a0) {
                this.f9328a0 = w02;
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
