package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class h36 extends FrameLayout {
    public final wla a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public h36(Context context, wjb wjbVar) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        wla wlaVar = new wla(context);
        this.a = wlaVar;
        wlaVar.setPadding(gl.L(18.0f), gl.L(13.0f), gl.L(50.0f), gl.L(13.0f));
        wlaVar.setTextSize(1, 16.0f);
        wlaVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        wlaVar.setSingleLine(true);
        zkb.X(wlaVar, bkb.F6, wjbVar);
        wlaVar.r = false;
        frameLayout.addView(wlaVar, nme.e(-2, -2, 17));
        int L = gl.L(8.0f);
        int i = bkb.d7;
        int v0 = bkb.v0(i, wjbVar);
        int i2 = bkb.h6;
        int o = bm2.o(bkb.v0(i2, wjbVar), 76);
        ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
        vkb M = zkb.M(i);
        vkb g = zkb.g(i2, 76);
        frameLayout.setBackground(i0);
        zkb.j(frameLayout, i0, M, g, wjbVar);
        addView(frameLayout, nme.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final h36 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h36 h36Var = this.b;
                switch (b) {
                    case 0:
                        gl.g(h36Var.d);
                        return;
                    default:
                        gl.g(h36Var.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(2131231786);
        zkb.s(imageView, bkb.i5, wjbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        int L2 = gl.L(20.0f);
        int o2 = bm2.o(bkb.v0(i2, wjbVar), 76);
        imageView.setBackground(bkb.i0(L2, L2, L2, L2, 0, o2, o2));
        addView(imageView, nme.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final h36 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h36 h36Var = this.b;
                switch (b) {
                    case 0:
                        gl.g(h36Var.d);
                        return;
                    default:
                        gl.g(h36Var.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int L = gl.L(18.0f);
        int L2 = gl.L(14.0f);
        int L3 = gl.L(14.0f);
        int L4 = gl.L(18.0f);
        wla wlaVar = this.a;
        wlaVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new wib(obj, 0), 0, spannableStringBuilder.length(), 33);
        wlaVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new nk3(runnable, (byte) 4));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = b00.h("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
