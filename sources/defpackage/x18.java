package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class x18 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final bf0 d;

    public x18(Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        int i6;
        float f5;
        float f6;
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.getImageReceiver().q0(gm.L(8.0f));
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(bf0Var, qoe.d(100, 100.0f, i, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        int i7 = cmb.F6;
        anb.X(textView, i7, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(gm.o());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2 | 48);
        boolean z = jb6.a0;
        if (z) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i8 = i3 | 48;
        if (z) {
            f = 10.0f;
        } else {
            f = 123.0f;
        }
        if (z) {
            f2 = 123.0f;
        } else {
            f2 = 10.0f;
        }
        addView(textView, qoe.d(-1, -2.0f, i8, f, 9.0f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, i7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView2.setGravity(i4 | 48);
        boolean z2 = jb6.a0;
        if (z2) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        int i9 = i5 | 48;
        if (z2) {
            f3 = 10.0f;
        } else {
            f3 = 123.0f;
        }
        if (z2) {
            f4 = 123.0f;
        } else {
            f4 = 10.0f;
        }
        addView(textView2, qoe.d(-1, -2.0f, i9, f3, 33.0f, f4, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        anb.X(textView3, cmb.y6, null);
        wi8.w(textView3, 1, 14.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        if (jb6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        textView3.setGravity(i6 | 48);
        boolean z3 = jb6.a0;
        int i10 = (z3 ? 5 : 3) | 48;
        if (z3) {
            f5 = 10.0f;
        } else {
            f5 = 123.0f;
        }
        if (z3) {
            f6 = 123.0f;
        } else {
            f6 = 10.0f;
        }
        addView(textView3, qoe.d(-1, -2.0f, i10, f5, 90.0f, f6, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        float f4;
        float f5;
        float f6;
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        TextView textView3 = this.c;
        textView3.setText(str3);
        if (gm.O1()) {
            min = gm.P0();
        } else {
            Point point = gm.q;
            min = Math.min(point.x, point.y);
        }
        float L = 640.0f / (((int) (min * 0.7f)) - gm.L(2.0f));
        int i5 = (int) (640.0f / L);
        int i6 = (int) (360.0f / L);
        bf0 bf0Var = this.d;
        int i7 = 3;
        if (webDocument != null && webDocument.mime_type.startsWith("image/")) {
            boolean z = jb6.a0;
            if (z) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            int i8 = i3 | 48;
            if (z) {
                f = 10.0f;
            } else {
                f = 123.0f;
            }
            if (z) {
                f2 = 123.0f;
            } else {
                f2 = 10.0f;
            }
            textView.setLayoutParams(qoe.d(-1, -2.0f, i8, f, 9.0f, f2, 0.0f));
            boolean z2 = jb6.a0;
            if (z2) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            int i9 = i4 | 48;
            if (z2) {
                f3 = 10.0f;
            } else {
                f3 = 123.0f;
            }
            if (z2) {
                f4 = 123.0f;
            } else {
                f4 = 10.0f;
            }
            textView2.setLayoutParams(qoe.d(-1, -2.0f, i9, f3, 33.0f, f4, 0.0f));
            boolean z3 = jb6.a0;
            if (z3) {
                i7 = 5;
            }
            int i10 = i7 | 48;
            if (z3) {
                f5 = 10.0f;
            } else {
                f5 = 123.0f;
            }
            if (z3) {
                f6 = 123.0f;
            } else {
                f6 = 10.0f;
            }
            textView3.setLayoutParams(qoe.d(-1, -2.0f, i10, f5, 90.0f, f6, 0.0f));
            bf0Var.setVisibility(0);
            Locale locale = Locale.US;
            bf0Var.getImageReceiver().Z(gn5.p(vuc.c(webDocument)), td4.n(i5, i6, "_"), null, null, null, -1L, null, obj, 1);
            return;
        }
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setLayoutParams(qoe.d(-1, -2.0f, i | 48, 17.0f, 9.0f, 17.0f, 0.0f));
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView2.setLayoutParams(qoe.d(-1, -2.0f, i2 | 48, 17.0f, 33.0f, 17.0f, 0.0f));
        if (jb6.a0) {
            i7 = 5;
        }
        textView3.setLayoutParams(qoe.d(-1, -2.0f, i7 | 48, 17.0f, 90.0f, 17.0f, 9.0f));
        bf0Var.setVisibility(8);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        x18 x18Var;
        int i3;
        int i4;
        if (this.d.getVisibility() != 8) {
            i4 = View.MeasureSpec.makeMeasureSpec(gm.L(120.0f), 1073741824);
            x18Var = this;
            i3 = i;
        } else {
            TextView textView = this.b;
            x18Var = this;
            i3 = i;
            x18Var.measureChildWithMargins(textView, i3, 0, i2, 0);
            ((FrameLayout.LayoutParams) x18Var.c.getLayoutParams()).topMargin = gm.L(3.0f) + textView.getMeasuredHeight() + gm.L(33.0f);
            i4 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i4);
    }
}
