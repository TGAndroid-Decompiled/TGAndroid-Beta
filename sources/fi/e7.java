package fi;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
public class e7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public mc H;
    public org.telegram.ui.ActionBar.h6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public l4 Q;
    public View R;
    public int f11936c;
    public TL_stories.StoryItem d;
    public boolean f11943l;
    public boolean f11944m;
    public int f11945n;
    public boolean f11946o;
    public boolean f11947p;
    public int f11948q;
    public boolean f11949r;
    public long f11950s;
    public float f11951t;
    public boolean v;
    public boolean f11953w;
    public long f11954x;
    public int f11955y;
    public int f11956z;
    public boolean f11934a = true;
    public boolean f11935b = true;
    public float f11937e = 1.0f;
    public float f11938f = 0.0f;
    public float f11939g = 0.0f;
    public float h = 0.0f;
    public float f11940i = 0.0f;
    public float f11941j = 0.0f;
    public boolean f11942k = true;
    public float f11952u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public e7(org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this.E = z10;
        this.J = h6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        p6 R1 = np.u1(k10.f24968t0).R1();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f11954x > 0) {
                    user = np.u1(k10.f24968t0).c2(Long.valueOf(this.f11954x));
                } else {
                    chat = np.u1(k10.f24968t0).O0(Long.valueOf(-this.f11954x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f11949r) {
                    z10 = !R1.h.isEmpty();
                } else {
                    if (this.f11954x <= 0 ? np.u1(k10.f24968t0).R1().K(this.f11954x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : np.u1(k10.f24968t0).R1().K(this.f11954x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f11954x != k10.i(k10.f24968t0).f24987n && z10) {
                    mc mcVar = this.H;
                    if (mcVar == null) {
                        this.H = new mc(view, 1.5f, 5.0f);
                    } else {
                        mcVar.f37471a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        l4 l4Var = this.Q;
                        if (l4Var != null) {
                            org.telegram.messenger.g0.r(l4Var);
                        }
                        l4 l4Var2 = new l4(17, this, view);
                        this.Q = l4Var2;
                        org.telegram.messenger.g0.h3(l4Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.g0.f24025e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.g0.f24025e) {
                mc mcVar2 = this.H;
                if (mcVar2 != null) {
                    mcVar2.f37471a = view;
                    mcVar2.c(false);
                }
                l4 l4Var3 = this.Q;
                if (l4Var3 != null) {
                    org.telegram.messenger.g0.r(l4Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            mc mcVar3 = this.H;
            if (mcVar3 != null) {
                mcVar3.f37471a = view;
                mcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f11954x)) {
                np u12 = np.u1(k10.f24968t0);
                p6 R12 = u12.R1();
                if (this.f11949r) {
                    f(0L);
                } else if (this.f11954x != k10.i(k10.f24968t0).e()) {
                    if (R12.K(this.f11954x)) {
                        f(this.f11954x);
                    } else {
                        long j3 = this.f11954x;
                        if (j3 > 0) {
                            TLRPC.User c22 = u12.c2(Long.valueOf(j3));
                            if (c22 != null && !c22.stories_unavailable && (tL_recentStory2 = c22.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new h7().a(this.f11954x, view, this);
                            }
                        } else {
                            TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
                            if (O0 != null && !O0.stories_unavailable && (tL_recentStory = O0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new h7().a(this.f11954x, view, this);
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
            l4 l4Var4 = this.Q;
            if (l4Var4 != null) {
                org.telegram.messenger.g0.r(l4Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        mc mcVar = this.H;
        if (mcVar == null) {
            return 1.0f;
        }
        return mcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        y6 y6Var;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q != null && this.R != null) {
            Q.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                y6Var = y6.a((ek0) parent);
            } else {
                y6Var = null;
            }
            Q.getOrCreateStoryViewer().J(Q.getContext(), j3, y6Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
