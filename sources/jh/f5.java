package jh;

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
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.jl0;
public final class f5 extends org.telegram.ui.Components.ra {
    public final ArrayList W;
    public final LimitPreviewView X;

    public f5(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        float f9;
        int i10;
        this.W = arrayList;
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, c6Var, 0);
        this.X = limitPreviewView;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f11 = f10;
        this.T.addView(limitPreviewView, i7.f6.r(-1, -2, 17, f11, 20.0f, f11, 10.0f));
        P(j10);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        TextView b10 = i7.j6.b(context, 20.0f, i11, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        setTitle(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        this.T.addView(b10, i7.f6.t(-1, -2, 17, 32, 0, 32, 0));
        TextView b11 = i7.j6.b(context, 14.0f, i11, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
        this.T.addView(b11, i7.f6.t(-1, -2, 17, 32, 10, 32, 10));
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        hz0 hz0Var = new hz0(context, c6Var);
        int i12 = 0;
        boolean z10 = false;
        while (i12 < arrayList.size()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(i12);
            if (currentTime > starGiftUpgradePrice.date && ((i10 = i12 + 1) >= arrayList.size() || currentTime > ((TL_stars.StarGiftUpgradePrice) arrayList.get(i10)).date)) {
                f9 = f11;
            } else {
                f9 = f11;
                Date date = new Date(starGiftUpgradePrice.date * 1000);
                hz0Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), ia.X0(false, j7.l1.m((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                z10 = true;
            }
            i12++;
            f11 = f9;
        }
        float f12 = f11;
        if (!z10) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj;
                Date date2 = new Date(starGiftUpgradePrice2.date * 1000);
                hz0Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), ia.X0(false, j7.l1.m((int) starGiftUpgradePrice2.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f13 = f12 + 14.0f;
        this.T.addView(hz0Var, i7.f6.r(-1, -2, 7, f13, 16.0f, f13, 15.0f));
        TextView b12 = i7.j6.b(context, 12.0f, org.telegram.ui.ActionBar.g6.f23433y6, false, null);
        b12.setGravity(17);
        b12.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.T.addView(b12, i7.f6.t(-1, -2, 17, 32, 0, 32, 15));
        float f14 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.U = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, this.resourcesProvider));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.resourcesProvider));
        this.U.addView(view, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        nh.d dVar = new nh.d(getContext(), this.resourcesProvider, true);
        this.V = dVar;
        float f15 = f14 + 16.0f;
        this.U.addView(dVar, i7.f6.d(-1, 48.0f, 119, f15, 16.0f, f15, 16.0f));
        this.containerView.addView(this.U, i7.f6.e(-1, -2, 87));
        jl0 jl0Var = this.d;
        jl0Var.setPadding(jl0Var.getPaddingLeft(), jl0Var.getPaddingTop(), jl0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + jl0Var.getPaddingBottom());
        this.V.g(h5.g2(LocaleController.getString(R.string.Understood)), false, true);
        this.V.setOnClickListener(new ag.o(this, 21));
    }

    public final void P(long j10) {
        int v02;
        ArrayList arrayList = this.W;
        if (arrayList != null && !arrayList.isEmpty()) {
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(0);
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) j7.l1.i(1, arrayList);
            LimitPreviewView limitPreviewView = this.X;
            limitPreviewView.I = true;
            Paint paint = limitPreviewView.G;
            int i10 = org.telegram.ui.ActionBar.g6.Oh;
            org.telegram.ui.ActionBar.c6 c6Var = limitPreviewView.O;
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            limitPreviewView.f26458a = AndroidUtilities.ilerp((float) j10, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
            org.telegram.ui.Components.o6 o6Var = limitPreviewView.J;
            o6Var.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
            org.telegram.ui.Components.o6 o6Var2 = limitPreviewView.v;
            o6Var2.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
            ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
            limitPreviewView.setType(17);
            limitPreviewView.f26473w.setVisibility(8);
            limitPreviewView.K.setVisibility(8);
            if (limitPreviewView.H) {
                v02 = -1;
            } else {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var);
            }
            o6Var2.setTextColor(v02);
            o6Var.setTextColor(-1);
            limitPreviewView.g((int) j10, false);
            limitPreviewView.L = true;
            limitPreviewView.M = true;
            limitPreviewView.N = true;
        }
    }
}
