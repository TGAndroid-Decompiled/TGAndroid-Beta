package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
public class dl1 extends jf0 implements jq3, fn7, pk5 {
    public static final HashMap y2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public npa E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final x49 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public yua I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public zoc J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final rb0 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final rd1 O1;
    public int P;
    public ueb P0;
    public boolean P1;
    public StaticLayout Q;
    public r47 Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public px4 T0;
    public pkb T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final dva W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public ed Z1;
    public boolean a0;
    public final Path a1;
    public boolean a2;
    public boolean b0;
    public int b1;
    public int b2;
    public RadialProgressView c0;
    public int c1;
    public TLRPC.TL_messageActionStarGiftOnchainOffer c2;
    public float d0;
    public final RectF d1;
    public boolean d2;
    public final q6b e0;
    public boolean e1;
    public int e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public boolean f2;
    public boolean g0;
    public al1 g1;
    public vx4 g2;
    public int h;
    public boolean h0;
    public final vnb h1;
    public float h2;
    public boolean i0;
    public int i1;
    public final Paint i2;
    public boolean j0;
    public int j1;
    public boolean j2;
    public int k0;
    public StaticLayout k1;
    public View.OnClickListener k2;
    public boolean l0;
    public Paint l1;
    public int l2;
    public int m0;
    public pkb m1;
    public final Path m2;
    public final v41 n;
    public boolean n0;
    public StaticLayout n1;
    public final float[] n2;
    public byb o0;
    public boolean o1;
    public final float[] o2;
    public final RectF p0;
    public boolean p1;
    public final Path p2;
    public final ArrayList q0;
    public int q1;
    public final int[] q2;
    public va6 r;
    public final Stack r0;
    public final mm r1;
    public int r2;
    public final boolean s;
    public dm s0;
    public pm3 s1;
    public SpannableStringBuilder s2;
    public TextPaint t0;
    public bl1 t1;
    public boolean t2;
    public float u0;
    public int u1;
    public Runnable u2;
    public float v0;
    public int v1;
    public PorterDuffColorFilter v2;
    public View w;
    public int w0;
    public int w1;
    public int w2;
    public final int x;
    public boolean x0;
    public pkb x1;
    public final cl1 x2;
    public URLSpan y;
    public jn5 y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        y2 = hashMap;
        c00.r(1, hashMap, "1⃣", 3, "2⃣");
        c00.r(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public dl1(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.n = new v41(this);
        int i = yac.t0;
        this.I = i;
        q6b q6bVar = new q6b(null, false);
        this.e0 = q6bVar;
        this.n0 = true;
        this.p0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Stack();
        this.F0 = new x49(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new Path();
        this.d1 = new RectF();
        this.e1 = true;
        this.f1 = false;
        this.o1 = false;
        this.p1 = false;
        this.r1 = new mm(this, 0L, 320L, k43.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new rd1(this, (byte) 4);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.b2 = -1;
        this.e2 = -1;
        this.i2 = new Paint(1);
        this.m2 = new Path();
        this.n2 = new float[8];
        this.o2 = new float[8];
        this.p2 = new Path();
        this.q2 = new int[]{16842910, 16842919};
        this.x2 = new cl1(this);
        q6bVar.a = false;
        this.s = z;
        this.h1 = vnbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.q0(hl.u / 2);
        this.M = new rb0((vnb) null);
        this.x = lq3.q(i).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(aob.f0(aob.p1(0.1f, -16777216), 7, hl.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        dva dvaVar = new dva(10);
        this.W1 = dvaVar;
        dvaVar.N = 100;
        dvaVar.I = false;
        dvaVar.L = true;
        dvaVar.G = false;
        dvaVar.J = true;
        dvaVar.H = true;
        dvaVar.r = (byte) 1;
        dvaVar.w = 0.98f;
        dvaVar.v = 0.98f;
        dvaVar.u = 0.98f;
        dvaVar.g = false;
        dvaVar.o = 0.0f;
        dvaVar.x = (short) 750;
        dvaVar.y = (short) 750;
        dvaVar.c();
    }

    public static SpannableStringBuilder H(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.F2(str, false, hl.L(6.0f), -hl.L(1.3f), 0.8f, 2131231198));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new mf3(hl.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            vk1.j();
            spannableStringBuilder.setSpan(vk1.g(hl.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float a0(StaticLayout staticLayout) {
        float f = 0.0f;
        for (int i = 0; i < staticLayout.getLineCount(); i++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i));
            if (ceil > f) {
                f = ceil;
            }
        }
        return f;
    }

    private float getWalletActionTop() {
        return hl.L(11.0f) + this.T + this.P;
    }

    private void setStarsPaused(boolean z) {
        dva dvaVar = this.W1;
        boolean z2 = dvaVar.g;
        ArrayList arrayList = dvaVar.n;
        if (z == z2) {
            return;
        }
        dvaVar.g = z;
        if (z) {
            dvaVar.Q = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            cva cvaVar = (cva) arrayList.get(i);
            cvaVar.a = (System.currentTimeMillis() - dvaVar.Q) + cvaVar.a;
        }
        invalidate();
    }

    public final boolean A(MotionEvent motionEvent) {
        int i;
        int i2;
        iq0 iq0Var;
        e eVar;
        r47 r47Var;
        TLRPC.Message message;
        int i3;
        e eVar2;
        r47 r47Var2;
        TLRPC.Message message2;
        int i4;
        TLRPC.Message message3;
        int f;
        long j;
        TLObject M0;
        String str;
        Context context;
        boolean z;
        String a0;
        int i5;
        SpannableStringBuilder S2;
        boolean z2;
        int i6;
        e eVar3;
        ArrayList arrayList = this.Y1;
        if (!arrayList.isEmpty()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            float width = (getWidth() - this.j1) / 2.0f;
            float f2 = 4.0f;
            float L = hl.L(4.0f) + hl.L(4.0f) + this.T + this.P + this.f;
            float L2 = (this.j1 - hl.L(4.0f)) / 2.0f;
            int action = motionEvent.getAction();
            vnb vnbVar = this.h1;
            if (action == 0) {
                this.r2 = -1;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    wo0 wo0Var = (wo0) arrayList.get(i7);
                    float L3 = ((hl.L(f2) + L2) * i7) + width;
                    RectF rectF = hl.P;
                    rectF.set(L3, L, L3 + L2, wo0Var.f + L);
                    float f3 = x;
                    float f4 = y;
                    if (rectF.contains(f3, f4)) {
                        this.r2 = i7;
                        V();
                        if (wo0Var.s == null) {
                            hf0 Y = aob.Y(aob.v0(aob.ed, vnbVar), 6, 6);
                            wo0Var.s = Y;
                            Y.setCallback(this);
                        }
                        wo0Var.s.setHotspot(f3, f4);
                        wo0Var.s.setState(this.q2);
                        wo0Var.b(!wo0Var.m);
                        return true;
                    }
                    i7++;
                    f2 = 4.0f;
                }
                return false;
            } else if (motionEvent.getAction() == 1) {
                if (this.r2 != -1) {
                    playSoundEffect(0);
                    wo0 wo0Var2 = (wo0) arrayList.get(this.r2);
                    hf0 hf0Var = wo0Var2.s;
                    if (hf0Var != null) {
                        hf0Var.setState(StateSet.NOTHING);
                    }
                    wo0Var2.b(false);
                    if (this.g1 != null && !wo0Var2.m && (iq0Var = wo0Var2.j) != null) {
                        if (getMessageObject() != null) {
                            byte b = iq0Var.a;
                            if (b == 5) {
                                al1 al1Var = this.g1;
                                if (al1Var != null) {
                                    eVar3 = al1Var.w();
                                } else {
                                    eVar3 = null;
                                }
                                if (eVar3 != null && this.Q0 != null) {
                                    jj.s0(eVar3, ob6.M0(2131749652, null), hl.S2(ob6.a0(null, null, 2131749653, wf3.s(r47.B0(this.Q0.k)))), ob6.M0(2131749654, null), true, new jj1(this, eVar3, (byte) 2));
                                }
                            } else if (b == 6) {
                                r47 r47Var3 = this.Q0;
                                if (r47Var3 != null && (message3 = r47Var3.k) != null) {
                                    TLRPC.MessageAction messageAction = message3.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                        e Q = LaunchActivity.Q();
                                        Context context2 = getContext();
                                        long B0 = r47.B0(this.Q0.k);
                                        int e1 = this.Q0.e1();
                                        int[] iArr = ow4.G1;
                                        oj n = oj.n(tL_messageActionStarGiftPurchaseOffer.price);
                                        pj pjVar = n.a;
                                        int i8 = this.I;
                                        pj pjVar2 = pj.a;
                                        if (pjVar == pjVar2) {
                                            f = uc7.s1(i8).k4.m.f();
                                        } else {
                                            f = uc7.s1(i8).k4.n.f();
                                        }
                                        oj j2 = oj.j((n.b * f) / 1000, pjVar);
                                        TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(starGift.title);
                                        sb.append(" #");
                                        String m = qu6.m(starGift.num, ',', sb);
                                        if (B0 >= 0) {
                                            j = 0;
                                            M0 = uc7.s1(i8).X1(Long.valueOf(B0));
                                        } else {
                                            j = 0;
                                            M0 = uc7.s1(i8).M0(Long.valueOf(-B0));
                                        }
                                        String d = n.d();
                                        String d2 = j2.d();
                                        if (pjVar == pj.b) {
                                            str = m;
                                            context = context2;
                                            z = true;
                                        } else {
                                            str = m;
                                            context = context2;
                                            z = false;
                                        }
                                        LinearLayout j3 = uh9.j(context, 1);
                                        j3.addView(new xta(context, starGift, M0), tre.t(-1, -2, 48, 0, -4, 0, 0));
                                        TextView textView = new TextView(context);
                                        yob.X(textView, aob.j5, vnbVar);
                                        textView.setTextSize(1, 16.0f);
                                        if (pjVar == pjVar2) {
                                            a0 = ob6.a0(null, null, 2131749630, d, wf3.s(B0), str, d2);
                                        } else {
                                            a0 = ob6.a0(null, null, 2131749629, d, wf3.s(B0), str, d2);
                                        }
                                        textView.setText(hl.S2(a0));
                                        j3.addView(textView, tre.t(-1, -2, 48, 24, 4, 24, 4));
                                        FrameLayout frameLayout = new FrameLayout(context);
                                        frameLayout.setClipChildren(false);
                                        frameLayout.setClipToPadding(false);
                                        hjb hjbVar = new hjb(context, vnbVar);
                                        frameLayout.addView(hjbVar, tre.e(-1, -1, 119));
                                        wua.a1(hjbVar, jxa.i(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                        wua.a1(hjbVar, jxa.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        wua.a1(hjbVar, jxa.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                        j3.addView(frameLayout, tre.t(-1, -2, 48, 23, 16, 23, 4));
                                        oj k = oj.k(starGift.value_usd_amount / Math.pow(10.0d, di0.h().g("USD")), pjVar);
                                        if (k.c() > 0.0d && starGift.value_usd_amount > j) {
                                            if (k.b >= j2.b) {
                                                int round = (int) Math.round((1.0d - (j2.c() / k.c())) * 100.0d);
                                                S2 = hl.S2(ob6.a0(null, null, 2131749679, bp1.n(round, "%"), starGift.title));
                                                if (round > 10) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                i5 = 1;
                                            } else {
                                                i5 = 1;
                                                S2 = hl.S2(ob6.a0(null, null, 2131749682, bp1.n((int) Math.round(((j2.c() / k.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                z2 = false;
                                            }
                                            TextView textView2 = new TextView(context);
                                            textView2.setTextSize(i5, 13.0f);
                                            textView2.setGravity(17);
                                            textView2.setText(S2);
                                            if (z2) {
                                                i6 = aob.p7;
                                            } else {
                                                i6 = aob.y6;
                                            }
                                            yob.X(textView2, i6, vnbVar);
                                            j3.addView(textView2, tre.t(-1, -2, 49, 40, 12, 40, 9));
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                                        alertDialog$Builder.n(j3);
                                        alertDialog$Builder.j(nza.V0(ob6.a0(null, null, 2131749647, d2), z), new wr3(e1, i8, Q));
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                        alertDialog$Builder.a.show();
                                    }
                                }
                            } else {
                                int i9 = 2131745102;
                                if (b == 7) {
                                    al1 al1Var2 = this.g1;
                                    if (al1Var2 != null) {
                                        eVar2 = al1Var2.w();
                                    } else {
                                        eVar2 = null;
                                    }
                                    if (eVar2 != null && (r47Var2 = this.Q0) != null && (message2 = r47Var2.k) != null) {
                                        TLRPC.MessageAction messageAction2 = message2.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                            final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                            if (tL_messageActionNoForwardsRequest.prev_value) {
                                                i9 = 2131745113;
                                            }
                                            String M02 = ob6.M0(i9, null);
                                            if (tL_messageActionNoForwardsRequest.prev_value) {
                                                i4 = 2131745114;
                                            } else {
                                                i4 = 2131745103;
                                            }
                                            jj.s0(eVar2, M02, ob6.M0(i4, null), ob6.M0(2131745119, null), false, new Runnable(this) {
                                                public final dl1 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    byte b2 = r3;
                                                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = tL_messageActionNoForwardsRequest;
                                                    dl1 dl1Var = this.b;
                                                    switch (b2) {
                                                        case 0:
                                                            uc7.s1(dl1Var.I).r5(r47.B0(dl1Var.Q0.k), dl1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                            return;
                                                        default:
                                                            uc7.s1(dl1Var.I).r5(r47.B0(dl1Var.Q0.k), dl1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                            return;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                } else if (b == 8) {
                                    al1 al1Var3 = this.g1;
                                    if (al1Var3 != null) {
                                        eVar = al1Var3.w();
                                    } else {
                                        eVar = null;
                                    }
                                    if (eVar != null && (r47Var = this.Q0) != null && (message = r47Var.k) != null) {
                                        TLRPC.MessageAction messageAction3 = message.action;
                                        if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                            final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                            if (tL_messageActionNoForwardsRequest2.new_value) {
                                                i9 = 2131745113;
                                            }
                                            String M03 = ob6.M0(i9, null);
                                            if (tL_messageActionNoForwardsRequest2.new_value) {
                                                i3 = 2131745112;
                                            } else {
                                                i3 = 2131745101;
                                            }
                                            jj.s0(eVar, M03, ob6.M0(i3, null), ob6.M0(2131745119, null), false, new Runnable(this) {
                                                public final dl1 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    byte b2 = r3;
                                                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest22 = tL_messageActionNoForwardsRequest2;
                                                    dl1 dl1Var = this.b;
                                                    switch (b2) {
                                                        case 0:
                                                            uc7.s1(dl1Var.I).r5(r47.B0(dl1Var.Q0.k), dl1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.prev_value, null);
                                                            return;
                                                        default:
                                                            uc7.s1(dl1Var.I).r5(r47.B0(dl1Var.Q0.k), dl1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.new_value, null);
                                                            return;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                        }
                        i2 = -1;
                    } else {
                        i2 = -1;
                    }
                    this.r2 = i2;
                    V();
                    return false;
                }
                return false;
            } else if (motionEvent.getAction() == 3 && (i = this.r2) != -1) {
                wo0 wo0Var3 = (wo0) arrayList.get(i);
                hf0 hf0Var2 = wo0Var3.s;
                if (hf0Var2 != null) {
                    hf0Var2.setState(StateSet.NOTHING);
                }
                wo0Var3.b(false);
                this.r2 = -1;
                V();
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void C() {
        RectF rectF = this.d1;
        this.b1 = (int) Math.min(this.b1, rectF.left);
        this.c1 = (int) Math.max(this.c1, rectF.right);
    }

    public final boolean D(float f, int i) {
        x49 x49Var = this.F0;
        if (!x49Var.H) {
            return false;
        }
        float y = getY() + x49Var.c;
        if (y <= f || (y + x49Var.m) - hl.L(16.0f) >= i) {
            return false;
        }
        return true;
    }

    public final void E() {
        String str;
        String M0;
        String G;
        SpannableStringBuilder spannableStringBuilder;
        String a0;
        int L = this.j1 - hl.L(16.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(hl.L(14.0f));
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(hl.L(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.k.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat M02 = uc7.s1(this.I).M0(Long.valueOf(-wf3.n(tL_messageActionGiftCode.boost_peer)));
        if (M02 == null) {
            str = null;
        } else {
            str = M02.title;
        }
        boolean z = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            M0 = ob6.M0(2131753169, "BoostingUnclaimedPrize");
        } else {
            M0 = ob6.M0(2131753535, "BoostingCongratulations");
        }
        if (i == 12) {
            G = ob6.G(1, "BoldYears", new Object[0]);
        } else {
            G = ob6.G(i, "BoldMonths", new Object[0]);
        }
        if (z) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.a0(null, null, 2131753159, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                qu6.s(null, null, 2131753168, new Object[]{G}, spannableStringBuilder);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.a0(null, null, 2131753300, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                qu6.s(null, null, 2131753301, new Object[]{G}, spannableStringBuilder);
            }
        } else {
            if (str == null) {
                a0 = ob6.M0(2131753303, null);
            } else {
                a0 = ob6.a0("BoostingReceivedGiftFrom", null, 2131753304, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(hl.S2(a0));
            spannableStringBuilder.append((CharSequence) "\n\n");
            qu6.s(null, null, 2131753305, new Object[]{G}, spannableStringBuilder);
        }
        String M03 = ob6.M0(2131753302, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new y7c(hl.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        bl1 bl1Var = this.t1;
        if (bl1Var != null) {
            hm.release(bl1Var.i, bl1Var.h);
        }
        bl1 bl1Var2 = new bl1(this);
        this.t1 = bl1Var2;
        bl1Var2.a(L, textPaint2, spannableStringBuilder);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M03);
        valueOf2.setSpan(new y7c(hl.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) Q("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = a0(staticLayout);
    }

    public final void F(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, String str, int i2, boolean z2) {
        ?? r4;
        int i3;
        int a;
        CharSequence charSequence4 = charSequence2;
        int L = i2 - hl.L(16.0f);
        r47 r47Var = this.Q0;
        if (r47Var != null && r47Var.D == 30) {
            L -= hl.L(16.0f);
        }
        int i4 = L;
        if (charSequence != null) {
            r47 r47Var2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (r47Var2 != null && r47Var2.D == 30) {
                textPaint.setTextSize(hl.L(14.0f));
            } else {
                textPaint.setTextSize(hl.L(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new y7c(hl.o()), 0, valueOf.length(), 33);
            r4 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            pkb pkbVar = new pkb(spannableStringBuilder, 10.0f, null);
            this.m1 = pkbVar;
            pkbVar.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(Q("paintChatActionText").getTextSize());
        } else {
            r47 r47Var3 = this.Q0;
            if (r47Var3 != null) {
                if (r47Var3.D == 35) {
                    textPaint2.setTextSize(hl.L(14.3f));
                } else if (Y() || (i3 = this.Q0.D) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33) {
                    textPaint2.setTextSize(hl.L(13.0f));
                }
            }
            textPaint2.setTextSize(hl.L(15.0f));
        }
        int L2 = i4 - hl.L(12.0f);
        r47 r47Var4 = this.Q0;
        if (r47Var4 != null && r47Var4.D == 22 && r47.B0(r47Var4.k) >= 0 && (a = kg5.a(charSequence4, textPaint2)) < L2 && a > L2 / 5.0f) {
            L2 = a;
        }
        bl1 bl1Var = this.t1;
        if (charSequence4 == null) {
            if (bl1Var != null) {
                hm.release(bl1Var.i, bl1Var.h);
                this.t1 = null;
            }
            this.p1 = r4;
        } else {
            if (bl1Var == null) {
                this.t1 = new bl1(this);
            }
            try {
                charSequence4 = pv3.m(charSequence4, textPaint2.getFontMetricsInt(), r4, null, r4);
            } catch (Exception unused) {
            }
            this.t1.a(L2, textPaint2, charSequence4);
            if (z && this.t1.d.getLineCount() > 3) {
                this.p1 = !this.o1;
                this.q1 = this.t1.d.getLineBottom(2);
                this.x1 = new pkb(ob6.M0(2131750224, null), textPaint2.getTextSize() / hl.p, hl.o());
                int lineBottom = this.t1.d.getLineBottom(2);
                this.v1 = lineBottom;
                this.w1 = lineBottom - this.t1.d.getLineTop(2);
                this.u1 = (int) this.t1.d.getLineRight(2);
            } else {
                this.p1 = r4;
                this.r1.f(true, true);
                this.q1 = r4;
            }
            if (this.p1) {
                int lineEnd = this.t1.d.getLineEnd(2) - 1;
                bl1 bl1Var2 = this.t1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r4, lineEnd);
                }
                bl1Var2.a(L2, textPaint2, charSequence4);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new y7c(hl.o()), r4, valueOf2.length(), 33);
            boolean z3 = true;
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) Q("paintChatActionText"), i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            if (!z2 || this.p1) {
                z3 = r4;
            }
            this.z1 = z3;
            this.E1 = a0(staticLayout);
        } else {
            this.y1 = null;
            this.z1 = r4;
            this.E1 = 0.0f;
        }
        if (str != null) {
            if (this.R1 == null) {
                this.R1 = new CornerPathEffect(hl.L(5.0f));
            }
            if (this.S1 == null) {
                Path path = new Path();
                this.S1 = path;
                vx4.d(path, 1.35f, r4);
            }
            pkb pkbVar2 = new pkb(str, i, hl.o());
            this.T1 = pkbVar2;
            pkbVar2.p = hl.L(62.0f);
            return;
        }
        this.S1 = null;
        this.T1 = null;
    }

    public final void G(int r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl1.G(int, java.lang.CharSequence):void");
    }

    public final void I(Canvas canvas, boolean z) {
        dl1 dl1Var;
        Paint paint;
        Paint paint2;
        vnb vnbVar;
        float f;
        float f2;
        float f3;
        float f4;
        vnb vnbVar2;
        float f5;
        Paint paint3;
        Paint paint4;
        int i;
        int i2;
        Canvas canvas2;
        float f6;
        float f7;
        float f8;
        RectF rectF;
        int i3;
        bl1 bl1Var;
        int i4;
        float L;
        zoc zocVar;
        int L2;
        int lineCount;
        RectF rectF2;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Paint paint5;
        int i11;
        int i12;
        float f9;
        StaticLayout staticLayout;
        ArrayList arrayList2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        dl1 dl1Var2 = this;
        if (dl1Var2.s) {
            if (!dl1Var2.S() || z) {
                if (!dl1Var2.S() && z) {
                    return;
                }
            } else {
                return;
            }
        }
        Paint Q = dl1Var2.Q("paintChatActionBackground");
        Paint Q2 = dl1Var2.Q("paintChatActionBackgroundDarken");
        dl1Var2.t0 = (TextPaint) dl1Var2.Q("paintChatActionText");
        int i19 = dl1Var2.U0;
        vnb vnbVar3 = dl1Var2.h1;
        if (i19 >= 0) {
            int v0 = aob.v0(i19, vnbVar3);
            if (dl1Var2.W0 == null) {
                Paint paint6 = new Paint(1);
                dl1Var2.W0 = paint6;
                paint6.setColor(v0);
                TextPaint textPaint = new TextPaint(1);
                dl1Var2.X0 = textPaint;
                textPaint.setTypeface(hl.o());
                dl1Var2.X0.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
                dl1Var2.X0.setColor(aob.v0(dl1Var2.V0, vnbVar3));
            }
            Q = dl1Var2.W0;
            dl1Var2.t0 = dl1Var2.X0;
        }
        boolean z2 = dl1Var2.e1;
        Path path = dl1Var2.a1;
        if (z2) {
            dl1Var2.e1 = false;
            dl1Var2.b1 = dl1Var2.getWidth();
            dl1Var2.c1 = 0;
            StaticLayout staticLayout2 = dl1Var2.N;
            int measuredWidth = dl1Var2.getMeasuredWidth() / 2;
            int L3 = hl.L(4.0f);
            f2 = 6.0f;
            ArrayList arrayList3 = dl1Var2.Y0;
            arrayList3.clear();
            if (staticLayout2 == null) {
                lineCount = 0;
            } else {
                lineCount = staticLayout2.getLineCount();
            }
            f3 = 8.0f;
            int L4 = hl.L(11.0f);
            f = 4.0f;
            int L5 = hl.L(8.0f);
            int i20 = 0;
            f4 = 2.0f;
            int i21 = 0;
            while (i20 < lineCount) {
                vnb vnbVar4 = vnbVar3;
                int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i20));
                if (i20 != 0 && (i18 = i21 - ceil) > 0) {
                    i16 = ceil;
                    if (i18 <= (L4 * 1.5f) + L5) {
                        i17 = i21;
                        i20 = qd4.g(i17, i20, 1, arrayList3);
                        i21 = i17;
                        vnbVar3 = vnbVar4;
                    }
                } else {
                    i16 = ceil;
                }
                i17 = i16;
                i20 = qd4.g(i17, i20, 1, arrayList3);
                i21 = i17;
                vnbVar3 = vnbVar4;
            }
            vnbVar = vnbVar3;
            for (int i22 = lineCount - 2; i22 >= 0; i22--) {
                int intValue = ((Integer) arrayList3.get(i22)).intValue();
                int i23 = i21 - intValue;
                if (i23 > 0) {
                    i15 = intValue;
                    if (i23 <= (L4 * 1.5f) + L5) {
                        arrayList3.set(i22, Integer.valueOf(i21));
                    }
                } else {
                    i15 = intValue;
                }
                i21 = i15;
                arrayList3.set(i22, Integer.valueOf(i21));
            }
            int L6 = hl.L(3.0f);
            int L7 = hl.L(6.0f);
            int i24 = L4 - L6;
            ArrayList arrayList4 = dl1Var2.Z0;
            arrayList4.clear();
            path.reset();
            float f10 = measuredWidth;
            path.moveTo(f10, L3);
            int i25 = i21;
            int i26 = 0;
            int i27 = 0;
            while (true) {
                rectF2 = dl1Var2.d1;
                if (i27 >= lineCount) {
                    break;
                }
                int intValue2 = ((Integer) arrayList3.get(i27)).intValue();
                int lineBottom = staticLayout2.getLineBottom(i27);
                int i28 = lineCount;
                int i29 = i28 - 1;
                if (i27 < i29) {
                    paint5 = Q2;
                    i11 = ((Integer) arrayList3.get(i27 + 1)).intValue();
                } else {
                    paint5 = Q2;
                    i11 = 0;
                }
                int i30 = lineBottom - i26;
                if (i27 == 0 || intValue2 > i25) {
                    i30 = hl.L(3.0f) + i30;
                }
                if (i27 == i29 || intValue2 > i11) {
                    i30 = hl.L(3.0f) + i30;
                }
                Paint paint7 = Q;
                float f11 = (intValue2 / 2.0f) + f10;
                if (i27 != i29 && intValue2 < i11 && i27 != 0 && intValue2 < i25) {
                    i12 = L7;
                } else {
                    i12 = L5;
                }
                if (i27 != 0 && intValue2 <= i25) {
                    f9 = f11;
                    if (intValue2 < i25) {
                        float f12 = f9 + i24;
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                        rectF2.set(f12, L3, (i12 << 1) + f12, i14 + L3);
                        C();
                        path.arcTo(rectF2, -90.0f, -90.0f);
                    } else {
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                    }
                } else {
                    f9 = f11;
                    staticLayout = staticLayout2;
                    arrayList2 = arrayList3;
                    rectF2.set((f9 - L6) - L4, L3, f9 + i24, (L4 << 1) + L3);
                    C();
                    path.arcTo(rectF2, -90.0f, 90.0f);
                }
                L3 += i30;
                if (i27 != i29 && intValue2 < i11) {
                    L3 -= hl.L(3.0f);
                    i30 -= hl.L(3.0f);
                }
                if (i27 != 0 && intValue2 < i25) {
                    L3 -= hl.L(3.0f);
                    i30 -= hl.L(3.0f);
                }
                arrayList4.add(Integer.valueOf(i30));
                if (i27 != i29 && intValue2 <= i11) {
                    if (intValue2 < i11) {
                        float f13 = f9 + i24;
                        rectF2.set(f13, L3 - i13, (i12 << 1) + f13, L3);
                        C();
                        path.arcTo(rectF2, 180.0f, -90.0f);
                    }
                } else {
                    rectF2.set((f9 - L6) - L4, L3 - (L4 << 1), f9 + i24, L3);
                    C();
                    path.arcTo(rectF2, 0.0f, 90.0f);
                }
                i27++;
                dl1Var2 = this;
                i25 = intValue2;
                i26 = lineBottom;
                lineCount = i28;
                Q2 = paint5;
                Q = paint7;
                staticLayout2 = staticLayout;
                arrayList3 = arrayList2;
            }
            paint = Q;
            paint2 = Q2;
            StaticLayout staticLayout3 = staticLayout2;
            ArrayList arrayList5 = arrayList3;
            int i31 = lineCount - 1;
            int i32 = i31;
            while (i32 >= 0) {
                if (i32 != 0) {
                    arrayList = arrayList5;
                    i5 = ((Integer) arrayList.get(i32 - 1)).intValue();
                } else {
                    arrayList = arrayList5;
                    i5 = 0;
                }
                int intValue3 = ((Integer) arrayList.get(i32)).intValue();
                if (i32 != i31) {
                    i6 = ((Integer) arrayList.get(i32 + 1)).intValue();
                } else {
                    i6 = 0;
                }
                StaticLayout staticLayout4 = staticLayout3;
                staticLayout4.getLineBottom(i32);
                float f14 = measuredWidth - (intValue3 / 2);
                if (i32 != i31 && intValue3 < i6 && i32 != 0 && intValue3 < i5) {
                    i7 = L7;
                } else {
                    i7 = L5;
                }
                if (i32 != i31 && intValue3 <= i6) {
                    if (intValue3 < i6) {
                        float f15 = f14 - i24;
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i8 = i31;
                        rectF2.set(f15 - (i7 << 1), L3 - i10, f15, L3);
                        C();
                        path.arcTo(rectF2, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i8 = i31;
                    }
                } else {
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i8 = i31;
                    rectF2.set(f14 - i24, L3 - (L4 << 1), L6 + f14 + L4, L3);
                    C();
                    path.arcTo(rectF2, 90.0f, 90.0f);
                }
                L3 -= ((Integer) arrayList4.get(i32)).intValue();
                if (i32 != 0 && intValue3 <= i5) {
                    if (intValue3 < i5) {
                        float f16 = f14 - i24;
                        rectF2.set(f16 - (i7 << 1), L3, f16, i9 + L3);
                        C();
                        path.arcTo(rectF2, 0.0f, -90.0f);
                    }
                } else {
                    rectF2.set(f14 - i24, L3, f14 + L6 + L4, (L4 << 1) + L3);
                    C();
                    path.arcTo(rectF2, 180.0f, 90.0f);
                }
                i32--;
                i31 = i8;
            }
            path.close();
            int measuredWidth2 = getMeasuredWidth() / 2;
            if (X() && !Y()) {
                float f17 = measuredWidth2;
                dl1Var = this;
                rectF2.left = (f17 - (dl1Var.O / 2.0f)) - hl.L(17.0f);
                rectF2.top = L3;
                rectF2.right = (dl1Var.O / 2.0f) + f17 + hl.L(17.0f);
                rectF2.bottom = hl.L(28.0f) + L3 + dl1Var.P + dl1Var.R;
                path.reset();
                path.addRoundRect(rectF2, hl.L(15.0f), hl.L(15.0f), Path.Direction.CW);
                path.close();
            } else {
                dl1Var = this;
            }
        } else {
            dl1Var = dl1Var2;
            paint = Q;
            paint2 = Q2;
            vnbVar = vnbVar3;
            f = 4.0f;
            f2 = 6.0f;
            f3 = 8.0f;
            f4 = 2.0f;
        }
        if (!dl1Var.x0) {
            dl1Var.w0 = ((ViewGroup) dl1Var.getParent()).getMeasuredHeight();
        }
        if (vnbVar != null) {
            vnbVar2 = vnbVar;
            vnbVar2.b(dl1Var.v0, dl1Var.u0 + hl.L(f), dl1Var.getMeasuredWidth(), dl1Var.w0);
        } else {
            vnbVar2 = vnbVar;
            aob.q(dl1Var.v0, dl1Var.u0 + hl.L(f), dl1Var.getMeasuredWidth(), dl1Var.w0);
        }
        boolean z3 = dl1Var instanceof er1;
        if (z3 && !aob.g1(vnbVar2)) {
            f5 = 0.75f;
        } else {
            f5 = 1.0f;
        }
        if (z && (dl1Var.getAlpha() != 1.0f || z3)) {
            i = paint.getAlpha();
            i2 = paint2.getAlpha();
            paint4 = paint;
            paint4.setAlpha((int) (dl1Var.getAlpha() * i * f5));
            paint3 = paint2;
            paint3.setAlpha((int) (dl1Var.getAlpha() * i2 * f5));
        } else {
            paint3 = paint2;
            paint4 = paint;
            if (z3) {
                i = paint4.getAlpha();
                i2 = paint3.getAlpha();
                paint4.setAlpha((int) (i * f5));
                paint3.setAlpha((int) (i2 * f5));
            } else {
                i = -1;
                i2 = -1;
            }
        }
        r47 r47Var = dl1Var.Q0;
        Paint paint8 = dl1Var.i2;
        if (r47Var != null && r47Var.j2) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawPath(path, paint4);
            if (dl1Var.S() && paint3.getAlpha() > 0) {
                canvas2.drawPath(path, paint3);
            }
            if (dl1Var.h2 > 0.0f) {
                int alpha = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (dl1Var.getAlpha() * alpha));
                }
                canvas2.drawPath(path, paint8);
                paint8.setAlpha(alpha);
            }
        }
        if (dl1Var.U()) {
            int width = dl1Var.getWidth();
            dl1Var.J0.getClass();
            float L8 = (width - hl.L(206.0f)) / f4;
            float walletActionTop = dl1Var.getWalletActionTop();
            dl1Var.J0.getClass();
            float L9 = hl.L(206.0f) + L8;
            if (dl1Var.J0.q0 == null) {
                L2 = hl.L(140.0f);
                f6 = 140.0f;
                f7 = 20.0f;
            } else {
                f6 = 140.0f;
                f7 = 20.0f;
                L2 = hl.L(150.0f) + ((int) Math.ceil(zocVar.q0.h()));
            }
            RectF rectF3 = dl1Var.O0;
            rectF3.set(L8, walletActionTop, L9, L2 + walletActionTop);
            canvas2.save();
            dl1Var.J0.c(canvas2, L8, walletActionTop);
            canvas2.drawRoundRect(rectF3, hl.L(f7), hl.L(f7), paint4);
            if (dl1Var.S() && paint3.getAlpha() > 0) {
                canvas2.drawRoundRect(rectF3, hl.L(f7), hl.L(f7), paint3);
            }
            f8 = 0.0f;
            if (dl1Var.h2 > 0.0f) {
                int alpha2 = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (dl1Var.getAlpha() * alpha2));
                }
                canvas2.drawRoundRect(rectF3, hl.L(f7), hl.L(f7), paint8);
                paint8.setAlpha(alpha2);
            }
            canvas2.restore();
        } else {
            f6 = 140.0f;
            f7 = 20.0f;
            f8 = 0.0f;
        }
        r47 r47Var2 = dl1Var.Q0;
        if (dl1Var.T()) {
            float L10 = dl1Var.I0.T.f + hl.L(f3);
            float width2 = (dl1Var.getWidth() - L10) / f4;
            if (dl1Var.I0.p) {
                L = f8;
            } else {
                L = hl.L(12.0f) + dl1Var.T + dl1Var.P;
            }
            RectF rectF4 = hl.P;
            rectF4.set(width2, L, L10 + width2, dl1Var.I0.P + L + hl.L(f3));
            RectF rectF5 = dl1Var.N1;
            if (rectF5 == null) {
                rectF5 = new RectF();
                dl1Var.N1 = rectF5;
            }
            rectF5.set(rectF4);
            canvas2.drawRoundRect(dl1Var.N1, hl.L(16.0f), hl.L(16.0f), paint4);
            if (dl1Var.S()) {
                canvas2.drawRoundRect(dl1Var.N1, hl.L(16.0f), hl.L(16.0f), paint3);
            }
        } else if (dl1Var.P0 != null) {
            float L11 = hl.L(174.0f);
            ueb uebVar = dl1Var.P0;
            uebVar.getClass();
            int L12 = hl.L(f6) + ((int) uebVar.f.h());
            if (uebVar.i) {
                i4 = hl.L(40.0f);
            } else {
                i4 = 0;
            }
            float f18 = L12 + i4;
            float width3 = (dl1Var.getWidth() - L11) / f4;
            RectF rectF6 = dl1Var.N1;
            if (rectF6 == null) {
                rectF6 = new RectF();
                dl1Var.N1 = rectF6;
            }
            rectF6.set(width3, hl.L(f), L11 + width3, hl.L(f) + f18);
            canvas2.drawRoundRect(dl1Var.N1, hl.L(16.0f), hl.L(16.0f), paint4);
            if (dl1Var.S()) {
                canvas2.drawRoundRect(dl1Var.N1, hl.L(16.0f), hl.L(16.0f), paint3);
            }
        } else if (dl1Var.W(r47Var2)) {
            float width4 = (dl1Var.getWidth() - dl1Var.j1) / f4;
            float f19 = dl1Var.T + dl1Var.P;
            if (dl1Var.Y()) {
                float L13 = f19 + hl.L(f);
                rectF = hl.P;
                rectF.set(width4, L13, dl1Var.j1 + width4, dl1Var.f + L13);
            } else {
                float L14 = f19 + hl.L(12.0f);
                rectF = hl.P;
                float f20 = dl1Var.j1;
                rectF.set(width4, L14, width4 + f20, f20 + L14 + dl1Var.L1);
            }
            if (r47Var2 != null && r47Var2.D == 18 && !dl1Var.p1 && (bl1Var = dl1Var.t1) != null && dl1Var.q1 > 0) {
                rectF.bottom = qu6.B(1.0f, dl1Var.r1.c, bl1Var.d.getHeight() - dl1Var.q1, rectF.bottom);
            }
            RectF rectF7 = dl1Var.N1;
            if (rectF7 == null) {
                rectF7 = new RectF();
                dl1Var.N1 = rectF7;
            }
            rectF7.set(rectF);
            if (r47Var2 != null && (((i3 = r47Var2.D) == 33 || i3 == 35) && dl1Var.Z1 != null)) {
                float[] fArr = dl1Var.n2;
                Arrays.fill(fArr, hl.L(16.0f));
                float L15 = hl.L(f2);
                fArr[7] = L15;
                fArr[6] = L15;
                fArr[5] = L15;
                fArr[4] = L15;
                Path path2 = dl1Var.m2;
                path2.rewind();
                path2.addRoundRect(dl1Var.N1, fArr, Path.Direction.CW);
                canvas2.drawPath(path2, paint4);
                if (dl1Var.S()) {
                    canvas2.drawPath(path2, paint3);
                }
            } else {
                canvas2.drawRoundRect(dl1Var.N1, hl.L(f7), hl.L(f7), paint4);
                if (dl1Var.S()) {
                    canvas2.drawRoundRect(dl1Var.N1, hl.L(f7), hl.L(f7), paint3);
                }
            }
        }
        if (i >= 0) {
            paint4.setAlpha(i);
            paint3.setAlpha(i2);
        }
    }

    public final void J(Canvas canvas) {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.g2 != null && (tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            ImageReceiver imageReceiver = this.J;
            float L = (imageReceiver.M0 - hl.L(10.0f)) - hl.L(1.7f);
            int L2 = (int) (((((imageReceiver.L0 + imageReceiver.N0) + hl.L(10.0f)) + hl.L(1.9805f)) + hl.L(48.0f)) - hl.L(40.800003f));
            int i = (int) L;
            this.g2.setBounds(L2 - hl.L(39.0f), i, L2, hl.L(42.6f) + i);
            this.g2.draw(canvas);
        }
    }

    public final void K(Canvas canvas) {
        ColorFilter colorFilter;
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        int i3;
        float L;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f4 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        dm dmVar = this.s0;
        if (staticLayout != null) {
            colorFilter = O(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        hm.drawAnimatedEmojis(canvas2, staticLayout, dmVar, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f5 = 4.0f;
        if (T()) {
            canvas2.save();
            yua yuaVar = this.I0;
            float width = (getWidth() - yuaVar.T.f) / 2.0f;
            if (yuaVar.p) {
                L = hl.L(4.0f);
            } else {
                L = hl.L(16.0f) + this.T + this.P;
            }
            canvas2.translate(width, L);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        byb bybVar = this.o0;
        vnb vnbVar = this.h1;
        if (bybVar != null) {
            float alpha = getAlpha();
            if (vnbVar != null) {
                vnbVar.b(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                aob.q(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (vnbVar != null) {
                vnbVar.b(this.v0, this.u0 + hl.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                aob.q(this.v0, this.u0 + hl.L(4.0f), getMeasuredWidth(), this.w0);
            }
            float width2 = (getWidth() - this.j1) / 2.0f;
            float L2 = hl.L(4.0f) + hl.L(4.0f) + this.T + this.P + this.f;
            float L3 = (this.j1 - hl.L(4.0f)) / 2.0f;
            int i4 = 0;
            while (i4 < arrayList.size()) {
                wo0 wo0Var = (wo0) arrayList.get(i4);
                float a = wo0Var.a();
                float L4 = ((hl.L(f5) + L3) * i4) + width2;
                float f6 = L4 + L3;
                RectF rectF = this.d1;
                rectF.set(L4, L2, f6, wo0Var.f + L2);
                canvas2.save();
                if (a != 1.0f) {
                    f = f5;
                    canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
                } else {
                    f = f5;
                }
                float[] fArr = this.o2;
                Arrays.fill(fArr, hl.L(Math.min(6.75f, xea.U0)));
                if ((wo0Var.g & 9) == 9) {
                    float L5 = hl.L(xea.U0);
                    fArr[7] = L5;
                    fArr[6] = L5;
                }
                if ((wo0Var.g & 10) == 10) {
                    float L6 = hl.L(xea.U0);
                    fArr[5] = L6;
                    fArr[4] = L6;
                }
                Path path = this.p2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, Q("paintChatActionBackground"));
                if (S()) {
                    canvas2.drawPath(path, aob.h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                hf0 hf0Var = wo0Var.s;
                if (hf0Var != null) {
                    int i5 = (int) L2;
                    hf0Var.setBounds((int) L4, i5, (int) f6, wo0Var.f + i5);
                    wo0Var.s.setAlpha(255);
                    wo0Var.s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (wo0Var.t != null) {
                    i = hl.L(26.0f);
                } else {
                    i = 0;
                }
                float j = wo0Var.h.j();
                if (wo0Var.t != null) {
                    i2 = hl.L(f);
                } else {
                    i2 = 0;
                }
                float f7 = i;
                float z = bp1.z(L3 - (j + i2), f7, f4, L4);
                Drawable drawable = wo0Var.t;
                if (drawable != null) {
                    int i6 = (int) z;
                    f2 = f4;
                    drawable.setBounds(i6, (int) (((wo0Var.f - hl.L(24.0f)) / f4) + L2), hl.L(24.0f) + i6, hl.L(24.0f) + ((int) (((wo0Var.f - hl.L(24.0f)) / f2) + L2)));
                    Drawable drawable2 = wo0Var.t;
                    if (wo0Var.m) {
                        i3 = 128;
                    } else {
                        i3 = 255;
                    }
                    drawable2.setAlpha(i3);
                    wo0Var.t.draw(canvas2);
                    z += f7;
                } else {
                    f2 = f4;
                }
                wo0Var.h.p = Math.max(1, (((int) L3) - hl.L(15.0f)) - i);
                pkb pkbVar = wo0Var.h;
                float L7 = (hl.L(40.0f) / f2) + L2;
                if (wo0Var.m) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                pkbVar.f(canvas2, z, L7, f3);
                canvas2.restore();
                canvas2.restore();
                i4++;
                f5 = f;
                f4 = f2;
            }
        }
    }

    public final void L(Canvas canvas, boolean z) {
        if (this.s) {
            if (!S() || z) {
                if (!S() && z) {
                    return;
                }
            } else {
                return;
            }
        }
        M(canvas, z, null);
    }

    public final void M(Canvas canvas, boolean z, Integer num) {
        float f;
        Canvas canvas2;
        float f2 = 1.0f;
        if (z) {
            f = getAlpha();
        } else {
            f = 1.0f;
        }
        if (f > 0.0f) {
            vnb vnbVar = this.h1;
            if (vnbVar != null) {
                vnbVar.b(this.v0, this.u0 + hl.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                aob.q(this.v0, this.u0 + hl.L(4.0f), getMeasuredWidth(), this.w0);
            }
            r47 r47Var = this.Q0;
            if (r47Var != null && r47Var.N5()) {
                x49 x49Var = this.F0;
                x49Var.getClass();
                x49Var.a = 1.0f;
                int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i < 0) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                cl1 cl1Var = this.x2;
                if (cl1Var.b) {
                    f2 = cl1Var.c;
                }
                x49Var.d(canvas2, f2, num);
                if (i < 0) {
                    canvas2.restore();
                }
            }
        }
    }

    @Override
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        r47 r47Var = this.Q0;
        if (r47Var != null && r47Var.D == 11) {
            int size = r47Var.p0.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    photoSize = (TLRPC.PhotoSize) r47Var.p0.get(i);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.J.Z(this.y0, "g", jn5.f(photoSize, r47Var.n0), "50_50_b", this.M, 0L, null, r47Var, 1);
            lq3.q(this.I).v(this);
        }
    }

    public final ColorFilter O(int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (i == this.w2 && (porterDuffColorFilter = this.v2) != null) {
            return porterDuffColorFilter;
        }
        this.w2 = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.v2 = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public final int P(r47 r47Var) {
        int i;
        int i2 = this.i1;
        int i3 = r47Var.D;
        if (i3 == 37) {
            i2 = hl.L(52.0f);
        } else if (i3 == 21 || Y()) {
            i2 = hl.L(78.0f);
        }
        if (!X() && (i = r47Var.D) != 34 && i != 35) {
            return i2;
        }
        return 0;
    }

    public Paint Q(String str) {
        Paint paint;
        vnb vnbVar = this.h1;
        if (vnbVar != null) {
            paint = vnbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return aob.T0(str);
    }

    public final float R(r47 r47Var) {
        uc7 s1;
        String str;
        if (r47Var != null) {
            try {
                if (r47Var.D == 22 && (str = (s1 = uc7.s1(this.I)).J2) != null && TextUtils.equals(r47Var.k.action.wallpaper.uploadingImage, str)) {
                    return s1.K2.r;
                }
                return 1.0f;
            } catch (Exception e) {
                cc4.g(e, true);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean S() {
        if (this.W0 == null) {
            vnb vnbVar = this.h1;
            if (vnbVar != null) {
                if (vnbVar.g()) {
                    return true;
                }
                return false;
            } else if (aob.b1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean T() {
        yua yuaVar = this.I0;
        if (yuaVar != null && yuaVar.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        TLRPC.Message message;
        r47 r47Var = this.Q0;
        if (r47Var != null && (message = r47Var.k) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void V() {
        al1 al1Var = this.g1;
        if (al1Var != null && al1Var.h()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean W(r47 r47Var) {
        if (r47Var != null) {
            int i = r47Var.D;
            if (i == 30 || i == 18 || i == 25 || Y()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean X() {
        TLRPC.Message message;
        r47 r47Var = this.Q0;
        if (r47Var != null && (message = r47Var.k) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        r47 r47Var;
        int i;
        if (!T() && this.P0 == null && (i = (r47Var = this.Q0).D) != 31 && i != 37 && i != 33 && i != 35 && i != 34 && i != 21 && i != 22 && !r47Var.y4()) {
            TLRPC.Message message = this.Q0.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    if (!((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low && !((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean Z() {
        r47 r47Var = this.Q0;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return lbc.D(uc7.s1(this.I).X1(Long.valueOf(this.Q0.k.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final boolean b0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.d2) {
            long j = tL_messageActionStarGiftOnchainOffer.offer_id;
            Long l = (Long) vs7.a.get(Long.valueOf(j));
            if (l == null || l.longValue() <= SystemClock.elapsedRealtime() || !vs7.b.contains(Long.valueOf(j))) {
                int i = this.I;
                if (vs7.k(i, j) || vs7.m(i, j)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        al1 al1Var = this.g1;
        if (al1Var != null) {
            al1Var.y(this, reactionCount, z, f, f2);
        }
    }

    public final CharSequence c0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = vs7.a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = ob6.M0(2131749520, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = ob6.M0(2131749519, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = ob6.M0(2131749524, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? ob6.M0(2131749522, null) : max == 0 ? ob6.M0(2131749521, null) : hl.S2(ob6.a0(null, null, 2131749558, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
            }
        }
        if (charSequence == null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) "\n\n");
        spannableStringBuilder2.append(charSequence);
        return spannableStringBuilder2;
    }

    public final void d0(CharacterStyle characterStyle) {
        if (this.g1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.g1.n(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.y;
                if (uRLSpan instanceof f8c) {
                    TLObject tLObject = ((f8c) uRLSpan).c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        ro4.n(this.g1.w(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.y;
                if (uRLSpan2 instanceof f8c) {
                    TLObject tLObject2 = ((f8c) uRLSpan2).c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.g1.x((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.g1.B(this, this.Q0.N1());
            } else if (url.startsWith("http")) {
                m01.u(getContext(), url);
            } else {
                this.g1.I(Long.parseLong(url));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r47 r47Var;
        if (i == jn7.m1) {
            setSpoilersSuppressed(false);
        } else if (i != jn7.l4 && i != jn7.L3) {
            if (i == jn7.l1) {
                setSpoilersSuppressed(true);
            } else if (i != jn7.Y2 && i != jn7.H3 && i != jn7.Z2) {
                if (i == jn7.y0) {
                    if (Objects.equals(objArr[0], yac.h(this.I).c0) && (r47Var = this.Q0) != null) {
                        i0(r47Var, true);
                    }
                } else if (i == jn7.d4 && U()) {
                    this.s2 = null;
                    this.W = 0;
                    requestLayout();
                    invalidate();
                }
            } else {
                r47 r47Var2 = this.Q0;
                if (r47Var2 != null) {
                    i0(r47Var2, true);
                }
            }
        } else {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.U1) {
            float a = this.n.a(0.02f);
            canvas.save();
            canvas.scale(a, a, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        r47 r47Var = this.Q0;
        TLRPC.MessageAction messageAction = r47Var.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (r47Var != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Z()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            hl.c3(new tu0(this, tL_premiumGiftOption, str));
        }
    }

    public final void f0() {
        TLRPC.Message message;
        r47 r47Var = this.Q0;
        if (r47Var != null && (message = r47Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            q6b q6bVar = this.e0;
            if (z) {
                Context context = getContext();
                TLRPC.Message message2 = this.Q0.k;
                int i = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                vnb vnbVar = q6bVar.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                nza.l1(context, false, 0L, this.I, starsTransaction, vnbVar);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.Q0.k;
                int i2 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                vnb vnbVar2 = q6bVar.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i2;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                nza.l1(context2, false, 0L, this.I, starsTransaction2, vnbVar2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.Q0.k;
                int i3 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                vnb vnbVar3 = q6bVar.J;
                TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
                starsTransaction3.title = null;
                starsTransaction3.description = null;
                starsTransaction3.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction3.peer = tL_starsTransactionPeer3;
                tL_starsTransactionPeer3.peer = peer5;
                starsTransaction3.date = i3;
                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                starsTransaction3.amount = tL_starsTonAmount;
                tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
                starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                nza.l1(context3, false, 0L, this.I, starsTransaction3, vnbVar3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    wua wuaVar = new wua(getContext(), this.I, r47.B0(this.Q0.k), this.h1, null);
                    wuaVar.m2(this.Q0, null);
                    wuaVar.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    e S = LaunchActivity.S();
                    if (S != null) {
                        bs2.v(null, 2131743535, d31.b0(S), 2131624021, 36);
                        return;
                    }
                    return;
                }
                wua wuaVar2 = new wua(getContext(), this.I, r47.B0(this.Q0.k), this.h1, null);
                wuaVar2.m2(this.Q0, null);
                wuaVar2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        wua wuaVar3 = new wua(getContext(), this.I, 0L, this.h1, null);
                        wuaVar3.n2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        wuaVar3.show();
                    }
                }
            }
        }
    }

    public final boolean g0(float f, float f2, gn1 gn1Var) {
        if (U() && !this.Q0.O3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y = getY() + getPaddingTop() + getWalletActionTop();
            if (y >= f && y + hl.L(140.0f) <= f2) {
                zoc zocVar = this.J0;
                b29 b29Var = zocVar.l;
                if (zocVar.i0 && zocVar.j0 == null) {
                    zocVar.i0 = false;
                    zocVar.k0 = gn1Var;
                    zocVar.K.e(true, 0.0f);
                    zocVar.M = false;
                    zocVar.N = 0L;
                    zocVar.b();
                    zocVar.g();
                    zocVar.t = 18.0f;
                    zocVar.u.z();
                    b29Var.O(true, 0.0f);
                    b29Var.start();
                    zocVar.H = true;
                    float f3 = zocVar.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    zocVar.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    zocVar.j0.setInterpolator(k43.h);
                    zocVar.j0.addUpdateListener(new qm1(zocVar, f3, (byte) 8));
                    zocVar.j0.addListener(new omb(zocVar, (byte) 24));
                    zocVar.j0.start();
                    zocVar.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    jf7.Y(this.I).U1(r47.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (T()) {
            int width = ((int) (getWidth() - (this.I0.T.f + hl.L(8.0f)))) / 2;
            if (this.I0.p) {
                return width;
            }
            return Math.min(this.b1, width);
        } else if (W(this.Q0)) {
            return ik8.g(getWidth(), this.j1, 2, this.k0 / 2);
        } else {
            int i = this.b1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i = Math.min((int) imageReceiver.L0, i);
            }
            return (this.k0 / 2) + i;
        }
    }

    @Override
    public int getBoundsRight() {
        if (T()) {
            int L = ((int) ((this.I0.T.f + hl.L(8.0f)) + getWidth())) / 2;
            if (this.I0.p) {
                return L;
            }
            return Math.max(this.c1, L);
        } else if (W(this.Q0)) {
            return ((getWidth() + this.j1) / 2) + (this.k0 / 2);
        } else {
            int i = this.c1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i = Math.max((int) imageReceiver.w(), i);
            }
            return (this.k0 / 2) + i;
        }
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public j47 getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public al1 getDelegate() {
        return this.g1;
    }

    @Override
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override
    public r47 getMessageObject() {
        return this.Q0;
    }

    @Override
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public x49 getReactionsLayout() {
        return this.F0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public cl1 getTransitionParams() {
        return this.x2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final void h0(int i, boolean z, boolean z2) {
        String u;
        int i2 = this.R0;
        if (i2 != i && i2 / 3600 != i / 3600) {
            if (z) {
                if (i == 2147483646) {
                    u = ob6.M0(2131748246, "MessageScheduledUntilOnline");
                } else {
                    u = ob6.a0("MessageScheduledOn", null, 2131748282, ob6.u(i, false));
                }
            } else {
                u = ob6.u(i, false);
            }
            this.R0 = i;
            CharSequence charSequence = this.S0;
            if (charSequence == null || !TextUtils.equals(u, charSequence)) {
                this.S0 = u;
                this.s2 = null;
                l0(z2);
            }
        }
    }

    public final void i0(defpackage.r47 r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl1.i0(r47, boolean):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.u2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.t2 && getParent() != null) {
            View view2 = (View) getParent();
            if (view2.getParent() != null) {
                view2.invalidate();
                ((View) view2.getParent()).invalidate();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    public final void j0(float f, int i) {
        this.x0 = true;
        this.w0 = i;
        this.u0 = f;
        this.v0 = 0.0f;
    }

    public final void k0() {
        if (this.c2 != null && this.d2 && this.Q0 != null) {
            boolean b0 = b0();
            boolean z = this.f2;
            if (b0 != z) {
                this.f2 = !z;
                final r47 r47Var = this.Q0;
                post(new Runnable(this) {
                    public final dl1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        r47 r47Var2 = r47Var;
                        dl1 dl1Var = this.b;
                        switch (b) {
                            case 0:
                                if (dl1Var.Q0 == r47Var2) {
                                    dl1Var.i0(r47Var2, true);
                                    dl1Var.requestLayout();
                                    return;
                                }
                                return;
                            default:
                                if (dl1Var.Q0 == r47Var2) {
                                    dl1Var.i0(r47Var2, true);
                                    dl1Var.requestLayout();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.d2 && this.Q0 != null && this.t1 != null) {
            HashMap hashMap = vs7.a;
            int i = tL_messageActionStarGiftOnchainOffer.expires_at;
            int i2 = this.I;
            int max = Math.max(0, i - ConnectionsManager.getInstance(i2).getCurrentTime());
            int i3 = this.e2;
            if (max <= 0) {
                if (i3 != 0) {
                    this.e2 = 0;
                    this.d2 = vs7.i(i2, this.c2);
                    final r47 r47Var2 = this.Q0;
                    post(new Runnable(this) {
                        public final dl1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r3;
                            r47 r47Var22 = r47Var2;
                            dl1 dl1Var = this.b;
                            switch (b) {
                                case 0:
                                    if (dl1Var.Q0 == r47Var22) {
                                        dl1Var.i0(r47Var22, true);
                                        dl1Var.requestLayout();
                                        return;
                                    }
                                    return;
                                default:
                                    if (dl1Var.Q0 == r47Var22) {
                                        dl1Var.i0(r47Var22, true);
                                        dl1Var.requestLayout();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (max != i3) {
                this.e2 = max;
                this.t1.a(this.t1.c, this.G1, c0(vs7.d(this.c2), this.c2));
            }
            postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
        }
    }

    public final void l0(boolean z) {
        if (getMeasuredWidth() != 0) {
            G(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (!this.D0) {
            if (z) {
                hl.c3(new wk1(this, (byte) 5));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        y();
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        al1 al1Var;
        super.onAttachedToWindow();
        this.j2 = true;
        this.J.I();
        setStarsPaused(false);
        if (this.s && (al1Var = this.g1) != null && !al1Var.h()) {
            z = true;
        } else {
            z = false;
        }
        this.s0 = hm.update(0, this, z, this.s0, this.N);
        bl1 bl1Var = this.t1;
        if (bl1Var != null) {
            bl1Var.h = hm.update(0, (View) bl1Var.i, false, bl1Var.h, bl1Var.d);
        }
        int i = this.I;
        jn7.f(i).b(this, jn7.Y2);
        jn7.f(i).b(this, jn7.Z2);
        jn7.f(i).b(this, jn7.H3);
        jn7.f(i).b(this, jn7.y0);
        jn7.f(i).b(this, jn7.d4);
        jn7.e().b(this, jn7.l4);
        jn7.e().b(this, jn7.L3);
        r47 r47Var = this.Q0;
        if (r47Var != null && r47Var.D == 21) {
            i0(r47Var, true);
        }
        yua yuaVar = this.I0;
        if (yuaVar != null) {
            yuaVar.a();
        }
        x49 x49Var = this.F0;
        ArrayList arrayList = x49Var.s;
        x49Var.D = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((u49) arrayList.get(i2)).a();
        }
        byb bybVar = this.o0;
        if (bybVar != null) {
            bybVar.a();
        }
        ueb uebVar = this.P0;
        if (uebVar != null) {
            uebVar.d.M(uebVar.b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j2 = false;
        int i = this.I;
        lq3.q(i).v(this);
        this.J.K();
        setStarsPaused(true);
        this.D0 = false;
        hm.release(this, this.s0);
        bl1 bl1Var = this.t1;
        if (bl1Var != null) {
            hm.release(bl1Var.i, bl1Var.h);
        }
        jn7.f(i).n(this, jn7.Y2);
        jn7.f(i).n(this, jn7.Z2);
        jn7.f(i).n(this, jn7.H3);
        jn7.f(i).n(this, jn7.y0);
        jn7.f(i).n(this, jn7.d4);
        jn7.e().n(this, jn7.l4);
        jn7.e().n(this, jn7.L3);
        this.e0.g();
        this.x2.a = false;
        yua yuaVar = this.I0;
        if (yuaVar != null) {
            yuaVar.S = false;
            yuaVar.d.K();
            yuaVar.e.b();
            iw4 iw4Var = yuaVar.y;
            iw4Var.d.K();
            hm.release((View) null, iw4Var.q);
            iw4Var.q = null;
        }
        this.F0.p();
        byb bybVar = this.o0;
        if (bybVar != null) {
            bybVar.b();
        }
        ueb uebVar = this.P0;
        if (uebVar != null) {
            uebVar.d.M(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        r47 r47Var = this.Q0;
        if (TextUtils.isEmpty(this.S0) && r47Var == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.s2;
        if (spannableStringBuilder == null) {
            if (!TextUtils.isEmpty(this.S0)) {
                charSequence = this.S0;
            } else {
                charSequence = r47Var.v;
            }
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new r1(this, characterStyle, (byte) 3), spanStart, spanEnd, 33);
            }
            this.s2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(spannableStringBuilder.toString());
        } else {
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        yoc yocVar;
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        zoc zocVar = this.J0;
        if (zocVar == null) {
            yocVar = null;
        } else {
            yocVar = zocVar.m;
        }
        if (yocVar != null) {
            yocVar.layout(0, 0, hl.L(42.0f), hl.L(42.0f));
        }
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl1.onMeasure(int, int):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean q() {
        al1 al1Var = this.g1;
        if (al1Var != null) {
            return al1Var.i0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            l0(false);
        }
    }

    public void setDelegate(al1 al1Var) {
        this.g1 = al1Var;
    }

    public void setInvalidateColors(boolean z) {
        if (this.f1 == z) {
            return;
        }
        this.f1 = z;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.u2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z) {
        this.t2 = z;
    }

    public void setMessageObject(r47 r47Var) {
        i0(r47Var, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.k2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i) {
        this.l2 = i;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            V();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        this.K0 = z;
        zoc zocVar = this.J0;
        if (zocVar != null) {
            zocVar.n(z);
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((npa) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f) {
        setTranslationX((getTranslationX() - this.N0) + f);
        this.N0 = f;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && drawable != this.r && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl1.y():void");
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void b(boolean z, boolean z2) {
    }

    @Override
    public final void i(long j, long j2) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    public dl1(Context context) {
        this(null, context, false);
    }
}
