package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xub extends q59 {
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final avb r;

    public xub(avb avbVar) {
        this.r = avbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.b() >= this.f && u69Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.e = -1;
        this.f = -1;
        this.h = -1;
        this.n = -1;
        this.c = 2;
        this.d = true;
        ArrayList arrayList = this.r.f;
        if (!arrayList.isEmpty()) {
            int i = this.c;
            int i2 = i + 1;
            this.e = i;
            int i3 = i + 2;
            this.c = i3;
            this.f = i2;
            int size = (arrayList.size() - 1) + i3;
            this.h = size;
            this.c = size + 1;
            this.n = size;
        }
    }

    @Override
    public final int b() {
        return this.c;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == this.d) {
            return 2;
        }
        if (i == this.e) {
            return 3;
        }
        if (i == this.n) {
            return 5;
        }
        return 4;
    }

    @Override
    public final void f() {
        E();
        super.f();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        int i2 = this.e;
        avb avbVar = this.r;
        if (i >= i2 && i2 > 0) {
            view.setAlpha(avbVar.F);
        } else {
            view.setAlpha(1.0f);
        }
        if (d(i) == 4) {
            xc5 xc5Var = (xc5) view;
            TLRPC.Chat chat = (TLRPC.Chat) avbVar.f.get(i - this.f);
            String str = (String) avbVar.h.get(i - this.f);
            String str2 = chat.title;
            boolean z = true;
            if (i == this.h - 1) {
                z = false;
            }
            xc5Var.e(chat, str2, str, z);
            xc5Var.c(avbVar.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        String M0;
        xc5 xc5Var;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        xc5Var = new xc5(viewGroup.getContext(), 1, 0, false);
                    } else {
                        xc5Var = new j34(viewGroup.getContext(), gm.L(12.0f));
                    }
                } else {
                    jf5 jf5Var = new jf5(viewGroup.getContext(), cmb.K6, 21, 8, false, null);
                    jf5Var.setHeight(54);
                    jf5Var.setText(jb6.M0(2131748967, null));
                    xc5Var = jf5Var;
                }
            } else {
                View bbaVar = new bba(viewGroup.getContext(), (hg9) null);
                Drawable W0 = cmb.W0(viewGroup.getContext(), 2131231233, cmb.a7);
                int i2 = cmb.Z6;
                ColorDrawable colorDrawable = new ColorDrawable(cmb.w0(null, i2, false));
                sn2 sn2Var = new sn2(colorDrawable, W0);
                sn2Var.x = true;
                bbaVar.setBackground(sn2Var);
                anb.x(bbaVar, colorDrawable, i2, null, PorterDuff.Mode.SRC_IN);
                xc5Var = bbaVar;
            }
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i3 = cmb.l9;
            anb.s(imageView, i3, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            td4.x(textView, i3, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, qoe.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.a = textView2;
            anb.X(textView2, cmb.f9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, qoe.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(gm.L(12.0f));
            textPaint.setTypeface(gm.o());
            ec0 ec0Var = new ec0(context, new Paint(1), textPaint);
            ec0Var.setWillNotDraw(false);
            ec0Var.addView(imageView, qoe.e(-2, -2, 1));
            frameLayout.addView(ec0Var, qoe.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(jb6.M0(2131743726, null));
            imageView.setImageResource(2131231238);
            avb avbVar = this.r;
            avbVar.y = frameLayout;
            int i4 = avbVar.H;
            if (i4 == 0) {
                M0 = jb6.M0(2131743723, null);
            } else if (i4 == 1) {
                M0 = jb6.M0(2131743724, null);
            } else {
                M0 = jb6.M0(2131743725, null);
            }
            avbVar.y.setMessageText(M0);
            g69 g69Var = new g69(-1, -2);
            ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin = gm.L(16.0f);
            ((ViewGroup.MarginLayoutParams) g69Var).topMargin = gm.L(23.0f);
            avbVar.y.setLayoutParams(g69Var);
            xc5Var = frameLayout;
        }
        return new u69(xc5Var);
    }
}
