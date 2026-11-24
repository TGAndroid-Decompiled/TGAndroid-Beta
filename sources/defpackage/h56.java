package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class h56 extends FrameLayout {
    public final xna a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public h56(Context context, ylb ylbVar) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        xna xnaVar = new xna(context);
        this.a = xnaVar;
        xnaVar.setPadding(gm.L(18.0f), gm.L(13.0f), gm.L(50.0f), gm.L(13.0f));
        xnaVar.setTextSize(1, 16.0f);
        xnaVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        xnaVar.setSingleLine(true);
        anb.X(xnaVar, cmb.F6, ylbVar);
        xnaVar.r = false;
        frameLayout.addView(xnaVar, qoe.e(-2, -2, 17));
        int L = gm.L(8.0f);
        int i = cmb.d7;
        int v0 = cmb.v0(i, ylbVar);
        int i2 = cmb.h6;
        int p = on2.p(cmb.v0(i2, ylbVar), 76);
        fg0 i0 = cmb.i0(L, L, L, L, v0, p, p);
        wmb M = anb.M(i);
        wmb g = anb.g(i2, 76);
        frameLayout.setBackground(i0);
        anb.j(frameLayout, i0, M, g, ylbVar);
        addView(frameLayout, qoe.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final h56 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h56 h56Var = this.b;
                switch (b) {
                    case 0:
                        gm.g(h56Var.d);
                        return;
                    default:
                        gm.g(h56Var.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(2131231787);
        anb.s(imageView, cmb.i5, ylbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        int L2 = gm.L(20.0f);
        int p2 = on2.p(cmb.v0(i2, ylbVar), 76);
        imageView.setBackground(cmb.i0(L2, L2, L2, L2, 0, p2, p2));
        addView(imageView, qoe.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final h56 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h56 h56Var = this.b;
                switch (b) {
                    case 0:
                        gm.g(h56Var.d);
                        return;
                    default:
                        gm.g(h56Var.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int L = gm.L(18.0f);
        int L2 = gm.L(14.0f);
        int L3 = gm.L(14.0f);
        int L4 = gm.L(18.0f);
        xna xnaVar = this.a;
        xnaVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new xkb(obj, 0), 0, spannableStringBuilder.length(), 33);
        xnaVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new xl3(runnable, (byte) 4));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = b10.h("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
