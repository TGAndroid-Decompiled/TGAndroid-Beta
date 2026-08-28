package kh;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.wq;
public final class f5 implements Utilities.CallbackReturn {
    public final int f15230a;
    public final Object f15231b;
    public final Object f15232c;
    public final Object d;

    public f5(Object obj, Object obj2, Object obj3, int i9) {
        this.f15230a = i9;
        this.f15231b = obj;
        this.f15232c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f15230a) {
            case 0:
                g6 g6Var = (g6) this.f15231b;
                boolean[] zArr = (boolean[]) this.f15232c;
                p5 p5Var = (p5) this.d;
                Integer num = (Integer) obj;
                a6 a6Var = g6Var.N0;
                u5 u5Var = g6Var.C1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    g6Var.L0(null, new bh.c(g6Var, 28));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    uc.a(true, new fh.f1(11, g6Var, p5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    p5Var.dismiss();
                    wb wbVar = ((ya) g6Var).f16412w2;
                    wbVar.Y0.H.b(true);
                    wbVar.w();
                    wbVar.t(true);
                    wbVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    s7 s7Var = new s7(g6Var.getContext(), false, null, new bg.i(g6Var, 27), new ih.b());
                    s7Var.setOnDismissListener(new x4(g6Var, 2));
                    s7Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    g6Var.f15282h2 = true;
                    g6Var.d0(g6Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(g6Var.B1).isPremium()) {
                        try {
                            p5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.oc(p5Var.container, u5Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new x4(g6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i9 = 0;
                    for (int i10 = 0; i10 < a6Var.getChildCount(); i10++) {
                        if (a6Var.getChildAt(i10) instanceof yf.p0) {
                            i9++;
                        }
                    }
                    if (i9 >= 3) {
                        new org.telegram.ui.Components.oc(p5Var.container, u5Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    g6Var.K0(null);
                    p5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f15231b;
                final org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f15232c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.f27312e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    x60 F = x60.F(e0Var.container, b6Var, c0Var);
                    F.W(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), b6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f34815f0 = tL_aiComposeTone2;
                                    yVar.f34813d0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.W();
                                    yVar.W.setText(yVar.f34815f0.title);
                                    yVar.X.setText(yVar.f34815f0.prompt);
                                    if (yVar.f34815f0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.Z.a(z10, false);
                                    yVar.f32408e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f34812c0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.V();
                                    yVar.f34818i0.N(false);
                                    yVar.f34817h0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, b6Var);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ih.v3(27, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.k6(e0Var, tL_aiComposeTone, context, b6Var, 14), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new wq(1, e0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), b6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f34815f0 = tL_aiComposeTone2;
                                    yVar.f34813d0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.W();
                                    yVar.W.setText(yVar.f34815f0.title);
                                    yVar.X.setText(yVar.f34815f0.prompt);
                                    if (yVar.f34815f0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.Z.a(z10, false);
                                    yVar.f32408e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f34812c0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.V();
                                    yVar.f34818i0.N(false);
                                    yVar.f34817h0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, b6Var);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ih.v3(27, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    });
                    F.Z();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                View view = (View) obj;
                MessageObject messageObject = ((zg.g) this.d).f50840b;
                return zg.c.d(view, (String) this.f15231b, (String) this.f15232c, messageObject.getDocument(), messageObject);
            default:
                wk0 wk0Var = (wk0) this.f15231b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f15232c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != wk0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    f2.q1 T = wk0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f5505f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
