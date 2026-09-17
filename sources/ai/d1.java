package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.mq;
public final class d1 extends LinearLayout {
    public final int f685a;
    public Object f686b;
    public Object f687c;
    public View d;

    public d1(Context context, int i10) {
        super(context);
        this.f685a = i10;
        switch (i10) {
            case 4:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
                this.f686b = u9Var;
                u9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(u9Var, w7.x5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f687c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, w7.x5.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, w7.x5.n(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f685a) {
            case 0:
                Path path = (Path) this.f687c;
                if (((h1) this.d).f929a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((yh.k8) this.f686b) == null) {
                        this.f686b = new yh.k8(1, 250);
                    }
                    ((yh.k8) this.f686b).f(0, 0, getWidth(), getHeight());
                    yh.k8 k8Var = (yh.k8) this.f686b;
                    k8Var.h = 30.0f;
                    k8Var.d();
                    ((yh.k8) this.f686b).b(canvas, -1, 0.85f);
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
        float f7;
        switch (this.f685a) {
            case 3:
                RectF rectF = (RectF) this.f686b;
                Paint paint = (Paint) this.f687c;
                mq mqVar = (mq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18951i5, mqVar.f26246d0));
                int left = mqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.l0 l0Var = mqVar.F;
                if (l0Var.getVisibility() == 0) {
                    f7 = l0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    f7 = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (dp + f7)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    public d1(mq mqVar, Context context) {
        super(context);
        this.f685a = 3;
        this.d = mqVar;
        this.f686b = new RectF();
        this.f687c = new Paint(1);
    }

    public d1(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f685a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new yh.a7(context, 70, 0), w7.x5.c(-1.0f, -1));
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
                this.f686b = u9Var;
                u9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(u9Var, w7.x5.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout, w7.x5.c(150.0f, -1));
                TextView textView = new TextView(context);
                this.f687c = textView;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.j6.f18969j5;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                textView.setGravity(17);
                addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
                c90 c90Var = new c90(context, f6Var);
                this.d = c90Var;
                c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
                c90Var.setTextSize(1, 14.0f);
                c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                c90Var.setGravity(17);
                addView(c90Var, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                di.d dVar = new di.d(context, 70, 0);
                frameLayout2.addView(dVar, w7.x5.c(-1.0f, -1));
                sg.e eVar = new sg.e(context, 1, 4);
                this.f686b = eVar;
                sg.a aVar = eVar.f42959b;
                aVar.f42947w = org.telegram.ui.ActionBar.j6.fk;
                aVar.f42948x = org.telegram.ui.ActionBar.j6.gk;
                aVar.b();
                eVar.setStarParticlesView(dVar);
                frameLayout2.addView(eVar, w7.x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                eVar.setPaused(false);
                addView(frameLayout2, w7.x5.c(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.f687c = textView2;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView2);
                int i12 = org.telegram.ui.ActionBar.j6.f18969j5;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                textView2.setGravity(17);
                addView(textView2, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.d = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                textView3.setGravity(17);
                addView(textView3, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    public d1(h1 h1Var, Context context) {
        super(context);
        this.f685a = 0;
        this.d = h1Var;
        this.f687c = new Path();
    }
}
