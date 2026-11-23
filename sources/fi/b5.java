package fi;

import a8.xa;
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
import c8.na;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.rs;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.vy;
public abstract class b5 extends FrameLayout implements org.telegram.ui.ActionBar.c6, fs {
    public i5 E;
    public a5 F;
    public a5 G;
    public k6 H;
    public int I;
    public boolean J;
    public final hj0 K;
    public final f9 L;
    public final m4 M;
    public final n4 N;
    public final ai.d0 O;
    public final n4 P;
    public final r4 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public boolean W;
    public final View f11772a;
    public long f11773a0;
    public final View f11774b;
    public int f11775b0;
    public final FrameLayout f11776c;
    public final xa d;
    public int f11777e;
    public q4 f11778f;
    public final TextView h;
    public int f11779n;
    public final h4 f11780r;
    public final b f11781s;
    public final int f11782w;
    public final x4 f11783x;
    public final vy f11784y;

    public b5(f9 f9Var, Context context, n4 n4Var, ai.d0 d0Var) {
        super(context);
        this.f11777e = 96;
        this.P = new n4();
        this.N = n4Var;
        this.O = d0Var;
        b bVar = f9Var.E;
        this.f11781s = bVar;
        this.L = f9Var;
        this.f11782w = f9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        r4 r4Var = new r4(this, getContext());
        this.Q = r4Var;
        h4 h4Var = new h4(this, context, bVar);
        this.f11780r = h4Var;
        h4Var.setClipToPadding(false);
        this.K = new hj0(h4Var, true);
        vy vyVar = new vy(0, h4Var);
        this.f11784y = vyVar;
        h4Var.setLayoutManager(vyVar);
        h4Var.setNestedScrollingEnabled(true);
        x4 x4Var = new x4(this);
        this.f11783x = x4Var;
        h4Var.setAdapter(x4Var);
        new SparseArray();
        new HashMap();
        addView(h4Var);
        this.d = new xa(h4Var);
        h4Var.setOnScrollListener(new bi.v1(this, 13));
        h4Var.setOnItemClickListener(new g4(0, this, f9Var));
        h4Var.setOnItemLongClickListener(new k4(this, f9Var));
        x4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11776c = frameLayout;
        View view = new View(getContext());
        this.f11772a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.n6.f29524h5;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, bVar);
        this.f11775b0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, na.d(-1, 8.0f, 0, 0.0f, this.f11777e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f11774b = view2;
        org.telegram.ui.ActionBar.u6.h(i7, view2, bVar);
        frameLayout.addView(view2, na.d(-1, 10.0f, 0, 0.0f, this.f11777e - 17, 0.0f, 0.0f));
        frameLayout.addView(r4Var);
        frameLayout.addView(textView);
        m4 m4Var = new m4(this, getContext(), bVar);
        this.M = m4Var;
        m4Var.setHint(gd.N0(2131745640, null));
        frameLayout.addView(m4Var, na.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(b5 b5Var) {
        new ug.y0(b5Var.L.f11972f, 14, false).show();
    }

    public static void b(b5 b5Var) {
        a5 a5Var = b5Var.F;
        if (a5Var != null) {
            a5Var.f11732r.remove(b5Var);
        }
        a5 a5Var2 = b5Var.G;
        b5Var.F = a5Var2;
        if (a5Var2 == null) {
            return;
        }
        ArrayList arrayList = a5Var2.f11732r;
        if (!arrayList.contains(b5Var)) {
            arrayList.add(b5Var);
        }
        b5Var.F.e(b5Var.P, b5Var.U, b5Var.T);
        b5Var.f11783x.E();
        b5Var.f11784y.h1(0, (int) (b5Var.getTopOffset() - b5Var.f11780r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        a5 a5Var;
        int i10;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) mp.u1(i7).f25763i0.f12407x.f(storyItem.dialogId);
            if (sparseArray == null) {
                a5Var = null;
            } else {
                a5Var = (a5) sparseArray.get(storyItem.f28731id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i10 = 0;
            } else {
                i10 = storyViews.views_count;
            }
            if (a5Var != null && a5Var.f11717a == i10) {
                return;
            }
            if (a5Var != null) {
                a5Var.d();
            }
            a5 a5Var2 = new a5(i7, j3, storyItem);
            a5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = mp.u1(i7).f25763i0.f12407x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f28731id, a5Var2);
        }
    }

    public final void c() {
        if (this.F != null && this.f11784y.N0() > this.f11783x.f12736c.size() - 10) {
            this.F.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        hi.x7 x7Var;
        hi.i9 i9Var;
        if (storyView != null) {
            int i7 = this.f11782w;
            if (mp.u1(i7).R1().N(storyView) || mp.u1(i7).H0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(storyView.user_id));
            i5 i5Var = this.E;
            if (i5Var != null) {
                TL_stories.StoryItem storyItem = i5Var.f12104a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new hi.i9(i7, storyItem.privacy);
                    }
                    return this.E.f12104a.parsedPrivacy.b(c22);
                }
                o6 o6Var = i5Var.f12105b;
                if (o6Var != null && (x7Var = o6Var.f12337c) != null && (i9Var = x7Var.E0) != null) {
                    return i9Var.b(c22);
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
        if (i7 == ks.f25329y5) {
            if (this.E.f12105b != null) {
                int i12 = this.f11782w;
                TL_stories.PeerStories y10 = mp.u1(i12).f25763i0.y(i10.i(i12).f24656n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.f12105b.f12338e)) {
                            i5 i5Var = this.E;
                            i5Var.f12105b = null;
                            i5Var.f12104a = storyItem;
                            g(this.f11773a0, i5Var);
                            return;
                        }
                        i11++;
                    }
                }
            }
        } else if (i7 != ks.f25195c3) {
        } else {
            while (true) {
                h4 h4Var = this.f11780r;
                if (i11 < h4Var.getChildCount()) {
                    View childAt = h4Var.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.m6) && (R = RecyclerView.R(childAt)) >= 0) {
                        x4 x4Var = this.f11783x;
                        if (R < x4Var.f12736c.size()) {
                            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                            if (d(((s4) x4Var.f12736c.get(R)).f12524b)) {
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
        h4 h4Var;
        int paddingTop;
        View view = null;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            h4Var = this.f11780r;
            if (i10 >= h4Var.getChildCount()) {
                break;
            }
            View childAt = h4Var.getChildAt(i10);
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
            paddingTop = h4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f11776c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            f5 f5Var = (f5) this;
            int intValue = ((Integer) f5Var.getTag()).intValue();
            j5 j5Var = f5Var.f11947c0.f12021e;
            c5 c5Var = j5Var.h;
            if (intValue == j5Var.F.getCurrentItem()) {
                c5Var.setAlpha(Utilities.i(f10 / j5Var.d, 1.0f, 0.0f));
                c5Var.setTranslationY((-(j5Var.d - f10)) / 2.0f);
            }
        }
        this.V.setBounds(-org.telegram.messenger.g0.L(6.0f), paddingTop, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != h4Var.getPaddingTop()) {
                int i11 = (frameLayout.getTranslationY() > (h4Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (h4Var.getPaddingTop() / 2.0f) ? 0 : -1));
                xa xaVar = this.d;
                if (i11 > 0) {
                    xaVar.x((int) (-(h4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    xaVar.x((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f11780r) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(this.f11777e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(a5 a5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        x4 x4Var = this.f11783x;
        int size = x4Var.f12736c.size();
        n4 n4Var = this.P;
        if (TextUtils.isEmpty(n4Var.f12304c) && !n4Var.f12303b) {
            i();
        }
        x4Var.E();
        this.K.b(size - 1);
        c();
        if (this.H != null) {
            ArrayList arrayList = a5Var.f11723i;
            if (a5Var == this.F && arrayList != null && this.I < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = this.I; i7 < arrayList.size(); i7++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i7);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = org.telegram.messenger.n5.o(tL_storyReactionPublicRepost.peer_id);
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

    public final void g(long j3, i5 i5Var) {
        this.f11773a0 = j3;
        this.E = i5Var;
        i();
        h(false);
        if (i5Var != null && i5Var.f12104a != null) {
            xs t6 = xs.t(this.f11782w);
            int i7 = i5Var.f12104a.f28731id;
            if (j3 == t6.getUserConfig().e()) {
                xs.f28073l0.c(new rs(t6, i7, 5));
            }
        }
    }

    public float getTopOffset() {
        return this.f11776c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i7;
        n4 n4Var = this.P;
        boolean z11 = n4Var.f12303b;
        r4 r4Var = this.Q;
        if (z11 != r4Var.f12502s || !z10) {
            ValueAnimator valueAnimator = r4Var.f12504x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                r4Var.f12504x.cancel();
            }
            r4Var.f12502s = z11 ? 1 : 0;
            if (!z10) {
                r4Var.f12501r = 1.0f;
                r4Var.invalidate();
            } else {
                r4Var.f12498e.set(r4Var.f12500n);
                r4Var.f12499f = r4Var.f12497c.getAlpha();
                r4Var.h = r4Var.d.getAlpha();
                r4Var.f12501r = 0.0f;
                r4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r4Var.f12504x = ofFloat;
                ofFloat.addUpdateListener(new ah.g(r4Var, 21));
                r4Var.f12504x.addListener(new ai.g0(r4Var, 15));
                r4Var.f12504x.setDuration(250L);
                r4Var.f12504x.setInterpolator(kr.f36858f);
                r4Var.f12504x.start();
            }
        }
        boolean z12 = n4Var.f12302a;
        mk0 mk0Var = r4Var.f12503w;
        if (z12) {
            a5 a5Var = this.F;
            if (a5Var != null && a5Var.f11721f) {
                i7 = 2131231927;
            } else {
                i7 = 2131231922;
            }
        } else {
            i7 = 2131231925;
        }
        mk0Var.a(i7, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: fi.b5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        a5 a5Var = this.F;
        if (a5Var != null) {
            ArrayList arrayList = a5Var.f11732r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.f11730p.clear();
        }
        this.f11783x.E();
        int i7 = this.f11782w;
        ks.f(i7).c(this, ks.f25329y5);
        ks.f(i7).c(this, ks.f25195c3);
        setTag(2131296353, new bi.i1(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        a5 a5Var = this.F;
        if (a5Var != null) {
            a5Var.f11732r.remove(this);
        }
        int i7 = this.f11782w;
        ks.f(i7).n(this, ks.f25329y5);
        ks.f(i7).n(this, ks.f25195c3);
        setTag(2131296353, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f11776c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f11776c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        h4 h4Var = this.f11780r;
        if (f10 != h4Var.getPaddingBottom()) {
            h4Var.setPadding(0, (int) f10, 0, 0);
            h4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.f11781s);
            View view = this.f11772a;
            if (view != null && w02 != this.f11775b0) {
                this.f11775b0 = w02;
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
