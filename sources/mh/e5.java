package mh;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
public final class e5 extends org.telegram.ui.Components.ma {
    public final ArrayList X;
    public final LimitPreviewView Y;

    public e5(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        float f10;
        int i10;
        this.X = arrayList;
        float f11 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, g6Var, 0);
        this.Y = limitPreviewView;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f12 = f11;
        this.U.addView(limitPreviewView, k7.c6.r(-1, -2, 17, f12, 20.0f, f12, 10.0f));
        P(j10);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = k7.g6.b(context, 20.0f, i11, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        setTitle(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        this.U.addView(b10, k7.c6.t(-1, -2, 17, 32, 0, 32, 0));
        TextView b11 = k7.g6.b(context, 14.0f, i11, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
        this.U.addView(b11, k7.c6.t(-1, -2, 17, 32, 10, 32, 10));
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        sz0 sz0Var = new sz0(context, g6Var);
        int i12 = 0;
        boolean z4 = false;
        while (i12 < arrayList.size()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(i12);
            if (currentTime > starGiftUpgradePrice.date && ((i10 = i12 + 1) >= arrayList.size() || currentTime > ((TL_stars.StarGiftUpgradePrice) arrayList.get(i10)).date)) {
                f10 = f12;
            } else {
                f10 = f12;
                Date date = new Date(starGiftUpgradePrice.date * 1000);
                sz0Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), ja.X0(false, l.d.l((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                z4 = true;
            }
            i12++;
            f12 = f10;
        }
        float f13 = f12;
        if (!z4) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                Date date2 = new Date(starGiftUpgradePrice2.date * 1000);
                sz0Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), ja.X0(false, l.d.l((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f14 = f13 + 14.0f;
        this.U.addView(sz0Var, k7.c6.r(-1, -2, 7, f14, 16.0f, f14, 15.0f));
        TextView b12 = k7.g6.b(context, 12.0f, org.telegram.ui.ActionBar.k6.f22038y6, false, null);
        b12.setGravity(17);
        b12.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.U.addView(b12, k7.c6.t(-1, -2, 17, 32, 0, 32, 15));
        float f15 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.V = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, this.resourcesProvider));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, this.resourcesProvider));
        this.V.addView(view, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        qh.d dVar = new qh.d(getContext(), this.resourcesProvider, true);
        this.W = dVar;
        float f16 = f15 + 16.0f;
        this.V.addView(dVar, k7.c6.d(-1, 48.0f, 119, f16, 16.0f, f16, 16.0f));
        this.containerView.addView(this.V, k7.c6.e(-1, -2, 87));
        sl0 sl0Var = this.d;
        sl0Var.setPadding(sl0Var.getPaddingLeft(), sl0Var.getPaddingTop(), sl0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + sl0Var.getPaddingBottom());
        this.W.g(g5.g2(LocaleController.getString(R.string.Understood)), false, true);
        this.W.setOnClickListener(new androidx.mediarouter.app.c(this, 21));
    }

    public final void P(long j10) {
        int v02;
        ArrayList arrayList = this.X;
        if (arrayList != null && !arrayList.isEmpty()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(0);
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) l.d.i(1, arrayList);
            LimitPreviewView limitPreviewView = this.Y;
            limitPreviewView.J = true;
            Paint paint = limitPreviewView.H;
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            org.telegram.ui.ActionBar.g6 g6Var = limitPreviewView.P;
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            limitPreviewView.f24946a = AndroidUtilities.ilerp((float) j10, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
            org.telegram.ui.Components.k6 k6Var = limitPreviewView.K;
            k6Var.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
            org.telegram.ui.Components.k6 k6Var2 = limitPreviewView.v;
            k6Var2.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
            ((FrameLayout.LayoutParams) k6Var2.getLayoutParams()).gravity = 5;
            limitPreviewView.setType(17);
            limitPreviewView.f24962w.setVisibility(8);
            limitPreviewView.L.setVisibility(8);
            if (limitPreviewView.I) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var);
            }
            k6Var2.setTextColor(v02);
            k6Var.setTextColor(-1);
            limitPreviewView.g((int) j10, false);
            limitPreviewView.M = true;
            limitPreviewView.N = true;
            limitPreviewView.O = true;
        }
    }
}
