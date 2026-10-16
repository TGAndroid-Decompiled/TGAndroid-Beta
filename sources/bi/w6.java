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
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;
public abstract class w6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public v6 E;
    public v6 F;
    public r8 G;
    public int H;
    public boolean I;
    public final rl0 J;
    public final sb K;
    public final f6 L;
    public final g6 M;
    public final o1 N;
    public final g6 O;
    public final k6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f3904a;
    public final View f3905b;
    public final FrameLayout f3906c;
    public final a5.a d;
    public int e;
    public j6 f3907f;
    public final TextView h;
    public int f3908n;
    public final a6 f3909r;
    public final b f3910s;
    public final int v;
    public final q6 f3911w;
    public final b00 f3912x;
    public d7 f3913y;

    public w6(sb sbVar, Context context, g6 g6Var, o1 o1Var) {
        super(context);
        this.e = 96;
        this.O = new g6();
        this.M = g6Var;
        this.N = o1Var;
        b bVar = sbVar.f3718y;
        this.f3910s = bVar;
        this.K = sbVar;
        this.v = sbVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        k6 k6Var = new k6(this, getContext());
        this.P = k6Var;
        a6 a6Var = new a6(this, context, bVar);
        this.f3909r = a6Var;
        a6Var.setClipToPadding(false);
        this.J = new rl0(a6Var, true);
        b00 b00Var = new b00(a6Var, 0);
        this.f3912x = b00Var;
        a6Var.setLayoutManager(b00Var);
        a6Var.setNestedScrollingEnabled(true);
        q6 q6Var = new q6(this);
        this.f3911w = q6Var;
        a6Var.setAdapter(q6Var);
        new SparseArray();
        new HashMap();
        addView(a6Var);
        this.d = new a5.a(a6Var);
        a6Var.setOnScrollListener(new b6(this));
        a6Var.setOnItemClickListener(new z5(0, this, sbVar));
        a6Var.setOnItemLongClickListener(new e6(this, sbVar));
        q6Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3906c = frameLayout;
        View view = new View(getContext());
        this.f3904a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.g6.f19672h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.w0(i10, bVar), 0}));
        frameLayout.addView(view, w7.z5.a(8.0f, 0.0f, this.e - 8, 0.0f, 0.0f, -1, 0));
        View view2 = new View(getContext());
        this.f3905b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i10, bVar));
        frameLayout.addView(view2, w7.z5.a(10.0f, 0.0f, this.e - 17, 0.0f, 0.0f, -1, 0));
        frameLayout.addView(k6Var);
        frameLayout.addView(textView);
        f6 f6Var = new f6(this, getContext(), bVar);
        this.L = f6Var;
        f6Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(f6Var, w7.z5.a(-1.0f, 0.0f, 36.0f, 0.0f, 0.0f, -1, 51));
        addView(frameLayout);
    }

    public static void a(w6 w6Var) {
        new sg.y0(w6Var.K.f3677f, 14, false).show();
    }

    public static void b(w6 w6Var) {
        v6 v6Var = w6Var.E;
        if (v6Var != null) {
            v6Var.f3877r.remove(w6Var);
        }
        v6 v6Var2 = w6Var.F;
        w6Var.E = v6Var2;
        if (v6Var2 == null) {
            return;
        }
        ArrayList arrayList = v6Var2.f3877r;
        if (!arrayList.contains(w6Var)) {
            arrayList.add(w6Var);
        }
        w6Var.E.e(w6Var.O, w6Var.T, w6Var.S);
        w6Var.f3911w.E();
        w6Var.f3912x.h1(0, (int) (w6Var.getTopOffset() - w6Var.f3909r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        v6 v6Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f3985x.f(storyItem.dialogId);
            if (sparseArray == null) {
                v6Var = null;
            } else {
                v6Var = (v6) sparseArray.get(storyItem.f19151id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (v6Var != null && v6Var.f3863a == i11) {
                return;
            }
            if (v6Var != null) {
                v6Var.d();
            }
            v6 v6Var2 = new v6(i10, j10, storyItem);
            v6Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.f3985x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f19151id, v6Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f3912x.N0() > this.f3911w.f3591c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        di.k8 k8Var;
        di.ca caVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        d7 d7Var = this.f3913y;
        if (d7Var != null) {
            TL_stories.StoryItem storyItem = d7Var.f2957a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new di.ca(i10, storyItem.privacy);
                }
                return this.f3913y.f2957a.parsedPrivacy.b(user);
            }
            w8 w8Var = d7Var.f2958b;
            if (w8Var != null && (k8Var = w8Var.f3919c) != null && (caVar = k8Var.E0) != null) {
                return caVar.b(user);
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
            if (this.f3913y.f2958b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f3913y.f2958b.e)) {
                            d7 d7Var = this.f3913y;
                            d7Var.f2958b = null;
                            d7Var.f2957a = storyItem;
                            g(this.W, d7Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                a6 a6Var = this.f3909r;
                if (i12 < a6Var.getChildCount()) {
                    View childAt = a6Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.o6) && (R = RecyclerView.R(childAt)) >= 0) {
                        q6 q6Var = this.f3911w;
                        if (R < q6Var.f3591c.size()) {
                            org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                            if (d(((l6) q6Var.f3591c.get(R)).f3280b)) {
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
        a6 a6Var;
        int paddingTop;
        View view = null;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            a6Var = this.f3909r;
            if (i11 >= a6Var.getChildCount()) {
                break;
            }
            View childAt = a6Var.getChildAt(i11);
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
            paddingTop = a6Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f3906c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            a7 a7Var = (a7) this;
            int intValue = ((Integer) a7Var.getTag()).intValue();
            e7 e7Var = a7Var.f2830a0.e;
            x6 x6Var = e7Var.h;
            if (intValue == e7Var.E.getCurrentItem()) {
                x6Var.setAlpha(Utilities.clamp(f7 / e7Var.d, 1.0f, 0.0f));
                x6Var.setTranslationY((-(e7Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != a6Var.getPaddingTop()) {
                int i12 = (frameLayout.getTranslationY() > (a6Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (a6Var.getPaddingTop() / 2.0f) ? 0 : -1));
                a5.a aVar = this.d;
                if (i12 > 0) {
                    aVar.z((int) (-(a6Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.z((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f3909r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(v6 v6Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        q6 q6Var = this.f3911w;
        int size = q6Var.f3591c.size();
        g6 g6Var = this.O;
        if (TextUtils.isEmpty(g6Var.f3083c) && !g6Var.f3082b) {
            i();
        }
        q6Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = v6Var.f3868i;
            if (v6Var == this.E && arrayList != null && this.H < arrayList.size()) {
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

    public final void g(long j10, d7 d7Var) {
        this.W = j10;
        this.f3913y = d7Var;
        i();
        h(false);
        if (d7Var != null && d7Var.f2957a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, d7Var.f2957a.f19151id);
        }
    }

    public float getTopOffset() {
        return this.f3906c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        g6 g6Var = this.O;
        boolean z11 = g6Var.f3082b;
        k6 k6Var = this.P;
        if (z11 != k6Var.f3246s || !z10) {
            ValueAnimator valueAnimator = k6Var.f3247w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                k6Var.f3247w.cancel();
            }
            k6Var.f3246s = z11 ? 1 : 0;
            if (!z10) {
                k6Var.f3245r = 1.0f;
                k6Var.invalidate();
            } else {
                k6Var.e.set(k6Var.f3244n);
                k6Var.f3243f = k6Var.f3242c.getAlpha();
                k6Var.h = k6Var.d.getAlpha();
                k6Var.f3245r = 0.0f;
                k6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                k6Var.f3247w = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(k6Var, 11));
                k6Var.f3247w.addListener(new ah.b(k6Var, 11));
                k6Var.f3247w.setDuration(250L);
                k6Var.f3247w.setInterpolator(es.f24465f);
                k6Var.f3247w.start();
            }
        }
        boolean z12 = g6Var.f3081a;
        rm0 rm0Var = k6Var.v;
        if (z12) {
            v6 v6Var = this.E;
            if (v6Var != null && v6Var.f3866f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        rm0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: bi.w6.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        v6 v6Var = this.E;
        if (v6Var != null) {
            ArrayList arrayList = v6Var.f3877r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f3875p.clear();
        }
        this.f3911w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        sc.a(this, new ah.m0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        v6 v6Var = this.E;
        if (v6Var != null) {
            v6Var.f3877r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        sc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f3906c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f3906c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        a6 a6Var = this.f3909r;
        if (f7 != a6Var.getPaddingBottom()) {
            a6Var.setPadding(0, (int) f7, 0, 0);
            a6Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
