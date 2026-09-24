package ai;

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
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
public class ca {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public zc H;
    public org.telegram.ui.ActionBar.d6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public ba Q;
    public View R;
    public int f658c;
    public TL_stories.StoryItem d;
    public boolean f664l;
    public boolean f665m;
    public int f666n;
    public boolean f667o;
    public boolean f668p;
    public int f669q;
    public boolean f670r;
    public long f671s;
    public float f672t;
    public boolean v;
    public boolean f674w;
    public long f675x;
    public int f676y;
    public int f677z;
    public boolean f656a = true;
    public boolean f657b = true;
    public float e = 1.0f;
    public float f659f = 0.0f;
    public float f660g = 0.0f;
    public float h = 0.0f;
    public float f661i = 0.0f;
    public float f662j = 0.0f;
    public boolean f663k = true;
    public float f673u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public ca(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
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
        l9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f675x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f675x));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f675x));
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f670r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f675x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f675x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f675x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f675x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    zc zcVar = this.H;
                    if (zcVar == null) {
                        this.H = new zc(view, 1.5f, 5.0f);
                    } else {
                        zcVar.f30837a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        ba baVar = this.Q;
                        if (baVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(baVar);
                        }
                        ba baVar2 = new ba(0, this, view);
                        this.Q = baVar2;
                        AndroidUtilities.runOnUIThread(baVar2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                zc zcVar2 = this.H;
                if (zcVar2 != null) {
                    zcVar2.f30837a = view;
                    zcVar2.c(false);
                }
                ba baVar3 = this.Q;
                if (baVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(baVar3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zc zcVar3 = this.H;
            if (zcVar3 != null) {
                zcVar3.f30837a = view;
                zcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f675x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                l9 storiesController2 = messagesController.getStoriesController();
                if (this.f670r) {
                    f(0L);
                } else if (this.f675x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f675x)) {
                        f(this.f675x);
                    } else {
                        long j3 = this.f675x;
                        if (j3 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j3));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new ha().a(this.f675x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j3));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new ha().a(this.f675x, view, this);
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
            ba baVar4 = this.Q;
            if (baVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(baVar4);
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
        u9 u9Var;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                u9Var = u9.a((wl0) parent);
            } else {
                u9Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j3, u9Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
