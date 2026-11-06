package di;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;
public class n7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public ic H;
    public org.telegram.ui.ActionBar.f6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public z0 Q;
    public View R;
    public int f9410c;
    public TL_stories.StoryItem d;
    public boolean f9417l;
    public boolean f9418m;
    public int f9419n;
    public boolean f9420o;
    public boolean f9421p;
    public int f9422q;
    public boolean f9423r;
    public long f9424s;
    public float f9425t;
    public boolean v;
    public boolean f9427w;
    public long f9428x;
    public int f9429y;
    public int f9430z;
    public boolean f9408a = true;
    public boolean f9409b = true;
    public float f9411e = 1.0f;
    public float f9412f = 0.0f;
    public float f9413g = 0.0f;
    public float h = 0.0f;
    public float f9414i = 0.0f;
    public float f9415j = 0.0f;
    public boolean f9416k = true;
    public float f9426u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public n7(org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this.E = z9;
        this.J = f6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z9;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        y6 P1 = qp.s1(p10.f24459s0).P1();
        boolean z10 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f9428x > 0) {
                    user = qp.s1(p10.f24459s0).a2(Long.valueOf(this.f9428x));
                } else {
                    chat = qp.s1(p10.f24459s0).M0(Long.valueOf(-this.f9428x));
                    user = null;
                }
                if (c(chat, user)) {
                    z9 = true;
                } else if (this.f9423r) {
                    z9 = !P1.h.isEmpty();
                } else {
                    if (this.f9428x <= 0 ? qp.s1(p10.f24459s0).P1().K(this.f9428x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : qp.s1(p10.f24459s0).P1().K(this.f9428x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z10 = true;
                    }
                    z9 = z10;
                }
                if (this.f9428x != p10.i(p10.f24459s0).f24478n && z9) {
                    ic icVar = this.H;
                    if (icVar == null) {
                        this.H = new ic(view, 1.5f, 5.0f);
                    } else {
                        icVar.f34586a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        z0 z0Var = this.Q;
                        if (z0Var != null) {
                            org.telegram.messenger.g0.r(z0Var);
                        }
                        z0 z0Var2 = new z0(22, this, view);
                        this.Q = z0Var2;
                        org.telegram.messenger.g0.i3(z0Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.g0.f22516e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.g0.f22516e) {
                ic icVar2 = this.H;
                if (icVar2 != null) {
                    icVar2.f34586a = view;
                    icVar2.c(false);
                }
                z0 z0Var3 = this.Q;
                if (z0Var3 != null) {
                    org.telegram.messenger.g0.r(z0Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ic icVar3 = this.H;
            if (icVar3 != null) {
                icVar3.f34586a = view;
                icVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f9428x)) {
                qp s12 = qp.s1(p10.f24459s0);
                y6 P12 = s12.P1();
                if (this.f9423r) {
                    f(0L);
                } else if (this.f9428x != p10.i(p10.f24459s0).e()) {
                    if (P12.K(this.f9428x)) {
                        f(this.f9428x);
                    } else {
                        long j3 = this.f9428x;
                        if (j3 > 0) {
                            TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                            if (a22 != null && !a22.stories_unavailable && (tL_recentStory2 = a22.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new q7().a(this.f9428x, view, this);
                            }
                        } else {
                            TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
                            if (M0 != null && !M0.stories_unavailable && (tL_recentStory = M0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new q7().a(this.f9428x, view, this);
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
            z0 z0Var4 = this.Q;
            if (z0Var4 != null) {
                org.telegram.messenger.g0.r(z0Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        ic icVar = this.H;
        if (icVar == null) {
            return 1.0f;
        }
        return icVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        h7 h7Var;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q != null && this.R != null) {
            Q.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                h7Var = h7.a((pj0) parent);
            } else {
                h7Var = null;
            }
            Q.getOrCreateStoryViewer().J(Q.getContext(), j3, h7Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
