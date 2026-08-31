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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.zl0;
public abstract class e5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public d5 B;
    public d5 C;
    public o6 D;
    public int E;
    public boolean F;
    public final al0 G;
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
    public final View f17025a;
    public final View f17026b;
    public final FrameLayout f17027c;
    public final b4.e0 d;
    public int f17028e;
    public t4 f17029f;
    public final TextView h;
    public int f17030n;
    public final l4 f17031r;
    public final b f17032s;
    public final int v;
    public final a5 f17033w;
    public final rz f17034x;
    public m5 f17035y;

    public e5(i9 i9Var, Context context, q4 q4Var, ng.i iVar) {
        super(context);
        this.f17028e = 96;
        this.L = new q4();
        this.J = q4Var;
        this.K = iVar;
        b bVar = i9Var.f17304y;
        this.f17032s = bVar;
        this.H = i9Var;
        this.v = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        u4 u4Var = new u4(this, getContext());
        this.M = u4Var;
        l4 l4Var = new l4(this, context, bVar);
        this.f17031r = l4Var;
        l4Var.setClipToPadding(false);
        this.G = new al0(l4Var, true);
        rz rzVar = new rz(l4Var, 0);
        this.f17034x = rzVar;
        l4Var.setLayoutManager(rzVar);
        l4Var.setNestedScrollingEnabled(true);
        a5 a5Var = new a5(this);
        this.f17033w = a5Var;
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
        this.f17027c = frameLayout;
        View view = new View(getContext());
        this.f17025a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.k6.f21731h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.v0(i10, bVar), 0}));
        frameLayout.addView(view, k7.c6.d(-1, 8.0f, 0, 0.0f, this.f17028e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f17026b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i10, bVar));
        frameLayout.addView(view2, k7.c6.d(-1, 10.0f, 0, 0.0f, this.f17028e - 17, 0.0f, 0.0f));
        frameLayout.addView(u4Var);
        frameLayout.addView(textView);
        p4 p4Var = new p4(this, getContext(), bVar);
        this.I = p4Var;
        p4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(p4Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(e5 e5Var) {
        new fg.n1(e5Var.H.f17266f, 14, false).show();
    }

    public static void b(e5 e5Var) {
        d5 d5Var = e5Var.B;
        if (d5Var != null) {
            d5Var.f16985r.remove(e5Var);
        }
        d5 d5Var2 = e5Var.C;
        e5Var.B = d5Var2;
        if (d5Var2 == null) {
            return;
        }
        ArrayList arrayList = d5Var2.f16985r;
        if (!arrayList.contains(e5Var)) {
            arrayList.add(e5Var);
        }
        e5Var.B.e(e5Var.L, e5Var.Q, e5Var.P);
        e5Var.f17033w.E();
        e5Var.f17034x.h1(0, (int) (e5Var.getTopOffset() - e5Var.f17031r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        d5 d5Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f17790x.f(storyItem.dialogId);
            if (sparseArray == null) {
                d5Var = null;
            } else {
                d5Var = (d5) sparseArray.get(storyItem.f21080id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (d5Var != null && d5Var.f16970a == i11) {
                return;
            }
            if (d5Var != null) {
                d5Var.d();
            }
            d5 d5Var2 = new d5(i10, j10, storyItem);
            d5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.f17790x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f21080id, d5Var2);
        }
    }

    public final void c() {
        if (this.B != null && this.f17034x.N0() > this.f17033w.f16842c.size() - 10) {
            this.B.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        qh.s6 s6Var;
        qh.b8 b8Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        m5 m5Var = this.f17035y;
        if (m5Var != null) {
            TL_stories.StoryItem storyItem = m5Var.f17437a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new qh.b8(i10, storyItem.privacy);
                }
                return this.f17035y.f17437a.parsedPrivacy.b(user);
            }
            s6 s6Var2 = m5Var.f17438b;
            if (s6Var2 != null && (s6Var = s6Var2.f17737c) != null && (b8Var = s6Var.E0) != null) {
                return b8Var.b(user);
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
            if (this.f17035y.f17438b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y10 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y10 != null) {
                    while (i12 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f17035y.f17438b.f17738e)) {
                            m5 m5Var = this.f17035y;
                            m5Var.f17438b = null;
                            m5Var.f17437a = storyItem;
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
                l4 l4Var = this.f17031r;
                if (i12 < l4Var.getChildCount()) {
                    View childAt = l4Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                        a5 a5Var = this.f17033w;
                        if (R < a5Var.f16842c.size()) {
                            org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                            if (d(((v4) a5Var.f16842c.get(R)).f17848b)) {
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
            l4Var = this.f17031r;
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
        FrameLayout frameLayout = this.f17027c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            j5 j5Var = (j5) this;
            int intValue = ((Integer) j5Var.getTag()).intValue();
            n5 n5Var = j5Var.U.f17362e;
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
        if (view == this.f17031r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.f17028e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(d5 d5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        a5 a5Var = this.f17033w;
        int size = a5Var.f16842c.size();
        q4 q4Var = this.L;
        if (TextUtils.isEmpty(q4Var.f17657c) && !q4Var.f17656b) {
            i();
        }
        a5Var.E();
        this.G.b(size - 1);
        c();
        if (this.D != null) {
            ArrayList arrayList = d5Var.f16976i;
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
        this.f17035y = m5Var;
        i();
        h(false);
        if (m5Var != null && m5Var.f17437a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, m5Var.f17437a.f21080id);
        }
    }

    public float getTopOffset() {
        return this.f17027c.getTranslationY();
    }

    public final void h(boolean z4) {
        int i10;
        q4 q4Var = this.L;
        boolean z10 = q4Var.f17656b;
        u4 u4Var = this.M;
        if (z10 != u4Var.f17816s || !z4) {
            ValueAnimator valueAnimator = u4Var.f17817w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                u4Var.f17817w.cancel();
            }
            u4Var.f17816s = z10 ? 1 : 0;
            if (!z4) {
                u4Var.f17815r = 1.0f;
                u4Var.invalidate();
            } else {
                u4Var.f17812e.set(u4Var.f17814n);
                u4Var.f17813f = u4Var.f17811c.getAlpha();
                u4Var.h = u4Var.d.getAlpha();
                u4Var.f17815r = 0.0f;
                u4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                u4Var.f17817w = ofFloat;
                ofFloat.addUpdateListener(new eg.m1(u4Var, 29));
                u4Var.f17817w.addListener(new dg.l0(u4Var, 23));
                u4Var.f17817w.setDuration(250L);
                u4Var.f17817w.setInterpolator(pr.f30183f);
                u4Var.f17817w.start();
            }
        }
        boolean z11 = q4Var.f17655a;
        zl0 zl0Var = u4Var.v;
        if (z11) {
            d5 d5Var = this.B;
            if (d5Var != null && d5Var.f16974f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        zl0Var.a(i10, z4);
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
            ArrayList arrayList = d5Var.f16985r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.B.f16983p.clear();
        }
        this.f17033w.E();
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
            d5Var.f16985r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ic.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f17027c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f17027c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        l4 l4Var = this.f17031r;
        if (f10 != l4Var.getPaddingBottom()) {
            l4Var.setPadding(0, (int) f10, 0, 0);
            l4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.R = drawable;
    }
}
