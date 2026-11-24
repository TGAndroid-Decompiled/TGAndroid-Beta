package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cj1 {
    public final gb2 a;
    public final pb0[] b;
    public final ImageReceiver[] c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f;
    public final boolean g;
    public final Drawable h;
    public final Paint i;
    public final Paint j;
    public final tgb k;
    public boolean l;
    public boolean m;
    public final n41 n;
    public final TLObject o;

    public cj1(gb2 gb2Var, TLObject[] tLObjectArr, int i) {
        int i2;
        Drawable mutate;
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = gb2Var;
        this.o = tLObjectArr[0];
        this.n = new bj1(gb2Var, gb2Var, (byte) 0);
        this.c = new ImageReceiver[3];
        this.b = new pb0[3];
        for (int i3 = 0; i3 < 3; i3++) {
            this.c[i3] = new ImageReceiver(gb2Var);
            this.c[i3].p0(gb2Var);
            this.c[i3].q0(gl.L(54.0f));
            this.b[i3] = new pb0((wjb) null);
            if (i3 < tLObjectArr.length && (tLObject = tLObjectArr[i3]) != null) {
                this.b[i3].o(tLObject);
                this.c[i3].U(tLObjectArr[i3], this.b[i3], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {bkb.v(bkb.v0(bkb.qa, gb2Var.cc), bkb.p1(0.5f, bkb.v0(bkb.x6, gb2Var.cc)))};
                paint.setColor(iArr[0]);
                this.c[i3].g0(new gc(gb2Var, iArr, paint));
            }
        }
        if (gb2Var.O0) {
            a();
        }
        this.d.setTextSize(gl.L(11.0f));
        boolean p = y6c.h(gb2Var.a6).p();
        if (p) {
            i2 = 2131748138;
        } else {
            i2 = 2131743615;
        }
        this.e = k96.M0(i2, null);
        this.i.setStyle(Paint.Style.STROKE);
        this.g = true;
        if (p) {
            mutate = null;
        } else {
            mutate = gb2Var.getContext().getResources().getDrawable(2131231980).mutate();
        }
        this.h = mutate;
        if (b(this.o) == null) {
            this.k = null;
        } else {
            this.k = new tgb(de9.k(i, "+"), 9.33f, gl.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i;
        if (tLObject instanceof TLRPC.Chat) {
            int i2 = ((TLRPC.Chat) tLObject).participants_count;
            if (i2 > 1) {
                return k96.S(null, i2);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return k96.S(null, i);
        }
        return null;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.c;
            if (i < imageReceiverArr.length) {
                imageReceiverArr[i].I();
                i++;
            } else {
                return;
            }
        }
    }

    public cj1(gb2 gb2Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.i = new Paint(1);
        this.j = new Paint(1);
        new Paint(1);
        this.a = gb2Var;
        this.o = tLObject;
        this.n = new bj1(gb2Var, gb2Var, (byte) 1);
        this.c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(gb2Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.p0(gb2Var);
        imageReceiverArr[0].q0(gl.L(54.0f));
        if (gb2Var.O0) {
            a();
        }
        this.b = r1;
        pb0 pb0Var = new pb0((wjb) null);
        pb0[] pb0VarArr = {pb0Var};
        pb0Var.o(tLObject);
        imageReceiverArr[0].U(tLObject, pb0VarArr[0], null);
        textPaint.setTextSize(gl.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = l7c.q((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = vu3.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.e = charSequence;
        this.i.setStyle(Paint.Style.STROKE);
        this.g = false;
        this.h = gb2Var.getContext().getResources().getDrawable(2131231974).mutate();
        if (b(tLObject) == null) {
            this.k = null;
        } else {
            this.k = new tgb(b(tLObject), 9.33f, gl.o());
        }
    }
}
