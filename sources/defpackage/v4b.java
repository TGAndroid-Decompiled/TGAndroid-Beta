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
public class v4b {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public u51 H;
    public ylb J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public uva Q;
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

    public v4b(ylb ylbVar, boolean z) {
        this.E = z;
        this.J = ylbVar;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        h4b N1 = oc7.r1(z8c.t0).N1();
        boolean z2 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                int i = (this.x > 0L ? 1 : (this.x == 0L ? 0 : -1));
                int i2 = z8c.t0;
                TLRPC.Chat chat = null;
                if (i > 0) {
                    user = oc7.r1(i2).W1(Long.valueOf(this.x));
                } else {
                    chat = oc7.r1(i2).L0(Long.valueOf(-this.x));
                    user = null;
                }
                if (c(chat, user)) {
                    z = true;
                } else if (this.r) {
                    z = !N1.h.isEmpty();
                } else {
                    int i3 = (this.x > 0L ? 1 : (this.x == 0L ? 0 : -1));
                    int i4 = z8c.t0;
                    if (i3 <= 0 ? oc7.r1(i4).N1().J(this.x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : oc7.r1(i4).N1().J(this.x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z2 = true;
                    }
                    z = z2;
                }
                if (this.x != z8c.h(z8c.t0).n && z) {
                    u51 u51Var = this.H;
                    if (u51Var == null) {
                        this.H = new u51(view, 1.5f, 5.0f);
                    } else {
                        u51Var.a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        uva uvaVar = this.Q;
                        if (uvaVar != null) {
                            gm.r(uvaVar);
                        }
                        uva uvaVar2 = new uva(this, view, (byte) 23);
                        this.Q = uvaVar2;
                        gm.d3(uvaVar2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > gm.e || Math.abs(this.P - motionEvent.getY()) > gm.e) {
                u51 u51Var2 = this.H;
                if (u51Var2 != null) {
                    u51Var2.a = view;
                    u51Var2.c(false);
                }
                uva uvaVar3 = this.Q;
                if (uvaVar3 != null) {
                    gm.r(uvaVar3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            u51 u51Var3 = this.H;
            if (u51Var3 != null) {
                u51Var3.a = view;
                u51Var3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.x)) {
                oc7 r1 = oc7.r1(z8c.t0);
                h4b N12 = r1.N1();
                if (this.r) {
                    f(0L);
                } else if (this.x != z8c.h(z8c.t0).e()) {
                    boolean J = N12.J(this.x);
                    long j = this.x;
                    if (J) {
                        f(j);
                    } else if (j > 0) {
                        TLRPC.User W1 = r1.W1(Long.valueOf(j));
                        if (W1 != null && !W1.stories_unavailable && (tL_recentStory2 = W1.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                            new x4b().a(this.x, view, this);
                        }
                    } else {
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(-j));
                        if (L0 != null && !L0.stories_unavailable && (tL_recentStory = L0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                            new x4b().a(this.x, view, this);
                        }
                    }
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            uva uvaVar4 = this.Q;
            if (uvaVar4 != null) {
                gm.r(uvaVar4);
            }
        }
        return this.N;
    }

    public final float b() {
        u51 u51Var = this.H;
        if (u51Var == null) {
            return 1.0f;
        }
        return u51Var.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j) {
        return false;
    }

    public void f(long j) {
        q4b q4bVar;
        d Q = LaunchActivity.Q();
        if (Q != null && this.R != null) {
            Q.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                q4bVar = q4b.a((r59) parent);
            } else {
                q4bVar = null;
            }
            Q.getOrCreateStoryViewer().H(Q.getContext(), j, q4bVar);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
