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
import org.telegram.ui.ActionBar.e;
public final class zg6 extends cna {
    public final ImageView a;
    public final c51 b;
    public final k74[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final qh6 w;

    public zg6(qh6 qh6Var, Context context) {
        super(context);
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        vnb vnbVar4;
        this.w = qh6Var;
        this.c = r3;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, hl.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, tre.o(-1, 200));
        vb vbVar = new vb(context, (byte) 4);
        frameLayout.addView(vbVar, tre.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(2131231247);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = aob.G6;
        vnbVar = ((e) qh6Var).resourceProvider;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.SRC_IN);
        int i2 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i2, false), 1, -1);
        uob M = yob.M(i2);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        frameLayout.addView(imageView, tre.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        i94 i94Var = new i94(context, 1, 1, (byte) 2);
        i94Var.setStarParticlesView(vbVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i3 = aob.Dk;
        canvas.drawColor(vm2.f(0.5f, aob.w0(null, i3, false), aob.w0(null, aob.h5, false)));
        i94Var.setBackgroundBitmap(createBitmap);
        ys4 ys4Var = i94Var.b;
        ys4Var.z = i3;
        ys4Var.A = aob.Ck;
        ys4Var.b();
        frameLayout.addView(i94Var, tre.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131745694, null));
        qd4.w(textView, i, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, tre.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        vnbVar2 = ((e) qh6Var).resourceProvider;
        k74 k74Var = new k74(1, vnbVar2, context);
        k74Var.a(2131231837, ob6.M0(2131745708, null), ob6.M0(2131745710, null));
        addView(r3[0], tre.t(-1, -2, 55, 0, 0, 0, 6));
        vnbVar3 = ((e) qh6Var).resourceProvider;
        k74 k74Var2 = new k74(1, vnbVar3, context);
        k74Var2.a(2131231800, ob6.M0(2131745706, null), ob6.M0(2131745707, null));
        addView(r3[1], tre.t(-1, -2, 55, 0, 0, 0, 6));
        vnbVar4 = ((e) qh6Var).resourceProvider;
        k74 k74Var3 = new k74(1, vnbVar4, context);
        k74[] k74VarArr = {k74Var, k74Var2, k74Var3};
        k74Var3.a(2131231806, hl.E2(hl.N2(ob6.M0(2131745701, null), -1, 0, new ug6(this, (byte) 1), null), true, hl.L(2.6666667f), hl.L(1.0f)), ob6.M0(2131745705, null));
        addView(k74VarArr[2], tre.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), tre.p(0, 0, 1.0f, 119));
        c51 i4 = xnb.i(24, null, context, true);
        this.b = i4;
        i4.setLoading(true);
        addView(i4, tre.t(-1, 48, 7, 0, 16, 0, 16));
    }

    @Override
    public final void g() {
        int i;
        if (this.s >= 0) {
            i = ((e) this.w).currentAccount;
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
        String i0 = ob6.i0(2131750481, string);
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
        k74[] k74VarArr = this.c;
        if (isEmpty) {
            k74VarArr[0].c.setText(ob6.M0(2131745710, null));
            z2 = false;
        } else {
            z2 = false;
            k74VarArr[0].c.setText(ob6.a0(null, null, 2131745709, str));
        }
        k74 k74Var = k74VarArr[2];
        if (i == 7) {
            H = ob6.M0(2131745705, null);
        } else {
            H = ob6.H(',', "SMSFee3TextDays", i);
        }
        k74Var.setSubtitle(H);
        this.a.setOnClickListener(new cg(this, str2, str4, string2, (byte) 12));
        c51 c51Var = this.b;
        c51Var.setEnabled(true);
        c51Var.setOnClickListener(null);
        if (f11.b()) {
            if (!TextUtils.isEmpty(str5) && j > 0) {
                boolean z3 = z2;
                c51Var.setVisibility(z3 ? 1 : 0);
                c51Var.setLoading(z3);
                Object[] objArr = new Object[1];
                objArr[z3 ? 1 : 0] = di0.h().e(j, str5);
                c51Var.i(ob6.a0(null, null, 2131745695, objArr), z3, true);
                if (i == 7) {
                    H2 = ob6.M0(2131745699, null);
                } else {
                    H2 = ob6.H(',', "SMSFeePurchaseTextDays", i);
                }
                c51Var.g(H2, z3);
                c51Var.setOnClickListener(new yr0(this, str5, j, str6, string2, i));
                return;
            }
            boolean z4 = z2;
            c51Var.setVisibility(z4 ? 1 : 0);
            c51Var.setLoading(z4);
            c51Var.setEnabled(z4);
            c51Var.i(ob6.M0(2131743568, null), z4, true);
            return;
        }
        int i2 = z2;
        int i3 = i;
        String str7 = str6;
        if (TextUtils.isEmpty(str3)) {
            c51Var.setVisibility(8);
            return;
        }
        c51Var.setVisibility(i2);
        c51Var.setLoading(true);
        l77 l77Var = new l77(this, str3, str7, string2, i3, (byte) 20);
        if (!di0.h().j()) {
            di0.h().i.add(l77Var);
        } else {
            l77Var.run();
        }
    }

    public final void n(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg6.n(java.lang.String, java.lang.String, java.lang.String):void");
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
        i = ((e) this.w).currentAccount;
        this.s = ConnectionsManager.getInstance(i).sendRequest(tL_checkPaidAuth, new w15(this, (byte) 9), 1096);
    }
}
