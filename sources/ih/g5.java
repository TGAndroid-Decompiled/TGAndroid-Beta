package ih;

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
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
public abstract class g5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public f5 A;
    public f5 B;
    public q6 C;
    public int D;
    public boolean E;
    public final dk0 F;
    public final m9 G;
    public final r4 H;
    public final s4 I;
    public final hg.i J;
    public final s4 K;
    public final w4 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Drawable Q;
    public boolean R;
    public long S;
    public final View f11475a;
    public final View f11476b;
    public final FrameLayout f11477c;
    public final a6.a d;
    public int f11478e;
    public v4 f11479f;
    public final TextView h;
    public int f11480n;
    public final n4 f11481r;
    public final b f11482s;
    public final int v;
    public final c5 f11483w;
    public final bz f11484x;
    public n5 f11485y;

    public g5(m9 m9Var, Context context, s4 s4Var, hg.i iVar) {
        super(context);
        this.f11478e = 96;
        this.K = new s4();
        this.I = s4Var;
        this.J = iVar;
        b bVar = m9Var.f11834y;
        this.f11482s = bVar;
        this.G = m9Var;
        this.v = m9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        w4 w4Var = new w4(this, getContext());
        this.L = w4Var;
        n4 n4Var = new n4(this, context, bVar);
        this.f11481r = n4Var;
        n4Var.setClipToPadding(false);
        this.F = new dk0(n4Var, true);
        bz bzVar = new bz(n4Var, 0);
        this.f11484x = bzVar;
        n4Var.setLayoutManager(bzVar);
        n4Var.setNestedScrollingEnabled(true);
        c5 c5Var = new c5(this);
        this.f11483w = c5Var;
        n4Var.setAdapter(c5Var);
        new SparseArray();
        new HashMap();
        addView(n4Var);
        this.d = new a6.a(n4Var);
        n4Var.setOnScrollListener(new bg.o2(this, 11));
        n4Var.setOnItemClickListener(new bg.b1(2, this, m9Var));
        n4Var.setOnItemLongClickListener(new q4(this, m9Var));
        c5Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11477c = frameLayout;
        View view = new View(getContext());
        this.f11475a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.f6.v0(i9, bVar), 0}));
        frameLayout.addView(view, g7.e6.d(-1, 8.0f, 0, 0.0f, this.f11478e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f11476b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i9, bVar));
        frameLayout.addView(view2, g7.e6.d(-1, 10.0f, 0, 0.0f, this.f11478e - 17, 0.0f, 0.0f));
        frameLayout.addView(w4Var);
        frameLayout.addView(textView);
        r4 r4Var = new r4(this, getContext(), bVar);
        this.H = r4Var;
        r4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(r4Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(g5 g5Var) {
        new zf.x0(g5Var.G.f11797f, 14, false).show();
    }

    public static void b(g5 g5Var) {
        f5 f5Var = g5Var.A;
        if (f5Var != null) {
            f5Var.f11447r.remove(g5Var);
        }
        f5 f5Var2 = g5Var.B;
        g5Var.A = f5Var2;
        if (f5Var2 == null) {
            return;
        }
        ArrayList arrayList = f5Var2.f11447r;
        if (!arrayList.contains(g5Var)) {
            arrayList.add(g5Var);
        }
        g5Var.A.e(g5Var.K, g5Var.P, g5Var.O);
        g5Var.f11483w.E();
        g5Var.f11484x.h1(0, (int) (g5Var.getTopOffset() - g5Var.f11481r.getPaddingTop()));
    }

    public static void f(int i9, long j10, TL_stories.StoryItem storyItem) {
        f5 f5Var;
        int i10;
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i9).storiesController.f12256x.f(storyItem.dialogId);
            if (sparseArray == null) {
                f5Var = null;
            } else {
                f5Var = (f5) sparseArray.get(storyItem.f22617id);
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                i10 = 0;
            } else {
                i10 = storyViews.views_count;
            }
            if (f5Var != null && f5Var.f11432a == i10) {
                return;
            }
            if (f5Var != null) {
                f5Var.d();
            }
            f5 f5Var2 = new f5(i9, j10, storyItem);
            f5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i9).storiesController.f12256x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f22617id, f5Var2);
        }
    }

    public final void c() {
        if (this.A != null && this.f11484x.N0() > this.f11483w.f11289c.size() - 10) {
            this.A.c();
        }
    }

    public final boolean d(TL_stories.StoryView storyView) {
        kh.a8 a8Var;
        kh.r9 r9Var;
        if (storyView == null) {
            return true;
        }
        int i9 = this.v;
        if (MessagesController.getInstance(i9).getStoriesController().L(storyView) || MessagesController.getInstance(i9).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(storyView.user_id));
        n5 n5Var = this.f11485y;
        if (n5Var != null) {
            TL_stories.StoryItem storyItem = n5Var.f11843a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new kh.r9(i9, storyItem.privacy);
                }
                return this.f11485y.f11843a.parsedPrivacy.b(user);
            }
            u6 u6Var = n5Var.f11844b;
            if (u6Var != null && (a8Var = u6Var.f12193c) != null && (r9Var = a8Var.E0) != null) {
                return r9Var.b(user);
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int R;
        float f10;
        int i11 = 0;
        if (i9 == NotificationCenter.storiesUpdated) {
            if (this.f11485y.f11844b != null) {
                int i12 = this.v;
                TL_stories.PeerStories y10 = MessagesController.getInstance(i12).storiesController.y(UserConfig.getInstance(i12).clientUserId);
                if (y10 != null) {
                    while (i11 < y10.stories.size()) {
                        TL_stories.StoryItem storyItem = y10.stories.get(i11);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f11485y.f11844b.f12194e)) {
                            n5 n5Var = this.f11485y;
                            n5Var.f11844b = null;
                            n5Var.f11843a = storyItem;
                            g(this.S, n5Var);
                            return;
                        }
                        i11++;
                    }
                }
            }
        } else if (i9 != NotificationCenter.storiesBlocklistUpdate) {
        } else {
            while (true) {
                n4 n4Var = this.f11481r;
                if (i11 < n4Var.getChildCount()) {
                    View childAt = n4Var.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.n6) && (R = RecyclerView.R(childAt)) >= 0) {
                        c5 c5Var = this.f11483w;
                        if (R < c5Var.f11289c.size()) {
                            org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                            if (d(((x4) c5Var.f11289c.get(R)).f12320b)) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.5f;
                            }
                            n6Var.a(f10, true);
                        }
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n4 n4Var;
        int paddingTop;
        View view = null;
        int i9 = 0;
        int i10 = -1;
        while (true) {
            n4Var = this.f11481r;
            if (i9 >= n4Var.getChildCount()) {
                break;
            }
            View childAt = n4Var.getChildAt(i9);
            int S = RecyclerView.S(childAt);
            if (S < i10 || i10 == -1) {
                view = childAt;
                i10 = S;
            }
            i9++;
        }
        if (i10 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else if (i10 > 0) {
            paddingTop = 0;
        } else {
            paddingTop = n4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f11477c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            k5 k5Var = (k5) this;
            int intValue = ((Integer) k5Var.getTag()).intValue();
            o5 o5Var = k5Var.T.f11712e;
            h5 h5Var = o5Var.h;
            if (intValue == o5Var.A.getCurrentItem()) {
                h5Var.setAlpha(Utilities.clamp(f10 / o5Var.d, 1.0f, 0.0f));
                h5Var.setTranslationY((-(o5Var.d - f10)) / 2.0f);
            }
        }
        this.Q.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.Q.draw(canvas);
        if (this.R) {
            this.R = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != n4Var.getPaddingTop()) {
                a6.a aVar = this.d;
                if (frameLayout.getTranslationY() > n4Var.getPaddingTop() / 2.0f) {
                    aVar.k((int) (-(n4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.k((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f11481r) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.f11478e), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(f5 f5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        c5 c5Var = this.f11483w;
        int size = c5Var.f11289c.size();
        s4 s4Var = this.K;
        if (TextUtils.isEmpty(s4Var.f12117c) && !s4Var.f12116b) {
            i();
        }
        c5Var.E();
        this.F.b(size - 1);
        c();
        if (this.C != null) {
            ArrayList arrayList = f5Var.f11438i;
            if (f5Var == this.A && arrayList != null && this.D < arrayList.size()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = this.D; i9 < arrayList.size(); i9++) {
                    TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i9);
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

    public final void g(long j10, n5 n5Var) {
        this.S = j10;
        this.f11485y = n5Var;
        i();
        h(false);
        if (n5Var != null && n5Var.f11843a != null) {
            NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, n5Var.f11843a.f22617id);
        }
    }

    public float getTopOffset() {
        return this.f11477c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i9;
        s4 s4Var = this.K;
        boolean z11 = s4Var.f12116b;
        w4 w4Var = this.L;
        if (z11 != w4Var.f12299s || !z10) {
            ValueAnimator valueAnimator = w4Var.f12300w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                w4Var.f12300w.cancel();
            }
            w4Var.f12299s = z11 ? 1 : 0;
            if (!z10) {
                w4Var.f12298r = 1.0f;
                w4Var.invalidate();
            } else {
                w4Var.f12295e.set(w4Var.f12297n);
                w4Var.f12296f = w4Var.f12294c.getAlpha();
                w4Var.h = w4Var.d.getAlpha();
                w4Var.f12298r = 0.0f;
                w4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                w4Var.f12300w = ofFloat;
                ofFloat.addUpdateListener(new bg.b(w4Var, 20));
                w4Var.f12300w.addListener(new ag.e(w4Var, 17));
                w4Var.f12300w.setDuration(250L);
                w4Var.f12300w.setInterpolator(gr.f28844f);
                w4Var.f12300w.start();
            }
        }
        boolean z12 = s4Var.f12115a;
        bl0 bl0Var = w4Var.v;
        if (z12) {
            f5 f5Var = this.A;
            if (f5Var != null && f5Var.f11436f) {
                i9 = R.drawable.menu_views_reposts3;
            } else {
                i9 = R.drawable.menu_views_reactions3;
            }
        } else {
            i9 = R.drawable.menu_views_recent3;
        }
        bl0Var.a(i9, z10);
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: ih.g5.i():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        f5 f5Var = this.A;
        if (f5Var != null) {
            ArrayList arrayList = f5Var.f11447r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.A.f11445p.clear();
        }
        this.f11483w.E();
        int i9 = this.v;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        gc.a(this, new fh.y0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
        f5 f5Var = this.A;
        if (f5Var != null) {
            f5Var.f11447r.remove(this);
        }
        int i9 = this.v;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        gc.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f11477c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f11477c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        n4 n4Var = this.f11481r;
        if (f10 != n4Var.getPaddingBottom()) {
            n4Var.setPadding(0, (int) f10, 0, 0);
            n4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.Q = drawable;
    }
}
