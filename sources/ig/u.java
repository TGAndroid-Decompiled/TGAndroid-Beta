package ig;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.w71;
import w7.b6;
public final class u extends z2 {
    public static final int f8472q1 = 0;
    public final ai.b f8473i1;
    public final ImageView f8474j1;
    public final l f8475k1;
    public final Path l1;
    public int f8476m1;
    public q0.a f8477n1;
    public androidx.activity.o f8478o1;
    public boolean f8479p1;

    public u(Context context, p6 p6Var) {
        super(1, context, p6Var, true);
        this.l1 = new Path();
        P(-14342875);
        Drawable mutate = context.getResources().getDrawable(2131232725).mutate();
        this.f21612r0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f8474j1 = imageView;
        imageView.setImageResource(2131232537);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(t6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ag.t0(4, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231243);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(t6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ag.g(this, 7));
        l lVar = new l(this, context);
        this.f8475k1 = lVar;
        lVar.f8356c = Color.alpha(-65536) / 255.0f;
        lVar.a();
        lVar.invalidate();
        ai.b bVar = new ai.b(context, 1);
        bVar.setOrientation(1);
        q qVar = new q(this, context);
        bVar.f833b = qVar;
        qVar.a(this.f8476m1);
        bVar.f834c = new p(this, context);
        bVar.d = new t(this, context);
        w71 w71Var = new w71(context, this.I0);
        w71Var.setAdapter(new n(bVar, 0));
        bVar.addView(w71Var, b6.l(1.0f, -1, 0));
        bVar.addView(lVar, b6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, b6.o(28, 28));
        linearLayout2.addView(w71Var.n(8, false), b6.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, b6.o(28, 28));
        bVar.addView(linearLayout2, b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f8473i1 = bVar;
        linearLayout.addView(bVar, b6.o(-1, 0));
        k kVar = new k(this, context, linearLayout);
        kVar.addView(linearLayout);
        this.N = kVar;
    }

    public final void I0(int i10, int i11) {
        boolean z10;
        float z11;
        View findFocus;
        if (!this.f8479p1) {
            if (i11 != 2) {
                return;
            }
            this.f8479p1 = true;
        }
        ai.b bVar = this.f8473i1;
        if (i11 != 5 && (findFocus = bVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.i0.v1(findFocus);
        }
        if (i11 != 3) {
            ((q) bVar.f833b).a(i10);
        }
        if (i11 != 0) {
            p pVar = (p) bVar.f834c;
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            pVar.f8388n.f8476m1 = i10;
            float[] fArr = pVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                if (f10 <= 0.5f) {
                    z11 = 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f);
                } else {
                    z11 = sc.e.z(1.0f, f10, 0.22f, 1.0f);
                }
                pVar.d = f7 - z11;
                pVar.e = fArr[0] / 360.0f;
            }
            pVar.invalidate();
        }
        if (i11 != 1) {
            l lVar = this.f8475k1;
            lVar.getClass();
            lVar.f8356c = Color.alpha(i10) / 255.0f;
            lVar.a();
            lVar.invalidate();
        }
        t tVar = (t) bVar.d;
        tVar.e = true;
        tVar.f8460a.b();
        tVar.f8461b.b();
        tVar.f8462c.b();
        EditTextBoldCursor editTextBoldCursor = tVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(tVar.f8463f.f8476m1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        tVar.e = false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.f8477n1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f8476m1));
        }
    }

    @Override
    public final void show() {
        boolean z10;
        androidx.activity.o oVar = this.f8478o1;
        switch (oVar.f952a) {
            case 3:
                if (((Bitmap) oVar.f954c) != null) {
                    z10 = true;
                    break;
                }
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            this.f8474j1.setVisibility(8);
        }
        super.show();
    }
}
