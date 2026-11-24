package defpackage;

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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public abstract class i2a extends FrameLayout implements vlb, jm7 {
    public static final int c0 = 0;
    public o2a E;
    public h2a F;
    public h2a G;
    public b4b H;
    public int I;
    public boolean J;
    public final w49 K;
    public final oab L;
    public final u1a M;
    public final v1a N;
    public final eg9 O;
    public final v1a P;
    public final z1a Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public boolean W;
    public final View a;
    public long a0;
    public final View b;
    public int b0;
    public final FrameLayout c;
    public final kq d;
    public byte e;
    public y1a f;
    public final TextView h;
    public int n;
    public final q1a r;
    public final r63 s;
    public final int w;
    public final e2a x;
    public final wd4 y;

    public i2a(oab oabVar, Context context, v1a v1aVar, eg9 eg9Var) {
        super(context);
        this.e = (byte) 96;
        this.P = new v1a();
        this.N = v1aVar;
        this.O = eg9Var;
        r63 r63Var = oabVar.E;
        this.s = r63Var;
        this.L = oabVar;
        this.w = oabVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        anb.X(textView, cmb.i5, r63Var);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setPadding(gm.L(21.0f), gm.L(6.0f), gm.L(21.0f), gm.L(8.0f));
        z1a z1aVar = new z1a(this, getContext());
        this.Q = z1aVar;
        q1a q1aVar = new q1a(this, context, r63Var);
        this.r = q1aVar;
        q1aVar.setClipToPadding(false);
        this.K = new w49(q1aVar, true);
        wd4 wd4Var = new wd4(0, q1aVar);
        this.y = wd4Var;
        q1aVar.setLayoutManager(wd4Var);
        q1aVar.setNestedScrollingEnabled(true);
        e2a e2aVar = new e2a(this);
        this.x = e2aVar;
        q1aVar.setAdapter(e2aVar);
        addView(q1aVar);
        this.d = new kq(q1aVar);
        q1aVar.setOnScrollListener(new so7(this, (byte) 20));
        q1aVar.setOnItemClickListener(new k0(this, oabVar, (byte) 21));
        q1aVar.setOnItemLongClickListener(new t1a(this, oabVar));
        e2aVar.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = cmb.g5;
        int v0 = cmb.v0(i, r63Var);
        this.b0 = v0;
        view.setBackground(new GradientDrawable(orientation, new int[]{v0, 0}));
        frameLayout.addView(view, qoe.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        anb.h(i, r63Var, view2);
        frameLayout.addView(view2, qoe.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(z1aVar);
        frameLayout.addView(textView);
        u1a u1aVar = new u1a(this, getContext(), r63Var);
        this.M = u1aVar;
        u1aVar.setHint(jb6.M0(2131745570, null));
        frameLayout.addView(u1aVar, qoe.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void d(int i, long j, TL_stories.StoryItem storyItem) {
        h2a h2aVar;
        int i2;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) oc7.r1(i).e0.x.f(storyItem.dialogId);
            if (sparseArray == null) {
                h2aVar = null;
            } else {
                h2aVar = (h2a) sparseArray.get(storyItem.id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i2 = 0;
            } else {
                i2 = storyViews.views_count;
            }
            if (h2aVar != null) {
                if (h2aVar.a != i2) {
                    h2aVar.d();
                } else {
                    return;
                }
            }
            h2a h2aVar2 = new h2a(i, j, storyItem);
            h2aVar2.c();
            if (sparseArray == null) {
                vh6 vh6Var = oc7.r1(i).e0.x;
                long j2 = storyItem.dialogId;
                sparseArray = new SparseArray();
                vh6Var.k(sparseArray, j2);
            }
            sparseArray.put(storyItem.id, h2aVar2);
        }
    }

    public final void a() {
        if (this.F != null && this.y.M0() > this.x.c.size() - 10) {
            this.F.c();
        }
    }

    public final boolean b(TL_stories.StoryView storyView) {
        g6b g6bVar;
        y7b y7bVar;
        if (storyView != null) {
            int i = this.w;
            if (oc7.r1(i).N1().M(storyView) || oc7.r1(i).x0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(storyView.user_id));
            o2a o2aVar = this.E;
            if (o2aVar != null) {
                TL_stories.StoryItem storyItem = o2aVar.a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new y7b(i, storyItem.privacy);
                    }
                    return this.E.a.parsedPrivacy.b(W1);
                }
                g4b g4bVar = o2aVar.b;
                if (g4bVar != null && (g6bVar = g4bVar.c) != null && (y7bVar = g6bVar.E0) != null) {
                    return y7bVar.b(W1);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void c(h2a h2aVar) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        e2a e2aVar = this.x;
        int size = e2aVar.c.size();
        v1a v1aVar = this.P;
        if (TextUtils.isEmpty(v1aVar.c) && !v1aVar.b) {
            h();
        }
        e2aVar.E();
        this.K.b(size - 1);
        a();
        if (this.H != null) {
            ArrayList arrayList = h2aVar.i;
            if (h2aVar == this.F && this.I < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = this.I; i < arrayList.size(); i++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = pg3.n(tL_storyReactionPublicRepost.peer_id);
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int R;
        float f;
        int i3 = 0;
        if (i == nm7.z5) {
            if (this.E.b != null) {
                int i4 = this.w;
                TL_stories.PeerStories x = oc7.r1(i4).e0.x(z8c.h(i4).n);
                if (x != null) {
                    while (i3 < x.stories.size()) {
                        TL_stories.StoryItem storyItem = x.stories.get(i3);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            o2a o2aVar = this.E;
                            o2aVar.b = null;
                            o2aVar.a = storyItem;
                            f(this.a0, o2aVar);
                            return;
                        }
                        i3++;
                    }
                }
            }
        } else if (i != nm7.c3) {
        } else {
            while (true) {
                q1a q1aVar = this.r;
                if (i3 < q1aVar.getChildCount()) {
                    View childAt = q1aVar.getChildAt(i3);
                    if ((childAt instanceof r19) && (R = RecyclerView.R(childAt)) >= 0) {
                        e2a e2aVar = this.x;
                        if (R < e2aVar.c.size()) {
                            r19 r19Var = (r19) childAt;
                            if (b(((a2a) e2aVar.c.get(R)).b)) {
                                f = 1.0f;
                            } else {
                                f = 0.5f;
                            }
                            r19Var.a(true, f);
                        }
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q1a q1aVar;
        int paddingTop;
        View view = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            q1aVar = this.r;
            if (i2 >= q1aVar.getChildCount()) {
                break;
            }
            View childAt = q1aVar.getChildAt(i2);
            int S = RecyclerView.S(childAt);
            if (S < i || i == -1) {
                view = childAt;
                i = S;
            }
            i2++;
        }
        if (i == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i > 0) {
            paddingTop = 0;
        } else {
            paddingTop = q1aVar.getPaddingTop();
        }
        FrameLayout frameLayout = this.c;
        float f = paddingTop;
        if (frameLayout.getTranslationY() != f) {
            frameLayout.setTranslationY(f);
            l2a l2aVar = (l2a) this;
            int intValue = ((Integer) l2aVar.getTag()).intValue();
            p2a p2aVar = l2aVar.d0.e;
            j2a j2aVar = p2aVar.h;
            if (intValue == p2aVar.F.getCurrentItem()) {
                j2aVar.setAlpha(Utilities.i(f / p2aVar.d, 1.0f, 0.0f));
                j2aVar.setTranslationY((-(p2aVar.d - f)) / 2.0f);
            }
        }
        this.V.setBounds(-gm.L(6.0f), paddingTop, gm.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != q1aVar.getPaddingTop()) {
                int i3 = (frameLayout.getTranslationY() > (q1aVar.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (q1aVar.getPaddingTop() / 2.0f) ? 0 : -1));
                kq kqVar = this.d;
                if (i3 > 0) {
                    kqVar.y((int) (-(q1aVar.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    kqVar.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.r) {
            canvas.save();
            canvas.clipRect(0, gm.L(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        h2a h2aVar = this.F;
        if (h2aVar != null) {
            h2aVar.r.remove(this);
        }
        h2a h2aVar2 = this.G;
        this.F = h2aVar2;
        if (h2aVar2 == null) {
            return;
        }
        ArrayList arrayList = h2aVar2.r;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.F.e(this.P, this.U, this.T);
        this.x.E();
        this.y.g1(0, (int) (getTopOffset() - this.r.getPaddingTop()));
    }

    public final void f(long j, o2a o2aVar) {
        this.a0 = j;
        this.E = o2aVar;
        h();
        g(false);
        if (o2aVar != null && o2aVar.a != null) {
            lo7 n = lo7.n(this.w);
            int i = o2aVar.a.id;
            if (j == n.getUserConfig().e()) {
                lo7.l0.c(new fo7(n, i, (byte) 5));
            }
        }
    }

    public final void g(boolean z) {
        int i;
        v1a v1aVar = this.P;
        boolean z2 = v1aVar.b;
        z1a z1aVar = this.Q;
        if (z2 != z1aVar.s || !z) {
            ValueAnimator valueAnimator = z1aVar.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                z1aVar.x.cancel();
            }
            z1aVar.s = z2;
            if (!z) {
                z1aVar.r = 1.0f;
                z1aVar.invalidate();
            } else {
                z1aVar.e.set(z1aVar.n);
                z1aVar.f = z1aVar.c.getAlpha();
                z1aVar.h = z1aVar.d.getAlpha();
                z1aVar.r = 0.0f;
                z1aVar.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z1aVar.x = ofFloat;
                ofFloat.addUpdateListener(new p29(z1aVar, (byte) 22));
                z1aVar.x.addListener(new c39(z1aVar, (byte) 12));
                z1aVar.x.setDuration(250L);
                z1aVar.x.setInterpolator(d53.f);
                z1aVar.x.start();
            }
        }
        boolean z3 = v1aVar.a;
        n99 n99Var = z1aVar.w;
        if (z3) {
            h2a h2aVar = this.F;
            if (h2aVar != null && h2aVar.f) {
                i = 2131231928;
            } else {
                i = 2131231923;
            }
        } else {
            i = 2131231926;
        }
        n99Var.a(i, z);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2a.h():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        h2a h2aVar = this.F;
        if (h2aVar != null) {
            ArrayList arrayList = h2aVar.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i = this.w;
        nm7.f(i).b(this, nm7.z5);
        nm7.f(i).b(this, nm7.c3);
        setTag(2131296353, new s20(this, (byte) 17));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        h2a h2aVar = this.F;
        if (h2aVar != null) {
            h2aVar.r.remove(this);
        }
        int i = this.w;
        nm7.f(i).n(this, nm7.z5);
        nm7.f(i).n(this, nm7.c3);
        setTag(2131296353, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f) {
        q1a q1aVar = this.r;
        if (f != q1aVar.getPaddingBottom()) {
            q1aVar.setPadding(0, (int) f, 0, 0);
            q1aVar.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int v0 = cmb.v0(cmb.g5, this.s);
            View view = this.a;
            if (view != null && v0 != this.b0) {
                this.b0 = v0;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v0, 0}));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
