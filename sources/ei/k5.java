package ei;

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
import b8.kg;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.os;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.xq;
public abstract class k5 extends FrameLayout implements org.telegram.ui.ActionBar.z5, cs {
    public r5 E;
    public j5 F;
    public j5 G;
    public u6 H;
    public int I;
    public boolean J;
    public final wi0 K;
    public final r9 L;
    public final v4 M;
    public final w4 N;
    public final ai.v2 O;
    public final w4 P;
    public final a5 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public boolean W;
    public final View f10569a;
    public long f10570a0;
    public final View f10571b;
    public int f10572b0;
    public final FrameLayout f10573c;
    public final kg d;
    public int f10574e;
    public z4 f10575f;
    public final TextView h;
    public int f10576n;
    public final r4 f10577r;
    public final b f10578s;
    public final int f10579w;
    public final g5 f10580x;
    public final jy f10581y;

    public k5(r9 r9Var, Context context, w4 w4Var, ai.v2 v2Var) {
        super(context);
        this.f10574e = 96;
        this.P = new w4();
        this.N = w4Var;
        this.O = v2Var;
        b bVar = r9Var.E;
        this.f10578s = bVar;
        this.L = r9Var;
        this.f10579w = r9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        a5 a5Var = new a5(this, getContext());
        this.Q = a5Var;
        r4 r4Var = new r4(this, context, bVar);
        this.f10577r = r4Var;
        r4Var.setClipToPadding(false);
        this.K = new wi0(r4Var, true);
        jy jyVar = new jy(0, r4Var);
        this.f10581y = jyVar;
        r4Var.setLayoutManager(jyVar);
        r4Var.setNestedScrollingEnabled(true);
        g5 g5Var = new g5(this);
        this.f10580x = g5Var;
        r4Var.setAdapter(g5Var);
        new SparseArray();
        new HashMap();
        addView(r4Var);
        this.d = new kg(r4Var);
        r4Var.setOnScrollListener(new ai.j5(this, 12));
        r4Var.setOnItemClickListener(new q4(0, this, r9Var));
        r4Var.setOnItemLongClickListener(new u4(this, r9Var));
        g5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10573c = frameLayout;
        View view = new View(getContext());
        this.f10569a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, bVar);
        this.f10572b0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, mf.d(-1, 8.0f, 0, 0.0f, this.f10574e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f10571b = view2;
        org.telegram.ui.ActionBar.r6.i(i3, view2, bVar);
        frameLayout.addView(view2, mf.d(-1, 10.0f, 0, 0.0f, this.f10574e - 17, 0.0f, 0.0f));
        frameLayout.addView(a5Var);
        frameLayout.addView(textView);
        v4 v4Var = new v4(this, getContext(), bVar);
        this.M = v4Var;
        v4Var.setHint(bd.M0(2131745846, null));
        frameLayout.addView(v4Var, mf.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(k5 k5Var) {
        new vg.v0(k5Var.L.f10922f, 14, false).show();
    }

    public static void b(k5 k5Var) {
        j5 j5Var = k5Var.F;
        if (j5Var != null) {
            j5Var.f10549r.remove(k5Var);
        }
        j5 j5Var2 = k5Var.G;
        k5Var.F = j5Var2;
        if (j5Var2 == null) {
            return;
        }
        ArrayList arrayList = j5Var2.f10549r;
        if (!arrayList.contains(k5Var)) {
            arrayList.add(k5Var);
        }
        k5Var.F.e(k5Var.P, k5Var.U, k5Var.T);
        k5Var.f10580x.E();
        k5Var.f10581y.h1(0, (int) (k5Var.getTopOffset() - k5Var.f10577r.getPaddingTop()));
    }

    public static void f(int i3, long j10, TL_stories.StoryItem storyItem) {
        j5 j5Var;
        int i10;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) hp.s1(i3).f23027i0.f11294x.f(storyItem.dialogId);
            if (sparseArray == null) {
                j5Var = null;
            } else {
                j5Var = (j5) sparseArray.get(storyItem.f27240id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i10 = 0;
            } else {
                i10 = storyViews.views_count;
            }
            if (j5Var != null && j5Var.f10534a == i10) {
                return;
            }
            if (j5Var != null) {
                j5Var.d();
            }
            j5 j5Var2 = new j5(i3, j10, storyItem);
            j5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = hp.s1(i3).f23027i0.f11294x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f27240id, j5Var2);
        }
    }

    public final void c() {
        if (this.F != null && this.f10581y.N0() > this.f10580x.f10333c.size() - 10) {
            this.F.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        gi.f7 f7Var;
        gi.r8 r8Var;
        if (storyView != null) {
            int i3 = this.f10579w;
            if (hp.s1(i3).P1().N(storyView) || hp.s1(i3).H0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(storyView.user_id));
            r5 r5Var = this.E;
            if (r5Var != null) {
                TL_stories.StoryItem storyItem = r5Var.f10868a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new gi.r8(i3, storyItem.privacy);
                    }
                    return this.E.f10868a.parsedPrivacy.b(a22);
                }
                y6 y6Var = r5Var.f10869b;
                if (y6Var != null && (f7Var = y6Var.f11236c) != null && (r8Var = f7Var.E0) != null) {
                    return r8Var.b(a22);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int R;
        float f10;
        int i11 = 0;
        if (i3 == hs.f23324v5) {
            if (this.E.f10869b != null) {
                int i12 = this.f10579w;
                TL_stories.PeerStories y9 = hp.s1(i12).f23027i0.y(h10.i(i12).f22848n);
                if (y9 != null) {
                    while (i11 < y9.stories.size()) {
                        TL_stories.StoryItem storyItem = y9.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.f10869b.f11237e)) {
                            r5 r5Var = this.E;
                            r5Var.f10869b = null;
                            r5Var.f10868a = storyItem;
                            g(this.f10570a0, r5Var);
                            return;
                        }
                        i11++;
                    }
                }
            }
        } else if (i3 != hs.f23199a3) {
        } else {
            while (true) {
                r4 r4Var = this.f10577r;
                if (i11 < r4Var.getChildCount()) {
                    View childAt = r4Var.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.l6) && (R = RecyclerView.R(childAt)) >= 0) {
                        g5 g5Var = this.f10580x;
                        if (R < g5Var.f10333c.size()) {
                            org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                            if (d(((b5) g5Var.f10333c.get(R)).f10128b)) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            l6Var.a(true, f10);
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
        int i3 = -1;
        int i10 = 0;
        while (true) {
            r4Var = this.f10577r;
            if (i10 >= r4Var.getChildCount()) {
                break;
            }
            View childAt = r4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i3 || i3 == -1) {
                view = childAt;
                i3 = S;
            }
            i10++;
        }
        if (i3 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i3 > 0) {
            paddingTop = 0;
        } else {
            paddingTop = r4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f10573c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            o5 o5Var = (o5) this;
            int intValue = ((Integer) o5Var.getTag()).intValue();
            s5 s5Var = o5Var.f10693c0.f10770e;
            l5 l5Var = s5Var.h;
            if (intValue == s5Var.F.getCurrentItem()) {
                l5Var.setAlpha(Utilities.i(f10 / s5Var.d, 1.0f, 0.0f));
                l5Var.setTranslationY((-(s5Var.d - f10)) / 2.0f);
            }
        }
        this.V.setBounds(-org.telegram.messenger.g0.L(6.0f), paddingTop, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != r4Var.getPaddingTop()) {
                int i11 = (frameLayout.getTranslationY() > (r4Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (r4Var.getPaddingTop() / 2.0f) ? 0 : -1));
                kg kgVar = this.d;
                if (i11 > 0) {
                    kgVar.y((int) (-(r4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    kgVar.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f10577r) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(this.f10574e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(j5 j5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        g5 g5Var = this.f10580x;
        int size = g5Var.f10333c.size();
        w4 w4Var = this.P;
        if (TextUtils.isEmpty(w4Var.f11182c) && !w4Var.f11181b) {
            i();
        }
        g5Var.E();
        this.K.b(size - 1);
        c();
        if (this.H != null) {
            ArrayList arrayList = j5Var.f10540i;
            if (j5Var == this.F && arrayList != null && this.I < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = this.I; i3 < arrayList.size(); i3++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i3);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id);
                        arrayList2.add(storyItem);
                    }
                }
                this.I = arrayList.size();
                if (!arrayList2.isEmpty()) {
                    this.H.F(arrayList2);
                }
            }
        }
    }

    public final void g(long j10, r5 r5Var) {
        this.f10570a0 = j10;
        this.E = r5Var;
        i();
        h(false);
        if (r5Var != null && r5Var.f10868a != null) {
            us t10 = us.t(this.f10579w);
            int i3 = r5Var.f10868a.f27240id;
            if (j10 == t10.getUserConfig().e()) {
                us.f25748l0.c(new os(t10, i3, 5));
            }
        }
    }

    public float getTopOffset() {
        return this.f10573c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i3;
        w4 w4Var = this.P;
        boolean z11 = w4Var.f11181b;
        a5 a5Var = this.Q;
        if (z11 != a5Var.f10086s || !z10) {
            ValueAnimator valueAnimator = a5Var.f10088x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                a5Var.f10088x.cancel();
            }
            a5Var.f10086s = z11 ? 1 : 0;
            if (!z10) {
                a5Var.f10085r = 1.0f;
                a5Var.invalidate();
            } else {
                a5Var.f10082e.set(a5Var.f10084n);
                a5Var.f10083f = a5Var.f10081c.getAlpha();
                a5Var.h = a5Var.d.getAlpha();
                a5Var.f10085r = 0.0f;
                a5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                a5Var.f10088x = ofFloat;
                ofFloat.addUpdateListener(new bh.f(a5Var, 21));
                a5Var.f10088x.addListener(new ai.e1(a5Var, 15));
                a5Var.f10088x.setDuration(250L);
                a5Var.f10088x.setInterpolator(xq.f40452f);
                a5Var.f10088x.start();
            }
        }
        boolean z12 = w4Var.f11180a;
        bk0 bk0Var = a5Var.f10087w;
        if (z12) {
            j5 j5Var = this.F;
            if (j5Var != null && j5Var.f10538f) {
                i3 = 2131231923;
            } else {
                i3 = 2131231918;
            }
        } else {
            i3 = 2131231921;
        }
        bk0Var.a(i3, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: ei.k5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        j5 j5Var = this.F;
        if (j5Var != null) {
            ArrayList arrayList = j5Var.f10549r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.f10547p.clear();
        }
        this.f10580x.E();
        int i3 = this.f10579w;
        hs.f(i3).c(this, hs.f23324v5);
        hs.f(i3).c(this, hs.f23199a3);
        setTag(2131296351, new ai.h1(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        j5 j5Var = this.F;
        if (j5Var != null) {
            j5Var.f10549r.remove(this);
        }
        int i3 = this.f10579w;
        hs.f(i3).n(this, hs.f23324v5);
        hs.f(i3).n(this, hs.f23199a3);
        setTag(2131296351, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f10573c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f10573c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        r4 r4Var = this.f10577r;
        if (f10 != r4Var.getPaddingBottom()) {
            r4Var.setPadding(0, (int) f10, 0, 0);
            r4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.f10578s);
            View view = this.f10569a;
            if (view != null && w02 != this.f10572b0) {
                this.f10572b0 = w02;
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
