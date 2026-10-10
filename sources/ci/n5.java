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
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.sg;
public final class n5 implements Utilities.CallbackReturn {
    public final int f5634a;
    public final Object f5635b;
    public final Object f5636c;
    public final Object d;

    public n5(Object obj, Object obj2, Object obj3, int i10) {
        this.f5634a = i10;
        this.f5635b = obj;
        this.f5636c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f5634a) {
            case 0:
                q6 q6Var = (q6) this.f5635b;
                boolean[] zArr = (boolean[]) this.f5636c;
                y5 y5Var = (y5) this.d;
                Integer num = (Integer) obj;
                j6 j6Var = q6Var.R0;
                d6 d6Var = q6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    q6Var.K0(null, new bi.v(q6Var, 5));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    ld.a(true, new ai.h3(3, q6Var, y5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    y5Var.dismiss();
                    lc lcVar = ((nb) q6Var).A2;
                    lcVar.f5467c1.L.b(true);
                    lcVar.v();
                    lcVar.s(true);
                    lcVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    d8 d8Var = new d8(q6Var.getContext(), false, null, new ai.y1(q6Var, 12), new ai.d());
                    d8Var.setOnDismissListener(new e5(q6Var, 2));
                    d8Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    q6Var.f5811l2 = true;
                    q6Var.d0(q6Var.k0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(q6Var.F1).isPremium()) {
                        try {
                            y5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.ad(y5Var.container, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new e5(q6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
                        if (j6Var.getChildAt(i11) instanceof qg.q0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.ad(y5Var.container, d6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    q6Var.J0(null);
                    y5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f5635b;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f5636c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.f25098e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    q80 F = q80.F(e0Var.container, e6Var, c0Var);
                    F.W(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), e6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f33064j0 = tL_aiComposeTone2;
                                    yVar.f33062h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.Y();
                                    yVar.f33055a0.setText(yVar.f33064j0.title);
                                    yVar.f33056b0.setText(yVar.f33064j0.prompt);
                                    if (yVar.f33064j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f33058d0.a(z10, false);
                                    yVar.f25983e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f33061g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.X();
                                    yVar.m0.N(false);
                                    yVar.f33066l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, e6Var);
                                    alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.o(20, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.ActionBar.n5(e0Var, tL_aiComposeTone, context, e6Var, 16), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new sg(27, e0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), e6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f33064j0 = tL_aiComposeTone2;
                                    yVar.f33062h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.Y();
                                    yVar.f33055a0.setText(yVar.f33064j0.title);
                                    yVar.f33056b0.setText(yVar.f33064j0.prompt);
                                    if (yVar.f33064j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f33058d0.a(z10, false);
                                    yVar.f25983e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f33061g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.X();
                                    yVar.m0.N(false);
                                    yVar.f33066l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, e6Var);
                                    alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.o(20, e0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((rh.g) this.d).f47605b;
                return rh.c.d(view, (String) this.f5635b, (String) this.f5636c, messageObject.getDocument(), messageObject);
            default:
                rm0 rm0Var = (rm0) this.f5635b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f5636c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != rm0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.d1 T = rm0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f47706f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
