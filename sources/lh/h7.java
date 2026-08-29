package lh;

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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.uc;
import org.telegram.ui.LaunchActivity;
public class h7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public uc H;
    public org.telegram.ui.ActionBar.c6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public r3 Q;
    public View R;
    public int f15667c;
    public TL_stories.StoryItem d;
    public boolean f15674l;
    public boolean f15675m;
    public int f15676n;
    public boolean f15677o;
    public boolean f15678p;
    public int f15679q;
    public boolean f15680r;
    public long f15681s;
    public float f15682t;
    public boolean v;
    public boolean f15684w;
    public long f15685x;
    public int f15686y;
    public int f15687z;
    public boolean f15665a = true;
    public boolean f15666b = true;
    public float f15668e = 1.0f;
    public float f15669f = 0.0f;
    public float f15670g = 0.0f;
    public float h = 0.0f;
    public float f15671i = 0.0f;
    public float f15672j = 0.0f;
    public boolean f15673k = true;
    public float f15683u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public h7(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.E = z10;
        this.J = c6Var;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        s6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f15685x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f15685x));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f15685x));
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f15680r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f15685x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f15685x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f15685x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f15685x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    uc ucVar = this.H;
                    if (ucVar == null) {
                        this.H = new uc(view, 1.5f, 5.0f);
                    } else {
                        ucVar.f33187a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        r3 r3Var = this.Q;
                        if (r3Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(r3Var);
                        }
                        r3 r3Var2 = new r3(18, this, view);
                        this.Q = r3Var2;
                        AndroidUtilities.runOnUIThread(r3Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                uc ucVar2 = this.H;
                if (ucVar2 != null) {
                    ucVar2.f33187a = view;
                    ucVar2.c(false);
                }
                r3 r3Var3 = this.Q;
                if (r3Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(r3Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            uc ucVar3 = this.H;
            if (ucVar3 != null) {
                ucVar3.f33187a = view;
                ucVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f15685x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                s6 storiesController2 = messagesController.getStoriesController();
                if (this.f15680r) {
                    f(0L);
                } else if (this.f15685x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f15685x)) {
                        f(this.f15685x);
                    } else {
                        long j10 = this.f15685x;
                        if (j10 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j10));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new k7().a(this.f15685x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j10));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new k7().a(this.f15685x, view, this);
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
            r3 r3Var4 = this.Q;
            if (r3Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(r3Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        uc ucVar = this.H;
        if (ucVar == null) {
            return 1.0f;
        }
        return ucVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        b7 b7Var;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                b7Var = b7.a((jl0) parent);
            } else {
                b7Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j10, b7Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
