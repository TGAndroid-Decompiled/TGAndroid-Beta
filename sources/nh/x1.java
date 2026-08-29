package nh;

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
import org.telegram.ui.Components.jq;
import org.telegram.ui.d61;
public final class x1 extends f2.p0 {
    public final TLRPC.TL_inputStickerSetShortName A;
    public TLRPC.TL_messages_stickerSet B;
    public TLRPC.TL_messages_stickerSet C;
    public String D;
    public String E;
    public String[] F;
    public int G;
    public final y1 J;
    public int f18814c;
    public boolean f18820w;
    public final HashMap d = new HashMap();
    public final HashMap f18815e = new HashMap();
    public final HashMap f18816f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f18817n = new ArrayList();
    public final ArrayList f18818r = new ArrayList();
    public final ArrayList f18819s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f18821x = 0;
    public final SparseIntArray f18822y = new SparseIntArray();
    public final HashSet H = new HashSet();
    public final lh.m5 I = new lh.m5(this, 23);

    public x1(y1 y1Var) {
        this.J = y1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.A = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: nh.x1.D(java.lang.String):void");
    }

    @Override
    public final int h() {
        return this.f18821x;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f18820w && i10 == this.f18821x - 1) {
            return 3;
        }
        if (this.f18822y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.f18819s;
            if (i10 < arrayList.size() && arrayList.get(i10) == this.J.f18859s.d) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        String str;
        TLRPC.StickerSet stickerSet;
        y1 y1Var = this.J;
        k2 k2Var = y1Var.f18859s;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.x0(-1, (int) k2Var.f17994n));
            return;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 == 1) {
            int i13 = this.f18822y.get(i10);
            if (i13 >= 0) {
                ArrayList arrayList = this.f18817n;
                if (i13 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                    if (this.E == null) {
                        k8Var.b(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.E.toLowerCase());
                    if (indexOf < 0) {
                        k8Var.b(0, str2);
                        return;
                    } else {
                        k8Var.c(str2, 0, null, indexOf, this.E.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i14 = 3;
        if (i11 == 2) {
            ArrayList arrayList2 = this.f18819s;
            if (i10 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i10);
            }
            m1 m1Var = (m1) view;
            if (document == k2Var.f17992e) {
                m1Var.setSticker(null);
                int dp = AndroidUtilities.dp(28.0f);
                int i15 = org.telegram.ui.ActionBar.g6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(0.12f, k2Var.getThemedColor(i15)));
                Drawable mutate = y1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(k2Var.getThemedColor(i15), PorterDuff.Mode.MULTIPLY));
                jq jqVar = new jq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                jqVar.h = dp2;
                jqVar.f29789n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                jqVar.f29787e = dp4;
                jqVar.f29788f = dp5;
                jqVar.f29790r = true;
                m1Var.setDrawable(jqVar);
                return;
            }
            ArrayList arrayList3 = this.v;
            if (i10 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i10)).longValue();
            }
            if (document != null || longValue != 0) {
                int i16 = y1Var.f18712a;
                if (i16 == 0) {
                    if (document != null) {
                        m1Var.setSticker(null);
                        if (y1Var.f18712a == 1) {
                            z11 = true;
                        }
                        m1Var.a(document, z11);
                        return;
                    }
                    m1Var.setSticker(null);
                    if (y1Var.f18712a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (m1Var.f18118f != longValue) {
                        org.telegram.ui.Components.p5 p5Var = m1Var.f18116c;
                        if (p5Var != null) {
                            p5Var.o(m1Var);
                        }
                        if (longValue != 0) {
                            m1Var.f18114a = true;
                            m1Var.f18118f = longValue;
                            int i17 = m1Var.f18115b;
                            if (!z10) {
                                i12 = 16388;
                            }
                            if (!LiteMode.isEnabled(i12)) {
                                i14 = 13;
                            }
                            org.telegram.ui.Components.p5 n10 = org.telegram.ui.Components.p5.n(i17, longValue, null, i14);
                            m1Var.f18116c = n10;
                            if (m1Var.f18121s) {
                                n10.a(m1Var);
                                return;
                            }
                            return;
                        }
                        m1Var.f18114a = false;
                        m1Var.f18118f = 0L;
                        m1Var.f18116c = null;
                        return;
                    }
                    return;
                }
                if (i16 == 1) {
                    z11 = true;
                }
                m1Var.a(null, z11);
                m1Var.setSticker(document);
            }
        } else if (i11 == 3) {
            v1 v1Var = (v1) view;
            int i18 = this.G;
            if (v1Var.f18741b != i18) {
                v1Var.f18741b = i18;
                d61.D(UserConfig.selectedAccount, v1Var.f18740a);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        i2 k8Var;
        y1 y1Var = this.J;
        k2 k2Var = y1Var.f18859s;
        if (i10 == 0) {
            k8Var = new View(y1Var.getContext());
        } else if (i10 == 1) {
            Context context = y1Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
            k8Var = new org.telegram.ui.Cells.k8(context, true, false, c6Var, false);
        } else if (i10 == 3) {
            Context context2 = y1Var.getContext();
            if (y1Var.f18712a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f18741b = -1;
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context2);
            frameLayout.f18740a = t9Var;
            frameLayout.addView(t9Var, i7.f6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i11 = R.string.NoEmojiFound;
            } else {
                i11 = R.string.NoStickersFound;
            }
            textView.setText(LocaleController.getString(i11));
            frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            k8Var = frameLayout;
        } else if (i10 == 4) {
            i2 i2Var = new i2(k2Var, y1Var.getContext());
            i2Var.f17880e = new d1(k2Var, 2);
            k8Var = i2Var;
        } else {
            k8Var = new m1(y1Var.getContext(), y1Var.f18853b);
        }
        return new f2.n1(k8Var);
    }
}
