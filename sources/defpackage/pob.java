package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
public final class pob extends f {
    public final byte r3 = 1;
    public final Object s3;

    public pob(d0 d0Var, Context context, e eVar, int i, ArrayList arrayList, ArrayList arrayList2) {
        super(context, eVar, i, arrayList, arrayList2);
        this.s3 = d0Var;
    }

    @Override
    public final void D1(znb znbVar) {
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
                    if ((znbVar.G == null || znbVar.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (znbVar.b == null) {
                            charSequenceArr = new CharSequence[]{null, ob6.M0(2131750823, "ExportTheme")};
                            iArr = new int[]{0, 2131232370};
                            z2 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = znbVar.G;
                            if (tL_theme != null && tL_theme.isDefault) {
                                z = false;
                            } else {
                                z = true;
                            }
                            String M02 = ob6.M0(2131745187, "ShareFile");
                            String M03 = ob6.M0(2131750823, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = znbVar.G;
                            if (tL_theme2 != null && (tL_theme2.isDefault || !tL_theme2.creator)) {
                                M0 = null;
                            } else {
                                M0 = ob6.M0(2131751300, "Edit");
                            }
                            TLRPC.TL_theme tL_theme3 = znbVar.G;
                            if (tL_theme3 != null && tL_theme3.creator) {
                                str = ob6.M0(2131743798, "ThemeSetUrl");
                            } else {
                                str = null;
                            }
                            if (z) {
                                str2 = ob6.M0(2131751563, "Delete");
                            } else {
                                str2 = null;
                            }
                            boolean z3 = z;
                            charSequenceArr = new CharSequence[]{M02, M03, M0, str, str2};
                            z2 = z3;
                            iArr = new int[]{2131232368, 2131232370, 2131232121, 2131232208, 2131232113};
                        }
                        oh ohVar = new oh(d0Var, znbVar, (byte) 14);
                        id idVar = alertDialog$Builder.a;
                        idVar.Q = charSequenceArr;
                        idVar.R = iArr;
                        idVar.N = ohVar;
                        themeActivity.showDialog(idVar);
                        if (z2) {
                            idVar.l(idVar.O0.size() - 1, aob.w0(null, aob.q7, false), aob.w0(null, aob.p7, false));
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
    public final void E1() {
        byte b = this.r3;
        Object obj = this.s3;
        switch (b) {
            case 0:
                ((d0) obj).e.F0(false);
                return;
            default:
                ((nx0) ((z8d) obj).b).y0.run();
                return;
        }
    }

    public pob(Context context, e eVar, ArrayList arrayList, ArrayList arrayList2, z8d z8dVar) {
        super(context, eVar, 2, arrayList, arrayList2);
        this.s3 = z8dVar;
    }
}
