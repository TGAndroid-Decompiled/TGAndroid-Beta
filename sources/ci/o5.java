package ci;

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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.oh;
public final class o5 implements Utilities.CallbackReturn {
    public final int f5652a;
    public final Object f5653b;
    public final Object f5654c;
    public final Object d;

    public o5(Object obj, Object obj2, Object obj3, int i10) {
        this.f5652a = i10;
        this.f5653b = obj;
        this.f5654c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5652a) {
            case 0:
                q6 q6Var = (q6) this.f5653b;
                boolean[] zArr = (boolean[]) this.f5654c;
                y5 y5Var = (y5) this.d;
                Integer num = (Integer) obj;
                j6 j6Var = q6Var.R0;
                d6 d6Var = q6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    q6Var.L0(null, new bi.v(q6Var, 5));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    kd.a(true, new ai.g3(3, q6Var, y5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    y5Var.dismiss();
                    kc kcVar = ((mb) q6Var).A2;
                    kcVar.f5382c1.L.b(true);
                    kcVar.w();
                    kcVar.t(true);
                    kcVar.f(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    c8 c8Var = new c8(q6Var.getContext(), false, null, new ai.y1(q6Var, 12), new ai.d());
                    c8Var.setOnDismissListener(new f5(q6Var, 2));
                    c8Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    q6Var.f5766l2 = true;
                    q6Var.d0(q6Var.l0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(q6Var.F1).isPremium()) {
                        try {
                            y5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.yc(y5Var.container, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new f5(q6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
                        if (j6Var.getChildAt(i11) instanceof qg.q0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.yc(y5Var.container, d6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    q6Var.K0(null);
                    y5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f5653b;
                final org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.f5654c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.f25091e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    b80 F = b80.F(e0Var.container, d6Var2, c0Var);
                    F.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20817d6, d6Var2)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), d6Var2);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f33010j0 = tL_aiComposeTone2;
                                    yVar.f33008h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.W();
                                    yVar.f33001a0.setText(yVar.f33010j0.title);
                                    yVar.f33002b0.setText(yVar.f33010j0.prompt);
                                    if (yVar.f33010j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f33004d0.a(z10, false);
                                    yVar.f25301e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f33007g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.U();
                                    yVar.m0.N(false);
                                    yVar.f33012l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, d6Var2);
                                    alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.o(21, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.m5(e0Var, tL_aiComposeTone, context, d6Var2, 15), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new oh(23, e0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), d6Var2);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f33010j0 = tL_aiComposeTone2;
                                    yVar.f33008h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.W();
                                    yVar.f33001a0.setText(yVar.f33010j0.title);
                                    yVar.f33002b0.setText(yVar.f33010j0.prompt);
                                    if (yVar.f33010j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f33004d0.a(z10, false);
                                    yVar.f25301e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f33007g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.U();
                                    yVar.m0.N(false);
                                    yVar.f33012l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, d6Var2);
                                    alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.o(21, e0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((rh.g) this.d).f46429b;
                return rh.c.d(view, (String) this.f5653b, (String) this.f5654c, messageObject.getDocument(), messageObject);
            default:
                zl0 zl0Var = (zl0) this.f5653b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f5654c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != zl0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.c1 T = zl0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f46527f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
