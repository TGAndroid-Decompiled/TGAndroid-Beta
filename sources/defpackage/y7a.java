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
public final class y7a extends LinearLayout implements tjb {
    public final wjb a;
    public final pb0 b;
    public final be0 c;
    public final jia d;
    public final TextView e;
    public final ImageView f;
    public final tl h;
    public final tl n;
    public int r;

    public y7a(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        setOrientation(0);
        this.b = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(14.0f));
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        jiaVar.setTextSize(15);
        jiaVar.setTypeface(gl.o());
        zkb.W(jiaVar, bkb.F6, wjbVar);
        this.h = new tl(gl.L(24.0f), 7, jiaVar, false);
        this.n = new tl(gl.L(24.0f), 7, jiaVar, false);
        jiaVar.addOnAttachStateChangeListener(new wc(this, (byte) 17));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(gl.L(6.66f), 0, gl.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        zkb.X(textView, bkb.Ii, wjbVar);
        int L = gl.L(10.0f);
        int i = bkb.Ei;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        textView.setBackground(b0);
        zkb.j(textView, b0, M, null, wjbVar);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131232064);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.l6, wjbVar, PorterDuff.Mode.SRC_IN);
        if (k96.a0) {
            jiaVar.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, nme.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, nme.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(jiaVar, nme.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(be0Var, nme.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        jiaVar.setGravity(19);
        addView(be0Var, nme.t(28, 28, 19, 18, 0, 18, 0));
        addView(jiaVar, nme.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, nme.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, nme.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.pi));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7a.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        int v0 = bkb.v0(i, wjbVar);
        jia jiaVar = this.d;
        jiaVar.setTextColor(v0);
        TextView textView = this.e;
        bkb.A1(bkb.v0(bkb.Ei, wjbVar), textView.getBackground());
        textView.invalidate();
        int v02 = bkb.v0(bkb.l6, wjbVar);
        int i2 = this.r;
        ImageView imageView = this.f;
        if (v02 != i2 || imageView.getColorFilter() == null) {
            this.r = v02;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        }
        int i3 = bkb.pi;
        this.n.k(Integer.valueOf(bkb.v0(i3, wjbVar)));
        try {
            tl tlVar = this.h;
            if (tlVar != null) {
                tlVar.k(Integer.valueOf(bkb.v0(i3, wjbVar)));
                jiaVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
