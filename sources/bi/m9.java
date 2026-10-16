package bi;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;
public class m9 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public ad H;
    public org.telegram.ui.ActionBar.c6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public u8 Q;
    public View R;
    public int f3330c;
    public TL_stories.StoryItem d;
    public boolean f3336l;
    public boolean f3337m;
    public int f3338n;
    public boolean f3339o;
    public boolean f3340p;
    public int f3341q;
    public boolean f3342r;
    public long f3343s;
    public float f3344t;
    public boolean v;
    public boolean f3346w;
    public long f3347x;
    public int f3348y;
    public int f3349z;
    public boolean f3328a = true;
    public boolean f3329b = true;
    public float e = 1.0f;
    public float f3331f = 0.0f;
    public float f3332g = 0.0f;
    public float h = 0.0f;
    public float f3333i = 0.0f;
    public float f3334j = 0.0f;
    public boolean f3335k = true;
    public float f3345u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public m9(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
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
        x8 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f3347x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f3347x));
                } else {
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f3347x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f3342r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f3347x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f3347x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f3347x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f3347x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    ad adVar = this.H;
                    if (adVar == null) {
                        this.H = new ad(view, 1.5f, 5.0f);
                    } else {
                        adVar.f23196a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        u8 u8Var = this.Q;
                        if (u8Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(u8Var);
                        }
                        u8 u8Var2 = new u8(11, this, view);
                        this.Q = u8Var2;
                        AndroidUtilities.runOnUIThread(u8Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                ad adVar2 = this.H;
                if (adVar2 != null) {
                    adVar2.f23196a = view;
                    adVar2.c(false);
                }
                u8 u8Var3 = this.Q;
                if (u8Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(u8Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ad adVar3 = this.H;
            if (adVar3 != null) {
                adVar3.f23196a = view;
                adVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f3347x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                x8 storiesController2 = messagesController.getStoriesController();
                if (this.f3342r) {
                    f(0L);
                } else if (this.f3347x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f3347x)) {
                        f(this.f3347x);
                    } else {
                        long j10 = this.f3347x;
                        if (j10 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j10));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new r9().a(this.f3347x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j10));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new r9().a(this.f3347x, view, this);
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
            u8 u8Var4 = this.Q;
            if (u8Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(u8Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        ad adVar = this.H;
        if (adVar == null) {
            return 1.0f;
        }
        return adVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        g9 g9Var;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                g9Var = g9.a((mm0) parent);
            } else {
                g9Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j10, g9Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
