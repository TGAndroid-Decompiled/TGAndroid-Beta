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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
public class ca {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public wc H;
    public org.telegram.ui.ActionBar.e6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public ba Q;
    public View R;
    public int f649c;
    public TL_stories.StoryItem d;
    public boolean f655l;
    public boolean f656m;
    public int f657n;
    public boolean f658o;
    public boolean f659p;
    public int f660q;
    public boolean f661r;
    public long f662s;
    public float f663t;
    public boolean v;
    public boolean f665w;
    public long f666x;
    public int f667y;
    public int f668z;
    public boolean f647a = true;
    public boolean f648b = true;
    public float e = 1.0f;
    public float f650f = 0.0f;
    public float f651g = 0.0f;
    public float h = 0.0f;
    public float f652i = 0.0f;
    public float f653j = 0.0f;
    public boolean f654k = true;
    public float f664u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public ca(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.E = z10;
        this.J = e6Var;
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
                if (this.f666x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f666x));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f666x));
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f661r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f666x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f666x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f666x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f666x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    wc wcVar = this.H;
                    if (wcVar == null) {
                        this.H = new wc(view, 1.5f, 5.0f);
                    } else {
                        wcVar.f29685a = view;
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
                wc wcVar2 = this.H;
                if (wcVar2 != null) {
                    wcVar2.f29685a = view;
                    wcVar2.c(false);
                }
                ba baVar3 = this.Q;
                if (baVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(baVar3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            wc wcVar3 = this.H;
            if (wcVar3 != null) {
                wcVar3.f29685a = view;
                wcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f666x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                l9 storiesController2 = messagesController.getStoriesController();
                if (this.f661r) {
                    f(0L);
                } else if (this.f666x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f666x)) {
                        f(this.f666x);
                    } else {
                        long j3 = this.f666x;
                        if (j3 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j3));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new ha().a(this.f666x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j3));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new ha().a(this.f666x, view, this);
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
        wc wcVar = this.H;
        if (wcVar == null) {
            return 1.0f;
        }
        return wcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        u9 u9Var;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                u9Var = u9.a((ll0) parent);
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
