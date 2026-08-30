package nh;

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
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zk0;
public abstract class d5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public c5 B;
    public c5 C;
    public o6 D;
    public int E;
    public boolean F;
    public final zk0 G;
    public final i9 H;
    public final o4 I;
    public final p4 J;
    public final mg.i K;
    public final p4 L;
    public final t4 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Drawable R;
    public boolean S;
    public long T;
    public final View f15265a;
    public final View f15266b;
    public final FrameLayout f15267c;
    public final b4.e0 d;
    public int e;
    public s4 f15268f;
    public final TextView h;
    public int f15269n;
    public final j4 f15270r;
    public final b f15271s;
    public final int v;
    public final z4 f15272w;
    public final pz f15273x;
    public l5 f15274y;

    public d5(i9 i9Var, Context context, p4 p4Var, mg.i iVar) {
        super(context);
        this.e = 96;
        this.L = new p4();
        this.J = p4Var;
        this.K = iVar;
        b bVar = i9Var.f15499y;
        this.f15271s = bVar;
        this.H = i9Var;
        this.v = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        t4 t4Var = new t4(this, getContext());
        this.M = t4Var;
        j4 j4Var = new j4(this, context, bVar);
        this.f15270r = j4Var;
        j4Var.setClipToPadding(false);
        this.G = new zk0(j4Var, true);
        pz pzVar = new pz(j4Var, 0);
        this.f15273x = pzVar;
        j4Var.setLayoutManager(pzVar);
        j4Var.setNestedScrollingEnabled(true);
        z4 z4Var = new z4(this);
        this.f15272w = z4Var;
        j4Var.setAdapter(z4Var);
        new SparseArray();
        new HashMap();
        addView(j4Var);
        this.d = new b4.e0(j4Var);
        j4Var.setOnScrollListener(new eg.f2(this, 12));
        j4Var.setOnItemClickListener(new gg.v0(2, this, i9Var));
        j4Var.setOnItemLongClickListener(new m4(this, i9Var));
        z4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15267c = frameLayout;
        View view = new View(getContext());
        this.f15265a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.j6.f19977h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i10, bVar), 0}));
        frameLayout.addView(view, k7.b6.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f15266b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        frameLayout.addView(view2, k7.b6.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(t4Var);
        frameLayout.addView(textView);
        o4 o4Var = new o4(this, getContext(), bVar);
        this.I = o4Var;
        o4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(o4Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(d5 d5Var) {
        new eg.o1(d5Var.H.f15461f, 14, false).show();
    }

    public static void b(d5 d5Var) {
        c5 c5Var = d5Var.B;
        if (c5Var != null) {
            c5Var.f15160r.remove(d5Var);
        }
        c5 c5Var2 = d5Var.C;
        d5Var.B = c5Var2;
        if (c5Var2 == null) {
            return;
        }
        ArrayList arrayList = c5Var2.f15160r;
        if (!arrayList.contains(d5Var)) {
            arrayList.add(d5Var);
        }
        d5Var.B.e(d5Var.L, d5Var.Q, d5Var.P);
        d5Var.f15272w.E();
        d5Var.f15273x.h1(0, (int) (d5Var.getTopOffset() - d5Var.f15270r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        c5 c5Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f15936x.f(storyItem.dialogId);
            if (sparseArray == null) {
                c5Var = null;
            } else {
                c5Var = (c5) sparseArray.get(storyItem.f19419id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (c5Var != null && c5Var.f15146a == i11) {
                return;
            }
            if (c5Var != null) {
                c5Var.d();
            }
            c5 c5Var2 = new c5(i10, j10, storyItem);
            c5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.f15936x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f19419id, c5Var2);
        }
    }

    public final void c() {
        if (this.B != null && this.f15273x.N0() > this.f15272w.f16119c.size() - 10) {
            this.B.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        ph.u6 u6Var;
        ph.d8 d8Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        l5 l5Var = this.f15274y;
        if (l5Var != null) {
            TL_stories.StoryItem storyItem = l5Var.f15573a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new ph.d8(i10, storyItem.privacy);
                }
                return this.f15274y.f15573a.parsedPrivacy.b(user);
            }
            s6 s6Var = l5Var.f15574b;
            if (s6Var != null && (u6Var = s6Var.f15883c) != null && (d8Var = u6Var.E0) != null) {
                return d8Var.b(user);
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int R;
        float f10;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.f15274y.f15574b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y10 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y10 != null) {
                    while (i12 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f15274y.f15574b.e)) {
                            l5 l5Var = this.f15274y;
                            l5Var.f15574b = null;
                            l5Var.f15573a = storyItem;
                            g(this.T, l5Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                j4 j4Var = this.f15270r;
                if (i12 < j4Var.getChildCount()) {
                    View childAt = j4Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                        z4 z4Var = this.f15272w;
                        if (R < z4Var.f16119c.size()) {
                            org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                            if (d(((u4) z4Var.f16119c.get(R)).f15960b)) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            n6Var.a(f10, true);
                        }
                    }
                    i12++;
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
        int i10 = 0;
        int i11 = -1;
        while (true) {
            j4Var = this.f15270r;
            if (i10 >= j4Var.getChildCount()) {
                break;
            }
            View childAt = j4Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i11 || i11 == -1) {
                view = childAt;
                i11 = S;
            }
            i10++;
        }
        if (i11 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i11 > 0) {
            paddingTop = 0;
        } else {
            paddingTop = j4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f15267c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            i5 i5Var = (i5) this;
            int intValue = ((Integer) i5Var.getTag()).intValue();
            m5 m5Var = i5Var.U.e;
            f5 f5Var = m5Var.h;
            if (intValue == m5Var.B.getCurrentItem()) {
                f5Var.setAlpha(Utilities.clamp(f10 / m5Var.d, 1.0f, 0.0f));
                f5Var.setTranslationY((-(m5Var.d - f10)) / 2.0f);
            }
        }
        this.R.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.R.draw(canvas);
        if (this.S) {
            this.S = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != j4Var.getPaddingTop()) {
                b4.e0 e0Var = this.d;
                if (frameLayout.getTranslationY() > j4Var.getPaddingTop() / 2.0f) {
                    e0Var.x((int) (-(j4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    e0Var.x((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f15270r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(c5 c5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        z4 z4Var = this.f15272w;
        int size = z4Var.f16119c.size();
        p4 p4Var = this.L;
        if (TextUtils.isEmpty(p4Var.f15748c) && !p4Var.f15747b) {
            i();
        }
        z4Var.E();
        this.G.b(size - 1);
        c();
        if (this.D != null) {
            ArrayList arrayList = c5Var.f15151i;
            if (c5Var == this.B && arrayList != null && this.E < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = this.E; i10 < arrayList.size(); i10++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                        arrayList2.add(storyItem);
                    }
                }
                this.E = arrayList.size();
                if (!arrayList2.isEmpty()) {
                    this.D.F(arrayList2);
                }
            }
        }
    }

    public final void g(long j10, l5 l5Var) {
        this.T = j10;
        this.f15274y = l5Var;
        i();
        h(false);
        if (l5Var != null && l5Var.f15573a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, l5Var.f15573a.f19419id);
        }
    }

    public float getTopOffset() {
        return this.f15267c.getTranslationY();
    }

    public final void h(boolean z4) {
        int i10;
        p4 p4Var = this.L;
        boolean z10 = p4Var.f15747b;
        t4 t4Var = this.M;
        if (z10 != t4Var.f15911s || !z4) {
            ValueAnimator valueAnimator = t4Var.f15912w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                t4Var.f15912w.cancel();
            }
            t4Var.f15911s = z10 ? 1 : 0;
            if (!z4) {
                t4Var.f15910r = 1.0f;
                t4Var.invalidate();
            } else {
                t4Var.e.set(t4Var.f15909n);
                t4Var.f15908f = t4Var.f15907c.getAlpha();
                t4Var.h = t4Var.d.getAlpha();
                t4Var.f15910r = 0.0f;
                t4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                t4Var.f15912w = ofFloat;
                ofFloat.addUpdateListener(new dg.o1(t4Var, 29));
                t4Var.f15912w.addListener(new cg.l0(t4Var, 23));
                t4Var.f15912w.setDuration(250L);
                t4Var.f15912w.setInterpolator(nr.f27346f);
                t4Var.f15912w.start();
            }
        }
        boolean z11 = p4Var.f15746a;
        yl0 yl0Var = t4Var.v;
        if (z11) {
            c5 c5Var = this.B;
            if (c5Var != null && c5Var.f15149f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        yl0Var.a(i10, z4);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: nh.d5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        c5 c5Var = this.B;
        if (c5Var != null) {
            ArrayList arrayList = c5Var.f15160r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.B.f15158p.clear();
        }
        this.f15272w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ic.a(this, new kh.t0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        c5 c5Var = this.B;
        if (c5Var != null) {
            c5Var.f15160r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ic.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f15267c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f15267c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        j4 j4Var = this.f15270r;
        if (f10 != j4Var.getPaddingBottom()) {
            j4Var.setPadding(0, (int) f10, 0, 0);
            j4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.R = drawable;
    }
}
