package fi;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
public class e7 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public lc H;
    public org.telegram.ui.ActionBar.i6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public l4 Q;
    public View R;
    public int f11898c;
    public TL_stories.StoryItem d;
    public boolean f11905l;
    public boolean f11906m;
    public int f11907n;
    public boolean f11908o;
    public boolean f11909p;
    public int f11910q;
    public boolean f11911r;
    public long f11912s;
    public float f11913t;
    public boolean v;
    public boolean f11915w;
    public long f11916x;
    public int f11917y;
    public int f11918z;
    public boolean f11896a = true;
    public boolean f11897b = true;
    public float f11899e = 1.0f;
    public float f11900f = 0.0f;
    public float f11901g = 0.0f;
    public float h = 0.0f;
    public float f11902i = 0.0f;
    public float f11903j = 0.0f;
    public boolean f11904k = true;
    public float f11914u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public e7(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this.E = z10;
        this.J = i6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        p6 R1 = mp.u1(i10.f24637t0).R1();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f11916x > 0) {
                    user = mp.u1(i10.f24637t0).c2(Long.valueOf(this.f11916x));
                } else {
                    chat = mp.u1(i10.f24637t0).O0(Long.valueOf(-this.f11916x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f11911r) {
                    z10 = !R1.h.isEmpty();
                } else {
                    if (this.f11916x <= 0 ? mp.u1(i10.f24637t0).R1().K(this.f11916x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : mp.u1(i10.f24637t0).R1().K(this.f11916x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f11916x != i10.i(i10.f24637t0).f24656n && z10) {
                    lc lcVar = this.H;
                    if (lcVar == null) {
                        this.H = new lc(view, 1.5f, 5.0f);
                    } else {
                        lcVar.f37103a = view;
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
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.g0.f24205e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.g0.f24205e) {
                lc lcVar2 = this.H;
                if (lcVar2 != null) {
                    lcVar2.f37103a = view;
                    lcVar2.c(false);
                }
                l4 l4Var3 = this.Q;
                if (l4Var3 != null) {
                    org.telegram.messenger.g0.r(l4Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            lc lcVar3 = this.H;
            if (lcVar3 != null) {
                lcVar3.f37103a = view;
                lcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f11916x)) {
                mp u12 = mp.u1(i10.f24637t0);
                p6 R12 = u12.R1();
                if (this.f11911r) {
                    f(0L);
                } else if (this.f11916x != i10.i(i10.f24637t0).e()) {
                    if (R12.K(this.f11916x)) {
                        f(this.f11916x);
                    } else {
                        long j3 = this.f11916x;
                        if (j3 > 0) {
                            TLRPC.User c22 = u12.c2(Long.valueOf(j3));
                            if (c22 != null && !c22.stories_unavailable && (tL_recentStory2 = c22.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new h7().a(this.f11916x, view, this);
                            }
                        } else {
                            TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
                            if (O0 != null && !O0.stories_unavailable && (tL_recentStory = O0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new h7().a(this.f11916x, view, this);
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
        lc lcVar = this.H;
        if (lcVar == null) {
            return 1.0f;
        }
        return lcVar.a(0.08f);
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
