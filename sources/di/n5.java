package di;

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
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.vp;
public final class n5 implements Utilities.CallbackReturn {
    public final int f7456a;
    public final Object f7457b;
    public final Object f7458c;
    public final Object d;

    public n5(Object obj, Object obj2, Object obj3, int i10) {
        this.f7456a = i10;
        this.f7457b = obj;
        this.f7458c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f7456a) {
            case 0:
                o6 o6Var = (o6) this.f7457b;
                boolean[] zArr = (boolean[]) this.f7458c;
                x5 x5Var = (x5) this.d;
                Integer num = (Integer) obj;
                i6 i6Var = o6Var.R0;
                c6 c6Var = o6Var.G1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    o6Var.K0(null, new ci.u(o6Var, 5));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    jd.a(true, new bi.v2(3, o6Var, x5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    x5Var.dismiss();
                    kc kcVar = ((mb) o6Var).A2;
                    kcVar.f7246c1.L.b(true);
                    kcVar.v();
                    kcVar.s(true);
                    kcVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    c8 c8Var = new c8(o6Var.getContext(), false, null, new bi.o1(o6Var, 12), new bi.b());
                    c8Var.setOnDismissListener(new e5(o6Var, 2));
                    c8Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    o6Var.f7536l2 = true;
                    o6Var.d0(o6Var.k0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(o6Var.F1).isPremium()) {
                        try {
                            x5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.zc(x5Var.container, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new e5(o6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < i6Var.getChildCount(); i11++) {
                        if (i6Var.getChildAt(i11) instanceof rg.s0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.zc(x5Var.container, c6Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    o6Var.J0(null);
                    x5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f7457b;
                final org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.f7458c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    l80 F = l80.F(e0Var.container, c6Var2, c0Var);
                    F.W(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var2)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), c6Var2);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f31099j0 = tL_aiComposeTone2;
                                    yVar.f31097h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.Y();
                                    yVar.f31090a0.setText(yVar.f31099j0.title);
                                    yVar.f31091b0.setText(yVar.f31099j0.prompt);
                                    if (yVar.f31099j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f31093d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f31096g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.X();
                                    yVar.m0.N(false);
                                    yVar.f31101l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, c6Var2);
                                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m4.y0(22, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new org.telegram.ui.p6(e0Var, tL_aiComposeTone, context, c6Var2, 13), false);
                    F.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new vp(3, e0Var, tL_aiComposeTone));
                    F.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), c6Var2);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f31099j0 = tL_aiComposeTone2;
                                    yVar.f31097h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.Y();
                                    yVar.f31090a0.setText(yVar.f31099j0.title);
                                    yVar.f31091b0.setText(yVar.f31099j0.prompt);
                                    if (yVar.f31099j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f31093d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f31096g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.X();
                                    yVar.m0.N(false);
                                    yVar.f31101l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, c6Var2);
                                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m4.y0(22, e0Var3, tL_aiComposeTone));
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
                MessageObject messageObject = ((sh.g) this.d).f45471b;
                return sh.c.d(view, (String) this.f7457b, (String) this.f7458c, messageObject.getDocument(), messageObject);
            default:
                mm0 mm0Var = (mm0) this.f7457b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f7458c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != mm0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.b1 T = mm0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f44841f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
