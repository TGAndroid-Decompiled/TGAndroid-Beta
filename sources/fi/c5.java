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
import c8.ja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xi0;
public abstract class c5 extends FrameLayout implements org.telegram.ui.ActionBar.z5, is {
    public j5 E;
    public b5 F;
    public b5 G;
    public n6 H;
    public int I;
    public boolean J;
    public final xi0 K;
    public final i9 L;
    public final n4 M;
    public final o4 N;
    public final ai.f0 O;
    public final o4 P;
    public final s4 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public boolean W;
    public final View f11595a;
    public long f11596a0;
    public final View f11597b;
    public int f11598b0;
    public final FrameLayout f11599c;
    public final xa d;
    public int f11600e;
    public r4 f11601f;
    public final TextView h;
    public int f11602n;
    public final j4 f11603r;
    public final b f11604s;
    public final int f11605w;
    public final y4 f11606x;
    public final qy f11607y;

    public c5(i9 i9Var, Context context, o4 o4Var, ai.f0 f0Var) {
        super(context);
        this.f11600e = 96;
        this.P = new o4();
        this.N = o4Var;
        this.O = f0Var;
        b bVar = i9Var.E;
        this.f11604s = bVar;
        this.L = i9Var;
        this.f11605w = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
        s4 s4Var = new s4(this, getContext());
        this.Q = s4Var;
        j4 j4Var = new j4(this, context, bVar);
        this.f11603r = j4Var;
        j4Var.setClipToPadding(false);
        this.K = new xi0(j4Var, true);
        qy qyVar = new qy(0, j4Var);
        this.f11607y = qyVar;
        j4Var.setLayoutManager(qyVar);
        j4Var.setNestedScrollingEnabled(true);
        y4 y4Var = new y4(this);
        this.f11606x = y4Var;
        j4Var.setAdapter(y4Var);
        new SparseArray();
        new HashMap();
        addView(j4Var);
        this.d = new xa(j4Var);
        j4Var.setOnScrollListener(new bi.z4(this, 12));
        j4Var.setOnItemClickListener(new i4(0, this, i9Var));
        j4Var.setOnItemLongClickListener(new m4(this, i9Var));
        y4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11599c = frameLayout;
        View view = new View(getContext());
        this.f11595a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = org.telegram.ui.ActionBar.j6.f28922h5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, bVar);
        this.f11598b0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, ja.d(-1, 8.0f, 0, 0.0f, this.f11600e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f11597b = view2;
        org.telegram.ui.ActionBar.q6.h(i7, view2, bVar);
        frameLayout.addView(view2, ja.d(-1, 10.0f, 0, 0.0f, this.f11600e - 17, 0.0f, 0.0f));
        frameLayout.addView(s4Var);
        frameLayout.addView(textView);
        n4 n4Var = new n4(this, getContext(), bVar);
        this.M = n4Var;
        n4Var.setHint(hd.M0(2131745836, null));
        frameLayout.addView(n4Var, ja.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(c5 c5Var) {
        new ug.x0(c5Var.L.f11844f, 14, false).show();
    }

    public static void b(c5 c5Var) {
        b5 b5Var = c5Var.F;
        if (b5Var != null) {
            b5Var.f11565r.remove(c5Var);
        }
        b5 b5Var2 = c5Var.G;
        c5Var.F = b5Var2;
        if (b5Var2 == null) {
            return;
        }
        ArrayList arrayList = b5Var2.f11565r;
        if (!arrayList.contains(c5Var)) {
            arrayList.add(c5Var);
        }
        c5Var.F.e(c5Var.P, c5Var.U, c5Var.T);
        c5Var.f11606x.E();
        c5Var.f11607y.h1(0, (int) (c5Var.getTopOffset() - c5Var.f11603r.getPaddingTop()));
    }

    public static void f(int i7, long j3, TL_stories.StoryItem storyItem) {
        b5 b5Var;
        int i10;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) np.s1(i7).f25299i0.f12339x.f(storyItem.dialogId);
            if (sparseArray == null) {
                b5Var = null;
            } else {
                b5Var = (b5) sparseArray.get(storyItem.f28290id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i10 = 0;
            } else {
                i10 = storyViews.views_count;
            }
            if (b5Var != null && b5Var.f11550a == i10) {
                return;
            }
            if (b5Var != null) {
                b5Var.d();
            }
            b5 b5Var2 = new b5(i7, j3, storyItem);
            b5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = np.s1(i7).f25299i0.f12339x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f28290id, b5Var2);
        }
    }

    public final void c() {
        if (this.F != null && this.f11607y.N0() > this.f11606x.f12546c.size() - 10) {
            this.F.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        hi.d7 d7Var;
        hi.o8 o8Var;
        if (storyView != null) {
            int i7 = this.f11605w;
            if (np.s1(i7).P1().N(storyView) || np.s1(i7).H0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(storyView.user_id));
            j5 j5Var = this.E;
            if (j5Var != null) {
                TL_stories.StoryItem storyItem = j5Var.f11899a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new hi.o8(i7, storyItem.privacy);
                    }
                    return this.E.f11899a.parsedPrivacy.b(a22);
                }
                r6 r6Var = j5Var.f11900b;
                if (r6Var != null && (d7Var = r6Var.f12274c) != null && (o8Var = d7Var.E0) != null) {
                    return o8Var.b(a22);
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
        if (i7 == ns.f25591v5) {
            if (this.E.f11900b != null) {
                int i12 = this.f11605w;
                TL_stories.PeerStories y10 = np.s1(i12).f25299i0.y(m10.i(i12).f24953n);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.f11900b.f12275e)) {
                            j5 j5Var = this.E;
                            j5Var.f11900b = null;
                            j5Var.f11899a = storyItem;
                            g(this.f11596a0, j5Var);
                            return;
                        }
                        i11++;
                    }
                }
            }
        } else if (i7 != ns.f25466a3) {
        } else {
            while (true) {
                j4 j4Var = this.f11603r;
                if (i11 < j4Var.getChildCount()) {
                    View childAt = j4Var.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.l6) && (R = RecyclerView.R(childAt)) >= 0) {
                        y4 y4Var = this.f11606x;
                        if (R < y4Var.f12546c.size()) {
                            org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                            if (d(((t4) y4Var.f12546c.get(R)).f12362b)) {
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
        j4 j4Var;
        int paddingTop;
        View view = null;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            j4Var = this.f11603r;
            if (i10 >= j4Var.getChildCount()) {
                break;
            }
            View childAt = j4Var.getChildAt(i10);
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
            paddingTop = j4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f11599c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            g5 g5Var = (g5) this;
            int intValue = ((Integer) g5Var.getTag()).intValue();
            k5 k5Var = g5Var.f11741c0.f11775e;
            d5 d5Var = k5Var.h;
            if (intValue == k5Var.F.getCurrentItem()) {
                d5Var.setAlpha(Utilities.i(f10 / k5Var.d, 1.0f, 0.0f));
                d5Var.setTranslationY((-(k5Var.d - f10)) / 2.0f);
            }
        }
        this.V.setBounds(-org.telegram.messenger.g0.L(6.0f), paddingTop, org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != j4Var.getPaddingTop()) {
                int i11 = (frameLayout.getTranslationY() > (j4Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (j4Var.getPaddingTop() / 2.0f) ? 0 : -1));
                xa xaVar = this.d;
                if (i11 > 0) {
                    xaVar.w((int) (-(j4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    xaVar.w((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f11603r) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(this.f11600e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(b5 b5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        y4 y4Var = this.f11606x;
        int size = y4Var.f12546c.size();
        o4 o4Var = this.P;
        if (TextUtils.isEmpty(o4Var.f12117c) && !o4Var.f12116b) {
            i();
        }
        y4Var.E();
        this.K.b(size - 1);
        c();
        if (this.H != null) {
            ArrayList arrayList = b5Var.f11556i;
            if (b5Var == this.F && arrayList != null && this.I < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = this.I; i7 < arrayList.size(); i7++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i7);
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

    public final void g(long j3, j5 j5Var) {
        this.f11596a0 = j3;
        this.E = j5Var;
        i();
        h(false);
        if (j5Var != null && j5Var.f11899a != null) {
            at t6 = at.t(this.f11605w);
            int i7 = j5Var.f11899a.f28290id;
            if (j3 == t6.getUserConfig().e()) {
                at.f22558l0.c(new us(t6, i7, 5));
            }
        }
    }

    public float getTopOffset() {
        return this.f11599c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i7;
        o4 o4Var = this.P;
        boolean z11 = o4Var.f12116b;
        s4 s4Var = this.Q;
        if (z11 != s4Var.f12312s || !z10) {
            ValueAnimator valueAnimator = s4Var.f12314x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                s4Var.f12314x.cancel();
            }
            s4Var.f12312s = z11 ? 1 : 0;
            if (!z10) {
                s4Var.f12311r = 1.0f;
                s4Var.invalidate();
            } else {
                s4Var.f12308e.set(s4Var.f12310n);
                s4Var.f12309f = s4Var.f12307c.getAlpha();
                s4Var.h = s4Var.d.getAlpha();
                s4Var.f12311r = 0.0f;
                s4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s4Var.f12314x = ofFloat;
                ofFloat.addUpdateListener(new ah.h(s4Var, 21));
                s4Var.f12314x.addListener(new ai.i0(s4Var, 15));
                s4Var.f12314x.setDuration(250L);
                s4Var.f12314x.setInterpolator(er.f34420f);
                s4Var.f12314x.start();
            }
        }
        boolean z12 = o4Var.f12115a;
        ck0 ck0Var = s4Var.f12313w;
        if (z12) {
            b5 b5Var = this.F;
            if (b5Var != null && b5Var.f11554f) {
                i7 = 2131231923;
            } else {
                i7 = 2131231918;
            }
        } else {
            i7 = 2131231921;
        }
        ck0Var.a(i7, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: fi.c5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        b5 b5Var = this.F;
        if (b5Var != null) {
            ArrayList arrayList = b5Var.f11565r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.f11563p.clear();
        }
        this.f11606x.E();
        int i7 = this.f11605w;
        ns.f(i7).c(this, ns.f25591v5);
        ns.f(i7).c(this, ns.f25466a3);
        setTag(2131296351, new bi.e1(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        b5 b5Var = this.F;
        if (b5Var != null) {
            b5Var.f11565r.remove(this);
        }
        int i7 = this.f11605w;
        ns.f(i7).n(this, ns.f25591v5);
        ns.f(i7).n(this, ns.f25466a3);
        setTag(2131296351, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f11599c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f11599c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        j4 j4Var = this.f11603r;
        if (f10 != j4Var.getPaddingBottom()) {
            j4Var.setPadding(0, (int) f10, 0, 0);
            j4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.f11604s);
            View view = this.f11595a;
            if (view != null && w02 != this.f11598b0) {
                this.f11598b0 = w02;
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
