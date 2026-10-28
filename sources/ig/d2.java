package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.i8;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
public final class d2 extends mm0 {
    public ImageView L;
    public TextView M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public String R;
    public final u6 T;
    public final Context d;
    public final e61 e;
    public final TLRPC.StickerSetCovered[] f14031f;
    public final LongSparseArray h;
    public final LongSparseArray f14032n;
    public int f14037y;
    public final int f14030c = UserConfig.selectedAccount;
    public final SparseArray f14033r = new SparseArray();
    public final SparseArray f14034s = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseIntArray f14035w = new SparseIntArray();
    public final SparseArray f14036x = new SparseArray();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final HashMap G = new HashMap();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public final ArrayList J = new ArrayList();
    public final SparseArray K = new SparseArray();
    public final b2 S = new b2(this);

    public d2(Context context, e61 e61Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, u6 u6Var) {
        this.d = context;
        this.e = e61Var;
        this.f14031f = stickerSetCoveredArr;
        this.h = longSparseArray;
        this.f14032n = longSparseArray2;
        this.T = u6Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void E(q3 q3Var, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int indexOfIgnoreCase;
        q3 q3Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11 = this.f14030c;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f14034s.get(i10);
        boolean z17 = true;
        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f22055id))) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f14031f;
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i12].set.f22055id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f22055id == stickerSetCovered.set.f22055id) {
                        z12 = true;
                        break;
                    }
                }
                i12++;
            } else {
                z12 = false;
                break;
            }
        }
        if (TextUtils.isEmpty(this.R)) {
            indexOfIgnoreCase = -1;
        } else {
            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.R);
        }
        int i13 = indexOfIgnoreCase;
        if (i13 >= 0) {
            q3Var2 = q3Var;
            z13 = z10;
            q3Var2.c(stickerSetCovered, z11, z13, i13, this.R.length(), z12);
        } else {
            q3Var2 = q3Var;
            z13 = z10;
            q3Var2.c(stickerSetCovered, z11, z13, 0, 0, z12);
            if (!TextUtils.isEmpty(this.R) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.R) == 0) {
                q3Var2.d(this.R.length(), stickerSetCovered.set.short_name);
            }
        }
        if (z11) {
            mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f22055id);
        }
        long j10 = stickerSetCovered.set.f22055id;
        LongSparseArray longSparseArray = this.h;
        if (longSparseArray.indexOfKey(j10) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        long j11 = stickerSetCovered.set.f22055id;
        LongSparseArray longSparseArray2 = this.f14032n;
        if (longSparseArray2.indexOfKey(j11) >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 || z15) {
            if (z14 && q3Var2.f24826r) {
                longSparseArray.remove(stickerSetCovered.set.f22055id);
                z14 = false;
            } else if (z15 && !q3Var2.f24826r) {
                longSparseArray2.remove(stickerSetCovered.set.f22055id);
            }
        }
        if (!z12 && z14) {
            z16 = true;
        } else {
            z16 = false;
        }
        q3Var2.b(z16, z13);
        mediaDataController.preloadStickerSetThumb(stickerSetCovered);
        if (i10 <= 0) {
            z17 = false;
        }
        q3Var2.setNeedDivider(z17);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r8, org.telegram.ui.Cells.q3 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ig.d2.F(org.telegram.tgnet.TLRPC$StickerSetCovered, org.telegram.ui.Cells.q3):void");
    }

    @Override
    public final int h() {
        return Math.max(1, this.f14037y + 1);
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0 && this.f14037y == 0) {
            return 5;
        }
        if (i10 == h() - 1) {
            return 4;
        }
        Object obj = this.f14034s.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            return 3;
        }
        return 2;
    }

    @Override
    public final void l() {
        e61 e61Var;
        int i10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        TLRPC.StickerSetCovered stickerSetCovered;
        SparseArray sparseArray2 = this.f14033r;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = this.f14035w;
        sparseIntArray.clear();
        SparseArray sparseArray3 = this.f14034s;
        sparseArray3.clear();
        SparseArray sparseArray4 = this.K;
        sparseArray4.clear();
        SparseArray sparseArray5 = this.f14036x;
        sparseArray5.clear();
        this.f14037y = 0;
        ArrayList arrayList5 = this.E;
        int size = arrayList5.size();
        ArrayList arrayList6 = this.F;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.J;
        int i12 = !arrayList7.isEmpty();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size + size2 + i12) {
            SparseArray sparseArray6 = this.v;
            e61 e61Var2 = this.e;
            if (i13 < size2) {
                e61Var = e61Var2;
                ?? r6 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i13);
                i10 = size;
                arrayList3 = r6.documents;
                sparseArray = sparseArray5;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                i11 = i12;
                stickerSetCovered = r6;
            } else {
                e61Var = e61Var2;
                i10 = size;
                int i15 = i13 - size2;
                if (i15 < i12) {
                    int size3 = arrayList7.size();
                    String str = "";
                    arrayList = arrayList6;
                    i11 = i12;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < size3) {
                        int i18 = size3;
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(i16);
                        int i19 = i16;
                        String str2 = (String) this.I.get(arrayList8);
                        if (str2 != null && !str.equals(str2)) {
                            sparseArray5.put(this.f14037y + i17, str2);
                            str = str2;
                        }
                        int size4 = arrayList8.size();
                        SparseArray sparseArray7 = sparseArray5;
                        int i20 = 0;
                        while (i20 < size4) {
                            String str3 = str;
                            int i21 = this.f14037y + i17;
                            int i22 = size4;
                            int a2 = (i17 / e61Var.a()) + i14;
                            int i23 = i20;
                            TLRPC.Document document = (TLRPC.Document) arrayList8.get(i20);
                            sparseArray3.put(i21, document);
                            ArrayList arrayList9 = arrayList7;
                            int i24 = i17;
                            TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(this.f14030c).getStickerSetById(MediaDataController.getStickerSetId(document));
                            if (stickerSetById != null) {
                                sparseArray6.put(i21, stickerSetById);
                            }
                            sparseIntArray.put(i21, a2);
                            i17 = i24 + 1;
                            i20 = i23 + 1;
                            str = str3;
                            size4 = i22;
                            arrayList7 = arrayList9;
                        }
                        i16 = i19 + 1;
                        size3 = i18;
                        sparseArray5 = sparseArray7;
                    }
                    sparseArray = sparseArray5;
                    arrayList2 = arrayList7;
                    int ceil = (int) Math.ceil(i17 / e61Var.a());
                    for (int i25 = 0; i25 < ceil; i25++) {
                        sparseArray2.put(i14 + i25, Integer.valueOf(i17));
                    }
                    this.f14037y = (e61Var.a() * ceil) + this.f14037y;
                    i14 += ceil;
                    arrayList4 = arrayList5;
                    i13++;
                    size = i10;
                    arrayList6 = arrayList;
                    i12 = i11;
                    sparseArray5 = sparseArray;
                    arrayList5 = arrayList4;
                    arrayList7 = arrayList2;
                } else {
                    sparseArray = sparseArray5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    i11 = i12;
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList5.get(i15 - i11);
                    arrayList3 = stickerSetCovered2.covers;
                    stickerSetCovered = stickerSetCovered2;
                }
            }
            if (!arrayList3.isEmpty()) {
                int ceil2 = (int) Math.ceil(arrayList3.size() / e61Var.a());
                sparseArray3.put(this.f14037y, stickerSetCovered);
                if (i13 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                    sparseArray4.put(this.f14037y, stickerSetCovered);
                }
                sparseIntArray.put(this.f14037y, i14);
                int size5 = arrayList3.size();
                int i26 = 0;
                while (i26 < size5) {
                    int i27 = i26 + 1;
                    int i28 = ceil2;
                    int i29 = this.f14037y + i27;
                    int a10 = i26 / e61Var.a();
                    ArrayList arrayList10 = arrayList5;
                    sparseArray3.put(i29, arrayList3.get(i26));
                    sparseArray6.put(i29, stickerSetCovered);
                    sparseIntArray.put(i29, a10 + i14 + 1);
                    if (i13 >= size2 && (stickerSetCovered instanceof TLRPC.StickerSetCovered)) {
                        sparseArray4.put(i29, stickerSetCovered);
                    }
                    i26 = i27;
                    ceil2 = i28;
                    arrayList5 = arrayList10;
                }
                int i30 = ceil2;
                arrayList4 = arrayList5;
                int i31 = i30 + 1;
                for (int i32 = 0; i32 < i31; i32++) {
                    sparseArray2.put(i14 + i32, stickerSetCovered);
                }
                this.f14037y = (e61Var.a() * i30) + 1 + this.f14037y;
                i14 += i31;
                i13++;
                size = i10;
                arrayList6 = arrayList;
                i12 = i11;
                sparseArray5 = sparseArray;
                arrayList5 = arrayList4;
                arrayList7 = arrayList2;
            }
            arrayList4 = arrayList5;
            i13++;
            size = i10;
            arrayList6 = arrayList;
            i12 = i11;
            sparseArray5 = sparseArray;
            arrayList5 = arrayList4;
            arrayList7 = arrayList2;
        }
        super.l();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        SparseArray sparseArray = this.f14034s;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        E((q3) view, i10, false);
                        return;
                    }
                    return;
                }
                s8 s8Var = (s8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.R) && this.G.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            s8Var.a(0, stickerSet.title);
                        }
                        s8Var.c(this.R.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num = (Integer) this.H.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        String str = stickerSet2.title;
                        int intValue = num.intValue();
                        if (!TextUtils.isEmpty(this.R)) {
                            i11 = this.R.length();
                        } else {
                            i11 = 0;
                        }
                        s8Var.b(str, 0, null, intValue, i11);
                    }
                    s8Var.c(0, null);
                    return;
                }
                return;
            }
            ((i3) view).setHeight(0);
            return;
        }
        ((i8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.v.get(i10), (String) this.f14036x.get(i10), false, false);
    }

    @Override
    public final void w(s4.e1 e1Var, int i10, List list) {
        if (list.contains(0) && e1Var.f47776f == 3) {
            E((q3) e1Var.f47773a, i10, true);
        } else {
            v(e1Var, i10);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        q3 q3Var;
        u6 u6Var = this.T;
        Context context = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                q3Var = null;
                            } else {
                                ?? linearLayout = new LinearLayout(context);
                                linearLayout.setOrientation(1);
                                linearLayout.setGravity(17);
                                ImageView imageView = new ImageView(context);
                                this.L = imageView;
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                this.L.setImageResource(R.drawable.stickers_empty);
                                ImageView imageView2 = this.L;
                                int i11 = y6.Le;
                                f7.t(imageView2, i11, u6Var, PorterDuff.Mode.MULTIPLY);
                                linearLayout.addView(this.L, kb1.r(-2, -2));
                                linearLayout.addView(new Space(context), kb1.r(-1, 15));
                                TextView textView = new TextView(context);
                                this.M = textView;
                                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                                this.M.setTextSize(1, 16.0f);
                                f7.V(this.M, i11, u6Var);
                                linearLayout.addView(this.M, kb1.r(-2, -2));
                                linearLayout.setMinimumHeight(AndroidUtilities.dp(112.0f));
                                linearLayout.setLayoutParams(kb1.g(-1.0f, -1));
                                q3Var = linearLayout;
                            }
                        } else {
                            q3Var = new View(context);
                        }
                    } else {
                        q3 q3Var2 = new q3(17, this.d, this.T, true, true);
                        q3Var2.setAddOnClickListener(new d0(this, 2));
                        q3Var = q3Var2;
                    }
                } else {
                    q3Var = new s8(this.d, false, true, this.T, false);
                }
            } else {
                q3Var = new i3(context);
            }
        } else {
            c2 c2Var = new c2(0, context, u6Var, false);
            c2Var.getImageView().setLayerNum(3);
            q3Var = c2Var;
        }
        return new s4.e1(q3Var);
    }
}
