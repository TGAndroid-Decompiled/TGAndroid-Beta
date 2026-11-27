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
public final class xwb extends c79 {
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final axb r;

    public xwb(axb axbVar) {
        this.r = axbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.b() >= this.f && f89Var.b() < this.h) {
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
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        int i2 = this.e;
        axb axbVar = this.r;
        if (i >= i2 && i2 > 0) {
            view.setAlpha(axbVar.F);
        } else {
            view.setAlpha(1.0f);
        }
        if (d(i) == 4) {
            bd5 bd5Var = (bd5) view;
            TLRPC.Chat chat = (TLRPC.Chat) axbVar.f.get(i - this.f);
            String str = (String) axbVar.h.get(i - this.f);
            String str2 = chat.title;
            boolean z = true;
            if (i == this.h - 1) {
                z = false;
            }
            bd5Var.e(chat, str2, str, z);
            bd5Var.c(axbVar.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        String M0;
        bd5 bd5Var;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        bd5Var = new bd5(viewGroup.getContext(), 1, 0, false);
                    } else {
                        bd5Var = new t24(viewGroup.getContext(), hl.L(12.0f));
                    }
                } else {
                    mf5 mf5Var = new mf5(viewGroup.getContext(), aob.L6, 21, 8, false, null);
                    mf5Var.setHeight(54);
                    mf5Var.setText(ob6.M0(2131748964, null));
                    bd5Var = mf5Var;
                }
            } else {
                View scaVar = new sca(viewGroup.getContext(), (uh9) null);
                Drawable W0 = aob.W0(viewGroup.getContext(), 2131231232, aob.b7);
                int i2 = aob.a7;
                ColorDrawable colorDrawable = new ColorDrawable(aob.w0(null, i2, false));
                zm2 zm2Var = new zm2(colorDrawable, W0);
                zm2Var.x = true;
                scaVar.setBackground(zm2Var);
                yob.x(scaVar, colorDrawable, i2, null, PorterDuff.Mode.SRC_IN);
                bd5Var = scaVar;
            }
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i3 = aob.m9;
            yob.s(imageView, i3, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            qd4.w(textView, i3, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, tre.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.a = textView2;
            yob.X(textView2, aob.g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, tre.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(hl.L(12.0f));
            textPaint.setTypeface(hl.o());
            gb0 gb0Var = new gb0(context, new Paint(1), textPaint);
            gb0Var.setWillNotDraw(false);
            gb0Var.addView(imageView, tre.e(-2, -2, 1));
            frameLayout.addView(gb0Var, tre.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(ob6.M0(2131743694, null));
            imageView.setImageResource(2131231237);
            axb axbVar = this.r;
            axbVar.y = frameLayout;
            int i4 = axbVar.H;
            if (i4 == 0) {
                M0 = ob6.M0(2131743691, null);
            } else if (i4 == 1) {
                M0 = ob6.M0(2131743692, null);
            } else {
                M0 = ob6.M0(2131743693, null);
            }
            axbVar.y.setMessageText(M0);
            r79 r79Var = new r79(-1, -2);
            ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin = hl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) r79Var).topMargin = hl.L(23.0f);
            axbVar.y.setLayoutParams(r79Var);
            bd5Var = frameLayout;
        }
        return new f89(bd5Var);
    }
}
