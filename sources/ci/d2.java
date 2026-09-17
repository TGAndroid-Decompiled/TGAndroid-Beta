package ci;

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
import org.telegram.ui.Components.pq;
import org.telegram.ui.i71;
public final class d2 extends s4.h0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final e2 N;
    public int f4488c;
    public boolean f4493w;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f4489f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f4490n = new ArrayList();
    public final ArrayList f4491r = new ArrayList();
    public final ArrayList f4492s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f4494x = 0;
    public final SparseIntArray f4495y = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final androidx.fragment.app.a0 M = new androidx.fragment.app.a0(this, 12);

    public d2(e2 e2Var) {
        this.N = e2Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: ci.d2.D(java.lang.String):void");
    }

    @Override
    public final int h() {
        return this.f4494x;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f4493w && i10 == this.f4494x - 1) {
            return 3;
        }
        if (this.f4495y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.f4492s;
            if (i10 < arrayList.size() && arrayList.get(i10) == this.N.f4593s.d) {
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
        e2 e2Var = this.N;
        t2 t2Var = e2Var.f4593s;
        int i11 = c1Var.f42700f;
        View view = c1Var.f42697a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.p0(-1, (int) t2Var.f5550n));
            return;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 == 1) {
            int i13 = this.f4495y.get(i10);
            if (i13 >= 0) {
                ArrayList arrayList = this.f4490n;
                if (i13 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    if (this.I == null) {
                        o8Var.b(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.I.toLowerCase());
                    if (indexOf < 0) {
                        o8Var.b(0, str2);
                        return;
                    } else {
                        o8Var.c(str2, 0, null, indexOf, this.I.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i14 = 3;
        if (i11 == 2) {
            ArrayList arrayList2 = this.f4492s;
            if (i10 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i10);
            }
            o1 o1Var = (o1) view;
            if (document == t2Var.e) {
                o1Var.setSticker(null);
                int dp = AndroidUtilities.dp(28.0f);
                int i15 = org.telegram.ui.ActionBar.j6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, t2Var.getThemedColor(i15)));
                Drawable mutate = e2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(t2Var.getThemedColor(i15), PorterDuff.Mode.MULTIPLY));
                pq pqVar = new pq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                pqVar.h = dp2;
                pqVar.f27110n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                pqVar.e = dp4;
                pqVar.f27109f = dp5;
                pqVar.f27111r = true;
                o1Var.setDrawable(pqVar);
                return;
            }
            ArrayList arrayList3 = this.v;
            if (i10 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i10)).longValue();
            }
            if (document != null || longValue != 0) {
                int i16 = e2Var.f4346a;
                if (i16 == 0) {
                    if (document != null) {
                        o1Var.setSticker(null);
                        if (e2Var.f4346a == 1) {
                            z11 = true;
                        }
                        o1Var.a(document, z11);
                        return;
                    }
                    o1Var.setSticker(null);
                    if (e2Var.f4346a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (o1Var.f5112f != longValue) {
                        org.telegram.ui.Components.o5 o5Var = o1Var.f5111c;
                        if (o5Var != null) {
                            o5Var.o(o1Var);
                        }
                        if (longValue != 0) {
                            o1Var.f5109a = true;
                            o1Var.f5112f = longValue;
                            int i17 = o1Var.f5110b;
                            if (!z10) {
                                i12 = 16388;
                            }
                            if (!LiteMode.isEnabled(i12)) {
                                i14 = 13;
                            }
                            org.telegram.ui.Components.o5 n10 = org.telegram.ui.Components.o5.n(i17, longValue, null, i14);
                            o1Var.f5111c = n10;
                            if (o1Var.f5115s) {
                                n10.a(o1Var);
                                return;
                            }
                            return;
                        }
                        o1Var.f5109a = false;
                        o1Var.f5112f = 0L;
                        o1Var.f5111c = null;
                        return;
                    }
                    return;
                }
                if (i16 == 1) {
                    z11 = true;
                }
                o1Var.a(null, z11);
                o1Var.setSticker(document);
            }
        } else if (i11 == 3) {
            b2 b2Var = (b2) view;
            int i18 = this.K;
            if (b2Var.f4387b != i18) {
                b2Var.f4387b = i18;
                i71.D(UserConfig.selectedAccount, b2Var.f4386a);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        r2 o8Var;
        e2 e2Var = this.N;
        t2 t2Var = e2Var.f4593s;
        if (i10 == 0) {
            o8Var = new View(e2Var.getContext());
        } else if (i10 == 1) {
            Context context = e2Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) t2Var).resourcesProvider;
            o8Var = new org.telegram.ui.Cells.o8(context, true, false, f6Var, false);
        } else if (i10 == 3) {
            Context context2 = e2Var.getContext();
            if (e2Var.f4346a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f4387b = -1;
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context2);
            frameLayout.f4386a = u9Var;
            frameLayout.addView(u9Var, w7.x5.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i11 = R.string.NoEmojiFound;
            } else {
                i11 = R.string.NoStickersFound;
            }
            textView.setText(LocaleController.getString(i11));
            frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            o8Var = frameLayout;
        } else if (i10 == 4) {
            r2 r2Var = new r2(t2Var, e2Var.getContext());
            r2Var.e = new e1(t2Var, 2);
            o8Var = r2Var;
        } else {
            o8Var = new o1(e2Var.getContext(), e2Var.f4588b);
        }
        return new s4.c1(o8Var);
    }
}
