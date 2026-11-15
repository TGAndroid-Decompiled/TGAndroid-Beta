package fi;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
public class h7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public dc H;
    public org.telegram.ui.ActionBar.e6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public f6 Q;
    public View R;
    public int f11780c;
    public TL_stories.StoryItem d;
    public boolean f11787l;
    public boolean f11788m;
    public int f11789n;
    public boolean f11790o;
    public boolean f11791p;
    public int f11792q;
    public boolean f11793r;
    public long f11794s;
    public float f11795t;
    public boolean v;
    public boolean f11797w;
    public long f11798x;
    public int f11799y;
    public int f11800z;
    public boolean f11778a = true;
    public boolean f11779b = true;
    public float f11781e = 1.0f;
    public float f11782f = 0.0f;
    public float f11783g = 0.0f;
    public float h = 0.0f;
    public float f11784i = 0.0f;
    public float f11785j = 0.0f;
    public boolean f11786k = true;
    public float f11796u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public h7(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.E = z10;
        this.J = e6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        s6 P1 = np.s1(m10.f24940t0).P1();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f11798x > 0) {
                    user = np.s1(m10.f24940t0).a2(Long.valueOf(this.f11798x));
                } else {
                    chat = np.s1(m10.f24940t0).M0(Long.valueOf(-this.f11798x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f11793r) {
                    z10 = !P1.h.isEmpty();
                } else {
                    if (this.f11798x <= 0 ? np.s1(m10.f24940t0).P1().K(this.f11798x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : np.s1(m10.f24940t0).P1().K(this.f11798x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f11798x != m10.i(m10.f24940t0).f24959n && z10) {
                    dc dcVar = this.H;
                    if (dcVar == null) {
                        this.H = new dc(view, 1.5f, 5.0f);
                    } else {
                        dcVar.f33898a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        f6 f6Var = this.Q;
                        if (f6Var != null) {
                            org.telegram.messenger.g0.r(f6Var);
                        }
                        f6 f6Var2 = new f6(13, this, view);
                        this.Q = f6Var2;
                        org.telegram.messenger.g0.i3(f6Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.g0.f23590e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.g0.f23590e) {
                dc dcVar2 = this.H;
                if (dcVar2 != null) {
                    dcVar2.f33898a = view;
                    dcVar2.c(false);
                }
                f6 f6Var3 = this.Q;
                if (f6Var3 != null) {
                    org.telegram.messenger.g0.r(f6Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            dc dcVar3 = this.H;
            if (dcVar3 != null) {
                dcVar3.f33898a = view;
                dcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f11798x)) {
                np s12 = np.s1(m10.f24940t0);
                s6 P12 = s12.P1();
                if (this.f11793r) {
                    f(0L);
                } else if (this.f11798x != m10.i(m10.f24940t0).e()) {
                    if (P12.K(this.f11798x)) {
                        f(this.f11798x);
                    } else {
                        long j3 = this.f11798x;
                        if (j3 > 0) {
                            TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                            if (a22 != null && !a22.stories_unavailable && (tL_recentStory2 = a22.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new k7().a(this.f11798x, view, this);
                            }
                        } else {
                            TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
                            if (M0 != null && !M0.stories_unavailable && (tL_recentStory = M0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new k7().a(this.f11798x, view, this);
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
            f6 f6Var4 = this.Q;
            if (f6Var4 != null) {
                org.telegram.messenger.g0.r(f6Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        dc dcVar = this.H;
        if (dcVar == null) {
            return 1.0f;
        }
        return dcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        b7 b7Var;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q != null && this.R != null) {
            Q.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                b7Var = b7.a((uj0) parent);
            } else {
                b7Var = null;
            }
            Q.getOrCreateStoryViewer().J(Q.getContext(), j3, b7Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
