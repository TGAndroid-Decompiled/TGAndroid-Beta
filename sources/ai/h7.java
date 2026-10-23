package ai;

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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o01;
public final class h7 extends org.telegram.ui.Components.ua {
    public final ArrayList f1406a0;
    public final LimitPreviewView f1407b0;

    public h7(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        float f7;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        float f10;
        int i10;
        this.f1406a0 = arrayList;
        float f11 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, g6Var, 0);
        this.f1407b0 = limitPreviewView;
        float f12 = 14.0f;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f13 = f11;
        this.X.addView(limitPreviewView, w7.z5.r(-1, -2, 17, f13, 20.0f, f13, 10.0f));
        P(j10);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = w7.d6.b(context, 20.0f, i11, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        setTitle(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        this.X.addView(b10, w7.z5.t(-1, -2, 17, 32, 0, 32, 0));
        TextView b11 = w7.d6.b(context, 14.0f, i11, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
        this.X.addView(b11, w7.z5.t(-1, -2, 17, 32, 10, 32, 10));
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        o01 o01Var = new o01(context, g6Var);
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
                o01Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), nd.Y0(false, i2.o1.m((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
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
                o01Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), nd.Y0(false, i2.o1.m((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f15 = f14 + f7;
        this.X.addView(o01Var, w7.z5.r(-1, -2, 7, f15, 16.0f, f15, 15.0f));
        TextView b12 = w7.d6.b(context, 12.0f, org.telegram.ui.ActionBar.k6.f21571y6, false, null);
        b12.setGravity(17);
        b12.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.X.addView(b12, w7.z5.t(-1, -2, 17, 32, 0, 32, 15));
        float f16 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Y = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, frameLayout, this.resourcesProvider);
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d7, view, this.resourcesProvider);
        this.Y.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.Z = dVar;
        float f17 = f16 + 16.0f;
        this.Y.addView(dVar, w7.z5.d(-1, 48.0f, 119, f17, 16.0f, f17, 16.0f));
        this.containerView.addView(this.Y, w7.z5.e(-1, -2, 87));
        mm0 mm0Var = this.d;
        mm0Var.setPadding(mm0Var.getPaddingLeft(), mm0Var.getPaddingTop(), mm0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + mm0Var.getPaddingBottom());
        this.Z.i(l7.H2(LocaleController.getString(R.string.Understood)), false, true);
        this.Z.setOnClickListener(new ah.g0(this, 8));
    }

    public final void P(long j10) {
        ArrayList arrayList = this.f1406a0;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f1407b0.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j10, (TL_stars.StarGiftUpgradePrice) i2.o1.i(1, arrayList));
        }
    }
}
