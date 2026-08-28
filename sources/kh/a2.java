package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.b61;
public final class a2 extends f2.r0 {
    public final TLRPC.TL_inputStickerSetShortName A;
    public TLRPC.TL_messages_stickerSet B;
    public TLRPC.TL_messages_stickerSet C;
    public String D;
    public String E;
    public String[] F;
    public int G;
    public final b2 J;
    public int f14880c;
    public boolean f14886w;
    public final HashMap d = new HashMap();
    public final HashMap f14881e = new HashMap();
    public final HashMap f14882f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f14883n = new ArrayList();
    public final ArrayList f14884r = new ArrayList();
    public final ArrayList f14885s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f14887x = 0;
    public final SparseIntArray f14888y = new SparseIntArray();
    public final HashSet H = new HashSet();
    public final f1 I = new f1(this, 2);

    public a2(b2 b2Var) {
        this.J = b2Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.A = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: kh.a2.D(java.lang.String):void");
    }

    @Override
    public final int h() {
        return this.f14887x;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (this.f14886w && i9 == this.f14887x - 1) {
            return 3;
        }
        if (this.f14888y.get(i9, -1) >= 0) {
            return 1;
        }
        if (i9 >= 0) {
            ArrayList arrayList = this.f14885s;
            if (i9 < arrayList.size() && arrayList.get(i9) == this.J.f14988s.d) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        String str;
        TLRPC.StickerSet stickerSet;
        b2 b2Var = this.J;
        n2 n2Var = b2Var.f14988s;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.a1(-1, (int) n2Var.f15737n));
            return;
        }
        boolean z11 = false;
        int i11 = 1;
        if (i10 == 1) {
            int i12 = this.f14888y.get(i9);
            if (i12 >= 0) {
                ArrayList arrayList = this.f14883n;
                if (i12 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (this.E == null) {
                        m8Var.b(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.E.toLowerCase());
                    if (indexOf < 0) {
                        m8Var.b(0, str2);
                        return;
                    } else {
                        m8Var.c(str2, 0, null, indexOf, this.E.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i13 = 3;
        if (i10 == 2) {
            ArrayList arrayList2 = this.f14885s;
            if (i9 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i9);
            }
            p1 p1Var = (p1) view;
            if (document == n2Var.f15735e) {
                p1Var.setSticker(null);
                int dp = AndroidUtilities.dp(28.0f);
                int i14 = org.telegram.ui.ActionBar.f6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.12f, n2Var.getThemedColor(i14)));
                Drawable mutate = b2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                fq fqVar = new fq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                fqVar.h = dp2;
                fqVar.f28547n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                fqVar.f28545e = dp4;
                fqVar.f28546f = dp5;
                fqVar.f28548r = true;
                p1Var.setDrawable(fqVar);
                return;
            }
            ArrayList arrayList3 = this.v;
            if (i9 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i9)).longValue();
            }
            if (document != null || longValue != 0) {
                int i15 = b2Var.f16337a;
                if (i15 == 0) {
                    if (document != null) {
                        p1Var.setSticker(null);
                        if (b2Var.f16337a == 1) {
                            z11 = true;
                        }
                        p1Var.a(document, z11);
                        return;
                    }
                    p1Var.setSticker(null);
                    if (b2Var.f16337a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (p1Var.f15820f != longValue) {
                        org.telegram.ui.Components.k5 k5Var = p1Var.f15818c;
                        if (k5Var != null) {
                            k5Var.o(p1Var);
                        }
                        if (longValue != 0) {
                            p1Var.f15816a = true;
                            p1Var.f15820f = longValue;
                            int i16 = p1Var.f15817b;
                            if (!z10) {
                                i11 = 16388;
                            }
                            if (!LiteMode.isEnabled(i11)) {
                                i13 = 13;
                            }
                            org.telegram.ui.Components.k5 n10 = org.telegram.ui.Components.k5.n(i16, longValue, null, i13);
                            p1Var.f15818c = n10;
                            if (p1Var.f15823s) {
                                n10.a(p1Var);
                                return;
                            }
                            return;
                        }
                        p1Var.f15816a = false;
                        p1Var.f15820f = 0L;
                        p1Var.f15818c = null;
                        return;
                    }
                    return;
                }
                if (i15 == 1) {
                    z11 = true;
                }
                p1Var.a(null, z11);
                p1Var.setSticker(document);
            }
        } else if (i10 == 3) {
            y1 y1Var = (y1) view;
            int i17 = this.G;
            if (y1Var.f16393b != i17) {
                y1Var.f16393b = i17;
                b61.D(UserConfig.selectedAccount, y1Var.f16392a);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        boolean z10;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        l2 m8Var;
        b2 b2Var = this.J;
        n2 n2Var = b2Var.f14988s;
        if (i9 == 0) {
            m8Var = new View(b2Var.getContext());
        } else if (i9 == 1) {
            Context context = b2Var.getContext();
            b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
            m8Var = new org.telegram.ui.Cells.m8(context, true, false, b6Var, false);
        } else if (i9 == 3) {
            Context context2 = b2Var.getContext();
            if (b2Var.f16337a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f16393b = -1;
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context2);
            frameLayout.f16392a = o9Var;
            frameLayout.addView(o9Var, g7.e6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i10 = R.string.NoEmojiFound;
            } else {
                i10 = R.string.NoStickersFound;
            }
            textView.setText(LocaleController.getString(i10));
            frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            m8Var = frameLayout;
        } else if (i9 == 4) {
            l2 l2Var = new l2(n2Var, b2Var.getContext());
            l2Var.f15585e = new e1(n2Var, 2);
            m8Var = l2Var;
        } else {
            m8Var = new p1(b2Var.getContext(), b2Var.f14982b);
        }
        return new f2.q1(m8Var);
    }
}
