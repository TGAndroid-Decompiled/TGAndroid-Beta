package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yz;
public abstract class u5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public t5 E;
    public t5 F;
    public d7 G;
    public int H;
    public boolean I;
    public final ol0 J;
    public final aa K;
    public final e5 L;
    public final f5 M;
    public final ai.r0 N;
    public final f5 O;
    public final j5 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f6046a;
    public final View f6047b;
    public final FrameLayout f6048c;
    public final a5.a d;
    public int e;
    public i5 f6049f;
    public final TextView h;
    public int f6050n;
    public final z4 f6051r;
    public final b f6052s;
    public final int v;
    public final p5 f6053w;
    public final yz f6054x;
    public b6 f6055y;

    public u5(aa aaVar, Context context, f5 f5Var, ai.r0 r0Var) {
        super(context);
        this.e = 96;
        this.O = new f5();
        this.M = f5Var;
        this.N = r0Var;
        b bVar = aaVar.f5228y;
        this.f6052s = bVar;
        this.K = aaVar;
        this.v = aaVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21099j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        j5 j5Var = new j5(this, getContext());
        this.P = j5Var;
        z4 z4Var = new z4(this, context, bVar);
        this.f6051r = z4Var;
        z4Var.setClipToPadding(false);
        this.J = new ol0(z4Var, true);
        yz yzVar = new yz(z4Var, 0);
        this.f6054x = yzVar;
        z4Var.setLayoutManager(yzVar);
        z4Var.setNestedScrollingEnabled(true);
        p5 p5Var = new p5(this);
        this.f6053w = p5Var;
        z4Var.setAdapter(p5Var);
        new SparseArray();
        new HashMap();
        addView(z4Var);
        this.d = new a5.a(z4Var);
        z4Var.setOnScrollListener(new a5(this));
        z4Var.setOnItemClickListener(new y4(0, this, aaVar));
        z4Var.setOnItemLongClickListener(new d5(this, aaVar));
        p5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6048c = frameLayout;
        View view = new View(getContext());
        this.f6046a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.h6.f21064h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.w0(i10, bVar), 0}));
        frameLayout.addView(view, w7.z5.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f6047b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i10, bVar));
        frameLayout.addView(view2, w7.z5.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(j5Var);
        frameLayout.addView(textView);
        e5 e5Var = new e5(this, getContext(), bVar);
        this.L = e5Var;
        e5Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(e5Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(u5 u5Var) {
        new sg.y0(u5Var.K.f5187f, 14, false).show();
    }

    public static void b(u5 u5Var) {
        t5 t5Var = u5Var.E;
        if (t5Var != null) {
            t5Var.f6020r.remove(u5Var);
        }
        t5 t5Var2 = u5Var.F;
        u5Var.E = t5Var2;
        if (t5Var2 == null) {
            return;
        }
        ArrayList arrayList = t5Var2.f6020r;
        if (!arrayList.contains(u5Var)) {
            arrayList.add(u5Var);
        }
        u5Var.E.e(u5Var.O, u5Var.T, u5Var.S);
        u5Var.f6053w.E();
        u5Var.f6054x.h1(0, (int) (u5Var.getTopOffset() - u5Var.f6051r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        t5 t5Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f5510x.f(storyItem.dialogId);
            if (sparseArray == null) {
                t5Var = null;
            } else {
                t5Var = (t5) sparseArray.get(storyItem.f20513id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (t5Var != null && t5Var.f6006a == i11) {
                return;
            }
            if (t5Var != null) {
                t5Var.d();
            }
            t5 t5Var2 = new t5(i10, j10, storyItem);
            t5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.f5510x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f20513id, t5Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f6054x.N0() > this.f6053w.f5730c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        ei.a8 a8Var;
        ei.p9 p9Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        b6 b6Var = this.f6055y;
        if (b6Var != null) {
            TL_stories.StoryItem storyItem = b6Var.f5249a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new ei.p9(i10, storyItem.privacy);
                }
                return this.f6055y.f5249a.parsedPrivacy.b(user);
            }
            h7 h7Var = b6Var.f5250b;
            if (h7Var != null && (a8Var = h7Var.f5468c) != null && (p9Var = a8Var.E0) != null) {
                return p9Var.b(user);
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
            if (this.f6055y.f5250b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f6055y.f5250b.e)) {
                            b6 b6Var = this.f6055y;
                            b6Var.f5250b = null;
                            b6Var.f5249a = storyItem;
                            g(this.W, b6Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                z4 z4Var = this.f6051r;
                if (i12 < z4Var.getChildCount()) {
                    View childAt = z4Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                        p5 p5Var = this.f6053w;
                        if (R < p5Var.f5730c.size()) {
                            org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                            if (d(((k5) p5Var.f5730c.get(R)).f5562b)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.5f;
                            }
                            n6Var.a(f7, true);
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
        z4 z4Var;
        int paddingTop;
        View view = null;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            z4Var = this.f6051r;
            if (i11 >= z4Var.getChildCount()) {
                break;
            }
            View childAt = z4Var.getChildAt(i11);
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
            paddingTop = z4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f6048c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            y5 y5Var = (y5) this;
            int intValue = ((Integer) y5Var.getTag()).intValue();
            c6 c6Var = y5Var.f6205a0.e;
            v5 v5Var = c6Var.h;
            if (intValue == c6Var.E.getCurrentItem()) {
                v5Var.setAlpha(Utilities.clamp(f7 / c6Var.d, 1.0f, 0.0f));
                v5Var.setTranslationY((-(c6Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != z4Var.getPaddingTop()) {
                int i12 = (frameLayout.getTranslationY() > (z4Var.getPaddingTop() / 2.0f) ? 1 : (frameLayout.getTranslationY() == (z4Var.getPaddingTop() / 2.0f) ? 0 : -1));
                a5.a aVar = this.d;
                if (i12 > 0) {
                    aVar.z((int) (-(z4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.z((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f6051r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(t5 t5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        p5 p5Var = this.f6053w;
        int size = p5Var.f5730c.size();
        f5 f5Var = this.O;
        if (TextUtils.isEmpty(f5Var.f5387c) && !f5Var.f5386b) {
            i();
        }
        p5Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = t5Var.f6011i;
            if (t5Var == this.E && arrayList != null && this.H < arrayList.size()) {
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

    public final void g(long j10, b6 b6Var) {
        this.W = j10;
        this.f6055y = b6Var;
        i();
        h(false);
        if (b6Var != null && b6Var.f5249a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, b6Var.f5249a.f20513id);
        }
    }

    public float getTopOffset() {
        return this.f6048c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        f5 f5Var = this.O;
        boolean z11 = f5Var.f5386b;
        j5 j5Var = this.P;
        if (z11 != j5Var.f5538s || !z10) {
            ValueAnimator valueAnimator = j5Var.f5539w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                j5Var.f5539w.cancel();
            }
            j5Var.f5538s = z11 ? 1 : 0;
            if (!z10) {
                j5Var.f5537r = 1.0f;
                j5Var.invalidate();
            } else {
                j5Var.e.set(j5Var.f5536n);
                j5Var.f5535f = j5Var.f5534c.getAlpha();
                j5Var.h = j5Var.d.getAlpha();
                j5Var.f5537r = 0.0f;
                j5Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j5Var.f5539w = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(j5Var, 18));
                j5Var.f5539w.addListener(new ah.b(j5Var, 13));
                j5Var.f5539w.setDuration(250L);
                j5Var.f5539w.setInterpolator(bs.f25024f);
                j5Var.f5539w.start();
            }
        }
        boolean z12 = f5Var.f5385a;
        om0 om0Var = j5Var.v;
        if (z12) {
            t5 t5Var = this.E;
            if (t5Var != null && t5Var.f6009f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        om0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: ci.u5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        t5 t5Var = this.E;
        if (t5Var != null) {
            ArrayList arrayList = t5Var.f6020r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f6018p.clear();
        }
        this.f6053w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.a(this, new ah.m0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        t5 t5Var = this.E;
        if (t5Var != null) {
            t5Var.f6020r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        qc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f6048c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f6048c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        z4 z4Var = this.f6051r;
        if (f7 != z4Var.getPaddingBottom()) {
            z4Var.setPadding(0, (int) f7, 0, 0);
            z4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
