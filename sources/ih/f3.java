package ih;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import jh.i7;
import jh.s7;
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
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
public final class f3 implements Utilities.Callback5, Utilities.Callback5Return {
    public final n3 f9154a;

    public f3(n3 n3Var) {
        this.f9154a = n3Var;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n3 n3Var = this.f9154a;
        gr0 gr0Var = n3Var.f9293a;
        int i10 = n3Var.f9294b;
        if (n3Var.f9296e == null) {
            return;
        }
        Object obj6 = w41Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (n3Var.f9298n) {
                if (!n3Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = n3Var.f9296e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (n3Var.f9296e.m(savedStarGift, z11, true)) {
                        tc.a0(gr0Var.f9501a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    n3Var.f9297f.u0(0);
                    return;
                }
                return;
            }
            jh.h5 h5Var = new jh.h5(n3Var.getContext(), n3Var.f9294b, gr0Var.f9503c, n3Var.f9295c, null);
            h5Var.Z0 = new a3(n3Var, 2);
            h5Var.K0 = new a9.s(21, n3Var, savedStarGift);
            h5Var.j2(savedStarGift, n3Var.f9296e);
            h5Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n3 n3Var;
        gr0 gr0Var;
        y1 y1Var;
        i7 i7Var;
        String str;
        final n3 n3Var2;
        gr0 gr0Var2;
        y1 y1Var2;
        boolean z10;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        org.telegram.ui.ActionBar.c6 c6Var;
        Object obj6;
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n3 n3Var3 = this.f9154a;
        org.telegram.ui.ActionBar.c6 c6Var2 = n3Var3.f9295c;
        int i10 = n3Var3.f9294b;
        gr0 gr0Var3 = n3Var3.f9293a;
        boolean z13 = false;
        if (n3Var3.f9296e != null) {
            if (view instanceof y1) {
                Object obj7 = w41Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    y1 y1Var3 = (y1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.o2 o2Var = gr0Var3.f9501a;
                    i7 i7Var2 = gr0Var3.f9504e;
                    j70 I = j70.I(o2Var, view);
                    gr0Var3.E = I;
                    if (i7Var2.h()) {
                        if (!n3Var3.d) {
                            i7Var2.d().size();
                        }
                        j70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new g3(I, 0), false);
                        J.k();
                        k3 k3Var = new k3(n3Var3.getContext(), 0);
                        LinearLayout linearLayout2 = new LinearLayout(n3Var3.getContext());
                        k3Var.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(k3Var, i7.f6.n(-1, -2));
                        if (i7Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, n3Var3.getContext(), n3Var3.f9295c, false, false);
                            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = g6.E8;
                            g1Var.c(g6.v0(i11, c6Var2), g6.v0(g6.F8, c6Var2));
                            g1Var.setSelectorColor(g6.l1(0.12f, g6.v0(i11, c6Var2)));
                            g1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            g1Var.setOnClickListener(new bg.q(n3Var3, I, savedStarGift, 6));
                            linearLayout2.addView(g1Var, i7.f6.n(-1, -2));
                        }
                        ArrayList d = i7Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = i7Var2.e(tL_starGiftCollection.collection_id).f12387l;
                            gr0 gr0Var4 = gr0Var3;
                            int size2 = arrayList.size();
                            y1 y1Var4 = y1Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    linearLayout = linearLayout2;
                                    z12 = false;
                                    break;
                                }
                                Object obj8 = arrayList.get(i14);
                                i14++;
                                int i15 = size2;
                                if (s7.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = true;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, n3Var3.getContext(), n3Var3.f9295c, false, false);
                            g1Var2.setChecked(z12);
                            n3 n3Var4 = n3Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = g6.E8;
                            g1Var2.c(g6.v0(i16, c6Var2), g6.v0(g6.F8, c6Var2));
                            g1Var2.setSelectorColor(g6.l1(0.12f, g6.v0(i16, c6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(3, i10, tL_starGiftCollection.icon);
                                c6Var = c6Var2;
                                g1Var2.getImageView().addOnAttachStateChangeListener(new df.b(p5Var, 8));
                                g1Var2.g(tL_starGiftCollection.title, 0, p5Var);
                                obj6 = null;
                            } else {
                                c6Var = c6Var2;
                                obj6 = null;
                                g1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            i7 i7Var3 = i7Var2;
                            g1Var2.setOnClickListener(new y2(n3Var4, z12, tL_starGiftCollection, savedStarGift, I, 0));
                            linearLayout3.addView(g1Var2, i7.f6.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            n3Var3 = n3Var4;
                            gr0Var3 = gr0Var4;
                            i12 = i13;
                            y1Var3 = y1Var4;
                            i7Var2 = i7Var3;
                            size = size;
                            c6Var2 = c6Var;
                        }
                        n3Var = n3Var3;
                        gr0Var = gr0Var3;
                        y1Var = y1Var3;
                        i7Var = i7Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new z2(I, J, 0), false);
                        I.k();
                    } else {
                        n3Var = n3Var3;
                        gr0Var = gr0Var3;
                        y1Var = y1Var3;
                        i7Var = i7Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (gr0Var.c() && !n3Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            n3Var2 = n3Var;
                            gr0Var2 = gr0Var;
                            y1Var2 = y1Var;
                            z10 = false;
                            I.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new androidx.car.app.utils.c(n3Var2, savedStarGift, y1Var2, view, 5), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new a3(n3Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            n3Var2 = n3Var;
                            gr0Var2 = gr0Var;
                            y1Var2 = y1Var;
                            z10 = false;
                            if (gr0Var2.c() && n3Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new a3(n3Var2, 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (jh.h5.O1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean P1 = jh.h5.P1(i10, tL_starGiftUnique);
                            I.c(P1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(P1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            n3 n3Var5 = n3Var2;
                                            m3 m3Var = new m3(n3Var5, n3Var5.getContext(), n3Var5.f9294b, n3Var5.f9293a.f9503c, n3Var5.f9295c, 0);
                                            m3Var.j2(savedStarGift, null);
                                            m3Var.r2(false);
                                            return;
                                        case 1:
                                            n3 n3Var6 = n3Var2;
                                            m3 m3Var2 = new m3(n3Var6, n3Var6.getContext(), n3Var6.f9294b, n3Var6.f9293a.f9503c, n3Var6.f9295c, 1);
                                            m3Var2.j2(savedStarGift, null);
                                            m3Var2.S1();
                                            return;
                                        default:
                                            n3 n3Var7 = n3Var2;
                                            m3 m3Var3 = new m3(n3Var7, n3Var7.getContext(), n3Var7.f9294b, n3Var7.f9293a.f9503c, n3Var7.f9295c, 2);
                                            m3Var3.j2(savedStarGift, null);
                                            m3Var3.Y1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new ef.c(22, n3Var2, str2), str2 != null);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        n3 n3Var5 = n3Var2;
                                        m3 m3Var = new m3(n3Var5, n3Var5.getContext(), n3Var5.f9294b, n3Var5.f9293a.f9503c, n3Var5.f9295c, 0);
                                        m3Var.j2(savedStarGift, null);
                                        m3Var.r2(false);
                                        return;
                                    case 1:
                                        n3 n3Var6 = n3Var2;
                                        m3 m3Var2 = new m3(n3Var6, n3Var6.getContext(), n3Var6.f9294b, n3Var6.f9293a.f9503c, n3Var6.f9295c, 1);
                                        m3Var2.j2(savedStarGift, null);
                                        m3Var2.S1();
                                        return;
                                    default:
                                        n3 n3Var7 = n3Var2;
                                        m3 m3Var3 = new m3(n3Var7, n3Var7.getContext(), n3Var7.f9294b, n3Var7.f9293a.f9503c, n3Var7.f9295c, 2);
                                        m3Var3.j2(savedStarGift, null);
                                        m3Var3.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        n3Var2 = n3Var;
                        gr0Var2 = gr0Var;
                        y1Var2 = y1Var;
                        z10 = false;
                        if (gr0Var2.c() && n3Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new a3(n3Var2, 3), false);
                        }
                    }
                    if (jh.h5.O1(i10, gr0Var2.f9503c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z15 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new androidx.car.app.utils.b(n3Var2, savedStarGift, y1Var2, 14), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        n3 n3Var5 = n3Var2;
                                        m3 m3Var = new m3(n3Var5, n3Var5.getContext(), n3Var5.f9294b, n3Var5.f9293a.f9503c, n3Var5.f9295c, 0);
                                        m3Var.j2(savedStarGift, null);
                                        m3Var.r2(false);
                                        return;
                                    case 1:
                                        n3 n3Var6 = n3Var2;
                                        m3 m3Var2 = new m3(n3Var6, n3Var6.getContext(), n3Var6.f9294b, n3Var6.f9293a.f9503c, n3Var6.f9295c, 1);
                                        m3Var2.j2(savedStarGift, null);
                                        m3Var2.S1();
                                        return;
                                    default:
                                        n3 n3Var7 = n3Var2;
                                        m3 m3Var3 = new m3(n3Var7, n3Var7.getContext(), n3Var7.f9294b, n3Var7.f9293a.f9503c, n3Var7.f9295c, 2);
                                        m3Var3.j2(savedStarGift, null);
                                        m3Var3.Y1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId());
                    }
                    if (i7Var.h() && n3Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new androidx.car.app.utils.b(n3Var2, savedStarGift, I, 13), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f29602u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        y1Var2.f9538y.getImageReceiver().startAnimation(z11);
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
