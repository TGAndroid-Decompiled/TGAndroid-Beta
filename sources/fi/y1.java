package fi;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.c61;
public final class y1 extends s4.h0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final z1 N;
    public int f11984c;
    public boolean f11989w;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f11985f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f11986n = new ArrayList();
    public final ArrayList f11987r = new ArrayList();
    public final ArrayList f11988s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f11990x = 0;
    public final SparseIntArray f11991y = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final di.s8 M = new di.s8(this, 16);

    public y1(z1 z1Var) {
        this.N = z1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: fi.y1.D(java.lang.String):void");
    }

    @Override
    public final int h() {
        return this.f11990x;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f11989w && i10 == this.f11990x - 1) {
            return 3;
        }
        if (this.f11991y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.f11988s;
            if (i10 < arrayList.size() && arrayList.get(i10) == this.N.f12055s.d) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        String str;
        TLRPC.StickerSet stickerSet;
        z1 z1Var = this.N;
        l2 l2Var = z1Var.f12055s;
        int i11 = e1Var.f47738f;
        View view = e1Var.f47735a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.q0(-1, (int) l2Var.f11159n));
            return;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 == 1) {
            int i13 = this.f11991y.get(i10);
            if (i13 >= 0) {
                ArrayList arrayList = this.f11986n;
                if (i13 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    if (this.I == null) {
                        s8Var.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.I.toLowerCase());
                    if (indexOf < 0) {
                        s8Var.a(0, str2);
                        return;
                    } else {
                        s8Var.b(str2, 0, null, indexOf, this.I.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i14 = 3;
        if (i11 == 2) {
            ArrayList arrayList2 = this.f11988s;
            if (i10 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i10);
            }
            m1 m1Var = (m1) view;
            if (document == l2Var.e) {
                m1Var.setSticker(null);
                if (m1Var.f11236a == null) {
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(28.0f), -1);
                    int i15 = org.telegram.ui.ActionBar.y6.Me;
                    org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i15);
                    u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.l(m1Var, c02, L.f22483a, -1, 2, L.d, u6Var, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = z1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    u6Var2 = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.y(m1Var, mutate, i15, u6Var2, PorterDuff.Mode.MULTIPLY);
                    ar arVar = new ar(c02, mutate);
                    int dp = AndroidUtilities.dp(56.0f);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    arVar.h = dp;
                    arVar.f26594n = dp2;
                    int dp3 = AndroidUtilities.dp(24.0f);
                    int dp4 = AndroidUtilities.dp(24.0f);
                    arVar.e = dp3;
                    arVar.f26593f = dp4;
                    arVar.f26595r = true;
                    m1Var.f11236a = arVar;
                }
                m1Var.setDrawable(m1Var.f11236a);
                return;
            }
            ArrayList arrayList3 = this.v;
            if (i10 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i10)).longValue();
            }
            if (document != null || longValue != 0) {
                int i16 = z1Var.f11780a;
                if (i16 == 0) {
                    if (document != null) {
                        m1Var.setSticker(null);
                        if (z1Var.f11780a == 1) {
                            z11 = true;
                        }
                        m1Var.a(document, z11);
                        return;
                    }
                    m1Var.setSticker(null);
                    if (z1Var.f11780a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (m1Var.h != longValue) {
                        org.telegram.ui.Components.t5 t5Var = m1Var.d;
                        if (t5Var != null) {
                            t5Var.o(m1Var);
                        }
                        if (longValue != 0) {
                            m1Var.f11237b = true;
                            m1Var.h = longValue;
                            int i17 = m1Var.f11238c;
                            if (!z10) {
                                i12 = 16388;
                            }
                            if (!LiteMode.isEnabled(i12)) {
                                i14 = 13;
                            }
                            org.telegram.ui.Components.t5 n10 = org.telegram.ui.Components.t5.n(i17, longValue, null, i14);
                            m1Var.d = n10;
                            if (m1Var.v) {
                                n10.a(m1Var);
                                return;
                            }
                            return;
                        }
                        m1Var.f11237b = false;
                        m1Var.h = 0L;
                        m1Var.d = null;
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
            w1 w1Var = (w1) view;
            int i18 = this.K;
            if (w1Var.f11845b != i18) {
                w1Var.f11845b = i18;
                c61.D(UserConfig.selectedAccount, w1Var.f11844a);
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        j2 s8Var;
        z1 z1Var = this.N;
        l2 l2Var = z1Var.f12055s;
        if (i10 == 0) {
            s8Var = new View(z1Var.getContext());
        } else if (i10 == 1) {
            Context context = z1Var.getContext();
            u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
            s8Var = new org.telegram.ui.Cells.s8(context, true, false, u6Var, false);
        } else if (i10 == 3) {
            Context context2 = z1Var.getContext();
            if (z1Var.f11780a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f11845b = -1;
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context2);
            frameLayout.f11844a = y9Var;
            frameLayout.addView(y9Var, gb1.i(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i11 = R.string.NoEmojiFound;
            } else {
                i11 = R.string.NoStickersFound;
            }
            textView.setText(LocaleController.getString(i11));
            frameLayout.addView(textView, gb1.h(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            s8Var = frameLayout;
        } else if (i10 == 4) {
            j2 j2Var = new j2(l2Var, z1Var.getContext());
            j2Var.e = new d1(l2Var, 2);
            s8Var = j2Var;
        } else {
            s8Var = new m1(z1Var.getContext(), z1Var.f12050b);
        }
        return new s4.e1(s8Var);
    }
}
