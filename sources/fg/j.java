package fg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;
public final class j extends FrameLayout {
    public final p9 f6349a;
    public final q20 f6350b;
    public final int f6351c;
    public final m d;

    public j(m mVar, Context context) {
        super(context);
        this.d = mVar;
        q20 q20Var = new q20();
        this.f6350b = q20Var;
        int i10 = mVar.f6388f;
        g6 g6Var = mVar.f6239a;
        if (i10 == 0) {
            this.f6351c = AndroidUtilities.dp(150.0f);
            p9 p9Var = new p9(context);
            this.f6349a = p9Var;
            p9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(p9Var, c6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            z8 z8Var = new z8((g6) null);
            z8Var.r(currentUser);
            p9Var.getImageReceiver().setForUserOrChat(currentUser, z8Var);
            TextView textView = new TextView(context);
            yh.p(20.0f, 1, textView);
            textView.setTextColor(k6.v0(k6.G6, g6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, c6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            q20Var.f30273m = true;
            q20Var.f30263a = true;
            q20Var.d(k6.w0(null, k6.Mj, false), k6.w0(null, k6.Lj, false), 0, 0);
            q20Var.f30265c.setStyle(Paint.Style.STROKE);
            q20Var.f30265c.setStrokeCap(Paint.Cap.ROUND);
            q20Var.f30265c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            h hVar = new h(context, 0);
            addView(hVar, c6.e(-1, 190, 55));
            i iVar = new i(context, 1, 1, 0);
            iVar.setStarParticlesView(hVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = k6.Mj;
            canvas.drawColor(i0.a.d(0.5f, k6.v0(i11, g6Var), k6.v0(k6.f21733h5, g6Var)));
            iVar.setBackgroundBitmap(createBitmap);
            gg.a aVar = iVar.f7087b;
            aVar.f7065w = i11;
            aVar.f7066x = k6.Lj;
            aVar.b();
            addView(iVar, c6.e(160, 160, 1));
            iVar.j(100L);
            TextView g10 = y3.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(k6.v0(k6.G6, g6Var));
            y3.r(R.string.TelegramBusiness, g10, 17);
            addView(g10, c6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(k6.v0(k6.f22055z6, g6Var));
            y3.r(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, c6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f6388f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f6349a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            q20 q20Var = this.f6350b;
            q20Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f11 = (i10 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(AndroidUtilities.rectTmp, f13, ((f11 + f10) - f12) - f13, false, q20Var.f30265c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f6351c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
