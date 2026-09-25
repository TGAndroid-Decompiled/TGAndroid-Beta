package ai;

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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.rr;
public abstract class k7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public j7 E;
    public j7 F;
    public g9 G;
    public int H;
    public boolean I;
    public final bl0 J;
    public final jc K;
    public final t6 L;
    public final u6 M;
    public final y1 N;
    public final u6 O;
    public final y6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f1128a;
    public final View f1129b;
    public final FrameLayout f1130c;
    public final a5.a d;
    public int e;
    public x6 f1131f;
    public final TextView h;
    public int f1132n;
    public final o6 f1133r;
    public final d f1134s;
    public final int v;
    public final e7 f1135w;
    public final qz f1136x;
    public r7 f1137y;

    public k7(jc jcVar, Context context, u6 u6Var, y1 y1Var) {
        super(context);
        this.e = 96;
        this.O = new u6();
        this.M = u6Var;
        this.N = y1Var;
        d dVar = jcVar.f1112y;
        this.f1134s = dVar;
        this.K = jcVar;
        this.v = jcVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19166j5, dVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        y6 y6Var = new y6(this, getContext());
        this.P = y6Var;
        o6 o6Var = new o6(this, context, dVar);
        this.f1133r = o6Var;
        o6Var.setClipToPadding(false);
        this.J = new bl0(o6Var, true);
        qz qzVar = new qz(o6Var, 0);
        this.f1136x = qzVar;
        o6Var.setLayoutManager(qzVar);
        o6Var.setNestedScrollingEnabled(true);
        e7 e7Var = new e7(this);
        this.f1135w = e7Var;
        o6Var.setAdapter(e7Var);
        new SparseArray();
        new HashMap();
        addView(o6Var);
        this.d = new a5.a(o6Var);
        o6Var.setOnScrollListener(new p6(this));
        o6Var.setOnItemClickListener(new n6(0, this, jcVar));
        o6Var.setOnItemLongClickListener(new s6(this, jcVar));
        e7Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1130c = frameLayout;
        View view = new View(getContext());
        this.f1128a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.h6.f19130h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.v0(i10, dVar), 0}));
        frameLayout.addView(view, w7.y5.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f1129b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i10, dVar));
        frameLayout.addView(view2, w7.y5.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(y6Var);
        frameLayout.addView(textView);
        t6 t6Var = new t6(this, getContext(), dVar);
        this.L = t6Var;
        t6Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(t6Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(k7 k7Var) {
        new rg.x0(k7Var.K.f1071f, 14, false).show();
    }

    public static void b(k7 k7Var) {
        j7 j7Var = k7Var.E;
        if (j7Var != null) {
            j7Var.f1047r.remove(k7Var);
        }
        j7 j7Var2 = k7Var.F;
        k7Var.E = j7Var2;
        if (j7Var2 == null) {
            return;
        }
        ArrayList arrayList = j7Var2.f1047r;
        if (!arrayList.contains(k7Var)) {
            arrayList.add(k7Var);
        }
        k7Var.E.e(k7Var.O, k7Var.T, k7Var.S);
        k7Var.f1135w.E();
        k7Var.f1136x.h1(0, (int) (k7Var.getTopOffset() - k7Var.f1133r.getPaddingTop()));
    }

    public static void f(int i10, long j3, TL_stories.StoryItem storyItem) {
        j7 j7Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f1211x.f(storyItem.dialogId);
            if (sparseArray == null) {
                j7Var = null;
            } else {
                j7Var = (j7) sparseArray.get(storyItem.f18571id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (j7Var != null && j7Var.f1033a == i11) {
                return;
            }
            if (j7Var != null) {
                j7Var.d();
            }
            j7 j7Var2 = new j7(i10, j3, storyItem);
            j7Var2.c();
            if (sparseArray == null) {
                a0.i iVar = MessagesController.getInstance(i10).storiesController.f1211x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                iVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f18571id, j7Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f1136x.N0() > this.f1135w.f851c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        ci.l8 l8Var;
        ci.da daVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        r7 r7Var = this.f1137y;
        if (r7Var != null) {
            TL_stories.StoryItem storyItem = r7Var.f1468a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new ci.da(i10, storyItem.privacy);
                }
                return this.f1137y.f1468a.parsedPrivacy.b(user);
            }
            k9 k9Var = r7Var.f1469b;
            if (k9Var != null && (l8Var = k9Var.f1143c) != null && (daVar = l8Var.E0) != null) {
                return daVar.b(user);
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
            if (this.f1137y.f1469b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f1137y.f1469b.e)) {
                            r7 r7Var = this.f1137y;
                            r7Var.f1469b = null;
                            r7Var.f1468a = storyItem;
                            g(this.W, r7Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                o6 o6Var = this.f1133r;
                if (i12 < o6Var.getChildCount()) {
                    View childAt = o6Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.o6) && (R = RecyclerView.R(childAt)) >= 0) {
                        e7 e7Var = this.f1135w;
                        if (R < e7Var.f851c.size()) {
                            org.telegram.ui.Cells.o6 o6Var2 = (org.telegram.ui.Cells.o6) childAt;
                            if (d(((z6) e7Var.f851c.get(R)).f1780b)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            o6Var2.a(f7, true);
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
        o6 o6Var;
        int paddingTop;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            o6Var = this.f1133r;
            if (i10 >= o6Var.getChildCount()) {
                break;
            }
            View childAt = o6Var.getChildAt(i10);
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
            paddingTop = o6Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f1130c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            o7 o7Var = (o7) this;
            int intValue = ((Integer) o7Var.getTag()).intValue();
            s7 s7Var = o7Var.f1353a0.e;
            l7 l7Var = s7Var.h;
            if (intValue == s7Var.E.getCurrentItem()) {
                l7Var.setAlpha(Utilities.clamp(f7 / s7Var.d, 1.0f, 0.0f));
                l7Var.setTranslationY((-(s7Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != o6Var.getPaddingTop()) {
                a5.a aVar = this.d;
                if (frameLayout.getTranslationY() > o6Var.getPaddingTop() / 2.0f) {
                    aVar.v((int) (-(o6Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.v((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f1133r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(j7 j7Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        e7 e7Var = this.f1135w;
        int size = e7Var.f851c.size();
        u6 u6Var = this.O;
        if (TextUtils.isEmpty(u6Var.f1579c) && !u6Var.f1578b) {
            i();
        }
        e7Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = j7Var.f1038i;
            if (j7Var == this.E && arrayList != null && this.H < arrayList.size()) {
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

    public final void g(long j3, r7 r7Var) {
        this.W = j3;
        this.f1137y = r7Var;
        i();
        h(false);
        if (r7Var != null && r7Var.f1468a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j3, r7Var.f1468a.f18571id);
        }
    }

    public float getTopOffset() {
        return this.f1130c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        u6 u6Var = this.O;
        boolean z11 = u6Var.f1578b;
        y6 y6Var = this.P;
        if (z11 != y6Var.f1754s || !z10) {
            ValueAnimator valueAnimator = y6Var.f1755w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                y6Var.f1755w.cancel();
            }
            y6Var.f1754s = z11 ? 1 : 0;
            if (!z10) {
                y6Var.f1753r = 1.0f;
                y6Var.invalidate();
            } else {
                y6Var.e.set(y6Var.f1752n);
                y6Var.f1751f = y6Var.f1750c.getAlpha();
                y6Var.h = y6Var.d.getAlpha();
                y6Var.f1753r = 0.0f;
                y6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                y6Var.f1755w = ofFloat;
                ofFloat.addUpdateListener(new a(y6Var, 10));
                y6Var.f1755w.addListener(new b(y6Var, 8));
                y6Var.f1755w.setDuration(250L);
                y6Var.f1755w.setInterpolator(rr.f28031f);
                y6Var.f1755w.start();
            }
        }
        boolean z12 = u6Var.f1577a;
        bm0 bm0Var = y6Var.v;
        if (z12) {
            j7 j7Var = this.E;
            if (j7Var != null && j7Var.f1036f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        bm0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        j7 j7Var = this.E;
        if (j7Var != null) {
            ArrayList arrayList = j7Var.f1047r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f1045p.clear();
        }
        this.f1135w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        org.telegram.ui.Components.qc.a(this, new w4(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        j7 j7Var = this.E;
        if (j7Var != null) {
            j7Var.f1047r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        org.telegram.ui.Components.qc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f1130c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f1130c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        o6 o6Var = this.f1133r;
        if (f7 != o6Var.getPaddingBottom()) {
            o6Var.setPadding(0, (int) f7, 0, 0);
            o6Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
