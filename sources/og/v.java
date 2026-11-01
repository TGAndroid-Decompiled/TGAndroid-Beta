package og;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.a01;
import w7.b6;
public final class v extends FrameLayout {
    public final nh.p f14230a;
    public final FrameLayout f14231b;
    public String f14232c;
    public String d;
    public final ImageView e;

    public v(Context context, p6 p6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14231b = frameLayout;
        nh.p pVar = new nh.p(context);
        this.f14230a = pVar;
        pVar.setPadding(i0.L(18.0f), i0.L(13.0f), i0.L(50.0f), i0.L(13.0f));
        pVar.setTextSize(1, 16.0f);
        pVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        pVar.setSingleLine(true);
        a7.V(pVar, t6.G6, p6Var);
        pVar.f13893r = false;
        frameLayout.addView(pVar, b6.e(-2, -2, 17));
        int L = i0.L(8.0f);
        int i10 = t6.e7;
        int w02 = t6.w0(i10, p6Var);
        int i11 = t6.f21021i6;
        int o10 = i0.b.o(t6.w0(i11, p6Var), 76);
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, w02, o10, o10);
        w6 N = a7.N(i10);
        w6 h = a7.h(i11, 76);
        frameLayout.setBackground(k02);
        a7.k(frameLayout, k02, N, h, p6Var);
        addView(frameLayout, b6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final v f14227b;

            {
                this.f14227b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0.g(this.f14227b.d);
                        return;
                    default:
                        i0.g(this.f14227b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(2131231781);
        a7.t(imageView, t6.f21038j5, p6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(i0.L(8.0f), i0.L(8.0f), i0.L(8.0f), i0.L(8.0f));
        int L2 = i0.L(20.0f);
        int o11 = i0.b.o(t6.w0(i11, p6Var), 76);
        imageView.setBackground(t6.k0(L2, L2, L2, L2, 0, o11, o11));
        addView(imageView, b6.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v f14227b;

            {
                this.f14227b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0.g(this.f14227b.d);
                        return;
                    default:
                        i0.g(this.f14227b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int L = i0.L(18.0f);
        int L2 = i0.L(14.0f);
        int L3 = i0.L(14.0f);
        int L4 = i0.L(18.0f);
        nh.p pVar = this.f14230a;
        pVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.f33282a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f14232c);
        if (this.f14232c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new a01(obj, 0), 0, spannableStringBuilder.length(), 33);
        pVar.setText(spannableStringBuilder);
        this.f14231b.setOnClickListener(new u(0, runnable));
    }

    public void setSlug(String str) {
        this.f14232c = str;
        this.d = sc.e.h("https://t.me/giftcode/", str);
        this.f14230a.setText("t.me/giftcode/" + str);
    }
}
