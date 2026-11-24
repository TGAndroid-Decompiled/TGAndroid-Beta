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
public final class kxb extends FrameLayout implements gk7, x74, tjb {
    public final jxb E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final axb K;
    public long L;
    public long M;
    public final fm0 N;
    public il0 O;
    public il0 P;
    public float Q;
    public float R;
    public my S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public final fm0 a;
    public boolean a0;
    public final fm0 b;
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
    public final wjb h;
    public i8c h0;
    public Runnable i0;
    public i8c j0;
    public boolean k0;
    public final HashSet l0;
    public final boolean n;
    public final boolean r;
    public final mu1 s;
    public final boolean w;
    public final FrameLayout x;
    public final ywb y;

    public kxb(Activity activity, mu1 mu1Var, int i, long j, boolean z, wjb wjbVar) {
        super(activity);
        FrameLayout frameLayout;
        float f;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 380L, true);
        this.b = new fm0(1, this, s33Var, 380L, false);
        this.N = new fm0(0, new twb(this), s33Var, 320L, false);
        this.V = 0.0f;
        this.l0 = new HashSet();
        this.s = mu1Var;
        this.c = z;
        this.e = i;
        this.f = j;
        this.h = wjbVar;
        long j2 = -j;
        this.n = hc2.p0(na7.q1(i).K0(Long.valueOf(j2)));
        boolean x = l7c.x(na7.q1(i).V1(Long.valueOf(j)));
        this.r = x;
        this.w = !ls6.v("topics_end_reached_", j2, y6c.h(i).j(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.x = frameLayout2;
        addView(frameLayout2, nme.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.J = frameLayout3;
        addView(frameLayout3, nme.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        ywb ywbVar = new ywb(this, activity, i, new i8c(this) {
            public final kxb b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z5;
                boolean z6;
                boolean z7;
                long j3;
                pub pubVar;
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
                kxb kxbVar = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l5c l5cVar = (l5c) obj2;
                        boolean z12 = kxbVar.r;
                        int i5 = kxbVar.e;
                        na7 q1 = na7.q1(i5);
                        long j8 = kxbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat K0 = q1.K0(Long.valueOf(j9));
                        TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(j8));
                        pub pubVar2 = na7.q1(i5).g4;
                        ArrayList l = pubVar2.l(j9);
                        boolean z13 = kxbVar.n;
                        int i6 = exb.b;
                        c4c K = c4c.K(exb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z13;
                        if (kxbVar.f0 == 0) {
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
                                if (kxbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                } else {
                                    if (!tL_forumTopic.pinned) {
                                        if (z6) {
                                            if (!arrayList.isEmpty()) {
                                                ((c4c) b00.f(1, arrayList)).z |= 8;
                                            }
                                            l5cVar.L();
                                            z6 = false;
                                        }
                                    } else if (!z6) {
                                        l5cVar.M();
                                        z6 = true;
                                    }
                                    c4c K2 = c4c.K(exb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z13) {
                                        j3 = j8;
                                        K2.C = cf3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = kxbVar.f0;
                                    if (z13) {
                                        pubVar = pubVar2;
                                        j4 = cf3.n(tL_forumTopic.from_id);
                                    } else {
                                        pubVar = pubVar2;
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
                                    pubVar2 = pubVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        boolean z14 = z12;
                        pub pubVar3 = pubVar2;
                        if (z6) {
                            l5cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !pubVar3.e(j9) && kxbVar.w) {
                            c4c K3 = c4c.K(exb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c4c K4 = c4c.K(exb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c4c K5 = c4c.K(exb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z14 && !z13) {
                            if ((K0 != null && hc2.w(15, K0)) || l7c.x(V1)) {
                                c4c K6 = c4c.K(exb.class);
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
                        long j11 = kxbVar.f;
                        pub pubVar4 = na7.q1(kxbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10 = tb4.g(((c4c) arrayList2.get(i10)).d, i10, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        pubVar4.w(arrayList3, j12);
                        pubVar4.y(j12, false);
                        return;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l5c l5cVar2 = (l5c) obj2;
                        boolean z15 = kxbVar.n;
                        int i11 = kxbVar.e;
                        na7 q12 = na7.q1(i11);
                        long j13 = kxbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat K02 = q12.K0(Long.valueOf(j14));
                        TLRPC.User V12 = na7.q1(i11).V1(Long.valueOf(j13));
                        pub pubVar5 = na7.q1(i11).g4;
                        ArrayList l2 = pubVar5.l(j14);
                        boolean z16 = kxbVar.r;
                        if (!z16) {
                            int i12 = ixb.b;
                            c4c K7 = c4c.K(ixb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z15;
                            K7.z = z16 ? 1 : 0;
                            if (kxbVar.f0 == 0) {
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
                                TLRPC.User user = V12;
                                if (z16) {
                                    i4 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        V12 = user;
                                        size2 = i4;
                                    }
                                } else {
                                    i4 = size2;
                                }
                                if (kxbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    V12 = user;
                                    size2 = i4;
                                } else {
                                    if (!tL_forumTopic2.pinned) {
                                        if (z9) {
                                            l5cVar2.L();
                                            z9 = false;
                                        }
                                    } else if (!z9) {
                                        l5cVar2.M();
                                        z9 = true;
                                    }
                                    int i14 = ixb.b;
                                    c4c K8 = c4c.K(ixb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z15) {
                                        j5 = j13;
                                        K8.C = cf3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = kxbVar.f0;
                                    if (z15) {
                                        j6 = j15;
                                        j7 = cf3.n(tL_forumTopic2.from_id);
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
                                    V12 = user;
                                    size2 = i4;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        TLRPC.User user2 = V12;
                        if (z9) {
                            l5cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !pubVar5.e(j14) && kxbVar.w) {
                            int i15 = ixb.b;
                            c4c K9 = c4c.K(ixb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c4c K10 = c4c.K(ixb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c4c K11 = c4c.K(ixb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z16 && !z15) {
                            if ((K02 != null && hc2.w(15, K02)) || l7c.x(user2)) {
                                int i16 = ixb.b;
                                c4c K12 = c4c.K(ixb.class);
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
        }, new twb(this), new twb(this), wjbVar);
        this.y = ywbVar;
        ywbVar.E1(new i8c(this) {
            public final kxb b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z5;
                boolean z6;
                boolean z7;
                long j3;
                pub pubVar;
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
                kxb kxbVar = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l5c l5cVar = (l5c) obj2;
                        boolean z12 = kxbVar.r;
                        int i5 = kxbVar.e;
                        na7 q1 = na7.q1(i5);
                        long j8 = kxbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat K0 = q1.K0(Long.valueOf(j9));
                        TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(j8));
                        pub pubVar2 = na7.q1(i5).g4;
                        ArrayList l = pubVar2.l(j9);
                        boolean z13 = kxbVar.n;
                        int i6 = exb.b;
                        c4c K = c4c.K(exb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z13;
                        if (kxbVar.f0 == 0) {
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
                                if (kxbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                } else {
                                    if (!tL_forumTopic.pinned) {
                                        if (z6) {
                                            if (!arrayList.isEmpty()) {
                                                ((c4c) b00.f(1, arrayList)).z |= 8;
                                            }
                                            l5cVar.L();
                                            z6 = false;
                                        }
                                    } else if (!z6) {
                                        l5cVar.M();
                                        z6 = true;
                                    }
                                    c4c K2 = c4c.K(exb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z13) {
                                        j3 = j8;
                                        K2.C = cf3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = kxbVar.f0;
                                    if (z13) {
                                        pubVar = pubVar2;
                                        j4 = cf3.n(tL_forumTopic.from_id);
                                    } else {
                                        pubVar = pubVar2;
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
                                    pubVar2 = pubVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        boolean z14 = z12;
                        pub pubVar3 = pubVar2;
                        if (z6) {
                            l5cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !pubVar3.e(j9) && kxbVar.w) {
                            c4c K3 = c4c.K(exb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c4c K4 = c4c.K(exb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c4c K5 = c4c.K(exb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z14 && !z13) {
                            if ((K0 != null && hc2.w(15, K0)) || l7c.x(V1)) {
                                c4c K6 = c4c.K(exb.class);
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
                        long j11 = kxbVar.f;
                        pub pubVar4 = na7.q1(kxbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10 = tb4.g(((c4c) arrayList2.get(i10)).d, i10, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        pubVar4.w(arrayList3, j12);
                        pubVar4.y(j12, false);
                        return;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l5c l5cVar2 = (l5c) obj2;
                        boolean z15 = kxbVar.n;
                        int i11 = kxbVar.e;
                        na7 q12 = na7.q1(i11);
                        long j13 = kxbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat K02 = q12.K0(Long.valueOf(j14));
                        TLRPC.User V12 = na7.q1(i11).V1(Long.valueOf(j13));
                        pub pubVar5 = na7.q1(i11).g4;
                        ArrayList l2 = pubVar5.l(j14);
                        boolean z16 = kxbVar.r;
                        if (!z16) {
                            int i12 = ixb.b;
                            c4c K7 = c4c.K(ixb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z15;
                            K7.z = z16 ? 1 : 0;
                            if (kxbVar.f0 == 0) {
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
                                TLRPC.User user = V12;
                                if (z16) {
                                    i4 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        V12 = user;
                                        size2 = i4;
                                    }
                                } else {
                                    i4 = size2;
                                }
                                if (kxbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    V12 = user;
                                    size2 = i4;
                                } else {
                                    if (!tL_forumTopic2.pinned) {
                                        if (z9) {
                                            l5cVar2.L();
                                            z9 = false;
                                        }
                                    } else if (!z9) {
                                        l5cVar2.M();
                                        z9 = true;
                                    }
                                    int i14 = ixb.b;
                                    c4c K8 = c4c.K(ixb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z15) {
                                        j5 = j13;
                                        K8.C = cf3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = kxbVar.f0;
                                    if (z15) {
                                        j6 = j15;
                                        j7 = cf3.n(tL_forumTopic2.from_id);
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
                                    V12 = user;
                                    size2 = i4;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        TLRPC.User user2 = V12;
                        if (z9) {
                            l5cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !pubVar5.e(j14) && kxbVar.w) {
                            int i15 = ixb.b;
                            c4c K9 = c4c.K(ixb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c4c K10 = c4c.K(ixb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c4c K11 = c4c.K(ixb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z16 && !z15) {
                            if ((K02 != null && hc2.w(15, K02)) || l7c.x(user2)) {
                                int i16 = ixb.b;
                                c4c K12 = c4c.K(ixb.class);
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
        ywbVar.setWillNotDraw(false);
        ywbVar.g3.r = false;
        ywbVar.getContext();
        xe2 xe2Var = new xe2((ViewGroup) ywbVar, (byte) 8);
        ywbVar.f3 = xe2Var;
        ywbVar.setLayoutManager(xe2Var);
        frameLayout2.addView(ywbVar, nme.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        ywbVar.j(new zwb(this, (byte) 0));
        if (x) {
            jxb jxbVar = new jxb(i, wjbVar, activity);
            this.E = jxbVar;
            if (this.f0 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            jxbVar.c(true, false, z4);
            jxbVar.setOnClickListener(new View.OnClickListener(this) {
                public final kxb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(android.view.View r4) {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.rwb.onClick(android.view.View):void");
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(jxbVar, nme.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.E = null;
        }
        ViewGroup viewGroup = frameLayout;
        axb axbVar = new axb(activity, i, new i8c(this) {
            public final kxb b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z5;
                boolean z6;
                boolean z7;
                long j3;
                pub pubVar;
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
                kxb kxbVar = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l5c l5cVar = (l5c) obj2;
                        boolean z12 = kxbVar.r;
                        int i5 = kxbVar.e;
                        na7 q1 = na7.q1(i5);
                        long j8 = kxbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat K0 = q1.K0(Long.valueOf(j9));
                        TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(j8));
                        pub pubVar2 = na7.q1(i5).g4;
                        ArrayList l = pubVar2.l(j9);
                        boolean z13 = kxbVar.n;
                        int i6 = exb.b;
                        c4c K = c4c.K(exb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z13;
                        if (kxbVar.f0 == 0) {
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
                                if (kxbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                } else {
                                    if (!tL_forumTopic.pinned) {
                                        if (z6) {
                                            if (!arrayList.isEmpty()) {
                                                ((c4c) b00.f(1, arrayList)).z |= 8;
                                            }
                                            l5cVar.L();
                                            z6 = false;
                                        }
                                    } else if (!z6) {
                                        l5cVar.M();
                                        z6 = true;
                                    }
                                    c4c K2 = c4c.K(exb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z13) {
                                        j3 = j8;
                                        K2.C = cf3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = kxbVar.f0;
                                    if (z13) {
                                        pubVar = pubVar2;
                                        j4 = cf3.n(tL_forumTopic.from_id);
                                    } else {
                                        pubVar = pubVar2;
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
                                    pubVar2 = pubVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        boolean z14 = z12;
                        pub pubVar3 = pubVar2;
                        if (z6) {
                            l5cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !pubVar3.e(j9) && kxbVar.w) {
                            c4c K3 = c4c.K(exb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c4c K4 = c4c.K(exb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c4c K5 = c4c.K(exb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z14 && !z13) {
                            if ((K0 != null && hc2.w(15, K0)) || l7c.x(V1)) {
                                c4c K6 = c4c.K(exb.class);
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
                        long j11 = kxbVar.f;
                        pub pubVar4 = na7.q1(kxbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10 = tb4.g(((c4c) arrayList2.get(i10)).d, i10, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        pubVar4.w(arrayList3, j12);
                        pubVar4.y(j12, false);
                        return;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l5c l5cVar2 = (l5c) obj2;
                        boolean z15 = kxbVar.n;
                        int i11 = kxbVar.e;
                        na7 q12 = na7.q1(i11);
                        long j13 = kxbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat K02 = q12.K0(Long.valueOf(j14));
                        TLRPC.User V12 = na7.q1(i11).V1(Long.valueOf(j13));
                        pub pubVar5 = na7.q1(i11).g4;
                        ArrayList l2 = pubVar5.l(j14);
                        boolean z16 = kxbVar.r;
                        if (!z16) {
                            int i12 = ixb.b;
                            c4c K7 = c4c.K(ixb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z15;
                            K7.z = z16 ? 1 : 0;
                            if (kxbVar.f0 == 0) {
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
                                TLRPC.User user = V12;
                                if (z16) {
                                    i4 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        V12 = user;
                                        size2 = i4;
                                    }
                                } else {
                                    i4 = size2;
                                }
                                if (kxbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    V12 = user;
                                    size2 = i4;
                                } else {
                                    if (!tL_forumTopic2.pinned) {
                                        if (z9) {
                                            l5cVar2.L();
                                            z9 = false;
                                        }
                                    } else if (!z9) {
                                        l5cVar2.M();
                                        z9 = true;
                                    }
                                    int i14 = ixb.b;
                                    c4c K8 = c4c.K(ixb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z15) {
                                        j5 = j13;
                                        K8.C = cf3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = kxbVar.f0;
                                    if (z15) {
                                        j6 = j15;
                                        j7 = cf3.n(tL_forumTopic2.from_id);
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
                                    V12 = user;
                                    size2 = i4;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        TLRPC.User user2 = V12;
                        if (z9) {
                            l5cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !pubVar5.e(j14) && kxbVar.w) {
                            int i15 = ixb.b;
                            c4c K9 = c4c.K(ixb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c4c K10 = c4c.K(ixb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c4c K11 = c4c.K(ixb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z16 && !z15) {
                            if ((K02 != null && hc2.w(15, K02)) || l7c.x(user2)) {
                                int i16 = ixb.b;
                                c4c K12 = c4c.K(ixb.class);
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
        }, new twb(this), new twb(this), wjbVar);
        this.K = axbVar;
        axbVar.E1(new i8c(this) {
            public final kxb b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z5;
                boolean z6;
                boolean z7;
                long j3;
                pub pubVar;
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
                kxb kxbVar = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l5c l5cVar = (l5c) obj2;
                        boolean z12 = kxbVar.r;
                        int i5 = kxbVar.e;
                        na7 q1 = na7.q1(i5);
                        long j8 = kxbVar.f;
                        long j9 = -j8;
                        TLRPC.Chat K0 = q1.K0(Long.valueOf(j9));
                        TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(j8));
                        pub pubVar2 = na7.q1(i5).g4;
                        ArrayList l = pubVar2.l(j9);
                        boolean z13 = kxbVar.n;
                        int i6 = exb.b;
                        c4c K = c4c.K(exb.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.r = z13;
                        if (kxbVar.f0 == 0) {
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
                                if (kxbVar.l0.contains(Integer.valueOf(tL_forumTopic.id))) {
                                    size = i9;
                                    i7 = i8;
                                    z12 = z7;
                                } else {
                                    if (!tL_forumTopic.pinned) {
                                        if (z6) {
                                            if (!arrayList.isEmpty()) {
                                                ((c4c) b00.f(1, arrayList)).z |= 8;
                                            }
                                            l5cVar.L();
                                            z6 = false;
                                        }
                                    } else if (!z6) {
                                        l5cVar.M();
                                        z6 = true;
                                    }
                                    c4c K2 = c4c.K(exb.class);
                                    K2.y = j8;
                                    K2.d = tL_forumTopic.id;
                                    K2.H = tL_forumTopic;
                                    if (z13) {
                                        j3 = j8;
                                        K2.C = cf3.n(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j3 = j8;
                                    }
                                    long j10 = kxbVar.f0;
                                    if (z13) {
                                        pubVar = pubVar2;
                                        j4 = cf3.n(tL_forumTopic.from_id);
                                    } else {
                                        pubVar = pubVar2;
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
                                    pubVar2 = pubVar;
                                    j8 = j3;
                                }
                            }
                        } else {
                            z6 = false;
                        }
                        boolean z14 = z12;
                        pub pubVar3 = pubVar2;
                        if (z6) {
                            l5cVar.L();
                        }
                        if (l != null && !l.isEmpty() && !pubVar3.e(j9) && kxbVar.w) {
                            c4c K3 = c4c.K(exb.class);
                            K3.d = -2;
                            K3.s = true;
                            arrayList.add(K3);
                            c4c K4 = c4c.K(exb.class);
                            K4.d = -3;
                            K4.s = true;
                            arrayList.add(K4);
                            c4c K5 = c4c.K(exb.class);
                            K5.d = -4;
                            K5.s = true;
                            arrayList.add(K5);
                        }
                        if (!z14 && !z13) {
                            if ((K0 != null && hc2.w(15, K0)) || l7c.x(V1)) {
                                c4c K6 = c4c.K(exb.class);
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
                        long j11 = kxbVar.f;
                        pub pubVar4 = na7.q1(kxbVar.e).g4;
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10 = tb4.g(((c4c) arrayList2.get(i10)).d, i10, 1, arrayList3)) {
                        }
                        long j12 = -j11;
                        pubVar4.w(arrayList3, j12);
                        pubVar4.y(j12, false);
                        return;
                    default:
                        ArrayList arrayList4 = (ArrayList) obj;
                        l5c l5cVar2 = (l5c) obj2;
                        boolean z15 = kxbVar.n;
                        int i11 = kxbVar.e;
                        na7 q12 = na7.q1(i11);
                        long j13 = kxbVar.f;
                        long j14 = -j13;
                        TLRPC.Chat K02 = q12.K0(Long.valueOf(j14));
                        TLRPC.User V12 = na7.q1(i11).V1(Long.valueOf(j13));
                        pub pubVar5 = na7.q1(i11).g4;
                        ArrayList l2 = pubVar5.l(j14);
                        boolean z16 = kxbVar.r;
                        if (!z16) {
                            int i12 = ixb.b;
                            c4c K7 = c4c.K(ixb.class);
                            K7.d = 0;
                            K7.C = 0L;
                            K7.H = null;
                            K7.r = z15;
                            K7.z = z16 ? 1 : 0;
                            if (kxbVar.f0 == 0) {
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
                                TLRPC.User user = V12;
                                if (z16) {
                                    i4 = size2;
                                    if (tL_forumTopic2.id == 1) {
                                        V12 = user;
                                        size2 = i4;
                                    }
                                } else {
                                    i4 = size2;
                                }
                                if (kxbVar.l0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    V12 = user;
                                    size2 = i4;
                                } else {
                                    if (!tL_forumTopic2.pinned) {
                                        if (z9) {
                                            l5cVar2.L();
                                            z9 = false;
                                        }
                                    } else if (!z9) {
                                        l5cVar2.M();
                                        z9 = true;
                                    }
                                    int i14 = ixb.b;
                                    c4c K8 = c4c.K(ixb.class);
                                    K8.y = j13;
                                    K8.d = tL_forumTopic2.id;
                                    K8.H = tL_forumTopic2;
                                    if (z15) {
                                        j5 = j13;
                                        K8.C = cf3.n(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    } else {
                                        j5 = j13;
                                    }
                                    long j15 = kxbVar.f0;
                                    if (z15) {
                                        j6 = j15;
                                        j7 = cf3.n(tL_forumTopic2.from_id);
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
                                    V12 = user;
                                    size2 = i4;
                                    j13 = j5;
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        TLRPC.User user2 = V12;
                        if (z9) {
                            l5cVar2.L();
                        }
                        if (l2 != null && !l2.isEmpty() && !pubVar5.e(j14) && kxbVar.w) {
                            int i15 = ixb.b;
                            c4c K9 = c4c.K(ixb.class);
                            K9.d = -2;
                            K9.s = true;
                            K9.e = false;
                            arrayList4.add(K9);
                            c4c K10 = c4c.K(ixb.class);
                            K10.d = -3;
                            K10.s = true;
                            K10.e = false;
                            arrayList4.add(K10);
                            c4c K11 = c4c.K(ixb.class);
                            K11.d = -4;
                            K11.s = true;
                            K11.e = false;
                            arrayList4.add(K11);
                        }
                        if (!z16 && !z15) {
                            if ((K02 != null && hc2.w(15, K02)) || l7c.x(user2)) {
                                int i16 = ixb.b;
                                c4c K12 = c4c.K(ixb.class);
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
        axbVar.g3.r = false;
        axbVar.setClipToPadding(false);
        axbVar.setClipChildren(false);
        if (x) {
            f = 90.0f;
        } else {
            f = 48.0f;
        }
        viewGroup.addView(axbVar, nme.d(-1, -1.0f, 119, 0.0f, f, 0.0f, 0.0f));
        axbVar.j(new zwb(this, (byte) 1));
        ImageView g = g(activity, 2131231888, new View.OnClickListener(this) {
            public final kxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(android.view.View r4) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rwb.onClick(android.view.View):void");
            }
        });
        this.H = g;
        ImageView g2 = g(activity, 2131231888, new View.OnClickListener(this) {
            public final kxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(android.view.View r4) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rwb.onClick(android.view.View):void");
            }
        });
        this.I = g2;
        frameLayout2.addView(g, nme.e(44, 36, 51));
        viewGroup.addView(g2, nme.e(64, 48, 51));
        ImageView g3 = g(activity, 2131232362, new View.OnClickListener(this) {
            public final kxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(android.view.View r4) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rwb.onClick(android.view.View):void");
            }
        });
        this.F = g3;
        ImageView g4 = g(activity, 2131232362, new View.OnClickListener(this) {
            public final kxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(android.view.View r4) {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rwb.onClick(android.view.View):void");
            }
        });
        this.G = g4;
        frameLayout2.addView(g3, nme.e(44, 36, 51));
        viewGroup.addView(g4, nme.e(64, 48, 51));
        na7.q1(i).g4.n(3, j2, false);
        SharedPreferences sharedPreferences = na7.q1(i).X3;
        if (z && ls6.v("topicssidetabs", j, sharedPreferences, false)) {
            this.V = 1.0f;
            z2 = true;
            this.U = true;
        } else {
            z2 = true;
        }
        if (z && ls6.v("topicssidetabsb", j, sharedPreferences, false)) {
            z3 = z2;
        } else {
            z3 = false;
        }
        this.T = z3;
        if (z3) {
            i2 = 2131231890;
        } else {
            i2 = 2131231887;
        }
        g2.setImageResource(i2);
        o(false);
        if (!this.T) {
            i3 = 2131231888;
        } else {
            i3 = 2131231890;
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
        ote.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z) {
        if (this.g0 == z) {
            return;
        }
        this.g0 = z;
        int i = 0;
        int i2 = kk7.s5;
        long j = this.f;
        int i3 = this.e;
        if (z) {
            kk7.f(i3).b(this, i2);
            kk7.f(i3).b(this, 2);
            pub pubVar = na7.q1(i3).g4;
            long j2 = -j;
            LongSparseIntArray longSparseIntArray = pubVar.r;
            longSparseIntArray.put(j2, longSparseIntArray.get(j2, 0) + 1);
            pubVar.y(j2, true);
            return;
        }
        long j3 = -j;
        LongSparseIntArray longSparseIntArray2 = na7.q1(i3).g4.r;
        int i4 = longSparseIntArray2.get(j3, 0) - 1;
        if (i4 >= 0) {
            i = i4;
        }
        longSparseIntArray2.put(j3, i);
        kk7.f(i3).n(this, i2);
        kk7.f(i3).n(this, 2);
    }

    @Override
    public final void F(float f, int i) {
        if (i == 1 && f == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(2131231888);
            this.I.setImageResource(2131231887);
            SharedPreferences.Editor edit = na7.q1(this.e).X3.edit();
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
        ofFloat.addUpdateListener(new uwb(this, (byte) 0));
        this.e0.addListener(new pu9((byte) 10, this, z));
        this.e0.setInterpolator(la2.V);
        this.e0.setDuration(250L);
        this.e0.start();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y6));
    }

    public final void b() {
        int i = bkb.y6;
        wjb wjbVar = this.h;
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(bkb.Ei, wjbVar);
        int f = bm2.f(1.0f - this.V, v0, v02);
        int f2 = bm2.f(this.V, v0, v02);
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
        ArrayList l = na7.q1(this.e).g4.l(-this.f);
        if (l != null && !l.isEmpty() && !this.k0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a.a(z2, z);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.s5;
        long j = this.f;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == (-j)) {
                n();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = na7.q5;
            if ((intValue & 512) > 0) {
                na7.q1(this.e).g4.y(-j, false);
                n();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.J;
        if (frameLayout.getVisibility() == 0) {
            this.O.setBounds((int) frameLayout.getTranslationX(), (int) this.R, (int) (frameLayout.getTranslationX() + gl.L(78.0f)), (int) (getMeasuredHeight() - this.Q));
            this.O.draw(canvas);
        }
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2.getVisibility() == 0) {
            this.P.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.P.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + gl.L(50.0f)));
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
        fm0 fm0Var = this.N;
        float f = fm0Var.e;
        ImageView imageView = this.F;
        imageView.setAlpha(f);
        imageView.setScaleX(gl.R1(0.4f, 1.0f, f));
        imageView.setScaleY(gl.R1(0.4f, 1.0f, f));
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
        imageView2.setScaleX(gl.R1(0.4f, 1.0f, f));
        imageView2.setScaleY(gl.R1(0.4f, 1.0f, f));
        if (i4 > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        float f2 = 1.0f - fm0Var.e;
        ImageView imageView3 = this.H;
        imageView3.setAlpha(f2);
        imageView3.setScaleX(gl.R1(0.4f, 1.0f, f2));
        imageView3.setScaleY(gl.R1(0.4f, 1.0f, f2));
        int i6 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i6 > 0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView3.setVisibility(i3);
        ImageView imageView4 = this.I;
        imageView4.setAlpha(f2);
        imageView4.setScaleX(gl.R1(0.4f, 1.0f, f2));
        imageView4.setScaleY(gl.R1(0.4f, 1.0f, f2));
        if (i6 > 0) {
            i5 = 0;
        }
        imageView4.setVisibility(i5);
    }

    public final void f() {
        int i;
        float R1 = gl.R1(1.0f, 0.0f, this.V);
        FrameLayout frameLayout = this.x;
        frameLayout.setAlpha(R1);
        if ((1.0f - this.b.e) * (1.0f - this.V) * this.a.e > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (this.T) {
            frameLayout.setTranslationY(((getMeasuredHeight() - gl.L(50.0f)) - this.Q) + gl.U1(h(gxb.c), gl.L(43.0f), 0));
            return;
        }
        frameLayout.setTranslationY(this.R + gl.U1(h(gxb.a), -gl.L(43.0f), 0));
    }

    public gxb getCurrentTabsPosition() {
        if (this.U) {
            return gxb.b;
        }
        if (this.T) {
            return gxb.c;
        }
        return gxb.a;
    }

    public float getSideMenuT() {
        return this.V * this.a.e;
    }

    public final float h(gxb gxbVar) {
        float f = (1.0f - this.b.e) * this.a.e;
        if (gxbVar == gxb.b) {
            return this.V * f;
        }
        if ((gxbVar == gxb.a && !this.T) || (gxbVar == gxb.c && this.T)) {
            return (1.0f - this.V) * f;
        }
        return 0.0f;
    }

    public final boolean i() {
        if (this.V > 0.5f) {
            int i = 0;
            while (true) {
                axb axbVar = this.K;
                if (i >= axbVar.getChildCount()) {
                    break;
                }
                c4c G = axbVar.g3.G(RecyclerView.R(axbVar.getChildAt(i)));
                if (G == null || !G.s) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            int i2 = 0;
            while (true) {
                ywb ywbVar = this.y;
                if (i2 >= ywbVar.getChildCount()) {
                    break;
                }
                c4c G2 = ywbVar.g3.G(RecyclerView.R(ywbVar.getChildAt(i2)));
                if (G2 != null && G2.s) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    public final void j() {
        pub pubVar = na7.q1(this.e).g4;
        long j = this.f;
        if (!pubVar.e(-j)) {
            pubVar.o(-j);
        }
    }

    public final void k(long j, boolean z) {
        if (this.n) {
            i8c i8cVar = this.j0;
            if (i8cVar != null) {
                i8cVar.a(Long.valueOf(j), Boolean.valueOf(z));
                return;
            }
            return;
        }
        i8c i8cVar2 = this.h0;
        if (i8cVar2 != null) {
            i8cVar2.a(Integer.valueOf((int) j), Boolean.valueOf(z));
        }
    }

    public final boolean l(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i;
        int i2;
        na7 na7Var;
        final kxb kxbVar;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i3;
        String M0;
        int i4;
        final kxb kxbVar2;
        boolean z2;
        int i5;
        String M02;
        int i6;
        cs5 cs5Var;
        int i7 = this.e;
        na7 q1 = na7.q1(i7);
        long j = this.f;
        int i8 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i8 < 0) {
            chat = q1.K0(Long.valueOf(-j));
        } else {
            chat = null;
        }
        if (i8 > 0) {
            user = q1.V1(Long.valueOf(j));
        } else {
            user = null;
        }
        mu1 mu1Var = this.s;
        final cs5 J = cs5.J(mu1Var, view);
        if (hc2.p0(chat)) {
            long n = cf3.n(tL_forumTopic.from_id);
            if (n == 0 || !hc2.A(i7, chat, 24)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            cs5 cs5Var2 = J;
            cs5Var2.b(2131232097, k96.M0(2131752077, null), new mx8(this, cs5Var2, n, chat2, (byte) 16), false);
            long j2 = chat2.id;
            if (hc2.p0(chat2) && hc2.A(i7, chat2, 24)) {
                long j3 = chat2.linked_monoforum_id;
                if (j3 != 0) {
                    j2 = j3;
                }
            }
            TLRPC.Chat K0 = na7.q1(i7).K0(Long.valueOf(j2));
            TLRPC.User V1 = na7.q1(i7).V1(Long.valueOf(n));
            cs5 cs5Var3 = cs5Var2;
            if (V1 != null) {
                cs5Var3 = cs5Var2;
                if (hc2.w(2, K0)) {
                    cs5Var2.b(2131232333, k96.M0(2131753723, null), null, false);
                    a8 z3 = cs5Var2.z();
                    z3.setVisibility(8);
                    na7 q12 = na7.q1(i7);
                    jq5 jq5Var = new jq5(this, z3, cs5Var2, j2, V1, K0, (byte) 3);
                    cs5Var3 = cs5Var2;
                    q12.I0(K0, V1, jq5Var);
                }
            }
            kxbVar2 = this;
            cs5Var = cs5Var3;
        } else {
            if (!hc2.y(15, chat) && !l7c.x(user)) {
                i3 = 15;
                tL_forumTopic2 = tL_forumTopic;
                na7Var = q1;
                kxbVar = this;
            } else {
                if (tL_forumTopic.pinned) {
                    i = 2131232418;
                    i2 = 2131751440;
                } else {
                    i = 2131232298;
                    i2 = 2131751441;
                }
                na7Var = q1;
                kxbVar = this;
                tL_forumTopic2 = tL_forumTopic;
                J.b(i, k96.M0(i2, null), new exa(this, J, na7Var, tL_forumTopic, (byte) 13), false);
                if (tL_forumTopic2.pinned && !z) {
                    J.b(2131232778, k96.M0(2131750693, null), new vwb(kxbVar, (byte) 1), false);
                }
                i3 = 15;
            }
            if (hc2.y(i3, chat) || l7c.x(user)) {
                J.b(2131232497, k96.M0(2131751204, null), new Runnable(kxbVar) {
                    public final kxb b;

                    {
                        this.b = kxbVar;
                    }

                    @Override
                    public final void run() {
                        byte b = r4;
                        kxb kxbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        cs5 cs5Var4 = J;
                        switch (b) {
                            case 0:
                                cs5Var4.u();
                                kxbVar3.s.presentFragment(vtb.e0(-kxbVar3.f, tL_forumTopic3.id));
                                return;
                            case 1:
                                cs5Var4.u();
                                na7.q1(kxbVar3.e).g4.z(tL_forumTopic3.id, -kxbVar3.f, !tL_forumTopic3.closed);
                                return;
                            default:
                                cs5Var4.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jc jcVar = new jc((byte) 10);
                                kxb kxbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kxbVar4.getContext());
                                String J0 = k96.J0(hashSet.size(), "DeleteTopics");
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j4 = kxbVar4.f0;
                                if (hashSet.size() == 1) {
                                    hdVar.U = k96.a0(null, null, 2131751486, na7.q1(kxbVar4.e).g4.f(-kxbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    hdVar.U = k96.M0(2131751485, null);
                                }
                                alertDialog$Builder.j(k96.M0(2131751586, null), new xn1(kxbVar4, arrayList, j4, hashSet, jcVar));
                                alertDialog$Builder.g(k96.M0(2131752577, null), new sdb((byte) 27));
                                hdVar.show();
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            long j4 = tL_forumTopic2.id;
            int currentAccount = mu1Var.getCurrentAccount();
            wjb resourceProvider = mu1Var.getResourceProvider();
            long j5 = kxbVar.f;
            rb2 rb2Var = new rb2(J, currentAccount, j5, j4, mu1Var, resourceProvider);
            cs5 K = J.K();
            K.b(2131232062, k96.M0(2131753753, null), new en1(J, (byte) 0), false);
            K.b(2131232408, k96.M0(2131745083, null), new r77(J, currentAccount, j5, j4, K, mu1Var, resourceProvider), false);
            a8 z4 = K.z();
            K.b(2131232263, k96.M0(2131748116, null), new tn6(J, resourceProvider, currentAccount, rb2Var, (byte) 16), false);
            K.b(2131232111, k96.M0(2131747724, null), new dt4(J, j5, j4, mu1Var, resourceProvider, (byte) 3), false);
            K.b(0, "", new sb2(J, currentAccount, j5, j4, mu1Var, resourceProvider), false);
            new tb2(currentAccount, j5, j4, K.z(), z4).run();
            long j6 = kxbVar.f;
            na7 na7Var2 = na7Var;
            if (na7Var2.n2(j6, tL_forumTopic2.id, null)) {
                M0 = k96.M0(2131743610, null);
                i4 = 2131232417;
            } else {
                M0 = k96.M0(2131748122, null);
                i4 = 2131232261;
            }
            int i9 = i4;
            TLRPC.Chat chat3 = chat;
            kxbVar2 = this;
            final cs5 cs5Var4 = J;
            cs5Var4.b(i9, M0, new tsa(kxbVar2, na7Var2, tL_forumTopic, J, K, (byte) 6), false);
            if (hc2.i(i7, chat3, tL_forumTopic) && !l7c.w(user)) {
                if (tL_forumTopic.closed) {
                    M02 = k96.M0(2131745891, null);
                    i6 = 2131232411;
                } else {
                    M02 = k96.M0(2131752027, null);
                    i6 = 2131232409;
                }
                i5 = 1;
                z2 = false;
                cs5Var4.b(i6, M02, new Runnable(kxbVar2) {
                    public final kxb b;

                    {
                        this.b = kxbVar2;
                    }

                    @Override
                    public final void run() {
                        byte b = r4;
                        kxb kxbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        cs5 cs5Var42 = cs5Var4;
                        switch (b) {
                            case 0:
                                cs5Var42.u();
                                kxbVar3.s.presentFragment(vtb.e0(-kxbVar3.f, tL_forumTopic3.id));
                                return;
                            case 1:
                                cs5Var42.u();
                                na7.q1(kxbVar3.e).g4.z(tL_forumTopic3.id, -kxbVar3.f, !tL_forumTopic3.closed);
                                return;
                            default:
                                cs5Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jc jcVar = new jc((byte) 10);
                                kxb kxbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kxbVar4.getContext());
                                String J0 = k96.J0(hashSet.size(), "DeleteTopics");
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j42 = kxbVar4.f0;
                                if (hashSet.size() == 1) {
                                    hdVar.U = k96.a0(null, null, 2131751486, na7.q1(kxbVar4.e).g4.f(-kxbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    hdVar.U = k96.M0(2131751485, null);
                                }
                                alertDialog$Builder.j(k96.M0(2131751586, null), new xn1(kxbVar4, arrayList, j42, hashSet, jcVar));
                                alertDialog$Builder.g(k96.M0(2131752577, null), new sdb((byte) 27));
                                hdVar.show();
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, null);
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
            cs5Var = cs5Var4;
            if (hc2.e(i7, chat3, tL_forumTopic)) {
                cs5Var4.b(2131232113, k96.J0(i5, "DeleteTopics"), new Runnable(kxbVar2) {
                    public final kxb b;

                    {
                        this.b = kxbVar2;
                    }

                    @Override
                    public final void run() {
                        byte b = r4;
                        kxb kxbVar3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        cs5 cs5Var42 = cs5Var4;
                        switch (b) {
                            case 0:
                                cs5Var42.u();
                                kxbVar3.s.presentFragment(vtb.e0(-kxbVar3.f, tL_forumTopic3.id));
                                return;
                            case 1:
                                cs5Var42.u();
                                na7.q1(kxbVar3.e).g4.z(tL_forumTopic3.id, -kxbVar3.f, !tL_forumTopic3.closed);
                                return;
                            default:
                                cs5Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.id));
                                jc jcVar = new jc((byte) 10);
                                kxb kxbVar4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kxbVar4.getContext());
                                String J0 = k96.J0(hashSet.size(), "DeleteTopics");
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j42 = kxbVar4.f0;
                                if (hashSet.size() == 1) {
                                    hdVar.U = k96.a0(null, null, 2131751486, na7.q1(kxbVar4.e).g4.f(-kxbVar4.f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    hdVar.U = k96.M0(2131751485, null);
                                }
                                alertDialog$Builder.j(k96.M0(2131751586, null), new xn1(kxbVar4, arrayList, j42, hashSet, jcVar));
                                alertDialog$Builder.g(k96.M0(2131752577, null), new sdb((byte) 27));
                                hdVar.show();
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, z2);
                cs5Var = cs5Var4;
            }
        }
        boolean z5 = view instanceof fxb;
        wjb wjbVar = kxbVar2.h;
        if (z5) {
            ?? drawable = new Drawable();
            Paint paint = new Paint(1);
            drawable.a = paint;
            drawable.b = new RectF();
            paint.setColor(bkb.v0(bkb.F8, wjbVar));
            cs5Var.X(drawable);
            cs5Var.b0(gl.L(16.0f), 0.0f);
        } else if (z) {
            cs5Var.X(bkb.b0(gl.L(16.0f), bkb.v0(bkb.c6, wjbVar)));
            cs5Var.W(5);
        } else {
            int L = gl.L(5.0f);
            int L2 = gl.L(5.0f);
            int v0 = bkb.v0(bkb.c6, wjbVar);
            float f = L;
            float f2 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, f, f, f2, f2, 0.0f, 0.0f}, null, null));
            shapeDrawable.getPaint().setColor(v0);
            cs5Var.X(shapeDrawable);
        }
        cs5Var.a0();
        return true;
    }

    public final void m() {
        my myVar = this.S;
        if (myVar != null) {
            myVar.run();
        }
        f();
        float h = h(gxb.b);
        int i = 0;
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(gl.U1(h, -gl.L(78.0f), 0));
        if (h <= 0.0f) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        b();
        int i2 = bkb.Ei;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        wjb wjbVar = this.h;
        zkb.s(imageView, i2, wjbVar, mode);
        zkb.s(this.G, i2, wjbVar, mode);
        invalidate();
    }

    public final void n() {
        d(true);
        ywb ywbVar = this.y;
        boolean canScrollHorizontally = ywbVar.canScrollHorizontally(-1);
        ywbVar.g3.O(true);
        if (!canScrollHorizontally) {
            ywbVar.w0(0);
        }
        axb axbVar = this.K;
        boolean canScrollVertically = axbVar.canScrollVertically(-1);
        axbVar.g3.O(true);
        if (!canScrollVertically) {
            axbVar.w0(0);
        }
        gl.c3(new vwb(this, (byte) 0));
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

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        m();
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
        ywb ywbVar = this.y;
        ywbVar.g3.O(true);
        ywbVar.invalidate();
        this.K.g3.O(true);
        jxb jxbVar = this.E;
        if (jxbVar != null) {
            if (j == 0) {
                z = true;
            } else {
                z = false;
            }
            jxbVar.c(true, false, z);
        }
    }

    public void setOnDialogSelected(i8c i8cVar) {
        this.j0 = i8cVar;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setOnTopicSelected(i8c i8cVar) {
        this.h0 = i8cVar;
    }

    public void setSideMenuBackgroundDrawable(il0 il0Var) {
        this.O = il0Var;
        il0Var.r(gl.L(16.0f));
        this.O.q(gl.L(7.0f));
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

    public void setTopMenuBackgroundDrawable(il0 il0Var) {
        this.P = il0Var;
        il0Var.r(gl.L(18.0f));
        this.P.q(gl.L(7.0f));
    }

    @Override
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
