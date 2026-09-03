package oh;

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
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
public class i7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public rc H;
    public org.telegram.ui.ActionBar.g6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public z1 Q;
    public View R;
    public int f17227c;
    public TL_stories.StoryItem d;
    public boolean f17234l;
    public boolean f17235m;
    public int f17236n;
    public boolean f17237o;
    public boolean f17238p;
    public int f17239q;
    public boolean f17240r;
    public long f17241s;
    public float f17242t;
    public boolean v;
    public boolean f17244w;
    public long f17245x;
    public int f17246y;
    public int f17247z;
    public boolean f17225a = true;
    public boolean f17226b = true;
    public float f17228e = 1.0f;
    public float f17229f = 0.0f;
    public float f17230g = 0.0f;
    public float h = 0.0f;
    public float f17231i = 0.0f;
    public float f17232j = 0.0f;
    public boolean f17233k = true;
    public float f17243u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public i7(org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        this.E = z4;
        this.J = g6Var;
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
                if (this.f17245x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f17245x));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f17245x));
                }
                if (c(chat, user)) {
                    z4 = true;
                } else if (this.f17240r) {
                    z4 = !storiesController.h.isEmpty();
                } else {
                    if (this.f17245x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f17245x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f17245x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z10 = true;
                    }
                    z4 = z10;
                }
                if (this.f17245x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z4) {
                    rc rcVar = this.H;
                    if (rcVar == null) {
                        this.H = new rc(view, 1.5f, 5.0f);
                    } else {
                        rcVar.f30720a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        z1 z1Var = this.Q;
                        if (z1Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(z1Var);
                        }
                        z1 z1Var2 = new z1(20, this, view);
                        this.Q = z1Var2;
                        AndroidUtilities.runOnUIThread(z1Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                rc rcVar2 = this.H;
                if (rcVar2 != null) {
                    rcVar2.f30720a = view;
                    rcVar2.c(false);
                }
                z1 z1Var3 = this.Q;
                if (z1Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(z1Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            rc rcVar3 = this.H;
            if (rcVar3 != null) {
                rcVar3.f30720a = view;
                rcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f17245x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                t6 storiesController2 = messagesController.getStoriesController();
                if (this.f17240r) {
                    f(0L);
                } else if (this.f17245x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f17245x)) {
                        f(this.f17245x);
                    } else {
                        long j10 = this.f17245x;
                        if (j10 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j10));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new l7().a(this.f17245x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j10));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new l7().a(this.f17245x, view, this);
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
            z1 z1Var4 = this.Q;
            if (z1Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(z1Var4);
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
                c7Var = c7.a((sl0) parent);
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
