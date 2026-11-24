package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
public final class rmb extends f {
    public final byte r3 = 1;
    public final Object s3;

    public rmb(d0 d0Var, Context context, d dVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, dVar, i, arrayList, arrayList2);
        this.s3 = d0Var;
    }

    @Override
    public final void C1(bmb bmbVar) {
        boolean z;
        String M0;
        String str;
        String str2;
        CharSequence[] charSequenceArr;
        boolean z2;
        int[] iArr;
        switch (this.r3) {
            case 0:
                d0 d0Var = ((d0) this.s3).e.a;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((bmbVar.G == null || bmbVar.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (bmbVar.b == null) {
                            charSequenceArr = new CharSequence[]{null, jb6.M0(2131750795, "ExportTheme")};
                            iArr = new int[]{0, 2131232371};
                            z2 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = bmbVar.G;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z = false;
                            } else {
                                z = true;
                            }
                            String M02 = jb6.M0(2131745193, "ShareFile");
                            String M03 = jb6.M0(2131750795, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = bmbVar.G;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                M0 = null;
                            } else {
                                M0 = jb6.M0(2131751272, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = bmbVar.G;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = jb6.M0(2131743830, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z) {
                                str2 = jb6.M0(2131751535, "Delete");
                            } else {
                                str2 = null;
                            }
                            boolean z3 = z;
                            charSequenceArr = new CharSequence[]{M02, M03, M0, str, str2};
                            z2 = z3;
                            iArr = new int[]{2131232369, 2131232371, 2131232122, 2131232209, 2131232114};
                        }
                        ff ffVar = new ff(d0Var, bmbVar, (byte) 14);
                        he heVar = alertDialog$Builder.a;
                        heVar.Q = charSequenceArr;
                        heVar.R = iArr;
                        heVar.N = ffVar;
                        themeActivity.showDialog(heVar);
                        if (z2) {
                            heVar.l(heVar.O0.size() - 1, cmb.w0(null, cmb.p7, false), cmb.w0(null, cmb.o7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void D1() {
        byte b = this.r3;
        Object obj = this.s3;
        switch (b) {
            case 0:
                ((d0) obj).e.F0(false);
                return;
            default:
                ((my0) ((k6d) obj).b).y0.run();
                return;
        }
    }

    public rmb(Context context, d dVar, ArrayList arrayList, ArrayList arrayList2, k6d k6dVar) {
        super(context, dVar, 2, arrayList, arrayList2);
        this.s3 = k6dVar;
    }
}
