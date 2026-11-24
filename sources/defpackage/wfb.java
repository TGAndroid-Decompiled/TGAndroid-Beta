package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wfb extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final wjb c;
    public final vea d;
    public final pb0 e;
    public final be0 f;
    public final le8 h;
    public final hn n;
    public k27 r;
    public boolean s;
    public boolean w;
    public p8c x;
    public boolean y;

    public wfb(int i, long j, wjb wjbVar, Context context) {
        super(context);
        this.E = -6.0f;
        this.a = i;
        this.b = j;
        this.c = wjbVar;
        setOrientation(1);
        n81 n81Var = new n81((byte) 9, context, this);
        n81Var.U(zi8.d(null, i, j, bkb.I.o()));
        vea veaVar = new vea(context, i);
        this.d = veaVar;
        n81Var.addView(veaVar, nme.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.f = be0Var;
        be0Var.setRoundRadius(gl.L(21.0f));
        n81Var.addView(be0Var, nme.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(n81Var, nme.r(-1, -2, 7));
        le8 le8Var = new le8(context, 0, null, wjbVar);
        this.h = le8Var;
        EditTextBoldCursor textView = le8Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        le8Var.setTextRight(114);
        ImageView k = tb4.k(context, 2131231789);
        zkb.s(k, bkb.x6, wjbVar, PorterDuff.Mode.SRC_IN);
        le8Var.addView(k, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        ote.a(k);
        k.setOnClickListener(new k(textView, (byte) 1));
        hn hnVar = new hn(context, false, true, false);
        this.n = hnVar;
        hnVar.n = false;
        hnVar.setTypeface(gl.o());
        zkb.U(hnVar, bkb.p7, wjbVar);
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setGravity(17);
        hnVar.setAllowCancel(true);
        hnVar.setScaleProperty(0.6f);
        le8Var.addView(hnVar, nme.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new jf6(this, (byte) 16));
        addView(le8Var, nme.r(-1, -2, 7));
        veaVar.setDelegate(new sk4(this, textView, false, (byte) 28));
    }

    public static void b(final android.content.Context r37, final int r38, final long r39, final org.telegram.tgnet.TLRPC.User r41, final java.lang.String r42, final boolean r43, final boolean r44, boolean r45, final defpackage.wjb r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfb.b(android.content.Context, int, long, org.telegram.tgnet.TLRPC$User, java.lang.String, boolean, boolean, boolean, wjb):void");
    }

    public static void c(Context context, int i, long j, TLRPC.User user, String str, final boolean z, boolean z2, wjb wjbVar) {
        boolean z3;
        int i2;
        String str2;
        String a0;
        boolean z4;
        na7 q1 = na7.q1(i);
        q1.K0(Long.valueOf(-j));
        fx0 h = de9.h(1, wjbVar, context, true);
        LinearLayout j2 = de9.j(context, 1);
        h.O = j2;
        LinearLayout linearLayout = new LinearLayout(context);
        int i3 = bkb.F6;
        TextView b = hve.b(context, 20.0f, i3, true, null);
        b.setText(k96.M0(2131748435, null));
        linearLayout.addView(b, nme.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        zkb.s(imageView, i3, wjbVar, PorterDuff.Mode.SRC_IN);
        int i4 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i4, wjbVar), 1, gl.L(18.0f));
        vkb M = zkb.M(i4);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar);
        linearLayout.addView(imageView, nme.t(32, 32, 21, 0, 0, 10, 0));
        j2.addView(linearLayout, nme.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final u41 i5 = yjb.i(24, wjbVar, context, true);
        if (TextUtils.isEmpty(str) && !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (TextUtils.isEmpty(str) && !z && z3) {
            i2 = 2131748440;
        } else if (z3) {
            i2 = 2131748441;
        } else {
            i2 = 2131748442;
        }
        i5.setText(k96.M0(i2, null));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        final boolean z5 = z3;
        wfb wfbVar = new wfb(i, j, wjbVar, context);
        wfbVar.setClipToOutline(true);
        wfbVar.setOutlineProvider(new ViewOutlineProvider());
        zkb.h(bkb.c6, wjbVar, wfbVar);
        wfbVar.a(user, str, z, z2, new p8c() {
            @Override
            public final void a(Object obj) {
                int i6;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z6 = z5;
                if (isEmpty && !z && z6) {
                    i6 = 2131748440;
                } else if (z6) {
                    i6 = 2131748441;
                } else {
                    i6 = 2131748442;
                }
                i5.i(k96.M0(i6, null), true, true);
            }
        });
        j2.addView(wfbVar, nme.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        mhb mhbVar = new mhb(22, wjbVar, context);
        if (l7c.C(user)) {
            a0 = k96.M0(2131748437, null);
        } else {
            a0 = k96.a0(null, null, 2131748436, l7c.q(user));
        }
        mhbVar.setText(a0);
        j2.addView(mhbVar, nme.t(-1, -2, 7, 0, 0, 0, 0));
        j2.addView(i5, nme.t(-1, 48, 7, 14, 19, 14, 12));
        h.Q0 = true;
        h.t0(bkb.Z6);
        if (TextUtils.isEmpty(str) && !z && !z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        i5.setOnClickListener(new wf1(i5, wfbVar, q1, j, user, strArr, i, h, z4, wjbVar));
        imageView.setOnClickListener(new dh(h, (byte) 6));
        h.show();
        EditTextBoldCursor textView = wfbVar.h.getTextView();
        textView.post(new l(textView, (byte) 11));
    }

    public final void a(TLRPC.User user, String str, boolean z, boolean z2, p8c p8cVar) {
        boolean z3;
        boolean z4;
        int i;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i2 = this.a;
        tL_message.from_id = na7.q1(i2).w1(user.id);
        na7 q1 = na7.q1(i2);
        long j = this.b;
        tL_message.peer_id = q1.w1(j);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i2).getCurrentTime();
        tL_message.out = false;
        this.s = z;
        this.w = z2;
        k27 k27Var = new k27(i2, tL_message, true, false);
        this.r = k27Var;
        k27Var.l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = gl.q;
        spannableStringBuilder.setSpan(new x08((int) Math.min(point.x * 0.5f, gl.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new x08((int) Math.min(point.x * 0.44f, gl.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j));
        if (K0 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        vea veaVar = this.d;
        veaVar.f6 = z3;
        if (hc2.T(K0) && K0.megagroup) {
            z4 = true;
        } else {
            z4 = false;
        }
        veaVar.k6 = z4;
        this.r.n0(null);
        veaVar.z3(this.r, null, false, false, false, false);
        pb0 pb0Var = this.e;
        pb0Var.q(user);
        this.f.f(user, pb0Var);
        this.x = p8cVar;
        this.y = true;
        if (TextUtils.isEmpty(str) && !z) {
            i = 2131748439;
        } else {
            i = 2131748438;
        }
        this.h.o(str, k96.M0(i, null), false);
        this.y = false;
    }
}
