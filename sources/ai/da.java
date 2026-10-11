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
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.LaunchActivity;
public class da {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public bd H;
    public org.telegram.ui.ActionBar.d6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public ca Q;
    public View R;
    public int f840c;
    public TL_stories.StoryItem d;
    public boolean f847l;
    public boolean f848m;
    public int f849n;
    public boolean f850o;
    public boolean f851p;
    public int f852q;
    public boolean f853r;
    public long f854s;
    public float f855t;
    public boolean v;
    public boolean f857w;
    public long f858x;
    public int f859y;
    public int f860z;
    public boolean f838a = true;
    public boolean f839b = true;
    public float f841e = 1.0f;
    public float f842f = 0.0f;
    public float f843g = 0.0f;
    public float h = 0.0f;
    public float f844i = 0.0f;
    public float f845j = 0.0f;
    public boolean f846k = true;
    public float f856u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public da(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
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
        m9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f858x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f858x));
                } else {
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f858x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f853r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f858x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f858x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f858x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f858x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    bd bdVar = this.H;
                    if (bdVar == null) {
                        this.H = new bd(view, 1.5f, 5.0f);
                    } else {
                        bdVar.f24975a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        ca caVar = this.Q;
                        if (caVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(caVar);
                        }
                        ca caVar2 = new ca(0, this, view);
                        this.Q = caVar2;
                        AndroidUtilities.runOnUIThread(caVar2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                bd bdVar2 = this.H;
                if (bdVar2 != null) {
                    bdVar2.f24975a = view;
                    bdVar2.c(false);
                }
                ca caVar3 = this.Q;
                if (caVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(caVar3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            bd bdVar3 = this.H;
            if (bdVar3 != null) {
                bdVar3.f24975a = view;
                bdVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f858x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                m9 storiesController2 = messagesController.getStoriesController();
                if (this.f853r) {
                    f(0L);
                } else if (this.f858x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f858x)) {
                        f(this.f858x);
                    } else {
                        long j3 = this.f858x;
                        if (j3 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j3));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new ia().a(this.f858x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j3));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new ia().a(this.f858x, view, this);
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
            ca caVar4 = this.Q;
            if (caVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(caVar4);
            }
        }
        return this.N;
    }

    public final float b() {
        bd bdVar = this.H;
        if (bdVar == null) {
            return 1.0f;
        }
        return bdVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        v9 v9Var;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                v9Var = v9.a((rm0) parent);
            } else {
                v9Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j3, v9Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
