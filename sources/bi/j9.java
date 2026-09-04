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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
public class j9 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public zc H;
    public org.telegram.ui.ActionBar.f6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public s8 Q;
    public View R;
    public int f3149c;
    public TL_stories.StoryItem d;
    public boolean f3156l;
    public boolean f3157m;
    public int f3158n;
    public boolean f3159o;
    public boolean f3160p;
    public int f3161q;
    public boolean f3162r;
    public long f3163s;
    public float f3164t;
    public boolean v;
    public boolean f3166w;
    public long f3167x;
    public int f3168y;
    public int f3169z;
    public boolean f3147a = true;
    public boolean f3148b = true;
    public float f3150e = 1.0f;
    public float f3151f = 0.0f;
    public float f3152g = 0.0f;
    public float h = 0.0f;
    public float f3153i = 0.0f;
    public float f3154j = 0.0f;
    public boolean f3155k = true;
    public float f3165u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public j9(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.E = z10;
        this.J = f6Var;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        u8 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f3167x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f3167x));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f3167x));
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f3162r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f3167x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f3167x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f3167x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f3167x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    zc zcVar = this.H;
                    if (zcVar == null) {
                        this.H = new zc(view, 1.5f, 5.0f);
                    } else {
                        zcVar.f33118a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        s8 s8Var = this.Q;
                        if (s8Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(s8Var);
                        }
                        s8 s8Var2 = new s8(9, this, view);
                        this.Q = s8Var2;
                        AndroidUtilities.runOnUIThread(s8Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                zc zcVar2 = this.H;
                if (zcVar2 != null) {
                    zcVar2.f33118a = view;
                    zcVar2.c(false);
                }
                s8 s8Var3 = this.Q;
                if (s8Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(s8Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zc zcVar3 = this.H;
            if (zcVar3 != null) {
                zcVar3.f33118a = view;
                zcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f3167x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                u8 storiesController2 = messagesController.getStoriesController();
                if (this.f3162r) {
                    f(0L);
                } else if (this.f3167x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f3167x)) {
                        f(this.f3167x);
                    } else {
                        long j3 = this.f3167x;
                        if (j3 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j3));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new o9().a(this.f3167x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j3));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new o9().a(this.f3167x, view, this);
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
            s8 s8Var4 = this.Q;
            if (s8Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(s8Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        zc zcVar = this.H;
        if (zcVar == null) {
            return 1.0f;
        }
        return zcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        d9 d9Var;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                d9Var = d9.a((ll0) parent);
            } else {
                d9Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j3, d9Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
