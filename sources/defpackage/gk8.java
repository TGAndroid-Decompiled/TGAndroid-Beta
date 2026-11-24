package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.PremiumPreviewFragment;
public final class gk8 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final w94 d;
    public final ub8 e;
    public boolean f;
    public boolean h;
    public final PremiumPreviewFragment n;

    public gk8(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        boolean z = premiumPreviewFragment.h0;
        if (z) {
            i = 175;
        } else {
            i = 190;
        }
        addView(frameLayout, qoe.r(i, i, 1));
        boolean z2 = premiumPreviewFragment.i0;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        w94 w94Var = new w94(this, context, z2 ? 1 : 0, i2, context);
        this.d = w94Var;
        frameLayout.addView(w94Var, qoe.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        if (z) {
            i3 = 8;
        } else {
            i3 = 20;
        }
        addView(textView, qoe.q(-2, -2, 0.0f, 1, 16, i3, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, qoe.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        ub8 ub8Var = new ub8(this, context);
        this.e = ub8Var;
        ub8Var.setOverScrollMode(2);
        ub8Var.setLayoutManager(new u46());
        ub8Var.setAdapter(new fk8(this, context));
        ub8Var.setOnItemClickListener(new kg4(this, (byte) 23));
        ub8Var.setSelectorTransformer(new cw0(this, new Path(), new float[8], (byte) 2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(ub8Var, qoe.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk8.a():void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk8.b():void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
