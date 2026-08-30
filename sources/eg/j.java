package eg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;
public final class j extends FrameLayout {
    public final p9 f5314a;
    public final p20 f5315b;
    public final int f5316c;
    public final m d;

    public j(m mVar, Context context) {
        super(context);
        this.d = mVar;
        p20 p20Var = new p20();
        this.f5315b = p20Var;
        int i10 = mVar.f5353f;
        f6 f6Var = mVar.f5218a;
        if (i10 == 0) {
            this.f5316c = AndroidUtilities.dp(150.0f);
            p9 p9Var = new p9(context);
            this.f5314a = p9Var;
            p9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(p9Var, b6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            z8 z8Var = new z8((f6) null);
            z8Var.r(currentUser);
            p9Var.getImageReceiver().setForUserOrChat(currentUser, z8Var);
            TextView textView = new TextView(context);
            yh.p(20.0f, 1, textView);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, b6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            p20Var.f27720m = true;
            p20Var.f27711a = true;
            p20Var.d(j6.w0(null, j6.Mj, false), j6.w0(null, j6.Lj, false), 0, 0);
            p20Var.f27713c.setStyle(Paint.Style.STROKE);
            p20Var.f27713c.setStrokeCap(Paint.Cap.ROUND);
            p20Var.f27713c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            h hVar = new h(context, 0);
            addView(hVar, b6.e(-1, 190, 55));
            i iVar = new i(context, 1, 1, 0);
            iVar.setStarParticlesView(hVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = j6.Mj;
            canvas.drawColor(i0.a.d(0.5f, j6.v0(i11, f6Var), j6.v0(j6.f19977h5, f6Var)));
            iVar.setBackgroundBitmap(createBitmap);
            fg.a aVar = iVar.f6156b;
            aVar.f6135w = i11;
            aVar.f6136x = j6.Lj;
            aVar.b();
            addView(iVar, b6.e(160, 160, 1));
            iVar.j(100L);
            TextView g10 = y3.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(j6.v0(j6.G6, f6Var));
            y3.r(R.string.TelegramBusiness, g10, 17);
            addView(g10, b6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(j6.f20298z6, f6Var));
            y3.r(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, b6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f5353f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f5314a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            p20 p20Var = this.f5315b;
            p20Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f11 = (i10 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(AndroidUtilities.rectTmp, f13, ((f11 + f10) - f12) - f13, false, p20Var.f27713c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f5316c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
