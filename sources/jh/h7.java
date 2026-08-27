package jh;

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
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;

public class h7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public nc H;
    public org.telegram.ui.ActionBar.c6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public p6 Q;
    public View R;

    public int f13393c;
    public TL_stories.StoryItem d;

    public boolean f13400l;

    public boolean f13401m;

    public int f13402n;

    public boolean f13403o;

    public boolean f13404p;

    public int f13405q;

    public boolean f13406r;

    public long f13407s;

    public float f13408t;
    public boolean v;

    public boolean f13410w;

    public long f13411x;

    public int f13412y;

    public int f13413z;

    public boolean f13391a = true;

    public boolean f13392b = true;

    public float f13394e = 1.0f;

    public float f13395f = 0.0f;

    public float f13396g = 0.0f;
    public float h = 0.0f;

    public float f13397i = 0.0f;

    public float f13398j = 0.0f;

    public boolean f13399k = true;

    public float f13409u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public h7(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.E = z10;
        this.J = c6Var;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        nc ncVar;
        ViewParent parent;
        p6 p6Var;
        MessagesController messagesController;
        s6 storiesController;
        long j10;
        TLRPC.Chat chat;
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user2;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        s6 storiesController2 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat2 = null;
                if (this.f13411x > 0) {
                    user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f13411x));
                } else {
                    user2 = null;
                    chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f13411x));
                }
                if (c(chat2, user2)) {
                    z10 = true;
                } else if (this.f13406r) {
                    z10 = !storiesController2.h.isEmpty();
                } else {
                    if (this.f13411x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f13411x) || (chat2 != null && !chat2.stories_unavailable && (tL_recentStory3 = chat2.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f13411x) || (user2 != null && !user2.stories_unavailable && (tL_recentStory4 = user2.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f13411x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    nc ncVar2 = this.H;
                    if (ncVar2 == null) {
                        this.H = new nc(view, 1.5f, 5.0f);
                    } else {
                        ncVar2.f30944a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        p6 p6Var2 = this.Q;
                        if (p6Var2 != null) {
                            AndroidUtilities.cancelRunOnUIThread(p6Var2);
                        }
                        p6 p6Var3 = new p6(11, this, view);
                        this.Q = p6Var3;
                        AndroidUtilities.runOnUIThread(p6Var3, ViewConfiguration.getLongPressTimeout());
                    }
                }
            } else if (motionEvent.getAction() == 2 || !this.N) {
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    ncVar = this.H;
                    if (ncVar != null) {
                        ncVar.f30944a = view;
                        ncVar.c(false);
                    }
                    if (this.N && motionEvent.getAction() == 1 && !d(this.f13411x)) {
                        messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        storiesController = messagesController.getStoriesController();
                        if (this.f13406r) {
                            f(0L);
                        } else if (this.f13411x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                            if (storiesController.I(this.f13411x)) {
                                f(this.f13411x);
                            } else {
                                j10 = this.f13411x;
                                if (j10 > 0) {
                                    user = messagesController.getUser(Long.valueOf(j10));
                                    if (user != null && !user.stories_unavailable && (tL_recentStory2 = user.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                        new k7().a(this.f13411x, view, this);
                                    }
                                } else {
                                    chat = messagesController.getChat(Long.valueOf(-j10));
                                    if (chat != null && !chat.stories_unavailable && (tL_recentStory = chat.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                        new k7().a(this.f13411x, view, this);
                                    }
                                }
                            }
                        }
                    }
                    parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                    }
                    this.N = false;
                    p6Var = this.Q;
                    if (p6Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(p6Var);
                    }
                }
            } else if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                nc ncVar3 = this.H;
                if (ncVar3 != null) {
                    ncVar3.f30944a = view;
                    ncVar3.c(false);
                }
                p6 p6Var4 = this.Q;
                if (p6Var4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(p6Var4);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 2) {
            if (motionEvent.getAction() != 1) {
                ncVar = this.H;
                if (ncVar != null) {
                    ncVar.f30944a = view;
                    ncVar.c(false);
                }
                if (this.N) {
                    messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    storiesController = messagesController.getStoriesController();
                    if (this.f13406r) {
                        f(0L);
                    } else if (this.f13411x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                        if (storiesController.I(this.f13411x)) {
                            f(this.f13411x);
                        } else {
                            j10 = this.f13411x;
                            if (j10 > 0) {
                                user = messagesController.getUser(Long.valueOf(j10));
                                if (user != null) {
                                    new k7().a(this.f13411x, view, this);
                                }
                            } else {
                                chat = messagesController.getChat(Long.valueOf(-j10));
                                if (chat != null) {
                                    new k7().a(this.f13411x, view, this);
                                }
                            }
                        }
                    }
                }
                parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                this.N = false;
                p6Var = this.Q;
                if (p6Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(p6Var);
                }
            } else {
                ncVar = this.H;
                if (ncVar != null) {
                    ncVar.f30944a = view;
                    ncVar.c(false);
                }
                if (this.N) {
                    messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    storiesController = messagesController.getStoriesController();
                    if (this.f13406r) {
                        f(0L);
                    } else if (this.f13411x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                        if (storiesController.I(this.f13411x)) {
                            f(this.f13411x);
                        } else {
                            j10 = this.f13411x;
                            if (j10 > 0) {
                                user = messagesController.getUser(Long.valueOf(j10));
                                if (user != null) {
                                    new k7().a(this.f13411x, view, this);
                                }
                            } else {
                                chat = messagesController.getChat(Long.valueOf(-j10));
                                if (chat != null) {
                                    new k7().a(this.f13411x, view, this);
                                }
                            }
                        }
                    }
                }
                parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                this.N = false;
                p6Var = this.Q;
                if (p6Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(p6Var);
                }
            }
        } else if (motionEvent.getAction() != 1) {
            ncVar = this.H;
            if (ncVar != null) {
                ncVar.f30944a = view;
                ncVar.c(false);
            }
            if (this.N) {
                messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                storiesController = messagesController.getStoriesController();
                if (this.f13406r) {
                    f(0L);
                } else if (this.f13411x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController.I(this.f13411x)) {
                        f(this.f13411x);
                    } else {
                        j10 = this.f13411x;
                        if (j10 > 0) {
                            user = messagesController.getUser(Long.valueOf(j10));
                            if (user != null) {
                                new k7().a(this.f13411x, view, this);
                            }
                        } else {
                            chat = messagesController.getChat(Long.valueOf(-j10));
                            if (chat != null) {
                                new k7().a(this.f13411x, view, this);
                            }
                        }
                    }
                }
            }
            parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            p6Var = this.Q;
            if (p6Var != null) {
                AndroidUtilities.cancelRunOnUIThread(p6Var);
            }
        } else {
            ncVar = this.H;
            if (ncVar != null) {
                ncVar.f30944a = view;
                ncVar.c(false);
            }
            if (this.N) {
                messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                storiesController = messagesController.getStoriesController();
                if (this.f13406r) {
                    f(0L);
                } else if (this.f13411x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController.I(this.f13411x)) {
                        f(this.f13411x);
                    } else {
                        j10 = this.f13411x;
                        if (j10 > 0) {
                            user = messagesController.getUser(Long.valueOf(j10));
                            if (user != null) {
                                new k7().a(this.f13411x, view, this);
                            }
                        } else {
                            chat = messagesController.getChat(Long.valueOf(-j10));
                            if (chat != null) {
                                new k7().a(this.f13411x, view, this);
                            }
                        }
                    }
                }
            }
            parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            p6Var = this.Q;
            if (p6Var != null) {
                AndroidUtilities.cancelRunOnUIThread(p6Var);
            }
        }
        return this.N;
    }

    public final float b() {
        nc ncVar = this.H;
        if (ncVar == null) {
            return 1.0f;
        }
        return ncVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null || this.R == null) {
            return;
        }
        n2VarR.getOrCreateStoryViewer().getClass();
        ViewParent parent = this.R.getParent();
        n2VarR.getOrCreateStoryViewer().D(n2VarR.getContext(), j10, parent instanceof RecyclerView ? b7.a((zk0) parent) : null);
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
