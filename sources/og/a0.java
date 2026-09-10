package og;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi.n3;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.v81;
import w7.a6;
public final class a0 extends h3 {
    public static final int f14316s = 0;
    public final ci.h f14317b;
    public final ImageView f14318c;
    public final p d;
    public final Path e;
    public int f14319f;
    public q0.a h;
    public v f14320n;
    public boolean f14321r;

    public a0(Context context, f6 f6Var) {
        super(1, context, f6Var, true);
        this.e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f14318c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new n3(10, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(j6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ai.u(this, 25));
        p pVar = new p(this, context);
        this.d = pVar;
        pVar.d = Color.alpha(-65536) / 255.0f;
        pVar.a();
        pVar.invalidate();
        ci.h hVar = new ci.h(context, 2);
        hVar.setOrientation(1);
        u uVar = new u(this, context);
        hVar.d = uVar;
        uVar.a(this.f14319f);
        hVar.f4707b = new t(this, context);
        hVar.f4708c = new z(this, context);
        v81 v81Var = new v81(context, this.resourcesProvider);
        v81Var.setAdapter(new r(hVar));
        hVar.addView(v81Var, a6.l(1.0f, -1, 0));
        hVar.addView(pVar, a6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, a6.n(28, 28));
        linearLayout2.addView(v81Var.n(8, false), a6.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, a6.n(28, 28));
        hVar.addView(linearLayout2, a6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f14317b = hVar;
        linearLayout.addView(hVar, a6.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f14319f));
        }
    }

    public final void m(int i10, int i11) {
        boolean z10;
        float a2;
        View findFocus;
        if (!this.f14321r) {
            if (i11 != 2) {
                return;
            }
            this.f14321r = true;
        }
        ci.h hVar = this.f14317b;
        if (i11 != 5 && (findFocus = hVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((u) hVar.d).a(i10);
        }
        if (i11 != 0) {
            t tVar = (t) hVar.f4707b;
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tVar.f14484n.f14319f = i10;
            float[] fArr = tVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                if (f10 <= 0.5f) {
                    a2 = 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f);
                } else {
                    a2 = e2.a(1.0f, f10, 0.22f, 1.0f);
                }
                tVar.d = f7 - a2;
                tVar.e = fArr[0] / 360.0f;
            }
            tVar.invalidate();
        }
        if (i11 != 1) {
            p pVar = this.d;
            pVar.getClass();
            pVar.d = Color.alpha(i10) / 255.0f;
            pVar.a();
            pVar.invalidate();
        }
        z zVar = (z) hVar.f4708c;
        zVar.e = true;
        zVar.f14573a.b();
        zVar.f14574b.b();
        zVar.f14575c.b();
        EditTextBoldCursor editTextBoldCursor = zVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(zVar.f14576f.f14319f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        zVar.e = false;
    }

    @Override
    public final void show() {
        if (!this.f14320n.g()) {
            this.f14318c.setVisibility(8);
        }
        super.show();
    }
}
