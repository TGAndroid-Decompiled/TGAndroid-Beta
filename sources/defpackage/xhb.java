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
public final class xhb extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final ylb c;
    public final vga d;
    public final pc0 e;
    public final bf0 f;
    public final ng8 h;
    public final io n;
    public k47 r;
    public boolean s;
    public boolean w;
    public qac x;
    public boolean y;

    public xhb(int i, long j, ylb ylbVar, Context context) {
        super(context);
        this.E = -6.0f;
        this.a = i;
        this.b = j;
        this.c = ylbVar;
        setOrientation(1);
        w91 w91Var = new w91((byte) 9, context, this);
        w91Var.U(cl8.d(null, i, j, cmb.I.o()));
        vga vgaVar = new vga(context, i);
        this.d = vgaVar;
        w91Var.addView(vgaVar, qoe.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.f = bf0Var;
        bf0Var.setRoundRadius(gm.L(21.0f));
        w91Var.addView(bf0Var, qoe.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w91Var, qoe.r(-1, -2, 7));
        ng8 ng8Var = new ng8(context, 0, null, ylbVar);
        this.h = ng8Var;
        EditTextBoldCursor textView = ng8Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        ng8Var.setTextRight(114);
        ImageView k = td4.k(context, 2131231790);
        anb.s(k, cmb.x6, ylbVar, PorterDuff.Mode.SRC_IN);
        ng8Var.addView(k, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        rve.a(k);
        k.setOnClickListener(new k(textView, (byte) 1));
        io ioVar = new io(context, false, true, false);
        this.n = ioVar;
        ioVar.n = false;
        ioVar.setTypeface(gm.o());
        anb.U(ioVar, cmb.p7, ylbVar);
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setGravity(17);
        ioVar.setAllowCancel(true);
        ioVar.setScaleProperty(0.6f);
        ng8Var.addView(ioVar, qoe.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new og6(this, (byte) 17));
        addView(ng8Var, qoe.r(-1, -2, 7));
        vgaVar.setDelegate(new rhb(this, textView, (byte) 0));
    }

    public static void b(final android.content.Context r37, final int r38, final long r39, final org.telegram.tgnet.TLRPC.User r41, final java.lang.String r42, final boolean r43, final boolean r44, boolean r45, final defpackage.ylb r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xhb.b(android.content.Context, int, long, org.telegram.tgnet.TLRPC$User, java.lang.String, boolean, boolean, boolean, ylb):void");
    }

    public static void c(Context context, int i, long j, TLRPC.User user, String str, final boolean z, boolean z2, ylb ylbVar) {
        boolean z3;
        int i2;
        String str2;
        String a0;
        boolean z4;
        oc7 r1 = oc7.r1(i);
        r1.L0(Long.valueOf(-j));
        my0 h = hg9.h(1, ylbVar, context, true);
        LinearLayout i3 = hg9.i(context, 1);
        h.O = i3;
        LinearLayout linearLayout = new LinearLayout(context);
        int i4 = cmb.F6;
        TextView b = jxe.b(context, 20.0f, i4, true, null);
        b.setText(jb6.M0(2131748384, null));
        linearLayout.addView(b, qoe.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231273);
        anb.s(imageView, i4, ylbVar, PorterDuff.Mode.SRC_IN);
        int i5 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i5, ylbVar), 1, gm.L(18.0f));
        wmb M = anb.M(i5);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar);
        linearLayout.addView(imageView, qoe.t(32, 32, 21, 0, 0, 10, 0));
        i3.addView(linearLayout, qoe.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final b61 i6 = mlb.i(24, ylbVar, context, true);
        if (TextUtils.isEmpty(str) && !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (TextUtils.isEmpty(str) && !z && z3) {
            i2 = 2131748389;
        } else if (z3) {
            i2 = 2131748390;
        } else {
            i2 = 2131748391;
        }
        i6.setText(jb6.M0(i2, null));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        final boolean z5 = z3;
        xhb xhbVar = new xhb(i, j, ylbVar, context);
        xhbVar.setClipToOutline(true);
        xhbVar.setOutlineProvider(new ViewOutlineProvider());
        anb.h(cmb.c6, ylbVar, xhbVar);
        xhbVar.a(user, str, z, z2, new qac() {
            @Override
            public final void a(Object obj) {
                int i7;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z6 = z5;
                if (isEmpty && !z && z6) {
                    i7 = 2131748389;
                } else if (z6) {
                    i7 = 2131748390;
                } else {
                    i7 = 2131748391;
                }
                i6.i(jb6.M0(i7, null), true, true);
            }
        });
        i3.addView(xhbVar, qoe.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        njb njbVar = new njb(22, ylbVar, context);
        if (m9c.D(user)) {
            a0 = jb6.M0(2131748386, null);
        } else {
            a0 = jb6.a0(null, null, 2131748385, m9c.r(user));
        }
        njbVar.setText(a0);
        i3.addView(njbVar, qoe.t(-1, -2, 7, 0, 0, 0, 0));
        i3.addView(i6, qoe.t(-1, 48, 7, 14, 19, 14, 12));
        h.Q0 = true;
        h.t0(cmb.Z6);
        if (TextUtils.isEmpty(str) && !z && !z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        i6.setOnClickListener(new eh1(i6, xhbVar, r1, j, user, strArr, i, h, z4, ylbVar));
        imageView.setOnClickListener(new di(h, (byte) 6));
        h.show();
        EditTextBoldCursor textView = xhbVar.h.getTextView();
        textView.post(new l(textView, (byte) 11));
    }

    public final void a(TLRPC.User user, String str, boolean z, boolean z2, qac qacVar) {
        boolean z3;
        boolean z4;
        int i;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i2 = this.a;
        tL_message.from_id = oc7.r1(i2).x1(user.id);
        oc7 r1 = oc7.r1(i2);
        long j = this.b;
        tL_message.peer_id = r1.x1(j);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i2).getCurrentTime();
        tL_message.out = false;
        this.s = z;
        this.w = z2;
        k47 k47Var = new k47(i2, tL_message, true, false);
        this.r = k47Var;
        k47Var.l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = gm.q;
        spannableStringBuilder.setSpan(new a38((int) Math.min(point.x * 0.5f, gm.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new a38((int) Math.min(point.x * 0.44f, gm.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
        if (L0 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        vga vgaVar = this.d;
        vgaVar.f6 = z3;
        if (sd2.T(L0) && L0.megagroup) {
            z4 = true;
        } else {
            z4 = false;
        }
        vgaVar.k6 = z4;
        this.r.n0(null);
        vgaVar.z3(this.r, null, false, false, false, false);
        pc0 pc0Var = this.e;
        pc0Var.q(user);
        this.f.f(user, pc0Var);
        this.x = qacVar;
        this.y = true;
        if (TextUtils.isEmpty(str) && !z) {
            i = 2131748388;
        } else {
            i = 2131748387;
        }
        this.h.o(str, jb6.M0(i, null), false);
        this.y = false;
    }
}
