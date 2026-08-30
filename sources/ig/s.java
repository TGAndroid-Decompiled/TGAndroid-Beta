package ig;

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
import eg.p2;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.nr;
public final class s extends FrameLayout {
    public final eg.i f7539a;
    public final p f7540b;
    public final TextView f7541c;
    public final e90 d;
    public final f6 e;
    public final b90 f7542f;
    public final Paint[] h;
    public ValueAnimator f7543n;

    public s(Context context, f6 f6Var) {
        super(context);
        this.e = f6Var;
        LinearLayout f10 = y3.f(context, 1);
        eg.i iVar = new eg.i(context, 1, 0, 2);
        this.f7539a = iVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, j6.v0(i10, f6Var), j6.v0(j6.f19977h5, f6Var)));
        iVar.setBackgroundBitmap(createBitmap);
        fg.a aVar = iVar.f6156b;
        aVar.f6135w = i10;
        aVar.f6136x = j6.Lj;
        aVar.b();
        f10.addView(iVar, b6.q(160, 160, 1));
        p pVar = new p(this, context);
        this.f7540b = pVar;
        this.h = new Paint[20];
        a(0.0f);
        p2 p2Var = pVar.f5468a;
        p2Var.f5440q = false;
        p2Var.K = false;
        p2Var.L = true;
        p2Var.H = true;
        p2Var.f5435l = new dg.a0(this, 1);
        p2Var.c();
        iVar.setStarParticlesView(pVar);
        TextView textView = new TextView(context);
        this.f7541c = textView;
        org.telegram.ui.b.g(22.0f, 1, textView);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(1);
        f10.addView(textView, b6.t(-2, -2, 1, 24, -8, 24, 0));
        b90 b90Var = new b90(this);
        this.f7542f = b90Var;
        e90 e90Var = new e90(context, b90Var, f6Var);
        this.d = e90Var;
        e90Var.setTextSize(1, 15.0f);
        e90Var.setGravity(17);
        e90Var.setTextColor(j6.v0(i11, f6Var));
        e90Var.setMovementMethod(LinkMovementMethod.getInstance());
        e90Var.setLinkTextColor(j6.v0(j6.J6, f6Var));
        e90Var.setImportantForAccessibility(2);
        f10.addView(e90Var, b6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(pVar, b6.e(-1, 234, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i10 = j6.Lj;
        f6 f6Var = this.e;
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.Mj, f6Var);
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
        b90 b90Var = this.f7542f;
        if (b90Var != null) {
            canvas.save();
            e90 e90Var = this.d;
            canvas.translate(e90Var.getLeft(), e90Var.getTop());
            if (b90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        eg.i iVar = this.f7539a;
        float measuredHeight = (iVar.getMeasuredHeight() / 2.0f) + iVar.getTop();
        p pVar = this.f7540b;
        pVar.setTranslationY(measuredHeight - (pVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = j6.f19852a7;
        f6 f6Var = this.e;
        setBackgroundColor(j6.v0(i11, f6Var));
        this.f7541c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        e90 e90Var = this.d;
        e90Var.setText(formatString);
        e90Var.setTextColor(j6.v0(j6.f20157r5, f6Var));
    }

    public void setPaused(boolean z4) {
        this.f7539a.setPaused(z4);
        this.f7540b.setPaused(z4);
    }

    public void setStars(final boolean z4) {
        final float f10;
        ValueAnimator valueAnimator = this.f7543n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        eg.i iVar = this.f7539a;
        final float f11 = iVar.f6156b.f6122i;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f7543n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(iVar.R);
        iVar.d();
        iVar.i();
        this.f7543n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f12 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                s sVar = s.this;
                eg.i iVar2 = sVar.f7539a;
                iVar2.f6156b.f6122i = AndroidUtilities.lerp(f11, f10, floatValue);
                fg.a aVar = iVar2.f6156b;
                float f13 = aVar.f6120f;
                float f14 = f12 * 360.0f;
                if (z4) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f6120f = (f14 * i10) + f13;
                aVar.b();
                sVar.a(iVar2.f6156b.f6122i);
            }
        });
        this.f7543n.addListener(new r(this, fArr, f11, f10, z4));
        this.f7543n.setDuration(680L);
        this.f7543n.setInterpolator(nr.h);
        this.f7543n.start();
    }
}
