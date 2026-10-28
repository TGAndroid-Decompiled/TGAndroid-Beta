package bi;

import android.content.Context;
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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.x01;
public final class d7 extends org.telegram.ui.Components.ua {
    public final ArrayList f4495a0;
    public final LimitPreviewView f4496b0;

    public d7(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        float f7;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        float f10;
        int i10;
        this.f4495a0 = arrayList;
        float f11 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, u6Var, 0);
        this.f4496b0 = limitPreviewView;
        float f12 = 14.0f;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f13 = f11;
        this.X.addView(limitPreviewView, kb1.v(-1, -2, 17, f13, 20.0f, f13, 10.0f));
        P(j10);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        TextView L = kb1.L(context, 20.0f, i11, true, null);
        L.setGravity(17);
        L.setText(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        setTitle(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        this.X.addView(L, kb1.x(-1, -2, 17, 32, 0, 32, 0));
        TextView L2 = kb1.L(context, 14.0f, i11, false, null);
        L2.setGravity(17);
        L2.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
        this.X.addView(L2, kb1.x(-1, -2, 17, 32, 10, 32, 10));
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        x01 x01Var = new x01(context, u6Var);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            f7 = f12;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (currentTime > ((TL_stars.StarGiftUpgradePrice) arrayList.get(i12)).date && ((i10 = i12 + 1) >= arrayList.size() || currentTime > ((TL_stars.StarGiftUpgradePrice) arrayList.get(i10)).date)) {
                f10 = f13;
            } else {
                f10 = f13;
                Date date = new Date(starGiftUpgradePrice.date * 1000);
                x01Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), dd.W0(false, org.telegram.messenger.t.i((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                z10 = true;
            }
            i12++;
            f12 = f7;
            f13 = f10;
        }
        float f14 = f13;
        if (!z10) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                Date date2 = new Date(starGiftUpgradePrice2.date * 1000);
                x01Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), dd.W0(false, org.telegram.messenger.t.i((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f15 = f14 + f7;
        this.X.addView(x01Var, kb1.v(-1, -2, 7, f15, 16.0f, f15, 15.0f));
        TextView L3 = kb1.L(context, 12.0f, org.telegram.ui.ActionBar.y6.f23749y6, false, null);
        L3.setGravity(17);
        L3.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.X.addView(L3, kb1.x(-1, -2, 17, 32, 0, 32, 15));
        float f16 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Y = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, frameLayout, this.resourcesProvider);
        View view = new View(getContext());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23358d7, view, this.resourcesProvider);
        this.Y.addView(view, kb1.e(-1.0f, 1.0f / AndroidUtilities.density, 55));
        fi.d dVar = new fi.d(getContext(), this.resourcesProvider, true);
        this.Z = dVar;
        float f17 = f16 + 16.0f;
        this.Y.addView(dVar, kb1.h(-1, 48.0f, 119, f17, 16.0f, f17, 16.0f));
        this.containerView.addView(this.Y, kb1.i(-1, -2, 87));
        nm0 nm0Var = this.d;
        nm0Var.setPadding(nm0Var.getPaddingLeft(), nm0Var.getPaddingTop(), nm0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + nm0Var.getPaddingBottom());
        this.Z.i(h7.H2(LocaleController.getString(R.string.Understood)), false, true);
        this.Z.setOnClickListener(new ai.s(this, 10));
    }

    public final void P(long j10) {
        ArrayList arrayList = this.f4495a0;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f4496b0.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j10, (TL_stars.StarGiftUpgradePrice) ic.a.g(1, arrayList));
        }
    }
}
