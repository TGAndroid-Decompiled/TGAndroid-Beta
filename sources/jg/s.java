package jg;

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
import fg.o2;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.pr;
public final class s extends FrameLayout {
    public final fg.i f10062a;
    public final p f10063b;
    public final TextView f10064c;
    public final g90 d;
    public final g6 f10065e;
    public final d90 f10066f;
    public final Paint[] h;
    public ValueAnimator f10067n;

    public s(Context context, g6 g6Var) {
        super(context);
        this.f10065e = g6Var;
        LinearLayout f10 = y3.f(context, 1);
        fg.i iVar = new fg.i(context, 1, 0, 2);
        this.f10062a = iVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = k6.Mj;
        canvas.drawColor(i0.a.d(0.5f, k6.v0(i10, g6Var), k6.v0(k6.f21731h5, g6Var)));
        iVar.setBackgroundBitmap(createBitmap);
        gg.a aVar = iVar.f7087b;
        aVar.f7065w = i10;
        aVar.f7066x = k6.Lj;
        aVar.b();
        f10.addView(iVar, c6.q(160, 160, 1));
        p pVar = new p(this, context);
        this.f10063b = pVar;
        this.h = new Paint[20];
        a(0.0f);
        o2 o2Var = pVar.f6501a;
        o2Var.f6465q = false;
        o2Var.K = false;
        o2Var.L = true;
        o2Var.H = true;
        o2Var.f6460l = new eg.y(this, 1);
        o2Var.c();
        iVar.setStarParticlesView(pVar);
        TextView textView = new TextView(context);
        this.f10064c = textView;
        org.telegram.ui.b.g(22.0f, 1, textView);
        int i11 = k6.G6;
        textView.setTextColor(k6.v0(i11, g6Var));
        textView.setGravity(1);
        f10.addView(textView, c6.t(-2, -2, 1, 24, -8, 24, 0));
        d90 d90Var = new d90(this);
        this.f10066f = d90Var;
        g90 g90Var = new g90(context, d90Var, g6Var);
        this.d = g90Var;
        g90Var.setTextSize(1, 15.0f);
        g90Var.setGravity(17);
        g90Var.setTextColor(k6.v0(i11, g6Var));
        g90Var.setMovementMethod(LinkMovementMethod.getInstance());
        g90Var.setLinkTextColor(k6.v0(k6.J6, g6Var));
        g90Var.setImportantForAccessibility(2);
        f10.addView(g90Var, c6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(pVar, c6.e(-1, 234, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i10 = k6.Lj;
        g6 g6Var = this.f10065e;
        int v02 = k6.v0(i10, g6Var);
        int v03 = k6.v0(k6.Mj, g6Var);
        int d = i0.a.d(f10, v02, -371690);
        int d10 = i0.a.d(f10, v03, -14281);
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
        d90 d90Var = this.f10066f;
        if (d90Var != null) {
            canvas.save();
            g90 g90Var = this.d;
            canvas.translate(g90Var.getLeft(), g90Var.getTop());
            if (d90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        fg.i iVar = this.f10062a;
        float measuredHeight = (iVar.getMeasuredHeight() / 2.0f) + iVar.getTop();
        p pVar = this.f10063b;
        pVar.setTranslationY(measuredHeight - (pVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = k6.f21605a7;
        g6 g6Var = this.f10065e;
        setBackgroundColor(k6.v0(i11, g6Var));
        this.f10064c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        g90 g90Var = this.d;
        g90Var.setText(formatString);
        g90Var.setTextColor(k6.v0(k6.f21911r5, g6Var));
    }

    public void setPaused(boolean z4) {
        this.f10062a.setPaused(z4);
        this.f10063b.setPaused(z4);
    }

    public void setStars(final boolean z4) {
        final float f10;
        ValueAnimator valueAnimator = this.f10067n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fg.i iVar = this.f10062a;
        final float f11 = iVar.f7087b.f7052i;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f10067n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(iVar.R);
        iVar.d();
        iVar.i();
        this.f10067n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f12 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                s sVar = s.this;
                fg.i iVar2 = sVar.f10062a;
                iVar2.f7087b.f7052i = AndroidUtilities.lerp(f11, f10, floatValue);
                gg.a aVar = iVar2.f7087b;
                float f13 = aVar.f7050f;
                float f14 = f12 * 360.0f;
                if (z4) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f7050f = (f14 * i10) + f13;
                aVar.b();
                sVar.a(iVar2.f7087b.f7052i);
            }
        });
        this.f10067n.addListener(new r(this, fArr, f11, f10, z4));
        this.f10067n.setDuration(680L);
        this.f10067n.setInterpolator(pr.h);
        this.f10067n.start();
    }
}
