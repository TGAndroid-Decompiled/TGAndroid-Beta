package defpackage;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public class q6b {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public v41 H;
    public vnb J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public z3b Q;
    public View R;
    public int c;
    public TL_stories.StoryItem d;
    public boolean l;
    public boolean m;
    public byte n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public long s;
    public float t;
    public boolean v;
    public boolean w;
    public long x;
    public int y;
    public int z;
    public boolean a = true;
    public boolean b = true;
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public boolean k = true;
    public float u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public q6b(vnb vnbVar, boolean z) {
        this.E = z;
        this.J = vnbVar;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        c6b O1 = uc7.s1(yac.t0).O1();
        boolean z2 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                int i = (this.x > 0L ? 1 : (this.x == 0L ? 0 : -1));
                int i2 = yac.t0;
                TLRPC.Chat chat = null;
                if (i > 0) {
                    user = uc7.s1(i2).X1(Long.valueOf(this.x));
                } else {
                    chat = uc7.s1(i2).M0(Long.valueOf(-this.x));
                    user = null;
                }
                if (c(chat, user)) {
                    z = true;
                } else if (this.r) {
                    z = !O1.h.isEmpty();
                } else {
                    int i3 = (this.x > 0L ? 1 : (this.x == 0L ? 0 : -1));
                    int i4 = yac.t0;
                    if (i3 <= 0 ? uc7.s1(i4).O1().J(this.x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : uc7.s1(i4).O1().J(this.x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z2 = true;
                    }
                    z = z2;
                }
                if (this.x != yac.h(yac.t0).n && z) {
                    v41 v41Var = this.H;
                    if (v41Var == null) {
                        this.H = new v41(view, 1.5f, 5.0f);
                    } else {
                        v41Var.a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        z3b z3bVar = this.Q;
                        if (z3bVar != null) {
                            hl.r(z3bVar);
                        }
                        z3b z3bVar2 = new z3b(this, view, (byte) 18);
                        this.Q = z3bVar2;
                        hl.d3(z3bVar2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > hl.e || Math.abs(this.P - motionEvent.getY()) > hl.e) {
                v41 v41Var2 = this.H;
                if (v41Var2 != null) {
                    v41Var2.a = view;
                    v41Var2.c(false);
                }
                z3b z3bVar3 = this.Q;
                if (z3bVar3 != null) {
                    hl.r(z3bVar3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            v41 v41Var3 = this.H;
            if (v41Var3 != null) {
                v41Var3.a = view;
                v41Var3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.x)) {
                uc7 s1 = uc7.s1(yac.t0);
                c6b O12 = s1.O1();
                if (this.r) {
                    f(0L);
                } else if (this.x != yac.h(yac.t0).e()) {
                    boolean J = O12.J(this.x);
                    long j = this.x;
                    if (J) {
                        f(j);
                    } else if (j > 0) {
                        TLRPC.User X1 = s1.X1(Long.valueOf(j));
                        if (X1 != null && !X1.stories_unavailable && (tL_recentStory2 = X1.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                            new s6b().a(this.x, view, this);
                        }
                    } else {
                        TLRPC.Chat M0 = s1.M0(Long.valueOf(-j));
                        if (M0 != null && !M0.stories_unavailable && (tL_recentStory = M0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                            new s6b().a(this.x, view, this);
                        }
                    }
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            z3b z3bVar4 = this.Q;
            if (z3bVar4 != null) {
                hl.r(z3bVar4);
            }
        }
        return this.N;
    }

    public final float b() {
        v41 v41Var = this.H;
        if (v41Var == null) {
            return 1.0f;
        }
        return v41Var.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j) {
        return false;
    }

    public void f(long j) {
        l6b l6bVar;
        e Q = LaunchActivity.Q();
        if (Q != null && this.R != null) {
            Q.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                l6bVar = l6b.a((d79) parent);
            } else {
                l6bVar = null;
            }
            Q.getOrCreateStoryViewer().H(Q.getContext(), j, l6bVar);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
