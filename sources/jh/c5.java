package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
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
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gk0;

public abstract class c5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public b5 A;
    public b5 B;
    public m6 C;
    public int D;
    public boolean E;
    public final gk0 F;
    public final i9 G;
    public final n4 H;
    public final o4 I;
    public final ig.i J;
    public final o4 K;
    public final s4 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Drawable Q;
    public boolean R;
    public long S;

    public final View f13150a;

    public final View f13151b;

    public final FrameLayout f13152c;
    public final b6.a d;

    public int f13153e;

    public r4 f13154f;
    public final TextView h;

    public int f13155n;

    public final j4 f13156r;

    public final b f13157s;
    public final int v;

    public final y4 f13158w;

    public final dz f13159x;

    public j5 f13160y;

    public c5(i9 i9Var, Context context, o4 o4Var, ig.i iVar) {
        super(context);
        this.f13153e = 96;
        this.K = new o4();
        this.I = o4Var;
        this.J = iVar;
        b bVar = i9Var.f13515y;
        this.f13157s = bVar;
        this.G = i9Var;
        this.v = i9Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        s4 s4Var = new s4(this, getContext());
        this.L = s4Var;
        j4 j4Var = new j4(this, context, bVar);
        this.f13156r = j4Var;
        j4Var.setClipToPadding(false);
        this.F = new gk0(j4Var, true);
        dz dzVar = new dz(j4Var, 0);
        this.f13159x = dzVar;
        j4Var.setLayoutManager(dzVar);
        j4Var.setNestedScrollingEnabled(true);
        y4 y4Var = new y4(this);
        this.f13158w = y4Var;
        j4Var.setAdapter(y4Var);
        new SparseArray();
        new HashMap();
        addView(j4Var);
        this.d = new b6.a(j4Var);
        j4Var.setOnScrollListener(new ag.z2(this, 12));
        j4Var.setOnItemClickListener(new cg.x0(2, this, i9Var));
        j4Var.setOnItemLongClickListener(new m4(this, i9Var));
        y4Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f13152c = frameLayout;
        View view = new View(getContext());
        this.f13150a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.v0(i10, bVar), 0}));
        frameLayout.addView(view, h7.z5.d(-1, 8.0f, 0, 0.0f, this.f13153e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.f13151b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i10, bVar));
        frameLayout.addView(view2, h7.z5.d(-1, 10.0f, 0, 0.0f, this.f13153e - 17, 0.0f, 0.0f));
        frameLayout.addView(s4Var);
        frameLayout.addView(textView);
        n4 n4Var = new n4(this, getContext(), bVar);
        this.H = n4Var;
        n4Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(n4Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(c5 c5Var) {
        new ag.g2(c5Var.G.f13478f, 14, false).show();
    }

    public static void b(c5 c5Var) {
        b5 b5Var = c5Var.A;
        if (b5Var != null) {
            b5Var.f13116r.remove(c5Var);
        }
        b5 b5Var2 = c5Var.B;
        c5Var.A = b5Var2;
        if (b5Var2 == null) {
            return;
        }
        ArrayList arrayList = b5Var2.f13116r;
        if (!arrayList.contains(c5Var)) {
            arrayList.add(c5Var);
        }
        c5Var.A.e(c5Var.K, c5Var.P, c5Var.O);
        c5Var.f13158w.E();
        c5Var.f13159x.h1(0, (int) (c5Var.getTopOffset() - c5Var.f13156r.getPaddingTop()));
    }

    public static void f(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.f13975x.f(storyItem.dialogId);
        b5 b5Var = sparseArray == null ? null : (b5) sparseArray.get(storyItem.f22617id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (b5Var == null || b5Var.f13101a != i11) {
            if (b5Var != null) {
                b5Var.d();
            }
            b5 b5Var2 = new b5(i10, j10, storyItem);
            b5Var2.c();
            if (sparseArray == null) {
                a0.h hVar = MessagesController.getInstance(i10).storiesController.f13975x;
                long j11 = storyItem.dialogId;
                sparseArray = new SparseArray();
                hVar.k(sparseArray, j11);
            }
            sparseArray.put(storyItem.f22617id, b5Var2);
        }
    }

    public final void c() {
        if (this.A == null || this.f13159x.N0() <= this.f13158w.f14152c.size() - 10) {
            return;
        }
        this.A.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        lh.z7 z7Var;
        lh.o9 o9Var;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        j5 j5Var = this.f13160y;
        if (j5Var != null) {
            TL_stories.StoryItem storyItem = j5Var.f13532a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new lh.o9(i10, storyItem.privacy);
                }
                return this.f13160y.f13532a.parsedPrivacy.b(user);
            }
            r6 r6Var = j5Var.f13533b;
            if (r6Var != null && (z7Var = r6Var.f13907c) != null && (o9Var = z7Var.E0) != null) {
                return o9Var.b(user);
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int iR;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.f13160y.f13533b != null) {
                int i13 = this.v;
                TL_stories.PeerStories peerStoriesY = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (peerStoriesY != null) {
                    while (i12 < peerStoriesY.stories.size()) {
                        TL_stories.StoryItem storyItem = peerStoriesY.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.f13160y.f13533b.f13908e)) {
                            j5 j5Var = this.f13160y;
                            j5Var.f13533b = null;
                            j5Var.f13532a = storyItem;
                            g(this.S, j5Var);
                            return;
                        }
                        i12++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.storiesBlocklistUpdate) {
            return;
        }
        while (true) {
            j4 j4Var = this.f13156r;
            if (i12 >= j4Var.getChildCount()) {
                return;
            }
            View childAt = j4Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.k6) && (iR = RecyclerView.R(childAt)) >= 0) {
                y4 y4Var = this.f13158w;
                if (iR < y4Var.f14152c.size()) {
                    ((org.telegram.ui.Cells.k6) childAt).a(d(((t4) y4Var.f14152c.get(iR)).f13997b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
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
            j4Var = this.f13156r;
            if (i10 >= j4Var.getChildCount()) {
                break;
            }
            View childAt = j4Var.getChildAt(i10);
            int iS = RecyclerView.S(childAt);
            if (iS < i11 || i11 == -1) {
                view = childAt;
                i11 = iS;
            }
            i10++;
        }
        if (i11 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else {
            paddingTop = i11 > 0 ? 0 : j4Var.getPaddingTop();
        }
        FrameLayout frameLayout = this.f13152c;
        float f10 = paddingTop;
        if (frameLayout.getTranslationY() != f10) {
            frameLayout.setTranslationY(f10);
            g5 g5Var = (g5) this;
            int iIntValue = ((Integer) g5Var.getTag()).intValue();
            k5 k5Var = g5Var.T.f13387e;
            d5 d5Var = k5Var.h;
            if (iIntValue == k5Var.A.getCurrentItem()) {
                d5Var.setAlpha(Utilities.clamp(f10 / k5Var.d, 1.0f, 0.0f));
                d5Var.setTranslationY((-(k5Var.d - f10)) / 2.0f);
            }
        }
        this.Q.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.Q.draw(canvas);
        if (this.R) {
            this.R = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != j4Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop2 = j4Var.getPaddingTop() / 2.0f;
                b6.a aVar = this.d;
                if (translationY > paddingTop2) {
                    aVar.k((int) (-(j4Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.k((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f13156r) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(this.f13153e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    public final void e(b5 b5Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        y4 y4Var = this.f13158w;
        int size = y4Var.f14152c.size();
        o4 o4Var = this.K;
        if (TextUtils.isEmpty(o4Var.f13747c) && !o4Var.f13746b) {
            i();
        }
        y4Var.E();
        this.F.b(size - 1);
        c();
        if (this.C != null) {
            ArrayList arrayList = b5Var.f13107i;
            if (b5Var != this.A || arrayList == null || this.D >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = this.D; i10 < arrayList.size(); i10++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.D = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.C.F(arrayList2);
        }
    }

    public final void g(long j10, j5 j5Var) {
        this.S = j10;
        this.f13160y = j5Var;
        i();
        h(false);
        if (j5Var == null || j5Var.f13532a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j10, j5Var.f13532a.f22617id);
    }

    public float getTopOffset() {
        return this.f13152c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        o4 o4Var = this.K;
        boolean z11 = o4Var.f13746b;
        s4 s4Var = this.L;
        if (z11 != s4Var.f13948s || !z10) {
            ValueAnimator valueAnimator = s4Var.f13949w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                s4Var.f13949w.cancel();
            }
            s4Var.f13948s = z11 ? 1 : 0;
            if (z10) {
                s4Var.f13944e.set(s4Var.f13946n);
                s4Var.f13945f = s4Var.f13943c.getAlpha();
                s4Var.h = s4Var.d.getAlpha();
                s4Var.f13947r = 0.0f;
                s4Var.invalidate();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s4Var.f13949w = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ag.u(s4Var, 23));
                s4Var.f13949w.addListener(new ag.r1(s4Var, 19));
                s4Var.f13949w.setDuration(250L);
                s4Var.f13949w.setInterpolator(er.f28122f);
                s4Var.f13949w.start();
            } else {
                s4Var.f13947r = 1.0f;
                s4Var.invalidate();
            }
        }
        boolean z12 = o4Var.f13745a;
        el0 el0Var = s4Var.v;
        if (z12) {
            b5 b5Var = this.A;
            i10 = (b5Var == null || !b5Var.f13105f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        el0Var.a(i10, z10);
    }

    public final void i() {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        this.N = false;
        this.P = false;
        this.O = false;
        TL_stories.StoryItem storyItem = this.f13160y.f13532a;
        n4 n4Var = this.H;
        s4 s4Var = this.L;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i13 = storyViews.views_count;
                this.N = i13 >= 15;
                this.O = storyViews.reactions_count >= (BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 10);
                this.P = (storyItem.dialogId < 0 || i13 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            }
            int i14 = this.v;
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i14).storiesController.f13975x.f(storyItem.dialogId);
            b5 b5Var = sparseArray != null ? (b5) sparseArray.get(storyItem.f22617id) : null;
            this.B = b5Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i15 = storyViews2 == null ? 0 : storyViews2.views_count;
            o4 o4Var = this.K;
            if (b5Var == null || !(b5Var.f13105f || b5Var.f13101a == i15)) {
                if (b5Var != null) {
                    b5Var.d();
                }
                b5 b5Var2 = new b5(i14, this.S, storyItem);
                this.B = b5Var2;
                b5Var2.e(o4Var, this.P, this.O);
                this.B.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.f22617id, this.B);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.f22617id, this.B);
                    MessagesController.getInstance(i14).storiesController.f13975x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                b5Var.e(o4Var, this.P, this.O);
            }
            b5 b5Var3 = this.A;
            if (b5Var3 != null) {
                b5Var3.f13116r.remove(this);
            }
            b5 b5Var4 = this.B;
            this.A = b5Var4;
            if (b5Var4 != null && this.E) {
                ArrayList arrayList = b5Var4.f13116r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            b5 b5Var5 = this.A;
            if (b5Var5 == null || !b5Var5.f13108j || UserConfig.getInstance(i14).isPremium()) {
                b5 b5Var6 = this.A;
                if (!b5Var6.f13104e && !b5Var6.f13111m && b5Var6.f13106g.isEmpty() && this.A.f13107i.isEmpty() && TextUtils.isEmpty(this.A.f13117s.f13747c)) {
                    this.N = false;
                    this.O = false;
                    this.P = false;
                    if (this.A.f13105f) {
                        i12 = R.string.Reactions;
                    } else {
                        i12 = R.string.Viewers;
                    }
                    textView.setText(LocaleController.getString(i12));
                    n4Var.setVisibility(8);
                    s4Var.setVisibility(8);
                    this.f13153e = 46;
                } else {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.N = false;
                        this.O = false;
                        this.P = false;
                        textView.setText(LocaleController.getString(this.A.f13105f ? R.string.Reactions : R.string.Viewers));
                        n4Var.setVisibility(8);
                        s4Var.setVisibility(8);
                        this.f13153e = 46;
                    } else {
                        s4Var.setVisibility(0);
                        b5 b5Var7 = this.A;
                        if (b5Var7.f13109k) {
                            textView.setText(LocaleController.getString(b5Var7.f13105f ? R.string.Reactions : R.string.Viewers));
                            this.N = false;
                            this.O = false;
                            this.P = false;
                        } else {
                            if (b5Var7.b() >= 20 || this.A.b() >= storyItem.views.views_count) {
                                if (!this.A.f13105f || storyItem.views.views_count < 15) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.N = z10;
                                TL_stories.StoryViews storyViews4 = storyItem.views;
                                i10 = storyViews4.reactions_count;
                                if (BuildVars.DEBUG_VERSION) {
                                    i11 = 5;
                                } else {
                                    i11 = 10;
                                }
                                if (i10 >= i11) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.O = z11;
                                this.P = (storyItem.dialogId >= 0 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            } else {
                                b5 b5Var8 = this.A;
                                if (b5Var8.f13104e || b5Var8.f13111m) {
                                    if (this.A.f13105f) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    this.N = z10;
                                    TL_stories.StoryViews storyViews5 = storyItem.views;
                                    i10 = storyViews5.reactions_count;
                                    if (BuildVars.DEBUG_VERSION) {
                                        i11 = 5;
                                    } else {
                                        i11 = 10;
                                    }
                                    if (i10 >= i11) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    this.O = z11;
                                    this.P = (storyItem.dialogId >= 0 || storyViews5.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                                } else {
                                    this.N = false;
                                    this.O = false;
                                    this.P = false;
                                }
                            }
                            textView.setText(LocaleController.getString(this.A.f13105f ? R.string.Reactions : R.string.Viewers));
                        }
                        n4Var.setVisibility(this.N ? 0 : 8);
                        this.f13153e = this.N ? 96 : 46;
                    }
                }
            } else {
                this.N = false;
                this.O = false;
                this.P = false;
                if (this.A.f13105f) {
                    i12 = R.string.Reactions;
                } else {
                    i12 = R.string.Viewers;
                }
                textView.setText(LocaleController.getString(i12));
                n4Var.setVisibility(8);
                s4Var.setVisibility(8);
                this.f13153e = 46;
            }
        } else {
            this.f13153e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            n4Var.setVisibility(8);
            s4Var.setVisibility(8);
        }
        s4Var.f13941a.setVisibility(this.O ? 0 : 8);
        s4Var.f13943c.setVisibility(this.P ? 0 : 8);
        s4Var.d.setVisibility(this.P ? 0 : 8);
        if (this.P) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.f13150a.getLayoutParams()).topMargin = AndroidUtilities.dp(this.f13153e - 8);
        ((ViewGroup.MarginLayoutParams) this.f13151b.getLayoutParams()).topMargin = AndroidUtilities.dp(this.f13153e - 17);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        b5 b5Var = this.A;
        if (b5Var != null) {
            ArrayList arrayList = b5Var.f13116r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.A.f13114p.clear();
        }
        this.f13158w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ec.a(this, new gh.w0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
        b5 b5Var = this.A;
        if (b5Var != null) {
            b5Var.f13116r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        ec.h(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f13152c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.f13152c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f10) {
        j4 j4Var = this.f13156r;
        if (f10 != j4Var.getPaddingBottom()) {
            j4Var.setPadding(0, (int) f10, 0, 0);
            j4Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.Q = drawable;
    }
}
