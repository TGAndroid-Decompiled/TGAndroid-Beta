package gg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import cg.r2;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.y80;
public final class s extends FrameLayout {
    public final cg.i f7332a;
    public final p f7333b;
    public final TextView f7334c;
    public final y80 d;
    public final c6 f7335e;
    public final v80 f7336f;
    public final Paint[] h;
    public ValueAnimator f7337n;

    public s(Context context, c6 c6Var) {
        super(context);
        this.f7335e = c6Var;
        LinearLayout g10 = x3.g(context, 1);
        cg.i iVar = new cg.i(context, 1, 0, 2);
        this.f7332a = iVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = g6.Mj;
        canvas.drawColor(i0.a.d(0.5f, g6.v0(i10, c6Var), g6.v0(g6.f23133h5, c6Var)));
        iVar.setBackgroundBitmap(createBitmap);
        dg.a aVar = iVar.f5590b;
        aVar.f5568w = i10;
        aVar.f5569x = g6.Lj;
        aVar.b();
        g10.addView(iVar, f6.q(160, 160, 1));
        p pVar = new p(this, context);
        this.f7333b = pVar;
        this.h = new Paint[20];
        a(0.0f);
        r2 r2Var = pVar.f3367a;
        r2Var.f3344q = false;
        r2Var.K = false;
        r2Var.L = true;
        r2Var.H = true;
        r2Var.f3339l = new bg.b0(this, 1);
        r2Var.c();
        iVar.setStarParticlesView(pVar);
        TextView textView = new TextView(context);
        this.f7334c = textView;
        org.telegram.ui.b.g(22.0f, 1, textView);
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setGravity(1);
        g10.addView(textView, f6.t(-2, -2, 1, 24, -8, 24, 0));
        v80 v80Var = new v80(this);
        this.f7336f = v80Var;
        y80 y80Var = new y80(context, v80Var, c6Var);
        this.d = y80Var;
        y80Var.setTextSize(1, 15.0f);
        y80Var.setGravity(17);
        y80Var.setTextColor(g6.v0(i11, c6Var));
        y80Var.setMovementMethod(LinkMovementMethod.getInstance());
        y80Var.setLinkTextColor(g6.v0(g6.J6, c6Var));
        y80Var.setImportantForAccessibility(2);
        g10.addView(y80Var, f6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(pVar, f6.e(-1, 234, 48));
        addView(g10);
        setWillNotDraw(false);
    }

    public final void a(float f9) {
        int i10 = g6.Lj;
        c6 c6Var = this.f7335e;
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.Mj, c6Var);
        int d = i0.a.d(f9, v02, -371690);
        int d10 = i0.a.d(f9, v03, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 < paintArr.length) {
                paintArr[i11] = new Paint(1);
                paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.a.d(i11 / (paintArr.length - 1), d, d10), PorterDuff.Mode.SRC_IN));
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v80 v80Var = this.f7336f;
        if (v80Var != null) {
            canvas.save();
            y80 y80Var = this.d;
            canvas.translate(y80Var.getLeft(), y80Var.getTop());
            if (v80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        cg.i iVar = this.f7332a;
        float measuredHeight = (iVar.getMeasuredHeight() / 2.0f) + iVar.getTop();
        p pVar = this.f7333b;
        pVar.setTranslationY(measuredHeight - (pVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = g6.f23009a7;
        c6 c6Var = this.f7335e;
        setBackgroundColor(g6.v0(i11, c6Var));
        this.f7334c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        y80 y80Var = this.d;
        y80Var.setText(formatString);
        y80Var.setTextColor(g6.v0(g6.f23310r5, c6Var));
    }

    public void setPaused(boolean z10) {
        this.f7332a.setPaused(z10);
        this.f7333b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f9;
        ValueAnimator valueAnimator = this.f7337n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        cg.i iVar = this.f7332a;
        final float f10 = iVar.f5590b.f5555i;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f7337n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(iVar.Q);
        iVar.d();
        iVar.i();
        this.f7337n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                s sVar = s.this;
                cg.i iVar2 = sVar.f7332a;
                iVar2.f5590b.f5555i = AndroidUtilities.lerp(f10, f9, floatValue);
                dg.a aVar = iVar2.f5590b;
                float f12 = aVar.f5553f;
                float f13 = f11 * 360.0f;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f5553f = (f13 * i10) + f12;
                aVar.b();
                sVar.a(iVar2.f5590b.f5555i);
            }
        });
        this.f7337n.addListener(new r(this, fArr, f10, f9, z10));
        this.f7337n.setDuration(680L);
        this.f7337n.setInterpolator(jr.h);
        this.f7337n.start();
    }
}
