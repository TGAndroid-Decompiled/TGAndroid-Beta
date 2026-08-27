package hh;

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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.p80;

public final class w9 extends LinearLayout {

    public final int f10304a;

    public Object f10305b;

    public Object f10306c;
    public View d;

    public w9(Context context, int i10) {
        super(context);
        this.f10304a = i10;
        switch (i10) {
            case 5:
                super(context);
                break;
            default:
                setOrientation(1);
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                this.f10305b = n9Var;
                n9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(n9Var, h7.z5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.f10306c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, h7.z5.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, h7.z5.n(-1, -2));
                break;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10304a) {
            case 1:
                Path path = (Path) this.f10306c;
                if (((jh.n0) this.d).f13674a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((bb) this.f10305b) == null) {
                        this.f10305b = new bb(1, 250);
                    }
                    ((bb) this.f10305b).f(0, 0, getWidth(), getHeight());
                    bb bbVar = (bb) this.f10305b;
                    bbVar.h = 30.0f;
                    bbVar.d();
                    ((bb) this.f10305b).b(canvas, -1, 0.85f);
                    invalidate();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float alpha;
        switch (this.f10304a) {
            case 3:
                RectF rectF = (RectF) this.f10305b;
                Paint paint = (Paint) this.f10306c;
                aq aqVar = (aq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23143i5, aqVar.W));
                int left = aqVar.A[0].getLeft() - AndroidUtilities.dp(13.0f);
                float fDp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.l0 l0Var = aqVar.B;
                if (l0Var.getVisibility() == 0) {
                    alpha = l0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    alpha = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (fDp + alpha)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    public w9(aq aqVar, Context context) {
        super(context);
        this.f10304a = 3;
        this.d = aqVar;
        this.f10305b = new RectF();
        this.f10306c = new Paint(1);
    }

    public w9(jh.n0 n0Var, Context context) {
        super(context);
        this.f10304a = 1;
        this.d = n0Var;
        this.f10306c = new Path();
    }

    public w9(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f10304a = i10;
        switch (i10) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                mh.c cVar = new mh.c(context, 70, 0);
                frameLayout.addView(cVar, h7.z5.c(-1.0f, -1));
                bg.i iVar = new bg.i(context, 1, 4);
                this.f10305b = iVar;
                bg.a aVar = iVar.f2129b;
                aVar.f2107w = org.telegram.ui.ActionBar.g6.fk;
                aVar.f2108x = org.telegram.ui.ActionBar.g6.gk;
                aVar.b();
                iVar.setStarParticlesView(cVar);
                frameLayout.addView(iVar, h7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                iVar.setPaused(false);
                addView(frameLayout, h7.z5.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f10306c = textView;
                org.telegram.ui.Cells.pa.m(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
                textView.setGravity(17);
                addView(textView, h7.z5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
                textView2.setGravity(17);
                addView(textView2, h7.z5.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new m9(context, 70, 0), h7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                this.f10305b = n9Var;
                n9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(n9Var, h7.z5.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, h7.z5.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f10306c = textView3;
                org.telegram.ui.Cells.pa.m(20.0f, 1, textView3);
                int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                textView3.setGravity(17);
                addView(textView3, h7.z5.t(-2, -2, 1, 0, 2, 0, 0));
                p80 p80Var = new p80(context, c6Var);
                this.d = p80Var;
                p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                p80Var.setTextSize(1, 14.0f);
                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                p80Var.setGravity(17);
                addView(p80Var, h7.z5.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
