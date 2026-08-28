package gh;

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
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
public final class i5 extends org.telegram.ui.Components.ma {
    public final ArrayList W;
    public final LimitPreviewView X;

    public i5(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        float f10;
        int i9;
        this.W = arrayList;
        float f11 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, b6Var, 0);
        this.X = limitPreviewView;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f12 = f11;
        this.T.addView(limitPreviewView, g7.e6.r(-1, -2, 17, f12, 20.0f, f12, 10.0f));
        O(j10);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        TextView b10 = g7.i6.b(context, 20.0f, i10, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        setTitle(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        this.T.addView(b10, g7.e6.t(-1, -2, 17, 32, 0, 32, 0));
        TextView b11 = g7.i6.b(context, 14.0f, i10, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
        this.T.addView(b11, g7.e6.t(-1, -2, 17, 32, 10, 32, 10));
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        wy0 wy0Var = new wy0(context, b6Var);
        int i11 = 0;
        boolean z10 = false;
        while (i11 < arrayList.size()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(i11);
            if (currentTime > starGiftUpgradePrice.date && ((i9 = i11 + 1) >= arrayList.size() || currentTime > ((TL_stars.StarGiftUpgradePrice) arrayList.get(i9)).date)) {
                f10 = f12;
            } else {
                f10 = f12;
                Date date = new Date(starGiftUpgradePrice.date * 1000);
                wy0Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), oa.X0(false, j3.r0.n((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                z10 = true;
            }
            i11++;
            f12 = f10;
        }
        float f13 = f12;
        if (!z10) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                Date date2 = new Date(starGiftUpgradePrice2.date * 1000);
                wy0Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), oa.X0(false, j3.r0.n((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f14 = f13 + 14.0f;
        this.T.addView(wy0Var, g7.e6.r(-1, -2, 7, f14, 16.0f, f14, 15.0f));
        TextView b12 = g7.i6.b(context, 12.0f, org.telegram.ui.ActionBar.f6.f23369y6, false, null);
        b12.setGravity(17);
        b12.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.T.addView(b12, g7.e6.t(-1, -2, 17, 32, 0, 32, 15));
        float f15 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.U = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, this.resourcesProvider));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.resourcesProvider));
        this.U.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        kh.d dVar = new kh.d(getContext(), this.resourcesProvider, true);
        this.V = dVar;
        float f16 = f15 + 16.0f;
        this.U.addView(dVar, g7.e6.d(-1, 48.0f, 119, f16, 16.0f, f16, 16.0f));
        this.containerView.addView(this.U, g7.e6.e(-1, -2, 87));
        wk0 wk0Var = this.d;
        wk0Var.setPadding(wk0Var.getPaddingLeft(), wk0Var.getPaddingTop(), wk0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + wk0Var.getPaddingBottom());
        this.V.g(k5.g2(LocaleController.getString(R.string.Understood)), false, true);
        this.V.setOnClickListener(new androidx.mediarouter.app.c(this, 15));
    }

    public final void O(long j10) {
        int v02;
        ArrayList arrayList = this.W;
        if (arrayList != null && !arrayList.isEmpty()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(0);
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) j3.r0.j(1, arrayList);
            LimitPreviewView limitPreviewView = this.X;
            limitPreviewView.I = true;
            Paint paint = limitPreviewView.G;
            int i9 = org.telegram.ui.ActionBar.f6.Oh;
            org.telegram.ui.ActionBar.b6 b6Var = limitPreviewView.O;
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            limitPreviewView.f26447a = AndroidUtilities.ilerp((float) j10, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
            org.telegram.ui.Components.j6 j6Var = limitPreviewView.J;
            j6Var.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
            org.telegram.ui.Components.j6 j6Var2 = limitPreviewView.v;
            j6Var2.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
            ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
            limitPreviewView.setType(17);
            limitPreviewView.f26462w.setVisibility(8);
            limitPreviewView.K.setVisibility(8);
            if (limitPreviewView.H) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var);
            }
            j6Var2.setTextColor(v02);
            j6Var.setTextColor(-1);
            limitPreviewView.g((int) j10, false);
            limitPreviewView.L = true;
            limitPreviewView.M = true;
            limitPreviewView.N = true;
        }
    }
}
