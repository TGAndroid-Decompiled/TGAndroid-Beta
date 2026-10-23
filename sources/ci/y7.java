package ci;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
public class y7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public yc H;
    public org.telegram.ui.ActionBar.d6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public v7 Q;
    public View R;
    public int f6211c;
    public TL_stories.StoryItem d;
    public boolean f6217l;
    public boolean f6218m;
    public int f6219n;
    public boolean f6220o;
    public boolean f6221p;
    public int f6222q;
    public boolean f6223r;
    public long f6224s;
    public float f6225t;
    public boolean v;
    public boolean f6227w;
    public long f6228x;
    public int f6229y;
    public int f6230z;
    public boolean f6209a = true;
    public boolean f6210b = true;
    public float e = 1.0f;
    public float f6212f = 0.0f;
    public float f6213g = 0.0f;
    public float h = 0.0f;
    public float f6214i = 0.0f;
    public float f6215j = 0.0f;
    public boolean f6216k = true;
    public float f6226u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public y7(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.E = z10;
        this.J = d6Var;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        i7 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f6228x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f6228x));
                } else {
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f6228x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f6223r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f6228x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f6228x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f6228x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f6228x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    yc ycVar = this.H;
                    if (ycVar == null) {
                        this.H = new yc(view, 1.5f, 5.0f);
                    } else {
                        ycVar.f32631a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        v7 v7Var = this.Q;
                        if (v7Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(v7Var);
                        }
                        v7 v7Var2 = new v7(4, this, view);
                        this.Q = v7Var2;
                        AndroidUtilities.runOnUIThread(v7Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                yc ycVar2 = this.H;
                if (ycVar2 != null) {
                    ycVar2.f32631a = view;
                    ycVar2.c(false);
                }
                v7 v7Var3 = this.Q;
                if (v7Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(v7Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            yc ycVar3 = this.H;
            if (ycVar3 != null) {
                ycVar3.f32631a = view;
                ycVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f6228x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                i7 storiesController2 = messagesController.getStoriesController();
                if (this.f6223r) {
                    f(0L);
                } else if (this.f6228x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f6228x)) {
                        f(this.f6228x);
                    } else {
                        long j10 = this.f6228x;
                        if (j10 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j10));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new c8().a(this.f6228x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j10));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new c8().a(this.f6228x, view, this);
                            }
                        }
                    }
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            v7 v7Var4 = this.Q;
            if (v7Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(v7Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        yc ycVar = this.H;
        if (ycVar == null) {
            return 1.0f;
        }
        return ycVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        r7 r7Var;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                r7Var = r7.a((jm0) parent);
            } else {
                r7Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j10, r7Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
