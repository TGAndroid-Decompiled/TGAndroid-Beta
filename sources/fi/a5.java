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
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.rs;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.wy;
public abstract class a5 extends FrameLayout implements org.telegram.ui.ActionBar.c6, fs {
    public h5 E;
    public z4 F;
    public z4 G;
    public k6 H;
    public int I;
    public boolean J;
    public final fj0 K;
    public final f9 L;
    public final l4 M;
    public final m4 N;
    public final ai.g0 O;
    public final m4 P;
    public final q4 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public boolean W;
    public final View f11726a;
    public long f11727a0;
    public final View f11728b;
    public int f11729b0;
    public final FrameLayout f11730c;
    public final xa d;
    public int f11731e;
    public p4 f11732f;
    public final TextView h;
    public int f11733n;
    public final h4 f11734r;
    public final b f11735s;
    public final int f11736w;
    public final w4 f11737x;
    public final wy f11738y;

    public a5(f9 f9Var, Context context, m4 m4Var, ai.g0 g0Var) {
        super(context);
        this.f11731e = 96;
        this.P = new m4();
        this.N = m4Var;
        this.O = g0Var;
        b bVar = f9Var.E;
        this.f11735s = bVar;
        this.L = f9Var;
        this.f11736w = f9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        q4 q4Var = new q4(this, getContext());
        this.Q = q4Var;
        h4 h4Var = new h4(this, context, bVar);
        this.f11734r = h4Var;
        h4Var.setClipToPadding(false);
        this.K = new fj0(h4Var, true);
        wy wyVar = new wy(0, h4Var);
        this.f11738y = wyVar;
        h4Var.setLayoutManager(wyVar);
        h4Var.setNestedScrollingEnabled(true);
        w4 w4Var = new w4(this);
        this.f11737x = w4Var;
        h4Var.setAdapter(w4Var);
        new SparseArray();
        new HashMap();
        addView(h4Var);
        this.d = new xa(h4Var);
        h4Var.setOnScrollListener(new bi.q1(this, 13));
        h4Var.setOnItemClickListener(new g4(0, this, f9Var));
        h4Var.setOnItemLongClickListener(new k4(this, f9Var));
        w4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11730c = frameLayout;
        View view = new View(getContext());
        this.f11726a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.n6.f29469h5;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, bVar);
        this.f11729b0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, ma.d(-1, 8.0f, 0, 0.0f, this.f11731e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f11728b = view2;
        org.telegram.ui.ActionBar.u6.h(i7, view2, bVar);
        frameLayout.addView(view2, ma.d(-1, 10.0f, 0, 0.0f, this.f11731e - 17, 0.0f, 0.0f));
        frameLayout.addView(q4Var);
        frameLayout.addView(textView);
        l4 l4Var = new l4(this, getContext(), bVar);
        this.M = l4Var;
        l4Var.setHint(gd.M0(2131745641, null));
        frameLayout.addView(l4Var, ma.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(a5 a5Var) {
        new ug.z0(a5Var.L.f11969f, 14, false).show();
    }

    public static void b(a5 a5Var) {
        z4 z4Var = a5Var.F;
        if (z4Var != null) {
            z4Var.f12918r.remove(a5Var);
        }
        z4 z4Var2 = a5Var.G;
        a5Var.F = z4Var2;
        if (z4Var2 == null) {
            return;
        }
        ArrayList arrayList = z4Var2.f12918r;
        if (!arrayList.contains(a5Var)) {
            arrayList.add(a5Var);
        }
        a5Var.F.e(a5Var.P, a5Var.U, a5Var.T);
        a5Var.f11737x.E();
        a5Var.f11738y.h1(0, (int) (a5Var.getTopOffset() - a5Var.f11734r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        z4 z4Var;
        int i10;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) mp.u1(i7).f25670i0.f12405x.f(storyItem.dialogId);
            if (sparseArray == null) {
                z4Var = null;
            } else {
                z4Var = (z4) sparseArray.get(storyItem.f28644id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i10 = 0;
            } else {
                i10 = storyViews.views_count;
            }
            if (z4Var != null && z4Var.f12903a == i10) {
                return;
            }
            if (z4Var != null) {
                z4Var.d();
            }
            z4 z4Var2 = new z4(i7, j3, storyItem);
            z4Var2.c();
            if (sparseArray == null) {
                a0.h hVar = mp.u1(i7).f25670i0.f12405x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f28644id, z4Var2);
        }
    }

    public final void c() {
        if (this.F != null && this.f11738y.N0() > this.f11737x.f12699c.size() - 10) {
            this.F.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        hi.d7 d7Var;
        hi.o8 o8Var;
        if (storyView != null) {
            int i7 = this.f11736w;
            if (mp.u1(i7).R1().N(storyView) || mp.u1(i7).H0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(storyView.user_id));
            h5 h5Var = this.E;
            if (h5Var != null) {
                TL_stories.StoryItem storyItem = h5Var.f12040a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new hi.o8(i7, storyItem.privacy);
                    }
                    return this.E.f12040a.parsedPrivacy.b(c22);
                }
                o6 o6Var = h5Var.f12041b;
                if (o6Var != null && (d7Var = o6Var.f12333c) != null && (o8Var = d7Var.E0) != null) {
                    return o8Var.b(c22);
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
        if (i7 == ks.f25225x5) {
            if (this.E.f12041b != null) {
                int i12 = this.f11736w;
                TL_stories.PeerStories y10 = mp.u1(i12).f25670i0.y(j10.i(i12).f24792n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.f12041b.f12334e)) {
                            h5 h5Var = this.E;
                            h5Var.f12041b = null;
                            h5Var.f12040a = storyItem;
                            g(this.f11727a0, h5Var);
                            return;
                        }
                        i11++;
                    }
                }
            }
        } else if (i7 != ks.f25098c3) {
        } else {
            while (true) {
                h4 h4Var = this.f11734r;
                if (i11 < h4Var.getChildCount()) {
                    View childAt = h4Var.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.m6) && (R = RecyclerView.R(childAt)) >= 0) {
                        w4 w4Var = this.f11737x;
                        if (R < w4Var.f12699c.size()) {
                            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                            if (d(((r4) w4Var.f12699c.get(R)).f12503b)) {
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
            h4Var = this.f11734r;
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
        FrameLayout frameLayout = this.f11730c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            e5 e5Var = (e5) this;
            int intValue = ((Integer) e5Var.getTag()).intValue();
            i5 i5Var = e5Var.f11889c0.f11944e;
            b5 b5Var = i5Var.h;
            if (intValue == i5Var.F.getCurrentItem()) {
                b5Var.setAlpha(Utilities.i(f10 / i5Var.d, 1.0f, 0.0f));
                b5Var.setTranslationY((-(i5Var.d - f10)) / 2.0f);
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
                    xaVar.y((int) (-(h4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    xaVar.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f11734r) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(this.f11731e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(z4 z4Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        w4 w4Var = this.f11737x;
        int size = w4Var.f12699c.size();
        m4 m4Var = this.P;
        if (TextUtils.isEmpty(m4Var.f12269c) && !m4Var.f12268b) {
            i();
        }
        w4Var.E();
        this.K.b(size - 1);
        c();
        if (this.H != null) {
            ArrayList arrayList = z4Var.f12909i;
            if (z4Var == this.F && arrayList != null && this.I < arrayList.size()) {
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

    public final void g(long j3, h5 h5Var) {
        this.f11727a0 = j3;
        this.E = h5Var;
        i();
        h(false);
        if (h5Var != null && h5Var.f12040a != null) {
            xs t6 = xs.t(this.f11736w);
            int i7 = h5Var.f12040a.f28644id;
            if (j3 == t6.getUserConfig().e()) {
                xs.f27959l0.c(new rs(t6, i7, 5));
            }
        }
    }

    public float getTopOffset() {
        return this.f11730c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i7;
        m4 m4Var = this.P;
        boolean z11 = m4Var.f12268b;
        q4 q4Var = this.Q;
        if (z11 != q4Var.f12462s || !z10) {
            ValueAnimator valueAnimator = q4Var.f12464x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                q4Var.f12464x.cancel();
            }
            q4Var.f12462s = z11 ? 1 : 0;
            if (!z10) {
                q4Var.f12461r = 1.0f;
                q4Var.invalidate();
            } else {
                q4Var.f12458e.set(q4Var.f12460n);
                q4Var.f12459f = q4Var.f12457c.getAlpha();
                q4Var.h = q4Var.d.getAlpha();
                q4Var.f12461r = 0.0f;
                q4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q4Var.f12464x = ofFloat;
                ofFloat.addUpdateListener(new ah.g(q4Var, 21));
                q4Var.f12464x.addListener(new ai.j0(q4Var, 15));
                q4Var.f12464x.setDuration(250L);
                q4Var.f12464x.setInterpolator(lr.f37208f);
                q4Var.f12464x.start();
            }
        }
        boolean z12 = m4Var.f12267a;
        kk0 kk0Var = q4Var.f12463w;
        if (z12) {
            z4 z4Var = this.F;
            if (z4Var != null && z4Var.f12907f) {
                i7 = 2131231924;
            } else {
                i7 = 2131231919;
            }
        } else {
            i7 = 2131231922;
        }
        kk0Var.a(i7, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: fi.a5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        z4 z4Var = this.F;
        if (z4Var != null) {
            ArrayList arrayList = z4Var.f12918r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.f12916p.clear();
        }
        this.f11737x.E();
        int i7 = this.f11736w;
        ks.f(i7).c(this, ks.f25225x5);
        ks.f(i7).c(this, ks.f25098c3);
        setTag(2131296351, new bi.e1(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        z4 z4Var = this.F;
        if (z4Var != null) {
            z4Var.f12918r.remove(this);
        }
        int i7 = this.f11736w;
        ks.f(i7).n(this, ks.f25225x5);
        ks.f(i7).n(this, ks.f25098c3);
        setTag(2131296351, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f11730c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f11730c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        h4 h4Var = this.f11734r;
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
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, this.f11735s);
            View view = this.f11726a;
            if (view != null && w02 != this.f11729b0) {
                this.f11729b0 = w02;
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
