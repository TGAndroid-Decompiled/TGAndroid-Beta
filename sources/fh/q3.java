package fh;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import gh.l7;
import gh.v7;
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
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x60;
public final class q3 implements Utilities.Callback5, Utilities.Callback5Return {
    public final y3 f6727a;

    public q3(y3 y3Var) {
        this.f6727a = y3Var;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y3 y3Var = this.f6727a;
        vq0 vq0Var = y3Var.f6880a;
        int i9 = y3Var.f6881b;
        if (y3Var.f6883e == null) {
            return;
        }
        Object obj6 = l41Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (y3Var.f6885n) {
                if (!y3Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = y3Var.f6883e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i9).sendRequest(savestargift, null, 64);
                    }
                    if (y3Var.f6883e.m(savedStarGift, z11, true)) {
                        oc.a0(vq0Var.f6545a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i9).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    y3Var.f6884f.u0(0);
                    return;
                }
                return;
            }
            gh.k5 k5Var = new gh.k5(y3Var.getContext(), y3Var.f6881b, vq0Var.f6547c, y3Var.f6882c, null);
            k5Var.Z0 = new l3(y3Var, 2);
            k5Var.K0 = new b5.d(18, y3Var, savedStarGift);
            k5Var.j2(savedStarGift, y3Var.f6883e);
            k5Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        y3 y3Var;
        vq0 vq0Var;
        f2 f2Var;
        l7 l7Var;
        String str;
        final y3 y3Var2;
        vq0 vq0Var2;
        f2 f2Var2;
        boolean z10;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        org.telegram.ui.ActionBar.b6 b6Var;
        Object obj6;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y3 y3Var3 = this.f6727a;
        org.telegram.ui.ActionBar.b6 b6Var2 = y3Var3.f6882c;
        int i9 = y3Var3.f6881b;
        vq0 vq0Var3 = y3Var3.f6880a;
        boolean z13 = false;
        if (y3Var3.f6883e != null) {
            if (view instanceof f2) {
                Object obj7 = l41Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    f2 f2Var3 = (f2) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.o2 o2Var = vq0Var3.f6545a;
                    l7 l7Var2 = vq0Var3.f6548e;
                    x60 I = x60.I(o2Var, view);
                    vq0Var3.E = I;
                    if (l7Var2.h()) {
                        if (!y3Var3.d) {
                            l7Var2.d().size();
                        }
                        x60 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new r3(I, 0), false);
                        J.k();
                        v3 v3Var = new v3(y3Var3.getContext(), 0);
                        LinearLayout linearLayout2 = new LinearLayout(y3Var3.getContext());
                        v3Var.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(v3Var, g7.e6.n(-1, -2));
                        if (l7Var2.d().size() + 1 < MessagesController.getInstance(i9).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, y3Var3.getContext(), y3Var3.f6882c, false, false);
                            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i10 = org.telegram.ui.ActionBar.f6.E8;
                            g1Var.c(org.telegram.ui.ActionBar.f6.v0(i10, b6Var2), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var2));
                            g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var2)));
                            g1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            g1Var.setOnClickListener(new fg.f(y3Var3, I, savedStarGift, 5));
                            linearLayout2.addView(g1Var, g7.e6.n(-1, -2));
                        }
                        ArrayList d = l7Var2.d();
                        int size = d.size();
                        int i11 = 0;
                        while (i11 < size) {
                            int i12 = i11 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i11);
                            ArrayList arrayList = l7Var2.e(tL_starGiftCollection.collection_id).f8625l;
                            vq0 vq0Var4 = vq0Var3;
                            int size2 = arrayList.size();
                            f2 f2Var4 = f2Var3;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    linearLayout = linearLayout2;
                                    z12 = false;
                                    break;
                                }
                                Object obj8 = arrayList.get(i13);
                                i13++;
                                int i14 = size2;
                                if (v7.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = true;
                                    break;
                                }
                                size2 = i14;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, y3Var3.getContext(), y3Var3.f6882c, false, false);
                            g1Var2.setChecked(z12);
                            y3 y3Var4 = y3Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i15 = org.telegram.ui.ActionBar.f6.E8;
                            g1Var2.c(org.telegram.ui.ActionBar.f6.v0(i15, b6Var2), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var2));
                            g1Var2.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i15, b6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(3, i9, tL_starGiftCollection.icon);
                                b6Var = b6Var2;
                                g1Var2.getImageView().addOnAttachStateChangeListener(new af.b(k5Var, 8));
                                g1Var2.g(tL_starGiftCollection.title, 0, k5Var);
                                obj6 = null;
                            } else {
                                b6Var = b6Var2;
                                obj6 = null;
                                g1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            l7 l7Var3 = l7Var2;
                            g1Var2.setOnClickListener(new j3(y3Var4, z12, tL_starGiftCollection, savedStarGift, I, 0));
                            linearLayout3.addView(g1Var2, g7.e6.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            y3Var3 = y3Var4;
                            vq0Var3 = vq0Var4;
                            i11 = i12;
                            f2Var3 = f2Var4;
                            l7Var2 = l7Var3;
                            size = size;
                            b6Var2 = b6Var;
                        }
                        y3Var = y3Var3;
                        vq0Var = vq0Var3;
                        f2Var = f2Var3;
                        l7Var = l7Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new k3(I, J, 0), false);
                        I.k();
                    } else {
                        y3Var = y3Var3;
                        vq0Var = vq0Var3;
                        f2Var = f2Var3;
                        l7Var = l7Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (vq0Var.c() && !y3Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            y3Var2 = y3Var;
                            vq0Var2 = vq0Var;
                            f2Var2 = f2Var;
                            z10 = false;
                            I.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new androidx.car.app.utils.c(y3Var2, savedStarGift, f2Var2, view, 3), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new l3(y3Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            y3Var2 = y3Var;
                            vq0Var2 = vq0Var;
                            f2Var2 = f2Var;
                            z10 = false;
                            if (vq0Var2.c() && y3Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new l3(y3Var2, 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i9).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (gh.k5.O1(i9, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean P1 = gh.k5.P1(i9, tL_starGiftUnique);
                            I.c(P1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(P1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            y3 y3Var5 = y3Var2;
                                            x3 x3Var = new x3(y3Var5, y3Var5.getContext(), y3Var5.f6881b, y3Var5.f6880a.f6547c, y3Var5.f6882c, 0);
                                            x3Var.j2(savedStarGift, null);
                                            x3Var.r2(false);
                                            return;
                                        case 1:
                                            y3 y3Var6 = y3Var2;
                                            x3 x3Var2 = new x3(y3Var6, y3Var6.getContext(), y3Var6.f6881b, y3Var6.f6880a.f6547c, y3Var6.f6882c, 1);
                                            x3Var2.j2(savedStarGift, null);
                                            x3Var2.S1();
                                            return;
                                        default:
                                            y3 y3Var7 = y3Var2;
                                            x3 x3Var3 = new x3(y3Var7, y3Var7.getContext(), y3Var7.f6881b, y3Var7.f6880a.f6547c, y3Var7.f6882c, 2);
                                            x3Var3.j2(savedStarGift, null);
                                            x3Var3.Y1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new e5.u(8, y3Var2, str2), str2 != null);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        y3 y3Var5 = y3Var2;
                                        x3 x3Var = new x3(y3Var5, y3Var5.getContext(), y3Var5.f6881b, y3Var5.f6880a.f6547c, y3Var5.f6882c, 0);
                                        x3Var.j2(savedStarGift, null);
                                        x3Var.r2(false);
                                        return;
                                    case 1:
                                        y3 y3Var6 = y3Var2;
                                        x3 x3Var2 = new x3(y3Var6, y3Var6.getContext(), y3Var6.f6881b, y3Var6.f6880a.f6547c, y3Var6.f6882c, 1);
                                        x3Var2.j2(savedStarGift, null);
                                        x3Var2.S1();
                                        return;
                                    default:
                                        y3 y3Var7 = y3Var2;
                                        x3 x3Var3 = new x3(y3Var7, y3Var7.getContext(), y3Var7.f6881b, y3Var7.f6880a.f6547c, y3Var7.f6882c, 2);
                                        x3Var3.j2(savedStarGift, null);
                                        x3Var3.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        y3Var2 = y3Var;
                        vq0Var2 = vq0Var;
                        f2Var2 = f2Var;
                        z10 = false;
                        if (vq0Var2.c() && y3Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new l3(y3Var2, 3), false);
                        }
                    }
                    if (gh.k5.O1(i9, vq0Var2.f6547c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z15 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new androidx.car.app.utils.b(y3Var2, savedStarGift, f2Var2, 14), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        y3 y3Var5 = y3Var2;
                                        x3 x3Var = new x3(y3Var5, y3Var5.getContext(), y3Var5.f6881b, y3Var5.f6880a.f6547c, y3Var5.f6882c, 0);
                                        x3Var.j2(savedStarGift, null);
                                        x3Var.r2(false);
                                        return;
                                    case 1:
                                        y3 y3Var6 = y3Var2;
                                        x3 x3Var2 = new x3(y3Var6, y3Var6.getContext(), y3Var6.f6881b, y3Var6.f6880a.f6547c, y3Var6.f6882c, 1);
                                        x3Var2.j2(savedStarGift, null);
                                        x3Var2.S1();
                                        return;
                                    default:
                                        y3 y3Var7 = y3Var2;
                                        x3 x3Var3 = new x3(y3Var7, y3Var7.getContext(), y3Var7.f6881b, y3Var7.f6880a.f6547c, y3Var7.f6882c, 2);
                                        x3Var3.j2(savedStarGift, null);
                                        x3Var3.Y1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i9).getClientUserId());
                    }
                    if (l7Var.h() && y3Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new androidx.car.app.utils.b(y3Var2, savedStarGift, I, 13), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f34582u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        f2Var2.f6456y.getImageReceiver().startAnimation(z11);
                        z13 = true;
                    }
                    z13 = false;
                }
            }
            z13 = false;
        }
        return Boolean.valueOf(z13);
    }
}
