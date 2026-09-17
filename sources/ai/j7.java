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
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.rl0;
public abstract class j7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public i7 E;
    public i7 F;
    public g9 G;
    public int H;
    public boolean I;
    public final rk0 J;
    public final jc K;
    public final t6 L;
    public final u6 M;
    public final f3 N;
    public final u6 O;
    public final y6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View f1047a;
    public final View f1048b;
    public final FrameLayout f1049c;
    public final a5.a d;
    public int e;
    public x6 f1050f;
    public final TextView h;
    public int f1051n;
    public final p6 f1052r;
    public final d f1053s;
    public final int v;
    public final e7 f1054w;
    public final pz f1055x;
    public q7 f1056y;

    public j7(jc jcVar, Context context, u6 u6Var, f3 f3Var) {
        super(context);
        this.e = 96;
        this.O = new u6();
        this.M = u6Var;
        this.N = f3Var;
        d dVar = jcVar.f1121y;
        this.f1053s = dVar;
        this.K = jcVar;
        this.v = jcVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18969j5, dVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        y6 y6Var = new y6(this, getContext());
        this.P = y6Var;
        p6 p6Var = new p6(this, context, dVar);
        this.f1052r = p6Var;
        p6Var.setClipToPadding(false);
        this.J = new rk0(p6Var, true);
        pz pzVar = new pz(p6Var, 0);
        this.f1055x = pzVar;
        p6Var.setLayoutManager(pzVar);
        p6Var.setNestedScrollingEnabled(true);
        e7 e7Var = new e7(this);
        this.f1054w = e7Var;
        p6Var.setAdapter(e7Var);
        new SparseArray();
        new HashMap();
        addView(p6Var);
        this.d = new a5.a(p6Var);
        p6Var.setOnScrollListener(new r(this, 1));
        p6Var.setOnItemClickListener(new o6(0, this, jcVar));
        p6Var.setOnItemLongClickListener(new s6(this, jcVar));
        e7Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1049c = frameLayout;
        View view = new View(getContext());
        this.f1047a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.j6.f18933h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i10, dVar), 0}));
        frameLayout.addView(view, w7.x5.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f1048b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, dVar));
        frameLayout.addView(view2, w7.x5.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(y6Var);
        frameLayout.addView(textView);
        t6 t6Var = new t6(this, getContext(), dVar);
        this.L = t6Var;
        t6Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(t6Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(j7 j7Var) {
        new rg.x0(j7Var.K.f1080f, 14, false).show();
    }

    public static void b(j7 j7Var) {
        i7 i7Var = j7Var.E;
        if (i7Var != null) {
            i7Var.f1009r.remove(j7Var);
        }
        i7 i7Var2 = j7Var.F;
        j7Var.E = i7Var2;
        if (i7Var2 == null) {
            return;
        }
        ArrayList arrayList = i7Var2.f1009r;
        if (!arrayList.contains(j7Var)) {
            arrayList.add(j7Var);
        }
        j7Var.E.e(j7Var.O, j7Var.T, j7Var.S);
        j7Var.f1054w.E();
        j7Var.f1055x.h1(0, (int) (j7Var.getTopOffset() - j7Var.f1052r.getPaddingTop()));
    }

    public static void f(int i10, long j3, TL_stories.StoryItem storyItem) {
        i7 i7Var;
        int i11;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f1212x.f(storyItem.dialogId);
            if (sparseArray == null) {
                i7Var = null;
            } else {
                i7Var = (i7) sparseArray.get(storyItem.f18357id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i11 = 0;
            } else {
                i11 = storyViews.views_count;
            }
            if (i7Var != null && i7Var.f995a == i11) {
                return;
            }
            if (i7Var != null) {
                i7Var.d();
            }
            i7 i7Var2 = new i7(i10, j3, storyItem);
            i7Var2.c();
            if (sparseArray == null) {
                a0.i iVar = MessagesController.getInstance(i10).storiesController.f1212x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                iVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.f18357id, i7Var2);
        }
    }

    public final void c() {
        if (this.E != null && this.f1055x.N0() > this.f1054w.f769c.size() - 10) {
            this.E.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        ci.o8 o8Var;
        ci.ga gaVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        q7 q7Var = this.f1056y;
        if (q7Var != null) {
            TL_stories.StoryItem storyItem = q7Var.f1430a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new ci.ga(i10, storyItem.privacy);
                }
                return this.f1056y.f1430a.parsedPrivacy.b(user);
            }
            k9 k9Var = q7Var.f1431b;
            if (k9Var != null && (o8Var = k9Var.f1143c) != null && (gaVar = o8Var.E0) != null) {
                return gaVar.b(user);
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int S;
        float f7;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.f1056y.f1431b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f1056y.f1431b.e)) {
                            q7 q7Var = this.f1056y;
                            q7Var.f1431b = null;
                            q7Var.f1430a = storyItem;
                            g(this.W, q7Var);
                            return;
                        }
                        i12++;
                    }
                }
            }
        } else if (i10 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                p6 p6Var = this.f1052r;
                if (i12 < p6Var.getChildCount()) {
                    View childAt = p6Var.getChildAt(i12);
                    if ((childAt instanceof org.telegram.ui.Cells.n6) && (S = RecyclerView.S(childAt)) >= 0) {
                        e7 e7Var = this.f1054w;
                        if (S < e7Var.f769c.size()) {
                            org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                            if (d(((z6) e7Var.f769c.get(S)).f1786b)) {
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
        p6 p6Var;
        int paddingTop;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            p6Var = this.f1052r;
            if (i10 >= p6Var.getChildCount()) {
                break;
            }
            View childAt = p6Var.getChildAt(i10);
            int T = RecyclerView.T(childAt);
            if (T < i11 || i11 == -1) {
                view = childAt;
                i11 = T;
            }
            i10++;
        }
        if (i11 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i11 > 0) {
            paddingTop = 0;
        } else {
            paddingTop = p6Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f1049c;
        float f7 = paddingTop;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            n7 n7Var = (n7) this;
            int intValue = ((Integer) n7Var.getTag()).intValue();
            r7 r7Var = n7Var.f1300a0.e;
            k7 k7Var = r7Var.h;
            if (intValue == r7Var.E.getCurrentItem()) {
                k7Var.setAlpha(Utilities.clamp(f7 / r7Var.d, 1.0f, 0.0f));
                k7Var.setTranslationY((-(r7Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != p6Var.getPaddingTop()) {
                a5.a aVar = this.d;
                if (frameLayout.getTranslationY() > p6Var.getPaddingTop() / 2.0f) {
                    aVar.v((int) (-(p6Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.v((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f1052r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(i7 i7Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        e7 e7Var = this.f1054w;
        int size = e7Var.f769c.size();
        u6 u6Var = this.O;
        if (TextUtils.isEmpty(u6Var.f1580c) && !u6Var.f1579b) {
            i();
        }
        e7Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = i7Var.f1000i;
            if (i7Var == this.E && arrayList != null && this.H < arrayList.size()) {
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

    public final void g(long j3, q7 q7Var) {
        this.W = j3;
        this.f1056y = q7Var;
        i();
        h(false);
        if (q7Var != null && q7Var.f1430a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j3, q7Var.f1430a.f18357id);
        }
    }

    public float getTopOffset() {
        return this.f1049c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        u6 u6Var = this.O;
        boolean z11 = u6Var.f1579b;
        y6 y6Var = this.P;
        if (z11 != y6Var.f1759s || !z10) {
            ValueAnimator valueAnimator = y6Var.f1760w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                y6Var.f1760w.cancel();
            }
            y6Var.f1759s = z11 ? 1 : 0;
            if (!z10) {
                y6Var.f1758r = 1.0f;
                y6Var.invalidate();
            } else {
                y6Var.e.set(y6Var.f1757n);
                y6Var.f1756f = y6Var.f1755c.getAlpha();
                y6Var.h = y6Var.d.getAlpha();
                y6Var.f1758r = 0.0f;
                y6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                y6Var.f1760w = ofFloat;
                ofFloat.addUpdateListener(new a(y6Var, 10));
                y6Var.f1760w.addListener(new b(y6Var, 8));
                y6Var.f1760w.setDuration(250L);
                y6Var.f1760w.setInterpolator(qr.f27380f);
                y6Var.f1760w.start();
            }
        }
        boolean z12 = u6Var.f1578a;
        rl0 rl0Var = y6Var.v;
        if (z12) {
            i7 i7Var = this.E;
            if (i7Var != null && i7Var.f998f) {
                i10 = R.drawable.menu_views_reposts3;
            } else {
                i10 = R.drawable.menu_views_reactions3;
            }
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        rl0Var.a(i10, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: ai.j7.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        i7 i7Var = this.E;
        if (i7Var != null) {
            ArrayList arrayList = i7Var.f1009r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.f1007p.clear();
        }
        this.f1054w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        org.telegram.ui.Components.oc.a(this, new w4(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        i7 i7Var = this.E;
        if (i7Var != null) {
            i7Var.f1009r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        org.telegram.ui.Components.oc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f1049c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f1049c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        p6 p6Var = this.f1052r;
        if (f7 != p6Var.getPaddingBottom()) {
            p6Var.setPadding(0, (int) f7, 0, 0);
            p6Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
