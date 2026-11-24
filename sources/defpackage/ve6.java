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
public final class ve6 extends jja {
    public final ImageView a;
    public final u41 b;
    public final q64[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final mf6 w;

    public ve6(mf6 mf6Var, Context context) {
        super(context);
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        wjb wjbVar4;
        this.w = mf6Var;
        this.c = r3;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, gl.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, nme.o(-1, 200));
        ub ubVar = new ub(context, (byte) 4);
        frameLayout.addView(ubVar, nme.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(2131231247);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = bkb.F6;
        wjbVar = ((d) mf6Var).resourceProvider;
        zkb.s(imageView, i, wjbVar, PorterDuff.Mode.SRC_IN);
        int i2 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.w0(null, i2, false), 1, -1);
        vkb M = zkb.M(i2);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, null);
        frameLayout.addView(imageView, nme.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        n84 n84Var = new n84(context, 1, 1, (byte) 2);
        n84Var.setStarParticlesView(ubVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i3 = bkb.Ck;
        canvas.drawColor(bm2.f(0.5f, bkb.w0(null, i3, false), bkb.w0(null, bkb.g5, false)));
        n84Var.setBackgroundBitmap(createBitmap);
        uq4 uq4Var = n84Var.b;
        uq4Var.z = i3;
        uq4Var.A = bkb.Bk;
        uq4Var.b();
        frameLayout.addView(n84Var, nme.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131745774, null));
        tb4.w(textView, i, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, nme.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        wjbVar2 = ((d) mf6Var).resourceProvider;
        q64 q64Var = new q64(1, wjbVar2, context);
        q64Var.a(2131231837, k96.M0(2131745788, null), k96.M0(2131745790, null));
        addView(r3[0], nme.t(-1, -2, 55, 0, 0, 0, 6));
        wjbVar3 = ((d) mf6Var).resourceProvider;
        q64 q64Var2 = new q64(1, wjbVar3, context);
        q64Var2.a(2131231800, k96.M0(2131745786, null), k96.M0(2131745787, null));
        addView(r3[1], nme.t(-1, -2, 55, 0, 0, 0, 6));
        wjbVar4 = ((d) mf6Var).resourceProvider;
        q64 q64Var3 = new q64(1, wjbVar4, context);
        q64[] q64VarArr = {q64Var, q64Var2, q64Var3};
        q64Var3.a(2131231806, gl.E2(gl.N2(k96.M0(2131745781, null), -1, 0, new re6(this, (byte) 1), null), true, gl.L(2.6666667f), gl.L(1.0f)), k96.M0(2131745785, null));
        addView(q64VarArr[2], nme.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), nme.p(0, 0, 1.0f, 119));
        u41 i4 = yjb.i(24, null, context, true);
        this.b = i4;
        i4.setLoading(true);
        addView(i4, nme.t(-1, 48, 7, 0, 16, 0, 16));
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
        String i0 = k96.i0(2131750504, string);
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
        q64[] q64VarArr = this.c;
        if (isEmpty) {
            q64VarArr[0].c.setText(k96.M0(2131745790, null));
            z2 = false;
        } else {
            z2 = false;
            q64VarArr[0].c.setText(k96.a0(null, null, 2131745789, str));
        }
        q64 q64Var = q64VarArr[2];
        if (i == 7) {
            H = k96.M0(2131745785, null);
        } else {
            H = k96.H(',', "SMSFee3TextDays", i);
        }
        q64Var.setSubtitle(H);
        this.a.setOnClickListener(new ee(this, str2, str4, string2, (byte) 12));
        u41 u41Var = this.b;
        u41Var.setEnabled(true);
        u41Var.setOnClickListener(null);
        if (w01.b()) {
            if (!TextUtils.isEmpty(str5) && j > 0) {
                boolean z3 = z2;
                u41Var.setVisibility(z3 ? 1 : 0);
                u41Var.setLoading(z3);
                Object[] objArr = new Object[1];
                objArr[z3 ? 1 : 0] = ci0.h().e(j, str5);
                u41Var.i(k96.a0(null, null, 2131745775, objArr), z3, true);
                if (i == 7) {
                    H2 = k96.M0(2131745779, null);
                } else {
                    H2 = k96.H(',', "SMSFeePurchaseTextDays", i);
                }
                u41Var.g(H2, z3);
                u41Var.setOnClickListener(new qr0(this, str5, j, str6, string2, i));
                return;
            }
            boolean z4 = z2;
            u41Var.setVisibility(z4 ? 1 : 0);
            u41Var.setLoading(z4);
            u41Var.setEnabled(z4);
            u41Var.i(k96.M0(2131743674, null), z4, true);
            return;
        }
        int i2 = z2;
        int i3 = i;
        String str7 = str6;
        if (TextUtils.isEmpty(str3)) {
            u41Var.setVisibility(8);
            return;
        }
        u41Var.setVisibility(i2);
        u41Var.setLoading(true);
        i57 i57Var = new i57(this, str3, str7, string2, i3, (byte) 19);
        if (!ci0.h().j()) {
            ci0.h().i.add(i57Var);
        } else {
            i57Var.run();
        }
    }

    public final void n(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve6.n(java.lang.String, java.lang.String, java.lang.String):void");
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
        this.s = ConnectionsManager.getInstance(i).sendRequest(tL_checkPaidAuth, new n35(this, (byte) 8), 1096);
    }
}
