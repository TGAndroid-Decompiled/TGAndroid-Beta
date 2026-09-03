package cg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.l81;
import org.telegram.ui.ai;
public final class e0 extends g3 {
    public static final int f2342s = 0;
    public final u f2343b;
    public final ImageView f2344c;
    public final r d;
    public final Path e;
    public int f2345f;
    public q0.a h;
    public y f2346n;
    public boolean f2347r;

    public e0(Context context, f6 f6Var) {
        super(context, f6Var, true, false);
        this.e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f2344c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new n(0, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(j6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new androidx.mediarouter.app.c(this, 1));
        r rVar = new r(this, context);
        this.d = rVar;
        rVar.d = Color.alpha(-65536) / 255.0f;
        rVar.a();
        rVar.invalidate();
        u uVar = new u(context, 0);
        uVar.setOrientation(1);
        x xVar = new x(this, context);
        uVar.f2518b = xVar;
        xVar.a(this.f2345f);
        uVar.f2519c = new w(this, context);
        uVar.d = new d0(this, context);
        l81 l81Var = new l81(context, this.resourcesProvider);
        l81Var.setAdapter(new t(uVar));
        uVar.addView(l81Var, b6.l(1.0f, -1, 0));
        uVar.addView(rVar, b6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, b6.n(28, 28));
        linearLayout2.addView(l81Var.n(8, false), b6.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, b6.n(28, 28));
        uVar.addView(linearLayout2, b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f2343b = uVar;
        linearLayout.addView(uVar, b6.n(-1, 0));
        q qVar = new q(this, context, linearLayout);
        qVar.addView(linearLayout);
        setCustomView(qVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f2345f));
        }
    }

    public final void m(int i10, int i11) {
        boolean z4;
        float c3;
        View findFocus;
        if (!this.f2347r) {
            if (i11 != 2) {
                return;
            }
            this.f2347r = true;
        }
        u uVar = this.f2343b;
        if (i11 != 5 && (findFocus = uVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((x) uVar.f2518b).a(i10);
        }
        if (i11 != 0) {
            w wVar = (w) uVar.f2519c;
            if (i11 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            wVar.f2539n.f2345f = i10;
            float[] fArr = wVar.h;
            Color.colorToHSV(i10, fArr);
            if (z4) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                if (f11 <= 0.5f) {
                    c3 = 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f);
                } else {
                    c3 = ai.c(1.0f, f11, 0.22f, 1.0f);
                }
                wVar.d = f10 - c3;
                wVar.e = fArr[0] / 360.0f;
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
        d0Var.e = true;
        d0Var.f2313a.b();
        d0Var.f2314b.b();
        d0Var.f2315c.b();
        EditTextBoldCursor editTextBoldCursor = d0Var.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb = new StringBuilder(Integer.toHexString(d0Var.f2316f.f2345f));
            while (sb.length() < 8) {
                sb.insert(0, "0");
            }
            editTextBoldCursor.setText(sb.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        d0Var.e = false;
    }

    @Override
    public final void show() {
        if (!this.f2346n.g()) {
            this.f2344c.setVisibility(8);
        }
        super.show();
    }
}
