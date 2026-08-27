package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.a61;

public final class y1 extends f2.q0 {
    public final TLRPC.TL_inputStickerSetShortName A;
    public TLRPC.TL_messages_stickerSet B;
    public TLRPC.TL_messages_stickerSet C;
    public String D;
    public String E;
    public String[] F;
    public int G;
    public final z1 J;

    public int f17070c;

    public boolean f17076w;
    public final HashMap d = new HashMap();

    public final HashMap f17071e = new HashMap();

    public final HashMap f17072f = new HashMap();
    public final ArrayList h = new ArrayList();

    public final ArrayList f17073n = new ArrayList();

    public final ArrayList f17074r = new ArrayList();

    public final ArrayList f17075s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public int f17077x = 0;

    public final SparseIntArray f17078y = new SparseIntArray();
    public final HashSet H = new HashSet();
    public final kh.c I = new kh.c(this, 9);

    public y1(z1 z1Var) {
        this.J = z1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.A = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(String str) {
        z1 z1Var;
        TLRPC.TL_messages_stickerSet stickerSet;
        z1 z1Var2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSet2;
        int i11;
        z1 z1Var3;
        ArrayList arrayList;
        int i12;
        int i13;
        TLRPC.StickerSet stickerSet3;
        z1 z1Var4 = this.J;
        x1 x1Var = z1Var4.f17175e;
        l2 l2Var = z1Var4.f17179s;
        this.D = str;
        kh.c cVar = this.I;
        int i14 = 1;
        if (str != null) {
            z1Var4.f17176f.c(true);
            x1Var.n(false);
            AndroidUtilities.cancelRunOnUIThread(cVar);
            AndroidUtilities.runOnUIThread(cVar, 100L);
            return;
        }
        x1Var.n(true);
        AndroidUtilities.cancelRunOnUIThread(cVar);
        MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount);
        this.f17077x = 0;
        ArrayList arrayList2 = this.f17075s;
        arrayList2.clear();
        this.v.clear();
        SparseIntArray sparseIntArray = this.f17078y;
        sparseIntArray.clear();
        ArrayList arrayList3 = this.f17073n;
        arrayList3.clear();
        ArrayList arrayList4 = this.h;
        arrayList4.clear();
        HashMap map = this.f17072f;
        map.clear();
        this.f17077x++;
        boolean z10 = false;
        arrayList2.add(null);
        ArrayList arrayList5 = this.f17074r;
        arrayList5.clear();
        if (z1Var4.f16935a == 1) {
            if (l2Var.B != null && (l2Var.m0(0) || l2Var.m0(1) || l2Var.m0(2) || l2Var.m0(3) || l2Var.m0(4))) {
                arrayList2.add(l2Var.d);
                this.f17077x++;
            }
            ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(2);
            if (recentStickers != null && !recentStickers.isEmpty()) {
                if (this.B == null) {
                    this.B = new TLRPC.TL_messages_stickerSet();
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.B;
                tL_messages_stickerSet.documents = recentStickers;
                tL_messages_stickerSet.set = new TLRPC.TL_stickerSet();
                this.B.set.title = LocaleController.getString(R.string.FavoriteStickers);
                arrayList3.add(this.B);
            }
            ArrayList<TLRPC.Document> recentStickers2 = mediaDataController.getRecentStickers(0);
            if (recentStickers2 != null && !recentStickers2.isEmpty()) {
                if (this.C == null) {
                    this.C = new TLRPC.TL_messages_stickerSet();
                }
                this.C.documents = recentStickers2;
                if (l2Var.A != null) {
                    recentStickers2.add(0, l2Var.f16287e);
                }
                this.C.set = new TLRPC.TL_stickerSet();
                this.C.set.title = LocaleController.getString(R.string.RecentStickers);
                arrayList3.add(this.C);
            }
        }
        arrayList3.addAll(mediaDataController.getStickerSets(z1Var4.f16935a == 0 ? 5 : 0));
        int i15 = 0;
        while (i15 < arrayList3.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList3.get(i15);
            sparseIntArray.put(this.f17077x, i15);
            arrayList2.add(z10);
            this.f17077x += i14;
            arrayList2.addAll(tL_messages_stickerSet2.documents);
            this.f17077x = tL_messages_stickerSet2.documents.size() + this.f17077x;
            Object obj = tL_messages_stickerSet2 == this.C ? "recent" : tL_messages_stickerSet2 == this.B ? "fav" : tL_messages_stickerSet2;
            int i16 = 0;
            while (i16 < tL_messages_stickerSet2.documents.size()) {
                map.put(Long.valueOf(tL_messages_stickerSet2.documents.get(i16).f22386id), obj);
                i16++;
                l2Var = l2Var;
                x1Var = x1Var;
            }
            x1 x1Var2 = x1Var;
            l2 l2Var2 = l2Var;
            kx kxVar = new kx();
            kxVar.f30206c = tL_messages_stickerSet2.documents;
            kxVar.f30205b = tL_messages_stickerSet2.set;
            kxVar.f30208f = true;
            kxVar.f30209g = false;
            kxVar.h = true;
            kxVar.f30207e = true;
            if (tL_messages_stickerSet2 == this.B) {
                kxVar.f30211j = R.drawable.emoji_tabs_faves;
            } else if (tL_messages_stickerSet2 == this.C) {
                kxVar.f30211j = R.drawable.msg_emoji_recent;
            }
            arrayList5.add(kxVar);
            arrayList4.add(tL_messages_stickerSet2);
            i15++;
            l2Var = l2Var2;
            x1Var = x1Var2;
            i14 = 1;
            z10 = false;
        }
        x1 x1Var3 = x1Var;
        l2 l2Var3 = l2Var;
        if (z1Var4.f16935a == 0) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            if (featuredEmojiSets != null) {
                int i17 = 0;
                while (i17 < featuredEmojiSets.size()) {
                    TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i17);
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        stickerSet2 = MediaDataController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var3).currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                        if (stickerSet2 != null) {
                            z1Var2 = z1Var4;
                            i10 = i17;
                            if (stickerSet2.set == null) {
                                i12 = 0;
                                while (true) {
                                    if (i12 < arrayList5.size()) {
                                        arrayList3.add(stickerSet2);
                                        arrayList4.add(stickerSet2);
                                        sparseIntArray.put(this.f17077x, i15);
                                        i15++;
                                        arrayList2.add(null);
                                        this.f17077x++;
                                        arrayList2.addAll(stickerSet2.documents);
                                        this.f17077x = stickerSet2.documents.size() + this.f17077x;
                                        for (i13 = 0; i13 < stickerSet2.documents.size(); i13++) {
                                            map.put(Long.valueOf(stickerSet2.documents.get(i13).f22386id), stickerSet2);
                                        }
                                        kx kxVar2 = new kx();
                                        kxVar2.f30206c = stickerSet2.documents;
                                        kxVar2.f30205b = stickerSet2.set;
                                        kxVar2.f30208f = false;
                                        kxVar2.f30209g = true;
                                        kxVar2.h = true;
                                        kxVar2.f30207e = true;
                                        arrayList5.add(kxVar2);
                                        break;
                                    }
                                    stickerSet3 = ((kx) arrayList5.get(i12)).f30205b;
                                    if (stickerSet3 != null && stickerSet3.f22407id == stickerSet2.set.f22407id) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        } else {
                            z1Var2 = z1Var4;
                            featuredEmojiSets = featuredEmojiSets;
                            i10 = i17;
                        }
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                        tL_messages_stickerSet3.set = stickerSet4;
                        tL_messages_stickerSet3.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                        int i18 = i17;
                        Long lValueOf = Long.valueOf(stickerSet4.f22407id);
                        HashMap map2 = this.f17071e;
                        ArrayList<TLRPC.TL_stickerPack> arrayList6 = (ArrayList) map2.get(lValueOf);
                        tL_messages_stickerSet3.packs = arrayList6;
                        if (arrayList6 == null) {
                            HashMap map3 = new HashMap();
                            int i19 = 0;
                            while (i19 < tL_messages_stickerSet3.documents.size()) {
                                TLRPC.Document document = tL_messages_stickerSet3.documents.get(i19);
                                if (document == null) {
                                    z1Var3 = z1Var4;
                                    i11 = i19;
                                } else {
                                    i11 = i19;
                                    ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(MessageObject.findAnimatedEmojiEmoticon(document, null));
                                    z1Var3 = z1Var4;
                                    if (emojis != null) {
                                        int iF = 0;
                                        while (iF < emojis.size()) {
                                            String string = emojis.get(iF).code.toString();
                                            ArrayList arrayList7 = (ArrayList) map3.get(string);
                                            ArrayList<Emoji.EmojiSpanRange> arrayList8 = emojis;
                                            if (arrayList7 == null) {
                                                arrayList = new ArrayList();
                                                map3.put(string, arrayList);
                                            } else {
                                                arrayList = arrayList7;
                                            }
                                            HashMap map4 = map3;
                                            iF = com.google.android.recaptcha.internal.a.f(document.f22386id, arrayList, iF, 1);
                                            map3 = map4;
                                            emojis = arrayList8;
                                            document = document;
                                        }
                                        map3 = map3;
                                    }
                                    i19 = i11 + 1;
                                    i18 = i18;
                                    z1Var4 = z1Var3;
                                    map3 = map3;
                                }
                                i19 = i11 + 1;
                                i18 = i18;
                                z1Var4 = z1Var3;
                                map3 = map3;
                            }
                            z1Var2 = z1Var4;
                            i10 = i18;
                            tL_messages_stickerSet3.packs = new ArrayList<>();
                            for (Map.Entry entry : map3.entrySet()) {
                                TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                tL_stickerPack.emoticon = (String) entry.getKey();
                                tL_stickerPack.documents = (ArrayList) entry.getValue();
                                tL_messages_stickerSet3.packs.add(tL_stickerPack);
                            }
                            map2.put(Long.valueOf(tL_messages_stickerSet3.set.f22407id), tL_messages_stickerSet3.packs);
                        } else {
                            z1Var2 = z1Var4;
                            i10 = i18;
                        }
                        stickerSet2 = tL_messages_stickerSet3;
                        if (stickerSet2.set == null) {
                            i12 = 0;
                            while (true) {
                                if (i12 < arrayList5.size()) {
                                    arrayList3.add(stickerSet2);
                                    arrayList4.add(stickerSet2);
                                    sparseIntArray.put(this.f17077x, i15);
                                    i15++;
                                    arrayList2.add(null);
                                    this.f17077x++;
                                    arrayList2.addAll(stickerSet2.documents);
                                    this.f17077x = stickerSet2.documents.size() + this.f17077x;
                                    while (i13 < stickerSet2.documents.size()) {
                                        map.put(Long.valueOf(stickerSet2.documents.get(i13).f22386id), stickerSet2);
                                    }
                                    kx kxVar3 = new kx();
                                    kxVar3.f30206c = stickerSet2.documents;
                                    kxVar3.f30205b = stickerSet2.set;
                                    kxVar3.f30208f = false;
                                    kxVar3.f30209g = true;
                                    kxVar3.h = true;
                                    kxVar3.f30207e = true;
                                    arrayList5.add(kxVar3);
                                    break;
                                    break;
                                }
                                stickerSet3 = ((kx) arrayList5.get(i12)).f30205b;
                                if (stickerSet3 != null) {
                                    break;
                                    break;
                                }
                                i12++;
                            }
                        }
                    } else {
                        z1Var2 = z1Var4;
                        featuredEmojiSets = featuredEmojiSets;
                        i10 = i17;
                    }
                    i17 = i10 + 1;
                    featuredEmojiSets = featuredEmojiSets;
                    z1Var4 = z1Var2;
                }
            }
            z1 z1Var5 = z1Var4;
            boolean zContains = false;
            for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                try {
                    zContains = ((TLRPC.TL_messages_stickerSet) arrayList4.get(i20)).set.title.toLowerCase().contains("staticemoji");
                } catch (Exception unused) {
                }
                if (zContains) {
                    break;
                }
            }
            if (!zContains && (stickerSet = mediaDataController.getStickerSet((TLRPC.InputStickerSet) this.A, false)) != null) {
                arrayList4.add(stickerSet);
            }
            z1Var = z1Var5;
        } else {
            z1Var = z1Var4;
        }
        z1Var.f17178r = true;
        if (this.f17070c != arrayList4.size()) {
            HashMap map5 = this.d;
            map5.clear();
            for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i21);
                if (tL_messages_stickerSet4 != null) {
                    for (int i22 = 0; i22 < tL_messages_stickerSet4.packs.size(); i22++) {
                        String str2 = tL_messages_stickerSet4.packs.get(i22).emoticon;
                        ArrayList arrayList9 = (ArrayList) map5.get(str2);
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                            map5.put(str2, arrayList9);
                        }
                        arrayList9.addAll(tL_messages_stickerSet4.packs.get(i22).documents);
                    }
                }
            }
            this.f17070c = arrayList4.size();
        }
        this.f17076w = false;
        x1Var3.p(arrayList5);
        this.E = null;
        l();
    }

    @Override
    public final int h() {
        return this.f17077x;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f17076w && i10 == this.f17077x - 1) {
            return 3;
        }
        if (this.f17078y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 < 0) {
            return 2;
        }
        ArrayList arrayList = this.f17075s;
        return (i10 >= arrayList.size() || arrayList.get(i10) != this.J.f17179s.d) ? 2 : 4;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.StickerSet stickerSet;
        z1 z1Var = this.J;
        l2 l2Var = z1Var.f17179s;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.y0(-1, (int) l2Var.f16289n));
            return;
        }
        if (i11 == 1) {
            int i12 = this.f17078y.get(i10);
            if (i12 >= 0) {
                ArrayList arrayList = this.f17073n;
                if (i12 >= arrayList.size()) {
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                if (this.E == null) {
                    j8Var.b(0, str);
                    return;
                }
                int iIndexOf = str.toLowerCase().indexOf(this.E.toLowerCase());
                if (iIndexOf < 0) {
                    j8Var.b(0, str);
                    return;
                } else {
                    j8Var.c(str, 0, null, iIndexOf, this.E.length());
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                w1 w1Var = (w1) view;
                int i13 = this.G;
                if (w1Var.f16969b != i13) {
                    w1Var.f16969b = i13;
                    a61.D(UserConfig.selectedAccount, w1Var.f16968a);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.f17075s;
        TLRPC.Document document = i10 >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i10);
        n1 n1Var = (n1) view;
        if (document == l2Var.f16287e) {
            n1Var.setSticker(null);
            int iDp = AndroidUtilities.dp(28.0f);
            int i14 = org.telegram.ui.ActionBar.g6.Me;
            ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.l1(0.12f, l2Var.getThemedColor(i14)));
            Drawable drawableMutate = z1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(l2Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
            dq dqVar = new dq(shapeDrawableB0, drawableMutate);
            int iDp2 = AndroidUtilities.dp(56.0f);
            int iDp3 = AndroidUtilities.dp(56.0f);
            dqVar.h = iDp2;
            dqVar.f27825n = iDp3;
            int iDp4 = AndroidUtilities.dp(24.0f);
            int iDp5 = AndroidUtilities.dp(24.0f);
            dqVar.f27823e = iDp4;
            dqVar.f27824f = iDp5;
            dqVar.f27826r = true;
            n1Var.setDrawable(dqVar);
            return;
        }
        ArrayList arrayList3 = this.v;
        long jLongValue = i10 >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i10)).longValue();
        if (document == null && jLongValue == 0) {
            return;
        }
        int i15 = z1Var.f16935a;
        if (i15 != 0) {
            n1Var.a(null, i15 == 1);
            n1Var.setSticker(document);
            return;
        }
        if (document != null) {
            n1Var.setSticker(null);
            n1Var.a(document, z1Var.f16935a == 1);
            return;
        }
        n1Var.setSticker(null);
        boolean z10 = z1Var.f16935a == 1;
        if (n1Var.f16417f == jLongValue) {
            return;
        }
        org.telegram.ui.Components.k5 k5Var = n1Var.f16415c;
        if (k5Var != null) {
            k5Var.o(n1Var);
        }
        if (jLongValue == 0) {
            n1Var.f16413a = false;
            n1Var.f16417f = 0L;
            n1Var.f16415c = null;
            return;
        }
        n1Var.f16413a = true;
        n1Var.f16417f = jLongValue;
        org.telegram.ui.Components.k5 k5VarN = org.telegram.ui.Components.k5.n(n1Var.f16414b, jLongValue, null, LiteMode.isEnabled(z10 ? 1 : 16388) ? 3 : 13);
        n1Var.f16415c = k5VarN;
        if (n1Var.f16420s) {
            k5VarN.a(n1Var);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j8Var;
        z1 z1Var = this.J;
        l2 l2Var = z1Var.f17179s;
        if (i10 == 0) {
            j8Var = new View(z1Var.getContext());
        } else if (i10 == 1) {
            j8Var = new org.telegram.ui.Cells.j8(z1Var.getContext(), true, false, ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider, false);
        } else if (i10 == 3) {
            Context context = z1Var.getContext();
            boolean z10 = z1Var.f16935a == 0;
            w1 w1Var = new w1(context);
            w1Var.f16969b = -1;
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            w1Var.f16968a = n9Var;
            w1Var.addView(n9Var, h7.z5.e(36, 36, 17));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z10 ? R.string.NoEmojiFound : R.string.NoStickersFound));
            w1Var.addView(textView, h7.z5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            j8Var = w1Var;
        } else if (i10 == 4) {
            j2 j2Var = new j2(l2Var, z1Var.getContext());
            j2Var.f16171e = new d1(l2Var, 2);
            j8Var = j2Var;
        } else {
            j8Var = new n1(z1Var.getContext(), z1Var.f17173b);
        }
        return new lk0(j8Var);
    }
}
