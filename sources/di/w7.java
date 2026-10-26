package di;

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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public class w7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public xc H;
    public org.telegram.ui.ActionBar.u6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public b4 Q;
    public View R;
    public int f9314c;
    public TL_stories.StoryItem d;
    public boolean f9320l;
    public boolean f9321m;
    public int f9322n;
    public boolean f9323o;
    public boolean f9324p;
    public int f9325q;
    public boolean f9326r;
    public long f9327s;
    public float f9328t;
    public boolean v;
    public boolean f9330w;
    public long f9331x;
    public int f9332y;
    public int f9333z;
    public boolean f9312a = true;
    public boolean f9313b = true;
    public float e = 1.0f;
    public float f9315f = 0.0f;
    public float f9316g = 0.0f;
    public float h = 0.0f;
    public float f9317i = 0.0f;
    public float f9318j = 0.0f;
    public boolean f9319k = true;
    public float f9329u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public w7(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this.E = z10;
        this.J = u6Var;
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
                if (this.f9331x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f9331x));
                } else {
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f9331x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f9326r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f9331x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f9331x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f9331x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f9331x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    xc xcVar = this.H;
                    if (xcVar == null) {
                        this.H = new xc(view, 1.5f, 5.0f);
                    } else {
                        xcVar.f34685a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        b4 b4Var = this.Q;
                        if (b4Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(b4Var);
                        }
                        b4 b4Var2 = new b4(18, this, view);
                        this.Q = b4Var2;
                        AndroidUtilities.runOnUIThread(b4Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                xc xcVar2 = this.H;
                if (xcVar2 != null) {
                    xcVar2.f34685a = view;
                    xcVar2.c(false);
                }
                b4 b4Var3 = this.Q;
                if (b4Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(b4Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            xc xcVar3 = this.H;
            if (xcVar3 != null) {
                xcVar3.f34685a = view;
                xcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f9331x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                h7 storiesController2 = messagesController.getStoriesController();
                if (this.f9326r) {
                    f(0L);
                } else if (this.f9331x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f9331x)) {
                        f(this.f9331x);
                    } else {
                        long j10 = this.f9331x;
                        if (j10 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j10));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new z7().a(this.f9331x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j10));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new z7().a(this.f9331x, view, this);
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
            b4 b4Var4 = this.Q;
            if (b4Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(b4Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        xc xcVar = this.H;
        if (xcVar == null) {
            return 1.0f;
        }
        return xcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        q7 q7Var;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                q7Var = q7.a((mm0) parent);
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
