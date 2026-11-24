package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class wg6 extends kla {
    public final ImageView a;
    public final b61 b;
    public final z74[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final mh6 w;

    public wg6(mh6 mh6Var, Context context) {
        super(context);
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        ylb ylbVar4;
        this.w = mh6Var;
        this.c = r3;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, gm.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, qoe.o(-1, 200));
        ub ubVar = new ub(context, (byte) 4);
        frameLayout.addView(ubVar, qoe.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(2131231248);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = cmb.F6;
        ylbVar = ((d) mh6Var).resourceProvider;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.SRC_IN);
        int i2 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.w0(null, i2, false), 1, -1);
        wmb M = anb.M(i2);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, null);
        frameLayout.addView(imageView, qoe.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        w94 w94Var = new w94(context, 1, 1, (byte) 2);
        w94Var.setStarParticlesView(ubVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i3 = cmb.Ck;
        canvas.drawColor(on2.f(0.5f, cmb.w0(null, i3, false), cmb.w0(null, cmb.g5, false)));
        w94Var.setBackgroundBitmap(createBitmap);
        vs4 vs4Var = w94Var.b;
        vs4Var.z = i3;
        vs4Var.A = cmb.Bk;
        vs4Var.b();
        frameLayout.addView(w94Var, qoe.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131745700, null));
        td4.x(textView, i, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        ylbVar2 = ((d) mh6Var).resourceProvider;
        z74 z74Var = new z74(1, ylbVar2, context);
        z74Var.a(2131231838, jb6.M0(2131745714, null), jb6.M0(2131745716, null));
        addView(r3[0], qoe.t(-1, -2, 55, 0, 0, 0, 6));
        ylbVar3 = ((d) mh6Var).resourceProvider;
        z74 z74Var2 = new z74(1, ylbVar3, context);
        z74Var2.a(2131231801, jb6.M0(2131745712, null), jb6.M0(2131745713, null));
        addView(r3[1], qoe.t(-1, -2, 55, 0, 0, 0, 6));
        ylbVar4 = ((d) mh6Var).resourceProvider;
        z74 z74Var3 = new z74(1, ylbVar4, context);
        z74[] z74VarArr = {z74Var, z74Var2, z74Var3};
        z74Var3.a(2131231807, gm.E2(gm.N2(jb6.M0(2131745707, null), -1, 0, new sg6(this, (byte) 1), null), true, gm.L(2.6666667f), gm.L(1.0f)), jb6.M0(2131745711, null));
        addView(z74VarArr[2], qoe.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), qoe.p(0, 0, 1.0f, 119));
        b61 i4 = mlb.i(24, null, context, true);
        this.b = i4;
        i4.setLoading(true);
        addView(i4, qoe.t(-1, 48, 7, 0, 16, 0, 16));
    }

    @Override
    public final void g() {
        int i;
        if (this.s >= 0) {
            i = ((d) this.w).currentAccount;
            ConnectionsManager.getInstance(i).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        String string;
        String string2;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        String str5;
        String str6;
        boolean z2;
        String H;
        String H2;
        this.d = bundle;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("country");
        }
        String i0 = jb6.i0(2131750453, string);
        if (bundle == null) {
            str = i0;
            str2 = null;
            str4 = null;
            string2 = null;
            str3 = null;
            str6 = null;
            str5 = null;
            i = 0;
            j = 0;
        } else {
            String string3 = bundle.getString("product");
            string2 = bundle.getString("phoneFormated");
            String string4 = bundle.getString("phoneHash");
            String string5 = bundle.getString("support_email_email");
            String string6 = bundle.getString("support_email_subject");
            String string7 = bundle.getString("currency");
            long j2 = bundle.getLong("amount");
            i = bundle.getInt("premium_days");
            str = i0;
            str2 = string5;
            str3 = string3;
            str4 = string6;
            j = j2;
            str5 = string7;
            str6 = string4;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        z74[] z74VarArr = this.c;
        if (isEmpty) {
            z74VarArr[0].c.setText(jb6.M0(2131745716, null));
            z2 = false;
        } else {
            z2 = false;
            z74VarArr[0].c.setText(jb6.a0(null, null, 2131745715, str));
        }
        z74 z74Var = z74VarArr[2];
        if (i == 7) {
            H = jb6.M0(2131745711, null);
        } else {
            H = jb6.H(',', "SMSFee3TextDays", i);
        }
        z74Var.setSubtitle(H);
        this.a.setOnClickListener(new ef(this, str2, str4, string2, (byte) 12));
        b61 b61Var = this.b;
        b61Var.setEnabled(true);
        b61Var.setOnClickListener(null);
        if (e21.b()) {
            if (!TextUtils.isEmpty(str5) && j > 0) {
                boolean z3 = z2;
                b61Var.setVisibility(z3 ? 1 : 0);
                b61Var.setLoading(z3);
                Object[] objArr = new Object[1];
                objArr[z3 ? 1 : 0] = cj0.h().e(j, str5);
                b61Var.i(jb6.a0(null, null, 2131745701, objArr), z3, true);
                if (i == 7) {
                    H2 = jb6.M0(2131745705, null);
                } else {
                    H2 = jb6.H(',', "SMSFeePurchaseTextDays", i);
                }
                b61Var.g(H2, z3);
                b61Var.setOnClickListener(new ys0(this, str5, j, str6, string2, i));
                return;
            }
            boolean z4 = z2;
            b61Var.setVisibility(z4 ? 1 : 0);
            b61Var.setLoading(z4);
            b61Var.setEnabled(z4);
            b61Var.i(jb6.M0(2131743600, null), z4, true);
            return;
        }
        int i2 = z2;
        int i3 = i;
        String str7 = str6;
        if (TextUtils.isEmpty(str3)) {
            b61Var.setVisibility(8);
            return;
        }
        b61Var.setVisibility(i2);
        b61Var.setLoading(true);
        i77 i77Var = new i77(this, str3, str7, string2, i3, (byte) 20);
        if (!cj0.h().j()) {
            cj0.h().i.add(i77Var);
        } else {
            i77Var.run();
        }
    }

    public final void n(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg6.n(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void o() {
        int i;
        if (!this.f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.n;
        i = ((d) this.w).currentAccount;
        this.s = ConnectionsManager.getInstance(i).sendRequest(tL_checkPaidAuth, new r15(this, (byte) 9), 1096);
    }
}
