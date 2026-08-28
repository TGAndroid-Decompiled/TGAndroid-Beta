package ih;

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
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
public class l7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public pc H;
    public org.telegram.ui.ActionBar.b6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public j7 Q;
    public View R;
    public int f11718c;
    public TL_stories.StoryItem d;
    public boolean f11725l;
    public boolean f11726m;
    public int f11727n;
    public boolean f11728o;
    public boolean f11729p;
    public int f11730q;
    public boolean f11731r;
    public long f11732s;
    public float f11733t;
    public boolean v;
    public boolean f11735w;
    public long f11736x;
    public int f11737y;
    public int f11738z;
    public boolean f11716a = true;
    public boolean f11717b = true;
    public float f11719e = 1.0f;
    public float f11720f = 0.0f;
    public float f11721g = 0.0f;
    public float h = 0.0f;
    public float f11722i = 0.0f;
    public float f11723j = 0.0f;
    public boolean f11724k = true;
    public float f11734u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public l7(org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        this.E = z10;
        this.J = b6Var;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        v6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f11736x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f11736x));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f11736x));
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f11731r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f11736x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f11736x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f11736x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f11736x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    pc pcVar = this.H;
                    if (pcVar == null) {
                        this.H = new pc(view, 1.5f, 5.0f);
                    } else {
                        pcVar.f31606a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        j7 j7Var = this.Q;
                        if (j7Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(j7Var);
                        }
                        j7 j7Var2 = new j7(2, this, view);
                        this.Q = j7Var2;
                        AndroidUtilities.runOnUIThread(j7Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                pc pcVar2 = this.H;
                if (pcVar2 != null) {
                    pcVar2.f31606a = view;
                    pcVar2.c(false);
                }
                j7 j7Var3 = this.Q;
                if (j7Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(j7Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            pc pcVar3 = this.H;
            if (pcVar3 != null) {
                pcVar3.f31606a = view;
                pcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f11736x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                v6 storiesController2 = messagesController.getStoriesController();
                if (this.f11731r) {
                    f(0L);
                } else if (this.f11736x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f11736x)) {
                        f(this.f11736x);
                    } else {
                        long j10 = this.f11736x;
                        if (j10 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j10));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new o7().a(this.f11736x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j10));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new o7().a(this.f11736x, view, this);
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
            j7 j7Var4 = this.Q;
            if (j7Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(j7Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        pc pcVar = this.H;
        if (pcVar == null) {
            return 1.0f;
        }
        return pcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        e7 e7Var;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                e7Var = e7.a((wk0) parent);
            } else {
                e7Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j10, e7Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
