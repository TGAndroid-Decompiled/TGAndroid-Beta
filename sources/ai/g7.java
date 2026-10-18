package ai;

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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j01;
public final class g7 extends org.telegram.ui.Components.ua {
    public final ArrayList f1347a0;
    public final LimitPreviewView f1348b0;

    public g7(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        float f7;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        float f10;
        int i10;
        this.f1347a0 = arrayList;
        float f11 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, d6Var, 0);
        this.f1348b0 = limitPreviewView;
        float f12 = 14.0f;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f13 = f11;
        this.X.addView(limitPreviewView, w7.z5.r(-1, -2, 17, f13, 20.0f, f13, 10.0f));
        Q(j10);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
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
        j01 j01Var = new j01(context, d6Var);
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
                j01Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), md.Y0(false, org.telegram.messenger.g0.h((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
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
                j01Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), md.Y0(false, org.telegram.messenger.g0.h((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f15 = f14 + f7;
        this.X.addView(j01Var, w7.z5.r(-1, -2, 7, f15, 16.0f, f15, 15.0f));
        TextView b12 = w7.d6.b(context, 12.0f, org.telegram.ui.ActionBar.h6.f21381y6, false, null);
        b12.setGravity(17);
        b12.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.X.addView(b12, w7.z5.t(-1, -2, 17, 32, 0, 32, 15));
        float f16 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Y = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, this.resourcesProvider));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d7, this.resourcesProvider));
        this.Y.addView(view, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.Z = dVar;
        float f17 = f16 + 16.0f;
        this.Y.addView(dVar, w7.z5.a(48.0f, f17, 16.0f, f17, 16.0f, -1, 119));
        this.containerView.addView(this.Y, w7.z5.e(-1, -2, 87));
        im0 im0Var = this.d;
        im0Var.setPadding(im0Var.getPaddingLeft(), im0Var.getPaddingTop(), im0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + im0Var.getPaddingBottom());
        this.Z.g(k7.B2(LocaleController.getString(R.string.Understood)), false, true);
        this.Z.setOnClickListener(new ah.g0(this, 8));
    }

    public final void Q(long j10) {
        int w02;
        ArrayList arrayList = this.f1347a0;
        if (arrayList != null && !arrayList.isEmpty()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(0);
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) i2.d.h(1, arrayList);
            LimitPreviewView limitPreviewView = this.f1348b0;
            limitPreviewView.M = true;
            Paint paint = limitPreviewView.K;
            int i10 = org.telegram.ui.ActionBar.h6.Oh;
            org.telegram.ui.ActionBar.d6 d6Var = limitPreviewView.S;
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
            limitPreviewView.f24283a = AndroidUtilities.ilerp((float) j10, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
            org.telegram.ui.Components.q6 q6Var = limitPreviewView.N;
            q6Var.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
            org.telegram.ui.Components.q6 q6Var2 = limitPreviewView.v;
            q6Var2.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
            ((FrameLayout.LayoutParams) q6Var2.getLayoutParams()).gravity = 5;
            limitPreviewView.setType(17);
            limitPreviewView.f24301w.setVisibility(8);
            limitPreviewView.O.setVisibility(8);
            if (limitPreviewView.L) {
                w02 = -1;
            } else {
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var);
            }
            q6Var2.setTextColor(w02);
            q6Var.setTextColor(-1);
            limitPreviewView.g((int) j10, false);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = true;
        }
    }
}
