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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
public class x7 {
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
    public u7 Q;
    public View R;
    public int f6114c;
    public TL_stories.StoryItem d;
    public boolean f6120l;
    public boolean f6121m;
    public int f6122n;
    public boolean f6123o;
    public boolean f6124p;
    public int f6125q;
    public boolean f6126r;
    public long f6127s;
    public float f6128t;
    public boolean v;
    public boolean f6130w;
    public long f6131x;
    public int f6132y;
    public int f6133z;
    public boolean f6112a = true;
    public boolean f6113b = true;
    public float e = 1.0f;
    public float f6115f = 0.0f;
    public float f6116g = 0.0f;
    public float h = 0.0f;
    public float f6117i = 0.0f;
    public float f6118j = 0.0f;
    public boolean f6119k = true;
    public float f6129u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public x7(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
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
        h7 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f6131x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f6131x));
                } else {
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f6131x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f6126r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f6131x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f6131x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f6131x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f6131x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    yc ycVar = this.H;
                    if (ycVar == null) {
                        this.H = new yc(view, 1.5f, 5.0f);
                    } else {
                        ycVar.f32601a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        u7 u7Var = this.Q;
                        if (u7Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(u7Var);
                        }
                        u7 u7Var2 = new u7(4, this, view);
                        this.Q = u7Var2;
                        AndroidUtilities.runOnUIThread(u7Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                yc ycVar2 = this.H;
                if (ycVar2 != null) {
                    ycVar2.f32601a = view;
                    ycVar2.c(false);
                }
                u7 u7Var3 = this.Q;
                if (u7Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(u7Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            yc ycVar3 = this.H;
            if (ycVar3 != null) {
                ycVar3.f32601a = view;
                ycVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f6131x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                h7 storiesController2 = messagesController.getStoriesController();
                if (this.f6126r) {
                    f(0L);
                } else if (this.f6131x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f6131x)) {
                        f(this.f6131x);
                    } else {
                        long j10 = this.f6131x;
                        if (j10 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j10));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new b8().a(this.f6131x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j10));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new b8().a(this.f6131x, view, this);
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
            u7 u7Var4 = this.Q;
            if (u7Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(u7Var4);
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
        q7 q7Var;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                q7Var = q7.a((im0) parent);
            } else {
                q7Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j10, q7Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
