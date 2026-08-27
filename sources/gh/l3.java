package gh;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import hh.k7;
import hh.u7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.wq0;

public final class l3 implements Utilities.Callback5, Utilities.Callback5Return {

    public final t3 f7413a;

    public l3(t3 t3Var) {
        this.f7413a = t3Var;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n41 n41Var = (n41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        t3 t3Var = this.f7413a;
        wq0 wq0Var = t3Var.f7533a;
        int i10 = t3Var.f7534b;
        if (t3Var.f7536e == null) {
            return;
        }
        Object obj6 = n41Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (!t3Var.f7538n) {
                hh.i5 i5Var = new hh.i5(t3Var.getContext(), t3Var.f7534b, wq0Var.f7199c, t3Var.f7535c, null);
                i5Var.Z0 = new g3(t3Var, 2);
                i5Var.K0 = new ag.h0(19, t3Var, savedStarGift);
                i5Var.j2(savedStarGift, t3Var.f7536e);
                i5Var.show();
                return;
            }
            if (!t3Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                boolean z10 = savedStarGift.pinned_to_top;
                boolean z11 = !z10;
                if (!z10 && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = t3Var.f7536e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                }
                if (t3Var.f7536e.m(savedStarGift, z11, true)) {
                    mc.a0(wq0Var.f7197a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                }
                if (z10) {
                    return;
                }
                t3Var.f7537f.u0(0);
            }
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        t3 t3Var;
        wq0 wq0Var;
        b2 b2Var;
        k7 k7Var;
        String str;
        final t3 t3Var2;
        wq0 wq0Var2;
        b2 b2Var2;
        boolean z10;
        boolean z11;
        String str2;
        boolean z12;
        Object obj6;
        n41 n41Var = (n41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        t3 t3Var3 = this.f7413a;
        org.telegram.ui.ActionBar.c6 c6Var = t3Var3.f7535c;
        int i10 = t3Var3.f7534b;
        wq0 wq0Var3 = t3Var3.f7533a;
        boolean z13 = false;
        if (t3Var3.f7536e != null) {
            if (view instanceof b2) {
                Object obj7 = n41Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    b2 b2Var3 = (b2) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.n2 n2Var = wq0Var3.f7197a;
                    k7 k7Var2 = wq0Var3.f7200e;
                    b70 b70VarI = b70.I(n2Var, view);
                    wq0Var3.E = b70VarI;
                    if (k7Var2.h()) {
                        if (!t3Var3.d) {
                            k7Var2.d().size();
                        }
                        b70 b70VarJ = b70VarI.J();
                        b70VarJ.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new m3(b70VarI, 0), false);
                        b70VarJ.k();
                        q3 q3Var = new q3(t3Var3.getContext(), 0);
                        LinearLayout linearLayout = new LinearLayout(t3Var3.getContext());
                        q3Var.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        b70VarJ.r(q3Var, h7.z5.n(-1, -2));
                        if (k7Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, t3Var3.getContext(), t3Var3.f7535c, false, false);
                            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = org.telegram.ui.ActionBar.g6.E8;
                            f1Var.c(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
                            f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
                            f1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            f1Var.setOnClickListener(new gg.f(t3Var3, b70VarI, savedStarGift, 5));
                            linearLayout.addView(f1Var, h7.z5.n(-1, -2));
                        }
                        ArrayList arrayListD = k7Var2.d();
                        int size = arrayListD.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayListD.get(i12);
                            ArrayList arrayList = k7Var2.e(tL_starGiftCollection.collection_id).f9753l;
                            wq0 wq0Var4 = wq0Var3;
                            int size2 = arrayList.size();
                            b2 b2Var4 = b2Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    z12 = false;
                                    break;
                                }
                                Object obj8 = arrayList.get(i14);
                                i14++;
                                int i15 = size2;
                                if (u7.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    z12 = true;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, t3Var3.getContext(), t3Var3.f7535c, false, false);
                            f1Var2.setChecked(z12);
                            t3 t3Var4 = t3Var3;
                            LinearLayout linearLayout2 = linearLayout;
                            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = org.telegram.ui.ActionBar.g6.E8;
                            f1Var2.c(org.telegram.ui.ActionBar.g6.v0(i16, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
                            f1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i16, c6Var)));
                            if (tL_starGiftCollection.icon != null) {
                                r3 r3Var = new r3(3, i10, tL_starGiftCollection.icon);
                                f1Var2.getImageView().addOnAttachStateChangeListener(new bf.b(r3Var, 8));
                                f1Var2.g(tL_starGiftCollection.title, 0, r3Var);
                                obj6 = null;
                            } else {
                                obj6 = null;
                                f1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            k7 k7Var3 = k7Var2;
                            f1Var2.setOnClickListener(new e3(t3Var4, z12, tL_starGiftCollection, savedStarGift, b70VarI, 0));
                            linearLayout2.addView(f1Var2, h7.z5.n(-1, -2));
                            linearLayout = linearLayout2;
                            t3Var3 = t3Var4;
                            wq0Var3 = wq0Var4;
                            i12 = i13;
                            b2Var3 = b2Var4;
                            k7Var2 = k7Var3;
                            size = size;
                            c6Var = c6Var;
                        }
                        t3Var = t3Var3;
                        wq0Var = wq0Var3;
                        b2Var = b2Var3;
                        k7Var = k7Var2;
                        str = null;
                        b70VarI.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new f3(b70VarI, b70VarJ, 0), false);
                        b70VarI.k();
                    } else {
                        t3Var = t3Var3;
                        wq0Var = wq0Var3;
                        b2Var = b2Var3;
                        k7Var = k7Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (wq0Var.c() && !t3Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            t3Var2 = t3Var;
                            wq0Var2 = wq0Var;
                            b2Var2 = b2Var;
                            z10 = false;
                            b70VarI.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new androidx.car.app.utils.b(t3Var2, savedStarGift, b2Var2, view, 3), false);
                            b70VarI.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new g3(t3Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            t3Var2 = t3Var;
                            wq0Var2 = wq0Var;
                            b2Var2 = b2Var;
                            z10 = false;
                            if (wq0Var2.c() && t3Var2.d) {
                                b70VarI.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new g3(t3Var2, 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (hh.i5.O1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean zP1 = hh.i5.P1(i10, tL_starGiftUnique);
                            final int i17 = 0;
                            b70VarI.c(zP1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(zP1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            t3 t3Var5 = t3Var2;
                                            s3 s3Var = new s3(t3Var5, t3Var5.getContext(), t3Var5.f7534b, t3Var5.f7533a.f7199c, t3Var5.f7535c, 0);
                                            s3Var.j2(savedStarGift, null);
                                            s3Var.r2(false);
                                            break;
                                        case 1:
                                            t3 t3Var6 = t3Var2;
                                            s3 s3Var2 = new s3(t3Var6, t3Var6.getContext(), t3Var6.f7534b, t3Var6.f7533a.f7199c, t3Var6.f7535c, 1);
                                            s3Var2.j2(savedStarGift, null);
                                            s3Var2.S1();
                                            break;
                                        default:
                                            t3 t3Var7 = t3Var2;
                                            s3 s3Var3 = new s3(t3Var7, t3Var7.getContext(), t3Var7.f7534b, t3Var7.f7533a.f7199c, t3Var7.f7535c, 2);
                                            s3Var3.j2(savedStarGift, null);
                                            s3Var3.Y1();
                                            break;
                                    }
                                }
                            }, z10);
                        }
                        b70VarI.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new d5.u(14, t3Var2, str2), str2 != null);
                        final int i18 = 1;
                        b70VarI.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i18) {
                                    case 0:
                                        t3 t3Var5 = t3Var2;
                                        s3 s3Var = new s3(t3Var5, t3Var5.getContext(), t3Var5.f7534b, t3Var5.f7533a.f7199c, t3Var5.f7535c, 0);
                                        s3Var.j2(savedStarGift, null);
                                        s3Var.r2(false);
                                        break;
                                    case 1:
                                        t3 t3Var6 = t3Var2;
                                        s3 s3Var2 = new s3(t3Var6, t3Var6.getContext(), t3Var6.f7534b, t3Var6.f7533a.f7199c, t3Var6.f7535c, 1);
                                        s3Var2.j2(savedStarGift, null);
                                        s3Var2.S1();
                                        break;
                                    default:
                                        t3 t3Var7 = t3Var2;
                                        s3 s3Var3 = new s3(t3Var7, t3Var7.getContext(), t3Var7.f7534b, t3Var7.f7533a.f7199c, t3Var7.f7535c, 2);
                                        s3Var3.j2(savedStarGift, null);
                                        s3Var3.Y1();
                                        break;
                                }
                            }
                        }, str2 != null);
                    } else {
                        t3Var2 = t3Var;
                        wq0Var2 = wq0Var;
                        b2Var2 = b2Var;
                        z10 = false;
                        if (wq0Var2.c() && t3Var2.d) {
                            b70VarI.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new g3(t3Var2, 3), false);
                        }
                    }
                    if (hh.i5.O1(i10, wq0Var2.f7199c)) {
                        boolean z15 = savedStarGift.unsaved;
                        b70VarI.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z15 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new androidx.car.app.utils.a(t3Var2, savedStarGift, b2Var2, 14), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i19 = 2;
                        b70VarI.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i19) {
                                    case 0:
                                        t3 t3Var5 = t3Var2;
                                        s3 s3Var = new s3(t3Var5, t3Var5.getContext(), t3Var5.f7534b, t3Var5.f7533a.f7199c, t3Var5.f7535c, 0);
                                        s3Var.j2(savedStarGift, null);
                                        s3Var.r2(false);
                                        break;
                                    case 1:
                                        t3 t3Var6 = t3Var2;
                                        s3 s3Var2 = new s3(t3Var6, t3Var6.getContext(), t3Var6.f7534b, t3Var6.f7533a.f7199c, t3Var6.f7535c, 1);
                                        s3Var2.j2(savedStarGift, null);
                                        s3Var2.S1();
                                        break;
                                    default:
                                        t3 t3Var7 = t3Var2;
                                        s3 s3Var3 = new s3(t3Var7, t3Var7.getContext(), t3Var7.f7534b, t3Var7.f7533a.f7199c, t3Var7.f7535c, 2);
                                        s3Var3.j2(savedStarGift, null);
                                        s3Var3.Y1();
                                        break;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId());
                    }
                    if (k7Var.h() && t3Var2.d) {
                        z11 = true;
                        b70VarI.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new androidx.car.app.utils.a(t3Var2, savedStarGift, b70VarI, 13), true);
                        b70VarI.E();
                        b70VarI.t();
                    } else {
                        z11 = true;
                    }
                    if (b70VarI.x() > 0) {
                        b70VarI.V(5);
                        b70VarI.f26994u = z11;
                        b70VarI.v = z11;
                        b70VarI.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int iMin = Math.min(point.x, point.y);
                        b70VarI.N = iMin - AndroidUtilities.dp(32.0f);
                        b70VarI.O = (int) (iMin * 0.6f);
                        b70VarI.P = z11;
                        b70VarI.W = z11;
                        b70VarI.Z();
                        b2Var2.f7168y.getImageReceiver().startAnimation(z11);
                        z13 = true;
                    }
                }
                z13 = false;
            } else {
                z13 = false;
            }
        }
        return Boolean.valueOf(z13);
    }
}
