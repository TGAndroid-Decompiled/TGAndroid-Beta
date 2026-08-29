package cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.t9;
import org.telegram.ui.th;
public final class j extends FrameLayout {
    public final t9 f3161a;
    public final k20 f3162b;
    public final int f3163c;
    public final m d;

    public j(m mVar, Context context) {
        super(context);
        this.d = mVar;
        k20 k20Var = new k20();
        this.f3162b = k20Var;
        int i10 = mVar.f3212f;
        c6 c6Var = mVar.f3069a;
        if (i10 == 0) {
            this.f3163c = AndroidUtilities.dp(150.0f);
            t9 t9Var = new t9(context);
            this.f3161a = t9Var;
            t9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(t9Var, f6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            e9 e9Var = new e9((c6) null);
            e9Var.r(currentUser);
            t9Var.getImageReceiver().setForUserOrChat(currentUser, e9Var);
            TextView textView = new TextView(context);
            th.n(20.0f, 1, textView);
            textView.setTextColor(g6.v0(g6.G6, c6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, f6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            k20Var.f29901m = true;
            k20Var.f29891a = true;
            k20Var.d(g6.w0(null, g6.Mj, false), g6.w0(null, g6.Lj, false), 0, 0);
            k20Var.f29893c.setStyle(Paint.Style.STROKE);
            k20Var.f29893c.setStrokeCap(Paint.Cap.ROUND);
            k20Var.f29893c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            h hVar = new h(context, 0);
            addView(hVar, f6.e(-1, 190, 55));
            i iVar = new i(context, 1, 1, 0);
            iVar.setStarParticlesView(hVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = g6.Mj;
            canvas.drawColor(i0.a.d(0.5f, g6.v0(i11, c6Var), g6.v0(g6.f23133h5, c6Var)));
            iVar.setBackgroundBitmap(createBitmap);
            dg.a aVar = iVar.f5590b;
            aVar.f5568w = i11;
            aVar.f5569x = g6.Lj;
            aVar.b();
            addView(iVar, f6.e(160, 160, 1));
            iVar.j(100L);
            TextView h = x3.h(context, 1, 20.0f);
            h.setTypeface(AndroidUtilities.bold());
            h.setTextColor(g6.v0(g6.G6, c6Var));
            org.telegram.ui.b.i(R.string.TelegramBusiness, h, 17);
            addView(h, f6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(g6.v0(g6.f23450z6, c6Var));
            org.telegram.ui.b.i(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, f6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f3212f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f3161a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            k20 k20Var = this.f3162b;
            k20Var.c(rectF);
            float f9 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f9) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f9) - f11) - f12, false, k20Var.f29893c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f3163c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
