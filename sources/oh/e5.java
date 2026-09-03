package oh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zk0;
public abstract class e5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public d5 B;
    public d5 C;
    public o6 D;
    public int E;
    public boolean F;
    public final zk0 G;
    public final i9 H;
    public final p4 I;
    public final q4 J;
    public final ng.i K;
    public final q4 L;
    public final u4 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Drawable R;
    public boolean S;
    public long T;
    public final View f17027a;
    public final View f17028b;
    public final FrameLayout f17029c;
    public final b4.e0 d;
    public int f17030e;
    public t4 f17031f;
    public final TextView h;
    public int f17032n;
    public final l4 f17033r;
    public final b f17034s;
    public final int v;
    public final a5 f17035w;
    public final rz f17036x;
    public m5 f17037y;

    public e5(i9 i9Var, Context context, q4 q4Var, ng.i iVar) {
        super(context);
        this.f17030e = 96;
        this.L = new q4();
        this.J = q4Var;
        this.K = iVar;
        b bVar = i9Var.f17306y;
        this.f17034s = bVar;
        this.H = i9Var;
        this.v = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        u4 u4Var = new u4(this, getContext());
        this.M = u4Var;
        l4 l4Var = new l4(this, context, bVar);
        this.f17033r = l4Var;
        l4Var.setClipToPadding(false);
        this.G = new zk0(l4Var, true);
        rz rzVar = new rz(l4Var, 0);
        this.f17036x = rzVar;
        l4Var.setLayoutManager(rzVar);
        l4Var.setNestedScrollingEnabled(true);
        a5 a5Var = new a5(this);
        this.f17035w = a5Var;
        l4Var.setAdapter(a5Var);
        new SparseArray();
        new HashMap();
        addView(l4Var);
        this.d = new b4.e0(l4Var);
        l4Var.setOnScrollListener(new fg.e2(this, 12));
        l4Var.setOnItemClickListener(new hg.v0(2, this, i9Var));
        l4Var.setOnItemLongClickListener(new o4(this, i9Var));
        a5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f17029c = frameLayout;
        View view = new View(getContext());
        this.f17027a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.k6.f21733h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.v0(i10, bVar), 0}));
        frameLayout.addView(view, k7.c6.d(-1, 8.0f, 0, 0.0f, this.f17030e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f17028b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i10, bVar));
        frameLayout.addView(view2, k7.c6.d(-1, 10.0f, 0, 0.0f, this.f17030e - 17, 0.0f, 0.0f));
        frameLayout.addView(u4Var);
        frameLayout.addView(textView);
        p4 p4Var = new p4(this, getContext(), bVar);
        this.I = p4Var;
        p4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(p4Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(e5 e5Var) {
        new fg.n1(e5Var.H.f17268f, 14, false).show();
    }

    public static void b(e5 e5Var) {
        d5 d5Var = e5Var.B;
        if (d5Var != null) {
            d5Var.f16987r.remove(e5Var);
        }
        d5 d5Var2 = e5Var.C;
        e5Var.B = d5Var2;
        if (d5Var2 == null) {
            return;
        }
        ArrayList arrayList = d5Var2.f16987r;
        if (!arrayList.contains(e5Var)) {
            arrayList.add(e5Var);
        }
        e5Var.B.e(e5Var.L, e5Var.Q, e5Var.P);
        e5Var.f17035w.E();
        e5Var.f17036x.h1(0, (int) (e5Var.getTopOffset() - e5Var.f17033r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        d5 d5Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f17792x.f(storyItem.dialogId);
            if (sparseArray == null) {
                d5Var = null;
            } else {
                d5Var = (d5) sparseArray.get(storyItem.f21082id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (d5Var != null && d5Var.f16972a == i11) {
                return;
            }
            if (d5Var != null) {
                d5Var.d();
            }
            d5 d5Var2 = new d5(i10, j10, storyItem);
            d5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.f17792x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f21082id, d5Var2);
        }
    }

    public final void c() {
        if (this.B != null && this.f17036x.N0() > this.f17035w.f16844c.size() - 10) {
            this.B.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        qh.r6 r6Var;
        qh.a8 a8Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        m5 m5Var = this.f17037y;
        if (m5Var != null) {
            TL_stories.StoryItem storyItem = m5Var.f17439a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new qh.a8(i10, storyItem.privacy);
                }
                return this.f17037y.f17439a.parsedPrivacy.b(user);
            }
            s6 s6Var = m5Var.f17440b;
            if (s6Var != null && (r6Var = s6Var.f17739c) != null && (a8Var = r6Var.E0) != null) {
                return a8Var.b(user);
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
            if (this.f17037y.f17440b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y10 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y10 != null) {
                    while (i12 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f17037y.f17440b.f17740e)) {
                            m5 m5Var = this.f17037y;
                            m5Var.f17440b = null;
                            m5Var.f17439a = storyItem;
                            g(this.T, m5Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                l4 l4Var = this.f17033r;
                if (i12 < l4Var.getChildCount()) {
                    View childAt = l4Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                        a5 a5Var = this.f17035w;
                        if (R < a5Var.f16844c.size()) {
                            org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                            if (d(((v4) a5Var.f16844c.get(R)).f17850b)) {
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
        l4 l4Var;
        int paddingTop;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            l4Var = this.f17033r;
            if (i10 >= l4Var.getChildCount()) {
                break;
            }
            View childAt = l4Var.getChildAt(i10);
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
            paddingTop = l4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f17029c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            j5 j5Var = (j5) this;
            int intValue = ((Integer) j5Var.getTag()).intValue();
            n5 n5Var = j5Var.U.f17364e;
            g5 g5Var = n5Var.h;
            if (intValue == n5Var.B.getCurrentItem()) {
                g5Var.setAlpha(Utilities.clamp(f10 / n5Var.d, 1.0f, 0.0f));
                g5Var.setTranslationY((-(n5Var.d - f10)) / 2.0f);
            }
        }
        this.R.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.R.draw(canvas);
        if (this.S) {
            this.S = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != l4Var.getPaddingTop()) {
                b4.e0 e0Var = this.d;
                if (frameLayout.getTranslationY() > l4Var.getPaddingTop() / 2.0f) {
                    e0Var.y((int) (-(l4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    e0Var.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f17033r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.f17030e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(d5 d5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        a5 a5Var = this.f17035w;
        int size = a5Var.f16844c.size();
        q4 q4Var = this.L;
        if (TextUtils.isEmpty(q4Var.f17659c) && !q4Var.f17658b) {
            i();
        }
        a5Var.E();
        this.G.b(size - 1);
        c();
        if (this.D != null) {
            ArrayList arrayList = d5Var.f16978i;
            if (d5Var == this.B && arrayList != null && this.E < arrayList.size()) {
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

    public final void g(long j10, m5 m5Var) {
        this.T = j10;
        this.f17037y = m5Var;
        i();
        h(false);
        if (m5Var != null && m5Var.f17439a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, m5Var.f17439a.f21082id);
        }
    }

    public float getTopOffset() {
        return this.f17029c.getTranslationY();
    }

    public final void h(boolean z4) {
        int i10;
        q4 q4Var = this.L;
        boolean z10 = q4Var.f17658b;
        u4 u4Var = this.M;
        if (z10 != u4Var.f17818s || !z4) {
            ValueAnimator valueAnimator = u4Var.f17819w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                u4Var.f17819w.cancel();
            }
            u4Var.f17818s = z10 ? 1 : 0;
            if (!z4) {
                u4Var.f17817r = 1.0f;
                u4Var.invalidate();
            } else {
                u4Var.f17814e.set(u4Var.f17816n);
                u4Var.f17815f = u4Var.f17813c.getAlpha();
                u4Var.h = u4Var.d.getAlpha();
                u4Var.f17817r = 0.0f;
                u4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                u4Var.f17819w = ofFloat;
                ofFloat.addUpdateListener(new eg.m1(u4Var, 29));
                u4Var.f17819w.addListener(new dg.l0(u4Var, 23));
                u4Var.f17819w.setDuration(250L);
                u4Var.f17819w.setInterpolator(pr.f30168f);
                u4Var.f17819w.start();
            }
        }
        boolean z11 = q4Var.f17657a;
        yl0 yl0Var = u4Var.v;
        if (z11) {
            d5 d5Var = this.B;
            if (d5Var != null && d5Var.f16976f) {
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
        throw new UnsupportedOperationException("Method not decompiled: oh.e5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        d5 d5Var = this.B;
        if (d5Var != null) {
            ArrayList arrayList = d5Var.f16987r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.B.f16985p.clear();
        }
        this.f17035w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ic.a(this, new lh.t0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        d5 d5Var = this.B;
        if (d5Var != null) {
            d5Var.f16987r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ic.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f17029c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f17029c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        l4 l4Var = this.f17033r;
        if (f10 != l4Var.getPaddingBottom()) {
            l4Var.setPadding(0, (int) f10, 0, 0);
            l4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.R = drawable;
    }
}
