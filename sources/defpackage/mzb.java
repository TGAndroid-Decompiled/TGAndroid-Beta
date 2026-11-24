package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mzb extends FrameLayout implements jm7, g94, vlb {
    public final lzb E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final czb K;
    public long L;
    public long M;
    public final fn0 N;
    public im0 O;
    public im0 P;
    public float Q;
    public float R;
    public mz S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public final fn0 a;
    public boolean a0;
    public final fn0 b;
    public int b0;
    public boolean c;
    public int c0;
    public boolean d;
    public Boolean d0;
    public final int e;
    public ValueAnimator e0;
    public final long f;
    public long f0;
    public boolean g0;
    public final ylb h;
    public jac h0;
    public Runnable i0;
    public jac j0;
    public boolean k0;
    public final HashSet l0;
    public final boolean n;
    public final boolean r;
    public final yv1 s;
    public final boolean w;
    public final FrameLayout x;
    public final azb y;

    public mzb(Activity activity, yv1 yv1Var, int i, long j, boolean z, ylb ylbVar) {
        super(activity);
        FrameLayout frameLayout;
        float f;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 380L, true);
        this.b = new fn0(1, this, d53Var, 380L, false);
        this.N = new fn0(0, new wyb(this), d53Var, 320L, false);
        this.V = 0.0f;
        this.l0 = new HashSet();
        this.s = yv1Var;
        this.c = z;
        this.e = i;
        this.f = j;
        this.h = ylbVar;
        long j2 = -j;
        this.n = sd2.p0(oc7.r1(i).L0(Long.valueOf(j2)));
        boolean x = m9c.x(oc7.r1(i).W1(Long.valueOf(j)));
        this.r = x;
        this.w = !kt6.w("topics_end_reached_", j2, z8c.h(i).j(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.x = frameLayout2;
        addView(frameLayout2, qoe.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.J = frameLayout3;
        addView(frameLayout3, qoe.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        azb azbVar = new azb(this, activity, i, new jac(this) {
            public final mzb b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z5;
                boolean z6;
                boolean z7;
                long j3;
                qwb qwbVar;
                long j4;
                boolean z8;
                boolean z9;
                int i4;
                long j5;
                long j6;
                long j7;
                boolean z10;
                boolean z11;
                byte b = r2;
                mzb mzbVar = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        boolean z12 = mzbVar.r;
                        int i5 = mzbVar.e;
                        oc7 r1 = oc7.r1(i5);
                        long j8 = mzbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(j9));
                        TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(j8));
                        qwb qwbVar2 = oc7.r1(i5).g4;
                        ArrayList l = qwbVar2.l(j9);
                        boolean z13 = mzbVar.n;
                        int i6 = gzb.b;
                        c6c K = c6c.K(gzb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z13;
                        if (mzbVar.f0 == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        K.L(z5);
                        arrayList.add(K);
                        if (l != null) {
                            int size = l.size();
                            int i7 = 0;
                            z6 = false;
                            while (i7 < size) {
                                Object obj3 = l.get(i7);
                                int i8 = i7 + 1;
                                int i9 = size;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                if (z12) {
                                    z7 = z12;
                                    if (tL_forumTopic.id == 1) {
                                        size = i9;
                                        i7 = i8;
                                        z12 = z7;
                                    }
                                } else {
                                    z7 = z12;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                } else {
                                    if (!tL_forumTopic.pinned) {
                                        if (z6) {
                                            if (!arrayList.isEmpty()) {
                                                ((c6c) b10.f(1, arrayList)).z |= 8;
                                            }
                                            l7cVar.L();
                                            z6 = false;
                                        }
                                    } else if (!z6) {
                                        l7cVar.M();
                                        z6 = true;
                                    }
                                    c6c K2 = c6c.K(gzb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z13) {
                                        j3 = j8;
                                        K2.C = pg3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = mzbVar.f0;
                                    if (z13) {
                                        qwbVar = qwbVar2;
                                        j4 = pg3.n(tL_forumTopic.from_id);
                                    } else {
                                        qwbVar = qwbVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    if (j10 == j4) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    K2.L(z8);
                                    arrayList.add(K2);
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                    qwbVar2 = qwbVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        boolean z14 = z12;
                        qwb qwbVar3 = qwbVar2;
                        if (z6) {
                            l7cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qwbVar3.e(j9) && mzbVar.w) {
                            c6c K3 = c6c.K(gzb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c6c K4 = c6c.K(gzb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c6c K5 = c6c.K(gzb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z14 && !z13) {
                            if ((L0 != null && sd2.w(15, L0)) || m9c.x(W1)) {
                                c6c K6 = c6c.K(gzb.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        long j11 = mzbVar.f;
                        qwb qwbVar4 = oc7.r1(mzbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10 = td4.g(((c6c) arrayList2.get(i10)).d, i10, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qwbVar4.w(arrayList3, j12);
                        qwbVar4.y(j12, false);
                        return;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l7c l7cVar2 = (l7c) obj2;
                        boolean z15 = mzbVar.n;
                        int i11 = mzbVar.e;
                        oc7 r12 = oc7.r1(i11);
                        long j13 = mzbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat L02 = r12.L0(Long.valueOf(j14));
                        TLRPC.User W12 = oc7.r1(i11).W1(Long.valueOf(j13));
                        qwb qwbVar5 = oc7.r1(i11).g4;
                        ArrayList l2 = qwbVar5.l(j14);
                        boolean z16 = mzbVar.r;
                        if (!z16) {
                            int i12 = kzb.b;
                            c6c K7 = c6c.K(kzb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z15;
                            K7.z = z16 ? 1 : 0;
                            if (mzbVar.f0 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            K7.L(z11);
                            arrayList4.add(K7);
                        }
                        if (l2 != null) {
                            int size2 = l2.size();
                            z9 = false;
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj4 = l2.get(i13);
                                i13++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = W12;
                                if (z16) {
                                    i4 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        W12 = user;
                                        size2 = i4;
                                    }
                                } else {
                                    i4 = size2;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    W12 = user;
                                    size2 = i4;
                                } else {
                                    if (!tL_forumTopic2.pinned) {
                                        if (z9) {
                                            l7cVar2.L();
                                            z9 = false;
                                        }
                                    } else if (!z9) {
                                        l7cVar2.M();
                                        z9 = true;
                                    }
                                    int i14 = kzb.b;
                                    c6c K8 = c6c.K(kzb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z15) {
                                        j5 = j13;
                                        K8.C = pg3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = mzbVar.f0;
                                    if (z15) {
                                        j6 = j15;
                                        j7 = pg3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    if (j6 == j7) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    K8.L(z10);
                                    arrayList4.add(K8);
                                    W12 = user;
                                    size2 = i4;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        TLRPC.User user2 = W12;
                        if (z9) {
                            l7cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qwbVar5.e(j14) && mzbVar.w) {
                            int i15 = kzb.b;
                            c6c K9 = c6c.K(kzb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c6c K10 = c6c.K(kzb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c6c K11 = c6c.K(kzb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z16 && !z15) {
                            if ((L02 != null && sd2.w(15, L02)) || m9c.x(user2)) {
                                int i16 = kzb.b;
                                c6c K12 = c6c.K(kzb.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList4.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new wyb(this), new wyb(this), ylbVar);
        this.y = azbVar;
        azbVar.E1(new jac(this) {
            public final mzb b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z5;
                boolean z6;
                boolean z7;
                long j3;
                qwb qwbVar;
                long j4;
                boolean z8;
                boolean z9;
                int i4;
                long j5;
                long j6;
                long j7;
                boolean z10;
                boolean z11;
                byte b = r2;
                mzb mzbVar = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        boolean z12 = mzbVar.r;
                        int i5 = mzbVar.e;
                        oc7 r1 = oc7.r1(i5);
                        long j8 = mzbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(j9));
                        TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(j8));
                        qwb qwbVar2 = oc7.r1(i5).g4;
                        ArrayList l = qwbVar2.l(j9);
                        boolean z13 = mzbVar.n;
                        int i6 = gzb.b;
                        c6c K = c6c.K(gzb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z13;
                        if (mzbVar.f0 == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        K.L(z5);
                        arrayList.add(K);
                        if (l != null) {
                            int size = l.size();
                            int i7 = 0;
                            z6 = false;
                            while (i7 < size) {
                                Object obj3 = l.get(i7);
                                int i8 = i7 + 1;
                                int i9 = size;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                if (z12) {
                                    z7 = z12;
                                    if (tL_forumTopic.id == 1) {
                                        size = i9;
                                        i7 = i8;
                                        z12 = z7;
                                    }
                                } else {
                                    z7 = z12;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                } else {
                                    if (!tL_forumTopic.pinned) {
                                        if (z6) {
                                            if (!arrayList.isEmpty()) {
                                                ((c6c) b10.f(1, arrayList)).z |= 8;
                                            }
                                            l7cVar.L();
                                            z6 = false;
                                        }
                                    } else if (!z6) {
                                        l7cVar.M();
                                        z6 = true;
                                    }
                                    c6c K2 = c6c.K(gzb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z13) {
                                        j3 = j8;
                                        K2.C = pg3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = mzbVar.f0;
                                    if (z13) {
                                        qwbVar = qwbVar2;
                                        j4 = pg3.n(tL_forumTopic.from_id);
                                    } else {
                                        qwbVar = qwbVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    if (j10 == j4) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    K2.L(z8);
                                    arrayList.add(K2);
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                    qwbVar2 = qwbVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        boolean z14 = z12;
                        qwb qwbVar3 = qwbVar2;
                        if (z6) {
                            l7cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qwbVar3.e(j9) && mzbVar.w) {
                            c6c K3 = c6c.K(gzb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c6c K4 = c6c.K(gzb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c6c K5 = c6c.K(gzb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z14 && !z13) {
                            if ((L0 != null && sd2.w(15, L0)) || m9c.x(W1)) {
                                c6c K6 = c6c.K(gzb.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        long j11 = mzbVar.f;
                        qwb qwbVar4 = oc7.r1(mzbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10 = td4.g(((c6c) arrayList2.get(i10)).d, i10, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qwbVar4.w(arrayList3, j12);
                        qwbVar4.y(j12, false);
                        return;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l7c l7cVar2 = (l7c) obj2;
                        boolean z15 = mzbVar.n;
                        int i11 = mzbVar.e;
                        oc7 r12 = oc7.r1(i11);
                        long j13 = mzbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat L02 = r12.L0(Long.valueOf(j14));
                        TLRPC.User W12 = oc7.r1(i11).W1(Long.valueOf(j13));
                        qwb qwbVar5 = oc7.r1(i11).g4;
                        ArrayList l2 = qwbVar5.l(j14);
                        boolean z16 = mzbVar.r;
                        if (!z16) {
                            int i12 = kzb.b;
                            c6c K7 = c6c.K(kzb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z15;
                            K7.z = z16 ? 1 : 0;
                            if (mzbVar.f0 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            K7.L(z11);
                            arrayList4.add(K7);
                        }
                        if (l2 != null) {
                            int size2 = l2.size();
                            z9 = false;
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj4 = l2.get(i13);
                                i13++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = W12;
                                if (z16) {
                                    i4 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        W12 = user;
                                        size2 = i4;
                                    }
                                } else {
                                    i4 = size2;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    W12 = user;
                                    size2 = i4;
                                } else {
                                    if (!tL_forumTopic2.pinned) {
                                        if (z9) {
                                            l7cVar2.L();
                                            z9 = false;
                                        }
                                    } else if (!z9) {
                                        l7cVar2.M();
                                        z9 = true;
                                    }
                                    int i14 = kzb.b;
                                    c6c K8 = c6c.K(kzb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z15) {
                                        j5 = j13;
                                        K8.C = pg3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = mzbVar.f0;
                                    if (z15) {
                                        j6 = j15;
                                        j7 = pg3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    if (j6 == j7) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    K8.L(z10);
                                    arrayList4.add(K8);
                                    W12 = user;
                                    size2 = i4;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        TLRPC.User user2 = W12;
                        if (z9) {
                            l7cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qwbVar5.e(j14) && mzbVar.w) {
                            int i15 = kzb.b;
                            c6c K9 = c6c.K(kzb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c6c K10 = c6c.K(kzb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c6c K11 = c6c.K(kzb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z16 && !z15) {
                            if ((L02 != null && sd2.w(15, L02)) || m9c.x(user2)) {
                                int i16 = kzb.b;
                                c6c K12 = c6c.K(kzb.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList4.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        azbVar.setWillNotDraw(false);
        azbVar.g3.r = false;
        azbVar.getContext();
        jg2 jg2Var = new jg2((ViewGroup) azbVar, (byte) 8);
        azbVar.f3 = jg2Var;
        azbVar.setLayoutManager(jg2Var);
        frameLayout2.addView(azbVar, qoe.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        azbVar.j(new bzb(this, (byte) 0));
        if (x) {
            lzb lzbVar = new lzb(i, ylbVar, activity);
            this.E = lzbVar;
            if (this.f0 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            lzbVar.c(true, false, z4);
            lzbVar.setOnClickListener(new View.OnClickListener(this) {
                public final mzb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(android.view.View r4) {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.onClick(android.view.View):void");
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(lzbVar, qoe.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.E = null;
        }
        ViewGroup viewGroup = frameLayout;
        czb czbVar = new czb(activity, i, new jac(this) {
            public final mzb b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z5;
                boolean z6;
                boolean z7;
                long j3;
                qwb qwbVar;
                long j4;
                boolean z8;
                boolean z9;
                int i4;
                long j5;
                long j6;
                long j7;
                boolean z10;
                boolean z11;
                byte b = r2;
                mzb mzbVar = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        boolean z12 = mzbVar.r;
                        int i5 = mzbVar.e;
                        oc7 r1 = oc7.r1(i5);
                        long j8 = mzbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(j9));
                        TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(j8));
                        qwb qwbVar2 = oc7.r1(i5).g4;
                        ArrayList l = qwbVar2.l(j9);
                        boolean z13 = mzbVar.n;
                        int i6 = gzb.b;
                        c6c K = c6c.K(gzb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z13;
                        if (mzbVar.f0 == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        K.L(z5);
                        arrayList.add(K);
                        if (l != null) {
                            int size = l.size();
                            int i7 = 0;
                            z6 = false;
                            while (i7 < size) {
                                Object obj3 = l.get(i7);
                                int i8 = i7 + 1;
                                int i9 = size;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                if (z12) {
                                    z7 = z12;
                                    if (tL_forumTopic.id == 1) {
                                        size = i9;
                                        i7 = i8;
                                        z12 = z7;
                                    }
                                } else {
                                    z7 = z12;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                } else {
                                    if (!tL_forumTopic.pinned) {
                                        if (z6) {
                                            if (!arrayList.isEmpty()) {
                                                ((c6c) b10.f(1, arrayList)).z |= 8;
                                            }
                                            l7cVar.L();
                                            z6 = false;
                                        }
                                    } else if (!z6) {
                                        l7cVar.M();
                                        z6 = true;
                                    }
                                    c6c K2 = c6c.K(gzb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z13) {
                                        j3 = j8;
                                        K2.C = pg3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = mzbVar.f0;
                                    if (z13) {
                                        qwbVar = qwbVar2;
                                        j4 = pg3.n(tL_forumTopic.from_id);
                                    } else {
                                        qwbVar = qwbVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    if (j10 == j4) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    K2.L(z8);
                                    arrayList.add(K2);
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                    qwbVar2 = qwbVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        boolean z14 = z12;
                        qwb qwbVar3 = qwbVar2;
                        if (z6) {
                            l7cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qwbVar3.e(j9) && mzbVar.w) {
                            c6c K3 = c6c.K(gzb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c6c K4 = c6c.K(gzb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c6c K5 = c6c.K(gzb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z14 && !z13) {
                            if ((L0 != null && sd2.w(15, L0)) || m9c.x(W1)) {
                                c6c K6 = c6c.K(gzb.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        long j11 = mzbVar.f;
                        qwb qwbVar4 = oc7.r1(mzbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10 = td4.g(((c6c) arrayList2.get(i10)).d, i10, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qwbVar4.w(arrayList3, j12);
                        qwbVar4.y(j12, false);
                        return;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l7c l7cVar2 = (l7c) obj2;
                        boolean z15 = mzbVar.n;
                        int i11 = mzbVar.e;
                        oc7 r12 = oc7.r1(i11);
                        long j13 = mzbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat L02 = r12.L0(Long.valueOf(j14));
                        TLRPC.User W12 = oc7.r1(i11).W1(Long.valueOf(j13));
                        qwb qwbVar5 = oc7.r1(i11).g4;
                        ArrayList l2 = qwbVar5.l(j14);
                        boolean z16 = mzbVar.r;
                        if (!z16) {
                            int i12 = kzb.b;
                            c6c K7 = c6c.K(kzb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z15;
                            K7.z = z16 ? 1 : 0;
                            if (mzbVar.f0 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            K7.L(z11);
                            arrayList4.add(K7);
                        }
                        if (l2 != null) {
                            int size2 = l2.size();
                            z9 = false;
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj4 = l2.get(i13);
                                i13++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = W12;
                                if (z16) {
                                    i4 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        W12 = user;
                                        size2 = i4;
                                    }
                                } else {
                                    i4 = size2;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    W12 = user;
                                    size2 = i4;
                                } else {
                                    if (!tL_forumTopic2.pinned) {
                                        if (z9) {
                                            l7cVar2.L();
                                            z9 = false;
                                        }
                                    } else if (!z9) {
                                        l7cVar2.M();
                                        z9 = true;
                                    }
                                    int i14 = kzb.b;
                                    c6c K8 = c6c.K(kzb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z15) {
                                        j5 = j13;
                                        K8.C = pg3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = mzbVar.f0;
                                    if (z15) {
                                        j6 = j15;
                                        j7 = pg3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    if (j6 == j7) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    K8.L(z10);
                                    arrayList4.add(K8);
                                    W12 = user;
                                    size2 = i4;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        TLRPC.User user2 = W12;
                        if (z9) {
                            l7cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qwbVar5.e(j14) && mzbVar.w) {
                            int i15 = kzb.b;
                            c6c K9 = c6c.K(kzb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c6c K10 = c6c.K(kzb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c6c K11 = c6c.K(kzb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z16 && !z15) {
                            if ((L02 != null && sd2.w(15, L02)) || m9c.x(user2)) {
                                int i16 = kzb.b;
                                c6c K12 = c6c.K(kzb.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList4.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new wyb(this), new wyb(this), ylbVar);
        this.K = czbVar;
        czbVar.E1(new jac(this) {
            public final mzb b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z5;
                boolean z6;
                boolean z7;
                long j3;
                qwb qwbVar;
                long j4;
                boolean z8;
                boolean z9;
                int i4;
                long j5;
                long j6;
                long j7;
                boolean z10;
                boolean z11;
                byte b = r2;
                mzb mzbVar = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        boolean z12 = mzbVar.r;
                        int i5 = mzbVar.e;
                        oc7 r1 = oc7.r1(i5);
                        long j8 = mzbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat L0 = r1.L0(Long.valueOf(j9));
                        TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(j8));
                        qwb qwbVar2 = oc7.r1(i5).g4;
                        ArrayList l = qwbVar2.l(j9);
                        boolean z13 = mzbVar.n;
                        int i6 = gzb.b;
                        c6c K = c6c.K(gzb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z13;
                        if (mzbVar.f0 == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        K.L(z5);
                        arrayList.add(K);
                        if (l != null) {
                            int size = l.size();
                            int i7 = 0;
                            z6 = false;
                            while (i7 < size) {
                                Object obj3 = l.get(i7);
                                int i8 = i7 + 1;
                                int i9 = size;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                if (z12) {
                                    z7 = z12;
                                    if (tL_forumTopic.id == 1) {
                                        size = i9;
                                        i7 = i8;
                                        z12 = z7;
                                    }
                                } else {
                                    z7 = z12;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                } else {
                                    if (!tL_forumTopic.pinned) {
                                        if (z6) {
                                            if (!arrayList.isEmpty()) {
                                                ((c6c) b10.f(1, arrayList)).z |= 8;
                                            }
                                            l7cVar.L();
                                            z6 = false;
                                        }
                                    } else if (!z6) {
                                        l7cVar.M();
                                        z6 = true;
                                    }
                                    c6c K2 = c6c.K(gzb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z13) {
                                        j3 = j8;
                                        K2.C = pg3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = mzbVar.f0;
                                    if (z13) {
                                        qwbVar = qwbVar2;
                                        j4 = pg3.n(tL_forumTopic.from_id);
                                    } else {
                                        qwbVar = qwbVar2;
                                        j4 = tL_forumTopic.id;
                                    }
                                    if (j10 == j4) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    K2.L(z8);
                                    arrayList.add(K2);
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                    qwbVar2 = qwbVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        boolean z14 = z12;
                        qwb qwbVar3 = qwbVar2;
                        if (z6) {
                            l7cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !qwbVar3.e(j9) && mzbVar.w) {
                            c6c K3 = c6c.K(gzb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c6c K4 = c6c.K(gzb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c6c K5 = c6c.K(gzb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z14 && !z13) {
                            if ((L0 != null && sd2.w(15, L0)) || m9c.x(W1)) {
                                c6c K6 = c6c.K(gzb.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        long j11 = mzbVar.f;
                        qwb qwbVar4 = oc7.r1(mzbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10 = td4.g(((c6c) arrayList2.get(i10)).d, i10, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        qwbVar4.w(arrayList3, j12);
                        qwbVar4.y(j12, false);
                        return;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l7c l7cVar2 = (l7c) obj2;
                        boolean z15 = mzbVar.n;
                        int i11 = mzbVar.e;
                        oc7 r12 = oc7.r1(i11);
                        long j13 = mzbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat L02 = r12.L0(Long.valueOf(j14));
                        TLRPC.User W12 = oc7.r1(i11).W1(Long.valueOf(j13));
                        qwb qwbVar5 = oc7.r1(i11).g4;
                        ArrayList l2 = qwbVar5.l(j14);
                        boolean z16 = mzbVar.r;
                        if (!z16) {
                            int i12 = kzb.b;
                            c6c K7 = c6c.K(kzb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z15;
                            K7.z = z16 ? 1 : 0;
                            if (mzbVar.f0 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            K7.L(z11);
                            arrayList4.add(K7);
                        }
                        if (l2 != null) {
                            int size2 = l2.size();
                            z9 = false;
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj4 = l2.get(i13);
                                i13++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = W12;
                                if (z16) {
                                    i4 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        W12 = user;
                                        size2 = i4;
                                    }
                                } else {
                                    i4 = size2;
                                }
                                if (mzbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    W12 = user;
                                    size2 = i4;
                                } else {
                                    if (!tL_forumTopic2.pinned) {
                                        if (z9) {
                                            l7cVar2.L();
                                            z9 = false;
                                        }
                                    } else if (!z9) {
                                        l7cVar2.M();
                                        z9 = true;
                                    }
                                    int i14 = kzb.b;
                                    c6c K8 = c6c.K(kzb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z15) {
                                        j5 = j13;
                                        K8.C = pg3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = mzbVar.f0;
                                    if (z15) {
                                        j6 = j15;
                                        j7 = pg3.n(tL_forumTopic2.from_id);
                                    } else {
                                        j6 = j15;
                                        j7 = tL_forumTopic2.id;
                                    }
                                    if (j6 == j7) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    K8.L(z10);
                                    arrayList4.add(K8);
                                    W12 = user;
                                    size2 = i4;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        TLRPC.User user2 = W12;
                        if (z9) {
                            l7cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !qwbVar5.e(j14) && mzbVar.w) {
                            int i15 = kzb.b;
                            c6c K9 = c6c.K(kzb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c6c K10 = c6c.K(kzb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c6c K11 = c6c.K(kzb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z16 && !z15) {
                            if ((L02 != null && sd2.w(15, L02)) || m9c.x(user2)) {
                                int i16 = kzb.b;
                                c6c K12 = c6c.K(kzb.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.r = false;
                                arrayList4.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        czbVar.g3.r = false;
        czbVar.setClipToPadding(false);
        czbVar.setClipChildren(false);
        if (x) {
            f = 90.0f;
        } else {
            f = 48.0f;
        }
        viewGroup.addView(czbVar, qoe.d(-1, -1.0f, 119, 0.0f, f, 0.0f, 0.0f));
        czbVar.j(new bzb(this, (byte) 1));
        ImageView g = g(activity, 2131231889, new View.OnClickListener(this) {
            public final mzb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(android.view.View r4) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.onClick(android.view.View):void");
            }
        });
        this.H = g;
        ImageView g2 = g(activity, 2131231889, new View.OnClickListener(this) {
            public final mzb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(android.view.View r4) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.onClick(android.view.View):void");
            }
        });
        this.I = g2;
        frameLayout2.addView(g, qoe.e(44, 36, 51));
        viewGroup.addView(g2, qoe.e(64, 48, 51));
        ImageView g3 = g(activity, 2131232363, new View.OnClickListener(this) {
            public final mzb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(android.view.View r4) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.onClick(android.view.View):void");
            }
        });
        this.F = g3;
        ImageView g4 = g(activity, 2131232363, new View.OnClickListener(this) {
            public final mzb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(android.view.View r4) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.onClick(android.view.View):void");
            }
        });
        this.G = g4;
        frameLayout2.addView(g3, qoe.e(44, 36, 51));
        viewGroup.addView(g4, qoe.e(64, 48, 51));
        oc7.r1(i).g4.n(3, j2, false);
        SharedPreferences sharedPreferences = oc7.r1(i).X3;
        if (z && kt6.w("topicssidetabs", j, sharedPreferences, false)) {
            this.V = 1.0f;
            z2 = true;
            this.U = true;
        } else {
            z2 = true;
        }
        if (z && kt6.w("topicssidetabsb", j, sharedPreferences, false)) {
            z3 = z2;
        } else {
            z3 = false;
        }
        this.T = z3;
        if (z3) {
            i2 = 2131231891;
        } else {
            i2 = 2131231888;
        }
        g2.setImageResource(i2);
        o(false);
        if (!this.T) {
            i3 = 2131231889;
        } else {
            i3 = 2131231891;
        }
        g.setImageResource(i3);
        d(false);
        e();
        m();
        n();
    }

    public static ImageView g(Activity activity, int i, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(i);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        rve.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z) {
        if (this.g0 == z) {
            return;
        }
        this.g0 = z;
        int i = 0;
        int i2 = nm7.u5;
        long j = this.f;
        int i3 = this.e;
        if (z) {
            nm7.f(i3).b(this, i2);
            nm7.f(i3).b(this, 2);
            qwb qwbVar = oc7.r1(i3).g4;
            long j2 = -j;
            LongSparseIntArray longSparseIntArray = qwbVar.r;
            longSparseIntArray.put(j2, longSparseIntArray.get(j2, 0) + 1);
            qwbVar.y(j2, true);
            return;
        }
        long j3 = -j;
        LongSparseIntArray longSparseIntArray2 = oc7.r1(i3).g4.r;
        int i4 = longSparseIntArray2.get(j3, 0) - 1;
        if (i4 >= 0) {
            i = i4;
        }
        longSparseIntArray2.put(j3, i);
        nm7.f(i3).n(this, i2);
        nm7.f(i3).n(this, 2);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        m();
    }

    @Override
    public final void V(float f, int i) {
        if (i == 1 && f == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(2131231889);
            this.I.setImageResource(2131231888);
            SharedPreferences.Editor edit = oc7.r1(this.e).X3.edit();
            edit.putBoolean("topicssidetabsb" + this.f, false).apply();
            o(true);
        }
    }

    public final void a(boolean z) {
        float f;
        if (this.U == z) {
            return;
        }
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.W) {
                this.d0 = Boolean.valueOf(z);
                return;
            }
        }
        if (!z) {
            this.T = !this.T;
        }
        this.U = z;
        this.W = true;
        float f2 = this.V;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new oxb(this, (byte) 2));
        this.e0.addListener(new sw9((byte) 10, this, z));
        this.e0.setInterpolator(wb2.V);
        this.e0.setDuration(250L);
        this.e0.start();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y6));
    }

    public final void b() {
        int i = cmb.y6;
        ylb ylbVar = this.h;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.Ei, ylbVar);
        int f = on2.f(1.0f - this.V, v0, v02);
        int f2 = on2.f(this.V, v0, v02);
        boolean z = this.a0;
        this.a0 = true;
        ImageView imageView = this.H;
        if (imageView != null && (!z || f != this.b0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
        }
        this.b0 = f;
        ImageView imageView2 = this.I;
        if (imageView2 != null && (!z || f2 != this.c0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
        }
        this.c0 = f2;
    }

    public final void c() {
        FrameLayout frameLayout = this.J;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.Q + this.R);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void d(boolean z) {
        boolean z2;
        ArrayList l = oc7.r1(this.e).g4.l(-this.f);
        if (l != null && !l.isEmpty() && !this.k0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a.a(z2, z);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.u5;
        long j = this.f;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == (-j)) {
                n();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = oc7.s5;
            if ((intValue & 512) > 0) {
                oc7.r1(this.e).g4.y(-j, false);
                n();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.J;
        if (frameLayout.getVisibility() == 0) {
            this.O.setBounds((int) frameLayout.getTranslationX(), (int) this.R, (int) (frameLayout.getTranslationX() + gm.L(78.0f)), (int) (getMeasuredHeight() - this.Q));
            this.O.draw(canvas);
        }
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2.getVisibility() == 0) {
            this.P.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.P.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + gm.L(50.0f)));
            this.P.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        if (view == this.J) {
            canvas.clipPath(this.O.S.k);
        }
        if (view == this.x) {
            canvas.clipPath(this.P.S.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i;
        int i2;
        int i3;
        fn0 fn0Var = this.N;
        float f = fn0Var.e;
        ImageView imageView = this.F;
        imageView.setAlpha(f);
        imageView.setScaleX(gm.R1(0.4f, 1.0f, f));
        imageView.setScaleY(gm.R1(0.4f, 1.0f, f));
        int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        int i5 = 8;
        if (i4 > 0) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.G;
        imageView2.setAlpha(f);
        imageView2.setScaleX(gm.R1(0.4f, 1.0f, f));
        imageView2.setScaleY(gm.R1(0.4f, 1.0f, f));
        if (i4 > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        float f2 = 1.0f - fn0Var.e;
        ImageView imageView3 = this.H;
        imageView3.setAlpha(f2);
        imageView3.setScaleX(gm.R1(0.4f, 1.0f, f2));
        imageView3.setScaleY(gm.R1(0.4f, 1.0f, f2));
        int i6 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i6 > 0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView3.setVisibility(i3);
        ImageView imageView4 = this.I;
        imageView4.setAlpha(f2);
        imageView4.setScaleX(gm.R1(0.4f, 1.0f, f2));
        imageView4.setScaleY(gm.R1(0.4f, 1.0f, f2));
        if (i6 > 0) {
            i5 = 0;
        }
        imageView4.setVisibility(i5);
    }

    public final void f() {
        int i;
        float R1 = gm.R1(1.0f, 0.0f, this.V);
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(R1);
        if ((1.0f - this.b.e) * (1.0f - this.V) * this.a.e > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (this.T) {
            frameLayout.setTranslationY(((getMeasuredHeight() - gm.L(50.0f)) - this.Q) + gm.U1(h(izb.c), gm.L(43.0f), 0));
            return;
        }
        frameLayout.setTranslationY(this.R + gm.U1(h(izb.a), -gm.L(43.0f), 0));
    }

    public izb getCurrentTabsPosition() {
        if (this.U) {
            return izb.b;
        }
        if (this.T) {
            return izb.c;
        }
        return izb.a;
    }

    public float getSideMenuT() {
        return this.V * this.a.e;
    }

    public final float h(izb izbVar) {
        float f = (1.0f - this.b.e) * this.a.e;
        if (izbVar == izb.b) {
            return this.V * f;
        }
        if ((izbVar == izb.a && !this.T) || (izbVar == izb.c && this.T)) {
            return (1.0f - this.V) * f;
        }
        return 0.0f;
    }

    public final boolean i() {
        if (this.V > 0.5f) {
            int i = 0;
            while (true) {
                czb czbVar = this.K;
                if (i >= czbVar.getChildCount()) {
                    break;
                }
                c6c G = czbVar.g3.G(RecyclerView.R(czbVar.getChildAt(i)));
                if (G == null || !G.s) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            int i2 = 0;
            while (true) {
                azb azbVar = this.y;
                if (i2 >= azbVar.getChildCount()) {
                    break;
                }
                c6c G2 = azbVar.g3.G(RecyclerView.R(azbVar.getChildAt(i2)));
                if (G2 != null && G2.s) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    public final void j() {
        qwb qwbVar = oc7.r1(this.e).g4;
        long j = this.f;
        if (!qwbVar.e(-j)) {
            qwbVar.o(-j);
        }
    }

    public final void k(long j, boolean z) {
        if (this.n) {
            jac jacVar = this.j0;
            if (jacVar != null) {
                jacVar.a(Long.valueOf(j), Boolean.valueOf(z));
                return;
            }
            return;
        }
        jac jacVar2 = this.h0;
        if (jacVar2 != null) {
            jacVar2.a(Integer.valueOf((int) j), Boolean.valueOf(z));
        }
    }

    public final boolean l(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i;
        int i2;
        oc7 oc7Var;
        final mzb mzbVar;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i3;
        String M0;
        int i4;
        final mzb mzbVar2;
        boolean z2;
        int i5;
        String M02;
        int i6;
        bu5 bu5Var;
        int i7 = this.e;
        oc7 r1 = oc7.r1(i7);
        long j = this.f;
        int i8 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i8 < 0) {
            chat = r1.L0(Long.valueOf(-j));
        } else {
            chat = null;
        }
        if (i8 > 0) {
            user = r1.W1(Long.valueOf(j));
        } else {
            user = null;
        }
        yv1 yv1Var = this.s;
        final bu5 J = bu5.J(yv1Var, view);
        if (sd2.p0(chat)) {
            long n = pg3.n(tL_forumTopic.from_id);
            if (n == 0 || !sd2.A(i7, chat, 24)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            bu5 bu5Var2 = J;
            bu5Var2.b(2131232098, jb6.M0(2131752026, null), new nz8(this, bu5Var2, n, chat2, (byte) 16), false);
            long j2 = chat2.id;
            if (sd2.p0(chat2) && sd2.A(i7, chat2, 24)) {
                long j3 = chat2.linked_monoforum_id;
                if (j3 != 0) {
                    j2 = j3;
                }
            }
            TLRPC.Chat L0 = oc7.r1(i7).L0(Long.valueOf(j2));
            TLRPC.User W1 = oc7.r1(i7).W1(Long.valueOf(n));
            bu5 bu5Var3 = bu5Var2;
            if (W1 != null) {
                bu5Var3 = bu5Var2;
                if (sd2.w(2, L0)) {
                    bu5Var2.b(2131232334, jb6.M0(2131753691, null), null, false);
                    a8 z3 = bu5Var2.z();
                    z3.setVisibility(8);
                    oc7 r12 = oc7.r1(i7);
                    hs5 hs5Var = new hs5(this, z3, bu5Var2, j2, W1, L0, (byte) 3);
                    bu5Var3 = bu5Var2;
                    r12.J0(L0, W1, hs5Var);
                }
            }
            mzbVar2 = this;
            bu5Var = bu5Var3;
        } else {
            if (!sd2.y(15, chat) && !m9c.x(user)) {
                i3 = 15;
                tL_forumTopic2 = tL_forumTopic;
                oc7Var = r1;
                mzbVar = this;
            } else {
                if (tL_forumTopic.pinned) {
                    i = 2131232419;
                    i2 = 2131751389;
                } else {
                    i = 2131232299;
                    i2 = 2131751390;
                }
                oc7Var = r1;
                mzbVar = this;
                tL_forumTopic2 = tL_forumTopic;
                J.b(i, jb6.M0(i2, null), new hza(this, J, oc7Var, tL_forumTopic, (byte) 13), false);
                if (tL_forumTopic2.pinned && !z) {
                    J.b(2131232791, jb6.M0(2131750642, null), new xyb(mzbVar, (byte) 1), false);
                }
                i3 = 15;
            }
            if (sd2.y(i3, chat) || m9c.x(user)) {
                J.b(2131232509, jb6.M0(2131751153, null), new Runnable(mzbVar) {
                    public final mzb b;

                    {
                        this.b = mzbVar;
                    }

                    @Override
                    public final void run() {
                        byte b = r4;
                        mzb mzbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        bu5 bu5Var4 = J;
                        switch (b) {
                            case 0:
                                bu5Var4.u();
                                mzbVar3.s.presentFragment(wvb.f0(-mzbVar3.f, tL_forumTopic3.id));
                                return;
                            case 1:
                                bu5Var4.u();
                                oc7.r1(mzbVar3.e).g4.z(tL_forumTopic3.id, -mzbVar3.f, !tL_forumTopic3.closed);
                                return;
                            default:
                                bu5Var4.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jd jdVar = new jd((byte) 10);
                                mzb mzbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzbVar4.getContext());
                                String J0 = jb6.J0(hashSet.size(), "DeleteTopics");
                                he heVar = alertDialog$Builder.a;
                                heVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j4 = mzbVar4.f0;
                                if (hashSet.size() == 1) {
                                    heVar.U = jb6.a0(null, null, 2131751435, oc7.r1(mzbVar4.e).g4.f(-mzbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    heVar.U = jb6.M0(2131751434, null);
                                }
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new jp1(mzbVar4, arrayList, j4, hashSet, jdVar));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 3));
                                heVar.show();
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            long j4 = tL_forumTopic2.id;
            int currentAccount = yv1Var.getCurrentAccount();
            ylb resourceProvider = yv1Var.getResourceProvider();
            long j5 = mzbVar.f;
            cd2 cd2Var = new cd2(J, currentAccount, j5, j4, yv1Var, resourceProvider);
            bu5 K = J.K();
            K.b(2131232063, jb6.M0(2131753721, null), new bo1(J, (byte) 0), false);
            K.b(2131232409, jb6.M0(2131745009, null), new y97(J, currentAccount, j5, j4, K, yv1Var, resourceProvider), false);
            a8 z4 = K.z();
            K.b(2131232264, jb6.M0(2131748065, null), new up6(J, resourceProvider, currentAccount, cd2Var, (byte) 16), false);
            K.b(2131232112, jb6.M0(2131747650, null), new ev4(J, j5, j4, yv1Var, resourceProvider, (byte) 3), false);
            K.b(0, "", new dd2(J, currentAccount, j5, j4, yv1Var, resourceProvider), false);
            new ed2(currentAccount, j5, j4, K.z(), z4).run();
            long j6 = mzbVar.f;
            oc7 oc7Var2 = oc7Var;
            if (oc7Var2.o2(j6, tL_forumTopic2.id, null)) {
                M0 = jb6.M0(2131743536, null);
                i4 = 2131232418;
            } else {
                M0 = jb6.M0(2131748071, null);
                i4 = 2131232262;
            }
            int i9 = i4;
            TLRPC.Chat chat3 = chat;
            mzbVar2 = this;
            final bu5 bu5Var4 = J;
            bu5Var4.b(i9, M0, new vua(mzbVar2, oc7Var2, tL_forumTopic, J, K, (byte) 6), false);
            if (sd2.i(i7, chat3, tL_forumTopic) && !m9c.w(user)) {
                if (tL_forumTopic.closed) {
                    M02 = jb6.M0(2131745817, null);
                    i6 = 2131232412;
                } else {
                    M02 = jb6.M0(2131751976, null);
                    i6 = 2131232410;
                }
                i5 = 1;
                z2 = false;
                bu5Var4.b(i6, M02, new Runnable(mzbVar2) {
                    public final mzb b;

                    {
                        this.b = mzbVar2;
                    }

                    @Override
                    public final void run() {
                        byte b = r4;
                        mzb mzbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        bu5 bu5Var42 = bu5Var4;
                        switch (b) {
                            case 0:
                                bu5Var42.u();
                                mzbVar3.s.presentFragment(wvb.f0(-mzbVar3.f, tL_forumTopic3.id));
                                return;
                            case 1:
                                bu5Var42.u();
                                oc7.r1(mzbVar3.e).g4.z(tL_forumTopic3.id, -mzbVar3.f, !tL_forumTopic3.closed);
                                return;
                            default:
                                bu5Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jd jdVar = new jd((byte) 10);
                                mzb mzbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzbVar4.getContext());
                                String J0 = jb6.J0(hashSet.size(), "DeleteTopics");
                                he heVar = alertDialog$Builder.a;
                                heVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j42 = mzbVar4.f0;
                                if (hashSet.size() == 1) {
                                    heVar.U = jb6.a0(null, null, 2131751435, oc7.r1(mzbVar4.e).g4.f(-mzbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    heVar.U = jb6.M0(2131751434, null);
                                }
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new jp1(mzbVar4, arrayList, j42, hashSet, jdVar));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 3));
                                heVar.show();
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            } else {
                z2 = false;
                i5 = 1;
            }
            bu5Var = bu5Var4;
            if (sd2.e(i7, chat3, tL_forumTopic)) {
                bu5Var4.b(2131232114, jb6.J0(i5, "DeleteTopics"), new Runnable(mzbVar2) {
                    public final mzb b;

                    {
                        this.b = mzbVar2;
                    }

                    @Override
                    public final void run() {
                        byte b = r4;
                        mzb mzbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        bu5 bu5Var42 = bu5Var4;
                        switch (b) {
                            case 0:
                                bu5Var42.u();
                                mzbVar3.s.presentFragment(wvb.f0(-mzbVar3.f, tL_forumTopic3.id));
                                return;
                            case 1:
                                bu5Var42.u();
                                oc7.r1(mzbVar3.e).g4.z(tL_forumTopic3.id, -mzbVar3.f, !tL_forumTopic3.closed);
                                return;
                            default:
                                bu5Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jd jdVar = new jd((byte) 10);
                                mzb mzbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzbVar4.getContext());
                                String J0 = jb6.J0(hashSet.size(), "DeleteTopics");
                                he heVar = alertDialog$Builder.a;
                                heVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j42 = mzbVar4.f0;
                                if (hashSet.size() == 1) {
                                    heVar.U = jb6.a0(null, null, 2131751435, oc7.r1(mzbVar4.e).g4.f(-mzbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    heVar.U = jb6.M0(2131751434, null);
                                }
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new jp1(mzbVar4, arrayList, j42, hashSet, jdVar));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 3));
                                heVar.show();
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, z2);
                bu5Var = bu5Var4;
            }
        }
        boolean z5 = view instanceof hzb;
        ylb ylbVar = mzbVar2.h;
        if (z5) {
            ?? drawable = new Drawable();
            Paint paint = new Paint(1);
            drawable.a = paint;
            drawable.b = new RectF();
            paint.setColor(cmb.v0(cmb.F8, ylbVar));
            bu5Var.X(drawable);
            bu5Var.b0(gm.L(16.0f), 0.0f);
        } else if (z) {
            bu5Var.X(cmb.b0(gm.L(16.0f), cmb.v0(cmb.c6, ylbVar)));
            bu5Var.W(5);
        } else {
            int L = gm.L(5.0f);
            int L2 = gm.L(5.0f);
            int v0 = cmb.v0(cmb.c6, ylbVar);
            float f = L;
            float f2 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, f, f, f2, f2, 0.0f, 0.0f}, null, null));
            shapeDrawable.getPaint().setColor(v0);
            bu5Var.X(shapeDrawable);
        }
        bu5Var.a0();
        return true;
    }

    public final void m() {
        mz mzVar = this.S;
        if (mzVar != null) {
            mzVar.run();
        }
        f();
        float h = h(izb.b);
        int i = 0;
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(gm.U1(h, -gm.L(78.0f), 0));
        if (h <= 0.0f) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        b();
        int i2 = cmb.Ei;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        ylb ylbVar = this.h;
        anb.s(imageView, i2, ylbVar, mode);
        anb.s(this.G, i2, ylbVar, mode);
        invalidate();
    }

    public final void n() {
        d(true);
        azb azbVar = this.y;
        boolean canScrollHorizontally = azbVar.canScrollHorizontally(-1);
        azbVar.g3.O(true);
        if (!canScrollHorizontally) {
            azbVar.w0(0);
        }
        czb czbVar = this.K;
        boolean canScrollVertically = czbVar.canScrollVertically(-1);
        czbVar.g3.O(true);
        if (!canScrollVertically) {
            czbVar.w0(0);
        }
        gm.c3(new xyb(this, (byte) 0));
    }

    public final void o(boolean z) {
        boolean z2;
        if (this.c && !this.d) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.b.a(z2, z);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f();
    }

    public void setAllTopicsHidden(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            d(true);
        }
    }

    public void setCurrentTopic(long j) {
        boolean z;
        this.f0 = j;
        azb azbVar = this.y;
        azbVar.g3.O(true);
        azbVar.invalidate();
        this.K.g3.O(true);
        lzb lzbVar = this.E;
        if (lzbVar != null) {
            if (j == 0) {
                z = true;
            } else {
                z = false;
            }
            lzbVar.c(true, false, z);
        }
    }

    public void setOnDialogSelected(jac jacVar) {
        this.j0 = jacVar;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setOnTopicSelected(jac jacVar) {
        this.h0 = jacVar;
    }

    public void setSideMenuBackgroundDrawable(im0 im0Var) {
        this.O = im0Var;
        im0Var.r(gm.L(16.0f));
        this.O.q(gm.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f) {
        this.Q = f;
        f();
        c();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f) {
        this.R = f;
        this.J.setTranslationY(f);
        f();
        c();
        invalidate();
    }

    public void setTabsEnabled(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (!z) {
            a(false);
        }
        o(true);
    }

    public void setTopMenuBackgroundDrawable(im0 im0Var) {
        this.P = im0Var;
        im0Var.r(gm.L(18.0f));
        this.P.q(gm.L(7.0f));
    }

    @Override
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
