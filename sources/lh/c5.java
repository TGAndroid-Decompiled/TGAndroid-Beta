package lh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pk0;
public abstract class c5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public b5 A;
    public b5 B;
    public n6 C;
    public int D;
    public boolean E;
    public final pk0 F;
    public final i9 G;
    public final n4 H;
    public final o4 I;
    public final kg.i J;
    public final o4 K;
    public final s4 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Drawable Q;
    public boolean R;
    public long S;
    public final View f15432a;
    public final View f15433b;
    public final FrameLayout f15434c;
    public final ag.j2 d;
    public int f15435e;
    public r4 f15436f;
    public final TextView h;
    public int f15437n;
    public final j4 f15438r;
    public final b f15439s;
    public final int v;
    public final y4 f15440w;
    public final kz f15441x;
    public k5 f15442y;

    public c5(i9 i9Var, Context context, o4 o4Var, kg.i iVar) {
        super(context);
        this.f15435e = 96;
        this.K = new o4();
        this.I = o4Var;
        this.J = iVar;
        b bVar = i9Var.f15793y;
        this.f15439s = bVar;
        this.G = i9Var;
        this.v = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        s4 s4Var = new s4(this, getContext());
        this.L = s4Var;
        j4 j4Var = new j4(this, context, bVar);
        this.f15438r = j4Var;
        j4Var.setClipToPadding(false);
        this.F = new pk0(j4Var, true);
        kz kzVar = new kz(j4Var, 0);
        this.f15441x = kzVar;
        j4Var.setLayoutManager(kzVar);
        j4Var.setNestedScrollingEnabled(true);
        y4 y4Var = new y4(this);
        this.f15440w = y4Var;
        j4Var.setAdapter(y4Var);
        new SparseArray();
        new HashMap();
        addView(j4Var);
        this.d = new ag.j2(j4Var);
        j4Var.setOnScrollListener(new cg.g2(this, 12));
        j4Var.setOnItemClickListener(new eg.w0(2, this, i9Var));
        j4Var.setOnItemLongClickListener(new m4(this, i9Var));
        y4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15434c = frameLayout;
        View view = new View(getContext());
        this.f15432a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.v0(i10, bVar), 0}));
        frameLayout.addView(view, i7.f6.d(-1, 8.0f, 0, 0.0f, this.f15435e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f15433b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, bVar));
        frameLayout.addView(view2, i7.f6.d(-1, 10.0f, 0, 0.0f, this.f15435e - 17, 0.0f, 0.0f));
        frameLayout.addView(s4Var);
        frameLayout.addView(textView);
        n4 n4Var = new n4(this, getContext(), bVar);
        this.H = n4Var;
        n4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(n4Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(c5 c5Var) {
        new cg.p1(c5Var.G.f15756f, 14, false).show();
    }

    public static void b(c5 c5Var) {
        b5 b5Var = c5Var.A;
        if (b5Var != null) {
            b5Var.f15398r.remove(c5Var);
        }
        b5 b5Var2 = c5Var.B;
        c5Var.A = b5Var2;
        if (b5Var2 == null) {
            return;
        }
        ArrayList arrayList = b5Var2.f15398r;
        if (!arrayList.contains(c5Var)) {
            arrayList.add(c5Var);
        }
        c5Var.A.e(c5Var.K, c5Var.P, c5Var.O);
        c5Var.f15440w.E();
        c5Var.f15441x.h1(0, (int) (c5Var.getTopOffset() - c5Var.f15438r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        b5 b5Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f16238x.f(storyItem.dialogId);
            if (sparseArray == null) {
                b5Var = null;
            } else {
                b5Var = (b5) sparseArray.get(storyItem.f22629id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (b5Var != null && b5Var.f15383a == i11) {
                return;
            }
            if (b5Var != null) {
                b5Var.d();
            }
            b5 b5Var2 = new b5(i10, j10, storyItem);
            b5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.f16238x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f22629id, b5Var2);
        }
    }

    public final void c() {
        if (this.A != null && this.f15441x.N0() > this.f15440w.f16417c.size() - 10) {
            this.A.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        nh.o7 o7Var;
        nh.c9 c9Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        k5 k5Var = this.f15442y;
        if (k5Var != null) {
            TL_stories.StoryItem storyItem = k5Var.f15830a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new nh.c9(i10, storyItem.privacy);
                }
                return this.f15442y.f15830a.parsedPrivacy.b(user);
            }
            r6 r6Var = k5Var.f15831b;
            if (r6Var != null && (o7Var = r6Var.f16169c) != null && (c9Var = o7Var.E0) != null) {
                return c9Var.b(user);
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int R;
        float f9;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.f15442y.f15831b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y8 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y8 != null) {
                    while (i12 < y8.stories.size()) {
                        TL_stories.StoryItem storyItem = y8.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f15442y.f15831b.f16170e)) {
                            k5 k5Var = this.f15442y;
                            k5Var.f15831b = null;
                            k5Var.f15830a = storyItem;
                            g(this.S, k5Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                j4 j4Var = this.f15438r;
                if (i12 < j4Var.getChildCount()) {
                    View childAt = j4Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.l6) && (R = RecyclerView.R(childAt)) >= 0) {
                        y4 y4Var = this.f15440w;
                        if (R < y4Var.f16417c.size()) {
                            org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                            if (d(((t4) y4Var.f16417c.get(R)).f16262b)) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.5f;
                            }
                            l6Var.a(f9, true);
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
            j4Var = this.f15438r;
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
        FrameLayout frameLayout = this.f15434c;
        float f9 = paddingTop;
        if (frameLayout.getTranslationY() != f9) {
            frameLayout.setTranslationY(f9);
            h5 h5Var = (h5) this;
            int intValue = ((Integer) h5Var.getTag()).intValue();
            l5 l5Var = h5Var.T.f15727e;
            e5 e5Var = l5Var.h;
            if (intValue == l5Var.A.getCurrentItem()) {
                e5Var.setAlpha(Utilities.clamp(f9 / l5Var.d, 1.0f, 0.0f));
                e5Var.setTranslationY((-(l5Var.d - f9)) / 2.0f);
            }
        }
        this.Q.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.Q.draw(canvas);
        if (this.R) {
            this.R = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != j4Var.getPaddingTop()) {
                ag.j2 j2Var = this.d;
                if (frameLayout.getTranslationY() > j4Var.getPaddingTop() / 2.0f) {
                    j2Var.m((int) (-(j4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    j2Var.m((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f15438r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.f15435e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(b5 b5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        y4 y4Var = this.f15440w;
        int size = y4Var.f16417c.size();
        o4 o4Var = this.K;
        if (TextUtils.isEmpty(o4Var.f16019c) && !o4Var.f16018b) {
            i();
        }
        y4Var.E();
        this.F.b(size - 1);
        c();
        if (this.C != null) {
            ArrayList arrayList = b5Var.f15389i;
            if (b5Var == this.A && arrayList != null && this.D < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = this.D; i10 < arrayList.size(); i10++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                        arrayList2.add(storyItem);
                    }
                }
                this.D = arrayList.size();
                if (!arrayList2.isEmpty()) {
                    this.C.F(arrayList2);
                }
            }
        }
    }

    public final void g(long j10, k5 k5Var) {
        this.S = j10;
        this.f15442y = k5Var;
        i();
        h(false);
        if (k5Var != null && k5Var.f15830a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, k5Var.f15830a.f22629id);
        }
    }

    public float getTopOffset() {
        return this.f15434c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        o4 o4Var = this.K;
        boolean z11 = o4Var.f16018b;
        s4 s4Var = this.L;
        if (z11 != s4Var.f16212s || !z10) {
            ValueAnimator valueAnimator = s4Var.f16213w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                s4Var.f16213w.cancel();
            }
            s4Var.f16212s = z11 ? 1 : 0;
            if (!z10) {
                s4Var.f16211r = 1.0f;
                s4Var.invalidate();
            } else {
                s4Var.f16208e.set(s4Var.f16210n);
                s4Var.f16209f = s4Var.f16207c.getAlpha();
                s4Var.h = s4Var.d.getAlpha();
                s4Var.f16211r = 0.0f;
                s4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s4Var.f16213w = ofFloat;
                ofFloat.addUpdateListener(new bg.q1(s4Var, 29));
                s4Var.f16213w.addListener(new ag.m0(s4Var, 22));
                s4Var.f16213w.setDuration(250L);
                s4Var.f16213w.setInterpolator(jr.f29800f);
                s4Var.f16213w.start();
            }
        }
        boolean z12 = o4Var.f16017a;
        ol0 ol0Var = s4Var.v;
        if (z12) {
            b5 b5Var = this.A;
            if (b5Var != null && b5Var.f15387f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        ol0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: lh.c5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        b5 b5Var = this.A;
        if (b5Var != null) {
            ArrayList arrayList = b5Var.f15398r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.A.f15396p.clear();
        }
        this.f15440w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        mc.a(this, new ih.u0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
        b5 b5Var = this.A;
        if (b5Var != null) {
            b5Var.f15398r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        mc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f15434c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f15434c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f9) {
        j4 j4Var = this.f15438r;
        if (f9 != j4Var.getPaddingBottom()) {
            j4Var.setPadding(0, (int) f9, 0, 0);
            j4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.Q = drawable;
    }
}
