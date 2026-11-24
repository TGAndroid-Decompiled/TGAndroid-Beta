package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
public final class qkb extends f {
    public final byte r3 = 1;
    public final Object s3;

    public qkb(d0 d0Var, Context context, d dVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, dVar, i, arrayList, arrayList2);
        this.s3 = d0Var;
    }

    @Override
    public final void C1(akb akbVar) {
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
                    if ((akbVar.G == null || akbVar.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (akbVar.b == null) {
                            charSequenceArr = new CharSequence[]{null, k96.M0(2131750846, "ExportTheme")};
                            iArr = new int[]{0, 2131232370};
                            z2 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = akbVar.G;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z = false;
                            } else {
                                z = true;
                            }
                            String M02 = k96.M0(2131745267, "ShareFile");
                            String M03 = k96.M0(2131750846, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = akbVar.G;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                M0 = null;
                            } else {
                                M0 = k96.M0(2131751323, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = akbVar.G;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = k96.M0(2131743904, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z) {
                                str2 = k96.M0(2131751586, "Delete");
                            } else {
                                str2 = null;
                            }
                            boolean z3 = z;
                            charSequenceArr = new CharSequence[]{M02, M03, M0, str, str2};
                            z2 = z3;
                            iArr = new int[]{2131232368, 2131232370, 2131232121, 2131232208, 2131232113};
                        }
                        fe feVar = new fe(d0Var, akbVar, (byte) 14);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.Q = charSequenceArr;
                        hdVar.R = iArr;
                        hdVar.N = feVar;
                        themeActivity.showDialog(hdVar);
                        if (z2) {
                            hdVar.l(hdVar.O0.size() - 1, bkb.w0(null, bkb.p7, false), bkb.w0(null, bkb.o7, false));
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
                ((d0) obj).e.E0(false);
                return;
            default:
                ((fx0) ((i4d) obj).a).y0.run();
                return;
        }
    }

    public qkb(Context context, d dVar, ArrayList arrayList, ArrayList arrayList2, i4d i4dVar) {
        super(context, dVar, 2, arrayList, arrayList2);
        this.s3 = i4dVar;
    }
}
