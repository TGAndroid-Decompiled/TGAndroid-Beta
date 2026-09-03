package nh;

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
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.LaunchActivity;
public class i7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public rc H;
    public org.telegram.ui.ActionBar.f6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public n4 Q;
    public View R;
    public int f15402c;
    public TL_stories.StoryItem d;
    public boolean f15408l;
    public boolean f15409m;
    public int f15410n;
    public boolean f15411o;
    public boolean f15412p;
    public int f15413q;
    public boolean f15414r;
    public long f15415s;
    public float f15416t;
    public boolean v;
    public boolean f15418w;
    public long f15419x;
    public int f15420y;
    public int f15421z;
    public boolean f15400a = true;
    public boolean f15401b = true;
    public float e = 1.0f;
    public float f15403f = 0.0f;
    public float f15404g = 0.0f;
    public float h = 0.0f;
    public float f15405i = 0.0f;
    public float f15406j = 0.0f;
    public boolean f15407k = true;
    public float f15417u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public i7(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        this.E = z4;
        this.J = f6Var;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z4;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        t6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z10 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f15419x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f15419x));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f15419x));
                }
                if (c(chat, user)) {
                    z4 = true;
                } else if (this.f15414r) {
                    z4 = !storiesController.h.isEmpty();
                } else {
                    if (this.f15419x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f15419x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f15419x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z10 = true;
                    }
                    z4 = z10;
                }
                if (this.f15419x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z4) {
                    rc rcVar = this.H;
                    if (rcVar == null) {
                        this.H = new rc(view, 1.5f, 5.0f);
                    } else {
                        rcVar.f28450a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        n4 n4Var = this.Q;
                        if (n4Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(n4Var);
                        }
                        n4 n4Var2 = new n4(17, this, view);
                        this.Q = n4Var2;
                        AndroidUtilities.runOnUIThread(n4Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                rc rcVar2 = this.H;
                if (rcVar2 != null) {
                    rcVar2.f28450a = view;
                    rcVar2.c(false);
                }
                n4 n4Var3 = this.Q;
                if (n4Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(n4Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            rc rcVar3 = this.H;
            if (rcVar3 != null) {
                rcVar3.f28450a = view;
                rcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f15419x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                t6 storiesController2 = messagesController.getStoriesController();
                if (this.f15414r) {
                    f(0L);
                } else if (this.f15419x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f15419x)) {
                        f(this.f15419x);
                    } else {
                        long j10 = this.f15419x;
                        if (j10 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j10));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new l7().a(this.f15419x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j10));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new l7().a(this.f15419x, view, this);
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
            n4 n4Var4 = this.Q;
            if (n4Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(n4Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        rc rcVar = this.H;
        if (rcVar == null) {
            return 1.0f;
        }
        return rcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        c7 c7Var;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                c7Var = c7.a((rl0) parent);
            } else {
                c7Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j10, c7Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
