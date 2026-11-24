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
public abstract class g0a extends FrameLayout implements tjb, gk7 {
    public static final int c0 = 0;
    public m0a E;
    public f0a F;
    public f0a G;
    public a2b H;
    public int I;
    public boolean J;
    public final t29 K;
    public final m8b L;
    public final sz9 M;
    public final tz9 N;
    public final ae9 O;
    public final tz9 P;
    public final xz9 Q;
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
    public final kp d;
    public byte e;
    public wz9 f;
    public final TextView h;
    public int n;
    public final oz9 r;
    public final f53 s;
    public final int w;
    public final c0a x;
    public final wb4 y;

    public g0a(m8b m8bVar, Context context, tz9 tz9Var, ae9 ae9Var) {
        super(context);
        this.e = (byte) 96;
        this.P = new tz9();
        this.N = tz9Var;
        this.O = ae9Var;
        f53 f53Var = m8bVar.E;
        this.s = f53Var;
        this.L = m8bVar;
        this.w = m8bVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        zkb.X(textView, bkb.i5, f53Var);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setPadding(gl.L(21.0f), gl.L(6.0f), gl.L(21.0f), gl.L(8.0f));
        xz9 xz9Var = new xz9(this, getContext());
        this.Q = xz9Var;
        oz9 oz9Var = new oz9(this, context, f53Var);
        this.r = oz9Var;
        oz9Var.setClipToPadding(false);
        this.K = new t29(oz9Var, true);
        wb4 wb4Var = new wb4(0, oz9Var);
        this.y = wb4Var;
        oz9Var.setLayoutManager(wb4Var);
        oz9Var.setNestedScrollingEnabled(true);
        c0a c0aVar = new c0a(this);
        this.x = c0aVar;
        oz9Var.setAdapter(c0aVar);
        addView(oz9Var);
        this.d = new kp(oz9Var);
        oz9Var.setOnScrollListener(new n58(this, (byte) 19));
        oz9Var.setOnItemClickListener(new k0(this, m8bVar, (byte) 21));
        oz9Var.setOnItemLongClickListener(new rz9(this, m8bVar));
        c0aVar.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = bkb.g5;
        int v0 = bkb.v0(i, f53Var);
        this.b0 = v0;
        view.setBackground(new GradientDrawable(orientation, new int[]{v0, 0}));
        frameLayout.addView(view, nme.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        zkb.h(i, f53Var, view2);
        frameLayout.addView(view2, nme.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(xz9Var);
        frameLayout.addView(textView);
        sz9 sz9Var = new sz9(this, getContext(), f53Var);
        this.M = sz9Var;
        sz9Var.setHint(k96.M0(2131745644, null));
        frameLayout.addView(sz9Var, nme.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void d(int i, long j, TL_stories.StoryItem storyItem) {
        f0a f0aVar;
        int i2;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) na7.q1(i).e0.x.f(storyItem.dialogId);
            if (sparseArray == null) {
                f0aVar = null;
            } else {
                f0aVar = (f0a) sparseArray.get(storyItem.id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i2 = 0;
            } else {
                i2 = storyViews.views_count;
            }
            if (f0aVar != null) {
                if (f0aVar.a != i2) {
                    f0aVar.d();
                } else {
                    return;
                }
            }
            f0a f0aVar2 = new f0a(i, j, storyItem);
            f0aVar2.c();
            if (sparseArray == null) {
                vf6 vf6Var = na7.q1(i).e0.x;
                long j2 = storyItem.dialogId;
                sparseArray = new SparseArray();
                vf6Var.k(sparseArray, j2);
            }
            sparseArray.put(storyItem.id, f0aVar2);
        }
    }

    public final void a() {
        if (this.F != null && this.y.M0() > this.x.c.size() - 10) {
            this.F.c();
        }
    }

    public final boolean b(TL_stories.StoryView storyView) {
        f4b f4bVar;
        w5b w5bVar;
        if (storyView != null) {
            int i = this.w;
            if (na7.q1(i).M1().M(storyView) || na7.q1(i).x0.indexOfKey(storyView.user_id) >= 0) {
                return false;
            }
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(storyView.user_id));
            m0a m0aVar = this.E;
            if (m0aVar != null) {
                TL_stories.StoryItem storyItem = m0aVar.a;
                if (storyItem != null) {
                    if (storyItem.parsedPrivacy == null) {
                        storyItem.parsedPrivacy = new w5b(i, storyItem.privacy);
                    }
                    return this.E.a.parsedPrivacy.b(V1);
                }
                f2b f2bVar = m0aVar.b;
                if (f2bVar != null && (f4bVar = f2bVar.c) != null && (w5bVar = f4bVar.E0) != null) {
                    return w5bVar.b(V1);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void c(f0a f0aVar) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        c0a c0aVar = this.x;
        int size = c0aVar.c.size();
        tz9 tz9Var = this.P;
        if (TextUtils.isEmpty(tz9Var.c) && !tz9Var.b) {
            h();
        }
        c0aVar.E();
        this.K.b(size - 1);
        a();
        if (this.H != null) {
            ArrayList arrayList = f0aVar.i;
            if (f0aVar == this.F && this.I < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = this.I; i < arrayList.size(); i++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = cf3.n(tL_storyReactionPublicRepost.peer_id);
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
        if (i == kk7.x5) {
            if (this.E.b != null) {
                int i4 = this.w;
                TL_stories.PeerStories x = na7.q1(i4).e0.x(y6c.h(i4).n);
                if (x != null) {
                    while (i3 < x.stories.size()) {
                        TL_stories.StoryItem storyItem = x.stories.get(i3);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            m0a m0aVar = this.E;
                            m0aVar.b = null;
                            m0aVar.a = storyItem;
                            f(this.a0, m0aVar);
                            return;
                        }
                        i3++;
                    }
                }
            }
        } else if (i != kk7.b3) {
        } else {
            while (true) {
                oz9 oz9Var = this.r;
                if (i3 < oz9Var.getChildCount()) {
                    View childAt = oz9Var.getChildAt(i3);
                    if ((childAt instanceof qz8) && (R = RecyclerView.R(childAt)) >= 0) {
                        c0a c0aVar = this.x;
                        if (R < c0aVar.c.size()) {
                            qz8 qz8Var = (qz8) childAt;
                            if (b(((yz9) c0aVar.c.get(R)).b)) {
                                f = 1.0f;
                            } else {
                                f = 0.5f;
                            }
                            qz8Var.a(true, f);
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
        oz9 oz9Var;
        int paddingTop;
        View view = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            oz9Var = this.r;
            if (i2 >= oz9Var.getChildCount()) {
                break;
            }
            View childAt = oz9Var.getChildAt(i2);
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
            paddingTop = oz9Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.c;
        float f = paddingTop;
        if (frameLayout.getTranslationY() != f) {
            frameLayout.setTranslationY(f);
            j0a j0aVar = (j0a) this;
            int intValue = ((Integer) j0aVar.getTag()).intValue();
            n0a n0aVar = j0aVar.d0.e;
            h0a h0aVar = n0aVar.h;
            if (intValue == n0aVar.F.getCurrentItem()) {
                h0aVar.setAlpha(Utilities.i(f / n0aVar.d, 1.0f, 0.0f));
                h0aVar.setTranslationY((-(n0aVar.d - f)) / 2.0f);
            }
        }
        this.V.setBounds(-gl.L(6.0f), paddingTop, gl.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != oz9Var.getPaddingTop()) {
                int i3 = (frameLayout.getTranslationY() > (oz9Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (oz9Var.getPaddingTop() / 2.0f) ? 0 : -1));
                kp kpVar = this.d;
                if (i3 > 0) {
                    kpVar.y((int) (-(oz9Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    kpVar.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.r) {
            canvas.save();
            canvas.clipRect(0, gl.L(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        f0a f0aVar = this.F;
        if (f0aVar != null) {
            f0aVar.r.remove(this);
        }
        f0a f0aVar2 = this.G;
        this.F = f0aVar2;
        if (f0aVar2 == null) {
            return;
        }
        ArrayList arrayList = f0aVar2.r;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.F.e(this.P, this.U, this.T);
        this.x.E();
        this.y.g1(0, (int) (getTopOffset() - this.r.getPaddingTop()));
    }

    public final void f(long j, m0a m0aVar) {
        this.a0 = j;
        this.E = m0aVar;
        h();
        g(false);
        if (m0aVar != null && m0aVar.a != null) {
            im7 n = im7.n(this.w);
            int i = m0aVar.a.id;
            if (j == n.getUserConfig().e()) {
                im7.l0.c(new cm7(n, i, (byte) 5));
            }
        }
    }

    public final void g(boolean z) {
        int i;
        tz9 tz9Var = this.P;
        boolean z2 = tz9Var.b;
        xz9 xz9Var = this.Q;
        if (z2 != xz9Var.s || !z) {
            ValueAnimator valueAnimator = xz9Var.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                xz9Var.x.cancel();
            }
            xz9Var.s = z2;
            if (!z) {
                xz9Var.r = 1.0f;
                xz9Var.invalidate();
            } else {
                xz9Var.e.set(xz9Var.n);
                xz9Var.f = xz9Var.c.getAlpha();
                xz9Var.h = xz9Var.d.getAlpha();
                xz9Var.r = 0.0f;
                xz9Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xz9Var.x = ofFloat;
                ofFloat.addUpdateListener(new x89(xz9Var, (byte) 20));
                xz9Var.x.addListener(new ng9(xz9Var, (byte) 10));
                xz9Var.x.setDuration(250L);
                xz9Var.x.setInterpolator(s33.f);
                xz9Var.x.start();
            }
        }
        boolean z3 = tz9Var.a;
        l79 l79Var = xz9Var.w;
        if (z3) {
            f0a f0aVar = this.F;
            if (f0aVar != null && f0aVar.f) {
                i = 2131231927;
            } else {
                i = 2131231922;
            }
        } else {
            i = 2131231925;
        }
        l79Var.a(i, z);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0a.h():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        f0a f0aVar = this.F;
        if (f0aVar != null) {
            ArrayList arrayList = f0aVar.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i = this.w;
        kk7.f(i).b(this, kk7.x5);
        kk7.f(i).b(this, kk7.b3);
        setTag(2131296353, new s10(this, (byte) 17));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        f0a f0aVar = this.F;
        if (f0aVar != null) {
            f0aVar.r.remove(this);
        }
        int i = this.w;
        kk7.f(i).n(this, kk7.x5);
        kk7.f(i).n(this, kk7.b3);
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
        oz9 oz9Var = this.r;
        if (f != oz9Var.getPaddingBottom()) {
            oz9Var.setPadding(0, (int) f, 0, 0);
            oz9Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int v0 = bkb.v0(bkb.g5, this.s);
            View view = this.a;
            if (view != null && v0 != this.b0) {
                this.b0 = v0;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v0, 0}));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
