package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xab {
    public final int a;
    public final uk1 b;
    public final wjb c;
    public final oy8 d;
    public TL_account.TL_birthday e;
    public tgb f;
    public tgb[] g;
    public tgb[] h;
    public boolean i;
    public tgb j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final n41 m;

    public xab(int i, uk1 uk1Var, wjb wjbVar) {
        this.a = i;
        this.b = uk1Var;
        this.c = wjbVar;
        oy8 oy8Var = new oy8(2131623955, gl.L(66.0f), gl.L(66.0f), true, null);
        this.d = oy8Var;
        oy8Var.C(false);
        this.m = new n41(uk1Var);
    }

    public final void a(Canvas canvas) {
        int L = gl.L(66.0f);
        uk1 uk1Var = this.b;
        int width = (uk1Var.getWidth() - L) / 2;
        oy8 oy8Var = this.d;
        oy8Var.setBounds(width, gl.L(13.0f), width + L, gl.L(13.0f) + L);
        oy8Var.draw(canvas);
        this.f.c((uk1Var.getWidth() - this.f.j()) / 2.0f, gl.L(19.0f) + L, 1.0f, -1, canvas);
        int h = (int) (this.f.h() + gl.L(19.0f) + L + gl.L(17.0f));
        int i = 0;
        for (int i2 = 0; i2 < this.g.length; i2++) {
            i = (int) (Math.max(this.g[i2].j(), this.h[i2].j()) + gl.L(9.0f) + gl.L(9.0f) + i);
        }
        int width2 = (uk1Var.getWidth() - i) / 2;
        int i3 = 0;
        while (i3 < this.g.length) {
            float max = Math.max(this.g[i3].j(), this.h[i3].j()) + gl.L(9.0f) + gl.L(9.0f);
            float f = width2;
            float f2 = (max / 2.0f) + f;
            int i4 = (int) (f + max);
            tgb tgbVar = this.g[i3];
            tgbVar.c(f2 - (tgbVar.j() / 2.0f), h, 0.75f, -1, canvas);
            tgb tgbVar2 = this.h[i3];
            tgbVar2.c(f2 - (tgbVar2.j() / 2.0f), gl.L(16.0f) + h, 1.0f, -1, canvas);
            i3++;
            width2 = i4;
        }
        if (this.i) {
            canvas.save();
            float j = this.j.j() + gl.L(26.0f);
            float L2 = gl.L(30.0f);
            float L3 = gl.L(38.0f) + h;
            RectF rectF = this.k;
            rectF.set((uk1Var.getWidth() - j) / 2.0f, L3, (uk1Var.getWidth() + j) / 2.0f, L3 + L2);
            float a = this.m.a(0.1f);
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            float f3 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, this.l);
            this.j.c(gl.L(13.0f) + rectF.left, rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ij.l(this.b.getContext(), k96.M0(2131751660, null), k96.M0(2131751659, null), this.e, new ae9(this, (byte) 19), null, true, false, this.c).M2();
    }

    public final void c(k27 k27Var) {
        int i;
        String valueOf;
        boolean o;
        int i2;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) k27Var.k.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        tgb tgbVar = new tgb(TextUtils.concat(k27Var.v, ":"), 13.0f, null);
        tgbVar.l(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        tgbVar.a();
        tgbVar.o(gl.L(174.0f) - gl.L(32.0f));
        this.f = tgbVar;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i = 3;
        } else {
            i = 2;
        }
        tgb[] tgbVarArr = new tgb[i];
        this.g = tgbVarArr;
        this.h = new tgb[i];
        tgbVarArr[0] = new tgb(k96.M0(2131751662, null), 11.0f, null);
        this.h[0] = new tgb(String.valueOf(tL_messageActionSuggestBirthday.birthday.day), 11.0f, gl.o());
        this.g[1] = new tgb(k96.M0(2131751661, null), 11.0f, null);
        tgb[] tgbVarArr2 = this.h;
        int i3 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {2131748894, 2131750817, 2131748491, 2131754170, 2131748470, 2131748872, 2131748874, 2131753892, 2131745373, 2131747637, 2131747642, 2131751593};
        if (i3 >= 0 && i3 < 12) {
            valueOf = k96.M0(iArr[i3], null);
        } else {
            valueOf = String.valueOf(i3);
        }
        tgbVarArr2[1] = new tgb(valueOf, 11.0f, gl.o());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.g[2] = new tgb(k96.M0(2131751657, null), 11.0f, null);
            this.h[2] = new tgb(String.valueOf(tL_messageActionSuggestBirthday.birthday.year), 11.0f, gl.o());
        }
        this.i = !k27Var.O3();
        wjb wjbVar = this.c;
        if (wjbVar != null) {
            o = wjbVar.a();
        } else {
            o = bkb.I.o();
        }
        if (o) {
            i2 = -1;
        } else {
            i2 = -16777216;
        }
        this.l.setColor(bkb.p1(0.12f, i2));
        this.j = new tgb(k96.M0(2131744154, null), 14.0f, gl.o());
    }
}
