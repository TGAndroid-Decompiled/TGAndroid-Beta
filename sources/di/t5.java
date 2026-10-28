package di;

import a8.ng;
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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.yz;
public abstract class t5 extends FrameLayout implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate {
    public s5 E;
    public s5 F;
    public c7 G;
    public int H;
    public boolean I;
    public final rl0 J;
    public final y9 K;
    public final d5 L;
    public final e5 M;
    public final ai.i N;
    public final e5 O;
    public final i5 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f9189a;
    public int f9190a0;
    public final View f9191b;
    public final FrameLayout f9192c;
    public final ng d;
    public int e;
    public h5 f9193f;
    public final TextView h;
    public int f9194n;
    public final y4 f9195r;
    public final b f9196s;
    public final int v;
    public final o5 f9197w;
    public final yz f9198x;
    public a6 f9199y;

    public t5(y9 y9Var, Context context, e5 e5Var, ai.i iVar) {
        super(context);
        this.e = 96;
        this.O = new e5();
        this.M = e5Var;
        this.N = iVar;
        b bVar = y9Var.f9469y;
        this.f9196s = bVar;
        this.K = y9Var;
        this.v = y9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, bVar);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        i5 i5Var = new i5(this, getContext());
        this.P = i5Var;
        y4 y4Var = new y4(this, context, bVar);
        this.f9195r = y4Var;
        y4Var.setClipToPadding(false);
        this.J = new rl0(y4Var, true);
        yz yzVar = new yz(y4Var, 0);
        this.f9198x = yzVar;
        y4Var.setLayoutManager(yzVar);
        y4Var.setNestedScrollingEnabled(true);
        o5 o5Var = new o5(this);
        this.f9197w = o5Var;
        y4Var.setAdapter(o5Var);
        new SparseArray();
        new HashMap();
        addView(y4Var);
        this.d = new ng(y4Var);
        y4Var.setOnScrollListener(new z4(this));
        y4Var.setOnItemClickListener(new x4(0, this, y9Var));
        y4Var.setOnItemLongClickListener(new c5(this, y9Var));
        o5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f9192c = frameLayout;
        View view = new View(getContext());
        this.f9189a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.y6.f23428h5;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, bVar);
        this.f9190a0 = w02;
        view.setBackground(new GradientDrawable(orientation, new int[]{w02, 0}));
        frameLayout.addView(view, kb1.h(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f9191b = view2;
        org.telegram.ui.ActionBar.f7.i(i10, view2, bVar);
        frameLayout.addView(view2, kb1.h(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(i5Var);
        frameLayout.addView(textView);
        d5 d5Var = new d5(this, getContext(), bVar);
        this.L = d5Var;
        d5Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(d5Var, kb1.h(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(t5 t5Var) {
        new tg.y0(t5Var.K.f9428f, 14, false).show();
    }

    public static void b(t5 t5Var) {
        s5 s5Var = t5Var.E;
        if (s5Var != null) {
            s5Var.f9169r.remove(t5Var);
        }
        s5 s5Var2 = t5Var.F;
        t5Var.E = s5Var2;
        if (s5Var2 == null) {
            return;
        }
        ArrayList arrayList = s5Var2.f9169r;
        if (!arrayList.contains(t5Var)) {
            arrayList.add(t5Var);
        }
        t5Var.E.e(t5Var.O, t5Var.T, t5Var.S);
        t5Var.f9197w.E();
        t5Var.f9198x.h1(0, (int) (t5Var.getTopOffset() - t5Var.f9195r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        s5 s5Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f8648x.f(storyItem.dialogId);
            if (sparseArray == null) {
                s5Var = null;
            } else {
                s5Var = (s5) sparseArray.get(storyItem.f22267id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (s5Var != null && s5Var.f9155a == i11) {
                return;
            }
            if (s5Var != null) {
                s5Var.d();
            }
            s5 s5Var2 = new s5(i10, j10, storyItem);
            s5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.f8648x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f22267id, s5Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f9198x.N0() > this.f9197w.f8878c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        fi.w7 w7Var;
        fi.l9 l9Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().N(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        a6 a6Var = this.f9199y;
        if (a6Var != null) {
            TL_stories.StoryItem storyItem = a6Var.f8373a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new fi.l9(i10, storyItem.privacy);
                }
                return this.f9199y.f8373a.parsedPrivacy.b(user);
            }
            g7 g7Var = a6Var.f8374b;
            if (g7Var != null && (w7Var = g7Var.f8584c) != null && (l9Var = w7Var.E0) != null) {
                return l9Var.b(user);
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
            if (this.f9199y.f8374b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f9199y.f8374b.e)) {
                            a6 a6Var = this.f9199y;
                            a6Var.f8374b = null;
                            a6Var.f8373a = storyItem;
                            g(this.W, a6Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                y4 y4Var = this.f9195r;
                if (i12 < y4Var.getChildCount()) {
                    View childAt = y4Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.s6) && (R = RecyclerView.R(childAt)) >= 0) {
                        o5 o5Var = this.f9197w;
                        if (R < o5Var.f8878c.size()) {
                            org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) childAt;
                            if (d(((j5) o5Var.f8878c.get(R)).f8695b)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            s6Var.a(f7, true);
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
        y4 y4Var;
        int paddingTop;
        View view = null;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            y4Var = this.f9195r;
            if (i11 >= y4Var.getChildCount()) {
                break;
            }
            View childAt = y4Var.getChildAt(i11);
            int S = RecyclerView.S(childAt);
            if (S < i10 || i10 == -1) {
                view = childAt;
                i10 = S;
            }
            i11++;
        }
        if (i10 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i10 > 0) {
            paddingTop = 0;
        } else {
            paddingTop = y4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f9192c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            x5 x5Var = (x5) this;
            int intValue = ((Integer) x5Var.getTag()).intValue();
            b6 b6Var = x5Var.f9375b0.e;
            u5 u5Var = b6Var.h;
            if (intValue == b6Var.E.getCurrentItem()) {
                u5Var.setAlpha(Utilities.clamp(f7 / b6Var.d, 1.0f, 0.0f));
                u5Var.setTranslationY((-(b6Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != y4Var.getPaddingTop()) {
                int i12 = (frameLayout.getTranslationY() > (y4Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (y4Var.getPaddingTop() / 2.0f) ? 0 : -1));
                ng ngVar = this.d;
                if (i12 > 0) {
                    ngVar.y((int) (-(y4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    ngVar.y((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f9195r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(s5 s5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        o5 o5Var = this.f9197w;
        int size = o5Var.f8878c.size();
        e5 e5Var = this.O;
        if (TextUtils.isEmpty(e5Var.f8520c) && !e5Var.f8519b) {
            i();
        }
        o5Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = s5Var.f9160i;
            if (s5Var == this.E && arrayList != null && this.H < arrayList.size()) {
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

    public final void g(long j10, a6 a6Var) {
        this.W = j10;
        this.f9199y = a6Var;
        i();
        h(false);
        if (a6Var != null && a6Var.f8373a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, a6Var.f8373a.f22267id);
        }
    }

    public float getTopOffset() {
        return this.f9192c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        e5 e5Var = this.O;
        boolean z11 = e5Var.f8519b;
        i5 i5Var = this.P;
        if (z11 != i5Var.f8677s || !z10) {
            ValueAnimator valueAnimator = i5Var.f8678w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                i5Var.f8678w.cancel();
            }
            i5Var.f8677s = z11 ? 1 : 0;
            if (!z10) {
                i5Var.f8676r = 1.0f;
                i5Var.invalidate();
            } else {
                i5Var.e.set(i5Var.f8675n);
                i5Var.f8674f = i5Var.f8673c.getAlpha();
                i5Var.h = i5Var.d.getAlpha();
                i5Var.f8676r = 0.0f;
                i5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                i5Var.f8678w = ofFloat;
                ofFloat.addUpdateListener(new ai.g0(i5Var, 20));
                i5Var.f8678w.addListener(new bh.b(i5Var, 14));
                i5Var.f8678w.setDuration(250L);
                i5Var.f8678w.setInterpolator(ds.f27530f);
                i5Var.f8678w.start();
            }
        }
        boolean z12 = e5Var.f8518a;
        vm0 vm0Var = i5Var.v;
        if (z12) {
            s5 s5Var = this.E;
            if (s5Var != null && s5Var.f9158f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        vm0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: di.t5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        s5 s5Var = this.E;
        if (s5Var != null) {
            ArrayList arrayList = s5Var.f9169r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f9167p.clear();
        }
        this.f9197w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.a(this, new bh.c0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        s5 s5Var = this.E;
        if (s5Var != null) {
            s5Var.f9169r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f9192c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f9192c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        y4 y4Var = this.f9195r;
        if (f7 != y4Var.getPaddingBottom()) {
            y4Var.setPadding(0, (int) f7, 0, 0);
            y4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, this.f9196s);
            View view = this.f9189a;
            if (view != null && w02 != this.f9190a0) {
                this.f9190a0 = w02;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w02, 0}));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
