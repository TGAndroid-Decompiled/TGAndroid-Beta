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
public final class sjb extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final vnb c;
    public final mia d;
    public final rb0 e;
    public final de0 f;
    public final zh8 h;
    public final in n;
    public r47 r;
    public boolean s;
    public boolean w;
    public pcc x;
    public boolean y;

    public sjb(int i, long j, vnb vnbVar, Context context) {
        super(context);
        this.E = -6.0f;
        this.a = i;
        this.b = j;
        this.c = vnbVar;
        setOrientation(1);
        w81 w81Var = new w81((byte) 9, context, this);
        w81Var.U(mm8.d(null, i, j, aob.I.o()));
        mia miaVar = new mia(context, i);
        this.d = miaVar;
        w81Var.addView(miaVar, tre.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.f = de0Var;
        de0Var.setRoundRadius(hl.L(21.0f));
        w81Var.addView(de0Var, tre.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w81Var, tre.r(-1, -2, 7));
        zh8 zh8Var = new zh8(context, 0, null, vnbVar);
        this.h = zh8Var;
        EditTextBoldCursor textView = zh8Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        zh8Var.setTextRight(114);
        ImageView k = qd4.k(context, 2131231789);
        yob.s(k, aob.y6, vnbVar, PorterDuff.Mode.SRC_IN);
        zh8Var.addView(k, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        iye.a(k);
        k.setOnClickListener(new k(textView, (byte) 1));
        in inVar = new in(context, false, true, false);
        this.n = inVar;
        inVar.n = false;
        inVar.setTypeface(hl.o());
        yob.U(inVar, aob.q7, vnbVar);
        inVar.setTextSize(hl.L(14.0f));
        inVar.setGravity(17);
        inVar.setAllowCancel(true);
        inVar.setScaleProperty(0.6f);
        zh8Var.addView(inVar, tre.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new nh6(this, (byte) 17));
        addView(zh8Var, tre.r(-1, -2, 7));
        miaVar.setDelegate(new ym4(this, textView, false, (byte) 28));
    }

    public static void b(final android.content.Context r37, final int r38, final long r39, final org.telegram.tgnet.TLRPC.User r41, final java.lang.String r42, final boolean r43, final boolean r44, boolean r45, final defpackage.vnb r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjb.b(android.content.Context, int, long, org.telegram.tgnet.TLRPC$User, java.lang.String, boolean, boolean, boolean, vnb):void");
    }

    public static void c(Context context, int i, long j, TLRPC.User user, String str, final boolean z, boolean z2, vnb vnbVar) {
        boolean z3;
        int i2;
        String str2;
        String a0;
        boolean z4;
        uc7 s1 = uc7.s1(i);
        s1.M0(Long.valueOf(-j));
        nx0 h = uh9.h(1, vnbVar, context, true);
        LinearLayout j2 = uh9.j(context, 1);
        h.O = j2;
        LinearLayout linearLayout = new LinearLayout(context);
        int i3 = aob.G6;
        TextView b = zze.b(context, 20.0f, i3, true, null);
        b.setText(ob6.M0(2131748381, null));
        linearLayout.addView(b, tre.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        yob.s(imageView, i3, vnbVar, PorterDuff.Mode.SRC_IN);
        int i4 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i4, vnbVar), 1, hl.L(18.0f));
        uob M = yob.M(i4);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar);
        linearLayout.addView(imageView, tre.t(32, 32, 21, 0, 0, 10, 0));
        j2.addView(linearLayout, tre.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final c51 i5 = xnb.i(24, vnbVar, context, true);
        if (TextUtils.isEmpty(str) && !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (TextUtils.isEmpty(str) && !z && z3) {
            i2 = 2131748386;
        } else if (z3) {
            i2 = 2131748387;
        } else {
            i2 = 2131748388;
        }
        i5.setText(ob6.M0(i2, null));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        final boolean z5 = z3;
        sjb sjbVar = new sjb(i, j, vnbVar, context);
        sjbVar.setClipToOutline(true);
        sjbVar.setOutlineProvider(new ViewOutlineProvider());
        yob.h(aob.d6, vnbVar, sjbVar);
        sjbVar.a(user, str, z, z2, new pcc() {
            @Override
            public final void a(Object obj) {
                int i6;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z6 = z5;
                if (isEmpty && !z && z6) {
                    i6 = 2131748386;
                } else if (z6) {
                    i6 = 2131748387;
                } else {
                    i6 = 2131748388;
                }
                i5.i(ob6.M0(i6, null), true, true);
            }
        });
        j2.addView(sjbVar, tre.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        ilb ilbVar = new ilb(22, vnbVar, context);
        if (lbc.D(user)) {
            a0 = ob6.M0(2131748383, null);
        } else {
            a0 = ob6.a0(null, null, 2131748382, lbc.r(user));
        }
        ilbVar.setText(a0);
        j2.addView(ilbVar, tre.t(-1, -2, 7, 0, 0, 0, 0));
        j2.addView(i5, tre.t(-1, 48, 7, 14, 19, 14, 12));
        h.Q0 = true;
        h.t0(aob.a7);
        if (TextUtils.isEmpty(str) && !z && !z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        i5.setOnClickListener(new zf1(i5, sjbVar, s1, j, user, strArr, i, h, z4, vnbVar));
        imageView.setOnClickListener(new rg(h, (byte) 6));
        h.show();
        EditTextBoldCursor textView = sjbVar.h.getTextView();
        textView.post(new l(textView, (byte) 11));
    }

    public final void a(TLRPC.User user, String str, boolean z, boolean z2, pcc pccVar) {
        boolean z3;
        boolean z4;
        int i;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i2 = this.a;
        tL_message.from_id = uc7.s1(i2).y1(user.id);
        uc7 s1 = uc7.s1(i2);
        long j = this.b;
        tL_message.peer_id = s1.y1(j);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i2).getCurrentTime();
        tL_message.out = false;
        this.s = z;
        this.w = z2;
        r47 r47Var = new r47(i2, tL_message, true, false);
        this.r = r47Var;
        r47Var.l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = hl.q;
        spannableStringBuilder.setSpan(new e48((int) Math.min(point.x * 0.5f, hl.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new e48((int) Math.min(point.x * 0.44f, hl.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
        if (M0 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        mia miaVar = this.d;
        miaVar.f6 = z3;
        if (xc2.T(M0) && M0.megagroup) {
            z4 = true;
        } else {
            z4 = false;
        }
        miaVar.k6 = z4;
        this.r.n0(null);
        miaVar.z3(this.r, null, false, false, false, false);
        rb0 rb0Var = this.e;
        rb0Var.q(user);
        this.f.f(user, rb0Var);
        this.x = pccVar;
        this.y = true;
        if (TextUtils.isEmpty(str) && !z) {
            i = 2131748385;
        } else {
            i = 2131748384;
        }
        this.h.o(str, ob6.M0(i, null), false);
        this.y = false;
    }
}
