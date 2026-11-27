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
public final class oba extends LinearLayout implements snb {
    public final vnb a;
    public final rb0 b;
    public final de0 c;
    public final ema d;
    public final TextView e;
    public final ImageView f;
    public final ul h;
    public final ul n;
    public int r;

    public oba(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        setOrientation(0);
        this.b = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(14.0f));
        ema emaVar = new ema(context);
        this.d = emaVar;
        emaVar.setTextSize(15);
        emaVar.setTypeface(hl.o());
        yob.W(emaVar, aob.G6, vnbVar);
        this.h = new ul(hl.L(24.0f), 7, emaVar, false);
        this.n = new ul(hl.L(24.0f), 7, emaVar, false);
        emaVar.addOnAttachStateChangeListener(new xc(this, (byte) 18));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(hl.L(6.66f), 0, hl.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        yob.X(textView, aob.Ji, vnbVar);
        int L = hl.L(10.0f);
        int i = aob.Fi;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        textView.setBackground(b0);
        yob.j(textView, b0, M, null, vnbVar);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131232064);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.m6, vnbVar, PorterDuff.Mode.SRC_IN);
        if (ob6.a0) {
            emaVar.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, tre.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, tre.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(emaVar, tre.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(de0Var, tre.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        emaVar.setGravity(19);
        addView(de0Var, tre.t(28, 28, 19, 18, 0, 18, 0));
        addView(emaVar, tre.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, tre.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, tre.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.qi));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oba.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i, vnbVar);
        ema emaVar = this.d;
        emaVar.setTextColor(v0);
        TextView textView = this.e;
        aob.A1(aob.v0(aob.Fi, vnbVar), textView.getBackground());
        textView.invalidate();
        int v02 = aob.v0(aob.m6, vnbVar);
        int i2 = this.r;
        ImageView imageView = this.f;
        if (v02 != i2 || imageView.getColorFilter() == null) {
            this.r = v02;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        }
        int i3 = aob.qi;
        this.n.k(Integer.valueOf(aob.v0(i3, vnbVar)));
        try {
            ul ulVar = this.h;
            if (ulVar != null) {
                ulVar.k(Integer.valueOf(aob.v0(i3, vnbVar)));
                emaVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
