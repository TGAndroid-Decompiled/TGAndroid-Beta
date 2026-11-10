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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;
public class o7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public hc H;
    public org.telegram.ui.ActionBar.h6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public z0 Q;
    public View R;
    public int f9448c;
    public TL_stories.StoryItem d;
    public boolean f9455l;
    public boolean f9456m;
    public int f9457n;
    public boolean f9458o;
    public boolean f9459p;
    public int f9460q;
    public boolean f9461r;
    public long f9462s;
    public float f9463t;
    public boolean v;
    public boolean f9465w;
    public long f9466x;
    public int f9467y;
    public int f9468z;
    public boolean f9446a = true;
    public boolean f9447b = true;
    public float f9449e = 1.0f;
    public float f9450f = 0.0f;
    public float f9451g = 0.0f;
    public float h = 0.0f;
    public float f9452i = 0.0f;
    public float f9453j = 0.0f;
    public boolean f9454k = true;
    public float f9464u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public o7(org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        this.E = z9;
        this.J = h6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z9;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        z6 P1 = qp.s1(p10.f24474s0).P1();
        boolean z10 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f9466x > 0) {
                    user = qp.s1(p10.f24474s0).a2(Long.valueOf(this.f9466x));
                } else {
                    chat = qp.s1(p10.f24474s0).M0(Long.valueOf(-this.f9466x));
                    user = null;
                }
                if (c(chat, user)) {
                    z9 = true;
                } else if (this.f9461r) {
                    z9 = !P1.h.isEmpty();
                } else {
                    if (this.f9466x <= 0 ? qp.s1(p10.f24474s0).P1().K(this.f9466x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : qp.s1(p10.f24474s0).P1().K(this.f9466x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z10 = true;
                    }
                    z9 = z10;
                }
                if (this.f9466x != p10.i(p10.f24474s0).f24493n && z9) {
                    hc hcVar = this.H;
                    if (hcVar == null) {
                        this.H = new hc(view, 1.5f, 5.0f);
                    } else {
                        hcVar.f34296a = view;
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
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.g0.f22546e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.g0.f22546e) {
                hc hcVar2 = this.H;
                if (hcVar2 != null) {
                    hcVar2.f34296a = view;
                    hcVar2.c(false);
                }
                z0 z0Var3 = this.Q;
                if (z0Var3 != null) {
                    org.telegram.messenger.g0.r(z0Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hc hcVar3 = this.H;
            if (hcVar3 != null) {
                hcVar3.f34296a = view;
                hcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f9466x)) {
                qp s12 = qp.s1(p10.f24474s0);
                z6 P12 = s12.P1();
                if (this.f9461r) {
                    f(0L);
                } else if (this.f9466x != p10.i(p10.f24474s0).e()) {
                    if (P12.K(this.f9466x)) {
                        f(this.f9466x);
                    } else {
                        long j3 = this.f9466x;
                        if (j3 > 0) {
                            TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                            if (a22 != null && !a22.stories_unavailable && (tL_recentStory2 = a22.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new r7().a(this.f9466x, view, this);
                            }
                        } else {
                            TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
                            if (M0 != null && !M0.stories_unavailable && (tL_recentStory = M0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new r7().a(this.f9466x, view, this);
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
        hc hcVar = this.H;
        if (hcVar == null) {
            return 1.0f;
        }
        return hcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        i7 i7Var;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q != null && this.R != null) {
            Q.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                i7Var = i7.a((pj0) parent);
            } else {
                i7Var = null;
            }
            Q.getOrCreateStoryViewer().J(Q.getContext(), j3, i7Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
