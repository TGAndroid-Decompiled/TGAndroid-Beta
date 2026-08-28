package dg;

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
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.l80;
import zf.v1;
public final class u extends FrameLayout {
    public final q f4550a;
    public final r f4551b;
    public final TextView f4552c;
    public final l80 d;
    public final b6 f4553e;
    public final i80 f4554f;
    public final Paint[] h;
    public ValueAnimator f4555n;

    public u(Context context, b6 b6Var) {
        super(context);
        this.f4553e = b6Var;
        LinearLayout f10 = ll.f(context, 1);
        q qVar = new q(context, 1, 0, 0);
        this.f4550a = qVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i9 = f6.Mj;
        canvas.drawColor(i0.a.d(0.5f, f6.v0(i9, b6Var), f6.v0(f6.f23072h5, b6Var)));
        qVar.setBackgroundBitmap(createBitmap);
        ag.a aVar = qVar.f205b;
        aVar.f181w = i9;
        aVar.f182x = f6.Lj;
        aVar.b();
        f10.addView(qVar, e6.q(160, 160, 1));
        r rVar = new r(this, context);
        this.f4551b = rVar;
        this.h = new Paint[20];
        a(0.0f);
        v1 v1Var = rVar.f50764a;
        v1Var.f50747q = false;
        v1Var.K = false;
        v1Var.L = true;
        v1Var.H = true;
        v1Var.f50742l = new o(this, 0);
        v1Var.c();
        qVar.setStarParticlesView(rVar);
        TextView textView = new TextView(context);
        this.f4552c = textView;
        ll.k(22.0f, 1, textView);
        int i10 = f6.G6;
        textView.setTextColor(f6.v0(i10, b6Var));
        textView.setGravity(1);
        f10.addView(textView, e6.t(-2, -2, 1, 24, -8, 24, 0));
        i80 i80Var = new i80(this);
        this.f4554f = i80Var;
        l80 l80Var = new l80(context, i80Var, b6Var);
        this.d = l80Var;
        l80Var.setTextSize(1, 15.0f);
        l80Var.setGravity(17);
        l80Var.setTextColor(f6.v0(i10, b6Var));
        l80Var.setMovementMethod(LinkMovementMethod.getInstance());
        l80Var.setLinkTextColor(f6.v0(f6.J6, b6Var));
        l80Var.setImportantForAccessibility(2);
        f10.addView(l80Var, e6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(rVar, e6.e(-1, 234, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i9 = f6.Lj;
        b6 b6Var = this.f4553e;
        int v02 = f6.v0(i9, b6Var);
        int v03 = f6.v0(f6.Mj, b6Var);
        int d = i0.a.d(f10, v02, -371690);
        int d9 = i0.a.d(f10, v03, -14281);
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                paintArr[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (paintArr.length - 1), d, d9), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i80 i80Var = this.f4554f;
        if (i80Var != null) {
            canvas.save();
            l80 l80Var = this.d;
            canvas.translate(l80Var.getLeft(), l80Var.getTop());
            if (i80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        q qVar = this.f4550a;
        float measuredHeight = (qVar.getMeasuredHeight() / 2.0f) + qVar.getTop();
        r rVar = this.f4551b;
        rVar.setTranslationY(measuredHeight - (rVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i9;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = f6.f22947a7;
        b6 b6Var = this.f4553e;
        setBackgroundColor(f6.v0(i10, b6Var));
        this.f4552c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i9 = R.string.BoostingGetMoreBoost2;
        } else {
            i9 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i9, new Object[0]);
        l80 l80Var = this.d;
        l80Var.setText(formatString);
        l80Var.setTextColor(f6.v0(f6.f23247r5, b6Var));
    }

    public void setPaused(boolean z10) {
        this.f4550a.setPaused(z10);
        this.f4551b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f10;
        ValueAnimator valueAnimator = this.f4555n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        q qVar = this.f4550a;
        final float f11 = qVar.f205b.f168i;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f4555n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(qVar.Q);
        qVar.d();
        qVar.i();
        this.f4555n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i9;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f12 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                u uVar = u.this;
                q qVar2 = uVar.f4550a;
                qVar2.f205b.f168i = AndroidUtilities.lerp(f11, f10, floatValue);
                ag.a aVar = qVar2.f205b;
                float f13 = aVar.f166f;
                float f14 = f12 * 360.0f;
                if (z10) {
                    i9 = 1;
                } else {
                    i9 = -1;
                }
                aVar.f166f = (f14 * i9) + f13;
                aVar.b();
                uVar.a(qVar2.f205b.f168i);
            }
        });
        this.f4555n.addListener(new t(this, fArr, f11, f10, z10));
        this.f4555n.setDuration(680L);
        this.f4555n.setInterpolator(gr.h);
        this.f4555n.start();
    }
}
