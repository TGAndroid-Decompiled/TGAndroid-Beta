package eg;

import ag.j3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p80;

public final class t extends FrameLayout {

    public final ag.k f5441a;

    public final q f5442b;

    public final TextView f5443c;
    public final p80 d;

    public final c6 f5444e;

    public final m80 f5445f;
    public final Paint[] h;

    public ValueAnimator f5446n;

    public t(Context context, c6 c6Var) {
        super(context);
        this.f5444e = c6Var;
        LinearLayout linearLayoutG = y1.g(context, 1);
        ag.k kVar = new ag.k(context, 1, 0, 2);
        this.f5441a = kVar;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i10 = g6.Mj;
        canvas.drawColor(i0.b.d(0.5f, g6.v0(i10, c6Var), g6.v0(g6.f23124h5, c6Var)));
        kVar.setBackgroundBitmap(bitmapCreateBitmap);
        bg.a aVar = kVar.f2129b;
        aVar.f2107w = i10;
        aVar.f2108x = g6.Lj;
        aVar.b();
        linearLayoutG.addView(kVar, z5.q(160, 160, 1));
        q qVar = new q(this, context);
        this.f5442b = qVar;
        this.h = new Paint[20];
        a(0.0f);
        j3 j3Var = qVar.f540a;
        j3Var.f513q = false;
        j3Var.K = false;
        j3Var.L = true;
        j3Var.H = true;
        j3Var.f508l = new o(this, 0);
        j3Var.c();
        kVar.setStarParticlesView(qVar);
        TextView textView = new TextView(context);
        this.f5443c = textView;
        rl.h(22.0f, 1, textView);
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setGravity(1);
        linearLayoutG.addView(textView, z5.t(-2, -2, 1, 24, -8, 24, 0));
        m80 m80Var = new m80(this);
        this.f5445f = m80Var;
        p80 p80Var = new p80(context, m80Var, c6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 15.0f);
        p80Var.setGravity(17);
        p80Var.setTextColor(g6.v0(i11, c6Var));
        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
        p80Var.setLinkTextColor(g6.v0(g6.J6, c6Var));
        p80Var.setImportantForAccessibility(2);
        linearLayoutG.addView(p80Var, z5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(qVar, z5.e(-1, 234, 48));
        addView(linearLayoutG);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i10 = g6.Lj;
        c6 c6Var = this.f5444e;
        int iV0 = g6.v0(i10, c6Var);
        int iV1 = g6.v0(g6.Mj, c6Var);
        int iD = i0.b.d(f10, iV0, -371690);
        int iD2 = i0.b.d(f10, iV1, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 >= paintArr.length) {
                return;
            }
            paintArr[i11] = new Paint(1);
            paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.b.d(i11 / (paintArr.length - 1), iD, iD2), PorterDuff.Mode.SRC_IN));
            i11++;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m80 m80Var = this.f5445f;
        if (m80Var != null) {
            canvas.save();
            p80 p80Var = this.d;
            canvas.translate(p80Var.getLeft(), p80Var.getTop());
            if (m80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ag.k kVar = this.f5441a;
        float measuredHeight = (kVar.getMeasuredHeight() / 2.0f) + kVar.getTop();
        q qVar = this.f5442b;
        qVar.setTranslationY(measuredHeight - (qVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new r());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = g6.f22999a7;
        c6 c6Var = this.f5444e;
        setBackgroundColor(g6.v0(i10, c6Var));
        this.f5443c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String string = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        p80 p80Var = this.d;
        p80Var.setText(string);
        p80Var.setTextColor(g6.v0(g6.f23300r5, c6Var));
    }

    public void setPaused(boolean z10) {
        this.f5441a.setPaused(z10);
        this.f5442b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        ValueAnimator valueAnimator = this.f5446n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ag.k kVar = this.f5441a;
        final float f10 = kVar.f2129b.f2094i;
        final float f11 = z10 ? 1.0f : 0.0f;
        this.f5446n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(kVar.Q);
        kVar.d();
        kVar.i();
        this.f5446n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f12 = fFloatValue - fArr2[0];
                fArr2[0] = fFloatValue;
                t tVar = this.f5427a;
                ag.k kVar2 = tVar.f5441a;
                kVar2.f2129b.f2094i = AndroidUtilities.lerp(f10, f11, fFloatValue);
                bg.a aVar = kVar2.f2129b;
                aVar.f2092f = (f12 * 360.0f * (z10 ? 1 : -1)) + aVar.f2092f;
                aVar.b();
                tVar.a(kVar2.f2129b.f2094i);
            }
        });
        this.f5446n.addListener(new s(this, fArr, f10, f11, z10));
        this.f5446n.setDuration(680L);
        this.f5446n.setInterpolator(er.h);
        this.f5446n.start();
    }
}
