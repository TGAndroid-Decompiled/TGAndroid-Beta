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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.nq;
public final class d1 extends LinearLayout {
    public final int f691a;
    public Object f692b;
    public Object f693c;
    public View d;

    public d1(Context context, int i10) {
        super(context);
        this.f691a = i10;
        switch (i10) {
            case 4:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.f692b = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(w9Var, w7.x5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f693c = textView;
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
        switch (this.f691a) {
            case 0:
                Path path = (Path) this.f693c;
                if (((h1) this.d).f927a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((yh.i8) this.f692b) == null) {
                        this.f692b = new yh.i8(1, 250);
                    }
                    ((yh.i8) this.f692b).f(0, 0, getWidth(), getHeight());
                    yh.i8 i8Var = (yh.i8) this.f692b;
                    i8Var.h = 30.0f;
                    i8Var.d();
                    ((yh.i8) this.f692b).b(canvas, -1, 0.85f);
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
        switch (this.f691a) {
            case 3:
                RectF rectF = (RectF) this.f692b;
                Paint paint = (Paint) this.f693c;
                nq nqVar = (nq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18877i5, nqVar.f26484d0));
                int left = nqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.k0 k0Var = nqVar.F;
                if (k0Var.getVisibility() == 0) {
                    f7 = k0Var.getAlpha() * AndroidUtilities.dp(25.0f);
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

    public d1(nq nqVar, Context context) {
        super(context);
        this.f691a = 3;
        this.d = nqVar;
        this.f692b = new RectF();
        this.f693c = new Paint(1);
    }

    public d1(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f691a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new yh.y6(context, 70, 0), w7.x5.c(-1.0f, -1));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.f692b = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(w9Var, w7.x5.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout, w7.x5.c(150.0f, -1));
                TextView textView = new TextView(context);
                this.f693c = textView;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.h6.f18895j5;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
                textView.setGravity(17);
                addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
                d90 d90Var = new d90(context, d6Var);
                this.d = d90Var;
                d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
                d90Var.setTextSize(1, 14.0f);
                d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
                d90Var.setGravity(17);
                addView(d90Var, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                di.d dVar = new di.d(context, 70, 0);
                frameLayout2.addView(dVar, w7.x5.c(-1.0f, -1));
                sg.e eVar = new sg.e(context, 1, 4);
                this.f692b = eVar;
                sg.a aVar = eVar.f42889b;
                aVar.f42877w = org.telegram.ui.ActionBar.h6.fk;
                aVar.f42878x = org.telegram.ui.ActionBar.h6.gk;
                aVar.b();
                eVar.setStarParticlesView(dVar);
                frameLayout2.addView(eVar, w7.x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                eVar.setPaused(false);
                addView(frameLayout2, w7.x5.c(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.f693c = textView2;
                com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView2);
                int i12 = org.telegram.ui.ActionBar.h6.f18895j5;
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
                textView2.setGravity(17);
                addView(textView2, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.d = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
                textView3.setGravity(17);
                addView(textView3, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    public d1(h1 h1Var, Context context) {
        super(context);
        this.f691a = 0;
        this.d = h1Var;
        this.f693c = new Path();
    }
}
