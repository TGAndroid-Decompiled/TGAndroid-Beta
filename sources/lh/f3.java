package lh;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import mh.j7;
import mh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
public final class f3 implements Utilities.Callback5, Utilities.Callback5Return {
    public final n3 f12740a;

    public f3(n3 n3Var) {
        this.f12740a = n3Var;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n3 n3Var = this.f12740a;
        pr0 pr0Var = n3Var.f12860a;
        int i10 = n3Var.f12861b;
        if (n3Var.f12863e == null) {
            return;
        }
        Object obj6 = j51Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (n3Var.f12865n) {
                if (!n3Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z4 = savedStarGift.pinned_to_top;
                    boolean z10 = !z4;
                    if (!z4 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = n3Var.f12863e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (n3Var.f12863e.m(savedStarGift, z10, true)) {
                        qc.a0(pr0Var.f13098a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z4) {
                        return;
                    }
                    n3Var.f12864f.u0(0);
                    return;
                }
                return;
            }
            mh.g5 g5Var = new mh.g5(n3Var.getContext(), n3Var.f12861b, pr0Var.f13100c, n3Var.f12862c, null);
            g5Var.f14084a1 = new z2(n3Var, 2);
            g5Var.L0 = new c1.b(24, n3Var, savedStarGift);
            g5Var.j2(savedStarGift, n3Var.f12863e);
            g5Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n3 n3Var;
        pr0 pr0Var;
        x1 x1Var;
        j7 j7Var;
        String str;
        final n3 n3Var2;
        pr0 pr0Var2;
        x1 x1Var2;
        boolean z4;
        boolean z10;
        String str2;
        LinearLayout linearLayout;
        boolean z11;
        g6 g6Var;
        Object obj6;
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n3 n3Var3 = this.f12740a;
        g6 g6Var2 = n3Var3.f12862c;
        int i10 = n3Var3.f12861b;
        pr0 pr0Var3 = n3Var3.f12860a;
        boolean z12 = false;
        if (n3Var3.f12863e != null) {
            if (view instanceof x1) {
                Object obj7 = j51Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    x1 x1Var3 = (x1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.p2 p2Var = pr0Var3.f13098a;
                    j7 j7Var2 = pr0Var3.f13101e;
                    q70 I = q70.I(p2Var, view);
                    pr0Var3.F = I;
                    if (j7Var2.h()) {
                        if (!n3Var3.d) {
                            j7Var2.d().size();
                        }
                        q70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new g3(I, 0), false);
                        J.k();
                        k3 k3Var = new k3(n3Var3.getContext(), 0);
                        LinearLayout linearLayout2 = new LinearLayout(n3Var3.getContext());
                        k3Var.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(k3Var, k7.c6.n(-1, -2));
                        if (j7Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, n3Var3.getContext(), n3Var3.f12862c, false, false);
                            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = k6.E8;
                            g1Var.c(k6.v0(i11, g6Var2), k6.v0(k6.F8, g6Var2));
                            g1Var.setSelectorColor(k6.l1(0.12f, k6.v0(i11, g6Var2)));
                            g1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            g1Var.setOnClickListener(new eg.o(n3Var3, I, savedStarGift, 6));
                            linearLayout2.addView(g1Var, k7.c6.n(-1, -2));
                        }
                        ArrayList d = j7Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = j7Var2.e(tL_starGiftCollection.collection_id).f14405l;
                            pr0 pr0Var4 = pr0Var3;
                            int size2 = arrayList.size();
                            x1 x1Var4 = x1Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    linearLayout = linearLayout2;
                                    z11 = false;
                                    break;
                                }
                                Object obj8 = arrayList.get(i14);
                                i14++;
                                int i15 = size2;
                                if (t7.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z11 = true;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, n3Var3.getContext(), n3Var3.f12862c, false, false);
                            g1Var2.setChecked(z11);
                            n3 n3Var4 = n3Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = k6.E8;
                            g1Var2.c(k6.v0(i16, g6Var2), k6.v0(k6.F8, g6Var2));
                            g1Var2.setSelectorColor(k6.l1(0.12f, k6.v0(i16, g6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                org.telegram.ui.Components.l5 l5Var = new org.telegram.ui.Components.l5(3, i10, tL_starGiftCollection.icon);
                                g6Var = g6Var2;
                                g1Var2.getImageView().addOnAttachStateChangeListener(new ff.b(l5Var, 8));
                                g1Var2.g(tL_starGiftCollection.title, 0, l5Var);
                                obj6 = null;
                            } else {
                                g6Var = g6Var2;
                                obj6 = null;
                                g1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            j7 j7Var3 = j7Var2;
                            g1Var2.setOnClickListener(new x2(n3Var4, z11, tL_starGiftCollection, savedStarGift, I, 0));
                            linearLayout3.addView(g1Var2, k7.c6.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            n3Var3 = n3Var4;
                            pr0Var3 = pr0Var4;
                            i12 = i13;
                            x1Var3 = x1Var4;
                            j7Var2 = j7Var3;
                            size = size;
                            g6Var2 = g6Var;
                        }
                        n3Var = n3Var3;
                        pr0Var = pr0Var3;
                        x1Var = x1Var3;
                        j7Var = j7Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new y2(I, J, 0), false);
                        I.k();
                    } else {
                        n3Var = n3Var3;
                        pr0Var = pr0Var3;
                        x1Var = x1Var3;
                        j7Var = j7Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (pr0Var.c() && !n3Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z13 = savedStarGift.pinned_to_top;
                            n3Var2 = n3Var;
                            pr0Var2 = pr0Var;
                            x1Var2 = x1Var;
                            z4 = false;
                            I.c(z13 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z13 ? R.string.Gift2Unpin : R.string.Gift2Pin), new androidx.car.app.utils.c(n3Var2, savedStarGift, x1Var2, view, 5), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new z2(n3Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            n3Var2 = n3Var;
                            pr0Var2 = pr0Var;
                            x1Var2 = x1Var;
                            z4 = false;
                            if (pr0Var2.c() && n3Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new z2(n3Var2, 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (mh.g5.O1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean P1 = mh.g5.P1(i10, tL_starGiftUnique);
                            I.c(P1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(P1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            n3 n3Var5 = n3Var2;
                                            m3 m3Var = new m3(n3Var5, n3Var5.getContext(), n3Var5.f12861b, n3Var5.f12860a.f13100c, n3Var5.f12862c, 0);
                                            m3Var.j2(savedStarGift, null);
                                            m3Var.r2(false);
                                            return;
                                        case 1:
                                            n3 n3Var6 = n3Var2;
                                            m3 m3Var2 = new m3(n3Var6, n3Var6.getContext(), n3Var6.f12861b, n3Var6.f12860a.f13100c, n3Var6.f12862c, 1);
                                            m3Var2.j2(savedStarGift, null);
                                            m3Var2.S1();
                                            return;
                                        default:
                                            n3 n3Var7 = n3Var2;
                                            m3 m3Var3 = new m3(n3Var7, n3Var7.getContext(), n3Var7.f12861b, n3Var7.f12860a.f13100c, n3Var7.f12862c, 2);
                                            m3Var3.j2(savedStarGift, null);
                                            m3Var3.Y1();
                                            return;
                                    }
                                }
                            }, z4);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new gf.c(26, n3Var2, str2), str2 != null);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        n3 n3Var5 = n3Var2;
                                        m3 m3Var = new m3(n3Var5, n3Var5.getContext(), n3Var5.f12861b, n3Var5.f12860a.f13100c, n3Var5.f12862c, 0);
                                        m3Var.j2(savedStarGift, null);
                                        m3Var.r2(false);
                                        return;
                                    case 1:
                                        n3 n3Var6 = n3Var2;
                                        m3 m3Var2 = new m3(n3Var6, n3Var6.getContext(), n3Var6.f12861b, n3Var6.f12860a.f13100c, n3Var6.f12862c, 1);
                                        m3Var2.j2(savedStarGift, null);
                                        m3Var2.S1();
                                        return;
                                    default:
                                        n3 n3Var7 = n3Var2;
                                        m3 m3Var3 = new m3(n3Var7, n3Var7.getContext(), n3Var7.f12861b, n3Var7.f12860a.f13100c, n3Var7.f12862c, 2);
                                        m3Var3.j2(savedStarGift, null);
                                        m3Var3.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        n3Var2 = n3Var;
                        pr0Var2 = pr0Var;
                        x1Var2 = x1Var;
                        z4 = false;
                        if (pr0Var2.c() && n3Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new z2(n3Var2, 3), false);
                        }
                    }
                    if (mh.g5.O1(i10, pr0Var2.f13100c)) {
                        boolean z14 = savedStarGift.unsaved;
                        I.c(z14 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z14 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new androidx.car.app.utils.b(n3Var2, savedStarGift, x1Var2, 17), z4);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        n3 n3Var5 = n3Var2;
                                        m3 m3Var = new m3(n3Var5, n3Var5.getContext(), n3Var5.f12861b, n3Var5.f12860a.f13100c, n3Var5.f12862c, 0);
                                        m3Var.j2(savedStarGift, null);
                                        m3Var.r2(false);
                                        return;
                                    case 1:
                                        n3 n3Var6 = n3Var2;
                                        m3 m3Var2 = new m3(n3Var6, n3Var6.getContext(), n3Var6.f12861b, n3Var6.f12860a.f13100c, n3Var6.f12862c, 1);
                                        m3Var2.j2(savedStarGift, null);
                                        m3Var2.S1();
                                        return;
                                    default:
                                        n3 n3Var7 = n3Var2;
                                        m3 m3Var3 = new m3(n3Var7, n3Var7.getContext(), n3Var7.f12861b, n3Var7.f12860a.f13100c, n3Var7.f12862c, 2);
                                        m3Var3.j2(savedStarGift, null);
                                        m3Var3.Y1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId());
                    }
                    if (j7Var.h() && n3Var2.d) {
                        z10 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new androidx.car.app.utils.b(n3Var2, savedStarGift, I, 16), true);
                        I.E();
                        I.t();
                    } else {
                        z10 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f30331u = z10;
                        I.v = z10;
                        I.L = z10;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z10;
                        I.W = z10;
                        I.Z();
                        x1Var2.f13092y.getImageReceiver().startAnimation(z10);
                        z12 = true;
                    }
                    z12 = false;
                }
            }
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
