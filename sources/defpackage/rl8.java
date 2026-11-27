package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.PremiumPreviewFragment;
public final class rl8 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final i94 d;
    public final jd8 e;
    public boolean f;
    public boolean h;
    public final PremiumPreviewFragment n;

    public rl8(PremiumPreviewFragment premiumPreviewFragment, Context context) {
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
        addView(frameLayout, tre.r(i, i, 1));
        boolean z2 = premiumPreviewFragment.i0;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        i94 i94Var = new i94(this, context, z2 ? 1 : 0, i2, context);
        this.d = i94Var;
        frameLayout.addView(i94Var, tre.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        if (z) {
            i3 = 8;
        } else {
            i3 = 20;
        }
        addView(textView, tre.q(-2, -2, 0.0f, 1, 16, i3, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, tre.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        jd8 jd8Var = new jd8(this, context);
        this.e = jd8Var;
        jd8Var.setOverScrollMode(2);
        jd8Var.setLayoutManager(new x46());
        jd8Var.setAdapter(new ql8(this, context));
        jd8Var.setOnItemClickListener(new zg4(this, (byte) 22));
        jd8Var.setSelectorTransformer(new cv0(this, new Path(), new float[8], (byte) 2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(jd8Var, tre.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl8.a():void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl8.b():void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
