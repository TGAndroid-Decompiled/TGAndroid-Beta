package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class y9a extends LinearLayout implements vlb {
    public final ylb a;
    public final pc0 b;
    public final bf0 c;
    public final lka d;
    public final TextView e;
    public final ImageView f;
    public final tm h;
    public final tm n;
    public int r;

    public y9a(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        setOrientation(0);
        this.b = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(14.0f));
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        lkaVar.setTextSize(15);
        lkaVar.setTypeface(gm.o());
        anb.W(lkaVar, cmb.F6, ylbVar);
        this.h = new tm(gm.L(24.0f), 7, lkaVar, false);
        this.n = new tm(gm.L(24.0f), 7, lkaVar, false);
        lkaVar.addOnAttachStateChangeListener(new wd(this, (byte) 17));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(gm.L(6.66f), 0, gm.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        anb.X(textView, cmb.Ii, ylbVar);
        int L = gm.L(10.0f);
        int i = cmb.Ei;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        textView.setBackground(b0);
        anb.j(textView, b0, M, null, ylbVar);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131232065);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
        if (jb6.a0) {
            lkaVar.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, qoe.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, qoe.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(lkaVar, qoe.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(bf0Var, qoe.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        lkaVar.setGravity(19);
        addView(bf0Var, qoe.t(28, 28, 19, 18, 0, 18, 0));
        addView(lkaVar, qoe.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, qoe.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, qoe.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.pi));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9a.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        int v0 = cmb.v0(i, ylbVar);
        lka lkaVar = this.d;
        lkaVar.setTextColor(v0);
        TextView textView = this.e;
        cmb.A1(cmb.v0(cmb.Ei, ylbVar), textView.getBackground());
        textView.invalidate();
        int v02 = cmb.v0(cmb.l6, ylbVar);
        int i2 = this.r;
        ImageView imageView = this.f;
        if (v02 != i2 || imageView.getColorFilter() == null) {
            this.r = v02;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        }
        int i3 = cmb.pi;
        this.n.k(Integer.valueOf(cmb.v0(i3, ylbVar)));
        try {
            tm tmVar = this.h;
            if (tmVar != null) {
                tmVar.k(Integer.valueOf(cmb.v0(i3, ylbVar)));
                lkaVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
