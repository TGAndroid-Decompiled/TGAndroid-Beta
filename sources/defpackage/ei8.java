package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.PremiumPreviewFragment;
public final class ei8 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final n84 d;
    public final t98 e;
    public boolean f;
    public boolean h;
    public final PremiumPreviewFragment n;

    public ei8(PremiumPreviewFragment premiumPreviewFragment, Context context) {
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
        addView(frameLayout, nme.r(i, i, 1));
        boolean z2 = premiumPreviewFragment.i0;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        n84 n84Var = new n84(this, context, z2 ? 1 : 0, i2, context);
        this.d = n84Var;
        frameLayout.addView(n84Var, nme.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        if (z) {
            i3 = 8;
        } else {
            i3 = 20;
        }
        addView(textView, nme.q(-2, -2, 0.0f, 1, 16, i3, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, nme.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        t98 t98Var = new t98(this, context);
        this.e = t98Var;
        t98Var.setOverScrollMode(2);
        t98Var.setLayoutManager(new t26());
        t98Var.setAdapter(new di8(this, context));
        t98Var.setOnItemClickListener(new bf4(this, (byte) 22));
        t98Var.setSelectorTransformer(new su0(this, new Path(), new float[8], (byte) 2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(t98Var, nme.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei8.a():void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei8.b():void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
