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
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vm0;
public abstract class l7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public k7 E;
    public k7 F;
    public h9 G;
    public int H;
    public boolean I;
    public final vl0 J;
    public final kc K;
    public final u6 L;
    public final v6 M;
    public final y1 N;
    public final v6 O;
    public final z6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f1334a;
    public final View f1335b;
    public final FrameLayout f1336c;
    public final a5.a d;
    public int f1337e;
    public y6 f1338f;
    public final TextView h;
    public int f1339n;
    public final p6 f1340r;
    public final d f1341s;
    public final int v;
    public final f7 f1342w;
    public final f00 f1343x;
    public s7 f1344y;

    public l7(kc kcVar, Context context, v6 v6Var, y1 y1Var) {
        super(context);
        this.f1337e = 96;
        this.O = new v6();
        this.M = v6Var;
        this.N = y1Var;
        d dVar = kcVar.f1308y;
        this.f1341s = dVar;
        this.K = kcVar;
        this.v = kcVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20905j5, dVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        z6 z6Var = new z6(this, getContext());
        this.P = z6Var;
        p6 p6Var = new p6(this, context, dVar);
        this.f1340r = p6Var;
        p6Var.setClipToPadding(false);
        this.J = new vl0(p6Var, true);
        f00 f00Var = new f00(p6Var, 0);
        this.f1343x = f00Var;
        p6Var.setLayoutManager(f00Var);
        p6Var.setNestedScrollingEnabled(true);
        f7 f7Var = new f7(this);
        this.f1342w = f7Var;
        p6Var.setAdapter(f7Var);
        new SparseArray();
        new HashMap();
        addView(p6Var);
        this.d = new a5.a(p6Var);
        p6Var.setOnScrollListener(new q6(this));
        p6Var.setOnItemClickListener(new o6(0, this, kcVar));
        p6Var.setOnItemLongClickListener(new t6(this, kcVar));
        f7Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1336c = frameLayout;
        View view = new View(getContext());
        this.f1334a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.i6.f20868h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.i6.w0(i10, dVar), 0}));
        frameLayout.addView(view, w7.x5.a(8.0f, 0.0f, this.f1337e - 8, 0.0f, 0.0f, -1, 0));
        View view2 = new View(getContext());
        this.f1335b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i10, dVar));
        frameLayout.addView(view2, w7.x5.a(10.0f, 0.0f, this.f1337e - 17, 0.0f, 0.0f, -1, 0));
        frameLayout.addView(z6Var);
        frameLayout.addView(textView);
        u6 u6Var = new u6(this, getContext(), dVar);
        this.L = u6Var;
        u6Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(u6Var, w7.x5.a(-1.0f, 0.0f, 36.0f, 0.0f, 0.0f, -1, 51));
        addView(frameLayout);
    }

    public static void a(l7 l7Var) {
        new rg.y0(l7Var.K.f1267f, 14, false).show();
    }

    public static void b(l7 l7Var) {
        k7 k7Var = l7Var.E;
        if (k7Var != null) {
            k7Var.f1242r.remove(l7Var);
        }
        k7 k7Var2 = l7Var.F;
        l7Var.E = k7Var2;
        if (k7Var2 == null) {
            return;
        }
        ArrayList arrayList = k7Var2.f1242r;
        if (!arrayList.contains(l7Var)) {
            arrayList.add(l7Var);
        }
        l7Var.E.e(l7Var.O, l7Var.T, l7Var.S);
        l7Var.f1342w.E();
        l7Var.f1343x.h1(0, (int) (l7Var.getTopOffset() - l7Var.f1340r.getPaddingTop()));
    }

    public static void f(int i10, long j3, TL_stories.StoryItem storyItem) {
        k7 k7Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f1426x.f(storyItem.dialogId);
            if (sparseArray == null) {
                k7Var = null;
            } else {
                k7Var = (k7) sparseArray.get(storyItem.f20275id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (k7Var != null && k7Var.f1227a == i11) {
                return;
            }
            if (k7Var != null) {
                k7Var.d();
            }
            k7 k7Var2 = new k7(i10, j3, storyItem);
            k7Var2.c();
            if (sparseArray == null) {
                a0.i iVar = MessagesController.getInstance(i10).storiesController.f1426x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                iVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f20275id, k7Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f1343x.N0() > this.f1342w.f1030c.size() - 10) {
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
        s7 s7Var = this.f1344y;
        if (s7Var != null) {
            TL_stories.StoryItem storyItem = s7Var.f1708a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new ci.da(i10, storyItem.privacy);
                }
                return this.f1344y.f1708a.parsedPrivacy.b(user);
            }
            l9 l9Var = s7Var.f1709b;
            if (l9Var != null && (l8Var = l9Var.f1351c) != null && (daVar = l8Var.E0) != null) {
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
            if (this.f1344y.f1709b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f1344y.f1709b.f1352e)) {
                            s7 s7Var = this.f1344y;
                            s7Var.f1709b = null;
                            s7Var.f1708a = storyItem;
                            g(this.W, s7Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                p6 p6Var = this.f1340r;
                if (i12 < p6Var.getChildCount()) {
                    View childAt = p6Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.o6) && (R = RecyclerView.R(childAt)) >= 0) {
                        f7 f7Var = this.f1342w;
                        if (R < f7Var.f1030c.size()) {
                            org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                            if (d(((a7) f7Var.f1030c.get(R)).f644b)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            o6Var.a(f7, true);
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
        p6 p6Var;
        int paddingTop;
        View view = null;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            p6Var = this.f1340r;
            if (i11 >= p6Var.getChildCount()) {
                break;
            }
            View childAt = p6Var.getChildAt(i11);
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
            paddingTop = p6Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f1336c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            p7 p7Var = (p7) this;
            int intValue = ((Integer) p7Var.getTag()).intValue();
            t7 t7Var = p7Var.f1575a0.f1620e;
            m7 m7Var = t7Var.h;
            if (intValue == t7Var.E.getCurrentItem()) {
                m7Var.setAlpha(Utilities.clamp(f7 / t7Var.d, 1.0f, 0.0f));
                m7Var.setTranslationY((-(t7Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != p6Var.getPaddingTop()) {
                int i12 = (frameLayout.getTranslationY() > (p6Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (p6Var.getPaddingTop() / 2.0f) ? 0 : -1));
                a5.a aVar = this.d;
                if (i12 > 0) {
                    aVar.x((int) (-(p6Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.x((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f1340r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.f1337e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(k7 k7Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        f7 f7Var = this.f1342w;
        int size = f7Var.f1030c.size();
        v6 v6Var = this.O;
        if (TextUtils.isEmpty(v6Var.f1827c) && !v6Var.f1826b) {
            i();
        }
        f7Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = k7Var.f1233i;
            if (k7Var == this.E && arrayList != null && this.H < arrayList.size()) {
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

    public final void g(long j3, s7 s7Var) {
        this.W = j3;
        this.f1344y = s7Var;
        i();
        h(false);
        if (s7Var != null && s7Var.f1708a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j3, s7Var.f1708a.f20275id);
        }
    }

    public float getTopOffset() {
        return this.f1336c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        v6 v6Var = this.O;
        boolean z11 = v6Var.f1826b;
        z6 z6Var = this.P;
        if (z11 != z6Var.f2014s || !z10) {
            ValueAnimator valueAnimator = z6Var.f2015w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                z6Var.f2015w.cancel();
            }
            z6Var.f2014s = z11 ? 1 : 0;
            if (!z10) {
                z6Var.f2013r = 1.0f;
                z6Var.invalidate();
            } else {
                z6Var.f2010e.set(z6Var.f2012n);
                z6Var.f2011f = z6Var.f2009c.getAlpha();
                z6Var.h = z6Var.d.getAlpha();
                z6Var.f2013r = 0.0f;
                z6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z6Var.f2015w = ofFloat;
                ofFloat.addUpdateListener(new a(z6Var, 10));
                z6Var.f2015w.addListener(new b(z6Var, 8));
                z6Var.f2015w.setDuration(250L);
                z6Var.f2015w.setInterpolator(hs.f27118f);
                z6Var.f2015w.start();
            }
        }
        boolean z12 = v6Var.f1825a;
        vm0 vm0Var = z6Var.v;
        if (z12) {
            k7 k7Var = this.E;
            if (k7Var != null && k7Var.f1231f) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        k7 k7Var = this.E;
        if (k7Var != null) {
            ArrayList arrayList = k7Var.f1242r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f1240p.clear();
        }
        this.f1342w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        org.telegram.ui.Components.tc.a(this, new x4(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        k7 k7Var = this.E;
        if (k7Var != null) {
            k7Var.f1242r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        org.telegram.ui.Components.tc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f1336c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f1336c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        p6 p6Var = this.f1340r;
        if (f7 != p6Var.getPaddingBottom()) {
            p6Var.setPadding(0, (int) f7, 0, 0);
            p6Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
