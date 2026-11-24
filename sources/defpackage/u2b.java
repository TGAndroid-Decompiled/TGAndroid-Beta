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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public class u2b {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public n41 H;
    public wjb J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public iya Q;
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

    public u2b(wjb wjbVar, boolean z) {
        this.E = z;
        this.J = wjbVar;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        g2b M1 = na7.q1(y6c.t0).M1();
        boolean z2 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                int i = (this.x > 0L ? 1 : (this.x == 0L ? 0 : -1));
                int i2 = y6c.t0;
                TLRPC.Chat chat = null;
                if (i > 0) {
                    user = na7.q1(i2).V1(Long.valueOf(this.x));
                } else {
                    chat = na7.q1(i2).K0(Long.valueOf(-this.x));
                    user = null;
                }
                if (c(chat, user)) {
                    z = true;
                } else if (this.r) {
                    z = !M1.h.isEmpty();
                } else {
                    int i3 = (this.x > 0L ? 1 : (this.x == 0L ? 0 : -1));
                    int i4 = y6c.t0;
                    if (i3 <= 0 ? na7.q1(i4).M1().J(this.x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : na7.q1(i4).M1().J(this.x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z2 = true;
                    }
                    z = z2;
                }
                if (this.x != y6c.h(y6c.t0).n && z) {
                    n41 n41Var = this.H;
                    if (n41Var == null) {
                        this.H = new n41(view, 1.5f, 5.0f);
                    } else {
                        n41Var.a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        iya iyaVar = this.Q;
                        if (iyaVar != null) {
                            gl.r(iyaVar);
                        }
                        iya iyaVar2 = new iya(this, view, (byte) 21);
                        this.Q = iyaVar2;
                        gl.d3(iyaVar2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > gl.e || Math.abs(this.P - motionEvent.getY()) > gl.e) {
                n41 n41Var2 = this.H;
                if (n41Var2 != null) {
                    n41Var2.a = view;
                    n41Var2.c(false);
                }
                iya iyaVar3 = this.Q;
                if (iyaVar3 != null) {
                    gl.r(iyaVar3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            n41 n41Var3 = this.H;
            if (n41Var3 != null) {
                n41Var3.a = view;
                n41Var3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.x)) {
                na7 q1 = na7.q1(y6c.t0);
                g2b M12 = q1.M1();
                if (this.r) {
                    f(0L);
                } else if (this.x != y6c.h(y6c.t0).e()) {
                    boolean J = M12.J(this.x);
                    long j = this.x;
                    if (J) {
                        f(j);
                    } else if (j > 0) {
                        TLRPC.User V1 = q1.V1(Long.valueOf(j));
                        if (V1 != null && !V1.stories_unavailable && (tL_recentStory2 = V1.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                            new w2b().a(this.x, view, this);
                        }
                    } else {
                        TLRPC.Chat K0 = q1.K0(Long.valueOf(-j));
                        if (K0 != null && !K0.stories_unavailable && (tL_recentStory = K0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                            new w2b().a(this.x, view, this);
                        }
                    }
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            iya iyaVar4 = this.Q;
            if (iyaVar4 != null) {
                gl.r(iyaVar4);
            }
        }
        return this.N;
    }

    public final float b() {
        n41 n41Var = this.H;
        if (n41Var == null) {
            return 1.0f;
        }
        return n41Var.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j) {
        return false;
    }

    public void f(long j) {
        p2b p2bVar;
        d Q = LaunchActivity.Q();
        if (Q != null && this.R != null) {
            Q.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                p2bVar = p2b.a((o39) parent);
            } else {
                p2bVar = null;
            }
            Q.getOrCreateStoryViewer().H(Q.getContext(), j, p2bVar);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
