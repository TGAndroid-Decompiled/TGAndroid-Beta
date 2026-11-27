package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class k56 extends FrameLayout {
    public final tpa a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public k56(Context context, vnb vnbVar) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        tpa tpaVar = new tpa(context);
        this.a = tpaVar;
        tpaVar.setPadding(hl.L(18.0f), hl.L(13.0f), hl.L(50.0f), hl.L(13.0f));
        tpaVar.setTextSize(1, 16.0f);
        tpaVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        tpaVar.setSingleLine(true);
        yob.X(tpaVar, aob.G6, vnbVar);
        tpaVar.r = false;
        frameLayout.addView(tpaVar, tre.e(-2, -2, 17));
        int L = hl.L(8.0f);
        int i = aob.e7;
        int v0 = aob.v0(i, vnbVar);
        int i2 = aob.i6;
        int o = vm2.o(aob.v0(i2, vnbVar), 76);
        hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
        uob M = yob.M(i);
        uob g = yob.g(i2, 76);
        frameLayout.setBackground(i0);
        yob.j(frameLayout, i0, M, g, vnbVar);
        addView(frameLayout, tre.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final k56 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                k56 k56Var = this.b;
                switch (b) {
                    case 0:
                        hl.g(k56Var.d);
                        return;
                    default:
                        hl.g(k56Var.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(2131231786);
        yob.s(imageView, aob.j5, vnbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        int L2 = hl.L(20.0f);
        int o2 = vm2.o(aob.v0(i2, vnbVar), 76);
        imageView.setBackground(aob.i0(L2, L2, L2, L2, 0, o2, o2));
        addView(imageView, tre.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k56 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                k56 k56Var = this.b;
                switch (b) {
                    case 0:
                        hl.g(k56Var.d);
                        return;
                    default:
                        hl.g(k56Var.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int L = hl.L(18.0f);
        int L2 = hl.L(14.0f);
        int L3 = hl.L(14.0f);
        int L4 = hl.L(18.0f);
        tpa tpaVar = this.a;
        tpaVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new smb(obj, 0), 0, spannableStringBuilder.length(), 33);
        tpaVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new el3(runnable, (byte) 4));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = c00.i("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
