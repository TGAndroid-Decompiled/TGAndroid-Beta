package bi;

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
import org.telegram.ui.Components.vq;
import org.telegram.ui.l71;
public final class p2 extends s4.h0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final q2 N;
    public int f3357c;
    public boolean f3362w;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f3358f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f3359n = new ArrayList();
    public final ArrayList f3360r = new ArrayList();
    public final ArrayList f3361s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f3363x = 0;
    public final SparseIntArray f3364y = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final a3.d M = new a3.d(this, 18);

    public p2(q2 q2Var) {
        this.N = q2Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: bi.p2.D(java.lang.String):void");
    }

    @Override
    public final int h() {
        return this.f3363x;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f3362w && i10 == this.f3363x - 1) {
            return 3;
        }
        if (this.f3364y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.f3361s;
            if (i10 < arrayList.size() && arrayList.get(i10) == this.N.f3447s.d) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        String str;
        TLRPC.StickerSet stickerSet;
        q2 q2Var = this.N;
        f3 f3Var = q2Var.f3447s;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.p0(-1, (int) f3Var.f2694n));
            return;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 == 1) {
            int i13 = this.f3364y.get(i10);
            if (i13 >= 0) {
                ArrayList arrayList = this.f3359n;
                if (i13 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    if (this.I == null) {
                        p8Var.b(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.I.toLowerCase());
                    if (indexOf < 0) {
                        p8Var.b(0, str2);
                        return;
                    } else {
                        p8Var.c(str2, 0, null, indexOf, this.I.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i14 = 3;
        if (i11 == 2) {
            ArrayList arrayList2 = this.f3361s;
            if (i10 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i10);
            }
            v1 v1Var = (v1) view;
            if (document == f3Var.e) {
                v1Var.setSticker(null);
                int dp = AndroidUtilities.dp(28.0f);
                int i15 = org.telegram.ui.ActionBar.j6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, f3Var.getThemedColor(i15)));
                Drawable mutate = q2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(f3Var.getThemedColor(i15), PorterDuff.Mode.MULTIPLY));
                vq vqVar = new vq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                vqVar.h = dp2;
                vqVar.f28577n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                vqVar.e = dp4;
                vqVar.f28576f = dp5;
                vqVar.f28578r = true;
                v1Var.setDrawable(vqVar);
                return;
            }
            ArrayList arrayList3 = this.v;
            if (i10 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i10)).longValue();
            }
            if (document != null || longValue != 0) {
                int i16 = q2Var.f3035a;
                if (i16 == 0) {
                    if (document != null) {
                        v1Var.setSticker(null);
                        if (q2Var.f3035a == 1) {
                            z11 = true;
                        }
                        v1Var.a(document, z11);
                        return;
                    }
                    v1Var.setSticker(null);
                    if (q2Var.f3035a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (v1Var.f3778f != longValue) {
                        org.telegram.ui.Components.p5 p5Var = v1Var.f3777c;
                        if (p5Var != null) {
                            p5Var.o(v1Var);
                        }
                        if (longValue != 0) {
                            v1Var.f3775a = true;
                            v1Var.f3778f = longValue;
                            int i17 = v1Var.f3776b;
                            if (!z10) {
                                i12 = 16388;
                            }
                            if (!LiteMode.isEnabled(i12)) {
                                i14 = 13;
                            }
                            org.telegram.ui.Components.p5 n10 = org.telegram.ui.Components.p5.n(i17, longValue, null, i14);
                            v1Var.f3777c = n10;
                            if (v1Var.f3781s) {
                                n10.a(v1Var);
                                return;
                            }
                            return;
                        }
                        v1Var.f3775a = false;
                        v1Var.f3778f = 0L;
                        v1Var.f3777c = null;
                        return;
                    }
                    return;
                }
                if (i16 == 1) {
                    z11 = true;
                }
                v1Var.a(null, z11);
                v1Var.setSticker(document);
            }
        } else if (i11 == 3) {
            m2 m2Var = (m2) view;
            int i18 = this.K;
            if (m2Var.f3075b != i18) {
                m2Var.f3075b = i18;
                l71.D(UserConfig.selectedAccount, m2Var.f3074a);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        d3 p8Var;
        q2 q2Var = this.N;
        f3 f3Var = q2Var.f3447s;
        if (i10 == 0) {
            p8Var = new View(q2Var.getContext());
        } else if (i10 == 1) {
            Context context = q2Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
            p8Var = new org.telegram.ui.Cells.p8(context, true, false, f6Var, false);
        } else if (i10 == 3) {
            Context context2 = q2Var.getContext();
            if (q2Var.f3035a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f3075b = -1;
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context2);
            frameLayout.f3074a = w9Var;
            frameLayout.addView(w9Var, w7.a6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i11 = R.string.NoEmojiFound;
            } else {
                i11 = R.string.NoStickersFound;
            }
            textView.setText(LocaleController.getString(i11));
            frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            p8Var = frameLayout;
        } else if (i10 == 4) {
            d3 d3Var = new d3(f3Var, q2Var.getContext());
            d3Var.e = new j1(f3Var, 2);
            p8Var = d3Var;
        } else {
            p8Var = new v1(q2Var.getContext(), q2Var.f3442b);
        }
        return new s4.c1(p8Var);
    }
}
