package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import lh.j9;
import lh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.ai;
public final class u extends LinearLayout {
    public final int f2517a;
    public Object f2518b;
    public Object f2519c;
    public View d;

    public u(Context context, int i10) {
        super(context);
        this.f2517a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                p9 p9Var = new p9(context);
                this.f2518b = p9Var;
                p9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(p9Var, b6.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f2519c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, b6.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, b6.n(-1, -2));
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f2517a) {
            case 2:
                Path path = (Path) this.f2519c;
                if (((nh.o0) this.d).f15662a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((wa) this.f2518b) == null) {
                        this.f2518b = new wa(1, 250);
                    }
                    ((wa) this.f2518b).f(0, 0, getWidth(), getHeight());
                    wa waVar = (wa) this.f2518b;
                    waVar.h = 30.0f;
                    waVar.d();
                    ((wa) this.f2518b).b(canvas, -1, 0.85f);
                    invalidate();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        switch (this.f2517a) {
            case 3:
                RectF rectF = (RectF) this.f2518b;
                Paint paint = (Paint) this.f2519c;
                jq jqVar = (jq) this.d;
                paint.setColor(j6.v0(j6.f19970i5, jqVar.f26025a0));
                int left = jqVar.B[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.l0 l0Var = jqVar.C;
                if (l0Var.getVisibility() == 0) {
                    f10 = l0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    f10 = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (dp + f10)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    public u(jq jqVar, Context context) {
        super(context);
        this.f2517a = 3;
        this.d = jqVar;
        this.f2518b = new RectF();
        this.f2519c = new Paint(1);
    }

    public u(nh.o0 o0Var, Context context) {
        super(context);
        this.f2517a = 2;
        this.d = o0Var;
        this.f2519c = new Path();
    }

    public u(Context context, int i10, f6 f6Var) {
        super(context);
        this.f2517a = i10;
        switch (i10) {
            case 4:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                qh.c cVar = new qh.c(context, 70, 0);
                frameLayout.addView(cVar, b6.c(-1.0f, -1));
                fg.i iVar = new fg.i(context, 1, 4);
                this.f2518b = iVar;
                fg.a aVar = iVar.f6156b;
                aVar.f6135w = j6.fk;
                aVar.f6136x = j6.gk;
                aVar.b();
                iVar.setStarParticlesView(cVar);
                frameLayout.addView(iVar, b6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                iVar.setPaused(false);
                addView(frameLayout, b6.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f2519c = textView;
                ai.o(20.0f, 1, textView);
                int i11 = j6.f19987j5;
                textView.setTextColor(j6.v0(i11, f6Var));
                textView.setGravity(17);
                addView(textView, b6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(j6.v0(i11, f6Var));
                textView2.setGravity(17);
                addView(textView2, b6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new j9(context, 70, 0), b6.c(-1.0f, -1));
                p9 p9Var = new p9(context);
                this.f2518b = p9Var;
                p9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(p9Var, b6.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, b6.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f2519c = textView3;
                ai.o(20.0f, 1, textView3);
                int i12 = j6.f19987j5;
                textView3.setTextColor(j6.v0(i12, f6Var));
                textView3.setGravity(17);
                addView(textView3, b6.t(-2, -2, 1, 0, 2, 0, 0));
                f90 f90Var = new f90(context, f6Var);
                this.d = f90Var;
                f90Var.setLinkTextColor(j6.v0(j6.f19941gc, f6Var));
                f90Var.setTextSize(1, 14.0f);
                f90Var.setTextColor(j6.v0(i12, f6Var));
                f90Var.setGravity(17);
                addView(f90Var, b6.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}
