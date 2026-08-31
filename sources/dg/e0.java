package dg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.m81;
import org.telegram.ui.yh;
public final class e0 extends h3 {
    public static final int f4501s = 0;
    public final u f4502b;
    public final ImageView f4503c;
    public final r d;
    public final Path f4504e;
    public int f4505f;
    public q0.a h;
    public y f4506n;
    public boolean f4507r;

    public e0(Context context, g6 g6Var) {
        super(context, g6Var, true, false);
        this.f4504e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f4503c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(k6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new n(0, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(k6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new androidx.mediarouter.app.c(this, 1));
        r rVar = new r(this, context);
        this.d = rVar;
        rVar.d = Color.alpha(-65536) / 255.0f;
        rVar.a();
        rVar.invalidate();
        u uVar = new u(context, 0);
        uVar.setOrientation(1);
        x xVar = new x(this, context);
        uVar.f4679b = xVar;
        xVar.a(this.f4505f);
        uVar.f4680c = new w(this, context);
        uVar.d = new d0(this, context);
        m81 m81Var = new m81(context, this.resourcesProvider);
        m81Var.setAdapter(new t(uVar));
        uVar.addView(m81Var, c6.l(1.0f, -1, 0));
        uVar.addView(rVar, c6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, c6.n(28, 28));
        linearLayout2.addView(m81Var.n(8, false), c6.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, c6.n(28, 28));
        uVar.addView(linearLayout2, c6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f4502b = uVar;
        linearLayout.addView(uVar, c6.n(-1, 0));
        q qVar = new q(this, context, linearLayout);
        qVar.addView(linearLayout);
        setCustomView(qVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f4505f));
        }
    }

    public final void m(int i10, int i11) {
        boolean z4;
        float c3;
        View findFocus;
        if (!this.f4507r) {
            if (i11 != 2) {
                return;
            }
            this.f4507r = true;
        }
        u uVar = this.f4502b;
        if (i11 != 5 && (findFocus = uVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((x) uVar.f4679b).a(i10);
        }
        if (i11 != 0) {
            w wVar = (w) uVar.f4680c;
            if (i11 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            wVar.f4701n.f4505f = i10;
            float[] fArr = wVar.h;
            Color.colorToHSV(i10, fArr);
            if (z4) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                if (f11 <= 0.5f) {
                    c3 = 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f);
                } else {
                    c3 = yh.c(1.0f, f11, 0.22f, 1.0f);
                }
                wVar.d = f10 - c3;
                wVar.f4699e = fArr[0] / 360.0f;
            }
            wVar.invalidate();
        }
        if (i11 != 1) {
            r rVar = this.d;
            rVar.getClass();
            rVar.d = Color.alpha(i10) / 255.0f;
            rVar.a();
            rVar.invalidate();
        }
        d0 d0Var = (d0) uVar.d;
        d0Var.f4481e = true;
        d0Var.f4478a.b();
        d0Var.f4479b.b();
        d0Var.f4480c.b();
        EditTextBoldCursor editTextBoldCursor = d0Var.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb = new StringBuilder(Integer.toHexString(d0Var.f4482f.f4505f));
            while (sb.length() < 8) {
                sb.insert(0, "0");
            }
            editTextBoldCursor.setText(sb.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        d0Var.f4481e = false;
    }

    @Override
    public final void show() {
        if (!this.f4506n.g()) {
            this.f4503c.setVisibility(8);
        }
        super.show();
    }
}
