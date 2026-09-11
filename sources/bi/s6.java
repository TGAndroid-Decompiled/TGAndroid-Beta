package bi;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.ql0;
public abstract class s6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public r6 E;
    public r6 F;
    public o8 G;
    public int H;
    public boolean I;
    public final qk0 J;
    public final pb K;
    public final c6 L;
    public final d6 M;
    public final ah.m N;
    public final d6 O;
    public final h6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f3690a;
    public final View f3691b;
    public final FrameLayout f3692c;
    public final a5.a d;
    public int f3693e;
    public g6 f3694f;
    public final TextView h;
    public int f3695n;
    public final y5 f3696r;
    public final b f3697s;
    public final int v;
    public final n6 f3698w;
    public final pz f3699x;
    public z6 f3700y;

    public s6(pb pbVar, Context context, d6 d6Var, ah.m mVar) {
        super(context);
        this.f3693e = 96;
        this.O = new d6();
        this.M = d6Var;
        this.N = mVar;
        b bVar = pbVar.f3586y;
        this.f3697s = bVar;
        this.K = pbVar;
        this.v = pbVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        h6 h6Var = new h6(this, getContext());
        this.P = h6Var;
        y5 y5Var = new y5(this, context, bVar);
        this.f3696r = y5Var;
        y5Var.setClipToPadding(false);
        this.J = new qk0(y5Var, true);
        pz pzVar = new pz(y5Var, 0);
        this.f3699x = pzVar;
        y5Var.setLayoutManager(pzVar);
        y5Var.setNestedScrollingEnabled(true);
        n6 n6Var = new n6(this);
        this.f3698w = n6Var;
        y5Var.setAdapter(n6Var);
        new SparseArray();
        new HashMap();
        addView(y5Var);
        this.d = new a5.a(y5Var);
        y5Var.setOnScrollListener(new ah.e0(this, 2));
        y5Var.setOnItemClickListener(new x5(0, this, pbVar));
        y5Var.setOnItemLongClickListener(new b6(this, pbVar));
        n6Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3692c = frameLayout;
        View view = new View(getContext());
        this.f3690a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.j6.f20734h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i10, bVar), 0}));
        frameLayout.addView(view, w7.x5.d(-1, 8.0f, 0, 0.0f, this.f3693e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f3691b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        frameLayout.addView(view2, w7.x5.d(-1, 10.0f, 0, 0.0f, this.f3693e - 17, 0.0f, 0.0f));
        frameLayout.addView(h6Var);
        frameLayout.addView(textView);
        c6 c6Var = new c6(this, getContext(), bVar);
        this.L = c6Var;
        c6Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(c6Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(s6 s6Var) {
        new sg.a1(s6Var.K.f3545f, 14, false).show();
    }

    public static void b(s6 s6Var) {
        r6 r6Var = s6Var.E;
        if (r6Var != null) {
            r6Var.f3655r.remove(s6Var);
        }
        r6 r6Var2 = s6Var.F;
        s6Var.E = r6Var2;
        if (r6Var2 == null) {
            return;
        }
        ArrayList arrayList = r6Var2.f3655r;
        if (!arrayList.contains(s6Var)) {
            arrayList.add(s6Var);
        }
        s6Var.E.e(s6Var.O, s6Var.T, s6Var.S);
        s6Var.f3698w.E();
        s6Var.f3699x.h1(0, (int) (s6Var.getTopOffset() - s6Var.f3696r.getPaddingTop()));
    }

    public static void f(int i10, long j3, TL_stories.StoryItem storyItem) {
        r6 r6Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f3825x.f(storyItem.dialogId);
            if (sparseArray == null) {
                r6Var = null;
            } else {
                r6Var = (r6) sparseArray.get(storyItem.f20107id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (r6Var != null && r6Var.f3640a == i11) {
                return;
            }
            if (r6Var != null) {
                r6Var.d();
            }
            r6 r6Var2 = new r6(i10, j3, storyItem);
            r6Var2.c();
            if (sparseArray == null) {
                a0.i iVar = MessagesController.getInstance(i10).storiesController.f3825x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                iVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f20107id, r6Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f3699x.N0() > this.f3698w.f3370c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        di.o8 o8Var;
        di.ga gaVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        z6 z6Var = this.f3700y;
        if (z6Var != null) {
            TL_stories.StoryItem storyItem = z6Var.f4060a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new di.ga(i10, storyItem.privacy);
                }
                return this.f3700y.f4060a.parsedPrivacy.b(user);
            }
            t8 t8Var = z6Var.f4061b;
            if (t8Var != null && (o8Var = t8Var.f3740c) != null && (gaVar = o8Var.E0) != null) {
                return gaVar.b(user);
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int R;
        float f7;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.f3700y.f4061b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f3700y.f4061b.f3741e)) {
                            z6 z6Var = this.f3700y;
                            z6Var.f4061b = null;
                            z6Var.f4060a = storyItem;
                            g(this.W, z6Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                y5 y5Var = this.f3696r;
                if (i12 < y5Var.getChildCount()) {
                    View childAt = y5Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                        n6 n6Var = this.f3698w;
                        if (R < n6Var.f3370c.size()) {
                            org.telegram.ui.Cells.n6 n6Var2 = (org.telegram.ui.Cells.n6) childAt;
                            if (d(((i6) n6Var.f3370c.get(R)).f3097b)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            n6Var2.a(f7, true);
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
        y5 y5Var;
        int paddingTop;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            y5Var = this.f3696r;
            if (i10 >= y5Var.getChildCount()) {
                break;
            }
            View childAt = y5Var.getChildAt(i10);
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
            paddingTop = y5Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f3692c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            w6 w6Var = (w6) this;
            int intValue = ((Integer) w6Var.getTag()).intValue();
            a7 a7Var = w6Var.f3957a0.f3985e;
            t6 t6Var = a7Var.h;
            if (intValue == a7Var.E.getCurrentItem()) {
                t6Var.setAlpha(Utilities.clamp(f7 / a7Var.d, 1.0f, 0.0f));
                t6Var.setTranslationY((-(a7Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != y5Var.getPaddingTop()) {
                a5.a aVar = this.d;
                if (frameLayout.getTranslationY() > y5Var.getPaddingTop() / 2.0f) {
                    aVar.u((int) (-(y5Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.u((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3696r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.f3693e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(r6 r6Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        n6 n6Var = this.f3698w;
        int size = n6Var.f3370c.size();
        d6 d6Var = this.O;
        if (TextUtils.isEmpty(d6Var.f2865c) && !d6Var.f2864b) {
            i();
        }
        n6Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = r6Var.f3646i;
            if (r6Var == this.E && arrayList != null && this.H < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = this.H; i10 < arrayList.size(); i10++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                        storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                        arrayList2.add(storyItem);
                    }
                }
                this.H = arrayList.size();
                if (!arrayList2.isEmpty()) {
                    this.G.F(arrayList2);
                }
            }
        }
    }

    public final void g(long j3, z6 z6Var) {
        this.W = j3;
        this.f3700y = z6Var;
        i();
        h(false);
        if (z6Var != null && z6Var.f4060a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j3, z6Var.f4060a.f20107id);
        }
    }

    public float getTopOffset() {
        return this.f3692c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        d6 d6Var = this.O;
        boolean z11 = d6Var.f2864b;
        h6 h6Var = this.P;
        if (z11 != h6Var.f3062s || !z10) {
            ValueAnimator valueAnimator = h6Var.f3063w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                h6Var.f3063w.cancel();
            }
            h6Var.f3062s = z11 ? 1 : 0;
            if (!z10) {
                h6Var.f3061r = 1.0f;
                h6Var.invalidate();
            } else {
                h6Var.f3058e.set(h6Var.f3060n);
                h6Var.f3059f = h6Var.f3057c.getAlpha();
                h6Var.h = h6Var.d.getAlpha();
                h6Var.f3061r = 0.0f;
                h6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                h6Var.f3063w = ofFloat;
                ofFloat.addUpdateListener(new ah.d0(h6Var, 11));
                h6Var.f3063w.addListener(new ah.b(h6Var, 11));
                h6Var.f3063w.setDuration(250L);
                h6Var.f3063w.setInterpolator(pr.f29466f);
                h6Var.f3063w.start();
            }
        }
        boolean z12 = d6Var.f2863a;
        ql0 ql0Var = h6Var.v;
        if (z12) {
            r6 r6Var = this.E;
            if (r6Var != null && r6Var.f3644f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        ql0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: bi.s6.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        r6 r6Var = this.E;
        if (r6Var != null) {
            ArrayList arrayList = r6Var.f3655r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f3653p.clear();
        }
        this.f3698w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.a(this, new ah.n0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        r6 r6Var = this.E;
        if (r6Var != null) {
            r6Var.f3655r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f3692c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f3692c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        y5 y5Var = this.f3696r;
        if (f7 != y5Var.getPaddingBottom()) {
            y5Var.setPadding(0, (int) f7, 0, 0);
            y5Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
