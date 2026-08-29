package ig;

import ag.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import i7.h6;
import jh.i9;
import jh.x9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.th;
public final class a extends LinearLayout {
    public final int f8963a = 2;
    public final Object f8964b;
    public final View f8965c;
    public final Object d;
    public final Object f8966e;

    public a(Context context, c6 c6Var, jl0 jl0Var) {
        super(context);
        this.d = new Paint(1);
        this.f8966e = new d6(this);
        this.f8964b = c6Var;
        this.f8965c = jl0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f8963a) {
            case 0:
                d6 d6Var = (d6) this.f8966e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(g6.v0(g6.f23009a7, (c6) this.f8964b));
                jl0 jl0Var = (jl0) this.f8965c;
                float f9 = 1.0f;
                if (jl0Var != null) {
                    if (!jl0Var.canScrollVertically(1)) {
                        f9 = 0.0f;
                    }
                    paint.setAlpha((int) (d6Var.d(f9, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (d6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public a(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, f6.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f8964b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, f6.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        y80 y80Var = new y80(context, null);
        this.f8965c = y80Var;
        y80Var.setTextSize(1, 14.0f);
        y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y80Var.setGravity(1);
        addView(y80Var, f6.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f8966e = frameLayout2;
        addView(frameLayout2, f6.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, int i10, c6 c6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        i9 i9Var = new i9(context, 70, 0);
        frameLayout.addView(i9Var, f6.c(-1.0f, -1));
        dg.i iVar = new dg.i(context, 1, 2);
        this.f8964b = iVar;
        dg.a aVar = iVar.f5590b;
        aVar.f5568w = g6.fk;
        aVar.f5569x = g6.gk;
        aVar.b();
        iVar.setStarParticlesView(i9Var);
        frameLayout.addView(iVar, f6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        x9 x9Var = new x9(context, i10, c6Var);
        this.f8965c = x9Var;
        h6.a(x9Var);
        x9Var.setOnClickListener(new o(this, 23));
        frameLayout.addView(x9Var, f6.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, f6.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        th.n(20.0f, 1, textView);
        int i11 = g6.f23169j5;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setGravity(17);
        addView(textView, f6.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f8966e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.v0(i11, c6Var));
        textView2.setGravity(17);
        addView(textView2, f6.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
