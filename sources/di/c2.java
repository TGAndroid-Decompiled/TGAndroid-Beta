package di;

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
import org.telegram.ui.Components.cr;
import org.telegram.ui.r71;
public final class c2 extends s4.g0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final d2 N;
    public int f6696c;
    public boolean f6701w;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f6697f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f6698n = new ArrayList();
    public final ArrayList f6699r = new ArrayList();
    public final ArrayList f6700s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f6702x = 0;
    public final SparseIntArray f6703y = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final bi.la M = new bi.la(this, 21);

    public c2(d2 d2Var) {
        this.N = d2Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: di.c2.D(java.lang.String):void");
    }

    @Override
    public final int h() {
        return this.f6702x;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f6701w && i10 == this.f6702x - 1) {
            return 3;
        }
        if (this.f6703y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.f6700s;
            if (i10 < arrayList.size() && arrayList.get(i10) == this.N.f6788s.d) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        String str;
        TLRPC.StickerSet stickerSet;
        d2 d2Var = this.N;
        r2 r2Var = d2Var.f6788s;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) r2Var.f7694n));
            return;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 == 1) {
            int i13 = this.f6703y.get(i10);
            if (i13 >= 0) {
                ArrayList arrayList = this.f6698n;
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
            ArrayList arrayList2 = this.f6700s;
            if (i10 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i10);
            }
            n1 n1Var = (n1) view;
            if (document == r2Var.e) {
                n1Var.setSticker(null);
                int dp = AndroidUtilities.dp(28.0f);
                int i15 = org.telegram.ui.ActionBar.g6.Me;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.m1(0.12f, r2Var.getThemedColor(i15)));
                Drawable mutate = d2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(r2Var.getThemedColor(i15), PorterDuff.Mode.MULTIPLY));
                cr crVar = new cr(c02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                crVar.h = dp2;
                crVar.f23880n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                crVar.e = dp4;
                crVar.f23879f = dp5;
                crVar.f23881r = true;
                n1Var.setDrawable(crVar);
                return;
            }
            ArrayList arrayList3 = this.v;
            if (i10 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i10)).longValue();
            }
            if (document != null || longValue != 0) {
                int i16 = d2Var.f8178a;
                if (i16 == 0) {
                    if (document != null) {
                        n1Var.setSticker(null);
                        if (d2Var.f8178a == 1) {
                            z11 = true;
                        }
                        n1Var.a(document, z11);
                        return;
                    }
                    n1Var.setSticker(null);
                    if (d2Var.f8178a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (n1Var.f7448f != longValue) {
                        org.telegram.ui.Components.s5 s5Var = n1Var.f7447c;
                        if (s5Var != null) {
                            s5Var.o(n1Var);
                        }
                        if (longValue != 0) {
                            n1Var.f7445a = true;
                            n1Var.f7448f = longValue;
                            int i17 = n1Var.f7446b;
                            if (!z10) {
                                i12 = 16388;
                            }
                            if (!LiteMode.isEnabled(i12)) {
                                i14 = 13;
                            }
                            org.telegram.ui.Components.s5 n10 = org.telegram.ui.Components.s5.n(i17, longValue, null, i14);
                            n1Var.f7447c = n10;
                            if (n1Var.f7451s) {
                                n10.a(n1Var);
                                return;
                            }
                            return;
                        }
                        n1Var.f7445a = false;
                        n1Var.f7448f = 0L;
                        n1Var.f7447c = null;
                        return;
                    }
                    return;
                }
                if (i16 == 1) {
                    z11 = true;
                }
                n1Var.a(null, z11);
                n1Var.setSticker(document);
            }
        } else if (i11 == 3) {
            a2 a2Var = (a2) view;
            int i18 = this.K;
            if (a2Var.f6592b != i18) {
                a2Var.f6592b = i18;
                r71.D(UserConfig.selectedAccount, a2Var.f6591a);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        p2 o8Var;
        d2 d2Var = this.N;
        r2 r2Var = d2Var.f6788s;
        if (i10 == 0) {
            o8Var = new View(d2Var.getContext());
        } else if (i10 == 1) {
            Context context = d2Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.e3) r2Var).resourcesProvider;
            o8Var = new org.telegram.ui.Cells.o8(context, true, false, c6Var, false);
        } else if (i10 == 3) {
            Context context2 = d2Var.getContext();
            if (d2Var.f8178a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f6592b = -1;
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context2);
            frameLayout.f6591a = z9Var;
            frameLayout.addView(z9Var, w7.z5.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i11 = R.string.NoEmojiFound;
            } else {
                i11 = R.string.NoStickersFound;
            }
            textView.setText(LocaleController.getString(i11));
            frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 34.0f, 0.0f, 0.0f, -2, 17));
            o8Var = frameLayout;
        } else if (i10 == 4) {
            p2 p2Var = new p2(r2Var, d2Var.getContext());
            p2Var.e = new d1(r2Var, 2);
            o8Var = p2Var;
        } else {
            o8Var = new n1(d2Var.getContext(), d2Var.f6783b);
        }
        return new s4.b1(o8Var);
    }
}
