package ei;

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
import org.telegram.ui.Components.wq;
import org.telegram.ui.a61;
public final class a2 extends s4.g0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final b2 N;
    public int f8686c;
    public boolean f8691w;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f8687f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f8688n = new ArrayList();
    public final ArrayList f8689r = new ArrayList();
    public final ArrayList f8690s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f8692x = 0;
    public final SparseIntArray f8693y = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final com.google.firebase.messaging.s M = new com.google.firebase.messaging.s(this, 12);

    public a2(b2 b2Var) {
        this.N = b2Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: ei.a2.D(java.lang.String):void");
    }

    @Override
    public final int h() {
        return this.f8692x;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f8691w && i10 == this.f8692x - 1) {
            return 3;
        }
        if (this.f8693y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.f8690s;
            if (i10 < arrayList.size() && arrayList.get(i10) == this.N.f8783s.d) {
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        String str;
        TLRPC.StickerSet stickerSet;
        b2 b2Var = this.N;
        n2 n2Var = b2Var.f8783s;
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) n2Var.f9513n));
            return;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 == 1) {
            int i13 = this.f8693y.get(i10);
            if (i13 >= 0) {
                ArrayList arrayList = this.f8688n;
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
                        o8Var.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.I.toLowerCase());
                    if (indexOf < 0) {
                        o8Var.a(0, str2);
                        return;
                    } else {
                        o8Var.b(str2, 0, null, indexOf, this.I.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i14 = 3;
        if (i11 == 2) {
            ArrayList arrayList2 = this.f8690s;
            if (i10 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i10);
            }
            n1 n1Var = (n1) view;
            if (document == n2Var.e) {
                n1Var.setSticker(null);
                if (n1Var.f9503a == null) {
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(28.0f), -1);
                    int i15 = org.telegram.ui.ActionBar.k6.Me;
                    org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.12f, i15);
                    g6Var = ((org.telegram.ui.ActionBar.h3) n2Var).resourcesProvider;
                    org.telegram.ui.ActionBar.r6.l(n1Var, c02, M.f21711a, -1, 2, M.d, g6Var, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = b2Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    g6Var2 = ((org.telegram.ui.ActionBar.h3) n2Var).resourcesProvider;
                    org.telegram.ui.ActionBar.r6.z(n1Var, mutate, i15, g6Var2, PorterDuff.Mode.MULTIPLY);
                    wq wqVar = new wq(c02, mutate);
                    int dp = AndroidUtilities.dp(56.0f);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    wqVar.h = dp;
                    wqVar.f32326n = dp2;
                    int dp3 = AndroidUtilities.dp(24.0f);
                    int dp4 = AndroidUtilities.dp(24.0f);
                    wqVar.e = dp3;
                    wqVar.f32325f = dp4;
                    wqVar.f32327r = true;
                    n1Var.f9503a = wqVar;
                }
                n1Var.setDrawable(n1Var.f9503a);
                return;
            }
            ArrayList arrayList3 = this.v;
            if (i10 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i10)).longValue();
            }
            if (document != null || longValue != 0) {
                int i16 = b2Var.f10053a;
                if (i16 == 0) {
                    if (document != null) {
                        n1Var.setSticker(null);
                        if (b2Var.f10053a == 1) {
                            z11 = true;
                        }
                        n1Var.a(document, z11);
                        return;
                    }
                    n1Var.setSticker(null);
                    if (b2Var.f10053a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (n1Var.h != longValue) {
                        org.telegram.ui.Components.p5 p5Var = n1Var.d;
                        if (p5Var != null) {
                            p5Var.o(n1Var);
                        }
                        if (longValue != 0) {
                            n1Var.f9504b = true;
                            n1Var.h = longValue;
                            int i17 = n1Var.f9505c;
                            if (!z10) {
                                i12 = 16388;
                            }
                            if (!LiteMode.isEnabled(i12)) {
                                i14 = 13;
                            }
                            org.telegram.ui.Components.p5 n10 = org.telegram.ui.Components.p5.n(i17, longValue, null, i14);
                            n1Var.d = n10;
                            if (n1Var.v) {
                                n10.a(n1Var);
                                return;
                            }
                            return;
                        }
                        n1Var.f9504b = false;
                        n1Var.h = 0L;
                        n1Var.d = null;
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
            x1 x1Var = (x1) view;
            int i18 = this.K;
            if (x1Var.f10079b != i18) {
                x1Var.f10079b = i18;
                a61.D(UserConfig.selectedAccount, x1Var.f10078a);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        l2 o8Var;
        b2 b2Var = this.N;
        n2 n2Var = b2Var.f8783s;
        if (i10 == 0) {
            o8Var = new View(b2Var.getContext());
        } else if (i10 == 1) {
            Context context = b2Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) n2Var).resourcesProvider;
            o8Var = new org.telegram.ui.Cells.o8(context, true, false, g6Var, false);
        } else if (i10 == 3) {
            Context context2 = b2Var.getContext();
            if (b2Var.f10053a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f10079b = -1;
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context2);
            frameLayout.f10078a = u9Var;
            frameLayout.addView(u9Var, w7.z5.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i11 = R.string.NoEmojiFound;
            } else {
                i11 = R.string.NoStickersFound;
            }
            textView.setText(LocaleController.getString(i11));
            frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            o8Var = frameLayout;
        } else if (i10 == 4) {
            l2 l2Var = new l2(n2Var, b2Var.getContext());
            l2Var.e = new d1(n2Var, 2);
            o8Var = l2Var;
        } else {
            o8Var = new n1(b2Var.getContext(), b2Var.f8778b);
        }
        return new s4.b1(o8Var);
    }
}
