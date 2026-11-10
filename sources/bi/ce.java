package bi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.aj;
import org.telegram.messenger.c20;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
public final class ce extends org.telegram.ui.ActionBar.w2 implements ls {
    public final di.s0 A1;
    public final di.n0 B1;
    public final View C1;
    public final wo D1;
    public final qd E1;
    public final ij F1;
    public final ArrayList G1;
    public final c H1;
    public int I1;
    public di.g2 J1;
    public int K1;
    public a1.c L1;
    public final wp[] M1;
    public boolean N1;
    public boolean O1;
    public cn P1;
    public View Q1;
    public ValueAnimator R1;
    public final org.telegram.ui.ActionBar.h6 l1;
    public final int f3617m1;
    public final boolean n1;
    public final boolean f3618o1;
    public final LinearLayout f3619p1;
    public final FrameLayout f3620q1;
    public final LinearLayout f3621r1;
    public final ld f3622s1;
    public final FrameLayout f3623t1;
    public final FrameLayout f3624u1;
    public final org.telegram.ui.Components.k9 f3625v1;
    public final fi.d f3626w1;
    public final be f3627x1;
    public long f3628y1;
    public long f3629z1;

    public ce(Context context, final int i7, final long j3, cn cnVar, ij ijVar, ArrayList arrayList, boolean z9, final boolean z10, long j10, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z11;
        long j11;
        boolean z12;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        int[] iArr;
        String a02;
        String str2;
        TLRPC.MessageReactor messageReactor2;
        boolean z13;
        Context context2;
        int i10;
        int i11;
        int i12;
        float f14;
        this.M1 = new wp[1];
        this.O1 = false;
        this.l1 = h6Var;
        this.f3617m1 = i7;
        this.F1 = ijVar;
        this.G1 = arrayList;
        this.n1 = z10;
        this.f3618o1 = z9;
        c cVar = new c(i7, context, h6Var);
        this.H1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.f28675c.addView(cVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.ka.a(cVar);
        cVar.setOnClickListener(new gd(0, context, h6Var));
        long e10 = p10.i(i7).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            TLRPC.MessageReactor messageReactor3 = null;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) obj;
                long o4 = org.telegram.messenger.m5.o(messageReactor4.peer_id);
                if (messageReactor4.anonymous && messageReactor4.my) {
                    o4 = e10;
                }
                if (messageReactor4.my || o4 == e10) {
                    messageReactor3 = messageReactor4;
                }
            }
            messageReactor = messageReactor3;
        } else {
            messageReactor = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            if (arrayList != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    } else if (((TLRPC.MessageReactor) arrayList.get(i14)).my) {
                        TLRPC.MessageReactor messageReactor5 = (TLRPC.MessageReactor) arrayList.get(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            j11 = e10;
            this.f3628y1 = j10;
        } else {
            j11 = e10;
            this.f3628y1 = ea.y(i7, false).B(ijVar);
        }
        long j12 = this.f3628y1;
        this.f3629z1 = j12 == 2666000 ? j11 : j12;
        O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, h6Var));
        this.I1 = this.G0;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f3619p1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3620q1 = frameLayout;
        linearLayout.addView(frameLayout, c8.ha.o(-1, -2));
        this.f3622s1 = new ld(this, context, h6Var, z10, i7);
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j13 = qp.s1(i7).Z5;
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        while (true) {
            if (i15 < 9) {
                int i16 = iArr2[i15];
                z12 = z11;
                if (i16 > j13) {
                    arrayList2.add(Integer.valueOf((int) j13));
                    break;
                }
                arrayList2.add(Integer.valueOf(i16));
                if (iArr2[i15] == j13) {
                    break;
                }
                i15++;
                z11 = z12;
            } else {
                z12 = z11;
                break;
            }
        }
        int[] iArr3 = new int[arrayList2.size()];
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            iArr3[i17] = ((Integer) arrayList2.get(i17)).intValue();
        }
        ld ldVar = this.f3622s1;
        ldVar.f5204e0 = iArr3;
        if (z9 || z10) {
            if (!z9) {
                ldVar.setAlpha(0.5f);
            }
            FrameLayout frameLayout2 = this.f3620q1;
            ld ldVar2 = this.f3622s1;
            if (z10) {
                f10 = -50.0f;
            } else {
                f10 = 0.0f;
            }
            if (z10 && !z12) {
                f11 = -40.0f;
            } else {
                f11 = 0.0f;
            }
            frameLayout2.addView(ldVar2, c8.ha.d(-1, -2.0f, 55, 0.0f, f10, 0.0f, f11));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f3621r1 = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z10) {
            this.f3620q1.addView(linearLayout2, c8.ha.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f3623t1 = frameLayout3;
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f3624u1 = frameLayout4;
        int L = org.telegram.messenger.g0.L(14.0f);
        int i18 = org.telegram.ui.ActionBar.m6.f27981i5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i18, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i18);
        frameLayout4.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout4, d02, M, null, h6Var);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f3625v1 = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        k9Var.getImageReceiver().A0 = true;
        M0();
        frameLayout4.addView(k9Var, c8.ha.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i19 = org.telegram.ui.ActionBar.m6.f28148r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i19, h6Var, mode);
        imageView.setImageResource(2131230873);
        frameLayout4.addView(imageView, c8.ha.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout3.addView(frameLayout4, c8.ha.e(52, 28, 17));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
        linearLayout2.addView(frameLayout3, c8.ha.q(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        c8.ka.a(frameLayout3);
        n0.g(i7).o();
        md mdVar = new md(context, 0);
        int i20 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(mdVar, i20, h6Var);
        mdVar.setTextSize(1, 20.0f);
        mdVar.setGravity(17);
        mdVar.setText(org.telegram.messenger.id.M0(2131745038, null));
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(mdVar, c8.ha.q(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        L0(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231269);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.W5, h6Var, mode);
        c8.ka.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ce f4014b;

            {
                this.f4014b = this;
            }

            @Override
            public final void onClick(View view) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f4014b.dismiss();
                        return;
                    default:
                        ce ceVar = this.f4014b;
                        wo woVar = ceVar.D1;
                        woVar.a(!woVar.f40026a.f31279q, true);
                        if (woVar.f40026a.f31279q) {
                            j14 = ceVar.f3629z1;
                        } else {
                            j14 = 2666000;
                        }
                        ceVar.f3628y1 = j14;
                        ceVar.M0();
                        be beVar = ceVar.f3627x1;
                        if (beVar != null) {
                            beVar.setMyPrivacy(ceVar.f3628y1);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, c8.ha.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout5 = this.f3620q1;
        if (z10) {
            f13 = 0.0f;
        } else {
            if (z9) {
                f12 = 179.0f;
            } else {
                f12 = 45.0f;
            }
            f13 = f12;
        }
        frameLayout5.addView(linearLayout3, c8.ha.d(-1, -2.0f, 55, 0.0f, f13, 0.0f, 15.0f));
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, i20, h6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            a02 = org.telegram.messenger.id.H(',', "StarsReactionTextSent", messageReactor.count);
            iArr = null;
        } else {
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            iArr = null;
            a02 = org.telegram.messenger.id.a0(null, null, 2131745043, str);
        }
        textView.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(a02), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z9 && !z10) {
            linearLayout3.addView(textView, c8.ha.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z10) {
                linearLayout3.addView(new nd(context, h6Var), c8.ha.t(-1, 30, 55, 0, 20, 0, 0));
            }
            be beVar = new be(this, context, z10);
            this.f3627x1 = beVar;
            beVar.setOnSenderClickListener(new c20() {
                @Override
                public final void a(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    int i21 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
                    ce ceVar = ce.this;
                    boolean z14 = z10;
                    if (i21 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == p10.i(i7).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        T.presentFragment(new od(ceVar, bundle, z14));
                        ceVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        T.presentFragment(new pd(ceVar, bundle2, z14));
                    }
                    ceVar.dismiss();
                }
            });
            LinearLayout linearLayout4 = this.f3619p1;
            if (z10) {
                f14 = -50.0f;
            } else {
                f14 = 0.0f;
            }
            linearLayout4.addView(beVar, c8.ha.k(0.0f, f14, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.C1 = view;
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27891d7, view, h6Var);
            if (!z10 && (z9 || messageReactor != null)) {
                this.f3619p1.addView(view, c8.ha.n(1.0f / org.telegram.messenger.g0.f22566p, -1, 7, 24, 0, 24, 0));
            }
            str2 = null;
        } else {
            str2 = null;
            this.f3627x1 = null;
            this.C1 = null;
        }
        if (z10) {
            int i21 = org.telegram.ui.ActionBar.m6.f27998j5;
            TextView b10 = c8.qa.b(context, 20.0f, i21, true, h6Var);
            b10.setGravity(17);
            if (z9) {
                i11 = 2131748791;
            } else {
                i11 = 2131748793;
            }
            b10.setText(org.telegram.messenger.id.M0(i11, str2));
            this.f3619p1.addView(b10, c8.ha.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = c8.qa.b(context, 14.0f, i21, false, h6Var);
            b11.setGravity(17);
            if (z9) {
                i12 = 2131748792;
            } else if (z12) {
                i12 = 2131748794;
            } else {
                i12 = 2131748795;
            }
            org.telegram.messenger.k5.r(null, null, i12, new Object[]{org.telegram.messenger.m5.l(p10.f24474s0, j3)}, b11);
            this.f3619p1.addView(b11, c8.ha.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z10) {
            ?? obj2 = new Object();
            this.A1 = obj2;
            messageReactor2 = messageReactor;
            obj2.f9721c = this.f3628y1;
            obj2.f9724g = 50L;
            obj2.f9722e = true;
            di.n0 n0Var = new di.n0(i7, context, true);
            this.B1 = n0Var;
            n0Var.set(obj2);
            this.f3619p1.addView(n0Var, c8.ha.t(-2, -2, 17, 32, 0, 32, 20));
        } else {
            messageReactor2 = messageReactor;
        }
        wo woVar = new wo(21, context, h6Var);
        this.D1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f28000j7, org.telegram.ui.ActionBar.m6.f28020k7);
        woVar.setDrawUnchecked(true);
        if (this.f3628y1 != 2666000) {
            z13 = true;
        } else {
            z13 = false;
        }
        woVar.a(z13, false);
        be beVar2 = this.f3627x1;
        if (beVar2 != null) {
            beVar2.setMyPrivacy(this.f3628y1);
        }
        woVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, i20, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(org.telegram.messenger.id.M0(2131745046, null));
        LinearLayout f15 = org.telegram.messenger.k5.f(context, 0);
        f15.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        f15.addView(woVar, c8.ha.t(21, 21, 16, 0, 0, 9, 0));
        f15.addView(textView2, c8.ha.r(-2, -2, 16));
        f15.setOnClickListener(new View.OnClickListener(this) {
            public final ce f4014b;

            {
                this.f4014b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f4014b.dismiss();
                        return;
                    default:
                        ce ceVar = this.f4014b;
                        wo woVar2 = ceVar.D1;
                        woVar2.a(!woVar2.f40026a.f31279q, true);
                        if (woVar2.f40026a.f31279q) {
                            j14 = ceVar.f3629z1;
                        } else {
                            j14 = 2666000;
                        }
                        ceVar.f3628y1 = j14;
                        ceVar.M0();
                        be beVar3 = ceVar.f3627x1;
                        if (beVar3 != null) {
                            beVar3.setMyPrivacy(ceVar.f3628y1);
                            return;
                        }
                        return;
                }
            }
        });
        c8.ka.b(f15, 0.05f, 1.2f);
        int i22 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i22, h6Var), 6, 6);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i22);
        f15.setBackground(a03);
        org.telegram.ui.ActionBar.t6.j(f15, a03, null, M2, h6Var);
        if (!z10 && (z9 || messageReactor2 != null)) {
            LinearLayout linearLayout5 = this.f3619p1;
            if (z12) {
                i10 = 10;
            } else {
                i10 = 4;
            }
            linearLayout5.addView(f15, c8.ha.t(-2, -2, 1, 0, i10, 0, 10));
        }
        fi.d dVar = new fi.d(context, h6Var, true);
        this.f3626w1 = dVar;
        dVar.f();
        if (z9 || z10) {
            if (!z9) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f3619p1.addView(dVar, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        N0(0L);
        dVar.i(dd.Y0(false, org.telegram.messenger.id.a0(null, null, 2131745047, org.telegram.messenger.id.E(50L, ',')), this.M1), true, true);
        if (z9) {
            context2 = context;
            dVar.setOnClickListener(new ib(this, ijVar, cnVar, i7, z10, context, h6Var, j3, M0));
        } else {
            context2 = context;
        }
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                long j14;
                boolean z14;
                int i23 = i7;
                n0 g10 = n0.g(i23);
                g10.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g10.f4393l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, p10.i(i23).f());
                ce ceVar = ce.this;
                k60 F = k60.F(ceVar.f28672b, h6Var, ceVar.f3624u1);
                int size2 = arrayList3.size();
                int i24 = 0;
                while (i24 < size2) {
                    int i25 = i24 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i24);
                    if (tLObject instanceof TLRPC.User) {
                        j14 = ((TLRPC.User) tLObject).f27109id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (org.telegram.messenger.t3.V(chat)) {
                                j14 = -chat.f26960id;
                            }
                        }
                        i24 = i25;
                    }
                    if (j14 != j3) {
                        long j15 = ceVar.f3628y1;
                        if (j14 != j15 && (j15 != 0 || j14 != p10.i(i23).e())) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        F.g(tLObject, z14, new kd(ceVar, j14, z10, 0));
                    }
                    i24 = i25;
                }
                F.f35220t = false;
                F.Y = true;
                F.f35219s = 0;
                F.V(5);
                F.Z();
            }
        });
        w70 w70Var = new w70(context2, h6Var);
        w70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
        if (z10 && !z9) {
            w70Var.setText(org.telegram.messenger.id.M0(2131748796, null));
        } else {
            w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131745045, null), new pa(context2, 6)));
        }
        w70Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.f28018k5, h6Var);
        if (z9 || z10) {
            this.f3619p1.addView(w70Var, c8.ha.t(-1, -2, 17, 14, 8, 14, 12));
        }
        this.N = this.f3619p1;
        qd qdVar = new qd(context2, 1, 2, 0);
        this.E1 = qdVar;
        vg.f fVar = qdVar.f57420b;
        fVar.f57404z = org.telegram.ui.ActionBar.m6.Tk;
        fVar.A = org.telegram.ui.ActionBar.m6.Uk;
        fVar.b();
        qdVar.f57420b.f57390k = 1.0f;
        qdVar.setVisibility(4);
        qdVar.setPaused(true);
        this.f28675c.addView(qdVar, c8.ha.c(150.0f, 150));
        this.f3622s1.setValue(50);
        if (arrayList != null) {
            long j14 = 0;
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                long j15 = ((TLRPC.MessageReactor) arrayList.get(i23)).count;
                if (j15 > j14) {
                    j14 = j15;
                }
            }
            j14 = messageReactor2 != null ? j14 - messageReactor2.count : j14;
            if (j14 > 0) {
                this.f3622s1.setStarsTop(j14 + 1);
            }
        }
    }

    @Override
    public final void E(ArrayList arrayList, boolean z9) {
        float f10;
        float f11;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float[] fArr = {f10};
        c cVar = this.H1;
        arrayList.add(ObjectAnimator.ofFloat(cVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(cVar, property2, f11));
        Property property3 = View.SCALE_Y;
        if (!z9) {
            f12 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(cVar, property3, f12));
    }

    @Override
    public final boolean G() {
        if (this.f3622s1.f5211k0) {
            return false;
        }
        return this.f28673b0;
    }

    public final void J0(final aa aaVar) {
        ch.m0 m0Var;
        View view;
        ch.p0 p0Var;
        di.g2 g2Var;
        View view2;
        ch.p0 p0Var2;
        ch.m0 m0Var2;
        ij ijVar;
        ld ldVar = this.f3622s1;
        qd qdVar = this.E1;
        ij ijVar2 = this.F1;
        if (ijVar2 != null && (view2 = this.P1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q1;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                p0Var2 = ((org.telegram.ui.Cells.q1) view3).N;
                p0Var2.getClass();
                m0Var2 = p0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.t0) {
                p0Var2 = ((org.telegram.ui.Cells.t0) view3).E0;
                p0Var2.getClass();
                m0Var2 = p0Var2.l("stars");
            } else {
                p0Var2 = null;
                m0Var2 = null;
            }
            if (m0Var2 == null && p0Var2 != null) {
                dj t92 = this.P1.t9(ijVar2);
                if (t92 != null && !t92.f22041e.isEmpty()) {
                    ArrayList arrayList = t92.d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            ijVar = (ij) obj;
                            aj d = t92.d(ijVar);
                            if (d != null) {
                                int i10 = d.f21455l;
                                if ((i10 & 1) != 0 && (i10 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            ijVar = null;
                            break;
                        }
                    }
                    if (ijVar != null) {
                        view3 = this.P1.I8(ijVar.e1(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Cells.q1) {
                        p0Var2 = ((org.telegram.ui.Cells.q1) view3).N;
                        p0Var2.getClass();
                        m0Var2 = p0Var2.l("stars");
                    }
                } else {
                    return;
                }
            }
            if (m0Var2 != null) {
                p0Var = p0Var2;
                m0Var = m0Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.J1 == null) {
            return;
        } else {
            m0Var = null;
            view = null;
            p0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        ldVar.getLocationInWindow(iArr);
        rectF.set(ldVar.G.getBounds());
        rectF.inset(-org.telegram.messenger.g0.L(3.5f), -org.telegram.messenger.g0.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        ed edVar = new ed(this, 2);
        qdVar.f57419a0 = edVar;
        if (qdVar.W) {
            qdVar.f57419a0 = null;
            edVar.run();
        }
        if (m0Var != null) {
            m0Var.f6326k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        ch.m0 m0Var3 = m0Var;
        di.n0[] n0VarArr = new di.n0[1];
        if (this.n1 && (g2Var = this.J1) != null) {
            n0VarArr[0] = g2Var.d(this.K1);
        }
        final RectF rectF2 = new RectF();
        final r7 r7Var = new r7(this, n0VarArr, iArr, rectF2, view, p0Var, m0Var3, 3);
        View view4 = view;
        r7Var.run();
        qdVar.setPaused(false);
        qdVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        qdVar.setTranslationX(rectF3.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        qdVar.setTranslationY(rectF3.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        qdVar.setScaleX(rectF3.width() / org.telegram.messenger.g0.L(150.0f));
        qdVar.setScaleY(rectF3.height() / org.telegram.messenger.g0.L(150.0f));
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                r7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, floatValue, rectF6);
                ce ceVar = ce.this;
                qd qdVar2 = ceVar.E1;
                qdVar2.setTranslationX(rectF6.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                qdVar2.setTranslationY(rectF6.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                float T1 = org.telegram.messenger.g0.T1(Math.max(rectF6.width() / org.telegram.messenger.g0.L(150.0f), rectF6.height() / org.telegram.messenger.g0.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                qdVar2.setScaleX(T1);
                qdVar2.setScaleY(T1);
                vg.f fVar = qdVar2.f57420b;
                fVar.d = 360.0f * floatValue;
                fVar.f57390k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        ceVar.f28675c.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable = aaVar;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        this.R1.addListener(new rd(this, m0Var3, view4, n0VarArr, zArr, rectF2, aaVar));
        this.R1.setDuration(800L);
        this.R1.setInterpolator(new sd(0));
        this.R1.start();
    }

    @Override
    public final void K() {
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.K();
    }

    public final boolean K0() {
        if (!this.n1) {
            n0 g10 = n0.g(this.f3617m1);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f4393l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if ((obj instanceof TLRPC.Chat) && org.telegram.messenger.t3.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void L0(boolean z9) {
        boolean z10;
        FrameLayout frameLayout = this.f3623t1;
        int i7 = 0;
        if (frameLayout.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != K0()) {
            if (!K0()) {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            if (z9) {
                if (K0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f3621r1, changeBounds);
            }
        }
    }

    public final void M0() {
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.f38925p = 0.42f;
        long j3 = this.f3628y1;
        int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        org.telegram.ui.Components.k9 k9Var = this.f3625v1;
        if (i7 == 0) {
            v8Var.g(21);
            int i10 = org.telegram.ui.ActionBar.m6.f27874c8;
            org.telegram.ui.ActionBar.h6 h6Var = this.l1;
            v8Var.i(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            k9Var.e(null, v8Var);
            return;
        }
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i12 = this.f3617m1;
        if (i11 >= 0) {
            TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(this.f3628y1));
            v8Var.r(a22);
            k9Var.e(a22, v8Var);
            return;
        }
        TLRPC.Chat M0 = qp.s1(i12).M0(Long.valueOf(-this.f3628y1));
        v8Var.q(M0);
        k9Var.e(M0, v8Var);
    }

    public final void N0(long j3) {
        be beVar;
        long j10;
        long j11;
        boolean z9;
        long j12 = 0;
        if ((!this.n1 || this.f3618o1 || j3 <= 0) && (beVar = this.f3627x1) != null) {
            ArrayList arrayList = new ArrayList();
            long e10 = p10.i(this.f3617m1).e();
            int i7 = 1;
            ArrayList arrayList2 = this.G1;
            if (arrayList2 != null) {
                j11 = 0;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i10);
                    long o4 = org.telegram.messenger.m5.o(messageReactor.peer_id);
                    long j13 = j12;
                    boolean z10 = messageReactor.anonymous;
                    if (z10) {
                        if (messageReactor.my) {
                            o4 = e10;
                        } else {
                            o4 = (-i10) - i7;
                        }
                    }
                    if (!messageReactor.my && o4 != e10) {
                        long j14 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f4927a = z10;
                        obj.f4928b = false;
                        obj.f4929c = o4;
                        obj.d = j14;
                        arrayList.add(obj);
                    } else {
                        j11 = messageReactor.count;
                    }
                    i10++;
                    j12 = j13;
                    i7 = 1;
                }
                j10 = j12;
            } else {
                j10 = 0;
                j11 = 0;
            }
            long j15 = j11 + j3;
            if (j15 > j10) {
                if (this.f3628y1 == 2666000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ?? obj2 = new Object();
                obj2.f4927a = z9;
                obj2.f4928b = true;
                obj2.f4929c = e10;
                obj2.d = j15;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new a3.c(14));
            beVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override
    public final boolean X(float f10, float f11) {
        c cVar = this.H1;
        if (f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.X(f10, f11);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.M3) {
            L0(true);
        }
    }

    @Override
    public final void dismiss() {
        Long z12;
        if (!this.N1 && !this.O1) {
            this.O1 = true;
            ij ijVar = this.F1;
            if (ijVar != null && ((z12 = ijVar.z1()) == null || z12.longValue() != this.f3628y1)) {
                ijVar.J5(this.f3628y1);
                x9 b10 = x9.b(ijVar);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i7 = this.f3617m1;
                qp s12 = qp.s1(i7);
                long j3 = b10.f5045a;
                int i10 = b10.f5046b;
                tL_messages_togglePaidReactionPrivacy.peer = s12.j1(j3);
                tL_messages_togglePaidReactionPrivacy.msg_id = i10;
                long j10 = this.f3628y1;
                if (j10 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j10 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = qp.s1(i7).j1(this.f3628y1);
                }
                qs.f(i7).k(qs.I1, Long.valueOf(b10.f5045a), Integer.valueOf(i10), Long.valueOf(this.f3628y1));
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_togglePaidReactionPrivacy, new j0(this, 4));
            }
        }
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f3617m1).c(this, qs.M3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f3617m1).n(this, qs.M3);
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 < 0 && this.G0 == this.I1 && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.l1)) != this.G0) {
                this.G0 = w02;
                this.I1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
