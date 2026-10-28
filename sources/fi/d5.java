package fi;

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
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.kp;
public final class d5 implements Utilities.CallbackReturn {
    public final int f10720a;
    public final Object f10721b;
    public final Object f10722c;
    public final Object d;

    public d5(Object obj, Object obj2, Object obj3, int i10) {
        this.f10720a = i10;
        this.f10721b = obj;
        this.f10722c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f10720a) {
            case 0:
                e6 e6Var = (e6) this.f10721b;
                boolean[] zArr = (boolean[]) this.f10722c;
                n5 n5Var = (n5) this.d;
                Integer num = (Integer) obj;
                y5 y5Var = e6Var.G0;
                s5 s5Var = e6Var.f10818v1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    e6Var.I0(null, new ai.e(e6Var, 19));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    qc.a(true, new ai.n1(10, e6Var, n5Var));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    n5Var.dismiss();
                    sb sbVar = ((ta) e6Var).f11724p2;
                    sbVar.f11613c1.L.b(true);
                    sbVar.v();
                    sbVar.s(true);
                    sbVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    o7 o7Var = new o7(e6Var.getContext(), false, null, new ai.i(e6Var, 22), new di.b());
                    o7Var.setOnDismissListener(new v4(e6Var, 2));
                    o7Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    e6Var.a2 = true;
                    e6Var.b0(e6Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!UserConfig.getInstance(e6Var.f10816u1).isPremium()) {
                        try {
                            n5Var.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new wc(n5Var.container, s5Var).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new v4(e6Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < y5Var.getChildCount(); i11++) {
                        if (y5Var.getChildAt(i11) instanceof sg.q0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new wc(n5Var.container, s5Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    e6Var.H0(null);
                    n5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f10721b;
                final org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f10722c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    l80 F = l80.F(e0Var.container, u6Var, c0Var);
                    F.W(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, u6Var)));
                    F.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), u6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f34898j0 = tL_aiComposeTone2;
                                    yVar.f34896h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.X();
                                    yVar.f34889a0.setText(yVar.f34898j0.title);
                                    yVar.f34890b0.setText(yVar.f34898j0.prompt);
                                    if (yVar.f34898j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f34892d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f34895g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.W();
                                    yVar.f34901n0.O(false);
                                    yVar.f34900l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, u6Var);
                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m4.s0(27, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new m4.v0(e0Var, tL_aiComposeTone, context, u6Var, 22), false);
                    F.m(R.drawable.msg_delete, new kp(3, e0Var, tL_aiComposeTone), LocaleController.getString(R.string.AIEditorRemoveStyle), !tL_aiComposeTone.creator, true);
                    F.m(R.drawable.msg_delete, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            switch (r4) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    y yVar = new y(e0Var2.getContext(), u6Var);
                                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                    yVar.f34898j0 = tL_aiComposeTone2;
                                    yVar.f34896h0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.X();
                                    yVar.f34889a0.setText(yVar.f34898j0.title);
                                    yVar.f34890b0.setText(yVar.f34898j0.prompt);
                                    if (yVar.f34898j0.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.f34892d0.a(z10, false);
                                    yVar.e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                    yVar.f34895g0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                    yVar.W();
                                    yVar.f34901n0.O(false);
                                    yVar.f34900l0 = new e(e0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, u6Var);
                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new m4.s0(27, e0Var3, tL_aiComposeTone));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, LocaleController.getString(R.string.AIEditorDeleteStyle), tL_aiComposeTone.creator, true);
                    F.Z();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                View view = (View) obj;
                MessageObject messageObject = ((th.g) this.d).f49199b;
                return th.c.d(view, (String) this.f10721b, (String) this.f10722c, messageObject.getDocument(), messageObject);
            default:
                nm0 nm0Var = (nm0) this.f10721b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f10722c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != nm0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view2);
                    boolean booleanValue = bool.booleanValue();
                    s4.e1 T = nm0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f47776f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
